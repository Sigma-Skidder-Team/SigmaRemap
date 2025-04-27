// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Typed;
import java.util.stream.Collector;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class9097 extends DataFix
{
    public Class9097(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("OptionsKeyTranslationFix", this.getInputSchema().getType(Class9451.field40615), typed -> typed.update(DSL.remainderFinder(), other -> other.getMapValues().map(map -> dynamic.createMap((Map)map.entrySet().stream().map(entry -> {
            if (entry.getKey().asString("").startsWith("key_")) {
                entry.getValue().asString("");
                final String s;
                if (!s.startsWith("key.mouse")) {
                    if (!s.startsWith("scancode.")) {
                        return Pair.of((Object)entry.getKey(), (Object)dynamic2.createString("key.keyboard." + s.substring("key.".length())));
                    }
                }
            }
            return Pair.of((Object)entry.getKey(), (Object)entry.getValue());
        }).collect(Collectors.toMap((Function<? super Object, ?>)Pair::getFirst, (Function<? super Object, ?>)Pair::getSecond)))).orElse(other)));
    }
}
