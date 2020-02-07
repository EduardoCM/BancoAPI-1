package com.praxis.banco.config;


import java.io.Serializable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**  
  * Santander Mexico<br>  
  * <br><b>Project:</b> li-perfilamiento-service  
  * <br><b>Class:</b> SwaggerConfig.java  
  * <br><b>Description:</b> Configuracion para habilitar swagger  
  *  
  * @author Eduardo Castillo Mendoza  
  * @company Praxis  
  * @created 1 ago. 2019  
  * @since JDK1.8  
  *  
  * @version Control de cambios:  
  * @version 1.0 1 ago. 2019 FSW Lacertus Nombre del autor:   
  * Descripcion breve del cambio  
  *  
  * @category Incluir si la clase es un Modelo, Service, etc.  
  *     
  */
@Configuration
@EnableSwagger2
public class SwaggerConfig implements Serializable {

	/**
	 * serial version uid.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Bean para scannear las APIs existentes en el proyecto y generar el
	 * swagger-ui.
	 * 
	 * @return docket con configuracion para scannar APIs.
	 */
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(Boolean.FALSE).select()
				.apis(RequestHandlerSelectors.basePackage("mx.santander.liquidez.controller"))
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}

	/**
	 * Builder para el ApiInfo.
	 * 
	 * @return apiInfo con la informacion de la construccion del API.
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Perfilamiento Service").description("CRUD perfilamiento").version("1.0")
				.contact(new Contact("Eduardo Castillo Mendoza", " ", "edca@praxis.com.mx")).build();
	}

}