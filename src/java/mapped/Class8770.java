// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class8770
{
    private final int field36868;
    private final long field36869;
    private final Class7978 field36870;
    private final boolean field36871;
    
    public Class8770(final long field36869) {
        this.field36868 = (int)field36869;
        this.field36869 = field36869;
        this.field36871 = (Class9133.method33168() || field36869 > Class11.method177());
        this.field36870 = new Class7978(field36869);
    }
    
    public void method30445(final float[] array) {
        this.method30447(array, 0);
    }
    
    public void method30446(final Class22 class22) {
        this.method30448(class22, 0L);
    }
    
    public void method30447(final float[] array, final int n) {
        if (this.field36868 == 1) {
            return;
        }
        if (this.field36871) {
            this.method30448(new Class22(array), n);
        }
        else {
            this.field36870.method25935(array, n);
            final float[] array2 = new float[this.field36868];
            System.arraycopy(array, n, array2, 0, this.field36868);
            final int n2 = this.field36868 / 2;
            if (Class8216.method27224() > 1 && n2 > Class9133.method33158()) {
                final int n3 = 2;
                final int n4 = n2 / n3;
                final Future[] array3 = new Future[n3];
                for (int i = 0; i < n3; ++i) {
                    final int n5 = 1 + i * n4;
                    array3[i] = Class8216.method27227(new Class1051(this, n5, (i == n3 - 1) ? n2 : (n5 + n4), array, n, array2));
                }
                try {
                    Class8216.method27228(array3);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8770.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8770.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                for (int j = 1; j < n2; ++j) {
                    final int n6 = 2 * j;
                    final int n7 = n6 + 1;
                    array[n + j] = array2[n6] - array2[n7];
                    array[n + this.field36868 - j] = array2[n6] + array2[n7];
                }
            }
            if (this.field36868 % 2 == 0) {
                array[n + n2] = array2[1];
            }
            else {
                array[n + n2] = array2[this.field36868 - 1] - array2[1];
                array[n + n2 + 1] = array2[this.field36868 - 1] + array2[1];
            }
        }
    }
    
    public void method30448(final Class22 class22, final long n) {
        if (this.field36869 == 1L) {
            return;
        }
        if (!this.field36871) {
            if (class22.method173() || class22.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method30447(class22.method230(), (int)n);
        }
        else {
            this.field36870.method25936(class22, n);
            final Class22 class23 = new Class22(this.field36869, false);
            Class8601.method29152(class22, n, class23, 0L, this.field36869);
            final long n2 = this.field36869 / 2L;
            if (Class8216.method27224() > 1 && n2 > Class9133.method33158()) {
                final int n3 = 2;
                final long n4 = n2 / n3;
                final Future[] array = new Future[n3];
                for (int i = 0; i < n3; ++i) {
                    final long n5 = 1L + i * n4;
                    array[i] = Class8216.method27227(new Class1206(this, n5, (i == n3 - 1) ? n2 : (n5 + n4), class22, n, class23));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8770.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8770.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                for (long n6 = 1L; n6 < n2; ++n6) {
                    final long n7 = 2L * n6;
                    final long n8 = n7 + 1L;
                    class22.method169(n + n6, class23.method135(n7) - class23.method135(n8));
                    class22.method169(n + this.field36869 - n6, class23.method135(n7) + class23.method135(n8));
                }
            }
            if (this.field36869 % 2L == 0L) {
                class22.method169(n + n2, class23.method135(1L));
            }
            else {
                class22.method169(n + n2, class23.method135(this.field36869 - 1L) - class23.method135(1L));
                class22.method169(n + n2 + 1L, class23.method135(this.field36869 - 1L) + class23.method135(1L));
            }
        }
    }
    
    public void method30449(final float[] array, final boolean b) {
        this.method30451(array, 0, b);
    }
    
    public void method30450(final Class22 class22, final boolean b) {
        this.method30452(class22, 0L, b);
    }
    
    public void method30451(final float[] array, final int n, final boolean b) {
        if (this.field36868 != 1) {
            if (!this.field36871) {
                this.method30447(array, n);
                if (b) {
                    Class9133.method33305(this.field36868, 1.0f / this.field36868, array, n, false);
                }
            }
            else {
                this.method30452(new Class22(array), n, b);
            }
        }
    }
    
    public void method30452(final Class22 class22, final long n, final boolean b) {
        if (this.field36868 != 1) {
            if (!this.field36871) {
                if (!class22.method173()) {
                    if (!class22.method175()) {
                        if (n < 2147483647L) {
                            this.method30451(class22.method230(), (int)n, b);
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method30448(class22, n);
            if (b) {
                Class9133.method33306(this.field36868, 1.0f / this.field36868, class22, n, false);
            }
        }
    }
}
