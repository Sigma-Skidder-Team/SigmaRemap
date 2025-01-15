// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.util.HashMap;

public class Class7651
{
    public static void method24236(final Class7689 class7689, final Class5204 class7690) {
        try {
            final Throwable method24411 = class7689.method24411();
            if (method24411 == null) {
                return;
            }
            if (method24411.getClass().getName().contains(".fml.client.SplashProgress")) {
                return;
            }
            if (method24411.getClass() == Throwable.class) {
                return;
            }
            method24239(class7690);
            final Class5760 method24412 = Class8571.method28962();
            if (method24412 == null) {
                return;
            }
            if (!method24412.field23426) {
                return;
            }
            final String s = "http://optifine.net/crashReport";
            final byte[] bytes = method24237(class7689).getBytes("ASCII");
            final Class8889 class7691 = new Class8889();
            final HashMap hashMap = new HashMap();
            hashMap.put("OF-Version", Class8571.method28814());
            hashMap.put("OF-Summary", method24238(class7689));
            final Class906 class7692 = new Class906(s, hashMap, bytes, class7691);
            class7692.setPriority(10);
            class7692.start();
            Thread.sleep(1000L);
        }
        catch (final Exception ex) {
            Class8571.method28847(ex.getClass().getName() + ": " + ex.getMessage());
        }
    }
    
    private static String method24237(final Class7689 class7689) {
        final StringBuffer sb = new StringBuffer();
        sb.append("OptiFineVersion: " + Class8571.method28814() + "\n");
        sb.append("Summary: " + method24238(class7689) + "\n");
        sb.append("\n");
        sb.append(class7689.method24414());
        sb.append("\n");
        return sb.toString();
    }
    
    private static String method24238(final Class7689 class7689) {
        final Throwable method24411 = class7689.method24411();
        if (method24411 != null) {
            final StackTraceElement[] stackTrace = method24411.getStackTrace();
            String trim = "unknown";
            if (stackTrace.length > 0) {
                trim = stackTrace[0].toString().trim();
            }
            return method24411.getClass().getName() + ": " + method24411.getMessage() + " (" + class7689.method24410() + ") [" + trim + "]";
        }
        return "Unknown";
    }
    
    public static void method24239(final Class5204 class5204) {
        class5204.method16297("OptiFine Version", Class8571.method28814());
        class5204.method16297("OptiFine Build", Class8571.method28820());
        if (Class8571.method28962() != null) {
            class5204.method16297("Render Distance Chunks", "" + Class8571.method28976());
            class5204.method16297("Mipmaps", "" + Class8571.method28837());
            class5204.method16297("Anisotropic Filtering", "" + Class8571.method28923());
            class5204.method16297("Antialiasing", "" + Class8571.method28925());
            class5204.method16297("Multitexture", "" + Class8571.method28928());
        }
        class5204.method16297("Shaders", "" + Class9216.method33891());
        class5204.method16297("OpenGlVersion", "" + Class8571.field36018);
        class5204.method16297("OpenGlRenderer", "" + Class8571.field36019);
        class5204.method16297("OpenGlVendor", "" + Class8571.field36020);
        class5204.method16297("CpuCount", "" + Class8571.method28969());
    }
}
