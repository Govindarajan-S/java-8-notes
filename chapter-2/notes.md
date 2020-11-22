# Order of Operater Precedence
![Order of Operator Precedence](operator-precedence-1.png "Order of Operator Precedence")
![Order of Operator Precedence](operator-precedence-2.png "Order of Operator Precedence")

# Modulus Operator
- For a given divisor y (+ve or -ve) and positive dividend, the result produced is between 0 and (y - 1).
- For a given divisor y (+ve or -ve) and negative dividend, the result produced is between (-y + 1) and 0.

# Numeric Promotion Rules
- If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
- If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point value’s data type.
- Smaller data types, namely byte, short, and char, are first promoted to int any time they’re used with a Java binary arithmetic operator, even if neither of the operands is int.
- After all promotion has occurred and the operands have the same data type, the result- ing value will have the same data type as its promoted operands.

# Java Unary Operator
![Java Unary Operator](unary-operator.png "Unary Operator")
- In Java 1 and true are not related in any way, just as 0 and false are not related.
- Hence we cannot apply logical operator on numeric value and numeric operator on logical values.