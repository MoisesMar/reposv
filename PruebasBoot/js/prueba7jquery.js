a = [1,2,3,4,5];
b = {a:"uno", b: "dos"};

console.log(a);
console.log(b);





function ocultar(){
//    $("#menu").hide(5000);
//    $("#menu").slideUp(800);
//    $("#menu").fadeOut(11800);
    $("#menu").toggle(1000);
}

function ver(){
//    $("#menu").show("fast");
//    $("#menu").slideDown("fast");
    $("#menu").fadeIn("fast");
}


$(document).ready(function(){

	$("ul.subnav").parent().append("<span></span>"); //Only shows drop down trigger when js is enabled (Adds empty span tag after ul.subnav*)
	
	$("ul.topnav li span").click(function() { //When trigger is clicked...
		
		//Following events are applied to the subnav itself (moving subnav up and down)
		$(this).parent().find("ul.subnav").slideDown('fast').show(); //Drop down the subnav on click

		$(this).parent().hover(function() {
		}, function(){	
			$(this).parent().find("ul.subnav").slideUp('slow'); //When the mouse hovers out of the subnav, move it back up
		});

		//Following events are applied to the trigger (Hover events for the trigger)
		}).hover(function() { 
			$(this).addClass("subhover"); //On hover over, add class "subhover"
		}, function(){	//On Hover Out
			$(this).removeClass("subhover"); //On hover out, remove class "subhover"
	});
        
//        $("div").css({"border":"1px solid #457","text-align":"center"});
        console.log($("").heigth);

});