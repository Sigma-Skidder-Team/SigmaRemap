// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.Typed;
import java.util.Optional;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8898 extends DataFix
{
    public Class8898(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("OptionsAddTextBackgroundFix", this.getInputSchema().getType(Class9451.field40615), typed -> typed.update(DSL.remainderFinder(), dynamic -> DataFixUtils.orElse((Optional)dynamic.get("chatOpacity").asString().map(s -> dynamic2.set("textBackgroundOpacity", dynamic2.createDouble(this.method31331(s)))), (Object)dynamic)));
    }
    
    private double method31331(final String s) {
        try {
            return (0.9 * Double.parseDouble(s) + 0.1) / 2.0;
        }
        catch (final NumberFormatException ex) {
            return 0.5;
        }
    }
}
