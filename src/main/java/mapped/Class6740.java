// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.Typed;
import java.util.Optional;
import java.util.Locale;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class6740 extends DataFix
{
    public Class6740(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("OptionsLowerCaseLanguageFix", this.getInputSchema().getType(Class9451.field40615), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            dynamic.get("lang").asString();
            final Optional optional;
            return optional.isPresent() ? dynamic.set("lang", dynamic.createString(optional.get().toLowerCase(Locale.ROOT))) : dynamic;
        }));
    }
}
