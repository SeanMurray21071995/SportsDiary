function createAccountPage()
{
	location.href="createAccount.html"
}
function returnToHomePage()
{
	location.href="home.html"
}
function newEntry()
{
	location.href="entry.html"
}
function dropDown() {
    document.getElementById("settingsDropDown").classList.toggle("show");
}
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {

    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
function logIn()
{
	var urlPath = "http://localhost:8080/SportsDiary/sd/web/logIn/"+document.getElementById('username').value+"/"+document.getElementById('password').value+"";
	var request = new XMLHttpRequest();
	request.open('GET',urlPath);
	request.responseType='json';
	console.log("got here");
	request.send();
	request.onload = function() 
	{
		var info = request.response;
		if(info.result =="true")
		{
			returnToHomePage();
		}
		else if(info.result =="false")
		{
			alert("username or password was incorect");
		}
		else
		{
			returnToHomePage();
		}
	}
}
function createAccount()
{
	var urlPathCustomer = "http://localhost:8080/SportsDiary/sd/web/createCustomer";
	if(document.getElementById('password').value!=document.getElementById('passwordReEntered').value)
	{
		alert("passwords do not match");
	}
	else{
	var dataCustomer = JSON.stringify({"customerId":1,"firstName":document.getElementById('firstName').value,"lastName":document.getElementById('secondsName').value,"mobileNumber":parseInt(document.getElementById('mobileNumber').value),"emailAddress":document.getElementById('emailAddress').value})
	console.log(dataCustomer);
	var request1 = new XMLHttpRequest();
	request1.open('POST',urlPathCustomer,true);
	request1.setRequestHeader('Content-Type', 'application/json');
	request1.send(dataCustomer);
	var urlsPathAccount="http://localhost:8080/SportsDiary/sd/web/createAccount";
	var dataAccount = JSON.stringify({"username":document.getElementById('username').value,"password":document.getElementById('password').value});
	var request2 = new XMLHttpRequest();
	request2.open('POST',urlPathCustomer,true);
	request2.setRequestHeader('Content-Type', 'application/json');
	request2.send(dataAccount);
	//returnToHomePage();
}
}