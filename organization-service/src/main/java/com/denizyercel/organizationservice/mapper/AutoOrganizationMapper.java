package com.denizyercel.organizationservice.mapper;

import com.denizyercel.organizationservice.dto.OrganizationDto;
import com.denizyercel.organizationservice.entity.Organization;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoOrganizationMapper {

    AutoOrganizationMapper MAPPER = Mappers.getMapper(AutoOrganizationMapper.class);

    OrganizationDto mapToOrganizationDto(Organization organization);

    Organization mapToOrganization(OrganizationDto organizationDto);
}
