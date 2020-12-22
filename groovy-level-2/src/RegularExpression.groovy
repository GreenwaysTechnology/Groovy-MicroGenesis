/**
 println "Regular Expression-Groovy Implementation"
 //Step 1: declare input string
 def inputString = "hey  hello 0 1, how subramanian , 7m3";
 //Step 2: declare string inside slashy String
 String pattern = /\d+/;
 Pattern compiledPattern = Pattern.compile(pattern);
 Matcher digitMatcher = compiledPattern.matcher(inputString);
 println("Source String " + inputString);
 while (digitMatcher.find()) {println(digitMatcher.group());}**/

//println "Regular Expression-Groovy Implementation"
////Step 1: declare input string
//def inputString = "hey  hello 0 1, how subramanian , 7m3";
//def compiledPattern = ~/\d+/;
//Matcher digitMatcher = compiledPattern.matcher(inputString);
//println("Source String " + inputString);
//while (digitMatcher.find()) {
// println(digitMatcher.group());
//}

println "Regular Expression-Groovy Implementation"
//Step 1: declare input string
def inputString = "hey  hello 0 1, how subramanian , 7m3";
def compiledPattern = ~/\d+/;
def matcher = (inputString =~ /\d+/)
while (matcher.find()) {
    println(matcher.group());
}
def date ="28-02-1992 a b c  15-06-1982 15-Apr-1982";
def dateMatcher =(date =~/\d{2}-\d{2}-\d{4}/)
while(dateMatcher.find()) {
    println(dateMatcher.group());
}