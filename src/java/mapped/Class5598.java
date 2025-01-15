// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class5598 implements Class5597, Class5595, Class5599
{
    private static String[] field22879;
    public boolean field22880;
    public boolean field22881;
    public boolean field22882;
    public int field22883;
    public int field22884;
    public int field22885;
    public int field22886;
    public int field22887;
    public int field22888;
    public int field22889;
    public int[] field22890;
    public boolean[] field22891;
    public boolean[] field22892;
    public boolean field22893;
    public int field22894;
    public boolean[] field22895;
    public boolean[] field22896;
    public int[] field22897;
    public int[] field22898;
    public int[] field22899;
    public int[] field22900;
    public int[][] field22901;
    public int[][] field22902;
    public int[][] field22903;
    public int[][] field22904;
    public int[] field22905;
    public int[] field22906;
    public int[] field22907;
    public int[] field22908;
    public int field22909;
    public boolean field22910;
    public Class5596 field22911;
    public boolean field22912;
    public int field22913;
    public int field22914;
    public int field22915;
    public int field22916;
    public int field22917;
    public int field22918;
    public int[] field22919;
    public int[] field22920;
    public int field22921;
    public int[] field22922;
    public int[] field22923;
    public int[] field22924;
    public int[] field22925;
    public float[][][] field22926;
    public float[][][] field22927;
    public float[][][][] field22928;
    public float[][][][] field22929;
    public float field22930;
    public float field22931;
    public float[] field22932;
    public float[] field22933;
    public float[] field22934;
    public float[][] field22935;
    public float[][] field22936;
    public float[][] field22937;
    public float[][] field22938;
    public int field22939;
    public float[][][] field22940;
    public float[][][] field22941;
    
    public Class5598(final Class2077 class2077, final int field22913) {
        this.field22890 = new int[6];
        this.field22891 = new boolean[5];
        this.field22892 = new boolean[5];
        this.field22895 = new boolean[5];
        this.field22896 = new boolean[5];
        this.field22897 = new int[34];
        this.field22898 = new int[34];
        this.field22899 = new int[17];
        this.field22900 = new int[17];
        this.field22901 = new int[5][34];
        this.field22902 = new int[5][34];
        this.field22903 = new int[5][17];
        this.field22904 = new int[5][17];
        this.field22905 = new int[17];
        this.field22906 = new int[17];
        this.field22907 = new int[17];
        this.field22908 = new int[17];
        this.field22922 = new int[3];
        this.field22923 = new int[3];
        this.field22924 = new int[64];
        this.field22925 = new int[64];
        this.field22926 = new float[14][64][2];
        this.field22927 = new float[2][32][2];
        this.field22928 = new float[3][5][64][2];
        this.field22929 = new float[3][5][32][2];
        this.field22932 = new float[34];
        this.field22933 = new float[34];
        this.field22934 = new float[34];
        this.field22935 = new float[50][2];
        this.field22936 = new float[50][2];
        this.field22937 = new float[50][2];
        this.field22938 = new float[50][2];
        this.field22940 = new float[20][2][2];
        this.field22941 = new float[20][2][2];
        this.field22911 = new Class5596(field22913);
        this.field22913 = field22913;
        this.field22909 = 0;
        this.field22921 = 0;
        for (int i = 0; i < 64; ++i) {
            this.field22925[i] = 0;
        }
        for (int j = 0; j < 3; ++j) {
            this.field22922[j] = 0;
            this.field22923[j] = Class5598.field22839[j];
        }
        final int n = 35;
        this.field22917 = 22;
        this.field22930 = 0.7659283f;
        this.field22931 = 0.25f;
        for (int k = 0; k < n; ++k) {
            this.field22924[k] = 14;
        }
        for (int l = n; l < 64; ++l) {
            this.field22924[l] = 1;
        }
        for (int n2 = 0; n2 < 50; ++n2) {
            this.field22935[n2][0] = 1.0f;
            this.field22936[n2][1] = 1.0f;
            this.field22935[n2][0] = 1.0f;
            this.field22936[n2][1] = 1.0f;
        }
        this.field22939 = 0;
        for (int n3 = 0; n3 < 20; ++n3) {
            this.field22940[n3][0][0] = 0.0f;
            this.field22940[n3][0][1] = 0.0f;
            this.field22940[n3][1][0] = 0.0f;
            this.field22940[n3][1][1] = 0.0f;
            this.field22941[n3][0][0] = 0.0f;
            this.field22941[n3][0][1] = 0.0f;
            this.field22941[n3][1][0] = 0.0f;
            this.field22941[n3][1][1] = 0.0f;
        }
    }
    
    public int method16845(final Class8157 class8157) throws AACException {
        final long n = class8157.method26937();
        if (class8157.method26942()) {
            this.field22910 = true;
            this.field22912 = false;
            if (this.field22880 = class8157.method26942()) {
                this.field22883 = class8157.method26940(3);
                this.field22885 = Class5598.field22830[this.field22883];
                this.field22886 = Class5598.field22832[this.field22883];
                if (this.field22883 == 2 || this.field22883 == 5) {
                    this.field22912 = true;
                }
                this.field22894 = this.field22883;
            }
            if (this.field22881 = class8157.method26942()) {
                this.field22884 = class8157.method26940(3);
                this.field22887 = Class5598.field22831[this.field22884];
                if (this.field22884 == 2 || this.field22884 == 5) {
                    this.field22912 = true;
                }
            }
            this.field22882 = class8157.method26942();
        }
        if (this.field22910) {
            this.field22888 = class8157.method26941();
            this.field22889 = Class5598.field22833[this.field22888][class8157.method26940(2)];
            if (this.field22888 != 0) {
                for (int i = 1; i < this.field22889 + 1; ++i) {
                    this.field22890[i] = class8157.method26940(5) + 1;
                }
            }
            if (this.field22880) {
                for (int j = 0; j < this.field22889; ++j) {
                    this.field22891[j] = class8157.method26942();
                    if (this.field22883 >= 3) {
                        this.method16847(class8157, this.field22891[j], this.field22885, Class5598.field22945, Class5598.field22944, this.field22901[j]);
                    }
                    else {
                        this.method16847(class8157, this.field22891[j], this.field22885, Class5598.field22943, Class5598.field22942, this.field22901[j]);
                    }
                }
            }
            if (this.field22881) {
                for (int k = 0; k < this.field22889; ++k) {
                    this.method16847(class8157, this.field22892[k] = class8157.method26942(), this.field22887, Class5598.field22947, Class5598.field22946, this.field22902[k]);
                }
            }
            if (this.field22882) {
                int method26940 = class8157.method26940(4);
                if (method26940 == 15) {
                    method26940 += class8157.method26940(8);
                }
                int l;
                int method26941;
                for (l = 8 * method26940; l > 7; l -= 2, l -= this.method16846(class8157, method26941, l)) {
                    method26941 = class8157.method26940(2);
                }
                class8157.method26945(l);
            }
            final int n2 = (int)(class8157.method26937() - n);
            this.field22909 = 1;
            return n2;
        }
        this.field22909 = 0;
        return 1;
    }
    
    private int method16846(final Class8157 class8157, final int n, final int n2) throws AACException {
        final long n3 = class8157.method26937();
        if (n == 0) {
            if (this.field22893 = class8157.method26942()) {
                for (int i = 0; i < this.field22889; ++i) {
                    this.method16847(class8157, this.field22895[i] = class8157.method26942(), this.field22886, Class5598.field22949, Class5598.field22948, this.field22903[i]);
                    this.method16847(class8157, this.field22896[i] = class8157.method26942(), this.field22886, Class5598.field22951, Class5598.field22950, this.field22904[i]);
                }
            }
            class8157.method26941();
        }
        return (int)(class8157.method26937() - n3);
    }
    
    private void method16847(final Class8157 class8157, final boolean b, final int n, final int[][] array, final int[][] array2, final int[] array3) throws AACException {
        if (!b) {
            array3[0] = this.method16848(class8157, array2);
            for (int i = 1; i < n; ++i) {
                array3[i] = this.method16848(class8157, array2);
            }
        }
        else {
            for (int j = 0; j < n; ++j) {
                array3[j] = this.method16848(class8157, array);
            }
        }
    }
    
    private int method16848(final Class8157 class8157, final int[][] array) throws AACException {
        int i;
        for (i = 0; i >= 0; i = array[i][class8157.method26941()]) {}
        return i + 31;
    }
    
    private int method16849(final int n, final int n2, final int n3) {
        if (n < n2) {
            return n2;
        }
        if (n <= n3) {
            return n;
        }
        return n3;
    }
    
    private void method16850(final boolean b, final int[] array, final int[] array2, final boolean b2, final int n, final int n2, final int n3, final int n4) {
        if (!b) {
            for (int i = 0; i < n; ++i) {
                array[i] = 0;
            }
        }
        else if (b2) {
            for (int j = 0; j < n; ++j) {
                array[j] += array2[j * n2];
                array[j] = this.method16849(array[j], n3, n4);
            }
        }
        else {
            array[0] += 0;
            array[0] = this.method16849(array[0], n3, n4);
            for (int k = 1; k < n; ++k) {
                array[k] += array[k - 1];
                array[k] = this.method16849(array[k], n3, n4);
            }
        }
        if (n2 == 2) {
            for (int l = (n << 1) - 1; l > 0; --l) {
                array[l] = array[l >> 1];
            }
        }
    }
    
    private void method16851(final boolean b, final int[] array, final int[] array2, final boolean b2, final int n, final int n2, final int n3) {
        if (!b) {
            for (int i = 0; i < n; ++i) {
                array[i] = 0;
            }
        }
        else if (b2) {
            for (int j = 0; j < n; ++j) {
                array[j] += array2[j * n2];
                final int n4 = j;
                array[n4] &= n3;
            }
        }
        else {
            array[0] += 0;
            final int n5 = 0;
            array[n5] &= n3;
            for (int k = 1; k < n; ++k) {
                array[k] += array[k - 1];
                final int n6 = k;
                array[n6] &= n3;
            }
        }
        if (n2 == 2) {
            array[0] = 0;
            for (int l = (n << 1) - 1; l > 0; --l) {
                array[l] = array[l >> 1];
            }
        }
    }
    
    private void method16852(final int[] array, final int n) {
        array[1] = (array[0] + array[1]) / 2;
        array[3] = (array[2] = array[1]);
        array[4] = (array[2] + array[3]) / 2;
        array[5] = array[3];
        array[6] = array[4];
        array[7] = array[4];
        array[8] = array[5];
        array[9] = array[5];
        array[10] = array[6];
        array[11] = array[7];
        array[12] = array[8];
        array[13] = array[8];
        array[14] = array[9];
        array[15] = array[9];
        array[16] = array[10];
        if (n == 34) {
            array[17] = array[11];
            array[18] = array[12];
            array[19] = array[13];
            array[20] = array[14];
            array[21] = array[14];
            array[22] = array[15];
            array[23] = array[15];
            array[24] = array[16];
            array[25] = array[16];
            array[26] = array[17];
            array[27] = array[17];
            array[28] = array[18];
            array[29] = array[18];
            array[30] = array[18];
            array[31] = array[18];
            array[32] = array[19];
            array[33] = array[19];
        }
    }
    
    private void method16853() {
        if (this.field22909 == 0) {
            this.field22889 = 0;
        }
        for (int i = 0; i < this.field22889; ++i) {
            final int n = (this.field22883 >= 3) ? 15 : 7;
            int[] field22897;
            int[] field22898;
            int[] field22899;
            int[] field22900;
            if (i != 0) {
                field22897 = this.field22901[i - 1];
                field22898 = this.field22902[i - 1];
                field22899 = this.field22903[i - 1];
                field22900 = this.field22904[i - 1];
            }
            else {
                field22897 = this.field22897;
                field22898 = this.field22898;
                field22899 = this.field22899;
                field22900 = this.field22900;
            }
            this.method16850(this.field22880, this.field22901[i], field22897, this.field22891[i], this.field22885, (this.field22883 != 0 && this.field22883 != 3) ? 1 : 2, -n, n);
            this.method16850(this.field22881, this.field22902[i], field22898, this.field22892[i], this.field22887, (this.field22884 != 0 && this.field22884 != 3) ? 1 : 2, 0, 7);
            this.method16851(this.field22893, this.field22903[i], field22899, this.field22895[i], this.field22886, 1, 7);
            this.method16851(this.field22893, this.field22904[i], field22900, this.field22896[i], this.field22886, 1, 7);
        }
        if (this.field22889 == 0) {
            this.field22889 = 1;
            if (!this.field22880) {
                for (int j = 0; j < 34; ++j) {
                    this.field22901[0][j] = 0;
                }
            }
            else {
                for (int k = 0; k < 34; ++k) {
                    this.field22901[0][k] = this.field22897[k];
                }
            }
            if (!this.field22881) {
                for (int l = 0; l < 34; ++l) {
                    this.field22902[0][l] = 0;
                }
            }
            else {
                for (int n2 = 0; n2 < 34; ++n2) {
                    this.field22902[0][n2] = this.field22898[n2];
                }
            }
            if (!this.field22893) {
                for (int n3 = 0; n3 < 17; ++n3) {
                    this.field22903[0][n3] = 0;
                    this.field22904[0][n3] = 0;
                }
            }
            else {
                for (int n4 = 0; n4 < 17; ++n4) {
                    this.field22903[0][n4] = this.field22899[n4];
                    this.field22904[0][n4] = this.field22900[n4];
                }
            }
        }
        for (int n5 = 0; n5 < 34; ++n5) {
            this.field22897[n5] = this.field22901[this.field22889 - 1][n5];
        }
        for (int n6 = 0; n6 < 34; ++n6) {
            this.field22898[n6] = this.field22902[this.field22889 - 1][n6];
        }
        for (int n7 = 0; n7 < 17; ++n7) {
            this.field22899[n7] = this.field22903[this.field22889 - 1][n7];
            this.field22900[n7] = this.field22904[this.field22889 - 1][n7];
        }
        this.field22909 = 0;
        if (this.field22888 != 0) {
            this.field22890[0] = 0;
            if (this.field22890[this.field22889] < this.field22913) {
                for (int n8 = 0; n8 < 34; ++n8) {
                    this.field22901[this.field22889][n8] = this.field22901[this.field22889 - 1][n8];
                    this.field22902[this.field22889][n8] = this.field22902[this.field22889 - 1][n8];
                }
                for (int n9 = 0; n9 < 17; ++n9) {
                    this.field22903[this.field22889][n9] = this.field22903[this.field22889 - 1][n9];
                    this.field22904[this.field22889][n9] = this.field22904[this.field22889 - 1][n9];
                }
                ++this.field22889;
                this.field22890[this.field22889] = this.field22913;
            }
            for (int n10 = 1; n10 < this.field22889; ++n10) {
                final int n11 = this.field22913 - (this.field22889 - n10);
                if (this.field22890[n10] <= n11) {
                    final int n12 = this.field22890[n10 - 1] + 1;
                    if (this.field22890[n10] < n12) {
                        this.field22890[n10] = n12;
                    }
                }
                else {
                    this.field22890[n10] = n11;
                }
            }
        }
        else {
            this.field22890[0] = 0;
            for (int n13 = 1; n13 < this.field22889; ++n13) {
                this.field22890[n13] = n13 * this.field22913 / this.field22889;
            }
            this.field22890[this.field22889] = this.field22913;
        }
        if (this.field22912) {
            for (int n14 = 0; n14 < this.field22889; ++n14) {
                if (this.field22883 != 2) {
                    if (this.field22883 != 5) {
                        this.method16852(this.field22901[n14], 34);
                    }
                }
                if (this.field22884 != 2) {
                    if (this.field22884 != 5) {
                        this.method16852(this.field22902[n14], 34);
                    }
                }
                if (this.field22894 != 2) {
                    if (this.field22894 != 5) {
                        this.method16852(this.field22903[n14], 17);
                        this.method16852(this.field22904[n14], 17);
                    }
                }
            }
        }
    }
    
    private void method16854(final float[][][] array, final float[][][] array2, final float[][][] array3, final float[][][] array4) {
        int field22921 = 0;
        final int[] array5 = new int[3];
        final float[][] array6 = new float[32][34];
        final float[][] array7 = new float[32][34];
        final float[] array8 = new float[2];
        float[][] array9;
        if (!this.field22912) {
            array9 = Class5598.field22846;
        }
        else {
            array9 = Class5598.field22847;
        }
        for (int i = 0; i < 32; ++i) {
            for (int j = 0; j < 34; ++j) {
                array6[i][j] = 0.0f;
            }
        }
        for (int k = 0; k < this.field22914; ++k) {
            final int n = 0xFFFFEFFF & this.field22920[k];
            for (int n2 = (k >= this.field22915) ? this.field22919[k + 1] : (this.field22919[k] + 1), l = this.field22919[k]; l < n2; ++l) {
                for (int n3 = this.field22890[0]; n3 < this.field22890[this.field22889]; ++n3) {
                    if (k >= this.field22915) {
                        array8[0] = array[n3][l][0];
                        array8[1] = array[n3][l][1];
                    }
                    else {
                        array8[0] = array3[n3][l][0];
                        array8[1] = array3[n3][l][1];
                    }
                    final float[] array10 = array6[n3];
                    final int n4 = n;
                    array10[n4] += array8[0] * array8[0] + array8[1] * array8[1];
                }
            }
        }
        for (int n5 = 0; n5 < this.field22916; ++n5) {
            for (int n6 = this.field22890[0]; n6 < this.field22890[this.field22889]; ++n6) {
                final float n7 = 1.5f;
                this.field22932[n5] *= this.field22930;
                if (this.field22932[n5] < array6[n6][n5]) {
                    this.field22932[n5] = array6[n6][n5];
                }
                final float n8 = this.field22934[n5] + (this.field22932[n5] - array6[n6][n5] - this.field22934[n5]) * this.field22931;
                this.field22934[n5] = n8;
                final float n9 = this.field22933[n5] + (array6[n6][n5] - this.field22933[n5]) * this.field22931;
                this.field22933[n5] = n9;
                if (n8 * n7 > n9) {
                    array7[n6][n5] = n9 / (n8 * n7);
                }
                else {
                    array7[n6][n5] = 1.0f;
                }
            }
        }
        for (int n10 = 0; n10 < this.field22914; ++n10) {
            int n11;
            if (n10 >= this.field22915) {
                n11 = this.field22919[n10 + 1];
            }
            else {
                n11 = this.field22919[n10] + 1;
            }
            for (int n12 = this.field22919[n10]; n12 < n11; ++n12) {
                final float[] array11 = new float[3];
                float n14;
                if (n10 >= this.field22915 && n12 > this.field22918) {
                    final int n13 = this.field22918 - n12;
                    if (n13 > -20) {
                        n14 = 1.0f + 0.05f * n13;
                    }
                    else {
                        n14 = 0.0f;
                    }
                }
                else {
                    n14 = 1.0f;
                }
                for (int n15 = 0; n15 < 3; ++n15) {
                    array11[n15] = n14 * Class5598.field22834[n15];
                }
                field22921 = this.field22921;
                for (int n16 = 0; n16 < 3; ++n16) {
                    array5[n16] = this.field22922[n16];
                }
                for (int n17 = this.field22890[0]; n17 < this.field22890[this.field22889]; ++n17) {
                    final float[] array12 = new float[2];
                    final float[] array13 = new float[2];
                    final float[] array14 = new float[2];
                    if (n10 >= this.field22915) {
                        array8[0] = array[n17][n12][0];
                        array8[1] = array[n17][n12][1];
                    }
                    else {
                        array8[0] = array3[n17][n12][0];
                        array8[1] = array3[n17][n12][1];
                    }
                    if (n12 > this.field22917 && n10 >= this.field22915) {
                        array12[0] = this.field22926[this.field22925[n12]][n12][0];
                        array12[1] = this.field22926[this.field22925[n12]][n12][1];
                        array14[0] = array12[0];
                        array14[1] = array12[1];
                        this.field22926[this.field22925[n12]][n12][0] = array8[0];
                        this.field22926[this.field22925[n12]][n12][1] = array8[1];
                    }
                    else {
                        final float[] array15 = new float[2];
                        if (n10 >= this.field22915) {
                            array13[0] = this.field22926[field22921][n12][0];
                            array13[1] = this.field22926[field22921][n12][1];
                            this.field22926[field22921][n12][0] = array8[0];
                            this.field22926[field22921][n12][1] = array8[1];
                            array15[0] = Class5598.field22845[n12][0];
                            array15[1] = Class5598.field22845[n12][1];
                        }
                        else {
                            array13[0] = this.field22927[field22921][n12][0];
                            array13[1] = this.field22927[field22921][n12][1];
                            this.field22927[field22921][n12][0] = array8[0];
                            this.field22927[field22921][n12][1] = array8[1];
                            array15[0] = array9[n12][0];
                            array15[1] = array9[n12][1];
                        }
                        array12[0] = array12[0] * array15[0] + array13[1] * array15[1];
                        array12[1] = array13[1] * array15[0] - array13[0] * array15[1];
                        array14[0] = array12[0];
                        array14[1] = array12[1];
                        for (int n18 = 0; n18 < 3; ++n18) {
                            final float[] array16 = new float[2];
                            final float[] array17 = new float[2];
                            if (n10 >= this.field22915) {
                                array13[0] = this.field22928[n18][array5[n18]][n12][0];
                                array13[1] = this.field22928[n18][array5[n18]][n12][1];
                                array16[0] = Class5598.field22848[n12][n18][0];
                                array16[1] = Class5598.field22848[n12][n18][1];
                            }
                            else {
                                array13[0] = this.field22929[n18][array5[n18]][n12][0];
                                array13[1] = this.field22929[n18][array5[n18]][n12][1];
                                if (!this.field22912) {
                                    array16[0] = Class5598.field22849[n12][n18][0];
                                    array16[1] = Class5598.field22849[n12][n18][1];
                                }
                                else {
                                    array16[0] = Class5598.field22850[n12][n18][0];
                                    array16[1] = Class5598.field22850[n12][n18][1];
                                }
                            }
                            array12[0] = array13[0] * array16[0] + array13[1] * array16[1];
                            array12[1] = array13[1] * array16[0] - array13[0] * array16[1];
                            final float[] array18 = array12;
                            final int n19 = 0;
                            array18[n19] += -(array11[n18] * array14[0]);
                            final float[] array19 = array12;
                            final int n20 = 1;
                            array19[n20] += -(array11[n18] * array14[1]);
                            array17[0] = array14[0] + array11[n18] * array12[0];
                            array17[1] = array14[1] + array11[n18] * array12[1];
                            if (n10 >= this.field22915) {
                                this.field22928[n18][array5[n18]][n12][0] = array17[0];
                                this.field22928[n18][array5[n18]][n12][1] = array17[1];
                            }
                            else {
                                this.field22929[n18][array5[n18]][n12][0] = array17[0];
                                this.field22929[n18][array5[n18]][n12][1] = array17[1];
                            }
                            array14[0] = array12[0];
                            array14[1] = array12[1];
                        }
                    }
                    final int n21 = 0xFFFFEFFF & this.field22920[n10];
                    array14[0] *= array7[n17][n21];
                    array14[1] *= array7[n17][n21];
                    if (n10 >= this.field22915) {
                        array2[n17][n12][0] = array14[0];
                        array2[n17][n12][1] = array14[1];
                    }
                    else {
                        array4[n17][n12][0] = array14[0];
                        array4[n17][n12][1] = array14[1];
                    }
                    if (++field22921 >= 2) {
                        field22921 = 0;
                    }
                    if (n12 > this.field22917) {
                        if (n10 >= this.field22915) {
                            if (++this.field22925[n12] >= this.field22924[n12]) {
                                this.field22925[n12] = 0;
                            }
                        }
                    }
                    for (int n22 = 0; n22 < 3; ++n22) {
                        if (++array5[n22] >= this.field22923[n22]) {
                            array5[n22] = 0;
                        }
                    }
                }
            }
        }
        this.field22921 = field22921;
        for (int n23 = 0; n23 < 3; ++n23) {
            this.field22922[n23] = array5[n23];
        }
    }
    
    private float method16855(final float[] array) {
        return (float)Math.sqrt(array[0] * array[0] + array[1] * array[1]);
    }
    
    private void method16856(final float[][][] array, final float[][][] array2, final float[][][] array3, final float[][][] array4) {
        final float[] array5 = new float[2];
        final float[] array6 = new float[2];
        final float[] array7 = new float[2];
        final float[] array8 = new float[2];
        final float[] array9 = new float[2];
        final float[] array10 = new float[2];
        final float[] array11 = new float[2];
        final float[] array12 = new float[2];
        final float[] array13 = new float[2];
        final float[] array14 = new float[2];
        final float[] array15 = new float[2];
        final float[] array16 = new float[2];
        final float[] array17 = new float[2];
        final float[] array18 = new float[2];
        final float[] array19 = new float[2];
        final float[] array20 = new float[2];
        int n;
        float[] array21;
        if (this.field22883 < 3) {
            n = 7;
            array21 = Class5598.field22863;
        }
        else {
            n = 15;
            array21 = Class5598.field22864;
        }
        int field22886;
        if (this.field22894 != 0 && this.field22894 != 3) {
            field22886 = this.field22886;
        }
        else {
            field22886 = 11;
        }
        for (int i = 0; i < this.field22914; ++i) {
            final int n2 = 0xFFFFEFFF & this.field22920[i];
            final int n3 = (i >= this.field22915) ? this.field22919[i + 1] : (this.field22919[i] + 1);
            for (int j = 0; j < this.field22889; ++j) {
                if (this.field22884 >= 3) {
                    float n4;
                    float n5;
                    float n6;
                    float n7;
                    if (this.field22883 < 3) {
                        final int abs = Math.abs(this.field22901[j][n2]);
                        n4 = Class5598.field22857[n + this.field22901[j][n2]][this.field22902[j][n2]];
                        n5 = Class5598.field22857[14 - (n + this.field22901[j][n2])][this.field22902[j][n2]];
                        n6 = Class5598.field22859[abs][this.field22902[j][n2]];
                        n7 = Class5598.field22861[abs][this.field22902[j][n2]];
                    }
                    else {
                        final int abs2 = Math.abs(this.field22901[j][n2]);
                        n4 = Class5598.field22858[n + this.field22901[j][n2]][this.field22902[j][n2]];
                        n5 = Class5598.field22858[30 - (n + this.field22901[j][n2])][this.field22902[j][n2]];
                        n6 = Class5598.field22860[abs2][this.field22902[j][n2]];
                        n7 = Class5598.field22862[abs2][this.field22902[j][n2]];
                    }
                    array5[0] = 1.4142135f * (n4 * n6);
                    array6[0] = 1.4142135f * (n5 * n6);
                    array7[0] = 1.4142135f * (-n4 * n7);
                    array8[0] = 1.4142135f * (n5 * n7);
                }
                else {
                    final float n8 = array21[n + this.field22901[j][n2]];
                    final float n9 = array21[n - this.field22901[j][n2]];
                    final float n10 = Class5598.field22851[this.field22902[j][n2]];
                    final float n11 = Class5598.field22852[this.field22902[j][n2]];
                    float n12;
                    float n13;
                    if (this.field22883 < 3) {
                        if (this.field22901[j][n2] >= 0) {
                            n12 = Class5598.field22853[this.field22901[j][n2]][this.field22902[j][n2]];
                            n13 = Class5598.field22854[this.field22901[j][n2]][this.field22902[j][n2]];
                        }
                        else {
                            n12 = Class5598.field22853[-this.field22901[j][n2]][this.field22902[j][n2]];
                            n13 = -Class5598.field22854[-this.field22901[j][n2]][this.field22902[j][n2]];
                        }
                    }
                    else if (this.field22901[j][n2] >= 0) {
                        n12 = Class5598.field22855[this.field22901[j][n2]][this.field22902[j][n2]];
                        n13 = Class5598.field22856[this.field22901[j][n2]][this.field22902[j][n2]];
                    }
                    else {
                        n12 = Class5598.field22855[-this.field22901[j][n2]][this.field22902[j][n2]];
                        n13 = -Class5598.field22856[-this.field22901[j][n2]][this.field22902[j][n2]];
                    }
                    final float n14 = n12 * n10;
                    final float n15 = n13 * n11;
                    final float n16 = n13 * n10;
                    final float n17 = n12 * n11;
                    array5[0] = n9 * (n14 - n15);
                    array6[0] = n8 * (n14 + n15);
                    array7[0] = n9 * (n16 + n17);
                    array8[0] = n8 * (n16 - n17);
                }
                if (this.field22893) {
                    if (n2 < field22886) {
                        int field22887 = this.field22939;
                        array17[0] = this.field22940[n2][field22887][0] * 0.25f;
                        array17[1] = this.field22940[n2][field22887][1] * 0.25f;
                        array18[0] = this.field22941[n2][field22887][0] * 0.25f;
                        array18[1] = this.field22941[n2][field22887][1] * 0.25f;
                        this.field22940[n2][field22887][0] = Class5598.field22865[Math.abs(this.field22903[j][n2])];
                        this.field22940[n2][field22887][1] = Class5598.field22866[Math.abs(this.field22903[j][n2])];
                        this.field22941[n2][field22887][0] = Class5598.field22865[Math.abs(this.field22904[j][n2])];
                        this.field22941[n2][field22887][1] = Class5598.field22866[Math.abs(this.field22904[j][n2])];
                        final float[] array22 = array17;
                        final int n18 = 0;
                        array22[n18] += this.field22940[n2][field22887][0];
                        final float[] array23 = array17;
                        final int n19 = 1;
                        array23[n19] += this.field22940[n2][field22887][1];
                        final float[] array24 = array18;
                        final int n20 = 0;
                        array24[n20] += this.field22941[n2][field22887][0];
                        final float[] array25 = array18;
                        final int n21 = 1;
                        array25[n21] += this.field22941[n2][field22887][1];
                        if (field22887 == 0) {
                            field22887 = 2;
                        }
                        --field22887;
                        final float[] array26 = array17;
                        final int n22 = 0;
                        array26[n22] += this.field22940[n2][field22887][0] * 0.5f;
                        final float[] array27 = array17;
                        final int n23 = 1;
                        array27[n23] += this.field22940[n2][field22887][1] * 0.5f;
                        final float[] array28 = array18;
                        final int n24 = 0;
                        array28[n24] += this.field22941[n2][field22887][0] * 0.5f;
                        final float[] array29 = array18;
                        final int n25 = 1;
                        array29[n25] += this.field22941[n2][field22887][1] * 0.5f;
                        final float method16855 = this.method16855(array18);
                        final float method16856 = this.method16855(array17);
                        if (method16855 == 0.0f) {
                            array19[1] = (array19[0] = 0.0f);
                        }
                        else {
                            array19[0] = array18[0] / method16855;
                            array19[1] = array18[1] / method16855;
                        }
                        final float n26 = method16855 * method16856;
                        if (n26 == 0.0f) {
                            array20[1] = (array20[0] = 0.0f);
                        }
                        else {
                            final float n27 = array18[0] * array17[0] + array18[1] * array17[1];
                            final float n28 = array18[1] * array17[0] - array18[0] * array17[1];
                            array20[0] = n27 / n26;
                            array20[1] = n28 / n26;
                        }
                        array5[1] = array5[0] * array19[1];
                        array6[1] = array6[0] * array20[1];
                        array7[1] = array7[0] * array19[1];
                        array8[1] = array8[0] * array20[1];
                        array5[0] *= array19[0];
                        array6[0] *= array20[0];
                        array7[0] *= array19[0];
                        array8[0] *= array20[0];
                    }
                }
                final float n29 = (float)(this.field22890[j + 1] - this.field22890[j]);
                array13[0] = (array5[0] - this.field22935[i][0]) / n29;
                array14[0] = (array6[0] - this.field22936[i][0]) / n29;
                array15[0] = (array7[0] - this.field22937[i][0]) / n29;
                array16[0] = (array8[0] - this.field22938[i][0]) / n29;
                array9[0] = this.field22935[i][0];
                array10[0] = this.field22936[i][0];
                array11[0] = this.field22937[i][0];
                array12[0] = this.field22938[i][0];
                this.field22935[i][0] = array5[0];
                this.field22936[i][0] = array6[0];
                this.field22937[i][0] = array7[0];
                this.field22938[i][0] = array8[0];
                if (this.field22893) {
                    if (n2 < field22886) {
                        array13[1] = (array5[1] - this.field22935[i][1]) / n29;
                        array14[1] = (array6[1] - this.field22936[i][1]) / n29;
                        array15[1] = (array7[1] - this.field22937[i][1]) / n29;
                        array16[1] = (array8[1] - this.field22938[i][1]) / n29;
                        array9[1] = this.field22935[i][1];
                        array10[1] = this.field22936[i][1];
                        array11[1] = this.field22937[i][1];
                        array12[1] = this.field22938[i][1];
                        if ((0x1000 & this.field22920[i]) != 0x0) {
                            array13[1] = -array13[1];
                            array14[1] = -array14[1];
                            array15[1] = -array15[1];
                            array16[1] = -array16[1];
                            array9[1] = -array9[1];
                            array10[1] = -array10[1];
                            array11[1] = -array11[1];
                            array12[1] = -array12[1];
                        }
                        this.field22935[i][1] = array5[1];
                        this.field22936[i][1] = array6[1];
                        this.field22937[i][1] = array7[1];
                        this.field22938[i][1] = array8[1];
                    }
                }
                for (int k = this.field22890[j]; k < this.field22890[j + 1]; ++k) {
                    final float[] array30 = array9;
                    final int n30 = 0;
                    array30[n30] += array13[0];
                    final float[] array31 = array10;
                    final int n31 = 0;
                    array31[n31] += array14[0];
                    final float[] array32 = array11;
                    final int n32 = 0;
                    array32[n32] += array15[0];
                    final float[] array33 = array12;
                    final int n33 = 0;
                    array33[n33] += array16[0];
                    if (this.field22893) {
                        if (n2 < field22886) {
                            final float[] array34 = array9;
                            final int n34 = 1;
                            array34[n34] += array13[1];
                            final float[] array35 = array10;
                            final int n35 = 1;
                            array35[n35] += array14[1];
                            final float[] array36 = array11;
                            final int n36 = 1;
                            array36[n36] += array15[1];
                            final float[] array37 = array12;
                            final int n37 = 1;
                            array37[n37] += array16[1];
                        }
                    }
                    for (int l = this.field22919[i]; l < n3; ++l) {
                        final float[] array38 = new float[2];
                        final float[] array39 = new float[2];
                        if (i >= this.field22915) {
                            array38[0] = array[k][l][0];
                            array38[1] = array[k][l][1];
                            array39[0] = array2[k][l][0];
                            array39[1] = array2[k][l][1];
                        }
                        else {
                            array38[0] = array3[k][l][0];
                            array38[1] = array3[k][l][1];
                            array39[0] = array4[k][l][0];
                            array39[1] = array4[k][l][1];
                        }
                        array17[0] = array9[0] * array38[0] + array11[0] * array39[0];
                        array17[1] = array9[0] * array38[1] + array11[0] * array39[1];
                        array18[0] = array10[0] * array38[0] + array12[0] * array39[0];
                        array18[1] = array10[0] * array38[1] + array12[0] * array39[1];
                        if (this.field22893) {
                            if (n2 < field22886) {
                                final float[] array40 = array17;
                                final int n38 = 0;
                                array40[n38] -= array9[1] * array38[1] + array11[1] * array39[1];
                                final float[] array41 = array17;
                                final int n39 = 1;
                                array41[n39] += array9[1] * array38[0] + array11[1] * array39[0];
                                final float[] array42 = array18;
                                final int n40 = 0;
                                array42[n40] -= array10[1] * array38[1] + array12[1] * array39[1];
                                final float[] array43 = array18;
                                final int n41 = 1;
                                array43[n41] += array10[1] * array38[0] + array12[1] * array39[0];
                            }
                        }
                        if (i >= this.field22915) {
                            array[k][l][0] = array17[0];
                            array[k][l][1] = array17[1];
                            array2[k][l][0] = array18[0];
                            array2[k][l][1] = array18[1];
                        }
                        else {
                            array3[k][l][0] = array17[0];
                            array3[k][l][1] = array17[1];
                            array4[k][l][0] = array18[0];
                            array4[k][l][1] = array18[1];
                        }
                    }
                }
                ++this.field22939;
                if (this.field22939 == 2) {
                    this.field22939 = 0;
                }
            }
        }
    }
    
    public int method16857(final float[][][] array, final float[][][] array2) {
        final float[][][] array3 = new float[32][32][2];
        final float[][][] array4 = new float[32][32][2];
        this.method16853();
        if (!this.field22912) {
            this.field22919 = Class5598.field22835;
            this.field22920 = Class5598.field22837;
            this.field22914 = 22;
            this.field22915 = 10;
            this.field22916 = 20;
            this.field22918 = 3;
        }
        else {
            this.field22919 = Class5598.field22836;
            this.field22920 = Class5598.field22838;
            this.field22914 = 50;
            this.field22915 = 32;
            this.field22916 = 34;
            this.field22918 = 5;
        }
        this.field22911.method16837(array, array3, this.field22912, this.field22913);
        this.method16854(array, array2, array3, array4);
        this.method16856(array, array2, array3, array4);
        this.field22911.method16844(array, array3, this.field22912, this.field22913);
        this.field22911.method16844(array2, array4, this.field22912, this.field22913);
        return 0;
    }
}
