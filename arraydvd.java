package Persewaan;

public class arraydvd {
    public static void main(String[] args) {
        DVD[] d = new DVD[10];
        d[1] = new DVD();
        d[1] = new DVD(1, "Bersamamu", 1, 999999, "Vierra", 1, "PG", 4, "PG", "Musica Studios");
        d[1].print();
    }
}
