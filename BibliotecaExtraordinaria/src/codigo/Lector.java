package codigo;


/**
 * @version1.0.0
 */
public class Lector {

    private int idSocio;
    private String dni;
    private String nombre;

    private String email;

    private String codPostal;

    private boolean sancionado;

    private boolean datosValidos;

    public Lector(int idSocio, String dni, String nombre, String email, String codPostal) {
        this.idSocio = idSocio;
        this.dni = dni;
        this.nombre = nombre;

      
        this.codPostal = codPostal;

        
        this.email = email;
    }

    /**
     * este metodo realiza la comprovacion del codigo de postal, si no cumples las codiciones 
     * necesarias no se realizara el proceso.
     * 
     * 
     * 
     * @param postalCode
     * @return devuelve un verdadero en el caso de que el codigo postal se compla
     * @since 0.0.5
     */
    public boolean validarCodigoPostal(String postalCode) {
        if (postalCode == null || postalCode.length() != 5) {
            return false;
        }

        for (int i = 0; i < 5; i++) {
            if (!Character.isDigit(postalCode.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    /**este metodo es similar al mencionado @see validarCodigoPostal donde el proceso es similar, pero ahora comprovando
     * que el email este bien
     * @param email
     * @return devuelve verdadero en casa de que el email este bien
     * @since 0.0.2
     */
    public boolean validarEmail(String email) {
        if (email == null || email.length() < 3 || !email.contains("@")) {
            return false;
        }

        int atIndex = email.indexOf("@");
        String localPart = email.substring(0, atIndex);
        String domainPart = email.substring(atIndex + 1);

        if (localPart.isEmpty() || domainPart.length() < 3 || !domainPart.contains(".")) {
            return false;
        }

        return true;
    }


    /* MÉTODOS GET Y SET. NO COMENTAR CON JAVADOC */

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public boolean isSancionado() {
        return sancionado;
    }

    public void setSancionado(boolean sancionado) {
        this.sancionado = sancionado;
    }

    public boolean isDatosValidos() {
        return datosValidos;
    }

    public void setDatosValidos(boolean datosValidos) {
        this.datosValidos = datosValidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
