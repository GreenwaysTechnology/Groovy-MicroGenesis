import com.microgenesis.oo.hasa.Address
import com.microgenesis.oo.hasa.Guest

//setters
Address a = new Address();
a.street = '10th street';
a.city = 'Coimbatore';
Guest guest = new Guest();
guest.id = 1000;
guest.name = "subramanian";
//setter injection
guest.address = a
println "Guest Information"
println "ID ${guest.id}"
println "Name ${guest.name}"
println "Address ${guest.address.city} ${guest.address.street}"

//consturctors injection

Guest guest1 = new Guest(id: 12, name: 'Subramanian',
        address: new Address(city: 'Coimbatore', street: '10th Street'));
println "Guest Information"
println "ID ${guest1.id}"
println "Name ${guest1.name}"
println "Address ${guest1.address.city} ${guest1.address.street}"

