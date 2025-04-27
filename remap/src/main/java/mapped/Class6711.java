// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.Type;
import java.util.Optional;
import com.mojang.datafixers.DataFixUtils;

import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class6711 extends DataFix
{
    public Class6711(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type named = DSL.named(Class9451.field40632.typeName(), DSL.remainderType());
        if (Objects.equals(named, this.getInputSchema().getType(Class9451.field40632))) {
            return this.fixTypeEverywhere("TeamDisplayNameFix", named, p0 -> pair -> pair.mapSecond(dynamic -> dynamic.update("DisplayName", dynamic3 -> DataFixUtils.orElse((Optional)dynamic3.asString().map(s -> Class5953.method17869(new StringTextComponent(s))).map(dynamic2::createString), dynamic3))));
        }
        throw new IllegalStateException("Team type is not what was expected.");
    }
}
