# 日志输出demo

使用docker构建挂载jar包输出同步日志

Dockerfile

FROM java:8-alpine
ADD 1.jar app.jar
EXPOSE 18081
ENTRYPOINT ["java","-jar","/app.jar"]



docker build -f Dockerfile spring-sc-log-example .

docker run -p 18081:18081 spring-sc-log-example -v /usr/logs:/logs


TODO
每日生成带有时间日志的log
logs/{serviceName}/{yyyy-mm-dd}-info.log

定时清除docker里的日志

定时清除外部的log日志

filebeats收集外部日志到logstash里


动态配置收集的日志级别

