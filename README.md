## Blackjack Project

### Skill Distillery Week 3 Homework

Create a blackjack game with a dealer and player in OO format and allow the user to play through a deck of cards.

#### Project Description
This program runs through one deck of cards playing rounds of blackjack. The player can choose to hit or stay. 
Once the player has chosen to stay the dealer automatically hits according to rules.
If the player hits until a BUST then the round is over and a new hand is dealt out.
At the end of each round the losing score is shown and the winner is listed.
After each hit or stay the current hand is displayed.
After each turn and round the amount of cards left in the deck is displayed.
The game continues until there are not enough cards to complete the next bit. 
Then it exits the game and gives a not enough cards message and says goodbye.

It uses: 
* OOP design
	* Enum is made for suit and rank of the cards
	* There is a player class from which the player and dealer are created.
	* There is a deck class that is extended by hand as your hand comes from the deck in play. (That logic made sense to me)
	* There is a game class with a main and all the print methods. The print methods are called in the run app.
		* The main() only initializes a game class and scanner and runs a while loop with the run() method in it. 
* Switch statements are used to deliminate the users choice and to call the appropriate method for hit or stay.
* Takes input from a user through the use of the Scanner object.
* I use Collections.sort() to shuffle the deck.
	* I print a little shuffle display and shuffle each time shuffling is printed.
* Call methods with parameters and call methods from objects.

##### Logic of calculations
The only logic needed to figure out this program were boolean conditional statements.
The logic I struggled with was how to logically lay this program out in a clear and concise way.

#### How To Run This Project
Run this through the console in eclipse or the terminal by going to the proper directory and type ```java BlackjackGameApp```


#### Lessons Learned and Struggles Encountered

I am getting much more familiar with how OOP interacts with itself, as well as how the is-a and has-a relationships differ and are similar.
I learned how to more effectively debug my program when there are a lot of conditionals and branch off points.
I am able to much more confidently conceptualize a mental model of my program which has proven helpful in sorting through several objects and interfaces.  
I struggled more this project than others with the cleanliness of my code. I found myself less confident in my code due to how difficult it was to follow.
I need to improve on moving things into their own methods. I struggled with that this project as every time I attempted to restructure my code into more individual methods 
I would find something creating a road block or compiler error. This is something I intend to fix on future projects and will be committing more effort on my part to understanding 
how to do this effectively and correctly.