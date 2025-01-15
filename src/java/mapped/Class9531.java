// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Class9531
{
    public static String method35584(final String s) {
        String string;
        try {
            string = ResourceBundle.getBundle("javax.vecmath.ExceptionStrings").getString(s);
        }
        catch (final MissingResourceException ex) {
            System.err.println("VecMathI18N: Error looking up: " + s);
            string = s;
        }
        return string;
    }
}
