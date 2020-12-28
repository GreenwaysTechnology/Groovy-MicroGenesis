//def counter() {
//    int a = 0;
//    def innerClosure = {
//        ++a;
//    }
//    return innerClosure;
//}

//def counter() {
//    int a = 0;
//    def innerClosure = {
//        ++a;
//    }
//}
//def counter() {
//    int a = 0;
//    return {
//        ++a;
//    }
//}
def counter = {
    int a = 0;
    return {
        ++a;
    }
}

def res = counter();
for (int i = 0; i < 10; i++)
    println res.call()
