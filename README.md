#westlifeyang 2017-12-14
==
项目描述：基于springboot搭建的项目
===
技术
-

springboot集成mybatis<br>
maven mysql数据库<br>
redis做缓冲<br>
druid数据库连接池<br>
ConcurrentHashMap在线程安全的基础上提供了更好的写并发能力<br>
集成Swagger 是一款RESTFUL接口的文档在线自动生成+功能测试功能软件<br>
springboot+redis+mybatis+mysql+swagger+定时器<br>
需要注意的地方：<br>
==
1.本项目是基于eclipse开发工具开发的<br>
2.sql文件放到根目录下的sql文件中<br>
3.项目中用到了redis做缓冲作用，我将redis的压缩包放到了redis文件夹中。只需要安装到本地。启动redis。启动项目<br>
4.用到了springboot提供的定时器功能，每隔一分钟会定时清空所有redis数据<br>
5.swagger很好用。可以测试接口功能<br>
6.启动后项目的访问路径是：http://localhost:8082/swagger-ui.html<br>

该项目很适用于新手学习springboot的相关知识。本人也是一位springboot的初学者<br>
