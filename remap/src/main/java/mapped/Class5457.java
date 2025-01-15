// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;

import java.util.Optional;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Iterator;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

import java.util.Map;

public class Class5457 extends Class5419<Class824>
{
    private static String[] field22696;
    private static final Map<Class9334, Class1932> field22697;
    private int field22698;
    private boolean field22699;
    private long field22700;
    
    public Class5457(final int n) {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10630, (Object)Class8233.field33810, (Object)Class1952.field10630, (Object)Class8233.field33811, (Object)Class1952.field10630, (Object)Class8233.field33808, (Object)Class1952.field10628), n);
        this.field22698 = 600;
    }
    
    public boolean method16559(final Class1849 class1849, final Class824 class1850) {
        if (!this.method16670(class1850)) {
            return false;
        }
        if (this.field22698 <= 0) {
            return true;
        }
        --this.field22698;
        return false;
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long field22700) {
        this.field22699 = false;
        this.field22700 = field22700;
        final Class512 class1851 = this.method16671(class1850).get();
        class1850.method2618().method1196(Class8233.field33811, class1851);
        Class6793.method20788(class1850, class1851);
    }
    
    public boolean method16560(final Class1849 class1849, final Class824 class1850, final long n) {
        return this.method16670(class1850) && !this.field22699;
    }
    
    public void method16562(final Class1849 class1849, final Class824 class1850, final long n) {
        final Class512 class1851 = this.method16671(class1850).get();
        Class6793.method20788(class1850, class1851);
        if (!this.method16673(class1850, class1851)) {
            Class6793.method20790(class1850, class1851, 5);
        }
        else if (n - this.field22700 > 20L) {
            this.method16668(class1850, class1851);
            this.field22699 = true;
        }
    }
    
    public void method16563(final Class1849 class1849, final Class824 class1850, final long n) {
        this.field22698 = method16674(class1849);
        class1850.method2618().method1195(Class8233.field33811);
        class1850.method2618().method1195(Class8233.field33809);
        class1850.method2618().method1195(Class8233.field33810);
    }
    
    private void method16668(final Class824 class824, final LivingEntity class825) {
        final Iterator<ItemStack> iterator = this.method16669(class824).iterator();
        while (iterator.hasNext()) {
            Class6793.method20791(class824, iterator.next(), class825);
        }
    }
    
    private List<ItemStack> method16669(final Class824 class824) {
        if (class824.method2625()) {
            return (List<ItemStack>)ImmutableList.of((Object)new ItemStack(Class7739.field30853));
        }
        final Class9334 method28781 = class824.method4870().method28781();
        if (!Class5457.field22697.containsKey(method28781)) {
            return (List<ItemStack>)ImmutableList.of((Object)new ItemStack(Class7739.field31314));
        }
        return class824.world.method6679().method1581().method6402(Class5457.field22697.get(method28781)).method34485(new Class9098((Class1849)class824.world).method32877(Class6683.field26367, new BlockPos(class824)).method32877(Class6683.field26362, class824).method32873(class824.method2633()).method32883(Class7104.field27716));
    }
    
    private boolean method16670(final Class824 class824) {
        return this.method16671(class824).isPresent();
    }
    
    private Optional<Class512> method16671(final Class824 class824) {
        return class824.method2618().method1198(Class8233.field33808).filter(this::method16672);
    }
    
    private boolean method16672(final Class512 class512) {
        return class512.method2653(Class9439.field40505);
    }
    
    private boolean method16673(final Class824 class824, final Class512 class825) {
        return new BlockPos(class824).withinDistance(new BlockPos(class825), 5.0);
    }
    
    private static int method16674(final Class1849 class1849) {
        return 600 + class1849.field10062.nextInt(6001);
    }
    
    static {
        field22697 = Class8349.method27851(Maps.newHashMap(), hashMap -> {
            hashMap.put(Class9334.field40061, Class9020.field38121);
            hashMap.put(Class9334.field40062, Class9020.field38122);
            hashMap.put(Class9334.field40063, Class9020.field38123);
            hashMap.put(Class9334.field40064, Class9020.field38124);
            hashMap.put(Class9334.field40065, Class9020.field38125);
            hashMap.put(Class9334.field40066, Class9020.field38126);
            hashMap.put(Class9334.field40067, Class9020.field38127);
            hashMap.put(Class9334.field40068, Class9020.field38128);
            hashMap.put(Class9334.field40069, Class9020.field38129);
            hashMap.put(Class9334.field40070, Class9020.field38130);
            hashMap.put(Class9334.field40072, Class9020.field38131);
            hashMap.put(Class9334.field40073, Class9020.field38132);
            hashMap.put(Class9334.field40074, Class9020.field38133);
        });
    }
}
