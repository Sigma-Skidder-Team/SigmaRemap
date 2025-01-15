// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class1332 implements Runnable
{
    private static String[] field7312;
    
    @Override
    public void run() {
        for (final Class6108 class6108 : Class8563.method28794().method33557().values()) {
            final Class6651 class6109 = class6108.method18207(Class6651.class);
            if (class6109 == null) {
                continue;
            }
            if (!class6109.method20211().method16335(Class5224.class)) {
                continue;
            }
            if (class6108.method18207(Class6653.class).method20224() > System.currentTimeMillis()) {
                continue;
            }
            if (!class6108.method18220().isOpen()) {
                continue;
            }
            Class8563.method28794().method33549().method29950(Class6487.class).method19523(class6108);
        }
    }
}
