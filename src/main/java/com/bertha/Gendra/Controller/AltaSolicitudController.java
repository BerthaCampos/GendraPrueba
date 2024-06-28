package com.bertha.Gendra.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bertha.Gendra.Models.AltaSolicitudModel;
import com.bertha.Gendra.Models.ResponseBase;
import com.bertha.Gendra.Services.AltaSolicitudServices;

@RestController
@RequestMapping("/AltaSolicitud")
public class AltaSolicitudController{

    AltaSolicitudServices altaSolicitudServices;

    @PostMapping("/create")
    public ResponseBase altasolicitud(@RequestBody AltaSolicitudModel solicitud)
    {
        return altaSolicitudServices.altasolicitud(solicitud);
    }

}