// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.Typed;
import java.util.Optional;
import com.mojang.datafixers.types.Type;
import java.util.function.Function;
import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public abstract class Class8470 extends DataFix
{
    private final String field34754;
    
    public Class8470(final Schema schema, final String field34754) {
        super(schema, false);
        this.field34754 = field34754;
    }
    
    public TypeRewriteRule makeRule() {
        final Type type = this.getInputSchema().getType(Class9451.field40627);
        final Type named = DSL.named(Class9451.field40627.typeName(), DSL.namespacedString());
        if (Objects.equals(type, named)) {
            return TypeRewriteRule.seq(this.fixTypeEverywhere(this.field34754 + " for block", named, p0 -> pair -> pair.mapSecond((Function)this::method28272)), this.fixTypeEverywhereTyped(this.field34754 + " for block_state", this.getInputSchema().getType(Class9451.field40623), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
                dynamic.get("Name").asString();
                final Optional optional;
                return optional.isPresent() ? dynamic.set("Name", dynamic.createString(this.method28272(optional.get()))) : dynamic;
            })));
        }
        throw new IllegalStateException("block type is not what was expected.");
    }
    
    public abstract String method28272(final String p0);
    
    public static DataFix method28273(final Schema schema, final String s, final Function<String, String> function) {
        return new Class8469(schema, s, function);
    }
}
