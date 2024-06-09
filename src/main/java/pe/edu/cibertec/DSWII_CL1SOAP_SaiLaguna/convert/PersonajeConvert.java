package pe.edu.cibertec.DSWII_CL1SOAP_SaiLaguna.convert;


import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_CL1SOAP_SaiLaguna.model.Personaje;
import pe.edu.cibertec.ws.objects.Personajews;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonajeConvert{
    public Personaje convertPersonajewsToPersonaje(Personajews personajews){
        Personaje personaje = new Personaje();
        personaje.setIdpersonaje(personajews.getIdpersonaje());
        personaje.setNompersonaje(personajews.getNompersonaje());
        personaje.setApepersonaje(personajews.getApepersonaje());
        personaje.setFechnacpersonaje(personajews.getFechnacpersonaje());
        return personaje;
    }
    public List<Personaje> convertPersonajewsToPersonaje(List<Personajews> personajews){
        List<Personaje> personajeList = new ArrayList<>();
        personajews.forEach(per -> {
            personajeList.add(convertPersonajewsToPersonaje(per));
        });
        return personajeList;
    }
    public Personajews convertPersonajeToPersonajeWs(Personaje personaje){
        Personajews personajews = new Personajews();
        personajews.setIdpersonaje(personaje.getIdpersonaje());
        personajews.setNompersonaje(personaje.getNompersonaje());
        personajews.setApepersonaje(personaje.getApepersonaje());
        personajews.setFechnacpersonaje(personaje.getFechnacpersonaje());
        return personajews;
    }
    public List<Personajews> convertPersonajeToPersonajeWs(List<Personaje> personaje){
        List<Personajews> personajeList = new ArrayList<>();
        personaje.forEach(per ->{
            personajeList.add(convertPersonajeToPersonajeWs(per));
        });
        return personajeList;
    }
}