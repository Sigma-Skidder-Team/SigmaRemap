// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class966 implements Runnable
{
    private static String[] field5142;
    public final /* synthetic */ Class4940 field5143;
    public final /* synthetic */ Class4940 field5144;
    
    public Class966(final Class4940 field5144, final Class4940 field5145) {
        this.field5144 = field5144;
        this.field5143 = field5145;
    }
    
    @Override
    public void run() {
        for (final Class4803 class4803 : this.field5143.method14250()) {
            if (!(class4803 instanceof Class4850)) {
                continue;
            }
            final Class4850 class4804 = (Class4850)class4803;
            class4804.method14549();
            this.field5144.field21213.method14614();
            class4804.method14301(true);
            class4804.method14251();
            this.field5143.method14243(this.field5144.field21216);
        }
    }
}
