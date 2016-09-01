# LauncherDemo
首先感谢http://www.fookwood.com/android ，正是看了他的博客我才有学习Launcher的兴趣，源码出自于他，我只是修改了包名和applationId使应用能在
一些已经有com.android.launcher3的手机上安装进去,如果您能在这份源码中有一点收获,也是来源于http://www.fookwood.com/android 的分享 

![image](https://github.com/jushenziao/LauncherDemo/blob/master/changeicon.gif)

关于修改Icon,通过浏览源码我想到两个思路，第一个就是像更新Package时那样，更新数据库中内容，第二种是因为BubbleTextView持有shortcutinfo或appinfo的引用，比如shortcutinfo 我们可以直接取出来修改完icon后再apply给BubbleTextView 这样做比较简单，不好的地方就是Launcher数据刷新后修改的icon又复原了，所以每次Launcher刷新后 我们可以重新获取一遍需要更改的icon信息，单独修改
