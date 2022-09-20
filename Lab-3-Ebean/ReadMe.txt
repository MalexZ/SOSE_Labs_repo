Project structure:
1.We use java SDK 1.8.0_301.
2.We have modules named client and ebean-backend.
3.We got sbt and scala in plugins.


Project set-up:
+ From the IntelliJ main menu, select File | Open. Also can click open on the welcome screen.
+ And select the projects \Lab-3-Ebean\ebean-backend\build.sbt file, next click OK.
+ Then select the projects \Lab-3-Ebean\Frontend\build.sbt file, next click OK.
+ In following dialogue click Open as Project, so that IntelliJ syncs.


Updated Files:
Base on the lab2, we have several new and unpdated files in our lab3.
Frontend：
1.TitleRequest.java
2.(updated)HomeController.java
3.category_titles.scala.html
4.paperTometadata_list.scala.html
5.(updated)login.scala.html
6.(updated)routes
7.service folder
Backend:
1.CategoryArticlesController.java
2.CategoryArticles.java
3.(updated)R11.java
4.(updated)routes


You should run "Front Test" and "backend" to test:
Enter the index of categories on the bottom of table in Frontend website(http://localhost:9001).


To import our SQL dump file:
	1.To import our SQL table, you need to create one schemas named sys.
	2.The username is root.And the password is 201269.
	3.Above all, please open cmd.
	4.Enter mysql -u root -p
	5.The password is 201269
	6.Enter mysql> CREATE DATABASE lab1
	7.Enter -u root -p lab1 < "Enter the full path of sys_lab1tbl.sql(without these double quotes of course)"
	6.Enter mysql> CREATE DATABASE ebeantest
	7.Enter -u root -p ebeantest < "Enter the full path of sys_lab3tbl.sql(without these double quotes of course)"
	8.Open MySQL Workbench.
	9.Connect to database.
	10.Our table should be shown in the Schemas sys.