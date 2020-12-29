import com.microgenesis.builder.Message

def message = Message
        .builder()  // New internal helper class.
        .from('mrhaki@mrhaki.com')  // Method per property.
        .to('mail@host.nl')
        .subject('Sample mail')
        .body('Groovy rocks!')
        .build()  // Create instance of Message
println message;


def builder = new groovy.xml.MarkupBuilder()
builder.book {
    author 'Fergal Dearle'
    title 'Groovy for DSL'
}