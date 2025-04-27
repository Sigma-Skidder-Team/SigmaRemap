// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.InvocationTargetException;
import java.io.File;

public class Class8250
{
    public static void method27359() {
        final File file = new File("jello/jello.lic");
        if (file.exists()) {
            file.delete();
        }
        try {
            System.class.getMethod("exit", Integer.TYPE).invoke(null, 0);
        }
        catch (final InvocationTargetException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException ex) {
            ex.printStackTrace();
        }
    }
}
