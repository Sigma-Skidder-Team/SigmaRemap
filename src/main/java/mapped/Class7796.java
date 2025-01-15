// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class7796
{
    private int field31942;
    private long field31943;
    private int field31944;
    private long field31945;
    private int field31946;
    private long field31947;
    private int field31948;
    private long field31949;
    private int field31950;
    private long field31951;
    private Class6062 field31952;
    private Class6062 field31953;
    private Class6062 field31954;
    private boolean field31955;
    private boolean field31956;
    
    public Class7796(final long field31943, final long field31944, final long n) {
        this.field31955 = false;
        this.field31956 = false;
        if (field31943 > 1L) {
            if (field31944 > 1L) {
                if (n > 1L) {
                    this.field31942 = (int)field31943;
                    this.field31944 = (int)field31944;
                    this.field31946 = (int)n;
                    this.field31943 = field31943;
                    this.field31945 = field31944;
                    this.field31947 = n;
                    this.field31948 = (int)(field31944 * n);
                    this.field31950 = (int)n;
                    this.field31949 = field31944 * n;
                    this.field31951 = n;
                    if (field31943 * field31944 * n >= Class9133.method33161()) {
                        this.field31956 = true;
                    }
                    if (Class9133.method33175(field31943)) {
                        if (Class9133.method33175(field31944)) {
                            if (Class9133.method33175(n)) {
                                this.field31955 = true;
                            }
                        }
                    }
                    Class9133.method33169(field31943 * field31944 * n > Class11.method177());
                    this.field31952 = new Class6062(field31943);
                    if (field31943 != field31944) {
                        this.field31953 = new Class6062(field31944);
                    }
                    else {
                        this.field31953 = this.field31952;
                    }
                    if (field31943 != n) {
                        if (field31944 != n) {
                            this.field31954 = new Class6062(n);
                        }
                        else {
                            this.field31954 = this.field31953;
                        }
                    }
                    else {
                        this.field31954 = this.field31952;
                    }
                    return;
                }
            }
        }
        throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
    }
    
    public void method25125(final double[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field31955) {
            if (method27224 > 1 && this.field31956) {
                this.method25137(-1, array, b);
                this.method25140(-1, array, b);
            }
            else {
                this.method25131(-1, array, b);
                this.method25134(-1, array, b);
            }
        }
        else if (method27224 > 1 && this.field31956 && this.field31942 >= method27224 && this.field31944 >= method27224 && this.field31946 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field31942 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1417(this, n2, (i == method27224 - 1) ? this.field31942 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1629(this, n3, (j == method27224 - 1) ? this.field31942 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field31944 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1193(this, n5, (k == method27224 - 1) ? this.field31944 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field31942; ++l) {
                final int n6 = l * this.field31948;
                for (int n7 = 0; n7 < this.field31944; ++n7) {
                    this.field31954.method18038(array, n6 + n7 * this.field31950, b);
                }
            }
            final double[] array3 = new double[this.field31944];
            for (int n8 = 0; n8 < this.field31942; ++n8) {
                final int n9 = n8 * this.field31948;
                for (int n10 = 0; n10 < this.field31946; ++n10) {
                    for (int n11 = 0; n11 < this.field31944; ++n11) {
                        array3[n11] = array[n9 + n11 * this.field31950 + n10];
                    }
                    this.field31953.method18036(array3, b);
                    for (int n12 = 0; n12 < this.field31944; ++n12) {
                        array[n9 + n12 * this.field31950 + n10] = array3[n12];
                    }
                }
            }
            final double[] array4 = new double[this.field31942];
            for (int n13 = 0; n13 < this.field31944; ++n13) {
                final int n14 = n13 * this.field31950;
                for (int n15 = 0; n15 < this.field31946; ++n15) {
                    for (int n16 = 0; n16 < this.field31942; ++n16) {
                        array4[n16] = array[n16 * this.field31948 + n14 + n15];
                    }
                    this.field31952.method18036(array4, b);
                    for (int n17 = 0; n17 < this.field31942; ++n17) {
                        array[n17 * this.field31948 + n14 + n15] = array4[n17];
                    }
                }
            }
        }
    }
    
    public void method25126(final Class17 class17, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field31955) {
            if (method27224 > 1 && this.field31956) {
                this.method25138(-1, class17, b);
                this.method25141(-1, class17, b);
            }
            else {
                this.method25132(-1, class17, b);
                this.method25135(-1, class17, b);
            }
        }
        else if (method27224 > 1 && this.field31956 && this.field31943 >= method27224 && this.field31945 >= method27224 && this.field31947 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n = this.field31943 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n2 = i * n;
                array[i] = Class8216.method27227(new Class1473(this, n2, (i == method27224 - 1) ? this.field31943 : (n2 + n), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final long n3 = j * n;
                array[j] = Class8216.method27227(new Class1384(this, n3, (j == method27224 - 1) ? this.field31943 : (n3 + n), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final long n4 = this.field31945 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final long n5 = k * n4;
                array[k] = Class8216.method27227(new Class1527(this, n5, (k == method27224 - 1) ? this.field31945 : (n5 + n4), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field31943; ++n6) {
                final long n7 = n6 * this.field31949;
                for (long n8 = 0L; n8 < this.field31945; ++n8) {
                    this.field31954.method18039(class17, n7 + n8 * this.field31951, b);
                }
            }
            final Class17 class18 = new Class17(this.field31945, false);
            for (long n9 = 0L; n9 < this.field31943; ++n9) {
                final long n10 = n9 * this.field31949;
                for (long n11 = 0L; n11 < this.field31947; ++n11) {
                    for (long n12 = 0L; n12 < this.field31945; ++n12) {
                        class18.method171(n12, class17.method137(n10 + n12 * this.field31951 + n11));
                    }
                    this.field31953.method18037(class18, b);
                    for (long n13 = 0L; n13 < this.field31945; ++n13) {
                        class17.method171(n10 + n13 * this.field31951 + n11, class18.method137(n13));
                    }
                }
            }
            final Class17 class19 = new Class17(this.field31943, false);
            for (long n14 = 0L; n14 < this.field31945; ++n14) {
                final long n15 = n14 * this.field31951;
                for (long n16 = 0L; n16 < this.field31947; ++n16) {
                    for (long n17 = 0L; n17 < this.field31943; ++n17) {
                        class19.method171(n17, class17.method137(n17 * this.field31949 + n15 + n16));
                    }
                    this.field31952.method18037(class19, b);
                    for (long n18 = 0L; n18 < this.field31943; ++n18) {
                        class17.method171(n18 * this.field31949 + n15 + n16, class19.method137(n18));
                    }
                }
            }
        }
    }
    
    public void method25127(final double[][][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field31955) {
            if (method27224 > 1 && this.field31956) {
                this.method25139(-1, array, b);
                this.method25142(-1, array, b);
            }
            else {
                this.method25133(-1, array, b);
                this.method25136(-1, array, b);
            }
        }
        else if (method27224 > 1 && this.field31956 && this.field31942 >= method27224 && this.field31944 >= method27224 && this.field31946 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field31942 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1128(this, n2, (i == method27224 - 1) ? this.field31942 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1061(this, n3, (j == method27224 - 1) ? this.field31942 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field31944 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1222(this, n5, (k == method27224 - 1) ? this.field31944 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field31942; ++l) {
                for (int n6 = 0; n6 < this.field31944; ++n6) {
                    this.field31954.method18036(array[l][n6], b);
                }
            }
            final double[] array3 = new double[this.field31944];
            for (int n7 = 0; n7 < this.field31942; ++n7) {
                for (int n8 = 0; n8 < this.field31946; ++n8) {
                    for (int n9 = 0; n9 < this.field31944; ++n9) {
                        array3[n9] = array[n7][n9][n8];
                    }
                    this.field31953.method18036(array3, b);
                    for (int n10 = 0; n10 < this.field31944; ++n10) {
                        array[n7][n10][n8] = array3[n10];
                    }
                }
            }
            final double[] array4 = new double[this.field31942];
            for (int n11 = 0; n11 < this.field31944; ++n11) {
                for (int n12 = 0; n12 < this.field31946; ++n12) {
                    for (int n13 = 0; n13 < this.field31942; ++n13) {
                        array4[n13] = array[n13][n11][n12];
                    }
                    this.field31952.method18036(array4, b);
                    for (int n14 = 0; n14 < this.field31942; ++n14) {
                        array[n14][n11][n12] = array4[n14];
                    }
                }
            }
        }
    }
    
    public void method25128(final double[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field31955) {
            if (method27224 > 1 && this.field31956) {
                this.method25137(1, array, b);
                this.method25140(1, array, b);
            }
            else {
                this.method25131(1, array, b);
                this.method25134(1, array, b);
            }
        }
        else if (method27224 > 1 && this.field31956 && this.field31942 >= method27224 && this.field31944 >= method27224 && this.field31946 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field31942 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1589(this, n2, (i == method27224 - 1) ? this.field31942 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class881(this, n3, (j == method27224 - 1) ? this.field31942 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field31944 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1246(this, n5, (k == method27224 - 1) ? this.field31944 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field31942; ++l) {
                final int n6 = l * this.field31948;
                for (int n7 = 0; n7 < this.field31944; ++n7) {
                    this.field31954.method18042(array, n6 + n7 * this.field31950, b);
                }
            }
            final double[] array3 = new double[this.field31944];
            for (int n8 = 0; n8 < this.field31942; ++n8) {
                final int n9 = n8 * this.field31948;
                for (int n10 = 0; n10 < this.field31946; ++n10) {
                    for (int n11 = 0; n11 < this.field31944; ++n11) {
                        array3[n11] = array[n9 + n11 * this.field31950 + n10];
                    }
                    this.field31953.method18040(array3, b);
                    for (int n12 = 0; n12 < this.field31944; ++n12) {
                        array[n9 + n12 * this.field31950 + n10] = array3[n12];
                    }
                }
            }
            final double[] array4 = new double[this.field31942];
            for (int n13 = 0; n13 < this.field31944; ++n13) {
                final int n14 = n13 * this.field31950;
                for (int n15 = 0; n15 < this.field31946; ++n15) {
                    for (int n16 = 0; n16 < this.field31942; ++n16) {
                        array4[n16] = array[n16 * this.field31948 + n14 + n15];
                    }
                    this.field31952.method18040(array4, b);
                    for (int n17 = 0; n17 < this.field31942; ++n17) {
                        array[n17 * this.field31948 + n14 + n15] = array4[n17];
                    }
                }
            }
        }
    }
    
    public void method25129(final Class17 class17, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field31955) {
            if (method27224 > 1 && this.field31956) {
                this.method25138(1, class17, b);
                this.method25141(1, class17, b);
            }
            else {
                this.method25132(1, class17, b);
                this.method25135(1, class17, b);
            }
        }
        else if (method27224 > 1 && this.field31956 && this.field31943 >= method27224 && this.field31945 >= method27224 && this.field31947 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n = this.field31943 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n2 = i * n;
                array[i] = Class8216.method27227(new Class1538(this, n2, (i == method27224 - 1) ? this.field31943 : (n2 + n), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final long n3 = j * n;
                array[j] = Class8216.method27227(new Class1403(this, n3, (j == method27224 - 1) ? this.field31943 : (n3 + n), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final long n4 = this.field31945 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final long n5 = k * n4;
                array[k] = Class8216.method27227(new Class1085(this, n5, (k == method27224 - 1) ? this.field31945 : (n5 + n4), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field31943; ++n6) {
                final long n7 = n6 * this.field31949;
                for (long n8 = 0L; n8 < this.field31945; ++n8) {
                    this.field31954.method18043(class17, n7 + n8 * this.field31951, b);
                }
            }
            final Class17 class18 = new Class17(this.field31945, false);
            for (long n9 = 0L; n9 < this.field31943; ++n9) {
                final long n10 = n9 * this.field31949;
                for (long n11 = 0L; n11 < this.field31947; ++n11) {
                    for (long n12 = 0L; n12 < this.field31945; ++n12) {
                        class18.method171(n12, class17.method137(n10 + n12 * this.field31951 + n11));
                    }
                    this.field31953.method18041(class18, b);
                    for (long n13 = 0L; n13 < this.field31945; ++n13) {
                        class17.method171(n10 + n13 * this.field31951 + n11, class18.method137(n13));
                    }
                }
            }
            final Class17 class19 = new Class17(this.field31943, false);
            for (long n14 = 0L; n14 < this.field31945; ++n14) {
                final long n15 = n14 * this.field31951;
                for (long n16 = 0L; n16 < this.field31947; ++n16) {
                    for (long n17 = 0L; n17 < this.field31943; ++n17) {
                        class19.method171(n17, class17.method137(n17 * this.field31949 + n15 + n16));
                    }
                    this.field31952.method18041(class19, b);
                    for (long n18 = 0L; n18 < this.field31943; ++n18) {
                        class17.method171(n18 * this.field31949 + n15 + n16, class19.method137(n18));
                    }
                }
            }
        }
    }
    
    public void method25130(final double[][][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field31955) {
            if (method27224 > 1 && this.field31956) {
                this.method25139(1, array, b);
                this.method25142(1, array, b);
            }
            else {
                this.method25133(1, array, b);
                this.method25136(1, array, b);
            }
        }
        else if (method27224 > 1 && this.field31956 && this.field31942 >= method27224 && this.field31944 >= method27224 && this.field31946 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field31942 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1553(this, n2, (i == method27224 - 1) ? this.field31942 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1380(this, n3, (j == method27224 - 1) ? this.field31942 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field31944 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1285(this, n5, (k == method27224 - 1) ? this.field31944 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field31942; ++l) {
                for (int n6 = 0; n6 < this.field31944; ++n6) {
                    this.field31954.method18040(array[l][n6], b);
                }
            }
            final double[] array3 = new double[this.field31944];
            for (int n7 = 0; n7 < this.field31942; ++n7) {
                for (int n8 = 0; n8 < this.field31946; ++n8) {
                    for (int n9 = 0; n9 < this.field31944; ++n9) {
                        array3[n9] = array[n7][n9][n8];
                    }
                    this.field31953.method18040(array3, b);
                    for (int n10 = 0; n10 < this.field31944; ++n10) {
                        array[n7][n10][n8] = array3[n10];
                    }
                }
            }
            final double[] array4 = new double[this.field31942];
            for (int n11 = 0; n11 < this.field31944; ++n11) {
                for (int n12 = 0; n12 < this.field31946; ++n12) {
                    for (int n13 = 0; n13 < this.field31942; ++n13) {
                        array4[n13] = array[n13][n11][n12];
                    }
                    this.field31952.method18040(array4, b);
                    for (int n14 = 0; n14 < this.field31942; ++n14) {
                        array[n14][n11][n12] = array4[n14];
                    }
                }
            }
        }
    }
    
    private void method25131(final int n, final double[] array, final boolean b) {
        int n2 = 4 * this.field31944;
        if (this.field31946 == 2) {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            for (int i = 0; i < this.field31942; ++i) {
                final int n3 = i * this.field31948;
                for (int j = 0; j < this.field31944; ++j) {
                    this.field31954.method18042(array, n3 + j * this.field31950, b);
                }
                if (this.field31946 <= 2) {
                    if (this.field31946 == 2) {
                        for (int k = 0; k < this.field31944; ++k) {
                            final int n4 = n3 + k * this.field31950;
                            array2[k] = array[n4];
                            array2[this.field31944 + k] = array[n4 + 1];
                        }
                        this.field31953.method18042(array2, 0, b);
                        this.field31953.method18042(array2, this.field31944, b);
                        for (int l = 0; l < this.field31944; ++l) {
                            final int n5 = n3 + l * this.field31950;
                            array[n5] = array2[l];
                            array[n5 + 1] = array2[this.field31944 + l];
                        }
                    }
                }
                else {
                    for (int n6 = 0; n6 < this.field31946; n6 += 4) {
                        for (int n7 = 0; n7 < this.field31944; ++n7) {
                            final int n8 = n3 + n7 * this.field31950 + n6;
                            final int n9 = this.field31944 + n7;
                            array2[n7] = array[n8];
                            array2[n9] = array[n8 + 1];
                            array2[n9 + this.field31944] = array[n8 + 2];
                            array2[n9 + 2 * this.field31944] = array[n8 + 3];
                        }
                        this.field31953.method18042(array2, 0, b);
                        this.field31953.method18042(array2, this.field31944, b);
                        this.field31953.method18042(array2, 2 * this.field31944, b);
                        this.field31953.method18042(array2, 3 * this.field31944, b);
                        for (int n10 = 0; n10 < this.field31944; ++n10) {
                            final int n11 = n3 + n10 * this.field31950 + n6;
                            final int n12 = this.field31944 + n10;
                            array[n11] = array2[n10];
                            array[n11 + 1] = array2[n12];
                            array[n11 + 2] = array2[n12 + this.field31944];
                            array[n11 + 3] = array2[n12 + 2 * this.field31944];
                        }
                    }
                }
            }
        }
        else {
            for (int n13 = 0; n13 < this.field31942; ++n13) {
                final int n14 = n13 * this.field31948;
                for (int n15 = 0; n15 < this.field31944; ++n15) {
                    this.field31954.method18038(array, n14 + n15 * this.field31950, b);
                }
                if (this.field31946 <= 2) {
                    if (this.field31946 == 2) {
                        for (int n16 = 0; n16 < this.field31944; ++n16) {
                            final int n17 = n14 + n16 * this.field31950;
                            array2[n16] = array[n17];
                            array2[this.field31944 + n16] = array[n17 + 1];
                        }
                        this.field31953.method18038(array2, 0, b);
                        this.field31953.method18038(array2, this.field31944, b);
                        for (int n18 = 0; n18 < this.field31944; ++n18) {
                            final int n19 = n14 + n18 * this.field31950;
                            array[n19] = array2[n18];
                            array[n19 + 1] = array2[this.field31944 + n18];
                        }
                    }
                }
                else {
                    for (int n20 = 0; n20 < this.field31946; n20 += 4) {
                        for (int n21 = 0; n21 < this.field31944; ++n21) {
                            final int n22 = n14 + n21 * this.field31950 + n20;
                            final int n23 = this.field31944 + n21;
                            array2[n21] = array[n22];
                            array2[n23] = array[n22 + 1];
                            array2[n23 + this.field31944] = array[n22 + 2];
                            array2[n23 + 2 * this.field31944] = array[n22 + 3];
                        }
                        this.field31953.method18038(array2, 0, b);
                        this.field31953.method18038(array2, this.field31944, b);
                        this.field31953.method18038(array2, 2 * this.field31944, b);
                        this.field31953.method18038(array2, 3 * this.field31944, b);
                        for (int n24 = 0; n24 < this.field31944; ++n24) {
                            final int n25 = n14 + n24 * this.field31950 + n20;
                            final int n26 = this.field31944 + n24;
                            array[n25] = array2[n24];
                            array[n25 + 1] = array2[n26];
                            array[n25 + 2] = array2[n26 + this.field31944];
                            array[n25 + 3] = array2[n26 + 2 * this.field31944];
                        }
                    }
                }
            }
        }
    }
    
    private void method25132(final int n, final Class17 class17, final boolean b) {
        long n2 = 4L * this.field31945;
        if (this.field31947 == 2L) {
            n2 >>= 1;
        }
        final Class17 class18 = new Class17(n2);
        if (n != -1) {
            for (long n3 = 0L; n3 < this.field31943; ++n3) {
                final long n4 = n3 * this.field31949;
                for (long n5 = 0L; n5 < this.field31945; ++n5) {
                    this.field31954.method18043(class17, n4 + n5 * this.field31951, b);
                }
                if (this.field31947 <= 2L) {
                    if (this.field31947 == 2L) {
                        for (long n6 = 0L; n6 < this.field31945; ++n6) {
                            final long n7 = n4 + n6 * this.field31951;
                            class18.method171(n6, class17.method137(n7));
                            class18.method171(this.field31945 + n6, class17.method137(n7 + 1L));
                        }
                        this.field31953.method18043(class18, 0L, b);
                        this.field31953.method18043(class18, this.field31945, b);
                        for (long n8 = 0L; n8 < this.field31945; ++n8) {
                            final long n9 = n4 + n8 * this.field31951;
                            class17.method171(n9, class18.method137(n8));
                            class17.method171(n9 + 1L, class18.method137(this.field31945 + n8));
                        }
                    }
                }
                else {
                    for (long n10 = 0L; n10 < this.field31947; n10 += 4L) {
                        for (long n11 = 0L; n11 < this.field31945; ++n11) {
                            final long n12 = n4 + n11 * this.field31951 + n10;
                            final long n13 = this.field31945 + n11;
                            class18.method171(n11, class17.method137(n12));
                            class18.method171(n13, class17.method137(n12 + 1L));
                            class18.method171(n13 + this.field31945, class17.method137(n12 + 2L));
                            class18.method171(n13 + 2L * this.field31945, class17.method137(n12 + 3L));
                        }
                        this.field31953.method18043(class18, 0L, b);
                        this.field31953.method18043(class18, this.field31945, b);
                        this.field31953.method18043(class18, 2L * this.field31945, b);
                        this.field31953.method18043(class18, 3L * this.field31945, b);
                        for (long n14 = 0L; n14 < this.field31945; ++n14) {
                            final long n15 = n4 + n14 * this.field31951 + n10;
                            final long n16 = this.field31945 + n14;
                            class17.method171(n15, class18.method137(n14));
                            class17.method171(n15 + 1L, class18.method137(n16));
                            class17.method171(n15 + 2L, class18.method137(n16 + this.field31945));
                            class17.method171(n15 + 3L, class18.method137(n16 + 2L * this.field31945));
                        }
                    }
                }
            }
        }
        else {
            for (long n17 = 0L; n17 < this.field31943; ++n17) {
                final long n18 = n17 * this.field31949;
                for (long n19 = 0L; n19 < this.field31945; ++n19) {
                    this.field31954.method18039(class17, n18 + n19 * this.field31951, b);
                }
                if (this.field31947 <= 2L) {
                    if (this.field31947 == 2L) {
                        for (long n20 = 0L; n20 < this.field31945; ++n20) {
                            final long n21 = n18 + n20 * this.field31951;
                            class18.method171(n20, class17.method137(n21));
                            class18.method171(this.field31945 + n20, class17.method137(n21 + 1L));
                        }
                        this.field31953.method18039(class18, 0L, b);
                        this.field31953.method18039(class18, this.field31945, b);
                        for (long n22 = 0L; n22 < this.field31945; ++n22) {
                            final long n23 = n18 + n22 * this.field31951;
                            class17.method171(n23, class18.method137(n22));
                            class17.method171(n23 + 1L, class18.method137(this.field31945 + n22));
                        }
                    }
                }
                else {
                    for (long n24 = 0L; n24 < this.field31947; n24 += 4L) {
                        for (long n25 = 0L; n25 < this.field31945; ++n25) {
                            final long n26 = n18 + n25 * this.field31951 + n24;
                            final long n27 = this.field31945 + n25;
                            class18.method171(n25, class17.method137(n26));
                            class18.method171(n27, class17.method137(n26 + 1L));
                            class18.method171(n27 + this.field31945, class17.method137(n26 + 2L));
                            class18.method171(n27 + 2L * this.field31945, class17.method137(n26 + 3L));
                        }
                        this.field31953.method18039(class18, 0L, b);
                        this.field31953.method18039(class18, this.field31945, b);
                        this.field31953.method18039(class18, 2L * this.field31945, b);
                        this.field31953.method18039(class18, 3L * this.field31945, b);
                        for (long n28 = 0L; n28 < this.field31945; ++n28) {
                            final long n29 = n18 + n28 * this.field31951 + n24;
                            final long n30 = this.field31945 + n28;
                            class17.method171(n29, class18.method137(n28));
                            class17.method171(n29 + 1L, class18.method137(n30));
                            class17.method171(n29 + 2L, class18.method137(n30 + this.field31945));
                            class17.method171(n29 + 3L, class18.method137(n30 + 2L * this.field31945));
                        }
                    }
                }
            }
        }
    }
    
    private void method25133(final int n, final double[][][] array, final boolean b) {
        int n2 = 4 * this.field31944;
        if (this.field31946 == 2) {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            for (int i = 0; i < this.field31942; ++i) {
                for (int j = 0; j < this.field31944; ++j) {
                    this.field31954.method18040(array[i][j], b);
                }
                if (this.field31946 <= 2) {
                    if (this.field31946 == 2) {
                        for (int k = 0; k < this.field31944; ++k) {
                            array2[k] = array[i][k][0];
                            array2[this.field31944 + k] = array[i][k][1];
                        }
                        this.field31953.method18042(array2, 0, b);
                        this.field31953.method18042(array2, this.field31944, b);
                        for (int l = 0; l < this.field31944; ++l) {
                            array[i][l][0] = array2[l];
                            array[i][l][1] = array2[this.field31944 + l];
                        }
                    }
                }
                else {
                    for (int n3 = 0; n3 < this.field31946; n3 += 4) {
                        for (int n4 = 0; n4 < this.field31944; ++n4) {
                            final int n5 = this.field31944 + n4;
                            array2[n4] = array[i][n4][n3];
                            array2[n5] = array[i][n4][n3 + 1];
                            array2[n5 + this.field31944] = array[i][n4][n3 + 2];
                            array2[n5 + 2 * this.field31944] = array[i][n4][n3 + 3];
                        }
                        this.field31953.method18042(array2, 0, b);
                        this.field31953.method18042(array2, this.field31944, b);
                        this.field31953.method18042(array2, 2 * this.field31944, b);
                        this.field31953.method18042(array2, 3 * this.field31944, b);
                        for (int n6 = 0; n6 < this.field31944; ++n6) {
                            final int n7 = this.field31944 + n6;
                            array[i][n6][n3] = array2[n6];
                            array[i][n6][n3 + 1] = array2[n7];
                            array[i][n6][n3 + 2] = array2[n7 + this.field31944];
                            array[i][n6][n3 + 3] = array2[n7 + 2 * this.field31944];
                        }
                    }
                }
            }
        }
        else {
            for (int n8 = 0; n8 < this.field31942; ++n8) {
                for (int n9 = 0; n9 < this.field31944; ++n9) {
                    this.field31954.method18036(array[n8][n9], b);
                }
                if (this.field31946 <= 2) {
                    if (this.field31946 == 2) {
                        for (int n10 = 0; n10 < this.field31944; ++n10) {
                            array2[n10] = array[n8][n10][0];
                            array2[this.field31944 + n10] = array[n8][n10][1];
                        }
                        this.field31953.method18038(array2, 0, b);
                        this.field31953.method18038(array2, this.field31944, b);
                        for (int n11 = 0; n11 < this.field31944; ++n11) {
                            array[n8][n11][0] = array2[n11];
                            array[n8][n11][1] = array2[this.field31944 + n11];
                        }
                    }
                }
                else {
                    for (int n12 = 0; n12 < this.field31946; n12 += 4) {
                        for (int n13 = 0; n13 < this.field31944; ++n13) {
                            final int n14 = this.field31944 + n13;
                            array2[n13] = array[n8][n13][n12];
                            array2[n14] = array[n8][n13][n12 + 1];
                            array2[n14 + this.field31944] = array[n8][n13][n12 + 2];
                            array2[n14 + 2 * this.field31944] = array[n8][n13][n12 + 3];
                        }
                        this.field31953.method18038(array2, 0, b);
                        this.field31953.method18038(array2, this.field31944, b);
                        this.field31953.method18038(array2, 2 * this.field31944, b);
                        this.field31953.method18038(array2, 3 * this.field31944, b);
                        for (int n15 = 0; n15 < this.field31944; ++n15) {
                            final int n16 = this.field31944 + n15;
                            array[n8][n15][n12] = array2[n15];
                            array[n8][n15][n12 + 1] = array2[n16];
                            array[n8][n15][n12 + 2] = array2[n16 + this.field31944];
                            array[n8][n15][n12 + 3] = array2[n16 + 2 * this.field31944];
                        }
                    }
                }
            }
        }
    }
    
    private void method25134(final int n, final double[] array, final boolean b) {
        int n2 = 4 * this.field31942;
        if (this.field31946 == 2) {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            if (this.field31946 <= 2) {
                if (this.field31946 == 2) {
                    for (int i = 0; i < this.field31944; ++i) {
                        final int n3 = i * this.field31950;
                        for (int j = 0; j < this.field31942; ++j) {
                            final int n4 = j * this.field31948 + n3;
                            array2[j] = array[n4];
                            array2[this.field31942 + j] = array[n4 + 1];
                        }
                        this.field31952.method18042(array2, 0, b);
                        this.field31952.method18042(array2, this.field31942, b);
                        for (int k = 0; k < this.field31942; ++k) {
                            final int n5 = k * this.field31948 + n3;
                            array[n5] = array2[k];
                            array[n5 + 1] = array2[this.field31942 + k];
                        }
                    }
                }
            }
            else {
                for (int l = 0; l < this.field31944; ++l) {
                    final int n6 = l * this.field31950;
                    for (int n7 = 0; n7 < this.field31946; n7 += 4) {
                        for (int n8 = 0; n8 < this.field31942; ++n8) {
                            final int n9 = n8 * this.field31948 + n6 + n7;
                            final int n10 = this.field31942 + n8;
                            array2[n8] = array[n9];
                            array2[n10] = array[n9 + 1];
                            array2[n10 + this.field31942] = array[n9 + 2];
                            array2[n10 + 2 * this.field31942] = array[n9 + 3];
                        }
                        this.field31952.method18042(array2, 0, b);
                        this.field31952.method18042(array2, this.field31942, b);
                        this.field31952.method18042(array2, 2 * this.field31942, b);
                        this.field31952.method18042(array2, 3 * this.field31942, b);
                        for (int n11 = 0; n11 < this.field31942; ++n11) {
                            final int n12 = n11 * this.field31948 + n6 + n7;
                            final int n13 = this.field31942 + n11;
                            array[n12] = array2[n11];
                            array[n12 + 1] = array2[n13];
                            array[n12 + 2] = array2[n13 + this.field31942];
                            array[n12 + 3] = array2[n13 + 2 * this.field31942];
                        }
                    }
                }
            }
        }
        else if (this.field31946 <= 2) {
            if (this.field31946 == 2) {
                for (int n14 = 0; n14 < this.field31944; ++n14) {
                    final int n15 = n14 * this.field31950;
                    for (int n16 = 0; n16 < this.field31942; ++n16) {
                        final int n17 = n16 * this.field31948 + n15;
                        array2[n16] = array[n17];
                        array2[this.field31942 + n16] = array[n17 + 1];
                    }
                    this.field31952.method18038(array2, 0, b);
                    this.field31952.method18038(array2, this.field31942, b);
                    for (int n18 = 0; n18 < this.field31942; ++n18) {
                        final int n19 = n18 * this.field31948 + n15;
                        array[n19] = array2[n18];
                        array[n19 + 1] = array2[this.field31942 + n18];
                    }
                }
            }
        }
        else {
            for (int n20 = 0; n20 < this.field31944; ++n20) {
                final int n21 = n20 * this.field31950;
                for (int n22 = 0; n22 < this.field31946; n22 += 4) {
                    for (int n23 = 0; n23 < this.field31942; ++n23) {
                        final int n24 = n23 * this.field31948 + n21 + n22;
                        final int n25 = this.field31942 + n23;
                        array2[n23] = array[n24];
                        array2[n25] = array[n24 + 1];
                        array2[n25 + this.field31942] = array[n24 + 2];
                        array2[n25 + 2 * this.field31942] = array[n24 + 3];
                    }
                    this.field31952.method18038(array2, 0, b);
                    this.field31952.method18038(array2, this.field31942, b);
                    this.field31952.method18038(array2, 2 * this.field31942, b);
                    this.field31952.method18038(array2, 3 * this.field31942, b);
                    for (int n26 = 0; n26 < this.field31942; ++n26) {
                        final int n27 = n26 * this.field31948 + n21 + n22;
                        final int n28 = this.field31942 + n26;
                        array[n27] = array2[n26];
                        array[n27 + 1] = array2[n28];
                        array[n27 + 2] = array2[n28 + this.field31942];
                        array[n27 + 3] = array2[n28 + 2 * this.field31942];
                    }
                }
            }
        }
    }
    
    private void method25135(final int n, final Class17 class17, final boolean b) {
        long n2 = 4L * this.field31943;
        if (this.field31947 == 2L) {
            n2 >>= 1;
        }
        final Class17 class18 = new Class17(n2);
        if (n != -1) {
            if (this.field31947 <= 2L) {
                if (this.field31947 == 2L) {
                    for (long n3 = 0L; n3 < this.field31945; ++n3) {
                        final long n4 = n3 * this.field31951;
                        for (long n5 = 0L; n5 < this.field31943; ++n5) {
                            final long n6 = n5 * this.field31949 + n4;
                            class18.method171(n5, class17.method137(n6));
                            class18.method171(this.field31943 + n5, class17.method137(n6 + 1L));
                        }
                        this.field31952.method18043(class18, 0L, b);
                        this.field31952.method18043(class18, this.field31943, b);
                        for (long n7 = 0L; n7 < this.field31943; ++n7) {
                            final long n8 = n7 * this.field31949 + n4;
                            class17.method171(n8, class18.method137(n7));
                            class17.method171(n8 + 1L, class18.method137(this.field31943 + n7));
                        }
                    }
                }
            }
            else {
                for (long n9 = 0L; n9 < this.field31945; ++n9) {
                    final long n10 = n9 * this.field31951;
                    for (long n11 = 0L; n11 < this.field31947; n11 += 4L) {
                        for (long n12 = 0L; n12 < this.field31943; ++n12) {
                            final long n13 = n12 * this.field31949 + n10 + n11;
                            final long n14 = this.field31943 + n12;
                            class18.method171(n12, class17.method137(n13));
                            class18.method171(n14, class17.method137(n13 + 1L));
                            class18.method171(n14 + this.field31943, class17.method137(n13 + 2L));
                            class18.method171(n14 + 2L * this.field31943, class17.method137(n13 + 3L));
                        }
                        this.field31952.method18043(class18, 0L, b);
                        this.field31952.method18043(class18, this.field31943, b);
                        this.field31952.method18043(class18, 2L * this.field31943, b);
                        this.field31952.method18043(class18, 3L * this.field31943, b);
                        for (long n15 = 0L; n15 < this.field31943; ++n15) {
                            final long n16 = n15 * this.field31949 + n10 + n11;
                            final long n17 = this.field31943 + n15;
                            class17.method171(n16, class18.method137(n15));
                            class17.method171(n16 + 1L, class18.method137(n17));
                            class17.method171(n16 + 2L, class18.method137(n17 + this.field31943));
                            class17.method171(n16 + 3L, class18.method137(n17 + 2L * this.field31943));
                        }
                    }
                }
            }
        }
        else if (this.field31947 <= 2L) {
            if (this.field31947 == 2L) {
                for (long n18 = 0L; n18 < this.field31945; ++n18) {
                    final long n19 = n18 * this.field31951;
                    for (long n20 = 0L; n20 < this.field31943; ++n20) {
                        final long n21 = n20 * this.field31949 + n19;
                        class18.method171(n20, class17.method137(n21));
                        class18.method171(this.field31943 + n20, class17.method137(n21 + 1L));
                    }
                    this.field31952.method18039(class18, 0L, b);
                    this.field31952.method18039(class18, this.field31943, b);
                    for (long n22 = 0L; n22 < this.field31943; ++n22) {
                        final long n23 = n22 * this.field31949 + n19;
                        class17.method171(n23, class18.method137(n22));
                        class17.method171(n23 + 1L, class18.method137(this.field31943 + n22));
                    }
                }
            }
        }
        else {
            for (long n24 = 0L; n24 < this.field31945; ++n24) {
                final long n25 = n24 * this.field31951;
                for (long n26 = 0L; n26 < this.field31947; n26 += 4L) {
                    for (long n27 = 0L; n27 < this.field31943; ++n27) {
                        final long n28 = n27 * this.field31949 + n25 + n26;
                        final long n29 = this.field31943 + n27;
                        class18.method171(n27, class17.method137(n28));
                        class18.method171(n29, class17.method137(n28 + 1L));
                        class18.method171(n29 + this.field31943, class17.method137(n28 + 2L));
                        class18.method171(n29 + 2L * this.field31943, class17.method137(n28 + 3L));
                    }
                    this.field31952.method18039(class18, 0L, b);
                    this.field31952.method18039(class18, this.field31943, b);
                    this.field31952.method18039(class18, 2L * this.field31943, b);
                    this.field31952.method18039(class18, 3L * this.field31943, b);
                    for (long n30 = 0L; n30 < this.field31943; ++n30) {
                        final long n31 = n30 * this.field31949 + n25 + n26;
                        final long n32 = this.field31943 + n30;
                        class17.method171(n31, class18.method137(n30));
                        class17.method171(n31 + 1L, class18.method137(n32));
                        class17.method171(n31 + 2L, class18.method137(n32 + this.field31943));
                        class17.method171(n31 + 3L, class18.method137(n32 + 2L * this.field31943));
                    }
                }
            }
        }
    }
    
    private void method25136(final int n, final double[][][] array, final boolean b) {
        int n2 = 4 * this.field31942;
        if (this.field31946 == 2) {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            if (this.field31946 <= 2) {
                if (this.field31946 == 2) {
                    for (int i = 0; i < this.field31944; ++i) {
                        for (int j = 0; j < this.field31942; ++j) {
                            array2[j] = array[j][i][0];
                            array2[this.field31942 + j] = array[j][i][1];
                        }
                        this.field31952.method18042(array2, 0, b);
                        this.field31952.method18042(array2, this.field31942, b);
                        for (int k = 0; k < this.field31942; ++k) {
                            array[k][i][0] = array2[k];
                            array[k][i][1] = array2[this.field31942 + k];
                        }
                    }
                }
            }
            else {
                for (int l = 0; l < this.field31944; ++l) {
                    for (int n3 = 0; n3 < this.field31946; n3 += 4) {
                        for (int n4 = 0; n4 < this.field31942; ++n4) {
                            final int n5 = this.field31942 + n4;
                            array2[n4] = array[n4][l][n3];
                            array2[n5] = array[n4][l][n3 + 1];
                            array2[n5 + this.field31942] = array[n4][l][n3 + 2];
                            array2[n5 + 2 * this.field31942] = array[n4][l][n3 + 3];
                        }
                        this.field31952.method18042(array2, 0, b);
                        this.field31952.method18042(array2, this.field31942, b);
                        this.field31952.method18042(array2, 2 * this.field31942, b);
                        this.field31952.method18042(array2, 3 * this.field31942, b);
                        for (int n6 = 0; n6 < this.field31942; ++n6) {
                            final int n7 = this.field31942 + n6;
                            array[n6][l][n3] = array2[n6];
                            array[n6][l][n3 + 1] = array2[n7];
                            array[n6][l][n3 + 2] = array2[n7 + this.field31942];
                            array[n6][l][n3 + 3] = array2[n7 + 2 * this.field31942];
                        }
                    }
                }
            }
        }
        else if (this.field31946 <= 2) {
            if (this.field31946 == 2) {
                for (int n8 = 0; n8 < this.field31944; ++n8) {
                    for (int n9 = 0; n9 < this.field31942; ++n9) {
                        array2[n9] = array[n9][n8][0];
                        array2[this.field31942 + n9] = array[n9][n8][1];
                    }
                    this.field31952.method18038(array2, 0, b);
                    this.field31952.method18038(array2, this.field31942, b);
                    for (int n10 = 0; n10 < this.field31942; ++n10) {
                        array[n10][n8][0] = array2[n10];
                        array[n10][n8][1] = array2[this.field31942 + n10];
                    }
                }
            }
        }
        else {
            for (int n11 = 0; n11 < this.field31944; ++n11) {
                for (int n12 = 0; n12 < this.field31946; n12 += 4) {
                    for (int n13 = 0; n13 < this.field31942; ++n13) {
                        final int n14 = this.field31942 + n13;
                        array2[n13] = array[n13][n11][n12];
                        array2[n14] = array[n13][n11][n12 + 1];
                        array2[n14 + this.field31942] = array[n13][n11][n12 + 2];
                        array2[n14 + 2 * this.field31942] = array[n13][n11][n12 + 3];
                    }
                    this.field31952.method18038(array2, 0, b);
                    this.field31952.method18038(array2, this.field31942, b);
                    this.field31952.method18038(array2, 2 * this.field31942, b);
                    this.field31952.method18038(array2, 3 * this.field31942, b);
                    for (int n15 = 0; n15 < this.field31942; ++n15) {
                        final int n16 = this.field31942 + n15;
                        array[n15][n11][n12] = array2[n15];
                        array[n15][n11][n12 + 1] = array2[n16];
                        array[n15][n11][n12 + 2] = array2[n16 + this.field31942];
                        array[n15][n11][n12 + 3] = array2[n16 + 2 * this.field31942];
                    }
                }
            }
        }
    }
    
    private void method25137(final int n, final double[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field31942) ? this.field31942 : Class8216.method27224();
        int n3 = 4 * this.field31944;
        if (this.field31946 == 2) {
            n3 >>= 1;
        }
        final Future[] array2 = new Future[n2];
        final int n4 = n3;
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1535(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method25138(final int n, final Class17 class17, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field31943) ? this.field31943 : Class8216.method27224());
        long n3 = 4L * this.field31945;
        if (this.field31947 == 2L) {
            n3 >>= 1;
        }
        final Future[] array = new Future[n2];
        final long n4 = n3;
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1208(this, n4, n, i, n2, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method25139(final int n, final double[][][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field31942) ? this.field31942 : Class8216.method27224();
        int n3 = 4 * this.field31944;
        if (this.field31946 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1437(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method25140(final int n, final double[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field31944) ? this.field31944 : Class8216.method27224();
        int n3 = 4 * this.field31942;
        if (this.field31946 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1400(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method25141(final int n, final Class17 class17, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field31945) ? this.field31945 : Class8216.method27224());
        long n3 = 4L * this.field31943;
        if (this.field31947 == 2L) {
            n3 >>= 1;
        }
        final long n4 = n3;
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1251(this, n4, n, i, n2, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method25142(final int n, final double[][][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field31944) ? this.field31944 : Class8216.method27224();
        int n3 = 4 * this.field31942;
        if (this.field31946 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1073(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
}
