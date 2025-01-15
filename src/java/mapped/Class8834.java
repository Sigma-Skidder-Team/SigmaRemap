// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.File;
import java.net.URL;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class Class8834
{
    private static ArrayList field37132;
    
    public static void method30848(final Class7378 e) {
        Class8834.field37132.add(e);
    }
    
    public static void method30849(final Class7378 o) {
        Class8834.field37132.remove(o);
    }
    
    public static void method30850() {
        Class8834.field37132.clear();
    }
    
    public static InputStream method30851(final String str) {
        InputStream method22653 = null;
        for (int i = 0; i < Class8834.field37132.size(); ++i) {
            method22653 = ((Class7378)Class8834.field37132.get(i)).method22653(str);
            if (method22653 != null) {
                break;
            }
        }
        if (method22653 != null) {
            return new BufferedInputStream(method22653);
        }
        throw new RuntimeException("Resource not found: " + str);
    }
    
    public static boolean method30852(final String s) {
        for (int i = 0; i < Class8834.field37132.size(); ++i) {
            if (((Class7378)Class8834.field37132.get(i)).method22652(s) != null) {
                return true;
            }
        }
        return false;
    }
    
    public static URL method30853(final String str) {
        URL method22652 = null;
        for (int i = 0; i < Class8834.field37132.size(); ++i) {
            method22652 = ((Class7378)Class8834.field37132.get(i)).method22652(str);
            if (method22652 != null) {
                break;
            }
        }
        if (method22652 != null) {
            return method22652;
        }
        throw new RuntimeException("Resource not found: " + str);
    }
    
    static {
        (Class8834.field37132 = new ArrayList()).add(new Class7377());
        Class8834.field37132.add(new Class7379(new File(".")));
    }
}
