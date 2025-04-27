// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8344
{
    private static String[] field34251;
    private final int field34252;
    private final int field34253;
    private final int field34254;
    private final int field34255;
    
    public Class8344(final int field34252, final int field34253, final int field34254, final int field34255) {
        this.field34252 = field34252;
        this.field34253 = field34253;
        this.field34254 = field34254;
        this.field34255 = field34255;
    }
    
    public int method27808() {
        return this.field34252;
    }
    
    public int method27809() {
        return this.field34253;
    }
    
    public int method27810() {
        return this.field34254;
    }
    
    public int method27811() {
        return this.field34255;
    }
    
    public boolean method27812(final int n, final int n2) {
        if (n >= this.field34252) {
            if (n <= this.field34252 + this.field34254) {
                if (n2 >= this.field34253) {
                    return n2 <= this.field34253 + this.field34255;
                }
            }
        }
        return false;
    }
}
