/**
 * 
 */
var a = 1.2;


function intfontsize() {

	a = a + 0.2;

if(a<2.2){var par = document.getElementById("para1");

	par.setAttribute('style', 'font-size:' + a + 'em')
}

	
}
function intfontsize1() {

	a = a - 0.1;
	
	if(a>0.4){var par = document.getElementById("para1");

	par.setAttribute('style', 'font-size:' + a + 'em')}
	

}
function intfontsize2() {

	a = a + 0.2;

	var par = document.getElementById("para2");

	par.setAttribute('style', 'font-size:' + a + 'em')

}
function intfontsize3() {

	a = a - 0.1;
	var par = document.getElementById("para2");

	par.setAttribute('style', 'font-size:' + a + 'em')

}

function addClickEvent() {

	var incButton = document.getElementById("incbtn");

	incButton.addEventListener('click', intfontsize);

	var incButton = document.getElementById("decbtn");

	incButton.addEventListener('click', intfontsize1);

	var incButton = document.getElementById("inbtn");

	incButton.addEventListener('click', intfontsize2);

	var incButton = document.getElementById("debtn");

	incButton.addEventListener('click', intfontsize3);

}

(function() {

	addClickEvent();


})();