#westlifeyang 2017-12-14
==
项目描述：基于springboot搭建的项目
===
技术

springboot集成mybatis
maven mysql数据库
redis做缓冲
druid数据库连接池
ConcurrentHashMap在线程安全的基础上提供了更好的写并发能力
集成Swagger 是一款RESTFUL接口的文档在线自动生成+功能测试功能软件
springboot+redis+mybatis+mysql+swagger+定时器
需要注意的地方：

1.本项目是基于eclipse开发工具开发的
2.sql文件放到根目录下的sql文件中
3.项目中用到了redis做缓冲作用，我将redis的压缩包放到了redis文件夹中。只需要安装到本地。启动redis。启动项目
4.用到了springboot提供的定时器功能，每隔一分钟会定时清空所有redis数据
5.swagger很好用。可以测试接口功能
6.启动后项目的访问路径是：http://localhost:8082/swagger-ui.html

该项目很适用于新手学习springboot的相关知识。本人也是一位springboot的初学者
