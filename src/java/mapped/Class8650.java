// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8650
{
    private static String[] field36305;
    private int field36306;
    private int field36307;
    private int field36308;
    private int field36309;
    private int field36310;
    private int field36311;
    private byte[][][] field36312;
    private byte[] field36313;
    private int field36314;
    
    public Class8650(final int field36306, final int field36307, final int field36308) {
        this.field36306 = 18;
        this.field36307 = 128;
        this.field36308 = 18;
        this.field36309 = 0;
        this.field36310 = 0;
        this.field36311 = 0;
        this.field36312 = null;
        this.field36313 = null;
        this.field36314 = 0;
        this.field36306 = field36306;
        this.field36307 = field36307;
        this.field36308 = field36308;
        this.field36312 = new byte[field36306][field36307][field36308];
        this.method29432();
    }
    
    public void method29432() {
        for (int i = 0; i < this.field36306; ++i) {
            final byte[][] array = this.field36312[i];
            for (int j = 0; j < this.field36307; ++j) {
                final byte[] array2 = array[j];
                for (int k = 0; k < this.field36308; ++k) {
                    array2[k] = -1;
                }
            }
        }
    }
    
    public void method29433(final int field36309, final int field36310, final int field36311) {
        this.field36309 = field36309;
        this.field36310 = field36310;
        this.field36311 = field36311;
        this.method29432();
    }
    
    public byte method29434(final int n, final int n2, final int n3) {
        try {
            this.field36313 = this.field36312[n - this.field36309][n2 - this.field36310];
            this.field36314 = n3 - this.field36311;
            return this.field36313[this.field36314];
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            return -1;
        }
    }
    
    public void method29435(final byte b) {
        try {
            this.field36313[this.field36314] = b;
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
}
