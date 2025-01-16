// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7106 implements Class7107
{
    private static final Logger field27725;
    
    @Override
    public void method21823(final Class9083 class9083) {
        if (!class9083.method32768()) {
            Class7106.field27725.warn("(optional) " + class9083.method32754() + " failed. " + Util.method27860(class9083.method32765()));
        }
        else {
            Class7106.field27725.error(class9083.method32754() + " failed! " + Util.method27860(class9083.method32765()));
        }
    }
    
    static {
        field27725 = LogManager.getLogger();
    }
}
