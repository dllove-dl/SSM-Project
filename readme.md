# SSM-Project
# 学习ing~利用所学技术搭建自己的Javaweb项目
# 最终目的是把写出的Javaweb项目搭建到Ubuntu服务器上并通过内网穿透实现外网访问登录实现个人blog服务器或者后台管理系统的容器。
# 准备实现的功能：实现登录，注册功能。其他功能将在后续慢慢增加，正在摸索中。

+ #### *所用技术*
##### *Spring,Mybatis,SpringMVC,EasyUI等等*
+ #### *环境准备*
##### *Windows10Pro_64bit*
##### *Ubuntu 16.06_arm64 LTS*  //Linux Containner on Android Device
##### *Intellij IDEA 2020.1*   //IDE
##### *JDK1.8.0_221_64bit Win*  //Windows上的java环境
##### *JDK1.8.0_251_arm64 Ubuntu* //服务器端的java环境
##### *Maven3.6.3_64bit Win*  //Windows上的Maven版本，Aliyun镜像
##### *Tomcat8.5.55_64bit Win/Ubuntu* //web容器，部署成功后会考虑更换为ngnix
##### *MySQL5.5.15_64bit Win*  //MYSQL
##### *MySQL5.7.1_aarch64 Ubuntu* //目前只找到这个能在我的服务器环境中能运行的MYSQL版本
##### *Navicat&&MySQL-Front Win*  //数据库可视化工具，MYSQL-FORNT用来远程登录服务器数据库的

### 我的pom.xml依赖坐标
```
<dependencies>
    <!-- ↓Spring依赖包坐标开始 -->
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-core</artifactId>
      <version>5.2.3.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-aop</artifactId>
      <version>5.2.3.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.aspectj</groupId>
      <artifactId>aspectjrt</artifactId>
      <version>1.8.9</version>
    </dependency>
    <dependency>
      <groupId>org.aspectj</groupId>
      <artifactId>aspectjweaver</artifactId>
      <version>1.8.9</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-beans</artifactId>
      <version>5.2.3.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-tx</artifactId>
      <version>5.2.3.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-web</artifactId>
      <version>5.2.3.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-webmvc</artifactId>
      <version>5.2.3.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-expression</artifactId>
      <version>5.2.3.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-jdbc</artifactId>
      <version>5.2.3.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>5.2.3.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context-support</artifactId>
      <version>5.2.3.RELEASE</version>
    </dependency>
    <!-- ↑Spring依赖包坐标结束 -->
    <!-- ↓Mybatis依赖包坐标开始 -->
    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis</artifactId>
      <version>3.2.2</version>
    </dependency>
    <dependency>
      <groupId>org.mybatis</groupId>
      <artifactId>mybatis-spring</artifactId>
      <version>1.3.2</version>
    </dependency>
    <!-- ↑Mybatis依赖包坐标结束 -->
    <!-- ↓Mysql驱动和连接池依赖包坐标开始 -->
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>5.1.15</version>
    </dependency>
    <dependency>
      <groupId>com.alibaba</groupId>
      <artifactId>druid</artifactId>
      <version>1.1.9</version>
    </dependency>
    <!-- ↑Mysql驱动和连接池依赖包坐标结束 -->
    <!-- ↓Servlet相关依赖包坐标开始 -->
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>servlet-api</artifactId>
      <version>2.5</version>
    </dependency>
    <dependency>
      <groupId>javax.servlet.jsp</groupId>
      <artifactId>jsp-api</artifactId>
      <version>2.2</version>
    </dependency>
    <dependency>
      <groupId>jstl</groupId>
      <artifactId>jstl</artifactId>
      <version>1.0</version>
    </dependency>
    <dependency>
      <groupId>taglibs</groupId>
      <artifactId>standard</artifactId>
      <version>1.1.2</version>
    </dependency>
    <!-- ↑Servlet相关依赖包坐标结束 -->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.0</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
```
