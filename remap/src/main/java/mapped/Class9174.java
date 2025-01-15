// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import java.util.Optional;
import com.mojang.datafixers.Dynamic;
import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class9174 extends DataFix
{
    public Class9174(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("BlockEntityCustomNameToComponentFix", this.getInputSchema().getType(Class9451.field40621), typed -> {
            DSL.fieldFinder("id", DSL.namespacedString());
            return typed.update(DSL.remainderFinder(), dynamic -> {
                typed2.getOptional(opticFinder);
                final Optional optional;
                return (optional.isPresent() && Objects.equals(optional.get(), "minecraft:command_block")) ? dynamic : Class8957.method31777((Dynamic<?>)dynamic);
            });
        });
    }
}
