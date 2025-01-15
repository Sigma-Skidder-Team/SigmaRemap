// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class883 implements Runnable
{
    private static String[] field4763;
    public final /* synthetic */ int field4764;
    public final /* synthetic */ int field4765;
    public final /* synthetic */ int field4766;
    public final /* synthetic */ int field4767;
    public final /* synthetic */ double[] field4768;
    public final /* synthetic */ boolean field4769;
    public final /* synthetic */ Class8983 field4770;
    
    public Class883(final Class8983 field4770, final int field4771, final int field4772, final int field4773, final int field4774, final double[] field4775, final boolean field4776) {
        this.field4770 = field4770;
        this.field4764 = field4771;
        this.field4765 = field4772;
        this.field4766 = field4773;
        this.field4767 = field4774;
        this.field4768 = field4775;
        this.field4769 = field4776;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field4764];
        if (this.field4765 != -1) {
            if (Class8983.method31979(this.field4770) <= 4 * this.field4766) {
                if (Class8983.method31979(this.field4770) != 4 * this.field4766) {
                    if (Class8983.method31979(this.field4770) == 2 * this.field4766) {
                        for (int i = 0; i < Class8983.method31976(this.field4770); ++i) {
                            final int n = i * Class8983.method31979(this.field4770) + 2 * this.field4767;
                            final int n2 = 2 * i;
                            array[n2] = this.field4768[n];
                            array[n2 + 1] = this.field4768[n + 1];
                        }
                        Class8983.method31977(this.field4770).method26078(array, 0, this.field4769);
                        for (int j = 0; j < Class8983.method31976(this.field4770); ++j) {
                            final int n3 = j * Class8983.method31979(this.field4770) + 2 * this.field4767;
                            final int n4 = 2 * j;
                            this.field4768[n3] = array[n4];
                            this.field4768[n3 + 1] = array[n4 + 1];
                        }
                    }
                }
                else {
                    for (int k = 0; k < Class8983.method31976(this.field4770); ++k) {
                        final int n5 = k * Class8983.method31979(this.field4770) + 4 * this.field4767;
                        final int n6 = 2 * k;
                        final int n7 = 2 * Class8983.method31976(this.field4770) + 2 * k;
                        array[n6] = this.field4768[n5];
                        array[n6 + 1] = this.field4768[n5 + 1];
                        array[n7] = this.field4768[n5 + 2];
                        array[n7 + 1] = this.field4768[n5 + 3];
                    }
                    Class8983.method31977(this.field4770).method26078(array, 0, this.field4769);
                    Class8983.method31977(this.field4770).method26078(array, 2 * Class8983.method31976(this.field4770), this.field4769);
                    for (int l = 0; l < Class8983.method31976(this.field4770); ++l) {
                        final int n8 = l * Class8983.method31979(this.field4770) + 4 * this.field4767;
                        final int n9 = 2 * l;
                        final int n10 = 2 * Class8983.method31976(this.field4770) + 2 * l;
                        this.field4768[n8] = array[n9];
                        this.field4768[n8 + 1] = array[n9 + 1];
                        this.field4768[n8 + 2] = array[n10];
                        this.field4768[n8 + 3] = array[n10 + 1];
                    }
                }
            }
            else {
                for (int n11 = 8 * this.field4767; n11 < Class8983.method31979(this.field4770); n11 += 8 * this.field4766) {
                    for (int n12 = 0; n12 < Class8983.method31976(this.field4770); ++n12) {
                        final int n13 = n12 * Class8983.method31979(this.field4770) + n11;
                        final int n14 = 2 * n12;
                        final int n15 = 2 * Class8983.method31976(this.field4770) + 2 * n12;
                        final int n16 = n15 + 2 * Class8983.method31976(this.field4770);
                        final int n17 = n16 + 2 * Class8983.method31976(this.field4770);
                        array[n14] = this.field4768[n13];
                        array[n14 + 1] = this.field4768[n13 + 1];
                        array[n15] = this.field4768[n13 + 2];
                        array[n15 + 1] = this.field4768[n13 + 3];
                        array[n16] = this.field4768[n13 + 4];
                        array[n16 + 1] = this.field4768[n13 + 5];
                        array[n17] = this.field4768[n13 + 6];
                        array[n17 + 1] = this.field4768[n13 + 7];
                    }
                    Class8983.method31977(this.field4770).method26078(array, 0, this.field4769);
                    Class8983.method31977(this.field4770).method26078(array, 2 * Class8983.method31976(this.field4770), this.field4769);
                    Class8983.method31977(this.field4770).method26078(array, 4 * Class8983.method31976(this.field4770), this.field4769);
                    Class8983.method31977(this.field4770).method26078(array, 6 * Class8983.method31976(this.field4770), this.field4769);
                    for (int n18 = 0; n18 < Class8983.method31976(this.field4770); ++n18) {
                        final int n19 = n18 * Class8983.method31979(this.field4770) + n11;
                        final int n20 = 2 * n18;
                        final int n21 = 2 * Class8983.method31976(this.field4770) + 2 * n18;
                        final int n22 = n21 + 2 * Class8983.method31976(this.field4770);
                        final int n23 = n22 + 2 * Class8983.method31976(this.field4770);
                        this.field4768[n19] = array[n20];
                        this.field4768[n19 + 1] = array[n20 + 1];
                        this.field4768[n19 + 2] = array[n21];
                        this.field4768[n19 + 3] = array[n21 + 1];
                        this.field4768[n19 + 4] = array[n22];
                        this.field4768[n19 + 5] = array[n22 + 1];
                        this.field4768[n19 + 6] = array[n23];
                        this.field4768[n19 + 7] = array[n23 + 1];
                    }
                }
            }
        }
        else if (Class8983.method31979(this.field4770) <= 4 * this.field4766) {
            if (Class8983.method31979(this.field4770) != 4 * this.field4766) {
                if (Class8983.method31979(this.field4770) == 2 * this.field4766) {
                    for (int n24 = 0; n24 < Class8983.method31976(this.field4770); ++n24) {
                        final int n25 = n24 * Class8983.method31979(this.field4770) + 2 * this.field4767;
                        final int n26 = 2 * n24;
                        array[n26] = this.field4768[n25];
                        array[n26 + 1] = this.field4768[n25 + 1];
                    }
                    Class8983.method31977(this.field4770).method26074(array, 0);
                    for (int n27 = 0; n27 < Class8983.method31976(this.field4770); ++n27) {
                        final int n28 = n27 * Class8983.method31979(this.field4770) + 2 * this.field4767;
                        final int n29 = 2 * n27;
                        this.field4768[n28] = array[n29];
                        this.field4768[n28 + 1] = array[n29 + 1];
                    }
                }
            }
            else {
                for (int n30 = 0; n30 < Class8983.method31976(this.field4770); ++n30) {
                    final int n31 = n30 * Class8983.method31979(this.field4770) + 4 * this.field4767;
                    final int n32 = 2 * n30;
                    final int n33 = 2 * Class8983.method31976(this.field4770) + 2 * n30;
                    array[n32] = this.field4768[n31];
                    array[n32 + 1] = this.field4768[n31 + 1];
                    array[n33] = this.field4768[n31 + 2];
                    array[n33 + 1] = this.field4768[n31 + 3];
                }
                Class8983.method31977(this.field4770).method26074(array, 0);
                Class8983.method31977(this.field4770).method26074(array, 2 * Class8983.method31976(this.field4770));
                for (int n34 = 0; n34 < Class8983.method31976(this.field4770); ++n34) {
                    final int n35 = n34 * Class8983.method31979(this.field4770) + 4 * this.field4767;
                    final int n36 = 2 * n34;
                    final int n37 = 2 * Class8983.method31976(this.field4770) + 2 * n34;
                    this.field4768[n35] = array[n36];
                    this.field4768[n35 + 1] = array[n36 + 1];
                    this.field4768[n35 + 2] = array[n37];
                    this.field4768[n35 + 3] = array[n37 + 1];
                }
            }
        }
        else {
            for (int n38 = 8 * this.field4767; n38 < Class8983.method31979(this.field4770); n38 += 8 * this.field4766) {
                for (int n39 = 0; n39 < Class8983.method31976(this.field4770); ++n39) {
                    final int n40 = n39 * Class8983.method31979(this.field4770) + n38;
                    final int n41 = 2 * n39;
                    final int n42 = 2 * Class8983.method31976(this.field4770) + 2 * n39;
                    final int n43 = n42 + 2 * Class8983.method31976(this.field4770);
                    final int n44 = n43 + 2 * Class8983.method31976(this.field4770);
                    array[n41] = this.field4768[n40];
                    array[n41 + 1] = this.field4768[n40 + 1];
                    array[n42] = this.field4768[n40 + 2];
                    array[n42 + 1] = this.field4768[n40 + 3];
                    array[n43] = this.field4768[n40 + 4];
                    array[n43 + 1] = this.field4768[n40 + 5];
                    array[n44] = this.field4768[n40 + 6];
                    array[n44 + 1] = this.field4768[n40 + 7];
                }
                Class8983.method31977(this.field4770).method26074(array, 0);
                Class8983.method31977(this.field4770).method26074(array, 2 * Class8983.method31976(this.field4770));
                Class8983.method31977(this.field4770).method26074(array, 4 * Class8983.method31976(this.field4770));
                Class8983.method31977(this.field4770).method26074(array, 6 * Class8983.method31976(this.field4770));
                for (int n45 = 0; n45 < Class8983.method31976(this.field4770); ++n45) {
                    final int n46 = n45 * Class8983.method31979(this.field4770) + n38;
                    final int n47 = 2 * n45;
                    final int n48 = 2 * Class8983.method31976(this.field4770) + 2 * n45;
                    final int n49 = n48 + 2 * Class8983.method31976(this.field4770);
                    final int n50 = n49 + 2 * Class8983.method31976(this.field4770);
                    this.field4768[n46] = array[n47];
                    this.field4768[n46 + 1] = array[n47 + 1];
                    this.field4768[n46 + 2] = array[n48];
                    this.field4768[n46 + 3] = array[n48 + 1];
                    this.field4768[n46 + 4] = array[n49];
                    this.field4768[n46 + 5] = array[n49 + 1];
                    this.field4768[n46 + 6] = array[n50];
                    this.field4768[n46 + 7] = array[n50 + 1];
                }
            }
        }
    }
}
