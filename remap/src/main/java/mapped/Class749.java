// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

public class Class749 extends Class516<Class3417>
{
    private static final ResourceLocation field4047;
    
    public Class749(final Class3417 class3417, final Class464 class3418, final ITextComponent class3419) {
        super(class3417, class3418, class3419);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        super.render(n, n2, n3);
        this.method2977(n, n2);
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        this.font.method6610(this.title.getFormattedText(), 8.0f, 4.0f, 4210752);
        this.font.method6610(this.field3078.getDisplayName().getFormattedText(), 8.0f, (float)(this.field3076 - 96 + 2), 4210752);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        this.renderBackground();
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.minecraft.method5290().method5849(Class749.field4047);
        final int field3079 = this.field3079;
        final int field3080 = this.field3080;
        this.blit(field3079, field3080, 0, 0, this.field3075, this.field3076);
        final Item method27622 = this.field3077.getSlot(1).method20053().getItem();
        final boolean b = method27622 == Items.field31521;
        final boolean b2 = method27622 == Items.field31369;
        final boolean b3 = method27622 == Items.field30967;
        final ItemStack method27623 = this.field3077.getSlot(0).method20053();
        boolean b4 = false;
        Class6356 method27624;
        if (method27623.getItem() != Items.field31425) {
            method27624 = null;
        }
        else {
            method27624 = Class4094.method12327(method27623, this.minecraft.world);
            if (method27624 != null) {
                if (method27624.field25427) {
                    b4 = true;
                    if (b2 || b3) {
                        this.blit(field3079 + 35, field3080 + 31, this.field3075 + 50, 132, 28, 21);
                    }
                }
                if (b2) {
                    if (method27624.field25425 >= 4) {
                        b4 = true;
                        this.blit(field3079 + 35, field3080 + 31, this.field3075 + 50, 132, 28, 21);
                    }
                }
            }
        }
        this.method4092(method27624, b, b2, b3, b4);
    }
    
    private void method4092(final Class6356 class6356, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        final int field3079 = this.field3079;
        final int field3080 = this.field3080;
        if (b2 && !b4) {
            this.blit(field3079 + 67, field3080 + 13, this.field3075, 66, 66, 66);
            this.method4093(class6356, field3079 + 85, field3080 + 31, 0.226f);
        }
        else if (!b) {
            if (!b3) {
                this.blit(field3079 + 67, field3080 + 13, this.field3075, 0, 66, 66);
                this.method4093(class6356, field3079 + 71, field3080 + 17, 0.45f);
            }
            else {
                this.blit(field3079 + 67, field3080 + 13, this.field3075, 0, 66, 66);
                this.method4093(class6356, field3079 + 71, field3080 + 17, 0.45f);
                this.minecraft.method5290().method5849(Class749.field4047);
                RenderSystem.method30059();
                RenderSystem.method30065(0.0f, 0.0f, 1.0f);
                this.blit(field3079 + 66, field3080 + 12, 0, this.field3076, 66, 66);
                RenderSystem.method30060();
            }
        }
        else {
            this.blit(field3079 + 67 + 16, field3080 + 13, this.field3075, 132, 50, 66);
            this.method4093(class6356, field3079 + 86, field3080 + 16, 0.34f);
            this.minecraft.method5290().method5849(Class749.field4047);
            RenderSystem.method30059();
            RenderSystem.method30065(0.0f, 0.0f, 1.0f);
            this.blit(field3079 + 67, field3080 + 13 + 16, this.field3075, 132, 50, 66);
            this.method4093(class6356, field3079 + 70, field3080 + 32, 0.34f);
            RenderSystem.method30060();
        }
    }
    
    private void method4093(final Class6356 class6356, final int n, final int n2, final float n3) {
        if (class6356 != null) {
            RenderSystem.method30059();
            RenderSystem.method30065((float)n, (float)n2, 1.0f);
            RenderSystem.method30063(n3, n3, 1.0f);
            final IRenderTypeBuffer.Impl method25212 = IRenderTypeBuffer.getImpl(Tessellator.getInstance().getBuffer());
            this.minecraft.field4644.method5822().method7391(new MatrixStack(), method25212, class6356, true, 15728880);
            method25212.finish();
            RenderSystem.method30060();
        }
    }
    
    static {
        field4047 = new ResourceLocation("textures/gui/container/cartography_table.png");
    }
}
