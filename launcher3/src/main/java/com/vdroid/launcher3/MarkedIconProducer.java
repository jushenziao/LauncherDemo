package com.vdroid.launcher3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by cloud on 2016/8/17 14:47.
 * mail：1032863320@qq.com
 * 生成带数字的bitmap
 */
public class MarkedIconProducer {

    private static final int MARK_CIRCLE_RADIU = 10;

    public static Bitmap createMarkedIcon(Bitmap bitmap, int number) {

        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap copyBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(copyBitmap);

        if (!bitmap.isRecycled()){
            bitmap.recycle();
        }
        
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        Paint numPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        numPaint.setColor(Color.WHITE);
        paint.setColor(Color.RED);
        canvas.drawCircle(options.outWidth - MARK_CIRCLE_RADIU, MARK_CIRCLE_RADIU, MARK_CIRCLE_RADIU, paint);
        canvas.drawText("" + number, options.outWidth - MARK_CIRCLE_RADIU / 2, options.outHeight / 2, numPaint);

        return copyBitmap;
    }
}
