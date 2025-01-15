// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6185 extends Class6159
{
    private static String[] field24995;
    private final Class7805 field24996;
    
    private Class6185(final Class1847 class1847, final double n, final double n2, final double n3, final double field24939, final double field24940, final double field24941, final Class7805 field24942) {
        super(class1847, n, n2, n3);
        this.field24996 = field24942;
        this.field24951 = 4;
        this.field24952 = 0.008f;
        this.field24939 = field24939;
        this.field24940 = field24940;
        this.field24941 = field24941;
        this.method18429(field24942);
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951) {
            this.field24940 -= this.field24952;
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.method18429(this.field24996);
        }
        else {
            this.method18439();
        }
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25659;
    }
}
