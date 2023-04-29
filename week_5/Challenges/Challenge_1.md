# Challenge 1: Hospital registration API 

- Repository: `java_week_5`

- Type of Challenge: `Learning`

- Team challenge : `team of 2`

  

## The Mission

The registration platform that you created in week 4 has been a huge success! However, with Covid-19 and such, the 
hospital cannot afford to have long waiting lists for visitors to the hospital. It is time to create an API for this, so 
that somebody (maybe you in the near future?) can build an app for this!

In this challenge, create the hospital registration application with Spring boot. Instead of a command line, you need to
provide this application with an API. This is supposed to be a REST api, so that means that we think in terms of resources
when we create the API url paths. We do stuff using the HTTP verbs (GET, POST, PUT, DELETE, etc). Choose your REST resources 
wisely, think about what it is you are actually doing (are you adding persons to a system or are you registering visits by
persons?). 

The result should be an application with an API which can register a visitor, get all visits for a day and get visits 
for a period of time (hint: use query parameters for this endpoint!). A visit or a registration needs to contain a 
first name and a last name, optionally point at a doctor (if there is no doctor listed in the visit, you are visiting
a patient instead of consulting a doctor) and also contain a timestamp of the visit. 

Furthermore, also create an API that allows management of the hospital to manage the doctors that do consulting. The
API should allow for adding doctors, updating them, deleting them, do a lookup of all doctors and do a lookup of a doctor 
by id (yes, you should start thinking in terms of 'id', even when you store data in your own made up database). Tip: a lookup
by id is usually done with 'path parameters'. 

You already know that objects in the spring framework keep their state by default. Since Spring boot is built upon the
Spring framework, this works here as well!

In this challenge, you are allowed to copy/paste code from the previous challenge to buy some time. This is a challenge 
that should be done in pairs. Each member of the team should at least have written some API endpoints. 

### 