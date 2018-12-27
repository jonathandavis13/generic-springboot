package com.toughtmechanix.licenses.services;

import com.toughtmechanix.licenses.config.ServiceConfig;
import com.toughtmechanix.licenses.entities.License;
import com.toughtmechanix.licenses.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseService {

    @Autowired
    private LicenseRepository licenseRepository;

    @Autowired
    ServiceConfig serviceConfig;

    public License getLicense(String organizationId, String licenseId){
        License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId,licenseId);
        return license.withComment(serviceConfig.getExampleProperty());

    }

}
