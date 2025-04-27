// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;

public class Class6146 extends Class6132
{
    public Class6146(final Schema schema, final boolean b) {
        super(schema, b, "EntityWolfColorFix", Class9451.field40626, "minecraft:wolf");
    }
    
    public Dynamic<?> method18375(final Dynamic<?> dynamic) {
        return dynamic.update("CollarColor", dynamic2 -> dynamic2.createByte((byte)(15 - dynamic2.asInt(0))));
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), (Function)this::method18375);
    }
}
