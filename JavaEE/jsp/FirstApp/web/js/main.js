function formYoxla() {
    let name = document.getElementsByName("name");
    let surname = document.getElementsByName("surname");
    let father_name =document.getElementsByName("father_name");
    let email = document.getElementsByName("email");
    let phone =document.getElementsByName("phone");
    let pass1=document.getElementsByName("password1");
    let pass2 =document.getElementsByName("password2");
    let photo =document.getElementsByName("photo");


    if (name==null && surname==null && father_name==null && email == null && phone ==ull && pass1==null && photo==null){
        alert("Butun xanalari doldurun")
    } else if (pass1 != pass2){
        alert("Sifreniz uygun gelmir");
    }



}