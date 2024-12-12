
public class ShopNode {
	public Shop shop;
	ShopNode next;
	
	public ShopNode() {
		shop = null;
		next = null;
	}
	public ShopNode(Shop shop) {
		this.shop = shop;
		this.next = null;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public ShopNode getNext() {
		return next;
	}
	public void setNext(ShopNode next) {
		this.next = next;
	}

}
