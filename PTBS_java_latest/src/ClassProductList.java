public class ClassProductList {

	private ReminderVisitor reminderVisitor;

	private Product[] product;

	private ProductIterator productIterator;



	public ClassProductList(ReminderVisitor reminderVisitor) {
		this.reminderVisitor = reminderVisitor;
	}

	public void accept(NodeVisitor visitor) {

	}

	public ProductIterator getProductIterator() {
		return productIterator;
	}

	public void setProductIterator(ProductIterator productIterator) {
		this.productIterator = productIterator;
	}
}
