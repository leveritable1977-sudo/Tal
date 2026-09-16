void main() {
    // 1. Skapa de två talen
    int tal1 = 5;
    int tal2 = 12;

    // 2. Plussa ihop dem och spara svaret i en ny variabel
    int summa = tal1 + tal2;

    // 3. Skriv ut resultatet med snygg formatering
    IO.println(String.format("När vi plussar %d och %d blir svaret: %d", tal1, tal2, summa));
}
