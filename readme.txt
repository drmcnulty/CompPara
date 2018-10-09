for testing, curl cmdlines look like this:
$ curl -d '{"name":"rave","phone":"(907)576-7595","wingMake":"Multiverse","wingModel":"Megafruit","wingColors":"Fuschia, or whatev
er","inReachTrackingLink":"https://share.garmin.com/DavidMcNulty","spotTrackingLink":null}' -H "Content-Type: application/json" -X
 POST http://localhost:8080/addPilot