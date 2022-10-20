public abstract class NodeVisitor {


	public NodeVisitor() {
	}
	public NodeVisitor(Object visitee) {
	}

	public abstract void visitProduct(Product product);

	public abstract void visitTrading(Trading trading);

	public abstract void visitFacade(Facade facade);

}
