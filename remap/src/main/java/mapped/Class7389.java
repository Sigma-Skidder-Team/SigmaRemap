// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class Class7389
{
    public static void method22692(final Class6346<?> class6346, final Class1795 class6347, final BlockPos class6348, final List<Class4473> list, final Class2317 class6349) {
        Class7323.method22475(new ResourceLocation("pillager_outpost/base_plates"), 7, Class4523::new, class6346, class6347, class6348, list, class6349);
    }
    
    static {
        Class7323.field28316.method25553(new Class8795(new ResourceLocation(Class7389.\u093d\u3fd9\uc39f\ucc02\u3fd9\u708b[0]), new ResourceLocation("empty"), (List<Pair<Class8228, Integer>>)ImmutableList.of((Object)Pair.of((Object)new Class8227("pillager_outpost/base_plate"), (Object)1)), Class261.field1247));
        Class7323.field28316.method25553(new Class8795(new ResourceLocation("pillager_outpost/towers"), new ResourceLocation("empty"), (List<Pair<Class8228, Integer>>)ImmutableList.of((Object)Pair.of((Object)new Class8231((List<Class8228>)ImmutableList.of(new Class8227("pillager_outpost/watchtower"), (Object)new Class8227("pillager_outpost/watchtower_overgrown", (List<Class4107>)ImmutableList.of((Object)new Class4108(0.05f))))), (Object)1)), Class261.field1247));
        Class7323.field28316.method25553(new Class8795(new ResourceLocation("pillager_outpost/feature_plates"), new ResourceLocation("empty"), (List<Pair<Class8228, Integer>>)ImmutableList.of((Object)Pair.of((Object)new Class8227("pillager_outpost/feature_plate"), (Object)1)), Class261.field1246));
        Class7323.field28316.method25553(new Class8795(new ResourceLocation("pillager_outpost/features"), new ResourceLocation("empty"), (List<Pair<Class8228, Integer>>)ImmutableList.of(Pair.of((Object)new Class8227("pillager_outpost/feature_cage1"), (Object)1), Pair.of((Object)new Class8227("pillager_outpost/feature_cage2"), (Object)1), Pair.of((Object)new Class8227("pillager_outpost/feature_logs"), (Object)1), Pair.of((Object)new Class8227("pillager_outpost/feature_tent1"), (Object)1), Pair.of((Object)new Class8227("pillager_outpost/feature_tent2"), (Object)1), Pair.of((Object)new Class8227("pillager_outpost/feature_targets"), (Object)1), (Object)Pair.of((Object)Class8230.field33794, (Object)6)), Class261.field1247));
    }
}
