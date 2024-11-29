import FormComponent from "./formSubmit.js";
import { validateName } from "./validateName.js";
import { validatePassword } from "./validatePassword.js";

new FormComponent((username, password) => {
    if (validateName(username) && validatePassword(password)) {
        alert("Login successful!");
    } else if (!validateName() && validatePassword()){
        alert("Invalid username");
    } else if (!validatePassword() && validateName()){
        alert("Invalid password.");
    } else {
        alert("Invalid username or password.");
    }
});