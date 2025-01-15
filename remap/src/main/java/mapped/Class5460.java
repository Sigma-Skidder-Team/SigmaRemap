// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Class5460 extends Class5419<Class824>
{
    private static String[] field22712;
    private ItemStack field22713;
    private final List<ItemStack> field22714;
    private int field22715;
    private int field22716;
    private int field22717;
    
    public Class5460(final int n, final int n2) {
        super((Map)ImmutableMap.of((Object)Class8233.field33811, (Object)Class1952.field10628), n, n2);
        this.field22714 = Lists.newArrayList();
    }
    
    public boolean method16559(final Class1849 class1849, final Class824 class1850) {
        final Class365<Class824> method2618 = class1850.method2618();
        if (method2618.method1198(Class8233.field33811).isPresent()) {
            final LivingEntity class1851 = method2618.method1198(Class8233.field33811).get();
            if (class1851.getType() == EntityType.field29058) {
                if (class1850.method1768()) {
                    if (class1851.method1768()) {
                        if (!class1850.method2625()) {
                            if (class1850.method1734(class1851) <= 17.0) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    public boolean method16560(final Class1849 class1849, final Class824 class1850, final long n) {
        if (this.method16559(class1849, class1850)) {
            if (this.field22717 > 0) {
                if (class1850.method2618().method1198(Class8233.field33811).isPresent()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        super.method16539(class1849, class1850, n);
        this.method16682(class1850);
        this.field22715 = 0;
        this.field22716 = 0;
        this.field22717 = 40;
    }
    
    public void method16562(final Class1849 class1849, final Class824 class1850, final long n) {
        this.method16678(this.method16682(class1850), class1850);
        if (this.field22714.isEmpty()) {
            class1850.method1803(Class2215.field13600, ItemStack.field34174);
            this.field22717 = Math.min(this.field22717, 40);
        }
        else {
            this.method16683(class1850);
        }
        --this.field22717;
    }
    
    public void method16563(final Class1849 class1849, final Class824 class1850, final long n) {
        super.method16548(class1849, class1850, n);
        class1850.method2618().method1195(Class8233.field33811);
        class1850.method1803(Class2215.field13600, ItemStack.field34174);
        this.field22713 = null;
    }
    
    private void method16678(final LivingEntity class511, final Class824 class512) {
        boolean b = false;
        final ItemStack method2713 = class511.getHeldItemMainhand();
        if (this.field22713 == null || !ItemStack.method27645(this.field22713, method2713)) {
            this.field22713 = method2713;
            b = true;
            this.field22714.clear();
        }
        if (b) {
            if (!this.field22713.method27620()) {
                this.method16680(class512);
                if (!this.field22714.isEmpty()) {
                    this.field22717 = 900;
                    this.method16679(class512);
                }
            }
        }
    }
    
    private void method16679(final Class824 class824) {
        class824.method1803(Class2215.field13600, this.field22714.get(0));
    }
    
    private void method16680(final Class824 class824) {
        for (final Class9017 class825 : class824.method4825()) {
            if (class825.method32297()) {
                continue;
            }
            if (!this.method16681(class825)) {
                continue;
            }
            this.field22714.add(class825.method32283());
        }
    }
    
    private boolean method16681(final Class9017 class9017) {
        return ItemStack.method27645(this.field22713, class9017.method32281()) || ItemStack.method27645(this.field22713, class9017.method32282());
    }
    
    private LivingEntity method16682(final Class824 class824) {
        final Class365<Class824> method2618 = class824.method2618();
        final LivingEntity class825 = method2618.method1198(Class8233.field33811).get();
        method2618.method1196((Class8233<Class6440>)Class8233.field33810, new Class6440(class825));
        return class825;
    }
    
    private void method16683(final Class824 class824) {
        if (this.field22714.size() >= 2) {
            if (++this.field22715 >= 40) {
                ++this.field22716;
                this.field22715 = 0;
                if (this.field22716 > this.field22714.size() - 1) {
                    this.field22716 = 0;
                }
                class824.method1803(Class2215.field13600, this.field22714.get(this.field22716));
            }
        }
    }
}
