class Dahl extends Item{
	private final double qtyInKilos;

	Dahl(double qtyInKilos){
		this.qtyInKilos=qtyInKilos;
	}

	public String displayItem(){
		return "Dahl";
	}
	public double getCost(){
		return 750.0;
	}
	public double getQuantity(){
		return qtyInKilos;
	}
}