

$.get("http://localhost:8080/API/testHTTP", (retour)=>{
    alert(retour);
});

$.post("http://localhost:8080/API/testHTTP", (retour)=>{
    alert(retour);
});

//4
$.ajax({
    type:"PUT",
    url:"http://localhost:8080/API/testHTTP",
    success:(retour)=>{alert(retour)},
    error:()=>{alert("C'est tout planté (put)")}
});

$.ajax({
    type:"DELETE",
    url:"http://localhost:8080/API/testHTTP",
    success:(retour)=>{alert(retour)},
    error:()=>{alert("C'est tout planté (delete)")}
});


$.ajax({
    type:"PATCH",
    url:"http://localhost:8080/API/testHTTP",
    success:(retour)=>{alert(retour)},
    error:()=>{alert("C'est tout planté (patch)")}
});