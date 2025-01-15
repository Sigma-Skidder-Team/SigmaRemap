// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3636 extends Class3634
{
    private static String[] field16873;
    private float field16874;
    private float field16875;
    private float field16876;
    private float field16877;
    public final /* synthetic */ Class851 field16871;
    
    private Class3636(final Class851 field16871) {
        this.field16871 = field16871;
        super(field16871);
    }
    
    @Override
    public boolean method11013() {
        return this.field16871.method4152() == null || Class851.method5091(this.field16871) == Class2129.field12430;
    }
    
    @Override
    public void method11015() {
        this.field16875 = 5.0f + Class851.method5092(this.field16871).nextFloat() * 10.0f;
        this.field16876 = -4.0f + Class851.method5093(this.field16871).nextFloat() * 9.0f;
        this.field16877 = (Class851.method5094(this.field16871).nextBoolean() ? 1.0f : -1.0f);
        this.method11168();
    }
    
    @Override
    public void method11016() {
        if (Class851.method5095(this.field16871).nextInt(350) == 0) {
            this.field16876 = -4.0f + Class851.method5096(this.field16871).nextFloat() * 9.0f;
        }
        if (Class851.method5097(this.field16871).nextInt(250) == 0) {
            ++this.field16875;
            if (this.field16875 > 15.0f) {
                this.field16875 = 5.0f;
                this.field16877 = -this.field16877;
            }
        }
        if (Class851.method5098(this.field16871).nextInt(450) == 0) {
            this.field16874 = Class851.method5099(this.field16871).nextFloat() * 2.0f * 3.1415927f;
            this.method11168();
        }
        if (this.method11167()) {
            this.method11168();
        }
        if (Class851.method5090(this.field16871).field22771 < this.field16871.method1941()) {
            if (!this.field16871.field2391.method6961(new Class354(this.field16871).method1140(1))) {
                this.field16876 = Math.max(1.0f, this.field16876);
                this.method11168();
            }
        }
        if (Class851.method5090(this.field16871).field22771 > this.field16871.method1941()) {
            if (!this.field16871.field2391.method6961(new Class354(this.field16871).method1138(1))) {
                this.field16876 = Math.min(-1.0f, this.field16876);
                this.method11168();
            }
        }
    }
    
    private void method11168() {
        if (Class354.field2173.equals(Class851.method5100(this.field16871))) {
            Class851.method5101(this.field16871, new Class354(this.field16871));
        }
        this.field16874 += this.field16877 * 15.0f * 0.017453292f;
        Class851.method5102(this.field16871, new Class5487(Class851.method5100(this.field16871)).method16744(this.field16875 * Class9546.method35639(this.field16874), -4.0f + this.field16876, this.field16875 * Class9546.method35638(this.field16874)));
    }
}
