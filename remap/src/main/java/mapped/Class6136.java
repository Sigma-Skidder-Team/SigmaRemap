// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import java.util.function.Function;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;

public class Class6136 extends Class6132
{
    public Class6136(final Schema schema, final boolean b) {
        super(schema, b, "EntityShulkerColorFix", Class9451.field40626, "minecraft:shulker");
    }
    
    public Dynamic<?> method18361(final Dynamic<?> dynamic) {
        return dynamic.get("Color").map((Function)Dynamic::asNumber).isPresent() ? dynamic : dynamic.set("Color", dynamic.createByte((byte)10));
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), (Function)this::method18361);
    }
}
