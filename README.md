# HotFixSamples

这个项目简单演示利用[Nuwa](https://github.com/jasonross/Nuwa)实现Android自动化热部署

## 使用引导
1. clone this repo, 切换到`master`分支
2. 运行并安装apk
![image](http://ww1.sinaimg.cn/large/53488390gw1ezgrk4q1bpj20ax0j9glt.jpg)  
 此时会在`app/build/outputs`目录下自动生成一个叫`nuwa`的目录  
3. 拷贝此目录到本地一个指定目录，比如：`/Users/Documents/nuwa`
4. 切换到`bugfix`分支
5. 在shell中执行如下命令  
> ./gradlew clean nuwaDebugPatch -P NuwaDir=/Users/Documents/nuwa    
  
成功后会在`app/build/outputs/nuwa/debug/`目录下会自动生成`patch.jar`文件：  
**此文件就是我们热部署的补丁文件**  
6. 我们把补丁文件拷贝到sdcard根目录  
> adb push app/build/outputs/nuwa/debug/patch.jar /sdcard/

7.重新启动app，**Bug Fix😀**  
![image](http://ww1.sinaimg.cn/large/53488390gw1ezgrl1y3odj20ax0jcmxe.jpg)