// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8891
{
    private static String[] field37393;
    private int field37394;
    private int field37395;
    
    public Class8891(final int n) {
        this.field37394 = n;
        this.field37395 = n;
    }
    
    public synchronized int method31287() {
        return this.field37395++;
    }
    
    public synchronized void method31288() {
        this.field37395 = this.field37394;
    }
    
    public int method31289() {
        return this.field37395;
    }
}
