// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;
import com.google.common.collect.Sets;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class Class3598 extends Class3446
{
    private static String[] field16755;
    private static final Class7843 field16756;
    private final Class793 field16757;
    private final double field16758;
    private Class512 field16759;
    private int field16760;
    private final Set<Item> field16761;
    
    public Class3598(final Class793 field16757, final double field16758, final Item class3820) {
        this.field16757 = field16757;
        this.field16758 = field16758;
        this.field16761 = Sets.newHashSet((Object[])new Item[] { class3820 });
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16760 <= 0) {
            this.field16759 = this.field16757.world.method7135(Class3598.field16756, this.field16757);
            return this.field16759 != null && (this.method11127(this.field16759.getHeldItemMainhand()) || this.method11127(this.field16759.method2714()));
        }
        --this.field16760;
        return false;
    }
    
    private boolean method11127(final ItemStack class8321) {
        return this.field16761.contains(class8321.getItem());
    }
    
    @Override
    public boolean method11017() {
        return this.method11013();
    }
    
    @Override
    public void method11018() {
        this.field16759 = null;
        this.field16757.method4150().method24733();
        this.field16760 = 100;
    }
    
    @Override
    public void method11016() {
        this.field16757.method4147().method24667(this.field16759, (float)(this.field16757.method4174() + 20), (float)this.field16757.method4173());
        if (this.field16757.method1734(this.field16759) >= 6.25) {
            this.field16757.method4150().method24725(this.field16759, this.field16758);
        }
        else {
            this.field16757.method4150().method24733();
        }
    }
    
    static {
        field16756 = new Class7843().method25337(10.0).method25339().method25338();
    }
}
