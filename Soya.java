class Soya extends Item {
	private double qtyInKilos;
	Soya(double qtyInKilos){
		this.qtyInKilos=qtyInKilos;
	}

	public String displayItem(){
		return "Soya";
	}
	public double getCost(){
		return 850.0;
	}
	public double getQuantity(){
		return qtyInKilos;
	}
}