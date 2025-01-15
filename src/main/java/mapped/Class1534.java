// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1534 implements Runnable
{
    private static String[] field8563;
    public final /* synthetic */ int field8564;
    public final /* synthetic */ int field8565;
    public final /* synthetic */ int field8566;
    public final /* synthetic */ int field8567;
    public final /* synthetic */ double[] field8568;
    public final /* synthetic */ boolean field8569;
    public final /* synthetic */ Class9033 field8570;
    
    public Class1534(final Class9033 field8570, final int field8571, final int field8572, final int field8573, final int field8574, final double[] field8575, final boolean field8576) {
        this.field8570 = field8570;
        this.field8564 = field8571;
        this.field8565 = field8572;
        this.field8566 = field8573;
        this.field8567 = field8574;
        this.field8568 = field8575;
        this.field8569 = field8576;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field8564];
        if (Class9033.method32451(this.field8570) <= 2) {
            if (Class9033.method32451(this.field8570) == 2) {
                for (int i = 0; i < Class9033.method32453(this.field8570); ++i) {
                    final int n = i * Class9033.method32451(this.field8570) + 2 * this.field8566;
                    final int n2 = i;
                    array[n2] = this.field8568[n];
                    array[n2 + Class9033.method32453(this.field8570)] = this.field8568[n + 1];
                }
                if (this.field8565 != -1) {
                    Class9033.method32454(this.field8570).method18042(array, 0, this.field8569);
                    Class9033.method32454(this.field8570).method18042(array, Class9033.method32453(this.field8570), this.field8569);
                }
                else {
                    Class9033.method32454(this.field8570).method18038(array, 0, this.field8569);
                    Class9033.method32454(this.field8570).method18038(array, Class9033.method32453(this.field8570), this.field8569);
                }
                for (int j = 0; j < Class9033.method32453(this.field8570); ++j) {
                    final int n3 = j * Class9033.method32451(this.field8570) + 2 * this.field8566;
                    final int n4 = j;
                    this.field8568[n3] = array[n4];
                    this.field8568[n3 + 1] = array[n4 + Class9033.method32453(this.field8570)];
                }
            }
        }
        else if (this.field8565 != -1) {
            for (int k = 4 * this.field8566; k < Class9033.method32451(this.field8570); k += 4 * this.field8567) {
                for (int l = 0; l < Class9033.method32453(this.field8570); ++l) {
                    final int n5 = l * Class9033.method32451(this.field8570) + k;
                    final int n6 = Class9033.method32453(this.field8570) + l;
                    array[l] = this.field8568[n5];
                    array[n6] = this.field8568[n5 + 1];
                    array[n6 + Class9033.method32453(this.field8570)] = this.field8568[n5 + 2];
                    array[n6 + 2 * Class9033.method32453(this.field8570)] = this.field8568[n5 + 3];
                }
                Class9033.method32454(this.field8570).method18040(array, this.field8569);
                Class9033.method32454(this.field8570).method18042(array, Class9033.method32453(this.field8570), this.field8569);
                Class9033.method32454(this.field8570).method18042(array, 2 * Class9033.method32453(this.field8570), this.field8569);
                Class9033.method32454(this.field8570).method18042(array, 3 * Class9033.method32453(this.field8570), this.field8569);
                for (int n7 = 0; n7 < Class9033.method32453(this.field8570); ++n7) {
                    final int n8 = n7 * Class9033.method32451(this.field8570) + k;
                    final int n9 = Class9033.method32453(this.field8570) + n7;
                    this.field8568[n8] = array[n7];
                    this.field8568[n8 + 1] = array[n9];
                    this.field8568[n8 + 2] = array[n9 + Class9033.method32453(this.field8570)];
                    this.field8568[n8 + 3] = array[n9 + 2 * Class9033.method32453(this.field8570)];
                }
            }
        }
        else {
            for (int n10 = 4 * this.field8566; n10 < Class9033.method32451(this.field8570); n10 += 4 * this.field8567) {
                for (int n11 = 0; n11 < Class9033.method32453(this.field8570); ++n11) {
                    final int n12 = n11 * Class9033.method32451(this.field8570) + n10;
                    final int n13 = Class9033.method32453(this.field8570) + n11;
                    array[n11] = this.field8568[n12];
                    array[n13] = this.field8568[n12 + 1];
                    array[n13 + Class9033.method32453(this.field8570)] = this.field8568[n12 + 2];
                    array[n13 + 2 * Class9033.method32453(this.field8570)] = this.field8568[n12 + 3];
                }
                Class9033.method32454(this.field8570).method18038(array, 0, this.field8569);
                Class9033.method32454(this.field8570).method18038(array, Class9033.method32453(this.field8570), this.field8569);
                Class9033.method32454(this.field8570).method18038(array, 2 * Class9033.method32453(this.field8570), this.field8569);
                Class9033.method32454(this.field8570).method18038(array, 3 * Class9033.method32453(this.field8570), this.field8569);
                for (int n14 = 0; n14 < Class9033.method32453(this.field8570); ++n14) {
                    final int n15 = n14 * Class9033.method32451(this.field8570) + n10;
                    final int n16 = Class9033.method32453(this.field8570) + n14;
                    this.field8568[n15] = array[n14];
                    this.field8568[n15 + 1] = array[n16];
                    this.field8568[n15 + 2] = array[n16 + Class9033.method32453(this.field8570)];
                    this.field8568[n15 + 3] = array[n16 + 2 * Class9033.method32453(this.field8570)];
                }
            }
        }
    }
}
