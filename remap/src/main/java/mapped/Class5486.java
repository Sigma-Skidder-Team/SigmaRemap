// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.Type;
import java.util.function.Function;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import java.util.Optional;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class5486 extends DataFix
{
    public Class5486(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    private Dynamic<?> method16734(final Dynamic<?> dynamic) {
        final Optional value = dynamic.get("display").get();
        if (!value.isPresent()) {
            return dynamic;
        }
        Dynamic dynamic2 = value.get();
        final Optional string = dynamic2.get("Name").asString();
        if (!string.isPresent()) {
            final Optional string2 = dynamic2.get("LocName").asString();
            if (string2.isPresent()) {
                dynamic2 = dynamic2.set("Name", dynamic2.createString(Class5953.method17869(new Class2259((String)string2.get())))).remove("LocName");
            }
        }
        else {
            dynamic2 = dynamic2.set("Name", dynamic2.createString(Class5953.method17869(new StringTextComponent((String)string.get()))));
        }
        return dynamic.set("display", dynamic2);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("ItemCustomNameToComponentFix", this.getInputSchema().getType(Class9451.field40622), typed -> {
            final Type type;
            type.findField("tag");
            return typed.updateTyped(opticFinder, typed2 -> typed2.update(DSL.remainderFinder(), (Function)this::method16734));
        });
    }
}
