// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.LinkedHashMap;
import java.util.Map;

public class Class8215
{
    private static String[] field33757;
    private int field33758;
    private String field33759;
    private Map<String, String> field33760;
    private byte[] field33761;
    
    public Class8215(final int field33758, final String field33759, final Map field33760, final byte[] field33761) {
        this.field33758 = 0;
        this.field33759 = null;
        this.field33760 = new LinkedHashMap<String, String>();
        this.field33761 = null;
        this.field33758 = field33758;
        this.field33759 = field33759;
        this.field33760 = field33760;
        this.field33761 = field33761;
    }
    
    public int method27216() {
        return this.field33758;
    }
    
    public String method27217() {
        return this.field33759;
    }
    
    public Map method27218() {
        return this.field33760;
    }
    
    public String method27219(final String s) {
        return this.field33760.get(s);
    }
    
    public byte[] method27220() {
        return this.field33761;
    }
}
