FROM openjdk:8-jre-slim
# 维护者信息
LABEL maintainer="example@trtjk.com"
#定义未来Jar所存放目录
ENV INSTALL_DIR=/home/app/

ENV TZ Asia/Shanghai
#定义容器所暴露的端口
EXPOSE 8080
#将项目build的jar包添加至INSTALL_DIR目录下
COPY target/eureka-server-1.0-SNAPSHOT ${INSTALL_DIR}/app.jar

# 将启动命令写入启动脚本 start.sh
RUN echo 'java -Dfile.encoding=utf-8 -jar $CATALINA_OPTS -Djava.security.egd=file:/dev/./urandom   ${INSTALL_DIR}/app.jar --server.tomcat.uri-encoding=UTF-8 --server.tomcat.max-threads=400' > /home/app/start.sh && chmod +x /home/app/start.sh

WORKSPACE $INSTALL_DIR
CMD ["/bin/bash","start.sh"]