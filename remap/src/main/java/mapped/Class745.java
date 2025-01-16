// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class745 extends Class516<Class3435>
{
    private static final ResourceLocation field4031;
    
    public Class745(final Class3435 class3435, final Class464 class3436, final ITextComponent class3437) {
        super(class3435, class3436, class3437);
        ++this.field3076;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.renderBackground();
        super.method2975(n, n2, n3);
        this.method2977(n, n2);
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        this.font.method6610(this.field3148.getFormattedText(), 8.0f, 6.0f, 4210752);
        this.font.method6610(this.field3078.getDisplayName().getFormattedText(), 8.0f, (float)(this.field3076 - 96 + 2), 4210752);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.minecraft.method5290().method5849(Class745.field4031);
        this.method3186((this.width - this.field3075) / 2, (this.height - this.field3076) / 2, 0, 0, this.field3075, this.field3076);
    }
    
    static {
        field4031 = new ResourceLocation("textures/gui/container/shulker_box.png");
    }
}
