// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6684
{
    private boolean field26372;
    private int field26373;
    private float field26374;
    
    public Class6684() {
        this(false, 519, 0.0f);
    }
    
    public Class6684(final boolean b) {
        this(b, 519, 0.0f);
    }
    
    public Class6684(final boolean field26372, final int field26373, final float field26374) {
        this.field26372 = field26372;
        this.field26373 = field26373;
        this.field26374 = field26374;
    }
    
    public void method20326(final boolean field26372, final int field26373, final float field26374) {
        this.field26372 = field26372;
        this.field26373 = field26373;
        this.field26374 = field26374;
    }
    
    public void method20327(final Class6684 class6684) {
        this.field26372 = class6684.field26372;
        this.field26373 = class6684.field26373;
        this.field26374 = class6684.field26374;
    }
    
    public void method20328(final int field26373, final float field26374) {
        this.field26373 = field26373;
        this.field26374 = field26374;
    }
    
    public void method20329(final boolean field26372) {
        this.field26372 = field26372;
    }
    
    public void method20330() {
        this.field26372 = true;
    }
    
    public void method20331() {
        this.field26372 = false;
    }
    
    public boolean method20332() {
        return this.field26372;
    }
    
    public int method20333() {
        return this.field26373;
    }
    
    public float method20334() {
        return this.field26374;
    }
    
    @Override
    public String toString() {
        return "enabled: " + this.field26372 + ", func: " + this.field26373 + ", ref: " + this.field26374;
    }
}
