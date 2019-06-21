package ch.ilv.crm.persistence.product.dto;

import java.util.UUID;

public class ProductDTO {
	private UUID id;
	private String desciption = null;
	
	public ProductDTO(UUID id, String desc) {
		this.id = id;
		this.desciption = desc;
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
}
