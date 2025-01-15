// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;
import com.mojang.datafixers.DataFix;

public class Class8708 extends DataFix
{
    private final String field36594;
    private final Function<String, String> field36595;
    
    public Class8708(final Schema schema, final boolean b, final String field36594, final Function<String, String> field36595) {
        super(schema, b);
        this.field36594 = field36594;
        this.field36595 = field36595;
    }
    
    public TypeRewriteRule makeRule() {
        final Type named = DSL.named(Class9451.field40633.typeName(), DSL.namespacedString());
        if (Objects.equals(named, this.getInputSchema().getType(Class9451.field40633))) {
            return this.fixTypeEverywhere(this.field36594, named, p0 -> pair -> pair.mapSecond((Function)this.field36595));
        }
        throw new IllegalStateException("Recipe type is not what was expected.");
    }
}
