package day03;

public class Caesar extends Encryption{
    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        StringBuilder temp=new StringBuilder();
        for (char c: input.toCharArray()) {
            temp.append((char)(c+offset));
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        Caesar caesar=new Caesar(5);
        String basicString="Hello-bello!";
        System.out.println("Original: "+basicString);
        System.out.println("Encrypted: "+caesar.encrypts(basicString));
    }
}
