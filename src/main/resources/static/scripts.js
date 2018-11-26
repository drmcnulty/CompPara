const app = document.getElementById('root');
const container = document.createElement('div');
container.setAttribute('class', 'container');
app.appendChild(container);

// Create a request variable and assign a new XMLHttpRequest object to it.
var request = new XMLHttpRequest();

// Open a new connection, using the GET request on the URL endpoint.
request.open('GET', 'http://localhost:8080/api/pilots', true);

// create callback for processing response from API
request.onload = function () {
    var data = JSON.parse(this.response);
    
    if (request.status >= 200 && request.status < 400) {
    	renderPilotGrid(data);
    } else {
        const errorMessage = document.createElement('marquee');
        errorMessage.textContent = `Unable to parse JSON response from API.`;
        app.appendChild(errorMessage);
    }
}

//Send request
request.send();

/**
 * jam the tracking link into a div with a good label.
 * 
 * @param trackingLinkAddress http/s link to the pilot's live tracking page
 * @returns a new div
 */
function encapsulateTrackingLink(trackingLinkAddress) {
    const linkDiv = document.createElement('div');
    
    const linkPreamble = document.createElement('p');
    linkPreamble.textContent = "Tracking Link: ";
    linkDiv.appendChild(linkPreamble);
    
    const trackingLink = document.createElement('a');
    trackingLink.textContent = trackingLinkAddress;
    trackingLink.href = trackingLinkAddress;
    linkPreamble.appendChild(trackingLink);
    
    return linkDiv;
}

/**
 * display a short summary of the pilot. Traditionally, this has been just a
 * number and a colored box representing the pilot's state.
 * 
 * @param pilot a pilot summary object obtained from the backend
 * @returns
 */
function renderSummary(pilot) {
	const linkToDetails = document.createElement('a');
	linkToDetails.href = `/pilot/${pilot.id}`;
	
	const summary = document.createElement('div');
    summary.setAttribute('class', 'summary');
    
    const nameLabel = document.createElement('h1');
    //nameLabel.textContent = pilot.id + ": " + pilot.name;
    nameLabel.textContent = pilot.id;
    nameLabel.setAttribute("class", "pilotLabel");
    
    //const statusLabel = document.createElement('h2');
    //statusLabel.textContent = "Status: " + pilot.status;
    
    switch(pilot.status) {
        case null:
            nameLabel.setAttribute("class", nameLabel.getAttribute("class") + " statusNull");
            break;
        case "AID":
            nameLabel.setAttribute("class", nameLabel.getAttribute("class") + " statusAID");
            break;
        case "FLY":
            nameLabel.setAttribute("class", nameLabel.getAttribute("class") + " statusFLY");
            break;
        default:
    }
    
//    const trackers = [];
//    const preamble = "Tracking Link: ";
//    if (pilot.inReachTrackingLink == null && pilot.spotTrackingLink == null) {
//        const dummyTracker = document.createElement('a');
//        dummyTracker.textContent = preamble + "NO TRACKING LINK";
//        trackers.push(dummyTracker);
//        
//    } else {
//        if (pilot.inReachTrackingLink) {
//            trackers.push(encapsulateTrackingLink(pilot.inReachTrackingLink));
//        }
//        if (pilot.spotTrackingLink) {
//            trackers.push(encapsulateTrackingLink(pilot.spotTrackingLink));
//        }
//    }
    
    container.appendChild(linkToDetails);
    linkToDetails.appendChild(summary);	//container is GLOBAL
    summary.appendChild(nameLabel);
//    summary.appendChild(statusLabel);
    
//    trackers.forEach(trackingLink => {
//        summary.appendChild(trackingLink);
//    });
}

/**
 * Contains the main loop for processing pilot summary elements
 * 
 * @param data a response from the background, probably parsed from JSON,
 * 			containing a list of pilot sum 
 * @returns
 */
function renderPilotGrid(data) {
	data.forEach(pilot => {
		renderSummary(pilot);
    });
}