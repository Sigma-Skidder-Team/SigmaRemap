// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public abstract class Class5033 extends Class5035
{
    public Class5033(final String s, final Schema schema, final boolean b) {
        super(s, schema, b);
    }
    
    @Override
    public Pair<String, Typed<?>> method15324(final String s, final Typed<?> typed) {
        final Pair<String, Dynamic<?>> method15323 = this.method15323(s, (Dynamic<?>)typed.getOrCreate(DSL.remainderFinder()));
        return (Pair<String, Typed<?>>)Pair.of(method15323.getFirst(), (Object)typed.set(DSL.remainderFinder(), method15323.getSecond()));
    }
    
    public abstract Pair<String, Dynamic<?>> method15323(final String p0, final Dynamic<?> p1);
}
