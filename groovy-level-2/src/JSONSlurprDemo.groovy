import groovy.json.JsonBuilder
import groovy.json.JsonSlurper

def slurper = new JsonSlurper()
String json = '{"person":{"name":"Guillaume","age":33,"pets":["dog","cat"]}}';
def result = slurper.parseText(json)
println(result)

def list = [id    : 1, name: 'Subramanian', city: 'Coimbatore',
            skills: ['java', 'groovy', 'microservices']];

def builder = new JsonBuilder(list)
String newJson = builder.toString();
def obj = slurper.parseText(newJson)
println obj