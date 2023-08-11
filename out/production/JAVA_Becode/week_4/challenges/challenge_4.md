# Challenge 4: Hospital registration portal

Write a command line driven program using Maven and standard spring that will register you as a visitor
of a hospital. When the program starts, you are required to either use the `register` command or the 
`report` command. If you choose the `register` command, you are required to fill in your name and last name. Then you 
get the choice between 2 (made up) doctors. You don't need to pick a doctor, if you don't pick a doctor, 
you are just visiting a patient. Also store the timestamp of the visit.
If you entered the `report` command, then you need to see a report on who has visited and what the reason 
was (by that I mean: this person came, this person wanted to see either a doctor or a patient, this person
visited at this time). 

You already know that objects in the spring framework keep their state by default. You can use that to your advantage and
create a bean with a collection that can function as an interim database!