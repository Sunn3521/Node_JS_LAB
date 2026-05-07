# Node_JS_LAB







Department
Of
Computer Science and Engineering


NODE JS Lab Manual








 

NODE JS Lab

B.Tech. II Year II Sem.							 L T P C
 0  0  2 1

Course Outcomes: At the end of the course, the student will be able to,
•	 Build a custom website with HTML, CSS, and Bootstrap and little JavaScript.
•	 Demonstrate Advanced features of JavaScript and learn about JDBC
•	 Develop Server – side implementation using Java technologies like servlet
•	 Develop the server – side implementation using Node JS.
•	 Design a Single Page Application using React.


Exercises:

1.	Build a responsive web application for shopping cart with registration, login, catalog and cart pages using CSS3 features, flex and grid.

2.	 Make the above web application responsive web application using Bootstrap framework.

3.	Use JavaScript for doing client – side validation of the pages for the above 2 web applications.

4.	 Develop a java stand alone application that connects with the database (Oracle / mySql) and perform the CRUD operation on the database tables.

5.	 Create an xml for the bookstore. Validate the same using both DTD and XSD.


6.	 Design a controller with servlet that provides the interaction with web application  

7.	 Maintaining the transactional history of any user is very important. Explore the various session tracking mechanism using Cookies 

8.	Maintaining the transactional history of any user is very important. Explore the various session tracking mechanism using Sessions.

9.	Develop an express web application that can interact with REST API to perform CRUD operations on student data

10.	Create a react application for the student management system having registration, login, contact, about pages and implement routing to navigate through these pages.

11.	Create a custom server using http module and explore the other modules of Node JS like OS, path, event.

Week 1: Build a responsive web application for shopping cart with registration, login, catalog and cart pages using CSS3 features, flex and grid.


Index.html
<html>
    <head>
          <title>VJIT</title>
    </head>
    <frameset rows="20%,*">
        <frame src="top.html" name="top">
        <frameset cols="15%,*">
            <frame src="left.html" name="left">
            <frame src="right.html" name="right">
        </frameset>  
    </frameset>  
</html>     

Home.html

<html>
  <head><title>Welcome to VJIT</title>
  </head>
  <body>
    <h3><font color="blue">Welcome to VJIT</font></h3>
    <font color="#448646">
      <p>Making a choice of joining VJIT would be one of your best decisions towards building a long lasting and prolific career. VJIT students will be going through a multi dimensional development model. The model engages the students into a hub of activities –on the campus training and development to internships in industry which help them in becoming complete professionals.</p>
      <p>VJIT has a consistent placement track record of over 72% placements for the past five years providing opportunities in some of the best and world class MNCs like Infosys, TCS, Cognizant, Amazon, CYIENT and others…</p>
    </font>
  </body>
</html>
Left.html
<html>
  <head>
      <title> Branches</title>
  </head>
  <body>

       <a href="cse.html" target="right">CSE</a><br/>
       <a href="ece.html" target="right">ECE</a><br/>
       <a href="eee.html" target="right">EEE</a><br/>
       <a href="civil.html" target="right">CIVIL</a><br/>
</html>

Right.html
<html>
    <head>
          <title> VJIT </title>
     </head>
     <body>
             <font color="green"><p> Welcome to VJIT </p>       
             <p> Aziz Nagar<br/> Hyderabad </p></font>
     </body>
</html>   

Top.html
<html>
    <head>
         <title> VJIT </title>
    </head> 
    <body style="background-color:#faffff">
          <img src="logo.jpg" align="left" height="90%" width="32%"/>
          <center><h2> <font color="#c06f14" >VJIT </font></h2> </center>
          </br>
        <center> <font size="4px">
          <a href="home.html" target="right">  Home </a> &nbsp;  
          <a href="login.html" target="right">  Login </a> &nbsp;        
          <a href="register.html" target="right">  Register </a> &nbsp;   
          <a href="catalogue.html" target="right">  Catalogue </a> &nbsp; 
          <a href="cart.html" target="right">  Cart </a> &nbsp; 

        </center>
    </body>
</html>

Login.html
<html>
    <head>
          <title> Login</title>
    <head> 
    <body>
        <form name="login" method="post">
            <table align="center">
                  <caption><b>Login</b></caption>
                  <tr>
                      <td>Username</td>
                      <td><input type="text" name="uname"></td>
                  </tr>
                  <tr>
                      <td>Password</td>
                      <td><input type="password" name="pwd"></td>
                  </tr>
                  <tr>
                        <td colspan="2" align="center">
                           <input type="submit" value="Login">
                        </td> 
                  </tr>
              </table>      
          </form> 
    </body>
</html>      

       
Register.html
<html>
        <head> 
             <title>Register </title>
        </head>
        <body>
             <form name="register" method="post">
               <table align="center" bgcolor="#f7f7f7" >
                      <caption><b> Registration Page </b></caption>
                      <tr>
                          <td>User Name</td>
                          <td><input type="text" name="uname"></td>
                     </tr>
                     <tr>
                          <td>Password</td>
                          <td><input type="password" name="pwd"></td>
                    </tr>
                    <tr>
                          <td>E-mail</td>
                          <td><input type="text" name="email"></td>
                    </tr>
                    <tr>
                          <td>Phone Number</td>
                          <td><input type="text" name="phno" size="12" maxlength="10"></td>
                    </tr>
                    <tr>
                          <td>Gender</td>
                          <td><input type="radio" name="gender" checked>Male &nbsp;
                                   <input type="radio" name="gender" >Female </td>
                    </tr>
                    <tr>
                          <td>Date Of Birth</td>
                          <td><input type="date" name="dob" >  </td>
                    </tr>
                    <tr>
                          <td>Languages Known</td>
                          <td><input type="checkbox" name="chkEng" checked>English &nbsp;
                                   <input type="checkbox" name="chkHin">Hindi &nbsp;
                                   <input type="checkbox" name="chkTel">Telugu &nbsp; 
                                   <input type="checkbox" name="chkTam">Tamil &nbsp;
                          </td>
                    </tr>
	<tr>
	<td><select  name="states">
	<option value="Select">SelectState</option>
	<option value="Telangana">TS</option>
	<option value="AP">AP</option>
	<option value="MP">MP</option>
	<option value="Karnataka">Karnataka</option>
	<option value="Tamilnadu">TN</option>
	</select>
	</td>
	
	<td><select  name="dist">
	<option value="Select">SelectDist</option>
	<option value="Hyderabad">Hyderabad</option>
	<option value="Warangal">Warangal</option>
	<option value="RangaReddy">RangaReddy</option>
	<option value="Karimnagar">Karimnagar</option>
	<option value="Nalgonda">Nalgonda</option>
	</select>
	</td>
	</tr>
                    <tr>
                          <td>Address</td>
                          <td> <textarea rows="5" cols="20" name="txtAddress"></textarea></td>
                    </tr>
                    <tr>
                          <td colspan="2" align="center">
                                 <input type="submit" value="Register">&nbsp;
                                 <input type="reset" value="Reset">
                           </td>
                    </tr>
          </table>
    </body>
</html>
Cart.html
<html>
       <head>
           <title> Cart </title>
       </head>
       <body>
            <table>
                    <tr>
                         <th>Book Name&nbsp;&nbsp;</th>
                         <th>Price&nbsp;&nbsp;</th>
                         <th>Quantity&nbsp;&nbsp;</th>
                         <th>Amount</th>
                    </tr>
                    <tr>
                          <td>Java 2</td>
                          <td >$35.5</td>
                          <td align="center"> 2 </td>
                          <td align="center">$70</td>
                    </tr>  
                    <tr>
                         <td > Xml Bible </td>
                          <td align="center">$40.5</td>
                          <td align="center"> 1 </td>
                          <td align="center"> $40 </td>
                    </tr>
                    <tr>
                          <td colspan="3" align="right">
                                  Total Amount - </td>
                          <td align="center">$130</td>                   
                    </tr>
            </table>
       </body>  
</html>

Catologue.html
<html>
     <head>
          <title> Catalogue</title>
     </head>
      <body>
            <table>
               <tr>
                   <th>Image&nbsp;&nbsp;&nbsp;&nbsp;</th>
                   <th>Author&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                   <th>Publisher&nbsp;&nbsp;</th>
                   <th>Price&nbsp;&nbsp;</th>
                   <th>Add To Cart</th>
               </tr>
               <tr>
                   <td> <img src="c.gif" width=75 height=75></td>
                   <td> Sahani </td>
                   <td> Tata </td>
                    <td> $50 </td>
                    <td> <input type="button" value="Add to Cart"></td>
               </tr>
               <tr>
                    <td> <img src="dld.jpg" width=75 height=75/></td>                     
                    <td> Zovi Kohavi </td>
                    <td> Tata </td>
                    <td> $45 </td>
                    <td> <input type="button" value="Add to Cart"></td>
               </tr>
               <tr>
                   <td> <img src="os.jpg"  width=75 height=75/></td>
                   <td> William Stallings </td>
                   <td> Pearson </td>
                   <td> $50 </td>
                   <td> <input type="button" value="Add to Cart"></td>
               </tr> 
           </table>
      </body>
</html>
Output:
 

 
 

 
 
 
2. RESPONSIVE SHOPPING CART USING BOOTSTRAP
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
<main id="cart" style="max-width:960px">
<div class="back"><a href="#">&#11178; shop</a></div>
<h1>Your Cart</h1>
<div class="container-fluid">
<div class="row align-items-start">
<div class="col-12 col-sm-8 items">
<!--1-->
<div class="cartItem row align-items-start">
<div class="col-3 mb-2">
<img class="w-100" src="https://badux.co/smc/codepen/birdcage-posters.jpg" alt="art image">
</div>
<div class="col-5 mb-2">
<h6 class="">Dark Art 1</h6>
<p class="pl-1 mb-0">20 x 24</p>
<p class="pl-1 mb-0">Matte Print</p>
</div>
<div class="col-2">
<p class="cartItemQuantity p-1 text-center">1</p>
</div>
<div class="col-2">
<p id="cartItem1Price">$66</p>
</div>
</div>
<hr>
<!--2-->
<div class="cartItem row align-items-start">
<div class="col-3 mb-2">
<img class="w-100" src="https://badux.co/smc/codepen/birdcage-posters.jpg" alt="art image">
</div>
<div class="col-5 mb-2">
<h6 class="">Dark Art 2</h6>
<p class="pl-1 mb-0">20 x 24</p>
<p class="pl-1 mb-0">Matte Print</p>
</div>
<div class="col-2">
<p class="cartItemQuantity p-1 text-center">1</p>
</div>
<div class="col-2">
<p id="cartItem1Price">$66</p>
</div>
</div>
<hr>
</div>
<div class="col-12 col-sm-4 p-3 proceed form">
<div class="row m-0">
<div class="col-sm-8 p-0">
<h6>Subtotal</h6>
</div>
<div class="col-sm-4 p-0">
<p id="subtotal">$132.00</p>
</div>
</div>
<div class="row m-0">
<div class="col-sm-8 p-0 ">
<h6>Tax</h6>
</div>
<div class="col-sm-4 p-0">
<p id="tax">$6.40</p>
</div>
</div>
<hr>
<div class="row mx-0 mb-2">
<div class="col-sm-8 p-0 d-inline">
<h5>Total</h5>
</div>
<div class="col-sm-4 p-0">
<p id="total">$138.40</p>
</div>
</div>
<a href="#"><button id="btn-checkout" class="shopnow"><span>Checkout</span></button></a>
</div>
</div>
</div>
</div>
</main>
<footer class="container">
</footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
OUTPUT:

Your Cart
 



Dark Art 1
20 x 24
Matte Print
1
$66

 
Dark Art 2
20 x 24
Matte Print
1
$66

Subtotal
$132.00
Tax
$6.40
Total
$138.40
 


Week 3: Use JavaScript for doing client – side validation of the pages for the above 2 web applications.

Program:
<html>
<head>
<title> Registration Page </title>
</head>
<body style="background-color : lightblue">
<h2 align="center"> Registration Page </h2>

<form name="myForm" action="success.html" onsubmit="return validateForm()" method="post">

<label>Name*</label>
<input type="text" id="nametxt"  size="20" ><br><br>
<label>Password*</label>
<input type="text" id="pwdtxt" size="20" ><br><br>
<label>Email*</label>
<input type="text" id="emailtxt" size="30"><br><br>
<label>Phone no*</label>
<input type="text" id="phtxt" size="20" ><br><br>
<label>Gender</label>
<input type="radio" name="gender" id="m" value="m">Male
<input type="radio" name="gender" id="f" value="f">Female <br><br>
<label> Date of Birth</label>
<input type="date" id="bday" ><br><br>
<label> Languages Known </label>
<div class="checkboxgroup" >
<input type="checkbox" name="lang"> English &nbsp; &nbsp;&nbsp;
<input type="checkbox" name="lang"> Telugu &nbsp; &nbsp; &nbsp;
<input type="checkbox" name="lang"> Hindi <br><br>
</div>
<label> Address </label><br>
<textarea rows=5 cols=50 id="addtxtarea"  scrolling="yes"></textarea>
</p>
<input type="Submit" value="Register"/>


<script>
function validateForm()
 {
var name = document.getElementById("nametxt").value;
	var pwd = document.getElementById("pwdtxt").value;
var mobile = document.getElementById("phtxt").value;
	var email = document.getElementById("emailtxt").value;
	
	
		//name validation
	if (name.length < 6)
	{
alert("The name must be min 6 chars");
		return false;
    } 
		//password validation
	if (pwd.length < 6) 
	{
alert("The  password must be min 6 chars");
return false;
    }
		
		//email validation
	var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if(email.match(filter))  
	{  

	}  
	else
	{   
		alert("Not a valid Email ID");
		return false;
	}  	
	
	//phone number validation
	var phoneno = /^\d{10}$/;  
	if(mobile.match(phoneno))  
	{  

	}  
	else
	{   
		alert("Not a valid Phone Number"); 
		return false;
	}  
}
</script>
</form>
</body>
</html>


Success.html
<html>
<body>
<h1> Successfully Registered..</h1>
</body>
</html>

Output:

 





 


 

 
 

 

 
Week 4:  Develop a java stand alone application that connects with the database (Oracle / mySql) and perform the CRUD operation on the database tables.


import java.sql.*;
class  InsertDemo
{
public static void main(String a[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
System.out.println("Connection Established: ");
Statement stmt=con.createStatement();
String q="insert into stud values(111,'s123')";
stmt.executeUpdate(q);
System.out.println("Record Inserted ");
}
catch(Exception e)
{
System.out.println("Connection Failed: "+e);
}

}
}
 
Output:
Connection Established
Recorde Inserted

import java.sql.*;
class  SelectDemo
{
public static void main(String a[])
{
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
System.out.println("Connection Established: ");
Statement stmt=con.createStatement();
String q="select * from stud";
ResultSet rs=stmt.executeQuery(q);
System.out.println("SID\tName");
	while(rs.next())
	{
	System.out.print(rs.getInt(1)+"\t");
	System.out.print(rs.getString(2));
	System.out.println("");
	}
     }
catch(Exception e)
{
System.out.println("Connection Failed: "+e);
}

}
}

Output:

Connection Established
501 Ravi
502 sharma

import java.sql.*;
class  UpdateDemo
{
public static void main(String a[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
System.out.println("Connection Established: ");
Statement stmt=con.createStatement();
String q="update stud set name="Raj" where id=501;
stmt.executeUpdate(q);
System.out.println("Record  Updated");
catch(Exception e)
{
System.out.println("Connection Failed: "+e);
}

}
}
Output:

Connection Established
Record  Updated

import java.sql.*;
class  DelDemo
{
public static void main(String a[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
System.out.println("Connection Established: ");
Statement stmt=con.createStatement();
String q="delete from stud  where id=503";
stmt.executeUpdate(q);
System.out.println("Record  Deleted");
catch(Exception e)
{
System.out.println("Connection Failed: "+e);
}

}
}
Output:
Connection Established
Record  Deleted



 
Week 5: Create an xml for the bookstore. Validate the same using both DTD and XSD.

Programs:

Lab.dtd
<?xml version="1.0" encoding="UTF-8"?>
<!ELEMENT books (book*)>
<!ELEMENT book (title, author, isbn, publisher, edition, price)>
	<!ELEMENT title (#PCDATA)>
	<!ELEMENT author (#PCDATA)>
	<!ELEMENT isbn (#PCDATA)>
	<!ELEMENT publisher (#PCDATA)>
	<!ELEMENT edition (#PCDATA)>
	<!ELEMENT price (#PCDATA)>

Bookstab.xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE bookstab SYSTEM "lab.dtd">
<?xml-stylesheet type="text/xsl" href="books.xsl"?>
<books>
<book>
<title>Programming the World Wide Web</title>
<author>Robert W. Sebesta</author>
		<isbn>1234-5678</isbn>
<publisher>Tata McGraw-Hill</publisher>
<edition>Seventh</edition>
		<price>300</price>
</book>
<book>
<title>Web Technologies</title>
<author>Uttam K Roy</author>
		<isbn>2345-1234</isbn>
<publisher>Oxford University Press</publisher>
<edition>First</edition>
		<price>350</price>
</book>
<book>
<title>The Complete Reference PHP</title>
<author>Steven Holzner</author>
		<isbn>4567-8970</isbn>
<publisher>Tata McGraw-Hill</publisher>
<edition>Second</edition>
		<price>500</price>
</book>
<book>
<title>Java Script</title>
<author>D Flanagan</author>
		<isbn>1234-9876</isbn>
<publisher>Tata</publisher>
<edition>Second</edition>
		<price>350</price>
</book>
<book>
<title>Web Programming, Building Internet Applications ,  2nd edition , Wiley</title>
<author>Chris Bates</author>
		<isbn>3456-8976</isbn>
<publisher>Wiley</publisher>
<edition>Second</edition>
		<price>240</price>
</book>

</books>


Output:
 











SchemaEmp.xsd
<?xml version="1.0" encoding="UTF-8"?>
<xs:schema
 xmlns:xs="http://www.w3.org/2001/XMLSchema" 
targetNamespace="http://www.eswar.com" 
xmlns="http://www.eswar.com" 
elementFormDefault="qualified">

	<xs:element name="emp">
		<xs:complexType>
			<xs:sequence>
				<xs:element name="empno" type="xs:int"/>
				<xs:element name="empname" type="xs:string"/>
				<xs:element name="empsal" type="xs:decimal" />
				<xs:element name="dept" type="xs:string" fixed="IT"/>
			</xs:sequence>
		</xs:complexType>
	</xs:element>
</xs:schema>



SchemaEmp.xml
<?xml version="1.0" encoding="UTF-8"?>
<emp xmlns="http://www.eswar.com"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://www.eswar.com SchemaEmp.xsd">

	<empno>1201</empno>
	<empname>eswar</empname>
	<empsal>300.50</empsal>
	<dept>IT</dept>
</emp>







 





Output:

 

























Week 6: Design a controller with servlet that provides the interaction with web application  

Database :2018
Table Name:registration
 

Programs:
Registration.html
<html>
<head>
<title> Registration Page </title>
</head>
<body style="background-color : lightblue">
<h2 align="center"> Registration Page </h2>
<form name="myForm" method="post" action="Register">
<label>Name*</label>
<input type="text" id="nametxt" name="nametxt" size="20" ><br><br>
<label>Password*</label>
<input type="password" id="pwdtxt" name="pwdtxt" size="20" ><br><br>
<label>Email*</label>
<input type="text" id="emailtxt" name="emailtxt" size="30"><br><br>
<label>Phone no*</label>
<input type="text" id="phtxt" name="phtxt" size="20" ><br><br>
<label>Gender</label>
<input type="radio" name="gender" id="m" value="m">Male
<input type="radio" name="gender" id="f" value="f">Female <br><br>
<label> Date of Birth</label>
<input type="date" id="bday" name='dob' ><br><br>
<label> Languages Known </label>
<div class="checkboxgroup" >
<input type="checkbox" name="lang[]" value="English"> English &nbsp; &nbsp;&nbsp;
<input type="checkbox" name="lang[]" value="Telugu"> Telugu &nbsp; &nbsp; &nbsp;
<input type="checkbox" name="lang[]" value="Hindi"> Hindi <br><br>
</div>
<label> Address </label><br>
<textarea rows=5 cols=50 id="addtxtarea" name= "addtxtarea"  scrolling="yes"></textarea>
<br><br>
<input type="Submit" value="Register"/>
</form>
</body>
</html>


RegisterApp2018.java
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
// Extend HttpServlet class
public class RegisterApp2018 extends HttpServlet
{
public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
   {
response.setContentType("text/html");
   String fn=request.getParameter("nametxt");
   String pw=request.getParameter("pwdtxt");
   String ei=request.getParameter("emailtxt");
   String pn=request.getParameter("phtxt");
   String dob=request.getParameter("dob");
   String g=request.getParameter("gender");
   String add=request.getParameter("addtxtarea");	
String[] la=request.getParameterValues("lang[]");
   String lang = String.join(", ", la);
   PrintWriter out = response.getWriter();
out.println("<h1>Registration Details</h1><br>");
out.println("<b>First Name</b>:" + fn + "<br>");
out.println("<b>Email</b>:"+ ei + "<br>");
out.println("<b>Password</b>:" + pw + "<br>");
out.println("<b>Phone Number</b>:" +pn + "<br>");
out.println("<b>Gender</b>:" + g + "<br>");
out.println("<b>DOB</b>:" + dob + "<br>");
out.println("<b>Languages Known</b>:" + lang +"<br>"); 
out.println("<b>Address </b>:" + add);
try
	{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/2018","root","");  
		String sql="INSERT INTO registration VALUES(?,?,?,?,?,?,?,?)";
		PreparedStatement pst =  con.prepareStatement(sql);
		pst.setString (1,fn);
		pst.setString (2,pw);
		pst.setString (3,ei);
		pst.setString (4,pn);
		pst.setString (5,g);
		pst.setString (6,dob);
		pst.setString (7,lang);
		pst.setString (8,add);
		pst.execute();
		out.println("<br>Record inserted successfully.. Registration was completed...</body></html>");
		con.close();  
	}
	catch(Exception e)
	{ 
		out.println(e);
	}	
    }
}


Web.xml
<web-app>
<servlet>
<servlet-name>Reg</servlet-name>
<servlet-class>RegisterApp2018</servlet-class>
</servlet>

<servlet-mapping>
<servlet-name>Reg</servlet-name>
<url-pattern>/Register</url-pattern>
</servlet-mapping>
</web-app>



 
Output:
 

 
 
Week 7: Maintaining the transactional history of any user is very important. Explore the various session tracking mechanism using Cookies 

i)	Cookies – Programs

CookiesDemo.html
<html>
<body>
<form action = "CookiesDemo" method = "GET">
         First Name: <input type = "text" name = "first_name">
<br><br>
         Last Name: <input type = "text" name = "last_name" />
		<br><br>
<input type = "submit" value = "Submit" />
</form>
</body>
</html>

CookiesDemo.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class CookiesDemo extends HttpServlet 
{
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException 
	{

      // Create cookies for first and last names.      
      Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
      Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));

      // Set expiry date for both the cookies.
firstName.setMaxAge(60);   // 1min-60secs
lastName.setMaxAge(60*60*2); // 2hrs

      // Add both the cookies in the response header.
response.addCookie( firstName );
response.addCookie( lastName );

      // Set response content type
response.setContentType("text/html");

      PrintWriter out = response.getWriter();
out.println("<b> Cookies are created and the cookies are: <b><br>");
out.println("<b>First Name</b>: "
                  + request.getParameter("first_name") + "\n" +
" <b>Last Name</b>: "
                  + request.getParameter("last_name") + "\n" 
                     );
   }
}

ReadCookiesDemo.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class ReadCookiesDemo extends HttpServlet 
{
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException 
	{
      //Cookie cookie = null;
Cookie[] cookies = null;

      // Get an array of Cookies associated with this domain
cookies = request.getCookies();

      // Set response content type
response.setContentType("text/html");

      PrintWriter out = response.getWriter();

if( cookies != null ) {
out.println("<h2> Found Cookies Name and Value</h2>");

for (int i = 0; i < cookies.length; i++) {
           // cookie = cookies[i];
out.print("Name : " + cookies[i].getName( ) + ",  ");
out.print("Value: " + cookies[i].getValue( ) + " <br/>");
         }
      } else {
out.println("<h2>No cookies founds</h2>");
      }

   }
}

Web.xml
<web-app>
	<servlet>
		<servlet-name>cookies</servlet-name>
		<servlet-class>CookiesDemo</servlet-class>
	</servlet>
	<servlet>
		<servlet-name>cookies1</servlet-name>
		<servlet-class>ReadCookiesDemo</servlet-class>
	</servlet>

	<servlet-mapping>
		<servlet-name>cookies</servlet-name>
		<url-pattern>/CookiesDemo</url-pattern>
	</servlet-mapping>
	<servlet-mapping>
		<servlet-name>cookies1</servlet-name>
		<url-pattern>/ReadCookiesDemo</url-pattern>
	</servlet-mapping>
</web-app>

Output:
 

 


 

















 





Week 8: Maintaining the transactional history of any user is very important. Explore the various session tracking mechanism using Sessions.

HttpSession – Programs

SessionTrack.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

// Extend HttpServlet class
public class SessionTrack extends HttpServlet 
{
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException 
	 {

      // Create a session object if it is already not  created.
      HttpSession s1 = request.getSession(true);

      // Get session creation time.
      Date createTime = new Date(s1.getCreationTime());

      // Get last access time of this web page.
      Date lastAccessTime = new Date(s1.getLastAccessedTime());
      Integer visitCount = new Integer(0);
      String visitCountKey = new String("visitCount");
      String userIDKey = new String("userID");
      String userID = new String("ABCD");

      // Check if this is new comer on your web page.
if (s1.isNew()) 
	  {
s1.setAttribute(userIDKey, userID);
      }
	else
	  {
visitCount = (Integer)s1.getAttribute(visitCountKey);
visitCount = visitCount + 1;
userID = (String)s1.getAttribute(userIDKey);
      }
s1.setAttribute(visitCountKey,  visitCount);

      // Set response content type
response.setContentType("text/html");
      PrintWriter out = response.getWriter();

out.println("<h1>session id is" + s1.getId() + 
					"<br>Creation Time"+ createTime + 
					"<br>lass access time" + lastAccessTime + 
					"<br>User ID is" +userID + 
					"<br>Number of visits is" + visitCount+"</h1>" );
   }
}

Web.xml
<web-app>
	<servlet>
		<servlet-name>Session1</servlet-name>
		<servlet-class>SessionTrack</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>Session1</servlet-name>
		<url-pattern>/SessionTrack</url-pattern>
	</servlet-mapping>
</web-app>

Output:
 

 



 
Week 9: Develop an express web application that can interact with REST API to perform CRUD operations on student data

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>
<parent>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-parent</artifactId>
<version>3.0.0-M4</version>
<relativePath/><!-- lookup parent from repository -->
</parent>
<groupId>net.javaguides</groupId>
<artifactId>springboot-restful-webservices</artifactId>
<version>0.0.1-SNAPSHOT</version>
<name>springboot-restful-webservices</name>
<description>Demo project for Spring Boot Restful Webservices</description>
<properties>
<java.version>17</java.version>
</properties>
<dependencies>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
<groupId>mysql</groupId>
<artifactId>mysql-connector-java</artifactId>
<scope>runtime</scope>
</dependency>
<dependency>
<groupId>org.projectlombok</groupId>
<artifactId>lombok</artifactId>
<optional>true</optional>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-test</artifactId>
<scope>test</scope>
</dependency>
</dependencies>

<build>
<plugins>
<plugin>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-maven-plugin</artifactId>
<configuration>
<excludes>
<exclude>
<groupId>org.projectlombok</groupId>
<artifactId>lombok</artifactId>
</exclude>
</excludes>
</configuration>
</plugin>
</plugins>
</build>
<repositories>
<repository>
<id>spring-milestones</id>
<name>Spring Milestones</name>
<url>https://repo.spring.io/milestone</url>
<snapshots>
<enabled>false</enabled>
</snapshots>
</repository>
</repositories>
<pluginRepositories>
<pluginRepository>
<id>spring-milestones</id>
<name>Spring Milestones</name>
<url>https://repo.spring.io/milestone</url>
<snapshots>
<enabled>false</enabled>
</snapshots>
</pluginRepository>
</pluginRepositories>
</project>
 
2. Project Structure
Refer to the below screenshot to create a project structure or a packing structure for our Spring boot application 

3. Configuring MySQL Database
Since we’re using MySQL as our database, we need to configure the URL, username, and password so that our Spring boot can establish a connection with the database on startup. Open the src/main/resources/application.properties file and add the following properties to it:
spring.datasource.url=jdbc:mysql://localhost:3306/user_management
spring.datasource.username=root
spring.datasource.password=Mysql@123

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
 

Don’t forget to change the spring.datasource.username and spring.datasource.password as per your MySQL installation. Also, create a database named user_management in MySQL before proceeding to the next section.
You don’t need to create any tables. The tables will automatically be created by Hibernate from the User entity that we will define in the next step. This is made possible by the property spring.jpa.hibernate.ddl-auto = update.
4. Create JPA Entity - User.java
An Entity is a plain old Java object (POJO) that represents the data you want to store. You will need to annotate the class with @Entity and define the fields of the class along with the getters and setters for each field.

Let's create a User JPA entity class with the following fields: 
•	id - primary key
•	firstName - user first name
•	lastName - user last name
•	email - user email ID
package net.javaguides.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(nullable = false)
private String firstName;
@Column(nullable = false)
private String lastName;
@Column(nullable = false, unique = true)
private String email;
}
Note that we are using Lombok annotations to reduce the boilerplate code such as getter/setter methods, and constructors.
We are using below JPA annotations to map an Entity with a database table:
@Entity annotation is used to mark the class as a persistent Java class.
@Table annotation is used to provide the details of the table that this entity will be mapped to.
@Id annotation is used to define the primary key.
@GeneratedValue annotation is used to define the primary key generation strategy. In the above case, we have declared the primary key to be an Auto Increment field.
@Column annotation is used to define the properties of the column that will be mapped to the annotated field. You can define several properties like name, length, nullable, updateable, etc.
5. Create Spring Data JPA Repository for User JPA Entity
Let's create a UserRepository to access the User's data from the database.
Well, Spring Data JPA comes with a JpaRepository interface that defines methods for all the CRUD operations on the entity, and a default implementation of JpaRepository called SimpleJpaRepository.
package net.javaguides.springboot.repository;

import net.javaguides.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
6. Service Layer Implementation
This layer will contain the business logic for the API and will be used to perform CRUD operations using the Repository.
UserService Interface
package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.User;

import java.util.List;

public interface UserService {
User createUser(User user);

User getUserById(Long userId);

List<User> getAllUsers();

User updateUser(User user);

void deleteUser(Long userId);
}
UserServiceImpl Class
package net.javaguides.springboot.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.service.UserService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

private UserRepository userRepository;

@Override
public User createUser(User user) {
return userRepository.save(user);
}

@Override
public User getUserById(Long userId) {
Optional<User> optionalUser = userRepository.findById(userId);
return optionalUser.get();
}

@Override
public List<User> getAllUsers() {
return userRepository.findAll();
}

@Override
public User updateUser(User user) {
User existingUser = userRepository.findById(user.getId()).get();
existingUser.setFirstName(user.getFirstName());
existingUser.setLastName(user.getLastName());
existingUser.setEmail(user.getEmail());
User updatedUser = userRepository.save(existingUser);
return updatedUser;
}

@Override
public void deleteUser(Long userId) {
userRepository.deleteById(userId);
}
}
7. Creating UserController - Building CRUD Rest APIs
The controller is responsible for handling incoming HTTP requests and returning the appropriate response. You will need to define the endpoints of the API and map them to the appropriate methods in the Service layer.

Let's create the REST APIs for creating, retrieving, updating, and deleting a User:
package net.javaguides.springboot.controller;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

private UserService userService;

// build create User REST API
@PostMapping
public ResponseEntity<User> createUser(@RequestBody User user){
User savedUser = userService.createUser(user);
return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
}

// build get user by id REST API
// http://localhost:8080/api/users/1
@GetMapping("{id}")
public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
User user = userService.getUserById(userId);
return new ResponseEntity<>(user, HttpStatus.OK);
}

// Build Get All Users REST API
// http://localhost:8080/api/users
@GetMapping
public ResponseEntity<List<User>> getAllUsers(){
List<User> users = userService.getAllUsers();
return new ResponseEntity<>(users, HttpStatus.OK);
}

// Build Update User REST API
@PutMapping("{id}")
// http://localhost:8080/api/users/1
public ResponseEntity<User> updateUser(@PathVariable("id") Long userId,
@RequestBody User user){
user.setId(userId);
User updatedUser = userService.updateUser(user);
return new ResponseEntity<>(updatedUser, HttpStatus.OK);
}
// Build Delete User REST API
@DeleteMapping("{id}")
public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
userService.deleteUser(userId);
return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
}}			
 

Week 10:   Create a react application for the student management system having registration, login, contact, about pages and implement routing to navigate through these pages.

PROGRAM:

const Express = require('express');
const app = Express();
const db = require('./db/database').createDatabase();

require('./startup/db').init(db);
require('./startup/logger')(app);
require('./startup/routers')(app);
require('./startup/swagger')(app);
var bodyParser = require("body-parser");
app.use(bodyParser.urlencoded({ extended: true }));

const port = process.env.PORT || 3000;
const server = app.listen(port, () => {
console.log(`Listening on port ${port}...`);
});

process.on('SIGINT', () => {
console.log("Close signal received");
console.log("Shutting down server...");
server.close(() => {
console.log("Closing connection to database");
db.close();
console.log("Server shutdown");
});
});



{
"name": "cms",
"version": "0.0.1",
"description": "A college management system project for my DBMS course",
"main": "index.js",
"scripts": {
"test": "echo \"Error: no test specified\"&& exit 1"
},
"author": "Kshitij Chauhan",
"license": "ISC",
"dependencies": {
"body-parser": "^1.18.3",
"ejs": "^2.6.1",
"express": "^4.16.4",
"fs": "0.0.1-security",
"joi": "^14.3.1",
"morgan": "^1.9.1",
"sqlite3": "^4.0.6",
"swagger-jsdoc": "^3.2.9",
"swagger-ui-express": "^4.0.2"
},
"devDependencies": {
"nodemon": "^1.18.11"
}
}


{
"name": "cms",
"version": "0.0.1",
"lockfileVersion": 1,
"requires": true,
"dependencies": {
"abbrev": {
"version": "1.1.1",
"resolved": "https://registry.npmjs.org/abbrev/-/abbrev-1.1.1.tgz",
"integrity": "sha512-nne9/IiQ/hzIhY6pdDnbBtz7DjPTKrY00P/zvPSm5pOFkl6xuGrGnXn/VtTNNfNtAfZ9/1RtehkszU9qcTii0Q=="
},
"accepts": {
"version": "1.3.5",
"resolved": "https://registry.npmjs.org/accepts/-/accepts-1.3.5.tgz",
"integrity": "sha1-63d99gEXI6OxTopywIBcjoZ0a9I=",
"requires": {
"mime-types": "~2.1.18",
"negotiator": "0.6.1"
}
},
"ajv": {
"version": "6.10.0",
"resolved": "https://registry.npmjs.org/ajv/-/ajv-6.10.0.tgz",
"integrity": "sha512-nffhOpkymDECQyR0mnsUtoCE8RlX38G0rYP+wgLWFyZuUyuuojSSvi/+euOiQBIn63whYwYVIIH1TvE3tu4OEg==",
"requires": {
"fast-deep-equal": "^2.0.1",
"fast-json-stable-stringify": "^2.0.0",
"json-schema-traverse": "^0.4.1",
"uri-js": "^4.2.2"
}
},
"ansi-align": {
"version": "2.0.0",
"resolved": "https://registry.npmjs.org/ansi-align/-/ansi-align-2.0.0.tgz",
"integrity": "sha1-w2rsy6VjuJzrVW82kPCx2eNUf38=",
"dev": true,
"requires": {
"string-width": "^2.0.0"
},
"dependencies": {
"ansi-regex": {
"version": "3.0.0",
"resolved": "https://registry.npmjs.org/ansi-regex/-/ansi-regex-3.0.0.tgz",
"integrity": "sha1-7QMXwyIGT3lGbAKWa922Bas32Zg=",
"dev": true
},
"is-fullwidth-code-point": {
"version": "2.0.0",
"resolved": "https://registry.npmjs.org/is-fullwidth-code-point/-/is-fullwidth-code-point-2.0.0.tgz",
"integrity": "sha1-o7MKXE8ZkYMWeqq5O+764937ZU8=",
"dev": true
},
"string-width": {
"version": "2.1.1",
"resolved": "https://registry.npmjs.org/string-width/-/string-width-2.1.1.tgz",
"integrity": "sha512-nOqH59deCq9SRHlxq1Aw85Jnt4w6KvLKqWVik6oA9ZklXLNIOlqg4F2yrT1MVaTjAqvVwdfeZ7w7aCvJD7ugkw==",
"dev": true,
"requires": {
"is-fullwidth-code-point": "^2.0.0",
"strip-ansi": "^4.0.0"
}
},
"strip-ansi": {
"version": "4.0.0",
"resolved": "https://registry.npmjs.org/strip-ansi/-/strip-ansi-4.0.0.tgz",
"integrity": "sha1-qEeQIusaw2iocTibY1JixQXuNo8=",
"dev": true,
"requires": {
"ansi-regex": "^3.0.0"
}
}
}
},
"ansi-regex": {
"version": "2.1.1",
"resolved": "https://registry.npmjs.org/ansi-regex/-/ansi-regex-2.1.1.tgz",
"integrity": "sha1-w7M6te42DYbg5ijwRorn7yfWVN8="
},
"ansi-styles": {
"version": "3.2.1",
"resolved": "https://registry.npmjs.org/ansi-styles/-/ansi-styles-3.2.1.tgz",
"integrity": "sha512-VT0ZI6kZRdTh8YyJw3SMbYm/u+NqfsAxEpWO0Pf9sq8/e94WxxOpPKx9FR1FlyCtOVDNOQ+8ntlqFxiRc+r5qA==",
"dev": true,
"requires": {
"color-convert": "^1.9.0"
}
},
"anymatch": {
"version": "2.0.0",
"resolved": "https://registry.npmjs.org/anymatch/-/anymatch-2.0.0.tgz",
"integrity": "sha512-5teOsQWABXHHBFP9y3skS5P3d/WfWXpv3FUpy+LorMrNYaT9pI4oLMQX7jzQ2KklNpGpWHzdCXTDT2Y3XGlZBw==",
"dev": true,
"requires": {
"micromatch": "^3.1.4",
"normalize-path": "^2.1.1"
},
"dependencies": {
"normalize-path": {
"version": "2.1.1",
"resolved": "https://registry.npmjs.org/normalize-path/-/normalize-path-2.1.1.tgz",
"integrity": "sha1-GrKLVW4Zg2Oowab35vogE3/mrtk=",
"dev": true,
"requires": {
"remove-trailing-separator": "^1.0.1"
}
}
}
},
"aproba": {
"version": "1.2.0",
"resolved": "https://registry.npmjs.org/aproba/-/aproba-1.2.0.tgz",
"integrity": "sha512-Y9J6ZjXtoYh8RnXVCMOU/ttDmk1aBjunq9vO0ta5x85WDQiQfUF9sIPBITdbiiIVcBo03Hi3jMxigBtsddlXRw=="
},
"are-we-there-yet": {
"version": "1.1.5",
"resolved": "https://registry.npmjs.org/are-we-there-yet/-/are-we-there-yet-1.1.5.tgz",
"integrity": "sha512-5hYdAkZlcG8tOLujVDTgCT+uPX0VnpAH28gWsLfzpXYm7wP6mp5Q/gYyR7YQ0cKVJcXJnl3j2kpBan13PtQf6w==",
"requires": {
"delegates": "^1.0.0",
"readable-stream": "^2.0.6"
}


const sqlite3 = require('sqlite3');

let db;

module.exports.createDatabase = () => {
db = new sqlite3.Database('./cms.db', (err) => {
if (err) { return console.log("Error connecting to SQLite Database.") };
console.log("Connected to the SQLite database");
});
return db;
}

module.exports.getDatabase = () => db;
 




Week 11: Create a custom server using http module and explore the other modules of Node JS like OS, path, event.

Steps – Create HTTP Web Server
Following is a step by step tutorial, to Create HTTP Web Server in Node.js.
Step 1 : Include HTTP Module
Create a .js file with name httpWebServer.js and open in a text editor.
Include the Built-in Node.js module, HTTP, using require function as shown below.
var http = require('http');
Step 2 : Create Server
Create a server using the method createServer() to listen at port numbered 9000.
// include http module in the file
var http = require('http');
 
// create a server
http.createServer(function (req, res) {
    // code to feed or request and prepare response
}).listen(9000); //the server object listens on port 9000
Step 3 : Prepare response
We shall prepare a response with HTTP header and a message.
// include http module in the file
var http = require('http');
 
// create a server
http.createServer(function (req, res) {
    // http header
    // 200 - is the OK message
    // to respond with html content, 'Content-Type' should be 'text/html'
    res.writeHead(200, {'Content-Type': 'text/html'}); 
    res.write('Node.js says hello!'); //write a response to the client
    res.end(); //end the response
}).listen(9000); 
 

Step 4 : Run the Web Server
Run the httpWebServer.js file (from previous step) to create and make the server listen at port 9000.
node httpWebServer.js
The server will be up and running.
Step 5 : Test the Web Server
 
