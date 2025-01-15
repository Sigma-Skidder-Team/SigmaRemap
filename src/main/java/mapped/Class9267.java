// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class9267
{
    private final int field39741;
    private final long field39742;
    private final Class8673 field39743;
    private final boolean field39744;
    
    public Class9267(final long field39742) {
        this.field39741 = (int)field39742;
        this.field39742 = field39742;
        this.field39744 = (Class9133.method33168() || field39742 > Class11.method177());
        this.field39743 = new Class8673(field39742);
    }
    
    public void method34181(final float[] array, final boolean b) {
        this.method34183(array, 0, b);
    }
    
    public void method34182(final Class22 class22, final boolean b) {
        this.method34184(class22, 0L, b);
    }
    
    public void method34183(final float[] array, final int n, final boolean b) {
        if (this.field39741 == 1) {
            return;
        }
        if (this.field39744) {
            this.method34184(new Class22(array), n, b);
        }
        else {
            final int n2 = this.field39741 / 2;
            final int n3 = 1 + n;
            for (int n4 = n + this.field39741, i = n3; i < n4; i += 2) {
                array[i] = -array[i];
            }
            this.field39743.method29691(array, n, b);
            if (Class8216.method27224() > 1 && n2 > Class9133.method33158()) {
                final int n5 = 2;
                final int n6 = n2 / n5;
                final Future[] array2 = new Future[n5];
                for (int j = 0; j < n5; ++j) {
                    final int n7 = j * n6;
                    array2[j] = Class8216.method27227(new Class1333(this, n, n7, (j == n5 - 1) ? n2 : (n7 + n6), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class9267.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class9267.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                final int n8 = n + this.field39741 - 1;
                for (int k = 0; k < n2; ++k) {
                    final int n9 = n + k;
                    final float n10 = array[n9];
                    final int n11 = n8 - k;
                    array[n9] = array[n11];
                    array[n11] = n10;
                }
            }
        }
    }
    
    public void method34184(final Class22 class22, final long n, final boolean b) {
        if (this.field39742 == 1L) {
            return;
        }
        if (!this.field39744) {
            if (class22.method173() || class22.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method34183(class22.method230(), (int)n, b);
        }
        else {
            final long n2 = this.field39742 / 2L;
            final long n3 = 1L + n;
            for (long n4 = n + this.field39742, n5 = n3; n5 < n4; n5 += 2L) {
                class22.method169(n5, -class22.method135(n5));
            }
            this.field39743.method29692(class22, n, b);
            if (Class8216.method27224() > 1 && n2 > Class9133.method33158()) {
                final int n6 = 2;
                final long n7 = n2 / n6;
                final Future[] array = new Future[n6];
                for (int i = 0; i < n6; ++i) {
                    final long n8 = i * n7;
                    array[i] = Class8216.method27227(new Class1023(this, n, n8, (i == n6 - 1) ? n2 : (n8 + n7), class22));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class9267.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class9267.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                final long n9 = n + this.field39742 - 1L;
                for (long n10 = 0L; n10 < n2; ++n10) {
                    final long n11 = n + n10;
                    final float method135 = class22.method135(n11);
                    final long n12 = n9 - n10;
                    class22.method169(n11, class22.method135(n12));
                    class22.method169(n12, method135);
                }
            }
        }
    }
    
    public void method34185(final float[] array, final boolean b) {
        this.method34187(array, 0, b);
    }
    
    public void method34186(final Class22 class22, final boolean b) {
        this.method34188(class22, 0L, b);
    }
    
    public void method34187(final float[] array, final int n, final boolean b) {
        if (this.field39741 == 1) {
            return;
        }
        if (this.field39744) {
            this.method34188(new Class22(array), n, b);
        }
        else {
            final int n2 = this.field39741 / 2;
            if (Class8216.method27224() > 1 && n2 > Class9133.method33158()) {
                final int n3 = 2;
                final int n4 = n2 / n3;
                final Future[] array2 = new Future[n3];
                for (int i = 0; i < n3; ++i) {
                    final int n5 = i * n4;
                    array2[i] = Class8216.method27227(new Class1430(this, n, n5, (i == n3 - 1) ? n2 : (n5 + n4), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class9267.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class9267.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                final int n6 = n + this.field39741 - 1;
                for (int j = 0; j < n2; ++j) {
                    final float n7 = array[n + j];
                    array[n + j] = array[n6 - j];
                    array[n6 - j] = n7;
                }
            }
            this.field39743.method29695(array, n, b);
            final int n8 = 1 + n;
            for (int n9 = n + this.field39741, k = n8; k < n9; k += 2) {
                array[k] = -array[k];
            }
        }
    }
    
    public void method34188(final Class22 class22, final long n, final boolean b) {
        if (this.field39742 == 1L) {
            return;
        }
        if (!this.field39744) {
            if (class22.method173() || class22.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method34187(class22.method230(), (int)n, b);
        }
        else {
            final long n2 = this.field39742 / 2L;
            if (Class8216.method27224() > 1 && n2 > Class9133.method33158()) {
                final int n3 = 2;
                final long n4 = n2 / n3;
                final Future[] array = new Future[n3];
                for (int i = 0; i < n3; ++i) {
                    final long n5 = i * n4;
                    array[i] = Class8216.method27227(new Class1487(this, n, n5, (i == n3 - 1) ? n2 : (n5 + n4), class22));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class9267.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class9267.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                final long n6 = n + this.field39742 - 1L;
                for (long n7 = 0L; n7 < n2; ++n7) {
                    final float method135 = class22.method135(n + n7);
                    class22.method169(n + n7, class22.method135(n6 - n7));
                    class22.method169(n6 - n7, method135);
                }
            }
            this.field39743.method29696(class22, n, b);
            final long n8 = 1L + n;
            for (long n9 = n + this.field39742, n10 = n8; n10 < n9; n10 += 2L) {
                class22.method169(n10, -class22.method135(n10));
            }
        }
    }
}
