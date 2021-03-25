function validate(){
	//alert("bye")
	var ssnId= document.create.ssnId.value;
	/*var name= document.form["create"]["customer name"].value;
	var age= document.create.age.value;
	var address= document.create.address.value;*/
	var ssn_error = document.getElementById("ssn_error");
	var arr= ssnId.split("").length;
	
	if(isNaN(Number(ssnId))){
		ssn_error.innerHTML="*SSN Id must be a number";
		return false
	} 
	else if(ssnId.split("").length<9){
		//alert(ssn_error)
		ssn_error.innerHTML="*SSN Id must contain 9 digits";
		return false
	}
	return true;
}