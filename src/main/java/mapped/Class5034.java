// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;

public class Class5034 extends Class5033
{
    public Class5034(final Schema schema, final boolean b) {
        super("EntityCatSplitFix", schema, b);
    }
    
    @Override
    public Pair<String, Dynamic<?>> method15323(final String b, final Dynamic<?> dynamic) {
        if (Objects.equals("minecraft:ocelot", b)) {
            final int int1 = dynamic.get("CatType").asInt(0);
            if (int1 != 0) {
                if (int1 > 0) {
                    if (int1 < 4) {
                        final Dynamic set = dynamic.set("CatType", dynamic.createInt(int1));
                        return (Pair<String, Dynamic<?>>)Pair.of((Object)"minecraft:cat", (Object)set.set("OwnerUUID", set.createString(set.get("OwnerUUID").asString(""))));
                    }
                }
            }
            else {
                final String string = dynamic.get("Owner").asString("");
                final String string2 = dynamic.get("OwnerUUID").asString("");
                if (string.length() > 0 || string2.length() > 0) {
                    dynamic.set("Trusting", dynamic.createBoolean(true));
                }
            }
        }
        return (Pair<String, Dynamic<?>>)Pair.of((Object)b, (Object)dynamic);
    }
}
