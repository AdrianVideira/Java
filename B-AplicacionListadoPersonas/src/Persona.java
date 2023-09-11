public class Persona {
    //Variables.
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas; //Variable asociada a la clase (static).

    //Constructor vacio.
    public Persona(){
        this.id = ++Persona.numeroPersonas; //Inicializamos el atributo id. y hacemos que inicie en 1.
        //Cada vez que se cree un objeto de tipo persona se generará un id de forma automática.
    }

    //Constructor con argumentos.
    public Persona(String nombre, String tel, String email){
        this();//llamamos al constructor vacío para generar de forma automática el id.
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    //Getter y Setter.
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Juan Perez", "454841", "juanperez@mail.com");
        System.out.println(persona);

    }
}
