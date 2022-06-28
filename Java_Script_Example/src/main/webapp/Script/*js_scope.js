/**
 * 
 */

var name = 'Global Hospital';

phone = 95632254;

function show(){
	
	console.log("name :"+name);
	console.log("phone :"+phone);
	_branch = 'mylapore';
	console.log("Branch :"+_branch);
	
}

function invoke(){
	
	
	show();
	console.log("name :"+name);
	console.log("phone :"+phone);
	console.log("Branch :"+_branch);
}
invoke();