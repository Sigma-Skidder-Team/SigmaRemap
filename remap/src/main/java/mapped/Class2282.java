// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2282 implements Serializable, Cloneable
{
    public static final long field13882 = 2777097312029690941L;
    private static final boolean field13883 = false;
    public int field13884;
    public int field13885;
    public double[][] field13886;
    private static final double field13887 = 1.0E-10;
    
    public Class2282(final int field13884, final int field13885) {
        this.field13886 = new double[field13884][field13885];
        this.field13884 = field13884;
        this.field13885 = field13885;
        for (int i = 0; i < field13884; ++i) {
            for (int j = 0; j < field13885; ++j) {
                this.field13886[i][j] = 0.0;
            }
        }
        int n;
        if (field13884 >= field13885) {
            n = field13885;
        }
        else {
            n = field13884;
        }
        for (int k = 0; k < n; ++k) {
            this.field13886[k][k] = 1.0;
        }
    }
    
    public Class2282(final int field13884, final int field13885, final double[] array) {
        this.field13886 = new double[field13884][field13885];
        this.field13884 = field13884;
        this.field13885 = field13885;
        for (int i = 0; i < field13884; ++i) {
            System.arraycopy(array, i * field13885 + 0, this.field13886[i], 0, field13885);
        }
    }
    
    public Class2282(final Class2282 class2282) {
        this.field13884 = class2282.field13884;
        this.field13885 = class2282.field13885;
        this.field13886 = new double[this.field13884][this.field13885];
        for (int i = 0; i < this.field13884; ++i) {
            System.arraycopy(class2282.field13886[i], 0, this.field13886[i], 0, this.field13885);
        }
    }
    
    public final void method8758(final Class2282 class2282) {
        if (this.field13885 == class2282.field13884 && this.field13885 == class2282.field13885) {
            final double[][] field13886 = new double[this.field13884][this.field13885];
            for (int i = 0; i < this.field13884; ++i) {
                for (int j = 0; j < this.field13885; ++j) {
                    field13886[i][j] = 0.0;
                    for (int k = 0; k < this.field13885; ++k) {
                        final double[] array = field13886[i];
                        final int n = j;
                        array[n] += this.field13886[i][k] * class2282.field13886[k][j];
                    }
                }
            }
            this.field13886 = field13886;
            return;
        }
        throw new Class2363(Class9531.method35584("GMatrix0"));
    }
    
    public final void method8759(final Class2282 class2282, final Class2282 class2283) {
        if (class2282.field13885 == class2283.field13884) {
            if (this.field13884 == class2282.field13884) {
                if (this.field13885 == class2283.field13885) {
                    final double[][] field13886 = new double[this.field13884][this.field13885];
                    for (int i = 0; i < class2282.field13884; ++i) {
                        for (int j = 0; j < class2283.field13885; ++j) {
                            field13886[i][j] = 0.0;
                            for (int k = 0; k < class2282.field13885; ++k) {
                                final double[] array = field13886[i];
                                final int n = j;
                                array[n] += class2282.field13886[i][k] * class2283.field13886[k][j];
                            }
                        }
                    }
                    this.field13886 = field13886;
                    return;
                }
            }
        }
        throw new Class2363(Class9531.method35584("GMatrix1"));
    }
    
    public final void method8760(final Class2281 class2281, final Class2281 class2282) {
        if (this.field13884 < class2281.method8746()) {
            throw new Class2363(Class9531.method35584("GMatrix2"));
        }
        if (this.field13885 >= class2282.method8746()) {
            for (int i = 0; i < class2281.method8746(); ++i) {
                for (int j = 0; j < class2282.method8746(); ++j) {
                    this.field13886[i][j] = class2281.field13880[i] * class2282.field13880[j];
                }
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GMatrix3"));
    }
    
    public final void method8761(final Class2282 class2282) {
        if (this.field13884 != class2282.field13884) {
            throw new Class2363(Class9531.method35584("GMatrix4"));
        }
        if (this.field13885 == class2282.field13885) {
            for (int i = 0; i < this.field13884; ++i) {
                for (int j = 0; j < this.field13885; ++j) {
                    this.field13886[i][j] += class2282.field13886[i][j];
                }
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GMatrix5"));
    }
    
    public final void method8762(final Class2282 class2282, final Class2282 class2283) {
        if (class2283.field13884 != class2282.field13884) {
            throw new Class2363(Class9531.method35584("GMatrix6"));
        }
        if (class2283.field13885 != class2282.field13885) {
            throw new Class2363(Class9531.method35584("GMatrix7"));
        }
        if (this.field13885 == class2282.field13885 && this.field13884 == class2282.field13884) {
            for (int i = 0; i < this.field13884; ++i) {
                for (int j = 0; j < this.field13885; ++j) {
                    this.field13886[i][j] = class2282.field13886[i][j] + class2283.field13886[i][j];
                }
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GMatrix8"));
    }
    
    public final void method8763(final Class2282 class2282) {
        if (this.field13884 != class2282.field13884) {
            throw new Class2363(Class9531.method35584("GMatrix9"));
        }
        if (this.field13885 == class2282.field13885) {
            for (int i = 0; i < this.field13884; ++i) {
                for (int j = 0; j < this.field13885; ++j) {
                    this.field13886[i][j] -= class2282.field13886[i][j];
                }
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GMatrix28"));
    }
    
    public final void method8764(final Class2282 class2282, final Class2282 class2283) {
        if (class2283.field13884 != class2282.field13884) {
            throw new Class2363(Class9531.method35584("GMatrix10"));
        }
        if (class2283.field13885 != class2282.field13885) {
            throw new Class2363(Class9531.method35584("GMatrix11"));
        }
        if (this.field13884 == class2282.field13884 && this.field13885 == class2282.field13885) {
            for (int i = 0; i < this.field13884; ++i) {
                for (int j = 0; j < this.field13885; ++j) {
                    this.field13886[i][j] = class2282.field13886[i][j] - class2283.field13886[i][j];
                }
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GMatrix12"));
    }
    
    public final void method8765() {
        for (int i = 0; i < this.field13884; ++i) {
            for (int j = 0; j < this.field13885; ++j) {
                this.field13886[i][j] = -this.field13886[i][j];
            }
        }
    }
    
    public final void method8766(final Class2282 class2282) {
        if (this.field13884 == class2282.field13884 && this.field13885 == class2282.field13885) {
            for (int i = 0; i < this.field13884; ++i) {
                for (int j = 0; j < this.field13885; ++j) {
                    this.field13886[i][j] = -class2282.field13886[i][j];
                }
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GMatrix13"));
    }
    
    public final void method8767() {
        for (int i = 0; i < this.field13884; ++i) {
            for (int j = 0; j < this.field13885; ++j) {
                this.field13886[i][j] = 0.0;
            }
        }
        int n;
        if (this.field13884 >= this.field13885) {
            n = this.field13885;
        }
        else {
            n = this.field13884;
        }
        for (int k = 0; k < n; ++k) {
            this.field13886[k][k] = 1.0;
        }
    }
    
    public final void method8768() {
        for (int i = 0; i < this.field13884; ++i) {
            for (int j = 0; j < this.field13885; ++j) {
                this.field13886[i][j] = 0.0;
            }
        }
    }
    
    public final void method8769() {
        for (int i = 0; i < this.field13884; ++i) {
            for (int j = 0; j < this.field13885; ++j) {
                this.field13886[i][j] = -this.field13886[i][j];
            }
        }
        int n;
        if (this.field13884 >= this.field13885) {
            n = this.field13885;
        }
        else {
            n = this.field13884;
        }
        for (int k = 0; k < n; ++k) {
            final double[] array = this.field13886[k];
            final int n2 = k;
            ++array[n2];
        }
    }
    
    public final void method8770() {
        this.method8809(this);
    }
    
    public final void method8771(final Class2282 class2282) {
        this.method8809(class2282);
    }
    
    public final void method8772(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Class2282 class2282) {
        if (this == class2282) {
            final double[][] array = new double[n3][n4];
            for (int i = 0; i < n3; ++i) {
                System.arraycopy(this.field13886[n + i], n2 + 0, array[i], 0, n4);
            }
            for (int k = 0; k < n3; ++k) {
                System.arraycopy(array[k], 0, class2282.field13886[n5 + k], n6 + 0, n4);
            }
        }
        else {
            for (int n7 = 0; n7 < n3; ++n7) {
                if (n4 >= 0)
                    System.arraycopy(this.field13886[n + n7], n2 + 0, class2282.field13886[n5 + n7], n6 + 0, n4);
            }
        }
    }
    
    public final void method8773(final int field13884, final int field13885) {
        final double[][] field13886 = new double[field13884][field13885];
        int field13887;
        if (this.field13884 >= field13884) {
            field13887 = field13884;
        }
        else {
            field13887 = this.field13884;
        }
        int field13888;
        if (this.field13885 >= field13885) {
            field13888 = field13885;
        }
        else {
            field13888 = this.field13885;
        }
        for (int i = 0; i < field13887; ++i) {
            if (field13888 >= 0) System.arraycopy(this.field13886[i], 0, field13886[i], 0, field13888);
        }
        this.field13884 = field13884;
        this.field13885 = field13885;
        this.field13886 = field13886;
    }
    
    public final void method8774(final double[] array) {
        for (int i = 0; i < this.field13884; ++i) {
            if (this.field13885 >= 0)
                System.arraycopy(array, this.field13885 * i + 0, this.field13886[i], 0, this.field13885);
        }
    }
    
    public final void method8775(final Class2296 class2296) {
        if (this.field13885 < 3 || this.field13884 < 3) {
            this.field13885 = 3;
            this.field13884 = 3;
            this.field13886 = new double[this.field13884][this.field13885];
        }
        this.field13886[0][0] = class2296.field13935;
        this.field13886[0][1] = class2296.field13936;
        this.field13886[0][2] = class2296.field13937;
        this.field13886[1][0] = class2296.field13938;
        this.field13886[1][1] = class2296.field13939;
        this.field13886[1][2] = class2296.field13940;
        this.field13886[2][0] = class2296.field13941;
        this.field13886[2][1] = class2296.field13942;
        this.field13886[2][2] = class2296.field13943;
        for (int i = 3; i < this.field13884; ++i) {
            for (int j = 3; j < this.field13885; ++j) {
                this.field13886[i][j] = 0.0;
            }
        }
    }
    
    public final void method8776(final Class2274 class2274) {
        if (this.field13884 < 3 || this.field13885 < 3) {
            this.field13886 = new double[3][3];
            this.field13884 = 3;
            this.field13885 = 3;
        }
        this.field13886[0][0] = class2274.field13845;
        this.field13886[0][1] = class2274.field13846;
        this.field13886[0][2] = class2274.field13847;
        this.field13886[1][0] = class2274.field13848;
        this.field13886[1][1] = class2274.field13849;
        this.field13886[1][2] = class2274.field13850;
        this.field13886[2][0] = class2274.field13851;
        this.field13886[2][1] = class2274.field13852;
        this.field13886[2][2] = class2274.field13853;
        for (int i = 3; i < this.field13884; ++i) {
            for (int j = 3; j < this.field13885; ++j) {
                this.field13886[i][j] = 0.0;
            }
        }
    }
    
    public final void method8777(final Class2284 class2284) {
        if (this.field13884 < 4 || this.field13885 < 4) {
            this.field13886 = new double[4][4];
            this.field13884 = 4;
            this.field13885 = 4;
        }
        this.field13886[0][0] = class2284.field13891;
        this.field13886[0][1] = class2284.field13892;
        this.field13886[0][2] = class2284.field13893;
        this.field13886[0][3] = class2284.field13894;
        this.field13886[1][0] = class2284.field13895;
        this.field13886[1][1] = class2284.field13896;
        this.field13886[1][2] = class2284.field13897;
        this.field13886[1][3] = class2284.field13898;
        this.field13886[2][0] = class2284.field13899;
        this.field13886[2][1] = class2284.field13900;
        this.field13886[2][2] = class2284.field13901;
        this.field13886[2][3] = class2284.field13902;
        this.field13886[3][0] = class2284.field13903;
        this.field13886[3][1] = class2284.field13904;
        this.field13886[3][2] = class2284.field13905;
        this.field13886[3][3] = class2284.field13906;
        for (int i = 4; i < this.field13884; ++i) {
            for (int j = 4; j < this.field13885; ++j) {
                this.field13886[i][j] = 0.0;
            }
        }
    }
    
    public final void method8778(final Class2304 class2304) {
        if (this.field13884 < 4 || this.field13885 < 4) {
            this.field13886 = new double[4][4];
            this.field13884 = 4;
            this.field13885 = 4;
        }
        this.field13886[0][0] = class2304.field13961;
        this.field13886[0][1] = class2304.field13962;
        this.field13886[0][2] = class2304.field13963;
        this.field13886[0][3] = class2304.field13964;
        this.field13886[1][0] = class2304.field13965;
        this.field13886[1][1] = class2304.field13966;
        this.field13886[1][2] = class2304.field13967;
        this.field13886[1][3] = class2304.field13968;
        this.field13886[2][0] = class2304.field13969;
        this.field13886[2][1] = class2304.field13970;
        this.field13886[2][2] = class2304.field13971;
        this.field13886[2][3] = class2304.field13972;
        this.field13886[3][0] = class2304.field13973;
        this.field13886[3][1] = class2304.field13974;
        this.field13886[3][2] = class2304.field13975;
        this.field13886[3][3] = class2304.field13976;
        for (int i = 4; i < this.field13884; ++i) {
            for (int j = 4; j < this.field13885; ++j) {
                this.field13886[i][j] = 0.0;
            }
        }
    }
    
    public final void method8779(final Class2282 class2282) {
        if (this.field13884 < class2282.field13884 || this.field13885 < class2282.field13885) {
            this.field13884 = class2282.field13884;
            this.field13885 = class2282.field13885;
            this.field13886 = new double[this.field13884][this.field13885];
        }
        for (int i = 0; i < Math.min(this.field13884, class2282.field13884); ++i) {
            if (Math.min(this.field13885, class2282.field13885) >= 0)
                System.arraycopy(class2282.field13886[i], 0, this.field13886[i], 0, Math.min(this.field13885, class2282.field13885));
        }
        for (int k = class2282.field13884; k < this.field13884; ++k) {
            for (int l = class2282.field13885; l < this.field13885; ++l) {
                this.field13886[k][l] = 0.0;
            }
        }
    }
    
    public final int method8780() {
        return this.field13884;
    }
    
    public final int method8781() {
        return this.field13885;
    }
    
    public final double method8782(final int n, final int n2) {
        return this.field13886[n][n2];
    }
    
    public final void method8783(final int n, final int n2, final double n3) {
        this.field13886[n][n2] = n3;
    }
    
    public final void method8784(final int n, final double[] array) {
        if (this.field13885 >= 0) System.arraycopy(this.field13886[n], 0, array, 0, this.field13885);
    }
    
    public final void method8785(final int n, final Class2281 class2281) {
        if (class2281.method8746() < this.field13885) {
            class2281.method8738(this.field13885);
        }
        if (this.field13885 >= 0) System.arraycopy(this.field13886[n], 0, class2281.field13880, 0, this.field13885);
    }
    
    public final void method8786(final int n, final double[] array) {
        for (int i = 0; i < this.field13884; ++i) {
            array[i] = this.field13886[i][n];
        }
    }
    
    public final void method8787(final int n, final Class2281 class2281) {
        if (class2281.method8746() < this.field13884) {
            class2281.method8738(this.field13884);
        }
        for (int i = 0; i < this.field13884; ++i) {
            class2281.field13880[i] = this.field13886[i][n];
        }
    }
    
    public final void method8788(final Class2274 class2274) {
        if (this.field13884 >= 3 && this.field13885 >= 3) {
            class2274.field13845 = this.field13886[0][0];
            class2274.field13846 = this.field13886[0][1];
            class2274.field13847 = this.field13886[0][2];
            class2274.field13848 = this.field13886[1][0];
            class2274.field13849 = this.field13886[1][1];
            class2274.field13850 = this.field13886[1][2];
            class2274.field13851 = this.field13886[2][0];
            class2274.field13852 = this.field13886[2][1];
            class2274.field13853 = this.field13886[2][2];
        }
        else {
            class2274.method8617();
            if (this.field13885 > 0) {
                if (this.field13884 > 0) {
                    class2274.field13845 = this.field13886[0][0];
                    if (this.field13884 > 1) {
                        class2274.field13848 = this.field13886[1][0];
                        if (this.field13884 > 2) {
                            class2274.field13851 = this.field13886[2][0];
                        }
                    }
                }
                if (this.field13885 > 1) {
                    if (this.field13884 > 0) {
                        class2274.field13846 = this.field13886[0][1];
                        if (this.field13884 > 1) {
                            class2274.field13849 = this.field13886[1][1];
                            if (this.field13884 > 2) {
                                class2274.field13852 = this.field13886[2][1];
                            }
                        }
                    }
                    if (this.field13885 > 2) {
                        if (this.field13884 > 0) {
                            class2274.field13847 = this.field13886[0][2];
                            if (this.field13884 > 1) {
                                class2274.field13850 = this.field13886[1][2];
                                if (this.field13884 > 2) {
                                    class2274.field13853 = this.field13886[2][2];
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void method8789(final Class2296 class2296) {
        if (this.field13884 >= 3 && this.field13885 >= 3) {
            class2296.field13935 = (float)this.field13886[0][0];
            class2296.field13936 = (float)this.field13886[0][1];
            class2296.field13937 = (float)this.field13886[0][2];
            class2296.field13938 = (float)this.field13886[1][0];
            class2296.field13939 = (float)this.field13886[1][1];
            class2296.field13940 = (float)this.field13886[1][2];
            class2296.field13941 = (float)this.field13886[2][0];
            class2296.field13942 = (float)this.field13886[2][1];
            class2296.field13943 = (float)this.field13886[2][2];
        }
        else {
            class2296.method9116();
            if (this.field13885 > 0) {
                if (this.field13884 > 0) {
                    class2296.field13935 = (float)this.field13886[0][0];
                    if (this.field13884 > 1) {
                        class2296.field13938 = (float)this.field13886[1][0];
                        if (this.field13884 > 2) {
                            class2296.field13941 = (float)this.field13886[2][0];
                        }
                    }
                }
                if (this.field13885 > 1) {
                    if (this.field13884 > 0) {
                        class2296.field13936 = (float)this.field13886[0][1];
                        if (this.field13884 > 1) {
                            class2296.field13939 = (float)this.field13886[1][1];
                            if (this.field13884 > 2) {
                                class2296.field13942 = (float)this.field13886[2][1];
                            }
                        }
                    }
                    if (this.field13885 > 2) {
                        if (this.field13884 > 0) {
                            class2296.field13937 = (float)this.field13886[0][2];
                            if (this.field13884 > 1) {
                                class2296.field13940 = (float)this.field13886[1][2];
                                if (this.field13884 > 2) {
                                    class2296.field13943 = (float)this.field13886[2][2];
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void method8790(final Class2304 class2304) {
        if (this.field13884 >= 4 && this.field13885 >= 4) {
            class2304.field13961 = this.field13886[0][0];
            class2304.field13962 = this.field13886[0][1];
            class2304.field13963 = this.field13886[0][2];
            class2304.field13964 = this.field13886[0][3];
            class2304.field13965 = this.field13886[1][0];
            class2304.field13966 = this.field13886[1][1];
            class2304.field13967 = this.field13886[1][2];
            class2304.field13968 = this.field13886[1][3];
            class2304.field13969 = this.field13886[2][0];
            class2304.field13970 = this.field13886[2][1];
            class2304.field13971 = this.field13886[2][2];
            class2304.field13972 = this.field13886[2][3];
            class2304.field13973 = this.field13886[3][0];
            class2304.field13974 = this.field13886[3][1];
            class2304.field13975 = this.field13886[3][2];
            class2304.field13976 = this.field13886[3][3];
        }
        else {
            class2304.method9307();
            if (this.field13885 > 0) {
                if (this.field13884 > 0) {
                    class2304.field13961 = this.field13886[0][0];
                    if (this.field13884 > 1) {
                        class2304.field13965 = this.field13886[1][0];
                        if (this.field13884 > 2) {
                            class2304.field13969 = this.field13886[2][0];
                            if (this.field13884 > 3) {
                                class2304.field13973 = this.field13886[3][0];
                            }
                        }
                    }
                }
                if (this.field13885 > 1) {
                    if (this.field13884 > 0) {
                        class2304.field13962 = this.field13886[0][1];
                        if (this.field13884 > 1) {
                            class2304.field13966 = this.field13886[1][1];
                            if (this.field13884 > 2) {
                                class2304.field13970 = this.field13886[2][1];
                                if (this.field13884 > 3) {
                                    class2304.field13974 = this.field13886[3][1];
                                }
                            }
                        }
                    }
                    if (this.field13885 > 2) {
                        if (this.field13884 > 0) {
                            class2304.field13963 = this.field13886[0][2];
                            if (this.field13884 > 1) {
                                class2304.field13967 = this.field13886[1][2];
                                if (this.field13884 > 2) {
                                    class2304.field13971 = this.field13886[2][2];
                                    if (this.field13884 > 3) {
                                        class2304.field13975 = this.field13886[3][2];
                                    }
                                }
                            }
                        }
                        if (this.field13885 > 3) {
                            if (this.field13884 > 0) {
                                class2304.field13964 = this.field13886[0][3];
                                if (this.field13884 > 1) {
                                    class2304.field13968 = this.field13886[1][3];
                                    if (this.field13884 > 2) {
                                        class2304.field13972 = this.field13886[2][3];
                                        if (this.field13884 > 3) {
                                            class2304.field13976 = this.field13886[3][3];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void method8791(final Class2284 class2284) {
        if (this.field13884 >= 4 && this.field13885 >= 4) {
            class2284.field13891 = (float)this.field13886[0][0];
            class2284.field13892 = (float)this.field13886[0][1];
            class2284.field13893 = (float)this.field13886[0][2];
            class2284.field13894 = (float)this.field13886[0][3];
            class2284.field13895 = (float)this.field13886[1][0];
            class2284.field13896 = (float)this.field13886[1][1];
            class2284.field13897 = (float)this.field13886[1][2];
            class2284.field13898 = (float)this.field13886[1][3];
            class2284.field13899 = (float)this.field13886[2][0];
            class2284.field13900 = (float)this.field13886[2][1];
            class2284.field13901 = (float)this.field13886[2][2];
            class2284.field13902 = (float)this.field13886[2][3];
            class2284.field13903 = (float)this.field13886[3][0];
            class2284.field13904 = (float)this.field13886[3][1];
            class2284.field13905 = (float)this.field13886[3][2];
            class2284.field13906 = (float)this.field13886[3][3];
        }
        else {
            class2284.method8908();
            if (this.field13885 > 0) {
                if (this.field13884 > 0) {
                    class2284.field13891 = (float)this.field13886[0][0];
                    if (this.field13884 > 1) {
                        class2284.field13895 = (float)this.field13886[1][0];
                        if (this.field13884 > 2) {
                            class2284.field13899 = (float)this.field13886[2][0];
                            if (this.field13884 > 3) {
                                class2284.field13903 = (float)this.field13886[3][0];
                            }
                        }
                    }
                }
                if (this.field13885 > 1) {
                    if (this.field13884 > 0) {
                        class2284.field13892 = (float)this.field13886[0][1];
                        if (this.field13884 > 1) {
                            class2284.field13896 = (float)this.field13886[1][1];
                            if (this.field13884 > 2) {
                                class2284.field13900 = (float)this.field13886[2][1];
                                if (this.field13884 > 3) {
                                    class2284.field13904 = (float)this.field13886[3][1];
                                }
                            }
                        }
                    }
                    if (this.field13885 > 2) {
                        if (this.field13884 > 0) {
                            class2284.field13893 = (float)this.field13886[0][2];
                            if (this.field13884 > 1) {
                                class2284.field13897 = (float)this.field13886[1][2];
                                if (this.field13884 > 2) {
                                    class2284.field13901 = (float)this.field13886[2][2];
                                    if (this.field13884 > 3) {
                                        class2284.field13905 = (float)this.field13886[3][2];
                                    }
                                }
                            }
                        }
                        if (this.field13885 > 3) {
                            if (this.field13884 > 0) {
                                class2284.field13894 = (float)this.field13886[0][3];
                                if (this.field13884 > 1) {
                                    class2284.field13898 = (float)this.field13886[1][3];
                                    if (this.field13884 > 2) {
                                        class2284.field13902 = (float)this.field13886[2][3];
                                        if (this.field13884 > 3) {
                                            class2284.field13906 = (float)this.field13886[3][3];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void method8792(final Class2282 class2282) {
        int n;
        if (this.field13885 >= class2282.field13885) {
            n = class2282.field13885;
        }
        else {
            n = this.field13885;
        }
        int n2;
        if (this.field13884 >= class2282.field13884) {
            n2 = class2282.field13884;
        }
        else {
            n2 = this.field13884;
        }
        for (int i = 0; i < n2; ++i) {
            if (n >= 0) System.arraycopy(this.field13886[i], 0, class2282.field13886[i], 0, n);
        }
        for (int k = n2; k < class2282.field13884; ++k) {
            for (int l = 0; l < class2282.field13885; ++l) {
                class2282.field13886[k][l] = 0.0;
            }
        }
        for (int n3 = n; n3 < class2282.field13885; ++n3) {
            for (int n4 = 0; n4 < n2; ++n4) {
                class2282.field13886[n4][n3] = 0.0;
            }
        }
    }
    
    public final void method8793(final int n, final double[] array) {
        if (this.field13885 >= 0) System.arraycopy(array, 0, this.field13886[n], 0, this.field13885);
    }
    
    public final void method8794(final int n, final Class2281 class2281) {
        if (this.field13885 >= 0) System.arraycopy(class2281.field13880, 0, this.field13886[n], 0, this.field13885);
    }
    
    public final void method8795(final int n, final double[] array) {
        for (int i = 0; i < this.field13884; ++i) {
            this.field13886[i][n] = array[i];
        }
    }
    
    public final void method8796(final int n, final Class2281 class2281) {
        for (int i = 0; i < this.field13884; ++i) {
            this.field13886[i][n] = class2281.field13880[i];
        }
    }
    
    public final void method8797(final Class2282 class2282, final Class2282 class2283) {
        if (class2282.field13884 == class2283.field13885) {
            if (this.field13884 == class2282.field13885) {
                if (this.field13885 == class2283.field13884) {
                    if (class2282 != this && class2283 != this) {
                        for (int i = 0; i < this.field13884; ++i) {
                            for (int j = 0; j < this.field13885; ++j) {
                                this.field13886[i][j] = 0.0;
                                for (int k = 0; k < class2282.field13884; ++k) {
                                    final double[] array = this.field13886[i];
                                    final int n = j;
                                    array[n] += class2282.field13886[k][i] * class2283.field13886[j][k];
                                }
                            }
                        }
                    }
                    else {
                        final double[][] field13886 = new double[this.field13884][this.field13885];
                        for (int l = 0; l < this.field13884; ++l) {
                            for (int n2 = 0; n2 < this.field13885; ++n2) {
                                field13886[l][n2] = 0.0;
                                for (int n3 = 0; n3 < class2282.field13884; ++n3) {
                                    final double[] array2 = field13886[l];
                                    final int n4 = n2;
                                    array2[n4] += class2282.field13886[n3][l] * class2283.field13886[n2][n3];
                                }
                            }
                        }
                        this.field13886 = field13886;
                    }
                    return;
                }
            }
        }
        throw new Class2363(Class9531.method35584("GMatrix14"));
    }
    
    public final void method8798(final Class2282 class2282, final Class2282 class2283) {
        if (class2282.field13885 == class2283.field13885) {
            if (this.field13885 == class2283.field13884) {
                if (this.field13884 == class2282.field13884) {
                    if (class2282 != this && class2283 != this) {
                        for (int i = 0; i < this.field13884; ++i) {
                            for (int j = 0; j < this.field13885; ++j) {
                                this.field13886[i][j] = 0.0;
                                for (int k = 0; k < class2282.field13885; ++k) {
                                    final double[] array = this.field13886[i];
                                    final int n = j;
                                    array[n] += class2282.field13886[i][k] * class2283.field13886[j][k];
                                }
                            }
                        }
                    }
                    else {
                        final double[][] field13886 = new double[this.field13884][this.field13885];
                        for (int l = 0; l < this.field13884; ++l) {
                            for (int n2 = 0; n2 < this.field13885; ++n2) {
                                field13886[l][n2] = 0.0;
                                for (int n3 = 0; n3 < class2282.field13885; ++n3) {
                                    final double[] array2 = field13886[l];
                                    final int n4 = n2;
                                    array2[n4] += class2282.field13886[l][n3] * class2283.field13886[n2][n3];
                                }
                            }
                        }
                        this.field13886 = field13886;
                    }
                    return;
                }
            }
        }
        throw new Class2363(Class9531.method35584("GMatrix15"));
    }
    
    public final void method8799(final Class2282 class2282, final Class2282 class2283) {
        if (class2282.field13884 == class2283.field13884) {
            if (this.field13885 == class2283.field13885) {
                if (this.field13884 == class2282.field13885) {
                    if (class2282 != this && class2283 != this) {
                        for (int i = 0; i < this.field13884; ++i) {
                            for (int j = 0; j < this.field13885; ++j) {
                                this.field13886[i][j] = 0.0;
                                for (int k = 0; k < class2282.field13884; ++k) {
                                    final double[] array = this.field13886[i];
                                    final int n = j;
                                    array[n] += class2282.field13886[k][i] * class2283.field13886[k][j];
                                }
                            }
                        }
                    }
                    else {
                        final double[][] field13886 = new double[this.field13884][this.field13885];
                        for (int l = 0; l < this.field13884; ++l) {
                            for (int n2 = 0; n2 < this.field13885; ++n2) {
                                field13886[l][n2] = 0.0;
                                for (int n3 = 0; n3 < class2282.field13884; ++n3) {
                                    final double[] array2 = field13886[l];
                                    final int n4 = n2;
                                    array2[n4] += class2282.field13886[n3][l] * class2283.field13886[n3][n2];
                                }
                            }
                        }
                        this.field13886 = field13886;
                    }
                    return;
                }
            }
        }
        throw new Class2363(Class9531.method35584("GMatrix16"));
    }
    
    public final void method8800() {
        if (this.field13884 == this.field13885) {
            for (int i = 0; i < this.field13884; ++i) {
                for (int j = 0; j < i; ++j) {
                    final double n = this.field13886[i][j];
                    this.field13886[i][j] = this.field13886[j][i];
                    this.field13886[j][i] = n;
                }
            }
        }
        else {
            final int field13884 = this.field13884;
            this.field13884 = this.field13885;
            this.field13885 = field13884;
            final double[][] field13885 = new double[this.field13884][this.field13885];
            for (int k = 0; k < this.field13884; ++k) {
                for (int l = 0; l < this.field13885; ++l) {
                    field13885[k][l] = this.field13886[l][k];
                }
            }
            this.field13886 = field13885;
        }
    }
    
    public final void method8801(final Class2282 class2282) {
        if (this.field13884 == class2282.field13885 && this.field13885 == class2282.field13884) {
            if (class2282 == this) {
                this.method8800();
            }
            else {
                for (int i = 0; i < this.field13884; ++i) {
                    for (int j = 0; j < this.field13885; ++j) {
                        this.field13886[i][j] = class2282.field13886[j][i];
                    }
                }
            }
            return;
        }
        throw new Class2363(Class9531.method35584("GMatrix17"));
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(this.field13884 * this.field13885 * 8);
        for (int i = 0; i < this.field13884; ++i) {
            for (int j = 0; j < this.field13885; ++j) {
                sb.append(this.field13886[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    private static void method8802(final Class2282 class2282) {
        for (int i = 0; i < class2282.field13884; ++i) {
            for (int j = 0; j < class2282.field13885; ++j) {
                if (Math.abs(class2282.field13886[i][j]) >= 1.0E-10) {
                    System.out.print(" " + class2282.field13886[i][j]);
                }
                else {
                    System.out.print(" 0.0     ");
                }
            }
            System.out.print("\n");
        }
    }
    
    @Override
    public int hashCode() {
        long n = 31L * (31L + this.field13884) + this.field13885;
        for (int i = 0; i < this.field13884; ++i) {
            for (int j = 0; j < this.field13885; ++j) {
                n = 31L * n + Class9427.method35031(this.field13886[i][j]);
            }
        }
        return (int)(n ^ n >> 32);
    }
    
    public boolean equals(final Class2282 class2282) {
        try {
            if (this.field13884 != class2282.field13884 || this.field13885 != class2282.field13885) {
                return false;
            }
            for (int i = 0; i < this.field13884; ++i) {
                for (int j = 0; j < this.field13885; ++j) {
                    if (this.field13886[i][j] != class2282.field13886[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2282 class2282 = (Class2282)o;
            if (this.field13884 != class2282.field13884 || this.field13885 != class2282.field13885) {
                return false;
            }
            for (int i = 0; i < this.field13884; ++i) {
                for (int j = 0; j < this.field13885; ++j) {
                    if (this.field13886[i][j] != class2282.field13886[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }
        catch (final ClassCastException ex) {
            return false;
        }
        catch (final NullPointerException ex2) {
            return false;
        }
    }
    
    @Deprecated
    public boolean method8803(final Class2282 class2282, final float n) {
        return this.method8804(class2282, n);
    }
    
    public boolean method8804(final Class2282 class2282, final double n) {
        if (this.field13884 == class2282.field13884 && this.field13885 == class2282.field13885) {
            for (int i = 0; i < this.field13884; ++i) {
                for (int j = 0; j < this.field13885; ++j) {
                    final double n2 = this.field13886[i][j] - class2282.field13886[i][j];
                    if (((n2 >= 0.0) ? n2 : (-n2)) > n) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public final double method8805() {
        int n;
        if (this.field13884 >= this.field13885) {
            n = this.field13885;
        }
        else {
            n = this.field13884;
        }
        double n2 = 0.0;
        for (int i = 0; i < n; ++i) {
            n2 += this.field13886[i][i];
        }
        return n2;
    }
    
    public final int method8806(final Class2282 class2282, final Class2282 class2283, final Class2282 class2284) {
        if (this.field13885 != class2284.field13885 || this.field13885 != class2284.field13884) {
            throw new Class2363(Class9531.method35584("GMatrix18"));
        }
        if (this.field13884 != class2282.field13884 || this.field13884 != class2282.field13885) {
            throw new Class2363(Class9531.method35584("GMatrix25"));
        }
        if (this.field13884 == class2283.field13884 && this.field13885 == class2283.field13885) {
            if (this.field13884 == 2) {
                if (this.field13885 == 2) {
                    if (this.field13886[1][0] == 0.0) {
                        class2282.method8767();
                        class2284.method8767();
                        if (this.field13886[0][1] != 0.0) {
                            final double[] array = { 0.0 };
                            final double[] array2 = { 0.0 };
                            final double[] array3 = { 0.0 };
                            final double[] array4 = { 0.0 };
                            method8826(this.field13886[0][0], this.field13886[0][1], this.field13886[1][1], new double[] { this.field13886[0][0], this.field13886[1][1] }, array, array3, array2, array4, 0);
                            method8820(0, class2282, array3, array);
                            method8815(0, class2284, array4, array2);
                            return 2;
                        }
                        return 2;
                    }
                }
            }
            return method8812(this, class2282, class2283, class2284);
        }
        throw new Class2363(Class9531.method35584("GMatrix26"));
    }
    
    public final int method8807(final Class2282 class2282, final Class2281 class2283) {
        final double[] array = new double[class2282.field13884 * class2282.field13885];
        final int[] array2 = { 0 };
        final int[] array3 = new int[class2282.field13884];
        if (this.field13884 != this.field13885) {
            throw new Class2363(Class9531.method35584("GMatrix19"));
        }
        if (this.field13884 != class2282.field13884) {
            throw new Class2363(Class9531.method35584("GMatrix27"));
        }
        if (this.field13885 != class2282.field13885) {
            throw new Class2363(Class9531.method35584("GMatrix27"));
        }
        if (class2282.field13884 != class2283.method8746()) {
            throw new Class2363(Class9531.method35584("GMatrix20"));
        }
        for (int i = 0; i < this.field13884; ++i) {
            System.arraycopy(this.field13886[i], 0, array, i * this.field13885 + 0, this.field13885);
        }
        if (method8810(class2282.field13884, array, array3, array2)) {
            for (int k = 0; k < this.field13884; ++k) {
                if (this.field13885 >= 0)
                    System.arraycopy(array, k * this.field13885 + 0, class2282.field13886[k], 0, this.field13885);
            }
            for (int n = 0; n < class2282.field13884; ++n) {
                class2283.field13880[n] = array3[n];
            }
            return array2[0];
        }
        throw new Class2383(Class9531.method35584("GMatrix21"));
    }
    
    public final void method8808(final double n) {
        int n2;
        if (this.field13884 >= this.field13885) {
            n2 = this.field13885;
        }
        else {
            n2 = this.field13884;
        }
        for (int i = 0; i < this.field13884; ++i) {
            for (int j = 0; j < this.field13885; ++j) {
                this.field13886[i][j] = 0.0;
            }
        }
        for (int k = 0; k < n2; ++k) {
            this.field13886[k][k] = n;
        }
    }
    
    public final void method8809(final Class2282 class2282) {
        final int n = class2282.field13884 * class2282.field13885;
        final double[] array = new double[n];
        final double[] array2 = new double[n];
        final int[] array3 = new int[class2282.field13884];
        final int[] array4 = { 0 };
        if (class2282.field13884 != class2282.field13885) {
            throw new Class2363(Class9531.method35584("GMatrix22"));
        }
        for (int i = 0; i < this.field13884; ++i) {
            if (this.field13885 >= 0)
                System.arraycopy(class2282.field13886[i], 0, array, i * this.field13885 + 0, this.field13885);
        }
        if (method8810(class2282.field13884, array, array3, array4)) {
            for (int k = 0; k < n; ++k) {
                array2[k] = 0.0;
            }
            for (int l = 0; l < this.field13885; ++l) {
                array2[l + l * this.field13885] = 1.0;
            }
            method8811(class2282.field13884, array, array3, array2);
            for (int n2 = 0; n2 < this.field13884; ++n2) {
                if (this.field13885 >= 0)
                    System.arraycopy(array2, n2 * this.field13885 + 0, this.field13886[n2], 0, this.field13885);
            }
            return;
        }
        throw new Class2383(Class9531.method35584("GMatrix21"));
    }
    
    public static boolean method8810(final int n, final double[] array, final int[] array2, final int[] array3) {
        final double[] array4 = new double[n];
        int n2 = 0;
        int n3 = 0;
        array3[0] = 1;
        int n4 = n;
        while (n4-- != 0) {
            double n5 = 0.0;
            int n6 = n;
            while (n6-- != 0) {
                final double abs = Math.abs(array[n2++]);
                if (abs <= n5) {
                    continue;
                }
                n5 = abs;
            }
            if (n5 == 0.0) {
                return false;
            }
            array4[n3++] = 1.0 / n5;
        }
        final int n7 = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                final int n8 = n7 + n * j + i;
                double n9 = array[n8];
                int n10 = j;
                int n11 = n7 + n * j;
                int n12 = n7 + i;
                while (n10-- != 0) {
                    n9 -= array[n11] * array[n12];
                    ++n11;
                    n12 += n;
                }
                array[n8] = n9;
            }
            double n13 = 0.0;
            int n14 = -1;
            for (int k = i; k < n; ++k) {
                final int n15 = n7 + n * k + i;
                double a = array[n15];
                int n16 = i;
                int n17 = n7 + n * k;
                int n18 = n7 + i;
                while (n16-- != 0) {
                    a -= array[n17] * array[n18];
                    ++n17;
                    n18 += n;
                }
                array[n15] = a;
                final double n19;
                if ((n19 = array4[k] * Math.abs(a)) >= n13) {
                    n13 = n19;
                    n14 = k;
                }
            }
            if (n14 < 0) {
                throw new RuntimeException(Class9531.method35584("GMatrix24"));
            }
            if (i != n14) {
                int n20 = n;
                int n21 = n7 + n * n14;
                int n22 = n7 + n * i;
                while (n20-- != 0) {
                    final double n23 = array[n21];
                    array[n21++] = array[n22];
                    array[n22++] = n23;
                }
                array4[n14] = array4[i];
                array3[0] = -array3[0];
            }
            array2[i] = n14;
            if (array[n7 + n * i + i] == 0.0) {
                return false;
            }
            if (i != n - 1) {
                final double n24 = 1.0 / array[n7 + n * i + i];
                int n25 = n7 + n * (i + 1) + i;
                int n26 = n - 1 - i;
                while (n26-- != 0) {
                    final int n27 = n25;
                    array[n27] *= n24;
                    n25 += n;
                }
            }
        }
        return true;
    }
    
    public static void method8811(final int n, final double[] array, final int[] array2, final double[] array3) {
        final int n2 = 0;
        for (int i = 0; i < n; ++i) {
            final int n3 = i;
            int n4 = -1;
            for (int j = 0; j < n; ++j) {
                final int n5 = array2[n2 + j];
                double n6 = array3[n3 + n * n5];
                array3[n3 + n * n5] = array3[n3 + n * j];
                if (n4 < 0) {
                    if (n6 != 0.0) {
                        n4 = j;
                    }
                }
                else {
                    final int n7 = j * n;
                    for (int k = n4; k <= j - 1; ++k) {
                        n6 -= array[n7 + k] * array3[n3 + n * k];
                    }
                }
                array3[n3 + n * j] = n6;
            }
            for (int l = 0; l < n; ++l) {
                final int n8 = n - 1 - l;
                final int n9 = n * n8;
                double n10 = 0.0;
                for (int n11 = 1; n11 <= l; ++n11) {
                    n10 += array[n9 + n - n11] * array3[n3 + n * (n - n11)];
                }
                array3[n3 + n * n8] = (array3[n3 + n * n8] - n10) / array[n9 + n8];
            }
        }
    }
    
    public static int method8812(final Class2282 class2282, final Class2282 class2283, final Class2282 class2284, final Class2282 class2285) {
        final Class2282 class2286 = new Class2282(class2282.field13884, class2282.field13885);
        final Class2282 class2287 = new Class2282(class2282.field13884, class2282.field13885);
        final Class2282 class2288 = new Class2282(class2282.field13884, class2282.field13885);
        final Class2282 class2289 = new Class2282(class2282);
        int n;
        int field13884;
        if (class2289.field13884 < class2289.field13885) {
            n = class2289.field13884;
            field13884 = class2289.field13884;
        }
        else {
            n = class2289.field13885;
            field13884 = class2289.field13885 - 1;
        }
        int n2;
        if (class2289.field13884 <= class2289.field13885) {
            n2 = class2289.field13885;
        }
        else {
            n2 = class2289.field13884;
        }
        final double[] array = new double[n2];
        final double[] array2 = new double[n];
        final double[] array3 = new double[field13884];
        class2283.method8767();
        class2285.method8767();
        int field13885 = class2289.field13884;
        int field13886 = class2289.field13885;
        for (int i = 0; i < n; ++i) {
            if (field13885 > 1) {
                double a = 0.0;
                for (int j = 0; j < field13885; ++j) {
                    a += class2289.field13886[j + i][i] * class2289.field13886[j + i][i];
                }
                final double sqrt = Math.sqrt(a);
                if (class2289.field13886[i][i] != 0.0) {
                    array[0] = class2289.field13886[i][i] + method8828(sqrt, class2289.field13886[i][i]);
                }
                else {
                    array[0] = sqrt;
                }
                for (int k = 1; k < field13885; ++k) {
                    array[k] = class2289.field13886[i + k][i];
                }
                double n3 = 0.0;
                for (int l = 0; l < field13885; ++l) {
                    n3 += array[l] * array[l];
                }
                final double n4 = 2.0 / n3;
                for (int n5 = i; n5 < class2289.field13884; ++n5) {
                    for (int n6 = i; n6 < class2289.field13884; ++n6) {
                        class2287.field13886[n5][n6] = -n4 * array[n5 - i] * array[n6 - i];
                    }
                }
                for (int n7 = i; n7 < class2289.field13884; ++n7) {
                    final double[] array4 = class2287.field13886[n7];
                    final int n8 = n7;
                    ++array4[n8];
                }
                double n9 = 0.0;
                for (int n10 = i; n10 < class2289.field13884; ++n10) {
                    n9 += class2287.field13886[i][n10] * class2289.field13886[n10][i];
                }
                class2289.field13886[i][i] = n9;
                for (int n11 = i; n11 < class2289.field13884; ++n11) {
                    for (int n12 = i + 1; n12 < class2289.field13885; ++n12) {
                        class2286.field13886[n11][n12] = 0.0;
                        for (int n13 = i; n13 < class2289.field13885; ++n13) {
                            final double[] array5 = class2286.field13886[n11];
                            final int n14 = n12;
                            array5[n14] += class2287.field13886[n11][n13] * class2289.field13886[n13][n12];
                        }
                    }
                }
                for (int n15 = i; n15 < class2289.field13884; ++n15) {
                    if (class2289.field13885 - (i + 1) >= 0)
                        System.arraycopy(class2286.field13886[n15], i + 1, class2289.field13886[n15], i + 1, class2289.field13885 - (i + 1));
                }
                for (int n17 = i; n17 < class2289.field13884; ++n17) {
                    for (int n18 = 0; n18 < class2289.field13885; ++n18) {
                        class2286.field13886[n17][n18] = 0.0;
                        for (int n19 = i; n19 < class2289.field13885; ++n19) {
                            final double[] array6 = class2286.field13886[n17];
                            final int n20 = n18;
                            array6[n20] += class2287.field13886[n17][n19] * class2283.field13886[n19][n18];
                        }
                    }
                }
                for (int n21 = i; n21 < class2289.field13884; ++n21) {
                    if (class2289.field13885 >= 0)
                        System.arraycopy(class2286.field13886[n21], 0, class2283.field13886[n21], 0, class2289.field13885);
                }
                --field13885;
            }
            if (field13886 > 2) {
                double a2 = 0.0;
                for (int n23 = 1; n23 < field13886; ++n23) {
                    a2 += class2289.field13886[i][i + n23] * class2289.field13886[i][i + n23];
                }
                final double sqrt2 = Math.sqrt(a2);
                if (class2289.field13886[i][i + 1] != 0.0) {
                    array[0] = class2289.field13886[i][i + 1] + method8828(sqrt2, class2289.field13886[i][i + 1]);
                }
                else {
                    array[0] = sqrt2;
                }
                for (int n24 = 1; n24 < field13886 - 1; ++n24) {
                    array[n24] = class2289.field13886[i][i + n24 + 1];
                }
                double n25 = 0.0;
                for (int n26 = 0; n26 < field13886 - 1; ++n26) {
                    n25 += array[n26] * array[n26];
                }
                final double n27 = 2.0 / n25;
                for (int n28 = i + 1; n28 < field13886; ++n28) {
                    for (int n29 = i + 1; n29 < class2289.field13885; ++n29) {
                        class2288.field13886[n28][n29] = -n27 * array[n28 - i - 1] * array[n29 - i - 1];
                    }
                }
                for (int n30 = i + 1; n30 < class2289.field13885; ++n30) {
                    final double[] array7 = class2288.field13886[n30];
                    final int n31 = n30;
                    ++array7[n31];
                }
                double n32 = 0.0;
                for (int n33 = i; n33 < class2289.field13885; ++n33) {
                    n32 += class2288.field13886[n33][i + 1] * class2289.field13886[i][n33];
                }
                class2289.field13886[i][i + 1] = n32;
                for (int n34 = i + 1; n34 < class2289.field13884; ++n34) {
                    for (int n35 = i + 1; n35 < class2289.field13885; ++n35) {
                        class2286.field13886[n34][n35] = 0.0;
                        for (int n36 = i + 1; n36 < class2289.field13885; ++n36) {
                            final double[] array8 = class2286.field13886[n34];
                            final int n37 = n35;
                            array8[n37] += class2288.field13886[n36][n35] * class2289.field13886[n34][n36];
                        }
                    }
                }
                for (int n38 = i + 1; n38 < class2289.field13884; ++n38) {
                    if (class2289.field13885 - (i + 1) >= 0)
                        System.arraycopy(class2286.field13886[n38], i + 1, class2289.field13886[n38], i + 1, class2289.field13885 - (i + 1));
                }
                for (int n40 = 0; n40 < class2289.field13884; ++n40) {
                    for (int n41 = i + 1; n41 < class2289.field13885; ++n41) {
                        class2286.field13886[n40][n41] = 0.0;
                        for (int n42 = i + 1; n42 < class2289.field13885; ++n42) {
                            final double[] array9 = class2286.field13886[n40];
                            final int n43 = n41;
                            array9[n43] += class2288.field13886[n42][n41] * class2285.field13886[n40][n42];
                        }
                    }
                }
                for (int n44 = 0; n44 < class2289.field13884; ++n44) {
                    if (class2289.field13885 - (i + 1) >= 0)
                        System.arraycopy(class2286.field13886[n44], i + 1, class2285.field13886[n44], i + 1, class2289.field13885 - (i + 1));
                }
                --field13886;
            }
        }
        for (int n46 = 0; n46 < n; ++n46) {
            array2[n46] = class2289.field13886[n46][n46];
        }
        for (int n47 = 0; n47 < field13884; ++n47) {
            array3[n47] = class2289.field13886[n47][n47 + 1];
        }
        if (class2289.field13884 == 2 && class2289.field13885 == 2) {
            final double[] array10 = { 0.0 };
            final double[] array11 = { 0.0 };
            final double[] array12 = { 0.0 };
            final double[] array13 = { 0.0 };
            method8826(array2[0], array3[0], array2[1], array2, array12, array10, array13, array11, 0);
            method8820(0, class2283, array10, array12);
            method8815(0, class2285, array11, array13);
            return 2;
        }
        method8813(0, array3.length - 1, array2, array3, class2283, class2285);
        return array2.length;
    }
    
    public static void method8813(final int n, int n2, final double[] array, final double[] array2, final Class2282 class2282, final Class2282 class2283) {
        final double[] array3 = { 0.0 };
        final double[] array4 = { 0.0 };
        final double[] array5 = { 0.0 };
        final double[] array6 = { 0.0 };
        final Class2282 class2284 = new Class2282(class2282.field13885, class2283.field13884);
        final double n3 = 1.0;
        int n4 = 0;
        double n5 = 0.0;
        double n6 = 0.0;
        for (int n7 = 0; n7 < 2 && n4 == 0; ++n7) {
            int i;
            for (i = n; i <= n2; ++i) {
                if (i == n) {
                    int n8;
                    if (array2.length != array.length) {
                        n8 = n2 + 1;
                    }
                    else {
                        n8 = n2;
                    }
                    final double method8825 = method8825(array[n8 - 1], array2[n2], array[n8]);
                    n5 = (Math.abs(array[i]) - method8825) * (method8828(n3, array[i]) + method8825 / array[i]);
                    n6 = array2[i];
                }
                final double method8826 = method8827(n5, n6, array6, array4);
                if (i != n) {
                    array2[i - 1] = method8826;
                }
                final double n9 = array4[0] * array[i] + array6[0] * array2[i];
                array2[i] = array4[0] * array2[i] - array6[0] * array[i];
                n6 = array6[0] * array[i + 1];
                array[i + 1] *= array4[0];
                method8815(i, class2283, array4, array6);
                array[i] = method8827(n9, n6, array5, array3);
                n5 = array3[0] * array2[i] + array5[0] * array[i + 1];
                array[i + 1] = array3[0] * array[i + 1] - array5[0] * array2[i];
                if (i < n2) {
                    n6 = array5[0] * array2[i + 1];
                    array2[i + 1] *= array3[0];
                }
                method8820(i, class2282, array3, array5);
            }
            if (array.length == array2.length) {
                method8827(n5, n6, array6, array4);
                n5 = array4[0] * array[i] + array6[0] * array2[i];
                array2[i] = array4[0] * array2[i] - array6[0] * array[i];
                array[i + 1] *= array4[0];
                method8815(i, class2283, array4, array6);
            }
            while (n2 - n > 1 && Math.abs(array2[n2]) < 4.89E-15) {
                --n2;
            }
            for (int j = n2 - 2; j > n; --j) {
                if (Math.abs(array2[j]) < 4.89E-15) {
                    method8813(j + 1, n2, array, array2, class2282, class2283);
                    for (n2 = j - 1; n2 - n > 1; --n2) {
                        if (Math.abs(array2[n2]) >= 4.89E-15) {
                            break;
                        }
                    }
                }
            }
            if (n2 - n <= 1) {
                if (Math.abs(array2[n + 1]) < 4.89E-15) {
                    n4 = 1;
                }
            }
        }
        if (Math.abs(array2[1]) < 4.89E-15) {
            method8826(array[n], array2[n], array[n + 1], array, array5, array3, array6, array4, 0);
            array2[n + 1] = (array2[n] = 0.0);
        }
        method8820(n, class2282, array3, array5);
        method8815(n, class2283, array4, array6);
    }
    
    private static void method8814(final double[] array, final double[] array2) {
        System.out.println("\ns =" + array[0] + " " + array[1] + " " + array[2]);
        System.out.println("e =" + array2[0] + " " + array2[1]);
    }
    
    private static void method8815(final int n, final Class2282 class2282, final double[] array, final double[] array2) {
        for (int i = 0; i < class2282.field13884; ++i) {
            final double n2 = class2282.field13886[i][n];
            class2282.field13886[i][n] = array[0] * n2 + array2[0] * class2282.field13886[i][n + 1];
            class2282.field13886[i][n + 1] = -array2[0] * n2 + array[0] * class2282.field13886[i][n + 1];
        }
    }
    
    private static void method8816(final double[] array, final double[] array2, final int n, final Class2282 class2282) {
        final double[] array3 = { 0.0 };
        final double[] array4 = { 0.0 };
        final Class2282 class2283 = new Class2282(class2282.field13884, class2282.field13885);
        final Class2282 class2284 = new Class2282(class2282.field13884, class2282.field13885);
        double n2 = array2[n];
        double n3 = array[n];
        int i;
        for (i = n; i > 0; --i) {
            final double method8827 = method8827(n2, n3, array4, array3);
            n2 = -array2[i - 1] * array4[0];
            n3 = array[i - 1];
            array[i] = method8827;
            array2[i - 1] *= array3[0];
            method8818(i, n + 1, class2282, array3, array4, class2283, class2284);
        }
        array[i + 1] = method8827(n2, n3, array4, array3);
        method8818(i, n + 1, class2282, array3, array4, class2283, class2284);
    }
    
    private static void method8817(final double[] array, final double[] array2, final int n, final Class2282 class2282) {
        final double[] array3 = { 0.0 };
        final double[] array4 = { 0.0 };
        final Class2282 class2283 = new Class2282(class2282.field13884, class2282.field13885);
        final Class2282 class2284 = new Class2282(class2282.field13884, class2282.field13885);
        double n2 = array2[n];
        double n3 = array[n + 1];
        int i;
        for (i = n; i < class2282.field13885 - 2; ++i) {
            final double method8827 = method8827(n3, n2, array4, array3);
            n2 = -array2[i + 1] * array4[0];
            n3 = array[i + 2];
            array[i + 1] = method8827;
            array2[i + 1] *= array3[0];
            method8819(n, i + 1, class2282, array3, array4, class2283, class2284);
        }
        array[i + 1] = method8827(n3, n2, array4, array3);
        method8819(n, i + 1, class2282, array3, array4, class2283, class2284);
    }
    
    private static void method8818(final int i, final int j, final Class2282 class2282, final double[] array, final double[] array2, final Class2282 class2283, final Class2282 class2284) {
        for (int k = 0; k < class2282.field13884; ++k) {
            final double n = class2282.field13886[k][i];
            class2282.field13886[k][i] = array[0] * n - array2[0] * class2282.field13886[k][j];
            class2282.field13886[k][j] = array2[0] * n + array[0] * class2282.field13886[k][j];
        }
        System.out.println("topr    =" + i);
        System.out.println("bottomr =" + j);
        System.out.println("cosr =" + array[0]);
        System.out.println("sinr =" + array2[0]);
        System.out.println("\nm =");
        method8802(class2284);
        System.out.println("\nv =");
        method8802(class2283);
        class2284.method8759(class2284, class2283);
        System.out.println("\nt*m =");
        method8802(class2284);
    }
    
    private static void method8819(final int n, final int n2, final Class2282 class2282, final double[] array, final double[] array2, final Class2282 class2283, final Class2282 class2284) {
        for (int i = 0; i < class2282.field13885; ++i) {
            final double n3 = class2282.field13886[n][i];
            class2282.field13886[n][i] = array[0] * n3 - array2[0] * class2282.field13886[n2][i];
            class2282.field13886[n2][i] = array2[0] * n3 + array[0] * class2282.field13886[n2][i];
        }
        System.out.println("\nm=");
        method8802(class2284);
        System.out.println("\nu=");
        method8802(class2283);
        class2284.method8759(class2283, class2284);
        System.out.println("\nt*m=");
        method8802(class2284);
    }
    
    private static void method8820(final int n, final Class2282 class2282, final double[] array, final double[] array2) {
        for (int i = 0; i < class2282.field13885; ++i) {
            final double n2 = class2282.field13886[n][i];
            class2282.field13886[n][i] = array[0] * n2 + array2[0] * class2282.field13886[n + 1][i];
            class2282.field13886[n + 1][i] = -array2[0] * n2 + array[0] * class2282.field13886[n + 1][i];
        }
    }
    
    private static void method8821(final Class2282 class2282, final Class2282 class2283, final Class2282 class2284) {
        final Class2282 class2285 = new Class2282(class2282.field13885, class2282.field13884);
        class2285.method8759(class2283, class2285);
        class2285.method8759(class2285, class2284);
        System.out.println("\n m = \n" + toString(class2285));
    }
    
    private static String toString(final Class2282 class2282) {
        final StringBuffer sb = new StringBuffer(class2282.field13884 * class2282.field13885 * 8);
        for (int i = 0; i < class2282.field13884; ++i) {
            for (int j = 0; j < class2282.field13885; ++j) {
                if (Math.abs(class2282.field13886[i][j]) >= 1.0E-9) {
                    sb.append(class2282.field13886[i][j]).append(" ");
                }
                else {
                    sb.append("0.0000 ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    private static void method8822(final double[] array, final double[] array2, final Class2282 class2282, final Class2282 class2283) {
        final Class2282 class2284 = new Class2282(class2282.field13885, class2283.field13884);
        System.out.println(" \ns = ");
        for (int i = 0; i < array.length; ++i) {
            System.out.println(" " + array[i]);
        }
        System.out.println(" \ne = ");
        for (int j = 0; j < array2.length; ++j) {
            System.out.println(" " + array2[j]);
        }
        System.out.println(" \nu  = \n" + class2282);
        System.out.println(" \nv  = \n" + class2283);
        class2284.method8767();
        for (int k = 0; k < array.length; ++k) {
            class2284.field13886[k][k] = array[k];
        }
        for (int l = 0; l < array2.length; ++l) {
            class2284.field13886[l][l + 1] = array2[l];
        }
        System.out.println(" \nm  = \n" + class2284);
        class2284.method8799(class2282, class2284);
        class2284.method8798(class2284, class2283);
        System.out.println(" \n u.transpose*m*v.transpose  = \n" + class2284);
    }
    
    public static double method8823(final double n, final double n2) {
        if (n <= n2) {
            return n2;
        }
        return n;
    }
    
    public static double method8824(final double n, final double n2) {
        if (n >= n2) {
            return n2;
        }
        return n;
    }
    
    public static double method8825(final double a, final double a2, final double a3) {
        final double abs = Math.abs(a);
        final double abs2 = Math.abs(a2);
        final double abs3 = Math.abs(a3);
        final double method8824 = method8824(abs, abs3);
        final double method8825 = method8823(abs, abs3);
        double n7;
        if (method8824 != 0.0) {
            if (abs2 >= method8825) {
                final double n = method8825 / abs2;
                if (n != 0.0) {
                    final double n2 = method8824 / method8825 + 1.0;
                    final double n3 = (method8825 - method8824) / method8825;
                    final double n4 = n2 * n;
                    final double n5 = n3 * n;
                    final double n6 = method8824 * (1.0 / (Math.sqrt(n4 * n4 + 1.0) + Math.sqrt(n5 * n5 + 1.0))) * n;
                    n7 = n6 + n6;
                }
                else {
                    n7 = method8824 * method8825 / abs2;
                }
            }
            else {
                final double n8 = method8824 / method8825 + 1.0;
                final double n9 = (method8825 - method8824) / method8825;
                final double n10 = abs2 / method8825;
                final double n11 = n10 * n10;
                n7 = method8824 * (2.0 / (Math.sqrt(n8 * n8 + n11) + Math.sqrt(n9 * n9 + n11)));
            }
        }
        else {
            n7 = 0.0;
            if (method8825 != 0.0) {
                final double n12 = method8824(method8825, abs2) / method8823(method8825, abs2);
            }
        }
        return n7;
    }
    
    public static int method8826(final double n, final double a, final double a2, final double[] array, final double[] array2, final double[] array3, final double[] array4, final double[] array5, final int n2) {
        final double n3 = 2.0;
        final double n4 = 1.0;
        double n5 = array[0];
        double n6 = array[1];
        double n7 = 0.0;
        double n8 = 0.0;
        double n9 = 0.0;
        double n10 = 0.0;
        double n11 = 0.0;
        double a3 = n;
        double abs = Math.abs(a3);
        double n12 = a2;
        double abs2 = Math.abs(a2);
        int n13 = 1;
        final boolean b = abs2 > abs;
        if (b) {
            n13 = 3;
            final double n14 = a3;
            a3 = n12;
            n12 = n14;
            final double n15 = abs;
            abs = abs2;
            abs2 = n15;
        }
        final double abs3 = Math.abs(a);
        if (abs3 != 0.0) {
            int n16 = 1;
            if (abs3 > abs) {
                n13 = 2;
                if (abs / abs3 < 1.0E-10) {
                    n16 = 0;
                    n5 = abs3;
                    if (abs2 <= 1.0) {
                        n6 = abs / abs3 * abs2;
                    }
                    else {
                        n6 = abs / (abs3 / abs2);
                    }
                    n7 = 1.0;
                    n9 = n12 / a;
                    n10 = 1.0;
                    n8 = a3 / a;
                }
            }
            if (n16 != 0) {
                final double n17 = abs - abs2;
                double n18;
                if (n17 != abs) {
                    n18 = n17 / abs;
                }
                else {
                    n18 = 1.0;
                }
                final double a4 = a / a3;
                final double n19 = 2.0 - n18;
                final double n20 = a4 * a4;
                Math.sqrt(n19 * n19 + n20);
                if (n18 != 0.0) {
                    Math.sqrt(n18 * n18 + n20);
                }
                else {
                    Math.abs(a4);
                }
                if (abs3 > abs) {
                    n13 = 2;
                    if (abs / abs3 < 1.0E-10) {
                        n16 = 0;
                        n5 = abs3;
                        if (abs2 <= 1.0) {
                            n6 = abs / abs3 * abs2;
                        }
                        else {
                            n6 = abs / (abs3 / abs2);
                        }
                        n7 = 1.0;
                        n9 = n12 / a;
                        n10 = 1.0;
                        n8 = a3 / a;
                    }
                }
                if (n16 != 0) {
                    final double n21 = abs - abs2;
                    double n22;
                    if (n21 != abs) {
                        n22 = n21 / abs;
                    }
                    else {
                        n22 = 1.0;
                    }
                    final double a5 = a / a3;
                    final double n23 = 2.0 - n22;
                    final double n24 = a5 * a5;
                    final double sqrt = Math.sqrt(n23 * n23 + n24);
                    double n25;
                    if (n22 != 0.0) {
                        n25 = Math.sqrt(n22 * n22 + n24);
                    }
                    else {
                        n25 = Math.abs(a5);
                    }
                    final double n26 = (sqrt + n25) * 0.5;
                    n6 = abs2 / n26;
                    n5 = abs * n26;
                    double n27;
                    if (n24 != 0.0) {
                        n27 = (a5 / (sqrt + n23) + a5 / (n25 + n22)) * (n26 + 1.0);
                    }
                    else if (n22 != 0.0) {
                        n27 = a / method8828(n21, a3) + a5 / n23;
                    }
                    else {
                        n27 = method8828(n3, a3) * method8828(n4, a);
                    }
                    final double sqrt2 = Math.sqrt(n27 * n27 + 4.0);
                    n8 = 2.0 / sqrt2;
                    n10 = n27 / sqrt2;
                    n7 = (n8 + n10 * a5) / n26;
                    n9 = n12 / a3 * n10 / n26;
                }
            }
            if (!b) {
                array3[0] = n7;
                array2[0] = n9;
                array5[0] = n8;
                array4[0] = n10;
            }
            else {
                array3[0] = n10;
                array2[0] = n8;
                array5[0] = n9;
                array4[0] = n7;
            }
            if (n13 == 1) {
                n11 = method8828(n4, array5[0]) * method8828(n4, array3[0]) * method8828(n4, n);
            }
            if (n13 == 2) {
                n11 = method8828(n4, array4[0]) * method8828(n4, array3[0]) * method8828(n4, a);
            }
            if (n13 == 3) {
                n11 = method8828(n4, array4[0]) * method8828(n4, array2[0]) * method8828(n4, a2);
            }
            array[n2] = method8828(n5, n11);
            array[n2 + 1] = method8828(n6, n11 * method8828(n4, n) * method8828(n4, a2));
        }
        else {
            array[1] = abs2;
            array[0] = abs;
        }
        return 0;
    }
    
    public static double method8827(final double a, final double a2, final double[] array, final double[] array2) {
        double n2;
        double n3;
        double n4;
        if (a2 != 0.0) {
            if (a != 0.0) {
                double a3 = a;
                double a4 = a2;
                double n = method8823(Math.abs(a3), Math.abs(a4));
                if (n < 4.994797680505588E145) {
                    if (n > 2.002083095183101E-146) {
                        n2 = Math.sqrt(a3 * a3 + a4 * a4);
                        n3 = a3 / n2;
                        n4 = a4 / n2;
                    }
                    else {
                        int n5 = 0;
                        while (n <= 2.002083095183101E-146) {
                            ++n5;
                            a3 *= 4.994797680505588E145;
                            a4 *= 4.994797680505588E145;
                            n = method8823(Math.abs(a3), Math.abs(a4));
                        }
                        n2 = Math.sqrt(a3 * a3 + a4 * a4);
                        n3 = a3 / n2;
                        n4 = a4 / n2;
                        for (int i = 1; i <= n5; ++i) {
                            n2 *= 2.002083095183101E-146;
                        }
                    }
                }
                else {
                    int n6 = 0;
                    while (n >= 4.994797680505588E145) {
                        ++n6;
                        a3 *= 2.002083095183101E-146;
                        a4 *= 2.002083095183101E-146;
                        n = method8823(Math.abs(a3), Math.abs(a4));
                    }
                    n2 = Math.sqrt(a3 * a3 + a4 * a4);
                    n3 = a3 / n2;
                    n4 = a4 / n2;
                    for (int j = 1; j <= n6; ++j) {
                        n2 *= 4.994797680505588E145;
                    }
                }
                if (Math.abs(a) > Math.abs(a2)) {
                    if (n3 < 0.0) {
                        n3 = -n3;
                        n4 = -n4;
                        n2 = -n2;
                    }
                }
            }
            else {
                n3 = 0.0;
                n4 = 1.0;
                n2 = a2;
            }
        }
        else {
            n3 = 1.0;
            n4 = 0.0;
            n2 = a;
        }
        array[0] = n4;
        array2[0] = n3;
        return n2;
    }
    
    public static double method8828(final double n, final double n2) {
        final double n3 = (n < 0.0) ? (-n) : n;
        return (n2 < 0.0) ? (-n3) : n3;
    }
    
    public Object clone() {
        Class2282 class2282;
        try {
            class2282 = (Class2282)super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
        class2282.field13886 = new double[this.field13884][this.field13885];
        for (int i = 0; i < this.field13884; ++i) {
            System.arraycopy(this.field13886[i], 0, class2282.field13886[i], 0, this.field13885);
        }
        return class2282;
    }
}
