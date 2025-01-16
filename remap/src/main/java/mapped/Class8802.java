// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8802
{
    private int field36998;
    private int[] field36999;
    
    public Class8802(final int field36998) {
        this.field36998 = -1;
        this.field36999 = null;
        this.field36998 = field36998;
    }
    
    public Class8802(final int field36998, final int n) {
        this.field36998 = -1;
        this.field36999 = null;
        this.field36998 = field36998;
        if (n >= 0) {
            this.field36999 = new int[] { n };
        }
    }
    
    public Class8802(final int field36998, final int[] field36999) {
        this.field36998 = -1;
        this.field36999 = null;
        this.field36998 = field36998;
        this.field36999 = field36999;
    }
    
    public int method30709() {
        return this.field36998;
    }
    
    public int[] method30710() {
        return this.field36999;
    }
    
    public boolean method30711(final BlockState class7096) {
        return class7096.getBlockId() == this.field36998 && Class7980.method26017(class7096.getMetadata(), this.field36999);
    }
    
    public boolean method30712(final int n, final int n2) {
        return n == this.field36998 && Class7980.method26017(n2, this.field36999);
    }
    
    public void method30713(final int n) {
        if (this.field36999 != null) {
            if (n >= 0) {
                for (int i = 0; i < this.field36999.length; ++i) {
                    if (this.field36999[i] == n) {
                        return;
                    }
                }
                this.field36999 = Config.method28997(this.field36999, n);
            }
        }
    }
    
    public void method30714(final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            this.method30713(array[i]);
        }
    }
    
    @Override
    public String toString() {
        return "" + this.field36998 + ":" + Config.method28890(this.field36999);
    }
}
