package pe.edu.cibertec.DSWII_CL1SOAP_SaiLaguna.exception;


import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.SERVER)
public class NotFoundException extends RuntimeException {


    public NotFoundException(String message) {
        super(message);
    }
}
