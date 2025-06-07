# Spring Boot 教育管理系统项目

## 项目概述
本项目是一个基于 Spring Boot 的教育管理系统，借助 Spring Boot 框架、MyBatis 持久层框架和 MySQL 数据库，构建出一套完整的教育管理解决方案。系统涵盖了学生、教师等角色的相关功能，包括学生查看已修课程、教师管理课程与成绩等。

## 项目结构
Educationmanagerment_sys/
└── chenwanyu_EducationalMS/
├── .idea/ # IntelliJ IDEA 配置文件
├── .mvn/ # Maven 包装器相关文件
├── src/ # 源代码目录
│ ├── main/ # 主代码目录
│ │ ├── java/ # Java 源代码
│ │ │ └── com/
│ │ │ └── chenwanyu/
│ │ │ ├── controller/ # 控制器层
│ │ │ ├── mapper/ # MyBatis 映射器
│ │ │ └── po/ # 实体类和查询条件类
│ │ ├── resources/ # 资源文件
│ │ │ ├── mapper/ # MyBatis XML 映射文件
│ │ │ └── logback.xml # 日志配置文件
│ │ └── webapp/ # Web 资源
│ │ └── js/ # JavaScript 文件
│ └── test/ # 测试代码目录
├── target/ # 编译输出目录
├── pom.xml # Maven 项目配置文件

## 技术栈
- **后端框架**：Spring Boot 2.2.0.RELEASE
- **持久层框架**：MyBatis Spring Boot Starter 2.1.1
- **数据库**：MySQL
- **日志框架**：Logback
- **构建工具**：Maven 3.6.0

## 环境要求
- Java 1.8
- MySQL 8.0
- Maven 3.6.0 及以上

## 配置步骤
1. **克隆项目**
```bash
git clone [项目仓库地址]
cd chenwanyu_EducationalMS
```
2. **配置数据库**
在 src/main/resources 目录下创建 application.properties 文件，添加数据库连接配置：
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```
3. **构建项目**
```bash
mvn clean package
```

3. **运行项目**

```bash
java -jar target/springboot_edu-0.0.1-SNAPSHOT.jar
```
## 主要功能
### 学生功能
查看已修课程：通过访问 /student/overCourse 接口，学生能够查看自己已修完的课程。

### 教师功能
查看我的课程：访问 /teacher/showCourse 接口，教师可以查看自己所教授的课程。
查看课程成绩：访问 /teacher/gradeCourse?id=课程ID 接口，教师能够查看指定课程的学生成绩。
成绩打分：
访问 /teacher/mark?id=选课记录ID（GET 请求）进入打分页面
提交 /teacher/mark（POST 请求）更新学生成绩
### 修改密码：
访问 /teacher/passwordRest 进入密码修改页面。

## 日志配置
项目采用 Logback 作为日志框架，日志配置文件为 src/main/resources/logback.xml。
## 注意事项
请保证数据库服务正常运行，并且数据库连接信息配置无误
若需要修改 Maven 仓库地址，可在 pom.xml 或 .mvn/wrapper/maven-wrapper.properties 中进行修改

## 贡献
若你想要为该项目贡献代码，请先 Fork 本仓库，然后创建一个新的分支进行修改，最后提交 Pull Request。
123