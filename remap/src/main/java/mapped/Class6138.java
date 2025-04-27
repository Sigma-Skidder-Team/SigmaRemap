// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import java.util.Optional;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class Class6138 extends Class6132
{
    public Class6138(final Schema schema, final boolean b) {
        super(schema, b, "BlockEntityJukeboxFix", Class9451.field40621, "minecraft:jukebox");
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        final Type fieldType = this.getInputSchema().getChoiceType(Class9451.field40621, "minecraft:jukebox").findFieldType("RecordItem");
        final OpticFinder fieldFinder = DSL.fieldFinder("RecordItem", fieldType);
        final Dynamic dynamic = typed.get(DSL.remainderFinder());
        final int int1 = dynamic.get("Record").asInt(0);
        if (int1 > 0) {
            dynamic.remove("Record");
            final String method31988 = Class8987.method31988(Class7013.method21475(int1), 0);
            if (method31988 != null) {
                final Dynamic emptyMap = dynamic.emptyMap();
                final Dynamic set = emptyMap.set("id", emptyMap.createString(method31988));
                return (Typed<?>)typed.set(fieldFinder, (Typed)((Optional)fieldType.readTyped(set.set("Count", set.createByte((byte)1))).getSecond()).orElseThrow(() -> new IllegalStateException("Could not create record item stack."))).set(DSL.remainderFinder(), dynamic);
            }
        }
        return typed;
    }
}
