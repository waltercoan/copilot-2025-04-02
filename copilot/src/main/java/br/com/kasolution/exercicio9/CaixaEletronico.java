package br.com.kasolution.exercicio9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaixaEletronico {
    private JFrame frame;
    private Usuario usuarioAtual;

    public CaixaEletronico(Usuario usuario) {
        this.usuarioAtual = usuario;
        criarTelaLogin();
    }

    private void criarTelaLogin() {
        frame = new JFrame("Caixa Eletrônico - Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel labelConta = new JLabel("Conta:");
        JTextField campoConta = new JTextField();
        JLabel labelSenha = new JLabel("Senha:");
        JPasswordField campoSenha = new JPasswordField();

        JButton botaoLogin = new JButton("Login");
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String conta = campoConta.getText();
                String senha = new String(campoSenha.getPassword());

                if (usuarioAtual.getConta().getNumeroConta().equals(conta) && usuarioAtual.autenticar(senha)) {
                    criarTelaPrincipal();
                } else {
                    JOptionPane.showMessageDialog(frame, "Credenciais inválidas!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(labelConta);
        panel.add(campoConta);
        panel.add(labelSenha);
        panel.add(campoSenha);
        panel.add(botaoLogin);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void criarTelaPrincipal() {
        frame.getContentPane().removeAll();
        frame.setTitle("Caixa Eletrônico - Menu Principal");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        JButton botaoSaldo = new JButton("Consultar Saldo");
        botaoSaldo.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Saldo: R$ " + usuarioAtual.getConta().getSaldo()));

        JButton botaoSaque = new JButton("Saque");
        botaoSaque.addActionListener(e -> {
            String valor = JOptionPane.showInputDialog(frame, "Digite o valor para saque:");
            if (valor != null && !valor.isEmpty()) {
                double saque = Double.parseDouble(valor);
                if (usuarioAtual.getConta().sacar(saque)) {
                    JOptionPane.showMessageDialog(frame, "Saque realizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Saldo insuficiente!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton botaoDeposito = new JButton("Depósito");
        botaoDeposito.addActionListener(e -> {
            String valor = JOptionPane.showInputDialog(frame, "Digite o valor para depósito:");
            if (valor != null && !valor.isEmpty()) {
                double deposito = Double.parseDouble(valor);
                usuarioAtual.getConta().depositar(deposito);
                JOptionPane.showMessageDialog(frame, "Depósito realizado com sucesso!");
            }
        });

        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(e -> System.exit(0));

        panel.add(botaoSaldo);
        panel.add(botaoSaque);
        panel.add(botaoDeposito);
        panel.add(botaoSair);

        frame.add(panel);
        frame.revalidate();
        frame.repaint();
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345", 1000.0);
        Usuario usuario = new Usuario("João", "senha123", conta);
        new CaixaEletronico(usuario);
    }
}