package com.training.mjunction.usersvcs.webservice.resources;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("Eroor resource")
public class ErrorResource {
	@ApiModelProperty("Error code")
	private int errorCode;
	@ApiModelProperty("Error message")
	private String errorMessage;
}
