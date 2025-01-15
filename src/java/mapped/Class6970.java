// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class6970
{
    private final int field27257;
    private final long field27258;
    private final Class7992 field27259;
    private final boolean field27260;
    
    public Class6970(final long field27258) {
        this.field27257 = (int)field27258;
        this.field27258 = field27258;
        this.field27260 = (Class9133.method33168() || field27258 > Class11.method177());
        this.field27259 = new Class7992(field27258);
    }
    
    public void method21386(final double[] array) {
        this.method21388(array, 0);
    }
    
    public void method21387(final Class17 class17) {
        this.method21389(class17, 0L);
    }
    
    public void method21388(final double[] array, final int n) {
        if (this.field27257 == 1) {
            return;
        }
        if (this.field27260) {
            this.method21389(new Class17(array), n);
        }
        else {
            this.field27259.method26082(array, n);
            final double[] array2 = new double[this.field27257];
            System.arraycopy(array, n, array2, 0, this.field27257);
            final int n2 = this.field27257 / 2;
            if (Class8216.method27224() > 1 && n2 > Class9133.method33158()) {
                final int n3 = 2;
                final int n4 = n2 / n3;
                final Future[] array3 = new Future[n3];
                for (int i = 0; i < n3; ++i) {
                    final int n5 = 1 + i * n4;
                    array3[i] = Class8216.method27227(new Class1248(this, n5, (i == n3 - 1) ? n2 : (n5 + n4), array, n, array2));
                }
                try {
                    Class8216.method27228(array3);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6970.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6970.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                for (int j = 1; j < n2; ++j) {
                    final int n6 = 2 * j;
                    final int n7 = n6 + 1;
                    array[n + j] = array2[n6] - array2[n7];
                    array[n + this.field27257 - j] = array2[n6] + array2[n7];
                }
            }
            if (this.field27257 % 2 == 0) {
                array[n + n2] = array2[1];
            }
            else {
                array[n + n2] = array2[this.field27257 - 1] - array2[1];
                array[n + n2 + 1] = array2[this.field27257 - 1] + array2[1];
            }
        }
    }
    
    public void method21389(final Class17 class17, final long n) {
        if (this.field27258 == 1L) {
            return;
        }
        if (!this.field27260) {
            if (class17.method173() || class17.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method21388(class17.method206(), (int)n);
        }
        else {
            this.field27259.method26083(class17, n);
            final Class17 class18 = new Class17(this.field27258, false);
            Class8601.method29154(class17, n, class18, 0L, this.field27258);
            final long n2 = this.field27258 / 2L;
            if (Class8216.method27224() > 1 && n2 > Class9133.method33158()) {
                final int n3 = 2;
                final long n4 = n2 / n3;
                final Future[] array = new Future[n3];
                for (int i = 0; i < n3; ++i) {
                    final long n5 = 1L + i * n4;
                    array[i] = Class8216.method27227(new Class1498(this, n5, (i == n3 - 1) ? n2 : (n5 + n4), class17, n, class18));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6970.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6970.class.getName()).log(Level.SEVERE, null, thrown2);
                }
            }
            else {
                for (long n6 = 1L; n6 < n2; ++n6) {
                    final long n7 = 2L * n6;
                    final long n8 = n7 + 1L;
                    class17.method171(n + n6, class18.method137(n7) - class18.method137(n8));
                    class17.method171(n + this.field27258 - n6, class18.method137(n7) + class18.method137(n8));
                }
            }
            if (this.field27258 % 2L == 0L) {
                class17.method171(n + n2, class18.method137(1L));
            }
            else {
                class17.method171(n + n2, class18.method137(this.field27258 - 1L) - class18.method137(1L));
                class17.method171(n + n2 + 1L, class18.method137(this.field27258 - 1L) + class18.method137(1L));
            }
        }
    }
    
    public void method21390(final double[] array, final boolean b) {
        this.method21392(array, 0, b);
    }
    
    public void method21391(final Class17 class17, final boolean b) {
        this.method21393(class17, 0L, b);
    }
    
    public void method21392(final double[] array, final int n, final boolean b) {
        if (this.field27257 != 1) {
            if (!this.field27260) {
                this.method21388(array, n);
                if (b) {
                    Class9133.method33303(this.field27257, 1.0 / this.field27257, array, n, false);
                }
            }
            else {
                this.method21393(new Class17(array), n, b);
            }
        }
    }
    
    public void method21393(final Class17 class17, final long n, final boolean b) {
        if (this.field27257 != 1) {
            if (!this.field27260) {
                if (!class17.method173()) {
                    if (!class17.method175()) {
                        if (n < 2147483647L) {
                            this.method21392(class17.method206(), (int)n, b);
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method21389(class17, n);
            if (b) {
                Class9133.method33304(this.field27257, 1.0 / this.field27257, class17, n, false);
            }
        }
    }
}
