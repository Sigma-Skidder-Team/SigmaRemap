// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class747 extends Class516<Class3422>
{
    private static final ResourceLocation field4037;
    private float field4038;
    private boolean field4039;
    private int field4040;
    private boolean field4041;
    
    public Class747(final Class3422 class3422, final Class464 class3423, final ITextComponent class3424) {
        super(class3422, class3423, class3424);
        class3422.method10910(this::method4076);
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        super.render(n, n2, n3);
        this.method2977(n, n2);
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        this.font.method6610(this.title.getFormattedText(), 8.0f, 4.0f, 4210752);
        this.font.method6610(this.field3078.getDisplayName().getFormattedText(), 8.0f, (float)(this.field3076 - 94), 4210752);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        this.renderBackground();
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.minecraft.method5290().method5849(Class747.field4037);
        final int field3079 = this.field3079;
        final int field3080 = this.field3080;
        this.blit(field3079, field3080, 0, 0, this.field3075, this.field3076);
        this.blit(field3079 + 119, field3080 + 15 + (int)(41.0f * this.field4038), 176 + (this.method4074() ? 0 : 12), 0, 12, 15);
        final int n4 = this.field3079 + 52;
        final int n5 = this.field3080 + 14;
        final int n6 = this.field4040 + 12;
        this.method4072(n2, n3, n4, n5, n6);
        this.method4073(n4, n5, n6);
    }
    
    private void method4072(final int n, final int n2, final int n3, final int n4, final int n5) {
        for (int field4040 = this.field4040; field4040 < n5 && field4040 < ((Class3422)this.field3077).method10906(); ++field4040) {
            final int n6 = field4040 - this.field4040;
            final int n7 = n3 + n6 % 4 * 16;
            final int n8 = n4 + n6 / 4 * 18 + 2;
            int field4041 = this.field3076;
            if (field4040 != ((Class3422)this.field3077).method10904()) {
                if (n >= n7) {
                    if (n2 >= n8) {
                        if (n < n7 + 16) {
                            if (n2 < n8 + 18) {
                                field4041 += 36;
                            }
                        }
                    }
                }
            }
            else {
                field4041 += 18;
            }
            this.blit(n7, n8 - 1, 0, field4041, 16, 18);
        }
    }
    
    private void method4073(final int n, final int n2, final int n3) {
        final List<Class3686> method10905 = ((Class3422)this.field3077).method10905();
        for (int field4040 = this.field4040; field4040 < n3 && field4040 < ((Class3422)this.field3077).method10906(); ++field4040) {
            final int n4 = field4040 - this.field4040;
            this.minecraft.getItemRenderer().method6540(method10905.get(field4040).getRecipeOutput(), n + n4 % 4 * 16, n2 + n4 / 4 * 18 + 2);
        }
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        this.field4039 = false;
        if (this.field4041) {
            final int n4 = this.field3079 + 52;
            final int n5 = this.field3080 + 14;
            for (int n6 = this.field4040 + 12, i = this.field4040; i < n6; ++i) {
                final int n7 = i - this.field4040;
                final double n8 = n - (n4 + n7 % 4 * 16);
                final double n9 = n2 - (n5 + n7 / 4 * 18);
                if (n8 >= 0.0) {
                    if (n9 >= 0.0) {
                        if (n8 < 16.0) {
                            if (n9 < 18.0) {
                                if (((Class3422)this.field3077).method10877(this.minecraft.player, i)) {
                                    Minecraft.method5277().method5299().method6422(Class6836.method20933(Class8520.field35667, 1.0f));
                                    this.minecraft.field4682.method27326(((Class3422)this.field3077).field16154, i);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            final int n10 = this.field3079 + 119;
            final int n11 = this.field3080 + 9;
            if (n >= n10) {
                if (n < n10 + 12) {
                    if (n2 >= n11) {
                        if (n2 < n11 + 54) {
                            this.field4039 = true;
                        }
                    }
                }
            }
        }
        return super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public boolean mouseDragged(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (this.field4039 && this.method4074()) {
            final int n6 = this.field3080 + 14;
            this.field4038 = ((float)n2 - n6 - 7.5f) / (n6 + 54 - n6 - 15.0f);
            this.field4038 = MathHelper.clamp(this.field4038, 0.0f, 1.0f);
            this.field4040 = (int)(this.field4038 * this.method4075() + 0.5) * 4;
            return true;
        }
        return super.mouseDragged(n, n2, n3, n4, n5);
    }
    
    @Override
    public boolean mouseScrolled(final double n, final double n2, final double n3) {
        if (this.method4074()) {
            final int method4075 = this.method4075();
            this.field4038 -= (float)(n3 / method4075);
            this.field4038 = MathHelper.clamp(this.field4038, 0.0f, 1.0f);
            this.field4040 = (int)(this.field4038 * method4075 + 0.5) * 4;
        }
        return true;
    }
    
    private boolean method4074() {
        return this.field4041 && ((Class3422)this.field3077).method10906() > 12;
    }
    
    public int method4075() {
        return (((Class3422)this.field3077).method10906() + 4 - 1) / 4 - 3;
    }
    
    private void method4076() {
        this.field4041 = ((Class3422)this.field3077).method10907();
        if (!this.field4041) {
            this.field4038 = 0.0f;
            this.field4040 = 0;
        }
    }
    
    static {
        field4037 = new ResourceLocation("textures/gui/container/stonecutter.png");
    }
}
