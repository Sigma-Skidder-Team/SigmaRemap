// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class Class6134 extends Class6132
{
    public Class6134(final Schema schema, final boolean b) {
        super(schema, b, "Colorless shulker entity fix", Class9451.field40626, "minecraft:shulker");
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), dynamic -> (dynamic.get("Color").asInt(0) != 10) ? dynamic : dynamic.set("Color", dynamic.createByte((byte)16)));
    }
}
