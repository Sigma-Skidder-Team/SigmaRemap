// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7617
{
    private static String[] field30180;
    private long field30181;
    private long field30182;
    private boolean field30183;
    
    public Class7617() {
        this.field30181 = 0L;
        this.field30182 = 0L;
        this.field30183 = false;
    }
    
    public void method23932() {
        this.field30183 = true;
        this.field30181 = System.currentTimeMillis();
    }
    
    public void method23933() {
        this.field30183 = false;
    }
    
    public void method23934() {
        this.field30182 = 0L;
        this.field30181 = System.currentTimeMillis();
    }
    
    public long method23935() {
        if (this.field30183) {
            this.field30182 += System.currentTimeMillis() - this.field30181;
            this.field30181 = System.currentTimeMillis();
        }
        return this.field30182;
    }
    
    public void method23936(final long field30182) {
        this.field30181 = System.currentTimeMillis() - field30182;
        this.field30182 = field30182;
    }
    
    public boolean method23937() {
        return this.field30183;
    }
}
