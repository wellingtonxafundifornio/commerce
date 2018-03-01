package model;

import java.util.ArrayList;

public class Caixa {

	private ArrayList<Item> ListaItens = new ArrayList<>();
	private int totalPrice;
	private int totalDiscount;

	public Caixa(final Item item) {
		totalPrice = 0;
		totalDiscount = 0;
		ListaItens.add(item);
	}

	public Caixa() {
		totalPrice = 0;
		totalDiscount = 0;
	}

	public void add(final String skuItem) throws Exception {
		String sku = "";
		sku = skuItem.toUpperCase();

		recalculateAddItens(sku);
	}

	public void remove(final String skuItem) throws Exception {
		String sku = "";
		sku = skuItem.toUpperCase();

		if (existeItem(sku)) {
			recalculateReductionItens(sku);
		}

	}

	public Item retornaItem(final String sku) throws Exception {

		for (Item item : ListaItens) {

			if (item.getSku().equalsIgnoreCase(sku)) {
				return item;
			}
		}
		throw new Exception("Item " + sku + " inexistente!");
	}

	public boolean existeItem(String sku) {

		for (Item item : ListaItens) {

			if (item.getSku().equalsIgnoreCase(sku)) {
				return true;
			}
		}
		return false;
	}

	public Item recolocaItemArray(final String sku) throws Exception {

		for (Item item : ListaItens) {

			if (item.getSku().equalsIgnoreCase(sku)) {
				this.ListaItens.remove(item);
				this.ListaItens.add(item);
			}
		}

		throw new Exception("Item inexistente!");
	}

	public void addItenOnList(final Item item) {
		ListaItens.add(item);
	}

	public ArrayList<Item> getListaItens() {
		return ListaItens;
	}

	public void setListaItens(final ArrayList<Item> listaItens) {
		ListaItens = listaItens;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(final int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTotalDiscount() {
		return totalDiscount;
	}


	private void recalculateAddItens(final String sku) throws Exception {
		Item item = new Item(sku);

		if (existeItem(sku)) {
			item = retornaItem(sku);
		} else {
			ListaItens.add(item);
		}

		switch (sku) {
		/* 3 por 130 */
		case "A":

			item.incrementQtd();

			if (item.getQtd() % 3 == 0) {
				totalPrice += 30;
				totalDiscount += 20;
			} else {
				totalPrice += item.getPrecoUnitario();
			}
			break;

		/* 2 por 45 */
		case "B":

			item.incrementQtd();

			if (item.getQtd() % 2 == 0) {
				totalPrice += 15;
				totalDiscount += 15;
			} else {
				totalPrice += item.getPrecoUnitario();
			}
			break;

		/* leve 3, pague 2 */
		case "C":

			item.incrementQtd();

			if (item.getQtd() % 3 == 0) {
				totalDiscount += 20;
			} else {
				totalPrice += item.getPrecoUnitario();
			}
			break;
		case "D":
			totalPrice += item.getPrecoUnitario();
			break;

		default:
			break;
		}

	}

	private void recalculateReductionItens(final String sku) throws Exception {
		Item item = new Item(sku);

		if (existeItem(sku)) {
			item = retornaItem(sku);
		} else {
			ListaItens.remove(item);
		}

		switch (sku) {
		case "A":
			if (item.getQtd() % 3 == 0) {
				item.decrementQtd();
				totalPrice -= 30;
				totalDiscount -= 20;
			} else {
				item.decrementQtd();
				totalPrice -= item.getPrecoUnitario();
			}
			break;
		case "B":
			if (item.getQtd() % 2 == 0) {
				item.decrementQtd();
				totalPrice -= 15;
				totalDiscount -= 15;
			} else {
				item.decrementQtd();
				totalPrice -= item.getPrecoUnitario();
			}
			break;
		case "C":
			if (item.getQtd() % 3 == 0) {
				item.decrementQtd();
				totalDiscount -= 20;
			} else {
				item.decrementQtd();
				totalPrice -= item.getPrecoUnitario();
			}
			break;
		case "D":
			totalPrice -= item.getPrecoUnitario();
			break;

		default:
			break;
		}

	}
}
