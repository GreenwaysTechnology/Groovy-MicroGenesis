import com.microgenesis.groovy.metaprog.compile.*

//ToString
def person = new Person(firstName: 'Subramanian', lastName: 'Murugan', age: 18, city: 'Coimbatore');
println person.toString();

//equals and hash code
def p1 = new Person(id: 1, firstName: 'Subramanian', lastName: 'Murugan', age: 18, city: 'Coimbatore');
def p2 = new Person(id: 1, firstName: 'Ram', lastName: 'Murugan', age: 18, city: 'Chennai');

println p1.hashCode();
println p2.hashCode()
println p1.equals(p2)
///////////////

//map-like syntax
//def customer = new Customer(id:1,firstName: 'subramanian',lastName: 'murugan')
def customer = new Customer(1, 'Subramanian', 'Murugan');
println customer.toString()

//////////
def emplist = [
        new Employee(first: 'Subu', last: 'Murugan', dob: 1980),
        new Employee(first: 'Arun', last: 'Karthik', dob: 1997),
        new Employee(first: 'Bala', last: 'Murugan', dob: 1976),
        new Employee(first: 'James', last: 'Bond', dob: 1956)
];
println emplist.sort()*.first
/////////////////////////////////////////////////////////////////////////////////////////////

def message = new Message()
        .setFrom("subu@gmail.com")
        .setBody("Hello")
        .setSubject("greet")
println(message.from)

def vistor = new VisitorBuilder()
        .first("Subramanian")
        .last("Murugan")
        .email("test@test.com")
        .build();
println vistor.email



//def message = Message.builder()  // New internal helper class.
//        .from('foo@gmail.com')  // Method per property.
//        .to('mail@host.nl')
//        .subject('Sample mail')
//        .body('Groovy rocks!')
//        .build()  // Create instance of Message
//println message;














