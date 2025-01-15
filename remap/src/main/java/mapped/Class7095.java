// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7095 extends Class7094
{
    public static final String[] field27613;
    public static final String[] field27614;
    
    public Class7095(final String s, final String s2, final int n) {
        super(s, Class7095.field27613, s2, Class7095.field27614, n);
    }
    
    @Override
    public String method21681() {
        if (this.method21688()) {
            return Class4647.method13882();
        }
        if (!this.method21689()) {
            return this.method21690() ? Class4647.method13879() : super.method21681();
        }
        return Class4647.method13878();
    }
    
    public boolean method21688() {
        return this.method21680() == 0;
    }
    
    public boolean method21689() {
        return this.method21680() == 1;
    }
    
    public boolean method21690() {
        return this.method21680() == 2;
    }
    
    static {
        field27613 = new String[] { "default", "true", "false" };
        field27614 = new String[] { "Default", "ON", "OFF" };
    }
}
