package entities;


//classe Fucionário	
public class Employee {

	private String name; // Nome do funcionário
	private Integer hours; // Horas trabalhadas
	private Double valuePerHour; // Valor por horas trabalhadas
	
	
	
	// Construtores
	public Employee() {
	}
	
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	// metodos getters e setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	//metodo que faz o calculo do pagamento
	public double payment() {
		return hours * valuePerHour;
	}
	
	
	
	
	
}
