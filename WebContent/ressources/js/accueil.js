console.log("OK");


function validerForm() {
    let emailElement =
        document.getElementById("email");
    let email = emailElement.value;

    if(email === ""
        || !email.includes("@")
        || !email.endsWith(".fr")
    ){
        console.log("Adresse mail non valide");
        emailElement.classList.add("erreur");
    }else{
        emailElement.classList.remove("erreur");
    }


    
}