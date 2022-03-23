

let obj = {nombrePlaces:3,couleur:"rose bonbon",motif:"Nymfalis"};

$("#monBouton").click(() => {

    obj.nombrePlaces = $("#nbPlaces").val();
    obj.couleur = $("#couleur").val();


    $.ajax({
        type: "POST",
        url: "http://localhost:8080/API/recuperationCanape",
        data: JSON.stringify(obj),
        headers: {"Content-Type":"application/json"},
        success: (retour)=>{console.log(retour);}
    });

});

