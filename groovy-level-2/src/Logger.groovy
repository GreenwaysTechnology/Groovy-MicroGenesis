import com.microgenesis.pms.UserService

def userService = new UserService()
userService.createUser('john', 'secret')