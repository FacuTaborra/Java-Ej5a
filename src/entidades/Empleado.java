package entidades;

public class Empleado {
	int dni;
	String nombre;
	String apellido;
	String email;
	float sueldoBase;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public String getDetalle() {
		String detalle = "Empleado - ";
		detalle += this.getNombre() + ", "+ this.getApellido()+"\n Dni --> " + getDni()+"\n Emial --> " + this.getEmail();
		return detalle;
	}
	
	public Empleado(int dni, String nombre, String apellido, String email, float sueldoBase) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEmail(email);
		this.setSueldoBase(sueldoBase);
	}
	
	
}
