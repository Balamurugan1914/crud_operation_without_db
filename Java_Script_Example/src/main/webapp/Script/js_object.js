/**
 * 
 */


//document object
//date object
//history object
//String object
//window object


function usingWindowObj(){
	
	window.location = "http://www.google.com"
	
	
	
	
}


function windowObjOpen(){
	
	window.open('index.html','indexpage')
	
}

function invoke(){
	
	
	var goToGoogleButton = document.getElementById("googlebtn");
	
	goToGoogleButton.addEventListener('click', usingWindowObj);
	
	var openwindowopen = document.getElementById("openbtn");
	
	openwindowopen.addEventListener('click' , windowObjOpen);
	
	var printButton = document.getElementById("printbtn");
	
	printButton.addEventListener('click' , function(){
		
		window.print();
		
	});
	
}


function usingArrays(){
	
	var linkText = ['Home','client','carrier','aboutus','downloads'];
	
	writeToFile(linkText);
	
	//Array using constructor
	
	var city = new Array('chennai','coimbatore','madurai');
	writeToFile(city);
	
	//Array using arg constructor
	
	var countries = new Array();
	
	countries[0] ='nepal';	
	countries[1] ='Srilanka';	
	countries[2] ='America';	
	
	writeToFile(countries);
	
}


function usingDate(){
	
	var birthDate = new Date();
	
	var option = confirm("this is your birthdate" +birthDate);
	
	if(option){
		birthDate.setFullYear(1997,4,19);
	
	document.write("My birthdate " +"       " + "\n" )
	document.write("Date -" +birthDate.getDate()+"\n")
	document.write("month -" +birthDate.getMonth()+"\n")
	document.write("Year-" +birthDate.getFullYear())
	}else{
		
	document.write("Date -" +birthDate.getDate()+"\n")
	document.write("month -" +birthDate.getMonth()+"\n")
	document.write("Year-" +birthDate.getFullYear())	
		
		
	}
	
	
}

function writeToFile(items){
	
	document.write("<ul>");
	
	for(indpos in items){
		
		document.write("<li>"+items[indpos]+"</li>");
		
	}
	
	document.write("</ul>");
	
}




(function(){
	
	
	invoke();
	usingArrays();
	usingDate();
	
})()




