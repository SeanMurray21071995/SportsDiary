var month_name = ['January','Febuary','March','April','May','June','July','August','September','October','Novermber','December']
var d = new Date();
var month = d.getMonth();
var year = d.getFullYear();
var weeks;

window.onload=function()
{
	get_date_info()
	document.getElementById("month").innerHTML=month_name[month]+" "+year;
}
function get_calender(day_position, days)
{
	var table = document.getElementById("myCalender");
	weeks = 5;
	var day_counter=1;
	var right_day = false;
	for(i=0; i<weeks;i++){
		var row = table.insertRow(-1);
		for(var j=0;j<7;j++){
			var cell=row.insertCell(-1);
			if(j>=day_position){
				if(day_counter>days){
					right_day=false;	
				}
				else{	
					right_day=true;
				}
			}
			if(right_day==true){
				if(day_counter==d.getDate()&&month==d.getMonth()&&year==d.getFullYear()){
					cell.style.backgroundColor="#ff8533";
				}
				cell.innerHTML=day_counter+" "+"<input type=\"button\" class=\"calendarBtn\" onclick=\"newEntry()\" value=\"+\"></input>";
				
				day_counter++;
			}
			else{
				cell.style.backgroundColor="#a6a6a6";
			}
		}
	}
}
function clear_calender()
{
		var table = document.getElementById("myCalender");
		for(var i=0; i<weeks;i++){
			table.deleteRow(1);
		}
}
function get_next_month()
{
	if(month==11){
		month=0;
		year=year+1;
	}
	else{
		month=month+1;
	}
	document.getElementById("month").innerHTML=month_name[month]+" "+year;
	clear_calender();
	get_date_info();
}
function get_previous_month()
{
	if(month==0){
		month=11
		year=year-1;
	}
	else{
		month=month-1;
	}
	document.getElementById("month").innerHTML=month_name[month]+" "+year;
	clear_calender();
	get_date_info();
}
function get_date_info()
{
	var this_date= "1"+" "+month_name[month]+" "+year 
	var tmp = new Date(this_date).toDateString();
	var first_day = tmp.substring(0,3);
	var day_name = ['Mon', 'Tue', 'Wed', 'Thu', 'Fri','Sat','Sun'];
	var day_position=day_name.indexOf(first_day);
	var days = new Date(year, month+1,0).getDate();
	get_calender(day_position, days);
}
