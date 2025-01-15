// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.Typed;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class7982 extends DataFix
{
    public Class7982(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("EntityRedundantChanceTagsFix", this.getInputSchema().getType(Class9451.field40626), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            if (!(!Objects.equals(dynamic.get("HandDropChances"), Optional.of(dynamic.createList((Stream)Stream.generate(() -> dynamic2.createFloat(0.0f)).limit(2L)))))) {
                dynamic = dynamic.remove("HandDropChances");
            }
            if (!(!Objects.equals(dynamic.get("ArmorDropChances"), Optional.of(dynamic.createList((Stream)Stream.generate(() -> dynamic3.createFloat(0.0f)).limit(4L)))))) {
                dynamic = dynamic.remove("ArmorDropChances");
            }
            return dynamic;
        }));
    }
}
