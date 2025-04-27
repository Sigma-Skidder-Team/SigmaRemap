// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import com.mojang.datafixers.Dynamic;
import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8957 extends DataFix
{
    public Class8957(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("EntityCustomNameToComponentFix", this.getInputSchema().getType(Class9451.field40626), typed -> {
            DSL.fieldFinder("id", DSL.namespacedString());
            return typed.update(DSL.remainderFinder(), dynamic -> {
                typed2.getOptional(opticFinder);
                final Optional optional;
                return (optional.isPresent() && Objects.equals(optional.get(), "minecraft:commandblock_minecart")) ? dynamic : method31777(dynamic);
            });
        });
    }
    
    public static Dynamic<?> method31777(final Dynamic<?> dynamic) {
        final String string = dynamic.get("CustomName").asString("");
        return string.isEmpty() ? dynamic.remove("CustomName") : dynamic.set("CustomName", dynamic.createString(Class5953.method17869(new StringTextComponent(string))));
    }
}
