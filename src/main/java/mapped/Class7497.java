// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7497
{
    private static final Logger field28945;
    public static final boolean field28946;
    
    public static void method23332(final String str) {
        if (Class7497.field28946) {
            Class7497.field28945.info("[OptiFine] " + str);
        }
    }
    
    public static void method23333(final String str) {
        Class7497.field28945.info("[OptiFine] " + str);
    }
    
    public static void method23334(final String str) {
        Class7497.field28945.warn("[OptiFine] " + str);
    }
    
    public static void method23335(final String str, final Throwable t) {
        Class7497.field28945.warn("[OptiFine] " + str, t);
    }
    
    public static void method23336(final String str) {
        Class7497.field28945.error("[OptiFine] " + str);
    }
    
    public static void method23337(final String str, final Throwable t) {
        Class7497.field28945.error("[OptiFine] " + str, t);
    }
    
    public static void method23338(final String s) {
        method23333(s);
    }
    
    static {
        field28945 = LogManager.getLogger();
        field28946 = System.getProperty("log.detail", "false").equals("true");
    }
}
