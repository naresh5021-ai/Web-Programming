public class static_public_class {
// Static method
static void myStaticMethod() {
System.out.println("Static methods can be called without creating objects");
}
// Public method
public void myPublicMethod() {
System.out.println("Public methods must be called by creating objects");
}
// Main method
public static void main(String[] args) {
myStaticMethod(); // Call the static method
// myPublicMethod(); This would compile an error
static_public_class myObj = new static_public_class(); // Create an object of MyClass
myObj.myPublicMethod(); // Call the public method on the object
}
}