 function setEvents(){
    $("input").on("change",(e)=>{
        if ($.isNumeric($(e.target).val())){
            $(e.targets).removeClass("invalid");
        }
        else {
            $(e.target).addClass("invalid");
        }
    });

 }





 $(()=>{
    setEvents();
 });