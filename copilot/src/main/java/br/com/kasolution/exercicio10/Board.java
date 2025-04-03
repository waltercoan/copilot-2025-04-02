package br.com.kasolution.exercicio10;

import java.util.Random;

public class Board {
    private int rows;
    private int cols;
    private Cell[][] grid;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = new Cell(i, j);
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Cell getCell(int row, int col) {
        return grid[row][col];
    }

    public Cell generateFood() {
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(rows);
            col = random.nextInt(cols);
        } while (grid[row][col].getCellType() != CellType.EMPTY);
        grid[row][col].setCellType(CellType.FOOD);
        return grid[row][col];
    }
}