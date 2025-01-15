// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6162 extends Class6159
{
    private static String[] field24915;
    private final Class7805 field24916;
    
    private Class6162(final Class1847 class1847, final double n, final double n2, final double n3, final double field24939, final double field24940, final double field24941, final Class7805 field24942) {
        super(class1847, n, n2, n3, 0.0, 0.0, 0.0);
        this.field24916 = field24942;
        this.field24939 *= 0.30000001192092896;
        this.field24940 = Math.random() * 0.20000000298023224 + 0.10000000149011612;
        this.field24941 *= 0.30000001192092896;
        this.method18440(0.01f, 0.01f);
        this.field24951 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.method18429(field24942);
        this.field24952 = 0.0f;
        this.field24939 = field24939;
        this.field24940 = field24940;
        this.field24941 = field24941;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25659;
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        final int n = 60 - this.field24951;
        if (this.field24951-- > 0) {
            this.field24940 -= this.field24952;
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.field24939 *= 0.9800000190734863;
            this.field24940 *= 0.9800000190734863;
            this.field24941 *= 0.9800000190734863;
            final float n2 = n * 0.001f;
            this.method18440(n2, n2);
            this.method18423(this.field24916.method25209(n % 4, 4));
        }
        else {
            this.method18439();
        }
    }
}
