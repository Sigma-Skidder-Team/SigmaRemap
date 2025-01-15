// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;
import java.net.IDN;

public class Class7872
{
    private final String field32316;
    private final int field32317;
    
    private Class7872(final String field32316, final int field32317) {
        this.field32316 = field32316;
        this.field32317 = field32317;
    }
    
    public String method25492() {
        try {
            return IDN.toASCII(this.field32316);
        }
        catch (final IllegalArgumentException ex) {
            return "";
        }
    }
    
    public int method25493() {
        return this.field32317;
    }
    
    public static Class7872 method25494(final String s) {
        if (s != null) {
            String[] split = s.split(":");
            if (s.startsWith("[")) {
                final int index = s.indexOf("]");
                if (index > 0) {
                    final String substring = s.substring(1, index);
                    final String trim = s.substring(index + 1).trim();
                    if (trim.startsWith(":") && !trim.isEmpty()) {
                        split = new String[] { substring, trim.substring(1) };
                    }
                    else {
                        split = new String[] { substring };
                    }
                }
            }
            if (split.length > 2) {
                split = new String[] { s };
            }
            String s2 = split[0];
            int method25496 = (split.length <= 1) ? 25565 : method25496(split[1], 25565);
            if (method25496 == 25565) {
                final String[] method25497 = method25495(s2);
                s2 = method25497[0];
                method25496 = method25496(method25497[1], 25565);
            }
            return new Class7872(s2, method25496);
        }
        return null;
    }
    
    private static String[] method25495(final String str) {
        try {
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            final Hashtable environment = new Hashtable();
            environment.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            environment.put("java.naming.provider.url", "dns:");
            environment.put("com.sun.jndi.dns.timeout.retries", "1");
            final String[] split = new InitialDirContext(environment).getAttributes("_minecraft._tcp." + str, new String[] { "SRV" }).get("srv").get().toString().split(" ", 4);
            return new String[] { split[3], split[2] };
        }
        catch (final Throwable t) {
            return new String[] { str, Integer.toString(25565) };
        }
    }
    
    private static int method25496(final String s, final int n) {
        try {
            return Integer.parseInt(s.trim());
        }
        catch (final Exception ex) {
            return n;
        }
    }
}
