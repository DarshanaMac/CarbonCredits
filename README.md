1.Project clone from GitHub
•	Git clone https://github.com/DarshanaMac/CarbonCredits.git

![image](https://user-images.githubusercontent.com/14839226/180464178-aff1a1c6-fce2-447a-a6f3-e9d55ff4ac3c.png)

2. Import project to eclipse


![image](https://user-images.githubusercontent.com/14839226/180465948-c9fa2d66-4350-46e7-8a81-7a281c0a3b7e.png)

3. Build Project

•	Execute mvn clean install -Dmaven.test.skip=true

4. Data driven

This framework works as data driven. So, user can use excel file and parse all data via Excel. The main reason is that if we will maintain high number of test cases, we should be able to change. Otherwise very difficult to maintain services. 

![image](https://user-images.githubusercontent.com/14839226/180466281-aeff3666-a142-4088-b2f0-94d2048da86e.png)


5. Explain Test cases

- verifyNameElement -> 
Response return Name element and contains “Carbon credits”. 1st test case validates return response include “Carbon credits”

- verifyCanRelistElement -> 
Response return CanRelist element and contains “true”. 2nd test case validates return response include “true”

- verifyPromotionsElement -> 
Response return Promotions array “Gallery” element and contains “Good position in category”. 3rd test case validate return response include “Good position in category”


6. Execution

Change Base URL
If you want to change baseURL in this project, you can change ValidateResponseElements  class baseURL variable.
 
If you want to testData file, you can change RetriveDataFromXL class, 	filename name.

For this framework implemented by using TestNg framework. 

![image](https://user-images.githubusercontent.com/14839226/180467946-14851e07-29fa-4c14-b9cd-3af05874832b.png)



7. Libraries

- TestNG
- Rest-Assured
- Java-hamcrest
- Json-schema-validator
- Json-path
- Hamcrest-Core
- Hamcrest-library
- Apache - POI


8.Reports





