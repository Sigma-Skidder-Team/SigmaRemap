// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6156 extends Class6159
{
    private static String[] field24907;
    private final Class7255 field24908;
    
    private Class6156(final Class1847 class1847, final double n, final double n2, final double n3, final Class7255 field24908) {
        super(class1847, n, n2, n3);
        this.method18440(0.01f, 0.01f);
        this.field24952 = 0.06f;
        this.field24908 = field24908;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25659;
    }
    
    @Override
    public int method18419(final float n) {
        return this.field24908.method22166(Class7324.field28320) ? 240 : super.method18419(n);
    }
    
    @Override
    public void method18420() {
        this.field24933 = this.field24936;
        this.field24934 = this.field24937;
        this.field24935 = this.field24938;
        this.method18421();
        if (!this.field24946) {
            this.field24940 -= this.field24952;
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.method18422();
            if (!this.field24946) {
                this.field24939 *= 0.9800000190734863;
                this.field24940 *= 0.9800000190734863;
                this.field24941 *= 0.9800000190734863;
                final BlockPos class354 = new BlockPos(this.field24936, this.field24937, this.field24938);
                final Class7099 method6702 = this.field24932.method6702(class354);
                if (method6702.method21779() == this.field24908) {
                    if (this.field24937 < class354.getY() + method6702.method21782(this.field24932, class354)) {
                        this.method18439();
                    }
                }
            }
        }
    }
    
    public void method18421() {
        if (this.field24951-- <= 0) {
            this.method18439();
        }
    }
    
    public void method18422() {
    }
}
