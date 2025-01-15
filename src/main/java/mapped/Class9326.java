// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class9326 extends DataFix
{
    public Class9326(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("Structure Reference Fix", this.getInputSchema().getType(Class9451.field40630), typed -> typed.update(DSL.remainderFinder(), (Function)Class9326::method34549));
    }
    
    private static <T> Dynamic<T> method34549(final Dynamic<T> dynamic) {
        return (Dynamic<T>)dynamic.update("references", dynamic2 -> dynamic2.createInt((int)dynamic2.asNumber().map(Number::intValue).filter(n -> n > 0).orElse(1)));
    }
}
