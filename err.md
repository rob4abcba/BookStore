
Lisa Gray [Nov 2nd at 7:39 PM]
Hello, I could use some help on my final project if anyone is willing to help! 
I decided to use the Pets app as a starting place and adjusted my Inventory project, 
part 1 app to utilize all of the elements we learned using Content Providers and Cursor Loaders. 
I've gone through all my code several times and it seems to match up well with the Pets app that ran great on my device. 
But for my BookStore app I'm getting a runtime error and I have no idea what the errors in Logcat mean. 
I'd like to figure out what's wrong at this stage before proceeding, 
because at this point I can't even see if all the work I've done so far is working. 
Thank you!!!

**

[BUG] Integer to String Format #1
 Open	awkonecki opened this issue 2 days ago · 0 comments Comments
Assignees
No one assigned
Labels
None yet
Projects
None yet
Milestone
No milestone
Notifications
You’re not receiving notifications from this thread.
1 participant
@awkonecki
@awkonecki
 
awkonecki commented 2 days ago
BookStore/app/src/main/java/com/example/android/bookstore/BooksCursorAdapter.java

Lines 73 to 74 in 9ad9efd

 priceTextView.setText(bookPrice); 
 quantityTextView.setText(bookQuantity); 
The textview widget for lines 73-74 are not converting the integer values directly to strings causing the application to crash when you load dummy data. Can build a string formatter or just perform the following below.

priceTextView.setText(Integer.toString(bookPrice));
quantityTextView.setText(Integer.toString(bookQuantity));
