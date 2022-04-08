package entidades;

public class Vendedor extends Empleado{
	float porcenComision;
	int totalVentas;
	
	public float getPorcenComision() {
		return porcenComision;
	}
	public void setPorcenComision(float porcenComision) {
		this.porcenComision = porcenComision;
	}
	public int getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	public String getDetalle() {
		String detalleVen = super.getDetalle();
		detalleVen += "\nVendedor - ";
		detalleVen += "Sueldo total -->" + (this.getSueldoBase() + (this.getPorcenComision()*this.getTotalVentas()/100)) ;
		return detalleVen;
	}
	
	public Vendedor(int dni, String nombre, String apellido, String email, float sueldoBase, float porcenComision, int totalVentas) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.setPorcenComision(porcenComision);
		this.setTotalVentas(totalVentas);
	}
	
	
}
