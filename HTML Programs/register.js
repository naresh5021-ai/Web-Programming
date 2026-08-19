// register.js
document.getElementById("registerForm").addEventListener("submit", function(e){
  e.preventDefault();
  const pass = document.getElementById("password").value;
  const confirm = document.getElementById("confirmPassword").value;
  if (pass !== confirm) {
    alert("Passwords do not match");
    return;
  }
  // Proceed with registration logic
});