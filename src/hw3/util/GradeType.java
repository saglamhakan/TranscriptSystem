package hw3.util;

public enum GradeType {

    A("A", 4),  // Harfe karşılık gelen sayıları tanımladık
    B("B", 3),
    C("C", 2),
    D("D", 1),
    F("F", 0);

    private final String stringValue; //Her sabit harf notunun Stringini temsil etmek için yazıldı.      Enum sınıfı runtime değiştirilemeyeceğinden final tanımladım.
    private final int numericValue;  //Her sabit harf notuna karşılık gelen ayısal notu tanımlar.

    GradeType(String stringValue, int numericValue) {
        this.stringValue = stringValue;
        this.numericValue = numericValue;
    }

    //Değişkenleri final olarak tanımladığımız için setterları kullanamayız.  Numaralandırma türlerinin değiştirilmemesi açısından sadece getterları kullandık.
    public String getStringValue() {
        return stringValue;
    }

    public int getNumericValue() {
        return numericValue;
    }



    @Override
    public String toString() {
        return "Grade " + stringValue + " corresponds to numeric grade " + numericValue + ".";
    }
}
