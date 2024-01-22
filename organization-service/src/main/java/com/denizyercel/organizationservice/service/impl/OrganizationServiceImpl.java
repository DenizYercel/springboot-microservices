package com.denizyercel.organizationservice.service.impl;

import com.denizyercel.organizationservice.dto.OrganizationDto;
import com.denizyercel.organizationservice.entity.Organization;
import com.denizyercel.organizationservice.mapper.AutoOrganizationMapper;
import com.denizyercel.organizationservice.repository.OrganizationRepository;
import com.denizyercel.organizationservice.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {
        Organization organization = AutoOrganizationMapper.MAPPER.mapToOrganization(organizationDto);

        organizationRepository.save(organization);

        OrganizationDto savedOrganizationDto = AutoOrganizationMapper.MAPPER.mapToOrganizationDto(organization);

        return savedOrganizationDto;
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return AutoOrganizationMapper.MAPPER.mapToOrganizationDto(organization);
    }
}
