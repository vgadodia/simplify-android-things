# simplify-android-things
This product makes intelligent decisions about the simple choices in life you can't decide on.

Inspiration
Our inspiration stems from the fact that most people are often indecisive when it comes to making simple decisions. People waste a lot of time choosing what we want to eat or what products they want to buy. You ask your partner what they want to eat, and 9 times out of 10 their answer is, "I don't know." What if there was some way these kinds of simple decisions were made for us?

What it does
Simplify makes choices based on user preferences and different categories. Rather than doing research on what you want to buy or eat, Simplify chooses for you. Simplify is an intelligent program that makes a tailored but slightly random choice for you based on your preferences towards food, products, etc. You can choose your budget, and Simplify will recommend options for a category of items within your constraint.

How we built it
We started off with the AndroidThings starter kit. Once assembled, we thought it was pretty interesting when testing several functions. Using Android Studio and Kotlin, we created Simplify by interfacing with different peripheral devices including the Rainbow HAT board's LEDs, buttons, alphanumeric display, and buzzer, as well as utilizing the 5-inch touch-screen display for button inputs and access to Android webviews of different websites to chosen items. The alphanumeric display and buttons on the Rainbow HAT were used for choosing the budget, and the rainbow LEDs on the top of RainbowHAT were used to show loading of processes.

Challenges we ran into
One of the challenges we ran into was getting the AndroidThings to start up sites. It turned out we were missing one line of code. We ran into functions not running synchronously. We solved this by having the user begin the program. That way, the steps we wanted to follow would occur in the order we set them up.

Accomplishments that we're proud of
We are very proud of being able to load up sites on the AndroidThings system. Working with the Rainbow HAT was tedious but do-able, but making sites load up according to people's preferences was a difficult challenge to overcome. Having the hardware peripherals function operate smoothly as imagined is also a strong part of our project.

What we learned
We learned the basics of Android app development. We also learned how to work with the AndroidThings starter kit. Along the way, experience in connecting different software pieces to hardware components was gained.

What's next for Simplify
We want to allow users to make their own accounts. This would facilitate using their credentials to make purchases for them. Collecting users' credit card information to buy products directly and make orders for food would finalize the process of having Simplify make choices for you. Additional categories such as vacation plans or movies to watch could be added. Signing off on direct restaurant purchases where needed on an API like DocuSign can also be incorporated. Machine learning or artificial intelligence could also be included to make the application more intelligent and go to sites based on the previous usage of Simplify.
