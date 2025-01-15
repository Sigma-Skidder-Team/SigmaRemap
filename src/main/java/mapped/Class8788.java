// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class8788
{
    private int field36937;
    private int field36938;
    private long field36939;
    private long field36940;
    private Class6970 field36941;
    private Class6970 field36942;
    private boolean field36943;
    private boolean field36944;
    
    public Class8788(final long field36939, final long field36940) {
        this.field36943 = false;
        this.field36944 = false;
        if (field36939 > 1L && field36940 > 1L) {
            this.field36937 = (int)field36939;
            this.field36938 = (int)field36940;
            this.field36939 = field36939;
            this.field36940 = field36940;
            if (field36939 * field36940 >= Class9133.method33160()) {
                this.field36944 = true;
            }
            if (Class9133.method33175(field36939)) {
                if (Class9133.method33175(field36940)) {
                    this.field36943 = true;
                }
            }
            Class9133.method33169(field36939 * field36940 > Class11.method177());
            this.field36942 = new Class6970(field36939);
            if (field36939 != field36940) {
                this.field36941 = new Class6970(field36940);
            }
            else {
                this.field36941 = this.field36942;
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be greater than 1");
    }
    
    public void method30592(final double[] array) {
        final int method27224 = Class8216.method27224();
        if (this.field36943) {
            if (method27224 > 1 && this.field36944) {
                this.method30598(-1, array, true);
                this.method30601(-1, array, true);
            }
            else {
                this.method30604(-1, array, true);
                for (int i = 0; i < this.field36937; ++i) {
                    this.field36941.method21388(array, i * this.field36938);
                }
            }
            this.method30607(array);
        }
        else {
            if (method27224 > 1 && this.field36944 && this.field36937 >= method27224 && this.field36938 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field36937 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final int n2 = j * n;
                    array2[j] = Class8216.method27227(new Class1228(this, n2, (j == method27224 - 1) ? this.field36937 : (n2 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final int n3 = this.field36938 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n4 = k * n3;
                    array2[k] = Class8216.method27227(new Class1090(this, n4, (k == method27224 - 1) ? this.field36938 : (n4 + n3), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (int l = 0; l < this.field36937; ++l) {
                    this.field36941.method21388(array, l * this.field36938);
                }
                final double[] array3 = new double[this.field36937];
                for (int n5 = 0; n5 < this.field36938; ++n5) {
                    for (int n6 = 0; n6 < this.field36937; ++n6) {
                        array3[n6] = array[n6 * this.field36938 + n5];
                    }
                    this.field36942.method21386(array3);
                    for (int n7 = 0; n7 < this.field36937; ++n7) {
                        array[n7 * this.field36938 + n5] = array3[n7];
                    }
                }
            }
            this.method30607(array);
        }
    }
    
    public void method30593(final Class17 class17) {
        final int method27224 = Class8216.method27224();
        if (this.field36943) {
            if (method27224 > 1 && this.field36944) {
                this.method30599(-1, class17, true);
                this.method30602(-1, class17, true);
            }
            else {
                this.method30605(-1, class17, true);
                for (long n = 0L; n < this.field36939; ++n) {
                    this.field36941.method21389(class17, n * this.field36940);
                }
            }
            this.method30608(class17);
        }
        else {
            if (method27224 > 1 && this.field36944 && this.field36939 >= method27224 && this.field36940 >= method27224) {
                final Future[] array = new Future[method27224];
                final long n2 = this.field36939 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final long n3 = i * n2;
                    array[i] = Class8216.method27227(new Class1201(this, n3, (i == method27224 - 1) ? this.field36939 : (n3 + n2), class17));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final long n4 = this.field36940 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final long n5 = j * n4;
                    array[j] = Class8216.method27227(new Class1450(this, n5, (j == method27224 - 1) ? this.field36940 : (n5 + n4), class17));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (long n6 = 0L; n6 < this.field36939; ++n6) {
                    this.field36941.method21389(class17, n6 * this.field36940);
                }
                final Class17 class18 = new Class17(this.field36939, false);
                for (long n7 = 0L; n7 < this.field36940; ++n7) {
                    for (long n8 = 0L; n8 < this.field36939; ++n8) {
                        class18.method171(n8, class17.method137(n8 * this.field36940 + n7));
                    }
                    this.field36942.method21387(class18);
                    for (long n9 = 0L; n9 < this.field36939; ++n9) {
                        class17.method171(n9 * this.field36940 + n7, class18.method137(n9));
                    }
                }
            }
            this.method30608(class17);
        }
    }
    
    public void method30594(final double[][] array) {
        final int method27224 = Class8216.method27224();
        if (this.field36943) {
            if (method27224 > 1 && this.field36944) {
                this.method30600(-1, array, true);
                this.method30603(-1, array, true);
            }
            else {
                this.method30606(-1, array, true);
                for (int i = 0; i < this.field36937; ++i) {
                    this.field36941.method21386(array[i]);
                }
            }
            this.method30609(array);
        }
        else {
            if (method27224 > 1 && this.field36944 && this.field36937 >= method27224 && this.field36938 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field36937 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final int n2 = j * n;
                    array2[j] = Class8216.method27227(new Class1074(this, n2, (j == method27224 - 1) ? this.field36937 : (n2 + n), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final int n3 = this.field36938 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n4 = k * n3;
                    array2[k] = Class8216.method27227(new Class1007(this, n4, (k == method27224 - 1) ? this.field36938 : (n4 + n3), array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (int l = 0; l < this.field36937; ++l) {
                    this.field36941.method21386(array[l]);
                }
                final double[] array3 = new double[this.field36937];
                for (int n5 = 0; n5 < this.field36938; ++n5) {
                    for (int n6 = 0; n6 < this.field36937; ++n6) {
                        array3[n6] = array[n6][n5];
                    }
                    this.field36942.method21386(array3);
                    for (int n7 = 0; n7 < this.field36937; ++n7) {
                        array[n7][n5] = array3[n7];
                    }
                }
            }
            this.method30609(array);
        }
    }
    
    public void method30595(final double[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field36943) {
            if (method27224 > 1 && this.field36944) {
                this.method30598(1, array, b);
                this.method30601(1, array, b);
            }
            else {
                this.method30604(1, array, b);
                for (int i = 0; i < this.field36937; ++i) {
                    this.field36941.method21392(array, i * this.field36938, b);
                }
            }
            this.method30607(array);
        }
        else {
            if (method27224 > 1 && this.field36944 && this.field36937 >= method27224 && this.field36938 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field36937 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final int n2 = j * n;
                    array2[j] = Class8216.method27227(new Class1328(this, n2, (j == method27224 - 1) ? this.field36937 : (n2 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final int n3 = this.field36938 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n4 = k * n3;
                    array2[k] = Class8216.method27227(new Class1540(this, n4, (k == method27224 - 1) ? this.field36938 : (n4 + n3), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (int l = 0; l < this.field36937; ++l) {
                    this.field36941.method21392(array, l * this.field36938, b);
                }
                final double[] array3 = new double[this.field36937];
                for (int n5 = 0; n5 < this.field36938; ++n5) {
                    for (int n6 = 0; n6 < this.field36937; ++n6) {
                        array3[n6] = array[n6 * this.field36938 + n5];
                    }
                    this.field36942.method21390(array3, b);
                    for (int n7 = 0; n7 < this.field36937; ++n7) {
                        array[n7 * this.field36938 + n5] = array3[n7];
                    }
                }
            }
            this.method30607(array);
        }
    }
    
    public void method30596(final Class17 class17, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field36943) {
            if (method27224 > 1 && this.field36944) {
                this.method30599(1, class17, b);
                this.method30602(1, class17, b);
            }
            else {
                this.method30605(1, class17, b);
                for (long n = 0L; n < this.field36939; ++n) {
                    this.field36941.method21393(class17, n * this.field36940, b);
                }
            }
            this.method30608(class17);
        }
        else {
            if (method27224 > 1 && this.field36944 && this.field36939 >= method27224 && this.field36940 >= method27224) {
                final Future[] array = new Future[method27224];
                final long n2 = this.field36939 / method27224;
                for (int i = 0; i < method27224; ++i) {
                    final long n3 = i * n2;
                    array[i] = Class8216.method27227(new Class1443(this, n3, (i == method27224 - 1) ? this.field36939 : (n3 + n2), class17, b));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final long n4 = this.field36940 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final long n5 = j * n4;
                    array[j] = Class8216.method27227(new Class1204(this, n5, (j == method27224 - 1) ? this.field36940 : (n5 + n4), class17, b));
                }
                try {
                    Class8216.method27228(array);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (long n6 = 0L; n6 < this.field36939; ++n6) {
                    this.field36941.method21393(class17, n6 * this.field36940, b);
                }
                final Class17 class18 = new Class17(this.field36939, false);
                for (long n7 = 0L; n7 < this.field36940; ++n7) {
                    for (long n8 = 0L; n8 < this.field36939; ++n8) {
                        class18.method171(n8, class17.method137(n8 * this.field36940 + n7));
                    }
                    this.field36942.method21391(class18, b);
                    for (long n9 = 0L; n9 < this.field36939; ++n9) {
                        class17.method171(n9 * this.field36940 + n7, class18.method137(n9));
                    }
                }
            }
            this.method30608(class17);
        }
    }
    
    public void method30597(final double[][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field36943) {
            if (method27224 > 1 && this.field36944) {
                this.method30600(1, array, b);
                this.method30603(1, array, b);
            }
            else {
                this.method30606(1, array, b);
                for (int i = 0; i < this.field36937; ++i) {
                    this.field36941.method21390(array[i], b);
                }
            }
            this.method30609(array);
        }
        else {
            if (method27224 > 1 && this.field36944 && this.field36937 >= method27224 && this.field36938 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n = this.field36937 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final int n2 = j * n;
                    array2[j] = Class8216.method27227(new Class1127(this, n2, (j == method27224 - 1) ? this.field36937 : (n2 + n), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final int n3 = this.field36938 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n4 = k * n3;
                    array2[k] = Class8216.method27227(new Class1101(this, n4, (k == method27224 - 1) ? this.field36938 : (n4 + n3), array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (int l = 0; l < this.field36937; ++l) {
                    this.field36941.method21390(array[l], b);
                }
                final double[] array3 = new double[this.field36937];
                for (int n5 = 0; n5 < this.field36938; ++n5) {
                    for (int n6 = 0; n6 < this.field36937; ++n6) {
                        array3[n6] = array[n6][n5];
                    }
                    this.field36942.method21390(array3, b);
                    for (int n7 = 0; n7 < this.field36937; ++n7) {
                        array[n7][n5] = array3[n7];
                    }
                }
            }
            this.method30609(array);
        }
    }
    
    private void method30598(final int n, final double[] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field36938, Class8216.method27224());
        int n2 = 4 * this.field36937;
        if (this.field36938 == 2) {
            n2 >>= 1;
        }
        else if (this.field36938 < 2) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final int n4 = method24128;
        final Future[] array2 = new Future[n4];
        for (int i = 0; i < n4; ++i) {
            array2[i] = Class8216.method27227(new Class1315(this, n3, n, i, n4, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method30599(final int n, final Class17 class17, final boolean b) {
        final int n2 = (int)Class7640.method24129(this.field36940, Class8216.method27224());
        long n3 = 4L * this.field36939;
        if (this.field36940 == 2L) {
            n3 >>= 1;
        }
        else if (this.field36940 < 2L) {
            n3 >>= 2;
        }
        final long n4 = n3;
        final int n5 = n2;
        final Future[] array = new Future[n5];
        for (int i = 0; i < n5; ++i) {
            array[i] = Class8216.method27227(new Class1365(this, n4, n, i, n5, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method30600(final int n, final double[][] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field36938, Class8216.method27224());
        int n2 = 4 * this.field36937;
        if (this.field36938 == 2) {
            n2 >>= 1;
        }
        else if (this.field36938 < 2) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final int n4 = method24128;
        final Future[] array2 = new Future[n4];
        for (int i = 0; i < n4; ++i) {
            array2[i] = Class8216.method27227(new Class1185(this, n3, n, i, n4, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method30601(final int n, final double[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field36937) ? this.field36937 : Class8216.method27224();
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1211(this, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method30602(final int n, final Class17 class17, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field36939) ? this.field36939 : Class8216.method27224());
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1416(this, n, i, n2, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method30603(final int n, final double[][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field36937) ? this.field36937 : Class8216.method27224();
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class890(this, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8788.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method30604(final int n, final double[] array, final boolean b) {
        int n2 = 4 * this.field36937;
        if (this.field36938 != 2) {
            if (this.field36938 < 2) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (this.field36938 <= 2) {
            if (this.field36938 == 2) {
                for (int i = 0; i < this.field36937; ++i) {
                    final int n3 = i * this.field36938;
                    array2[i] = array[n3];
                    array2[this.field36937 + i] = array[n3 + 1];
                }
                if (n != -1) {
                    this.field36942.method21392(array2, 0, b);
                    this.field36942.method21392(array2, this.field36937, b);
                }
                else {
                    this.field36942.method21388(array2, 0);
                    this.field36942.method21388(array2, this.field36937);
                }
                for (int j = 0; j < this.field36937; ++j) {
                    final int n4 = j * this.field36938;
                    array[n4] = array2[j];
                    array[n4 + 1] = array2[this.field36937 + j];
                }
            }
        }
        else if (n != -1) {
            for (int k = 0; k < this.field36938; k += 4) {
                for (int l = 0; l < this.field36937; ++l) {
                    final int n5 = l * this.field36938 + k;
                    final int n6 = this.field36937 + l;
                    array2[l] = array[n5];
                    array2[n6] = array[n5 + 1];
                    array2[n6 + this.field36937] = array[n5 + 2];
                    array2[n6 + 2 * this.field36937] = array[n5 + 3];
                }
                this.field36942.method21392(array2, 0, b);
                this.field36942.method21392(array2, this.field36937, b);
                this.field36942.method21392(array2, 2 * this.field36937, b);
                this.field36942.method21392(array2, 3 * this.field36937, b);
                for (int n7 = 0; n7 < this.field36937; ++n7) {
                    final int n8 = n7 * this.field36938 + k;
                    final int n9 = this.field36937 + n7;
                    array[n8] = array2[n7];
                    array[n8 + 1] = array2[n9];
                    array[n8 + 2] = array2[n9 + this.field36937];
                    array[n8 + 3] = array2[n9 + 2 * this.field36937];
                }
            }
        }
        else {
            for (int n10 = 0; n10 < this.field36938; n10 += 4) {
                for (int n11 = 0; n11 < this.field36937; ++n11) {
                    final int n12 = n11 * this.field36938 + n10;
                    final int n13 = this.field36937 + n11;
                    array2[n11] = array[n12];
                    array2[n13] = array[n12 + 1];
                    array2[n13 + this.field36937] = array[n12 + 2];
                    array2[n13 + 2 * this.field36937] = array[n12 + 3];
                }
                this.field36942.method21388(array2, 0);
                this.field36942.method21388(array2, this.field36937);
                this.field36942.method21388(array2, 2 * this.field36937);
                this.field36942.method21388(array2, 3 * this.field36937);
                for (int n14 = 0; n14 < this.field36937; ++n14) {
                    final int n15 = n14 * this.field36938 + n10;
                    final int n16 = this.field36937 + n14;
                    array[n15] = array2[n14];
                    array[n15 + 1] = array2[n16];
                    array[n15 + 2] = array2[n16 + this.field36937];
                    array[n15 + 3] = array2[n16 + 2 * this.field36937];
                }
            }
        }
    }
    
    private void method30605(final int n, final Class17 class17, final boolean b) {
        long n2 = 4L * this.field36939;
        if (this.field36940 != 2L) {
            if (this.field36940 < 2L) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final Class17 class18 = new Class17(n2);
        if (this.field36940 <= 2L) {
            if (this.field36940 == 2L) {
                for (long n3 = 0L; n3 < this.field36939; ++n3) {
                    final long n4 = n3 * this.field36940;
                    class18.method171(n3, class17.method137(n4));
                    class18.method171(this.field36939 + n3, class17.method137(n4 + 1L));
                }
                if (n != -1) {
                    this.field36942.method21393(class18, 0L, b);
                    this.field36942.method21393(class18, this.field36939, b);
                }
                else {
                    this.field36942.method21389(class18, 0L);
                    this.field36942.method21389(class18, this.field36939);
                }
                for (long n5 = 0L; n5 < this.field36939; ++n5) {
                    final long n6 = n5 * this.field36940;
                    class17.method171(n6, class18.method137(n5));
                    class17.method171(n6 + 1L, class18.method137(this.field36939 + n5));
                }
            }
        }
        else if (n != -1) {
            for (long n7 = 0L; n7 < this.field36940; n7 += 4L) {
                for (long n8 = 0L; n8 < this.field36939; ++n8) {
                    final long n9 = n8 * this.field36940 + n7;
                    final long n10 = this.field36939 + n8;
                    class18.method171(n8, class17.method137(n9));
                    class18.method171(n10, class17.method137(n9 + 1L));
                    class18.method171(n10 + this.field36939, class17.method137(n9 + 2L));
                    class18.method171(n10 + 2L * this.field36939, class17.method137(n9 + 3L));
                }
                this.field36942.method21393(class18, 0L, b);
                this.field36942.method21393(class18, this.field36939, b);
                this.field36942.method21393(class18, 2L * this.field36939, b);
                this.field36942.method21393(class18, 3L * this.field36939, b);
                for (long n11 = 0L; n11 < this.field36939; ++n11) {
                    final long n12 = n11 * this.field36940 + n7;
                    final long n13 = this.field36939 + n11;
                    class17.method171(n12, class18.method137(n11));
                    class17.method171(n12 + 1L, class18.method137(n13));
                    class17.method171(n12 + 2L, class18.method137(n13 + this.field36939));
                    class17.method171(n12 + 3L, class18.method137(n13 + 2L * this.field36939));
                }
            }
        }
        else {
            for (long n14 = 0L; n14 < this.field36940; n14 += 4L) {
                for (long n15 = 0L; n15 < this.field36939; ++n15) {
                    final long n16 = n15 * this.field36940 + n14;
                    final long n17 = this.field36939 + n15;
                    class18.method171(n15, class17.method137(n16));
                    class18.method171(n17, class17.method137(n16 + 1L));
                    class18.method171(n17 + this.field36939, class17.method137(n16 + 2L));
                    class18.method171(n17 + 2L * this.field36939, class17.method137(n16 + 3L));
                }
                this.field36942.method21389(class18, 0L);
                this.field36942.method21389(class18, this.field36939);
                this.field36942.method21389(class18, 2L * this.field36939);
                this.field36942.method21389(class18, 3L * this.field36939);
                for (long n18 = 0L; n18 < this.field36939; ++n18) {
                    final long n19 = n18 * this.field36940 + n14;
                    final long n20 = this.field36939 + n18;
                    class17.method171(n19, class18.method137(n18));
                    class17.method171(n19 + 1L, class18.method137(n20));
                    class17.method171(n19 + 2L, class18.method137(n20 + this.field36939));
                    class17.method171(n19 + 3L, class18.method137(n20 + 2L * this.field36939));
                }
            }
        }
    }
    
    private void method30606(final int n, final double[][] array, final boolean b) {
        int n2 = 4 * this.field36937;
        if (this.field36938 != 2) {
            if (this.field36938 < 2) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (this.field36938 <= 2) {
            if (this.field36938 == 2) {
                for (int i = 0; i < this.field36937; ++i) {
                    array2[i] = array[i][0];
                    array2[this.field36937 + i] = array[i][1];
                }
                if (n != -1) {
                    this.field36942.method21392(array2, 0, b);
                    this.field36942.method21392(array2, this.field36937, b);
                }
                else {
                    this.field36942.method21388(array2, 0);
                    this.field36942.method21388(array2, this.field36937);
                }
                for (int j = 0; j < this.field36937; ++j) {
                    array[j][0] = array2[j];
                    array[j][1] = array2[this.field36937 + j];
                }
            }
        }
        else if (n != -1) {
            for (int k = 0; k < this.field36938; k += 4) {
                for (int l = 0; l < this.field36937; ++l) {
                    final int n3 = this.field36937 + l;
                    array2[l] = array[l][k];
                    array2[n3] = array[l][k + 1];
                    array2[n3 + this.field36937] = array[l][k + 2];
                    array2[n3 + 2 * this.field36937] = array[l][k + 3];
                }
                this.field36942.method21392(array2, 0, b);
                this.field36942.method21392(array2, this.field36937, b);
                this.field36942.method21392(array2, 2 * this.field36937, b);
                this.field36942.method21392(array2, 3 * this.field36937, b);
                for (int n4 = 0; n4 < this.field36937; ++n4) {
                    final int n5 = this.field36937 + n4;
                    array[n4][k] = array2[n4];
                    array[n4][k + 1] = array2[n5];
                    array[n4][k + 2] = array2[n5 + this.field36937];
                    array[n4][k + 3] = array2[n5 + 2 * this.field36937];
                }
            }
        }
        else {
            for (int n6 = 0; n6 < this.field36938; n6 += 4) {
                for (int n7 = 0; n7 < this.field36937; ++n7) {
                    final int n8 = this.field36937 + n7;
                    array2[n7] = array[n7][n6];
                    array2[n8] = array[n7][n6 + 1];
                    array2[n8 + this.field36937] = array[n7][n6 + 2];
                    array2[n8 + 2 * this.field36937] = array[n7][n6 + 3];
                }
                this.field36942.method21388(array2, 0);
                this.field36942.method21388(array2, this.field36937);
                this.field36942.method21388(array2, 2 * this.field36937);
                this.field36942.method21388(array2, 3 * this.field36937);
                for (int n9 = 0; n9 < this.field36937; ++n9) {
                    final int n10 = this.field36937 + n9;
                    array[n9][n6] = array2[n9];
                    array[n9][n6 + 1] = array2[n10];
                    array[n9][n6 + 2] = array2[n10 + this.field36937];
                    array[n9][n6 + 3] = array2[n10 + 2 * this.field36937];
                }
            }
        }
    }
    
    private void method30607(final double[] array) {
        for (int i = 0; i <= this.field36937 / 2; ++i) {
            final int n = (this.field36937 - i) % this.field36937;
            final int n2 = i * this.field36938;
            final int n3 = n * this.field36938;
            for (int j = 0; j <= this.field36938 / 2; ++j) {
                final int n4 = (this.field36938 - j) % this.field36938;
                final double n5 = array[n2 + j];
                final double n6 = array[n3 + j];
                final double n7 = array[n2 + n4];
                final double n8 = array[n3 + n4];
                final double n9 = (n5 + n8 - (n6 + n7)) / 2.0;
                array[n2 + j] = n5 - n9;
                array[n3 + j] = n6 + n9;
                array[n2 + n4] = n7 + n9;
                array[n3 + n4] = n8 - n9;
            }
        }
    }
    
    private void method30608(final Class17 class17) {
        for (long n = 0L; n <= this.field36939 / 2L; ++n) {
            final long n2 = (this.field36939 - n) % this.field36939;
            final long n3 = n * this.field36940;
            final long n4 = n2 * this.field36940;
            for (long n5 = 0L; n5 <= this.field36940 / 2L; ++n5) {
                final long n6 = (this.field36940 - n5) % this.field36940;
                final double method137 = class17.method137(n3 + n5);
                final double method138 = class17.method137(n4 + n5);
                final double method139 = class17.method137(n3 + n6);
                final double method140 = class17.method137(n4 + n6);
                final double n7 = (method137 + method140 - (method138 + method139)) / 2.0;
                class17.method171(n3 + n5, method137 - n7);
                class17.method171(n4 + n5, method138 + n7);
                class17.method171(n3 + n6, method139 + n7);
                class17.method171(n4 + n6, method140 - n7);
            }
        }
    }
    
    private void method30609(final double[][] array) {
        for (int i = 0; i <= this.field36937 / 2; ++i) {
            final int n = (this.field36937 - i) % this.field36937;
            for (int j = 0; j <= this.field36938 / 2; ++j) {
                final int n2 = (this.field36938 - j) % this.field36938;
                final double n3 = array[i][j];
                final double n4 = array[n][j];
                final double n5 = array[i][n2];
                final double n6 = array[n][n2];
                final double n7 = (n3 + n6 - (n4 + n5)) / 2.0;
                array[i][j] = n3 - n7;
                array[n][j] = n4 + n7;
                array[i][n2] = n5 + n7;
                array[n][n2] = n6 - n7;
            }
        }
    }
}
