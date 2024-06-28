package com.bertha.Gendra.Services;

import org.springframework.stereotype.Service;

import com.bertha.Gendra.Models.AltaSolicitudModel;
import com.bertha.Gendra.Models.ResponseBase;
import com.bertha.Gendra.Repositories.AltaSolicitudRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AltaSolicitudServices {
    
    AltaSolicitudRepository altaSolicitudRepository;

    public ResponseBase altasolicitud(AltaSolicitudModel solicitud){

        ResponseBase response = new ResponseBase();

        try{
            altaSolicitudRepository.save(solicitud); 
            response.setResponse("Registro Guardado Correctamente");
            response.setResponseCode(200);

        }
        catch(Exception e)
        {
            response.setResponse(e.getMessage());
            response.setResponseCode(400);
        }
        
        return response;

    }

    public ResponseBase actualizarsolicitud(AltaSolicitudModel solicitud){

        ResponseBase response = new ResponseBase();

        try{
            response.setResponse("Registro Actualizado Correctamente");
            response.setResponseCode(200);

        }
        catch(Exception e)
        {
            response.setResponse(e.getMessage());
            response.setResponseCode(400);
        }
        
        return response;

    }
}
