// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL$TypeReference;
import com.mojang.datafixers.schemas.Schema;

public final class Class6150 extends Class6132
{
    private static String[] field24882;
    
    public Class6150(final Schema schema, final boolean b, final String s, final DSL$TypeReference dsl$TypeReference, final String s2) {
        super(schema, b, s, dsl$TypeReference, s2);
    }
    
    @Override
    public Typed<?> method18357(final Typed<?> typed) {
        return (Typed<?>)typed.update(DSL.remainderFinder(), (Function)Class8957::method31777);
    }
}
