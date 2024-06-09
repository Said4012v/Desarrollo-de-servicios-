package pe.edu.cibertec.DSWII_CL1SOAP_SaiLaguna.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWII_CL1SOAP_SaiLaguna.convert.PersonajeConvert;
import pe.edu.cibertec.DSWII_CL1SOAP_SaiLaguna.exception.NotFoundException;
import pe.edu.cibertec.DSWII_CL1SOAP_SaiLaguna.service.PersonajeService;
import pe.edu.cibertec.ws.objects.*;

@AllArgsConstructor
@Endpoint
public class PersonajeEndPoint {

    private final PersonajeService personajeService;
    private final PersonajeConvert personajeConvert;
    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getPersonajesRequest")
    @ResponsePayload
    public GetPersonajesResponse listarPersonajes(@RequestPayload GetPersonajesRequest request) {
        GetPersonajesResponse response = new GetPersonajesResponse();
        response.getPersonajes().addAll(personajeService.listarPersonaje());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getPersonajeRequest")
    @ResponsePayload
    public GetPersonajeResponse obtenerPersonaje(@RequestPayload GetPersonajeRequest request) {
        GetPersonajeResponse response = new GetPersonajeResponse();
        Personajews personajews = personajeService.obtenerPersonajexId(request.getId());
        if (personajews == null)
            throw new NotFoundException("El personaje con el ID " + request.getId() + " no existe!");
        response.setPersonaje(personajews);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "postPersonajeRequest")
    @ResponsePayload
    public PostPersonajeResponse guardarPersonaje(@RequestPayload PostPersonajeRequest request) {
        PostPersonajeResponse response = new PostPersonajeResponse();
        response.setPersonaje(personajeService.registrarActualizarPersonaje(request.getPersonaje()));
        return response;
    }
}
