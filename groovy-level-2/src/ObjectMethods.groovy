import com.microgenesis.oo.MyMethods

def mymethods = new MyMethods();

println mymethods.someParamNew('hello')
//mymethods.add("hello",67)
mymethods.add(67, "hello")
mymethods.bar(name: 'subramaian', city: 'Coimbatore', 90)
mymethods.bar(city: 'Chennai', name: 'Subramanian')
mymethods.bar(23, city: 'Chennai', name: 'Subramanian')

