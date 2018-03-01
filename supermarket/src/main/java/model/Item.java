package model;

import exception.ItemInexistente;

public class Item {

	private String sku;
	private int precoUnitario;
	private int qtd;
	
	public Item(final String sku) throws Exception{
		
		qtd=0;
		if(sku.equalsIgnoreCase("A")){
			this.sku = "A";
			precoUnitario = 50;
		}else if(sku.equalsIgnoreCase("B")){
			this.sku = "B";
			precoUnitario = 30;
		}else if(sku.equalsIgnoreCase("C")){
			this.sku = "C";
			precoUnitario = 20;
		}else if(sku.equalsIgnoreCase("D")){
			this.sku = "D";
			precoUnitario = 15;
		}else{
			throw new ItemInexistente("Item '"+ sku +"' inexistente! ");
		}
	}
	
	public void incrementQtd(){
		qtd++;
	}
	
	public void decrementQtd(){
		qtd--;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(int precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
}


