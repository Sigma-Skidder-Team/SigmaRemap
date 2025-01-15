// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Class1796 implements Class1657
{
    public static final Class1932 field9950;
    private static final Set<Item> field9951;
    public float field9952;
    private final Class7264 field9953;
    private final Class1663 field9954;
    private final Class6457 field9955;
    public Class1790 field9956;
    private boolean field9957;
    private boolean field9958;
    private static boolean field9959;
    
    public Class1796(final Class1663 field9954, final Class1790 field9955, final Class6457 field9956) {
        this.field9956 = null;
        this.field9957 = false;
        this.field9958 = false;
        this.field9954 = field9954;
        this.field9956 = field9955;
        if (!Class9570.field41370.method22619()) {
            this.field9953 = new Class7264(field9955);
        }
        else {
            this.field9953 = (Class7264)Class9570.method35842(Class9570.field41370, this.field9956);
        }
        for (final Item class3820 : Class90.field211) {
            if (Class1796.field9951.contains(class3820)) {
                continue;
            }
            this.field9953.method22209(class3820, new Class1933(Class90.field211.method503(class3820), "inventory"));
        }
        this.field9955 = field9956;
    }
    
    public Class7264 method6529() {
        return this.field9953;
    }
    
    public void method6530(final Class6313 class6313, final ItemStack class6314, final int n, final int n2, final Class7351 class6315, final Class4150 class6316) {
        final boolean method6354 = Class8571.method29001().method6354();
        final boolean b = Class8571.method28928() && method6354;
        if (b) {
            class6316.method12412(Class9484.field40759);
        }
        final Random random = new Random();
        for (final Direction class6317 : Direction.VALUES) {
            random.setSeed(42L);
            this.method6533(class6315, class6316, class6313.method18691(null, class6317, random), class6314, n, n2);
        }
        random.setSeed(42L);
        this.method6533(class6315, class6316, class6313.method18691(null, null, random), class6314, n, n2);
        if (b) {
            class6316.method12412(null);
            Class8933.method31666();
        }
    }
    
    public void method6531(final ItemStack class8321, final Class2016 class8322, final boolean b, final Class7351 class8323, final Class7807 class8324, final int n, final int n2, Class6313 class8325) {
        if (!class8321.method27620()) {
            class8323.method22567();
            final boolean b2 = class8322 == Class2016.field11492;
            boolean b3 = false;
            Label_0066: {
                if (!b2) {
                    if (class8322 != Class2016.field11493) {
                        if (class8322 != Class2016.field11494) {
                            b3 = false;
                            break Label_0066;
                        }
                    }
                }
                b3 = true;
            }
            final boolean b4 = b3;
            if (class8321.getItem() == Items.field31607) {
                if (b4) {
                    class8325 = this.field9953.method22210().method6451(new Class1933("minecraft:trident#inventory"));
                }
            }
            if (!Class9570.field41287.method22605()) {
                class8325.method18697().method23402(class8322).method19105(b, class8323);
            }
            else {
                class8325 = (Class6313)Class9570.field41287.method22608(class8323, class8325, class8322, b);
            }
            class8323.method22564(-0.5, -0.5, -0.5);
            if (!class8325.method18695() && (class8321.getItem() != Items.field31607 || b4)) {
                final Class6332 method25826 = Class7969.method25826(class8321);
                Class6332 method25827;
                if (b2 && Objects.equals(method25826, Class8752.method30265())) {
                    method25827 = Class8752.method30266();
                }
                else {
                    method25827 = method25826;
                }
                final Class4150 method25828 = method6532(class8324, method25827, true, class8321.method27671());
                if (Class8571.method28987()) {
                    class8325 = Class9404.method34966(class8321, class8325, Class9168.field38843, false);
                    Class9168.field38843 = null;
                }
                this.field9957 = false;
                this.method6530(class8325, class8321, n, n2, class8323, method25828);
                if (this.field9957) {
                    final float field37574 = Class8933.field37574;
                    final float field37575 = Class8933.field37575;
                    Class8933.method31566(33986, 240.0f, field37575);
                    this.field9958 = true;
                    this.method6530(class8325, class8321, n, n2, class8323, method25828);
                    this.field9958 = false;
                    Class8933.method31566(33986, field37574, field37575);
                }
            }
            else if (!Class9570.field41327.method22605()) {
                Class9388.field40282.method34897(class8321, class8323, class8324, n, n2);
            }
            else {
                ((Class9388)Class9570.method35826(class8321.getItem(), Class9570.field41327, new Object[0])).method34897(class8321, class8323, class8324, n, n2);
            }
            class8323.method22568();
        }
    }
    
    public static Class4150 method6532(final Class7807 class7807, final Class6332 class7808, final boolean b, final boolean b2) {
        return b2 ? Class9343.method34633(class7807.method25214(b ? Class6332.method18784() : Class6332.method18785()), class7807.method25214(class7808)) : class7807.method25214(class7808);
    }
    
    private void method6533(final Class7351 class7351, final Class4150 class7352, final List<Class8754> list, final ItemStack class7353, final int n, final int n2) {
        final boolean b = !class7353.method27620();
        final Class8996 method22569 = class7351.method22569();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final Class8754 class7354 = list.get(i);
            int method22570 = -1;
            if (b) {
                if (class7354.method30292()) {
                    method22570 = this.field9955.method19307(class7353, class7354.method30293());
                }
            }
            final float n3 = (method22570 >> 16 & 0xFF) / 255.0f;
            final float n4 = (method22570 >> 8 & 0xFF) / 255.0f;
            final float n5 = (method22570 & 0xFF) / 255.0f;
            if (!Class9570.field41282.method22623()) {
                class7352.method12442(method22569, class7354, n3, n4, n5, n, n2);
            }
            else {
                class7352.method12450(method22569, class7354, n3, n4, n5, n, n2, true);
            }
        }
    }
    
    public Class6313 method6534(final ItemStack class8321, final World class8322, final LivingEntity class8323) {
        final Item method27622 = class8321.getItem();
        Class6313 class8324;
        if (method27622 != Items.field31607) {
            class8324 = this.field9953.method22206(class8321);
        }
        else {
            class8324 = this.field9953.method22210().method6451(new Class1933("minecraft:trident_in_hand#inventory"));
        }
        return method27622.method11701() ? this.method6535(class8324, class8321, class8322, class8323) : class8324;
    }
    
    private Class6313 method6535(final Class6313 class6313, final ItemStack class6314, final World class6315, final LivingEntity class6316) {
        Class6313 method33469 = null;
        if (class6313 != null) {
            final Class9168 method33470 = class6313.method18698();
            if (method33470 != null) {
                method33469 = method33470.method33469(class6313, class6314, class6315, class6316);
            }
        }
        return (method33469 != null) ? method33469 : this.field9953.method22210().method6452();
    }
    
    public void method6536(final ItemStack class8321, final Class2016 class8322, final int n, final int n2, final Class7351 class8323, final Class7807 class8324) {
        this.method6537(null, class8321, class8322, false, class8323, class8324, null, n, n2);
    }
    
    public void method6537(final LivingEntity class511, final ItemStack class512, final Class2016 class513, final boolean b, final Class7351 class514, final Class7807 class515, final World class516, final int n, final int n2) {
        if (!class512.method27620()) {
            this.method6531(class512, class513, b, class514, class515, n, n2, this.method6534(class512, class516, class511));
        }
    }
    
    public void method6538(final ItemStack class8321, final int n, final int n2) {
        this.method6539(class8321, n, n2, this.method6534(class8321, null, null));
    }
    
    public void method6539(final ItemStack class8321, final int n, final int n2, Class6313 method34966) {
        Class1796.field9959 = true;
        Class8726.method30059();
        this.field9954.method5849(Class1774.field9853);
        this.field9954.method5853(Class1774.field9853).method5868(false, false);
        Class8726.method30046();
        Class8726.method29999();
        Class8726.method30118();
        Class8726.method30011();
        Class8726.method30013(Class2050.field11693, Class2135.field12460);
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        if (Class8571.method28987()) {
            method34966 = Class9404.method34966(class8321, method34966, Class9168.field38843, true);
        }
        Class8726.method30065((float)n, (float)n2, 100.0f + this.field9952);
        Class8726.method30065(8.0f, 8.0f, 0.0f);
        Class8726.method30063(1.0f, -1.0f, 1.0f);
        Class8726.method30063(16.0f, 16.0f, 16.0f);
        final Class7351 class8322 = new Class7351();
        final Class7808 method34967 = Class869.method5277().method5333().method11006();
        final boolean b = !method34966.method18694();
        if (b) {
            Class8317.method27611();
        }
        this.method6531(class8321, Class2016.field11492, false, class8322, method34967, 15728880, Class1904.field10335, method34966);
        method34967.method25216();
        Class8726.method30008();
        if (b) {
            Class8317.method27612();
        }
        Class8726.method29998();
        Class8726.method30047();
        Class8726.method30060();
        Class1796.field9959 = false;
    }
    
    public void method6540(final ItemStack class8321, final int n, final int n2) {
        this.method6541(Class869.method5277().field4684, class8321, n, n2);
    }
    
    public void method6541(final LivingEntity class511, final ItemStack class512, final int n, final int n2) {
        if (!class512.method27620()) {
            this.field9952 += 50.0f;
            try {
                this.method6539(class512, n, n2, this.method6534(class512, null, class511));
            }
            catch (final Throwable t) {
                final Class7689 method24421 = Class7689.method24421(t, "Rendering item");
                final Class5204 method24422 = method24421.method24418("Item being rendered");
                method24422.method16296("Item Type", () -> String.valueOf(class513.method27622()));
                method24422.method16296("Registry Name", () -> String.valueOf(Class9570.method35826(class514.method27622(), Class9570.field41353, new Object[0])));
                method24422.method16296("Item Damage", () -> String.valueOf(class515.method27632()));
                method24422.method16296("Item NBT", () -> String.valueOf(class516.method27657()));
                method24422.method16296("Item Foil", () -> String.valueOf(class517.method27671()));
                throw new Class2365(method24421);
            }
            this.field9952 -= 50.0f;
        }
    }
    
    public void method6542(final Class1844 class1844, final ItemStack class1845, final int n, final int n2) {
        this.method6543(class1844, class1845, n, n2, null);
    }
    
    public void method6543(final Class1844 class1844, final ItemStack class1845, final int n, final int n2, final String s) {
        if (!class1845.method27620()) {
            final Class7351 class1846 = new Class7351();
            if (class1845.method27690() != 1 || s != null) {
                final String s2 = (s != null) ? s : String.valueOf(class1845.method27690());
                class1846.method22564(0.0, 0.0, this.field9952 + 200.0f);
                final Class7808 method25212 = Class7807.method25212(Class7392.method22694().method22696());
                class1844.method6613(s2, (float)(n + 19 - 2 - class1844.method6617(s2)), (float)(n2 + 6 + 3), 16777215, true, class1846.method22569().method32111(), method25212, false, 0, 15728880);
                method25212.method25216();
            }
            if (Class7667.method24305(class1845)) {
                Class8726.method30007();
                Class8726.method30041();
                Class8726.method29998();
                Class8726.method30012();
                final Class4148 method25213 = Class7392.method22694().method22696();
                final float n3 = (float)class1845.method27632();
                final float n4 = (float)class1845.method27634();
                final float max = Math.max(0.0f, (n4 - n3) / n4);
                int n5 = Math.round(13.0f - n3 * 13.0f / n4);
                int n6 = MathHelper.method35697(max / 3.0f, 1.0f, 1.0f);
                if (Class9570.field41324.method22605()) {
                    if (Class9570.field41328.method22605()) {
                        final double method25214 = Class9570.method35824(class1845.getItem(), Class9570.field41324, class1845);
                        final int method25215 = Class9570.method35821(class1845.getItem(), Class9570.field41328, class1845);
                        n5 = Math.round(13.0f - (float)method25214 * 13.0f);
                        n6 = method25215;
                    }
                }
                if (Class8571.method28945()) {
                    n6 = Class8763.method30349(max, n6);
                }
                this.method6544(method25213, n + 2, n2 + 13, 13, 2, 0, 0, 0, 255);
                this.method6544(method25213, n + 2, n2 + 13, n5, 1, n6 >> 16 & 0xFF, n6 >> 8 & 0xFF, n6 & 0xFF, 255);
                Class8726.method30011();
                Class8726.method29999();
                Class8726.method30040();
                Class8726.method30008();
            }
            final Class756 field4684 = Class869.method5277().field4684;
            final float n7 = (field4684 != null) ? field4684.method2906().method25770(class1845.getItem(), Class869.method5277().method5314()) : 0.0f;
            if (n7 > 0.0f) {
                Class8726.method30007();
                Class8726.method30041();
                Class8726.method30011();
                Class8726.method30117();
                this.method6544(Class7392.method22694().method22696(), n, n2 + MathHelper.method35642(16.0f * (1.0f - n7)), 16, MathHelper.method35649(16.0f * n7), 255, 255, 255, 127);
                Class8726.method30040();
                Class8726.method30008();
            }
        }
    }
    
    private void method6544(final Class4148 class4148, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        class4148.method12390(7, Class9237.field39615);
        class4148.method12432(n + 0, n2 + 0, 0.0).method12399(n5, n6, n7, n8).method12397();
        class4148.method12432(n + 0, n2 + n4, 0.0).method12399(n5, n6, n7, n8).method12397();
        class4148.method12432(n + n3, n2 + n4, 0.0).method12399(n5, n6, n7, n8).method12397();
        class4148.method12432(n + n3, n2 + 0, 0.0).method12399(n5, n6, n7, n8).method12397();
        Class7392.method22694().method22695();
    }
    
    @Override
    public void method5691(final Class6582 class6582) {
        this.field9953.method22211();
    }
    
    public Class2014 method6545() {
        return Class2013.field11448;
    }
    
    static {
        field9950 = new Class1932("textures/misc/enchanted_item_glint.png");
        field9951 = Sets.newHashSet((Object[])new Item[] { Items.AIR});
        Class1796.field9959 = false;
    }
}
