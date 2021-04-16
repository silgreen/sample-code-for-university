class Container {
  private double litri;
  private List<Conatainer> containerList = new LinkedList<>();

  public double getAmount() {
    return litri;
  }


  private double collectAllWater() {
    private double collectedWater = litri;	  
    if(!containerList.isEmpty()) {
	for(Container c : containerList) {
          collectedWater += c.getAmount();
      }
    } return collectedWater;
  }

  public void addWater(double water) {
    if(containerList.isempty()) { 	/* Se aggiungiamo acqua questa andrà a modificare anche altri contenitori */
      litri += water;
    } else {
      private final double splitWater = (water + collectAllWater()) / containerList.size();
      litri = splitWater;
      
      ListIterator<Container> i = containerList;
      while(i.hasNext()) {
        i.litri = splitWater;
	i.next();
      }
    }
  }
}
