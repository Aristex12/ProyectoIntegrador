package mvc.modelo;

public class Proyectos {

	private String nombre;
	private String idProyecto;
	private String curso;
	private String url;
	private int nota;

	public Proyectos(String nombre, String idProyecto, int nota, String curso, String url) {
		this.nombre = nombre;
		this.idProyecto = idProyecto;
		this.nota = nota;
		this.curso = curso;
		this.url = url;
	}

	public Proyectos() {

	}

	public String toString() {

		return nombre + " / " + curso + " / " + nota;

	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(String idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
