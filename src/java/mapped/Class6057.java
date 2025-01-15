// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6057
{
    private static String[] field24619;
    private long field24620;
    private long field24621;
    private boolean field24622;
    public final /* synthetic */ Class8338 field24623;
    
    public Class6057(final Class8338 field24623) {
        this.field24623 = field24623;
        this.field24620 = 0L;
        this.field24621 = 0L;
        this.field24622 = false;
    }
    
    public void method18021() {
        this.field24622 = true;
        this.field24620 = System.currentTimeMillis();
    }
    
    public void method18022() {
        this.field24622 = false;
    }
    
    public void method18023() {
        this.field24621 = 0L;
        this.field24620 = System.currentTimeMillis();
    }
    
    public long method18024() {
        if (this.field24622) {
            this.field24621 += System.currentTimeMillis() - this.field24620;
            this.field24620 = System.currentTimeMillis();
        }
        return this.field24621;
    }
    
    public boolean method18025() {
        return this.field24622;
    }
}
