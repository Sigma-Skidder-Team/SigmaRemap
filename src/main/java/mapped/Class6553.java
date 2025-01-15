// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class6553 extends DataFix
{
    public Class6553(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("OptionsForceVBOFix", this.getInputSchema().getType(Class9451.field40615), typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.set("useVbo", dynamic.createString("true"))));
    }
}
