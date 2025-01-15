// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;

public class Class5038 extends Class5033
{
    public Class5038(final Schema schema, final boolean b) {
        super("EntitySkeletonSplitFix", schema, b);
    }
    
    @Override
    public Pair<String, Dynamic<?>> method15323(String a, final Dynamic<?> dynamic) {
        if (Objects.equals(a, "Skeleton")) {
            final int int1 = dynamic.get("SkeletonType").asInt(0);
            if (int1 != 1) {
                if (int1 == 2) {
                    a = "Stray";
                }
            }
            else {
                a = "WitherSkeleton";
            }
        }
        return (Pair<String, Dynamic<?>>)Pair.of((Object)a, (Object)dynamic);
    }
}
