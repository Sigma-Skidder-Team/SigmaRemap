// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class1706 extends Class1704
{
    private static String[] field9585;
    public static final /* synthetic */ boolean field9589;
    public final /* synthetic */ Class1675 field9590;
    
    public Class1706(final Class1675 field9590, final Class1676 class1676) {
        this.field9590 = field9590;
        super(class1676);
    }
    
    @Override
    public void method6057(final IOException ex) {
        if (!Class1706.field9589 && !Thread.holdsLock(this.field9590)) {
            throw new AssertionError();
        }
        this.field9590.field9493 = true;
    }
    
    static {
        field9589 = !Class1675.class.desiredAssertionStatus();
    }
}
