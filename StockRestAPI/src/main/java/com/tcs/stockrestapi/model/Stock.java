package com.tcs.stockrestapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "stock_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stock_id")
	private int stockId;
	@Column(name ="product_id")
	private int productId;
	@Column(name ="quantity")
	private int quantity;
	@Column(name ="location")
	private String location;

}
