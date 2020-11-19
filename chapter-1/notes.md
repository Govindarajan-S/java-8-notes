# Order of Initialization
- Fields and instance initializer blocks are run in the order in which they appear in the file.
- The constructor runs after all fields and instance initializer blocks have run.

# Primitive Types and Size
![Primitive Types and Size](primitive-types.png "Primitive Types and Size")

# Numeric Literals
- You can add underscores anywhere except at the beginning of a literal, the end of a literal, right before a decimal point, or right after a decimal point.

# Reference Types
A value is assigned to a reference in one of two ways:
- A reference can be assigned to another object of the same type.
- A reference can be assigned to a new object using the new keyword.

# Difference between Primitive and Reference Type.
- Reference types can be assigned null, which means they do not currently refer to an object. Primitive types will give you a compiler error if you attempt to assign them null.
- Reference types can be used to call methods when they do not point to null. Primitives do not have methods declared on them.
- Primitive types are in lowercase letters. Reference types are in UpperCamelCase letters.