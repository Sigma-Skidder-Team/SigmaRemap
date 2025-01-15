// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8032
{
    private static String[] field33060;
    public long field33061;
    public long field33062;
    
    public Class8032() {
        this.field33061 = 0L;
        this.field33062 = 0L;
    }
    
    public void method26344() {
        if (Class9036.field38219) {
            if (this.field33061 == 0L) {
                this.field33061 = System.nanoTime();
            }
        }
    }
    
    public void method26345() {
        if (Class9036.field38219) {
            if (this.field33061 != 0L) {
                this.field33062 += System.nanoTime() - this.field33061;
                this.field33061 = 0L;
            }
        }
    }
    
    private void method26346() {
        this.field33062 = 0L;
        this.field33061 = 0L;
    }
}
