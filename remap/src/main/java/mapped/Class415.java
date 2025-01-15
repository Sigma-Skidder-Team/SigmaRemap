// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import org.apache.logging.log4j.Logger;

public class Class415 extends Class414 implements Class407
{
    private static final Class8810<ItemStack> field2521;
    private static final Logger field2522;
    public static final Predicate<Class511> field2523;
    
    public Class415(final EntityType<? extends Class415> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public Class415(final Class1847 class1847, final Class511 class1848) {
        super(EntityType.field29039, class1848, class1847);
    }
    
    public Class415(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(EntityType.field29039, n, n2, n3, class1847);
    }
    
    @Override
    public void method1649() {
        this.method1650().method33565(Class415.field2521, ItemStack.field34174);
    }
    
    @Override
    public ItemStack method2005() {
        final ItemStack class8321 = this.method1650().method33568(Class415.field2521);
        if (class8321.method27622() != Class7739.field31579 && class8321.method27622() != Class7739.field31582) {
            if (this.field2391 == null) {}
            return new ItemStack(Class7739.field31579);
        }
        return class8321;
    }
    
    public void method2022(final ItemStack class8321) {
        this.method1650().method33569(Class415.field2521, class8321.method27641());
    }
    
    @Override
    public float method2018() {
        return 0.05f;
    }
    
    @Override
    public void method2016(final Class7006 class7006) {
        if (!this.field2391.field10067) {
            final ItemStack method2005 = this.method2005();
            final Class8061 method2006 = Class5333.method16474(method2005);
            final List<Class1948> method2007 = Class5333.method16465(method2005);
            final boolean b = method2006 == Class8644.field36251 && method2007.isEmpty();
            if (class7006.method21449() == Class2165.field12881) {
                if (b) {
                    final Class7005 class7007 = (Class7005)class7006;
                    final Direction method2008 = class7007.method21448();
                    final BlockPos method2009 = class7007.method21447().method1149(method2008);
                    this.method2027(method2009, method2008);
                    this.method2027(method2009.method1149(method2008.getOpposite()), method2008);
                    for (final Direction class7008 : Plane.HORIZONTAL) {
                        this.method2027(method2009.method1149(class7008), class7008);
                    }
                }
            }
            if (!b) {
                if (!method2007.isEmpty()) {
                    if (!this.method2026()) {
                        this.method2024(method2007, (class7006.method21449() != Class2165.field12882) ? null : ((Class7007)class7006).method21452());
                    }
                    else {
                        this.method2025(method2005, method2006);
                    }
                }
            }
            else {
                this.method2023();
            }
            this.field2391.method6955(method2006.method26450() ? 2007 : 2002, new BlockPos(this), Class5333.method16471(method2005));
            this.method1652();
        }
    }
    
    private void method2023() {
        final List<Entity> method6739 = this.field2391.method6739((Class<? extends Entity>)Class511.class, this.method1886().method18495(4.0, 2.0, 4.0), (Predicate<? super Entity>)Class415.field2523);
        if (!method6739.isEmpty()) {
            for (final Class511 class511 : method6739) {
                if (this.method1734(class511) >= 16.0) {
                    continue;
                }
                if (!method2028(class511)) {
                    continue;
                }
                class511.method1740(Class7929.method25700(class511, this.method2019()), 1.0f);
            }
        }
    }
    
    private void method2024(final List<Class1948> list, final Entity class399) {
        final List<Entity> method7128 = this.field2391.method7128((Class<? extends Entity>)Class511.class, this.method1886().method18495(4.0, 2.0, 4.0));
        if (!method7128.isEmpty()) {
            for (final Class511 class400 : method7128) {
                if (!class400.method2776()) {
                    continue;
                }
                final double method7129 = this.method1734(class400);
                if (method7129 >= 16.0) {
                    continue;
                }
                double n = 1.0 - Math.sqrt(method7129) / 4.0;
                if (class400 == class399) {
                    n = 1.0;
                }
                for (final Class1948 class401 : list) {
                    final Class5328 method7130 = class401.method7906();
                    if (!method7130.method16453()) {
                        final int n2 = (int)(n * class401.method7907() + 0.5);
                        if (n2 <= 20) {
                            continue;
                        }
                        class400.method2655(new Class1948(method7130, n2, class401.method7908(), class401.method7909(), class401.method7910()));
                    }
                    else {
                        method7130.method16452(this, this.method2019(), class400, class401.method7908(), n);
                    }
                }
            }
        }
    }
    
    private void method2025(final ItemStack class8321, final Class8061 class8322) {
        final Class426 class8323 = new Class426(this.field2391, this.getPosX(), this.getPosY(), this.getPosZ());
        class8323.method2097(this.method2019());
        class8323.method2081(3.0f);
        class8323.method2094(-0.5f);
        class8323.method2096(10);
        class8323.method2095(-class8323.method2082() / class8323.method2092());
        class8323.method2083(class8322);
        final Iterator<Class1948> iterator = Class5333.method16468(class8321).iterator();
        while (iterator.hasNext()) {
            class8323.method2085(new Class1948(iterator.next()));
        }
        final Class51 method27657 = class8321.method27657();
        if (method27657 != null) {
            if (method27657.method316("CustomPotionColor", 99)) {
                class8323.method2087(method27657.method319("CustomPotionColor"));
            }
        }
        this.field2391.method6886(class8323);
    }
    
    private boolean method2026() {
        return this.method2005().method27622() == Class7739.field31582;
    }
    
    private void method2027(final BlockPos class354, final Direction class355) {
        final Class7096 method6701 = this.field2391.method6701(class354);
        final Class3833 method6702 = method6701.method21696();
        if (method6702 != Class7521.field29289) {
            if (method6702 == Class7521.field29818) {
                if (((Class7097<Object, Class7096>)method6701).method21772((Class7111<Boolean>)Class3918.field17760)) {
                    this.field2391.method6839(null, 1009, class354, 0);
                    this.field2391.method6692(class354, ((Class7097<Object, Class7096>)method6701).method21773((Class7111<Comparable>)Class3918.field17760, false));
                }
            }
        }
        else {
            this.field2391.method6725(null, class354.method1149(class355), class355.getOpposite());
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        final ItemStack method27619 = ItemStack.method27619(class51.method327("Potion"));
        if (!method27619.method27620()) {
            this.method2022(method27619);
        }
        else {
            this.method1652();
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        final ItemStack method2005 = this.method2005();
        if (!method2005.method27620()) {
            class51.method295("Potion", method2005.method27627(new Class51()));
        }
    }
    
    private static boolean method2028(final Class511 class511) {
        return class511 instanceof Class850 || class511 instanceof Class849;
    }
    
    static {
        field2521 = Class9184.method33564(Class415.class, Class7709.field30659);
        field2522 = LogManager.getLogger();
        field2523 = Class415::method2028;
    }
}
