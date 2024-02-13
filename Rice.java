class Rice extends Item {
	private final double qtyInKilos;
	Rice(double qtyInKilos) {
		this.qtyInKilos=qtyInKilos;
	}
	public String displayItem(){
		return "Rice";
	}
	public double getCost(){
		return 1000.0;
	}
	public double getQuantity() {
		return qtyInKilos;
	}
}