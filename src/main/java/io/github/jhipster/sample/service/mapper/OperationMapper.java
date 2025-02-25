package io.github.jhipster.sample.service.mapper;

import io.github.jhipster.sample.domain.Operation;
import io.github.jhipster.sample.service.dto.OperationDTO;
import java.util.Set;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Operation} and its DTO {@link OperationDTO}.
 */
@Mapper(componentModel = "spring", uses = { BankAccountMapper.class, LabelMapper.class })
public interface OperationMapper extends EntityMapper<OperationDTO, Operation> {
    @Mapping(target = "bankAccount", source = "bankAccount", qualifiedByName = "name")
    @Mapping(target = "labels", source = "labels", qualifiedByName = "labelSet")
    OperationDTO toDto(Operation s);

    @Mapping(target = "removeLabel", ignore = true)
    Operation toEntity(OperationDTO operationDTO);
}
