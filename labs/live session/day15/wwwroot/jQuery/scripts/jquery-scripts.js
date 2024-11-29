function addName() {
    var name = $("#textInput").val();
    $("<div>").text(name).appendTo("#names");    
    $("#names div:odd").addClass("alternate");      

    $("#nameList").append(`<li>${name}</li>`)
    return false;
}

function moveOver(){
    var selectedOptionIndex = $("#firstSelect option:selected").index();
    var selectedOptionText = $("#firstSelect option:selected").text();

    $("#secondSelect").append(`<option>${selectedOptionText}</option>`)
    
    $("#firstSelect option:selected").remove();
}

function moveBack(){
    console.log("Trying to move back");
    var selectedOptionIndex = $("#secondSelect option:selected").index();
    console.log(selectedOptionIndex);
    var selectedOptionText = $("#secondSelect option:selected").text();
    console.log(selectedOptionText);

    $("#firstSelect").append(`<option>${selectedOptionText}</option>`)
    
    $("#secondSelect option:selected").remove();
}