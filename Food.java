class Food implements IAccountable{
	public Item [] items;
	Food(Item [] items){
		this.items=items;
	}
	public void calculateCost(){
		double subTot=0;
		double tot=0;
		

		for(Item item : items){
			subTot = item.getCost()*item.getQuantity();
			tot+=subTot;
			System.out.println(item.displayItem()+"=> "+item.getCost()+"*"+item.getQuantity() +" = "+subTot);
	
			
		}System.out.println("The total cost is = "+tot);
	}
}