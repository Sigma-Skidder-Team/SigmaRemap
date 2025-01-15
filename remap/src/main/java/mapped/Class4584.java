// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import java.util.List;

public class Class4584 extends Class4582<Class5122>
{
    private static final List<Class6828> field20071;
    private static final List<Class6828> field20072;
    
    public Class4584(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    @Override
    public String method13596() {
        return "Swamp_Hut";
    }
    
    @Override
    public int method13597() {
        return 3;
    }
    
    @Override
    public Class6378 method13595() {
        return Class5944::new;
    }
    
    @Override
    public int method13605() {
        return 14357620;
    }
    
    @Override
    public List<Class6828> method13530() {
        return Class4584.field20071;
    }
    
    @Override
    public List<Class6828> method13531() {
        return Class4584.field20072;
    }
    
    public boolean method13606(final Class1851 class1851, final BlockPos class1852) {
        final Class5936 method13588 = this.method13588(class1851, class1852, true);
        if (method13588 != Class5936.field24429) {
            if (method13588 instanceof Class5944) {
                if (!method13588.method17852().isEmpty()) {
                    return method13588.method17852().get(0) instanceof Class4476;
                }
            }
        }
        return false;
    }
    
    static {
        field20071 = Lists.newArrayList((Object[])new Class6828[] { new Class6828(EntityType.field29047, 1, 1, 1) });
        field20072 = Lists.newArrayList((Object[])new Class6828[] { new Class6828(EntityType.field28964, 1, 1, 1) });
    }
}
