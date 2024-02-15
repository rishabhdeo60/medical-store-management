package com.example.model;

import lombok.Data;

@Data
public class Medicine {
	private int medicineId;
	private String medicineName;
	private String batchNumber;
	private int price;
}
