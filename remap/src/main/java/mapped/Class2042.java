// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.util.function.BiFunction;
import java.util.Map;

public enum Class2042
{
    field11636("feet", (class5487, p1) -> class5487), 
    field11637("eyes", (class5490, class5492) -> new Vec3d(class5490.x, class5490.y + class5492.method1892(), class5490.z));
    
    private static final Map<String, Class2042> field11638;
    private final String field11639;
    private final BiFunction<Vec3d, Entity, Vec3d> field11640;
    
    Class2042(final String field11639, final BiFunction<Vec3d, Entity, Vec3d> field11640) {
        this.field11639 = field11639;
        this.field11640 = field11640;
    }
    
    @Nullable
    public static Class2042 method8121(final String s) {
        return Class2042.field11638.get(s);
    }
    
    public Vec3d method8122(final Entity class399) {
        return this.field11640.apply(class399.method1934(), class399);
    }
    
    public Vec3d method8123(final Class7492 class7492) {
        final Entity method23251 = class7492.method23251();
        return (method23251 != null) ? this.field11640.apply(class7492.method23249(), method23251) : class7492.method23249();
    }
    
    static {
        field11638 = Util.method27851(Maps.newHashMap(), hashMap -> {
            values();
            final Class2042[] array;
            int i = 0;
            for (int length = array.length; i < length; ++i) {
                final Class2042 value = array[i];
                hashMap.put(value.field11639, value);
            }
        });
    }
}
