/**
 * Example on different ways of writing javascript function
 */

//Sample name Function


function simple() {

	console.log('Hello world')



}

/*simple named function with argument*/

function add(name) {

	if (name == null)   /*Checking the presence of argument*/ {

		document.write('welcome guest')
	} else {


		document.write('welcome' + " - " + name)
	}

}

//named function Expression

var usdToInr = function(usd) {


	indianrupees = usd * 0.80;



	return indianrupees;

};

var inrToUsd = function(inr) {


	usd = inr / 0.80;

   return usd



};


/*function having another function is arguments*/

function conventer(funcRef,name){
	
	console.log(name);
	
	console.log(funcRef());
	
	
	
	
}





  function display(){
	
	return "welcome my page";
	
	
}


/* self executing annonymous function using (function(){}) ()*/

(function() {

	/*simple();
	add();
	add('ramesh');*/
	/*console.log("function will be displayed" + usdToInr);
	console.log("function will be displayed with value --"  +usdToInr(100))
	console.log("function will be undefined since the method is not having return statemnet --"  +inrToUsd(800))*/
	
	conventer(function(){
		
		return 'GOOD MORNING'
		
	},'Greeting Function');
	
	
	
	
	
	
})();
