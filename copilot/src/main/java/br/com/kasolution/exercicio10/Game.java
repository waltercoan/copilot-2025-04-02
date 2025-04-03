package br.com.kasolution.exercicio10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements ActionListener, KeyListener {
    private Board board;
    private Snake snake;
    private boolean isGameOver;
    private Timer timer;
    private static final int CELL_SIZE = 20;
    private static final int TIMER_DELAY = 100;

    public Game(int rows, int cols) {
        board = new Board(rows, cols);
        Cell startCell = board.getCell(rows / 2, cols / 2);
        snake = new Snake(startCell);
        isGameOver = false;
        board.generateFood();

        setPreferredSize(new Dimension(cols * CELL_SIZE, rows * CELL_SIZE));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        timer = new Timer(TIMER_DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Desenha o tabuleiro
        for (int row = 0; row < board.getRows(); row++) {
            for (int col = 0; col < board.getCols(); col++) {
                Cell cell = board.getCell(row, col);
                if (cell.getCellType() == CellType.FOOD) {
                    g.setColor(Color.RED);
                } else if (cell.getCellType() == CellType.SNAKE_NODE) {
                    g.setColor(new Color(144, 238, 144)); // Verde claro
                } else {
                    g.setColor(Color.BLACK); // Tabuleiro preto
                }
                g.fillRect(col * CELL_SIZE, row * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!isGameOver) {
            update();
            repaint();
        } else {
            timer.stop();
            JOptionPane.showMessageDialog(this, "Game Over!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (snake.getDirection() != Direction.DOWN) {
                    snake.setDirection(Direction.UP);
                }
                break;
            case KeyEvent.VK_DOWN:
                if (snake.getDirection() != Direction.UP) {
                    snake.setDirection(Direction.DOWN);
                }
                break;
            case KeyEvent.VK_LEFT:
                if (snake.getDirection() != Direction.RIGHT) {
                    snake.setDirection(Direction.LEFT);
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (snake.getDirection() != Direction.LEFT) {
                    snake.setDirection(Direction.RIGHT);
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Nenhuma ação necessária
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Nenhuma ação necessária
    }

    public void update() {
        System.out.println("Atualizando o jogo...");
        Cell nextCell = getNextCell();
        if (nextCell == null || nextCell.getCellType() == CellType.SNAKE_NODE) {
            isGameOver = true;
            return;
        }

        if (nextCell.getCellType() == CellType.FOOD) {
            snake.grow(nextCell);
            board.generateFood();
        } else {
            snake.move(nextCell);
        }
    }

    private Cell getNextCell() {
        Cell head = snake.getBody().getFirst();
        int newRow = head.getRow();
        int newCol = head.getCol();

        switch (snake.getDirection()) {
            case UP -> newRow--;
            case DOWN -> newRow++;
            case LEFT -> newCol--;
            case RIGHT -> newCol++;
        }

        System.out.println("Nova posição: (" + newRow + ", " + newCol + ")");

        if (newRow < 0 || newRow >= board.getRows() || newCol < 0 || newCol >= board.getCols()) {
            return null; // Fora dos limites
        }

        return board.getCell(newRow, newCol);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        Game game = new Game(20, 20);
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}