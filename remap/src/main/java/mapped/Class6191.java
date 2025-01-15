// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6191 extends Class6159
{
    private static String[] field25005;
    
    public Class6191(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(class1847, n, n2, n3, 0.0, 0.0, 0.0);
        this.field24939 *= 0.30000001192092896;
        this.field24940 = Math.random() * 0.20000000298023224 + 0.10000000149011612;
        this.field24941 *= 0.30000001192092896;
        this.method18440(0.01f, 0.01f);
        this.field24952 = 0.06f;
        this.field24951 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
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
        if (this.field24951-- > 0) {
            this.field24940 -= this.field24952;
            this.method18431(this.field24939, this.field24940, this.field24941);
            this.field24939 *= 0.9800000190734863;
            this.field24940 *= 0.9800000190734863;
            this.field24941 *= 0.9800000190734863;
            if (this.field24943) {
                if (Math.random() < 0.5) {
                    this.method18439();
                }
                this.field24939 *= 0.699999988079071;
                this.field24941 *= 0.699999988079071;
            }
            final BlockPos class354 = new BlockPos(this.field24936, this.field24937, this.field24938);
            final double max = Math.max(this.field24932.method6701(class354).method21727(this.field24932, class354).method24547(Axis.Y, this.field24936 - class354.getX(), this.field24938 - class354.getZ()), this.field24932.method6702(class354).method21782(this.field24932, class354));
            if (max > 0.0) {
                if (this.field24937 < class354.getY() + max) {
                    this.method18439();
                }
            }
        }
        else {
            this.method18439();
        }
    }
}
