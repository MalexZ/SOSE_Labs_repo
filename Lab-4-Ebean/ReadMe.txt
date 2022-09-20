Project structure:
1.We use java SDK 1.8.0_301.
2.We have modules named client and ebean-backend.
3.We got sbt and scala in plugins.


Project set-up:
+ From the IntelliJ main menu, select File | Open. Also can click open on the welcome screen.
+ And select the projects \Lab-4-Ebean\ebean-backend\build.sbt file, next click OK.
+ Then select the projects \Lab-4-Ebean\Frontend\build.sbt file, next click OK.
+ In following dialogue click Open as Project, so that IntelliJ syncs.


Updated Files:
Base on the lab3, we have several new and unpdated files in our lab4.
Frontend：
1.FindBestWF.java
2.FindAllWF.java
3.(updated)HomeController.java
4.Best_workflow.scala.html
5.All_workflow.scala.html
6.(updated)login.scala.html
7.(updated)routes
8.SetupCSV.java in utils folder
Backend:
1.workflowController.java
2.allWorkflowController.java
3.BestWorkflow.java
4.AllWorkflow.java
5.(updated)routes


You should run "Front Test" and "backend" to test:
Enter the index of categories on the bottom of table in Frontend website(http://localhost:9001).


To import our SQL dump file:
	1.To import our SQL table, you need to create one schemas named sys.
	2.The username is root.And the password is 201269.
	3.Above all, please open cmd.
	4.Enter mysql -u root -p
	5.The password is 201269
	6.Enter mysql> CREATE DATABASE
	7.Enter "the full path of sys_lab4tbl.sql(without these double quotes of course)"
	8.Open MySQL Workbench.
	9.Connect to database.
	10.Our table should be shown in the Schemas sys.


Fitness Function:
	1.To get our fitness value of one workflow, we chose to calculate the fitness value of each factor firstly.
	2.For all cost and time, we decided to divide them with 10 before calculation in order to make sure their calculation result will 		arrive in the same range of reliability and availability.
	3.To get cost or time fitness value of one workflow, we decided to divide 1 with the sum of every cost or time of services. Because 	the lower the cost or time, the better the workflow.
	4.To get reliability or availability fitness value of one workflow, we decided to multiply every reliability or availability of 		services.
	5.After we have the every seperated fitness value, we will multiply them with their corresponding weight. And get the sum of those 		multiplied result, then we have the fitness value of one workflow.

		In summary, by starting with service 1 and permmiting any work flow beginning with service 1 and ending with service 3, 		we then calculate the important fitness value by using the input SC values (ranging from 1-3) of Cost, Reliability, Time and 			Availability of all services within workflow. Each service is uniquely identified with a S#, which permits the discovery of the 		most optimal service. The fitness function requires that the work flow begins with S1 and ends with S3. Fitness value is ultimately 	determined by compounding the Cost, Reliability,Time and Availability respectively for all services and then plugging it in to the 		following operation:
		
		=>Fitness value = Cost * .35 + Reliability* .10 + Time * .20 + Availability * .98   

		=>f() = fc  * 35%     +     fr   * 10%      +     fp   * 20%     +      fa  * 35%




Real life application:
		Defining QoS service selections in an end-to-end fashion with service selection algorithm GA allows for real use 			application. A common example is how business and stock marker brokers will want to discover the most suitable service and to 			construct optimal business products. Storing each workflow with a 3D list allows for simplicity when calculating the fitness values 	for each workflow. We use 50 samples to provide a more accurate fitness value and increase probability of most optimal work flow. 		After passing all workflows through the fitness funciton, a results 3D list is created including the WF# (unique work flow 			number), S#(service numbers within work flow) and fitness value. The final results list is written on a csv and imported to sql 		database. The results are display via api  which uses a sql statement that retrieves information on the workflow with highest 			fitness value. The webpage buttons have the functionality described bellow:

		=> Find Best : Displays workflow with highest fitness value
		
		=> Show All : Displays all workflows with calculated fitness values






