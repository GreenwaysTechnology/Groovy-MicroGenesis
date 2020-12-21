// Slashy Strings

//syntax : 1 simple strings
def myValue = / This is demo slashy /;
println myValue
//syntax : 2 with escaped with back slash
def myquote =/How are you! \i am fine \;/;
println myquote
//syntax 3 : multi line with slashy strings
def doc = / hello
 how are you?
 welcome
 greetings   
/;
println doc;
// syntax 4 : interpolation with slashy strings

def name='Subramanian'
def greeting= / Hello ${name} /;
println greeting


