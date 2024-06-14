package codigo;

/**
 *
 * @author idel2
 * @version 1.3
 */
public class EjemplarLibro {

    private String isbn;

    private String titulo;

    private String nombreAutor;

    private int anyoPublicacion;

    public EjemplarLibro(String isbn, String titulo, String nombreAutor, int anyoPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.anyoPublicacion = anyoPublicacion;
    }

    /**
     * Metodo para validar el isbn
     * @param isbn
     * @return true si el isbn es valido y false si no es valido
     */
    public static boolean isValidISBN(String isbn) {
        if (isbn == null) {
            return false;
        }

        if(isbn.contains("-"))
            isbn = isbn.replace("-", "").replace(" ", "");

        try {
            int total = 0;
            for (int i = 0; i < 9; i++) {
                int digit = Integer.parseInt(String.valueOf(isbn.charAt(i)));
                total += (digit * (i + 1));
            }

            String checkDigit = isbn.substring(9);
            if (checkDigit.equals("X")) {
                total += 10 * 10;
            } else {
                total += Integer.parseInt(checkDigit) * 10;
            }

            return total % 11 == 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /* MÉTODOS GET Y SET. NO COMENTAR CON JAVADOC */



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }
}
