import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JiRung extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1L;

    private int snakeX = 10;
    private int snakeY = 10;
    private int foodX = (int) (Math.random() * 20);
    private int foodY = (int) (Math.random() * 20);
    private int direction = KeyEvent.VK_RIGHT; // Initial direction: right

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setFocusable(true);
        panel.addKeyListener(this);
        getContentPane().add(panel);

        setVisible(true);

        // Game loop
        while (true) {
            moveSnake();
            checkCollision();
            checkFood();
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void moveSnake() {
        switch (direction) {
            case KeyEvent.VK_UP:
                snakeY--;
                break;
            case KeyEvent.VK_DOWN:
                snakeY++;
                break;
            case KeyEvent.VK_LEFT:
                snakeX--;
                break;
            case KeyEvent.VK_RIGHT:
                snakeX++;
                break;
        }
    }

    private void checkCollision() {
        if (snakeX < 0 || snakeY < 0 || snakeX >= getWidth() / 20 || snakeY >= getHeight() / 20) {
            System.out.println("Game Over!");
            System.exit(0);
        }
    }

    private void checkFood() {
        if (snakeX == foodX && snakeY == foodY) {
            // Generate new food location
            foodX = (int) (Math.random() * 20);
            foodY = (int) (Math.random() * 20);
            System.out.println("Yummy!");
        }
    }

    @Override
    public void paint(java.awt.Graphics g) {
        super.paint(g);
        g.clearRect(0, 0, getWidth(), getHeight());
        g.fillRect(snakeX * 20, snakeY * 20, 20, 20); // Snake
        g.fillRect(foodX * 20, foodY * 20, 20, 20); // Food
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int newDirection = e.getKeyCode();

        // Check if the new direction is opposite to the current direction
        if ((newDirection == KeyEvent.VK_UP && direction != KeyEvent.VK_DOWN)
                || (newDirection == KeyEvent.VK_DOWN && direction != KeyEvent.VK_UP)
                || (newDirection == KeyEvent.VK_LEFT && direction != KeyEvent.VK_RIGHT)
                || (newDirection == KeyEvent.VK_RIGHT && direction != KeyEvent.VK_LEFT)) {
            direction = newDirection;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        new SnakeGame();
    }
}