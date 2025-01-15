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

public class Class9027 extends DataFix
{
    public Class9027(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        final Type named = DSL.named(Class9451.field40631.typeName(), DSL.remainderType());
        if (Objects.equals(named, this.getInputSchema().getType(Class9451.field40631))) {
            return this.fixTypeEverywhere("ObjectiveDisplayNameFix", named, p0 -> pair -> pair.mapSecond(dynamic -> dynamic.update("DisplayName", dynamic3 -> DataFixUtils.orElse((Optional)dynamic3.asString().map(s -> Class5953.method17869(new StringTextComponent(s))).map(dynamic2::createString), (Object)dynamic3))));
        }
        throw new IllegalStateException("Objective type is not what was expected.");
    }
}
