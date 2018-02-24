# Biometric-Authentication-System-Using-Keystroke
This is a Bio-metric Authentication system developed using keystroke. Each Indevidual is identified using his fly time between two keys plus duration a key is being pressed. Developed using Java without any 3rd party libraries. Enjoy!


Name: Gihan Gamage
______________
How this works
______________
When a particular individual is register in the system his unique keystroke information is stored in a Database.
Pressing time and the releasing time of each key is recorded and duration of pressing time is calculated from that.
Duration of releasing and pressing another key is also recorded and calculate a mean fly time.
Then mean value of each pressing duration and fly is taken as  unique keys for a given person.
When Login to the system same procedure happen and mean values are calculated. if login mean values are in the range of 
register mean values plus/minus 20 seconds access to the system is granted to the individual.


____________
Instructions
____________

This is integrated with SQLite DB. This is developed using Netbeans. Open project from netbeans and run it.
Thankyou!
gihangamage.15@cse.mrt.ac.lk  
