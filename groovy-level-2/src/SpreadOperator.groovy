import com.microgenesis.oo.Car

def cars = [
        new Car(make: 'Renault', model: '2020'),
        new Car(make: 'Maruthi', model: 'Alto')
]
def makes = cars*.make;
println makes
