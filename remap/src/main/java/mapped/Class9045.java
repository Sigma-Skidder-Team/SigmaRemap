// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import java.util.stream.Stream;
import com.mojang.datafixers.types.Type;
import java.util.Optional;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class9045 extends DataFix
{
    public Class9045(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("Item Lore componentize", this.getInputSchema().getType(Class9451.field40622), typed -> {
            final Type type;
            type.findField("tag");
            return typed.updateTyped(opticFinder, typed2 -> typed2.update(DSL.remainderFinder(), dynamic -> dynamic.update("display", dynamic2 -> dynamic2.update("Lore", dynamic3 -> DataFixUtils.orElse((Optional)dynamic3.asStreamOpt().map(Class9045::method32526).map(dynamic3::createList), (Object)dynamic3)))));
        });
    }
    
    private static <T> Stream<Dynamic<T>> method32526(final Stream<Dynamic<T>> stream) {
        return stream.map(dynamic -> DataFixUtils.orElse((Optional)dynamic.asString().map(Class9045::method32527).map(dynamic::createString), (Object)dynamic));
    }
    
    private static String method32527(final String s) {
        return Class5953.method17869(new StringTextComponent(s));
    }
}
