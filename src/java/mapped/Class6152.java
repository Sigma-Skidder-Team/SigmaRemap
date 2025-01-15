// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;

public class Class6152 extends Class6132
{
    public Class6152(final Schema schema, final boolean b) {
        super(schema, b, "EntityArmorStandSilentFix", Class9451.field40626, "ArmorStand");
    }
    
    public Dynamic<?> method18386(final Dynamic<?> dynamic) {
        return (Dynamic<?>)((dynamic.get("Silent").asBoolean(false) && !dynamic.get("Marker").asBoolean(false)) ? dynamic.remove("Silent") : dynamic);
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), (Function)this::method18386);
    }
}
