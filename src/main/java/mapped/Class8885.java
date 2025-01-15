// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class8885
{
    private static final Logger field37374;
    private static final String field37375 = "[Shaders] ";
    
    public static void method31270(final String str) {
        Class8885.field37374.error("[Shaders] " + str);
    }
    
    public static void method31271(final String str) {
        Class8885.field37374.warn("[Shaders] " + str);
    }
    
    public static void method31272(final String str) {
        Class8885.field37374.info("[Shaders] " + str);
    }
    
    public static void method31273(final String str) {
        Class8885.field37374.debug("[Shaders] " + str);
    }
    
    public static void method31274(final String format, final Object... args) {
        Class8885.field37374.error("[Shaders] " + String.format(format, args));
    }
    
    public static void method31275(final String format, final Object... args) {
        Class8885.field37374.warn("[Shaders] " + String.format(format, args));
    }
    
    public static void method31276(final String format, final Object... args) {
        Class8885.field37374.info("[Shaders] " + String.format(format, args));
    }
    
    public static void method31277(final String format, final Object... args) {
        Class8885.field37374.debug("[Shaders] " + String.format(format, args));
    }
    
    static {
        field37374 = LogManager.getLogger();
    }
}
