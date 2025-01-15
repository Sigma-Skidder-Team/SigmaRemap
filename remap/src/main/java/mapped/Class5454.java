// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.List;
import java.util.HashMap;
import java.util.function.Predicate;
import com.google.common.collect.Maps;
import java.util.function.Function;
import java.util.Comparator;
import java.util.Optional;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;

public class Class5454 extends Class5419<Class787>
{
    private static String[] field22690;
    
    public Class5454() {
        super((Map)ImmutableMap.of((Object)Class8233.field33806, (Object)Class1952.field10628, (Object)Class8233.field33809, (Object)Class1952.field10629, (Object)Class8233.field33810, (Object)Class1952.field10630, (Object)Class8233.field33811, (Object)Class1952.field10630));
    }
    
    public boolean method16553(final Class1849 class1849, final Class787 class1850) {
        return class1849.method6790().nextInt(10) == 0 && this.method16653(class1850);
    }
    
    public void method16554(final Class1849 class1849, final Class787 class1850, final long n) {
        final LivingEntity method16650 = this.method16650(class1850);
        if (method16650 == null) {
            final Optional<LivingEntity> method16651 = this.method16646(class1850);
            if (!method16651.isPresent()) {
                this.method16645(class1850).ifPresent(class1852 -> method16644(class1851, class1852));
            }
            else {
                method16644(class1850, method16651.get());
            }
        }
        else {
            this.method16643(class1849, class1850, method16650);
        }
    }
    
    private void method16643(final Class1849 class1849, final Class787 class1850, final LivingEntity class1851) {
        for (int i = 0; i < 10; ++i) {
            final Vec3d method24902 = Class7775.method24902(class1850, 20, 8);
            if (method24902 != null && class1849.method6922(new BlockPos(method24902))) {
                class1850.method2618().method1196(Class8233.field33809, new Class6949(method24902, 0.6f, 0));
                return;
            }
        }
    }
    
    private static void method16644(final Class787 class787, final LivingEntity class788) {
        final Class365<?> method2618 = class787.method2618();
        method2618.method1196(Class8233.field33811, class788);
        method2618.method1196((Class8233<Class6440>)Class8233.field33810, new Class6440(class788));
        method2618.method1196(Class8233.field33809, new Class6949(new Class6440(class788), 0.6f, 1));
    }
    
    private Optional<LivingEntity> method16645(final Class787 class787) {
        return this.method16648(class787).stream().findAny();
    }
    
    private Optional<LivingEntity> method16646(final Class787 class787) {
        return this.method16647(class787).entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).filter(entry -> entry.getValue() > 0 && entry.getValue() <= 5).map((Function<? super Object, ? extends LivingEntity>)Map.Entry::getKey).findFirst();
    }
    
    private Map<LivingEntity, Integer> method16647(final Class787 class787) {
        final HashMap hashMap = Maps.newHashMap();
        this.method16648(class787).stream().filter((Predicate<? super Object>)this::method16651).forEach(class788 -> {
            final Integer n = map.compute(this.method16649(class788), (p0, n2) -> (n2 != null) ? (n2 + 1) : 1);
            return;
        });
        return hashMap;
    }
    
    private List<LivingEntity> method16648(final Class787 class787) {
        return class787.method2618().method1198(Class8233.field33806).get();
    }
    
    private LivingEntity method16649(final LivingEntity class511) {
        return class511.method2618().method1198(Class8233.field33811).get();
    }
    
    @Nullable
    private LivingEntity method16650(final LivingEntity class511) {
        return class511.method2618().method1198(Class8233.field33806).get().stream().filter(class513 -> this.method16652(class512, class513)).findAny().orElse(null);
    }
    
    private boolean method16651(final LivingEntity class511) {
        return class511.method2618().method1198(Class8233.field33811).isPresent();
    }
    
    private boolean method16652(final LivingEntity class511, final LivingEntity class512) {
        return class512.method2618().method1198(Class8233.field33811).filter(class514 -> class514 == class513).isPresent();
    }
    
    private boolean method16653(final Class787 class787) {
        return class787.method2618().method1193(Class8233.field33806);
    }
}
