// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class8569 extends DataFix
{
    public Class8569(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("Map id fix", this.getInputSchema().getType(Class9451.field40618), typed -> {
            final Type type;
            type.findField("data");
            return typed.getOptionalTyped(opticFinder).isPresent() ? typed : typed.update(DSL.remainderFinder(), dynamic -> dynamic.emptyMap().merge(dynamic.createString("data"), dynamic));
        });
    }
}
