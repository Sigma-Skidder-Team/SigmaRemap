// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6567 extends Class6564
{
    private static String[] field26078;
    private float field26079;
    private int field26080;
    private final Class853 field26081;
    private boolean field26082;
    
    public Class6567(final Class853 field26081) {
        super(field26081);
        this.field26081 = field26081;
        this.field26079 = 180.0f * field26081.rotationYaw / 3.1415927f;
    }
    
    public void method19913(final float field26079, final boolean field26080) {
        this.field26079 = field26079;
        this.field26082 = field26080;
    }
    
    public void method19914(final double field26070) {
        this.field26070 = field26070;
        this.field26073 = Class2198.field13376;
    }
    
    @Override
    public void method19904() {
        this.field26066.rotationYaw = this.method19909(this.field26066.rotationYaw, this.field26079, 90.0f);
        this.field26066.field2953 = this.field26066.rotationYaw;
        this.field26066.field2951 = this.field26066.rotationYaw;
        if (this.field26073 == Class2198.field13376) {
            this.field26073 = Class2198.field13375;
            if (!this.field26066.onGround) {
                this.field26066.method2733((float)(this.field26070 * this.field26066.method2710(Class8107.field33408).method23950()));
            }
            else {
                this.field26066.method2733((float)(this.field26070 * this.field26066.method2710(Class8107.field33408).method23950()));
                if (this.field26080-- > 0) {
                    this.field26081.field2968 = 0.0f;
                    this.field26081.field2970 = 0.0f;
                    this.field26066.method2733(0.0f);
                }
                else {
                    this.field26080 = this.field26081.method5134();
                    if (this.field26082) {
                        this.field26080 /= 3;
                    }
                    this.field26081.method4149().method22382();
                    if (this.field26081.method5140()) {
                        this.field26081.method1695(this.field26081.method5141(), this.field26081.method2720(), ((this.field26081.method2633().nextFloat() - this.field26081.method2633().nextFloat()) * 0.2f + 1.0f) * 0.8f);
                    }
                }
            }
        }
        else {
            this.field26066.method4162(0.0f);
        }
    }
}
