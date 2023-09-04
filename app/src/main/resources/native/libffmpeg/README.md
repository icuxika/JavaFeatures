```
jextract --source --output C:\Users\icuxika\VSCodeProjects\JavaFeatures\app\src\main\java\ -t com.icuxika.jextract.libffmpeg -I C:\CommandLineTools\ffmpeg-6.0-full_build-shared\include\ -l avutil -l swscale -l swresample -l avcodec -l avformat --header-class-name Libffmpeg .\libffmpeg.h
```
### Windows
```
jextract --source --output C:\Users\icuxika\VSCodeProjects\JavaFeatures\app\src\main\java\ -t com.icuxika.jextract.libffmpeg -I C:\CommandLineTools\ffmpeg-6.0-full_build-shared\include\ -l avutil-58 -l swscale-7 -l swresample-4 -l avcodec-60 -l avformat-60 --header-class-name Libffmpeg .\libffmpeg.h
```

### 错误解决
```shell
Exception in thread "main" java.lang.UnsatisfiedLinkError: C:\CommandLineTools\ffmpeg-6.0-full_build-shared\bin\avcodec-60.dll: Can't find dependent libraries
```
> 原因：jextract 生成的 RuntimeHelper.java 通过如下代码按照 jextract 命令中声明库的顺序来引入库
```shell
System.loadLibrary("avutil-58"); System.loadLibrary("swscale-7"); System.loadLibrary("swresample-4"); System.loadLibrary("avcodec-60"); System.loadLibrary("avformat-60");
```
> 解决：分析依赖，确定依赖顺序，然后修改 jextract 命令引入库的顺序
```shell
dumpbin.exe /dependents C:\CommandLineTools\ffmpeg-6.0-full_build-shared\bin\avcodec-60.dll
```