package net.mapetiteentreprise.PetitProjet.controllers;

import net.mapetiteentreprise.PetitProjet.beans.Canape;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API")
public class MainWebController {

    //1
    @GetMapping("/coucou")
    public String coucou(){
        return("Coucou !");
    }

    @GetMapping("/salut")
    public String salut(){
        return("Salut !");
    }

    //2
    @GetMapping("/chopeTexte/{texte}")
    public String chopeTexte(@PathVariable("texte") String texte){
        return("Le texte reçu est : " + texte);
    }

    @GetMapping("/chopeNombre/{nombre}")
    public String chopeNombre(@PathVariable("nombre") int nombre){
        return("Le nombre reçu est : " + nombre);
    }

    //3
    @GetMapping("/testHTTP")
    public String testHttpGet(){
        return("J'ai été appelé en GET !");
    }

    @PostMapping("/testHTTP")
    public String testHttpPost(){
        return("J'ai été appelé en POST !");
    }

    //4
    @PutMapping("/testHTTP")
    public String testHTTPPut(){
        return("J'ai été appelé en PUT !");
    }

    @DeleteMapping("/testHTTP")
    public String testHTTPDelete(){
        return("J'ai été appelé en DELETE !");
    }

    @PatchMapping("/testHTTP")
    public String testHTTPPatch(){
        return("J'ai été appelé en PATCH !");
    }

    //5
    @GetMapping("/exempleCanape")
    public Canape exempleCanape(){
        Canape canap = new Canape(3,"rouge","dragons");
        return(canap);
    }

    //6
    @PostMapping("/recuperationCanape")
    public String recuperationCanape(@RequestBody Canape canap){
        System.out.println(canap);
        return "OK";
    }

    //EXERCICES
    @GetMapping("/bonjour")
    public String bonjour(){
        return("Bonjour !");
    }


    @GetMapping("/transmissionDonneeInt/{maDonneeInt}")
    public String transmissionDonneeInt(@PathVariable("maDonneeInt") int donneeInt){
        return("J’ai bien reçu 'donnée' de type 'int', elle contient : " + donneeInt);
    }

    @GetMapping("/transmissionDonneeString/{maDonneeString}")
    public String transmissionDonneeString(@PathVariable("maDonneeString") String donneeString){
        return("J’ai bien reçu 'donnée' de type 'String', elle contient : " + donneeString);
    }

    
}
