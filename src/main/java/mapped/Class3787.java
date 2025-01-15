// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Class3787 extends Class3703
{
    private int field17277;
    private int field17278;
    private long field17279;
    private byte[] field17280;
    private byte[] field17281;
    private Map<String, String> field17282;
    
    public Class3787() {
        super("OMA DRM Common Header Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        this.field17277 = class9131.method33135();
        this.field17278 = class9131.method33135();
        this.field17279 = class9131.method33137(8);
        final int n = (int)class9131.method33137(2);
        final int n2 = (int)class9131.method33137(2);
        int i = (int)class9131.method33137(2);
        class9131.method33138(this.field17280 = new byte[n]);
        class9131.method33138(this.field17281 = new byte[n2]);
        this.field17282 = new HashMap<String, String>();
        while (i > 0) {
            final String s = new String(class9131.method33142((int)this.method11491(class9131), 58));
            final String s2 = new String(class9131.method33142((int)this.method11491(class9131), 0));
            this.field17282.put(s, s2);
            i -= s.length() + s2.length() + 2;
        }
        this.method11502(class9131);
    }
    
    public int method11614() {
        return this.field17277;
    }
    
    public int method11615() {
        return this.field17278;
    }
    
    public long method11616() {
        return this.field17279;
    }
    
    public byte[] method11617() {
        return this.field17280;
    }
    
    public byte[] method11618() {
        return this.field17281;
    }
    
    public Map<String, String> method11619() {
        return this.field17282;
    }
}
