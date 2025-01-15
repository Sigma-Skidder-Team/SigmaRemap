// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9157
{
    private static String[] field38794;
    private int field38795;
    private int field38796;
    private int field38797;
    private double field38798;
    private double field38799;
    private double field38800;
    private byte[] field38801;
    private boolean field38802;
    
    public Class9157() {
        this.field38801 = new byte[0];
        this.field38795 = 0;
        this.field38796 = 0;
        this.field38797 = 0;
        this.field38802 = true;
    }
    
    public byte[] method33417() {
        return this.field38801;
    }
    
    public int method33418() {
        return this.field38795;
    }
    
    public int method33419() {
        return this.field38796;
    }
    
    public int method33420() {
        return this.field38797;
    }
    
    public double method33421() {
        return this.field38798;
    }
    
    public double method33422() {
        return this.field38799;
    }
    
    public double method33423() {
        return this.field38800;
    }
    
    public boolean method33424() {
        return this.field38802;
    }
    
    public void method33425(final boolean field38802) {
        if (field38802 != this.field38802) {
            for (int i = 0; i < this.field38801.length; i += 2) {
                final byte b = this.field38801[i];
                this.field38801[i] = this.field38801[i + 1];
                this.field38801[i + 1] = b;
            }
            this.field38802 = field38802;
        }
    }
    
    public void method33426(final byte[] field38801, final int field38802, final int field38803, final int field38804, final int n) {
        this.field38801 = field38801;
        this.field38795 = field38802;
        this.field38796 = field38803;
        this.field38797 = field38804;
        if (field38802 != 0) {
            final int n2 = field38801.length / (field38804 / 8 * field38803);
            this.field38798 = n2 / (double)field38802;
            this.field38799 = n2 * field38804 * field38803 / this.field38798;
            this.field38800 = n / this.field38798;
        }
        else {
            this.field38798 = 0.0;
            this.field38799 = 0.0;
            this.field38800 = 0.0;
        }
    }
}
