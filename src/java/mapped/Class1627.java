// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1627 implements Runnable
{
    private static String[] field9091;
    public final /* synthetic */ int field9092;
    public final /* synthetic */ int field9093;
    public final /* synthetic */ int field9094;
    public final /* synthetic */ int field9095;
    public final /* synthetic */ double[][] field9096;
    public final /* synthetic */ boolean field9097;
    public final /* synthetic */ Class9033 field9098;
    
    public Class1627(final Class9033 field9098, final int field9099, final int field9100, final int field9101, final int field9102, final double[][] field9103, final boolean field9104) {
        this.field9098 = field9098;
        this.field9092 = field9099;
        this.field9093 = field9100;
        this.field9094 = field9101;
        this.field9095 = field9102;
        this.field9096 = field9103;
        this.field9097 = field9104;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field9092];
        if (Class9033.method32451(this.field9098) <= 2) {
            if (Class9033.method32451(this.field9098) == 2) {
                for (int i = 0; i < Class9033.method32453(this.field9098); ++i) {
                    final int n = i;
                    array[n] = this.field9096[i][2 * this.field9094];
                    array[n + Class9033.method32453(this.field9098)] = this.field9096[i][2 * this.field9094 + 1];
                }
                if (this.field9093 != -1) {
                    Class9033.method32454(this.field9098).method18042(array, 0, this.field9097);
                    Class9033.method32454(this.field9098).method18042(array, Class9033.method32453(this.field9098), this.field9097);
                }
                else {
                    Class9033.method32454(this.field9098).method18038(array, 0, this.field9097);
                    Class9033.method32454(this.field9098).method18038(array, Class9033.method32453(this.field9098), this.field9097);
                }
                for (int j = 0; j < Class9033.method32453(this.field9098); ++j) {
                    final int n2 = j;
                    this.field9096[j][2 * this.field9094] = array[n2];
                    this.field9096[j][2 * this.field9094 + 1] = array[n2 + Class9033.method32453(this.field9098)];
                }
            }
        }
        else if (this.field9093 != -1) {
            for (int k = 4 * this.field9094; k < Class9033.method32451(this.field9098); k += 4 * this.field9095) {
                for (int l = 0; l < Class9033.method32453(this.field9098); ++l) {
                    final int n3 = Class9033.method32453(this.field9098) + l;
                    array[l] = this.field9096[l][k];
                    array[n3] = this.field9096[l][k + 1];
                    array[n3 + Class9033.method32453(this.field9098)] = this.field9096[l][k + 2];
                    array[n3 + 2 * Class9033.method32453(this.field9098)] = this.field9096[l][k + 3];
                }
                Class9033.method32454(this.field9098).method18042(array, 0, this.field9097);
                Class9033.method32454(this.field9098).method18042(array, Class9033.method32453(this.field9098), this.field9097);
                Class9033.method32454(this.field9098).method18042(array, 2 * Class9033.method32453(this.field9098), this.field9097);
                Class9033.method32454(this.field9098).method18042(array, 3 * Class9033.method32453(this.field9098), this.field9097);
                for (int n4 = 0; n4 < Class9033.method32453(this.field9098); ++n4) {
                    final int n5 = Class9033.method32453(this.field9098) + n4;
                    this.field9096[n4][k] = array[n4];
                    this.field9096[n4][k + 1] = array[n5];
                    this.field9096[n4][k + 2] = array[n5 + Class9033.method32453(this.field9098)];
                    this.field9096[n4][k + 3] = array[n5 + 2 * Class9033.method32453(this.field9098)];
                }
            }
        }
        else {
            for (int n6 = 4 * this.field9094; n6 < Class9033.method32451(this.field9098); n6 += 4 * this.field9095) {
                for (int n7 = 0; n7 < Class9033.method32453(this.field9098); ++n7) {
                    final int n8 = Class9033.method32453(this.field9098) + n7;
                    array[n7] = this.field9096[n7][n6];
                    array[n8] = this.field9096[n7][n6 + 1];
                    array[n8 + Class9033.method32453(this.field9098)] = this.field9096[n7][n6 + 2];
                    array[n8 + 2 * Class9033.method32453(this.field9098)] = this.field9096[n7][n6 + 3];
                }
                Class9033.method32454(this.field9098).method18038(array, 0, this.field9097);
                Class9033.method32454(this.field9098).method18038(array, Class9033.method32453(this.field9098), this.field9097);
                Class9033.method32454(this.field9098).method18038(array, 2 * Class9033.method32453(this.field9098), this.field9097);
                Class9033.method32454(this.field9098).method18038(array, 3 * Class9033.method32453(this.field9098), this.field9097);
                for (int n9 = 0; n9 < Class9033.method32453(this.field9098); ++n9) {
                    final int n10 = Class9033.method32453(this.field9098) + n9;
                    this.field9096[n9][n6] = array[n9];
                    this.field9096[n9][n6 + 1] = array[n10];
                    this.field9096[n9][n6 + 2] = array[n10 + Class9033.method32453(this.field9098)];
                    this.field9096[n9][n6 + 3] = array[n10 + 2 * Class9033.method32453(this.field9098)];
                }
            }
        }
    }
}
