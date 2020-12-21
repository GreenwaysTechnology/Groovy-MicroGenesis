//Strings:
//1.single quoted

def singleStr = 'Hello,SingleQuoted Strings'
println singleStr instanceof java.lang.String;
println singleStr;
//double quotes
println "............................."
def doubleQuotes = "Hello,Double Quotes"
println doubleQuotes instanceof java.lang.String;
println doubleQuotes;
// String concat
println "............................."
def name = "Subramanian";
def greeting = 'Hello ' + name;
println greeting;
println greeting instanceof java.lang.String;
greeting = "Hello " + name;
println greeting;
println greeting instanceof java.lang.String;
//Interpolation.
println "..........String Interpoltion : GString..................."

def firstName = "Subramaian";
def newGreeting = "Hello ${firstName}";
println newGreeting;
println newGreeting instanceof java.lang.String
println(newGreeting instanceof groovy.lang.GString)
//simplified version
newGreeting = "Hello $firstName";
println newGreeting;
//numerical expression
def salary = 1000;
def noofdays = 100;
def totalSalary = "Total Salary is ${salary * noofdays}"
println("$totalSalary")
println "..........Multi line : triple single quote..................."

def htmlDoc = ''' 
   <html>
      <title>Micro</title>
      <body>
         <h1> Hello</h1>
      </body>
     </html>
'''
println htmlDoc;

println "..........Multi line : triple double quote..................."
def title = 'Micro Technology';
def htmlnewDoc = """
   <html>
      <title>$title</title>
      <body>
         <h1>Hello</h1>
      </body>
     </html>
"""
println htmlnewDoc;
//////////////////////////////////////////////////////////////////////////////////////////////////
//How to treate special charaters inside string : Escaping
println "..........Special Characters and How to Escape them..................."

//here i want to print single
def quote = " Hello ! how are you? \\ i am fine what \" about you ";
println quote;
quote = ' Hello ! how are you? \' i am fine what about you';
println quote;

quote = " Hello ! how are you? \t \t i am fine what \n about you";
println quote;
def priceInEuro = "Price in Euro \u20AC";
println priceInEuro
//////////////////////////////////////////////////////////////////////////////////////////////














