// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9328
{
    private static String[] field40038;
    private int field40039;
    private int field40040;
    private int field40041;
    private int field40042;
    private int field40043;
    private int field40044;
    private int[][][] field40045;
    private int[] field40046;
    private int field40047;
    
    public Class9328(final int field40039, final int field40040, final int field40041) {
        this.field40039 = 18;
        this.field40040 = 128;
        this.field40041 = 18;
        this.field40042 = 0;
        this.field40043 = 0;
        this.field40044 = 0;
        this.field40045 = null;
        this.field40046 = null;
        this.field40047 = 0;
        this.field40039 = field40039;
        this.field40040 = field40040;
        this.field40041 = field40041;
        this.field40045 = new int[field40039][field40040][field40041];
        this.method34560();
    }
    
    public void method34560() {
        for (int i = 0; i < this.field40039; ++i) {
            final int[][] array = this.field40045[i];
            for (int j = 0; j < this.field40040; ++j) {
                final int[] array2 = array[j];
                for (int k = 0; k < this.field40041; ++k) {
                    array2[k] = -1;
                }
            }
        }
    }
    
    public void method34561(final int field40042, final int field40043, final int field40044) {
        this.field40042 = field40042;
        this.field40043 = field40043;
        this.field40044 = field40044;
        this.method34560();
    }
    
    public int method34562(final int n, final int n2, final int n3) {
        try {
            this.field40046 = this.field40045[n - this.field40042][n2 - this.field40043];
            this.field40047 = n3 - this.field40044;
            return this.field40046[this.field40047];
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            return -1;
        }
    }
    
    public void method34563(final int n) {
        try {
            this.field40046[this.field40047] = n;
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
}
