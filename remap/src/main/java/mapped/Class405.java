// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Sets;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

import java.util.Set;

public class Class405 extends Class402
{
    private static final DataParameter<Integer> field2490;
    private Class8061 field2491;
    private final Set<Class1948> field2492;
    private boolean field2493;
    
    public Class405(final EntityType<? extends Class405> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2491 = Class8644.field36250;
        this.field2492 = Sets.newHashSet();
    }
    
    public Class405(final World class1847, final double n, final double n2, final double n3) {
        super(EntityType.field28959, n, n2, n3, class1847);
        this.field2491 = Class8644.field36250;
        this.field2492 = Sets.newHashSet();
    }
    
    public Class405(final World class1847, final LivingEntity class1848) {
        super(EntityType.field28959, class1848, class1847);
        this.field2491 = Class8644.field36250;
        this.field2492 = Sets.newHashSet();
    }
    
    public void method1992(final ItemStack class8321) {
        if (class8321.method27622() != Class7739.field31581) {
            if (class8321.method27622() == Class7739.field31280) {
                this.field2491 = Class8644.field36250;
                this.field2492.clear();
                this.dataManager.set(Class405.field2490, -1);
            }
        }
        else {
            this.field2491 = Class5333.method16474(class8321);
            final List<Class1948> method16468 = Class5333.method16468(class8321);
            if (!method16468.isEmpty()) {
                final Iterator iterator = method16468.iterator();
                while (iterator.hasNext()) {
                    this.field2492.add(new Class1948((Class1948)iterator.next()));
                }
            }
            final int method16469 = method1993(class8321);
            if (method16469 != -1) {
                this.method1998(method16469);
            }
            else {
                this.method1994();
            }
        }
    }
    
    public static int method1993(final ItemStack class8321) {
        final Class51 method27657 = class8321.method27657();
        return (method27657 != null && method27657.method316("CustomPotionColor", 99)) ? method27657.method319("CustomPotionColor") : -1;
    }
    
    private void method1994() {
        this.field2493 = false;
        if (this.field2491 == Class8644.field36250 && this.field2492.isEmpty()) {
            this.dataManager.set(Class405.field2490, -1);
        }
        else {
            this.dataManager.set(Class405.field2490, Class5333.method16473(Class5333.method16466(this.field2491, this.field2492)));
        }
    }
    
    public void method1995(final Class1948 class1948) {
        this.field2492.add(class1948);
        this.method1650().set(Class405.field2490, Class5333.method16473(Class5333.method16466(this.field2491, this.field2492)));
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.dataManager.register(Class405.field2490, -1);
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (!this.world.field10067) {
            if (this.field2472) {
                if (this.field2473 != 0) {
                    if (!this.field2492.isEmpty()) {
                        if (this.field2473 >= 600) {
                            this.world.method6761(this, (byte)0);
                            this.field2491 = Class8644.field36250;
                            this.field2492.clear();
                            this.dataManager.set(Class405.field2490, -1);
                        }
                    }
                }
            }
        }
        else if (!this.field2472) {
            this.method1996(2);
        }
        else if (this.field2473 % 5 == 0) {
            this.method1996(1);
        }
    }
    
    private void method1996(final int n) {
        final int method1997 = this.method1997();
        if (method1997 != -1) {
            if (n > 0) {
                final double n2 = (method1997 >> 16 & 0xFF) / 255.0;
                final double n3 = (method1997 >> 8 & 0xFF) / 255.0;
                final double n4 = (method1997 >> 0 & 0xFF) / 255.0;
                for (int i = 0; i < n; ++i) {
                    this.world.method6709(Class8432.field34617, this.method1940(0.5), this.method1943(), this.method1947(0.5), n2, n3, n4);
                }
            }
        }
    }
    
    public int method1997() {
        return this.dataManager.get(Class405.field2490);
    }
    
    private void method1998(final int i) {
        this.field2493 = true;
        this.dataManager.set(Class405.field2490, i);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        if (this.field2491 != Class8644.field36250) {
            if (this.field2491 != null) {
                class51.method306("Potion", Class90.field212.method503(this.field2491).toString());
            }
        }
        if (this.field2493) {
            class51.method298("Color", this.method1997());
        }
        if (!this.field2492.isEmpty()) {
            final Class52 class52 = new Class52();
            final Iterator<Class1948> iterator = this.field2492.iterator();
            while (iterator.hasNext()) {
                ((AbstractList<Class51>)class52).add(iterator.next().method7916(new Class51()));
            }
            class51.method295("CustomPotionEffects", class52);
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method316("Potion", 8)) {
            this.field2491 = Class5333.method16475(class51);
        }
        final Iterator<Class1948> iterator = Class5333.method16469(class51).iterator();
        while (iterator.hasNext()) {
            this.method1995(iterator.next());
        }
        if (!class51.method316("Color", 99)) {
            this.method1994();
        }
        else {
            this.method1998(class51.method319("Color"));
        }
    }
    
    @Override
    public void method1970(final LivingEntity class511) {
        super.method1970(class511);
        for (final Class1948 class512 : this.field2491.method26449()) {
            class511.method2655(new Class1948(class512.method7906(), Math.max(class512.method7907() / 8, 1), class512.method7908(), class512.method7909(), class512.method7910()));
        }
        if (!this.field2492.isEmpty()) {
            final Iterator<Class1948> iterator2 = this.field2492.iterator();
            while (iterator2.hasNext()) {
                class511.method2655(iterator2.next());
            }
        }
    }
    
    @Override
    public ItemStack method1974() {
        if (this.field2492.isEmpty() && this.field2491 == Class8644.field36250) {
            return new ItemStack(Class7739.field31280);
        }
        final ItemStack class8321 = new ItemStack(Class7739.field31581);
        Class5333.method16476(class8321, this.field2491);
        Class5333.method16477(class8321, this.field2492);
        if (this.field2493) {
            class8321.method27658().method298("CustomPotionColor", this.method1997());
        }
        return class8321;
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 0) {
            super.method1798(b);
        }
        else {
            final int method1997 = this.method1997();
            if (method1997 != -1) {
                final double n = (method1997 >> 16 & 0xFF) / 255.0;
                final double n2 = (method1997 >> 8 & 0xFF) / 255.0;
                final double n3 = (method1997 >> 0 & 0xFF) / 255.0;
                for (int i = 0; i < 20; ++i) {
                    this.world.method6709(Class8432.field34617, this.method1940(0.5), this.method1943(), this.method1947(0.5), n, n2, n3);
                }
            }
        }
    }
    
    static {
        field2490 = EntityDataManager.method33564(Class405.class, Class7709.field30654);
    }
}
