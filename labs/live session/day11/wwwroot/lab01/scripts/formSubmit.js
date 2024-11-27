export default class FormComponent {
    constructor(validateMethod) {
        this.container = document.getElementsByTagName("my-special-tag")[0];
        this.validateMethod = validateMethod;
        this.render();
    }

    render() {
        // Safety check for null container
        if (!this.container) {
            console.error(`Container with ID "${this.containerId}" not found.`);
            return;
        }

        // alert("Running");
        console.log("Container: " + this.container)

        // Sets the html for the form
        this.container.innerHTML = this.getHTML();
        console.log(this.container.innerHTML);
        // Adds the styles for the form
        this.addStyles();

        // Gets the form
        const form = this.container.querySelector("#login-form");

        // Sets the action for the submit button
        form.addEventListener("submit", (e) => {
            // stops default submit button action
            e.preventDefault();
            // Gets username from field
            const username = form.querySelector("#username").value.trim();
            // Gets password from field
            const password = form.querySelector("#password").value.trim();
            // Sends values back to call back method
            this.validateMethod(username, password);
        });
    }

    getHTML() {
        return `
      <div class="login-container">
        <h2>Login</h2>
        <form id="login-form">
          <div class="form-field">
            <label for="username">Username</label>
            <input type="text" id="username" required>
          </div>
          <div class="form-field">
            <label for="password">Password</label>
            <input type="password" id="password" required minlength="8">
          </div>
          <button type="submit" class="login-button">Login</button>
        </form>
        <div class="error-message"></div>
      </div>`;
    }

    addStyles() {
        const style = document.createElement("style");
        style.textContent = `
      .login-container {
        width: 100%;
        max-width: 400px;
        background: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        font-family: Arial, sans-serif;
      }
      .login-container h2 {
        margin-bottom: 20px;
        text-align: center;
      }
      .form-field {
        margin-bottom: 15px;
      }
      .form-field label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
      }
      .form-field input {
        width: 100%;
        padding: 10px;
        font-size: 14px;
        border: 1px solid #ccc;
        border-radius: 4px;
      }
      .login-button {
        width: 100%;
        padding: 10px;
        font-size: 16px;
        background-color: #007BFF;
        color: #fff;
        border: none;
        border-radius: 4px;
        cursor: pointer;
      }
      .login-button:hover {
        background-color: #0056b3;
      }
      .error-message {
        color: red;
        font-size: 14px;
        margin-top: 10px;
        text-align: center;
      }
    `;
        document.head.appendChild(style);
    }

}