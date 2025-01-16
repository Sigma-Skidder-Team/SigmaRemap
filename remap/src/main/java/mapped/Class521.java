// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public abstract class Class521<T extends Class3429> extends Class516<T> implements Class519
{
    private static final ResourceLocation field3115;
    public final Class582 field3116;
    private boolean field3117;
    private final ResourceLocation field3118;
    
    public Class521(final T t, final Class582 field3116, final Class464 class464, final ITextComponent class465, final ResourceLocation field3117) {
        super(t, class464, class465);
        this.field3116 = field3116;
        this.field3118 = field3117;
    }
    
    @Override
    public void init() {
        super.init();
        this.field3117 = (this.width < 379);
        this.field3116.method3415(this.width, this.height, this.minecraft, this.field3117, this.field3077);
        this.field3079 = this.field3116.method3419(this.field3117, this.width, this.field3075);
        this.addButton(new Class679(this.field3079 + 20, this.height / 2 - 49, 20, 18, 0, 0, 19, Class521.field3115, class654 -> {
            this.field3116.method3416(this.field3117);
            this.field3116.method3420();
            this.field3079 = this.field3116.method3419(this.field3117, this.width, this.field3075);
            ((Class679)class654).method3742(this.field3079 + 20, this.height / 2 - 49);
        }));
    }
    
    @Override
    public void tick() {
        super.tick();
        this.field3116.method3426();
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        if (this.field3116.method3421() && this.field3117) {
            this.method2976(n3, n, n2);
            this.field3116.render(n, n2, n3);
        }
        else {
            this.field3116.render(n, n2, n3);
            super.render(n, n2, n3);
            this.field3116.method3431(this.field3079, this.field3080, true, n3);
        }
        this.method2977(n, n2);
        this.field3116.method3428(this.field3079, this.field3080, n, n2);
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
        this.minecraft.method5290().method5849(this.field3118);
        final int field3079 = this.field3079;
        final int field3080 = this.field3080;
        this.blit(field3079, field3080, 0, 0, this.field3075, this.field3076);
        if (this.field3077.method10950()) {
            final int method10949 = this.field3077.method10949();
            this.blit(field3079 + 56, field3080 + 36 + 12 - method10949, 176, 12 - method10949, 14, method10949 + 1);
        }
        this.blit(field3079 + 79, field3080 + 34, 176, 14, this.field3077.method10948() + 1, 16);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        return this.field3116.mouseClicked(n, n2, n3) || (this.field3117 && this.field3116.method3421()) || super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public void method2988(final Class6601 class6601, final int n, final int n2, final Class2133 class6602) {
        super.method2988(class6601, n, n2, class6602);
        this.field3116.method3423(class6601);
    }
    
    @Override
    public boolean keyPressed(final int keyCode, final int n2, final int n3) {
        return !this.field3116.keyPressed(keyCode, n2, n3) && super.keyPressed(keyCode, n2, n3);
    }
    
    @Override
    public boolean method2983(final double n, final double n2, final int n3, final int n4, final int n5) {
        boolean b = false;
        Label_0064: {
            if (n >= n3) {
                if (n2 >= n4) {
                    if (n < n3 + this.field3075) {
                        if (n2 < n4 + this.field3076) {
                            b = false;
                            break Label_0064;
                        }
                    }
                }
            }
            b = true;
        }
        final boolean b2 = b;
        return this.field3116.method3433(n, n2, this.field3079, this.field3080, this.field3075, this.field3076, n5) && b2;
    }
    
    @Override
    public boolean charTyped(final char c, final int n) {
        return this.field3116.charTyped(c, n) || super.charTyped(c, n);
    }
    
    @Override
    public void method3000() {
        this.field3116.method3437();
    }
    
    @Override
    public Class581 method3001() {
        return this.field3116;
    }
    
    @Override
    public void removed() {
        this.field3116.method3418();
        super.removed();
    }
    
    static {
        field3115 = new ResourceLocation("textures/gui/recipe_button.png");
    }
}
