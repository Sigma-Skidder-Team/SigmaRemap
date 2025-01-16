// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class742 extends Class516<Class3425>
{
    private static final ResourceLocation field4012;
    private final Class806 field4013;
    private float field4014;
    private float field4015;
    
    public Class742(final Class3425 class3425, final Class464 class3426, final Class806 field4013) {
        super(class3425, class3426, field4013.getDisplayName());
        this.field4013 = field4013;
        this.field3155 = false;
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        this.font.method6610(this.field3148.getFormattedText(), 8.0f, 6.0f, 4210752);
        this.font.method6610(this.field3078.getDisplayName().getFormattedText(), 8.0f, (float)(this.field3076 - 96 + 2), 4210752);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.minecraft.method5290().method5849(Class742.field4012);
        final int n4 = (this.width - this.field3075) / 2;
        final int n5 = (this.height - this.field3076) / 2;
        this.method3186(n4, n5, 0, 0, this.field3075, this.field3076);
        if (this.field4013 instanceof Class812) {
            final Class812 class812 = (Class812)this.field4013;
            if (class812.method4780()) {
                this.method3186(n4 + 79, n5 + 17, 0, this.field3076, class812.method4783() * 18, 54);
            }
        }
        if (this.field4013.method4735()) {
            this.method3186(n4 + 7, n5 + 35 - 18, 18, this.field3076 + 54, 18, 18);
        }
        if (this.field4013.method4766()) {
            if (!(this.field4013 instanceof Class815)) {
                this.method3186(n4 + 7, n5 + 35, 0, this.field3076 + 54, 18, 18);
            }
            else {
                this.method3186(n4 + 7, n5 + 35, 36, this.field3076 + 54, 18, 18);
            }
        }
        Class518.method2999(n4 + 51, n5 + 60, 17, n4 + 51 - this.field4014, n5 + 75 - 50 - this.field4015, this.field4013);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.field4014 = (float)n;
        this.field4015 = (float)n2;
        super.method2975(n, n2, n3);
        this.method2977(n, n2);
    }
    
    static {
        field4012 = new ResourceLocation("textures/gui/container/horse.png");
    }
}
