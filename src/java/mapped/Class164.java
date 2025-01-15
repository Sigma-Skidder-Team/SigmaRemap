// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Predicate;

public class Class164 implements Predicate<Class399>
{
    private static String[] field475;
    public final /* synthetic */ float field476;
    public final /* synthetic */ Class3362 field477;
    
    public Class164(final Class3362 field477, final float field478) {
        this.field477 = field477;
        this.field476 = field478;
    }
    
    public boolean apply(final Class399 class399) {
        return class399 != null && class399.method1732(Class3362.method10664().field4684) <= this.field476 + 2.0f;
    }
}
