// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.DSL$TypeReference;
import com.mojang.datafixers.schemas.Schema;

public class Class5174 extends Schema
{
    private static String[] field22198;
    
    public Class5174(final int n, final Schema schema) {
        super(n, schema);
    }
    
    public static String method16141(final String s) {
        final Class1932 method7795 = Class1932.method7795(s);
        return (method7795 == null) ? s : method7795.toString();
    }
    
    public Type<?> getChoiceType(final DSL$TypeReference dsl$TypeReference, final String s) {
        return (Type<?>)super.getChoiceType(dsl$TypeReference, method16141(s));
    }
}
