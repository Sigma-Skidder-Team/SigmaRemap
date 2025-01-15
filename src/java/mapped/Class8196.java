// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8196
{
    public static boolean method27142(final String s) {
        if (!s.equals("POST")) {
            if (!s.equals("PATCH")) {
                if (!s.equals("PUT")) {
                    if (!s.equals("DELETE")) {
                        if (!s.equals("MOVE")) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public static boolean method27143(final String s) {
        if (!s.equals("POST")) {
            if (!s.equals("PUT")) {
                if (!s.equals("PATCH")) {
                    if (!s.equals("PROPPATCH")) {
                        if (!s.equals("REPORT")) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public static boolean method27144(final String s) {
        if (!method27143(s)) {
            if (!s.equals("OPTIONS")) {
                if (!s.equals("DELETE")) {
                    if (!s.equals("PROPFIND")) {
                        if (!s.equals("MKCOL")) {
                            if (!s.equals("LOCK")) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public static boolean method27145(final String s) {
        return s.equals("PROPFIND");
    }
    
    public static boolean method27146(final String s) {
        return !s.equals("PROPFIND");
    }
    
    private Class8196() {
    }
}
