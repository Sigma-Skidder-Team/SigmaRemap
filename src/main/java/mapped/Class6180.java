// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6180 extends Class6159
{
    private static String[] field24981;
    private final Class7805 field24982;
    
    private Class6180(final Class1847 class1847, final double n, final double n2, final double n3, final double n4, final Class7805 field24982) {
        super(class1847, n, n2, n3, 0.0, 0.0, 0.0);
        this.field24982 = field24982;
        this.field24951 = 4;
        final float field24983 = this.field24949.nextFloat() * 0.6f + 0.4f;
        this.field24953 = field24983;
        this.field24954 = field24983;
        this.field24955 = field24983;
        this.field24930 = 1.0f - (float)n4 * 0.5f;
        this.method18429(field24982);
    }
    
    @Override
    public int method18419(final float n) {
        return 15728880;
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        if (this.field24950++ < this.field24951) {
            this.method18429(this.field24982);
        }
        else {
            this.method18439();
        }
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25661;
    }
}
