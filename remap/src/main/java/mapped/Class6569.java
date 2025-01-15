// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6569 extends Class6564
{
    private static String[] field26085;
    private float field26086;
    public final /* synthetic */ Class851 field26087;
    
    public Class6569(final Class851 field26087, final Class759 class759) {
        this.field26087 = field26087;
        super(class759);
        this.field26086 = 0.1f;
    }
    
    @Override
    public void method19904() {
        if (this.field26087.field2405) {
            final Class851 field26087 = this.field26087;
            field26087.field2399 += 180.0f;
            this.field26086 = 0.1f;
        }
        final float n = (float)(Class851.method5090(this.field26087).field22770 - this.field26087.method1938());
        final float n2 = (float)(Class851.method5090(this.field26087).field22771 - this.field26087.method1941());
        final float n3 = (float)(Class851.method5090(this.field26087).field22772 - this.field26087.method1945());
        final double n4 = 1.0 - Class9546.method35647(n2 * 0.7f) / (double)Class9546.method35640(n * n + n3 * n3);
        final float n5 = (float)(n * n4);
        final float n6 = (float)(n3 * n4);
        final double n7 = Class9546.method35640(n5 * n5 + n6 * n6);
        final double n8 = Class9546.method35640(n5 * n5 + n6 * n6 + n2 * n2);
        final float field26088 = this.field26087.field2399;
        this.field26087.field2399 = Class9546.method35674(Class9546.method35668(this.field26087.field2399 + 90.0f), Class9546.method35668((float)Class9546.method35693(n6, n5) * 57.295776f), 4.0f) - 90.0f;
        this.field26087.field2951 = this.field26087.field2399;
        if (Class9546.method35671(field26088, this.field26087.field2399) >= 3.0f) {
            this.field26086 = Class9546.method35673(this.field26086, 0.2f, 0.025f);
        }
        else {
            this.field26086 = Class9546.method35673(this.field26086, 1.8f, 0.005f * (1.8f / this.field26086));
        }
        final float field26089 = (float)(-(Class9546.method35693(-n2, n7) * 57.2957763671875));
        this.field26087.field2400 = field26089;
        final float n9 = this.field26087.field2399 + 90.0f;
        final double n10 = this.field26086 * Class9546.method35639(n9 * 0.017453292f) * Math.abs(n5 / n8);
        final double n11 = this.field26086 * Class9546.method35638(n9 * 0.017453292f) * Math.abs(n6 / n8);
        final double n12 = this.field26086 * Class9546.method35638(field26089 * 0.017453292f) * Math.abs(n2 / n8);
        final Class5487 method1935 = this.field26087.method1935();
        this.field26087.method1936(method1935.method16743(new Class5487(n10, n12, n11).method16741(method1935).method16748(0.2)));
    }
}
