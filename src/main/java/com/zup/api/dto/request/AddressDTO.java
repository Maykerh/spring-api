package com.zup.api.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.zup.api.utils.DTOMapper;
import com.zup.api.entity.Address;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AddressDTO {
    @NotBlank(message = "Campo 'CEP' é obrigatório")
    @Pattern(regexp = "^\\d{5}[-]\\d{3}$", message = "Formato do CEP inválido")
    private String cep;

    @NotBlank(message = "Campo 'Rua' é obrigatório")
    private String street;

    @NotNull(message = "Campo 'Número' é obrigatório")
    private Integer number;

    @NotBlank(message = "Campo 'Bairro' é obrigatório")
    private String neighborhood;

    @NotBlank(message = "Campo 'Cidade' é obrigatório")
    private String city;

    @NotBlank(message = "Campo 'Estado' é obrigatório")
    private String state;

    public Address toEntity() {
        return (Address) DTOMapper.toEntity(this, Address.class);
    }
 
    public static AddressDTO fromEntity(Address address) {
         return (AddressDTO) DTOMapper.fromEntity(address, AddressDTO.class);
    }
}
