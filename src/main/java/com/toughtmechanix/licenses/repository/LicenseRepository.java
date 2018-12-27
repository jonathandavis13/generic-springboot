package com.toughtmechanix.licenses.repository;

import com.toughtmechanix.licenses.entities.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenseRepository extends CrudRepository<License,String> {

    /**
     * Find License By Org Id
     * @return List of Licenses
     */
    public List<License> findByOrganizationId(String organizationId);

    /**
     * Find License by Org Id & License Id
     * @return License
     */
    public License findByOrganizationIdAndLicenseId(String organizationId, String licenseId);
}
