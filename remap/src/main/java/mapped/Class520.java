// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class520 extends Class516<Class3428> implements Class519
{
    private static final ResourceLocation field3111;
    private static final ResourceLocation field3112;
    private final Class581 field3113;
    private boolean field3114;
    
    public Class520(final Class3428 class3428, final Class464 class3429, final ITextComponent class3430) {
        super(class3428, class3429, class3430);
        this.field3113 = new Class581();
    }
    
    @Override
    public void method2969() {
        super.method2969();
        this.field3114 = (this.field3152 < 379);
        this.field3113.method3415(this.field3152, this.field3153, this.field3150, this.field3114, (Class3426<?>)this.field3077);
        this.field3079 = this.field3113.method3419(this.field3114, this.field3152, this.field3075);
        this.field3149.add(this.field3113);
        this.method3476(this.field3113);
        this.method3029(new Class679(this.field3079 + 5, this.field3153 / 2 - 49, 20, 18, 0, 0, 19, Class520.field3112, class654 -> {
            this.field3113.method3416(this.field3114);
            this.field3113.method3420();
            this.field3079 = this.field3113.method3419(this.field3114, this.field3152, this.field3075);
            ((Class679)class654).method3742(this.field3079 + 5, this.field3153 / 2 - 49);
        }));
    }
    
    @Override
    public void method2992() {
        super.method2992();
        this.field3113.method3426();
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        if (this.field3113.method3421() && this.field3114) {
            this.method2976(n3, n, n2);
            this.field3113.method2975(n, n2, n3);
        }
        else {
            this.field3113.method2975(n, n2, n3);
            super.method2975(n, n2, n3);
            this.field3113.method3431(this.field3079, this.field3080, true, n3);
        }
        this.method2977(n, n2);
        this.field3113.method3428(this.field3079, this.field3080, n, n2);
        this.method3477(this.field3113);
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        this.field3156.method6610(this.field3148.getFormattedText(), 28.0f, 6.0f, 4210752);
        this.field3156.method6610(this.field3078.getDisplayName().getFormattedText(), 8.0f, (float)(this.field3076 - 96 + 2), 4210752);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3150.method5290().method5849(Class520.field3111);
        this.method3186(this.field3079, (this.field3153 - this.field3076) / 2, 0, 0, this.field3075, this.field3076);
    }
    
    @Override
    public boolean method2987(final int n, final int n2, final int n3, final int n4, final double n5, final double n6) {
        if (!this.field3114 || !this.field3113.method3421()) {
            if (super.method2987(n, n2, n3, n4, n5, n6)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        return this.field3113.method2982(n, n2, n3) || (this.field3114 && this.field3113.method3421()) || super.method2982(n, n2, n3);
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
        return this.field3113.method3433(n, n2, this.field3079, this.field3080, this.field3075, this.field3076, n5) && b2;
    }
    
    @Override
    public void method2988(final Class6601 class6601, final int n, final int n2, final Class2133 class6602) {
        super.method2988(class6601, n, n2, class6602);
        this.field3113.method3423(class6601);
    }
    
    @Override
    public void method3000() {
        this.field3113.method3437();
    }
    
    @Override
    public void method2971() {
        this.field3113.method3418();
        super.method2971();
    }
    
    @Override
    public Class581 method3001() {
        return this.field3113;
    }
    
    static {
        field3111 = new ResourceLocation("textures/gui/container/crafting_table.png");
        field3112 = new ResourceLocation("textures/gui/recipe_button.png");
    }
}