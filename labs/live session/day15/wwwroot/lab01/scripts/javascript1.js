alert("Hello World!");

var answer;

answer = confirm("Would you like to save?");

if (answer) {
    alert("We are saving now.");
}
else {
    answer = confirm("Are you sure?");
    if (answer) {
        alert("We are saving now.");
    }
    else {
        alert("Returning to menu...");
    }
}

answer = confirm("Would you like to try save again?");

answer = answer ? 1 : 0;

switch (answer) {
    case 0:
        answer = confirm("Are you sure?");
        answer = answer ? 1 : 0;
        switch (answer) {
            case 0:
                alert("We are saving now.");
                break;
            case 1:
                alert("Returning to menu...");
                break;
            default:
                alert("We didnt get an answer");
                break;
        }
        break;
    case 1:
        alert("We are saving now.");
        break;
    default:
        alert("We didnt get an answer");
        break;
}