
public class ShopsLinkedList {
	ShopNode head;

	public ShopsLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;

		}
		return false;
	}

	public void insertAtFront(Shop shop) {
		ShopNode n = new ShopNode(shop);

		if (isEmpty()) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
	}

	public void insertAtBack(Shop shop) {
		ShopNode n = new ShopNode(shop);
		if (isEmpty()) {
			head = n;
		} else {
			ShopNode current = head;

			while (current.next != null) {
				current = current.next;
			}
			current.next = n;
		}
	}

	public void deleteFromFront() {
		if (!isEmpty()) {
			head = head.next;
		}
	}
	public void display() {
		ShopNode current = head;
		
		while(current!= null) {
			System.out.println(current.shop.ShopID + ")" + current.shop.ShopName);
			
			System.out.println();
			current = current.next;
		}
	}
	
	public Shop getShopById(int shopId) {
        ShopNode current = head;
        while (current != null) {
            if (current.getShop().getShopID() == shopId) {
                return current.getShop();
            }
            current = current.getNext();
        }
        return null; 
    }

}
