// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class8806
{
    private final int field37011;
    private final long field37012;
    private final Class6062 field37013;
    private final boolean field37014;
    
    public Class8806(final long field37012) {
        this.field37011 = (int)field37012;
        this.field37012 = field37012;
        this.field37014 = (Class9133.method33168() || field37012 > Class11.method177());
        this.field37013 = new Class6062(field37012);
    }
    
    public void method30721(final double[] array, final boolean b) {
        this.method30723(array, 0, b);
    }
    
    public void method30722(final Class17 class17, final boolean b) {
        this.method30724(class17, 0L, b);
    }
    
    public void method30723(final double[] array, final int n, final boolean b) {
        if (this.field37011 == 1) {
            return;
        }
        if (this.field37014) {
            this.method30724(new Class17(array), n, b);
        }
        else {
            final int n2 = this.field37011 / 2;
            final int n3 = 1 + n;
            for (int n4 = n + this.field37011, i = n3; i < n4; i += 2) {
                array[i] = -array[i];
            }
            this.field37013.method18038(array, n, b);
            if (Class8216.method27224() > 1 && n2 > Class9133.method33158()) {
                final int n5 = 2;
                final int n6 = n2 / n5;
                final Future[] array2 = new Future[n5];
                for (int j = 0; j < n5; ++j) {
                    final int n7 = j * n6;
                    array2[j] = Class8216.method27227(new Class974(this, n, n7, (j == n5 - 1) ? n2 : (n7 + n6), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8806.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8806.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                final int n8 = n + this.field37011 - 1;
                for (int k = 0; k < n2; ++k) {
                    final int n9 = n + k;
                    final double n10 = array[n9];
                    final int n11 = n8 - k;
                    array[n9] = array[n11];
                    array[n11] = n10;
                }
            }
        }
    }
    
    public void method30724(final Class17 class17, final long n, final boolean b) {
        if (this.field37012 == 1L) {
            return;
        }
        if (!this.field37014) {
            if (class17.method173() || class17.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method30723(class17.method206(), (int)n, b);
        }
        else {
            final long n2 = this.field37012 / 2L;
            final long n3 = 1L + n;
            for (long n4 = n + this.field37012, n5 = n3; n5 < n4; n5 += 2L) {
                class17.method171(n5, -class17.method137(n5));
            }
            this.field37013.method18039(class17, n, b);
            if (Class8216.method27224() > 1 && n2 > Class9133.method33158()) {
                final int n6 = 2;
                final long n7 = n2 / n6;
                final Future[] array = new Future[n6];
                for (int i = 0; i < n6; ++i) {
                    final long n8 = i * n7;
                    array[i] = Class8216.method27227(new Class1000(this, n, n8, (i == n6 - 1) ? n2 : (n8 + n7), class17));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8806.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8806.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                final long n9 = n + this.field37012 - 1L;
                for (long n10 = 0L; n10 < n2; ++n10) {
                    final long n11 = n + n10;
                    final double method137 = class17.method137(n11);
                    final long n12 = n9 - n10;
                    class17.method171(n11, class17.method137(n12));
                    class17.method171(n12, method137);
                }
            }
        }
    }
    
    public void method30725(final double[] array, final boolean b) {
        this.method30727(array, 0, b);
    }
    
    public void method30726(final Class17 class17, final boolean b) {
        this.method30728(class17, 0L, b);
    }
    
    public void method30727(final double[] array, final int n, final boolean b) {
        if (this.field37011 == 1) {
            return;
        }
        if (this.field37014) {
            this.method30728(new Class17(array), n, b);
        }
        else {
            final int n2 = this.field37011 / 2;
            if (Class8216.method27224() > 1 && n2 > Class9133.method33158()) {
                final int n3 = 2;
                final int n4 = n2 / n3;
                final Future[] array2 = new Future[n3];
                for (int i = 0; i < n3; ++i) {
                    final int n5 = i * n4;
                    array2[i] = Class8216.method27227(new Class1105(this, n, n5, (i == n3 - 1) ? n2 : (n5 + n4), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8806.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8806.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                final int n6 = n + this.field37011 - 1;
                for (int j = 0; j < n2; ++j) {
                    final double n7 = array[n + j];
                    array[n + j] = array[n6 - j];
                    array[n6 - j] = n7;
                }
            }
            this.field37013.method18042(array, n, b);
            final int n8 = 1 + n;
            for (int n9 = n + this.field37011, k = n8; k < n9; k += 2) {
                array[k] = -array[k];
            }
        }
    }
    
    public void method30728(final Class17 class17, final long n, final boolean b) {
        if (this.field37012 == 1L) {
            return;
        }
        if (!this.field37014) {
            if (class17.method173() || class17.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method30727(class17.method206(), (int)n, b);
        }
        else {
            final long n2 = this.field37012 / 2L;
            if (Class8216.method27224() > 1 && n2 > Class9133.method33158()) {
                final int n3 = 2;
                final long n4 = n2 / n3;
                final Future[] array = new Future[n3];
                for (int i = 0; i < n3; ++i) {
                    final long n5 = i * n4;
                    array[i] = Class8216.method27227(new Class1279(this, n, n5, (i == n3 - 1) ? n2 : (n5 + n4), class17));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8806.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8806.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                final long n6 = n + this.field37012 - 1L;
                for (long n7 = 0L; n7 < n2; ++n7) {
                    final double method137 = class17.method137(n + n7);
                    class17.method171(n + n7, class17.method137(n6 - n7));
                    class17.method171(n6 - n7, method137);
                }
            }
            this.field37013.method18043(class17, n, b);
            final long n8 = 1L + n;
            for (long n9 = n + this.field37012, n10 = n8; n10 < n9; n10 += 2L) {
                class17.method171(n10, -class17.method137(n10));
            }
        }
    }
}
