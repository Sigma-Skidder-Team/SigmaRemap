// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class5815
{
    private final int field23887;
    private final long field23888;
    private final int field23889;
    private final long field23890;
    private final int field23891;
    private final long field23892;
    private final int field23893;
    private final long field23894;
    private final int field23895;
    private final long field23896;
    private final Class6970 field23897;
    private final Class6970 field23898;
    private final Class6970 field23899;
    private boolean field23900;
    private boolean field23901;
    
    public Class5815(final long field23888, final long field23889, final long n) {
        this.field23900 = false;
        this.field23901 = false;
        if (field23888 > 1L) {
            if (field23889 > 1L) {
                if (n > 1L) {
                    this.field23887 = (int)field23888;
                    this.field23889 = (int)field23889;
                    this.field23891 = (int)n;
                    this.field23888 = field23888;
                    this.field23890 = field23889;
                    this.field23892 = n;
                    this.field23893 = (int)(field23889 * n);
                    this.field23895 = (int)n;
                    this.field23894 = field23889 * n;
                    this.field23896 = n;
                    if (field23888 * field23889 * n >= Class9133.method33161()) {
                        this.field23901 = true;
                    }
                    if (Class9133.method33175(field23888)) {
                        if (Class9133.method33175(field23889)) {
                            if (Class9133.method33175(n)) {
                                this.field23900 = true;
                            }
                        }
                    }
                    Class9133.method33169(field23888 * field23889 * n > Class11.method177());
                    this.field23897 = new Class6970(field23888);
                    if (field23888 != field23889) {
                        this.field23898 = new Class6970(field23889);
                    }
                    else {
                        this.field23898 = this.field23897;
                    }
                    if (field23888 != n) {
                        if (field23889 != n) {
                            this.field23899 = new Class6970(n);
                        }
                        else {
                            this.field23899 = this.field23898;
                        }
                    }
                    else {
                        this.field23899 = this.field23897;
                    }
                    return;
                }
            }
        }
        throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
    }
    
    public void method17476(final double[] array) {
        final int method27224 = Class8216.method27224();
        if (this.field23900) {
            if (method27224 > 1 && this.field23901) {
                this.method17488(-1, array, true);
                this.method17491(-1, array, true);
            }
            else {
                this.method17482(-1, array, true);
                this.method17485(-1, array, true);
            }
            this.method17494(array);
        }
        else {
            if (method27224 > 1 && this.field23901 && this.field23887 >= method27224 && this.field23889 >= method27224 && this.field23891 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field23887 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final int n2 = i * n;
                    array2[i] = Class8216.method27227(new Class1145(this, n2, (i == method27224 - 1) ? this.field23887 : (n2 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n;
                    array2[j] = Class8216.method27227(new Class1356(this, n3, (j == method27224 - 1) ? this.field23887 : (n3 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final int n4 = this.field23889 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    int field23889;
                    if (k == method27224 - 1) {
                        field23889 = this.field23889;
                    }
                    else {
                        field23889 = n5 + n4;
                    }
                    array2[k] = Class8216.method27227(new Class1187(this, n5, field23889, array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (int l = 0; l < this.field23887; ++l) {
                    final int n6 = l * this.field23893;
                    for (int n7 = 0; n7 < this.field23889; ++n7) {
                        this.field23899.method21388(array, n6 + n7 * this.field23895);
                    }
                }
                final double[] array3 = new double[this.field23889];
                for (int n8 = 0; n8 < this.field23887; ++n8) {
                    final int n9 = n8 * this.field23893;
                    for (int n10 = 0; n10 < this.field23891; ++n10) {
                        for (int n11 = 0; n11 < this.field23889; ++n11) {
                            array3[n11] = array[n9 + n11 * this.field23895 + n10];
                        }
                        this.field23898.method21386(array3);
                        for (int n12 = 0; n12 < this.field23889; ++n12) {
                            array[n9 + n12 * this.field23895 + n10] = array3[n12];
                        }
                    }
                }
                final double[] array4 = new double[this.field23887];
                for (int n13 = 0; n13 < this.field23889; ++n13) {
                    final int n14 = n13 * this.field23895;
                    for (int n15 = 0; n15 < this.field23891; ++n15) {
                        for (int n16 = 0; n16 < this.field23887; ++n16) {
                            array4[n16] = array[n16 * this.field23893 + n14 + n15];
                        }
                        this.field23897.method21386(array4);
                        for (int n17 = 0; n17 < this.field23887; ++n17) {
                            array[n17 * this.field23893 + n14 + n15] = array4[n17];
                        }
                    }
                }
            }
            this.method17494(array);
        }
    }
    
    public void method17477(final Class17 class17) {
        final int method27224 = Class8216.method27224();
        if (this.field23900) {
            if (method27224 > 1 && this.field23901) {
                this.method17489(-1, class17, true);
                this.method17492(-1, class17, true);
            }
            else {
                this.method17483(-1, class17, true);
                this.method17486(-1, class17, true);
            }
            this.method17495(class17);
        }
        else {
            if (method27224 > 1 && this.field23901 && this.field23888 >= method27224 && this.field23890 >= method27224 && this.field23892 >= method27224) {
                final Future[] array = new Future[method27224];
                final long n = this.field23888 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final long n2 = i * n;
                    array[i] = Class8216.method27227(new Class992(this, n2, (i == method27224 - 1) ? this.field23888 : (n2 + n), class17));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final long n3 = j * n;
                    array[j] = Class8216.method27227(new Class885(this, n3, (j == method27224 - 1) ? this.field23888 : (n3 + n), class17));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final long n4 = this.field23890 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final long n5 = k * n4;
                    long field23890;
                    if (k == method27224 - 1) {
                        field23890 = this.field23890;
                    }
                    else {
                        field23890 = n5 + n4;
                    }
                    array[k] = Class8216.method27227(new Class1330(this, n5, field23890, class17));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (long n6 = 0L; n6 < this.field23888; ++n6) {
                    final long n7 = n6 * this.field23893;
                    for (long n8 = 0L; n8 < this.field23890; ++n8) {
                        this.field23899.method21389(class17, n7 + n8 * this.field23895);
                    }
                }
                final Class17 class18 = new Class17(this.field23890, false);
                for (long n9 = 0L; n9 < this.field23888; ++n9) {
                    final long n10 = n9 * this.field23893;
                    for (long n11 = 0L; n11 < this.field23892; ++n11) {
                        for (long n12 = 0L; n12 < this.field23890; ++n12) {
                            class18.method171(n12, class17.method137(n10 + n12 * this.field23895 + n11));
                        }
                        this.field23898.method21387(class18);
                        for (long n13 = 0L; n13 < this.field23890; ++n13) {
                            class17.method171(n10 + n13 * this.field23895 + n11, class18.method137(n13));
                        }
                    }
                }
                final Class17 class19 = new Class17(this.field23888, false);
                for (long n14 = 0L; n14 < this.field23890; ++n14) {
                    final long n15 = n14 * this.field23895;
                    for (long n16 = 0L; n16 < this.field23892; ++n16) {
                        for (long n17 = 0L; n17 < this.field23888; ++n17) {
                            class19.method171(n17, class17.method137(n17 * this.field23893 + n15 + n16));
                        }
                        this.field23897.method21387(class19);
                        for (long n18 = 0L; n18 < this.field23888; ++n18) {
                            class17.method171(n18 * this.field23893 + n15 + n16, class19.method137(n18));
                        }
                    }
                }
            }
            this.method17495(class17);
        }
    }
    
    public void method17478(final double[][][] array) {
        final int method27224 = Class8216.method27224();
        if (this.field23900) {
            if (method27224 > 1 && this.field23901) {
                this.method17490(-1, array, true);
                this.method17493(-1, array, true);
            }
            else {
                this.method17484(-1, array, true);
                this.method17487(-1, array, true);
            }
            this.method17496(array);
        }
        else {
            if (method27224 > 1 && this.field23901 && this.field23887 >= method27224 && this.field23889 >= method27224 && this.field23891 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field23887 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final int n2 = i * n;
                    array2[i] = Class8216.method27227(new Class1605(this, n2, (i == method27224 - 1) ? this.field23887 : (n2 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n;
                    array2[j] = Class8216.method27227(new Class1359(this, n3, (j == method27224 - 1) ? this.field23887 : (n3 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final int n4 = this.field23889 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    array2[k] = Class8216.method27227(new Class1188(this, n5, (k == method27224 - 1) ? this.field23889 : (n5 + n4), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (int l = 0; l < this.field23887; ++l) {
                    for (int n6 = 0; n6 < this.field23889; ++n6) {
                        this.field23899.method21386(array[l][n6]);
                    }
                }
                final double[] array3 = new double[this.field23889];
                for (int n7 = 0; n7 < this.field23887; ++n7) {
                    for (int n8 = 0; n8 < this.field23891; ++n8) {
                        for (int n9 = 0; n9 < this.field23889; ++n9) {
                            array3[n9] = array[n7][n9][n8];
                        }
                        this.field23898.method21386(array3);
                        for (int n10 = 0; n10 < this.field23889; ++n10) {
                            array[n7][n10][n8] = array3[n10];
                        }
                    }
                }
                final double[] array4 = new double[this.field23887];
                for (int n11 = 0; n11 < this.field23889; ++n11) {
                    for (int n12 = 0; n12 < this.field23891; ++n12) {
                        for (int n13 = 0; n13 < this.field23887; ++n13) {
                            array4[n13] = array[n13][n11][n12];
                        }
                        this.field23897.method21386(array4);
                        for (int n14 = 0; n14 < this.field23887; ++n14) {
                            array[n14][n11][n12] = array4[n14];
                        }
                    }
                }
            }
            this.method17496(array);
        }
    }
    
    public void method17479(final double[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field23900) {
            if (method27224 > 1 && this.field23901) {
                this.method17488(1, array, b);
                this.method17491(1, array, b);
            }
            else {
                this.method17482(1, array, b);
                this.method17485(1, array, b);
            }
            this.method17494(array);
        }
        else {
            if (method27224 > 1 && this.field23901 && this.field23887 >= method27224 && this.field23889 >= method27224 && this.field23891 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field23887 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final int n2 = i * n;
                    array2[i] = Class8216.method27227(new Class1034(this, n2, (i == method27224 - 1) ? this.field23887 : (n2 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n;
                    array2[j] = Class8216.method27227(new Class979(this, n3, (j == method27224 - 1) ? this.field23887 : (n3 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final int n4 = this.field23889 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    array2[k] = Class8216.method27227(new Class1013(this, n5, (k == method27224 - 1) ? this.field23889 : (n5 + n4), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (int l = 0; l < this.field23887; ++l) {
                    final int n6 = l * this.field23893;
                    for (int n7 = 0; n7 < this.field23889; ++n7) {
                        this.field23899.method21392(array, n6 + n7 * this.field23895, b);
                    }
                }
                final double[] array3 = new double[this.field23889];
                for (int n8 = 0; n8 < this.field23887; ++n8) {
                    final int n9 = n8 * this.field23893;
                    for (int n10 = 0; n10 < this.field23891; ++n10) {
                        for (int n11 = 0; n11 < this.field23889; ++n11) {
                            array3[n11] = array[n9 + n11 * this.field23895 + n10];
                        }
                        this.field23898.method21390(array3, b);
                        for (int n12 = 0; n12 < this.field23889; ++n12) {
                            array[n9 + n12 * this.field23895 + n10] = array3[n12];
                        }
                    }
                }
                final double[] array4 = new double[this.field23887];
                for (int n13 = 0; n13 < this.field23889; ++n13) {
                    final int n14 = n13 * this.field23895;
                    for (int n15 = 0; n15 < this.field23891; ++n15) {
                        for (int n16 = 0; n16 < this.field23887; ++n16) {
                            array4[n16] = array[n16 * this.field23893 + n14 + n15];
                        }
                        this.field23897.method21390(array4, b);
                        for (int n17 = 0; n17 < this.field23887; ++n17) {
                            array[n17 * this.field23893 + n14 + n15] = array4[n17];
                        }
                    }
                }
            }
            this.method17494(array);
        }
    }
    
    public void method17480(final Class17 class17, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field23900) {
            if (method27224 > 1 && this.field23901) {
                this.method17489(1, class17, b);
                this.method17492(1, class17, b);
            }
            else {
                this.method17483(1, class17, b);
                this.method17486(1, class17, b);
            }
            this.method17495(class17);
        }
        else {
            if (method27224 > 1 && this.field23901 && this.field23888 >= method27224 && this.field23890 >= method27224 && this.field23892 >= method27224) {
                final Future[] array = new Future[method27224];
                final long n = this.field23888 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final long n2 = i * n;
                    array[i] = Class8216.method27227(new Class1298(this, n2, (i == method27224 - 1) ? this.field23888 : (n2 + n), class17, b));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final long n3 = j * n;
                    array[j] = Class8216.method27227(new Class1303(this, n3, (j == method27224 - 1) ? this.field23888 : (n3 + n), class17, b));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final long n4 = this.field23890 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final long n5 = k * n4;
                    array[k] = Class8216.method27227(new Class1475(this, n5, (k == method27224 - 1) ? this.field23890 : (n5 + n4), class17, b));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (long n6 = 0L; n6 < this.field23888; ++n6) {
                    final long n7 = n6 * this.field23894;
                    for (long n8 = 0L; n8 < this.field23890; ++n8) {
                        this.field23899.method21393(class17, n7 + n8 * this.field23896, b);
                    }
                }
                final Class17 class18 = new Class17(this.field23890, false);
                for (long n9 = 0L; n9 < this.field23888; ++n9) {
                    final long n10 = n9 * this.field23894;
                    for (long n11 = 0L; n11 < this.field23892; ++n11) {
                        for (long n12 = 0L; n12 < this.field23890; ++n12) {
                            class18.method171(n12, class17.method137(n10 + n12 * this.field23896 + n11));
                        }
                        this.field23898.method21391(class18, b);
                        for (long n13 = 0L; n13 < this.field23890; ++n13) {
                            class17.method171(n10 + n13 * this.field23896 + n11, class18.method137(n13));
                        }
                    }
                }
                final Class17 class19 = new Class17(this.field23888, false);
                for (long n14 = 0L; n14 < this.field23890; ++n14) {
                    final long n15 = n14 * this.field23896;
                    for (long n16 = 0L; n16 < this.field23892; ++n16) {
                        for (long n17 = 0L; n17 < this.field23888; ++n17) {
                            class19.method171(n17, class17.method137(n17 * this.field23894 + n15 + n16));
                        }
                        this.field23897.method21391(class19, b);
                        for (long n18 = 0L; n18 < this.field23888; ++n18) {
                            class17.method171(n18 * this.field23894 + n15 + n16, class19.method137(n18));
                        }
                    }
                }
            }
            this.method17495(class17);
        }
    }
    
    public void method17481(final double[][][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field23900) {
            if (method27224 > 1 && this.field23901) {
                this.method17490(1, array, b);
                this.method17493(1, array, b);
            }
            else {
                this.method17484(1, array, b);
                this.method17487(1, array, b);
            }
            this.method17496(array);
        }
        else {
            if (method27224 > 1 && this.field23901 && this.field23887 >= method27224 && this.field23889 >= method27224 && this.field23891 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field23887 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final int n2 = i * n;
                    array2[i] = Class8216.method27227(new Class1039(this, n2, (i == method27224 - 1) ? this.field23887 : (n2 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n;
                    array2[j] = Class8216.method27227(new Class1107(this, n3, (j == method27224 - 1) ? this.field23887 : (n3 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown4);
                }
                final int n4 = this.field23889 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    array2[k] = Class8216.method27227(new Class1258(this, n5, (k == method27224 - 1) ? this.field23889 : (n5 + n4), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown5) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown5);
                }
                catch (final ExecutionException thrown6) {
                    Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown6);
                }
            }
            else {
                for (int l = 0; l < this.field23887; ++l) {
                    for (int n6 = 0; n6 < this.field23889; ++n6) {
                        this.field23899.method21390(array[l][n6], b);
                    }
                }
                final double[] array3 = new double[this.field23889];
                for (int n7 = 0; n7 < this.field23887; ++n7) {
                    for (int n8 = 0; n8 < this.field23891; ++n8) {
                        for (int n9 = 0; n9 < this.field23889; ++n9) {
                            array3[n9] = array[n7][n9][n8];
                        }
                        this.field23898.method21390(array3, b);
                        for (int n10 = 0; n10 < this.field23889; ++n10) {
                            array[n7][n10][n8] = array3[n10];
                        }
                    }
                }
                final double[] array4 = new double[this.field23887];
                for (int n11 = 0; n11 < this.field23889; ++n11) {
                    for (int n12 = 0; n12 < this.field23891; ++n12) {
                        for (int n13 = 0; n13 < this.field23887; ++n13) {
                            array4[n13] = array[n13][n11][n12];
                        }
                        this.field23897.method21390(array4, b);
                        for (int n14 = 0; n14 < this.field23887; ++n14) {
                            array[n14][n11][n12] = array4[n14];
                        }
                    }
                }
            }
            this.method17496(array);
        }
    }
    
    private void method17482(final int n, final double[] array, final boolean b) {
        int n2 = 4 * this.field23889;
        if (this.field23891 == 2) {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            for (int i = 0; i < this.field23887; ++i) {
                final int n3 = i * this.field23893;
                for (int j = 0; j < this.field23889; ++j) {
                    this.field23899.method21392(array, n3 + j * this.field23895, b);
                }
                if (this.field23891 <= 2) {
                    if (this.field23891 == 2) {
                        for (int k = 0; k < this.field23889; ++k) {
                            final int n4 = n3 + k * this.field23895;
                            array2[k] = array[n4];
                            array2[this.field23889 + k] = array[n4 + 1];
                        }
                        this.field23898.method21392(array2, 0, b);
                        this.field23898.method21392(array2, this.field23889, b);
                        for (int l = 0; l < this.field23889; ++l) {
                            final int n5 = n3 + l * this.field23895;
                            array[n5] = array2[l];
                            array[n5 + 1] = array2[this.field23889 + l];
                        }
                    }
                }
                else {
                    for (int n6 = 0; n6 < this.field23891; n6 += 4) {
                        for (int n7 = 0; n7 < this.field23889; ++n7) {
                            final int n8 = n3 + n7 * this.field23895 + n6;
                            final int n9 = this.field23889 + n7;
                            array2[n7] = array[n8];
                            array2[n9] = array[n8 + 1];
                            array2[n9 + this.field23889] = array[n8 + 2];
                            array2[n9 + 2 * this.field23889] = array[n8 + 3];
                        }
                        this.field23898.method21392(array2, 0, b);
                        this.field23898.method21392(array2, this.field23889, b);
                        this.field23898.method21392(array2, 2 * this.field23889, b);
                        this.field23898.method21392(array2, 3 * this.field23889, b);
                        for (int n10 = 0; n10 < this.field23889; ++n10) {
                            final int n11 = n3 + n10 * this.field23895 + n6;
                            final int n12 = this.field23889 + n10;
                            array[n11] = array2[n10];
                            array[n11 + 1] = array2[n12];
                            array[n11 + 2] = array2[n12 + this.field23889];
                            array[n11 + 3] = array2[n12 + 2 * this.field23889];
                        }
                    }
                }
            }
        }
        else {
            for (int n13 = 0; n13 < this.field23887; ++n13) {
                final int n14 = n13 * this.field23893;
                for (int n15 = 0; n15 < this.field23889; ++n15) {
                    this.field23899.method21388(array, n14 + n15 * this.field23895);
                }
                if (this.field23891 <= 2) {
                    if (this.field23891 == 2) {
                        for (int n16 = 0; n16 < this.field23889; ++n16) {
                            final int n17 = n14 + n16 * this.field23895;
                            array2[n16] = array[n17];
                            array2[this.field23889 + n16] = array[n17 + 1];
                        }
                        this.field23898.method21388(array2, 0);
                        this.field23898.method21388(array2, this.field23889);
                        for (int n18 = 0; n18 < this.field23889; ++n18) {
                            final int n19 = n14 + n18 * this.field23895;
                            array[n19] = array2[n18];
                            array[n19 + 1] = array2[this.field23889 + n18];
                        }
                    }
                }
                else {
                    for (int n20 = 0; n20 < this.field23891; n20 += 4) {
                        for (int n21 = 0; n21 < this.field23889; ++n21) {
                            final int n22 = n14 + n21 * this.field23895 + n20;
                            final int n23 = this.field23889 + n21;
                            array2[n21] = array[n22];
                            array2[n23] = array[n22 + 1];
                            array2[n23 + this.field23889] = array[n22 + 2];
                            array2[n23 + 2 * this.field23889] = array[n22 + 3];
                        }
                        this.field23898.method21388(array2, 0);
                        this.field23898.method21388(array2, this.field23889);
                        this.field23898.method21388(array2, 2 * this.field23889);
                        this.field23898.method21388(array2, 3 * this.field23889);
                        for (int n24 = 0; n24 < this.field23889; ++n24) {
                            final int n25 = n14 + n24 * this.field23895 + n20;
                            final int n26 = this.field23889 + n24;
                            array[n25] = array2[n24];
                            array[n25 + 1] = array2[n26];
                            array[n25 + 2] = array2[n26 + this.field23889];
                            array[n25 + 3] = array2[n26 + 2 * this.field23889];
                        }
                    }
                }
            }
        }
    }
    
    private void method17483(final int n, final Class17 class17, final boolean b) {
        long n2 = 4L * this.field23890;
        if (this.field23892 == 2L) {
            n2 >>= 1;
        }
        final Class17 class18 = new Class17(n2);
        if (n != -1) {
            for (long n3 = 0L; n3 < this.field23888; ++n3) {
                final long n4 = n3 * this.field23894;
                for (long n5 = 0L; n5 < this.field23890; ++n5) {
                    this.field23899.method21393(class17, n4 + n5 * this.field23896, b);
                }
                if (this.field23892 <= 2L) {
                    if (this.field23892 == 2L) {
                        for (long n6 = 0L; n6 < this.field23890; ++n6) {
                            final long n7 = n4 + n6 * this.field23896;
                            class18.method171(n6, class17.method137(n7));
                            class18.method171(this.field23890 + n6, class17.method137(n7 + 1L));
                        }
                        this.field23898.method21393(class18, 0L, b);
                        this.field23898.method21393(class18, this.field23890, b);
                        for (long n8 = 0L; n8 < this.field23890; ++n8) {
                            final long n9 = n4 + n8 * this.field23896;
                            class17.method171(n9, class18.method137(n8));
                            class17.method171(n9 + 1L, class18.method137(this.field23890 + n8));
                        }
                    }
                }
                else {
                    for (long n10 = 0L; n10 < this.field23892; n10 += 4L) {
                        for (long n11 = 0L; n11 < this.field23890; ++n11) {
                            final long n12 = n4 + n11 * this.field23896 + n10;
                            final long n13 = this.field23890 + n11;
                            class18.method171(n11, class17.method137(n12));
                            class18.method171(n13, class17.method137(n12 + 1L));
                            class18.method171(n13 + this.field23890, class17.method137(n12 + 2L));
                            class18.method171(n13 + 2L * this.field23890, class17.method137(n12 + 3L));
                        }
                        this.field23898.method21393(class18, 0L, b);
                        this.field23898.method21393(class18, this.field23890, b);
                        this.field23898.method21393(class18, 2L * this.field23890, b);
                        this.field23898.method21393(class18, 3L * this.field23890, b);
                        for (long n14 = 0L; n14 < this.field23890; ++n14) {
                            final long n15 = n4 + n14 * this.field23896 + n10;
                            final long n16 = this.field23890 + n14;
                            class17.method171(n15, class18.method137(n14));
                            class17.method171(n15 + 1L, class18.method137(n16));
                            class17.method171(n15 + 2L, class18.method137(n16 + this.field23890));
                            class17.method171(n15 + 3L, class18.method137(n16 + 2L * this.field23890));
                        }
                    }
                }
            }
        }
        else {
            for (long n17 = 0L; n17 < this.field23888; ++n17) {
                final long n18 = n17 * this.field23894;
                for (long n19 = 0L; n19 < this.field23890; ++n19) {
                    this.field23899.method21389(class17, n18 + n19 * this.field23896);
                }
                if (this.field23892 <= 2L) {
                    if (this.field23892 == 2L) {
                        for (long n20 = 0L; n20 < this.field23890; ++n20) {
                            final long n21 = n18 + n20 * this.field23896;
                            class18.method171(n20, class17.method137(n21));
                            class18.method171(this.field23890 + n20, class17.method137(n21 + 1L));
                        }
                        this.field23898.method21389(class18, 0L);
                        this.field23898.method21389(class18, this.field23890);
                        for (long n22 = 0L; n22 < this.field23890; ++n22) {
                            final long n23 = n18 + n22 * this.field23896;
                            class17.method171(n23, class18.method137(n22));
                            class17.method171(n23 + 1L, class18.method137(this.field23890 + n22));
                        }
                    }
                }
                else {
                    for (long n24 = 0L; n24 < this.field23892; n24 += 4L) {
                        for (long n25 = 0L; n25 < this.field23890; ++n25) {
                            final long n26 = n18 + n25 * this.field23896 + n24;
                            final long n27 = this.field23890 + n25;
                            class18.method171(n25, class17.method137(n26));
                            class18.method171(n27, class17.method137(n26 + 1L));
                            class18.method171(n27 + this.field23890, class17.method137(n26 + 2L));
                            class18.method171(n27 + 2L * this.field23890, class17.method137(n26 + 3L));
                        }
                        this.field23898.method21389(class18, 0L);
                        this.field23898.method21389(class18, this.field23890);
                        this.field23898.method21389(class18, 2L * this.field23890);
                        this.field23898.method21389(class18, 3L * this.field23890);
                        for (long n28 = 0L; n28 < this.field23890; ++n28) {
                            final long n29 = n18 + n28 * this.field23896 + n24;
                            final long n30 = this.field23890 + n28;
                            class17.method171(n29, class18.method137(n28));
                            class17.method171(n29 + 1L, class18.method137(n30));
                            class17.method171(n29 + 2L, class18.method137(n30 + this.field23890));
                            class17.method171(n29 + 3L, class18.method137(n30 + 2L * this.field23890));
                        }
                    }
                }
            }
        }
    }
    
    private void method17484(final int n, final double[][][] array, final boolean b) {
        int n2 = 4 * this.field23889;
        if (this.field23892 == 2L) {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            for (int i = 0; i < this.field23887; ++i) {
                for (int j = 0; j < this.field23889; ++j) {
                    this.field23899.method21390(array[i][j], b);
                }
                if (this.field23891 <= 2) {
                    if (this.field23891 == 2) {
                        for (int k = 0; k < this.field23889; ++k) {
                            array2[k] = array[i][k][0];
                            array2[this.field23889 + k] = array[i][k][1];
                        }
                        this.field23898.method21392(array2, 0, b);
                        this.field23898.method21392(array2, this.field23889, b);
                        for (int l = 0; l < this.field23889; ++l) {
                            array[i][l][0] = array2[l];
                            array[i][l][1] = array2[this.field23889 + l];
                        }
                    }
                }
                else {
                    for (int n3 = 0; n3 < this.field23891; n3 += 4) {
                        for (int n4 = 0; n4 < this.field23889; ++n4) {
                            final int n5 = this.field23889 + n4;
                            array2[n4] = array[i][n4][n3];
                            array2[n5] = array[i][n4][n3 + 1];
                            array2[n5 + this.field23889] = array[i][n4][n3 + 2];
                            array2[n5 + 2 * this.field23889] = array[i][n4][n3 + 3];
                        }
                        this.field23898.method21392(array2, 0, b);
                        this.field23898.method21392(array2, this.field23889, b);
                        this.field23898.method21392(array2, 2 * this.field23889, b);
                        this.field23898.method21392(array2, 3 * this.field23889, b);
                        for (int n6 = 0; n6 < this.field23889; ++n6) {
                            final int n7 = this.field23889 + n6;
                            array[i][n6][n3] = array2[n6];
                            array[i][n6][n3 + 1] = array2[n7];
                            array[i][n6][n3 + 2] = array2[n7 + this.field23889];
                            array[i][n6][n3 + 3] = array2[n7 + 2 * this.field23889];
                        }
                    }
                }
            }
        }
        else {
            for (int n8 = 0; n8 < this.field23887; ++n8) {
                for (int n9 = 0; n9 < this.field23889; ++n9) {
                    this.field23899.method21386(array[n8][n9]);
                }
                if (this.field23891 <= 2) {
                    if (this.field23891 == 2) {
                        for (int n10 = 0; n10 < this.field23889; ++n10) {
                            array2[n10] = array[n8][n10][0];
                            array2[this.field23889 + n10] = array[n8][n10][1];
                        }
                        this.field23898.method21388(array2, 0);
                        this.field23898.method21388(array2, this.field23889);
                        for (int n11 = 0; n11 < this.field23889; ++n11) {
                            array[n8][n11][0] = array2[n11];
                            array[n8][n11][1] = array2[this.field23889 + n11];
                        }
                    }
                }
                else {
                    for (int n12 = 0; n12 < this.field23891; n12 += 4) {
                        for (int n13 = 0; n13 < this.field23889; ++n13) {
                            final int n14 = this.field23889 + n13;
                            array2[n13] = array[n8][n13][n12];
                            array2[n14] = array[n8][n13][n12 + 1];
                            array2[n14 + this.field23889] = array[n8][n13][n12 + 2];
                            array2[n14 + 2 * this.field23889] = array[n8][n13][n12 + 3];
                        }
                        this.field23898.method21388(array2, 0);
                        this.field23898.method21388(array2, this.field23889);
                        this.field23898.method21388(array2, 2 * this.field23889);
                        this.field23898.method21388(array2, 3 * this.field23889);
                        for (int n15 = 0; n15 < this.field23889; ++n15) {
                            final int n16 = this.field23889 + n15;
                            array[n8][n15][n12] = array2[n15];
                            array[n8][n15][n12 + 1] = array2[n16];
                            array[n8][n15][n12 + 2] = array2[n16 + this.field23889];
                            array[n8][n15][n12 + 3] = array2[n16 + 2 * this.field23889];
                        }
                    }
                }
            }
        }
    }
    
    private void method17485(final int n, final double[] array, final boolean b) {
        int n2 = 4 * this.field23887;
        if (this.field23891 == 2) {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            if (this.field23891 <= 2) {
                if (this.field23891 == 2) {
                    for (int i = 0; i < this.field23889; ++i) {
                        final int n3 = i * this.field23895;
                        for (int j = 0; j < this.field23887; ++j) {
                            final int n4 = j * this.field23893 + n3;
                            array2[j] = array[n4];
                            array2[this.field23887 + j] = array[n4 + 1];
                        }
                        this.field23897.method21392(array2, 0, b);
                        this.field23897.method21392(array2, this.field23887, b);
                        for (int k = 0; k < this.field23887; ++k) {
                            final int n5 = k * this.field23893 + n3;
                            array[n5] = array2[k];
                            array[n5 + 1] = array2[this.field23887 + k];
                        }
                    }
                }
            }
            else {
                for (int l = 0; l < this.field23889; ++l) {
                    final int n6 = l * this.field23895;
                    for (int n7 = 0; n7 < this.field23891; n7 += 4) {
                        for (int n8 = 0; n8 < this.field23887; ++n8) {
                            final int n9 = n8 * this.field23893 + n6 + n7;
                            final int n10 = this.field23887 + n8;
                            array2[n8] = array[n9];
                            array2[n10] = array[n9 + 1];
                            array2[n10 + this.field23887] = array[n9 + 2];
                            array2[n10 + 2 * this.field23887] = array[n9 + 3];
                        }
                        this.field23897.method21392(array2, 0, b);
                        this.field23897.method21392(array2, this.field23887, b);
                        this.field23897.method21392(array2, 2 * this.field23887, b);
                        this.field23897.method21392(array2, 3 * this.field23887, b);
                        for (int n11 = 0; n11 < this.field23887; ++n11) {
                            final int n12 = n11 * this.field23893 + n6 + n7;
                            final int n13 = this.field23887 + n11;
                            array[n12] = array2[n11];
                            array[n12 + 1] = array2[n13];
                            array[n12 + 2] = array2[n13 + this.field23887];
                            array[n12 + 3] = array2[n13 + 2 * this.field23887];
                        }
                    }
                }
            }
        }
        else if (this.field23891 <= 2) {
            if (this.field23891 == 2) {
                for (int n14 = 0; n14 < this.field23889; ++n14) {
                    final int n15 = n14 * this.field23895;
                    for (int n16 = 0; n16 < this.field23887; ++n16) {
                        final int n17 = n16 * this.field23893 + n15;
                        array2[n16] = array[n17];
                        array2[this.field23887 + n16] = array[n17 + 1];
                    }
                    this.field23897.method21388(array2, 0);
                    this.field23897.method21388(array2, this.field23887);
                    for (int n18 = 0; n18 < this.field23887; ++n18) {
                        final int n19 = n18 * this.field23893 + n15;
                        array[n19] = array2[n18];
                        array[n19 + 1] = array2[this.field23887 + n18];
                    }
                }
            }
        }
        else {
            for (int n20 = 0; n20 < this.field23889; ++n20) {
                final int n21 = n20 * this.field23895;
                for (int n22 = 0; n22 < this.field23891; n22 += 4) {
                    for (int n23 = 0; n23 < this.field23887; ++n23) {
                        final int n24 = n23 * this.field23893 + n21 + n22;
                        final int n25 = this.field23887 + n23;
                        array2[n23] = array[n24];
                        array2[n25] = array[n24 + 1];
                        array2[n25 + this.field23887] = array[n24 + 2];
                        array2[n25 + 2 * this.field23887] = array[n24 + 3];
                    }
                    this.field23897.method21388(array2, 0);
                    this.field23897.method21388(array2, this.field23887);
                    this.field23897.method21388(array2, 2 * this.field23887);
                    this.field23897.method21388(array2, 3 * this.field23887);
                    for (int n26 = 0; n26 < this.field23887; ++n26) {
                        final int n27 = n26 * this.field23893 + n21 + n22;
                        final int n28 = this.field23887 + n26;
                        array[n27] = array2[n26];
                        array[n27 + 1] = array2[n28];
                        array[n27 + 2] = array2[n28 + this.field23887];
                        array[n27 + 3] = array2[n28 + 2 * this.field23887];
                    }
                }
            }
        }
    }
    
    private void method17486(final int n, final Class17 class17, final boolean b) {
        long n2 = 4L * this.field23888;
        if (this.field23892 == 2L) {
            n2 >>= 1;
        }
        final Class17 class18 = new Class17(n2);
        if (n != -1) {
            if (this.field23892 <= 2L) {
                if (this.field23892 == 2L) {
                    for (long n3 = 0L; n3 < this.field23890; ++n3) {
                        final long n4 = n3 * this.field23896;
                        for (long n5 = 0L; n5 < this.field23888; ++n5) {
                            final long n6 = n5 * this.field23894 + n4;
                            class18.method171(n5, class17.method137(n6));
                            class18.method171(this.field23888 + n5, class17.method137(n6 + 1L));
                        }
                        this.field23897.method21393(class18, 0L, b);
                        this.field23897.method21393(class18, this.field23888, b);
                        for (long n7 = 0L; n7 < this.field23888; ++n7) {
                            final long n8 = n7 * this.field23894 + n4;
                            class17.method171(n8, class18.method137(n7));
                            class17.method171(n8 + 1L, class18.method137(this.field23888 + n7));
                        }
                    }
                }
            }
            else {
                for (long n9 = 0L; n9 < this.field23890; ++n9) {
                    final long n10 = n9 * this.field23896;
                    for (long n11 = 0L; n11 < this.field23892; n11 += 4L) {
                        for (long n12 = 0L; n12 < this.field23888; ++n12) {
                            final long n13 = n12 * this.field23894 + n10 + n11;
                            final long n14 = this.field23888 + n12;
                            class18.method171(n12, class17.method137(n13));
                            class18.method171(n14, class17.method137(n13 + 1L));
                            class18.method171(n14 + this.field23888, class17.method137(n13 + 2L));
                            class18.method171(n14 + 2L * this.field23888, class17.method137(n13 + 3L));
                        }
                        this.field23897.method21393(class18, 0L, b);
                        this.field23897.method21393(class18, this.field23888, b);
                        this.field23897.method21393(class18, 2L * this.field23888, b);
                        this.field23897.method21393(class18, 3L * this.field23888, b);
                        for (long n15 = 0L; n15 < this.field23888; ++n15) {
                            final long n16 = n15 * this.field23894 + n10 + n11;
                            final long n17 = this.field23888 + n15;
                            class17.method171(n16, class18.method137(n15));
                            class17.method171(n16 + 1L, class18.method137(n17));
                            class17.method171(n16 + 2L, class18.method137(n17 + this.field23888));
                            class17.method171(n16 + 3L, class18.method137(n17 + 2L * this.field23888));
                        }
                    }
                }
            }
        }
        else if (this.field23892 <= 2L) {
            if (this.field23892 == 2L) {
                for (long n18 = 0L; n18 < this.field23890; ++n18) {
                    final long n19 = n18 * this.field23896;
                    for (long n20 = 0L; n20 < this.field23888; ++n20) {
                        final long n21 = n20 * this.field23894 + n19;
                        class18.method171(n20, class17.method137(n21));
                        class18.method171(this.field23888 + n20, class17.method137(n21 + 1L));
                    }
                    this.field23897.method21389(class18, 0L);
                    this.field23897.method21389(class18, this.field23888);
                    for (long n22 = 0L; n22 < this.field23888; ++n22) {
                        final long n23 = n22 * this.field23894 + n19;
                        class17.method171(n23, class18.method137(n22));
                        class17.method171(n23 + 1L, class18.method137(this.field23888 + n22));
                    }
                }
            }
        }
        else {
            for (long n24 = 0L; n24 < this.field23890; ++n24) {
                final long n25 = n24 * this.field23896;
                for (long n26 = 0L; n26 < this.field23892; n26 += 4L) {
                    for (long n27 = 0L; n27 < this.field23888; ++n27) {
                        final long n28 = n27 * this.field23894 + n25 + n26;
                        final long n29 = this.field23888 + n27;
                        class18.method171(n27, class17.method137(n28));
                        class18.method171(n29, class17.method137(n28 + 1L));
                        class18.method171(n29 + this.field23888, class17.method137(n28 + 2L));
                        class18.method171(n29 + 2L * this.field23888, class17.method137(n28 + 3L));
                    }
                    this.field23897.method21389(class18, 0L);
                    this.field23897.method21389(class18, this.field23888);
                    this.field23897.method21389(class18, 2L * this.field23888);
                    this.field23897.method21389(class18, 3L * this.field23888);
                    for (long n30 = 0L; n30 < this.field23888; ++n30) {
                        final long n31 = n30 * this.field23894 + n25 + n26;
                        final long n32 = this.field23888 + n30;
                        class17.method171(n31, class18.method137(n30));
                        class17.method171(n31 + 1L, class18.method137(n32));
                        class17.method171(n31 + 2L, class18.method137(n32 + this.field23888));
                        class17.method171(n31 + 3L, class18.method137(n32 + 2L * this.field23888));
                    }
                }
            }
        }
    }
    
    private void method17487(final int n, final double[][][] array, final boolean b) {
        int n2 = 4 * this.field23887;
        if (this.field23891 == 2) {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            if (this.field23891 <= 2) {
                if (this.field23891 == 2) {
                    for (int i = 0; i < this.field23889; ++i) {
                        for (int j = 0; j < this.field23887; ++j) {
                            array2[j] = array[j][i][0];
                            array2[this.field23887 + j] = array[j][i][1];
                        }
                        this.field23897.method21392(array2, 0, b);
                        this.field23897.method21392(array2, this.field23887, b);
                        for (int k = 0; k < this.field23887; ++k) {
                            array[k][i][0] = array2[k];
                            array[k][i][1] = array2[this.field23887 + k];
                        }
                    }
                }
            }
            else {
                for (int l = 0; l < this.field23889; ++l) {
                    for (int n3 = 0; n3 < this.field23891; n3 += 4) {
                        for (int n4 = 0; n4 < this.field23887; ++n4) {
                            final int n5 = this.field23887 + n4;
                            array2[n4] = array[n4][l][n3];
                            array2[n5] = array[n4][l][n3 + 1];
                            array2[n5 + this.field23887] = array[n4][l][n3 + 2];
                            array2[n5 + 2 * this.field23887] = array[n4][l][n3 + 3];
                        }
                        this.field23897.method21392(array2, 0, b);
                        this.field23897.method21392(array2, this.field23887, b);
                        this.field23897.method21392(array2, 2 * this.field23887, b);
                        this.field23897.method21392(array2, 3 * this.field23887, b);
                        for (int n6 = 0; n6 < this.field23887; ++n6) {
                            final int n7 = this.field23887 + n6;
                            array[n6][l][n3] = array2[n6];
                            array[n6][l][n3 + 1] = array2[n7];
                            array[n6][l][n3 + 2] = array2[n7 + this.field23887];
                            array[n6][l][n3 + 3] = array2[n7 + 2 * this.field23887];
                        }
                    }
                }
            }
        }
        else if (this.field23891 <= 2) {
            if (this.field23891 == 2) {
                for (int n8 = 0; n8 < this.field23889; ++n8) {
                    for (int n9 = 0; n9 < this.field23887; ++n9) {
                        array2[n9] = array[n9][n8][0];
                        array2[this.field23887 + n9] = array[n9][n8][1];
                    }
                    this.field23897.method21388(array2, 0);
                    this.field23897.method21388(array2, this.field23887);
                    for (int n10 = 0; n10 < this.field23887; ++n10) {
                        array[n10][n8][0] = array2[n10];
                        array[n10][n8][1] = array2[this.field23887 + n10];
                    }
                }
            }
        }
        else {
            for (int n11 = 0; n11 < this.field23889; ++n11) {
                for (int n12 = 0; n12 < this.field23891; n12 += 4) {
                    for (int n13 = 0; n13 < this.field23887; ++n13) {
                        final int n14 = this.field23887 + n13;
                        array2[n13] = array[n13][n11][n12];
                        array2[n14] = array[n13][n11][n12 + 1];
                        array2[n14 + this.field23887] = array[n13][n11][n12 + 2];
                        array2[n14 + 2 * this.field23887] = array[n13][n11][n12 + 3];
                    }
                    this.field23897.method21388(array2, 0);
                    this.field23897.method21388(array2, this.field23887);
                    this.field23897.method21388(array2, 2 * this.field23887);
                    this.field23897.method21388(array2, 3 * this.field23887);
                    for (int n15 = 0; n15 < this.field23887; ++n15) {
                        final int n16 = this.field23887 + n15;
                        array[n15][n11][n12] = array2[n15];
                        array[n15][n11][n12 + 1] = array2[n16];
                        array[n15][n11][n12 + 2] = array2[n16 + this.field23887];
                        array[n15][n11][n12 + 3] = array2[n16 + 2 * this.field23887];
                    }
                }
            }
        }
    }
    
    private void method17488(final int n, final double[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field23887) ? this.field23887 : Class8216.method27224();
        int n3 = 4 * this.field23889;
        if (this.field23891 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1240(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method17489(final int n, final Class17 class17, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field23888) ? this.field23888 : Class8216.method27224());
        long n3 = 4L * this.field23890;
        if (this.field23892 == 2L) {
            n3 >>= 1;
        }
        final long n4 = n3;
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1626(this, n4, n, i, n2, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method17490(final int n, final double[][][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field23887) ? this.field23887 : Class8216.method27224();
        int n3 = 4 * this.field23889;
        if (this.field23891 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class950(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method17491(final int n, final double[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field23889) ? this.field23889 : Class8216.method27224();
        int n3 = 4 * this.field23887;
        if (this.field23891 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1306(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method17492(final int n, final Class17 class17, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field23890) ? this.field23890 : Class8216.method27224());
        long n3 = 4L * this.field23888;
        if (this.field23892 == 2L) {
            n3 >>= 1;
        }
        final long n4 = n3;
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1370(this, n4, n, i, n2, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method17493(final int n, final double[][][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field23889) ? this.field23889 : Class8216.method27224();
        int n3 = 4 * this.field23887;
        if (this.field23891 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1463(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class5815.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method17494(final double[] array) {
        for (int i = 0; i <= this.field23887 / 2; ++i) {
            final int n = (this.field23887 - i) % this.field23887;
            final int n2 = i * this.field23893;
            final int n3 = n * this.field23893;
            for (int j = 0; j <= this.field23889 / 2; ++j) {
                final int n4 = (this.field23889 - j) % this.field23889;
                final int n5 = j * this.field23895;
                final int n6 = n4 * this.field23895;
                for (int k = 0; k <= this.field23891 / 2; ++k) {
                    final int n7 = (this.field23891 - k) % this.field23891;
                    final int n8 = n2 + n6 + k;
                    final int n9 = n2 + n5 + n7;
                    final int n10 = n3 + n5 + k;
                    final int n11 = n3 + n6 + n7;
                    final int n12 = n3 + n6 + k;
                    final int n13 = n3 + n5 + n7;
                    final int n14 = n2 + n5 + k;
                    final int n15 = n2 + n6 + n7;
                    final double n16 = array[n8];
                    final double n17 = array[n9];
                    final double n18 = array[n10];
                    final double n19 = array[n11];
                    final double n20 = array[n12];
                    final double n21 = array[n13];
                    final double n22 = array[n14];
                    final double n23 = array[n15];
                    array[n14] = (n16 + n17 + n18 - n19) / 2.0;
                    array[n10] = (n20 + n21 + n22 - n23) / 2.0;
                    array[n8] = (n22 + n23 + n20 - n21) / 2.0;
                    array[n12] = (n18 + n19 + n16 - n17) / 2.0;
                    array[n9] = (n23 + n22 + n21 - n20) / 2.0;
                    array[n13] = (n19 + n18 + n17 - n16) / 2.0;
                    array[n15] = (n17 + n16 + n19 - n18) / 2.0;
                    array[n11] = (n21 + n20 + n23 - n22) / 2.0;
                }
            }
        }
    }
    
    private void method17495(final Class17 class17) {
        for (long n = 0L; n <= this.field23888 / 2L; ++n) {
            final long n2 = (this.field23888 - n) % this.field23888;
            final long n3 = n * this.field23894;
            final long n4 = n2 * this.field23894;
            for (long n5 = 0L; n5 <= this.field23890 / 2L; ++n5) {
                final long n6 = (this.field23890 - n5) % this.field23890;
                final long n7 = n5 * this.field23896;
                final long n8 = n6 * this.field23896;
                for (long n9 = 0L; n9 <= this.field23892 / 2L; ++n9) {
                    final long n10 = (this.field23892 - n9) % this.field23892;
                    final long n11 = n3 + n8 + n9;
                    final long n12 = n3 + n7 + n10;
                    final long n13 = n4 + n7 + n9;
                    final long n14 = n4 + n8 + n10;
                    final long n15 = n4 + n8 + n9;
                    final long n16 = n4 + n7 + n10;
                    final long n17 = n3 + n7 + n9;
                    final long n18 = n3 + n8 + n10;
                    final double method137 = class17.method137(n11);
                    final double method138 = class17.method137(n12);
                    final double method139 = class17.method137(n13);
                    final double method140 = class17.method137(n14);
                    final double method141 = class17.method137(n15);
                    final double method142 = class17.method137(n16);
                    final double method143 = class17.method137(n17);
                    final double method144 = class17.method137(n18);
                    class17.method171(n17, (method137 + method138 + method139 - method140) / 2.0);
                    class17.method171(n13, (method141 + method142 + method143 - method144) / 2.0);
                    class17.method171(n11, (method143 + method144 + method141 - method142) / 2.0);
                    class17.method171(n15, (method139 + method140 + method137 - method138) / 2.0);
                    class17.method171(n12, (method144 + method143 + method142 - method141) / 2.0);
                    class17.method171(n16, (method140 + method139 + method138 - method137) / 2.0);
                    class17.method171(n18, (method138 + method137 + method140 - method139) / 2.0);
                    class17.method171(n14, (method142 + method141 + method144 - method143) / 2.0);
                }
            }
        }
    }
    
    private void method17496(final double[][][] array) {
        for (int i = 0; i <= this.field23887 / 2; ++i) {
            final int n = (this.field23887 - i) % this.field23887;
            for (int j = 0; j <= this.field23889 / 2; ++j) {
                final int n2 = (this.field23889 - j) % this.field23889;
                for (int k = 0; k <= this.field23891 / 2; ++k) {
                    final int n3 = (this.field23891 - k) % this.field23891;
                    final double n4 = array[i][n2][k];
                    final double n5 = array[i][j][n3];
                    final double n6 = array[n][j][k];
                    final double n7 = array[n][n2][n3];
                    final double n8 = array[n][n2][k];
                    final double n9 = array[n][j][n3];
                    final double n10 = array[i][j][k];
                    final double n11 = array[i][n2][n3];
                    array[i][j][k] = (n4 + n5 + n6 - n7) / 2.0;
                    array[n][j][k] = (n8 + n9 + n10 - n11) / 2.0;
                    array[i][n2][k] = (n10 + n11 + n8 - n9) / 2.0;
                    array[n][n2][k] = (n6 + n7 + n4 - n5) / 2.0;
                    array[i][j][n3] = (n11 + n10 + n9 - n8) / 2.0;
                    array[n][j][n3] = (n7 + n6 + n5 - n4) / 2.0;
                    array[i][n2][n3] = (n5 + n4 + n7 - n6) / 2.0;
                    array[n][n2][n3] = (n9 + n8 + n11 - n10) / 2.0;
                }
            }
        }
    }
}
