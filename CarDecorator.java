public abstract class CarDecorator implements Car {

  private Car car;
  
  public CarDecorator(Car car){
    this.car = car;
  }
  
  public void assemble() {
    this.car.assemble();
  }

}