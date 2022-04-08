package entidades;

public class Administrativo extends Empleado {
	float hsExtra;
	int hsMes;
	
	public float getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(float hsExtra) {
		this.hsExtra = hsExtra;
	}
	public int getHsMes() {
		return hsMes;
	}
	public void setHsMes(int hsMes) {
		this.hsMes = hsMes;
	}	
	
	public String getDetalle() {
		String detalleAdm = super.getDetalle();
		detalleAdm += "\nAdministrativo - ";
		detalleAdm += "sueldo total --> "+ (this.getSueldoBase()*((this.getHsExtra()*1.5)+this.getHsMes())/this.getHsMes());
		return detalleAdm;
	}
	
	public Administrativo(int dni, String nombre, String apellido, String email, float sueldoBase, float hsExtra , int hsMes) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.setHsExtra(hsExtra);
		this.setHsMes(hsMes);
	}
	
	
}
