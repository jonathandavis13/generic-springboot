package com.toughtmechanix.licenses.controllers;

import com.toughtmechanix.licenses.entities.License;
import com.toughtmechanix.licenses.services.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/organization/{organizationId}/license")
public class LicenseServiceController {

    @Autowired
    LicenseService licenseService;

    @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
    public License getLicenses(@PathVariable("organizationId") String organizationId, @PathVariable("licenseId") String licenseId){
        return licenseService.getLicense(organizationId,licenseId);
    }


}
