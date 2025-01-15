// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Random;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class7323
{
    private static String[] field28314;
    private static final Logger field28315;
    public static final Class7891 field28316;
    
    public static void method22475(final Class1932 class1932, final int n, final Class7669 class1933, final Class6346<?> class1934, final Class1795 class1935, final BlockPos class1936, final List<Class4473> list, final Random random) {
        Class9380.method34830();
        new Class7125(class1932, n, class1933, class1934, class1935, class1936, list, random);
    }
    
    static {
        field28315 = LogManager.getLogger();
        (field28316 = new Class7891()).method25553(Class8795.field36977);
    }
}
