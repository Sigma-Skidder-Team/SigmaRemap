// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class7568
{
    private final int field30002;
    private final long field30003;
    private final int field30004;
    private final long field30005;
    private final int field30006;
    private final long field30007;
    private final int field30008;
    private final long field30009;
    private final int field30010;
    private final long field30011;
    private final Class8806 field30012;
    private final Class8806 field30013;
    private final Class8806 field30014;
    private boolean field30015;
    private boolean field30016;
    
    public Class7568(final long field30003, final long field30004, final long n) {
        this.field30015 = false;
        this.field30016 = false;
        if (field30003 > 1L) {
            if (field30004 > 1L) {
                if (n > 1L) {
                    this.field30002 = (int)field30003;
                    this.field30004 = (int)field30004;
                    this.field30006 = (int)n;
                    this.field30003 = field30003;
                    this.field30005 = field30004;
                    this.field30007 = n;
                    this.field30008 = (int)(field30004 * n);
                    this.field30010 = (int)n;
                    this.field30009 = field30004 * n;
                    this.field30011 = n;
                    if (field30003 * field30004 * n >= Class9133.method33161()) {
                        this.field30016 = true;
                    }
                    if (Class9133.method33175(field30003)) {
                        if (Class9133.method33175(field30004)) {
                            if (Class9133.method33175(n)) {
                                this.field30015 = true;
                            }
                        }
                    }
                    Class9133.method33169(field30003 * field30004 * n > Class11.method177());
                    this.field30012 = new Class8806(field30003);
                    if (field30003 != field30004) {
                        this.field30013 = new Class8806(field30004);
                    }
                    else {
                        this.field30013 = this.field30012;
                    }
                    if (field30003 != n) {
                        if (field30004 != n) {
                            this.field30014 = new Class8806(n);
                        }
                        else {
                            this.field30014 = this.field30013;
                        }
                    }
                    else {
                        this.field30014 = this.field30012;
                    }
                    return;
                }
            }
        }
        throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
    }
    
    public void method23758(final double[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field30015) {
            if (method27224 > 1 && this.field30016) {
                this.method23770(-1, array, b);
                this.method23773(-1, array, b);
            }
            else {
                this.method23764(-1, array, b);
                this.method23767(-1, array, b);
            }
        }
        else if (method27224 > 1 && this.field30016 && this.field30002 >= method27224 && this.field30004 >= method27224 && this.field30006 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field30002 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class942(this, n2, (i == method27224 - 1) ? this.field30002 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1219(this, n3, (j == method27224 - 1) ? this.field30002 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field30004 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1358(this, n5, (k == method27224 - 1) ? this.field30004 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field30002; ++l) {
                final int n6 = l * this.field30008;
                for (int n7 = 0; n7 < this.field30004; ++n7) {
                    this.field30014.method30723(array, n6 + n7 * this.field30010, b);
                }
            }
            final double[] array3 = new double[this.field30004];
            for (int n8 = 0; n8 < this.field30002; ++n8) {
                final int n9 = n8 * this.field30008;
                for (int n10 = 0; n10 < this.field30006; ++n10) {
                    for (int n11 = 0; n11 < this.field30004; ++n11) {
                        array3[n11] = array[n9 + n11 * this.field30010 + n10];
                    }
                    this.field30013.method30721(array3, b);
                    for (int n12 = 0; n12 < this.field30004; ++n12) {
                        array[n9 + n12 * this.field30010 + n10] = array3[n12];
                    }
                }
            }
            final double[] array4 = new double[this.field30002];
            for (int n13 = 0; n13 < this.field30004; ++n13) {
                final int n14 = n13 * this.field30010;
                for (int n15 = 0; n15 < this.field30006; ++n15) {
                    for (int n16 = 0; n16 < this.field30002; ++n16) {
                        array4[n16] = array[n16 * this.field30008 + n14 + n15];
                    }
                    this.field30012.method30721(array4, b);
                    for (int n17 = 0; n17 < this.field30002; ++n17) {
                        array[n17 * this.field30008 + n14 + n15] = array4[n17];
                    }
                }
            }
        }
    }
    
    public void method23759(final Class17 class17, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field30015) {
            if (method27224 > 1 && this.field30016) {
                this.method23771(-1, class17, b);
                this.method23774(-1, class17, b);
            }
            else {
                this.method23765(-1, class17, b);
                this.method23768(-1, class17, b);
            }
        }
        else if (method27224 > 1 && this.field30016 && this.field30003 >= method27224 && this.field30005 >= method27224 && this.field30007 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n = this.field30003 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n2 = i * n;
                array[i] = Class8216.method27227(new Class1539(this, n2, (i == method27224 - 1) ? this.field30003 : (n2 + n), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final long n3 = j * n;
                array[j] = Class8216.method27227(new Class1593(this, n3, (j == method27224 - 1) ? this.field30003 : (n3 + n), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final long n4 = this.field30005 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final long n5 = k * n4;
                array[k] = Class8216.method27227(new Class1111(this, n5, (k == method27224 - 1) ? this.field30005 : (n5 + n4), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field30003; ++n6) {
                final long n7 = n6 * this.field30009;
                for (long n8 = 0L; n8 < this.field30005; ++n8) {
                    this.field30014.method30724(class17, n7 + n8 * this.field30011, b);
                }
            }
            final Class17 class18 = new Class17(this.field30005, false);
            for (long n9 = 0L; n9 < this.field30003; ++n9) {
                final long n10 = n9 * this.field30009;
                for (long n11 = 0L; n11 < this.field30007; ++n11) {
                    for (long n12 = 0L; n12 < this.field30005; ++n12) {
                        class18.method171(n12, class17.method137(n10 + n12 * this.field30011 + n11));
                    }
                    this.field30013.method30722(class18, b);
                    for (long n13 = 0L; n13 < this.field30005; ++n13) {
                        class17.method171(n10 + n13 * this.field30011 + n11, class18.method137(n13));
                    }
                }
            }
            final Class17 class19 = new Class17(this.field30003, false);
            for (long n14 = 0L; n14 < this.field30005; ++n14) {
                final long n15 = n14 * this.field30011;
                for (long n16 = 0L; n16 < this.field30007; ++n16) {
                    for (long n17 = 0L; n17 < this.field30003; ++n17) {
                        class19.method171(n17, class17.method137(n17 * this.field30009 + n15 + n16));
                    }
                    this.field30012.method30722(class19, b);
                    for (long n18 = 0L; n18 < this.field30003; ++n18) {
                        class17.method171(n18 * this.field30009 + n15 + n16, class19.method137(n18));
                    }
                }
            }
        }
    }
    
    public void method23760(final double[][][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field30015) {
            if (method27224 > 1 && this.field30016) {
                this.method23772(-1, array, b);
                this.method23775(-1, array, b);
            }
            else {
                this.method23766(-1, array, b);
                this.method23769(-1, array, b);
            }
        }
        else if (method27224 > 1 && this.field30016 && this.field30002 >= method27224 && this.field30004 >= method27224 && this.field30006 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field30002 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1147(this, n2, (i == method27224 - 1) ? this.field30002 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1554(this, n3, (j == method27224 - 1) ? this.field30002 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field30004 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1137(this, n5, (k == method27224 - 1) ? this.field30004 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field30002; ++l) {
                for (int n6 = 0; n6 < this.field30004; ++n6) {
                    this.field30014.method30721(array[l][n6], b);
                }
            }
            final double[] array3 = new double[this.field30004];
            for (int n7 = 0; n7 < this.field30002; ++n7) {
                for (int n8 = 0; n8 < this.field30006; ++n8) {
                    for (int n9 = 0; n9 < this.field30004; ++n9) {
                        array3[n9] = array[n7][n9][n8];
                    }
                    this.field30013.method30721(array3, b);
                    for (int n10 = 0; n10 < this.field30004; ++n10) {
                        array[n7][n10][n8] = array3[n10];
                    }
                }
            }
            final double[] array4 = new double[this.field30002];
            for (int n11 = 0; n11 < this.field30004; ++n11) {
                for (int n12 = 0; n12 < this.field30006; ++n12) {
                    for (int n13 = 0; n13 < this.field30002; ++n13) {
                        array4[n13] = array[n13][n11][n12];
                    }
                    this.field30012.method30721(array4, b);
                    for (int n14 = 0; n14 < this.field30002; ++n14) {
                        array[n14][n11][n12] = array4[n14];
                    }
                }
            }
        }
    }
    
    public void method23761(final double[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field30015) {
            if (method27224 > 1 && this.field30016) {
                this.method23770(1, array, b);
                this.method23773(1, array, b);
            }
            else {
                this.method23764(1, array, b);
                this.method23767(1, array, b);
            }
        }
        else if (method27224 > 1 && this.field30016 && this.field30002 >= method27224 && this.field30004 >= method27224 && this.field30006 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field30002 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1331(this, n2, (i == method27224 - 1) ? this.field30002 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1099(this, n3, (j == method27224 - 1) ? this.field30002 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field30004 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1488(this, n5, (k == method27224 - 1) ? this.field30004 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field30002; ++l) {
                final int n6 = l * this.field30008;
                for (int n7 = 0; n7 < this.field30004; ++n7) {
                    this.field30014.method30727(array, n6 + n7 * this.field30010, b);
                }
            }
            final double[] array3 = new double[this.field30004];
            for (int n8 = 0; n8 < this.field30002; ++n8) {
                final int n9 = n8 * this.field30008;
                for (int n10 = 0; n10 < this.field30006; ++n10) {
                    for (int n11 = 0; n11 < this.field30004; ++n11) {
                        array3[n11] = array[n9 + n11 * this.field30010 + n10];
                    }
                    this.field30013.method30725(array3, b);
                    for (int n12 = 0; n12 < this.field30004; ++n12) {
                        array[n9 + n12 * this.field30010 + n10] = array3[n12];
                    }
                }
            }
            final double[] array4 = new double[this.field30002];
            for (int n13 = 0; n13 < this.field30004; ++n13) {
                final int n14 = n13 * this.field30010;
                for (int n15 = 0; n15 < this.field30006; ++n15) {
                    for (int n16 = 0; n16 < this.field30002; ++n16) {
                        array4[n16] = array[n16 * this.field30008 + n14 + n15];
                    }
                    this.field30012.method30725(array4, b);
                    for (int n17 = 0; n17 < this.field30002; ++n17) {
                        array[n17 * this.field30008 + n14 + n15] = array4[n17];
                    }
                }
            }
        }
    }
    
    public void method23762(final Class17 class17, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field30015) {
            if (method27224 > 1 && this.field30016) {
                this.method23771(1, class17, b);
                this.method23774(1, class17, b);
            }
            else {
                this.method23765(1, class17, b);
                this.method23768(1, class17, b);
            }
        }
        else if (method27224 > 1 && this.field30016 && this.field30003 >= method27224 && this.field30005 >= method27224 && this.field30007 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n = this.field30003 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n2 = i * n;
                array[i] = Class8216.method27227(new Class1395(this, n2, (i == method27224 - 1) ? this.field30003 : (n2 + n), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final long n3 = j * n;
                array[j] = Class8216.method27227(new Class1480(this, n3, (j == method27224 - 1) ? this.field30003 : (n3 + n), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final long n4 = this.field30005 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final long n5 = k * n4;
                array[k] = Class8216.method27227(new Class1115(this, n5, (k == method27224 - 1) ? this.field30005 : (n5 + n4), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field30003; ++n6) {
                final long n7 = n6 * this.field30008;
                for (long n8 = 0L; n8 < this.field30005; ++n8) {
                    this.field30014.method30728(class17, n7 + n8 * this.field30010, b);
                }
            }
            final Class17 class18 = new Class17(this.field30005, false);
            for (long n9 = 0L; n9 < this.field30003; ++n9) {
                final long n10 = n9 * this.field30008;
                for (long n11 = 0L; n11 < this.field30007; ++n11) {
                    for (long n12 = 0L; n12 < this.field30005; ++n12) {
                        class18.method171(n12, class17.method137(n10 + n12 * this.field30010 + n11));
                    }
                    this.field30013.method30726(class18, b);
                    for (long n13 = 0L; n13 < this.field30005; ++n13) {
                        class17.method171(n10 + n13 * this.field30010 + n11, class18.method137(n13));
                    }
                }
            }
            final Class17 class19 = new Class17(this.field30003, false);
            for (long n14 = 0L; n14 < this.field30005; ++n14) {
                final long n15 = n14 * this.field30010;
                for (long n16 = 0L; n16 < this.field30007; ++n16) {
                    for (long n17 = 0L; n17 < this.field30003; ++n17) {
                        class19.method171(n17, class17.method137(n17 * this.field30008 + n15 + n16));
                    }
                    this.field30012.method30726(class19, b);
                    for (long n18 = 0L; n18 < this.field30003; ++n18) {
                        class17.method171(n18 * this.field30008 + n15 + n16, class19.method137(n18));
                    }
                }
            }
        }
    }
    
    public void method23763(final double[][][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field30015) {
            if (method27224 > 1 && this.field30016) {
                this.method23772(1, array, b);
                this.method23775(1, array, b);
            }
            else {
                this.method23766(1, array, b);
                this.method23769(1, array, b);
            }
        }
        else if (method27224 > 1 && this.field30016 && this.field30002 >= method27224 && this.field30004 >= method27224 && this.field30006 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field30002 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1624(this, n2, (i == method27224 - 1) ? this.field30002 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1274(this, n3, (j == method27224 - 1) ? this.field30002 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field30004 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1446(this, n5, (k == method27224 - 1) ? this.field30004 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field30002; ++l) {
                for (int n6 = 0; n6 < this.field30004; ++n6) {
                    this.field30014.method30725(array[l][n6], b);
                }
            }
            final double[] array3 = new double[this.field30004];
            for (int n7 = 0; n7 < this.field30002; ++n7) {
                for (int n8 = 0; n8 < this.field30006; ++n8) {
                    for (int n9 = 0; n9 < this.field30004; ++n9) {
                        array3[n9] = array[n7][n9][n8];
                    }
                    this.field30013.method30725(array3, b);
                    for (int n10 = 0; n10 < this.field30004; ++n10) {
                        array[n7][n10][n8] = array3[n10];
                    }
                }
            }
            final double[] array4 = new double[this.field30002];
            for (int n11 = 0; n11 < this.field30004; ++n11) {
                for (int n12 = 0; n12 < this.field30006; ++n12) {
                    for (int n13 = 0; n13 < this.field30002; ++n13) {
                        array4[n13] = array[n13][n11][n12];
                    }
                    this.field30012.method30725(array4, b);
                    for (int n14 = 0; n14 < this.field30002; ++n14) {
                        array[n14][n11][n12] = array4[n14];
                    }
                }
            }
        }
    }
    
    private void method23764(final int n, final double[] array, final boolean b) {
        int n2 = 4 * this.field30004;
        if (this.field30006 == 2) {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            for (int i = 0; i < this.field30002; ++i) {
                final int n3 = i * this.field30008;
                for (int j = 0; j < this.field30004; ++j) {
                    this.field30014.method30727(array, n3 + j * this.field30010, b);
                }
                if (this.field30006 <= 2) {
                    if (this.field30006 == 2) {
                        for (int k = 0; k < this.field30004; ++k) {
                            final int n4 = n3 + k * this.field30010;
                            array2[k] = array[n4];
                            array2[this.field30004 + k] = array[n4 + 1];
                        }
                        this.field30013.method30727(array2, 0, b);
                        this.field30013.method30727(array2, this.field30004, b);
                        for (int l = 0; l < this.field30004; ++l) {
                            final int n5 = n3 + l * this.field30010;
                            array[n5] = array2[l];
                            array[n5 + 1] = array2[this.field30004 + l];
                        }
                    }
                }
                else {
                    for (int n6 = 0; n6 < this.field30006; n6 += 4) {
                        for (int n7 = 0; n7 < this.field30004; ++n7) {
                            final int n8 = n3 + n7 * this.field30010 + n6;
                            final int n9 = this.field30004 + n7;
                            array2[n7] = array[n8];
                            array2[n9] = array[n8 + 1];
                            array2[n9 + this.field30004] = array[n8 + 2];
                            array2[n9 + 2 * this.field30004] = array[n8 + 3];
                        }
                        this.field30013.method30727(array2, 0, b);
                        this.field30013.method30727(array2, this.field30004, b);
                        this.field30013.method30727(array2, 2 * this.field30004, b);
                        this.field30013.method30727(array2, 3 * this.field30004, b);
                        for (int n10 = 0; n10 < this.field30004; ++n10) {
                            final int n11 = n3 + n10 * this.field30010 + n6;
                            final int n12 = this.field30004 + n10;
                            array[n11] = array2[n10];
                            array[n11 + 1] = array2[n12];
                            array[n11 + 2] = array2[n12 + this.field30004];
                            array[n11 + 3] = array2[n12 + 2 * this.field30004];
                        }
                    }
                }
            }
        }
        else {
            for (int n13 = 0; n13 < this.field30002; ++n13) {
                final int n14 = n13 * this.field30008;
                for (int n15 = 0; n15 < this.field30004; ++n15) {
                    this.field30014.method30723(array, n14 + n15 * this.field30010, b);
                }
                if (this.field30006 <= 2) {
                    if (this.field30006 == 2) {
                        for (int n16 = 0; n16 < this.field30004; ++n16) {
                            final int n17 = n14 + n16 * this.field30010;
                            array2[n16] = array[n17];
                            array2[this.field30004 + n16] = array[n17 + 1];
                        }
                        this.field30013.method30723(array2, 0, b);
                        this.field30013.method30723(array2, this.field30004, b);
                        for (int n18 = 0; n18 < this.field30004; ++n18) {
                            final int n19 = n14 + n18 * this.field30010;
                            array[n19] = array2[n18];
                            array[n19 + 1] = array2[this.field30004 + n18];
                        }
                    }
                }
                else {
                    for (int n20 = 0; n20 < this.field30006; n20 += 4) {
                        for (int n21 = 0; n21 < this.field30004; ++n21) {
                            final int n22 = n14 + n21 * this.field30010 + n20;
                            final int n23 = this.field30004 + n21;
                            array2[n21] = array[n22];
                            array2[n23] = array[n22 + 1];
                            array2[n23 + this.field30004] = array[n22 + 2];
                            array2[n23 + 2 * this.field30004] = array[n22 + 3];
                        }
                        this.field30013.method30723(array2, 0, b);
                        this.field30013.method30723(array2, this.field30004, b);
                        this.field30013.method30723(array2, 2 * this.field30004, b);
                        this.field30013.method30723(array2, 3 * this.field30004, b);
                        for (int n24 = 0; n24 < this.field30004; ++n24) {
                            final int n25 = n14 + n24 * this.field30010 + n20;
                            final int n26 = this.field30004 + n24;
                            array[n25] = array2[n24];
                            array[n25 + 1] = array2[n26];
                            array[n25 + 2] = array2[n26 + this.field30004];
                            array[n25 + 3] = array2[n26 + 2 * this.field30004];
                        }
                    }
                }
            }
        }
    }
    
    private void method23765(final int n, final Class17 class17, final boolean b) {
        long n2 = 4L * this.field30005;
        if (this.field30007 == 2L) {
            n2 >>= 1;
        }
        final Class17 class18 = new Class17(n2);
        if (n != -1) {
            for (long n3 = 0L; n3 < this.field30003; ++n3) {
                final long n4 = n3 * this.field30009;
                for (long n5 = 0L; n5 < this.field30005; ++n5) {
                    this.field30014.method30728(class17, n4 + n5 * this.field30011, b);
                }
                if (this.field30007 <= 2L) {
                    if (this.field30007 == 2L) {
                        for (long n6 = 0L; n6 < this.field30005; ++n6) {
                            final long n7 = n4 + n6 * this.field30011;
                            class18.method171(n6, class17.method137(n7));
                            class18.method171(this.field30005 + n6, class17.method137(n7 + 1L));
                        }
                        this.field30013.method30728(class18, 0L, b);
                        this.field30013.method30728(class18, this.field30005, b);
                        for (long n8 = 0L; n8 < this.field30005; ++n8) {
                            final long n9 = n4 + n8 * this.field30011;
                            class17.method171(n9, class18.method137(n8));
                            class17.method171(n9 + 1L, class18.method137(this.field30005 + n8));
                        }
                    }
                }
                else {
                    for (long n10 = 0L; n10 < this.field30007; n10 += 4L) {
                        for (long n11 = 0L; n11 < this.field30005; ++n11) {
                            final long n12 = n4 + n11 * this.field30011 + n10;
                            final long n13 = this.field30005 + n11;
                            class18.method171(n11, class17.method137(n12));
                            class18.method171(n13, class17.method137(n12 + 1L));
                            class18.method171(n13 + this.field30005, class17.method137(n12 + 2L));
                            class18.method171(n13 + 2L * this.field30005, class17.method137(n12 + 3L));
                        }
                        this.field30013.method30728(class18, 0L, b);
                        this.field30013.method30728(class18, this.field30005, b);
                        this.field30013.method30728(class18, 2L * this.field30005, b);
                        this.field30013.method30728(class18, 3L * this.field30005, b);
                        for (long n14 = 0L; n14 < this.field30005; ++n14) {
                            final long n15 = n4 + n14 * this.field30011 + n10;
                            final long n16 = this.field30005 + n14;
                            class17.method171(n15, class18.method137(n14));
                            class17.method171(n15 + 1L, class18.method137(n16));
                            class17.method171(n15 + 2L, class18.method137(n16 + this.field30005));
                            class17.method171(n15 + 3L, class18.method137(n16 + 2L * this.field30005));
                        }
                    }
                }
            }
        }
        else {
            for (long n17 = 0L; n17 < this.field30003; ++n17) {
                final long n18 = n17 * this.field30009;
                for (long n19 = 0L; n19 < this.field30005; ++n19) {
                    this.field30014.method30724(class17, n18 + n19 * this.field30010, b);
                }
                if (this.field30007 <= 2L) {
                    if (this.field30007 == 2L) {
                        for (long n20 = 0L; n20 < this.field30005; ++n20) {
                            final long n21 = n18 + n20 * this.field30011;
                            class18.method171(n20, class17.method137(n21));
                            class18.method171(this.field30005 + n20, class17.method137(n21 + 1L));
                        }
                        this.field30013.method30724(class18, 0L, b);
                        this.field30013.method30724(class18, this.field30005, b);
                        for (long n22 = 0L; n22 < this.field30005; ++n22) {
                            final long n23 = n18 + n22 * this.field30011;
                            class17.method171(n23, class18.method137(n22));
                            class17.method171(n23 + 1L, class18.method137(this.field30005 + n22));
                        }
                    }
                }
                else {
                    for (long n24 = 0L; n24 < this.field30007; n24 += 4L) {
                        for (long n25 = 0L; n25 < this.field30005; ++n25) {
                            final long n26 = n18 + n25 * this.field30011 + n24;
                            final long n27 = this.field30005 + n25;
                            class18.method171(n25, class17.method137(n26));
                            class18.method171(n27, class17.method137(n26 + 1L));
                            class18.method171(n27 + this.field30005, class17.method137(n26 + 2L));
                            class18.method171(n27 + 2L * this.field30005, class17.method137(n26 + 3L));
                        }
                        this.field30013.method30724(class18, 0L, b);
                        this.field30013.method30724(class18, this.field30005, b);
                        this.field30013.method30724(class18, 2L * this.field30005, b);
                        this.field30013.method30724(class18, 3L * this.field30005, b);
                        for (long n28 = 0L; n28 < this.field30005; ++n28) {
                            final long n29 = n18 + n28 * this.field30011 + n24;
                            final long n30 = this.field30005 + n28;
                            class17.method171(n29, class18.method137(n28));
                            class17.method171(n29 + 1L, class18.method137(n30));
                            class17.method171(n29 + 2L, class18.method137(n30 + this.field30005));
                            class17.method171(n29 + 3L, class18.method137(n30 + 2L * this.field30005));
                        }
                    }
                }
            }
        }
    }
    
    private void method23766(final int n, final double[][][] array, final boolean b) {
        int n2 = 4 * this.field30004;
        if (this.field30006 == 2) {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            for (int i = 0; i < this.field30002; ++i) {
                for (int j = 0; j < this.field30004; ++j) {
                    this.field30014.method30725(array[i][j], b);
                }
                if (this.field30006 <= 2) {
                    if (this.field30006 == 2) {
                        for (int k = 0; k < this.field30004; ++k) {
                            array2[k] = array[i][k][0];
                            array2[this.field30004 + k] = array[i][k][1];
                        }
                        this.field30013.method30727(array2, 0, b);
                        this.field30013.method30727(array2, this.field30004, b);
                        for (int l = 0; l < this.field30004; ++l) {
                            array[i][l][0] = array2[l];
                            array[i][l][1] = array2[this.field30004 + l];
                        }
                    }
                }
                else {
                    for (int n3 = 0; n3 < this.field30006; n3 += 4) {
                        for (int n4 = 0; n4 < this.field30004; ++n4) {
                            final int n5 = this.field30004 + n4;
                            array2[n4] = array[i][n4][n3];
                            array2[n5] = array[i][n4][n3 + 1];
                            array2[n5 + this.field30004] = array[i][n4][n3 + 2];
                            array2[n5 + 2 * this.field30004] = array[i][n4][n3 + 3];
                        }
                        this.field30013.method30727(array2, 0, b);
                        this.field30013.method30727(array2, this.field30004, b);
                        this.field30013.method30727(array2, 2 * this.field30004, b);
                        this.field30013.method30727(array2, 3 * this.field30004, b);
                        for (int n6 = 0; n6 < this.field30004; ++n6) {
                            final int n7 = this.field30004 + n6;
                            array[i][n6][n3] = array2[n6];
                            array[i][n6][n3 + 1] = array2[n7];
                            array[i][n6][n3 + 2] = array2[n7 + this.field30004];
                            array[i][n6][n3 + 3] = array2[n7 + 2 * this.field30004];
                        }
                    }
                }
            }
        }
        else {
            for (int n8 = 0; n8 < this.field30002; ++n8) {
                for (int n9 = 0; n9 < this.field30004; ++n9) {
                    this.field30014.method30721(array[n8][n9], b);
                }
                if (this.field30006 <= 2) {
                    if (this.field30006 == 2) {
                        for (int n10 = 0; n10 < this.field30004; ++n10) {
                            array2[n10] = array[n8][n10][0];
                            array2[this.field30004 + n10] = array[n8][n10][1];
                        }
                        this.field30013.method30723(array2, 0, b);
                        this.field30013.method30723(array2, this.field30004, b);
                        for (int n11 = 0; n11 < this.field30004; ++n11) {
                            array[n8][n11][0] = array2[n11];
                            array[n8][n11][1] = array2[this.field30004 + n11];
                        }
                    }
                }
                else {
                    for (int n12 = 0; n12 < this.field30006; n12 += 4) {
                        for (int n13 = 0; n13 < this.field30004; ++n13) {
                            final int n14 = this.field30004 + n13;
                            array2[n13] = array[n8][n13][n12];
                            array2[n14] = array[n8][n13][n12 + 1];
                            array2[n14 + this.field30004] = array[n8][n13][n12 + 2];
                            array2[n14 + 2 * this.field30004] = array[n8][n13][n12 + 3];
                        }
                        this.field30013.method30723(array2, 0, b);
                        this.field30013.method30723(array2, this.field30004, b);
                        this.field30013.method30723(array2, 2 * this.field30004, b);
                        this.field30013.method30723(array2, 3 * this.field30004, b);
                        for (int n15 = 0; n15 < this.field30004; ++n15) {
                            final int n16 = this.field30004 + n15;
                            array[n8][n15][n12] = array2[n15];
                            array[n8][n15][n12 + 1] = array2[n16];
                            array[n8][n15][n12 + 2] = array2[n16 + this.field30004];
                            array[n8][n15][n12 + 3] = array2[n16 + 2 * this.field30004];
                        }
                    }
                }
            }
        }
    }
    
    private void method23767(final int n, final double[] array, final boolean b) {
        int n2 = 4 * this.field30002;
        if (this.field30006 == 2) {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            if (this.field30006 <= 2) {
                if (this.field30006 == 2) {
                    for (int i = 0; i < this.field30004; ++i) {
                        final int n3 = i * this.field30010;
                        for (int j = 0; j < this.field30002; ++j) {
                            final int n4 = j * this.field30008 + n3;
                            array2[j] = array[n4];
                            array2[this.field30002 + j] = array[n4 + 1];
                        }
                        this.field30012.method30727(array2, 0, b);
                        this.field30012.method30727(array2, this.field30002, b);
                        for (int k = 0; k < this.field30002; ++k) {
                            final int n5 = k * this.field30008 + n3;
                            array[n5] = array2[k];
                            array[n5 + 1] = array2[this.field30002 + k];
                        }
                    }
                }
            }
            else {
                for (int l = 0; l < this.field30004; ++l) {
                    final int n6 = l * this.field30010;
                    for (int n7 = 0; n7 < this.field30006; n7 += 4) {
                        for (int n8 = 0; n8 < this.field30002; ++n8) {
                            final int n9 = n8 * this.field30008 + n6 + n7;
                            final int n10 = this.field30002 + n8;
                            array2[n8] = array[n9];
                            array2[n10] = array[n9 + 1];
                            array2[n10 + this.field30002] = array[n9 + 2];
                            array2[n10 + 2 * this.field30002] = array[n9 + 3];
                        }
                        this.field30012.method30727(array2, 0, b);
                        this.field30012.method30727(array2, this.field30002, b);
                        this.field30012.method30727(array2, 2 * this.field30002, b);
                        this.field30012.method30727(array2, 3 * this.field30002, b);
                        for (int n11 = 0; n11 < this.field30002; ++n11) {
                            final int n12 = n11 * this.field30008 + n6 + n7;
                            final int n13 = this.field30002 + n11;
                            array[n12] = array2[n11];
                            array[n12 + 1] = array2[n13];
                            array[n12 + 2] = array2[n13 + this.field30002];
                            array[n12 + 3] = array2[n13 + 2 * this.field30002];
                        }
                    }
                }
            }
        }
        else if (this.field30006 <= 2) {
            if (this.field30006 == 2) {
                for (int n14 = 0; n14 < this.field30004; ++n14) {
                    final int n15 = n14 * this.field30010;
                    for (int n16 = 0; n16 < this.field30002; ++n16) {
                        final int n17 = n16 * this.field30008 + n15;
                        array2[n16] = array[n17];
                        array2[this.field30002 + n16] = array[n17 + 1];
                    }
                    this.field30012.method30723(array2, 0, b);
                    this.field30012.method30723(array2, this.field30002, b);
                    for (int n18 = 0; n18 < this.field30002; ++n18) {
                        final int n19 = n18 * this.field30008 + n15;
                        array[n19] = array2[n18];
                        array[n19 + 1] = array2[this.field30002 + n18];
                    }
                }
            }
        }
        else {
            for (int n20 = 0; n20 < this.field30004; ++n20) {
                final int n21 = n20 * this.field30010;
                for (int n22 = 0; n22 < this.field30006; n22 += 4) {
                    for (int n23 = 0; n23 < this.field30002; ++n23) {
                        final int n24 = n23 * this.field30008 + n21 + n22;
                        final int n25 = this.field30002 + n23;
                        array2[n23] = array[n24];
                        array2[n25] = array[n24 + 1];
                        array2[n25 + this.field30002] = array[n24 + 2];
                        array2[n25 + 2 * this.field30002] = array[n24 + 3];
                    }
                    this.field30012.method30723(array2, 0, b);
                    this.field30012.method30723(array2, this.field30002, b);
                    this.field30012.method30723(array2, 2 * this.field30002, b);
                    this.field30012.method30723(array2, 3 * this.field30002, b);
                    for (int n26 = 0; n26 < this.field30002; ++n26) {
                        final int n27 = n26 * this.field30008 + n21 + n22;
                        final int n28 = this.field30002 + n26;
                        array[n27] = array2[n26];
                        array[n27 + 1] = array2[n28];
                        array[n27 + 2] = array2[n28 + this.field30002];
                        array[n27 + 3] = array2[n28 + 2 * this.field30002];
                    }
                }
            }
        }
    }
    
    private void method23768(final int n, final Class17 class17, final boolean b) {
        long n2 = 4L * this.field30003;
        if (this.field30007 == 2L) {
            n2 >>= 1;
        }
        final Class17 class18 = new Class17(n2);
        if (n != -1) {
            if (this.field30007 <= 2L) {
                if (this.field30007 == 2L) {
                    for (long n3 = 0L; n3 < this.field30005; ++n3) {
                        final long n4 = n3 * this.field30011;
                        for (long n5 = 0L; n5 < this.field30003; ++n5) {
                            final long n6 = n5 * this.field30009 + n4;
                            class18.method171(n5, class17.method137(n6));
                            class18.method171(this.field30003 + n5, class17.method137(n6 + 1L));
                        }
                        this.field30012.method30728(class18, 0L, b);
                        this.field30012.method30728(class18, this.field30003, b);
                        for (long n7 = 0L; n7 < this.field30003; ++n7) {
                            final long n8 = n7 * this.field30009 + n4;
                            class17.method171(n8, class18.method137(n7));
                            class17.method171(n8 + 1L, class18.method137(this.field30003 + n7));
                        }
                    }
                }
            }
            else {
                for (long n9 = 0L; n9 < this.field30005; ++n9) {
                    final long n10 = n9 * this.field30011;
                    for (long n11 = 0L; n11 < this.field30007; n11 += 4L) {
                        for (long n12 = 0L; n12 < this.field30003; ++n12) {
                            final long n13 = n12 * this.field30009 + n10 + n11;
                            final long n14 = this.field30003 + n12;
                            class18.method171(n12, class17.method137(n13));
                            class18.method171(n14, class17.method137(n13 + 1L));
                            class18.method171(n14 + this.field30003, class17.method137(n13 + 2L));
                            class18.method171(n14 + 2L * this.field30003, class17.method137(n13 + 3L));
                        }
                        this.field30012.method30728(class18, 0L, b);
                        this.field30012.method30728(class18, this.field30003, b);
                        this.field30012.method30728(class18, 2L * this.field30003, b);
                        this.field30012.method30728(class18, 3L * this.field30003, b);
                        for (long n15 = 0L; n15 < this.field30003; ++n15) {
                            final long n16 = n15 * this.field30009 + n10 + n11;
                            final long n17 = this.field30003 + n15;
                            class17.method171(n16, class18.method137(n15));
                            class17.method171(n16 + 1L, class18.method137(n17));
                            class17.method171(n16 + 2L, class18.method137(n17 + this.field30003));
                            class17.method171(n16 + 3L, class18.method137(n17 + 2L * this.field30003));
                        }
                    }
                }
            }
        }
        else if (this.field30007 <= 2L) {
            if (this.field30007 == 2L) {
                for (long n18 = 0L; n18 < this.field30005; ++n18) {
                    final long n19 = n18 * this.field30011;
                    for (long n20 = 0L; n20 < this.field30003; ++n20) {
                        final long n21 = n20 * this.field30009 + n19;
                        class18.method171(n20, class17.method137(n21));
                        class18.method171(this.field30003 + n20, class17.method137(n21 + 1L));
                    }
                    this.field30012.method30724(class18, 0L, b);
                    this.field30012.method30724(class18, this.field30003, b);
                    for (long n22 = 0L; n22 < this.field30003; ++n22) {
                        final long n23 = n22 * this.field30009 + n19;
                        class17.method171(n23, class18.method137(n22));
                        class17.method171(n23 + 1L, class18.method137(this.field30003 + n22));
                    }
                }
            }
        }
        else {
            for (long n24 = 0L; n24 < this.field30005; ++n24) {
                final long n25 = n24 * this.field30011;
                for (long n26 = 0L; n26 < this.field30007; n26 += 4L) {
                    for (long n27 = 0L; n27 < this.field30003; ++n27) {
                        final long n28 = n27 * this.field30009 + n25 + n26;
                        final long n29 = this.field30003 + n27;
                        class18.method171(n27, class17.method137(n28));
                        class18.method171(n29, class17.method137(n28 + 1L));
                        class18.method171(n29 + this.field30003, class17.method137(n28 + 2L));
                        class18.method171(n29 + 2L * this.field30003, class17.method137(n28 + 3L));
                    }
                    this.field30012.method30724(class18, 0L, b);
                    this.field30012.method30724(class18, this.field30003, b);
                    this.field30012.method30724(class18, 2L * this.field30003, b);
                    this.field30012.method30724(class18, 3L * this.field30003, b);
                    for (long n30 = 0L; n30 < this.field30003; ++n30) {
                        final long n31 = n30 * this.field30009 + n25 + n26;
                        final long n32 = this.field30003 + n30;
                        class17.method171(n31, class18.method137(n30));
                        class17.method171(n31 + 1L, class18.method137(n32));
                        class17.method171(n31 + 2L, class18.method137(n32 + this.field30003));
                        class17.method171(n31 + 3L, class18.method137(n32 + 2L * this.field30003));
                    }
                }
            }
        }
    }
    
    private void method23769(final int n, final double[][][] array, final boolean b) {
        int n2 = 4 * this.field30002;
        if (this.field30006 == 2) {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            if (this.field30006 <= 2) {
                if (this.field30006 == 2) {
                    for (int i = 0; i < this.field30004; ++i) {
                        for (int j = 0; j < this.field30002; ++j) {
                            array2[j] = array[j][i][0];
                            array2[this.field30002 + j] = array[j][i][1];
                        }
                        this.field30012.method30727(array2, 0, b);
                        this.field30012.method30727(array2, this.field30002, b);
                        for (int k = 0; k < this.field30002; ++k) {
                            array[k][i][0] = array2[k];
                            array[k][i][1] = array2[this.field30002 + k];
                        }
                    }
                }
            }
            else {
                for (int l = 0; l < this.field30004; ++l) {
                    for (int n3 = 0; n3 < this.field30006; n3 += 4) {
                        for (int n4 = 0; n4 < this.field30002; ++n4) {
                            final int n5 = this.field30002 + n4;
                            array2[n4] = array[n4][l][n3];
                            array2[n5] = array[n4][l][n3 + 1];
                            array2[n5 + this.field30002] = array[n4][l][n3 + 2];
                            array2[n5 + 2 * this.field30002] = array[n4][l][n3 + 3];
                        }
                        this.field30012.method30727(array2, 0, b);
                        this.field30012.method30727(array2, this.field30002, b);
                        this.field30012.method30727(array2, 2 * this.field30002, b);
                        this.field30012.method30727(array2, 3 * this.field30002, b);
                        for (int n6 = 0; n6 < this.field30002; ++n6) {
                            final int n7 = this.field30002 + n6;
                            array[n6][l][n3] = array2[n6];
                            array[n6][l][n3 + 1] = array2[n7];
                            array[n6][l][n3 + 2] = array2[n7 + this.field30002];
                            array[n6][l][n3 + 3] = array2[n7 + 2 * this.field30002];
                        }
                    }
                }
            }
        }
        else if (this.field30006 <= 2) {
            if (this.field30006 == 2) {
                for (int n8 = 0; n8 < this.field30004; ++n8) {
                    for (int n9 = 0; n9 < this.field30002; ++n9) {
                        array2[n9] = array[n9][n8][0];
                        array2[this.field30002 + n9] = array[n9][n8][1];
                    }
                    this.field30012.method30723(array2, 0, b);
                    this.field30012.method30723(array2, this.field30002, b);
                    for (int n10 = 0; n10 < this.field30002; ++n10) {
                        array[n10][n8][0] = array2[n10];
                        array[n10][n8][1] = array2[this.field30002 + n10];
                    }
                }
            }
        }
        else {
            for (int n11 = 0; n11 < this.field30004; ++n11) {
                for (int n12 = 0; n12 < this.field30006; n12 += 4) {
                    for (int n13 = 0; n13 < this.field30002; ++n13) {
                        final int n14 = this.field30002 + n13;
                        array2[n13] = array[n13][n11][n12];
                        array2[n14] = array[n13][n11][n12 + 1];
                        array2[n14 + this.field30002] = array[n13][n11][n12 + 2];
                        array2[n14 + 2 * this.field30002] = array[n13][n11][n12 + 3];
                    }
                    this.field30012.method30723(array2, 0, b);
                    this.field30012.method30723(array2, this.field30002, b);
                    this.field30012.method30723(array2, 2 * this.field30002, b);
                    this.field30012.method30723(array2, 3 * this.field30002, b);
                    for (int n15 = 0; n15 < this.field30002; ++n15) {
                        final int n16 = this.field30002 + n15;
                        array[n15][n11][n12] = array2[n15];
                        array[n15][n11][n12 + 1] = array2[n16];
                        array[n15][n11][n12 + 2] = array2[n16 + this.field30002];
                        array[n15][n11][n12 + 3] = array2[n16 + 2 * this.field30002];
                    }
                }
            }
        }
    }
    
    private void method23770(final int n, final double[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field30002) ? this.field30002 : Class8216.method27224();
        int n3 = 4 * this.field30004;
        if (this.field30006 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1125(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method23771(final int n, final Class17 class17, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field30003) ? this.field30003 : Class8216.method27224());
        long n3 = 4L * this.field30005;
        if (this.field30007 == 2L) {
            n3 >>= 1;
        }
        final long n4 = n3;
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class935(this, n4, n, i, n2, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method23772(final int n, final double[][][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field30002) ? this.field30002 : Class8216.method27224();
        int n3 = 4 * this.field30004;
        if (this.field30006 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class968(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method23773(final int n, final double[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field30004) ? this.field30004 : Class8216.method27224();
        int n3 = 4 * this.field30002;
        if (this.field30006 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1126(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method23774(final int n, final Class17 class17, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field30005) ? this.field30005 : Class8216.method27224());
        long n3 = 4L * this.field30003;
        if (this.field30007 == 2L) {
            n3 >>= 1;
        }
        final long n4 = n3;
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1134(this, n4, n, i, n2, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method23775(final int n, final double[][][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field30004) ? this.field30004 : Class8216.method27224();
        int n3 = 4 * this.field30002;
        if (this.field30006 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1268(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7568.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
}
