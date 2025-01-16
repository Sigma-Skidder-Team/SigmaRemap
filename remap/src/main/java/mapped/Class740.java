// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class740 extends Class516<Class3424>
{
    private static final ResourceLocation field4010;
    
    public Class740(final Class3424 class3424, final Class464 class3425, final ITextComponent class3426) {
        super(class3424, class3425, class3426);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        super.render(n, n2, n3);
        this.method2977(n, n2);
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        final String method8461 = this.title.getFormattedText();
        this.font.method6610(method8461, (float)(this.field3075 / 2 - this.font.getStringWidth(method8461) / 2), 6.0f, 4210752);
        this.font.method6610(this.field3078.getDisplayName().getFormattedText(), 8.0f, (float)(this.field3076 - 96 + 2), 4210752);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.minecraft.method5290().method5849(Class740.field4010);
        this.blit((this.width - this.field3075) / 2, (this.height - this.field3076) / 2, 0, 0, this.field3075, this.field3076);
    }
    
    static {
        field4010 = new ResourceLocation("textures/gui/container/dispenser.png");
    }
}
