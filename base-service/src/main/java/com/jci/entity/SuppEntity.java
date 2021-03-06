/**
 * (C) Copyright 2016 Johnson Controls, Inc
 * Use or Copying of all or any part of this program, except as
 * permitted by License Agreement, is prohibited.
 */
package com.jci.entity;

import com.microsoft.azure.storage.table.TableServiceEntity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * The Class SuppEntity.
 */
@Data
@Builder
public class SuppEntity extends TableServiceEntity {

	/**
	 * Instantiates a new supp entity.
	 *
	 * @param partitionKey the partition key
	 * @param rowKey the row key
	 */
	@Tolerate
	public SuppEntity(String partitionKey, String rowKey) {
		this.partitionKey = partitionKey;
		this.rowKey = rowKey; //supplierID
	}

	/** The json string. */
	private String jsonString;
	
	/** The supplier delivery state. */
	private int supplierDeliveryState;
	
	/** The user name. */
	private String userName;
	
	/** The global id. */
	private String globalId;	
	
	/** The comment. */
	private String comment;	

	/** The region. */
	private String region;
	
	/** The plant. */
	private String plant;
	
	/** The supp type. */
	private String suppType;

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuppEntity other = (SuppEntity) obj;
		if (partitionKey == null) {
			if (other.partitionKey != null)
				return false;
		} else if (!partitionKey.equals(other.partitionKey))
			return false;
		if (rowKey == null) {
			if (other.rowKey != null)
				return false;
		} else if (!rowKey.equals(other.rowKey))
			return false;
		return true;
	}


}
