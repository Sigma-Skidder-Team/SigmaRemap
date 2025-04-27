// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;
import com.mojang.datafixers.DataFix;

public class Class9188 extends DataFix
{
    private final String field38930;
    private final Function<String, String> field38931;
    
    public Class9188(final Schema schema, final boolean b, final String field38930, final Function<String, String> field38931) {
        super(schema, b);
        this.field38930 = field38930;
        this.field38931 = field38931;
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.field38930, this.getInputSchema().getType(Class9451.field40619), typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.updateMapValues(pair2 -> pair2.mapFirst(p2 -> {
            pair2.getFirst().asString("");
            return dynamic2.createString((String)this.field38931.apply(s));
        }))));
    }
}
