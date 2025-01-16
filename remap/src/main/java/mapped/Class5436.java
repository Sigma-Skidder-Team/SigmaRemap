// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class Class5436 extends Class5419<Class824>
{
    private static String[] field22638;
    private final Class8233<Class363> field22639;
    private final float field22640;
    private final int field22641;
    private final int field22642;
    private final int field22643;
    
    public Class5436(final Class8233<Class363> field22639, final float field22640, final int field22641, final int field22642, final int field22643) {
        super((Map)ImmutableMap.of((Object)Class8233.field33822, (Object)Class1952.field10630, (Object)Class8233.field33809, (Object)Class1952.field10629, (Object)field22639, (Object)Class1952.field10628));
        this.field22639 = field22639;
        this.field22640 = field22640;
        this.field22641 = field22641;
        this.field22642 = field22642;
        this.field22643 = field22643;
    }
    
    private void method16601(final Class824 class824, final long l) {
        final Class365<Class824> method2618 = class824.method2618();
        class824.method4872(this.field22639);
        method2618.method1195(this.field22639);
        method2618.method1196(Class8233.field33822, l);
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        class1850.method2618().method1198(this.field22639).ifPresent(class1854 -> {
            if (!this.method16602(class1851, class1852)) {
                if (!this.method16603(class1851, class1852, class1854)) {
                    if (!this.method16604(class1851, class1852, class1854)) {
                        class1853.method1196(Class8233.field33809, new Class6949(class1854.method1170(), this.field22640, this.field22641));
                    }
                }
                else {
                    int i = 0;
                    final Vec3d class1855;
                    while (i < 1000) {
                        if (class1855 != null) {
                            if (!this.method16603(class1851, class1852, Class363.method1167(class1852.field2452, new BlockPos(class1855)))) {
                                break;
                            }
                        }
                        Class7775.method24905(class1852, 15, 7, new Vec3d(class1854.method1170()));
                        ++i;
                    }
                    if (i != 1000) {
                        class1853.method1196(Class8233.field33809, new Class6949(class1855, this.field22640, this.field22641));
                    }
                    else {
                        this.method16601(class1852, n2);
                    }
                }
            }
            else {
                this.method16601(class1852, n2);
            }
        });
    }
    
    private boolean method16602(final Class1849 class1849, final Class824 class1850) {
        final Optional<Long> method1198 = class1850.method2618().method1198(Class8233.field33822);
        return method1198.isPresent() && class1849.method6754() - method1198.get() > this.field22643;
    }
    
    private boolean method16603(final Class1849 class1849, final Class824 class1850, final Class363 class1851) {
        return class1851.method1169() != class1849.method6789().getType() || class1851.method1170().manhattanDistance(new BlockPos(class1850)) > this.field22642;
    }
    
    private boolean method16604(final Class1849 class1849, final Class824 class1850, final Class363 class1851) {
        return class1851.method1169() == class1849.method6789().getType() && class1851.method1170().manhattanDistance(new BlockPos(class1850)) <= this.field22641;
    }
}
