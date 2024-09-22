public class ContadorA {
    public int contar(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') count++;
        }
        return count;
    }
}
