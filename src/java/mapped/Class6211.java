// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6211
{
    private static String[] field25056;
    private int[] field25057;
    private int field25058;
    private int field25059;
    
    public Class6211(final int n) {
        this.field25057 = null;
        this.field25058 = 0;
        this.field25059 = 0;
        this.field25057 = new int[n];
    }
    
    public void method18476(final int n) {
        this.field25057[this.field25058] = n;
        ++this.field25058;
        if (this.field25059 < this.field25058) {
            this.field25059 = this.field25058;
        }
    }
    
    public void method18477(final int field25059, final int n) {
        this.field25057[field25059] = n;
        if (this.field25059 < field25059) {
            this.field25059 = field25059;
        }
    }
    
    public void method18478(final int field25058) {
        this.field25058 = field25058;
    }
    
    public void method18479(final int[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            this.field25057[this.field25058] = array[i];
            ++this.field25058;
        }
        if (this.field25059 < this.field25058) {
            this.field25059 = this.field25058;
        }
    }
    
    public int method18480(final int n) {
        return this.field25057[n];
    }
    
    public int[] method18481() {
        return this.field25057;
    }
    
    public void method18482() {
        this.field25058 = 0;
        this.field25059 = 0;
    }
    
    public int method18483() {
        return this.field25059;
    }
    
    public int method18484() {
        return this.field25058;
    }
}
