for testing, curl cmdlines look like this:

curl -d '{"name":"rave","phone":"(907)576-7595","wingMake":"Multiverse","wingModel":"Megafruit","wingColors":"Fuschia, or whatever","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null,"status":"FLY"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"fsdve","phone":"(107)572-1114","wingMake":"fdaslerse","wingModel":"Megit","wingColors":"Tarn","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null,"status":"LOK"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"nurg","phone":"(111)522-4514","wingMake":"Aardvark","wingModel":"Anteater","wingColors":"blueish","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null, "status":"PUP"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Morty Smith","phone":"(111)111-1111","wingMake":"Speckled","wingModel":"Hen","wingColors":"Brown","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null, "status":"ABS"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Summer Smith","phone":"(111)111-1111","wingMake":"Advance","wingModel":"Omega","wingColors":"red","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":"https://www.google.com", "status":"AID"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Howard Smith","phone":"(111)111-1111","wingMake":"Advance","wingModel":"Omega","wingColors":"red","inReachTrackingLink":null,"spotTrackingLink":"https://www.google.com", "status":"DNF"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Richard Sanchez","phone":"(111)111-1111","wingMake":"Advance","wingModel":"Omega","wingColors":"red","inReachTrackingLink":null,"spotTrackingLink":null, "status":null}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Travis Miles","phone":"(111)111-1111","wingMake":"Advance","wingModel":"Omega","wingColors":"blue","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null, "status":"FLY"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Nargut H. Malachite","phone":"(111)111-1111","wingMake":"asdf","wingModel":"jkl","wingColors":"blue","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null, "status":"FLY"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Blergen Spitzurg","phone":"(111)111-1111","wingMake":"Advance","wingModel":"Omega","wingColors":"blue","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null, "status":"FLY"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Horace McRorus","phone":"(111)111-1111","wingMake":"Advance","wingModel":"Omega","wingColors":"blue","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null, "status":"PUP"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Reginald London","phone":"(111)111-1111","wingMake":"Advance","wingModel":"Omega","wingColors":"blue","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null, "status":"FLY"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Sarcoid Osis","phone":"(111)111-1111","wingMake":"Advance","wingModel":"Omega","wingColors":"red","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null, "status":"LOK"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Influ Enza","phone":"(111)111-1111","wingMake":"Akj","wingModel":"Elytra","wingColors":"Blue","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null, "status":"LOK"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Lance Pants","phone":"(111)111-1111","wingMake":"asdf","wingModel":"jkl","wingColors":"green","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null, "status":"DNF"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Philip J. Frye","phone":"(111)111-1111","wingMake":"Doop","wingModel":"Scooty Puff Jr.","wingColors":"red","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null, "status":"LOK"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Turanga Leela","phone":"(111)111-1111","wingMake":"Planet","wingModel":"Express","wingColors":"red","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null, "status":"FLY"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots
curl -d '{"name":"Zapp Brannigan","phone":"(111)111-1111","wingMake":"Doop","wingModel":"Nimbus","wingColors":"red","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null, "status":"AID"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/pilots

Note for combining Pilot and PilotStatus Entities: https://stackoverflow.com/questions/19977130/joining-two-table-entities-in-spring-data-jpa
Note for returning summaries of pilots (for the grid view): https://stackoverflow.com/questions/47948279/return-only-id-in-json-instead-full-entity-object

TODO:
[X] display status of pilot
[X] create endpoint that gives pilot summaries-- just the number and status.
[X] when a user clicks on a pilot status, they go to a page with more information about that pilot.
[ ] Client must be aware of whether it is still connected to the Server, 
	and notify the user if the connection is lost, attempt to re-establish connections
	(Websocket)
[ ] Hover over pilot number to get a hover-popup of next-priority info
	[ ] set a field on each tidbit of info about a pilot indicating its priority?
		such a system would allow the client code to discover the important info and
		display it accordingly
[ ] make colors not suck.

DESIGN ideas:
-------------
> Deployment vision:

PRE-COMP:
- Competition Director sets up MySql server (I'm using MariaDB)
- Competition Director runs jar on server
- Competition installs CompPara SMS forwarding app on phone
- pilots all fill out their pilot cards, and are assigned a number (maybe let them choose number in future?)
- as pilots fill out cards, they are added to "The Grid", status "LOK"
- users are free to test changing their status and seeing the grid update

TASK 1:



> For receiving SMS checkins:
- build android app that runs on organizer's smartphone. 
	LOOK AT THIS!: http://smssync.ushahidi.com/
	LOOK AT THIS!: https://autoforwardsms.com/info.html; read disclaimer at bottom of page.
	app has permissions to read SMSs (similar to apps that confirm account signups, etc).
	when app receives a SMS, send that text to CompPara server via API.
- CompPara server logs the SMS via listening on an endpoint for SMS messages
	if SMS message can be deciphered into format "AID 123" or "LOK 234" etc,
	update pilot status via the preexisting pilot status update endpoint 
	(so that we don't have 2 different ways to update status).
- Considerations:
	What if phone dies? Send SMSs to backup? warn phone holder?
	What if pilot calls instead of texts?
	What if pilot doesn't format the text correctly?
	
> For receiving WhatsApp checkins
> For receiving Web checkins
> For receiving Radio messages (Difficulty: Legendary)

> NAMING ideas:
Checkin Soup
- Top Level Domain "CheckinSoup.com" available.
- maybe a bad idea, since checkin sounds like chicken. Pun might be terrible 
  idea when nobody can find website.
