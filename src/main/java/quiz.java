// 1. What does the word 'polymorphism' mean?

//    Many forms.


// 2. What does it mean when we apply polymorphism to OO design? Give a simple Java example.

//     it means we have many classes that realated to each other. We could have a device say a
//    router with multiple things that can connect to it. Instead of creating instances of each item we
//    could pass all the items through an array list. Making our code more dry and scaleable.


// 3. What can we use to implement polymorphism in Java?

//    We can use an interface or inheritance to implement polymorphism in java.


// 4. How many 'forms' can an object take when using polymorphism?

//    Objects can take multiple forms when using polymorphism.


// 5. Give an example of when you could use polymorphism.

//    You could use polymorphism when you have different types of objects that all interact with the same class.

// 6. What do we mean by 'composition' in reference to object-oriented programming?

//    Composition is when one object can contain another object.


// 7. When would you use composition? Provide a simple example in Java.

//    You would use it when you see an object as part of something. An object that can be made up of many other
//   objects. For example a bike could be our main object then it has a seat, has wheels, has pedals. The bike
//   is composed of these objects.


// 8. Give a difference between composition and aggregation?


//   In composition the relationship is that the objects are a part of the objet that owns them. With aggregation
//  the objects are related but can operate independantly of the main object.


// 9. What is/are the advantage(s) of using composition/aggregation?

//    It's more flexible than inheritance. Makes the code more dry. Doesn't break encapsulation. Doesn't have the
//   conflicts with property names and methods inheritance does.


// 10. When using composition, when an object is destroyed, what happens to all the objects it is composed of?

//     When an object is destroyed using composition all it's behaviours are destroyed along with it.


// 11. When using aggregation, when an object is destroyed, what happens to all the objects it is composed of?

//     When using aggregation an object can exist on its own so when it's destroyed the owning object still exists.
