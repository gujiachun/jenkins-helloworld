#基础镜像：仓库是java，标签用8u66-jdk
FROM java:8u66-jdk
#当前镜像的维护者和联系方式
MAINTAINER gujch 767724839@qq.com
#将打包好的spring程序拷贝到容器中的指定位置
RUN mkdir /opt/bin
ADD target/jenkins-helloworld-0.0.1-SNAPSHOT.jar /opt/bin/jenkins-helloworld-0.0.1-SNAPSHOT.jar
#容器对外暴露8089端口
EXPOSE 8089
#容器启动后需要执行的命令
CMD java -Djava.security.egd=file:/dev/./urandom -jar /opt/bin/jenkins-helloworld-0.0.1-SNAPSHOT.jar