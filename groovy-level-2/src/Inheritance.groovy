import com.microgenesis.oo.isa.Bus
import com.microgenesis.oo.isa.Car
import com.microgenesis.oo.isa.SavingsAccount


def car = new Car()
car.model = '2020 '
println car.startEngine()
println(car.stopCar())
println car.model

println 'Bus information'
def bus = new Bus();
bus.model = '2020 '
//println bus.stopCar();
println bus.startEngine()
println bus.model
//////////////////////////////////////////////////////////////////////////////////////

println 'Strong Typing: Car information'
Car mycar = new Car();
println mycar.startEngine()
println(mycar.stopCar())
//////////////////////////////////////////////////////////////////////////////////////////////
SavingsAccount savingsAccount = new SavingsAccount();
println(savingsAccount.deposit())












