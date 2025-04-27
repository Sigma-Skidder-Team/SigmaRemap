// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;

import java.util.function.Predicate;

public class Class5464 extends Class5419<LivingEntity>
{
    private static String[] field22724;
    private final EntityType<?> field22725;
    private final int field22726;
    private final Predicate<LivingEntity> field22727;
    private final Predicate<LivingEntity> field22728;
    
    public Class5464(final EntityType<?> field22725, final int n, final Predicate<LivingEntity> field22726, final Predicate<LivingEntity> field22727) {
        super((Map)ImmutableMap.of(Class8233.field33810, Class1952.field10630, Class8233.field33811, Class1952.field10629, (Object)Class8233.field33805, (Object)Class1952.field10628));
        this.field22725 = field22725;
        this.field22726 = n * n;
        this.field22727 = field22727;
        this.field22728 = field22726;
    }
    
    public Class5464(final EntityType<?> class7499, final int n) {
        this(class7499, n, p0 -> true, p0 -> true);
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final LivingEntity class1850) {
        return this.field22728.test(class1850) && this.method16687(class1850).stream().anyMatch((Predicate<? super Object>)this::method16686);
    }
    
    @Override
    public void method16539(final Class1849 class1849, final LivingEntity class1850, final long n) {
        super.method16539(class1849, class1850, n);
        class1850.method2618().method1198(Class8233.field33805).ifPresent(list -> list.stream().filter(class1852 -> class1852.method1734(class1851) <= this.field22726).filter(this::method16686).findFirst().ifPresent(class1854 -> {
            class1853.method1196(Class8233.field33811, class1854);
            class1853.method1196(Class8233.field33810, new Class6440(class1854));
        }));
    }
    
    private boolean method16686(final LivingEntity class511) {
        return this.field22725.equals(class511.getType()) && this.field22727.test(class511);
    }
    
    private List<LivingEntity> method16687(final LivingEntity class511) {
        return class511.method2618().method1198(Class8233.field33805).get();
    }
}
