package lviv.lgs.ua.task3;

public class MyArrayList {

	private String citiesForDelivery;
	
	

	public MyArrayList(String citiesForDelivery) {
		super();
		this.citiesForDelivery = citiesForDelivery;
	}

	public String getCitiesForDelivery() {
		return citiesForDelivery;
	}

	public void setCitiesForDelivery(String citiesForDelivery) {
		this.citiesForDelivery = citiesForDelivery;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((citiesForDelivery == null) ? 0 : citiesForDelivery.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyArrayList other = (MyArrayList) obj;
		if (citiesForDelivery == null) {
			if (other.citiesForDelivery != null)
				return false;
		} else if (!citiesForDelivery.equals(other.citiesForDelivery))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyArrayList [City for delivery is " + citiesForDelivery + "]";
	}
	
	
	
	
}
