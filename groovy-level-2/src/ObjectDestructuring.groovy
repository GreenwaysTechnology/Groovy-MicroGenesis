import com.microgenesis.oo.Coordinates

def coordinates = new Coordinates(latitutde: 34.89, longitude: 1.2);
//println("${coordinates.latitutde}  ${coordinates.longitude} ")
def (lat, lng) = coordinates;
println("${lat}  ${lng} ")
