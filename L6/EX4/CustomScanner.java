package L6.EX4;
import java.util.Scanner;

public class CustomScanner implements AutoCloseable{
    private Scanner scanner;
    public CustomScanner(){
        this.scanner = new Scanner(System.in);
    }

    public void close(){
        this.scanner.close();
    }

    public Integer nextInt(){
        return Integer.parseInt(this.nextLine());
    }

    public String nextLine(){
        if(this.scanner.hasNextLine()){
            return this.scanner.nextLine();
        }
        System.out.println("Não existem linhas a serem lidas");
        return "";
    }

    public Float nextFloat(){
        return Float.parseFloat(this.nextLine());
    }

    public Double nextDouble(){
        return Double.parseDouble(this.nextLine());
    }

    public Long nextLong(){
        return Long.parseLong(this.nextLine());
    }

    public Boolean nextBoolean(){
        return Boolean.parseBoolean(this.nextLine());
    }

    public Character nextCharacter(){
        return this.scanner.nextLine().charAt(0);
    }
}
