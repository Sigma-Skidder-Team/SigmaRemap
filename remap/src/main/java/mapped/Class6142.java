// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;

public class Class6142 extends Class6132
{
    public Class6142(final Schema schema, final boolean b) {
        super(schema, b, "BlockEntityKeepPacked", Class9451.field40621, "DUMMY");
    }
    
    private static Dynamic<?> method18367(final Dynamic<?> dynamic) {
        return dynamic.set("keepPacked", dynamic.createBoolean(true));
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), (Function)Class6142::method18367);
    }
}
