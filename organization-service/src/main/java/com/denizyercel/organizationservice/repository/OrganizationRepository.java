package com.denizyercel.organizationservice.repository;


import com.denizyercel.organizationservice.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization,Long> {
    Organization findByOrganizationCode(String organizationCode);
}
