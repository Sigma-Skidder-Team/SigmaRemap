// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;

public class Class6145 extends Class6132
{
    public Class6145(final Schema schema, final boolean b) {
        super(schema, b, "CatTypeFix", Class9451.field40626, "minecraft:cat");
    }
    
    public Dynamic<?> method18374(final Dynamic<?> dynamic) {
        return (Dynamic<?>)((dynamic.get("CatType").asInt(0) != 9) ? dynamic : dynamic.set("CatType", dynamic.createInt(10)));
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), (Function)this::method18374);
    }
}
