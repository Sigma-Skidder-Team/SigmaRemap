// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.LivingEntity;

import java.util.List;

public class Class5456<E extends LivingEntity> extends Class5455<E>
{
    private static String[] field22695;
    
    public Class5456(final List<Pair<Class5419<? super E>, Integer>> list) {
        this(ImmutableMap.of(), list);
    }
    
    public Class5456(final Map<Class8233<?>, Class1952> map, final List<Pair<Class5419<? super E>, Integer>> list) {
        super(map, ImmutableSet.of(), Class321.field1904, Class1986.field10996, list);
    }
}
