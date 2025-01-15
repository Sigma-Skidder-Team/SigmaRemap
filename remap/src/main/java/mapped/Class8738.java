// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import java.util.Optional;
import java.util.stream.Stream;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8738 extends DataFix
{
    public Class8738(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    private Dynamic<?> method30185(Dynamic<?> dynamic) {
        if ("MobSpawner".equals(dynamic.get("id").asString(""))) {
            final Optional string = dynamic.get("EntityId").asString();
            if (string.isPresent()) {
                final Dynamic dynamic2 = (Dynamic)DataFixUtils.orElse(dynamic.get("SpawnData").get(), (Object)dynamic.emptyMap());
                dynamic = dynamic.set("SpawnData", dynamic2.set("id", dynamic2.createString(string.get().isEmpty() ? "Pig" : string.get()))).remove("EntityId");
            }
            final Optional streamOpt = dynamic.get("SpawnPotentials").asStreamOpt();
            if (streamOpt.isPresent()) {
                dynamic = dynamic.set("SpawnPotentials", dynamic.createList((Stream)((Stream)streamOpt.get()).map(dynamic3 -> {
                    dynamic3.get("Type").asString();
                    final Optional optional;
                    if (!optional.isPresent()) {
                        return dynamic3;
                    }
                    else {
                        return dynamic3.set("Entity", ((Dynamic)DataFixUtils.orElse(dynamic3.get("Properties").get(), (Object)dynamic3.emptyMap())).set("id", dynamic3.createString((String)optional.get()))).remove("Type").remove("Properties");
                    }
                })));
            }
            return (Dynamic<?>)dynamic;
        }
        return (Dynamic<?>)dynamic;
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("MobSpawnerEntityIdentifiersFix", this.getInputSchema().getType(Class9451.field40629), this.getOutputSchema().getType(Class9451.field40629), typed -> {
            final Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
            type.readTyped((Dynamic)this.method30185((Dynamic<?>)dynamic.set("id", dynamic.createString("MobSpawner"))));
            final Pair pair;
            return ((Optional)pair.getSecond()).isPresent() ? ((Optional)pair.getSecond()).get() : typed;
        });
    }
}
