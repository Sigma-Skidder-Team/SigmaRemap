// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.Entity;

public class Class5431 extends Class5419<Class787>
{
    private static String[] field22622;
    private final Class8233<? extends Entity> field22623;
    private final float field22624;
    
    public Class5431(final Class8233<? extends Entity> field22623, final float field22624) {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10629, (Object)field22623, (Object)Class1952.field10628));
        this.field22623 = field22623;
        this.field22624 = field22624;
    }
    
    public boolean method16553(final Class1849 class1849, final Class787 class1850) {
        return class1850.method1734((Entity)class1850.method2618().method1198(this.field22623).get()) < 36.0;
    }
    
    public void method16554(final Class1849 class1849, final Class787 class1850, final long n) {
        method16588(class1850, (Entity)class1850.method2618().method1198(this.field22623).get(), this.field22624);
    }
    
    public static void method16588(final Class787 class787, final Entity class788, final float n) {
        for (int i = 0; i < 10; ++i) {
            final Vec3d method24909 = Class7775.method24909(class787, 16, 7, class788.method1934());
            if (method24909 != null) {
                class787.method2618().method1196(Class8233.field33809, new Class6949(method24909, n, 0));
                return;
            }
        }
    }
}
