// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9075
{
    private boolean field38423;
    private int field38424;
    private int field38425;
    private int field38426;
    private int field38427;
    
    public Class9075() {
        this(false, 1, 0);
    }
    
    public Class9075(final boolean b) {
        this(b, 1, 0);
    }
    
    public Class9075(final boolean field38423, final int field38424, final int field38425, final int field38426, final int field38427) {
        this.field38423 = field38423;
        this.field38424 = field38424;
        this.field38425 = field38425;
        this.field38426 = field38426;
        this.field38427 = field38427;
    }
    
    public Class9075(final boolean b, final int n, final int n2) {
        this(b, n, n2, n, n2);
    }
    
    public void method32687(final boolean field38423, final int field38424, final int field38425, final int field38426, final int field38427) {
        this.field38423 = field38423;
        this.field38424 = field38424;
        this.field38425 = field38425;
        this.field38426 = field38426;
        this.field38427 = field38427;
    }
    
    public void method32688(final Class9075 class9075) {
        this.field38423 = class9075.field38423;
        this.field38424 = class9075.field38424;
        this.field38425 = class9075.field38425;
        this.field38426 = class9075.field38426;
        this.field38427 = class9075.field38427;
    }
    
    public void method32689(final boolean field38423) {
        this.field38423 = field38423;
    }
    
    public void method32690() {
        this.field38423 = true;
    }
    
    public void method32691() {
        this.field38423 = false;
    }
    
    public void method32692(final int n, final int n2) {
        this.field38424 = n;
        this.field38425 = n2;
        this.field38426 = n;
        this.field38427 = n2;
    }
    
    public void method32693(final int field38424, final int field38425, final int field38426, final int field38427) {
        this.field38424 = field38424;
        this.field38425 = field38425;
        this.field38426 = field38426;
        this.field38427 = field38427;
    }
    
    public boolean method32694() {
        return this.field38423;
    }
    
    public int method32695() {
        return this.field38424;
    }
    
    public int method32696() {
        return this.field38425;
    }
    
    public int method32697() {
        return this.field38426;
    }
    
    public int method32698() {
        return this.field38427;
    }
    
    public boolean method32699() {
        return this.field38424 != this.field38426 || this.field38425 != this.field38427;
    }
    
    @Override
    public String toString() {
        return "enabled: " + this.field38423 + ", src: " + this.field38424 + ", dst: " + this.field38425 + ", srcAlpha: " + this.field38426 + ", dstAlpha: " + this.field38427;
    }
}
