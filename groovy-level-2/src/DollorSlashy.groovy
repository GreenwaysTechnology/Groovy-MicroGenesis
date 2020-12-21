println "Dollar Slashy Strings";

def name ="Subramanian"
def dollarSlashy = $/ 
   Hello,$name
   100
   prices
   1
   groovy
   34
/$
println dollarSlashy
def matcher = (dollarSlashy =~ /\d+/)
while (matcher.find()) {
    println(matcher.group());
}