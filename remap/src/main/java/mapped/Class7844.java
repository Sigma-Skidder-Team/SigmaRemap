// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import org.apache.logging.log4j.Logger;

public class Class7844
{
    private static final Logger field32125;
    
    public static void method25345(final int n) {
        Class8726.method29989(Class8726::method29984);
        Class8933.method31532(n);
    }
    
    public static void method25346(final Class1927 class1927) {
        Class8726.method29989(Class8726::method29984);
        class1927.method7721().method34570();
        class1927.method7720().method34570();
        Class8933.method31534(class1927.method7722());
    }
    
    public static int method25347() throws IOException {
        Class8726.method29989(Class8726::method29984);
        final int method31533 = Class8933.method31533();
        if (method31533 > 0) {
            return method31533;
        }
        throw new IOException("Could not create shader program (returned program ID " + method31533 + ")");
    }
    
    public static void method25348(final Class1927 class1927) throws IOException {
        Class8726.method29989(Class8726::method29984);
        class1927.method7721().method34569(class1927);
        class1927.method7720().method34569(class1927);
        Class8933.method31535(class1927.method7722());
        if (Class8933.method31525(class1927.method7722(), 35714) == 0) {
            Class7844.field32125.warn("Error encountered when linking program containing VS {} and FS {}. Log output:", (Object)class1927.method7720().method34571(), (Object)class1927.method7721().method34571());
            Class7844.field32125.warn(Class8933.method31569(class1927.method7722(), 32768));
        }
    }
    
    static {
        field32125 = LogManager.getLogger();
    }
}
