import groovy.json.JsonBuilder

def list = [id    : 1, name: 'Subramanian', city: 'Coimbatore',
            skills: ['java', 'groovy', 'microservices']];

def builder = new JsonBuilder(list)
println builder.toPrettyString()

def newBuilder = new JsonBuilder();

newBuilder {
    persons {
        firstName 'Subramanian'
        lastName 'Murgan'
        address(city: 'Coimbatore', state: 'tamil Nadu')
        skills 'Java', 'Groovy'
    }
            {
                firstName 'Ram'
                lastName 'Kumar'
                address(city: 'Coimbatore', state: 'tamil Nadu')
                skills 'Java', 'Groovy'
            }
}
println newBuilder.toPrettyString()