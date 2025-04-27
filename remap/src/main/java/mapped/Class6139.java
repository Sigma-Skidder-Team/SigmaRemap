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

public class Class6139 extends Class6132
{
    public Class6139(final Schema schema, final boolean b) {
        super(schema, b, "BlockEntityBlockStateFix", Class9451.field40621, "minecraft:piston");
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        final Type choiceType = this.getOutputSchema().getChoiceType(Class9451.field40621, "minecraft:piston");
        final Type fieldType = choiceType.findFieldType("blockState");
        final OpticFinder fieldFinder = DSL.fieldFinder("blockState", fieldType);
        final Dynamic dynamic = typed.get(DSL.remainderFinder());
        final int int1 = dynamic.get("blockId").asInt(0);
        final Dynamic remove = dynamic.remove("blockId");
        return (Typed<?>)choiceType.pointTyped(typed.getOps()).orElseThrow(() -> new IllegalStateException("Could not create new piston block entity.")).set(DSL.remainderFinder(), (Object)remove.remove("blockData")).set(fieldFinder, (Typed)((Optional)fieldType.readTyped(Class7922.method25672(int1 << 4 | (remove.get("blockData").asInt(0) & 0xF))).getSecond()).orElseThrow(() -> new IllegalStateException("Could not parse newly created block state tag.")));
    }
}
