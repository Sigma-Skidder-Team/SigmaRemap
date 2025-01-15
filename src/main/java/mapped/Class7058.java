// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Typed;
import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class7058 extends DataFix
{
    public Class7058(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("BlockStateStructureTemplateFix", this.getInputSchema().getType(Class9451.field40623), typed -> typed.update(DSL.remainderFinder(), (Function)Class7922::method25668));
    }
}
