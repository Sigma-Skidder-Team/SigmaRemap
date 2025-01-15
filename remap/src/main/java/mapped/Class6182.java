// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6182 extends Class6159
{
    private static String[] field24987;
    private final Class7096 field24988;
    private BlockPos field24989;
    private final float field24990;
    private final float field24991;
    
    public Class6182(final Class1847 class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final Class7096 field24988) {
        super(class1847, n, n2, n3, n4, n5, n6);
        this.field24988 = field24988;
        this.method18423(Class869.method5277().method5305().method5787().method35427(field24988));
        this.field24952 = 1.0f;
        this.field24953 = 0.6f;
        this.field24954 = 0.6f;
        this.field24955 = 0.6f;
        this.field24930 /= 2.0f;
        this.field24990 = this.field24949.nextFloat() * 3.0f;
        this.field24991 = this.field24949.nextFloat() * 3.0f;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25658;
    }
    
    public Class6182 method18452(final BlockPos field24989) {
        this.field24989 = field24989;
        if (this.field24988.method21696() != Class7521.field29155) {
            this.method18454(field24989);
            return this;
        }
        return this;
    }
    
    public Class6182 method18453() {
        this.field24989 = new BlockPos(this.field24936, this.field24937, this.field24938);
        if (this.field24988.method21696() != Class7521.field29155) {
            this.method18454(this.field24989);
            return this;
        }
        return this;
    }
    
    public void method18454(final BlockPos class354) {
        final int method25441 = Class869.method5277().method5316().method25441(this.field24988, this.field24932, class354, 0);
        this.field24953 *= (method25441 >> 16 & 0xFF) / 255.0f;
        this.field24954 *= (method25441 >> 8 & 0xFF) / 255.0f;
        this.field24955 *= (method25441 & 0xFF) / 255.0f;
    }
    
    @Override
    public float method18424() {
        return this.field24910.method7499((this.field24990 + 1.0f) / 4.0f * 16.0f);
    }
    
    @Override
    public float method18425() {
        return this.field24910.method7499(this.field24990 / 4.0f * 16.0f);
    }
    
    @Override
    public float method18426() {
        return this.field24910.method7502(this.field24991 / 4.0f * 16.0f);
    }
    
    @Override
    public float method18427() {
        return this.field24910.method7502((this.field24991 + 1.0f) / 4.0f * 16.0f);
    }
    
    @Override
    public int method18419(final float n) {
        final int method18419 = super.method18419(n);
        int method18420 = 0;
        if (this.field24932.method6971(this.field24989)) {
            method18420 = Class1656.method5776(this.field24932, this.field24989);
        }
        return (method18419 != 0) ? method18419 : method18420;
    }
}
