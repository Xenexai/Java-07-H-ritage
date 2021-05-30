public abstract class Vehicle {

		private String brand;
		private int kilometers;
		/**
		 * @param brand
		 * @param kilometers
		 */
		public Vehicle(String brand, int kilometers) {
			super();
			this.brand = brand;
			this.kilometers = kilometers;
		}
		/**
		 * @return the brand
		 */
		public String getBrand() {
			return brand;
		}
		/**
		 * @param brand the brand to set
		 */
		public void setBrand(String brand) {
			this.brand = brand;
		}
		/**
		 * @return the kilometers
		 */
		public int getKilometers() {
			return kilometers;
		}
		/**
		 * @param kilometers the kilometers to set
		 */
		public void setKilometers(int kilometers) {
			this.kilometers = kilometers;
		}
		
		public abstract String doStuff();
}
