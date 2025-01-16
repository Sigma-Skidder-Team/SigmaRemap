// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7093 extends Class7094
{
    public static final String[] field27604;
    public static final String[] field27605;
    
    public Class7093(final String s, final String s2, final int n) {
        super(s, Class7093.field27604, s2, Class7093.field27605, n);
    }
    
    public boolean method21673() {
        return this.method21680() == 0;
    }
    
    public boolean method21674() {
        return this.method21680() == 1;
    }
    
    public boolean method21675() {
        return this.method21680() == 2;
    }
    
    public boolean method21676() {
        return this.method21680() == 3;
    }
    
    @Override
    public boolean method21677(String s) {
        if (Config.equals(s, "none")) {
            s = "off";
        }
        return super.method21677(s);
    }
    
    static {
        field27604 = new String[] { "default", "fast", "fancy", Class7093.\u9e69\uc10a\u3b79\u387d\uca70\u0c32[1] };
        field27605 = new String[] { "Default", "Fast", "Fancy", "OFF" };
    }
}
