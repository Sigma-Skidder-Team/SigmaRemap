// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class Class6462
{
    private String field25680;
    private String field25681;
    private final Map<String, String> field25682;
    
    public String method19328() {
        return this.field25680;
    }
    
    public void method19329(final String field25680) {
        this.field25680 = field25680;
    }
    
    public String method19330() {
        return this.field25681;
    }
    
    public void method19331(final String field25681) {
        this.field25681 = field25681;
    }
    
    public Map<String, String> method19332() {
        return this.field25682;
    }
    
    public void method19333(final String s) {
        this.field25682.put(s, null);
    }
    
    public void method19334(final String s, final String s2) {
        this.field25682.put(s, s2);
    }
    
    public void method19335(final String s, final int i) {
        this.field25682.put(s, String.valueOf(i));
    }
    
    public Class6462() {
        this.field25682 = new HashMap<String, String>();
    }
    
    public Class6462(final String field25681) {
        this.field25682 = new HashMap<String, String>();
        this.field25681 = field25681;
    }
    
    public Class6462(final String field25681, final String field25682) {
        this.field25682 = new HashMap<String, String>();
        this.field25681 = field25681;
        this.field25680 = field25682;
    }
    
    public String method19336() {
        final StringBuilder sb = new StringBuilder();
        if (this.field25681 != null) {
            sb.append(this.field25681 + " ");
        }
        final Iterator<Map.Entry<String, String>> iterator = this.field25682.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<String, V> entry = (Map.Entry<String, V>)iterator.next();
            final String s = entry.getKey();
            String s2 = (String)entry.getValue();
            if (s2 == null) {
                s2 = "";
            }
            String str = String.format("--%s %s", s, s2).trim();
            if (s.length() == 1) {
                str = String.format("-%s %s", s, s2).trim();
            }
            sb.append(str + " ");
            iterator.remove();
        }
        return sb.toString().trim();
    }
}
