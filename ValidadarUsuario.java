public class ValidadarUsuario {

    public static void validarUsuario(
            String nombre,
            int edad,
            String correo,
            double salario)
            throws NombreInvalidoException,
            EdadInvalidaException,
            CorreoInvalidoException,
            SalarioInvalidoException {

        
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new NombreInvalidoException(
                    "El nombre no puede estar vacío.");
        }

        if (nombre.trim().length() < 3) {
            throw new NombreInvalidoException(
                    "El nombre debe contener al menos 3 caracteres.");
        }

        
        if (edad < 18) {
            throw new EdadInvalidaException(
                    "La edad debe ser mayor o igual a 18 años.");
        }

        if (edad > 100) {
            throw new EdadInvalidaException(
                    "La edad debe ser menor o igual a 100 años.");
        }

        
        if (!correo.contains("@") || !correo.contains(".")) {
            throw new CorreoInvalidoException(
                    "El correo electrónico no es válido.");
        }

        
        if (salario <= 0) {
            throw new SalarioInvalidoException(
                    "El salario debe ser mayor que cero.");
        }
    }
}