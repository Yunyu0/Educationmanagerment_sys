# Spring Boot ��������ϵͳ��Ŀ

## ��Ŀ����
����Ŀ��һ������ Spring Boot �Ľ�������ϵͳ������ Spring Boot ��ܡ�MyBatis �־ò��ܺ� MySQL ���ݿ⣬������һ�������Ľ���������������ϵͳ������ѧ������ʦ�Ƚ�ɫ����ع��ܣ�����ѧ���鿴���޿γ̡���ʦ����γ���ɼ��ȡ�

## ��Ŀ�ṹ
Educationmanagerment_sys/
������ chenwanyu_EducationalMS/
������ .idea/ # IntelliJ IDEA �����ļ�
������ .mvn/ # Maven ��װ������ļ�
������ src/ # Դ����Ŀ¼
�� ������ main/ # ������Ŀ¼
�� �� ������ java/ # Java Դ����
�� �� �� ������ com/
�� �� �� ������ chenwanyu/
�� �� �� ������ controller/ # ��������
�� �� �� ������ mapper/ # MyBatis ӳ����
�� �� �� ������ po/ # ʵ����Ͳ�ѯ������
�� �� ������ resources/ # ��Դ�ļ�
�� �� �� ������ mapper/ # MyBatis XML ӳ���ļ�
�� �� �� ������ logback.xml # ��־�����ļ�
�� �� ������ webapp/ # Web ��Դ
�� �� ������ js/ # JavaScript �ļ�
�� ������ test/ # ���Դ���Ŀ¼
������ target/ # �������Ŀ¼
������ pom.xml # Maven ��Ŀ�����ļ�

## ����ջ
- **��˿��**��Spring Boot 2.2.0.RELEASE
- **�־ò���**��MyBatis Spring Boot Starter 2.1.1
- **���ݿ�**��MySQL
- **��־���**��Logback
- **��������**��Maven 3.6.0

## ����Ҫ��
- Java 1.8
- MySQL 8.0
- Maven 3.6.0 ������

## ���ò���
1. **��¡��Ŀ**
```bash
git clone [��Ŀ�ֿ��ַ]
cd chenwanyu_EducationalMS
```
2. **�������ݿ�**
�� src/main/resources Ŀ¼�´��� application.properties �ļ���������ݿ��������ã�
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```
3. **������Ŀ**
```bash
mvn clean package
```

3. **������Ŀ**

```bash
java -jar target/springboot_edu-0.0.1-SNAPSHOT.jar
```
## ��Ҫ����
### ѧ������
�鿴���޿γ̣�ͨ������ /student/overCourse �ӿڣ�ѧ���ܹ��鿴�Լ�������Ŀγ̡�

### ��ʦ����
�鿴�ҵĿγ̣����� /teacher/showCourse �ӿڣ���ʦ���Բ鿴�Լ������ڵĿγ̡�
�鿴�γ̳ɼ������� /teacher/gradeCourse?id=�γ�ID �ӿڣ���ʦ�ܹ��鿴ָ���γ̵�ѧ���ɼ���
�ɼ���֣�
���� /teacher/mark?id=ѡ�μ�¼ID��GET ���󣩽�����ҳ��
�ύ /teacher/mark��POST ���󣩸���ѧ���ɼ�
### �޸����룺
���� /teacher/passwordRest ���������޸�ҳ�档

## ��־����
��Ŀ���� Logback ��Ϊ��־��ܣ���־�����ļ�Ϊ src/main/resources/logback.xml��
## ע������
�뱣֤���ݿ�����������У��������ݿ�������Ϣ��������
����Ҫ�޸� Maven �ֿ��ַ������ pom.xml �� .mvn/wrapper/maven-wrapper.properties �н����޸�

## ����
������ҪΪ����Ŀ���״��룬���� Fork ���ֿ⣬Ȼ�󴴽�һ���µķ�֧�����޸ģ�����ύ Pull Request��
123