// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.entity.EntityType;

import java.util.function.Function;
import java.util.List;

public class Class4581 extends Class4574<Class5122>
{
    private static final List<Class6828> field20070;
    
    public Class4581(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    @Override
    public boolean method13594(final BiomeManager class5507, final Class6346<?> class5508, final Random random, final int n, final int n2, final Biome class5509) {
        final int n3 = n >> 4;
        final int n4 = n2 >> 4;
        random.setSeed((long)(n3 ^ n4 << 4) ^ class5508.method18880());
        random.nextInt();
        return random.nextInt(3) == 0 && n == (n3 << 4) + 4 + random.nextInt(8) && n2 == (n4 << 4) + 4 + random.nextInt(8) && class5508.method18877(class5509, this);
    }
    
    @Override
    public Class6378 method13595() {
        return Class5950::new;
    }
    
    @Override
    public String method13596() {
        return "Fortress";
    }
    
    @Override
    public int method13597() {
        return 8;
    }
    
    @Override
    public List<Class6828> method13530() {
        return Class4581.field20070;
    }
    
    static {
        field20070 = Lists.newArrayList((Object[])new Class6828[] { new Class6828(EntityType.field28962, 10, 2, 3), new Class6828(EntityType.field29014, 5, 4, 4), new Class6828(EntityType.field29049, 8, 5, 5), new Class6828(EntityType.field29023, 2, 5, 5), new Class6828(EntityType.field28998, 3, 4, 4) });
    }
}
