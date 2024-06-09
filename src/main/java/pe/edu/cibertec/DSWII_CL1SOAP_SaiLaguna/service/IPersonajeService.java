package pe.edu.cibertec.DSWII_CL1SOAP_SaiLaguna.service;

import pe.edu.cibertec.DSWII_CL1SOAP_SaiLaguna.model.Personaje;
import pe.edu.cibertec.ws.objects.Personajews;

import java.util.List;

public interface IPersonajeService {

    List<Personajews> listarPersonaje();
    Personajews obtenerPersonajexId(int id);
    Personajews registrarActualizarPersonaje(Personajews personaje);

}
