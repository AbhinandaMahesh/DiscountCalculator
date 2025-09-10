# DiscountCalculator
This is a simple Java program that calculates the final price of a product after applying discounts based on the original amount. The program uses conditional statements to determine the discount rate:
🛒 Discount Calculator – Theory

Objective
The program calculates the final price of a product after applying discounts based on the original price.

Key Concepts Used

Variables:

price → the original product price.

D1 and D2 → discount rates (10% and 20%).

finalprice → price after discount.

Constants (final): D1 and D2 are declared as final so their values cannot change.

Conditional Statements (if-else if-else): Used to decide which discount applies.

Logic

If the price is greater than 5000, a 20% discount is applied.

Else if the price is greater than 1000, a 10% discount is applied.

Otherwise, no discount is applied.

Formula used:

finalprice = price - (price * DiscountRate)


Flow of Execution

Start program.

Check the value of price.

Apply discount based on conditions.

Print original price and discounted price.

Sample Output

original price: - 6000.0
Afte discount: 4800.0


(Because 20% discount is applied on 6000)
