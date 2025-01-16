// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

public class Class515 extends Class516<Class3441> implements Class514
{
    private static final ResourceLocation field3072;
    private Class576 field3073;
    
    public Class515(final Class3441 class3441, final Class464 class3442, final ITextComponent class3443) {
        super(class3441, class3442, class3443);
    }
    
    @Override
    public void init() {
        super.init();
        this.minecraft.field4651.method22505(true);
        (this.field3073 = new Class576(this.font, (this.width - this.field3075) / 2 + 62, (this.height - this.field3076) / 2 + 24, 103, 12, Class8822.method30773("container.repair", new Object[0]))).method3408(false);
        this.field3073.changeFocus(true);
        this.field3073.method3402(-1);
        this.field3073.method3403(-1);
        this.field3073.method3401(false);
        this.field3073.method3397(35);
        this.field3073.method3374(this::method2974);
        this.children.add(this.field3073);
        this.field3077.method10873(this);
        this.setFocusedDefault(this.field3073);
    }
    
    @Override
    public void method2970(final Minecraft class869, final int n, final int n2) {
        final String method3378 = this.field3073.method3378();
        this.init(class869, n, n2);
        this.field3073.method3377(method3378);
    }
    
    @Override
    public void removed() {
        super.removed();
        this.minecraft.field4651.method22505(false);
        this.field3077.method10874(this);
    }
    
    @Override
    public boolean keyPressed(final int keyCode, final int n2, final int n3) {
        if (keyCode == 256) {
            this.minecraft.player.method2814();
        }
        return this.field3073.keyPressed(keyCode, n2, n3) || this.field3073.method3394() || super.keyPressed(keyCode, n2, n3);
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        RenderSystem.disableBlend();
        this.font.method6610(this.title.getFormattedText(), 60.0f, 6.0f, 4210752);
        final int method10998 = ((Class3441)this.field3077).method10998();
        if (method10998 > 0) {
            int n3 = 8453920;
            int n4 = 1;
            String s = Class8822.method30773("container.repair.cost", method10998);
            if (method10998 >= 40 && !this.minecraft.player.field3025.field27304) {
                s = Class8822.method30773("container.repair.expensive", new Object[0]);
                n3 = 16736352;
            }
            else if (this.field3077.method10878(2).method20054()) {
                if (!this.field3077.method10878(2).method20061(this.field3078.field2744)) {
                    n3 = 16736352;
                }
            }
            else {
                n4 = 0;
            }
            if (n4 != 0) {
                final int n5 = this.field3075 - 8 - this.font.getStringWidth(s) - 2;
                AbstractGui.fill(n5 - 2, 67, this.field3075 - 8, 79, 1325400064);
                this.font.drawStringWithShadow(s, (float)n5, 69.0f, n3);
            }
        }
    }
    
    private void method2974(final String s) {
        if (!s.isEmpty()) {
            String s2 = s;
            final Class6601 method10878 = this.field3077.method10878(0);
            if (method10878 != null) {
                if (method10878.method20054()) {
                    if (!method10878.method20053().method27667()) {
                        if (s.equals(method10878.method20053().method27664().getString())) {
                            s2 = "";
                        }
                    }
                }
            }
            ((Class3441)this.field3077).method10997(s2);
            this.minecraft.player.field4069.method17292(new Class4362(s2));
        }
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        super.render(n, n2, n3);
        RenderSystem.disableBlend();
        this.field3073.render(n, n2, n3);
        this.method2977(n, n2);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.minecraft.method5290().method5849(Class515.field3072);
        final int n4 = (this.width - this.field3075) / 2;
        final int n5 = (this.height - this.field3076) / 2;
        this.blit(n4, n5, 0, 0, this.field3075, this.field3076);
        this.blit(n4 + 59, n5 + 20, 0, this.field3076 + (this.field3077.method10878(0).method20054() ? 0 : 16), 110, 16);
        if (this.field3077.method10878(0).method20054() || this.field3077.method10878(1).method20054()) {
            if (!this.field3077.method10878(2).method20054()) {
                this.blit(n4 + 99, n5 + 45, this.field3075, 0, 28, 21);
            }
        }
    }
    
    @Override
    public void method2930(final Class3418 class3418, final Class2265<ItemStack> class3419) {
        this.method2928(class3418, 0, class3418.method10878(0).method20053());
    }
    
    @Override
    public void method2928(final Class3418 class3418, final int n, final ItemStack class3419) {
        if (n == 0) {
            this.field3073.method3377(class3419.method27620() ? "" : class3419.method27664().getString());
            this.field3073.method3405(!class3419.method27620());
        }
    }
    
    @Override
    public void method2931(final Class3418 class3418, final int n, final int n2) {
    }
    
    static {
        field3072 = new ResourceLocation("textures/gui/container/anvil.png");
    }
}
