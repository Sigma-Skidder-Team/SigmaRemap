// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;

import java.util.Optional;

public class Class5467 extends Class5419<LivingEntity>
{
    private static String[] field22734;
    private final float field22735;
    private final int field22736;
    private final int field22737;
    private Optional<BlockPos> field22738;
    
    public Class5467(final int field22736, final float field22737, final int field22738) {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10629, (Object)Class8233.field33800, (Object)Class1952.field10630, (Object)Class8233.field33820, (Object)Class1952.field10630));
        this.field22738 = Optional.empty();
        this.field22736 = field22736;
        this.field22735 = field22737;
        this.field22737 = field22738;
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final LivingEntity class1850) {
        final Optional<BlockPos> method7204 = class1849.method6921().method7204(class1851 -> class1851 == Class8912.field37476, p0 -> true, new BlockPos(class1850), this.field22737 + 1, Class2045.field11652);
        if (method7204.isPresent() && method7204.get().withinDistance(class1850.method1934(), this.field22737)) {
            this.field22738 = method7204;
        }
        else {
            this.field22738 = Optional.empty();
        }
        return true;
    }
    
    @Override
    public void method16539(final Class1849 class1849, final LivingEntity class1850, final long n) {
        final Class365<?> method2618 = class1850.method2618();
        Optional<BlockPos> optional = this.field22738;
        if (!optional.isPresent()) {
            optional = class1849.method6921().method7207(class1851 -> class1851 == Class8912.field37476, p0 -> true, Class2045.field11652, new BlockPos(class1850), this.field22736, class1850.method2633());
            if (!optional.isPresent()) {
                final Optional<Class363> method2619 = method2618.method1198(Class8233.field33800);
                if (method2619.isPresent()) {
                    optional = Optional.of(method2619.get().method1170());
                }
            }
        }
        if (optional.isPresent()) {
            method2618.method1195(Class8233.field33813);
            method2618.method1195(Class8233.field33810);
            method2618.method1195(Class8233.field33812);
            method2618.method1195(Class8233.field33811);
            method2618.method1196(Class8233.field33820, Class363.method1167(class1849.method6789().getType(), optional.get()));
            if (!optional.get().withinDistance(class1850.method1934(), this.field22737)) {
                method2618.method1196(Class8233.field33809, new Class6949(optional.get(), this.field22735, this.field22737));
            }
        }
    }
}
