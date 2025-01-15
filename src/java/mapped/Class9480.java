// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.util.Pair;
import java.util.function.Function;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class9480 extends DataFix
{
    public Class9480(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    private static Class263 method35302(final String s) {
        return s.equals("health") ? Class263.field1257 : Class263.field1256;
    }
    
    public TypeRewriteRule makeRule() {
        final Type named = DSL.named(Class9451.field40631.typeName(), DSL.remainderType());
        if (Objects.equals(named, this.getInputSchema().getType(Class9451.field40631))) {
            return this.fixTypeEverywhere("ObjectiveRenderTypeFix", named, p0 -> pair -> pair.mapSecond(dynamic -> {
                if (dynamic.get("RenderType").asString().isPresent()) {
                    return dynamic;
                }
                else {
                    return dynamic.set("RenderType", dynamic.createString(method35302(dynamic.get("CriteriaName").asString("")).method902()));
                }
            }));
        }
        throw new IllegalStateException("Objective type is not what was expected.");
    }
}
