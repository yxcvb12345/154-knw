package ch.ilv.crm.business.product;

import java.util.UUID;

public interface IProduct {
	void setDescription(String desc);
	String getDescription();
	void setId(UUID id);
	UUID getId();
}
