package domain;

public class Flight {
	private Airline company;
	private Airport origin;
	private Airport destination;
	private int flightNumber;
	
	public Flight(Airline company, int flightNumber,
			Airport origin, Airport destination) {
		super();
		this.company = company;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
	}
	public Airline getCompany() {
		return company;
	}
	public void setCompany(Airline company) {
		this.company = company;
	}
	public Airport getDestination() {
		return destination;
	}
	public void setDestination(Airport destination) {
		this.destination = destination;
	}
	public Airport getOrigin() {
		return origin;
	}
	public void setOrigin(Airport origin) {
		this.origin = origin;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	@Override
	public String toString() {
		return company.toString() + flightNumber;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((company == null) ? 0 : company.hashCode());
		result = PRIME * result + ((destination == null) ? 0 : destination.hashCode());
		result = PRIME * result + flightNumber;
		result = PRIME * result + ((origin == null) ? 0 : origin.hashCode());
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
		final Flight other = (Flight) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		// XXX The Eclipse Wizard generated this; should it use == ?
		} else if (!company.equals(other.company))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		return true;
	}
}
