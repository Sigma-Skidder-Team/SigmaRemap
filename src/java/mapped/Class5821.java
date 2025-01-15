// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Class5821
{
    public static final String field23903;
    private static Logger field23904;
    private static Class5821 field23905;
    
    public static synchronized Class5821 method17512() {
        if (Class5821.field23905 == null) {
            final String property = System.getProperty(Class5821.field23903);
            if (property != null) {
                try {
                    Class5821.field23905 = (Class5821)Class.forName(property, true, Thread.currentThread().getContextClassLoader()).newInstance();
                }
                catch (final Exception ex) {
                    Class5821.field23904.log(Level.WARNING, "Unable to instantiate configured FFTFactory \"" + property + "\". Will fall back to standard implementation. Problem: " + ex, ex);
                }
            }
            if (Class5821.field23905 == null) {
                Class5821.field23905 = new Class5822(null);
            }
        }
        return Class5821.field23905;
    }
    
    public abstract Class8598 method17513(final int p0);
    
    static {
        field23903 = Class5821.class.getName();
        Class5821.field23904 = Logger.getLogger(Class5821.class.getName());
    }
}
