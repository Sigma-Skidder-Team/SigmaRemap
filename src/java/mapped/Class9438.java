// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9438
{
    private static String[] field40469;
    private final Class231 field40470;
    private int field40471;
    private int field40472;
    private final int field40473;
    
    public Class9438(final Class231 field40470, final int n, final int field40471) {
        this.field40470 = field40470;
        this.field40471 = n;
        this.field40472 = n;
        this.field40473 = field40471;
    }
    
    public void method35072(final int n) {
        if (n >= this.field40471) {
            if (n > this.field40472) {
                this.field40472 = n;
            }
        }
        else {
            this.field40471 = n;
        }
    }
    
    public Class231 method35073() {
        return this.field40470;
    }
    
    public int method35074() {
        return this.field40471;
    }
    
    public int method35075() {
        return this.field40472;
    }
    
    public int method35076() {
        return this.field40473;
    }
}
