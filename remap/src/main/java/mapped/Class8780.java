// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import java.util.Optional;
import com.mojang.datafixers.DataFixUtils;
import java.util.function.Function;
import com.google.gson.JsonParseException;
import net.minecraft.util.text.ITextComponent;
import org.apache.commons.lang3.StringUtils;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8780 extends DataFix
{
    public Class8780(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public Dynamic<?> method30543(final Dynamic<?> dynamic) {
        return dynamic.update("pages", dynamic3 -> DataFixUtils.orElse((Optional)dynamic3.asStreamOpt().map(stream -> stream.map(dynamic4 -> {
            if (!dynamic4.asString().isPresent()) {
                return dynamic4;
            }
            else {
                dynamic4.asString("");
                final String anObject;
                ITextComponent class2250 = null;
                if (!"null".equals(anObject) && !StringUtils.isEmpty(anObject)) {
                    if (anObject.charAt(0) != '\"' || anObject.charAt(anObject.length() - 1) != '\"') {
                        if (anObject.charAt(0) != '{' || anObject.charAt(anObject.length() - 1) != '}') {
                            class2250 = new StringTextComponent(anObject);
                            return dynamic4.createString(Class5953.method17869(class2250));
                        }
                    }
                    try {
                        class2250 = Class9583.method35925(Class6151.field24883, anObject, ITextComponent.class, true);
                        if (class2250 == null) {
                            class2250 = new StringTextComponent("");
                        }
                    }
                    catch (final JsonParseException ex) {}
                    if (class2250 == null) {
                        try {
                            class2250 = Class5953.method17871(anObject);
                        }
                        catch (final JsonParseException ex2) {}
                    }
                    if (class2250 == null) {
                        try {
                            class2250 = Class5953.method17873(anObject);
                        }
                        catch (final JsonParseException ex3) {}
                    }
                    if (class2250 == null) {
                        class2250 = new StringTextComponent(anObject);
                    }
                }
                else {
                    class2250 = new StringTextComponent("");
                }
                return dynamic4.createString(Class5953.method17869(class2250));
            }
        })).map(dynamic2::createList), (Object)dynamic2.emptyList()));
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("ItemWrittenBookPagesStrictJsonFix", this.getInputSchema().getType(Class9451.field40622), typed -> {
            final Type type;
            type.findField("tag");
            return typed.updateTyped(opticFinder, typed2 -> typed2.update(DSL.remainderFinder(), (Function)this::method30543));
        });
    }
}
