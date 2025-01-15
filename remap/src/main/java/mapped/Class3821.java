// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class3821 extends Class3820
{
    private static String[] field17372;
    private final Class7255 field17373;
    
    public Class3821(final Class7255 field17373, final Class8959 class8959) {
        super(class8959);
        this.field17373 = field17373;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final Class1847 class1847, final Class512 class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        final Class7006 method2716 = Class3820.method11733(class1847, class1848, (this.field17373 != Class7558.field29974) ? Class2191.field13325 : Class2191.field13326);
        if (method2716.method21449() == Class2165.field12880) {
            return Class9355.method34676(method2715);
        }
        if (method2716.method21449() != Class2165.field12881) {
            return Class9355.method34676(method2715);
        }
        final Class7005 class1850 = (Class7005)method2716;
        final BlockPos method2717 = class1850.method21447();
        final Direction method2718 = class1850.method21448();
        final BlockPos method2719 = method2717.method1149(method2718);
        if (!class1847.method6760(class1848, method2717) || !class1848.method2881(method2719, method2718, method2715)) {
            return Class9355.method34677(method2715);
        }
        if (this.field17373 == Class7558.field29974) {
            final Class7096 method2720 = class1847.method6701(method2717);
            if (method2720.method21696() instanceof Class3857) {
                final Class7255 method2721 = ((Class3857)method2720.method21696()).method11922(class1847, method2717, method2720);
                if (method2721 != Class7558.field29974) {
                    class1848.method2859(Class8276.field33981.method8449(this));
                    class1848.method1695(method2721.method22166(Class7324.field28320) ? Class8520.field35054 : Class8520.field35052, 1.0f, 1.0f);
                    final ItemStack method2722 = this.method11754(method2715, class1848, method2721.method22149());
                    if (!class1847.field10067) {
                        Class7770.field31784.method13862((Class513)class1848, new ItemStack(method2721.method22149()));
                    }
                    return Class9355.method34674(method2722);
                }
            }
            return Class9355.method34677(method2715);
        }
        final BlockPos class1851 = (class1847.method6701(method2717).method21696() instanceof Class3867 && this.field17373 == Class7558.field29976) ? method2717 : method2719;
        if (!this.method11755(class1848, class1847, class1851, class1850)) {
            return Class9355.method34677(method2715);
        }
        this.method11753(class1847, method2715, class1851);
        if (class1848 instanceof Class513) {
            Class7770.field31799.method13836((Class513)class1848, class1851, method2715);
        }
        class1848.method2859(Class8276.field33981.method8449(this));
        return Class9355.method34674(this.method11752(method2715, class1848));
    }
    
    public ItemStack method11752(final ItemStack class8321, final Class512 class8322) {
        return class8322.field3025.field27304 ? class8321 : new ItemStack(Class7739.field31349);
    }
    
    public void method11753(final Class1847 class1847, final ItemStack class1848, final BlockPos class1849) {
    }
    
    private ItemStack method11754(final ItemStack class8321, final Class512 class8322, final Class3820 class8323) {
        if (class8322.field3025.field27304) {
            return class8321;
        }
        class8321.method27693(1);
        if (!class8321.method27620()) {
            if (!class8322.field3006.method2362(new ItemStack(class8323))) {
                class8322.method2822(new ItemStack(class8323), false);
            }
            return class8321;
        }
        return new ItemStack(class8323);
    }
    
    public boolean method11755(final Class512 class512, final Class1847 class513, final BlockPos class514, final Class7005 class515) {
        if (this.field17373 instanceof Class7257) {
            final Class7096 method6701 = class513.method6701(class514);
            final Class8059 method6702 = method6701.method21697();
            final boolean method6703 = method6701.method21751(this.field17373);
            if (!method6701.method21706()) {
                if (!method6703) {
                    if (!(method6701.method21696() instanceof Class3867) || !((Class3867)method6701.method21696()).method11920(class513, class514, method6701, this.field17373)) {
                        return class515 != null && this.method11755(class512, class513, class515.method21447().method1149(class515.method21448()), null);
                    }
                }
            }
            if (class513.field10063.method20502() && this.field17373.method22166(Class7324.field28319)) {
                final int method6704 = class514.getX();
                final int method6705 = class514.getY();
                final int method6706 = class514.getZ();
                class513.method6705(class512, class514, Class8520.field35199, Class286.field1582, 0.5f, 2.6f + (class513.field10062.nextFloat() - class513.field10062.nextFloat()) * 0.8f);
                for (int i = 0; i < 8; ++i) {
                    class513.method6709(Class8432.field34632, method6704 + Math.random(), method6705 + Math.random(), method6706 + Math.random(), 0.0, 0.0, 0.0);
                }
            }
            else if (method6701.method21696() instanceof Class3867 && this.field17373 == Class7558.field29976) {
                if (((Class3867)method6701.method21696()).method11921(class513, class514, method6701, ((Class7257)this.field17373).method22177(false))) {
                    this.method11756(class512, class513, class514);
                }
            }
            else {
                if (!class513.field10067) {
                    if (method6703) {
                        if (!method6702.method26438()) {
                            class513.method7149(class514, true);
                        }
                    }
                }
                this.method11756(class512, class513, class514);
                class513.method6688(class514, this.field17373.method22148().method21791(), 11);
            }
            return true;
        }
        return false;
    }
    
    public void method11756(final Class512 class512, final Class1851 class513, final BlockPos class514) {
        class513.method6705(class512, class514, this.field17373.method22166(Class7324.field28320) ? Class8520.field35051 : Class8520.field35049, Class286.field1582, 1.0f, 1.0f);
    }
}
