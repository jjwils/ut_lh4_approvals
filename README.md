# ut_lh4_approvals_approvals_testing_kata

Hi and welcome to team Cancelling.com As you know, we are a small OTA with some prime locations in a prominent city.  
Our unique selling point is that we drop the Quality Rating of our hotels as they approach their sell by date.

We have a system in place that updates our inventory for us. 
It was developed by a no-nonsense type named Leeroy, who has moved on to new adventures. 

Your task is to add the new feature to our system so that we can begin selling a new Hotel. First an introduction to our system:

All hotels have a SellIn value which denotes the number of days we have to sell the hotel.
All hotels have a Quality value which denotes quality rating of the hotel.
At the end of each day our system lowers both values for every hotel.

Pretty simple, right? Well this is where it gets interesting:

Once the sell in date has passed, Quality degrades twice as fast
The Quality of an hotel is never negative
Hotel "Eden" actually increases in Quality the older it gets
The Quality of an hotel is never more than 50
"NH Leidseplein", being a legendary hotel, never has to be sold or decreases in Quality
"Room Mate Aitana", like aged Eden, increases in Quality as its SellIn value approaches;
Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
Quality drops to 0 after the sellIn date passes

We have recently signed a new Hotel "Rho Hotel". This requires an update to our system:

"Rho Hotel" degrades in Quality twice as fast as normal hotel
Feel free to make any changes to the UpdateQuality method and add any new code as long as everything still works correctly. However, do not alter the Hotel class or Hotels property as those belong to the goblin in the corner who will insta-rage and one-shot you as he doesn't believe in shared code ownership (you can make the UpdateQuality method and Hotels property static if you like, we'll cover for you).

Just for clarification, a Hotel can never have its Quality increase above 50, however "NH Leidseplein" is a legendary hotel and as such its Quality is 80 and it never alters.