# Notes

Please add here any notes, assumptions and design decisions that might help up understand your though process.

I spent most of my time for the design of a suitable solution to this problem.
It is obvious that a brute force method to calculate the discount amount would be an awful solution.
The key point here is to design a model within the SOLID principles. It is obvious that, discounts change very 
frequently in a supermarket, either in terms of product set, or in terms of discount type. So, I have focused on a 
solution so that whenever a discount is introduced we wouldn't need to touch any of the product classes, but at the same 
time, we would be able to include any product in this discount.

I created a Discount interface with functionalities to define a calculator for a discount type and for adding the discount 
to any product. Any class that implements Discount should implement their own discount calculation, so that Basket wouldn't need
to have any concerns about it.

Initially, I tried to make it a Product functionality, to calculate the discount amount. There was something that didn't fit, 
then I thought about making it an Item functionality, but it didn't make sense either. An item is created while it's being added
to the basket, but a discount should be defined and added to the object much earlier.
A product could be created before any discount existed in the system, therefore we wouldn't be able to add any discount to a product
if it doesn't exist during the creation of a product object. Besides, --and the most important part-- products were prone to change
for each type of Discount.

Finally, most discount types are created for multiple purchase of items. Therefore, a single item or a product wouldn't be enough
to calculate whether it is subject to a discount, this is obviously a basket scale calculation.
Therefore, I have added a set object to Basket object and stored Discount types in the set.
When it comes to basket amount/discount calculation, each of the existing discounts will be iterated and calculated on the whole basket.
The design was so loosely bound that none of Basket, Item and Product objects will be effected from adding a new Discount Type.

Also, this design allows us to define Basket scope discounts as well, i.e. "if the total basket amount is >£100, then apply £5 discount".

I am aware that I have spent more than one hour on this exercise, however I am happy with the result. The main reason 
as far as I can see for this situation is focusing on the wrong objects (i.e. Product, Item) at first, instead of focusing Basket object, to bind the Discounts.

Also, please consider the ~30 minutes spent to write this NOTES.md as well :)

Please contact me at mesru@mondeconsultancy.co.uk or my mobile (+44 7901 606065) for any questions you might have.

Best,
Mesru Koprulu