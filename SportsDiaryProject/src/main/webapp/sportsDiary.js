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
	console.log(urlPath);
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
			returnToHome();
		}
		else if(info.result =="false")
		{
			returnToHome();
		}
		else
		{
			returnToHome();
		}
	}
}