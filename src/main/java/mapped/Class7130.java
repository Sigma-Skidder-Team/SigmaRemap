// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.Typed;
import java.util.Optional;
import java.util.UUID;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class7130 extends DataFix
{
    public Class7130(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("EntityStringUuidFix", this.getInputSchema().getType(Class9451.field40626), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            dynamic.get("UUID").asString();
            final Optional optional;
            if (!optional.isPresent()) {
                return dynamic;
            }
            else {
                UUID.fromString(optional.get());
                final UUID uuid;
                return dynamic.remove("UUID").set("UUIDMost", dynamic.createLong(uuid.getMostSignificantBits())).set("UUIDLeast", dynamic.createLong(uuid.getLeastSignificantBits()));
            }
        }));
    }
}
