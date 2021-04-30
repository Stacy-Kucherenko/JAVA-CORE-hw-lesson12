package lviv.lgs.ua;

public class Car {

	
		private int horsepower; 
		private int yearModel;
		private SteeringWheel steeringWheel;
		private Engine engine;
		
		public Car(int horsepower, int yearModel, SteeringWheel steeringWheel, Engine engine) {
			super();
			this.horsepower = horsepower;
			this.yearModel = yearModel;
			this.steeringWheel = steeringWheel;
			this.engine = engine;
		}

		public int getHorsepower() {
			return horsepower;
		}

		public void setHorsepower(int horsepower) {
			this.horsepower = horsepower;
		}

		public int getYearModel() {
			return yearModel;
		}

		public void setYearModel(int yearModel) {
			this.yearModel = yearModel;
		}

		public SteeringWheel getSteeringWheel() {
			return steeringWheel;
		}

		public void setSteeringWheel(SteeringWheel steeringWheel) {
			this.steeringWheel = steeringWheel;
		}

		public Engine getEngine() {
			return engine;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}

		@Override
		public String toString() {
			return "Car [horsepower=" + horsepower + ", yearModel=" + yearModel + ", " + steeringWheel
					+ ", " + engine + "]";
		}
	
	

}
