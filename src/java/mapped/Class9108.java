// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.TimeUnit;
import java.util.Date;

public class Class9108
{
    public final long field38576;
    public final Class8596 field38577;
    public final Class1753 field38578;
    private Date field38579;
    private String field38580;
    private Date field38581;
    private String field38582;
    private Date field38583;
    private long field38584;
    private long field38585;
    private String field38586;
    private int field38587;
    
    public Class9108(final long field38576, final Class8596 field38577, final Class1753 field38578) {
        this.field38587 = -1;
        this.field38576 = field38576;
        this.field38577 = field38577;
        this.field38578 = field38578;
        if (field38578 != null) {
            this.field38584 = field38578.method6205();
            this.field38585 = field38578.method6206();
            final Class6957 method6195 = field38578.method6195();
            for (int i = 0; i < method6195.method21362(); ++i) {
                final String method6196 = method6195.method21363(i);
                final String method6197 = method6195.method21364(i);
                if (!"Date".equalsIgnoreCase(method6196)) {
                    if (!"Expires".equalsIgnoreCase(method6196)) {
                        if (!"Last-Modified".equalsIgnoreCase(method6196)) {
                            if (!"ETag".equalsIgnoreCase(method6196)) {
                                if ("Age".equalsIgnoreCase(method6196)) {
                                    this.field38587 = Class9558.method35766(method6197, -1);
                                }
                            }
                            else {
                                this.field38586 = method6197;
                            }
                        }
                        else {
                            this.field38581 = Class6525.method19743(method6197);
                            this.field38582 = method6197;
                        }
                    }
                    else {
                        this.field38583 = Class6525.method19743(method6197);
                    }
                }
                else {
                    this.field38579 = Class6525.method19743(method6197);
                    this.field38580 = method6197;
                }
            }
        }
    }
    
    public Class8016 method32937() {
        final Class8016 method32938 = this.method32938();
        if (method32938.field33021 != null && this.field38577.method29117().method20291()) {
            return new Class8016(null, null);
        }
        return method32938;
    }
    
    private Class8016 method32938() {
        if (this.field38578 == null) {
            return new Class8016(this.field38577, null);
        }
        if (this.field38577.method29118() && this.field38578.method6191() == null) {
            return new Class8016(this.field38577, null);
        }
        if (!Class8016.method26271(this.field38578, this.field38577)) {
            return new Class8016(this.field38577, null);
        }
        final Class6668 method29117 = this.field38577.method29117();
        if (method29117.method20282() || method32942(this.field38577)) {
            return new Class8016(this.field38577, null);
        }
        final long method29118 = this.method32940();
        long a = this.method32939();
        if (method29117.method20284() != -1) {
            a = Math.min(a, TimeUnit.SECONDS.toMillis(method29117.method20284()));
        }
        long millis = 0L;
        if (method29117.method20290() != -1) {
            millis = TimeUnit.SECONDS.toMillis(method29117.method20290());
        }
        long millis2 = 0L;
        final Class6668 method29119 = this.field38578.method6204();
        if (!method29119.method20288()) {
            if (method29117.method20289() != -1) {
                millis2 = TimeUnit.SECONDS.toMillis(method29117.method20289());
            }
        }
        if (!method29119.method20282() && method29118 + millis < a + millis2) {
            final Class9189 method29120 = this.field38578.method6198();
            if (method29118 + millis >= a) {
                method29120.method33601("Warning", "110 HttpURLConnection \"Response is stale\"");
            }
            if (method29118 > 86400000L) {
                if (this.method32941()) {
                    method29120.method33601("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                }
            }
            return new Class8016(null, method29120.method33612());
        }
        String s;
        String s2;
        if (this.field38586 == null) {
            if (this.field38581 == null) {
                if (this.field38579 == null) {
                    return new Class8016(this.field38577, null);
                }
                s = "If-Modified-Since";
                s2 = this.field38580;
            }
            else {
                s = "If-Modified-Since";
                s2 = this.field38582;
            }
        }
        else {
            s = "If-None-Match";
            s2 = this.field38586;
        }
        final Class8640 method29121 = this.field38577.method29111().method21366();
        Class9013.field38043.method32265(method29121, s, s2);
        return new Class8016(this.field38577.method29116().method31315(method29121.method29384()).method31326(), this.field38578);
    }
    
    private long method32939() {
        final Class6668 method6204 = this.field38578.method6204();
        if (method6204.method20284() != -1) {
            return TimeUnit.SECONDS.toMillis(method6204.method20284());
        }
        if (this.field38583 != null) {
            final long n = this.field38583.getTime() - ((this.field38579 == null) ? this.field38585 : this.field38579.getTime());
            return (n <= 0L) ? 0L : n;
        }
        if (this.field38581 != null && this.field38578.method6186().method29109().method30947() == null) {
            final long n2 = ((this.field38579 == null) ? this.field38584 : this.field38579.getTime()) - this.field38581.getTime();
            return (n2 <= 0L) ? 0L : (n2 / 10L);
        }
        return 0L;
    }
    
    private long method32940() {
        final long a = (this.field38579 == null) ? 0L : Math.max(0L, this.field38585 - this.field38579.getTime());
        return ((this.field38587 == -1) ? a : Math.max(a, TimeUnit.SECONDS.toMillis(this.field38587))) + (this.field38585 - this.field38584) + (this.field38576 - this.field38585);
    }
    
    private boolean method32941() {
        return this.field38578.method6204().method20284() == -1 && this.field38583 == null;
    }
    
    private static boolean method32942(final Class8596 class8596) {
        return class8596.method29112("If-Modified-Since") != null || class8596.method29112("If-None-Match") != null;
    }
}
