# ut_lh4_approvals_approvals_testing_kata

Hi and welcome to team Fooking.com.  As you may know, we are a small OTA with some prime locations in a prominent 
european city famous for the smoke and the pancake.

Our USP (and why we are valued at 500million while only at Series A funding) is that we buy rooms from hotels and agree to
sell all the inventory in a certain period of time. 

Our secret sauce is that we dynamically adjust the price of our hotels as the sell out date approaches.

First an introduction to what we our system does:

- All hotels have a sellOutIn value which denotes the number of days remaining to sell the hotel out.
- All hotels have a Price which denotes the price the customer pays for a room at the hotel.
- At the end of each day our system adjusts both of these values for every hotel.

We have a computer program in place that manages this system and updates our inventory for us daily.
It was developed by a no-nonsense type named Leeroy, who has since moved on to new adventures. 
Unfortunately, Leeroy was a 100x programmer so although eveything seems to work in prod, there is no documentation and no f***ing tests.

```We are fairly certain that the default normal case is that overnight the days remaining to sell out the hotel and the price are both decreased by 1.```

Pretty simple, right? Well this is where it gets interesting, our account managers are on big bonuses for every hotel that they get to use our system.  Some of them (in conjunction with our Product Managers) have developed some pretty bespoke deals for some of our hotels.

Unfortunately in the hurray to sign and implement the deals they forget to write any of this down the only thing we know is that the code in prod "works" and you should assume its correct.

Commercially, we are adding more ~~shareholder~~ stakeholder value than ever and our EBITDA is at record levels.  Unfortunately, it seems that everything is taking longer than it used to for some reason and growth in our costs is outpacing growth in revenue 🤔

Another newly signed deal is the "Rho Hotel". This requires an update to our system:

```"Rho Hotel" degrades in price twice as fast as a normal hotel```

This simple implementation has destroyed our cycle time so we've decided enough is enough, before adding the new hotel to the system we need to get a better handle of what is currently going on and pay down some technical debt.

Your job is twofold.

1. Discover all the bespoke deals for hotels and describe them in tests.
2. Add a new hotel to the system and make sure that it works as expected, you could add to the mess or refactor the code its up to you.

For part 1 - we encourage you to use Combination Approvals to discover the bespoke deals by discovering values for Hotels, Sell Out In & Price that add code coverage.  One of our ~~Senior Technical Coaches~~ Principal Test Engineers has already got the ball rolling by writing a test that you should be able to extend.

For part 2 - feel free to make any changes to the UpdateQuality method and add any new code as long as all the current Hotel deals still work
correctly! However, do not alter the Hotel class or Hotels property as those were written by the Principal Engineer who will 
insta-rage and one-shot you as he doesn't believe in shared code ownership (you can make the UpdateQuality method and 
Hotels property static if you like, we'll cover for you).

Good Luck.  Success will grant an automatic exceeds at review ;)
