// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class614 extends Class608<Class640>
{
    private static String[] field3584;
    public final /* synthetic */ Class691 field3585;
    
    public Class614(final Class691 field3585, final Class869 class869) {
        this.field3585 = field3585;
        super(class869, field3585.field3152, field3585.field3153, 32, field3585.field3153 - 64, 10);
        final Iterator<Class9455<ResourceLocation>> iterator = Class8276.field33987.iterator();
        while (iterator.hasNext()) {
            this.method3536(new Class640(this, iterator.next(), null));
        }
    }
    
    @Override
    public void method3545() {
        this.field3585.method3041();
    }
}
