const app = document.getElementById('root');
const container = document.createElement('div');
container.setAttribute('class', 'container');
app.appendChild(container);


//Create a request variable and assign a new XMLHttpRequest object to it.
var request = new XMLHttpRequest();

// Open a new connection, using the GET request on the URL endpoint.
request.open('GET', `http://localhost:8080/api/pilot/${pilotId}`, true);

// create callback for processing response from API
request.onload = function () {
    var data = JSON.parse(this.response);
    
    if (request.status >= 200 && request.status < 400 && data) {
    	renderPilotDetail(data);
    } else {
        const errorMessage = document.createElement('marquee');
        errorMessage.textContent = `Unable to parse JSON response from API.`;
        app.appendChild(errorMessage);
    }
}

//Send request
request.send();


function renderPilotDetail(pilot) {
	nameLabel = document.createElement('h1');
	nameLabel.textContent = `${pilot.id}: ${pilot.name}`;
	container.appendChild(nameLabel);
	
	fieldsTable = document.createElement('table');
	
	for(var field in pilot) {
		fieldRow = document.createElement('tr');
		
		fieldName = document.createElement('td');
		fieldName.textContent = field;
		fieldRow.appendChild(fieldName);
		
		fieldValue = document.createElement('td');
		if (field.endsWith("TrackingLink")) {
			trackingLink = document.createElement('a');
			trackingLink.href = pilot[field];
			trackingLink.textContent = pilot[field];
			fieldValue.appendChild(trackingLink);
			
		} else {
			fieldValue.textContent = pilot[field];
		}
		fieldRow.appendChild(fieldValue);
		
		fieldsTable.appendChild(fieldRow);
	}
	
	container.appendChild(fieldsTable);
	
}