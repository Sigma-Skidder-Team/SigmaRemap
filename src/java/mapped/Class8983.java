// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class8983
{
    private int field37861;
    private int field37862;
    private long field37863;
    private long field37864;
    private Class7992 field37865;
    private Class7992 field37866;
    private boolean field37867;
    private boolean field37868;
    
    public Class8983(final long field37863, final long field37864) {
        this.field37867 = false;
        this.field37868 = false;
        if (field37863 > 1L && field37864 > 1L) {
            this.field37861 = (int)field37863;
            this.field37862 = (int)field37864;
            this.field37863 = field37863;
            this.field37864 = field37864;
            if (field37863 * field37864 >= Class9133.method33160()) {
                this.field37868 = true;
            }
            if (Class9133.method33175(field37863)) {
                if (Class9133.method33175(field37864)) {
                    this.field37867 = true;
                }
            }
            Class9133.method33169(2L * field37863 * field37864 > Class11.method177());
            this.field37866 = new Class7992(field37863);
            if (field37863 != field37864) {
                this.field37865 = new Class7992(field37864);
            }
            else {
                this.field37865 = this.field37866;
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be greater than 1");
    }
    
    public void method31933(final double[] array) {
        final int method27224 = Class8216.method27224();
        if (this.field37867) {
            this.field37862 *= 2;
            if (method27224 > 1 && this.field37868) {
                this.method31963(0, -1, array, true);
                this.method31969(-1, array, true);
            }
            else {
                for (int i = 0; i < this.field37861; ++i) {
                    this.field37865.method26074(array, i * this.field37862);
                }
                this.method31960(-1, array, true);
            }
            this.field37862 /= 2;
        }
        else {
            final int n = 2 * this.field37862;
            if (method27224 > 1 && this.field37868 && this.field37861 >= method27224 && this.field37862 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n2 = this.field37861 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n2;
                    array2[j] = Class8216.method27227(new Class1014(this, n3, (j == method27224 - 1) ? this.field37861 : (n3 + n2), array, n));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final int n4 = this.field37862 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    array2[k] = Class8216.method27227(new Class1056(this, n5, (k == method27224 - 1) ? this.field37862 : (n5 + n4), n, array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (int l = 0; l < this.field37861; ++l) {
                    this.field37865.method26074(array, l * n);
                }
                final double[] array3 = new double[2 * this.field37861];
                for (int n6 = 0; n6 < this.field37862; ++n6) {
                    final int n7 = 2 * n6;
                    for (int n8 = 0; n8 < this.field37861; ++n8) {
                        final int n9 = 2 * n8;
                        final int n10 = n8 * n + n7;
                        array3[n9] = array[n10];
                        array3[n9 + 1] = array[n10 + 1];
                    }
                    this.field37866.method26072(array3);
                    for (int n11 = 0; n11 < this.field37861; ++n11) {
                        final int n12 = 2 * n11;
                        final int n13 = n11 * n + n7;
                        array[n13] = array3[n12];
                        array[n13 + 1] = array3[n12 + 1];
                    }
                }
            }
        }
    }
    
    public void method31934(final Class17 class17) {
        final int method27224 = Class8216.method27224();
        if (this.field37867) {
            this.field37864 *= 2L;
            if (method27224 > 1 && this.field37868) {
                this.method31964(0L, -1, class17, true);
                this.method31970(-1, class17, true);
            }
            else {
                for (int n = 0; n < this.field37863; ++n) {
                    this.field37865.method26075(class17, n * this.field37864);
                }
                this.method31961(-1, class17, true);
            }
            this.field37864 /= 2L;
        }
        else {
            final long n2 = 2L * this.field37864;
            if (method27224 > 1 && this.field37868 && this.field37863 >= method27224 && this.field37864 >= method27224) {
                final Future[] array = new Future[method27224];
                final long n3 = this.field37863 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final long n4 = i * n3;
                    array[i] = Class8216.method27227(new Class1064(this, n4, (i == method27224 - 1) ? this.field37863 : (n4 + n3), class17, n2));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final long n5 = this.field37864 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final long n6 = j * n5;
                    array[j] = Class8216.method27227(new Class1149(this, n6, (j == method27224 - 1) ? this.field37864 : (n6 + n5), n2, class17));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (long n7 = 0L; n7 < this.field37863; ++n7) {
                    this.field37865.method26075(class17, n7 * n2);
                }
                final Class17 class18 = new Class17(2L * this.field37863, false);
                for (long n8 = 0L; n8 < this.field37864; ++n8) {
                    final long n9 = 2L * n8;
                    for (long n10 = 0L; n10 < this.field37863; ++n10) {
                        final long n11 = 2L * n10;
                        final long n12 = n10 * n2 + n9;
                        class18.method171(n11, class17.method137(n12));
                        class18.method171(n11 + 1L, class17.method137(n12 + 1L));
                    }
                    this.field37866.method26073(class18);
                    for (long n13 = 0L; n13 < this.field37863; ++n13) {
                        final long n14 = 2L * n13;
                        final long n15 = n13 * n2 + n9;
                        class17.method171(n15, class18.method137(n14));
                        class17.method171(n15 + 1L, class18.method137(n14 + 1L));
                    }
                }
            }
        }
    }
    
    public void method31935(final double[][] array) {
        final int method27224 = Class8216.method27224();
        if (this.field37867) {
            this.field37862 *= 2;
            if (method27224 > 1 && this.field37868) {
                this.method31967(0, -1, array, true);
                this.method31971(-1, array, true);
            }
            else {
                for (int i = 0; i < this.field37861; ++i) {
                    this.field37865.method26072(array[i]);
                }
                this.method31962(-1, array, true);
            }
            this.field37862 /= 2;
        }
        else if (method27224 > 1 && this.field37868 && this.field37861 >= method27224 && this.field37862 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field37861 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1560(this, n2, (j == method27224 - 1) ? this.field37861 : (n2 + n), array));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field37862 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1261(this, n4, (k == method27224 - 1) ? this.field37862 : (n4 + n3), array));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field37861; ++l) {
                this.field37865.method26072(array[l]);
            }
            final double[] array3 = new double[2 * this.field37861];
            for (int n5 = 0; n5 < this.field37862; ++n5) {
                final int n6 = 2 * n5;
                for (int n7 = 0; n7 < this.field37861; ++n7) {
                    final int n8 = 2 * n7;
                    array3[n8] = array[n7][n6];
                    array3[n8 + 1] = array[n7][n6 + 1];
                }
                this.field37866.method26072(array3);
                for (int n9 = 0; n9 < this.field37861; ++n9) {
                    final int n10 = 2 * n9;
                    array[n9][n6] = array3[n10];
                    array[n9][n6 + 1] = array3[n10 + 1];
                }
            }
        }
    }
    
    public void method31936(final double[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field37867) {
            this.field37862 *= 2;
            if (method27224 > 1 && this.field37868) {
                this.method31963(0, 1, array, b);
                this.method31969(1, array, b);
            }
            else {
                for (int i = 0; i < this.field37861; ++i) {
                    this.field37865.method26078(array, i * this.field37862, b);
                }
                this.method31960(1, array, b);
            }
            this.field37862 /= 2;
        }
        else {
            final int n = 2 * this.field37862;
            if (method27224 > 1 && this.field37868 && this.field37861 >= method27224 && this.field37862 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n2 = this.field37861 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n2;
                    array2[j] = Class8216.method27227(new Class1004(this, n3, (j == method27224 - 1) ? this.field37861 : (n3 + n2), array, n, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final int n4 = this.field37862 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    array2[k] = Class8216.method27227(new Class1366(this, n5, (k == method27224 - 1) ? this.field37862 : (n5 + n4), n, array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (int l = 0; l < this.field37861; ++l) {
                    this.field37865.method26078(array, l * n, b);
                }
                final double[] array3 = new double[2 * this.field37861];
                for (int n6 = 0; n6 < this.field37862; ++n6) {
                    final int n7 = 2 * n6;
                    for (int n8 = 0; n8 < this.field37861; ++n8) {
                        final int n9 = 2 * n8;
                        final int n10 = n8 * n + n7;
                        array3[n9] = array[n10];
                        array3[n9 + 1] = array[n10 + 1];
                    }
                    this.field37866.method26076(array3, b);
                    for (int n11 = 0; n11 < this.field37861; ++n11) {
                        final int n12 = 2 * n11;
                        final int n13 = n11 * n + n7;
                        array[n13] = array3[n12];
                        array[n13 + 1] = array3[n12 + 1];
                    }
                }
            }
        }
    }
    
    public void method31937(final Class17 class17, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field37867) {
            this.field37864 *= 2L;
            if (method27224 > 1 && this.field37868) {
                this.method31964(0L, 1, class17, b);
                this.method31970(1, class17, b);
            }
            else {
                for (long n = 0L; n < this.field37863; ++n) {
                    this.field37865.method26079(class17, n * this.field37864, b);
                }
                this.method31961(1, class17, b);
            }
            this.field37864 /= 2L;
        }
        else {
            final long n2 = 2L * this.field37864;
            if (method27224 > 1 && this.field37868 && this.field37863 >= method27224 && this.field37864 >= method27224) {
                final Future[] array = new Future[method27224];
                final long n3 = this.field37863 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final long n4 = i * n3;
                    array[i] = Class8216.method27227(new Class1506(this, n4, (i == method27224 - 1) ? this.field37863 : (n4 + n3), class17, n2, b));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final long n5 = this.field37864 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final long n6 = j * n5;
                    array[j] = Class8216.method27227(new Class1132(this, n6, (j == method27224 - 1) ? this.field37864 : (n6 + n5), n2, class17, b));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (long n7 = 0L; n7 < this.field37863; ++n7) {
                    this.field37865.method26079(class17, n7 * n2, b);
                }
                final Class17 class18 = new Class17(2L * this.field37863, false);
                for (long n8 = 0L; n8 < this.field37864; ++n8) {
                    final long n9 = 2L * n8;
                    for (long n10 = 0L; n10 < this.field37863; ++n10) {
                        final long n11 = 2L * n10;
                        final long n12 = n10 * n2 + n9;
                        class18.method171(n11, class17.method137(n12));
                        class18.method171(n11 + 1L, class17.method137(n12 + 1L));
                    }
                    this.field37866.method26077(class18, b);
                    for (long n13 = 0L; n13 < this.field37863; ++n13) {
                        final long n14 = 2L * n13;
                        final long n15 = n13 * n2 + n9;
                        class17.method171(n15, class18.method137(n14));
                        class17.method171(n15 + 1L, class18.method137(n14 + 1L));
                    }
                }
            }
        }
    }
    
    public void method31938(final double[][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field37867) {
            this.field37862 *= 2;
            if (method27224 > 1 && this.field37868) {
                this.method31967(0, 1, array, b);
                this.method31971(1, array, b);
            }
            else {
                for (int i = 0; i < this.field37861; ++i) {
                    this.field37865.method26076(array[i], b);
                }
                this.method31962(1, array, b);
            }
            this.field37862 /= 2;
        }
        else if (method27224 > 1 && this.field37868 && this.field37861 >= method27224 && this.field37862 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field37861 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1166(this, n2, (j == method27224 - 1) ? this.field37861 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field37862 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class991(this, n4, (k == method27224 - 1) ? this.field37862 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field37861; ++l) {
                this.field37865.method26076(array[l], b);
            }
            final double[] array3 = new double[2 * this.field37861];
            for (int n5 = 0; n5 < this.field37862; ++n5) {
                final int n6 = 2 * n5;
                for (int n7 = 0; n7 < this.field37861; ++n7) {
                    final int n8 = 2 * n7;
                    array3[n8] = array[n7][n6];
                    array3[n8 + 1] = array[n7][n6 + 1];
                }
                this.field37866.method26076(array3, b);
                for (int n9 = 0; n9 < this.field37861; ++n9) {
                    final int n10 = 2 * n9;
                    array[n9][n6] = array3[n10];
                    array[n9][n6 + 1] = array3[n10 + 1];
                }
            }
        }
    }
    
    public void method31939(final double[] array) {
        if (this.field37867) {
            if (Class8216.method27224() > 1 && this.field37868) {
                this.method31963(1, 1, array, true);
                this.method31969(-1, array, true);
                this.method31957(1, array);
            }
            else {
                for (int i = 0; i < this.field37861; ++i) {
                    this.field37865.method26082(array, i * this.field37862);
                }
                this.method31960(-1, array, true);
                this.method31957(1, array);
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be power of two numbers");
    }
    
    public void method31940(final Class17 class17) {
        if (this.field37867) {
            if (Class8216.method27224() > 1 && this.field37868) {
                this.method31964(1L, 1, class17, true);
                this.method31970(-1, class17, true);
                this.method31958(1, class17);
            }
            else {
                for (long n = 0L; n < this.field37863; ++n) {
                    this.field37865.method26083(class17, n * this.field37864);
                }
                this.method31961(-1, class17, true);
                this.method31958(1, class17);
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be power of two numbers");
    }
    
    public void method31941(final double[][] array) {
        if (this.field37867) {
            if (Class8216.method27224() > 1 && this.field37868) {
                this.method31967(1, 1, array, true);
                this.method31971(-1, array, true);
                this.method31959(1, array);
            }
            else {
                for (int i = 0; i < this.field37861; ++i) {
                    this.field37865.method26080(array[i]);
                }
                this.method31962(-1, array, true);
                this.method31959(1, array);
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be power of two numbers");
    }
    
    public void method31942(final double[] array) {
        if (!this.field37867) {
            this.method31952(array);
        }
        else {
            if (Class8216.method27224() > 1 && this.field37868) {
                this.method31963(1, 1, array, true);
                this.method31969(-1, array, true);
                this.method31957(1, array);
            }
            else {
                for (int i = 0; i < this.field37861; ++i) {
                    this.field37865.method26082(array, i * this.field37862);
                }
                this.method31960(-1, array, true);
                this.method31957(1, array);
            }
            this.method31972(array);
        }
    }
    
    public void method31943(final Class17 class17) {
        if (!this.field37867) {
            this.method31953(class17);
        }
        else {
            if (Class8216.method27224() > 1 && this.field37868) {
                this.method31964(1L, 1, class17, true);
                this.method31970(-1, class17, true);
                this.method31958(1, class17);
            }
            else {
                for (long n = 0L; n < this.field37863; ++n) {
                    this.field37865.method26083(class17, n * this.field37864);
                }
                this.method31961(-1, class17, true);
                this.method31958(1, class17);
            }
            this.method31973(class17);
        }
    }
    
    public void method31944(final double[][] array) {
        if (!this.field37867) {
            this.method31951(array);
        }
        else {
            if (Class8216.method27224() > 1 && this.field37868) {
                this.method31967(1, 1, array, true);
                this.method31971(-1, array, true);
                this.method31959(1, array);
            }
            else {
                for (int i = 0; i < this.field37861; ++i) {
                    this.field37865.method26080(array[i]);
                }
                this.method31962(-1, array, true);
                this.method31959(1, array);
            }
            this.method31974(array);
        }
    }
    
    public void method31945(final double[] array, final boolean b) {
        if (this.field37867) {
            if (Class8216.method27224() > 1 && this.field37868) {
                this.method31957(-1, array);
                this.method31969(1, array, b);
                this.method31963(1, -1, array, b);
            }
            else {
                this.method31957(-1, array);
                this.method31960(1, array, b);
                for (int i = 0; i < this.field37861; ++i) {
                    this.field37865.method26090(array, i * this.field37862, b);
                }
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be power of two numbers");
    }
    
    public void method31946(final Class17 class17, final boolean b) {
        if (this.field37867) {
            if (Class8216.method27224() > 1 && this.field37868) {
                this.method31958(-1, class17);
                this.method31970(1, class17, b);
                this.method31964(1L, -1, class17, b);
            }
            else {
                this.method31958(-1, class17);
                this.method31961(1, class17, b);
                for (long n = 0L; n < this.field37863; ++n) {
                    this.field37865.method26091(class17, n * this.field37864, b);
                }
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be power of two numbers");
    }
    
    public void method31947(final double[][] array, final boolean b) {
        if (this.field37867) {
            if (Class8216.method27224() > 1 && this.field37868) {
                this.method31959(-1, array);
                this.method31971(1, array, b);
                this.method31967(1, -1, array, b);
            }
            else {
                this.method31959(-1, array);
                this.method31962(1, array, b);
                for (int i = 0; i < this.field37861; ++i) {
                    this.field37865.method26088(array[i], b);
                }
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be power of two numbers");
    }
    
    public void method31948(final double[] array, final boolean b) {
        if (!this.field37867) {
            this.method31955(array, b);
        }
        else {
            if (Class8216.method27224() > 1 && this.field37868) {
                this.method31965(1, -1, array, b);
                this.method31969(1, array, b);
                this.method31957(1, array);
            }
            else {
                for (int i = 0; i < this.field37861; ++i) {
                    this.field37865.method26096(array, i * this.field37862, b);
                }
                this.method31960(1, array, b);
                this.method31957(1, array);
            }
            this.method31972(array);
        }
    }
    
    public void method31949(final Class17 class17, final boolean b) {
        if (!this.field37867) {
            this.method31956(class17, b);
        }
        else {
            if (Class8216.method27224() > 1 && this.field37868) {
                this.method31966(1L, -1, class17, b);
                this.method31970(1, class17, b);
                this.method31958(1, class17);
            }
            else {
                for (long n = 0L; n < this.field37863; ++n) {
                    this.field37865.method26097(class17, n * this.field37864, b);
                }
                this.method31961(1, class17, b);
                this.method31958(1, class17);
            }
            this.method31973(class17);
        }
    }
    
    public void method31950(final double[][] array, final boolean b) {
        if (!this.field37867) {
            this.method31954(array, b);
        }
        else {
            if (Class8216.method27224() > 1 && this.field37868) {
                this.method31968(1, -1, array, b);
                this.method31971(1, array, b);
                this.method31959(1, array);
            }
            else {
                for (int i = 0; i < this.field37861; ++i) {
                    this.field37865.method26096(array[i], 0, b);
                }
                this.method31962(1, array, b);
                this.method31959(1, array);
            }
            this.method31974(array);
        }
    }
    
    private void method31951(final double[][] array) {
        final int n = this.field37862 / 2 + 1;
        final double[][] array2 = new double[n][2 * this.field37861];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field37868 && this.field37861 >= method27224 && n - 2 >= method27224) {
            final Future[] array3 = new Future[method27224];
            final int n2 = this.field37861 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n3 = i * n2;
                array3[i] = Class8216.method27227(new Class1173(this, n3, (i == method27224 - 1) ? this.field37861 : (n3 + n2), array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < this.field37861; ++j) {
                array2[0][j] = array[j][0];
            }
            this.field37866.method26084(array2[0]);
            final int n4 = (n - 2) / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = 1 + k * n4;
                array3[k] = Class8216.method27227(new Class1252(this, n5, (k == method27224 - 1) ? (n - 1) : (n5 + n4), array2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            if (this.field37862 % 2 == 0) {
                for (int l = 0; l < this.field37861; ++l) {
                    array2[n - 1][l] = array[l][1];
                }
                this.field37866.method26084(array2[n - 1]);
            }
            else {
                for (int n6 = 0; n6 < this.field37861; ++n6) {
                    final int n7 = 2 * n6;
                    final int n8 = n - 1;
                    array2[n8][n7] = array[n6][2 * n8];
                    array2[n8][n7 + 1] = array[n6][1];
                }
                this.field37866.method26072(array2[n - 1]);
            }
            final int n9 = this.field37861 / method27224;
            for (int n10 = 0; n10 < method27224; ++n10) {
                final int n11 = n10 * n9;
                array3[n10] = Class8216.method27227(new Class1277(this, n11, (n10 == method27224 - 1) ? this.field37861 : (n11 + n9), n, array, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            for (int n12 = 0; n12 < method27224; ++n12) {
                final int n13 = 1 + n12 * n9;
                array3[n12] = Class8216.method27227(new Class1009(this, n13, (n12 == method27224 - 1) ? this.field37861 : (n13 + n9), n, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (int n14 = 0; n14 < this.field37861; ++n14) {
                this.field37865.method26080(array[n14]);
            }
            for (int n15 = 0; n15 < this.field37861; ++n15) {
                array2[0][n15] = array[n15][0];
            }
            this.field37866.method26084(array2[0]);
            for (int n16 = 1; n16 < n - 1; ++n16) {
                final int n17 = 2 * n16;
                for (int n18 = 0; n18 < this.field37861; ++n18) {
                    final int n19 = 2 * n18;
                    array2[n16][n19] = array[n18][n17];
                    array2[n16][n19 + 1] = array[n18][n17 + 1];
                }
                this.field37866.method26072(array2[n16]);
            }
            if (this.field37862 % 2 == 0) {
                for (int n20 = 0; n20 < this.field37861; ++n20) {
                    array2[n - 1][n20] = array[n20][1];
                }
                this.field37866.method26084(array2[n - 1]);
            }
            else {
                for (int n21 = 0; n21 < this.field37861; ++n21) {
                    final int n22 = 2 * n21;
                    final int n23 = n - 1;
                    array2[n23][n22] = array[n21][2 * n23];
                    array2[n23][n22 + 1] = array[n21][1];
                }
                this.field37866.method26072(array2[n - 1]);
            }
            for (int n24 = 0; n24 < this.field37861; ++n24) {
                final int n25 = 2 * n24;
                for (int n26 = 0; n26 < n; ++n26) {
                    final int n27 = 2 * n26;
                    array[n24][n27] = array2[n26][n25];
                    array[n24][n27 + 1] = array2[n26][n25 + 1];
                }
            }
            for (int n28 = 1; n28 < this.field37861; ++n28) {
                final int n29 = this.field37861 - n28;
                for (int n30 = n; n30 < this.field37862; ++n30) {
                    final int n31 = 2 * n30;
                    final int n32 = 2 * (this.field37862 - n30);
                    array[0][n31] = array[0][n32];
                    array[0][n31 + 1] = -array[0][n32 + 1];
                    array[n28][n31] = array[n29][n32];
                    array[n28][n31 + 1] = -array[n29][n32 + 1];
                }
            }
        }
    }
    
    private void method31952(final double[] array) {
        final int n = 2 * this.field37862;
        final int n2 = this.field37862 / 2 + 1;
        final double[][] array2 = new double[n2][2 * this.field37861];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field37868 && this.field37861 >= method27224 && n2 - 2 >= method27224) {
            final Future[] array3 = new Future[method27224];
            final int n3 = this.field37861 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n4 = i * n3;
                array3[i] = Class8216.method27227(new Class1060(this, n4, (i == method27224 - 1) ? this.field37861 : (n4 + n3), array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < this.field37861; ++j) {
                array2[0][j] = array[j * this.field37862];
            }
            this.field37866.method26084(array2[0]);
            final int n5 = (n2 - 2) / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n6 = 1 + k * n5;
                array3[k] = Class8216.method27227(new Class1287(this, n6, (k == method27224 - 1) ? (n2 - 1) : (n6 + n5), array2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            if (this.field37862 % 2 == 0) {
                for (int l = 0; l < this.field37861; ++l) {
                    array2[n2 - 1][l] = array[l * this.field37862 + 1];
                }
                this.field37866.method26084(array2[n2 - 1]);
            }
            else {
                for (int n7 = 0; n7 < this.field37861; ++n7) {
                    final int n8 = 2 * n7;
                    final int n9 = n7 * this.field37862;
                    final int n10 = n2 - 1;
                    array2[n10][n8] = array[n9 + 2 * n10];
                    array2[n10][n8 + 1] = array[n9 + 1];
                }
                this.field37866.method26072(array2[n2 - 1]);
            }
            final int n11 = this.field37861 / method27224;
            for (int n12 = 0; n12 < method27224; ++n12) {
                final int n13 = n12 * n11;
                array3[n12] = Class8216.method27227(new Class1385(this, n13, (n12 == method27224 - 1) ? this.field37861 : (n13 + n11), n2, n, array, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            for (int n14 = 0; n14 < method27224; ++n14) {
                final int n15 = 1 + n14 * n11;
                array3[n14] = Class8216.method27227(new Class1502(this, n15, (n14 == method27224 - 1) ? this.field37861 : (n15 + n11), n, n2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (int n16 = 0; n16 < this.field37861; ++n16) {
                this.field37865.method26082(array, n16 * this.field37862);
            }
            for (int n17 = 0; n17 < this.field37861; ++n17) {
                array2[0][n17] = array[n17 * this.field37862];
            }
            this.field37866.method26084(array2[0]);
            for (int n18 = 1; n18 < n2 - 1; ++n18) {
                final int n19 = 2 * n18;
                for (int n20 = 0; n20 < this.field37861; ++n20) {
                    final int n21 = 2 * n20;
                    final int n22 = n20 * this.field37862 + n19;
                    array2[n18][n21] = array[n22];
                    array2[n18][n21 + 1] = array[n22 + 1];
                }
                this.field37866.method26072(array2[n18]);
            }
            if (this.field37862 % 2 == 0) {
                for (int n23 = 0; n23 < this.field37861; ++n23) {
                    array2[n2 - 1][n23] = array[n23 * this.field37862 + 1];
                }
                this.field37866.method26084(array2[n2 - 1]);
            }
            else {
                for (int n24 = 0; n24 < this.field37861; ++n24) {
                    final int n25 = 2 * n24;
                    final int n26 = n24 * this.field37862;
                    final int n27 = n2 - 1;
                    array2[n27][n25] = array[n26 + 2 * n27];
                    array2[n27][n25 + 1] = array[n26 + 1];
                }
                this.field37866.method26072(array2[n2 - 1]);
            }
            for (int n28 = 0; n28 < this.field37861; ++n28) {
                final int n29 = 2 * n28;
                for (int n30 = 0; n30 < n2; ++n30) {
                    final int n31 = n28 * n + 2 * n30;
                    array[n31] = array2[n30][n29];
                    array[n31 + 1] = array2[n30][n29 + 1];
                }
            }
            for (int n32 = 1; n32 < this.field37861; ++n32) {
                final int n33 = n32 * n;
                final int n34 = (this.field37861 - n32 + 1) * n;
                for (int n35 = n2; n35 < this.field37862; ++n35) {
                    final int n36 = 2 * n35;
                    final int n37 = 2 * (this.field37862 - n35);
                    array[n36] = array[n37];
                    array[n36 + 1] = -array[n37 + 1];
                    final int n38 = n33 + n36;
                    final int n39 = n34 - n36;
                    array[n38] = array[n39];
                    array[n38 + 1] = -array[n39 + 1];
                }
            }
        }
    }
    
    private void method31953(final Class17 class17) {
        final long n = 2L * this.field37864;
        final long n2 = this.field37864 / 2L + 1L;
        final Class17 class18 = new Class17(n2 * 2L * this.field37863);
        final long n3 = 2L * this.field37863;
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field37868 && this.field37863 >= method27224 && n2 - 2L >= method27224) {
            final Future[] array = new Future[method27224];
            final long n4 = this.field37863 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n5 = i * n4;
                array[i] = Class8216.method27227(new Class1442(this, n5, (i == method27224 - 1) ? this.field37863 : (n5 + n4), class17));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (long n6 = 0L; n6 < this.field37863; ++n6) {
                class18.method171(n6, class17.method137(n6 * this.field37864));
            }
            this.field37866.method26085(class18);
            final long n7 = (n2 - 2L) / method27224;
            for (int j = 0; j < method27224; ++j) {
                final long n8 = 1L + j * n7;
                array[j] = Class8216.method27227(new Class1520(this, n8, (j == method27224 - 1) ? (n2 - 1L) : (n8 + n7), class18, n3, class17));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            if (this.field37864 % 2L == 0L) {
                for (long n9 = 0L; n9 < this.field37863; ++n9) {
                    class18.method171((n2 - 1L) * n3 + n9, class17.method137(n9 * this.field37864 + 1L));
                }
                this.field37866.method26087(class18, (n2 - 1L) * n3);
            }
            else {
                for (long n10 = 0L; n10 < this.field37863; ++n10) {
                    final long n11 = 2L * n10;
                    final long n12 = n10 * this.field37864;
                    final long n13 = n2 - 1L;
                    class18.method171(n13 * n3 + n11, class17.method137(n12 + 2L * n13));
                    class18.method171(n13 * n3 + n11 + 1L, class17.method137(n12 + 1L));
                }
                this.field37866.method26075(class18, (n2 - 1L) * n3);
            }
            final long n14 = this.field37863 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final long n15 = k * n14;
                array[k] = Class8216.method27227(new Class1102(this, n15, (k == method27224 - 1) ? this.field37863 : (n15 + n14), n2, n, class17, class18, n3));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            for (int l = 0; l < method27224; ++l) {
                final long n16 = 1L + l * n14;
                array[l] = Class8216.method27227(new Class1393(this, n16, (l == method27224 - 1) ? this.field37863 : (n16 + n14), n, n2, class17));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (long n17 = 0L; n17 < this.field37863; ++n17) {
                this.field37865.method26083(class17, n17 * this.field37864);
            }
            for (long n18 = 0L; n18 < this.field37863; ++n18) {
                class18.method171(n18, class17.method137(n18 * this.field37864));
            }
            this.field37866.method26085(class18);
            for (long n19 = 1L; n19 < n2 - 1L; ++n19) {
                final long n20 = 2L * n19;
                for (long n21 = 0L; n21 < this.field37863; ++n21) {
                    final long n22 = 2L * n21;
                    final long n23 = n21 * this.field37864 + n20;
                    class18.method171(n19 * n3 + n22, class17.method137(n23));
                    class18.method171(n19 * n3 + n22 + 1L, class17.method137(n23 + 1L));
                }
                this.field37866.method26075(class18, n19 * n3);
            }
            if (this.field37864 % 2L == 0L) {
                for (long n24 = 0L; n24 < this.field37863; ++n24) {
                    class18.method171((n2 - 1L) * n3 + n24, class17.method137(n24 * this.field37864 + 1L));
                }
                this.field37866.method26087(class18, (n2 - 1L) * n3);
            }
            else {
                for (long n25 = 0L; n25 < this.field37863; ++n25) {
                    final long n26 = 2L * n25;
                    final long n27 = n25 * this.field37864;
                    final long n28 = n2 - 1L;
                    class18.method171(n28 * n3 + n26, class17.method137(n27 + 2L * n28));
                    class18.method171(n28 * n3 + n26 + 1L, class17.method137(n27 + 1L));
                }
                this.field37866.method26075(class18, (n2 - 1L) * n3);
            }
            for (long n29 = 0L; n29 < this.field37863; ++n29) {
                final long n30 = 2L * n29;
                for (long n31 = 0L; n31 < n2; ++n31) {
                    final long n32 = n29 * n + 2L * n31;
                    class17.method171(n32, class18.method137(n31 * n3 + n30));
                    class17.method171(n32 + 1L, class18.method137(n31 * n3 + n30 + 1L));
                }
            }
            for (long n33 = 1L; n33 < this.field37863; ++n33) {
                final long n34 = n33 * n;
                final long n35 = (this.field37863 - n33 + 1L) * n;
                for (long n36 = n2; n36 < this.field37864; ++n36) {
                    final long n37 = 2L * n36;
                    final long n38 = 2L * (this.field37864 - n36);
                    class17.method171(n37, class17.method137(n38));
                    class17.method171(n37 + 1L, -class17.method137(n38 + 1L));
                    final long n39 = n34 + n37;
                    final long n40 = n35 - n37;
                    class17.method171(n39, class17.method137(n40));
                    class17.method171(n39 + 1L, -class17.method137(n40 + 1L));
                }
            }
        }
    }
    
    private void method31954(final double[][] array, final boolean b) {
        final int n = this.field37862 / 2 + 1;
        final double[][] array2 = new double[n][2 * this.field37861];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field37868 && this.field37861 >= method27224 && n - 2 >= method27224) {
            final Future[] array3 = new Future[method27224];
            final int n2 = this.field37861 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n3 = i * n2;
                array3[i] = Class8216.method27227(new Class1638(this, n3, (i == method27224 - 1) ? this.field37861 : (n3 + n2), array, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < this.field37861; ++j) {
                array2[0][j] = array[j][0];
            }
            this.field37866.method26092(array2[0], b);
            final int n4 = (n - 2) / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = 1 + k * n4;
                array3[k] = Class8216.method27227(new Class1426(this, n5, (k == method27224 - 1) ? (n - 1) : (n5 + n4), array2, array, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            if (this.field37862 % 2 == 0) {
                for (int l = 0; l < this.field37861; ++l) {
                    array2[n - 1][l] = array[l][1];
                }
                this.field37866.method26092(array2[n - 1], b);
            }
            else {
                for (int n6 = 0; n6 < this.field37861; ++n6) {
                    final int n7 = 2 * n6;
                    final int n8 = n - 1;
                    array2[n8][n7] = array[n6][2 * n8];
                    array2[n8][n7 + 1] = array[n6][1];
                }
                this.field37866.method26076(array2[n - 1], b);
            }
            final int n9 = this.field37861 / method27224;
            for (int n10 = 0; n10 < method27224; ++n10) {
                final int n11 = n10 * n9;
                array3[n10] = Class8216.method27227(new Class1422(this, n11, (n10 == method27224 - 1) ? this.field37861 : (n11 + n9), n, array, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            for (int n12 = 0; n12 < method27224; ++n12) {
                final int n13 = 1 + n12 * n9;
                array3[n12] = Class8216.method27227(new Class1408(this, n13, (n12 == method27224 - 1) ? this.field37861 : (n13 + n9), n, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (int n14 = 0; n14 < this.field37861; ++n14) {
                this.field37865.method26096(array[n14], 0, b);
            }
            for (int n15 = 0; n15 < this.field37861; ++n15) {
                array2[0][n15] = array[n15][0];
            }
            this.field37866.method26092(array2[0], b);
            for (int n16 = 1; n16 < n - 1; ++n16) {
                final int n17 = 2 * n16;
                for (int n18 = 0; n18 < this.field37861; ++n18) {
                    final int n19 = 2 * n18;
                    array2[n16][n19] = array[n18][n17];
                    array2[n16][n19 + 1] = array[n18][n17 + 1];
                }
                this.field37866.method26076(array2[n16], b);
            }
            if (this.field37862 % 2 == 0) {
                for (int n20 = 0; n20 < this.field37861; ++n20) {
                    array2[n - 1][n20] = array[n20][1];
                }
                this.field37866.method26092(array2[n - 1], b);
            }
            else {
                for (int n21 = 0; n21 < this.field37861; ++n21) {
                    final int n22 = 2 * n21;
                    final int n23 = n - 1;
                    array2[n23][n22] = array[n21][2 * n23];
                    array2[n23][n22 + 1] = array[n21][1];
                }
                this.field37866.method26076(array2[n - 1], b);
            }
            for (int n24 = 0; n24 < this.field37861; ++n24) {
                final int n25 = 2 * n24;
                for (int n26 = 0; n26 < n; ++n26) {
                    final int n27 = 2 * n26;
                    array[n24][n27] = array2[n26][n25];
                    array[n24][n27 + 1] = array2[n26][n25 + 1];
                }
            }
            for (int n28 = 1; n28 < this.field37861; ++n28) {
                final int n29 = this.field37861 - n28;
                for (int n30 = n; n30 < this.field37862; ++n30) {
                    final int n31 = 2 * n30;
                    final int n32 = 2 * (this.field37862 - n30);
                    array[0][n31] = array[0][n32];
                    array[0][n31 + 1] = -array[0][n32 + 1];
                    array[n28][n31] = array[n29][n32];
                    array[n28][n31 + 1] = -array[n29][n32 + 1];
                }
            }
        }
    }
    
    private void method31955(final double[] array, final boolean b) {
        final int n = 2 * this.field37862;
        final int n2 = this.field37862 / 2 + 1;
        final double[][] array2 = new double[n2][2 * this.field37861];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field37868 && this.field37861 >= method27224 && n2 - 2 >= method27224) {
            final Future[] array3 = new Future[method27224];
            final int n3 = this.field37861 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n4 = i * n3;
                array3[i] = Class8216.method27227(new Class884(this, n4, (i == method27224 - 1) ? this.field37861 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < this.field37861; ++j) {
                array2[0][j] = array[j * this.field37862];
            }
            this.field37866.method26092(array2[0], b);
            final int n5 = (n2 - 2) / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n6 = 1 + k * n5;
                array3[k] = Class8216.method27227(new Class1053(this, n6, (k == method27224 - 1) ? (n2 - 1) : (n6 + n5), array2, array, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            if (this.field37862 % 2 == 0) {
                for (int l = 0; l < this.field37861; ++l) {
                    array2[n2 - 1][l] = array[l * this.field37862 + 1];
                }
                this.field37866.method26092(array2[n2 - 1], b);
            }
            else {
                for (int n7 = 0; n7 < this.field37861; ++n7) {
                    final int n8 = 2 * n7;
                    final int n9 = n7 * this.field37862;
                    final int n10 = n2 - 1;
                    array2[n10][n8] = array[n9 + 2 * n10];
                    array2[n10][n8 + 1] = array[n9 + 1];
                }
                this.field37866.method26076(array2[n2 - 1], b);
            }
            final int n11 = this.field37861 / method27224;
            for (int n12 = 0; n12 < method27224; ++n12) {
                final int n13 = n12 * n11;
                array3[n12] = Class8216.method27227(new Class1396(this, n13, (n12 == method27224 - 1) ? this.field37861 : (n13 + n11), n2, n, array, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            for (int n14 = 0; n14 < method27224; ++n14) {
                final int n15 = 1 + n14 * n11;
                array3[n14] = Class8216.method27227(new Class940(this, n15, (n14 == method27224 - 1) ? this.field37861 : (n15 + n11), n, n2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (int n16 = 0; n16 < this.field37861; ++n16) {
                this.field37865.method26096(array, n16 * this.field37862, b);
            }
            for (int n17 = 0; n17 < this.field37861; ++n17) {
                array2[0][n17] = array[n17 * this.field37862];
            }
            this.field37866.method26092(array2[0], b);
            for (int n18 = 1; n18 < n2 - 1; ++n18) {
                final int n19 = 2 * n18;
                for (int n20 = 0; n20 < this.field37861; ++n20) {
                    final int n21 = 2 * n20;
                    final int n22 = n20 * this.field37862 + n19;
                    array2[n18][n21] = array[n22];
                    array2[n18][n21 + 1] = array[n22 + 1];
                }
                this.field37866.method26076(array2[n18], b);
            }
            if (this.field37862 % 2 == 0) {
                for (int n23 = 0; n23 < this.field37861; ++n23) {
                    array2[n2 - 1][n23] = array[n23 * this.field37862 + 1];
                }
                this.field37866.method26092(array2[n2 - 1], b);
            }
            else {
                for (int n24 = 0; n24 < this.field37861; ++n24) {
                    final int n25 = 2 * n24;
                    final int n26 = n24 * this.field37862;
                    final int n27 = n2 - 1;
                    array2[n27][n25] = array[n26 + 2 * n27];
                    array2[n27][n25 + 1] = array[n26 + 1];
                }
                this.field37866.method26076(array2[n2 - 1], b);
            }
            for (int n28 = 0; n28 < this.field37861; ++n28) {
                final int n29 = 2 * n28;
                for (int n30 = 0; n30 < n2; ++n30) {
                    final int n31 = n28 * n + 2 * n30;
                    array[n31] = array2[n30][n29];
                    array[n31 + 1] = array2[n30][n29 + 1];
                }
            }
            for (int n32 = 1; n32 < this.field37861; ++n32) {
                final int n33 = n32 * n;
                final int n34 = (this.field37861 - n32 + 1) * n;
                for (int n35 = n2; n35 < this.field37862; ++n35) {
                    final int n36 = 2 * n35;
                    final int n37 = 2 * (this.field37862 - n35);
                    array[n36] = array[n37];
                    array[n36 + 1] = -array[n37 + 1];
                    final int n38 = n33 + n36;
                    final int n39 = n34 - n36;
                    array[n38] = array[n39];
                    array[n38 + 1] = -array[n39 + 1];
                }
            }
        }
    }
    
    private void method31956(final Class17 class17, final boolean b) {
        final long n = 2L * this.field37864;
        final long n2 = this.field37864 / 2L + 1L;
        final Class17 class18 = new Class17(n2 * 2L * this.field37863);
        final long n3 = 2L * this.field37863;
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field37868 && this.field37863 >= method27224 && n2 - 2L >= method27224) {
            final Future[] array = new Future[method27224];
            final long n4 = this.field37863 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n5 = i * n4;
                array[i] = Class8216.method27227(new Class1592(this, n5, (i == method27224 - 1) ? this.field37863 : (n5 + n4), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (long n6 = 0L; n6 < this.field37863; ++n6) {
                class18.method171(n6, class17.method137(n6 * this.field37864));
            }
            this.field37866.method26093(class18, b);
            final long n7 = (n2 - 2L) / method27224;
            for (int j = 0; j < method27224; ++j) {
                final long n8 = 1L + j * n7;
                array[j] = Class8216.method27227(new Class1080(this, n8, (j == method27224 - 1) ? (n2 - 1L) : (n8 + n7), class18, n3, class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            if (this.field37864 % 2L == 0L) {
                for (long n9 = 0L; n9 < this.field37863; ++n9) {
                    class18.method171((n2 - 1L) * n3 + n9, class17.method137(n9 * this.field37864 + 1L));
                }
                this.field37866.method26095(class18, (n2 - 1L) * n3, b);
            }
            else {
                for (long n10 = 0L; n10 < this.field37863; ++n10) {
                    final long n11 = 2L * n10;
                    final long n12 = n10 * this.field37864;
                    final long n13 = n2 - 1L;
                    class18.method171(n13 * n3 + n11, class17.method137(n12 + 2L * n13));
                    class18.method171(n13 * n3 + n11 + 1L, class17.method137(n12 + 1L));
                }
                this.field37866.method26079(class18, (n2 - 1L) * n3, b);
            }
            final long n14 = this.field37863 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final long n15 = k * n14;
                array[k] = Class8216.method27227(new Class882(this, n15, (k == method27224 - 1) ? this.field37863 : (n15 + n14), n2, n, class17, class18, n3));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            for (int l = 0; l < method27224; ++l) {
                final long n16 = 1L + l * n14;
                array[l] = Class8216.method27227(new Class1494(this, n16, (l == method27224 - 1) ? this.field37863 : (n16 + n14), n, n2, class17));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (long n17 = 0L; n17 < this.field37863; ++n17) {
                this.field37865.method26097(class17, n17 * this.field37864, b);
            }
            for (long n18 = 0L; n18 < this.field37863; ++n18) {
                class18.method171(n18, class17.method137(n18 * this.field37864));
            }
            this.field37866.method26093(class18, b);
            for (long n19 = 1L; n19 < n2 - 1L; ++n19) {
                final long n20 = 2L * n19;
                for (long n21 = 0L; n21 < this.field37863; ++n21) {
                    final long n22 = 2L * n21;
                    final long n23 = n21 * this.field37864 + n20;
                    class18.method171(n19 * n3 + n22, class17.method137(n23));
                    class18.method171(n19 * n3 + n22 + 1L, class17.method137(n23 + 1L));
                }
                this.field37866.method26079(class18, n19 * n3, b);
            }
            if (this.field37864 % 2L == 0L) {
                for (long n24 = 0L; n24 < this.field37863; ++n24) {
                    class18.method171((n2 - 1L) * n3 + n24, class17.method137(n24 * this.field37864 + 1L));
                }
                this.field37866.method26095(class18, (n2 - 1L) * n3, b);
            }
            else {
                for (long n25 = 0L; n25 < this.field37863; ++n25) {
                    final long n26 = 2L * n25;
                    final long n27 = n25 * this.field37864;
                    final long n28 = n2 - 1L;
                    class18.method171(n28 * n3 + n26, class17.method137(n27 + 2L * n28));
                    class18.method171(n28 * n3 + n26 + 1L, class17.method137(n27 + 1L));
                }
                this.field37866.method26079(class18, (n2 - 1L) * n3, b);
            }
            for (long n29 = 0L; n29 < this.field37863; ++n29) {
                final long n30 = 2L * n29;
                for (long n31 = 0L; n31 < n2; ++n31) {
                    final long n32 = n29 * n + 2L * n31;
                    class17.method171(n32, class18.method137(n31 * n3 + n30));
                    class17.method171(n32 + 1L, class18.method137(n31 * n3 + n30 + 1L));
                }
            }
            for (long n33 = 1L; n33 < this.field37863; ++n33) {
                final long n34 = n33 * n;
                final long n35 = (this.field37863 - n33 + 1L) * n;
                for (long n36 = n2; n36 < this.field37864; ++n36) {
                    final long n37 = 2L * n36;
                    final long n38 = 2L * (this.field37864 - n36);
                    class17.method171(n37, class17.method137(n38));
                    class17.method171(n37 + 1L, -class17.method137(n38 + 1L));
                    final long n39 = n34 + n37;
                    final long n40 = n35 - n37;
                    class17.method171(n39, class17.method137(n40));
                    class17.method171(n39 + 1L, -class17.method137(n40 + 1L));
                }
            }
        }
    }
    
    private void method31957(final int n, final double[] array) {
        final int n2 = this.field37861 >> 1;
        if (n >= 0) {
            for (int i = 1; i < n2; ++i) {
                final int n3 = this.field37861 - i;
                final int n4 = i * this.field37862;
                final int n5 = n3 * this.field37862;
                array[n5] = 0.5 * (array[n4] - array[n5]);
                final int n6 = n4;
                array[n6] -= array[n5];
                array[n5 + 1] = 0.5 * (array[n4 + 1] + array[n5 + 1]);
                final int n7 = n4 + 1;
                array[n7] -= array[n5 + 1];
            }
        }
        else {
            for (int j = 1; j < n2; ++j) {
                final int n8 = this.field37861 - j;
                final int n9 = j * this.field37862;
                final int n10 = n8 * this.field37862;
                final double n11 = array[n9] - array[n10];
                final int n12 = n9;
                array[n12] += array[n10];
                array[n10] = n11;
                final double n13 = array[n10 + 1] - array[n9 + 1];
                final int n14 = n9 + 1;
                array[n14] += array[n10 + 1];
                array[n10 + 1] = n13;
            }
        }
    }
    
    private void method31958(final int n, final Class17 class17) {
        final long n2 = this.field37863 >> 1;
        if (n >= 0) {
            for (long n3 = 1L; n3 < n2; ++n3) {
                final long n4 = this.field37863 - n3;
                final long n5 = n3 * this.field37864;
                final long n6 = n4 * this.field37864;
                class17.method171(n6, 0.5 * (class17.method137(n5) - class17.method137(n6)));
                class17.method171(n5, class17.method137(n5) - class17.method137(n6));
                class17.method171(n6 + 1L, 0.5 * (class17.method137(n5 + 1L) + class17.method137(n6 + 1L)));
                class17.method171(n5 + 1L, class17.method137(n5 + 1L) - class17.method137(n6 + 1L));
            }
        }
        else {
            for (long n7 = 1L; n7 < n2; ++n7) {
                final long n8 = this.field37863 - n7;
                final long n9 = n7 * this.field37864;
                final long n10 = n8 * this.field37864;
                final double n11 = class17.method137(n9) - class17.method137(n10);
                class17.method171(n9, class17.method137(n9) + class17.method137(n10));
                class17.method171(n10, n11);
                final double n12 = class17.method137(n10 + 1L) - class17.method137(n9 + 1L);
                class17.method171(n9 + 1L, class17.method137(n9 + 1L) + class17.method137(n10 + 1L));
                class17.method171(n10 + 1L, n12);
            }
        }
    }
    
    private void method31959(final int n, final double[][] array) {
        final int n2 = this.field37861 >> 1;
        if (n >= 0) {
            for (int i = 1; i < n2; ++i) {
                final int n3 = this.field37861 - i;
                array[n3][0] = 0.5 * (array[i][0] - array[n3][0]);
                final double[] array2 = array[i];
                final int n4 = 0;
                array2[n4] -= array[n3][0];
                array[n3][1] = 0.5 * (array[i][1] + array[n3][1]);
                final double[] array3 = array[i];
                final int n5 = 1;
                array3[n5] -= array[n3][1];
            }
        }
        else {
            for (int j = 1; j < n2; ++j) {
                final int n6 = this.field37861 - j;
                final double n7 = array[j][0] - array[n6][0];
                final double[] array4 = array[j];
                final int n8 = 0;
                array4[n8] += array[n6][0];
                array[n6][0] = n7;
                final double n9 = array[n6][1] - array[j][1];
                final double[] array5 = array[j];
                final int n10 = 1;
                array5[n10] += array[n6][1];
                array[n6][1] = n9;
            }
        }
    }
    
    private void method31960(final int n, final double[] array, final boolean b) {
        int n2 = 8 * this.field37861;
        if (this.field37862 != 4) {
            if (this.field37862 < 4) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            if (this.field37862 <= 4) {
                if (this.field37862 != 4) {
                    if (this.field37862 == 2) {
                        for (int i = 0; i < this.field37861; ++i) {
                            final int n3 = i * this.field37862;
                            final int n4 = 2 * i;
                            array2[n4] = array[n3];
                            array2[n4 + 1] = array[n3 + 1];
                        }
                        this.field37866.method26078(array2, 0, b);
                        for (int j = 0; j < this.field37861; ++j) {
                            final int n5 = j * this.field37862;
                            final int n6 = 2 * j;
                            array[n5] = array2[n6];
                            array[n5 + 1] = array2[n6 + 1];
                        }
                    }
                }
                else {
                    for (int k = 0; k < this.field37861; ++k) {
                        final int n7 = k * this.field37862;
                        final int n8 = 2 * k;
                        final int n9 = 2 * this.field37861 + 2 * k;
                        array2[n8] = array[n7];
                        array2[n8 + 1] = array[n7 + 1];
                        array2[n9] = array[n7 + 2];
                        array2[n9 + 1] = array[n7 + 3];
                    }
                    this.field37866.method26078(array2, 0, b);
                    this.field37866.method26078(array2, 2 * this.field37861, b);
                    for (int l = 0; l < this.field37861; ++l) {
                        final int n10 = l * this.field37862;
                        final int n11 = 2 * l;
                        final int n12 = 2 * this.field37861 + 2 * l;
                        array[n10] = array2[n11];
                        array[n10 + 1] = array2[n11 + 1];
                        array[n10 + 2] = array2[n12];
                        array[n10 + 3] = array2[n12 + 1];
                    }
                }
            }
            else {
                for (int n13 = 0; n13 < this.field37862; n13 += 8) {
                    for (int n14 = 0; n14 < this.field37861; ++n14) {
                        final int n15 = n14 * this.field37862 + n13;
                        final int n16 = 2 * n14;
                        final int n17 = 2 * this.field37861 + 2 * n14;
                        final int n18 = n17 + 2 * this.field37861;
                        final int n19 = n18 + 2 * this.field37861;
                        array2[n16] = array[n15];
                        array2[n16 + 1] = array[n15 + 1];
                        array2[n17] = array[n15 + 2];
                        array2[n17 + 1] = array[n15 + 3];
                        array2[n18] = array[n15 + 4];
                        array2[n18 + 1] = array[n15 + 5];
                        array2[n19] = array[n15 + 6];
                        array2[n19 + 1] = array[n15 + 7];
                    }
                    this.field37866.method26078(array2, 0, b);
                    this.field37866.method26078(array2, 2 * this.field37861, b);
                    this.field37866.method26078(array2, 4 * this.field37861, b);
                    this.field37866.method26078(array2, 6 * this.field37861, b);
                    for (int n20 = 0; n20 < this.field37861; ++n20) {
                        final int n21 = n20 * this.field37862 + n13;
                        final int n22 = 2 * n20;
                        final int n23 = 2 * this.field37861 + 2 * n20;
                        final int n24 = n23 + 2 * this.field37861;
                        final int n25 = n24 + 2 * this.field37861;
                        array[n21] = array2[n22];
                        array[n21 + 1] = array2[n22 + 1];
                        array[n21 + 2] = array2[n23];
                        array[n21 + 3] = array2[n23 + 1];
                        array[n21 + 4] = array2[n24];
                        array[n21 + 5] = array2[n24 + 1];
                        array[n21 + 6] = array2[n25];
                        array[n21 + 7] = array2[n25 + 1];
                    }
                }
            }
        }
        else if (this.field37862 <= 4) {
            if (this.field37862 != 4) {
                if (this.field37862 == 2) {
                    for (int n26 = 0; n26 < this.field37861; ++n26) {
                        final int n27 = n26 * this.field37862;
                        final int n28 = 2 * n26;
                        array2[n28] = array[n27];
                        array2[n28 + 1] = array[n27 + 1];
                    }
                    this.field37866.method26074(array2, 0);
                    for (int n29 = 0; n29 < this.field37861; ++n29) {
                        final int n30 = n29 * this.field37862;
                        final int n31 = 2 * n29;
                        array[n30] = array2[n31];
                        array[n30 + 1] = array2[n31 + 1];
                    }
                }
            }
            else {
                for (int n32 = 0; n32 < this.field37861; ++n32) {
                    final int n33 = n32 * this.field37862;
                    final int n34 = 2 * n32;
                    final int n35 = 2 * this.field37861 + 2 * n32;
                    array2[n34] = array[n33];
                    array2[n34 + 1] = array[n33 + 1];
                    array2[n35] = array[n33 + 2];
                    array2[n35 + 1] = array[n33 + 3];
                }
                this.field37866.method26074(array2, 0);
                this.field37866.method26074(array2, 2 * this.field37861);
                for (int n36 = 0; n36 < this.field37861; ++n36) {
                    final int n37 = n36 * this.field37862;
                    final int n38 = 2 * n36;
                    final int n39 = 2 * this.field37861 + 2 * n36;
                    array[n37] = array2[n38];
                    array[n37 + 1] = array2[n38 + 1];
                    array[n37 + 2] = array2[n39];
                    array[n37 + 3] = array2[n39 + 1];
                }
            }
        }
        else {
            for (int n40 = 0; n40 < this.field37862; n40 += 8) {
                for (int n41 = 0; n41 < this.field37861; ++n41) {
                    final int n42 = n41 * this.field37862 + n40;
                    final int n43 = 2 * n41;
                    final int n44 = 2 * this.field37861 + 2 * n41;
                    final int n45 = n44 + 2 * this.field37861;
                    final int n46 = n45 + 2 * this.field37861;
                    array2[n43] = array[n42];
                    array2[n43 + 1] = array[n42 + 1];
                    array2[n44] = array[n42 + 2];
                    array2[n44 + 1] = array[n42 + 3];
                    array2[n45] = array[n42 + 4];
                    array2[n45 + 1] = array[n42 + 5];
                    array2[n46] = array[n42 + 6];
                    array2[n46 + 1] = array[n42 + 7];
                }
                this.field37866.method26074(array2, 0);
                this.field37866.method26074(array2, 2 * this.field37861);
                this.field37866.method26074(array2, 4 * this.field37861);
                this.field37866.method26074(array2, 6 * this.field37861);
                for (int n47 = 0; n47 < this.field37861; ++n47) {
                    final int n48 = n47 * this.field37862 + n40;
                    final int n49 = 2 * n47;
                    final int n50 = 2 * this.field37861 + 2 * n47;
                    final int n51 = n50 + 2 * this.field37861;
                    final int n52 = n51 + 2 * this.field37861;
                    array[n48] = array2[n49];
                    array[n48 + 1] = array2[n49 + 1];
                    array[n48 + 2] = array2[n50];
                    array[n48 + 3] = array2[n50 + 1];
                    array[n48 + 4] = array2[n51];
                    array[n48 + 5] = array2[n51 + 1];
                    array[n48 + 6] = array2[n52];
                    array[n48 + 7] = array2[n52 + 1];
                }
            }
        }
    }
    
    private void method31961(final int n, final Class17 class17, final boolean b) {
        long n2 = 8L * this.field37863;
        if (this.field37864 != 4L) {
            if (this.field37864 < 4L) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final Class17 class18 = new Class17(n2);
        if (n != -1) {
            if (this.field37864 <= 4L) {
                if (this.field37864 != 4L) {
                    if (this.field37864 == 2L) {
                        for (long n3 = 0L; n3 < this.field37863; ++n3) {
                            final long n4 = n3 * this.field37864;
                            final long n5 = 2L * n3;
                            class18.method171(n5, class17.method137(n4));
                            class18.method171(n5 + 1L, class17.method137(n4 + 1L));
                        }
                        this.field37866.method26079(class18, 0L, b);
                        for (long n6 = 0L; n6 < this.field37863; ++n6) {
                            final long n7 = n6 * this.field37864;
                            final long n8 = 2L * n6;
                            class17.method171(n7, class18.method137(n8));
                            class17.method171(n7 + 1L, class18.method137(n8 + 1L));
                        }
                    }
                }
                else {
                    for (long n9 = 0L; n9 < this.field37863; ++n9) {
                        final long n10 = n9 * this.field37864;
                        final long n11 = 2L * n9;
                        final long n12 = 2L * this.field37863 + 2L * n9;
                        class18.method171(n11, class17.method137(n10));
                        class18.method171(n11 + 1L, class17.method137(n10 + 1L));
                        class18.method171(n12, class17.method137(n10 + 2L));
                        class18.method171(n12 + 1L, class17.method137(n10 + 3L));
                    }
                    this.field37866.method26079(class18, 0L, b);
                    this.field37866.method26079(class18, 2L * this.field37863, b);
                    for (long n13 = 0L; n13 < this.field37863; ++n13) {
                        final long n14 = n13 * this.field37864;
                        final long n15 = 2L * n13;
                        final long n16 = 2L * this.field37863 + 2L * n13;
                        class17.method171(n14, class18.method137(n15));
                        class17.method171(n14 + 1L, class18.method137(n15 + 1L));
                        class17.method171(n14 + 2L, class18.method137(n16));
                        class17.method171(n14 + 3L, class18.method137(n16 + 1L));
                    }
                }
            }
            else {
                for (long n17 = 0L; n17 < this.field37864; n17 += 8L) {
                    for (long n18 = 0L; n18 < this.field37863; ++n18) {
                        final long n19 = n18 * this.field37864 + n17;
                        final long n20 = 2L * n18;
                        final long n21 = 2L * this.field37863 + 2L * n18;
                        final long n22 = n21 + 2L * this.field37863;
                        final long n23 = n22 + 2L * this.field37863;
                        class18.method171(n20, class17.method137(n19));
                        class18.method171(n20 + 1L, class17.method137(n19 + 1L));
                        class18.method171(n21, class17.method137(n19 + 2L));
                        class18.method171(n21 + 1L, class17.method137(n19 + 3L));
                        class18.method171(n22, class17.method137(n19 + 4L));
                        class18.method171(n22 + 1L, class17.method137(n19 + 5L));
                        class18.method171(n23, class17.method137(n19 + 6L));
                        class18.method171(n23 + 1L, class17.method137(n19 + 7L));
                    }
                    this.field37866.method26079(class18, 0L, b);
                    this.field37866.method26079(class18, 2L * this.field37863, b);
                    this.field37866.method26079(class18, 4L * this.field37863, b);
                    this.field37866.method26079(class18, 6L * this.field37863, b);
                    for (long n24 = 0L; n24 < this.field37863; ++n24) {
                        final long n25 = n24 * this.field37864 + n17;
                        final long n26 = 2L * n24;
                        final long n27 = 2L * this.field37863 + 2L * n24;
                        final long n28 = n27 + 2L * this.field37863;
                        final long n29 = n28 + 2L * this.field37863;
                        class17.method171(n25, class18.method137(n26));
                        class17.method171(n25 + 1L, class18.method137(n26 + 1L));
                        class17.method171(n25 + 2L, class18.method137(n27));
                        class17.method171(n25 + 3L, class18.method137(n27 + 1L));
                        class17.method171(n25 + 4L, class18.method137(n28));
                        class17.method171(n25 + 5L, class18.method137(n28 + 1L));
                        class17.method171(n25 + 6L, class18.method137(n29));
                        class17.method171(n25 + 7L, class18.method137(n29 + 1L));
                    }
                }
            }
        }
        else if (this.field37864 <= 4L) {
            if (this.field37864 != 4L) {
                if (this.field37864 == 2L) {
                    for (long n30 = 0L; n30 < this.field37863; ++n30) {
                        final long n31 = n30 * this.field37864;
                        final long n32 = 2L * n30;
                        class18.method171(n32, class17.method137(n31));
                        class18.method171(n32 + 1L, class17.method137(n31 + 1L));
                    }
                    this.field37866.method26075(class18, 0L);
                    for (long n33 = 0L; n33 < this.field37863; ++n33) {
                        final long n34 = n33 * this.field37864;
                        final long n35 = 2L * n33;
                        class17.method171(n34, class18.method137(n35));
                        class17.method171(n34 + 1L, class18.method137(n35 + 1L));
                    }
                }
            }
            else {
                for (long n36 = 0L; n36 < this.field37863; ++n36) {
                    final long n37 = n36 * this.field37864;
                    final long n38 = 2L * n36;
                    final long n39 = 2L * this.field37863 + 2L * n36;
                    class18.method171(n38, class17.method137(n37));
                    class18.method171(n38 + 1L, class17.method137(n37 + 1L));
                    class18.method171(n39, class17.method137(n37 + 2L));
                    class18.method171(n39 + 1L, class17.method137(n37 + 3L));
                }
                this.field37866.method26075(class18, 0L);
                this.field37866.method26075(class18, 2L * this.field37863);
                for (long n40 = 0L; n40 < this.field37863; ++n40) {
                    final long n41 = n40 * this.field37864;
                    final long n42 = 2L * n40;
                    final long n43 = 2L * this.field37863 + 2L * n40;
                    class17.method171(n41, class18.method137(n42));
                    class17.method171(n41 + 1L, class18.method137(n42 + 1L));
                    class17.method171(n41 + 2L, class18.method137(n43));
                    class17.method171(n41 + 3L, class18.method137(n43 + 1L));
                }
            }
        }
        else {
            for (long n44 = 0L; n44 < this.field37864; n44 += 8L) {
                for (long n45 = 0L; n45 < this.field37863; ++n45) {
                    final long n46 = n45 * this.field37864 + n44;
                    final long n47 = 2L * n45;
                    final long n48 = 2L * this.field37863 + 2L * n45;
                    final long n49 = n48 + 2L * this.field37863;
                    final long n50 = n49 + 2L * this.field37863;
                    class18.method171(n47, class17.method137(n46));
                    class18.method171(n47 + 1L, class17.method137(n46 + 1L));
                    class18.method171(n48, class17.method137(n46 + 2L));
                    class18.method171(n48 + 1L, class17.method137(n46 + 3L));
                    class18.method171(n49, class17.method137(n46 + 4L));
                    class18.method171(n49 + 1L, class17.method137(n46 + 5L));
                    class18.method171(n50, class17.method137(n46 + 6L));
                    class18.method171(n50 + 1L, class17.method137(n46 + 7L));
                }
                this.field37866.method26075(class18, 0L);
                this.field37866.method26075(class18, 2L * this.field37863);
                this.field37866.method26075(class18, 4L * this.field37863);
                this.field37866.method26075(class18, 6L * this.field37863);
                for (long n51 = 0L; n51 < this.field37863; ++n51) {
                    final long n52 = n51 * this.field37864 + n44;
                    final long n53 = 2L * n51;
                    final long n54 = 2L * this.field37863 + 2L * n51;
                    final long n55 = n54 + 2L * this.field37863;
                    final long n56 = n55 + 2L * this.field37863;
                    class17.method171(n52, class18.method137(n53));
                    class17.method171(n52 + 1L, class18.method137(n53 + 1L));
                    class17.method171(n52 + 2L, class18.method137(n54));
                    class17.method171(n52 + 3L, class18.method137(n54 + 1L));
                    class17.method171(n52 + 4L, class18.method137(n55));
                    class17.method171(n52 + 5L, class18.method137(n55 + 1L));
                    class17.method171(n52 + 6L, class18.method137(n56));
                    class17.method171(n52 + 7L, class18.method137(n56 + 1L));
                }
            }
        }
    }
    
    private void method31962(final int n, final double[][] array, final boolean b) {
        int n2 = 8 * this.field37861;
        if (this.field37862 != 4) {
            if (this.field37862 < 4) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (n != -1) {
            if (this.field37862 <= 4) {
                if (this.field37862 != 4) {
                    if (this.field37862 == 2) {
                        for (int i = 0; i < this.field37861; ++i) {
                            final int n3 = 2 * i;
                            array2[n3] = array[i][0];
                            array2[n3 + 1] = array[i][1];
                        }
                        this.field37866.method26078(array2, 0, b);
                        for (int j = 0; j < this.field37861; ++j) {
                            final int n4 = 2 * j;
                            array[j][0] = array2[n4];
                            array[j][1] = array2[n4 + 1];
                        }
                    }
                }
                else {
                    for (int k = 0; k < this.field37861; ++k) {
                        final int n5 = 2 * k;
                        final int n6 = 2 * this.field37861 + 2 * k;
                        array2[n5] = array[k][0];
                        array2[n5 + 1] = array[k][1];
                        array2[n6] = array[k][2];
                        array2[n6 + 1] = array[k][3];
                    }
                    this.field37866.method26078(array2, 0, b);
                    this.field37866.method26078(array2, 2 * this.field37861, b);
                    for (int l = 0; l < this.field37861; ++l) {
                        final int n7 = 2 * l;
                        final int n8 = 2 * this.field37861 + 2 * l;
                        array[l][0] = array2[n7];
                        array[l][1] = array2[n7 + 1];
                        array[l][2] = array2[n8];
                        array[l][3] = array2[n8 + 1];
                    }
                }
            }
            else {
                for (int n9 = 0; n9 < this.field37862; n9 += 8) {
                    for (int n10 = 0; n10 < this.field37861; ++n10) {
                        final int n11 = 2 * n10;
                        final int n12 = 2 * this.field37861 + 2 * n10;
                        final int n13 = n12 + 2 * this.field37861;
                        final int n14 = n13 + 2 * this.field37861;
                        array2[n11] = array[n10][n9];
                        array2[n11 + 1] = array[n10][n9 + 1];
                        array2[n12] = array[n10][n9 + 2];
                        array2[n12 + 1] = array[n10][n9 + 3];
                        array2[n13] = array[n10][n9 + 4];
                        array2[n13 + 1] = array[n10][n9 + 5];
                        array2[n14] = array[n10][n9 + 6];
                        array2[n14 + 1] = array[n10][n9 + 7];
                    }
                    this.field37866.method26078(array2, 0, b);
                    this.field37866.method26078(array2, 2 * this.field37861, b);
                    this.field37866.method26078(array2, 4 * this.field37861, b);
                    this.field37866.method26078(array2, 6 * this.field37861, b);
                    for (int n15 = 0; n15 < this.field37861; ++n15) {
                        final int n16 = 2 * n15;
                        final int n17 = 2 * this.field37861 + 2 * n15;
                        final int n18 = n17 + 2 * this.field37861;
                        final int n19 = n18 + 2 * this.field37861;
                        array[n15][n9] = array2[n16];
                        array[n15][n9 + 1] = array2[n16 + 1];
                        array[n15][n9 + 2] = array2[n17];
                        array[n15][n9 + 3] = array2[n17 + 1];
                        array[n15][n9 + 4] = array2[n18];
                        array[n15][n9 + 5] = array2[n18 + 1];
                        array[n15][n9 + 6] = array2[n19];
                        array[n15][n9 + 7] = array2[n19 + 1];
                    }
                }
            }
        }
        else if (this.field37862 <= 4) {
            if (this.field37862 != 4) {
                if (this.field37862 == 2) {
                    for (int n20 = 0; n20 < this.field37861; ++n20) {
                        final int n21 = 2 * n20;
                        array2[n21] = array[n20][0];
                        array2[n21 + 1] = array[n20][1];
                    }
                    this.field37866.method26074(array2, 0);
                    for (int n22 = 0; n22 < this.field37861; ++n22) {
                        final int n23 = 2 * n22;
                        array[n22][0] = array2[n23];
                        array[n22][1] = array2[n23 + 1];
                    }
                }
            }
            else {
                for (int n24 = 0; n24 < this.field37861; ++n24) {
                    final int n25 = 2 * n24;
                    final int n26 = 2 * this.field37861 + 2 * n24;
                    array2[n25] = array[n24][0];
                    array2[n25 + 1] = array[n24][1];
                    array2[n26] = array[n24][2];
                    array2[n26 + 1] = array[n24][3];
                }
                this.field37866.method26074(array2, 0);
                this.field37866.method26074(array2, 2 * this.field37861);
                for (int n27 = 0; n27 < this.field37861; ++n27) {
                    final int n28 = 2 * n27;
                    final int n29 = 2 * this.field37861 + 2 * n27;
                    array[n27][0] = array2[n28];
                    array[n27][1] = array2[n28 + 1];
                    array[n27][2] = array2[n29];
                    array[n27][3] = array2[n29 + 1];
                }
            }
        }
        else {
            for (int n30 = 0; n30 < this.field37862; n30 += 8) {
                for (int n31 = 0; n31 < this.field37861; ++n31) {
                    final int n32 = 2 * n31;
                    final int n33 = 2 * this.field37861 + 2 * n31;
                    final int n34 = n33 + 2 * this.field37861;
                    final int n35 = n34 + 2 * this.field37861;
                    array2[n32] = array[n31][n30];
                    array2[n32 + 1] = array[n31][n30 + 1];
                    array2[n33] = array[n31][n30 + 2];
                    array2[n33 + 1] = array[n31][n30 + 3];
                    array2[n34] = array[n31][n30 + 4];
                    array2[n34 + 1] = array[n31][n30 + 5];
                    array2[n35] = array[n31][n30 + 6];
                    array2[n35 + 1] = array[n31][n30 + 7];
                }
                this.field37866.method26074(array2, 0);
                this.field37866.method26074(array2, 2 * this.field37861);
                this.field37866.method26074(array2, 4 * this.field37861);
                this.field37866.method26074(array2, 6 * this.field37861);
                for (int n36 = 0; n36 < this.field37861; ++n36) {
                    final int n37 = 2 * n36;
                    final int n38 = 2 * this.field37861 + 2 * n36;
                    final int n39 = n38 + 2 * this.field37861;
                    final int n40 = n39 + 2 * this.field37861;
                    array[n36][n30] = array2[n37];
                    array[n36][n30 + 1] = array2[n37 + 1];
                    array[n36][n30 + 2] = array2[n38];
                    array[n36][n30 + 3] = array2[n38 + 1];
                    array[n36][n30 + 4] = array2[n39];
                    array[n36][n30 + 5] = array2[n39 + 1];
                    array[n36][n30 + 6] = array2[n40];
                    array[n36][n30 + 7] = array2[n40 + 1];
                }
            }
        }
    }
    
    private void method31963(final int n, final int n2, final double[] array, final boolean b) {
        final int n3 = (Class8216.method27224() > this.field37861) ? this.field37861 : Class8216.method27224();
        final Future[] array2 = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array2[i] = Class8216.method27227(new Class954(this, n, n2, i, n3, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method31964(final long n, final int n2, final Class17 class17, final boolean b) {
        final int n3 = (int)((Class8216.method27224() > this.field37863) ? this.field37863 : Class8216.method27224());
        final Future[] array = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array[i] = Class8216.method27227(new Class1098(this, n, n2, i, n3, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method31965(final int n, final int n2, final double[] array, final boolean b) {
        final int n3 = (Class8216.method27224() > this.field37861) ? this.field37861 : Class8216.method27224();
        final Future[] array2 = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array2[i] = Class8216.method27227(new Class1413(this, n, n2, i, n3, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method31966(final long n, final int n2, final Class17 class17, final boolean b) {
        final int n3 = (Class8216.method27224() > this.field37861) ? this.field37861 : Class8216.method27224();
        final Future[] array = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array[i] = Class8216.method27227(new Class1390(this, n, n2, i, n3, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method31967(final int n, final int n2, final double[][] array, final boolean b) {
        final int n3 = (Class8216.method27224() > this.field37861) ? this.field37861 : Class8216.method27224();
        final Future[] array2 = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array2[i] = Class8216.method27227(new Class1410(this, n, n2, i, n3, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method31968(final int n, final int n2, final double[][] array, final boolean b) {
        final int n3 = (Class8216.method27224() > this.field37861) ? this.field37861 : Class8216.method27224();
        final Future[] array2 = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array2[i] = Class8216.method27227(new Class1376(this, n, n2, i, n3, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method31969(final int n, final double[] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field37862 / 2, Class8216.method27224());
        int n2 = 8 * this.field37861;
        if (this.field37862 == 4) {
            n2 >>= 1;
        }
        else if (this.field37862 < 4) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final Future[] array2 = new Future[method24128];
        final int n4 = method24128;
        for (int i = 0; i < method24128; ++i) {
            array2[i] = Class8216.method27227(new Class883(this, n3, n, n4, i, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method31970(final int n, final Class17 class17, final boolean b) {
        final int n2 = (int)Class7640.method24129(this.field37864 / 2L, Class8216.method27224());
        long n3 = 8L * this.field37863;
        if (this.field37864 == 4L) {
            n3 >>= 1;
        }
        else if (this.field37864 < 4L) {
            n3 >>= 2;
        }
        final long n4 = n3;
        final Future[] array = new Future[n2];
        final int n5 = n2;
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1499(this, n4, n, n5, i, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method31971(final int n, final double[][] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field37862 / 2, Class8216.method27224());
        int n2 = 8 * this.field37861;
        if (this.field37862 == 4) {
            n2 >>= 1;
        }
        else if (this.field37862 < 4) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final Future[] array2 = new Future[method24128];
        for (int n4 = method24128, i = 0; i < n4; ++i) {
            array2[i] = Class8216.method27227(new Class1076(this, n3, n, n4, i, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method31972(final double[] array) {
        final int n = 2 * this.field37862;
        final int n2 = this.field37861 / 2;
        for (int i = this.field37861 - 1; i >= 1; --i) {
            final int n3 = i * this.field37862;
            final int n4 = 2 * n3;
            for (int j = 0; j < this.field37862; j += 2) {
                array[n4 + j] = array[n3 + j];
                array[n3 + j] = 0.0;
                array[n4 + j + 1] = array[n3 + j + 1];
                array[n3 + j + 1] = 0.0;
            }
        }
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field37868 && n2 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n5 = n2 / method27224;
            final int n6 = 2 * this.field37862;
            for (int k = 0; k < method27224; ++k) {
                int n7;
                if (k == 0) {
                    n7 = k * n5 + 1;
                }
                else {
                    n7 = k * n5;
                }
                final int n8 = k * n5 + n5;
                final int n9 = k * n5;
                int n10;
                if (k == method27224 - 1) {
                    n10 = k * n5 + n5 + 1;
                }
                else {
                    n10 = k * n5 + n5;
                }
                array2[k] = Class8216.method27227(new Class1146(this, n7, n8, n6, array, n9, n10));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
            }
        }
        else {
            for (int l = 1; l < n2; ++l) {
                final int n11 = l * n;
                final int n12 = (this.field37861 - l) * n;
                array[n11 + this.field37862] = array[n12 + 1];
                array[n11 + this.field37862 + 1] = -array[n12];
            }
            for (int n13 = 1; n13 < n2; ++n13) {
                final int n14 = n13 * n;
                final int n15 = (this.field37861 - n13 + 1) * n;
                for (int n16 = this.field37862 + 2; n16 < n; n16 += 2) {
                    array[n14 + n16] = array[n15 - n16];
                    array[n14 + n16 + 1] = -array[n15 - n16 + 1];
                }
            }
            for (int n17 = 0; n17 <= this.field37861 / 2; ++n17) {
                final int n18 = n17 * n;
                final int n19 = (this.field37861 - n17) % this.field37861 * n;
                for (int n20 = 0; n20 < n; n20 += 2) {
                    final int n21 = n18 + n20;
                    final int n22 = n19 + (n - n20) % n;
                    array[n22] = array[n21];
                    array[n22 + 1] = -array[n21 + 1];
                }
            }
        }
        array[this.field37862] = -array[1];
        array[1] = 0.0;
        final int n23 = n2 * n;
        array[n23 + this.field37862] = -array[n23 + 1];
        array[n23 + 1] = 0.0;
        array[n23 + this.field37862 + 1] = 0.0;
    }
    
    private void method31973(final Class17 class17) {
        final long n = 2L * this.field37864;
        final long n2 = this.field37863 / 2L;
        for (long n3 = this.field37863 - 1L; n3 >= 1L; --n3) {
            final long n4 = n3 * this.field37864;
            final long n5 = 2L * n4;
            for (long n6 = 0L; n6 < this.field37864; n6 += 2L) {
                class17.method171(n5 + n6, class17.method137(n4 + n6));
                class17.method171(n4 + n6, 0.0);
                class17.method171(n5 + n6 + 1L, class17.method137(n4 + n6 + 1L));
                class17.method171(n4 + n6 + 1L, 0.0);
            }
        }
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field37868 && n2 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n7 = n2 / method27224;
            final long n8 = 2L * this.field37864;
            for (int i = 0; i < method27224; ++i) {
                long n9;
                if (i == 0) {
                    n9 = i * n7 + 1L;
                }
                else {
                    n9 = i * n7;
                }
                final long n10 = i * n7 + n7;
                final long n11 = i * n7;
                long n12;
                if (i == method27224 - 1) {
                    n12 = i * n7 + n7 + 1L;
                }
                else {
                    n12 = i * n7 + n7;
                }
                array[i] = Class8216.method27227(new Class1214(this, n9, n10, n8, class17, n11, n12));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
            }
        }
        else {
            for (long n13 = 1L; n13 < n2; ++n13) {
                final long n14 = n13 * n;
                final long n15 = (this.field37863 - n13) * n;
                class17.method171(n14 + this.field37864, class17.method137(n15 + 1L));
                class17.method171(n14 + this.field37864 + 1L, -class17.method137(n15));
            }
            for (long n16 = 1L; n16 < n2; ++n16) {
                final long n17 = n16 * n;
                final long n18 = (this.field37863 - n16 + 1L) * n;
                for (long n19 = this.field37864 + 2L; n19 < n; n19 += 2L) {
                    class17.method171(n17 + n19, class17.method137(n18 - n19));
                    class17.method171(n17 + n19 + 1L, -class17.method137(n18 - n19 + 1L));
                }
            }
            for (long n20 = 0L; n20 <= this.field37863 / 2L; ++n20) {
                final long n21 = n20 * n;
                final long n22 = (this.field37863 - n20) % this.field37863 * n;
                for (long n23 = 0L; n23 < n; n23 += 2L) {
                    final long n24 = n21 + n23;
                    final long n25 = n22 + (n - n23) % n;
                    class17.method171(n25, class17.method137(n24));
                    class17.method171(n25 + 1L, -class17.method137(n24 + 1L));
                }
            }
        }
        class17.method171(this.field37864, -class17.method137(1L));
        class17.method171(1L, 0.0);
        final long n26 = n2 * n;
        class17.method171(n26 + this.field37864, -class17.method137(n26 + 1L));
        class17.method171(n26 + 1L, 0.0);
        class17.method171(n26 + this.field37864 + 1L, 0.0);
    }
    
    private void method31974(final double[][] array) {
        final int n = 2 * this.field37862;
        final int n2 = this.field37861 / 2;
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field37868 && n2 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n3 = n2 / method27224;
            for (int i = 0; i < method27224; ++i) {
                int n4;
                if (i == 0) {
                    n4 = i * n3 + 1;
                }
                else {
                    n4 = i * n3;
                }
                final int n5 = i * n3 + n3;
                final int n6 = i * n3;
                int n7;
                if (i == method27224 - 1) {
                    n7 = i * n3 + n3 + 1;
                }
                else {
                    n7 = i * n3 + n3;
                }
                array2[i] = Class8216.method27227(new Class1483(this, n4, n5, array, n, n6, n7));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8983.class.getName()).log(Level.SEVERE, null, thrown2);
            }
        }
        else {
            for (int j = 1; j < n2; ++j) {
                final int n8 = this.field37861 - j;
                array[j][this.field37862] = array[n8][1];
                array[j][this.field37862 + 1] = -array[n8][0];
            }
            for (int k = 1; k < n2; ++k) {
                final int n9 = this.field37861 - k;
                for (int l = this.field37862 + 2; l < n; l += 2) {
                    final int n10 = n - l;
                    array[k][l] = array[n9][n10];
                    array[k][l + 1] = -array[n9][n10 + 1];
                }
            }
            for (int n11 = 0; n11 <= this.field37861 / 2; ++n11) {
                final int n12 = (this.field37861 - n11) % this.field37861;
                for (int n13 = 0; n13 < n; n13 += 2) {
                    final int n14 = (n - n13) % n;
                    array[n12][n14] = array[n11][n13];
                    array[n12][n14 + 1] = -array[n11][n13 + 1];
                }
            }
        }
        array[0][this.field37862] = -array[0][1];
        array[0][1] = 0.0;
        array[n2][this.field37862] = -array[n2][1];
        array[n2][1] = 0.0;
        array[n2][this.field37862 + 1] = 0.0;
    }
}
