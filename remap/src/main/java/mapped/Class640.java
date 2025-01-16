// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class640 extends Class623<Class640>
{
    private final Class9455<ResourceLocation> field3639;
    public final /* synthetic */ Class614 field3640;
    
    private Class640(final Class614 field3640, final Class9455<ResourceLocation> field3641) {
        this.field3640 = field3640;
        this.field3639 = field3641;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.field3640.method3297(this.field3640.field3585.field3156, new Class2259("stat." + this.field3639.method35135().toString().replace(':', '.'), new Object[0]).applyTextStyle(TextFormatting.GRAY).getString(), n3 + 2, n2 + 1, (n % 2 != 0) ? 9474192 : 16777215);
        final String method35136 = this.field3639.method35136(Class691.method3867(this.field3640.field3585).method23091(this.field3639));
        this.field3640.method3297(this.field3640.field3585.field3156, method35136, n3 + 2 + 213 - this.field3640.field3585.field3156.method6617(method35136), n2 + 1, (n % 2 != 0) ? 9474192 : 16777215);
    }
}
