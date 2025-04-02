package br.com.kasolution.exercicio3;

public class Main {

    public static void main(String[] args) {
        // Exemplo de email para validação
        String email = "exemplo@dominio.com";
        
        // Chama o método validarEmail e exibe o resultado
        boolean isValido = validarEmail(email);
        System.out.println("O email \"" + email + "\" é válido? " + isValido);
    }

    /**
     * Valida um endereço de email usando uma expressão regular.
     *
     * @param email O email a ser validado.
     * @return true se o email for válido, false caso contrário.
     */
    public static boolean validarEmail(String email) {
        // Expressão regular para validar email
        String regex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return email != null && email.matches(regex);
    }
}