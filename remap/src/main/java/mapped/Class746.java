// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

public class Class746 extends Class516<Class3423>
{
    private static final Class1932 field4032;
    private int field4033;
    private final Class669[] field4034;
    private int field4035;
    private boolean field4036;
    
    public Class746(final Class3423 class3423, final Class464 class3424, final ITextComponent class3425) {
        super(class3423, class3424, class3425);
        this.field4034 = new Class669[7];
        this.field3075 = 276;
    }
    
    private void method4061() {
        ((Class3423)this.field3077).method10918(this.field4033);
        ((Class3423)this.field3077).method10927(this.field4033);
        this.field3150.method5269().method17292(new Class4324(this.field4033));
    }
    
    @Override
    public void method2969() {
        super.method2969();
        final int n = (this.field3152 - this.field3075) / 2;
        int n2 = (this.field3153 - this.field3076) / 2 + 16 + 2;
        for (int i = 0; i < 7; ++i) {
            this.field4034[i] = this.method3029(new Class669(this, n + 5, n2, i, class654 -> {
                if (class654 instanceof Class669) {
                    this.field4033 = ((Class669)class654).method3733() + this.field4035;
                    this.method4061();
                }
            }));
            n2 += 20;
        }
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        final int method10922 = ((Class3423)this.field3077).method10922();
        final int n3 = this.field3076 - 94;
        Label_0302: {
            if (method10922 > 0) {
                if (method10922 <= 5) {
                    if (((Class3423)this.field3077).method10932()) {
                        final String method10923 = this.field3148.method8461();
                        final String string = "- " + Class8822.method30773("merchant.level." + method10922, new Object[0]);
                        final int method10924 = this.field3156.method6617(method10923);
                        final int n4 = 49 + this.field3075 / 2 - (method10924 + this.field3156.method6617(string) + 3) / 2;
                        this.field3156.method6610(method10923, (float)n4, 6.0f, 4210752);
                        this.field3156.method6610(this.field3078.getDisplayName().method8461(), 107.0f, (float)n3, 4210752);
                        this.field3156.method6610(string, (float)(n4 + method10924 + 3), 6.0f, 4210752);
                        break Label_0302;
                    }
                }
            }
            final String method10925 = this.field3148.method8461();
            this.field3156.method6610(method10925, (float)(49 + this.field3075 / 2 - this.field3156.method6617(method10925) / 2), 6.0f, 4210752);
            this.field3156.method6610(this.field3078.getDisplayName().method8461(), 107.0f, (float)n3, 4210752);
        }
        final String method10926 = Class8822.method30773("merchant.trades", new Object[0]);
        this.field3156.method6610(method10926, (float)(5 - this.field3156.method6617(method10926) / 2 + 48), 6.0f, 4210752);
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3150.method5290().method5849(Class746.field4032);
        Class565.method3299((this.field3152 - this.field3075) / 2, (this.field3153 - this.field3076) / 2, this.method3303(), 0.0f, 0.0f, this.field3075, this.field3076, 256, 512);
        final Class57 method10931 = ((Class3423)this.field3077).method10931();
        if (!method10931.isEmpty()) {
            final int field4033 = this.field4033;
            if (field4033 < 0 || field4033 >= method10931.size()) {
                return;
            }
            if (method10931.get(field4033).method32297()) {
                this.field3150.method5290().method5849(Class746.field4032);
                Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
                Class565.method3299(this.field3079 + 83 + 99, this.field3080 + 35, this.method3303(), 311.0f, 0.0f, 28, 21, 256, 512);
            }
        }
    }
    
    private void method4062(final int n, final int n2, final Class9017 class9017) {
        this.field3150.method5290().method5849(Class746.field4032);
        final int method10922 = ((Class3423)this.field3077).method10922();
        final int method10923 = ((Class3423)this.field3077).method10919();
        if (method10922 < 5) {
            Class565.method3299(n + 136, n2 + 16, this.method3303(), 0.0f, 186.0f, 102, 5, 256, 512);
            final int method10924 = Class8562.method28787(method10922);
            if (method10923 >= method10924) {
                if (Class8562.method28789(method10922)) {
                    final float n3 = (float)(100 / (Class8562.method28788(method10922) - method10924));
                    final int min = Math.min(MathHelper.method35642(n3 * (method10923 - method10924)), 100);
                    Class565.method3299(n + 136, n2 + 16, this.method3303(), 0.0f, 191.0f, min + 1, 5, 256, 512);
                    final int method10925 = ((Class3423)this.field3077).method10920();
                    if (method10925 > 0) {
                        Class565.method3299(n + 136 + min + 1, n2 + 16 + 1, this.method3303(), 2.0f, 182.0f, Math.min(MathHelper.method35642(method10925 * n3), 100 - min), 3, 256, 512);
                    }
                }
            }
        }
    }
    
    private void method4063(final int n, final int n2, final Class57 class57) {
        final int n3 = class57.size() + 1 - 7;
        if (n3 <= 1) {
            Class565.method3299(n + 94, n2 + 18, this.method3303(), 6.0f, 199.0f, 6, 27, 256, 512);
        }
        else {
            int min = Math.min(113, this.field4035 * (1 + (139 - (27 + (n3 - 1) * 139 / n3)) / n3 + 139 / n3));
            if (this.field4035 == n3 - 1) {
                min = 113;
            }
            Class565.method3299(n + 94, n2 + 18 + min, this.method3303(), 0.0f, 199.0f, 6, 27, 256, 512);
        }
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        super.method2975(n, n2, n3);
        final Class57 method10931 = ((Class3423)this.field3077).method10931();
        if (!method10931.isEmpty()) {
            final int n4 = (this.field3152 - this.field3075) / 2;
            final int n5 = (this.field3153 - this.field3076) / 2;
            int n6 = n5 + 16 + 1;
            final int n7 = n4 + 5 + 5;
            Class8726.method30059();
            Class8726.method30046();
            this.field3150.method5290().method5849(Class746.field4032);
            this.method4063(n4, n5, method10931);
            int n8 = 0;
            for (final Class9017 class9017 : method10931) {
                if (this.method4066(method10931.size()) && (n8 < this.field4035 || n8 >= 7 + this.field4035)) {
                    ++n8;
                }
                else {
                    final ItemStack method10932 = class9017.method32280();
                    final ItemStack method10933 = class9017.method32281();
                    final ItemStack method10934 = class9017.method32282();
                    final ItemStack method10935 = class9017.method32283();
                    this.field3151.field9952 = 100.0f;
                    final int n9 = n6 + 2;
                    this.method4065(method10933, method10932, n7, n9);
                    if (!method10934.method27620()) {
                        this.field3151.method6540(method10934, n4 + 5 + 35, n9);
                        this.field3151.method6542(this.field3156, method10934, n4 + 5 + 35, n9);
                    }
                    this.method4064(class9017, n4, n9);
                    this.field3151.method6540(method10935, n4 + 5 + 68, n9);
                    this.field3151.method6542(this.field3156, method10935, n4 + 5 + 68, n9);
                    this.field3151.field9952 = 0.0f;
                    n6 += 20;
                    ++n8;
                }
            }
            final Class9017 class9018 = method10931.get(this.field4033);
            if (((Class3423)this.field3077).method10932()) {
                this.method4062(n4, n5, class9018);
            }
            if (class9018.method32297()) {
                if (this.method2987(186, 35, 22, 21, n, n2)) {
                    if (((Class3423)this.field3077).method10925()) {
                        this.method3031(Class8822.method30773("merchant.deprecated", new Object[0]), n, n2);
                    }
                }
            }
            for (final Class669 class9019 : this.field4034) {
                if (class9019.method3360()) {
                    class9019.method3362(n, n2);
                }
                class9019.field3432 = (class9019.field3702 < ((Class3423)this.field3077).method10931().size());
            }
            Class8726.method30060();
            Class8726.method30008();
        }
        this.method2977(n, n2);
    }
    
    private void method4064(final Class9017 class9017, final int n, final int n2) {
        Class8726.method30011();
        this.field3150.method5290().method5849(Class746.field4032);
        if (!class9017.method32297()) {
            Class565.method3299(n + 5 + 35 + 20, n2 + 3, this.method3303(), 15.0f, 171.0f, 10, 9, 256, 512);
        }
        else {
            Class565.method3299(n + 5 + 35 + 20, n2 + 3, this.method3303(), 25.0f, 171.0f, 10, 9, 256, 512);
        }
    }
    
    private void method4065(final ItemStack class8321, final ItemStack class8322, final int n, final int n2) {
        this.field3151.method6540(class8321, n, n2);
        if (class8322.method27690() != class8321.method27690()) {
            this.field3151.method6543(this.field3156, class8322, n, n2, (class8322.method27690() != 1) ? null : "1");
            this.field3151.method6543(this.field3156, class8321, n + 14, n2, (class8321.method27690() != 1) ? null : "1");
            this.field3150.method5290().method5849(Class746.field4032);
            this.method3304(this.method3303() + 300);
            Class565.method3299(n + 7, n2 + 12, this.method3303(), 0.0f, 176.0f, 9, 2, 256, 512);
            this.method3304(this.method3303() - 300);
        }
        else {
            this.field3151.method6542(this.field3156, class8321, n, n2);
        }
    }
    
    private boolean method4066(final int n) {
        return n > 7;
    }
    
    @Override
    public boolean method3012(final double n, final double n2, final double n3) {
        final int size = ((Class3423)this.field3077).method10931().size();
        if (this.method4066(size)) {
            final int n4 = size - 7;
            this.field4035 -= (int)n3;
            this.field4035 = MathHelper.method35651(this.field4035, 0, n4);
        }
        return true;
    }
    
    @Override
    public boolean method2984(final double n, final double n2, final int n3, final double n4, final double n5) {
        final int size = ((Class3423)this.field3077).method10931().size();
        if (!this.field4036) {
            return super.method2984(n, n2, n3, n4, n5);
        }
        final int n6 = this.field3080 + 18;
        final int n7 = n6 + 139;
        final int n8 = size - 7;
        this.field4035 = MathHelper.method35651((int)(((float)n2 - n6 - 13.5f) / (n7 - n6 - 27.0f) * n8 + 0.5f), 0, n8);
        return true;
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        this.field4036 = false;
        final int n4 = (this.field3152 - this.field3075) / 2;
        final int n5 = (this.field3153 - this.field3076) / 2;
        if (this.method4066(((Class3423)this.field3077).method10931().size())) {
            if (n > n4 + 94) {
                if (n < n4 + 94 + 6) {
                    if (n2 > n5 + 18) {
                        if (n2 <= n5 + 18 + 139 + 1) {
                            this.field4036 = true;
                        }
                    }
                }
            }
        }
        return super.method2982(n, n2, n3);
    }
    
    static {
        field4032 = new Class1932("textures/gui/container/villager2.png");
    }
}
