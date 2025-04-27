// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class6874
{
    private final int field26930;
    private final int field26931;
    private final long field26932;
    private final long field26933;
    private final Class8770 field26934;
    private final Class8770 field26935;
    private boolean field26936;
    private boolean field26937;
    
    public Class6874(final long field26932, final long field26933) {
        this.field26936 = false;
        this.field26937 = false;
        if (field26932 > 1L && field26933 > 1L) {
            this.field26930 = (int)field26932;
            this.field26931 = (int)field26933;
            this.field26932 = field26932;
            this.field26933 = field26933;
            if (field26932 * field26933 >= Class9133.method33160()) {
                this.field26937 = true;
            }
            if (Class9133.method33175(field26932)) {
                if (Class9133.method33175(field26933)) {
                    this.field26936 = true;
                }
            }
            Class9133.method33169(field26932 * field26933 > Class11.method177());
            this.field26935 = new Class8770(field26932);
            if (field26932 != field26933) {
                this.field26934 = new Class8770(field26933);
            }
            else {
                this.field26934 = this.field26935;
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be greater than 1");
    }
    
    public void method21015(final float[] array) {
        final int method27224 = Class8216.method27224();
        if (this.field26936) {
            if (method27224 > 1 && this.field26937) {
                this.method21021(-1, array, true);
                this.method21024(-1, array, true);
            }
            else {
                this.method21027(-1, array, true);
                for (int i = 0; i < this.field26930; ++i) {
                    this.field26934.method30447(array, i * this.field26931);
                }
            }
            this.method21030(array);
        }
        else {
            if (method27224 > 1 && this.field26937 && this.field26930 >= method27224 && this.field26931 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field26930 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final int n2 = j * n;
                    array2[j] = Class8216.method27227(new Class1092(this, n2, (j == method27224 - 1) ? this.field26930 : (n2 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final int n3 = this.field26931 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n4 = k * n3;
                    array2[k] = Class8216.method27227(new Class1454(this, n4, (k == method27224 - 1) ? this.field26931 : (n4 + n3), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (int l = 0; l < this.field26930; ++l) {
                    this.field26934.method30447(array, l * this.field26931);
                }
                final float[] array3 = new float[this.field26930];
                for (int n5 = 0; n5 < this.field26931; ++n5) {
                    for (int n6 = 0; n6 < this.field26930; ++n6) {
                        array3[n6] = array[n6 * this.field26931 + n5];
                    }
                    this.field26935.method30445(array3);
                    for (int n7 = 0; n7 < this.field26930; ++n7) {
                        array[n7 * this.field26931 + n5] = array3[n7];
                    }
                }
            }
            this.method21030(array);
        }
    }
    
    public void method21016(final Class22 class22) {
        final int method27224 = Class8216.method27224();
        if (this.field26936) {
            if (method27224 > 1 && this.field26937) {
                this.method21022(-1, class22, true);
                this.method21025(-1, class22, true);
            }
            else {
                this.method21028(-1, class22, true);
                for (long n = 0L; n < this.field26932; ++n) {
                    this.field26934.method30448(class22, n * this.field26933);
                }
            }
            this.method21031(class22);
        }
        else {
            if (method27224 > 1 && this.field26937 && this.field26932 >= method27224 && this.field26933 >= method27224) {
                final Future[] array = new Future[method27224];
                final long n2 = this.field26932 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final long n3 = i * n2;
                    array[i] = Class8216.method27227(new Class1160(this, n3, (i == method27224 - 1) ? this.field26932 : (n3 + n2), class22));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final long n4 = this.field26933 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final long n5 = j * n4;
                    array[j] = Class8216.method27227(new Class1531(this, n5, (j == method27224 - 1) ? this.field26933 : (n5 + n4), class22));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (long n6 = 0L; n6 < this.field26932; ++n6) {
                    this.field26934.method30448(class22, n6 * this.field26933);
                }
                final Class22 class23 = new Class22(this.field26932, false);
                for (long n7 = 0L; n7 < this.field26933; ++n7) {
                    for (long n8 = 0L; n8 < this.field26932; ++n8) {
                        class23.method169(n8, class22.method135(n8 * this.field26933 + n7));
                    }
                    this.field26935.method30446(class23);
                    for (long n9 = 0L; n9 < this.field26932; ++n9) {
                        class22.method169(n9 * this.field26933 + n7, class23.method135(n9));
                    }
                }
            }
            this.method21031(class22);
        }
    }
    
    public void method21017(final float[][] array) {
        final int method27224 = Class8216.method27224();
        if (this.field26936) {
            if (method27224 > 1 && this.field26937) {
                this.method21023(-1, array, true);
                this.method21026(-1, array, true);
            }
            else {
                this.method21029(-1, array, true);
                for (int i = 0; i < this.field26930; ++i) {
                    this.field26934.method30445(array[i]);
                }
            }
            this.method21032(array);
        }
        else {
            if (method27224 > 1 && this.field26937 && this.field26930 >= method27224 && this.field26931 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field26930 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final int n2 = j * n;
                    array2[j] = Class8216.method27227(new Class1425(this, n2, (j == method27224 - 1) ? this.field26930 : (n2 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final int n3 = this.field26931 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n4 = k * n3;
                    array2[k] = Class8216.method27227(new Class1650(this, n4, (k == method27224 - 1) ? this.field26931 : (n4 + n3), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (int l = 0; l < this.field26930; ++l) {
                    this.field26934.method30445(array[l]);
                }
                final float[] array3 = new float[this.field26930];
                for (int n5 = 0; n5 < this.field26931; ++n5) {
                    for (int n6 = 0; n6 < this.field26930; ++n6) {
                        array3[n6] = array[n6][n5];
                    }
                    this.field26935.method30445(array3);
                    for (int n7 = 0; n7 < this.field26930; ++n7) {
                        array[n7][n5] = array3[n7];
                    }
                }
            }
            this.method21032(array);
        }
    }
    
    public void method21018(final float[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field26936) {
            if (method27224 > 1 && this.field26937) {
                this.method21021(1, array, b);
                this.method21024(1, array, b);
            }
            else {
                this.method21027(1, array, b);
                for (int i = 0; i < this.field26930; ++i) {
                    this.field26934.method30451(array, i * this.field26931, b);
                }
            }
            this.method21030(array);
        }
        else {
            if (method27224 > 1 && this.field26937 && this.field26930 >= method27224 && this.field26931 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field26930 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final int n2 = j * n;
                    array2[j] = Class8216.method27227(new Class955(this, n2, (j == method27224 - 1) ? this.field26930 : (n2 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final int n3 = this.field26931 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n4 = k * n3;
                    array2[k] = Class8216.method27227(new Class1122(this, n4, (k == method27224 - 1) ? this.field26931 : (n4 + n3), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (int l = 0; l < this.field26930; ++l) {
                    this.field26934.method30451(array, l * this.field26931, b);
                }
                final float[] array3 = new float[this.field26930];
                for (int n5 = 0; n5 < this.field26931; ++n5) {
                    for (int n6 = 0; n6 < this.field26930; ++n6) {
                        array3[n6] = array[n6 * this.field26931 + n5];
                    }
                    this.field26935.method30449(array3, b);
                    for (int n7 = 0; n7 < this.field26930; ++n7) {
                        array[n7 * this.field26931 + n5] = array3[n7];
                    }
                }
            }
            this.method21030(array);
        }
    }
    
    public void method21019(final Class22 class22, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field26936) {
            if (method27224 > 1 && this.field26937) {
                this.method21022(1, class22, b);
                this.method21025(1, class22, b);
            }
            else {
                this.method21028(1, class22, b);
                for (long n = 0L; n < this.field26932; ++n) {
                    this.field26934.method30452(class22, n * this.field26933, b);
                }
            }
            this.method21031(class22);
        }
        else {
            if (method27224 > 1 && this.field26937 && this.field26932 >= method27224 && this.field26933 >= method27224) {
                final Future[] array = new Future[method27224];
                final long n2 = this.field26932 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final long n3 = i * n2;
                    array[i] = Class8216.method27227(new Class1070(this, n3, (i == method27224 - 1) ? this.field26932 : (n3 + n2), class22, b));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final long n4 = this.field26933 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final long n5 = j * n4;
                    array[j] = Class8216.method27227(new Class1459(this, n5, (j == method27224 - 1) ? this.field26933 : (n5 + n4), class22, b));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (long n6 = 0L; n6 < this.field26932; ++n6) {
                    this.field26934.method30452(class22, n6 * this.field26933, b);
                }
                final Class22 class23 = new Class22(this.field26932, false);
                for (long n7 = 0L; n7 < this.field26933; ++n7) {
                    for (long n8 = 0L; n8 < this.field26932; ++n8) {
                        class23.method169(n8, class22.method135(n8 * this.field26933 + n7));
                    }
                    this.field26935.method30450(class23, b);
                    for (long n9 = 0L; n9 < this.field26932; ++n9) {
                        class22.method169(n9 * this.field26933 + n7, class23.method135(n9));
                    }
                }
            }
            this.method21031(class22);
        }
    }
    
    public void method21020(final float[][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field26936) {
            if (method27224 > 1 && this.field26937) {
                this.method21023(1, array, b);
                this.method21026(1, array, b);
            }
            else {
                this.method21029(1, array, b);
                for (int i = 0; i < this.field26930; ++i) {
                    this.field26934.method30449(array[i], b);
                }
            }
            this.method21032(array);
        }
        else {
            if (method27224 > 1 && this.field26937 && this.field26930 >= method27224 && this.field26931 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field26930 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final int n2 = j * n;
                    array2[j] = Class8216.method27227(new Class1123(this, n2, (j == method27224 - 1) ? this.field26930 : (n2 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final int n3 = this.field26931 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n4 = k * n3;
                    array2[k] = Class8216.method27227(new Class1489(this, n4, (k == method27224 - 1) ? this.field26931 : (n4 + n3), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (int l = 0; l < this.field26930; ++l) {
                    this.field26934.method30449(array[l], b);
                }
                final float[] array3 = new float[this.field26930];
                for (int n5 = 0; n5 < this.field26931; ++n5) {
                    for (int n6 = 0; n6 < this.field26930; ++n6) {
                        array3[n6] = array[n6][n5];
                    }
                    this.field26935.method30449(array3, b);
                    for (int n7 = 0; n7 < this.field26930; ++n7) {
                        array[n7][n5] = array3[n7];
                    }
                }
            }
            this.method21032(array);
        }
    }
    
    private void method21021(final int n, final float[] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field26931, Class8216.method27224());
        int n2 = 4 * this.field26930;
        if (this.field26931 == 2) {
            n2 >>= 1;
        }
        else if (this.field26931 < 2) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final int n4 = method24128;
        final Future[] array2 = new Future[n4];
        for (int i = 0; i < n4; ++i) {
            array2[i] = Class8216.method27227(new Class1234(this, n3, n, i, n4, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method21022(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)Class7640.method24129(this.field26933, Class8216.method27224());
        long n3 = 4L * this.field26932;
        if (this.field26933 == 2L) {
            n3 >>= 1;
        }
        else if (this.field26933 < 2L) {
            n3 >>= 2;
        }
        final long n4 = n3;
        final int n5 = n2;
        final Future[] array = new Future[n5];
        for (int i = 0; i < n5; ++i) {
            array[i] = Class8216.method27227(new Class985(this, n4, n, i, n5, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method21023(final int n, final float[][] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field26931, Class8216.method27224());
        int n2 = 4 * this.field26930;
        if (this.field26931 == 2) {
            n2 >>= 1;
        }
        else if (this.field26931 < 2) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final int n4 = method24128;
        final Future[] array2 = new Future[n4];
        for (int i = 0; i < n4; ++i) {
            array2[i] = Class8216.method27227(new Class1431(this, n3, n, i, n4, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method21024(final int n, final float[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field26930) ? this.field26930 : Class8216.method27224();
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1481(this, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method21025(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field26932) ? this.field26932 : Class8216.method27224());
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1347(this, n, i, n2, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method21026(final int n, final float[][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field26930) ? this.field26930 : Class8216.method27224();
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1124(this, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6874.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method21027(final int n, final float[] array, final boolean b) {
        int n2 = 4 * this.field26930;
        if (this.field26931 != 2) {
            if (this.field26931 < 2) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (this.field26931 <= 2) {
            if (this.field26931 == 2) {
                for (int i = 0; i < this.field26930; ++i) {
                    final int n3 = i * this.field26931;
                    array2[i] = array[n3];
                    array2[this.field26930 + i] = array[n3 + 1];
                }
                if (n != -1) {
                    this.field26935.method30451(array2, 0, b);
                    this.field26935.method30451(array2, this.field26930, b);
                }
                else {
                    this.field26935.method30447(array2, 0);
                    this.field26935.method30447(array2, this.field26930);
                }
                for (int j = 0; j < this.field26930; ++j) {
                    final int n4 = j * this.field26931;
                    array[n4] = array2[j];
                    array[n4 + 1] = array2[this.field26930 + j];
                }
            }
        }
        else if (n != -1) {
            for (int k = 0; k < this.field26931; k += 4) {
                for (int l = 0; l < this.field26930; ++l) {
                    final int n5 = l * this.field26931 + k;
                    final int n6 = this.field26930 + l;
                    array2[l] = array[n5];
                    array2[n6] = array[n5 + 1];
                    array2[n6 + this.field26930] = array[n5 + 2];
                    array2[n6 + 2 * this.field26930] = array[n5 + 3];
                }
                this.field26935.method30451(array2, 0, b);
                this.field26935.method30451(array2, this.field26930, b);
                this.field26935.method30451(array2, 2 * this.field26930, b);
                this.field26935.method30451(array2, 3 * this.field26930, b);
                for (int n7 = 0; n7 < this.field26930; ++n7) {
                    final int n8 = n7 * this.field26931 + k;
                    final int n9 = this.field26930 + n7;
                    array[n8] = array2[n7];
                    array[n8 + 1] = array2[n9];
                    array[n8 + 2] = array2[n9 + this.field26930];
                    array[n8 + 3] = array2[n9 + 2 * this.field26930];
                }
            }
        }
        else {
            for (int n10 = 0; n10 < this.field26931; n10 += 4) {
                for (int n11 = 0; n11 < this.field26930; ++n11) {
                    final int n12 = n11 * this.field26931 + n10;
                    final int n13 = this.field26930 + n11;
                    array2[n11] = array[n12];
                    array2[n13] = array[n12 + 1];
                    array2[n13 + this.field26930] = array[n12 + 2];
                    array2[n13 + 2 * this.field26930] = array[n12 + 3];
                }
                this.field26935.method30447(array2, 0);
                this.field26935.method30447(array2, this.field26930);
                this.field26935.method30447(array2, 2 * this.field26930);
                this.field26935.method30447(array2, 3 * this.field26930);
                for (int n14 = 0; n14 < this.field26930; ++n14) {
                    final int n15 = n14 * this.field26931 + n10;
                    final int n16 = this.field26930 + n14;
                    array[n15] = array2[n14];
                    array[n15 + 1] = array2[n16];
                    array[n15 + 2] = array2[n16 + this.field26930];
                    array[n15 + 3] = array2[n16 + 2 * this.field26930];
                }
            }
        }
    }
    
    private void method21028(final int n, final Class22 class22, final boolean b) {
        long n2 = 4L * this.field26932;
        if (this.field26933 != 2L) {
            if (this.field26933 < 2L) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final Class22 class23 = new Class22(n2);
        if (this.field26933 <= 2L) {
            if (this.field26933 == 2L) {
                for (long n3 = 0L; n3 < this.field26932; ++n3) {
                    final long n4 = n3 * this.field26933;
                    class23.method169(n3, class22.method135(n4));
                    class23.method169(this.field26932 + n3, class22.method135(n4 + 1L));
                }
                if (n != -1) {
                    this.field26935.method30452(class23, 0L, b);
                    this.field26935.method30452(class23, this.field26932, b);
                }
                else {
                    this.field26935.method30448(class23, 0L);
                    this.field26935.method30448(class23, this.field26932);
                }
                for (long n5 = 0L; n5 < this.field26932; ++n5) {
                    final long n6 = n5 * this.field26933;
                    class22.method169(n6, class23.method135(n5));
                    class22.method169(n6 + 1L, class23.method135(this.field26932 + n5));
                }
            }
        }
        else if (n != -1) {
            for (long n7 = 0L; n7 < this.field26933; n7 += 4L) {
                for (long n8 = 0L; n8 < this.field26932; ++n8) {
                    final long n9 = n8 * this.field26933 + n7;
                    final long n10 = this.field26932 + n8;
                    class23.method169(n8, class22.method135(n9));
                    class23.method169(n10, class22.method135(n9 + 1L));
                    class23.method169(n10 + this.field26932, class22.method135(n9 + 2L));
                    class23.method169(n10 + 2L * this.field26932, class22.method135(n9 + 3L));
                }
                this.field26935.method30452(class23, 0L, b);
                this.field26935.method30452(class23, this.field26932, b);
                this.field26935.method30452(class23, 2L * this.field26932, b);
                this.field26935.method30452(class23, 3L * this.field26932, b);
                for (long n11 = 0L; n11 < this.field26932; ++n11) {
                    final long n12 = n11 * this.field26933 + n7;
                    final long n13 = this.field26932 + n11;
                    class22.method169(n12, class23.method135(n11));
                    class22.method169(n12 + 1L, class23.method135(n13));
                    class22.method169(n12 + 2L, class23.method135(n13 + this.field26932));
                    class22.method169(n12 + 3L, class23.method135(n13 + 2L * this.field26932));
                }
            }
        }
        else {
            for (long n14 = 0L; n14 < this.field26933; n14 += 4L) {
                for (long n15 = 0L; n15 < this.field26932; ++n15) {
                    final long n16 = n15 * this.field26933 + n14;
                    final long n17 = this.field26932 + n15;
                    class23.method169(n15, class22.method135(n16));
                    class23.method169(n17, class22.method135(n16 + 1L));
                    class23.method169(n17 + this.field26932, class22.method135(n16 + 2L));
                    class23.method169(n17 + 2L * this.field26932, class22.method135(n16 + 3L));
                }
                this.field26935.method30448(class23, 0L);
                this.field26935.method30448(class23, this.field26932);
                this.field26935.method30448(class23, 2L * this.field26932);
                this.field26935.method30448(class23, 3L * this.field26932);
                for (long n18 = 0L; n18 < this.field26932; ++n18) {
                    final long n19 = n18 * this.field26933 + n14;
                    final long n20 = this.field26932 + n18;
                    class22.method169(n19, class23.method135(n18));
                    class22.method169(n19 + 1L, class23.method135(n20));
                    class22.method169(n19 + 2L, class23.method135(n20 + this.field26932));
                    class22.method169(n19 + 3L, class23.method135(n20 + 2L * this.field26932));
                }
            }
        }
    }
    
    private void method21029(final int n, final float[][] array, final boolean b) {
        int n2 = 4 * this.field26930;
        if (this.field26931 != 2) {
            if (this.field26931 < 2) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (this.field26931 <= 2) {
            if (this.field26931 == 2) {
                for (int i = 0; i < this.field26930; ++i) {
                    array2[i] = array[i][0];
                    array2[this.field26930 + i] = array[i][1];
                }
                if (n != -1) {
                    this.field26935.method30451(array2, 0, b);
                    this.field26935.method30451(array2, this.field26930, b);
                }
                else {
                    this.field26935.method30447(array2, 0);
                    this.field26935.method30447(array2, this.field26930);
                }
                for (int j = 0; j < this.field26930; ++j) {
                    array[j][0] = array2[j];
                    array[j][1] = array2[this.field26930 + j];
                }
            }
        }
        else if (n != -1) {
            for (int k = 0; k < this.field26931; k += 4) {
                for (int l = 0; l < this.field26930; ++l) {
                    final int n3 = this.field26930 + l;
                    array2[l] = array[l][k];
                    array2[n3] = array[l][k + 1];
                    array2[n3 + this.field26930] = array[l][k + 2];
                    array2[n3 + 2 * this.field26930] = array[l][k + 3];
                }
                this.field26935.method30451(array2, 0, b);
                this.field26935.method30451(array2, this.field26930, b);
                this.field26935.method30451(array2, 2 * this.field26930, b);
                this.field26935.method30451(array2, 3 * this.field26930, b);
                for (int n4 = 0; n4 < this.field26930; ++n4) {
                    final int n5 = this.field26930 + n4;
                    array[n4][k] = array2[n4];
                    array[n4][k + 1] = array2[n5];
                    array[n4][k + 2] = array2[n5 + this.field26930];
                    array[n4][k + 3] = array2[n5 + 2 * this.field26930];
                }
            }
        }
        else {
            for (int n6 = 0; n6 < this.field26931; n6 += 4) {
                for (int n7 = 0; n7 < this.field26930; ++n7) {
                    final int n8 = this.field26930 + n7;
                    array2[n7] = array[n7][n6];
                    array2[n8] = array[n7][n6 + 1];
                    array2[n8 + this.field26930] = array[n7][n6 + 2];
                    array2[n8 + 2 * this.field26930] = array[n7][n6 + 3];
                }
                this.field26935.method30447(array2, 0);
                this.field26935.method30447(array2, this.field26930);
                this.field26935.method30447(array2, 2 * this.field26930);
                this.field26935.method30447(array2, 3 * this.field26930);
                for (int n9 = 0; n9 < this.field26930; ++n9) {
                    final int n10 = this.field26930 + n9;
                    array[n9][n6] = array2[n9];
                    array[n9][n6 + 1] = array2[n10];
                    array[n9][n6 + 2] = array2[n10 + this.field26930];
                    array[n9][n6 + 3] = array2[n10 + 2 * this.field26930];
                }
            }
        }
    }
    
    private void method21030(final float[] array) {
        for (int i = 0; i <= this.field26930 / 2; ++i) {
            final int n = (this.field26930 - i) % this.field26930;
            final int n2 = i * this.field26931;
            final int n3 = n * this.field26931;
            for (int j = 0; j <= this.field26931 / 2; ++j) {
                final int n4 = (this.field26931 - j) % this.field26931;
                final float n5 = array[n2 + j];
                final float n6 = array[n3 + j];
                final float n7 = array[n2 + n4];
                final float n8 = array[n3 + n4];
                final float n9 = (n5 + n8 - (n6 + n7)) / 2.0f;
                array[n2 + j] = n5 - n9;
                array[n3 + j] = n6 + n9;
                array[n2 + n4] = n7 + n9;
                array[n3 + n4] = n8 - n9;
            }
        }
    }
    
    private void method21031(final Class22 class22) {
        for (long n = 0L; n <= this.field26932 / 2L; ++n) {
            final long n2 = (this.field26932 - n) % this.field26932;
            final long n3 = n * this.field26933;
            final long n4 = n2 * this.field26933;
            for (long n5 = 0L; n5 <= this.field26933 / 2L; ++n5) {
                final long n6 = (this.field26933 - n5) % this.field26933;
                final float method135 = class22.method135(n3 + n5);
                final float method136 = class22.method135(n4 + n5);
                final float method137 = class22.method135(n3 + n6);
                final float method138 = class22.method135(n4 + n6);
                final float n7 = (method135 + method138 - (method136 + method137)) / 2.0f;
                class22.method169(n3 + n5, method135 - n7);
                class22.method169(n4 + n5, method136 + n7);
                class22.method169(n3 + n6, method137 + n7);
                class22.method169(n4 + n6, method138 - n7);
            }
        }
    }
    
    private void method21032(final float[][] array) {
        for (int i = 0; i <= this.field26930 / 2; ++i) {
            final int n = (this.field26930 - i) % this.field26930;
            for (int j = 0; j <= this.field26931 / 2; ++j) {
                final int n2 = (this.field26931 - j) % this.field26931;
                final float n3 = array[i][j];
                final float n4 = array[n][j];
                final float n5 = array[i][n2];
                final float n6 = array[n][n2];
                final float n7 = (n3 + n6 - (n4 + n5)) / 2.0f;
                array[i][j] = n3 - n7;
                array[n][j] = n4 + n7;
                array[i][n2] = n5 + n7;
                array[n][n2] = n6 - n7;
            }
        }
    }
}
