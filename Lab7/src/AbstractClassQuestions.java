public class AbstractClassQuestions
{
/*
* 1. What is the Abstract Class?
*
* The abstract class is a "placeholder" or rather a programmer centric contextual separation of ideas in the class hierarchy of a
* given system in Java that is used by programmers to represent abstract ideas for a given set of classes, hence the name.
* There is no real concrete idea to ground an abstract class without further defining it with a subclass,
* as such it cannot be instantiated on its own. If there is one, maybe the class shouldn't be defined as an abstract class.
*
* 2. An abstract class cannot be instantiated, so it cannot have a constructor – True or False?
* Briefly explain why.
*
* This is false, because an abstract class can have a constructor (though rare for its use case) for the purposes
* of initialization and the class itself ends up a part of the child subclass instance/object makeup anyhow. After all, in order for
* the abstract class to be present programmatically, it has to be instantiated to some degree during runtime, but the abstract class itself
* cannot be instantiated without a secondary qualifying subclass. With that in mind, any constructor in the abstract class would be used
* only in relation to its subclasses.
*
* 3. Can abstract class have methods other than abstract methods - True or False?
* True - they are still classes, just without the ability to utilize any of their given non-abstract methods without further qualification
* and likely polymorphic modification with a subclass. An in class example was that if one was to make an animal abstract class they could
* put in a "Make sound" method since most if not all animals produce some degree of sound in their existence.
* However, what that sound is, couldn't be defined without further clarifying what that animal is.
*/
}
