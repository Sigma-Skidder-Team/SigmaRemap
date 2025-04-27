// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class6362
{
    private final int field25444;
    private final long field25445;
    private final int field25446;
    private final long field25447;
    private int field25448;
    private long field25449;
    private int field25450;
    private long field25451;
    private int field25452;
    private long field25453;
    private final Class7978 field25454;
    private final Class7978 field25455;
    private final Class7978 field25456;
    private boolean field25457;
    private boolean field25458;
    
    public Class6362(final long field25445, final long field25446, final long n) {
        this.field25457 = false;
        this.field25458 = false;
        if (field25445 > 1L) {
            if (field25446 > 1L) {
                if (n > 1L) {
                    this.field25444 = (int)field25445;
                    this.field25446 = (int)field25446;
                    this.field25448 = (int)n;
                    this.field25445 = field25445;
                    this.field25447 = field25446;
                    this.field25449 = n;
                    this.field25450 = (int)(field25446 * n);
                    this.field25452 = (int)n;
                    this.field25451 = field25446 * n;
                    this.field25453 = n;
                    if (field25445 * field25446 * n >= Class9133.method33161()) {
                        this.field25458 = true;
                    }
                    if (Class9133.method33175(field25445)) {
                        if (Class9133.method33175(field25446)) {
                            if (Class9133.method33175(n)) {
                                this.field25457 = true;
                            }
                        }
                    }
                    Class9133.method33169(2L * field25445 * field25446 * n > Class11.method177());
                    this.field25454 = new Class7978(field25445);
                    if (field25445 != field25446) {
                        this.field25455 = new Class7978(field25446);
                    }
                    else {
                        this.field25455 = this.field25454;
                    }
                    if (field25445 != n) {
                        if (field25446 != n) {
                            this.field25456 = new Class7978(n);
                        }
                        else {
                            this.field25456 = this.field25455;
                        }
                    }
                    else {
                        this.field25456 = this.field25454;
                    }
                    return;
                }
            }
        }
        throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
    }
    
    public void method18949(final float[] array) {
        final int method27224 = Class8216.method27224();
        if (this.field25457) {
            final int field25448 = this.field25448;
            this.field25448 *= 2;
            this.field25450 = this.field25446 * this.field25448;
            this.field25452 = this.field25448;
            if (method27224 > 1 && this.field25458) {
                this.method18984(0, -1, array, true);
                this.method18988(-1, array, true);
            }
            else {
                this.method18975(0, -1, array, true);
                this.method18979(-1, array, true);
            }
            this.field25448 = field25448;
            this.field25450 = this.field25446 * this.field25448;
            this.field25452 = this.field25448;
        }
        else {
            this.field25450 = 2 * this.field25446 * this.field25448;
            this.field25452 = 2 * this.field25448;
            if (method27224 > 1 && this.field25458 && this.field25444 >= method27224 && this.field25446 >= method27224 && this.field25448 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field25444 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final int n2 = i * n;
                    array2[i] = Class8216.method27227(new Class1415(this, n2, (i == method27224 - 1) ? this.field25444 : (n2 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n;
                    array2[j] = Class8216.method27227(new Class1046(this, n3, (j == method27224 - 1) ? this.field25444 : (n3 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final int n4 = this.field25446 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    array2[k] = Class8216.method27227(new Class1600(this, n5, (k == method27224 - 1) ? this.field25446 : (n5 + n4), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (int l = 0; l < this.field25444; ++l) {
                    final int n6 = l * this.field25450;
                    for (int n7 = 0; n7 < this.field25446; ++n7) {
                        this.field25456.method25927(array, n6 + n7 * this.field25452);
                    }
                }
                final float[] array3 = new float[2 * this.field25446];
                for (int n8 = 0; n8 < this.field25444; ++n8) {
                    final int n9 = n8 * this.field25450;
                    for (int n10 = 0; n10 < this.field25448; ++n10) {
                        final int n11 = 2 * n10;
                        for (int n12 = 0; n12 < this.field25446; ++n12) {
                            final int n13 = n9 + n11 + n12 * this.field25452;
                            final int n14 = 2 * n12;
                            array3[n14] = array[n13];
                            array3[n14 + 1] = array[n13 + 1];
                        }
                        this.field25455.method25925(array3);
                        for (int n15 = 0; n15 < this.field25446; ++n15) {
                            final int n16 = n9 + n11 + n15 * this.field25452;
                            final int n17 = 2 * n15;
                            array[n16] = array3[n17];
                            array[n16 + 1] = array3[n17 + 1];
                        }
                    }
                }
                final float[] array4 = new float[2 * this.field25444];
                for (int n18 = 0; n18 < this.field25446; ++n18) {
                    final int n19 = n18 * this.field25452;
                    for (int n20 = 0; n20 < this.field25448; ++n20) {
                        final int n21 = 2 * n20;
                        for (int n22 = 0; n22 < this.field25444; ++n22) {
                            final int n23 = n22 * this.field25450 + n19 + n21;
                            final int n24 = 2 * n22;
                            array4[n24] = array[n23];
                            array4[n24 + 1] = array[n23 + 1];
                        }
                        this.field25454.method25925(array4);
                        for (int n25 = 0; n25 < this.field25444; ++n25) {
                            final int n26 = n25 * this.field25450 + n19 + n21;
                            final int n27 = 2 * n25;
                            array[n26] = array4[n27];
                            array[n26 + 1] = array4[n27 + 1];
                        }
                    }
                }
            }
            this.field25450 = this.field25446 * this.field25448;
            this.field25452 = this.field25448;
        }
    }
    
    public void method18950(final Class22 class22) {
        if (!class22.method173() && !class22.method175()) {
            this.method18949(class22.method230());
        }
        else {
            final int method27224 = Class8216.method27224();
            if (this.field25457) {
                final long field25449 = this.field25449;
                this.field25449 *= 2L;
                this.field25451 = this.field25447 * this.field25449;
                this.field25453 = this.field25449;
                if (method27224 > 1 && this.field25458) {
                    this.method18985(0L, -1, class22, true);
                    this.method18989(-1, class22, true);
                }
                else {
                    this.method18976(0L, -1, class22, true);
                    this.method18980(-1, class22, true);
                }
                this.field25449 = field25449;
                this.field25451 = this.field25447 * this.field25449;
                this.field25453 = this.field25449;
            }
            else {
                this.field25451 = 2L * this.field25447 * this.field25449;
                this.field25453 = 2L * this.field25449;
                if (method27224 > 1 && this.field25458 && this.field25445 >= method27224 && this.field25447 >= method27224 && this.field25449 >= method27224) {
                    final Future[] array = new Future[method27224];
                    final long n = this.field25445 / method27224;
                    for (int i = 0; i < method27224; ++i) {
                        final long n2 = i * n;
                        array[i] = Class8216.method27227(new Class1379(this, n2, (i == method27224 - 1) ? this.field25445 : (n2 + n), class22));
                    }
                    try {
                        Class8216.method27228(array);
                    }
                    catch (final InterruptedException thrown) {
                        Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
                    }
                    catch (final ExecutionException thrown2) {
                        Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
                    }
                    for (int j = 0; j < method27224; ++j) {
                        final long n3 = j * n;
                        array[j] = Class8216.method27227(new Class1213(this, n3, (j == method27224 - 1) ? this.field25445 : (n3 + n), class22));
                    }
                    try {
                        Class8216.method27228(array);
                    }
                    catch (final InterruptedException thrown3) {
                        Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
                    }
                    catch (final ExecutionException thrown4) {
                        Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
                    }
                    final long n4 = this.field25447 / method27224;
                    for (int k = 0; k < method27224; ++k) {
                        final long n5 = k * n4;
                        array[k] = Class8216.method27227(new Class1019(this, n5, (k == method27224 - 1) ? this.field25447 : (n5 + n4), class22));
                    }
                    try {
                        Class8216.method27228(array);
                    }
                    catch (final InterruptedException thrown5) {
                        Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
                    }
                    catch (final ExecutionException thrown6) {
                        Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
                    }
                }
                else {
                    for (long n6 = 0L; n6 < this.field25445; ++n6) {
                        final long n7 = n6 * this.field25451;
                        for (long n8 = 0L; n8 < this.field25447; ++n8) {
                            this.field25456.method25928(class22, n7 + n8 * this.field25453);
                        }
                    }
                    final Class22 class23 = new Class22(2L * this.field25447, false);
                    for (long n9 = 0L; n9 < this.field25445; ++n9) {
                        final long n10 = n9 * this.field25451;
                        for (long n11 = 0L; n11 < this.field25449; ++n11) {
                            final long n12 = 2L * n11;
                            for (long n13 = 0L; n13 < this.field25447; ++n13) {
                                final long n14 = n10 + n12 + n13 * this.field25453;
                                final long n15 = 2L * n13;
                                class23.method169(n15, class22.method135(n14));
                                class23.method169(n15 + 1L, class22.method135(n14 + 1L));
                            }
                            this.field25455.method25926(class23);
                            for (long n16 = 0L; n16 < this.field25447; ++n16) {
                                final long n17 = n10 + n12 + n16 * this.field25453;
                                final long n18 = 2L * n16;
                                class22.method169(n17, class23.method135(n18));
                                class22.method169(n17 + 1L, class23.method135(n18 + 1L));
                            }
                        }
                    }
                    final Class22 class24 = new Class22(2L * this.field25445, false);
                    for (long n19 = 0L; n19 < this.field25447; ++n19) {
                        final long n20 = n19 * this.field25453;
                        for (long n21 = 0L; n21 < this.field25449; ++n21) {
                            final long n22 = 2L * n21;
                            for (long n23 = 0L; n23 < this.field25445; ++n23) {
                                final long n24 = n23 * this.field25451 + n20 + n22;
                                final long n25 = 2L * n23;
                                class24.method169(n25, class22.method135(n24));
                                class24.method169(n25 + 1L, class22.method135(n24 + 1L));
                            }
                            this.field25454.method25926(class24);
                            for (long n26 = 0L; n26 < this.field25445; ++n26) {
                                final long n27 = n26 * this.field25451 + n20 + n22;
                                final long n28 = 2L * n26;
                                class22.method169(n27, class24.method135(n28));
                                class22.method169(n27 + 1L, class24.method135(n28 + 1L));
                            }
                        }
                    }
                }
                this.field25451 = this.field25447 * this.field25449;
                this.field25453 = this.field25449;
            }
        }
    }
    
    public void method18951(final float[][][] array) {
        final int method27224 = Class8216.method27224();
        if (this.field25457) {
            final int field25448 = this.field25448;
            this.field25448 *= 2;
            this.field25450 = this.field25446 * this.field25448;
            this.field25452 = this.field25448;
            if (method27224 > 1 && this.field25458) {
                this.method18987(0, -1, array, true);
                this.method18990(-1, array, true);
            }
            else {
                this.method18978(0, -1, array, true);
                this.method18981(-1, array, true);
            }
            this.field25448 = field25448;
            this.field25450 = this.field25446 * this.field25448;
            this.field25452 = this.field25448;
        }
        else if (method27224 > 1 && this.field25458 && this.field25444 >= method27224 && this.field25446 >= method27224 && this.field25448 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field25444 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1038(this, n2, (i == method27224 - 1) ? this.field25444 : (n2 + n), array));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1451(this, n3, (j == method27224 - 1) ? this.field25444 : (n3 + n), array));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field25446 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1297(this, n5, (k == method27224 - 1) ? this.field25446 : (n5 + n4), array));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field25444; ++l) {
                for (int n6 = 0; n6 < this.field25446; ++n6) {
                    this.field25456.method25925(array[l][n6]);
                }
            }
            final float[] array3 = new float[2 * this.field25446];
            for (int n7 = 0; n7 < this.field25444; ++n7) {
                for (int n8 = 0; n8 < this.field25448; ++n8) {
                    final int n9 = 2 * n8;
                    for (int n10 = 0; n10 < this.field25446; ++n10) {
                        final int n11 = 2 * n10;
                        array3[n11] = array[n7][n10][n9];
                        array3[n11 + 1] = array[n7][n10][n9 + 1];
                    }
                    this.field25455.method25925(array3);
                    for (int n12 = 0; n12 < this.field25446; ++n12) {
                        final int n13 = 2 * n12;
                        array[n7][n12][n9] = array3[n13];
                        array[n7][n12][n9 + 1] = array3[n13 + 1];
                    }
                }
            }
            final float[] array4 = new float[2 * this.field25444];
            for (int n14 = 0; n14 < this.field25446; ++n14) {
                for (int n15 = 0; n15 < this.field25448; ++n15) {
                    final int n16 = 2 * n15;
                    for (int n17 = 0; n17 < this.field25444; ++n17) {
                        final int n18 = 2 * n17;
                        array4[n18] = array[n17][n14][n16];
                        array4[n18 + 1] = array[n17][n14][n16 + 1];
                    }
                    this.field25454.method25925(array4);
                    for (int n19 = 0; n19 < this.field25444; ++n19) {
                        final int n20 = 2 * n19;
                        array[n19][n14][n16] = array4[n20];
                        array[n19][n14][n16 + 1] = array4[n20 + 1];
                    }
                }
            }
        }
    }
    
    public void method18952(final float[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field25457) {
            final int field25448 = this.field25448;
            this.field25448 *= 2;
            this.field25450 = this.field25446 * this.field25448;
            this.field25452 = this.field25448;
            if (method27224 > 1 && this.field25458) {
                this.method18984(0, 1, array, b);
                this.method18988(1, array, b);
            }
            else {
                this.method18975(0, 1, array, b);
                this.method18979(1, array, b);
            }
            this.field25448 = field25448;
            this.field25450 = this.field25446 * this.field25448;
            this.field25452 = this.field25448;
        }
        else {
            this.field25450 = 2 * this.field25446 * this.field25448;
            this.field25452 = 2 * this.field25448;
            if (method27224 > 1 && this.field25458 && this.field25444 >= method27224 && this.field25446 >= method27224 && this.field25448 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field25444 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final int n2 = i * n;
                    array2[i] = Class8216.method27227(new Class1117(this, n2, (i == method27224 - 1) ? this.field25444 : (n2 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n;
                    array2[j] = Class8216.method27227(new Class1231(this, n3, (j == method27224 - 1) ? this.field25444 : (n3 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final int n4 = this.field25446 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    array2[k] = Class8216.method27227(new Class1646(this, n5, (k == method27224 - 1) ? this.field25446 : (n5 + n4), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (int l = 0; l < this.field25444; ++l) {
                    final int n6 = l * this.field25450;
                    for (int n7 = 0; n7 < this.field25446; ++n7) {
                        this.field25456.method25931(array, n6 + n7 * this.field25452, b);
                    }
                }
                final float[] array3 = new float[2 * this.field25446];
                for (int n8 = 0; n8 < this.field25444; ++n8) {
                    final int n9 = n8 * this.field25450;
                    for (int n10 = 0; n10 < this.field25448; ++n10) {
                        final int n11 = 2 * n10;
                        for (int n12 = 0; n12 < this.field25446; ++n12) {
                            final int n13 = n9 + n11 + n12 * this.field25452;
                            final int n14 = 2 * n12;
                            array3[n14] = array[n13];
                            array3[n14 + 1] = array[n13 + 1];
                        }
                        this.field25455.method25929(array3, b);
                        for (int n15 = 0; n15 < this.field25446; ++n15) {
                            final int n16 = n9 + n11 + n15 * this.field25452;
                            final int n17 = 2 * n15;
                            array[n16] = array3[n17];
                            array[n16 + 1] = array3[n17 + 1];
                        }
                    }
                }
                final float[] array4 = new float[2 * this.field25444];
                for (int n18 = 0; n18 < this.field25446; ++n18) {
                    final int n19 = n18 * this.field25452;
                    for (int n20 = 0; n20 < this.field25448; ++n20) {
                        final int n21 = 2 * n20;
                        for (int n22 = 0; n22 < this.field25444; ++n22) {
                            final int n23 = n22 * this.field25450 + n19 + n21;
                            final int n24 = 2 * n22;
                            array4[n24] = array[n23];
                            array4[n24 + 1] = array[n23 + 1];
                        }
                        this.field25454.method25929(array4, b);
                        for (int n25 = 0; n25 < this.field25444; ++n25) {
                            final int n26 = n25 * this.field25450 + n19 + n21;
                            final int n27 = 2 * n25;
                            array[n26] = array4[n27];
                            array[n26 + 1] = array4[n27 + 1];
                        }
                    }
                }
            }
            this.field25450 = this.field25446 * this.field25448;
            this.field25452 = this.field25448;
        }
    }
    
    public void method18953(final Class22 class22, final boolean b) {
        if (!class22.method173() && !class22.method175()) {
            this.method18952(class22.method230(), b);
        }
        else {
            final int method27224 = Class8216.method27224();
            if (this.field25457) {
                final long field25449 = this.field25449;
                this.field25449 *= 2L;
                this.field25451 = this.field25447 * this.field25449;
                this.field25453 = this.field25449;
                if (method27224 > 1 && this.field25458) {
                    this.method18985(0L, 1, class22, b);
                    this.method18989(1, class22, b);
                }
                else {
                    this.method18976(0L, 1, class22, b);
                    this.method18980(1, class22, b);
                }
                this.field25449 = field25449;
                this.field25451 = this.field25447 * this.field25449;
                this.field25453 = this.field25449;
            }
            else {
                this.field25451 = 2L * this.field25447 * this.field25449;
                this.field25453 = 2L * this.field25449;
                if (method27224 > 1 && this.field25458 && this.field25445 >= method27224 && this.field25447 >= method27224 && this.field25449 >= method27224) {
                    final Future[] array = new Future[method27224];
                    final long n = this.field25445 / method27224;
                    for (int i = 0; i < method27224; ++i) {
                        final long n2 = i * n;
                        array[i] = Class8216.method27227(new Class1346(this, n2, (i == method27224 - 1) ? this.field25445 : (n2 + n), class22, b));
                    }
                    try {
                        Class8216.method27228(array);
                    }
                    catch (final InterruptedException thrown) {
                        Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
                    }
                    catch (final ExecutionException thrown2) {
                        Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
                    }
                    for (int j = 0; j < method27224; ++j) {
                        final long n3 = j * n;
                        array[j] = Class8216.method27227(new Class1617(this, n3, (j == method27224 - 1) ? this.field25445 : (n3 + n), class22, b));
                    }
                    try {
                        Class8216.method27228(array);
                    }
                    catch (final InterruptedException thrown3) {
                        Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
                    }
                    catch (final ExecutionException thrown4) {
                        Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
                    }
                    final long n4 = this.field25447 / method27224;
                    for (int k = 0; k < method27224; ++k) {
                        final long n5 = k * n4;
                        array[k] = Class8216.method27227(new Class1292(this, n5, (k == method27224 - 1) ? this.field25447 : (n5 + n4), class22, b));
                    }
                    try {
                        Class8216.method27228(array);
                    }
                    catch (final InterruptedException thrown5) {
                        Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
                    }
                    catch (final ExecutionException thrown6) {
                        Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
                    }
                }
                else {
                    for (long n6 = 0L; n6 < this.field25445; ++n6) {
                        final long n7 = n6 * this.field25451;
                        for (long n8 = 0L; n8 < this.field25447; ++n8) {
                            this.field25456.method25932(class22, n7 + n8 * this.field25453, b);
                        }
                    }
                    final Class22 class23 = new Class22(2L * this.field25447, false);
                    for (long n9 = 0L; n9 < this.field25445; ++n9) {
                        final long n10 = n9 * this.field25451;
                        for (long n11 = 0L; n11 < this.field25449; ++n11) {
                            final long n12 = 2L * n11;
                            for (long n13 = 0L; n13 < this.field25447; ++n13) {
                                final long n14 = n10 + n12 + n13 * this.field25453;
                                final long n15 = 2L * n13;
                                class23.method169(n15, class22.method135(n14));
                                class23.method169(n15 + 1L, class22.method135(n14 + 1L));
                            }
                            this.field25455.method25930(class23, b);
                            for (long n16 = 0L; n16 < this.field25447; ++n16) {
                                final long n17 = n10 + n12 + n16 * this.field25453;
                                final long n18 = 2L * n16;
                                class22.method169(n17, class23.method135(n18));
                                class22.method169(n17 + 1L, class23.method135(n18 + 1L));
                            }
                        }
                    }
                    final Class22 class24 = new Class22(2L * this.field25445, false);
                    for (long n19 = 0L; n19 < this.field25447; ++n19) {
                        final long n20 = n19 * this.field25453;
                        for (long n21 = 0L; n21 < this.field25449; ++n21) {
                            final long n22 = 2L * n21;
                            for (long n23 = 0L; n23 < this.field25445; ++n23) {
                                final long n24 = n23 * this.field25451 + n20 + n22;
                                final long n25 = 2L * n23;
                                class24.method169(n25, class22.method135(n24));
                                class24.method169(n25 + 1L, class22.method135(n24 + 1L));
                            }
                            this.field25454.method25930(class24, b);
                            for (long n26 = 0L; n26 < this.field25445; ++n26) {
                                final long n27 = n26 * this.field25451 + n20 + n22;
                                final long n28 = 2L * n26;
                                class22.method169(n27, class24.method135(n28));
                                class22.method169(n27 + 1L, class24.method135(n28 + 1L));
                            }
                        }
                    }
                }
                this.field25451 = this.field25447 * this.field25449;
                this.field25453 = this.field25449;
            }
        }
    }
    
    public void method18954(final float[][][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field25457) {
            final int field25448 = this.field25448;
            this.field25448 *= 2;
            this.field25450 = this.field25446 * this.field25448;
            this.field25452 = this.field25448;
            if (method27224 > 1 && this.field25458) {
                this.method18987(0, 1, array, b);
                this.method18990(1, array, b);
            }
            else {
                this.method18978(0, 1, array, b);
                this.method18981(1, array, b);
            }
            this.field25448 = field25448;
            this.field25450 = this.field25446 * this.field25448;
            this.field25452 = this.field25448;
        }
        else if (method27224 > 1 && this.field25458 && this.field25444 >= method27224 && this.field25446 >= method27224 && this.field25448 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field25444 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1595(this, n2, (i == method27224 - 1) ? this.field25444 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1529(this, n3, (j == method27224 - 1) ? this.field25444 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field25446 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1439(this, n5, (k == method27224 - 1) ? this.field25446 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field25444; ++l) {
                for (int n6 = 0; n6 < this.field25446; ++n6) {
                    this.field25456.method25929(array[l][n6], b);
                }
            }
            final float[] array3 = new float[2 * this.field25446];
            for (int n7 = 0; n7 < this.field25444; ++n7) {
                for (int n8 = 0; n8 < this.field25448; ++n8) {
                    final int n9 = 2 * n8;
                    for (int n10 = 0; n10 < this.field25446; ++n10) {
                        final int n11 = 2 * n10;
                        array3[n11] = array[n7][n10][n9];
                        array3[n11 + 1] = array[n7][n10][n9 + 1];
                    }
                    this.field25455.method25929(array3, b);
                    for (int n12 = 0; n12 < this.field25446; ++n12) {
                        final int n13 = 2 * n12;
                        array[n7][n12][n9] = array3[n13];
                        array[n7][n12][n9 + 1] = array3[n13 + 1];
                    }
                }
            }
            final float[] array4 = new float[2 * this.field25444];
            for (int n14 = 0; n14 < this.field25446; ++n14) {
                for (int n15 = 0; n15 < this.field25448; ++n15) {
                    final int n16 = 2 * n15;
                    for (int n17 = 0; n17 < this.field25444; ++n17) {
                        final int n18 = 2 * n17;
                        array4[n18] = array[n17][n14][n16];
                        array4[n18 + 1] = array[n17][n14][n16 + 1];
                    }
                    this.field25454.method25929(array4, b);
                    for (int n19 = 0; n19 < this.field25444; ++n19) {
                        final int n20 = 2 * n19;
                        array[n19][n14][n16] = array4[n20];
                        array[n19][n14][n16 + 1] = array4[n20 + 1];
                    }
                }
            }
        }
    }
    
    public void method18955(final float[] array) {
        if (this.field25457) {
            if (Class8216.method27224() > 1 && this.field25458) {
                this.method18982(1, -1, array, true);
                this.method18988(-1, array, true);
                this.method18991(1, array);
            }
            else {
                this.method18973(1, -1, array, true);
                this.method18979(-1, array, true);
                this.method18991(1, array);
            }
            return;
        }
        throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
    }
    
    public void method18956(final Class22 class22) {
        if (this.field25457) {
            if (Class8216.method27224() > 1 && this.field25458) {
                this.method18983(1L, -1, class22, true);
                this.method18989(-1, class22, true);
                this.method18992(1, class22);
            }
            else {
                this.method18974(1L, -1, class22, true);
                this.method18980(-1, class22, true);
                this.method18992(1, class22);
            }
            return;
        }
        throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
    }
    
    public void method18957(final float[][][] array) {
        if (this.field25457) {
            if (Class8216.method27224() > 1 && this.field25458) {
                this.method18986(1, -1, array, true);
                this.method18990(-1, array, true);
                this.method18993(1, array);
            }
            else {
                this.method18977(1, -1, array, true);
                this.method18981(-1, array, true);
                this.method18993(1, array);
            }
            return;
        }
        throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
    }
    
    public void method18958(final float[] array) {
        if (!this.field25457) {
            this.method18969(array);
        }
        else {
            if (Class8216.method27224() > 1 && this.field25458) {
                this.method18984(1, -1, array, true);
                this.method18988(-1, array, true);
                this.method18991(1, array);
            }
            else {
                this.method18975(1, -1, array, true);
                this.method18979(-1, array, true);
                this.method18991(1, array);
            }
            this.method18995(array);
        }
    }
    
    public void method18959(final Class22 class22) {
        if (!this.field25457) {
            this.method18970(class22);
        }
        else {
            if (Class8216.method27224() > 1 && this.field25458) {
                this.method18985(1L, -1, class22, true);
                this.method18989(-1, class22, true);
                this.method18992(1, class22);
            }
            else {
                this.method18976(1L, -1, class22, true);
                this.method18980(-1, class22, true);
                this.method18992(1, class22);
            }
            this.method18996(class22);
        }
    }
    
    public void method18960(final float[][][] array) {
        if (!this.field25457) {
            this.method18967(array);
        }
        else {
            if (Class8216.method27224() > 1 && this.field25458) {
                this.method18987(1, -1, array, true);
                this.method18990(-1, array, true);
                this.method18993(1, array);
            }
            else {
                this.method18978(1, -1, array, true);
                this.method18981(-1, array, true);
                this.method18993(1, array);
            }
            this.method18994(array);
        }
    }
    
    public void method18961(final float[] array, final boolean b) {
        if (this.field25457) {
            if (Class8216.method27224() > 1 && this.field25458) {
                this.method18991(-1, array);
                this.method18988(1, array, b);
                this.method18982(1, 1, array, b);
            }
            else {
                this.method18991(-1, array);
                this.method18979(1, array, b);
                this.method18973(1, 1, array, b);
            }
            return;
        }
        throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
    }
    
    public void method18962(final Class22 class22, final boolean b) {
        if (this.field25457) {
            if (Class8216.method27224() > 1 && this.field25458) {
                this.method18992(-1, class22);
                this.method18989(1, class22, b);
                this.method18983(1L, 1, class22, b);
            }
            else {
                this.method18992(-1, class22);
                this.method18980(1, class22, b);
                this.method18974(1L, 1, class22, b);
            }
            return;
        }
        throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
    }
    
    public void method18963(final float[][][] array, final boolean b) {
        if (this.field25457) {
            if (Class8216.method27224() > 1 && this.field25458) {
                this.method18993(-1, array);
                this.method18990(1, array, b);
                this.method18986(1, 1, array, b);
            }
            else {
                this.method18993(-1, array);
                this.method18981(1, array, b);
                this.method18977(1, 1, array, b);
            }
            return;
        }
        throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
    }
    
    public void method18964(final float[] array, final boolean b) {
        if (!this.field25457) {
            this.method18971(array, b);
        }
        else {
            if (Class8216.method27224() > 1 && this.field25458) {
                this.method18984(1, 1, array, b);
                this.method18988(1, array, b);
                this.method18991(1, array);
            }
            else {
                this.method18975(1, 1, array, b);
                this.method18979(1, array, b);
                this.method18991(1, array);
            }
            this.method18995(array);
        }
    }
    
    public void method18965(final Class22 class22, final boolean b) {
        if (!this.field25457) {
            this.method18972(class22, b);
        }
        else {
            if (Class8216.method27224() > 1 && this.field25458) {
                this.method18985(1L, 1, class22, b);
                this.method18989(1, class22, b);
                this.method18992(1, class22);
            }
            else {
                this.method18976(1L, 1, class22, b);
                this.method18980(1, class22, b);
                this.method18992(1, class22);
            }
            this.method18996(class22);
        }
    }
    
    public void method18966(final float[][][] array, final boolean b) {
        if (!this.field25457) {
            this.method18968(array, b);
        }
        else {
            if (Class8216.method27224() > 1 && this.field25458) {
                this.method18987(1, 1, array, b);
                this.method18990(1, array, b);
                this.method18993(1, array);
            }
            else {
                this.method18978(1, 1, array, b);
                this.method18981(1, array, b);
                this.method18993(1, array);
            }
            this.method18994(array);
        }
    }
    
    private void method18967(final float[][][] array) {
        final float[] array2 = new float[2 * this.field25446];
        final int n = this.field25446 / 2 + 1;
        final int n2 = 2 * this.field25448;
        int n3;
        if (this.field25446 % 2 == 0) {
            n3 = this.field25446 / 2;
        }
        else {
            n3 = (this.field25446 + 1) / 2;
        }
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field25458 && this.field25444 >= method27224 && this.field25448 >= method27224 && n >= method27224) {
            final Future[] array3 = new Future[method27224];
            final int n4 = this.field25444 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n5 = i * n4;
                array3[i] = Class8216.method27227(new Class1407(this, n5, (i == method27224 - 1) ? this.field25444 : (n5 + n4), array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n6 = j * n4;
                array3[j] = Class8216.method27227(new Class1265(this, n6, (j == method27224 - 1) ? this.field25444 : (n6 + n4), array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n7 = n / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n8 = k * n7;
                array3[k] = Class8216.method27227(new Class1630(this, n8, (k == method27224 - 1) ? n : (n8 + n7), array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            final int n9 = this.field25444 / method27224;
            for (int l = 0; l < method27224; ++l) {
                final int n10 = l * n9;
                array3[l] = Class8216.method27227(new Class1054(this, n10, (l == method27224 - 1) ? this.field25444 : (n10 + n9), n3, n2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (int n11 = 0; n11 < this.field25444; ++n11) {
                for (int n12 = 0; n12 < this.field25446; ++n12) {
                    this.field25456.method25937(array[n11][n12]);
                }
            }
            for (int n13 = 0; n13 < this.field25444; ++n13) {
                for (int n14 = 0; n14 < this.field25448; ++n14) {
                    final int n15 = 2 * n14;
                    for (int n16 = 0; n16 < this.field25446; ++n16) {
                        final int n17 = 2 * n16;
                        array2[n17] = array[n13][n16][n15];
                        array2[n17 + 1] = array[n13][n16][n15 + 1];
                    }
                    this.field25455.method25925(array2);
                    for (int n18 = 0; n18 < this.field25446; ++n18) {
                        final int n19 = 2 * n18;
                        array[n13][n18][n15] = array2[n19];
                        array[n13][n18][n15 + 1] = array2[n19 + 1];
                    }
                }
            }
            final float[] array4 = new float[2 * this.field25444];
            for (int n20 = 0; n20 < n; ++n20) {
                for (int n21 = 0; n21 < this.field25448; ++n21) {
                    final int n22 = 2 * n21;
                    for (int n23 = 0; n23 < this.field25444; ++n23) {
                        final int n24 = 2 * n23;
                        array4[n24] = array[n23][n20][n22];
                        array4[n24 + 1] = array[n23][n20][n22 + 1];
                    }
                    this.field25454.method25925(array4);
                    for (int n25 = 0; n25 < this.field25444; ++n25) {
                        final int n26 = 2 * n25;
                        array[n25][n20][n22] = array4[n26];
                        array[n25][n20][n22 + 1] = array4[n26 + 1];
                    }
                }
            }
            for (int n27 = 0; n27 < this.field25444; ++n27) {
                final int n28 = (this.field25444 - n27) % this.field25444;
                for (int n29 = 1; n29 < n3; ++n29) {
                    final int n30 = this.field25446 - n29;
                    for (int n31 = 0; n31 < this.field25448; ++n31) {
                        final int n32 = 2 * n31;
                        final int n33 = n2 - n32;
                        array[n28][n30][n33 % n2] = array[n27][n29][n32];
                        array[n28][n30][(n33 + 1) % n2] = -array[n27][n29][n32 + 1];
                    }
                }
            }
        }
    }
    
    private void method18968(final float[][][] array, final boolean b) {
        final float[] array2 = new float[2 * this.field25446];
        final int n = this.field25446 / 2 + 1;
        final int n2 = 2 * this.field25448;
        int n3;
        if (this.field25446 % 2 == 0) {
            n3 = this.field25446 / 2;
        }
        else {
            n3 = (this.field25446 + 1) / 2;
        }
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field25458 && this.field25444 >= method27224 && this.field25448 >= method27224 && n >= method27224) {
            final Future[] array3 = new Future[method27224];
            final int n4 = this.field25444 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n5 = i * n4;
                array3[i] = Class8216.method27227(new Class1094(this, n5, (i == method27224 - 1) ? this.field25444 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n6 = j * n4;
                array3[j] = Class8216.method27227(new Class1478(this, n6, (j == method27224 - 1) ? this.field25444 : (n6 + n4), array, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n7 = n / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n8 = k * n7;
                array3[k] = Class8216.method27227(new Class1557(this, n8, (k == method27224 - 1) ? n : (n8 + n7), array, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            final int n9 = this.field25444 / method27224;
            for (int l = 0; l < method27224; ++l) {
                final int n10 = l * n9;
                array3[l] = Class8216.method27227(new Class1065(this, n10, (l == method27224 - 1) ? this.field25444 : (n10 + n9), n3, n2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (int n11 = 0; n11 < this.field25444; ++n11) {
                for (int n12 = 0; n12 < this.field25446; ++n12) {
                    this.field25456.method25945(array[n11][n12], b);
                }
            }
            for (int n13 = 0; n13 < this.field25444; ++n13) {
                for (int n14 = 0; n14 < this.field25448; ++n14) {
                    final int n15 = 2 * n14;
                    for (int n16 = 0; n16 < this.field25446; ++n16) {
                        final int n17 = 2 * n16;
                        array2[n17] = array[n13][n16][n15];
                        array2[n17 + 1] = array[n13][n16][n15 + 1];
                    }
                    this.field25455.method25929(array2, b);
                    for (int n18 = 0; n18 < this.field25446; ++n18) {
                        final int n19 = 2 * n18;
                        array[n13][n18][n15] = array2[n19];
                        array[n13][n18][n15 + 1] = array2[n19 + 1];
                    }
                }
            }
            final float[] array4 = new float[2 * this.field25444];
            for (int n20 = 0; n20 < n; ++n20) {
                for (int n21 = 0; n21 < this.field25448; ++n21) {
                    final int n22 = 2 * n21;
                    for (int n23 = 0; n23 < this.field25444; ++n23) {
                        final int n24 = 2 * n23;
                        array4[n24] = array[n23][n20][n22];
                        array4[n24 + 1] = array[n23][n20][n22 + 1];
                    }
                    this.field25454.method25929(array4, b);
                    for (int n25 = 0; n25 < this.field25444; ++n25) {
                        final int n26 = 2 * n25;
                        array[n25][n20][n22] = array4[n26];
                        array[n25][n20][n22 + 1] = array4[n26 + 1];
                    }
                }
            }
            for (int n27 = 0; n27 < this.field25444; ++n27) {
                final int n28 = (this.field25444 - n27) % this.field25444;
                for (int n29 = 1; n29 < n3; ++n29) {
                    final int n30 = this.field25446 - n29;
                    for (int n31 = 0; n31 < this.field25448; ++n31) {
                        final int n32 = 2 * n31;
                        final int n33 = n2 - n32;
                        array[n28][n30][n33 % n2] = array[n27][n29][n32];
                        array[n28][n30][(n33 + 1) % n2] = -array[n27][n29][n32 + 1];
                    }
                }
            }
        }
    }
    
    private void method18969(final float[] array) {
        final int n = 2 * this.field25448;
        final float[] array2 = new float[n];
        final int n2 = this.field25446 / 2 + 1;
        int n3;
        if (this.field25446 % 2 == 0) {
            n3 = this.field25446 / 2;
        }
        else {
            n3 = (this.field25446 + 1) / 2;
        }
        final int n4 = 2 * this.field25450;
        final int n5 = 2 * this.field25452;
        final int n6 = this.field25444 / 2;
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field25458 && n6 >= method27224 && this.field25448 >= method27224 && n2 >= method27224) {
            final Future[] array3 = new Future[method27224];
            final int n7 = n6 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n8 = this.field25444 - 1 - i * n7;
                array3[i] = Class8216.method27227(new Class1612(this, n, n8, (i == method27224 - 1) ? (n6 + 1) : (n8 - n7), n4, array, n5));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final float[][][] array4 = new float[n6 + 1][this.field25446][n];
            for (int j = 0; j < method27224; ++j) {
                final int n9 = j * n7;
                array3[j] = Class8216.method27227(new Class1319(this, n9, (j == method27224 - 1) ? (n6 + 1) : (n9 + n7), array, array4));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            for (int k = 0; k < method27224; ++k) {
                final int n10 = k * n7;
                array3[k] = Class8216.method27227(new Class1021(this, n10, (k == method27224 - 1) ? (n6 + 1) : (n10 + n7), n4, array4, array, n5, n));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            final int n11 = this.field25444 / method27224;
            for (int l = 0; l < method27224; ++l) {
                final int n12 = l * n11;
                array3[l] = Class8216.method27227(new Class1310(this, n12, (l == method27224 - 1) ? this.field25444 : (n12 + n11), n4, n5, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown8);
            }
            final int n13 = n2 / method27224;
            for (int n14 = 0; n14 < method27224; ++n14) {
                final int n15 = n14 * n13;
                array3[n14] = Class8216.method27227(new Class1566(this, n15, (n14 == method27224 - 1) ? n2 : (n15 + n13), n5, n4, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown9) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown9);
            }
            catch (final ExecutionException thrown10) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown10);
            }
            final int n16 = this.field25444 / method27224;
            for (int n17 = 0; n17 < method27224; ++n17) {
                final int n18 = n17 * n16;
                array3[n17] = Class8216.method27227(new Class1548(this, n18, (n17 == method27224 - 1) ? this.field25444 : (n18 + n16), n4, n3, n5, n, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown11) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown11);
            }
            catch (final ExecutionException thrown12) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown12);
            }
        }
        else {
            for (int n19 = this.field25444 - 1; n19 >= 0; --n19) {
                final int n20 = n19 * this.field25450;
                final int n21 = n19 * n4;
                for (int n22 = this.field25446 - 1; n22 >= 0; --n22) {
                    System.arraycopy(array, n20 + n22 * this.field25452, array2, 0, this.field25448);
                    this.field25456.method25937(array2);
                    System.arraycopy(array2, 0, array, n21 + n22 * n5, n);
                }
            }
            final float[] array5 = new float[2 * this.field25446];
            for (int n23 = 0; n23 < this.field25444; ++n23) {
                final int n24 = n23 * n4;
                for (int n25 = 0; n25 < this.field25448; ++n25) {
                    final int n26 = 2 * n25;
                    for (int n27 = 0; n27 < this.field25446; ++n27) {
                        final int n28 = 2 * n27;
                        final int n29 = n24 + n27 * n5 + n26;
                        array5[n28] = array[n29];
                        array5[n28 + 1] = array[n29 + 1];
                    }
                    this.field25455.method25925(array5);
                    for (int n30 = 0; n30 < this.field25446; ++n30) {
                        final int n31 = 2 * n30;
                        final int n32 = n24 + n30 * n5 + n26;
                        array[n32] = array5[n31];
                        array[n32 + 1] = array5[n31 + 1];
                    }
                }
            }
            final float[] array6 = new float[2 * this.field25444];
            for (int n33 = 0; n33 < n2; ++n33) {
                final int n34 = n33 * n5;
                for (int n35 = 0; n35 < this.field25448; ++n35) {
                    final int n36 = 2 * n35;
                    for (int n37 = 0; n37 < this.field25444; ++n37) {
                        final int n38 = 2 * n37;
                        final int n39 = n37 * n4 + n34 + n36;
                        array6[n38] = array[n39];
                        array6[n38 + 1] = array[n39 + 1];
                    }
                    this.field25454.method25925(array6);
                    for (int n40 = 0; n40 < this.field25444; ++n40) {
                        final int n41 = 2 * n40;
                        final int n42 = n40 * n4 + n34 + n36;
                        array[n42] = array6[n41];
                        array[n42 + 1] = array6[n41 + 1];
                    }
                }
            }
            for (int n43 = 0; n43 < this.field25444; ++n43) {
                final int n44 = (this.field25444 - n43) % this.field25444 * n4;
                final int n45 = n43 * n4;
                for (int n46 = 1; n46 < n3; ++n46) {
                    final int n47 = (this.field25446 - n46) * n5;
                    final int n48 = n46 * n5;
                    final int n49 = n44 + n47;
                    for (int n50 = 0; n50 < this.field25448; ++n50) {
                        final int n51 = 2 * n50;
                        final int n52 = n - n51;
                        final int n53 = n45 + n48 + n51;
                        array[n49 + n52 % n] = array[n53];
                        array[n49 + (n52 + 1) % n] = -array[n53 + 1];
                    }
                }
            }
        }
    }
    
    private void method18970(final Class22 class22) {
        final long n = 2L * this.field25449;
        final Class22 class23 = new Class22(n);
        final long n2 = this.field25447 / 2L + 1L;
        long n3;
        if (this.field25447 % 2L == 0L) {
            n3 = this.field25447 / 2L;
        }
        else {
            n3 = (this.field25447 + 1L) / 2L;
        }
        final long n4 = 2L * this.field25451;
        final long n5 = 2L * this.field25453;
        final long n6 = this.field25445 / 2L;
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field25458 && n6 >= method27224 && this.field25449 >= method27224 && n2 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n7 = n6 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n8 = this.field25445 - 1L - i * n7;
                array[i] = Class8216.method27227(new Class1522(this, n, n8, (i == method27224 - 1) ? (n6 + 1L) : (n8 - n7), n4, class22, n5));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final Class22 class24 = new Class22((n6 + 1L) * this.field25447 * n);
            for (int j = 0; j < method27224; ++j) {
                final long n9 = j * n7;
                array[j] = Class8216.method27227(new Class1441(this, n9, (j == method27224 - 1) ? (n6 + 1L) : (n9 + n7), class22, class24, n));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            for (int k = 0; k < method27224; ++k) {
                final long n10 = k * n7;
                array[k] = Class8216.method27227(new Class1649(this, n10, (k == method27224 - 1) ? (n6 + 1L) : (n10 + n7), n4, class24, n, class22, n5));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            final long n11 = this.field25445 / method27224;
            for (int l = 0; l < method27224; ++l) {
                final long n12 = l * n11;
                array[l] = Class8216.method27227(new Class1276(this, n12, (l == method27224 - 1) ? this.field25445 : (n12 + n11), n4, n5, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown8);
            }
            final long n13 = n2 / method27224;
            for (int n14 = 0; n14 < method27224; ++n14) {
                final long n15 = n14 * n13;
                array[n14] = Class8216.method27227(new Class1569(this, n15, (n14 == method27224 - 1) ? n2 : (n15 + n13), n5, n4, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown9) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown9);
            }
            catch (final ExecutionException thrown10) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown10);
            }
            final long n16 = this.field25445 / method27224;
            for (int n17 = 0; n17 < method27224; ++n17) {
                final long n18 = n17 * n16;
                array[n17] = Class8216.method27227(new Class1302(this, n18, (n17 == method27224 - 1) ? this.field25445 : (n18 + n16), n4, n3, n5, n, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown11) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown11);
            }
            catch (final ExecutionException thrown12) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown12);
            }
        }
        else {
            for (long n19 = this.field25445 - 1L; n19 >= 0L; --n19) {
                final long n20 = n19 * this.field25451;
                final long n21 = n19 * n4;
                for (long n22 = this.field25447 - 1L; n22 >= 0L; --n22) {
                    Class8601.method29152(class22, n20 + n22 * this.field25453, class23, 0L, this.field25449);
                    this.field25456.method25938(class23);
                    Class8601.method29152(class23, 0L, class22, n21 + n22 * n5, n);
                }
            }
            final Class22 class25 = new Class22(2L * this.field25447, false);
            for (long n23 = 0L; n23 < this.field25445; ++n23) {
                final long n24 = n23 * n4;
                for (long n25 = 0L; n25 < this.field25449; ++n25) {
                    final long n26 = 2L * n25;
                    for (long n27 = 0L; n27 < this.field25447; ++n27) {
                        final long n28 = 2L * n27;
                        final long n29 = n24 + n27 * n5 + n26;
                        class25.method169(n28, class22.method135(n29));
                        class25.method169(n28 + 1L, class22.method135(n29 + 1L));
                    }
                    this.field25455.method25926(class25);
                    for (long n30 = 0L; n30 < this.field25447; ++n30) {
                        final long n31 = 2L * n30;
                        final long n32 = n24 + n30 * n5 + n26;
                        class22.method169(n32, class25.method135(n31));
                        class22.method169(n32 + 1L, class25.method135(n31 + 1L));
                    }
                }
            }
            final Class22 class26 = new Class22(2L * this.field25445, false);
            for (long n33 = 0L; n33 < n2; ++n33) {
                final long n34 = n33 * n5;
                for (long n35 = 0L; n35 < this.field25449; ++n35) {
                    final long n36 = 2L * n35;
                    for (long n37 = 0L; n37 < this.field25445; ++n37) {
                        final long n38 = 2L * n37;
                        final long n39 = n37 * n4 + n34 + n36;
                        class26.method169(n38, class22.method135(n39));
                        class26.method169(n38 + 1L, class22.method135(n39 + 1L));
                    }
                    this.field25454.method25926(class26);
                    for (long n40 = 0L; n40 < this.field25445; ++n40) {
                        final long n41 = 2L * n40;
                        final long n42 = n40 * n4 + n34 + n36;
                        class22.method169(n42, class26.method135(n41));
                        class22.method169(n42 + 1L, class26.method135(n41 + 1L));
                    }
                }
            }
            for (long n43 = 0L; n43 < this.field25445; ++n43) {
                final long n44 = (this.field25445 - n43) % this.field25445 * n4;
                final long n45 = n43 * n4;
                for (long n46 = 1L; n46 < n3; ++n46) {
                    final long n47 = (this.field25447 - n46) * n5;
                    final long n48 = n46 * n5;
                    final long n49 = n44 + n47;
                    for (long n50 = 0L; n50 < this.field25449; ++n50) {
                        final long n51 = 2L * n50;
                        final long n52 = n - n51;
                        final long n53 = n45 + n48 + n51;
                        class22.method169(n49 + n52 % n, class22.method135(n53));
                        class22.method169(n49 + (n52 + 1L) % n, -class22.method135(n53 + 1L));
                    }
                }
            }
        }
    }
    
    private void method18971(final float[] array, final boolean b) {
        final int n = 2 * this.field25448;
        final float[] array2 = new float[n];
        final int n2 = this.field25446 / 2 + 1;
        int n3;
        if (this.field25446 % 2 == 0) {
            n3 = this.field25446 / 2;
        }
        else {
            n3 = (this.field25446 + 1) / 2;
        }
        final int n4 = 2 * this.field25450;
        final int n5 = 2 * this.field25452;
        final int n6 = this.field25444 / 2;
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field25458 && n6 >= method27224 && this.field25448 >= method27224 && n2 >= method27224) {
            final Future[] array3 = new Future[method27224];
            final int n7 = n6 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n8 = this.field25444 - 1 - i * n7;
                array3[i] = Class8216.method27227(new Class1399(this, n, n8, (i == method27224 - 1) ? (n6 + 1) : (n8 - n7), n4, array, b, n5));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final float[][][] array4 = new float[n6 + 1][this.field25446][n];
            for (int j = 0; j < method27224; ++j) {
                final int n9 = j * n7;
                array3[j] = Class8216.method27227(new Class970(this, n9, (j == method27224 - 1) ? (n6 + 1) : (n9 + n7), array, array4, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            for (int k = 0; k < method27224; ++k) {
                final int n10 = k * n7;
                array3[k] = Class8216.method27227(new Class1507(this, n10, (k == method27224 - 1) ? (n6 + 1) : (n10 + n7), n4, array4, array, n5, n));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            final int n11 = this.field25444 / method27224;
            for (int l = 0; l < method27224; ++l) {
                final int n12 = l * n11;
                array3[l] = Class8216.method27227(new Class1465(this, n12, (l == method27224 - 1) ? this.field25444 : (n12 + n11), n4, n5, array, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown8);
            }
            final int n13 = n2 / method27224;
            for (int n14 = 0; n14 < method27224; ++n14) {
                final int n15 = n14 * n13;
                array3[n14] = Class8216.method27227(new Class1509(this, n15, (n14 == method27224 - 1) ? n2 : (n15 + n13), n5, n4, array, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown9) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown9);
            }
            catch (final ExecutionException thrown10) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown10);
            }
            final int n16 = this.field25444 / method27224;
            for (int n17 = 0; n17 < method27224; ++n17) {
                final int n18 = n17 * n16;
                array3[n17] = Class8216.method27227(new Class946(this, n18, (n17 == method27224 - 1) ? this.field25444 : (n18 + n16), n4, n3, n5, n, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown11) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown11);
            }
            catch (final ExecutionException thrown12) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown12);
            }
        }
        else {
            for (int n19 = this.field25444 - 1; n19 >= 0; --n19) {
                final int n20 = n19 * this.field25450;
                final int n21 = n19 * n4;
                for (int n22 = this.field25446 - 1; n22 >= 0; --n22) {
                    System.arraycopy(array, n20 + n22 * this.field25452, array2, 0, this.field25448);
                    this.field25456.method25945(array2, b);
                    System.arraycopy(array2, 0, array, n21 + n22 * n5, n);
                }
            }
            final float[] array5 = new float[2 * this.field25446];
            for (int n23 = 0; n23 < this.field25444; ++n23) {
                final int n24 = n23 * n4;
                for (int n25 = 0; n25 < this.field25448; ++n25) {
                    final int n26 = 2 * n25;
                    for (int n27 = 0; n27 < this.field25446; ++n27) {
                        final int n28 = 2 * n27;
                        final int n29 = n24 + n27 * n5 + n26;
                        array5[n28] = array[n29];
                        array5[n28 + 1] = array[n29 + 1];
                    }
                    this.field25455.method25929(array5, b);
                    for (int n30 = 0; n30 < this.field25446; ++n30) {
                        final int n31 = 2 * n30;
                        final int n32 = n24 + n30 * n5 + n26;
                        array[n32] = array5[n31];
                        array[n32 + 1] = array5[n31 + 1];
                    }
                }
            }
            final float[] array6 = new float[2 * this.field25444];
            for (int n33 = 0; n33 < n2; ++n33) {
                final int n34 = n33 * n5;
                for (int n35 = 0; n35 < this.field25448; ++n35) {
                    final int n36 = 2 * n35;
                    for (int n37 = 0; n37 < this.field25444; ++n37) {
                        final int n38 = 2 * n37;
                        final int n39 = n37 * n4 + n34 + n36;
                        array6[n38] = array[n39];
                        array6[n38 + 1] = array[n39 + 1];
                    }
                    this.field25454.method25929(array6, b);
                    for (int n40 = 0; n40 < this.field25444; ++n40) {
                        final int n41 = 2 * n40;
                        final int n42 = n40 * n4 + n34 + n36;
                        array[n42] = array6[n41];
                        array[n42 + 1] = array6[n41 + 1];
                    }
                }
            }
            for (int n43 = 0; n43 < this.field25444; ++n43) {
                final int n44 = (this.field25444 - n43) % this.field25444 * n4;
                final int n45 = n43 * n4;
                for (int n46 = 1; n46 < n3; ++n46) {
                    final int n47 = (this.field25446 - n46) * n5;
                    final int n48 = n46 * n5;
                    final int n49 = n44 + n47;
                    for (int n50 = 0; n50 < this.field25448; ++n50) {
                        final int n51 = 2 * n50;
                        final int n52 = n - n51;
                        final int n53 = n45 + n48 + n51;
                        array[n49 + n52 % n] = array[n53];
                        array[n49 + (n52 + 1) % n] = -array[n53 + 1];
                    }
                }
            }
        }
    }
    
    private void method18972(final Class22 class22, final boolean b) {
        final long n = 2L * this.field25449;
        final Class22 class23 = new Class22(n);
        final long n2 = this.field25447 / 2L + 1L;
        long n3;
        if (this.field25447 % 2L == 0L) {
            n3 = this.field25447 / 2L;
        }
        else {
            n3 = (this.field25447 + 1L) / 2L;
        }
        final long n4 = 2L * this.field25451;
        final long n5 = 2L * this.field25453;
        final long n6 = this.field25445 / 2L;
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field25458 && n6 >= method27224 && this.field25449 >= method27224 && n2 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n7 = n6 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n8 = this.field25445 - 1L - i * n7;
                array[i] = Class8216.method27227(new Class1555(this, n, n8, (i == method27224 - 1) ? (n6 + 1L) : (n8 - n7), n4, class22, b, n5));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final Class22 class24 = new Class22((n6 + 1L) * this.field25447 * n);
            for (int j = 0; j < method27224; ++j) {
                final long n9 = j * n7;
                array[j] = Class8216.method27227(new Class1131(this, n9, (j == method27224 - 1) ? (n6 + 1L) : (n9 + n7), class22, class24, n, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            for (int k = 0; k < method27224; ++k) {
                final long n10 = k * n7;
                array[k] = Class8216.method27227(new Class1083(this, n10, (k == method27224 - 1) ? (n6 + 1L) : (n10 + n7), n4, class24, n, class22, n5));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            final long n11 = this.field25445 / method27224;
            for (int l = 0; l < method27224; ++l) {
                final long n12 = l * n11;
                array[l] = Class8216.method27227(new Class1532(this, n12, (l == method27224 - 1) ? this.field25445 : (n12 + n11), n4, n5, class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown8);
            }
            final long n13 = n2 / method27224;
            for (int n14 = 0; n14 < method27224; ++n14) {
                final long n15 = n14 * n13;
                array[n14] = Class8216.method27227(new Class1551(this, n15, (n14 == method27224 - 1) ? n2 : (n15 + n13), n5, n4, class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown9) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown9);
            }
            catch (final ExecutionException thrown10) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown10);
            }
            final long n16 = this.field25445 / method27224;
            for (int n17 = 0; n17 < method27224; ++n17) {
                final long n18 = n17 * n16;
                array[n17] = Class8216.method27227(new Class1394(this, n18, (n17 == method27224 - 1) ? this.field25445 : (n18 + n16), n4, n3, n5, n, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown11) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown11);
            }
            catch (final ExecutionException thrown12) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown12);
            }
        }
        else {
            for (long n19 = this.field25445 - 1L; n19 >= 0L; --n19) {
                final long n20 = n19 * this.field25451;
                final long n21 = n19 * n4;
                for (long n22 = this.field25447 - 1L; n22 >= 0L; --n22) {
                    Class8601.method29152(class22, n20 + n22 * this.field25453, class23, 0L, this.field25449);
                    this.field25456.method25946(class23, b);
                    Class8601.method29152(class23, 0L, class22, n21 + n22 * n5, n);
                }
            }
            final Class22 class25 = new Class22(2L * this.field25447, false);
            for (long n23 = 0L; n23 < this.field25445; ++n23) {
                final long n24 = n23 * n4;
                for (long n25 = 0L; n25 < this.field25449; ++n25) {
                    final long n26 = 2L * n25;
                    for (long n27 = 0L; n27 < this.field25447; ++n27) {
                        final long n28 = 2L * n27;
                        final long n29 = n24 + n27 * n5 + n26;
                        class25.method169(n28, class22.method135(n29));
                        class25.method169(n28 + 1L, class22.method135(n29 + 1L));
                    }
                    this.field25455.method25930(class25, b);
                    for (long n30 = 0L; n30 < this.field25447; ++n30) {
                        final long n31 = 2L * n30;
                        final long n32 = n24 + n30 * n5 + n26;
                        class22.method169(n32, class25.method135(n31));
                        class22.method169(n32 + 1L, class25.method135(n31 + 1L));
                    }
                }
            }
            final Class22 class26 = new Class22(2L * this.field25445, false);
            for (long n33 = 0L; n33 < n2; ++n33) {
                final long n34 = n33 * n5;
                for (long n35 = 0L; n35 < this.field25449; ++n35) {
                    final long n36 = 2L * n35;
                    for (long n37 = 0L; n37 < this.field25445; ++n37) {
                        final long n38 = 2L * n37;
                        final long n39 = n37 * n4 + n34 + n36;
                        class26.method169(n38, class22.method135(n39));
                        class26.method169(n38 + 1L, class22.method135(n39 + 1L));
                    }
                    this.field25454.method25930(class26, b);
                    for (long n40 = 0L; n40 < this.field25445; ++n40) {
                        final long n41 = 2L * n40;
                        final long n42 = n40 * n4 + n34 + n36;
                        class22.method169(n42, class26.method135(n41));
                        class22.method169(n42 + 1L, class26.method135(n41 + 1L));
                    }
                }
            }
            for (long n43 = 0L; n43 < this.field25445; ++n43) {
                final long n44 = (this.field25445 - n43) % this.field25445 * n4;
                final long n45 = n43 * n4;
                for (long n46 = 1L; n46 < n3; ++n46) {
                    final long n47 = (this.field25447 - n46) * n5;
                    final long n48 = n46 * n5;
                    final long n49 = n44 + n47;
                    for (long n50 = 0L; n50 < this.field25449; ++n50) {
                        final long n51 = 2L * n50;
                        final long n52 = n - n51;
                        final long n53 = n45 + n48 + n51;
                        class22.method169(n49 + n52 % n, class22.method135(n53));
                        class22.method169(n49 + (n52 + 1L) % n, -class22.method135(n53 + 1L));
                    }
                }
            }
        }
    }
    
    private void method18973(final int n, final int n2, final float[] array, final boolean b) {
        int n3 = this.field25444;
        if (n3 < this.field25446) {
            n3 = this.field25446;
        }
        int n4 = n3 * 8;
        if (this.field25448 != 4) {
            if (this.field25448 < 4) {
                n4 >>= 2;
            }
        }
        else {
            n4 >>= 1;
        }
        final float[] array2 = new float[n4];
        if (n2 != -1) {
            for (int i = 0; i < this.field25444; ++i) {
                final int n5 = i * this.field25450;
                if (n == 0) {
                    for (int j = 0; j < this.field25446; ++j) {
                        this.field25456.method25931(array, n5 + j * this.field25452, b);
                    }
                }
                if (this.field25448 <= 4) {
                    if (this.field25448 != 4) {
                        if (this.field25448 == 2) {
                            for (int k = 0; k < this.field25446; ++k) {
                                final int n6 = n5 + k * this.field25452;
                                final int n7 = 2 * k;
                                array2[n7] = array[n6];
                                array2[n7 + 1] = array[n6 + 1];
                            }
                            this.field25455.method25931(array2, 0, b);
                            for (int l = 0; l < this.field25446; ++l) {
                                final int n8 = n5 + l * this.field25452;
                                final int n9 = 2 * l;
                                array[n8] = array2[n9];
                                array[n8 + 1] = array2[n9 + 1];
                            }
                        }
                    }
                    else {
                        for (int n10 = 0; n10 < this.field25446; ++n10) {
                            final int n11 = n5 + n10 * this.field25452;
                            final int n12 = 2 * n10;
                            final int n13 = 2 * this.field25446 + 2 * n10;
                            array2[n12] = array[n11];
                            array2[n12 + 1] = array[n11 + 1];
                            array2[n13] = array[n11 + 2];
                            array2[n13 + 1] = array[n11 + 3];
                        }
                        this.field25455.method25931(array2, 0, b);
                        this.field25455.method25931(array2, 2 * this.field25446, b);
                        for (int n14 = 0; n14 < this.field25446; ++n14) {
                            final int n15 = n5 + n14 * this.field25452;
                            final int n16 = 2 * n14;
                            final int n17 = 2 * this.field25446 + 2 * n14;
                            array[n15] = array2[n16];
                            array[n15 + 1] = array2[n16 + 1];
                            array[n15 + 2] = array2[n17];
                            array[n15 + 3] = array2[n17 + 1];
                        }
                    }
                }
                else {
                    for (int n18 = 0; n18 < this.field25448; n18 += 8) {
                        for (int n19 = 0; n19 < this.field25446; ++n19) {
                            final int n20 = n5 + n19 * this.field25452 + n18;
                            final int n21 = 2 * n19;
                            final int n22 = 2 * this.field25446 + 2 * n19;
                            final int n23 = n22 + 2 * this.field25446;
                            final int n24 = n23 + 2 * this.field25446;
                            array2[n21] = array[n20];
                            array2[n21 + 1] = array[n20 + 1];
                            array2[n22] = array[n20 + 2];
                            array2[n22 + 1] = array[n20 + 3];
                            array2[n23] = array[n20 + 4];
                            array2[n23 + 1] = array[n20 + 5];
                            array2[n24] = array[n20 + 6];
                            array2[n24 + 1] = array[n20 + 7];
                        }
                        this.field25455.method25931(array2, 0, b);
                        this.field25455.method25931(array2, 2 * this.field25446, b);
                        this.field25455.method25931(array2, 4 * this.field25446, b);
                        this.field25455.method25931(array2, 6 * this.field25446, b);
                        for (int n25 = 0; n25 < this.field25446; ++n25) {
                            final int n26 = n5 + n25 * this.field25452 + n18;
                            final int n27 = 2 * n25;
                            final int n28 = 2 * this.field25446 + 2 * n25;
                            final int n29 = n28 + 2 * this.field25446;
                            final int n30 = n29 + 2 * this.field25446;
                            array[n26] = array2[n27];
                            array[n26 + 1] = array2[n27 + 1];
                            array[n26 + 2] = array2[n28];
                            array[n26 + 3] = array2[n28 + 1];
                            array[n26 + 4] = array2[n29];
                            array[n26 + 5] = array2[n29 + 1];
                            array[n26 + 6] = array2[n30];
                            array[n26 + 7] = array2[n30 + 1];
                        }
                    }
                }
                if (n != 0) {
                    for (int n31 = 0; n31 < this.field25446; ++n31) {
                        this.field25456.method25943(array, n5 + n31 * this.field25452, b);
                    }
                }
            }
        }
        else {
            for (int n32 = 0; n32 < this.field25444; ++n32) {
                final int n33 = n32 * this.field25450;
                if (n != 0) {
                    for (int n34 = 0; n34 < this.field25446; ++n34) {
                        this.field25456.method25935(array, n33 + n34 * this.field25452);
                    }
                }
                else {
                    for (int n35 = 0; n35 < this.field25446; ++n35) {
                        this.field25456.method25927(array, n33 + n35 * this.field25452);
                    }
                }
                if (this.field25448 <= 4) {
                    if (this.field25448 != 4) {
                        if (this.field25448 == 2) {
                            for (int n36 = 0; n36 < this.field25446; ++n36) {
                                final int n37 = n33 + n36 * this.field25452;
                                final int n38 = 2 * n36;
                                array2[n38] = array[n37];
                                array2[n38 + 1] = array[n37 + 1];
                            }
                            this.field25455.method25927(array2, 0);
                            for (int n39 = 0; n39 < this.field25446; ++n39) {
                                final int n40 = n33 + n39 * this.field25452;
                                final int n41 = 2 * n39;
                                array[n40] = array2[n41];
                                array[n40 + 1] = array2[n41 + 1];
                            }
                        }
                    }
                    else {
                        for (int n42 = 0; n42 < this.field25446; ++n42) {
                            final int n43 = n33 + n42 * this.field25452;
                            final int n44 = 2 * n42;
                            final int n45 = 2 * this.field25446 + 2 * n42;
                            array2[n44] = array[n43];
                            array2[n44 + 1] = array[n43 + 1];
                            array2[n45] = array[n43 + 2];
                            array2[n45 + 1] = array[n43 + 3];
                        }
                        this.field25455.method25927(array2, 0);
                        this.field25455.method25927(array2, 2 * this.field25446);
                        for (int n46 = 0; n46 < this.field25446; ++n46) {
                            final int n47 = n33 + n46 * this.field25452;
                            final int n48 = 2 * n46;
                            final int n49 = 2 * this.field25446 + 2 * n46;
                            array[n47] = array2[n48];
                            array[n47 + 1] = array2[n48 + 1];
                            array[n47 + 2] = array2[n49];
                            array[n47 + 3] = array2[n49 + 1];
                        }
                    }
                }
                else {
                    for (int n50 = 0; n50 < this.field25448; n50 += 8) {
                        for (int n51 = 0; n51 < this.field25446; ++n51) {
                            final int n52 = n33 + n51 * this.field25452 + n50;
                            final int n53 = 2 * n51;
                            final int n54 = 2 * this.field25446 + 2 * n51;
                            final int n55 = n54 + 2 * this.field25446;
                            final int n56 = n55 + 2 * this.field25446;
                            array2[n53] = array[n52];
                            array2[n53 + 1] = array[n52 + 1];
                            array2[n54] = array[n52 + 2];
                            array2[n54 + 1] = array[n52 + 3];
                            array2[n55] = array[n52 + 4];
                            array2[n55 + 1] = array[n52 + 5];
                            array2[n56] = array[n52 + 6];
                            array2[n56 + 1] = array[n52 + 7];
                        }
                        this.field25455.method25927(array2, 0);
                        this.field25455.method25927(array2, 2 * this.field25446);
                        this.field25455.method25927(array2, 4 * this.field25446);
                        this.field25455.method25927(array2, 6 * this.field25446);
                        for (int n57 = 0; n57 < this.field25446; ++n57) {
                            final int n58 = n33 + n57 * this.field25452 + n50;
                            final int n59 = 2 * n57;
                            final int n60 = 2 * this.field25446 + 2 * n57;
                            final int n61 = n60 + 2 * this.field25446;
                            final int n62 = n61 + 2 * this.field25446;
                            array[n58] = array2[n59];
                            array[n58 + 1] = array2[n59 + 1];
                            array[n58 + 2] = array2[n60];
                            array[n58 + 3] = array2[n60 + 1];
                            array[n58 + 4] = array2[n61];
                            array[n58 + 5] = array2[n61 + 1];
                            array[n58 + 6] = array2[n62];
                            array[n58 + 7] = array2[n62 + 1];
                        }
                    }
                }
            }
        }
    }
    
    private void method18974(final long n, final int n2, final Class22 class22, final boolean b) {
        long n3 = this.field25445;
        if (n3 < this.field25447) {
            n3 = this.field25447;
        }
        long n4 = n3 * 8L;
        if (this.field25449 != 4L) {
            if (this.field25449 < 4L) {
                n4 >>= 2;
            }
        }
        else {
            n4 >>= 1;
        }
        final Class22 class23 = new Class22(n4);
        if (n2 != -1) {
            for (long n5 = 0L; n5 < this.field25445; ++n5) {
                final long n6 = n5 * this.field25451;
                if (n == 0L) {
                    for (long n7 = 0L; n7 < this.field25447; ++n7) {
                        this.field25456.method25932(class22, n6 + n7 * this.field25453, b);
                    }
                }
                if (this.field25449 <= 4L) {
                    if (this.field25449 != 4L) {
                        if (this.field25449 == 2L) {
                            for (long n8 = 0L; n8 < this.field25447; ++n8) {
                                final long n9 = n6 + n8 * this.field25453;
                                final long n10 = 2L * n8;
                                class23.method169(n10, class22.method135(n9));
                                class23.method169(n10 + 1L, class22.method135(n9 + 1L));
                            }
                            this.field25455.method25932(class23, 0L, b);
                            for (long n11 = 0L; n11 < this.field25447; ++n11) {
                                final long n12 = n6 + n11 * this.field25453;
                                final long n13 = 2L * n11;
                                class22.method169(n12, class23.method135(n13));
                                class22.method169(n12 + 1L, class23.method135(n13 + 1L));
                            }
                        }
                    }
                    else {
                        for (long n14 = 0L; n14 < this.field25447; ++n14) {
                            final long n15 = n6 + n14 * this.field25453;
                            final long n16 = 2L * n14;
                            final long n17 = 2L * this.field25447 + 2L * n14;
                            class23.method169(n16, class22.method135(n15));
                            class23.method169(n16 + 1L, class22.method135(n15 + 1L));
                            class23.method169(n17, class22.method135(n15 + 2L));
                            class23.method169(n17 + 1L, class22.method135(n15 + 3L));
                        }
                        this.field25455.method25932(class23, 0L, b);
                        this.field25455.method25932(class23, 2L * this.field25447, b);
                        for (long n18 = 0L; n18 < this.field25447; ++n18) {
                            final long n19 = n6 + n18 * this.field25453;
                            final long n20 = 2L * n18;
                            final long n21 = 2L * this.field25447 + 2L * n18;
                            class22.method169(n19, class23.method135(n20));
                            class22.method169(n19 + 1L, class23.method135(n20 + 1L));
                            class22.method169(n19 + 2L, class23.method135(n21));
                            class22.method169(n19 + 3L, class23.method135(n21 + 1L));
                        }
                    }
                }
                else {
                    for (long n22 = 0L; n22 < this.field25449; n22 += 8L) {
                        for (long n23 = 0L; n23 < this.field25447; ++n23) {
                            final long n24 = n6 + n23 * this.field25453 + n22;
                            final long n25 = 2L * n23;
                            final long n26 = 2L * this.field25447 + 2L * n23;
                            final long n27 = n26 + 2L * this.field25447;
                            final long n28 = n27 + 2L * this.field25447;
                            class23.method169(n25, class22.method135(n24));
                            class23.method169(n25 + 1L, class22.method135(n24 + 1L));
                            class23.method169(n26, class22.method135(n24 + 2L));
                            class23.method169(n26 + 1L, class22.method135(n24 + 3L));
                            class23.method169(n27, class22.method135(n24 + 4L));
                            class23.method169(n27 + 1L, class22.method135(n24 + 5L));
                            class23.method169(n28, class22.method135(n24 + 6L));
                            class23.method169(n28 + 1L, class22.method135(n24 + 7L));
                        }
                        this.field25455.method25932(class23, 0L, b);
                        this.field25455.method25932(class23, 2L * this.field25447, b);
                        this.field25455.method25932(class23, 4L * this.field25447, b);
                        this.field25455.method25932(class23, 6L * this.field25447, b);
                        for (long n29 = 0L; n29 < this.field25447; ++n29) {
                            final long n30 = n6 + n29 * this.field25453 + n22;
                            final long n31 = 2L * n29;
                            final long n32 = 2L * this.field25447 + 2L * n29;
                            final long n33 = n32 + 2L * this.field25447;
                            final long n34 = n33 + 2L * this.field25447;
                            class22.method169(n30, class23.method135(n31));
                            class22.method169(n30 + 1L, class23.method135(n31 + 1L));
                            class22.method169(n30 + 2L, class23.method135(n32));
                            class22.method169(n30 + 3L, class23.method135(n32 + 1L));
                            class22.method169(n30 + 4L, class23.method135(n33));
                            class22.method169(n30 + 5L, class23.method135(n33 + 1L));
                            class22.method169(n30 + 6L, class23.method135(n34));
                            class22.method169(n30 + 7L, class23.method135(n34 + 1L));
                        }
                    }
                }
                if (n != 0L) {
                    for (long n35 = 0L; n35 < this.field25447; ++n35) {
                        this.field25456.method25944(class22, n6 + n35 * this.field25453, b);
                    }
                }
            }
        }
        else {
            for (long n36 = 0L; n36 < this.field25445; ++n36) {
                final long n37 = n36 * this.field25451;
                if (n != 0L) {
                    for (long n38 = 0L; n38 < this.field25447; ++n38) {
                        this.field25456.method25936(class22, n37 + n38 * this.field25453);
                    }
                }
                else {
                    for (long n39 = 0L; n39 < this.field25447; ++n39) {
                        this.field25456.method25928(class22, n37 + n39 * this.field25453);
                    }
                }
                if (this.field25449 <= 4L) {
                    if (this.field25449 != 4L) {
                        if (this.field25449 == 2L) {
                            for (long n40 = 0L; n40 < this.field25447; ++n40) {
                                final long n41 = n37 + n40 * this.field25453;
                                final long n42 = 2L * n40;
                                class23.method169(n42, class22.method135(n41));
                                class23.method169(n42 + 1L, class22.method135(n41 + 1L));
                            }
                            this.field25455.method25928(class23, 0L);
                            for (long n43 = 0L; n43 < this.field25447; ++n43) {
                                final long n44 = n37 + n43 * this.field25453;
                                final long n45 = 2L * n43;
                                class22.method169(n44, class23.method135(n45));
                                class22.method169(n44 + 1L, class23.method135(n45 + 1L));
                            }
                        }
                    }
                    else {
                        for (long n46 = 0L; n46 < this.field25447; ++n46) {
                            final long n47 = n37 + n46 * this.field25453;
                            final long n48 = 2L * n46;
                            final long n49 = 2L * this.field25447 + 2L * n46;
                            class23.method169(n48, class22.method135(n47));
                            class23.method169(n48 + 1L, class22.method135(n47 + 1L));
                            class23.method169(n49, class22.method135(n47 + 2L));
                            class23.method169(n49 + 1L, class22.method135(n47 + 3L));
                        }
                        this.field25455.method25928(class23, 0L);
                        this.field25455.method25928(class23, 2L * this.field25447);
                        for (long n50 = 0L; n50 < this.field25447; ++n50) {
                            final long n51 = n37 + n50 * this.field25453;
                            final long n52 = 2L * n50;
                            final long n53 = 2L * this.field25447 + 2L * n50;
                            class22.method169(n51, class23.method135(n52));
                            class22.method169(n51 + 1L, class23.method135(n52 + 1L));
                            class22.method169(n51 + 2L, class23.method135(n53));
                            class22.method169(n51 + 3L, class23.method135(n53 + 1L));
                        }
                    }
                }
                else {
                    for (long n54 = 0L; n54 < this.field25449; n54 += 8L) {
                        for (long n55 = 0L; n55 < this.field25447; ++n55) {
                            final long n56 = n37 + n55 * this.field25453 + n54;
                            final long n57 = 2L * n55;
                            final long n58 = 2L * this.field25447 + 2L * n55;
                            final long n59 = n58 + 2L * this.field25447;
                            final long n60 = n59 + 2L * this.field25447;
                            class23.method169(n57, class22.method135(n56));
                            class23.method169(n57 + 1L, class22.method135(n56 + 1L));
                            class23.method169(n58, class22.method135(n56 + 2L));
                            class23.method169(n58 + 1L, class22.method135(n56 + 3L));
                            class23.method169(n59, class22.method135(n56 + 4L));
                            class23.method169(n59 + 1L, class22.method135(n56 + 5L));
                            class23.method169(n60, class22.method135(n56 + 6L));
                            class23.method169(n60 + 1L, class22.method135(n56 + 7L));
                        }
                        this.field25455.method25928(class23, 0L);
                        this.field25455.method25928(class23, 2L * this.field25447);
                        this.field25455.method25928(class23, 4L * this.field25447);
                        this.field25455.method25928(class23, 6L * this.field25447);
                        for (long n61 = 0L; n61 < this.field25447; ++n61) {
                            final long n62 = n37 + n61 * this.field25453 + n54;
                            final long n63 = 2L * n61;
                            final long n64 = 2L * this.field25447 + 2L * n61;
                            final long n65 = n64 + 2L * this.field25447;
                            final long n66 = n65 + 2L * this.field25447;
                            class22.method169(n62, class23.method135(n63));
                            class22.method169(n62 + 1L, class23.method135(n63 + 1L));
                            class22.method169(n62 + 2L, class23.method135(n64));
                            class22.method169(n62 + 3L, class23.method135(n64 + 1L));
                            class22.method169(n62 + 4L, class23.method135(n65));
                            class22.method169(n62 + 5L, class23.method135(n65 + 1L));
                            class22.method169(n62 + 6L, class23.method135(n66));
                            class22.method169(n62 + 7L, class23.method135(n66 + 1L));
                        }
                    }
                }
            }
        }
    }
    
    private void method18975(final int n, final int n2, final float[] array, final boolean b) {
        int n3 = this.field25444;
        if (n3 < this.field25446) {
            n3 = this.field25446;
        }
        int n4 = n3 * 8;
        if (this.field25448 != 4) {
            if (this.field25448 < 4) {
                n4 >>= 2;
            }
        }
        else {
            n4 >>= 1;
        }
        final float[] array2 = new float[n4];
        if (n2 != -1) {
            for (int i = 0; i < this.field25444; ++i) {
                final int n5 = i * this.field25450;
                if (n != 0) {
                    for (int j = 0; j < this.field25446; ++j) {
                        this.field25456.method25949(array, n5 + j * this.field25452, b);
                    }
                }
                else {
                    for (int k = 0; k < this.field25446; ++k) {
                        this.field25456.method25931(array, n5 + k * this.field25452, b);
                    }
                }
                if (this.field25448 <= 4) {
                    if (this.field25448 != 4) {
                        if (this.field25448 == 2) {
                            for (int l = 0; l < this.field25446; ++l) {
                                final int n6 = n5 + l * this.field25452;
                                final int n7 = 2 * l;
                                array2[n7] = array[n6];
                                array2[n7 + 1] = array[n6 + 1];
                            }
                            this.field25455.method25931(array2, 0, b);
                            for (int n8 = 0; n8 < this.field25446; ++n8) {
                                final int n9 = n5 + n8 * this.field25452;
                                final int n10 = 2 * n8;
                                array[n9] = array2[n10];
                                array[n9 + 1] = array2[n10 + 1];
                            }
                        }
                    }
                    else {
                        for (int n11 = 0; n11 < this.field25446; ++n11) {
                            final int n12 = n5 + n11 * this.field25452;
                            final int n13 = 2 * n11;
                            final int n14 = 2 * this.field25446 + 2 * n11;
                            array2[n13] = array[n12];
                            array2[n13 + 1] = array[n12 + 1];
                            array2[n14] = array[n12 + 2];
                            array2[n14 + 1] = array[n12 + 3];
                        }
                        this.field25455.method25931(array2, 0, b);
                        this.field25455.method25931(array2, 2 * this.field25446, b);
                        for (int n15 = 0; n15 < this.field25446; ++n15) {
                            final int n16 = n5 + n15 * this.field25452;
                            final int n17 = 2 * n15;
                            final int n18 = 2 * this.field25446 + 2 * n15;
                            array[n16] = array2[n17];
                            array[n16 + 1] = array2[n17 + 1];
                            array[n16 + 2] = array2[n18];
                            array[n16 + 3] = array2[n18 + 1];
                        }
                    }
                }
                else {
                    for (int n19 = 0; n19 < this.field25448; n19 += 8) {
                        for (int n20 = 0; n20 < this.field25446; ++n20) {
                            final int n21 = n5 + n20 * this.field25452 + n19;
                            final int n22 = 2 * n20;
                            final int n23 = 2 * this.field25446 + 2 * n20;
                            final int n24 = n23 + 2 * this.field25446;
                            final int n25 = n24 + 2 * this.field25446;
                            array2[n22] = array[n21];
                            array2[n22 + 1] = array[n21 + 1];
                            array2[n23] = array[n21 + 2];
                            array2[n23 + 1] = array[n21 + 3];
                            array2[n24] = array[n21 + 4];
                            array2[n24 + 1] = array[n21 + 5];
                            array2[n25] = array[n21 + 6];
                            array2[n25 + 1] = array[n21 + 7];
                        }
                        this.field25455.method25931(array2, 0, b);
                        this.field25455.method25931(array2, 2 * this.field25446, b);
                        this.field25455.method25931(array2, 4 * this.field25446, b);
                        this.field25455.method25931(array2, 6 * this.field25446, b);
                        for (int n26 = 0; n26 < this.field25446; ++n26) {
                            final int n27 = n5 + n26 * this.field25452 + n19;
                            final int n28 = 2 * n26;
                            final int n29 = 2 * this.field25446 + 2 * n26;
                            final int n30 = n29 + 2 * this.field25446;
                            final int n31 = n30 + 2 * this.field25446;
                            array[n27] = array2[n28];
                            array[n27 + 1] = array2[n28 + 1];
                            array[n27 + 2] = array2[n29];
                            array[n27 + 3] = array2[n29 + 1];
                            array[n27 + 4] = array2[n30];
                            array[n27 + 5] = array2[n30 + 1];
                            array[n27 + 6] = array2[n31];
                            array[n27 + 7] = array2[n31 + 1];
                        }
                    }
                }
            }
        }
        else {
            for (int n32 = 0; n32 < this.field25444; ++n32) {
                final int n33 = n32 * this.field25450;
                if (n != 0) {
                    for (int n34 = 0; n34 < this.field25446; ++n34) {
                        this.field25456.method25935(array, n33 + n34 * this.field25452);
                    }
                }
                else {
                    for (int n35 = 0; n35 < this.field25446; ++n35) {
                        this.field25456.method25927(array, n33 + n35 * this.field25452);
                    }
                }
                if (this.field25448 <= 4) {
                    if (this.field25448 != 4) {
                        if (this.field25448 == 2) {
                            for (int n36 = 0; n36 < this.field25446; ++n36) {
                                final int n37 = n33 + n36 * this.field25452;
                                final int n38 = 2 * n36;
                                array2[n38] = array[n37];
                                array2[n38 + 1] = array[n37 + 1];
                            }
                            this.field25455.method25927(array2, 0);
                            for (int n39 = 0; n39 < this.field25446; ++n39) {
                                final int n40 = n33 + n39 * this.field25452;
                                final int n41 = 2 * n39;
                                array[n40] = array2[n41];
                                array[n40 + 1] = array2[n41 + 1];
                            }
                        }
                    }
                    else {
                        for (int n42 = 0; n42 < this.field25446; ++n42) {
                            final int n43 = n33 + n42 * this.field25452;
                            final int n44 = 2 * n42;
                            final int n45 = 2 * this.field25446 + 2 * n42;
                            array2[n44] = array[n43];
                            array2[n44 + 1] = array[n43 + 1];
                            array2[n45] = array[n43 + 2];
                            array2[n45 + 1] = array[n43 + 3];
                        }
                        this.field25455.method25927(array2, 0);
                        this.field25455.method25927(array2, 2 * this.field25446);
                        for (int n46 = 0; n46 < this.field25446; ++n46) {
                            final int n47 = n33 + n46 * this.field25452;
                            final int n48 = 2 * n46;
                            final int n49 = 2 * this.field25446 + 2 * n46;
                            array[n47] = array2[n48];
                            array[n47 + 1] = array2[n48 + 1];
                            array[n47 + 2] = array2[n49];
                            array[n47 + 3] = array2[n49 + 1];
                        }
                    }
                }
                else {
                    for (int n50 = 0; n50 < this.field25448; n50 += 8) {
                        for (int n51 = 0; n51 < this.field25446; ++n51) {
                            final int n52 = n33 + n51 * this.field25452 + n50;
                            final int n53 = 2 * n51;
                            final int n54 = 2 * this.field25446 + 2 * n51;
                            final int n55 = n54 + 2 * this.field25446;
                            final int n56 = n55 + 2 * this.field25446;
                            array2[n53] = array[n52];
                            array2[n53 + 1] = array[n52 + 1];
                            array2[n54] = array[n52 + 2];
                            array2[n54 + 1] = array[n52 + 3];
                            array2[n55] = array[n52 + 4];
                            array2[n55 + 1] = array[n52 + 5];
                            array2[n56] = array[n52 + 6];
                            array2[n56 + 1] = array[n52 + 7];
                        }
                        this.field25455.method25927(array2, 0);
                        this.field25455.method25927(array2, 2 * this.field25446);
                        this.field25455.method25927(array2, 4 * this.field25446);
                        this.field25455.method25927(array2, 6 * this.field25446);
                        for (int n57 = 0; n57 < this.field25446; ++n57) {
                            final int n58 = n33 + n57 * this.field25452 + n50;
                            final int n59 = 2 * n57;
                            final int n60 = 2 * this.field25446 + 2 * n57;
                            final int n61 = n60 + 2 * this.field25446;
                            final int n62 = n61 + 2 * this.field25446;
                            array[n58] = array2[n59];
                            array[n58 + 1] = array2[n59 + 1];
                            array[n58 + 2] = array2[n60];
                            array[n58 + 3] = array2[n60 + 1];
                            array[n58 + 4] = array2[n61];
                            array[n58 + 5] = array2[n61 + 1];
                            array[n58 + 6] = array2[n62];
                            array[n58 + 7] = array2[n62 + 1];
                        }
                    }
                }
            }
        }
    }
    
    private void method18976(final long n, final int n2, final Class22 class22, final boolean b) {
        long n3 = this.field25445;
        if (n3 < this.field25447) {
            n3 = this.field25447;
        }
        long n4 = n3 * 8L;
        if (this.field25449 != 4L) {
            if (this.field25449 < 4L) {
                n4 >>= 2;
            }
        }
        else {
            n4 >>= 1;
        }
        final Class22 class23 = new Class22(n4);
        if (n2 != -1) {
            for (long n5 = 0L; n5 < this.field25445; ++n5) {
                final long n6 = n5 * this.field25451;
                if (n != 0L) {
                    for (long n7 = 0L; n7 < this.field25447; ++n7) {
                        this.field25456.method25950(class22, n6 + n7 * this.field25453, b);
                    }
                }
                else {
                    for (long n8 = 0L; n8 < this.field25447; ++n8) {
                        this.field25456.method25932(class22, n6 + n8 * this.field25453, b);
                    }
                }
                if (this.field25449 <= 4L) {
                    if (this.field25449 != 4L) {
                        if (this.field25449 == 2L) {
                            for (long n9 = 0L; n9 < this.field25447; ++n9) {
                                final long n10 = n6 + n9 * this.field25453;
                                final long n11 = 2L * n9;
                                class23.method169(n11, class22.method135(n10));
                                class23.method169(n11 + 1L, class22.method135(n10 + 1L));
                            }
                            this.field25455.method25932(class23, 0L, b);
                            for (long n12 = 0L; n12 < this.field25447; ++n12) {
                                final long n13 = n6 + n12 * this.field25453;
                                final long n14 = 2L * n12;
                                class22.method169(n13, class23.method135(n14));
                                class22.method169(n13 + 1L, class23.method135(n14 + 1L));
                            }
                        }
                    }
                    else {
                        for (long n15 = 0L; n15 < this.field25447; ++n15) {
                            final long n16 = n6 + n15 * this.field25453;
                            final long n17 = 2L * n15;
                            final long n18 = 2L * this.field25447 + 2L * n15;
                            class23.method169(n17, class22.method135(n16));
                            class23.method169(n17 + 1L, class22.method135(n16 + 1L));
                            class23.method169(n18, class22.method135(n16 + 2L));
                            class23.method169(n18 + 1L, class22.method135(n16 + 3L));
                        }
                        this.field25455.method25932(class23, 0L, b);
                        this.field25455.method25932(class23, 2L * this.field25447, b);
                        for (long n19 = 0L; n19 < this.field25447; ++n19) {
                            final long n20 = n6 + n19 * this.field25453;
                            final long n21 = 2L * n19;
                            final long n22 = 2L * this.field25447 + 2L * n19;
                            class22.method169(n20, class23.method135(n21));
                            class22.method169(n20 + 1L, class23.method135(n21 + 1L));
                            class22.method169(n20 + 2L, class23.method135(n22));
                            class22.method169(n20 + 3L, class23.method135(n22 + 1L));
                        }
                    }
                }
                else {
                    for (long n23 = 0L; n23 < this.field25449; n23 += 8L) {
                        for (long n24 = 0L; n24 < this.field25447; ++n24) {
                            final long n25 = n6 + n24 * this.field25453 + n23;
                            final long n26 = 2L * n24;
                            final long n27 = 2L * this.field25447 + 2L * n24;
                            final long n28 = n27 + 2L * this.field25447;
                            final long n29 = n28 + 2L * this.field25447;
                            class23.method169(n26, class22.method135(n25));
                            class23.method169(n26 + 1L, class22.method135(n25 + 1L));
                            class23.method169(n27, class22.method135(n25 + 2L));
                            class23.method169(n27 + 1L, class22.method135(n25 + 3L));
                            class23.method169(n28, class22.method135(n25 + 4L));
                            class23.method169(n28 + 1L, class22.method135(n25 + 5L));
                            class23.method169(n29, class22.method135(n25 + 6L));
                            class23.method169(n29 + 1L, class22.method135(n25 + 7L));
                        }
                        this.field25455.method25932(class23, 0L, b);
                        this.field25455.method25932(class23, 2L * this.field25447, b);
                        this.field25455.method25932(class23, 4L * this.field25447, b);
                        this.field25455.method25932(class23, 6L * this.field25447, b);
                        for (long n30 = 0L; n30 < this.field25447; ++n30) {
                            final long n31 = n6 + n30 * this.field25453 + n23;
                            final long n32 = 2L * n30;
                            final long n33 = 2L * this.field25447 + 2L * n30;
                            final long n34 = n33 + 2L * this.field25447;
                            final long n35 = n34 + 2L * this.field25447;
                            class22.method169(n31, class23.method135(n32));
                            class22.method169(n31 + 1L, class23.method135(n32 + 1L));
                            class22.method169(n31 + 2L, class23.method135(n33));
                            class22.method169(n31 + 3L, class23.method135(n33 + 1L));
                            class22.method169(n31 + 4L, class23.method135(n34));
                            class22.method169(n31 + 5L, class23.method135(n34 + 1L));
                            class22.method169(n31 + 6L, class23.method135(n35));
                            class22.method169(n31 + 7L, class23.method135(n35 + 1L));
                        }
                    }
                }
            }
        }
        else {
            for (long n36 = 0L; n36 < this.field25445; ++n36) {
                final long n37 = n36 * this.field25451;
                if (n != 0L) {
                    for (long n38 = 0L; n38 < this.field25447; ++n38) {
                        this.field25456.method25936(class22, n37 + n38 * this.field25453);
                    }
                }
                else {
                    for (long n39 = 0L; n39 < this.field25447; ++n39) {
                        this.field25456.method25928(class22, n37 + n39 * this.field25453);
                    }
                }
                if (this.field25449 <= 4L) {
                    if (this.field25449 != 4L) {
                        if (this.field25449 == 2L) {
                            for (long n40 = 0L; n40 < this.field25447; ++n40) {
                                final long n41 = n37 + n40 * this.field25453;
                                final long n42 = 2L * n40;
                                class23.method169(n42, class22.method135(n41));
                                class23.method169(n42 + 1L, class22.method135(n41 + 1L));
                            }
                            this.field25455.method25928(class23, 0L);
                            for (long n43 = 0L; n43 < this.field25447; ++n43) {
                                final long n44 = n37 + n43 * this.field25453;
                                final long n45 = 2L * n43;
                                class22.method169(n44, class23.method135(n45));
                                class22.method169(n44 + 1L, class23.method135(n45 + 1L));
                            }
                        }
                    }
                    else {
                        for (long n46 = 0L; n46 < this.field25447; ++n46) {
                            final long n47 = n37 + n46 * this.field25453;
                            final long n48 = 2L * n46;
                            final long n49 = 2L * this.field25447 + 2L * n46;
                            class23.method169(n48, class22.method135(n47));
                            class23.method169(n48 + 1L, class22.method135(n47 + 1L));
                            class23.method169(n49, class22.method135(n47 + 2L));
                            class23.method169(n49 + 1L, class22.method135(n47 + 3L));
                        }
                        this.field25455.method25928(class23, 0L);
                        this.field25455.method25928(class23, 2L * this.field25447);
                        for (long n50 = 0L; n50 < this.field25447; ++n50) {
                            final long n51 = n37 + n50 * this.field25453;
                            final long n52 = 2L * n50;
                            final long n53 = 2L * this.field25447 + 2L * n50;
                            class22.method169(n51, class23.method135(n52));
                            class22.method169(n51 + 1L, class23.method135(n52 + 1L));
                            class22.method169(n51 + 2L, class23.method135(n53));
                            class22.method169(n51 + 3L, class23.method135(n53 + 1L));
                        }
                    }
                }
                else {
                    for (long n54 = 0L; n54 < this.field25449; n54 += 8L) {
                        for (long n55 = 0L; n55 < this.field25447; ++n55) {
                            final long n56 = n37 + n55 * this.field25453 + n54;
                            final long n57 = 2L * n55;
                            final long n58 = 2L * this.field25447 + 2L * n55;
                            final long n59 = n58 + 2L * this.field25447;
                            final long n60 = n59 + 2L * this.field25447;
                            class23.method169(n57, class22.method135(n56));
                            class23.method169(n57 + 1L, class22.method135(n56 + 1L));
                            class23.method169(n58, class22.method135(n56 + 2L));
                            class23.method169(n58 + 1L, class22.method135(n56 + 3L));
                            class23.method169(n59, class22.method135(n56 + 4L));
                            class23.method169(n59 + 1L, class22.method135(n56 + 5L));
                            class23.method169(n60, class22.method135(n56 + 6L));
                            class23.method169(n60 + 1L, class22.method135(n56 + 7L));
                        }
                        this.field25455.method25928(class23, 0L);
                        this.field25455.method25928(class23, 2L * this.field25447);
                        this.field25455.method25928(class23, 4L * this.field25447);
                        this.field25455.method25928(class23, 6L * this.field25447);
                        for (long n61 = 0L; n61 < this.field25447; ++n61) {
                            final long n62 = n37 + n61 * this.field25453 + n54;
                            final long n63 = 2L * n61;
                            final long n64 = 2L * this.field25447 + 2L * n61;
                            final long n65 = n64 + 2L * this.field25447;
                            final long n66 = n65 + 2L * this.field25447;
                            class22.method169(n62, class23.method135(n63));
                            class22.method169(n62 + 1L, class23.method135(n63 + 1L));
                            class22.method169(n62 + 2L, class23.method135(n64));
                            class22.method169(n62 + 3L, class23.method135(n64 + 1L));
                            class22.method169(n62 + 4L, class23.method135(n65));
                            class22.method169(n62 + 5L, class23.method135(n65 + 1L));
                            class22.method169(n62 + 6L, class23.method135(n66));
                            class22.method169(n62 + 7L, class23.method135(n66 + 1L));
                        }
                    }
                }
            }
        }
    }
    
    private void method18977(final int n, final int n2, final float[][][] array, final boolean b) {
        int n3 = this.field25444;
        if (n3 < this.field25446) {
            n3 = this.field25446;
        }
        int n4 = n3 * 8;
        if (this.field25448 != 4) {
            if (this.field25448 < 4) {
                n4 >>= 2;
            }
        }
        else {
            n4 >>= 1;
        }
        final float[] array2 = new float[n4];
        if (n2 != -1) {
            for (int i = 0; i < this.field25444; ++i) {
                if (n == 0) {
                    for (int j = 0; j < this.field25446; ++j) {
                        this.field25456.method25929(array[i][j], b);
                    }
                }
                if (this.field25448 <= 4) {
                    if (this.field25448 != 4) {
                        if (this.field25448 == 2) {
                            for (int k = 0; k < this.field25446; ++k) {
                                final int n5 = 2 * k;
                                array2[n5] = array[i][k][0];
                                array2[n5 + 1] = array[i][k][1];
                            }
                            this.field25455.method25931(array2, 0, b);
                            for (int l = 0; l < this.field25446; ++l) {
                                final int n6 = 2 * l;
                                array[i][l][0] = array2[n6];
                                array[i][l][1] = array2[n6 + 1];
                            }
                        }
                    }
                    else {
                        for (int n7 = 0; n7 < this.field25446; ++n7) {
                            final int n8 = 2 * n7;
                            final int n9 = 2 * this.field25446 + 2 * n7;
                            array2[n8] = array[i][n7][0];
                            array2[n8 + 1] = array[i][n7][1];
                            array2[n9] = array[i][n7][2];
                            array2[n9 + 1] = array[i][n7][3];
                        }
                        this.field25455.method25931(array2, 0, b);
                        this.field25455.method25931(array2, 2 * this.field25446, b);
                        for (int n10 = 0; n10 < this.field25446; ++n10) {
                            final int n11 = 2 * n10;
                            final int n12 = 2 * this.field25446 + 2 * n10;
                            array[i][n10][0] = array2[n11];
                            array[i][n10][1] = array2[n11 + 1];
                            array[i][n10][2] = array2[n12];
                            array[i][n10][3] = array2[n12 + 1];
                        }
                    }
                }
                else {
                    for (int n13 = 0; n13 < this.field25448; n13 += 8) {
                        for (int n14 = 0; n14 < this.field25446; ++n14) {
                            final int n15 = 2 * n14;
                            final int n16 = 2 * this.field25446 + 2 * n14;
                            final int n17 = n16 + 2 * this.field25446;
                            final int n18 = n17 + 2 * this.field25446;
                            array2[n15] = array[i][n14][n13];
                            array2[n15 + 1] = array[i][n14][n13 + 1];
                            array2[n16] = array[i][n14][n13 + 2];
                            array2[n16 + 1] = array[i][n14][n13 + 3];
                            array2[n17] = array[i][n14][n13 + 4];
                            array2[n17 + 1] = array[i][n14][n13 + 5];
                            array2[n18] = array[i][n14][n13 + 6];
                            array2[n18 + 1] = array[i][n14][n13 + 7];
                        }
                        this.field25455.method25931(array2, 0, b);
                        this.field25455.method25931(array2, 2 * this.field25446, b);
                        this.field25455.method25931(array2, 4 * this.field25446, b);
                        this.field25455.method25931(array2, 6 * this.field25446, b);
                        for (int n19 = 0; n19 < this.field25446; ++n19) {
                            final int n20 = 2 * n19;
                            final int n21 = 2 * this.field25446 + 2 * n19;
                            final int n22 = n21 + 2 * this.field25446;
                            final int n23 = n22 + 2 * this.field25446;
                            array[i][n19][n13] = array2[n20];
                            array[i][n19][n13 + 1] = array2[n20 + 1];
                            array[i][n19][n13 + 2] = array2[n21];
                            array[i][n19][n13 + 3] = array2[n21 + 1];
                            array[i][n19][n13 + 4] = array2[n22];
                            array[i][n19][n13 + 5] = array2[n22 + 1];
                            array[i][n19][n13 + 6] = array2[n23];
                            array[i][n19][n13 + 7] = array2[n23 + 1];
                        }
                    }
                }
                if (n != 0) {
                    for (int n24 = 0; n24 < this.field25446; ++n24) {
                        this.field25456.method25941(array[i][n24], b);
                    }
                }
            }
        }
        else {
            for (int n25 = 0; n25 < this.field25444; ++n25) {
                if (n != 0) {
                    for (int n26 = 0; n26 < this.field25446; ++n26) {
                        this.field25456.method25935(array[n25][n26], 0);
                    }
                }
                else {
                    for (int n27 = 0; n27 < this.field25446; ++n27) {
                        this.field25456.method25925(array[n25][n27]);
                    }
                }
                if (this.field25448 <= 4) {
                    if (this.field25448 != 4) {
                        if (this.field25448 == 2) {
                            for (int n28 = 0; n28 < this.field25446; ++n28) {
                                final int n29 = 2 * n28;
                                array2[n29] = array[n25][n28][0];
                                array2[n29 + 1] = array[n25][n28][1];
                            }
                            this.field25455.method25927(array2, 0);
                            for (int n30 = 0; n30 < this.field25446; ++n30) {
                                final int n31 = 2 * n30;
                                array[n25][n30][0] = array2[n31];
                                array[n25][n30][1] = array2[n31 + 1];
                            }
                        }
                    }
                    else {
                        for (int n32 = 0; n32 < this.field25446; ++n32) {
                            final int n33 = 2 * n32;
                            final int n34 = 2 * this.field25446 + 2 * n32;
                            array2[n33] = array[n25][n32][0];
                            array2[n33 + 1] = array[n25][n32][1];
                            array2[n34] = array[n25][n32][2];
                            array2[n34 + 1] = array[n25][n32][3];
                        }
                        this.field25455.method25927(array2, 0);
                        this.field25455.method25927(array2, 2 * this.field25446);
                        for (int n35 = 0; n35 < this.field25446; ++n35) {
                            final int n36 = 2 * n35;
                            final int n37 = 2 * this.field25446 + 2 * n35;
                            array[n25][n35][0] = array2[n36];
                            array[n25][n35][1] = array2[n36 + 1];
                            array[n25][n35][2] = array2[n37];
                            array[n25][n35][3] = array2[n37 + 1];
                        }
                    }
                }
                else {
                    for (int n38 = 0; n38 < this.field25448; n38 += 8) {
                        for (int n39 = 0; n39 < this.field25446; ++n39) {
                            final int n40 = 2 * n39;
                            final int n41 = 2 * this.field25446 + 2 * n39;
                            final int n42 = n41 + 2 * this.field25446;
                            final int n43 = n42 + 2 * this.field25446;
                            array2[n40] = array[n25][n39][n38];
                            array2[n40 + 1] = array[n25][n39][n38 + 1];
                            array2[n41] = array[n25][n39][n38 + 2];
                            array2[n41 + 1] = array[n25][n39][n38 + 3];
                            array2[n42] = array[n25][n39][n38 + 4];
                            array2[n42 + 1] = array[n25][n39][n38 + 5];
                            array2[n43] = array[n25][n39][n38 + 6];
                            array2[n43 + 1] = array[n25][n39][n38 + 7];
                        }
                        this.field25455.method25927(array2, 0);
                        this.field25455.method25927(array2, 2 * this.field25446);
                        this.field25455.method25927(array2, 4 * this.field25446);
                        this.field25455.method25927(array2, 6 * this.field25446);
                        for (int n44 = 0; n44 < this.field25446; ++n44) {
                            final int n45 = 2 * n44;
                            final int n46 = 2 * this.field25446 + 2 * n44;
                            final int n47 = n46 + 2 * this.field25446;
                            final int n48 = n47 + 2 * this.field25446;
                            array[n25][n44][n38] = array2[n45];
                            array[n25][n44][n38 + 1] = array2[n45 + 1];
                            array[n25][n44][n38 + 2] = array2[n46];
                            array[n25][n44][n38 + 3] = array2[n46 + 1];
                            array[n25][n44][n38 + 4] = array2[n47];
                            array[n25][n44][n38 + 5] = array2[n47 + 1];
                            array[n25][n44][n38 + 6] = array2[n48];
                            array[n25][n44][n38 + 7] = array2[n48 + 1];
                        }
                    }
                }
            }
        }
    }
    
    private void method18978(final int n, final int n2, final float[][][] array, final boolean b) {
        int n3 = this.field25444;
        if (n3 < this.field25446) {
            n3 = this.field25446;
        }
        int n4 = n3 * 8;
        if (this.field25448 != 4) {
            if (this.field25448 < 4) {
                n4 >>= 2;
            }
        }
        else {
            n4 >>= 1;
        }
        final float[] array2 = new float[n4];
        if (n2 != -1) {
            for (int i = 0; i < this.field25444; ++i) {
                if (n != 0) {
                    for (int j = 0; j < this.field25446; ++j) {
                        this.field25456.method25949(array[i][j], 0, b);
                    }
                }
                else {
                    for (int k = 0; k < this.field25446; ++k) {
                        this.field25456.method25929(array[i][k], b);
                    }
                }
                if (this.field25448 <= 4) {
                    if (this.field25448 != 4) {
                        if (this.field25448 == 2) {
                            for (int l = 0; l < this.field25446; ++l) {
                                final int n5 = 2 * l;
                                array2[n5] = array[i][l][0];
                                array2[n5 + 1] = array[i][l][1];
                            }
                            this.field25455.method25931(array2, 0, b);
                            for (int n6 = 0; n6 < this.field25446; ++n6) {
                                final int n7 = 2 * n6;
                                array[i][n6][0] = array2[n7];
                                array[i][n6][1] = array2[n7 + 1];
                            }
                        }
                    }
                    else {
                        for (int n8 = 0; n8 < this.field25446; ++n8) {
                            final int n9 = 2 * n8;
                            final int n10 = 2 * this.field25446 + 2 * n8;
                            array2[n9] = array[i][n8][0];
                            array2[n9 + 1] = array[i][n8][1];
                            array2[n10] = array[i][n8][2];
                            array2[n10 + 1] = array[i][n8][3];
                        }
                        this.field25455.method25931(array2, 0, b);
                        this.field25455.method25931(array2, 2 * this.field25446, b);
                        for (int n11 = 0; n11 < this.field25446; ++n11) {
                            final int n12 = 2 * n11;
                            final int n13 = 2 * this.field25446 + 2 * n11;
                            array[i][n11][0] = array2[n12];
                            array[i][n11][1] = array2[n12 + 1];
                            array[i][n11][2] = array2[n13];
                            array[i][n11][3] = array2[n13 + 1];
                        }
                    }
                }
                else {
                    for (int n14 = 0; n14 < this.field25448; n14 += 8) {
                        for (int n15 = 0; n15 < this.field25446; ++n15) {
                            final int n16 = 2 * n15;
                            final int n17 = 2 * this.field25446 + 2 * n15;
                            final int n18 = n17 + 2 * this.field25446;
                            final int n19 = n18 + 2 * this.field25446;
                            array2[n16] = array[i][n15][n14];
                            array2[n16 + 1] = array[i][n15][n14 + 1];
                            array2[n17] = array[i][n15][n14 + 2];
                            array2[n17 + 1] = array[i][n15][n14 + 3];
                            array2[n18] = array[i][n15][n14 + 4];
                            array2[n18 + 1] = array[i][n15][n14 + 5];
                            array2[n19] = array[i][n15][n14 + 6];
                            array2[n19 + 1] = array[i][n15][n14 + 7];
                        }
                        this.field25455.method25931(array2, 0, b);
                        this.field25455.method25931(array2, 2 * this.field25446, b);
                        this.field25455.method25931(array2, 4 * this.field25446, b);
                        this.field25455.method25931(array2, 6 * this.field25446, b);
                        for (int n20 = 0; n20 < this.field25446; ++n20) {
                            final int n21 = 2 * n20;
                            final int n22 = 2 * this.field25446 + 2 * n20;
                            final int n23 = n22 + 2 * this.field25446;
                            final int n24 = n23 + 2 * this.field25446;
                            array[i][n20][n14] = array2[n21];
                            array[i][n20][n14 + 1] = array2[n21 + 1];
                            array[i][n20][n14 + 2] = array2[n22];
                            array[i][n20][n14 + 3] = array2[n22 + 1];
                            array[i][n20][n14 + 4] = array2[n23];
                            array[i][n20][n14 + 5] = array2[n23 + 1];
                            array[i][n20][n14 + 6] = array2[n24];
                            array[i][n20][n14 + 7] = array2[n24 + 1];
                        }
                    }
                }
            }
        }
        else {
            for (int n25 = 0; n25 < this.field25444; ++n25) {
                if (n != 0) {
                    for (int n26 = 0; n26 < this.field25446; ++n26) {
                        this.field25456.method25933(array[n25][n26]);
                    }
                }
                else {
                    for (int n27 = 0; n27 < this.field25446; ++n27) {
                        this.field25456.method25925(array[n25][n27]);
                    }
                }
                if (this.field25448 <= 4) {
                    if (this.field25448 != 4) {
                        if (this.field25448 == 2) {
                            for (int n28 = 0; n28 < this.field25446; ++n28) {
                                final int n29 = 2 * n28;
                                array2[n29] = array[n25][n28][0];
                                array2[n29 + 1] = array[n25][n28][1];
                            }
                            this.field25455.method25927(array2, 0);
                            for (int n30 = 0; n30 < this.field25446; ++n30) {
                                final int n31 = 2 * n30;
                                array[n25][n30][0] = array2[n31];
                                array[n25][n30][1] = array2[n31 + 1];
                            }
                        }
                    }
                    else {
                        for (int n32 = 0; n32 < this.field25446; ++n32) {
                            final int n33 = 2 * n32;
                            final int n34 = 2 * this.field25446 + 2 * n32;
                            array2[n33] = array[n25][n32][0];
                            array2[n33 + 1] = array[n25][n32][1];
                            array2[n34] = array[n25][n32][2];
                            array2[n34 + 1] = array[n25][n32][3];
                        }
                        this.field25455.method25927(array2, 0);
                        this.field25455.method25927(array2, 2 * this.field25446);
                        for (int n35 = 0; n35 < this.field25446; ++n35) {
                            final int n36 = 2 * n35;
                            final int n37 = 2 * this.field25446 + 2 * n35;
                            array[n25][n35][0] = array2[n36];
                            array[n25][n35][1] = array2[n36 + 1];
                            array[n25][n35][2] = array2[n37];
                            array[n25][n35][3] = array2[n37 + 1];
                        }
                    }
                }
                else {
                    for (int n38 = 0; n38 < this.field25448; n38 += 8) {
                        for (int n39 = 0; n39 < this.field25446; ++n39) {
                            final int n40 = 2 * n39;
                            final int n41 = 2 * this.field25446 + 2 * n39;
                            final int n42 = n41 + 2 * this.field25446;
                            final int n43 = n42 + 2 * this.field25446;
                            array2[n40] = array[n25][n39][n38];
                            array2[n40 + 1] = array[n25][n39][n38 + 1];
                            array2[n41] = array[n25][n39][n38 + 2];
                            array2[n41 + 1] = array[n25][n39][n38 + 3];
                            array2[n42] = array[n25][n39][n38 + 4];
                            array2[n42 + 1] = array[n25][n39][n38 + 5];
                            array2[n43] = array[n25][n39][n38 + 6];
                            array2[n43 + 1] = array[n25][n39][n38 + 7];
                        }
                        this.field25455.method25927(array2, 0);
                        this.field25455.method25927(array2, 2 * this.field25446);
                        this.field25455.method25927(array2, 4 * this.field25446);
                        this.field25455.method25927(array2, 6 * this.field25446);
                        for (int n44 = 0; n44 < this.field25446; ++n44) {
                            final int n45 = 2 * n44;
                            final int n46 = 2 * this.field25446 + 2 * n44;
                            final int n47 = n46 + 2 * this.field25446;
                            final int n48 = n47 + 2 * this.field25446;
                            array[n25][n44][n38] = array2[n45];
                            array[n25][n44][n38 + 1] = array2[n45 + 1];
                            array[n25][n44][n38 + 2] = array2[n46];
                            array[n25][n44][n38 + 3] = array2[n46 + 1];
                            array[n25][n44][n38 + 4] = array2[n47];
                            array[n25][n44][n38 + 5] = array2[n47 + 1];
                            array[n25][n44][n38 + 6] = array2[n48];
                            array[n25][n44][n38 + 7] = array2[n48 + 1];
                        }
                    }
                }
            }
        }
    }
    
    private void method18979(final int n, final float[] array, final boolean b) {
        int n2 = this.field25444;
        if (n2 < this.field25446) {
            n2 = this.field25446;
        }
        int n3 = n2 * 8;
        if (this.field25448 != 4) {
            if (this.field25448 < 4) {
                n3 >>= 2;
            }
        }
        else {
            n3 >>= 1;
        }
        final float[] array2 = new float[n3];
        if (n != -1) {
            if (this.field25448 <= 4) {
                if (this.field25448 != 4) {
                    if (this.field25448 == 2) {
                        for (int i = 0; i < this.field25446; ++i) {
                            final int n4 = i * this.field25452;
                            for (int j = 0; j < this.field25444; ++j) {
                                final int n5 = j * this.field25450 + n4;
                                final int n6 = 2 * j;
                                array2[n6] = array[n5];
                                array2[n6 + 1] = array[n5 + 1];
                            }
                            this.field25454.method25931(array2, 0, b);
                            for (int k = 0; k < this.field25444; ++k) {
                                final int n7 = k * this.field25450 + n4;
                                final int n8 = 2 * k;
                                array[n7] = array2[n8];
                                array[n7 + 1] = array2[n8 + 1];
                            }
                        }
                    }
                }
                else {
                    for (int l = 0; l < this.field25446; ++l) {
                        final int n9 = l * this.field25452;
                        for (int n10 = 0; n10 < this.field25444; ++n10) {
                            final int n11 = n10 * this.field25450 + n9;
                            final int n12 = 2 * n10;
                            final int n13 = 2 * this.field25444 + 2 * n10;
                            array2[n12] = array[n11];
                            array2[n12 + 1] = array[n11 + 1];
                            array2[n13] = array[n11 + 2];
                            array2[n13 + 1] = array[n11 + 3];
                        }
                        this.field25454.method25931(array2, 0, b);
                        this.field25454.method25931(array2, 2 * this.field25444, b);
                        for (int n14 = 0; n14 < this.field25444; ++n14) {
                            final int n15 = n14 * this.field25450 + n9;
                            final int n16 = 2 * n14;
                            final int n17 = 2 * this.field25444 + 2 * n14;
                            array[n15] = array2[n16];
                            array[n15 + 1] = array2[n16 + 1];
                            array[n15 + 2] = array2[n17];
                            array[n15 + 3] = array2[n17 + 1];
                        }
                    }
                }
            }
            else {
                for (int n18 = 0; n18 < this.field25446; ++n18) {
                    final int n19 = n18 * this.field25452;
                    for (int n20 = 0; n20 < this.field25448; n20 += 8) {
                        for (int n21 = 0; n21 < this.field25444; ++n21) {
                            final int n22 = n21 * this.field25450 + n19 + n20;
                            final int n23 = 2 * n21;
                            final int n24 = 2 * this.field25444 + 2 * n21;
                            final int n25 = n24 + 2 * this.field25444;
                            final int n26 = n25 + 2 * this.field25444;
                            array2[n23] = array[n22];
                            array2[n23 + 1] = array[n22 + 1];
                            array2[n24] = array[n22 + 2];
                            array2[n24 + 1] = array[n22 + 3];
                            array2[n25] = array[n22 + 4];
                            array2[n25 + 1] = array[n22 + 5];
                            array2[n26] = array[n22 + 6];
                            array2[n26 + 1] = array[n22 + 7];
                        }
                        this.field25454.method25931(array2, 0, b);
                        this.field25454.method25931(array2, 2 * this.field25444, b);
                        this.field25454.method25931(array2, 4 * this.field25444, b);
                        this.field25454.method25931(array2, 6 * this.field25444, b);
                        for (int n27 = 0; n27 < this.field25444; ++n27) {
                            final int n28 = n27 * this.field25450 + n19 + n20;
                            final int n29 = 2 * n27;
                            final int n30 = 2 * this.field25444 + 2 * n27;
                            final int n31 = n30 + 2 * this.field25444;
                            final int n32 = n31 + 2 * this.field25444;
                            array[n28] = array2[n29];
                            array[n28 + 1] = array2[n29 + 1];
                            array[n28 + 2] = array2[n30];
                            array[n28 + 3] = array2[n30 + 1];
                            array[n28 + 4] = array2[n31];
                            array[n28 + 5] = array2[n31 + 1];
                            array[n28 + 6] = array2[n32];
                            array[n28 + 7] = array2[n32 + 1];
                        }
                    }
                }
            }
        }
        else if (this.field25448 <= 4) {
            if (this.field25448 != 4) {
                if (this.field25448 == 2) {
                    for (int n33 = 0; n33 < this.field25446; ++n33) {
                        final int n34 = n33 * this.field25452;
                        for (int n35 = 0; n35 < this.field25444; ++n35) {
                            final int n36 = n35 * this.field25450 + n34;
                            final int n37 = 2 * n35;
                            array2[n37] = array[n36];
                            array2[n37 + 1] = array[n36 + 1];
                        }
                        this.field25454.method25927(array2, 0);
                        for (int n38 = 0; n38 < this.field25444; ++n38) {
                            final int n39 = n38 * this.field25450 + n34;
                            final int n40 = 2 * n38;
                            array[n39] = array2[n40];
                            array[n39 + 1] = array2[n40 + 1];
                        }
                    }
                }
            }
            else {
                for (int n41 = 0; n41 < this.field25446; ++n41) {
                    final int n42 = n41 * this.field25452;
                    for (int n43 = 0; n43 < this.field25444; ++n43) {
                        final int n44 = n43 * this.field25450 + n42;
                        final int n45 = 2 * n43;
                        final int n46 = 2 * this.field25444 + 2 * n43;
                        array2[n45] = array[n44];
                        array2[n45 + 1] = array[n44 + 1];
                        array2[n46] = array[n44 + 2];
                        array2[n46 + 1] = array[n44 + 3];
                    }
                    this.field25454.method25927(array2, 0);
                    this.field25454.method25927(array2, 2 * this.field25444);
                    for (int n47 = 0; n47 < this.field25444; ++n47) {
                        final int n48 = n47 * this.field25450 + n42;
                        final int n49 = 2 * n47;
                        final int n50 = 2 * this.field25444 + 2 * n47;
                        array[n48] = array2[n49];
                        array[n48 + 1] = array2[n49 + 1];
                        array[n48 + 2] = array2[n50];
                        array[n48 + 3] = array2[n50 + 1];
                    }
                }
            }
        }
        else {
            for (int n51 = 0; n51 < this.field25446; ++n51) {
                final int n52 = n51 * this.field25452;
                for (int n53 = 0; n53 < this.field25448; n53 += 8) {
                    for (int n54 = 0; n54 < this.field25444; ++n54) {
                        final int n55 = n54 * this.field25450 + n52 + n53;
                        final int n56 = 2 * n54;
                        final int n57 = 2 * this.field25444 + 2 * n54;
                        final int n58 = n57 + 2 * this.field25444;
                        final int n59 = n58 + 2 * this.field25444;
                        array2[n56] = array[n55];
                        array2[n56 + 1] = array[n55 + 1];
                        array2[n57] = array[n55 + 2];
                        array2[n57 + 1] = array[n55 + 3];
                        array2[n58] = array[n55 + 4];
                        array2[n58 + 1] = array[n55 + 5];
                        array2[n59] = array[n55 + 6];
                        array2[n59 + 1] = array[n55 + 7];
                    }
                    this.field25454.method25927(array2, 0);
                    this.field25454.method25927(array2, 2 * this.field25444);
                    this.field25454.method25927(array2, 4 * this.field25444);
                    this.field25454.method25927(array2, 6 * this.field25444);
                    for (int n60 = 0; n60 < this.field25444; ++n60) {
                        final int n61 = n60 * this.field25450 + n52 + n53;
                        final int n62 = 2 * n60;
                        final int n63 = 2 * this.field25444 + 2 * n60;
                        final int n64 = n63 + 2 * this.field25444;
                        final int n65 = n64 + 2 * this.field25444;
                        array[n61] = array2[n62];
                        array[n61 + 1] = array2[n62 + 1];
                        array[n61 + 2] = array2[n63];
                        array[n61 + 3] = array2[n63 + 1];
                        array[n61 + 4] = array2[n64];
                        array[n61 + 5] = array2[n64 + 1];
                        array[n61 + 6] = array2[n65];
                        array[n61 + 7] = array2[n65 + 1];
                    }
                }
            }
        }
    }
    
    private void method18980(final int n, final Class22 class22, final boolean b) {
        long n2 = this.field25445;
        if (n2 < this.field25447) {
            n2 = this.field25447;
        }
        long n3 = n2 * 8L;
        if (this.field25449 != 4L) {
            if (this.field25449 < 4L) {
                n3 >>= 2;
            }
        }
        else {
            n3 >>= 1;
        }
        final Class22 class23 = new Class22(n3);
        if (n != -1) {
            if (this.field25449 <= 4L) {
                if (this.field25449 != 4L) {
                    if (this.field25449 == 2L) {
                        for (long n4 = 0L; n4 < this.field25447; ++n4) {
                            final long n5 = n4 * this.field25453;
                            for (long n6 = 0L; n6 < this.field25445; ++n6) {
                                final long n7 = n6 * this.field25451 + n5;
                                final long n8 = 2L * n6;
                                class23.method169(n8, class22.method135(n7));
                                class23.method169(n8 + 1L, class22.method135(n7 + 1L));
                            }
                            this.field25454.method25932(class23, 0L, b);
                            for (long n9 = 0L; n9 < this.field25445; ++n9) {
                                final long n10 = n9 * this.field25451 + n5;
                                final long n11 = 2L * n9;
                                class22.method169(n10, class23.method135(n11));
                                class22.method169(n10 + 1L, class23.method135(n11 + 1L));
                            }
                        }
                    }
                }
                else {
                    for (long n12 = 0L; n12 < this.field25447; ++n12) {
                        final long n13 = n12 * this.field25453;
                        for (long n14 = 0L; n14 < this.field25445; ++n14) {
                            final long n15 = n14 * this.field25451 + n13;
                            final long n16 = 2L * n14;
                            final long n17 = 2L * this.field25445 + 2L * n14;
                            class23.method169(n16, class22.method135(n15));
                            class23.method169(n16 + 1L, class22.method135(n15 + 1L));
                            class23.method169(n17, class22.method135(n15 + 2L));
                            class23.method169(n17 + 1L, class22.method135(n15 + 3L));
                        }
                        this.field25454.method25932(class23, 0L, b);
                        this.field25454.method25932(class23, 2L * this.field25445, b);
                        for (long n18 = 0L; n18 < this.field25445; ++n18) {
                            final long n19 = n18 * this.field25451 + n13;
                            final long n20 = 2L * n18;
                            final long n21 = 2L * this.field25445 + 2L * n18;
                            class22.method169(n19, class23.method135(n20));
                            class22.method169(n19 + 1L, class23.method135(n20 + 1L));
                            class22.method169(n19 + 2L, class23.method135(n21));
                            class22.method169(n19 + 3L, class23.method135(n21 + 1L));
                        }
                    }
                }
            }
            else {
                for (long n22 = 0L; n22 < this.field25447; ++n22) {
                    final long n23 = n22 * this.field25453;
                    for (long n24 = 0L; n24 < this.field25449; n24 += 8L) {
                        for (long n25 = 0L; n25 < this.field25445; ++n25) {
                            final long n26 = n25 * this.field25451 + n23 + n24;
                            final long n27 = 2L * n25;
                            final long n28 = 2L * this.field25445 + 2L * n25;
                            final long n29 = n28 + 2L * this.field25445;
                            final long n30 = n29 + 2L * this.field25445;
                            class23.method169(n27, class22.method135(n26));
                            class23.method169(n27 + 1L, class22.method135(n26 + 1L));
                            class23.method169(n28, class22.method135(n26 + 2L));
                            class23.method169(n28 + 1L, class22.method135(n26 + 3L));
                            class23.method169(n29, class22.method135(n26 + 4L));
                            class23.method169(n29 + 1L, class22.method135(n26 + 5L));
                            class23.method169(n30, class22.method135(n26 + 6L));
                            class23.method169(n30 + 1L, class22.method135(n26 + 7L));
                        }
                        this.field25454.method25932(class23, 0L, b);
                        this.field25454.method25932(class23, 2L * this.field25445, b);
                        this.field25454.method25932(class23, 4L * this.field25445, b);
                        this.field25454.method25932(class23, 6L * this.field25445, b);
                        for (long n31 = 0L; n31 < this.field25445; ++n31) {
                            final long n32 = n31 * this.field25451 + n23 + n24;
                            final long n33 = 2L * n31;
                            final long n34 = 2L * this.field25445 + 2L * n31;
                            final long n35 = n34 + 2L * this.field25445;
                            final long n36 = n35 + 2L * this.field25445;
                            class22.method169(n32, class23.method135(n33));
                            class22.method169(n32 + 1L, class23.method135(n33 + 1L));
                            class22.method169(n32 + 2L, class23.method135(n34));
                            class22.method169(n32 + 3L, class23.method135(n34 + 1L));
                            class22.method169(n32 + 4L, class23.method135(n35));
                            class22.method169(n32 + 5L, class23.method135(n35 + 1L));
                            class22.method169(n32 + 6L, class23.method135(n36));
                            class22.method169(n32 + 7L, class23.method135(n36 + 1L));
                        }
                    }
                }
            }
        }
        else if (this.field25449 <= 4L) {
            if (this.field25449 != 4L) {
                if (this.field25449 == 2L) {
                    for (long n37 = 0L; n37 < this.field25447; ++n37) {
                        final long n38 = n37 * this.field25453;
                        for (long n39 = 0L; n39 < this.field25445; ++n39) {
                            final long n40 = n39 * this.field25451 + n38;
                            final long n41 = 2L * n39;
                            class23.method169(n41, class22.method135(n40));
                            class23.method169(n41 + 1L, class22.method135(n40 + 1L));
                        }
                        this.field25454.method25928(class23, 0L);
                        for (long n42 = 0L; n42 < this.field25445; ++n42) {
                            final long n43 = n42 * this.field25451 + n38;
                            final long n44 = 2L * n42;
                            class22.method169(n43, class23.method135(n44));
                            class22.method169(n43 + 1L, class23.method135(n44 + 1L));
                        }
                    }
                }
            }
            else {
                for (long n45 = 0L; n45 < this.field25447; ++n45) {
                    final long n46 = n45 * this.field25453;
                    for (long n47 = 0L; n47 < this.field25445; ++n47) {
                        final long n48 = n47 * this.field25451 + n46;
                        final long n49 = 2L * n47;
                        final long n50 = 2L * this.field25445 + 2L * n47;
                        class23.method169(n49, class22.method135(n48));
                        class23.method169(n49 + 1L, class22.method135(n48 + 1L));
                        class23.method169(n50, class22.method135(n48 + 2L));
                        class23.method169(n50 + 1L, class22.method135(n48 + 3L));
                    }
                    this.field25454.method25928(class23, 0L);
                    this.field25454.method25928(class23, 2L * this.field25445);
                    for (long n51 = 0L; n51 < this.field25445; ++n51) {
                        final long n52 = n51 * this.field25451 + n46;
                        final long n53 = 2L * n51;
                        final long n54 = 2L * this.field25445 + 2L * n51;
                        class22.method169(n52, class23.method135(n53));
                        class22.method169(n52 + 1L, class23.method135(n53 + 1L));
                        class22.method169(n52 + 2L, class23.method135(n54));
                        class22.method169(n52 + 3L, class23.method135(n54 + 1L));
                    }
                }
            }
        }
        else {
            for (long n55 = 0L; n55 < this.field25447; ++n55) {
                final long n56 = n55 * this.field25453;
                for (long n57 = 0L; n57 < this.field25449; n57 += 8L) {
                    for (long n58 = 0L; n58 < this.field25445; ++n58) {
                        final long n59 = n58 * this.field25451 + n56 + n57;
                        final long n60 = 2L * n58;
                        final long n61 = 2L * this.field25445 + 2L * n58;
                        final long n62 = n61 + 2L * this.field25445;
                        final long n63 = n62 + 2L * this.field25445;
                        class23.method169(n60, class22.method135(n59));
                        class23.method169(n60 + 1L, class22.method135(n59 + 1L));
                        class23.method169(n61, class22.method135(n59 + 2L));
                        class23.method169(n61 + 1L, class22.method135(n59 + 3L));
                        class23.method169(n62, class22.method135(n59 + 4L));
                        class23.method169(n62 + 1L, class22.method135(n59 + 5L));
                        class23.method169(n63, class22.method135(n59 + 6L));
                        class23.method169(n63 + 1L, class22.method135(n59 + 7L));
                    }
                    this.field25454.method25928(class23, 0L);
                    this.field25454.method25928(class23, 2L * this.field25445);
                    this.field25454.method25928(class23, 4L * this.field25445);
                    this.field25454.method25928(class23, 6L * this.field25445);
                    for (long n64 = 0L; n64 < this.field25445; ++n64) {
                        final long n65 = n64 * this.field25451 + n56 + n57;
                        final long n66 = 2L * n64;
                        final long n67 = 2L * this.field25445 + 2L * n64;
                        final long n68 = n67 + 2L * this.field25445;
                        final long n69 = n68 + 2L * this.field25445;
                        class22.method169(n65, class23.method135(n66));
                        class22.method169(n65 + 1L, class23.method135(n66 + 1L));
                        class22.method169(n65 + 2L, class23.method135(n67));
                        class22.method169(n65 + 3L, class23.method135(n67 + 1L));
                        class22.method169(n65 + 4L, class23.method135(n68));
                        class22.method169(n65 + 5L, class23.method135(n68 + 1L));
                        class22.method169(n65 + 6L, class23.method135(n69));
                        class22.method169(n65 + 7L, class23.method135(n69 + 1L));
                    }
                }
            }
        }
    }
    
    private void method18981(final int n, final float[][][] array, final boolean b) {
        int n2 = this.field25444;
        if (n2 < this.field25446) {
            n2 = this.field25446;
        }
        int n3 = n2 * 8;
        if (this.field25448 != 4) {
            if (this.field25448 < 4) {
                n3 >>= 2;
            }
        }
        else {
            n3 >>= 1;
        }
        final float[] array2 = new float[n3];
        if (n != -1) {
            if (this.field25448 <= 4) {
                if (this.field25448 != 4) {
                    if (this.field25448 == 2) {
                        for (int i = 0; i < this.field25446; ++i) {
                            for (int j = 0; j < this.field25444; ++j) {
                                final int n4 = 2 * j;
                                array2[n4] = array[j][i][0];
                                array2[n4 + 1] = array[j][i][1];
                            }
                            this.field25454.method25931(array2, 0, b);
                            for (int k = 0; k < this.field25444; ++k) {
                                final int n5 = 2 * k;
                                array[k][i][0] = array2[n5];
                                array[k][i][1] = array2[n5 + 1];
                            }
                        }
                    }
                }
                else {
                    for (int l = 0; l < this.field25446; ++l) {
                        for (int n6 = 0; n6 < this.field25444; ++n6) {
                            final int n7 = 2 * n6;
                            final int n8 = 2 * this.field25444 + 2 * n6;
                            array2[n7] = array[n6][l][0];
                            array2[n7 + 1] = array[n6][l][1];
                            array2[n8] = array[n6][l][2];
                            array2[n8 + 1] = array[n6][l][3];
                        }
                        this.field25454.method25931(array2, 0, b);
                        this.field25454.method25931(array2, 2 * this.field25444, b);
                        for (int n9 = 0; n9 < this.field25444; ++n9) {
                            final int n10 = 2 * n9;
                            final int n11 = 2 * this.field25444 + 2 * n9;
                            array[n9][l][0] = array2[n10];
                            array[n9][l][1] = array2[n10 + 1];
                            array[n9][l][2] = array2[n11];
                            array[n9][l][3] = array2[n11 + 1];
                        }
                    }
                }
            }
            else {
                for (int n12 = 0; n12 < this.field25446; ++n12) {
                    for (int n13 = 0; n13 < this.field25448; n13 += 8) {
                        for (int n14 = 0; n14 < this.field25444; ++n14) {
                            final int n15 = 2 * n14;
                            final int n16 = 2 * this.field25444 + 2 * n14;
                            final int n17 = n16 + 2 * this.field25444;
                            final int n18 = n17 + 2 * this.field25444;
                            array2[n15] = array[n14][n12][n13];
                            array2[n15 + 1] = array[n14][n12][n13 + 1];
                            array2[n16] = array[n14][n12][n13 + 2];
                            array2[n16 + 1] = array[n14][n12][n13 + 3];
                            array2[n17] = array[n14][n12][n13 + 4];
                            array2[n17 + 1] = array[n14][n12][n13 + 5];
                            array2[n18] = array[n14][n12][n13 + 6];
                            array2[n18 + 1] = array[n14][n12][n13 + 7];
                        }
                        this.field25454.method25931(array2, 0, b);
                        this.field25454.method25931(array2, 2 * this.field25444, b);
                        this.field25454.method25931(array2, 4 * this.field25444, b);
                        this.field25454.method25931(array2, 6 * this.field25444, b);
                        for (int n19 = 0; n19 < this.field25444; ++n19) {
                            final int n20 = 2 * n19;
                            final int n21 = 2 * this.field25444 + 2 * n19;
                            final int n22 = n21 + 2 * this.field25444;
                            final int n23 = n22 + 2 * this.field25444;
                            array[n19][n12][n13] = array2[n20];
                            array[n19][n12][n13 + 1] = array2[n20 + 1];
                            array[n19][n12][n13 + 2] = array2[n21];
                            array[n19][n12][n13 + 3] = array2[n21 + 1];
                            array[n19][n12][n13 + 4] = array2[n22];
                            array[n19][n12][n13 + 5] = array2[n22 + 1];
                            array[n19][n12][n13 + 6] = array2[n23];
                            array[n19][n12][n13 + 7] = array2[n23 + 1];
                        }
                    }
                }
            }
        }
        else if (this.field25448 <= 4) {
            if (this.field25448 != 4) {
                if (this.field25448 == 2) {
                    for (int n24 = 0; n24 < this.field25446; ++n24) {
                        for (int n25 = 0; n25 < this.field25444; ++n25) {
                            final int n26 = 2 * n25;
                            array2[n26] = array[n25][n24][0];
                            array2[n26 + 1] = array[n25][n24][1];
                        }
                        this.field25454.method25927(array2, 0);
                        for (int n27 = 0; n27 < this.field25444; ++n27) {
                            final int n28 = 2 * n27;
                            array[n27][n24][0] = array2[n28];
                            array[n27][n24][1] = array2[n28 + 1];
                        }
                    }
                }
            }
            else {
                for (int n29 = 0; n29 < this.field25446; ++n29) {
                    for (int n30 = 0; n30 < this.field25444; ++n30) {
                        final int n31 = 2 * n30;
                        final int n32 = 2 * this.field25444 + 2 * n30;
                        array2[n31] = array[n30][n29][0];
                        array2[n31 + 1] = array[n30][n29][1];
                        array2[n32] = array[n30][n29][2];
                        array2[n32 + 1] = array[n30][n29][3];
                    }
                    this.field25454.method25927(array2, 0);
                    this.field25454.method25927(array2, 2 * this.field25444);
                    for (int n33 = 0; n33 < this.field25444; ++n33) {
                        final int n34 = 2 * n33;
                        final int n35 = 2 * this.field25444 + 2 * n33;
                        array[n33][n29][0] = array2[n34];
                        array[n33][n29][1] = array2[n34 + 1];
                        array[n33][n29][2] = array2[n35];
                        array[n33][n29][3] = array2[n35 + 1];
                    }
                }
            }
        }
        else {
            for (int n36 = 0; n36 < this.field25446; ++n36) {
                for (int n37 = 0; n37 < this.field25448; n37 += 8) {
                    for (int n38 = 0; n38 < this.field25444; ++n38) {
                        final int n39 = 2 * n38;
                        final int n40 = 2 * this.field25444 + 2 * n38;
                        final int n41 = n40 + 2 * this.field25444;
                        final int n42 = n41 + 2 * this.field25444;
                        array2[n39] = array[n38][n36][n37];
                        array2[n39 + 1] = array[n38][n36][n37 + 1];
                        array2[n40] = array[n38][n36][n37 + 2];
                        array2[n40 + 1] = array[n38][n36][n37 + 3];
                        array2[n41] = array[n38][n36][n37 + 4];
                        array2[n41 + 1] = array[n38][n36][n37 + 5];
                        array2[n42] = array[n38][n36][n37 + 6];
                        array2[n42 + 1] = array[n38][n36][n37 + 7];
                    }
                    this.field25454.method25927(array2, 0);
                    this.field25454.method25927(array2, 2 * this.field25444);
                    this.field25454.method25927(array2, 4 * this.field25444);
                    this.field25454.method25927(array2, 6 * this.field25444);
                    for (int n43 = 0; n43 < this.field25444; ++n43) {
                        final int n44 = 2 * n43;
                        final int n45 = 2 * this.field25444 + 2 * n43;
                        final int n46 = n45 + 2 * this.field25444;
                        final int n47 = n46 + 2 * this.field25444;
                        array[n43][n36][n37] = array2[n44];
                        array[n43][n36][n37 + 1] = array2[n44 + 1];
                        array[n43][n36][n37 + 2] = array2[n45];
                        array[n43][n36][n37 + 3] = array2[n45 + 1];
                        array[n43][n36][n37 + 4] = array2[n46];
                        array[n43][n36][n37 + 5] = array2[n46 + 1];
                        array[n43][n36][n37 + 6] = array2[n47];
                        array[n43][n36][n37 + 7] = array2[n47 + 1];
                    }
                }
            }
        }
    }
    
    private void method18982(final int n, final int n2, final float[] array, final boolean b) {
        final int method24128 = Class7640.method24128(Class8216.method27224(), this.field25444);
        int n3 = this.field25444;
        if (n3 < this.field25446) {
            n3 = this.field25446;
        }
        int n4 = n3 * 8;
        if (this.field25448 == 4) {
            n4 >>= 1;
        }
        else if (this.field25448 < 4) {
            n4 >>= 2;
        }
        final int n5 = n4;
        final Future[] array2 = new Future[method24128];
        for (int i = 0; i < method24128; ++i) {
            array2[i] = Class8216.method27227(new Class1479(this, n5, n2, i, method24128, n, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method18983(final long n, final int n2, final Class22 class22, final boolean b) {
        final int n3 = (int)Class7640.method24129(Class8216.method27224(), this.field25445);
        long n4 = this.field25445;
        if (n4 < this.field25447) {
            n4 = this.field25447;
        }
        long n5 = n4 * 8L;
        if (this.field25449 == 4L) {
            n5 >>= 1;
        }
        else if (this.field25449 < 4L) {
            n5 >>= 2;
        }
        final long n6 = n5;
        final Future[] array = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array[i] = Class8216.method27227(new Class1203(this, n6, n2, i, n3, n, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method18984(final int n, final int n2, final float[] array, final boolean b) {
        final int method24128 = Class7640.method24128(Class8216.method27224(), this.field25444);
        int n3 = this.field25444;
        if (n3 < this.field25446) {
            n3 = this.field25446;
        }
        int n4 = n3 * 8;
        if (this.field25448 == 4) {
            n4 >>= 1;
        }
        else if (this.field25448 < 4) {
            n4 >>= 2;
        }
        final int n5 = n4;
        final Future[] array2 = new Future[method24128];
        for (int i = 0; i < method24128; ++i) {
            array2[i] = Class8216.method27227(new Class1163(this, n5, n2, i, method24128, n, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method18985(final long n, final int n2, final Class22 class22, final boolean b) {
        final int n3 = (int)Class7640.method24129(Class8216.method27224(), this.field25445);
        long n4 = this.field25445;
        if (n4 < this.field25447) {
            n4 = this.field25447;
        }
        long n5 = n4 * 8L;
        if (this.field25449 == 4L) {
            n5 >>= 1;
        }
        else if (this.field25449 < 4L) {
            n5 >>= 2;
        }
        final long n6 = n5;
        final Future[] array = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array[i] = Class8216.method27227(new Class1625(this, n6, n2, i, n3, n, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method18986(final int n, final int n2, final float[][][] array, final boolean b) {
        final int method24128 = Class7640.method24128(Class8216.method27224(), this.field25444);
        int n3 = this.field25444;
        if (n3 < this.field25446) {
            n3 = this.field25446;
        }
        int n4 = n3 * 8;
        if (this.field25448 == 4) {
            n4 >>= 1;
        }
        else if (this.field25448 < 4) {
            n4 >>= 2;
        }
        final int n5 = n4;
        final Future[] array2 = new Future[method24128];
        for (int i = 0; i < method24128; ++i) {
            array2[i] = Class8216.method27227(new Class1008(this, n5, n2, i, method24128, n, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method18987(final int n, final int n2, final float[][][] array, final boolean b) {
        final int method24128 = Class7640.method24128(Class8216.method27224(), this.field25444);
        int n3 = this.field25444;
        if (n3 < this.field25446) {
            n3 = this.field25446;
        }
        int n4 = n3 * 8;
        if (this.field25448 == 4) {
            n4 >>= 1;
        }
        else if (this.field25448 < 4) {
            n4 >>= 2;
        }
        final int n5 = n4;
        final Future[] array2 = new Future[method24128];
        for (int i = 0; i < method24128; ++i) {
            array2[i] = Class8216.method27227(new Class1138(this, n5, n2, i, method24128, n, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method18988(final int n, final float[] array, final boolean b) {
        final int method24128 = Class7640.method24128(Class8216.method27224(), this.field25446);
        int n2 = this.field25444;
        if (n2 < this.field25446) {
            n2 = this.field25446;
        }
        int n3 = n2 * 8;
        if (this.field25448 == 4) {
            n3 >>= 1;
        }
        else if (this.field25448 < 4) {
            n3 >>= 2;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[method24128];
        for (int i = 0; i < method24128; ++i) {
            array2[i] = Class8216.method27227(new Class1035(this, n4, n, i, method24128, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method18989(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)Class7640.method24129(Class8216.method27224(), this.field25447);
        long n3 = this.field25445;
        if (n3 < this.field25447) {
            n3 = this.field25447;
        }
        long n4 = n3 * 8L;
        if (this.field25449 == 4L) {
            n4 >>= 1;
        }
        else if (this.field25449 < 4L) {
            n4 >>= 2;
        }
        final long n5 = n4;
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1458(this, n5, n, i, n2, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method18990(final int n, final float[][][] array, final boolean b) {
        final int method24128 = Class7640.method24128(Class8216.method27224(), this.field25446);
        int n2 = this.field25444;
        if (n2 < this.field25446) {
            n2 = this.field25446;
        }
        int n3 = n2 * 8;
        if (this.field25448 == 4) {
            n3 >>= 1;
        }
        else if (this.field25448 < 4) {
            n3 >>= 2;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[method24128];
        for (int i = 0; i < method24128; ++i) {
            array2[i] = Class8216.method27227(new Class1096(this, n4, n, i, method24128, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method18991(final int n, final float[] array) {
        final int n2 = this.field25444 >> 1;
        final int n3 = this.field25446 >> 1;
        if (n >= 0) {
            for (int i = 1; i < n2; ++i) {
                final int n4 = this.field25444 - i;
                final int n5 = n4 * this.field25450;
                final int n6 = i * this.field25450;
                array[n5] = 0.5f * (array[n6] - array[n5]);
                final int n7 = n6;
                array[n7] -= array[n5];
                array[n5 + 1] = 0.5f * (array[n6 + 1] + array[n5 + 1]);
                final int n8 = n6 + 1;
                array[n8] -= array[n5 + 1];
                final int n9 = n4 * this.field25450 + n3 * this.field25452;
                final int n10 = i * this.field25450 + n3 * this.field25452;
                array[n9] = 0.5f * (array[n10] - array[n9]);
                final int n11 = n10;
                array[n11] -= array[n9];
                array[n9 + 1] = 0.5f * (array[n10 + 1] + array[n9 + 1]);
                final int n12 = n10 + 1;
                array[n12] -= array[n9 + 1];
                for (int j = 1; j < n3; ++j) {
                    final int n13 = this.field25446 - j;
                    final int n14 = n4 * this.field25450 + n13 * this.field25452;
                    final int n15 = i * this.field25450 + j * this.field25452;
                    array[n14] = 0.5f * (array[n15] - array[n14]);
                    final int n16 = n15;
                    array[n16] -= array[n14];
                    array[n14 + 1] = 0.5f * (array[n15 + 1] + array[n14 + 1]);
                    final int n17 = n15 + 1;
                    array[n17] -= array[n14 + 1];
                    final int n18 = i * this.field25450 + n13 * this.field25452;
                    final int n19 = n4 * this.field25450 + j * this.field25452;
                    array[n18] = 0.5f * (array[n19] - array[n18]);
                    final int n20 = n19;
                    array[n20] -= array[n18];
                    array[n18 + 1] = 0.5f * (array[n19 + 1] + array[n18 + 1]);
                    final int n21 = n19 + 1;
                    array[n21] -= array[n18 + 1];
                }
            }
            for (int k = 1; k < n3; ++k) {
                final int n22 = this.field25446 - k;
                final int n23 = n22 * this.field25452;
                final int n24 = k * this.field25452;
                array[n23] = 0.5f * (array[n24] - array[n23]);
                final int n25 = n24;
                array[n25] -= array[n23];
                array[n23 + 1] = 0.5f * (array[n24 + 1] + array[n23 + 1]);
                final int n26 = n24 + 1;
                array[n26] -= array[n23 + 1];
                final int n27 = n2 * this.field25450 + n22 * this.field25452;
                final int n28 = n2 * this.field25450 + k * this.field25452;
                array[n27] = 0.5f * (array[n28] - array[n27]);
                final int n29 = n28;
                array[n29] -= array[n27];
                array[n27 + 1] = 0.5f * (array[n28 + 1] + array[n27 + 1]);
                final int n30 = n28 + 1;
                array[n30] -= array[n27 + 1];
            }
        }
        else {
            for (int l = 1; l < n2; ++l) {
                final int n31 = this.field25444 - l;
                final int n32 = l * this.field25450;
                final int n33 = n31 * this.field25450;
                final int n34 = l * this.field25450 + n3 * this.field25452;
                final int n35 = n31 * this.field25450 + n3 * this.field25452;
                final float n36 = array[n32] - array[n33];
                final int n37 = n32;
                array[n37] += array[n33];
                array[n33] = n36;
                final float n38 = array[n33 + 1] - array[n32 + 1];
                final int n39 = n32 + 1;
                array[n39] += array[n33 + 1];
                array[n33 + 1] = n38;
                final float n40 = array[n34] - array[n35];
                final int n41 = n34;
                array[n41] += array[n35];
                array[n35] = n40;
                final float n42 = array[n35 + 1] - array[n34 + 1];
                final int n43 = n34 + 1;
                array[n43] += array[n35 + 1];
                array[n35 + 1] = n42;
                for (int n44 = 1; n44 < n3; ++n44) {
                    final int n45 = this.field25446 - n44;
                    final int n46 = l * this.field25450 + n44 * this.field25452;
                    final int n47 = n31 * this.field25450 + n45 * this.field25452;
                    final float n48 = array[n46] - array[n47];
                    final int n49 = n46;
                    array[n49] += array[n47];
                    array[n47] = n48;
                    final float n50 = array[n47 + 1] - array[n46 + 1];
                    final int n51 = n46 + 1;
                    array[n51] += array[n47 + 1];
                    array[n47 + 1] = n50;
                    final int n52 = n31 * this.field25450 + n44 * this.field25452;
                    final int n53 = l * this.field25450 + n45 * this.field25452;
                    final float n54 = array[n52] - array[n53];
                    final int n55 = n52;
                    array[n55] += array[n53];
                    array[n53] = n54;
                    final float n56 = array[n53 + 1] - array[n52 + 1];
                    final int n57 = n52 + 1;
                    array[n57] += array[n53 + 1];
                    array[n53 + 1] = n56;
                }
            }
            for (int n58 = 1; n58 < n3; ++n58) {
                final int n59 = this.field25446 - n58;
                final int n60 = n58 * this.field25452;
                final int n61 = n59 * this.field25452;
                final float n62 = array[n60] - array[n61];
                final int n63 = n60;
                array[n63] += array[n61];
                array[n61] = n62;
                final float n64 = array[n61 + 1] - array[n60 + 1];
                final int n65 = n60 + 1;
                array[n65] += array[n61 + 1];
                array[n61 + 1] = n64;
                final int n66 = n2 * this.field25450 + n58 * this.field25452;
                final int n67 = n2 * this.field25450 + n59 * this.field25452;
                final float n68 = array[n66] - array[n67];
                final int n69 = n66;
                array[n69] += array[n67];
                array[n67] = n68;
                final float n70 = array[n67 + 1] - array[n66 + 1];
                final int n71 = n66 + 1;
                array[n71] += array[n67 + 1];
                array[n67 + 1] = n70;
            }
        }
    }
    
    private void method18992(final int n, final Class22 class22) {
        final long n2 = this.field25445 >> 1;
        final long n3 = this.field25447 >> 1;
        if (n >= 0) {
            for (long n4 = 1L; n4 < n2; ++n4) {
                final long n5 = this.field25445 - n4;
                final long n6 = n5 * this.field25451;
                final long n7 = n4 * this.field25451;
                class22.method169(n6, 0.5f * (class22.method135(n7) - class22.method135(n6)));
                class22.method169(n7, class22.method135(n7) - class22.method135(n6));
                class22.method169(n6 + 1L, 0.5f * (class22.method135(n7 + 1L) + class22.method135(n6 + 1L)));
                class22.method169(n7 + 1L, class22.method135(n7 + 1L) - class22.method135(n6 + 1L));
                final long n8 = n5 * this.field25451 + n3 * this.field25453;
                final long n9 = n4 * this.field25451 + n3 * this.field25453;
                class22.method169(n8, 0.5f * (class22.method135(n9) - class22.method135(n8)));
                class22.method169(n9, class22.method135(n9) - class22.method135(n8));
                class22.method169(n8 + 1L, 0.5f * (class22.method135(n9 + 1L) + class22.method135(n8 + 1L)));
                class22.method169(n9 + 1L, class22.method135(n9 + 1L) - class22.method135(n8 + 1L));
                for (long n10 = 1L; n10 < n3; ++n10) {
                    final long n11 = this.field25447 - n10;
                    final long n12 = n5 * this.field25451 + n11 * this.field25453;
                    final long n13 = n4 * this.field25451 + n10 * this.field25453;
                    class22.method169(n12, 0.5f * (class22.method135(n13) - class22.method135(n12)));
                    class22.method169(n13, class22.method135(n13) - class22.method135(n12));
                    class22.method169(n12 + 1L, 0.5f * (class22.method135(n13 + 1L) + class22.method135(n12 + 1L)));
                    class22.method169(n13 + 1L, class22.method135(n13 + 1L) - class22.method135(n12 + 1L));
                    final long n14 = n4 * this.field25451 + n11 * this.field25453;
                    final long n15 = n5 * this.field25451 + n10 * this.field25453;
                    class22.method169(n14, 0.5f * (class22.method135(n15) - class22.method135(n14)));
                    class22.method169(n15, class22.method135(n15) - class22.method135(n14));
                    class22.method169(n14 + 1L, 0.5f * (class22.method135(n15 + 1L) + class22.method135(n14 + 1L)));
                    class22.method169(n15 + 1L, class22.method135(n15 + 1L) - class22.method135(n14 + 1L));
                }
            }
            for (long n16 = 1L; n16 < n3; ++n16) {
                final long n17 = this.field25447 - n16;
                final long n18 = n17 * this.field25453;
                final long n19 = n16 * this.field25453;
                class22.method169(n18, 0.5f * (class22.method135(n19) - class22.method135(n18)));
                class22.method169(n19, class22.method135(n19) - class22.method135(n18));
                class22.method169(n18 + 1L, 0.5f * (class22.method135(n19 + 1L) + class22.method135(n18 + 1L)));
                class22.method169(n19 + 1L, class22.method135(n19 + 1L) - class22.method135(n18 + 1L));
                final long n20 = n2 * this.field25451 + n17 * this.field25453;
                final long n21 = n2 * this.field25451 + n16 * this.field25453;
                class22.method169(n20, 0.5f * (class22.method135(n21) - class22.method135(n20)));
                class22.method169(n21, class22.method135(n21) - class22.method135(n20));
                class22.method169(n20 + 1L, 0.5f * (class22.method135(n21 + 1L) + class22.method135(n20 + 1L)));
                class22.method169(n21 + 1L, class22.method135(n21 + 1L) - class22.method135(n20 + 1L));
            }
        }
        else {
            for (long n22 = 1L; n22 < n2; ++n22) {
                final long n23 = this.field25445 - n22;
                final long n24 = n22 * this.field25451;
                final long n25 = n23 * this.field25451;
                final long n26 = n22 * this.field25451 + n3 * this.field25453;
                final long n27 = n23 * this.field25451 + n3 * this.field25453;
                final float n28 = class22.method135(n24) - class22.method135(n25);
                class22.method169(n24, class22.method135(n24) + class22.method135(n25));
                class22.method169(n25, n28);
                final float n29 = class22.method135(n25 + 1L) - class22.method135(n24 + 1L);
                class22.method169(n24 + 1L, class22.method135(n24 + 1L) + class22.method135(n25 + 1L));
                class22.method169(n25 + 1L, n29);
                final float n30 = class22.method135(n26) - class22.method135(n27);
                class22.method169(n26, class22.method135(n26) + class22.method135(n27));
                class22.method169(n27, n30);
                final float n31 = class22.method135(n27 + 1L) - class22.method135(n26 + 1L);
                class22.method169(n26 + 1L, class22.method135(n26 + 1L) + class22.method135(n27 + 1L));
                class22.method169(n27 + 1L, n31);
                for (long n32 = 1L; n32 < n3; ++n32) {
                    final long n33 = this.field25447 - n32;
                    final long n34 = n22 * this.field25451 + n32 * this.field25453;
                    final long n35 = n23 * this.field25451 + n33 * this.field25453;
                    final float n36 = class22.method135(n34) - class22.method135(n35);
                    class22.method169(n34, class22.method135(n34) + class22.method135(n35));
                    class22.method169(n35, n36);
                    final float n37 = class22.method135(n35 + 1L) - class22.method135(n34 + 1L);
                    class22.method169(n34 + 1L, class22.method135(n34 + 1L) + class22.method135(n35 + 1L));
                    class22.method169(n35 + 1L, n37);
                    final long n38 = n23 * this.field25451 + n32 * this.field25453;
                    final long n39 = n22 * this.field25451 + n33 * this.field25453;
                    final float n40 = class22.method135(n38) - class22.method135(n39);
                    class22.method169(n38, class22.method135(n38) + class22.method135(n39));
                    class22.method169(n39, n40);
                    final float n41 = class22.method135(n39 + 1L) - class22.method135(n38 + 1L);
                    class22.method169(n38 + 1L, class22.method135(n38 + 1L) + class22.method135(n39 + 1L));
                    class22.method169(n39 + 1L, n41);
                }
            }
            for (long n42 = 1L; n42 < n3; ++n42) {
                final long n43 = this.field25447 - n42;
                final long n44 = n42 * this.field25453;
                final long n45 = n43 * this.field25453;
                final float n46 = class22.method135(n44) - class22.method135(n45);
                class22.method169(n44, class22.method135(n44) + class22.method135(n45));
                class22.method169(n45, n46);
                final float n47 = class22.method135(n45 + 1L) - class22.method135(n44 + 1L);
                class22.method169(n44 + 1L, class22.method135(n44 + 1L) + class22.method135(n45 + 1L));
                class22.method169(n45 + 1L, n47);
                final long n48 = n2 * this.field25451 + n42 * this.field25453;
                final long n49 = n2 * this.field25451 + n43 * this.field25453;
                final float n50 = class22.method135(n48) - class22.method135(n49);
                class22.method169(n48, class22.method135(n48) + class22.method135(n49));
                class22.method169(n49, n50);
                final float n51 = class22.method135(n49 + 1L) - class22.method135(n48 + 1L);
                class22.method169(n48 + 1L, class22.method135(n48 + 1L) + class22.method135(n49 + 1L));
                class22.method169(n49 + 1L, n51);
            }
        }
    }
    
    private void method18993(final int n, final float[][][] array) {
        final int n2 = this.field25444 >> 1;
        final int n3 = this.field25446 >> 1;
        if (n >= 0) {
            for (int i = 1; i < n2; ++i) {
                final int n4 = this.field25444 - i;
                array[n4][0][0] = 0.5f * (array[i][0][0] - array[n4][0][0]);
                final float[] array2 = array[i][0];
                final int n5 = 0;
                array2[n5] -= array[n4][0][0];
                array[n4][0][1] = 0.5f * (array[i][0][1] + array[n4][0][1]);
                final float[] array3 = array[i][0];
                final int n6 = 1;
                array3[n6] -= array[n4][0][1];
                array[n4][n3][0] = 0.5f * (array[i][n3][0] - array[n4][n3][0]);
                final float[] array4 = array[i][n3];
                final int n7 = 0;
                array4[n7] -= array[n4][n3][0];
                array[n4][n3][1] = 0.5f * (array[i][n3][1] + array[n4][n3][1]);
                final float[] array5 = array[i][n3];
                final int n8 = 1;
                array5[n8] -= array[n4][n3][1];
                for (int j = 1; j < n3; ++j) {
                    final int n9 = this.field25446 - j;
                    array[n4][n9][0] = 0.5f * (array[i][j][0] - array[n4][n9][0]);
                    final float[] array6 = array[i][j];
                    final int n10 = 0;
                    array6[n10] -= array[n4][n9][0];
                    array[n4][n9][1] = 0.5f * (array[i][j][1] + array[n4][n9][1]);
                    final float[] array7 = array[i][j];
                    final int n11 = 1;
                    array7[n11] -= array[n4][n9][1];
                    array[i][n9][0] = 0.5f * (array[n4][j][0] - array[i][n9][0]);
                    final float[] array8 = array[n4][j];
                    final int n12 = 0;
                    array8[n12] -= array[i][n9][0];
                    array[i][n9][1] = 0.5f * (array[n4][j][1] + array[i][n9][1]);
                    final float[] array9 = array[n4][j];
                    final int n13 = 1;
                    array9[n13] -= array[i][n9][1];
                }
            }
            for (int k = 1; k < n3; ++k) {
                final int n14 = this.field25446 - k;
                array[0][n14][0] = 0.5f * (array[0][k][0] - array[0][n14][0]);
                final float[] array10 = array[0][k];
                final int n15 = 0;
                array10[n15] -= array[0][n14][0];
                array[0][n14][1] = 0.5f * (array[0][k][1] + array[0][n14][1]);
                final float[] array11 = array[0][k];
                final int n16 = 1;
                array11[n16] -= array[0][n14][1];
                array[n2][n14][0] = 0.5f * (array[n2][k][0] - array[n2][n14][0]);
                final float[] array12 = array[n2][k];
                final int n17 = 0;
                array12[n17] -= array[n2][n14][0];
                array[n2][n14][1] = 0.5f * (array[n2][k][1] + array[n2][n14][1]);
                final float[] array13 = array[n2][k];
                final int n18 = 1;
                array13[n18] -= array[n2][n14][1];
            }
        }
        else {
            for (int l = 1; l < n2; ++l) {
                final int n19 = this.field25444 - l;
                final float n20 = array[l][0][0] - array[n19][0][0];
                final float[] array14 = array[l][0];
                final int n21 = 0;
                array14[n21] += array[n19][0][0];
                array[n19][0][0] = n20;
                final float n22 = array[n19][0][1] - array[l][0][1];
                final float[] array15 = array[l][0];
                final int n23 = 1;
                array15[n23] += array[n19][0][1];
                array[n19][0][1] = n22;
                final float n24 = array[l][n3][0] - array[n19][n3][0];
                final float[] array16 = array[l][n3];
                final int n25 = 0;
                array16[n25] += array[n19][n3][0];
                array[n19][n3][0] = n24;
                final float n26 = array[n19][n3][1] - array[l][n3][1];
                final float[] array17 = array[l][n3];
                final int n27 = 1;
                array17[n27] += array[n19][n3][1];
                array[n19][n3][1] = n26;
                for (int n28 = 1; n28 < n3; ++n28) {
                    final int n29 = this.field25446 - n28;
                    final float n30 = array[l][n28][0] - array[n19][n29][0];
                    final float[] array18 = array[l][n28];
                    final int n31 = 0;
                    array18[n31] += array[n19][n29][0];
                    array[n19][n29][0] = n30;
                    final float n32 = array[n19][n29][1] - array[l][n28][1];
                    final float[] array19 = array[l][n28];
                    final int n33 = 1;
                    array19[n33] += array[n19][n29][1];
                    array[n19][n29][1] = n32;
                    final float n34 = array[n19][n28][0] - array[l][n29][0];
                    final float[] array20 = array[n19][n28];
                    final int n35 = 0;
                    array20[n35] += array[l][n29][0];
                    array[l][n29][0] = n34;
                    final float n36 = array[l][n29][1] - array[n19][n28][1];
                    final float[] array21 = array[n19][n28];
                    final int n37 = 1;
                    array21[n37] += array[l][n29][1];
                    array[l][n29][1] = n36;
                }
            }
            for (int n38 = 1; n38 < n3; ++n38) {
                final int n39 = this.field25446 - n38;
                final float n40 = array[0][n38][0] - array[0][n39][0];
                final float[] array22 = array[0][n38];
                final int n41 = 0;
                array22[n41] += array[0][n39][0];
                array[0][n39][0] = n40;
                final float n42 = array[0][n39][1] - array[0][n38][1];
                final float[] array23 = array[0][n38];
                final int n43 = 1;
                array23[n43] += array[0][n39][1];
                array[0][n39][1] = n42;
                final float n44 = array[n2][n38][0] - array[n2][n39][0];
                final float[] array24 = array[n2][n38];
                final int n45 = 0;
                array24[n45] += array[n2][n39][0];
                array[n2][n39][0] = n44;
                final float n46 = array[n2][n39][1] - array[n2][n38][1];
                final float[] array25 = array[n2][n38];
                final int n47 = 1;
                array25[n47] += array[n2][n39][1];
                array[n2][n39][1] = n46;
            }
        }
    }
    
    private void method18994(final float[][][] array) {
        final int n = 2 * this.field25448;
        final int n2 = this.field25446 / 2;
        final int n3 = this.field25444 / 2;
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field25458 && this.field25444 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n4 = this.field25444 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n5 = i * n4;
                array2[i] = Class8216.method27227(new Class1236(this, n5, (i == method27224 - 1) ? this.field25444 : (n5 + n4), n, array));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n6 = j * n4;
                array2[j] = Class8216.method27227(new Class1405(this, n6, (j == method27224 - 1) ? this.field25444 : (n6 + n4), n2, array));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            for (int k = 0; k < method27224; ++k) {
                final int n7 = k * n4;
                array2[k] = Class8216.method27227(new Class1424(this, n7, (k == method27224 - 1) ? this.field25444 : (n7 + n4), n2, array));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field25444; ++l) {
                final int n8 = (this.field25444 - l) % this.field25444;
                for (int n9 = 0; n9 < this.field25446; ++n9) {
                    final int n10 = (this.field25446 - n9) % this.field25446;
                    for (int n11 = 1; n11 < this.field25448; n11 += 2) {
                        final int n12 = n - n11;
                        array[n8][n10][n12] = -array[l][n9][n11 + 2];
                        array[n8][n10][n12 - 1] = array[l][n9][n11 + 1];
                    }
                }
            }
            for (int n13 = 0; n13 < this.field25444; ++n13) {
                final int n14 = (this.field25444 - n13) % this.field25444;
                for (int n15 = 1; n15 < n2; ++n15) {
                    final int n16 = this.field25446 - n15;
                    array[n14][n15][this.field25448] = array[n13][n16][1];
                    array[n13][n16][this.field25448] = array[n13][n16][1];
                    array[n14][n15][this.field25448 + 1] = -array[n13][n16][0];
                    array[n13][n16][this.field25448 + 1] = array[n13][n16][0];
                }
            }
            for (int n17 = 0; n17 < this.field25444; ++n17) {
                final int n18 = (this.field25444 - n17) % this.field25444;
                for (int n19 = 1; n19 < n2; ++n19) {
                    final int n20 = this.field25446 - n19;
                    array[n18][n20][0] = array[n17][n19][0];
                    array[n18][n20][1] = -array[n17][n19][1];
                }
            }
        }
        for (int n21 = 1; n21 < n3; ++n21) {
            final int n22 = this.field25444 - n21;
            array[n21][0][this.field25448] = array[n22][0][1];
            array[n22][0][this.field25448] = array[n22][0][1];
            array[n21][0][this.field25448 + 1] = -array[n22][0][0];
            array[n22][0][this.field25448 + 1] = array[n22][0][0];
            array[n21][n2][this.field25448] = array[n22][n2][1];
            array[n22][n2][this.field25448] = array[n22][n2][1];
            array[n21][n2][this.field25448 + 1] = -array[n22][n2][0];
            array[n22][n2][this.field25448 + 1] = array[n22][n2][0];
            array[n22][0][0] = array[n21][0][0];
            array[n22][0][1] = -array[n21][0][1];
            array[n22][n2][0] = array[n21][n2][0];
            array[n22][n2][1] = -array[n21][n2][1];
        }
        array[0][0][this.field25448] = array[0][0][1];
        array[0][0][1] = 0.0f;
        array[0][n2][this.field25448] = array[0][n2][1];
        array[0][n2][1] = 0.0f;
        array[n3][0][this.field25448] = array[n3][0][1];
        array[n3][0][1] = 0.0f;
        array[n3][n2][this.field25448] = array[n3][n2][1];
        array[n3][n2][1] = 0.0f;
        array[n3][0][this.field25448 + 1] = 0.0f;
        array[n3][n2][this.field25448 + 1] = 0.0f;
    }
    
    private void method18995(final float[] array) {
        final int n = 2 * this.field25448;
        final int n2 = this.field25446 / 2;
        final int n3 = this.field25444 / 2;
        final int n4 = this.field25446 * n;
        final int n5 = n;
        for (int i = this.field25444 - 1; i >= 1; --i) {
            final int n6 = i * this.field25450;
            final int n7 = 2 * n6;
            for (int j = 0; j < this.field25446; ++j) {
                final int n8 = j * this.field25452;
                final int n9 = 2 * n8;
                for (int k = 0; k < this.field25448; k += 2) {
                    int n10 = n6 + n8 + k;
                    int n11 = n7 + n9 + k;
                    array[n11] = array[n10];
                    array[n10] = 0.0f;
                    ++n10;
                    ++n11;
                    array[n11] = array[n10];
                    array[n10] = 0.0f;
                }
            }
        }
        for (int l = 1; l < this.field25446; ++l) {
            final int n12 = (this.field25446 - l) * this.field25452;
            final int n13 = (this.field25446 - l) * n5;
            for (int n14 = 0; n14 < this.field25448; n14 += 2) {
                int n15 = n12 + n14;
                int n16 = n13 + n14;
                array[n16] = array[n15];
                array[n15] = 0.0f;
                ++n15;
                ++n16;
                array[n16] = array[n15];
                array[n15] = 0.0f;
            }
        }
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field25458 && this.field25444 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n17 = this.field25444 / method27224;
            for (int n18 = 0; n18 < method27224; ++n18) {
                final int n19 = n18 * n17;
                array2[n18] = Class8216.method27227(new Class1512(this, n19, (n18 == method27224 - 1) ? this.field25444 : (n19 + n17), n4, n5, n, array));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int n20 = 0; n20 < method27224; ++n20) {
                final int n21 = n20 * n17;
                array2[n20] = Class8216.method27227(new Class1614(this, n21, (n20 == method27224 - 1) ? this.field25444 : (n21 + n17), n4, n2, n5, array));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            for (int n22 = 0; n22 < method27224; ++n22) {
                final int n23 = n22 * n17;
                array2[n22] = Class8216.method27227(new Class1326(this, n23, (n22 == method27224 - 1) ? this.field25444 : (n23 + n17), n4, n2, n5, array));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int n24 = 0; n24 < this.field25444; ++n24) {
                final int n25 = (this.field25444 - n24) % this.field25444 * n4;
                final int n26 = n24 * n4;
                for (int n27 = 0; n27 < this.field25446; ++n27) {
                    final int n28 = (this.field25446 - n27) % this.field25446 * n5;
                    final int n29 = n27 * n5;
                    for (int n30 = 1; n30 < this.field25448; n30 += 2) {
                        final int n31 = n25 + n28 + n - n30;
                        final int n32 = n26 + n29 + n30;
                        array[n31] = -array[n32 + 2];
                        array[n31 - 1] = array[n32 + 1];
                    }
                }
            }
            for (int n33 = 0; n33 < this.field25444; ++n33) {
                final int n34 = (this.field25444 - n33) % this.field25444 * n4;
                final int n35 = n33 * n4;
                for (int n36 = 1; n36 < n2; ++n36) {
                    final int n37 = n35 + (this.field25446 - n36) * n5;
                    final int n38 = n34 + n36 * n5 + this.field25448;
                    final int n39 = n37 + this.field25448;
                    final int n40 = n37 + 1;
                    array[n38] = array[n40];
                    array[n39] = array[n40];
                    array[n38 + 1] = -array[n37];
                    array[n39 + 1] = array[n37];
                }
            }
            for (int n41 = 0; n41 < this.field25444; ++n41) {
                final int n42 = (this.field25444 - n41) % this.field25444 * n4;
                final int n43 = n41 * n4;
                for (int n44 = 1; n44 < n2; ++n44) {
                    final int n45 = n42 + (this.field25446 - n44) * n5;
                    final int n46 = n43 + n44 * n5;
                    array[n45] = array[n46];
                    array[n45 + 1] = -array[n46 + 1];
                }
            }
        }
        for (int n47 = 1; n47 < n3; ++n47) {
            final int n48 = n47 * n4;
            final int n49 = (this.field25444 - n47) * n4;
            final int n50 = n2 * n5;
            final int n51 = n48 + n50;
            final int n52 = n49 + n50;
            array[n48 + this.field25448] = array[n49 + 1];
            array[n49 + this.field25448] = array[n49 + 1];
            array[n48 + this.field25448 + 1] = -array[n49];
            array[n49 + this.field25448 + 1] = array[n49];
            array[n51 + this.field25448] = array[n52 + 1];
            array[n52 + this.field25448] = array[n52 + 1];
            array[n51 + this.field25448 + 1] = -array[n52];
            array[n52 + this.field25448 + 1] = array[n52];
            array[n49] = array[n48];
            array[n49 + 1] = -array[n48 + 1];
            array[n52] = array[n51];
            array[n52 + 1] = -array[n51 + 1];
        }
        array[this.field25448] = array[1];
        array[1] = 0.0f;
        final int n53 = n2 * n5;
        final int n54 = n3 * n4;
        final int n55 = n53 + n54;
        array[n53 + this.field25448] = array[n53 + 1];
        array[n53 + 1] = 0.0f;
        array[n54 + this.field25448] = array[n54 + 1];
        array[n54 + 1] = 0.0f;
        array[n55 + this.field25448] = array[n55 + 1];
        array[n55 + 1] = 0.0f;
        array[n54 + this.field25448 + 1] = 0.0f;
        array[n55 + this.field25448 + 1] = 0.0f;
    }
    
    private void method18996(final Class22 class22) {
        final long n = 2L * this.field25449;
        final long n2 = this.field25447 / 2L;
        final long n3 = this.field25445 / 2L;
        final long n4 = this.field25447 * n;
        final long n5 = n;
        for (long n6 = this.field25445 - 1L; n6 >= 1L; --n6) {
            final long n7 = n6 * this.field25451;
            final long n8 = 2L * n7;
            for (long n9 = 0L; n9 < this.field25447; ++n9) {
                final long n10 = n9 * this.field25453;
                final long n11 = 2L * n10;
                for (long n12 = 0L; n12 < this.field25449; n12 += 2L) {
                    final long n13 = n7 + n10 + n12;
                    final long n14 = n8 + n11 + n12;
                    class22.method169(n14, class22.method135(n13));
                    class22.method169(n13, 0.0f);
                    final long n15 = n13 + 1L;
                    class22.method169(n14 + 1L, class22.method135(n15));
                    class22.method169(n15, 0.0f);
                }
            }
        }
        for (long n16 = 1L; n16 < this.field25447; ++n16) {
            final long n17 = (this.field25447 - n16) * this.field25453;
            final long n18 = (this.field25447 - n16) * n5;
            for (long n19 = 0L; n19 < this.field25449; n19 += 2L) {
                final long n20 = n17 + n19;
                final long n21 = n18 + n19;
                class22.method169(n21, class22.method135(n20));
                class22.method169(n20, 0.0f);
                final long n22 = n20 + 1L;
                class22.method169(n21 + 1L, class22.method135(n22));
                class22.method169(n22, 0.0f);
            }
        }
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field25458 && this.field25445 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n23 = this.field25445 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n24 = i * n23;
                array[i] = Class8216.method27227(new Class1637(this, n24, (i == method27224 - 1) ? this.field25445 : (n24 + n23), n4, n5, n, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final long n25 = j * n23;
                array[j] = Class8216.method27227(new Class1562(this, n25, (j == method27224 - 1) ? this.field25445 : (n25 + n23), n4, n2, n5, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            for (int k = 0; k < method27224; ++k) {
                final long n26 = k * n23;
                array[k] = Class8216.method27227(new Class1653(this, n26, (k == method27224 - 1) ? this.field25445 : (n26 + n23), n4, n2, n5, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class6362.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (long n27 = 0L; n27 < this.field25445; ++n27) {
                final long n28 = (this.field25445 - n27) % this.field25445 * n4;
                final long n29 = n27 * n4;
                for (long n30 = 0L; n30 < this.field25447; ++n30) {
                    final long n31 = (this.field25447 - n30) % this.field25447 * n5;
                    final long n32 = n30 * n5;
                    for (long n33 = 1L; n33 < this.field25449; n33 += 2L) {
                        final long n34 = n28 + n31 + n - n33;
                        final long n35 = n29 + n32 + n33;
                        class22.method169(n34, -class22.method135(n35 + 2L));
                        class22.method169(n34 - 1L, class22.method135(n35 + 1L));
                    }
                }
            }
            for (long n36 = 0L; n36 < this.field25445; ++n36) {
                final long n37 = (this.field25445 - n36) % this.field25445 * n4;
                final long n38 = n36 * n4;
                for (long n39 = 1L; n39 < n2; ++n39) {
                    final long n40 = n38 + (this.field25447 - n39) * n5;
                    final long n41 = n37 + n39 * n5 + this.field25449;
                    final long n42 = n40 + this.field25449;
                    final long n43 = n40 + 1L;
                    class22.method169(n41, class22.method135(n43));
                    class22.method169(n42, class22.method135(n43));
                    class22.method169(n41 + 1L, -class22.method135(n40));
                    class22.method169(n42 + 1L, class22.method135(n40));
                }
            }
            for (long n44 = 0L; n44 < this.field25445; ++n44) {
                final long n45 = (this.field25445 - n44) % this.field25445 * n4;
                final long n46 = n44 * n4;
                for (long n47 = 1L; n47 < n2; ++n47) {
                    final long n48 = n45 + (this.field25447 - n47) * n5;
                    final long n49 = n46 + n47 * n5;
                    class22.method169(n48, class22.method135(n49));
                    class22.method169(n48 + 1L, -class22.method135(n49 + 1L));
                }
            }
        }
        for (long n50 = 1L; n50 < n3; ++n50) {
            final long n51 = n50 * n4;
            final long n52 = (this.field25445 - n50) * n4;
            final long n53 = n2 * n5;
            final long n54 = n51 + n53;
            final long n55 = n52 + n53;
            class22.method169(n51 + this.field25449, class22.method135(n52 + 1L));
            class22.method169(n52 + this.field25449, class22.method135(n52 + 1L));
            class22.method169(n51 + this.field25449 + 1L, -class22.method135(n52));
            class22.method169(n52 + this.field25449 + 1L, class22.method135(n52));
            class22.method169(n54 + this.field25449, class22.method135(n55 + 1L));
            class22.method169(n55 + this.field25449, class22.method135(n55 + 1L));
            class22.method169(n54 + this.field25449 + 1L, -class22.method135(n55));
            class22.method169(n55 + this.field25449 + 1L, class22.method135(n55));
            class22.method169(n52, class22.method135(n51));
            class22.method169(n52 + 1L, -class22.method135(n51 + 1L));
            class22.method169(n55, class22.method135(n54));
            class22.method169(n55 + 1L, -class22.method135(n54 + 1L));
        }
        class22.method169(this.field25449, class22.method135(1L));
        class22.method169(1L, 0.0f);
        final long n56 = n2 * n5;
        final long n57 = n3 * n4;
        final long n58 = n56 + n57;
        class22.method169(n56 + this.field25449, class22.method135(n56 + 1L));
        class22.method169(n56 + 1L, 0.0f);
        class22.method169(n57 + this.field25449, class22.method135(n57 + 1L));
        class22.method169(n57 + 1L, 0.0f);
        class22.method169(n58 + this.field25449, class22.method135(n58 + 1L));
        class22.method169(n58 + 1L, 0.0f);
        class22.method169(n57 + this.field25449 + 1L, 0.0f);
        class22.method169(n58 + this.field25449 + 1L, 0.0f);
    }
}
