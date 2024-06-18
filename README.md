# ut_lh4_approvals_approvals_testing_kata

Hi and welcome to team Fooking.com.  As you may know, we are a small OTA with some prime locations in a prominent 
european city famous for the smoke and the pancake.

Our USP (and why we are valued at 500million while only at Series A funding) is that we buy rooms from hotels and agree to
sell all the inventory in a certain period of time. 

Our secret sauce is that we dynamically adjust the price of our hotels as the sell out date approaches.

We have a computer program in place that manages this system and updates our inventory for us daily.
It was developed by a no-nonsense type named Leeroy, who has since moved on to new adventures. 
Unfortunately, Leeroy was a 100x programmer so there is no documentation and no f***ing tests.

Commercially, we are really taking off and have just signed a new Hotel contract.  Your task is to add the new hotel to our system 
so that we can make even more moolah. 

First an introduction to what we think our system does:

All hotels have a sellOutIn value which denotes the number of days remaining to sell the hotel out.
All hotels have a Price which denotes the price the customer pays for a room at the hotel.
At the end of each day our system adjusts both of these values for every hotel.

Pretty simple, right? Well this is where it gets interesting:

- Once the sell out in days have passed, price degrades twice as fast 
- The price of an hotel is never negative
- Hotel "Eden" actually increases in Price the closer to the sell out date it gets.
- The price of a hotel is never more than 50
- "NH Leidseplein", we have a special agreement with, it never has to be sold out or decreases in price
- "Room Mate Aitana", like Eden, increases in price as its sell out date approaches;
- Price increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
price drops to 0 after the sell out date passes

The newly signed a Hotel is the "Rho Hotel". This requires an update to our system:

"Rho Hotel" degrades in price twice as fast as a normal hotel


Feel free to make any changes to the UpdateQuality method and add any new code as long as everything still works 
correctly! However, do not alter the Hotel class or Hotels property as those were written by the Principal Engineer who will 
insta-rage and one-shot you as he doesn't believe in shared code ownership (you can make the UpdateQuality method and 
Hotels property static if you like, we'll cover for you).

Just for clarification, a Hotel can never have its price increase above 50, however "NH Leidseplein" was our og partner 
hotel and as such its price is 80 and it never alters.