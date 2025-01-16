// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonElement;

public class Class4217 extends Class4211
{
    private static String[] field19011;
    private final Class8697 field19012;
    
    public Class4217(final ResourceLocation class1932, final Class8697 field19012) {
        super(class1932);
        this.field19012 = field19012;
    }
    
    public static Class4217 method12695(final Class8697 class8697) {
        return new Class4217(Class4635.method13829(Class7770.field31790), class8697);
    }
    
    public static Class4217 method12696() {
        return new Class4217(Class4635.method13829(Class7770.field31791), Class8697.field36544);
    }
    
    public static Class4217 method12697() {
        return new Class4217(Class4635.method13829(Class7770.field31808), Class8697.field36544);
    }
    
    public boolean method12698(final Class1849 class1849, final double n, final double n2, final double n3) {
        return this.field19012.method29811(class1849, n, n2, n3);
    }
    
    @Override
    public JsonElement method12682() {
        return this.field19012.method29813();
    }
}
