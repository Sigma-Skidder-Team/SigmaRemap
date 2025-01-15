// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6201 extends Class6197
{
    private static String[] field25023;
    private boolean field25024;
    private boolean field25025;
    private final Class1793 field25026;
    private float field25027;
    private float field25028;
    private float field25029;
    private boolean field25030;
    
    private Class6201(final Class1847 class1847, final double n, final double n2, final double n3, final double field24939, final double field24940, final double field24941, final Class1793 field24942, final Class7805 class1848) {
        super(class1847, n, n2, n3, class1848, -0.004f);
        this.field24939 = field24939;
        this.field24940 = field24940;
        this.field24941 = field24941;
        this.field25026 = field24942;
        this.field24930 *= 0.75f;
        this.field24951 = 48 + this.field24949.nextInt(12);
        this.method18429(class1848);
    }
    
    public void method18458(final boolean field25024) {
        this.field25024 = field25024;
    }
    
    public void method18459(final boolean field25025) {
        this.field25025 = field25025;
    }
    
    @Override
    public void method18432(final Class4150 class4150, final Class6092 class4151, final float n) {
        if (this.field25025) {
            if (this.field24950 >= this.field24951 / 3) {
                if ((this.field24950 + this.field24951) / 3 % 2 != 0) {
                    return;
                }
            }
        }
        super.method18432(class4150, class4151, n);
    }
    
    @Override
    public void method18420() {
        super.method18420();
        if (this.field25024) {
            if (this.field24950 < this.field24951 / 2) {
                if ((this.field24950 + this.field24951) % 2 == 0) {
                    final Class6201 class6201 = new Class6201(this.field24932, this.field24936, this.field24937, this.field24938, 0.0, 0.0, 0.0, this.field25026, this.field25013);
                    class6201.method18436(0.99f);
                    class6201.method18435(this.field24953, this.field24954, this.field24955);
                    class6201.field24950 = class6201.field24951 / 2;
                    if (this.field25030) {
                        class6201.field25030 = true;
                        class6201.field25027 = this.field25027;
                        class6201.field25028 = this.field25028;
                        class6201.field25029 = this.field25029;
                    }
                    class6201.field25025 = this.field25025;
                    this.field25026.method6480(class6201);
                }
            }
        }
    }
}
