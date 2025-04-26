// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8016
{
    public final Request field33021;
    public final Response field33022;
    
    public Class8016(final Request field33021, final Response field33022) {
        this.field33021 = field33021;
        this.field33022 = field33022;
    }
    
    public static boolean method26271(final Response class1753, final Request class1754) {
        switch (class1753.method6188()) {
            case 200:
            case 203:
            case 204:
            case 300:
            case 301:
            case 308:
            case 404:
            case 405:
            case 410:
            case 414:
            case 501: {
                return !class1753.method6204().method20283() && !class1754.method29117().method20283();
            }
            case 302:
            case 307: {
                if (class1753.method6193("Expires") != null || class1753.method6204().method20284() != -1 || class1753.method6204().method20287()) {
                    return !class1753.method6204().method20283() && !class1754.method29117().method20283();
                }
                if (class1753.method6204().method20286()) {
                    return !class1753.method6204().method20283() && !class1754.method29117().method20283();
                }
                break;
            }
        }
        return false;
    }
}
