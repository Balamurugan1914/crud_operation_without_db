/**
 * 
 */
function display(){
	
	alert("welcome to javascript");
}


var app={}

app.display = function(){
	
	alert("I am from anonymous function");
	
	
	
}

app.readFile = function(){
	
	var messgaeOne = document.getElementById("img");
	alert(messageOne.innerHTML); //get
	var messageTwo = document.getElementsByTagName("div")[0];
	alert(messageTwo.innerHTML);  
}
app.attachEvent = function() {
	var citytButton = document.getElementById("city");
	citytButton.addEventListener("click", function() {
		var messageOne = document.getElementById("msg");
		messageOne.innerHTML = "Best city is Chennai";//its like a  setter
	});
	var nextLink = document.getElementById("link");
	nextLink.addEventListener("click", function(event) {
		event.preventDefault();
		});
}



