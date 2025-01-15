// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.types.Type;
import java.util.function.Function;
import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class5761 extends DataFix
{
    public Class5761(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type type = this.getInputSchema().getType(Class9451.field40627);
        final Type type2 = this.getOutputSchema().getType(Class9451.field40627);
        final Type named = DSL.named(Class9451.field40627.typeName(), DSL.or(DSL.intType(), DSL.namespacedString()));
        final Type named2 = DSL.named(Class9451.field40627.typeName(), DSL.namespacedString());
        if (Objects.equals(type, named) && Objects.equals(type2, named2)) {
            return this.fixTypeEverywhere("BlockNameFlatteningFix", named, named2, p0 -> pair -> pair.mapSecond(either -> either.map((Function)Class7922::method25670, s -> Class7922.method25669(Class5174.method16141(s)))));
        }
        throw new IllegalStateException("Expected and actual types don't match.");
    }
}
