// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.Type;
import java.util.function.Function;
import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class7821 extends DataFix
{
    public Class7821(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type named = DSL.named(Class9451.field40620.typeName(), DSL.remainderType());
        if (Objects.equals(named, this.getInputSchema().getType(Class9451.field40620))) {
            return this.fixTypeEverywhere("POI reorganization", named, p0 -> pair -> pair.mapSecond((Function)Class7821::method25272));
        }
        throw new IllegalStateException("Poi type is not what was expected.");
    }
    
    private static <T> Dynamic<T> method25272(Dynamic<T> remove) {
        final HashMap hashMap = Maps.newHashMap();
        for (int i = 0; i < 16; ++i) {
            final String value = String.valueOf(i);
            final Optional value2 = remove.get(value).get();
            if (value2.isPresent()) {
                hashMap.put(remove.createInt(i), remove.createMap((Map)ImmutableMap.of((Object)remove.createString("Records"), value2.get())));
                remove = remove.remove(value);
            }
        }
        return remove.set("Sections", remove.createMap(hashMap));
    }
}
