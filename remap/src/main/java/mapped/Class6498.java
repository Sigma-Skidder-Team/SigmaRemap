// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class6498
{
    private final int field25855;
    private final long field25856;
    private final int field25857;
    private final long field25858;
    private final int field25859;
    private final long field25860;
    private final int field25861;
    private final long field25862;
    private final int field25863;
    private final long field25864;
    private final Class9267 field25865;
    private final Class9267 field25866;
    private final Class9267 field25867;
    private boolean field25868;
    private boolean field25869;
    
    public Class6498(final long field25856, final long field25857, final long n) {
        this.field25868 = false;
        this.field25869 = false;
        if (field25856 > 1L) {
            if (field25857 > 1L) {
                if (n > 1L) {
                    this.field25855 = (int)field25856;
                    this.field25857 = (int)field25857;
                    this.field25859 = (int)n;
                    this.field25856 = field25856;
                    this.field25858 = field25857;
                    this.field25860 = n;
                    this.field25861 = (int)(field25857 * n);
                    this.field25863 = (int)n;
                    this.field25862 = field25857 * n;
                    this.field25864 = n;
                    if (field25856 * field25857 * n >= Class9133.method33161()) {
                        this.field25869 = true;
                    }
                    if (Class9133.method33175(field25856)) {
                        if (Class9133.method33175(field25857)) {
                            if (Class9133.method33175(n)) {
                                this.field25868 = true;
                            }
                        }
                    }
                    Class9133.method33169(field25856 * field25857 * n > Class11.method177());
                    this.field25865 = new Class9267(field25856);
                    if (field25856 != field25857) {
                        this.field25866 = new Class9267(field25857);
                    }
                    else {
                        this.field25866 = this.field25865;
                    }
                    if (field25856 != n) {
                        if (field25857 != n) {
                            this.field25867 = new Class9267(n);
                        }
                        else {
                            this.field25867 = this.field25866;
                        }
                    }
                    else {
                        this.field25867 = this.field25865;
                    }
                    return;
                }
            }
        }
        throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
    }
    
    public void method19546(final float[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field25868) {
            if (method27224 > 1 && this.field25869) {
                this.method19558(-1, array, b);
                this.method19561(-1, array, b);
            }
            else {
                this.method19552(-1, array, b);
                this.method19555(-1, array, b);
            }
        }
        else if (method27224 > 1 && this.field25869 && this.field25855 >= method27224 && this.field25857 >= method27224 && this.field25859 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field25855 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1216(this, n2, (i == method27224 - 1) ? this.field25855 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1514(this, n3, (j == method27224 - 1) ? this.field25855 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field25857 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class990(this, n5, (k == method27224 - 1) ? this.field25857 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field25855; ++l) {
                final int n6 = l * this.field25861;
                for (int n7 = 0; n7 < this.field25857; ++n7) {
                    this.field25867.method34183(array, n6 + n7 * this.field25863, b);
                }
            }
            final float[] array3 = new float[this.field25857];
            for (int n8 = 0; n8 < this.field25855; ++n8) {
                final int n9 = n8 * this.field25861;
                for (int n10 = 0; n10 < this.field25859; ++n10) {
                    for (int n11 = 0; n11 < this.field25857; ++n11) {
                        array3[n11] = array[n9 + n11 * this.field25863 + n10];
                    }
                    this.field25866.method34181(array3, b);
                    for (int n12 = 0; n12 < this.field25857; ++n12) {
                        array[n9 + n12 * this.field25863 + n10] = array3[n12];
                    }
                }
            }
            final float[] array4 = new float[this.field25855];
            for (int n13 = 0; n13 < this.field25857; ++n13) {
                final int n14 = n13 * this.field25863;
                for (int n15 = 0; n15 < this.field25859; ++n15) {
                    for (int n16 = 0; n16 < this.field25855; ++n16) {
                        array4[n16] = array[n16 * this.field25861 + n14 + n15];
                    }
                    this.field25865.method34181(array4, b);
                    for (int n17 = 0; n17 < this.field25855; ++n17) {
                        array[n17 * this.field25861 + n14 + n15] = array4[n17];
                    }
                }
            }
        }
    }
    
    public void method19547(final Class22 class22, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field25868) {
            if (method27224 > 1 && this.field25869) {
                this.method19559(-1, class22, b);
                this.method19562(-1, class22, b);
            }
            else {
                this.method19553(-1, class22, b);
                this.method19556(-1, class22, b);
            }
        }
        else if (method27224 > 1 && this.field25869 && this.field25856 >= method27224 && this.field25858 >= method27224 && this.field25860 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n = this.field25856 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n2 = i * n;
                array[i] = Class8216.method27227(new Class1066(this, n2, (i == method27224 - 1) ? this.field25856 : (n2 + n), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final long n3 = j * n;
                array[j] = Class8216.method27227(new Class1642(this, n3, (j == method27224 - 1) ? this.field25856 : (n3 + n), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final long n4 = this.field25858 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final long n5 = k * n4;
                array[k] = Class8216.method27227(new Class1541(this, n5, (k == method27224 - 1) ? this.field25858 : (n5 + n4), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field25856; ++n6) {
                final long n7 = n6 * this.field25862;
                for (long n8 = 0L; n8 < this.field25858; ++n8) {
                    this.field25867.method34184(class22, n7 + n8 * this.field25864, b);
                }
            }
            final Class22 class23 = new Class22(this.field25858, false);
            for (long n9 = 0L; n9 < this.field25856; ++n9) {
                final long n10 = n9 * this.field25862;
                for (long n11 = 0L; n11 < this.field25860; ++n11) {
                    for (long n12 = 0L; n12 < this.field25858; ++n12) {
                        class23.method169(n12, class22.method135(n10 + n12 * this.field25864 + n11));
                    }
                    this.field25866.method34182(class23, b);
                    for (long n13 = 0L; n13 < this.field25858; ++n13) {
                        class22.method169(n10 + n13 * this.field25864 + n11, class23.method135(n13));
                    }
                }
            }
            final Class22 class24 = new Class22(this.field25856, false);
            for (long n14 = 0L; n14 < this.field25858; ++n14) {
                final long n15 = n14 * this.field25864;
                for (long n16 = 0L; n16 < this.field25860; ++n16) {
                    for (long n17 = 0L; n17 < this.field25856; ++n17) {
                        class24.method169(n17, class22.method135(n17 * this.field25862 + n15 + n16));
                    }
                    this.field25865.method34182(class24, b);
                    for (long n18 = 0L; n18 < this.field25856; ++n18) {
                        class22.method169(n18 * this.field25862 + n15 + n16, class24.method135(n18));
                    }
                }
            }
        }
    }
    
    public void method19548(final float[][][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field25868) {
            if (method27224 > 1 && this.field25869) {
                this.method19560(-1, array, b);
                this.method19563(-1, array, b);
            }
            else {
                this.method19554(-1, array, b);
                this.method19557(-1, array, b);
            }
        }
        else if (method27224 > 1 && this.field25869 && this.field25855 >= method27224 && this.field25857 >= method27224 && this.field25859 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field25855 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1161(this, n2, (i == method27224 - 1) ? this.field25855 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1428(this, n3, (j == method27224 - 1) ? this.field25855 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field25857 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1301(this, n5, (k == method27224 - 1) ? this.field25857 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field25855; ++l) {
                for (int n6 = 0; n6 < this.field25857; ++n6) {
                    this.field25867.method34181(array[l][n6], b);
                }
            }
            final float[] array3 = new float[this.field25857];
            for (int n7 = 0; n7 < this.field25855; ++n7) {
                for (int n8 = 0; n8 < this.field25859; ++n8) {
                    for (int n9 = 0; n9 < this.field25857; ++n9) {
                        array3[n9] = array[n7][n9][n8];
                    }
                    this.field25866.method34181(array3, b);
                    for (int n10 = 0; n10 < this.field25857; ++n10) {
                        array[n7][n10][n8] = array3[n10];
                    }
                }
            }
            final float[] array4 = new float[this.field25855];
            for (int n11 = 0; n11 < this.field25857; ++n11) {
                for (int n12 = 0; n12 < this.field25859; ++n12) {
                    for (int n13 = 0; n13 < this.field25855; ++n13) {
                        array4[n13] = array[n13][n11][n12];
                    }
                    this.field25865.method34181(array4, b);
                    for (int n14 = 0; n14 < this.field25855; ++n14) {
                        array[n14][n11][n12] = array4[n14];
                    }
                }
            }
        }
    }
    
    public void method19549(final float[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field25868) {
            if (method27224 > 1 && this.field25869) {
                this.method19558(1, array, b);
                this.method19561(1, array, b);
            }
            else {
                this.method19552(1, array, b);
                this.method19555(1, array, b);
            }
        }
        else if (method27224 > 1 && this.field25869 && this.field25855 >= method27224 && this.field25857 >= method27224 && this.field25859 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field25855 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1050(this, n2, (i == method27224 - 1) ? this.field25855 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1568(this, n3, (j == method27224 - 1) ? this.field25855 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field25857 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1209(this, n5, (k == method27224 - 1) ? this.field25857 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field25855; ++l) {
                final int n6 = l * this.field25861;
                for (int n7 = 0; n7 < this.field25857; ++n7) {
                    this.field25867.method34187(array, n6 + n7 * this.field25863, b);
                }
            }
            final float[] array3 = new float[this.field25857];
            for (int n8 = 0; n8 < this.field25855; ++n8) {
                final int n9 = n8 * this.field25861;
                for (int n10 = 0; n10 < this.field25859; ++n10) {
                    for (int n11 = 0; n11 < this.field25857; ++n11) {
                        array3[n11] = array[n9 + n11 * this.field25863 + n10];
                    }
                    this.field25866.method34185(array3, b);
                    for (int n12 = 0; n12 < this.field25857; ++n12) {
                        array[n9 + n12 * this.field25863 + n10] = array3[n12];
                    }
                }
            }
            final float[] array4 = new float[this.field25855];
            for (int n13 = 0; n13 < this.field25857; ++n13) {
                final int n14 = n13 * this.field25863;
                for (int n15 = 0; n15 < this.field25859; ++n15) {
                    for (int n16 = 0; n16 < this.field25855; ++n16) {
                        array4[n16] = array[n16 * this.field25861 + n14 + n15];
                    }
                    this.field25865.method34185(array4, b);
                    for (int n17 = 0; n17 < this.field25855; ++n17) {
                        array[n17 * this.field25861 + n14 + n15] = array4[n17];
                    }
                }
            }
        }
    }
    
    public void method19550(final Class22 class22, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field25868) {
            if (method27224 > 1 && this.field25869) {
                this.method19559(1, class22, b);
                this.method19562(1, class22, b);
            }
            else {
                this.method19553(1, class22, b);
                this.method19556(1, class22, b);
            }
        }
        else if (method27224 > 1 && this.field25869 && this.field25856 >= method27224 && this.field25858 >= method27224 && this.field25860 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n = this.field25856 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n2 = i * n;
                array[i] = Class8216.method27227(new Class1401(this, n2, (i == method27224 - 1) ? this.field25856 : (n2 + n), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final long n3 = j * n;
                array[j] = Class8216.method27227(new Class1622(this, n3, (j == method27224 - 1) ? this.field25856 : (n3 + n), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final long n4 = this.field25858 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final long n5 = k * n4;
                array[k] = Class8216.method27227(new Class1260(this, n5, (k == method27224 - 1) ? this.field25858 : (n5 + n4), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field25856; ++n6) {
                final long n7 = n6 * this.field25861;
                for (long n8 = 0L; n8 < this.field25858; ++n8) {
                    this.field25867.method34188(class22, n7 + n8 * this.field25863, b);
                }
            }
            final Class22 class23 = new Class22(this.field25858, false);
            for (long n9 = 0L; n9 < this.field25856; ++n9) {
                final long n10 = n9 * this.field25861;
                for (long n11 = 0L; n11 < this.field25860; ++n11) {
                    for (long n12 = 0L; n12 < this.field25858; ++n12) {
                        class23.method169(n12, class22.method135(n10 + n12 * this.field25863 + n11));
                    }
                    this.field25866.method34186(class23, b);
                    for (long n13 = 0L; n13 < this.field25858; ++n13) {
                        class22.method169(n10 + n13 * this.field25863 + n11, class23.method135(n13));
                    }
                }
            }
            final Class22 class24 = new Class22(this.field25856, false);
            for (long n14 = 0L; n14 < this.field25858; ++n14) {
                final long n15 = n14 * this.field25863;
                for (long n16 = 0L; n16 < this.field25860; ++n16) {
                    for (long n17 = 0L; n17 < this.field25856; ++n17) {
                        class24.method169(n17, class22.method135(n17 * this.field25861 + n15 + n16));
                    }
                    this.field25865.method34186(class24, b);
                    for (long n18 = 0L; n18 < this.field25856; ++n18) {
                        class22.method169(n18 * this.field25861 + n15 + n16, class24.method135(n18));
                    }
                }
            }
        }
    }
    
    public void method19551(final float[][][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field25868) {
            if (method27224 > 1 && this.field25869) {
                this.method19560(1, array, b);
                this.method19563(1, array, b);
            }
            else {
                this.method19554(1, array, b);
                this.method19557(1, array, b);
            }
        }
        else if (method27224 > 1 && this.field25869 && this.field25855 >= method27224 && this.field25857 >= method27224 && this.field25859 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field25855 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1309(this, n2, (i == method27224 - 1) ? this.field25855 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1391(this, n3, (j == method27224 - 1) ? this.field25855 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field25857 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1602(this, n5, (k == method27224 - 1) ? this.field25857 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field25855; ++l) {
                for (int n6 = 0; n6 < this.field25857; ++n6) {
                    this.field25867.method34185(array[l][n6], b);
                }
            }
            final float[] array3 = new float[this.field25857];
            for (int n7 = 0; n7 < this.field25855; ++n7) {
                for (int n8 = 0; n8 < this.field25859; ++n8) {
                    for (int n9 = 0; n9 < this.field25857; ++n9) {
                        array3[n9] = array[n7][n9][n8];
                    }
                    this.field25866.method34185(array3, b);
                    for (int n10 = 0; n10 < this.field25857; ++n10) {
                        array[n7][n10][n8] = array3[n10];
                    }
                }
            }
            final float[] array4 = new float[this.field25855];
            for (int n11 = 0; n11 < this.field25857; ++n11) {
                for (int n12 = 0; n12 < this.field25859; ++n12) {
                    for (int n13 = 0; n13 < this.field25855; ++n13) {
                        array4[n13] = array[n13][n11][n12];
                    }
                    this.field25865.method34185(array4, b);
                    for (int n14 = 0; n14 < this.field25855; ++n14) {
                        array[n14][n11][n12] = array4[n14];
                    }
                }
            }
        }
    }
    
    private void method19552(final int n, final float[] array, final boolean b) {
        int n2 = 4 * this.field25857;
        if (this.field25859 == 2) {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            for (int i = 0; i < this.field25855; ++i) {
                final int n3 = i * this.field25861;
                for (int j = 0; j < this.field25857; ++j) {
                    this.field25867.method34187(array, n3 + j * this.field25863, b);
                }
                if (this.field25859 <= 2) {
                    if (this.field25859 == 2) {
                        for (int k = 0; k < this.field25857; ++k) {
                            final int n4 = n3 + k * this.field25863;
                            array2[k] = array[n4];
                            array2[this.field25857 + k] = array[n4 + 1];
                        }
                        this.field25866.method34187(array2, 0, b);
                        this.field25866.method34187(array2, this.field25857, b);
                        for (int l = 0; l < this.field25857; ++l) {
                            final int n5 = n3 + l * this.field25863;
                            array[n5] = array2[l];
                            array[n5 + 1] = array2[this.field25857 + l];
                        }
                    }
                }
                else {
                    for (int n6 = 0; n6 < this.field25859; n6 += 4) {
                        for (int n7 = 0; n7 < this.field25857; ++n7) {
                            final int n8 = n3 + n7 * this.field25863 + n6;
                            final int n9 = this.field25857 + n7;
                            array2[n7] = array[n8];
                            array2[n9] = array[n8 + 1];
                            array2[n9 + this.field25857] = array[n8 + 2];
                            array2[n9 + 2 * this.field25857] = array[n8 + 3];
                        }
                        this.field25866.method34187(array2, 0, b);
                        this.field25866.method34187(array2, this.field25857, b);
                        this.field25866.method34187(array2, 2 * this.field25857, b);
                        this.field25866.method34187(array2, 3 * this.field25857, b);
                        for (int n10 = 0; n10 < this.field25857; ++n10) {
                            final int n11 = n3 + n10 * this.field25863 + n6;
                            final int n12 = this.field25857 + n10;
                            array[n11] = array2[n10];
                            array[n11 + 1] = array2[n12];
                            array[n11 + 2] = array2[n12 + this.field25857];
                            array[n11 + 3] = array2[n12 + 2 * this.field25857];
                        }
                    }
                }
            }
        }
        else {
            for (int n13 = 0; n13 < this.field25855; ++n13) {
                final int n14 = n13 * this.field25861;
                for (int n15 = 0; n15 < this.field25857; ++n15) {
                    this.field25867.method34183(array, n14 + n15 * this.field25863, b);
                }
                if (this.field25859 <= 2) {
                    if (this.field25859 == 2) {
                        for (int n16 = 0; n16 < this.field25857; ++n16) {
                            final int n17 = n14 + n16 * this.field25863;
                            array2[n16] = array[n17];
                            array2[this.field25857 + n16] = array[n17 + 1];
                        }
                        this.field25866.method34183(array2, 0, b);
                        this.field25866.method34183(array2, this.field25857, b);
                        for (int n18 = 0; n18 < this.field25857; ++n18) {
                            final int n19 = n14 + n18 * this.field25863;
                            array[n19] = array2[n18];
                            array[n19 + 1] = array2[this.field25857 + n18];
                        }
                    }
                }
                else {
                    for (int n20 = 0; n20 < this.field25859; n20 += 4) {
                        for (int n21 = 0; n21 < this.field25857; ++n21) {
                            final int n22 = n14 + n21 * this.field25863 + n20;
                            final int n23 = this.field25857 + n21;
                            array2[n21] = array[n22];
                            array2[n23] = array[n22 + 1];
                            array2[n23 + this.field25857] = array[n22 + 2];
                            array2[n23 + 2 * this.field25857] = array[n22 + 3];
                        }
                        this.field25866.method34183(array2, 0, b);
                        this.field25866.method34183(array2, this.field25857, b);
                        this.field25866.method34183(array2, 2 * this.field25857, b);
                        this.field25866.method34183(array2, 3 * this.field25857, b);
                        for (int n24 = 0; n24 < this.field25857; ++n24) {
                            final int n25 = n14 + n24 * this.field25863 + n20;
                            final int n26 = this.field25857 + n24;
                            array[n25] = array2[n24];
                            array[n25 + 1] = array2[n26];
                            array[n25 + 2] = array2[n26 + this.field25857];
                            array[n25 + 3] = array2[n26 + 2 * this.field25857];
                        }
                    }
                }
            }
        }
    }
    
    private void method19553(final int n, final Class22 class22, final boolean b) {
        long n2 = 4L * this.field25858;
        if (this.field25860 == 2L) {
            n2 >>= 1;
        }
        final Class22 class23 = new Class22(n2);
        if (n != -1) {
            for (long n3 = 0L; n3 < this.field25856; ++n3) {
                final long n4 = n3 * this.field25862;
                for (long n5 = 0L; n5 < this.field25858; ++n5) {
                    this.field25867.method34188(class22, n4 + n5 * this.field25864, b);
                }
                if (this.field25860 <= 2L) {
                    if (this.field25860 == 2L) {
                        for (long n6 = 0L; n6 < this.field25858; ++n6) {
                            final long n7 = n4 + n6 * this.field25864;
                            class23.method169(n6, class22.method135(n7));
                            class23.method169(this.field25858 + n6, class22.method135(n7 + 1L));
                        }
                        this.field25866.method34188(class23, 0L, b);
                        this.field25866.method34188(class23, this.field25858, b);
                        for (long n8 = 0L; n8 < this.field25858; ++n8) {
                            final long n9 = n4 + n8 * this.field25864;
                            class22.method169(n9, class23.method135(n8));
                            class22.method169(n9 + 1L, class23.method135(this.field25858 + n8));
                        }
                    }
                }
                else {
                    for (long n10 = 0L; n10 < this.field25860; n10 += 4L) {
                        for (long n11 = 0L; n11 < this.field25858; ++n11) {
                            final long n12 = n4 + n11 * this.field25864 + n10;
                            final long n13 = this.field25858 + n11;
                            class23.method169(n11, class22.method135(n12));
                            class23.method169(n13, class22.method135(n12 + 1L));
                            class23.method169(n13 + this.field25858, class22.method135(n12 + 2L));
                            class23.method169(n13 + 2L * this.field25858, class22.method135(n12 + 3L));
                        }
                        this.field25866.method34188(class23, 0L, b);
                        this.field25866.method34188(class23, this.field25858, b);
                        this.field25866.method34188(class23, 2L * this.field25858, b);
                        this.field25866.method34188(class23, 3L * this.field25858, b);
                        for (long n14 = 0L; n14 < this.field25858; ++n14) {
                            final long n15 = n4 + n14 * this.field25864 + n10;
                            final long n16 = this.field25858 + n14;
                            class22.method169(n15, class23.method135(n14));
                            class22.method169(n15 + 1L, class23.method135(n16));
                            class22.method169(n15 + 2L, class23.method135(n16 + this.field25858));
                            class22.method169(n15 + 3L, class23.method135(n16 + 2L * this.field25858));
                        }
                    }
                }
            }
        }
        else {
            for (long n17 = 0L; n17 < this.field25856; ++n17) {
                final long n18 = n17 * this.field25862;
                for (long n19 = 0L; n19 < this.field25858; ++n19) {
                    this.field25867.method34184(class22, n18 + n19 * this.field25863, b);
                }
                if (this.field25860 <= 2L) {
                    if (this.field25860 == 2L) {
                        for (long n20 = 0L; n20 < this.field25858; ++n20) {
                            final long n21 = n18 + n20 * this.field25864;
                            class23.method169(n20, class22.method135(n21));
                            class23.method169(this.field25858 + n20, class22.method135(n21 + 1L));
                        }
                        this.field25866.method34184(class23, 0L, b);
                        this.field25866.method34184(class23, this.field25858, b);
                        for (long n22 = 0L; n22 < this.field25858; ++n22) {
                            final long n23 = n18 + n22 * this.field25864;
                            class22.method169(n23, class23.method135(n22));
                            class22.method169(n23 + 1L, class23.method135(this.field25858 + n22));
                        }
                    }
                }
                else {
                    for (long n24 = 0L; n24 < this.field25860; n24 += 4L) {
                        for (long n25 = 0L; n25 < this.field25858; ++n25) {
                            final long n26 = n18 + n25 * this.field25864 + n24;
                            final long n27 = this.field25858 + n25;
                            class23.method169(n25, class22.method135(n26));
                            class23.method169(n27, class22.method135(n26 + 1L));
                            class23.method169(n27 + this.field25858, class22.method135(n26 + 2L));
                            class23.method169(n27 + 2L * this.field25858, class22.method135(n26 + 3L));
                        }
                        this.field25866.method34184(class23, 0L, b);
                        this.field25866.method34184(class23, this.field25858, b);
                        this.field25866.method34184(class23, 2L * this.field25858, b);
                        this.field25866.method34184(class23, 3L * this.field25858, b);
                        for (long n28 = 0L; n28 < this.field25858; ++n28) {
                            final long n29 = n18 + n28 * this.field25864 + n24;
                            final long n30 = this.field25858 + n28;
                            class22.method169(n29, class23.method135(n28));
                            class22.method169(n29 + 1L, class23.method135(n30));
                            class22.method169(n29 + 2L, class23.method135(n30 + this.field25858));
                            class22.method169(n29 + 3L, class23.method135(n30 + 2L * this.field25858));
                        }
                    }
                }
            }
        }
    }
    
    private void method19554(final int n, final float[][][] array, final boolean b) {
        int n2 = 4 * this.field25857;
        if (this.field25859 == 2) {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            for (int i = 0; i < this.field25855; ++i) {
                for (int j = 0; j < this.field25857; ++j) {
                    this.field25867.method34185(array[i][j], b);
                }
                if (this.field25859 <= 2) {
                    if (this.field25859 == 2) {
                        for (int k = 0; k < this.field25857; ++k) {
                            array2[k] = array[i][k][0];
                            array2[this.field25857 + k] = array[i][k][1];
                        }
                        this.field25866.method34187(array2, 0, b);
                        this.field25866.method34187(array2, this.field25857, b);
                        for (int l = 0; l < this.field25857; ++l) {
                            array[i][l][0] = array2[l];
                            array[i][l][1] = array2[this.field25857 + l];
                        }
                    }
                }
                else {
                    for (int n3 = 0; n3 < this.field25859; n3 += 4) {
                        for (int n4 = 0; n4 < this.field25857; ++n4) {
                            final int n5 = this.field25857 + n4;
                            array2[n4] = array[i][n4][n3];
                            array2[n5] = array[i][n4][n3 + 1];
                            array2[n5 + this.field25857] = array[i][n4][n3 + 2];
                            array2[n5 + 2 * this.field25857] = array[i][n4][n3 + 3];
                        }
                        this.field25866.method34187(array2, 0, b);
                        this.field25866.method34187(array2, this.field25857, b);
                        this.field25866.method34187(array2, 2 * this.field25857, b);
                        this.field25866.method34187(array2, 3 * this.field25857, b);
                        for (int n6 = 0; n6 < this.field25857; ++n6) {
                            final int n7 = this.field25857 + n6;
                            array[i][n6][n3] = array2[n6];
                            array[i][n6][n3 + 1] = array2[n7];
                            array[i][n6][n3 + 2] = array2[n7 + this.field25857];
                            array[i][n6][n3 + 3] = array2[n7 + 2 * this.field25857];
                        }
                    }
                }
            }
        }
        else {
            for (int n8 = 0; n8 < this.field25855; ++n8) {
                for (int n9 = 0; n9 < this.field25857; ++n9) {
                    this.field25867.method34181(array[n8][n9], b);
                }
                if (this.field25859 <= 2) {
                    if (this.field25859 == 2) {
                        for (int n10 = 0; n10 < this.field25857; ++n10) {
                            array2[n10] = array[n8][n10][0];
                            array2[this.field25857 + n10] = array[n8][n10][1];
                        }
                        this.field25866.method34183(array2, 0, b);
                        this.field25866.method34183(array2, this.field25857, b);
                        for (int n11 = 0; n11 < this.field25857; ++n11) {
                            array[n8][n11][0] = array2[n11];
                            array[n8][n11][1] = array2[this.field25857 + n11];
                        }
                    }
                }
                else {
                    for (int n12 = 0; n12 < this.field25859; n12 += 4) {
                        for (int n13 = 0; n13 < this.field25857; ++n13) {
                            final int n14 = this.field25857 + n13;
                            array2[n13] = array[n8][n13][n12];
                            array2[n14] = array[n8][n13][n12 + 1];
                            array2[n14 + this.field25857] = array[n8][n13][n12 + 2];
                            array2[n14 + 2 * this.field25857] = array[n8][n13][n12 + 3];
                        }
                        this.field25866.method34183(array2, 0, b);
                        this.field25866.method34183(array2, this.field25857, b);
                        this.field25866.method34183(array2, 2 * this.field25857, b);
                        this.field25866.method34183(array2, 3 * this.field25857, b);
                        for (int n15 = 0; n15 < this.field25857; ++n15) {
                            final int n16 = this.field25857 + n15;
                            array[n8][n15][n12] = array2[n15];
                            array[n8][n15][n12 + 1] = array2[n16];
                            array[n8][n15][n12 + 2] = array2[n16 + this.field25857];
                            array[n8][n15][n12 + 3] = array2[n16 + 2 * this.field25857];
                        }
                    }
                }
            }
        }
    }
    
    private void method19555(final int n, final float[] array, final boolean b) {
        int n2 = 4 * this.field25855;
        if (this.field25859 == 2) {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            if (this.field25859 <= 2) {
                if (this.field25859 == 2) {
                    for (int i = 0; i < this.field25857; ++i) {
                        final int n3 = i * this.field25863;
                        for (int j = 0; j < this.field25855; ++j) {
                            final int n4 = j * this.field25861 + n3;
                            array2[j] = array[n4];
                            array2[this.field25855 + j] = array[n4 + 1];
                        }
                        this.field25865.method34187(array2, 0, b);
                        this.field25865.method34187(array2, this.field25855, b);
                        for (int k = 0; k < this.field25855; ++k) {
                            final int n5 = k * this.field25861 + n3;
                            array[n5] = array2[k];
                            array[n5 + 1] = array2[this.field25855 + k];
                        }
                    }
                }
            }
            else {
                for (int l = 0; l < this.field25857; ++l) {
                    final int n6 = l * this.field25863;
                    for (int n7 = 0; n7 < this.field25859; n7 += 4) {
                        for (int n8 = 0; n8 < this.field25855; ++n8) {
                            final int n9 = n8 * this.field25861 + n6 + n7;
                            final int n10 = this.field25855 + n8;
                            array2[n8] = array[n9];
                            array2[n10] = array[n9 + 1];
                            array2[n10 + this.field25855] = array[n9 + 2];
                            array2[n10 + 2 * this.field25855] = array[n9 + 3];
                        }
                        this.field25865.method34187(array2, 0, b);
                        this.field25865.method34187(array2, this.field25855, b);
                        this.field25865.method34187(array2, 2 * this.field25855, b);
                        this.field25865.method34187(array2, 3 * this.field25855, b);
                        for (int n11 = 0; n11 < this.field25855; ++n11) {
                            final int n12 = n11 * this.field25861 + n6 + n7;
                            final int n13 = this.field25855 + n11;
                            array[n12] = array2[n11];
                            array[n12 + 1] = array2[n13];
                            array[n12 + 2] = array2[n13 + this.field25855];
                            array[n12 + 3] = array2[n13 + 2 * this.field25855];
                        }
                    }
                }
            }
        }
        else if (this.field25859 <= 2) {
            if (this.field25859 == 2) {
                for (int n14 = 0; n14 < this.field25857; ++n14) {
                    final int n15 = n14 * this.field25863;
                    for (int n16 = 0; n16 < this.field25855; ++n16) {
                        final int n17 = n16 * this.field25861 + n15;
                        array2[n16] = array[n17];
                        array2[this.field25855 + n16] = array[n17 + 1];
                    }
                    this.field25865.method34183(array2, 0, b);
                    this.field25865.method34183(array2, this.field25855, b);
                    for (int n18 = 0; n18 < this.field25855; ++n18) {
                        final int n19 = n18 * this.field25861 + n15;
                        array[n19] = array2[n18];
                        array[n19 + 1] = array2[this.field25855 + n18];
                    }
                }
            }
        }
        else {
            for (int n20 = 0; n20 < this.field25857; ++n20) {
                final int n21 = n20 * this.field25863;
                for (int n22 = 0; n22 < this.field25859; n22 += 4) {
                    for (int n23 = 0; n23 < this.field25855; ++n23) {
                        final int n24 = n23 * this.field25861 + n21 + n22;
                        final int n25 = this.field25855 + n23;
                        array2[n23] = array[n24];
                        array2[n25] = array[n24 + 1];
                        array2[n25 + this.field25855] = array[n24 + 2];
                        array2[n25 + 2 * this.field25855] = array[n24 + 3];
                    }
                    this.field25865.method34183(array2, 0, b);
                    this.field25865.method34183(array2, this.field25855, b);
                    this.field25865.method34183(array2, 2 * this.field25855, b);
                    this.field25865.method34183(array2, 3 * this.field25855, b);
                    for (int n26 = 0; n26 < this.field25855; ++n26) {
                        final int n27 = n26 * this.field25861 + n21 + n22;
                        final int n28 = this.field25855 + n26;
                        array[n27] = array2[n26];
                        array[n27 + 1] = array2[n28];
                        array[n27 + 2] = array2[n28 + this.field25855];
                        array[n27 + 3] = array2[n28 + 2 * this.field25855];
                    }
                }
            }
        }
    }
    
    private void method19556(final int n, final Class22 class22, final boolean b) {
        long n2 = 4L * this.field25856;
        if (this.field25860 == 2L) {
            n2 >>= 1;
        }
        final Class22 class23 = new Class22(n2);
        if (n != -1) {
            if (this.field25860 <= 2L) {
                if (this.field25860 == 2L) {
                    for (long n3 = 0L; n3 < this.field25858; ++n3) {
                        final long n4 = n3 * this.field25864;
                        for (long n5 = 0L; n5 < this.field25856; ++n5) {
                            final long n6 = n5 * this.field25862 + n4;
                            class23.method169(n5, class22.method135(n6));
                            class23.method169(this.field25856 + n5, class22.method135(n6 + 1L));
                        }
                        this.field25865.method34188(class23, 0L, b);
                        this.field25865.method34188(class23, this.field25856, b);
                        for (long n7 = 0L; n7 < this.field25856; ++n7) {
                            final long n8 = n7 * this.field25862 + n4;
                            class22.method169(n8, class23.method135(n7));
                            class22.method169(n8 + 1L, class23.method135(this.field25856 + n7));
                        }
                    }
                }
            }
            else {
                for (long n9 = 0L; n9 < this.field25858; ++n9) {
                    final long n10 = n9 * this.field25864;
                    for (long n11 = 0L; n11 < this.field25860; n11 += 4L) {
                        for (long n12 = 0L; n12 < this.field25856; ++n12) {
                            final long n13 = n12 * this.field25862 + n10 + n11;
                            final long n14 = this.field25856 + n12;
                            class23.method169(n12, class22.method135(n13));
                            class23.method169(n14, class22.method135(n13 + 1L));
                            class23.method169(n14 + this.field25856, class22.method135(n13 + 2L));
                            class23.method169(n14 + 2L * this.field25856, class22.method135(n13 + 3L));
                        }
                        this.field25865.method34188(class23, 0L, b);
                        this.field25865.method34188(class23, this.field25856, b);
                        this.field25865.method34188(class23, 2L * this.field25856, b);
                        this.field25865.method34188(class23, 3L * this.field25856, b);
                        for (long n15 = 0L; n15 < this.field25856; ++n15) {
                            final long n16 = n15 * this.field25862 + n10 + n11;
                            final long n17 = this.field25856 + n15;
                            class22.method169(n16, class23.method135(n15));
                            class22.method169(n16 + 1L, class23.method135(n17));
                            class22.method169(n16 + 2L, class23.method135(n17 + this.field25856));
                            class22.method169(n16 + 3L, class23.method135(n17 + 2L * this.field25856));
                        }
                    }
                }
            }
        }
        else if (this.field25860 <= 2L) {
            if (this.field25860 == 2L) {
                for (long n18 = 0L; n18 < this.field25858; ++n18) {
                    final long n19 = n18 * this.field25864;
                    for (long n20 = 0L; n20 < this.field25856; ++n20) {
                        final long n21 = n20 * this.field25862 + n19;
                        class23.method169(n20, class22.method135(n21));
                        class23.method169(this.field25856 + n20, class22.method135(n21 + 1L));
                    }
                    this.field25865.method34184(class23, 0L, b);
                    this.field25865.method34184(class23, this.field25856, b);
                    for (long n22 = 0L; n22 < this.field25856; ++n22) {
                        final long n23 = n22 * this.field25862 + n19;
                        class22.method169(n23, class23.method135(n22));
                        class22.method169(n23 + 1L, class23.method135(this.field25856 + n22));
                    }
                }
            }
        }
        else {
            for (long n24 = 0L; n24 < this.field25858; ++n24) {
                final long n25 = n24 * this.field25864;
                for (long n26 = 0L; n26 < this.field25860; n26 += 4L) {
                    for (long n27 = 0L; n27 < this.field25856; ++n27) {
                        final long n28 = n27 * this.field25862 + n25 + n26;
                        final long n29 = this.field25856 + n27;
                        class23.method169(n27, class22.method135(n28));
                        class23.method169(n29, class22.method135(n28 + 1L));
                        class23.method169(n29 + this.field25856, class22.method135(n28 + 2L));
                        class23.method169(n29 + 2L * this.field25856, class22.method135(n28 + 3L));
                    }
                    this.field25865.method34184(class23, 0L, b);
                    this.field25865.method34184(class23, this.field25856, b);
                    this.field25865.method34184(class23, 2L * this.field25856, b);
                    this.field25865.method34184(class23, 3L * this.field25856, b);
                    for (long n30 = 0L; n30 < this.field25856; ++n30) {
                        final long n31 = n30 * this.field25862 + n25 + n26;
                        final long n32 = this.field25856 + n30;
                        class22.method169(n31, class23.method135(n30));
                        class22.method169(n31 + 1L, class23.method135(n32));
                        class22.method169(n31 + 2L, class23.method135(n32 + this.field25856));
                        class22.method169(n31 + 3L, class23.method135(n32 + 2L * this.field25856));
                    }
                }
            }
        }
    }
    
    private void method19557(final int n, final float[][][] array, final boolean b) {
        int n2 = 4 * this.field25855;
        if (this.field25859 == 2) {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            if (this.field25859 <= 2) {
                if (this.field25859 == 2) {
                    for (int i = 0; i < this.field25857; ++i) {
                        for (int j = 0; j < this.field25855; ++j) {
                            array2[j] = array[j][i][0];
                            array2[this.field25855 + j] = array[j][i][1];
                        }
                        this.field25865.method34187(array2, 0, b);
                        this.field25865.method34187(array2, this.field25855, b);
                        for (int k = 0; k < this.field25855; ++k) {
                            array[k][i][0] = array2[k];
                            array[k][i][1] = array2[this.field25855 + k];
                        }
                    }
                }
            }
            else {
                for (int l = 0; l < this.field25857; ++l) {
                    for (int n3 = 0; n3 < this.field25859; n3 += 4) {
                        for (int n4 = 0; n4 < this.field25855; ++n4) {
                            final int n5 = this.field25855 + n4;
                            array2[n4] = array[n4][l][n3];
                            array2[n5] = array[n4][l][n3 + 1];
                            array2[n5 + this.field25855] = array[n4][l][n3 + 2];
                            array2[n5 + 2 * this.field25855] = array[n4][l][n3 + 3];
                        }
                        this.field25865.method34187(array2, 0, b);
                        this.field25865.method34187(array2, this.field25855, b);
                        this.field25865.method34187(array2, 2 * this.field25855, b);
                        this.field25865.method34187(array2, 3 * this.field25855, b);
                        for (int n6 = 0; n6 < this.field25855; ++n6) {
                            final int n7 = this.field25855 + n6;
                            array[n6][l][n3] = array2[n6];
                            array[n6][l][n3 + 1] = array2[n7];
                            array[n6][l][n3 + 2] = array2[n7 + this.field25855];
                            array[n6][l][n3 + 3] = array2[n7 + 2 * this.field25855];
                        }
                    }
                }
            }
        }
        else if (this.field25859 <= 2) {
            if (this.field25859 == 2) {
                for (int n8 = 0; n8 < this.field25857; ++n8) {
                    for (int n9 = 0; n9 < this.field25855; ++n9) {
                        array2[n9] = array[n9][n8][0];
                        array2[this.field25855 + n9] = array[n9][n8][1];
                    }
                    this.field25865.method34183(array2, 0, b);
                    this.field25865.method34183(array2, this.field25855, b);
                    for (int n10 = 0; n10 < this.field25855; ++n10) {
                        array[n10][n8][0] = array2[n10];
                        array[n10][n8][1] = array2[this.field25855 + n10];
                    }
                }
            }
        }
        else {
            for (int n11 = 0; n11 < this.field25857; ++n11) {
                for (int n12 = 0; n12 < this.field25859; n12 += 4) {
                    for (int n13 = 0; n13 < this.field25855; ++n13) {
                        final int n14 = this.field25855 + n13;
                        array2[n13] = array[n13][n11][n12];
                        array2[n14] = array[n13][n11][n12 + 1];
                        array2[n14 + this.field25855] = array[n13][n11][n12 + 2];
                        array2[n14 + 2 * this.field25855] = array[n13][n11][n12 + 3];
                    }
                    this.field25865.method34183(array2, 0, b);
                    this.field25865.method34183(array2, this.field25855, b);
                    this.field25865.method34183(array2, 2 * this.field25855, b);
                    this.field25865.method34183(array2, 3 * this.field25855, b);
                    for (int n15 = 0; n15 < this.field25855; ++n15) {
                        final int n16 = this.field25855 + n15;
                        array[n15][n11][n12] = array2[n15];
                        array[n15][n11][n12 + 1] = array2[n16];
                        array[n15][n11][n12 + 2] = array2[n16 + this.field25855];
                        array[n15][n11][n12 + 3] = array2[n16 + 2 * this.field25855];
                    }
                }
            }
        }
    }
    
    private void method19558(final int n, final float[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field25855) ? this.field25855 : Class8216.method27224();
        int n3 = 4 * this.field25857;
        if (this.field25859 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1175(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method19559(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field25856) ? this.field25856 : Class8216.method27224());
        long n3 = 4L * this.field25858;
        if (this.field25860 == 2L) {
            n3 >>= 1;
        }
        final long n4 = n3;
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1640(this, n4, n, i, n2, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method19560(final int n, final float[][][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field25855) ? this.field25855 : Class8216.method27224();
        int n3 = 4 * this.field25857;
        if (this.field25859 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class938(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method19561(final int n, final float[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field25857) ? this.field25857 : Class8216.method27224();
        int n3 = 4 * this.field25855;
        if (this.field25859 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1558(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method19562(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field25858) ? this.field25858 : Class8216.method27224());
        long n3 = 4L * this.field25856;
        if (this.field25860 == 2L) {
            n3 >>= 1;
        }
        final long n4 = n3;
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1452(this, n4, n, i, n2, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method19563(final int n, final float[][][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field25857) ? this.field25857 : Class8216.method27224();
        int n3 = 4 * this.field25855;
        if (this.field25859 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1042(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6498.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
}
