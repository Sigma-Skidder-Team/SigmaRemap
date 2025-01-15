// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class5934
{
    private int field24413;
    private long field24414;
    private int field24415;
    private long field24416;
    private int field24417;
    private long field24418;
    private int field24419;
    private long field24420;
    private int field24421;
    private long field24422;
    private Class8770 field24423;
    private Class8770 field24424;
    private Class8770 field24425;
    private boolean field24426;
    private boolean field24427;
    
    public Class5934(final long field24414, final long field24415, final long n) {
        this.field24426 = false;
        this.field24427 = false;
        if (field24414 > 1L) {
            if (field24415 > 1L) {
                if (n > 1L) {
                    this.field24413 = (int)field24414;
                    this.field24415 = (int)field24415;
                    this.field24417 = (int)n;
                    this.field24414 = field24414;
                    this.field24416 = field24415;
                    this.field24418 = n;
                    this.field24419 = (int)(field24415 * n);
                    this.field24421 = (int)n;
                    this.field24420 = field24415 * n;
                    this.field24422 = n;
                    if (field24414 * field24415 * n >= Class9133.method33161()) {
                        this.field24427 = true;
                    }
                    if (Class9133.method33175(field24414)) {
                        if (Class9133.method33175(field24415)) {
                            if (Class9133.method33175(n)) {
                                this.field24426 = true;
                            }
                        }
                    }
                    Class9133.method33169(field24414 * field24415 * n > Class11.method177());
                    this.field24423 = new Class8770(field24414);
                    if (field24414 != field24415) {
                        this.field24424 = new Class8770(field24415);
                    }
                    else {
                        this.field24424 = this.field24423;
                    }
                    if (field24414 != n) {
                        if (field24415 != n) {
                            this.field24425 = new Class8770(n);
                        }
                        else {
                            this.field24425 = this.field24424;
                        }
                    }
                    else {
                        this.field24425 = this.field24423;
                    }
                    return;
                }
            }
        }
        throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
    }
    
    public void method17816(final float[] array) {
        final int method27224 = Class8216.method27224();
        if (this.field24426) {
            if (method27224 > 1 && this.field24427) {
                this.method17828(-1, array, true);
                this.method17831(-1, array, true);
            }
            else {
                this.method17822(-1, array, true);
                this.method17825(-1, array, true);
            }
            this.method17834(array);
        }
        else {
            if (method27224 > 1 && this.field24427 && this.field24413 >= method27224 && this.field24415 >= method27224 && this.field24417 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field24413 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final int n2 = i * n;
                    array2[i] = Class8216.method27227(new Class977(this, n2, (i == method27224 - 1) ? this.field24413 : (n2 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n;
                    array2[j] = Class8216.method27227(new Class1572(this, n3, (j == method27224 - 1) ? this.field24413 : (n3 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final int n4 = this.field24415 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    int field24415;
                    if (k == method27224 - 1) {
                        field24415 = this.field24415;
                    }
                    else {
                        field24415 = n5 + n4;
                    }
                    array2[k] = Class8216.method27227(new Class1253(this, n5, field24415, array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (int l = 0; l < this.field24413; ++l) {
                    final int n6 = l * this.field24419;
                    for (int n7 = 0; n7 < this.field24415; ++n7) {
                        this.field24425.method30447(array, n6 + n7 * this.field24421);
                    }
                }
                final float[] array3 = new float[this.field24415];
                for (int n8 = 0; n8 < this.field24413; ++n8) {
                    final int n9 = n8 * this.field24419;
                    for (int n10 = 0; n10 < this.field24417; ++n10) {
                        for (int n11 = 0; n11 < this.field24415; ++n11) {
                            array3[n11] = array[n9 + n11 * this.field24421 + n10];
                        }
                        this.field24424.method30445(array3);
                        for (int n12 = 0; n12 < this.field24415; ++n12) {
                            array[n9 + n12 * this.field24421 + n10] = array3[n12];
                        }
                    }
                }
                final float[] array4 = new float[this.field24413];
                for (int n13 = 0; n13 < this.field24415; ++n13) {
                    final int n14 = n13 * this.field24421;
                    for (int n15 = 0; n15 < this.field24417; ++n15) {
                        for (int n16 = 0; n16 < this.field24413; ++n16) {
                            array4[n16] = array[n16 * this.field24419 + n14 + n15];
                        }
                        this.field24423.method30445(array4);
                        for (int n17 = 0; n17 < this.field24413; ++n17) {
                            array[n17 * this.field24419 + n14 + n15] = array4[n17];
                        }
                    }
                }
            }
            this.method17834(array);
        }
    }
    
    public void method17817(final Class22 class22) {
        final int method27224 = Class8216.method27224();
        if (this.field24426) {
            if (method27224 > 1 && this.field24427) {
                this.method17829(-1, class22, true);
                this.method17832(-1, class22, true);
            }
            else {
                this.method17823(-1, class22, true);
                this.method17826(-1, class22, true);
            }
            this.method17835(class22);
        }
        else {
            if (method27224 > 1 && this.field24427 && this.field24414 >= method27224 && this.field24416 >= method27224 && this.field24418 >= method27224) {
                final Future[] array = new Future[method27224];
                final long n = this.field24414 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final long n2 = i * n;
                    array[i] = Class8216.method27227(new Class1530(this, n2, (i == method27224 - 1) ? this.field24414 : (n2 + n), class22));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final long n3 = j * n;
                    array[j] = Class8216.method27227(new Class1345(this, n3, (j == method27224 - 1) ? this.field24414 : (n3 + n), class22));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final long n4 = this.field24416 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final long n5 = k * n4;
                    long field24416;
                    if (k == method27224 - 1) {
                        field24416 = this.field24416;
                    }
                    else {
                        field24416 = n5 + n4;
                    }
                    array[k] = Class8216.method27227(new Class1546(this, n5, field24416, class22));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (long n6 = 0L; n6 < this.field24414; ++n6) {
                    final long n7 = n6 * this.field24419;
                    for (long n8 = 0L; n8 < this.field24416; ++n8) {
                        this.field24425.method30448(class22, n7 + n8 * this.field24421);
                    }
                }
                final Class22 class23 = new Class22(this.field24416, false);
                for (long n9 = 0L; n9 < this.field24414; ++n9) {
                    final long n10 = n9 * this.field24419;
                    for (long n11 = 0L; n11 < this.field24418; ++n11) {
                        for (long n12 = 0L; n12 < this.field24416; ++n12) {
                            class23.method169(n12, class22.method135(n10 + n12 * this.field24421 + n11));
                        }
                        this.field24424.method30446(class23);
                        for (long n13 = 0L; n13 < this.field24416; ++n13) {
                            class22.method169(n10 + n13 * this.field24421 + n11, class23.method135(n13));
                        }
                    }
                }
                final Class22 class24 = new Class22(this.field24414, false);
                for (long n14 = 0L; n14 < this.field24416; ++n14) {
                    final long n15 = n14 * this.field24421;
                    for (long n16 = 0L; n16 < this.field24418; ++n16) {
                        for (long n17 = 0L; n17 < this.field24414; ++n17) {
                            class24.method169(n17, class22.method135(n17 * this.field24419 + n15 + n16));
                        }
                        this.field24423.method30446(class24);
                        for (long n18 = 0L; n18 < this.field24414; ++n18) {
                            class22.method169(n18 * this.field24419 + n15 + n16, class24.method135(n18));
                        }
                    }
                }
            }
            this.method17835(class22);
        }
    }
    
    public void method17818(final float[][][] array) {
        final int method27224 = Class8216.method27224();
        if (this.field24426) {
            if (method27224 > 1 && this.field24427) {
                this.method17830(-1, array, true);
                this.method17833(-1, array, true);
            }
            else {
                this.method17824(-1, array, true);
                this.method17827(-1, array, true);
            }
            this.method17836(array);
        }
        else {
            if (method27224 > 1 && this.field24427 && this.field24413 >= method27224 && this.field24415 >= method27224 && this.field24417 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field24413 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final int n2 = i * n;
                    array2[i] = Class8216.method27227(new Class1104(this, n2, (i == method27224 - 1) ? this.field24413 : (n2 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n;
                    array2[j] = Class8216.method27227(new Class1485(this, n3, (j == method27224 - 1) ? this.field24413 : (n3 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final int n4 = this.field24415 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    array2[k] = Class8216.method27227(new Class1545(this, n5, (k == method27224 - 1) ? this.field24415 : (n5 + n4), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (int l = 0; l < this.field24413; ++l) {
                    for (int n6 = 0; n6 < this.field24415; ++n6) {
                        this.field24425.method30445(array[l][n6]);
                    }
                }
                final float[] array3 = new float[this.field24415];
                for (int n7 = 0; n7 < this.field24413; ++n7) {
                    for (int n8 = 0; n8 < this.field24417; ++n8) {
                        for (int n9 = 0; n9 < this.field24415; ++n9) {
                            array3[n9] = array[n7][n9][n8];
                        }
                        this.field24424.method30445(array3);
                        for (int n10 = 0; n10 < this.field24415; ++n10) {
                            array[n7][n10][n8] = array3[n10];
                        }
                    }
                }
                final float[] array4 = new float[this.field24413];
                for (int n11 = 0; n11 < this.field24415; ++n11) {
                    for (int n12 = 0; n12 < this.field24417; ++n12) {
                        for (int n13 = 0; n13 < this.field24413; ++n13) {
                            array4[n13] = array[n13][n11][n12];
                        }
                        this.field24423.method30445(array4);
                        for (int n14 = 0; n14 < this.field24413; ++n14) {
                            array[n14][n11][n12] = array4[n14];
                        }
                    }
                }
            }
            this.method17836(array);
        }
    }
    
    public void method17819(final float[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field24426) {
            if (method27224 > 1 && this.field24427) {
                this.method17828(1, array, b);
                this.method17831(1, array, b);
            }
            else {
                this.method17822(1, array, b);
                this.method17825(1, array, b);
            }
            this.method17834(array);
        }
        else {
            if (method27224 > 1 && this.field24427 && this.field24413 >= method27224 && this.field24415 >= method27224 && this.field24417 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field24413 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final int n2 = i * n;
                    array2[i] = Class8216.method27227(new Class1286(this, n2, (i == method27224 - 1) ? this.field24413 : (n2 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n;
                    array2[j] = Class8216.method27227(new Class980(this, n3, (j == method27224 - 1) ? this.field24413 : (n3 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final int n4 = this.field24415 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    array2[k] = Class8216.method27227(new Class1171(this, n5, (k == method27224 - 1) ? this.field24415 : (n5 + n4), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (int l = 0; l < this.field24413; ++l) {
                    final int n6 = l * this.field24419;
                    for (int n7 = 0; n7 < this.field24415; ++n7) {
                        this.field24425.method30451(array, n6 + n7 * this.field24421, b);
                    }
                }
                final float[] array3 = new float[this.field24415];
                for (int n8 = 0; n8 < this.field24413; ++n8) {
                    final int n9 = n8 * this.field24419;
                    for (int n10 = 0; n10 < this.field24417; ++n10) {
                        for (int n11 = 0; n11 < this.field24415; ++n11) {
                            array3[n11] = array[n9 + n11 * this.field24421 + n10];
                        }
                        this.field24424.method30449(array3, b);
                        for (int n12 = 0; n12 < this.field24415; ++n12) {
                            array[n9 + n12 * this.field24421 + n10] = array3[n12];
                        }
                    }
                }
                final float[] array4 = new float[this.field24413];
                for (int n13 = 0; n13 < this.field24415; ++n13) {
                    final int n14 = n13 * this.field24421;
                    for (int n15 = 0; n15 < this.field24417; ++n15) {
                        for (int n16 = 0; n16 < this.field24413; ++n16) {
                            array4[n16] = array[n16 * this.field24419 + n14 + n15];
                        }
                        this.field24423.method30449(array4, b);
                        for (int n17 = 0; n17 < this.field24413; ++n17) {
                            array[n17 * this.field24419 + n14 + n15] = array4[n17];
                        }
                    }
                }
            }
            this.method17834(array);
        }
    }
    
    public void method17820(final Class22 class22, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field24426) {
            if (method27224 > 1 && this.field24427) {
                this.method17829(1, class22, b);
                this.method17832(1, class22, b);
            }
            else {
                this.method17823(1, class22, b);
                this.method17826(1, class22, b);
            }
            this.method17835(class22);
        }
        else {
            if (method27224 > 1 && this.field24427 && this.field24414 >= method27224 && this.field24416 >= method27224 && this.field24418 >= method27224) {
                final Future[] array = new Future[method27224];
                final long n = this.field24414 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final long n2 = i * n;
                    array[i] = Class8216.method27227(new Class1095(this, n2, (i == method27224 - 1) ? this.field24414 : (n2 + n), class22, b));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final long n3 = j * n;
                    array[j] = Class8216.method27227(new Class1464(this, n3, (j == method27224 - 1) ? this.field24414 : (n3 + n), class22, b));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final long n4 = this.field24416 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final long n5 = k * n4;
                    array[k] = Class8216.method27227(new Class1097(this, n5, (k == method27224 - 1) ? this.field24416 : (n5 + n4), class22, b));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (long n6 = 0L; n6 < this.field24414; ++n6) {
                    final long n7 = n6 * this.field24420;
                    for (long n8 = 0L; n8 < this.field24416; ++n8) {
                        this.field24425.method30452(class22, n7 + n8 * this.field24422, b);
                    }
                }
                final Class22 class23 = new Class22(this.field24416, false);
                for (long n9 = 0L; n9 < this.field24414; ++n9) {
                    final long n10 = n9 * this.field24420;
                    for (long n11 = 0L; n11 < this.field24418; ++n11) {
                        for (long n12 = 0L; n12 < this.field24416; ++n12) {
                            class23.method169(n12, class22.method135(n10 + n12 * this.field24422 + n11));
                        }
                        this.field24424.method30450(class23, b);
                        for (long n13 = 0L; n13 < this.field24416; ++n13) {
                            class22.method169(n10 + n13 * this.field24422 + n11, class23.method135(n13));
                        }
                    }
                }
                final Class22 class24 = new Class22(this.field24414, false);
                for (long n14 = 0L; n14 < this.field24416; ++n14) {
                    final long n15 = n14 * this.field24422;
                    for (long n16 = 0L; n16 < this.field24418; ++n16) {
                        for (long n17 = 0L; n17 < this.field24414; ++n17) {
                            class24.method169(n17, class22.method135(n17 * this.field24420 + n15 + n16));
                        }
                        this.field24423.method30450(class24, b);
                        for (long n18 = 0L; n18 < this.field24414; ++n18) {
                            class22.method169(n18 * this.field24420 + n15 + n16, class24.method135(n18));
                        }
                    }
                }
            }
            this.method17835(class22);
        }
    }
    
    public void method17821(final float[][][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field24426) {
            if (method27224 > 1 && this.field24427) {
                this.method17830(1, array, b);
                this.method17833(1, array, b);
            }
            else {
                this.method17824(1, array, b);
                this.method17827(1, array, b);
            }
            this.method17836(array);
        }
        else {
            if (method27224 > 1 && this.field24427 && this.field24413 >= method27224 && this.field24415 >= method27224 && this.field24417 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field24413 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final int n2 = i * n;
                    array2[i] = Class8216.method27227(new Class1041(this, n2, (i == method27224 - 1) ? this.field24413 : (n2 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n;
                    array2[j] = Class8216.method27227(new Class1398(this, n3, (j == method27224 - 1) ? this.field24413 : (n3 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final int n4 = this.field24415 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    array2[k] = Class8216.method27227(new Class1511(this, n5, (k == method27224 - 1) ? this.field24415 : (n5 + n4), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (int l = 0; l < this.field24413; ++l) {
                    for (int n6 = 0; n6 < this.field24415; ++n6) {
                        this.field24425.method30449(array[l][n6], b);
                    }
                }
                final float[] array3 = new float[this.field24415];
                for (int n7 = 0; n7 < this.field24413; ++n7) {
                    for (int n8 = 0; n8 < this.field24417; ++n8) {
                        for (int n9 = 0; n9 < this.field24415; ++n9) {
                            array3[n9] = array[n7][n9][n8];
                        }
                        this.field24424.method30449(array3, b);
                        for (int n10 = 0; n10 < this.field24415; ++n10) {
                            array[n7][n10][n8] = array3[n10];
                        }
                    }
                }
                final float[] array4 = new float[this.field24413];
                for (int n11 = 0; n11 < this.field24415; ++n11) {
                    for (int n12 = 0; n12 < this.field24417; ++n12) {
                        for (int n13 = 0; n13 < this.field24413; ++n13) {
                            array4[n13] = array[n13][n11][n12];
                        }
                        this.field24423.method30449(array4, b);
                        for (int n14 = 0; n14 < this.field24413; ++n14) {
                            array[n14][n11][n12] = array4[n14];
                        }
                    }
                }
            }
            this.method17836(array);
        }
    }
    
    private void method17822(final int n, final float[] array, final boolean b) {
        int n2 = 4 * this.field24415;
        if (this.field24417 == 2) {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            for (int i = 0; i < this.field24413; ++i) {
                final int n3 = i * this.field24419;
                for (int j = 0; j < this.field24415; ++j) {
                    this.field24425.method30451(array, n3 + j * this.field24421, b);
                }
                if (this.field24417 <= 2) {
                    if (this.field24417 == 2) {
                        for (int k = 0; k < this.field24415; ++k) {
                            final int n4 = n3 + k * this.field24421;
                            array2[k] = array[n4];
                            array2[this.field24415 + k] = array[n4 + 1];
                        }
                        this.field24424.method30451(array2, 0, b);
                        this.field24424.method30451(array2, this.field24415, b);
                        for (int l = 0; l < this.field24415; ++l) {
                            final int n5 = n3 + l * this.field24421;
                            array[n5] = array2[l];
                            array[n5 + 1] = array2[this.field24415 + l];
                        }
                    }
                }
                else {
                    for (int n6 = 0; n6 < this.field24417; n6 += 4) {
                        for (int n7 = 0; n7 < this.field24415; ++n7) {
                            final int n8 = n3 + n7 * this.field24421 + n6;
                            final int n9 = this.field24415 + n7;
                            array2[n7] = array[n8];
                            array2[n9] = array[n8 + 1];
                            array2[n9 + this.field24415] = array[n8 + 2];
                            array2[n9 + 2 * this.field24415] = array[n8 + 3];
                        }
                        this.field24424.method30451(array2, 0, b);
                        this.field24424.method30451(array2, this.field24415, b);
                        this.field24424.method30451(array2, 2 * this.field24415, b);
                        this.field24424.method30451(array2, 3 * this.field24415, b);
                        for (int n10 = 0; n10 < this.field24415; ++n10) {
                            final int n11 = n3 + n10 * this.field24421 + n6;
                            final int n12 = this.field24415 + n10;
                            array[n11] = array2[n10];
                            array[n11 + 1] = array2[n12];
                            array[n11 + 2] = array2[n12 + this.field24415];
                            array[n11 + 3] = array2[n12 + 2 * this.field24415];
                        }
                    }
                }
            }
        }
        else {
            for (int n13 = 0; n13 < this.field24413; ++n13) {
                final int n14 = n13 * this.field24419;
                for (int n15 = 0; n15 < this.field24415; ++n15) {
                    this.field24425.method30447(array, n14 + n15 * this.field24421);
                }
                if (this.field24417 <= 2) {
                    if (this.field24417 == 2) {
                        for (int n16 = 0; n16 < this.field24415; ++n16) {
                            final int n17 = n14 + n16 * this.field24421;
                            array2[n16] = array[n17];
                            array2[this.field24415 + n16] = array[n17 + 1];
                        }
                        this.field24424.method30447(array2, 0);
                        this.field24424.method30447(array2, this.field24415);
                        for (int n18 = 0; n18 < this.field24415; ++n18) {
                            final int n19 = n14 + n18 * this.field24421;
                            array[n19] = array2[n18];
                            array[n19 + 1] = array2[this.field24415 + n18];
                        }
                    }
                }
                else {
                    for (int n20 = 0; n20 < this.field24417; n20 += 4) {
                        for (int n21 = 0; n21 < this.field24415; ++n21) {
                            final int n22 = n14 + n21 * this.field24421 + n20;
                            final int n23 = this.field24415 + n21;
                            array2[n21] = array[n22];
                            array2[n23] = array[n22 + 1];
                            array2[n23 + this.field24415] = array[n22 + 2];
                            array2[n23 + 2 * this.field24415] = array[n22 + 3];
                        }
                        this.field24424.method30447(array2, 0);
                        this.field24424.method30447(array2, this.field24415);
                        this.field24424.method30447(array2, 2 * this.field24415);
                        this.field24424.method30447(array2, 3 * this.field24415);
                        for (int n24 = 0; n24 < this.field24415; ++n24) {
                            final int n25 = n14 + n24 * this.field24421 + n20;
                            final int n26 = this.field24415 + n24;
                            array[n25] = array2[n24];
                            array[n25 + 1] = array2[n26];
                            array[n25 + 2] = array2[n26 + this.field24415];
                            array[n25 + 3] = array2[n26 + 2 * this.field24415];
                        }
                    }
                }
            }
        }
    }
    
    private void method17823(final int n, final Class22 class22, final boolean b) {
        long n2 = 4L * this.field24416;
        if (this.field24418 == 2L) {
            n2 >>= 1;
        }
        final Class22 class23 = new Class22(n2);
        if (n != -1) {
            for (long n3 = 0L; n3 < this.field24414; ++n3) {
                final long n4 = n3 * this.field24420;
                for (long n5 = 0L; n5 < this.field24416; ++n5) {
                    this.field24425.method30452(class22, n4 + n5 * this.field24422, b);
                }
                if (this.field24418 <= 2L) {
                    if (this.field24418 == 2L) {
                        for (long n6 = 0L; n6 < this.field24416; ++n6) {
                            final long n7 = n4 + n6 * this.field24422;
                            class23.method169(n6, class22.method135(n7));
                            class23.method169(this.field24416 + n6, class22.method135(n7 + 1L));
                        }
                        this.field24424.method30452(class23, 0L, b);
                        this.field24424.method30452(class23, this.field24416, b);
                        for (long n8 = 0L; n8 < this.field24416; ++n8) {
                            final long n9 = n4 + n8 * this.field24422;
                            class22.method169(n9, class23.method135(n8));
                            class22.method169(n9 + 1L, class23.method135(this.field24416 + n8));
                        }
                    }
                }
                else {
                    for (long n10 = 0L; n10 < this.field24418; n10 += 4L) {
                        for (long n11 = 0L; n11 < this.field24416; ++n11) {
                            final long n12 = n4 + n11 * this.field24422 + n10;
                            final long n13 = this.field24416 + n11;
                            class23.method169(n11, class22.method135(n12));
                            class23.method169(n13, class22.method135(n12 + 1L));
                            class23.method169(n13 + this.field24416, class22.method135(n12 + 2L));
                            class23.method169(n13 + 2L * this.field24416, class22.method135(n12 + 3L));
                        }
                        this.field24424.method30452(class23, 0L, b);
                        this.field24424.method30452(class23, this.field24416, b);
                        this.field24424.method30452(class23, 2L * this.field24416, b);
                        this.field24424.method30452(class23, 3L * this.field24416, b);
                        for (long n14 = 0L; n14 < this.field24416; ++n14) {
                            final long n15 = n4 + n14 * this.field24422 + n10;
                            final long n16 = this.field24416 + n14;
                            class22.method169(n15, class23.method135(n14));
                            class22.method169(n15 + 1L, class23.method135(n16));
                            class22.method169(n15 + 2L, class23.method135(n16 + this.field24416));
                            class22.method169(n15 + 3L, class23.method135(n16 + 2L * this.field24416));
                        }
                    }
                }
            }
        }
        else {
            for (long n17 = 0L; n17 < this.field24414; ++n17) {
                final long n18 = n17 * this.field24420;
                for (long n19 = 0L; n19 < this.field24416; ++n19) {
                    this.field24425.method30448(class22, n18 + n19 * this.field24422);
                }
                if (this.field24418 <= 2L) {
                    if (this.field24418 == 2L) {
                        for (long n20 = 0L; n20 < this.field24416; ++n20) {
                            final long n21 = n18 + n20 * this.field24422;
                            class23.method169(n20, class22.method135(n21));
                            class23.method169(this.field24416 + n20, class22.method135(n21 + 1L));
                        }
                        this.field24424.method30448(class23, 0L);
                        this.field24424.method30448(class23, this.field24416);
                        for (long n22 = 0L; n22 < this.field24416; ++n22) {
                            final long n23 = n18 + n22 * this.field24422;
                            class22.method169(n23, class23.method135(n22));
                            class22.method169(n23 + 1L, class23.method135(this.field24416 + n22));
                        }
                    }
                }
                else {
                    for (long n24 = 0L; n24 < this.field24418; n24 += 4L) {
                        for (long n25 = 0L; n25 < this.field24416; ++n25) {
                            final long n26 = n18 + n25 * this.field24422 + n24;
                            final long n27 = this.field24416 + n25;
                            class23.method169(n25, class22.method135(n26));
                            class23.method169(n27, class22.method135(n26 + 1L));
                            class23.method169(n27 + this.field24416, class22.method135(n26 + 2L));
                            class23.method169(n27 + 2L * this.field24416, class22.method135(n26 + 3L));
                        }
                        this.field24424.method30448(class23, 0L);
                        this.field24424.method30448(class23, this.field24416);
                        this.field24424.method30448(class23, 2L * this.field24416);
                        this.field24424.method30448(class23, 3L * this.field24416);
                        for (long n28 = 0L; n28 < this.field24416; ++n28) {
                            final long n29 = n18 + n28 * this.field24422 + n24;
                            final long n30 = this.field24416 + n28;
                            class22.method169(n29, class23.method135(n28));
                            class22.method169(n29 + 1L, class23.method135(n30));
                            class22.method169(n29 + 2L, class23.method135(n30 + this.field24416));
                            class22.method169(n29 + 3L, class23.method135(n30 + 2L * this.field24416));
                        }
                    }
                }
            }
        }
    }
    
    private void method17824(final int n, final float[][][] array, final boolean b) {
        int n2 = 4 * this.field24415;
        if (this.field24418 == 2L) {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            for (int i = 0; i < this.field24413; ++i) {
                for (int j = 0; j < this.field24415; ++j) {
                    this.field24425.method30449(array[i][j], b);
                }
                if (this.field24417 <= 2) {
                    if (this.field24417 == 2) {
                        for (int k = 0; k < this.field24415; ++k) {
                            array2[k] = array[i][k][0];
                            array2[this.field24415 + k] = array[i][k][1];
                        }
                        this.field24424.method30451(array2, 0, b);
                        this.field24424.method30451(array2, this.field24415, b);
                        for (int l = 0; l < this.field24415; ++l) {
                            array[i][l][0] = array2[l];
                            array[i][l][1] = array2[this.field24415 + l];
                        }
                    }
                }
                else {
                    for (int n3 = 0; n3 < this.field24417; n3 += 4) {
                        for (int n4 = 0; n4 < this.field24415; ++n4) {
                            final int n5 = this.field24415 + n4;
                            array2[n4] = array[i][n4][n3];
                            array2[n5] = array[i][n4][n3 + 1];
                            array2[n5 + this.field24415] = array[i][n4][n3 + 2];
                            array2[n5 + 2 * this.field24415] = array[i][n4][n3 + 3];
                        }
                        this.field24424.method30451(array2, 0, b);
                        this.field24424.method30451(array2, this.field24415, b);
                        this.field24424.method30451(array2, 2 * this.field24415, b);
                        this.field24424.method30451(array2, 3 * this.field24415, b);
                        for (int n6 = 0; n6 < this.field24415; ++n6) {
                            final int n7 = this.field24415 + n6;
                            array[i][n6][n3] = array2[n6];
                            array[i][n6][n3 + 1] = array2[n7];
                            array[i][n6][n3 + 2] = array2[n7 + this.field24415];
                            array[i][n6][n3 + 3] = array2[n7 + 2 * this.field24415];
                        }
                    }
                }
            }
        }
        else {
            for (int n8 = 0; n8 < this.field24413; ++n8) {
                for (int n9 = 0; n9 < this.field24415; ++n9) {
                    this.field24425.method30445(array[n8][n9]);
                }
                if (this.field24417 <= 2) {
                    if (this.field24417 == 2) {
                        for (int n10 = 0; n10 < this.field24415; ++n10) {
                            array2[n10] = array[n8][n10][0];
                            array2[this.field24415 + n10] = array[n8][n10][1];
                        }
                        this.field24424.method30447(array2, 0);
                        this.field24424.method30447(array2, this.field24415);
                        for (int n11 = 0; n11 < this.field24415; ++n11) {
                            array[n8][n11][0] = array2[n11];
                            array[n8][n11][1] = array2[this.field24415 + n11];
                        }
                    }
                }
                else {
                    for (int n12 = 0; n12 < this.field24417; n12 += 4) {
                        for (int n13 = 0; n13 < this.field24415; ++n13) {
                            final int n14 = this.field24415 + n13;
                            array2[n13] = array[n8][n13][n12];
                            array2[n14] = array[n8][n13][n12 + 1];
                            array2[n14 + this.field24415] = array[n8][n13][n12 + 2];
                            array2[n14 + 2 * this.field24415] = array[n8][n13][n12 + 3];
                        }
                        this.field24424.method30447(array2, 0);
                        this.field24424.method30447(array2, this.field24415);
                        this.field24424.method30447(array2, 2 * this.field24415);
                        this.field24424.method30447(array2, 3 * this.field24415);
                        for (int n15 = 0; n15 < this.field24415; ++n15) {
                            final int n16 = this.field24415 + n15;
                            array[n8][n15][n12] = array2[n15];
                            array[n8][n15][n12 + 1] = array2[n16];
                            array[n8][n15][n12 + 2] = array2[n16 + this.field24415];
                            array[n8][n15][n12 + 3] = array2[n16 + 2 * this.field24415];
                        }
                    }
                }
            }
        }
    }
    
    private void method17825(final int n, final float[] array, final boolean b) {
        int n2 = 4 * this.field24413;
        if (this.field24417 == 2) {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            if (this.field24417 <= 2) {
                if (this.field24417 == 2) {
                    for (int i = 0; i < this.field24415; ++i) {
                        final int n3 = i * this.field24421;
                        for (int j = 0; j < this.field24413; ++j) {
                            final int n4 = j * this.field24419 + n3;
                            array2[j] = array[n4];
                            array2[this.field24413 + j] = array[n4 + 1];
                        }
                        this.field24423.method30451(array2, 0, b);
                        this.field24423.method30451(array2, this.field24413, b);
                        for (int k = 0; k < this.field24413; ++k) {
                            final int n5 = k * this.field24419 + n3;
                            array[n5] = array2[k];
                            array[n5 + 1] = array2[this.field24413 + k];
                        }
                    }
                }
            }
            else {
                for (int l = 0; l < this.field24415; ++l) {
                    final int n6 = l * this.field24421;
                    for (int n7 = 0; n7 < this.field24417; n7 += 4) {
                        for (int n8 = 0; n8 < this.field24413; ++n8) {
                            final int n9 = n8 * this.field24419 + n6 + n7;
                            final int n10 = this.field24413 + n8;
                            array2[n8] = array[n9];
                            array2[n10] = array[n9 + 1];
                            array2[n10 + this.field24413] = array[n9 + 2];
                            array2[n10 + 2 * this.field24413] = array[n9 + 3];
                        }
                        this.field24423.method30451(array2, 0, b);
                        this.field24423.method30451(array2, this.field24413, b);
                        this.field24423.method30451(array2, 2 * this.field24413, b);
                        this.field24423.method30451(array2, 3 * this.field24413, b);
                        for (int n11 = 0; n11 < this.field24413; ++n11) {
                            final int n12 = n11 * this.field24419 + n6 + n7;
                            final int n13 = this.field24413 + n11;
                            array[n12] = array2[n11];
                            array[n12 + 1] = array2[n13];
                            array[n12 + 2] = array2[n13 + this.field24413];
                            array[n12 + 3] = array2[n13 + 2 * this.field24413];
                        }
                    }
                }
            }
        }
        else if (this.field24417 <= 2) {
            if (this.field24417 == 2) {
                for (int n14 = 0; n14 < this.field24415; ++n14) {
                    final int n15 = n14 * this.field24421;
                    for (int n16 = 0; n16 < this.field24413; ++n16) {
                        final int n17 = n16 * this.field24419 + n15;
                        array2[n16] = array[n17];
                        array2[this.field24413 + n16] = array[n17 + 1];
                    }
                    this.field24423.method30447(array2, 0);
                    this.field24423.method30447(array2, this.field24413);
                    for (int n18 = 0; n18 < this.field24413; ++n18) {
                        final int n19 = n18 * this.field24419 + n15;
                        array[n19] = array2[n18];
                        array[n19 + 1] = array2[this.field24413 + n18];
                    }
                }
            }
        }
        else {
            for (int n20 = 0; n20 < this.field24415; ++n20) {
                final int n21 = n20 * this.field24421;
                for (int n22 = 0; n22 < this.field24417; n22 += 4) {
                    for (int n23 = 0; n23 < this.field24413; ++n23) {
                        final int n24 = n23 * this.field24419 + n21 + n22;
                        final int n25 = this.field24413 + n23;
                        array2[n23] = array[n24];
                        array2[n25] = array[n24 + 1];
                        array2[n25 + this.field24413] = array[n24 + 2];
                        array2[n25 + 2 * this.field24413] = array[n24 + 3];
                    }
                    this.field24423.method30447(array2, 0);
                    this.field24423.method30447(array2, this.field24413);
                    this.field24423.method30447(array2, 2 * this.field24413);
                    this.field24423.method30447(array2, 3 * this.field24413);
                    for (int n26 = 0; n26 < this.field24413; ++n26) {
                        final int n27 = n26 * this.field24419 + n21 + n22;
                        final int n28 = this.field24413 + n26;
                        array[n27] = array2[n26];
                        array[n27 + 1] = array2[n28];
                        array[n27 + 2] = array2[n28 + this.field24413];
                        array[n27 + 3] = array2[n28 + 2 * this.field24413];
                    }
                }
            }
        }
    }
    
    private void method17826(final int n, final Class22 class22, final boolean b) {
        long n2 = 4L * this.field24414;
        if (this.field24418 == 2L) {
            n2 >>= 1;
        }
        final Class22 class23 = new Class22(n2);
        if (n != -1) {
            if (this.field24418 <= 2L) {
                if (this.field24418 == 2L) {
                    for (long n3 = 0L; n3 < this.field24416; ++n3) {
                        final long n4 = n3 * this.field24422;
                        for (long n5 = 0L; n5 < this.field24414; ++n5) {
                            final long n6 = n5 * this.field24420 + n4;
                            class23.method169(n5, class22.method135(n6));
                            class23.method169(this.field24414 + n5, class22.method135(n6 + 1L));
                        }
                        this.field24423.method30452(class23, 0L, b);
                        this.field24423.method30452(class23, this.field24414, b);
                        for (long n7 = 0L; n7 < this.field24414; ++n7) {
                            final long n8 = n7 * this.field24420 + n4;
                            class22.method169(n8, class23.method135(n7));
                            class22.method169(n8 + 1L, class23.method135(this.field24414 + n7));
                        }
                    }
                }
            }
            else {
                for (long n9 = 0L; n9 < this.field24416; ++n9) {
                    final long n10 = n9 * this.field24422;
                    for (long n11 = 0L; n11 < this.field24418; n11 += 4L) {
                        for (long n12 = 0L; n12 < this.field24414; ++n12) {
                            final long n13 = n12 * this.field24420 + n10 + n11;
                            final long n14 = this.field24414 + n12;
                            class23.method169(n12, class22.method135(n13));
                            class23.method169(n14, class22.method135(n13 + 1L));
                            class23.method169(n14 + this.field24414, class22.method135(n13 + 2L));
                            class23.method169(n14 + 2L * this.field24414, class22.method135(n13 + 3L));
                        }
                        this.field24423.method30452(class23, 0L, b);
                        this.field24423.method30452(class23, this.field24414, b);
                        this.field24423.method30452(class23, 2L * this.field24414, b);
                        this.field24423.method30452(class23, 3L * this.field24414, b);
                        for (long n15 = 0L; n15 < this.field24414; ++n15) {
                            final long n16 = n15 * this.field24420 + n10 + n11;
                            final long n17 = this.field24414 + n15;
                            class22.method169(n16, class23.method135(n15));
                            class22.method169(n16 + 1L, class23.method135(n17));
                            class22.method169(n16 + 2L, class23.method135(n17 + this.field24414));
                            class22.method169(n16 + 3L, class23.method135(n17 + 2L * this.field24414));
                        }
                    }
                }
            }
        }
        else if (this.field24418 <= 2L) {
            if (this.field24418 == 2L) {
                for (long n18 = 0L; n18 < this.field24416; ++n18) {
                    final long n19 = n18 * this.field24422;
                    for (long n20 = 0L; n20 < this.field24414; ++n20) {
                        final long n21 = n20 * this.field24420 + n19;
                        class23.method169(n20, class22.method135(n21));
                        class23.method169(this.field24414 + n20, class22.method135(n21 + 1L));
                    }
                    this.field24423.method30448(class23, 0L);
                    this.field24423.method30448(class23, this.field24414);
                    for (long n22 = 0L; n22 < this.field24414; ++n22) {
                        final long n23 = n22 * this.field24420 + n19;
                        class22.method169(n23, class23.method135(n22));
                        class22.method169(n23 + 1L, class23.method135(this.field24414 + n22));
                    }
                }
            }
        }
        else {
            for (long n24 = 0L; n24 < this.field24416; ++n24) {
                final long n25 = n24 * this.field24422;
                for (long n26 = 0L; n26 < this.field24418; n26 += 4L) {
                    for (long n27 = 0L; n27 < this.field24414; ++n27) {
                        final long n28 = n27 * this.field24420 + n25 + n26;
                        final long n29 = this.field24414 + n27;
                        class23.method169(n27, class22.method135(n28));
                        class23.method169(n29, class22.method135(n28 + 1L));
                        class23.method169(n29 + this.field24414, class22.method135(n28 + 2L));
                        class23.method169(n29 + 2L * this.field24414, class22.method135(n28 + 3L));
                    }
                    this.field24423.method30448(class23, 0L);
                    this.field24423.method30448(class23, this.field24414);
                    this.field24423.method30448(class23, 2L * this.field24414);
                    this.field24423.method30448(class23, 3L * this.field24414);
                    for (long n30 = 0L; n30 < this.field24414; ++n30) {
                        final long n31 = n30 * this.field24420 + n25 + n26;
                        final long n32 = this.field24414 + n30;
                        class22.method169(n31, class23.method135(n30));
                        class22.method169(n31 + 1L, class23.method135(n32));
                        class22.method169(n31 + 2L, class23.method135(n32 + this.field24414));
                        class22.method169(n31 + 3L, class23.method135(n32 + 2L * this.field24414));
                    }
                }
            }
        }
    }
    
    private void method17827(final int n, final float[][][] array, final boolean b) {
        int n2 = 4 * this.field24413;
        if (this.field24417 == 2) {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            if (this.field24417 <= 2) {
                if (this.field24417 == 2) {
                    for (int i = 0; i < this.field24415; ++i) {
                        for (int j = 0; j < this.field24413; ++j) {
                            array2[j] = array[j][i][0];
                            array2[this.field24413 + j] = array[j][i][1];
                        }
                        this.field24423.method30451(array2, 0, b);
                        this.field24423.method30451(array2, this.field24413, b);
                        for (int k = 0; k < this.field24413; ++k) {
                            array[k][i][0] = array2[k];
                            array[k][i][1] = array2[this.field24413 + k];
                        }
                    }
                }
            }
            else {
                for (int l = 0; l < this.field24415; ++l) {
                    for (int n3 = 0; n3 < this.field24417; n3 += 4) {
                        for (int n4 = 0; n4 < this.field24413; ++n4) {
                            final int n5 = this.field24413 + n4;
                            array2[n4] = array[n4][l][n3];
                            array2[n5] = array[n4][l][n3 + 1];
                            array2[n5 + this.field24413] = array[n4][l][n3 + 2];
                            array2[n5 + 2 * this.field24413] = array[n4][l][n3 + 3];
                        }
                        this.field24423.method30451(array2, 0, b);
                        this.field24423.method30451(array2, this.field24413, b);
                        this.field24423.method30451(array2, 2 * this.field24413, b);
                        this.field24423.method30451(array2, 3 * this.field24413, b);
                        for (int n6 = 0; n6 < this.field24413; ++n6) {
                            final int n7 = this.field24413 + n6;
                            array[n6][l][n3] = array2[n6];
                            array[n6][l][n3 + 1] = array2[n7];
                            array[n6][l][n3 + 2] = array2[n7 + this.field24413];
                            array[n6][l][n3 + 3] = array2[n7 + 2 * this.field24413];
                        }
                    }
                }
            }
        }
        else if (this.field24417 <= 2) {
            if (this.field24417 == 2) {
                for (int n8 = 0; n8 < this.field24415; ++n8) {
                    for (int n9 = 0; n9 < this.field24413; ++n9) {
                        array2[n9] = array[n9][n8][0];
                        array2[this.field24413 + n9] = array[n9][n8][1];
                    }
                    this.field24423.method30447(array2, 0);
                    this.field24423.method30447(array2, this.field24413);
                    for (int n10 = 0; n10 < this.field24413; ++n10) {
                        array[n10][n8][0] = array2[n10];
                        array[n10][n8][1] = array2[this.field24413 + n10];
                    }
                }
            }
        }
        else {
            for (int n11 = 0; n11 < this.field24415; ++n11) {
                for (int n12 = 0; n12 < this.field24417; n12 += 4) {
                    for (int n13 = 0; n13 < this.field24413; ++n13) {
                        final int n14 = this.field24413 + n13;
                        array2[n13] = array[n13][n11][n12];
                        array2[n14] = array[n13][n11][n12 + 1];
                        array2[n14 + this.field24413] = array[n13][n11][n12 + 2];
                        array2[n14 + 2 * this.field24413] = array[n13][n11][n12 + 3];
                    }
                    this.field24423.method30447(array2, 0);
                    this.field24423.method30447(array2, this.field24413);
                    this.field24423.method30447(array2, 2 * this.field24413);
                    this.field24423.method30447(array2, 3 * this.field24413);
                    for (int n15 = 0; n15 < this.field24413; ++n15) {
                        final int n16 = this.field24413 + n15;
                        array[n15][n11][n12] = array2[n15];
                        array[n15][n11][n12 + 1] = array2[n16];
                        array[n15][n11][n12 + 2] = array2[n16 + this.field24413];
                        array[n15][n11][n12 + 3] = array2[n16 + 2 * this.field24413];
                    }
                }
            }
        }
    }
    
    private void method17828(final int n, final float[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field24413) ? this.field24413 : Class8216.method27224();
        int n3 = 4 * this.field24415;
        if (this.field24417 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1143(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method17829(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field24414) ? this.field24414 : Class8216.method27224());
        long n3 = 4L * this.field24416;
        if (this.field24418 == 2L) {
            n3 >>= 1;
        }
        final long n4 = n3;
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1091(this, n4, n, i, n2, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method17830(final int n, final float[][][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field24413) ? this.field24413 : Class8216.method27224();
        int n3 = 4 * this.field24415;
        if (this.field24417 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1420(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method17831(final int n, final float[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field24415) ? this.field24415 : Class8216.method27224();
        int n3 = 4 * this.field24413;
        if (this.field24417 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1457(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method17832(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field24416) ? this.field24416 : Class8216.method27224());
        long n3 = 4L * this.field24414;
        if (this.field24418 == 2L) {
            n3 >>= 1;
        }
        final long n4 = n3;
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1515(this, n4, n, i, n2, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method17833(final int n, final float[][][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field24415) ? this.field24415 : Class8216.method27224();
        int n3 = 4 * this.field24413;
        if (this.field24417 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1598(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class5934.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method17834(final float[] array) {
        for (int i = 0; i <= this.field24413 / 2; ++i) {
            final int n = (this.field24413 - i) % this.field24413;
            final int n2 = i * this.field24419;
            final int n3 = n * this.field24419;
            for (int j = 0; j <= this.field24415 / 2; ++j) {
                final int n4 = (this.field24415 - j) % this.field24415;
                final int n5 = j * this.field24421;
                final int n6 = n4 * this.field24421;
                for (int k = 0; k <= this.field24417 / 2; ++k) {
                    final int n7 = (this.field24417 - k) % this.field24417;
                    final int n8 = n2 + n6 + k;
                    final int n9 = n2 + n5 + n7;
                    final int n10 = n3 + n5 + k;
                    final int n11 = n3 + n6 + n7;
                    final int n12 = n3 + n6 + k;
                    final int n13 = n3 + n5 + n7;
                    final int n14 = n2 + n5 + k;
                    final int n15 = n2 + n6 + n7;
                    final float n16 = array[n8];
                    final float n17 = array[n9];
                    final float n18 = array[n10];
                    final float n19 = array[n11];
                    final float n20 = array[n12];
                    final float n21 = array[n13];
                    final float n22 = array[n14];
                    final float n23 = array[n15];
                    array[n14] = (n16 + n17 + n18 - n19) / 2.0f;
                    array[n10] = (n20 + n21 + n22 - n23) / 2.0f;
                    array[n8] = (n22 + n23 + n20 - n21) / 2.0f;
                    array[n12] = (n18 + n19 + n16 - n17) / 2.0f;
                    array[n9] = (n23 + n22 + n21 - n20) / 2.0f;
                    array[n13] = (n19 + n18 + n17 - n16) / 2.0f;
                    array[n15] = (n17 + n16 + n19 - n18) / 2.0f;
                    array[n11] = (n21 + n20 + n23 - n22) / 2.0f;
                }
            }
        }
    }
    
    private void method17835(final Class22 class22) {
        for (long n = 0L; n <= this.field24414 / 2L; ++n) {
            final long n2 = (this.field24414 - n) % this.field24414;
            final long n3 = n * this.field24420;
            final long n4 = n2 * this.field24420;
            for (long n5 = 0L; n5 <= this.field24416 / 2L; ++n5) {
                final long n6 = (this.field24416 - n5) % this.field24416;
                final long n7 = n5 * this.field24422;
                final long n8 = n6 * this.field24422;
                for (long n9 = 0L; n9 <= this.field24418 / 2L; ++n9) {
                    final long n10 = (this.field24418 - n9) % this.field24418;
                    final long n11 = n3 + n8 + n9;
                    final long n12 = n3 + n7 + n10;
                    final long n13 = n4 + n7 + n9;
                    final long n14 = n4 + n8 + n10;
                    final long n15 = n4 + n8 + n9;
                    final long n16 = n4 + n7 + n10;
                    final long n17 = n3 + n7 + n9;
                    final long n18 = n3 + n8 + n10;
                    final float method135 = class22.method135(n11);
                    final float method136 = class22.method135(n12);
                    final float method137 = class22.method135(n13);
                    final float method138 = class22.method135(n14);
                    final float method139 = class22.method135(n15);
                    final float method140 = class22.method135(n16);
                    final float method141 = class22.method135(n17);
                    final float method142 = class22.method135(n18);
                    class22.method169(n17, (method135 + method136 + method137 - method138) / 2.0f);
                    class22.method169(n13, (method139 + method140 + method141 - method142) / 2.0f);
                    class22.method169(n11, (method141 + method142 + method139 - method140) / 2.0f);
                    class22.method169(n15, (method137 + method138 + method135 - method136) / 2.0f);
                    class22.method169(n12, (method142 + method141 + method140 - method139) / 2.0f);
                    class22.method169(n16, (method138 + method137 + method136 - method135) / 2.0f);
                    class22.method169(n18, (method136 + method135 + method138 - method137) / 2.0f);
                    class22.method169(n14, (method140 + method139 + method142 - method141) / 2.0f);
                }
            }
        }
    }
    
    private void method17836(final float[][][] array) {
        for (int i = 0; i <= this.field24413 / 2; ++i) {
            final int n = (this.field24413 - i) % this.field24413;
            for (int j = 0; j <= this.field24415 / 2; ++j) {
                final int n2 = (this.field24415 - j) % this.field24415;
                for (int k = 0; k <= this.field24417 / 2; ++k) {
                    final int n3 = (this.field24417 - k) % this.field24417;
                    final float n4 = array[i][n2][k];
                    final float n5 = array[i][j][n3];
                    final float n6 = array[n][j][k];
                    final float n7 = array[n][n2][n3];
                    final float n8 = array[n][n2][k];
                    final float n9 = array[n][j][n3];
                    final float n10 = array[i][j][k];
                    final float n11 = array[i][n2][n3];
                    array[i][j][k] = (n4 + n5 + n6 - n7) / 2.0f;
                    array[n][j][k] = (n8 + n9 + n10 - n11) / 2.0f;
                    array[i][n2][k] = (n10 + n11 + n8 - n9) / 2.0f;
                    array[n][n2][k] = (n6 + n7 + n4 - n5) / 2.0f;
                    array[i][j][n3] = (n11 + n10 + n9 - n8) / 2.0f;
                    array[n][j][n3] = (n7 + n6 + n5 - n4) / 2.0f;
                    array[i][n2][n3] = (n5 + n4 + n7 - n6) / 2.0f;
                    array[n][n2][n3] = (n9 + n8 + n11 - n10) / 2.0f;
                }
            }
        }
    }
}
