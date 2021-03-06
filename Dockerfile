#基础镜像：仓库是java，标签用8u66-jdk
FROM java:8u66-jdk
#当前镜像的维护者和联系方式
MAINTAINER gujch 767724839@qq.com
VOLUME /tmp
#将打包好的spring程序拷贝到容器中的指定位置
RUN mkdir /opt/bin
ADD jenkins-helloworld-0.0.1-SNAPSHOT.jar /opt/bin/jenkins-helloworld-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /opt/bin/jenkins-helloworld-0.0.1-SNAPSHOT.jar'
#容器对外暴露8082端口
EXPOSE 8082
#容器启动后需要执行的命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/bin/jenkins-helloworld-0.0.1-SNAPSHOT.jar"]
