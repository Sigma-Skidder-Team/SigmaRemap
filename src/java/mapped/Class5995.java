// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5995
{
    private Boolean field24468;
    
    public Class5995() {
        this.field24468 = null;
    }
    
    public boolean method17921() {
        if (this.field24468 == null) {
            this.field24468 = System.getProperty("java.runtime.name").startsWith("Android Runtime");
        }
        return this.field24468;
    }
}
