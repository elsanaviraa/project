package com.example.pemesanan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "TB_TYPE", schema = " HR")
@Entity
public class Type {

		@Id
		@Column(name = "ID_TYPE")
		private String idType;
		
		@Column(name = "TYPE_NAME")
		private String typeName;

		public String getIdType() {
			return idType;
		}

		public void setIdType(String idType) {
			this.idType = idType;
		}

		public String getTypeName() {
			return typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}

}
