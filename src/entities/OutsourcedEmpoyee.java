package entities;

//subclasse funcionário terceirizado 
public class OutsourcedEmpoyee extends Employee {

	private Double additionalCharges; //despesas adicionais
	
	public OutsourcedEmpoyee() {
		super();
	}

	public OutsourcedEmpoyee(String name, Integer hours, Double valuePerHour, Double additionalCharges) {
		super(name, hours, valuePerHour);
		this.additionalCharges = additionalCharges;
	}

	public Double getAdditionalCharges() {
		return additionalCharges;
	}

	public void setAdditionalCharges(Double additionalCharges) {
		this.additionalCharges = additionalCharges;
	}
	
	@Override
	//metodo que faz o calculo do pagamento do funcionário terceirizado
		public double payment() {
			return super.payment() + additionalCharges * 1.1;
		}
}
