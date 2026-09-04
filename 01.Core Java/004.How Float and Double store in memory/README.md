# Day 04 - Java Variables Part 2: How Float and Double Are Stored in Memory

## How Float and Double Store Data in Memory

`float` and `double` are floating-point data types that use the IEEE 754 standard to represent decimal values in memory.

## Float

A `float` is a 32-bit data type.

The 32 bits are divided into three parts:

- 1 bit for Sign
- 8 bits for Exponent
- 23 bits for Mantissa/Significand

```text
| Sign (1 bit) | Exponent (8 bits) | Mantissa/Significand (23 bits) |
Example: How 6.25 is Stored in Float
Step 1: Convert Decimal to Binary

Decimal value:

6.25

Binary representation:

110.01
Step 2: Normalize the Binary Number

Convert the binary number into the form:

1.xxxxx × 2^n

Therefore:

110.01 = 1.1001 × 2^2
Step 3: Calculate the Exponent

The exponent is:

2

The bias for float is:

127

Therefore:

127 + 2 = 129

129 in binary:

10000001
Step 4: Float Representation
| Sign |    Exponent    |       Mantissa/Significand       |
|------|----------------|---------------------------------|
|  0   |   10000001     | 10010000000000000000000         |
| 1 bit|    8 bits      |             23 bits             |

The 32-bit representation is:

0 10000001 10010000000000000000000
Example: How 0.1 is Stored in Float
Step 1: Convert Decimal to Binary

Decimal value:

0.1

Binary representation:

0.0001100110011001100110011...
Step 2: Normalize the Binary Number

Convert the binary number into the form:

1.xxxxx × 2^n

Therefore:

0.0001100110011... = 1.1001100110011... × 2^-4
Step 3: Calculate the Exponent

The exponent is:

-4

The bias for float is:

127

Therefore:

127 + (-4) = 123

123 in binary:

01111011
Step 4: Float Representation
| Sign |    Exponent    |       Mantissa/Significand       |
|------|----------------|---------------------------------|
|  0   |   01111011     | 10011001100110011001100         |
| 1 bit|    8 bits      |             23 bits             |

The binary representation of 0.1 is repeating, so it cannot be represented exactly using the available bits.

Therefore, the stored value is an approximation.

Example:

float value = 0.1f;

System.out.println(value);

The value is approximately:

0.10000000149011612
Double

A double is a 64-bit floating-point data type.

The 64 bits are divided into three parts:

1 bit for Sign
11 bits for Exponent
52 bits for Mantissa/Significand
| Sign (1 bit) | Exponent (11 bits) | Mantissa/Significand (52 bits) |
Float vs Double
Float:
32 bits = 1 Sign + 8 Exponent + 23 Mantissa

Double:
64 bits = 1 Sign + 11 Exponent + 52 Mantissa

Example:

float number1 = 10.5f;
double number2 = 10.5;

double generally provides more precision than float because it has more bits available for storing the significand.

Key Learnings
float uses 32 bits.
double uses 64 bits.
Both use IEEE 754 floating-point representation.
Float has 1 sign bit, 8 exponent bits, and 23 significand bits.
Double has 1 sign bit, 11 exponent bits, and 52 significand bits.
Float uses a bias of 127.
Some decimal values such as 0.1 cannot be represented exactly in binary.
Floating-point values can therefore be stored as approximations.
double provides greater precision than float.
Status

Day 04 - Completed