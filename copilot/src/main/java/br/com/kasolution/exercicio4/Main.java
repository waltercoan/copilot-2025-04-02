package br.com.kasolution.exercicio4;

public class Main {

    public static void main(String[] args) {
        // Exemplo de CPF para validação
        String cpf = "123.456.789-10";

        
        // Chama o método validarCPF e exibe o resultado
        boolean isValido = validarCPF(cpf);
        System.out.println("O CPF \"" + cpf + "\" é válido? " + isValido);
    }

    /**
     * Valida um CPF usando as regras de validação padrão.
     *
     * @param cpf O CPF a ser validado.
     * @return true se o CPF for válido, false caso contrário.
     */
    public static boolean validarCPF(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("\\D", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais (CPF inválido)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula os dígitos verificadores
        int[] pesos = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int soma = 0;

        // Calcula o primeiro dígito verificador
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * pesos[i];
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito >= 10) {
            primeiroDigito = 0;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        int[] pesos2 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * pesos2[i];
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito >= 10) {
            segundoDigito = 0;
        }

        // Verifica se os dígitos verificadores estão corretos
        return primeiroDigito == Character.getNumericValue(cpf.charAt(9)) &&
               segundoDigito == Character.getNumericValue(cpf.charAt(10));
    }
}
