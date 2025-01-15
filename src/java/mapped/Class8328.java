// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class8328
{
    private int field34200;
    private int field34201;
    private long field34202;
    private long field34203;
    private Class7978 field34204;
    private Class7978 field34205;
    private boolean field34206;
    private boolean field34207;
    
    public Class8328(final long field34202, final long field34203) {
        this.field34206 = false;
        this.field34207 = false;
        if (field34202 > 1L && field34203 > 1L) {
            this.field34200 = (int)field34202;
            this.field34201 = (int)field34203;
            this.field34202 = field34202;
            this.field34203 = field34203;
            if (field34202 * field34203 >= Class9133.method33160()) {
                this.field34207 = true;
            }
            if (Class9133.method33175(field34202)) {
                if (Class9133.method33175(field34203)) {
                    this.field34206 = true;
                }
            }
            Class9133.method33169(2L * field34202 * field34203 > Class11.method177());
            this.field34205 = new Class7978(field34202);
            if (field34202 != field34203) {
                this.field34204 = new Class7978(field34203);
            }
            else {
                this.field34204 = this.field34205;
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be greater than 1");
    }
    
    public void method27717(final float[] array) {
        final int method27224 = Class8216.method27224();
        if (this.field34206) {
            this.field34201 *= 2;
            if (method27224 > 1 && this.field34207) {
                this.method27747(0, -1, array, true);
                this.method27753(-1, array, true);
            }
            else {
                for (int i = 0; i < this.field34200; ++i) {
                    this.field34204.method25927(array, i * this.field34201);
                }
                this.method27744(-1, array, true);
            }
            this.field34201 /= 2;
        }
        else {
            final int n = 2 * this.field34201;
            if (method27224 > 1 && this.field34207 && this.field34200 >= method27224 && this.field34201 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n2 = this.field34200 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n2;
                    array2[j] = Class8216.method27227(new Class1599(this, n3, (j == method27224 - 1) ? this.field34200 : (n3 + n2), array, n));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final int n4 = this.field34201 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    array2[k] = Class8216.method27227(new Class1033(this, n5, (k == method27224 - 1) ? this.field34201 : (n5 + n4), n, array));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (int l = 0; l < this.field34200; ++l) {
                    this.field34204.method25927(array, l * n);
                }
                final float[] array3 = new float[2 * this.field34200];
                for (int n6 = 0; n6 < this.field34201; ++n6) {
                    final int n7 = 2 * n6;
                    for (int n8 = 0; n8 < this.field34200; ++n8) {
                        final int n9 = 2 * n8;
                        final int n10 = n8 * n + n7;
                        array3[n9] = array[n10];
                        array3[n9 + 1] = array[n10 + 1];
                    }
                    this.field34205.method25925(array3);
                    for (int n11 = 0; n11 < this.field34200; ++n11) {
                        final int n12 = 2 * n11;
                        final int n13 = n11 * n + n7;
                        array[n13] = array3[n12];
                        array[n13 + 1] = array3[n12 + 1];
                    }
                }
            }
        }
    }
    
    public void method27718(final Class22 class22) {
        if (!class22.method173() && !class22.method175()) {
            this.method27717(class22.method230());
        }
        else {
            final int method27224 = Class8216.method27224();
            if (this.field34206) {
                this.field34203 *= 2L;
                if (method27224 > 1 && this.field34207) {
                    this.method27748(0L, -1, class22, true);
                    this.method27754(-1, class22, true);
                }
                else {
                    for (int n = 0; n < this.field34202; ++n) {
                        this.field34204.method25928(class22, n * this.field34203);
                    }
                    this.method27745(-1, class22, true);
                }
                this.field34203 /= 2L;
            }
            else {
                final long n2 = 2L * this.field34203;
                if (method27224 > 1 && this.field34207 && this.field34202 >= method27224 && this.field34203 >= method27224) {
                    final Future[] array = new Future[method27224];
                    final long n3 = this.field34202 / method27224;
                    for (int i = 0; i < method27224; ++i) {
                        final long n4 = i * n3;
                        array[i] = Class8216.method27227(new Class1386(this, n4, (i == method27224 - 1) ? this.field34202 : (n4 + n3), class22, n2));
                    }
                    try {
                        Class8216.method27228(array);
                    }
                    catch (final InterruptedException thrown) {
                        Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
                    }
                    catch (final ExecutionException thrown2) {
                        Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
                    }
                    final long n5 = this.field34203 / method27224;
                    for (int j = 0; j < method27224; ++j) {
                        final long n6 = j * n5;
                        array[j] = Class8216.method27227(new Class1460(this, n6, (j == method27224 - 1) ? this.field34203 : (n6 + n5), n2, class22));
                    }
                    try {
                        Class8216.method27228(array);
                    }
                    catch (final InterruptedException thrown3) {
                        Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown3);
                    }
                    catch (final ExecutionException thrown4) {
                        Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown4);
                    }
                }
                else {
                    for (long n7 = 0L; n7 < this.field34202; ++n7) {
                        this.field34204.method25928(class22, n7 * n2);
                    }
                    final Class22 class23 = new Class22(2L * this.field34202, false);
                    for (long n8 = 0L; n8 < this.field34203; ++n8) {
                        final long n9 = 2L * n8;
                        for (long n10 = 0L; n10 < this.field34202; ++n10) {
                            final long n11 = 2L * n10;
                            final long n12 = n10 * n2 + n9;
                            class23.method171(n11, class22.method135(n12));
                            class23.method171(n11 + 1L, class22.method135(n12 + 1L));
                        }
                        this.field34205.method25926(class23);
                        for (long n13 = 0L; n13 < this.field34202; ++n13) {
                            final long n14 = 2L * n13;
                            final long n15 = n13 * n2 + n9;
                            class22.method171(n15, class23.method135(n14));
                            class22.method171(n15 + 1L, class23.method135(n14 + 1L));
                        }
                    }
                }
            }
        }
    }
    
    public void method27719(final float[][] array) {
        final int method27224 = Class8216.method27224();
        if (this.field34206) {
            this.field34201 *= 2;
            if (method27224 > 1 && this.field34207) {
                this.method27751(0, -1, array, true);
                this.method27755(-1, array, true);
            }
            else {
                for (int i = 0; i < this.field34200; ++i) {
                    this.field34204.method25925(array[i]);
                }
                this.method27746(-1, array, true);
            }
            this.field34201 /= 2;
        }
        else if (method27224 > 1 && this.field34207 && this.field34200 >= method27224 && this.field34201 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field34200 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1116(this, n2, (j == method27224 - 1) ? this.field34200 : (n2 + n), array));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field34201 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1355(this, n4, (k == method27224 - 1) ? this.field34201 : (n4 + n3), array));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field34200; ++l) {
                this.field34204.method25925(array[l]);
            }
            final float[] array3 = new float[2 * this.field34200];
            for (int n5 = 0; n5 < this.field34201; ++n5) {
                final int n6 = 2 * n5;
                for (int n7 = 0; n7 < this.field34200; ++n7) {
                    final int n8 = 2 * n7;
                    array3[n8] = array[n7][n6];
                    array3[n8 + 1] = array[n7][n6 + 1];
                }
                this.field34205.method25925(array3);
                for (int n9 = 0; n9 < this.field34200; ++n9) {
                    final int n10 = 2 * n9;
                    array[n9][n6] = array3[n10];
                    array[n9][n6 + 1] = array3[n10 + 1];
                }
            }
        }
    }
    
    public void method27720(final float[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field34206) {
            this.field34201 *= 2;
            if (method27224 > 1 && this.field34207) {
                this.method27747(0, 1, array, b);
                this.method27753(1, array, b);
            }
            else {
                for (int i = 0; i < this.field34200; ++i) {
                    this.field34204.method25931(array, i * this.field34201, b);
                }
                this.method27744(1, array, b);
            }
            this.field34201 /= 2;
        }
        else {
            final int n = 2 * this.field34201;
            if (method27224 > 1 && this.field34207 && this.field34200 >= method27224 && this.field34201 >= method27224) {
                final Future[] array2 = new Future[method27224];
                final int n2 = this.field34200 / method27224;
                for (int j = 0; j < method27224; ++j) {
                    final int n3 = j * n2;
                    array2[j] = Class8216.method27227(new Class1633(this, n3, (j == method27224 - 1) ? this.field34200 : (n3 + n2), array, n, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown) {
                    Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
                }
                catch (final ExecutionException thrown2) {
                    Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
                }
                final int n4 = this.field34201 / method27224;
                for (int k = 0; k < method27224; ++k) {
                    final int n5 = k * n4;
                    array2[k] = Class8216.method27227(new Class1354(this, n5, (k == method27224 - 1) ? this.field34201 : (n5 + n4), n, array, b));
                }
                try {
                    Class8216.method27228(array2);
                }
                catch (final InterruptedException thrown3) {
                    Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown3);
                }
                catch (final ExecutionException thrown4) {
                    Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown4);
                }
            }
            else {
                for (int l = 0; l < this.field34200; ++l) {
                    this.field34204.method25931(array, l * n, b);
                }
                final float[] array3 = new float[2 * this.field34200];
                for (int n6 = 0; n6 < this.field34201; ++n6) {
                    final int n7 = 2 * n6;
                    for (int n8 = 0; n8 < this.field34200; ++n8) {
                        final int n9 = 2 * n8;
                        final int n10 = n8 * n + n7;
                        array3[n9] = array[n10];
                        array3[n9 + 1] = array[n10 + 1];
                    }
                    this.field34205.method25929(array3, b);
                    for (int n11 = 0; n11 < this.field34200; ++n11) {
                        final int n12 = 2 * n11;
                        final int n13 = n11 * n + n7;
                        array[n13] = array3[n12];
                        array[n13 + 1] = array3[n12 + 1];
                    }
                }
            }
        }
    }
    
    public void method27721(final Class22 class22, final boolean b) {
        if (!class22.method173() && !class22.method175()) {
            this.method27720(class22.method230(), b);
        }
        else {
            final int method27224 = Class8216.method27224();
            if (this.field34206) {
                this.field34203 *= 2L;
                if (method27224 > 1 && this.field34207) {
                    this.method27748(0L, 1, class22, b);
                    this.method27754(1, class22, b);
                }
                else {
                    for (long n = 0L; n < this.field34202; ++n) {
                        this.field34204.method25932(class22, n * this.field34203, b);
                    }
                    this.method27745(1, class22, b);
                }
                this.field34203 /= 2L;
            }
            else {
                final long n2 = 2L * this.field34203;
                if (method27224 > 1 && this.field34207 && this.field34202 >= method27224 && this.field34203 >= method27224) {
                    final Future[] array = new Future[method27224];
                    final long n3 = this.field34202 / method27224;
                    for (int i = 0; i < method27224; ++i) {
                        final long n4 = i * n3;
                        array[i] = Class8216.method27227(new Class1267(this, n4, (i == method27224 - 1) ? this.field34202 : (n4 + n3), class22, n2, b));
                    }
                    try {
                        Class8216.method27228(array);
                    }
                    catch (final InterruptedException thrown) {
                        Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
                    }
                    catch (final ExecutionException thrown2) {
                        Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
                    }
                    final long n5 = this.field34203 / method27224;
                    for (int j = 0; j < method27224; ++j) {
                        final long n6 = j * n5;
                        array[j] = Class8216.method27227(new Class1434(this, n6, (j == method27224 - 1) ? this.field34203 : (n6 + n5), n2, class22, b));
                    }
                    try {
                        Class8216.method27228(array);
                    }
                    catch (final InterruptedException thrown3) {
                        Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown3);
                    }
                    catch (final ExecutionException thrown4) {
                        Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown4);
                    }
                }
                else {
                    for (long n7 = 0L; n7 < this.field34202; ++n7) {
                        this.field34204.method25932(class22, n7 * n2, b);
                    }
                    final Class22 class23 = new Class22(2L * this.field34202);
                    for (long n8 = 0L; n8 < this.field34203; ++n8) {
                        final long n9 = 2L * n8;
                        for (long n10 = 0L; n10 < this.field34202; ++n10) {
                            final long n11 = 2L * n10;
                            final long n12 = n10 * n2 + n9;
                            class23.method171(n11, class22.method135(n12));
                            class23.method171(n11 + 1L, class22.method135(n12 + 1L));
                        }
                        this.field34205.method25930(class23, b);
                        for (long n13 = 0L; n13 < this.field34202; ++n13) {
                            final long n14 = 2L * n13;
                            final long n15 = n13 * n2 + n9;
                            class22.method171(n15, class23.method135(n14));
                            class22.method171(n15 + 1L, class23.method135(n14 + 1L));
                        }
                    }
                }
            }
        }
    }
    
    public void method27722(final float[][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field34206) {
            this.field34201 *= 2;
            if (method27224 > 1 && this.field34207) {
                this.method27751(0, 1, array, b);
                this.method27755(1, array, b);
            }
            else {
                for (int i = 0; i < this.field34200; ++i) {
                    this.field34204.method25929(array[i], b);
                }
                this.method27746(1, array, b);
            }
            this.field34201 /= 2;
        }
        else if (method27224 > 1 && this.field34207 && this.field34200 >= method27224 && this.field34201 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field34200 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1052(this, n2, (j == method27224 - 1) ? this.field34200 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field34201 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1419(this, n4, (k == method27224 - 1) ? this.field34201 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field34200; ++l) {
                this.field34204.method25929(array[l], b);
            }
            final float[] array3 = new float[2 * this.field34200];
            for (int n5 = 0; n5 < this.field34201; ++n5) {
                final int n6 = 2 * n5;
                for (int n7 = 0; n7 < this.field34200; ++n7) {
                    final int n8 = 2 * n7;
                    array3[n8] = array[n7][n6];
                    array3[n8 + 1] = array[n7][n6 + 1];
                }
                this.field34205.method25929(array3, b);
                for (int n9 = 0; n9 < this.field34200; ++n9) {
                    final int n10 = 2 * n9;
                    array[n9][n6] = array3[n10];
                    array[n9][n6 + 1] = array3[n10 + 1];
                }
            }
        }
    }
    
    public void method27723(final float[] array) {
        if (this.field34206) {
            if (Class8216.method27224() > 1 && this.field34207) {
                this.method27747(1, 1, array, true);
                this.method27753(-1, array, true);
                this.method27741(1, array);
            }
            else {
                for (int i = 0; i < this.field34200; ++i) {
                    this.field34204.method25935(array, i * this.field34201);
                }
                this.method27744(-1, array, true);
                this.method27741(1, array);
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be power of two numbers");
    }
    
    public void method27724(final Class22 class22) {
        if (this.field34206) {
            if (Class8216.method27224() > 1 && this.field34207) {
                this.method27748(1L, 1, class22, true);
                this.method27754(-1, class22, true);
                this.method27742(1, class22);
            }
            else {
                for (long n = 0L; n < this.field34202; ++n) {
                    this.field34204.method25936(class22, n * this.field34203);
                }
                this.method27745(-1, class22, true);
                this.method27742(1, class22);
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be power of two numbers");
    }
    
    public void method27725(final float[][] array) {
        if (this.field34206) {
            if (Class8216.method27224() > 1 && this.field34207) {
                this.method27751(1, 1, array, true);
                this.method27755(-1, array, true);
                this.method27743(1, array);
            }
            else {
                for (int i = 0; i < this.field34200; ++i) {
                    this.field34204.method25933(array[i]);
                }
                this.method27746(-1, array, true);
                this.method27743(1, array);
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be power of two numbers");
    }
    
    public void method27726(final float[] array) {
        if (!this.field34206) {
            this.method27736(array);
        }
        else {
            if (Class8216.method27224() > 1 && this.field34207) {
                this.method27747(1, 1, array, true);
                this.method27753(-1, array, true);
                this.method27741(1, array);
            }
            else {
                for (int i = 0; i < this.field34200; ++i) {
                    this.field34204.method25935(array, i * this.field34201);
                }
                this.method27744(-1, array, true);
                this.method27741(1, array);
            }
            this.method27756(array);
        }
    }
    
    public void method27727(final Class22 class22) {
        if (!this.field34206) {
            this.method27737(class22);
        }
        else {
            if (Class8216.method27224() > 1 && this.field34207) {
                this.method27748(1L, 1, class22, true);
                this.method27754(-1, class22, true);
                this.method27742(1, class22);
            }
            else {
                for (long n = 0L; n < this.field34202; ++n) {
                    this.field34204.method25936(class22, n * this.field34203);
                }
                this.method27745(-1, class22, true);
                this.method27742(1, class22);
            }
            this.method27757(class22);
        }
    }
    
    public void method27728(final float[][] array) {
        if (!this.field34206) {
            this.method27735(array);
        }
        else {
            if (Class8216.method27224() > 1 && this.field34207) {
                this.method27751(1, 1, array, true);
                this.method27755(-1, array, true);
                this.method27743(1, array);
            }
            else {
                for (int i = 0; i < this.field34200; ++i) {
                    this.field34204.method25933(array[i]);
                }
                this.method27746(-1, array, true);
                this.method27743(1, array);
            }
            this.method27758(array);
        }
    }
    
    public void method27729(final float[] array, final boolean b) {
        if (this.field34206) {
            if (Class8216.method27224() > 1 && this.field34207) {
                this.method27741(-1, array);
                this.method27753(1, array, b);
                this.method27747(1, -1, array, b);
            }
            else {
                this.method27741(-1, array);
                this.method27744(1, array, b);
                for (int i = 0; i < this.field34200; ++i) {
                    this.field34204.method25943(array, i * this.field34201, b);
                }
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be power of two numbers");
    }
    
    public void method27730(final Class22 class22, final boolean b) {
        if (this.field34206) {
            if (Class8216.method27224() > 1 && this.field34207) {
                this.method27742(-1, class22);
                this.method27754(1, class22, b);
                this.method27748(1L, -1, class22, b);
            }
            else {
                this.method27742(-1, class22);
                this.method27745(1, class22, b);
                for (long n = 0L; n < this.field34202; ++n) {
                    this.field34204.method25944(class22, n * this.field34203, b);
                }
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be power of two numbers");
    }
    
    public void method27731(final float[][] array, final boolean b) {
        if (this.field34206) {
            if (Class8216.method27224() > 1 && this.field34207) {
                this.method27743(-1, array);
                this.method27755(1, array, b);
                this.method27751(1, -1, array, b);
            }
            else {
                this.method27743(-1, array);
                this.method27746(1, array, b);
                for (int i = 0; i < this.field34200; ++i) {
                    this.field34204.method25941(array[i], b);
                }
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be power of two numbers");
    }
    
    public void method27732(final float[] array, final boolean b) {
        if (!this.field34206) {
            this.method27739(array, b);
        }
        else {
            if (Class8216.method27224() > 1 && this.field34207) {
                this.method27749(1, -1, array, b);
                this.method27753(1, array, b);
                this.method27741(1, array);
            }
            else {
                for (int i = 0; i < this.field34200; ++i) {
                    this.field34204.method25949(array, i * this.field34201, b);
                }
                this.method27744(1, array, b);
                this.method27741(1, array);
            }
            this.method27756(array);
        }
    }
    
    public void method27733(final Class22 class22, final boolean b) {
        if (!this.field34206) {
            this.method27740(class22, b);
        }
        else {
            if (Class8216.method27224() > 1 && this.field34207) {
                this.method27750(1L, -1, class22, b);
                this.method27754(1, class22, b);
                this.method27742(1, class22);
            }
            else {
                for (long n = 0L; n < this.field34202; ++n) {
                    this.field34204.method25950(class22, n * this.field34203, b);
                }
                this.method27745(1, class22, b);
                this.method27742(1, class22);
            }
            this.method27757(class22);
        }
    }
    
    public void method27734(final float[][] array, final boolean b) {
        if (!this.field34206) {
            this.method27738(array, b);
        }
        else {
            if (Class8216.method27224() > 1 && this.field34207) {
                this.method27752(1, -1, array, b);
                this.method27755(1, array, b);
                this.method27743(1, array);
            }
            else {
                for (int i = 0; i < this.field34200; ++i) {
                    this.field34204.method25949(array[i], 0, b);
                }
                this.method27746(1, array, b);
                this.method27743(1, array);
            }
            this.method27758(array);
        }
    }
    
    private void method27735(final float[][] array) {
        final int n = this.field34201 / 2 + 1;
        final float[][] array2 = new float[n][2 * this.field34200];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field34207 && this.field34200 >= method27224 && n - 2 >= method27224) {
            final Future[] array3 = new Future[method27224];
            final int n2 = this.field34200 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n3 = i * n2;
                array3[i] = Class8216.method27227(new Class1510(this, n3, (i == method27224 - 1) ? this.field34200 : (n3 + n2), array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < this.field34200; ++j) {
                array2[0][j] = array[j][0];
            }
            this.field34205.method25937(array2[0]);
            final int n4 = (n - 2) / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = 1 + k * n4;
                array3[k] = Class8216.method27227(new Class1027(this, n5, (k == method27224 - 1) ? (n - 1) : (n5 + n4), array2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            if (this.field34201 % 2 == 0) {
                for (int l = 0; l < this.field34200; ++l) {
                    array2[n - 1][l] = array[l][1];
                }
                this.field34205.method25937(array2[n - 1]);
            }
            else {
                for (int n6 = 0; n6 < this.field34200; ++n6) {
                    final int n7 = 2 * n6;
                    final int n8 = n - 1;
                    array2[n8][n7] = array[n6][2 * n8];
                    array2[n8][n7 + 1] = array[n6][1];
                }
                this.field34205.method25925(array2[n - 1]);
            }
            final int n9 = this.field34200 / method27224;
            for (int n10 = 0; n10 < method27224; ++n10) {
                final int n11 = n10 * n9;
                array3[n10] = Class8216.method27227(new Class969(this, n11, (n10 == method27224 - 1) ? this.field34200 : (n11 + n9), n, array, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            for (int n12 = 0; n12 < method27224; ++n12) {
                final int n13 = 1 + n12 * n9;
                array3[n12] = Class8216.method27227(new Class1382(this, n13, (n12 == method27224 - 1) ? this.field34200 : (n13 + n9), n, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (int n14 = 0; n14 < this.field34200; ++n14) {
                this.field34204.method25933(array[n14]);
            }
            for (int n15 = 0; n15 < this.field34200; ++n15) {
                array2[0][n15] = array[n15][0];
            }
            this.field34205.method25937(array2[0]);
            for (int n16 = 1; n16 < n - 1; ++n16) {
                final int n17 = 2 * n16;
                for (int n18 = 0; n18 < this.field34200; ++n18) {
                    final int n19 = 2 * n18;
                    array2[n16][n19] = array[n18][n17];
                    array2[n16][n19 + 1] = array[n18][n17 + 1];
                }
                this.field34205.method25925(array2[n16]);
            }
            if (this.field34201 % 2 == 0) {
                for (int n20 = 0; n20 < this.field34200; ++n20) {
                    array2[n - 1][n20] = array[n20][1];
                }
                this.field34205.method25937(array2[n - 1]);
            }
            else {
                for (int n21 = 0; n21 < this.field34200; ++n21) {
                    final int n22 = 2 * n21;
                    final int n23 = n - 1;
                    array2[n23][n22] = array[n21][2 * n23];
                    array2[n23][n22 + 1] = array[n21][1];
                }
                this.field34205.method25925(array2[n - 1]);
            }
            for (int n24 = 0; n24 < this.field34200; ++n24) {
                final int n25 = 2 * n24;
                for (int n26 = 0; n26 < n; ++n26) {
                    final int n27 = 2 * n26;
                    array[n24][n27] = array2[n26][n25];
                    array[n24][n27 + 1] = array2[n26][n25 + 1];
                }
            }
            for (int n28 = 1; n28 < this.field34200; ++n28) {
                final int n29 = this.field34200 - n28;
                for (int n30 = n; n30 < this.field34201; ++n30) {
                    final int n31 = 2 * n30;
                    final int n32 = 2 * (this.field34201 - n30);
                    array[0][n31] = array[0][n32];
                    array[0][n31 + 1] = -array[0][n32 + 1];
                    array[n28][n31] = array[n29][n32];
                    array[n28][n31 + 1] = -array[n29][n32 + 1];
                }
            }
        }
    }
    
    private void method27736(final float[] array) {
        final int n = 2 * this.field34201;
        final int n2 = this.field34201 / 2 + 1;
        final float[][] array2 = new float[n2][2 * this.field34200];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field34207 && this.field34200 >= method27224 && n2 - 2 >= method27224) {
            final Future[] array3 = new Future[method27224];
            final int n3 = this.field34200 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n4 = i * n3;
                array3[i] = Class8216.method27227(new Class1402(this, n4, (i == method27224 - 1) ? this.field34200 : (n4 + n3), array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < this.field34200; ++j) {
                array2[0][j] = array[j * this.field34201];
            }
            this.field34205.method25937(array2[0]);
            final int n5 = (n2 - 2) / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n6 = 1 + k * n5;
                array3[k] = Class8216.method27227(new Class1016(this, n6, (k == method27224 - 1) ? (n2 - 1) : (n6 + n5), array2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            if (this.field34201 % 2 == 0) {
                for (int l = 0; l < this.field34200; ++l) {
                    array2[n2 - 1][l] = array[l * this.field34201 + 1];
                }
                this.field34205.method25937(array2[n2 - 1]);
            }
            else {
                for (int n7 = 0; n7 < this.field34200; ++n7) {
                    final int n8 = 2 * n7;
                    final int n9 = n7 * this.field34201;
                    final int n10 = n2 - 1;
                    array2[n10][n8] = array[n9 + 2 * n10];
                    array2[n10][n8 + 1] = array[n9 + 1];
                }
                this.field34205.method25925(array2[n2 - 1]);
            }
            final int n11 = this.field34200 / method27224;
            for (int n12 = 0; n12 < method27224; ++n12) {
                final int n13 = n12 * n11;
                array3[n12] = Class8216.method27227(new Class975(this, n13, (n12 == method27224 - 1) ? this.field34200 : (n13 + n11), n2, n, array, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            for (int n14 = 0; n14 < method27224; ++n14) {
                final int n15 = 1 + n14 * n11;
                array3[n14] = Class8216.method27227(new Class1294(this, n15, (n14 == method27224 - 1) ? this.field34200 : (n15 + n11), n, n2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (int n16 = 0; n16 < this.field34200; ++n16) {
                this.field34204.method25935(array, n16 * this.field34201);
            }
            for (int n17 = 0; n17 < this.field34200; ++n17) {
                array2[0][n17] = array[n17 * this.field34201];
            }
            this.field34205.method25937(array2[0]);
            for (int n18 = 1; n18 < n2 - 1; ++n18) {
                final int n19 = 2 * n18;
                for (int n20 = 0; n20 < this.field34200; ++n20) {
                    final int n21 = 2 * n20;
                    final int n22 = n20 * this.field34201 + n19;
                    array2[n18][n21] = array[n22];
                    array2[n18][n21 + 1] = array[n22 + 1];
                }
                this.field34205.method25925(array2[n18]);
            }
            if (this.field34201 % 2 == 0) {
                for (int n23 = 0; n23 < this.field34200; ++n23) {
                    array2[n2 - 1][n23] = array[n23 * this.field34201 + 1];
                }
                this.field34205.method25937(array2[n2 - 1]);
            }
            else {
                for (int n24 = 0; n24 < this.field34200; ++n24) {
                    final int n25 = 2 * n24;
                    final int n26 = n24 * this.field34201;
                    final int n27 = n2 - 1;
                    array2[n27][n25] = array[n26 + 2 * n27];
                    array2[n27][n25 + 1] = array[n26 + 1];
                }
                this.field34205.method25925(array2[n2 - 1]);
            }
            for (int n28 = 0; n28 < this.field34200; ++n28) {
                final int n29 = 2 * n28;
                for (int n30 = 0; n30 < n2; ++n30) {
                    final int n31 = n28 * n + 2 * n30;
                    array[n31] = array2[n30][n29];
                    array[n31 + 1] = array2[n30][n29 + 1];
                }
            }
            for (int n32 = 1; n32 < this.field34200; ++n32) {
                final int n33 = n32 * n;
                final int n34 = (this.field34200 - n32 + 1) * n;
                for (int n35 = n2; n35 < this.field34201; ++n35) {
                    final int n36 = 2 * n35;
                    final int n37 = 2 * (this.field34201 - n35);
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
    
    private void method27737(final Class22 class22) {
        final long n = 2L * this.field34203;
        final long n2 = this.field34203 / 2L + 1L;
        final Class22 class23 = new Class22(n2 * 2L * this.field34202);
        final long n3 = 2L * this.field34202;
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field34207 && this.field34202 >= method27224 && n2 - 2L >= method27224) {
            final Future[] array = new Future[method27224];
            final long n4 = this.field34202 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n5 = i * n4;
                array[i] = Class8216.method27227(new Class1178(this, n5, (i == method27224 - 1) ? this.field34202 : (n5 + n4), class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (long n6 = 0L; n6 < this.field34202; ++n6) {
                class23.method171(n6, class22.method135(n6 * this.field34203));
            }
            this.field34205.method25938(class23);
            final long n7 = (n2 - 2L) / method27224;
            for (int j = 0; j < method27224; ++j) {
                final long n8 = 1L + j * n7;
                array[j] = Class8216.method27227(new Class982(this, n8, (j == method27224 - 1) ? (n2 - 1L) : (n8 + n7), class23, n3, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            if (this.field34203 % 2L == 0L) {
                for (long n9 = 0L; n9 < this.field34202; ++n9) {
                    class23.method171((n2 - 1L) * n3 + n9, class22.method135(n9 * this.field34203 + 1L));
                }
                this.field34205.method25940(class23, (n2 - 1L) * n3);
            }
            else {
                for (long n10 = 0L; n10 < this.field34202; ++n10) {
                    final long n11 = 2L * n10;
                    final long n12 = n10 * this.field34203;
                    final long n13 = n2 - 1L;
                    class23.method171(n13 * n3 + n11, class22.method135(n12 + 2L * n13));
                    class23.method171(n13 * n3 + n11 + 1L, class22.method135(n12 + 1L));
                }
                this.field34205.method25928(class23, (n2 - 1L) * n3);
            }
            final long n14 = this.field34202 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final long n15 = k * n14;
                array[k] = Class8216.method27227(new Class1433(this, n15, (k == method27224 - 1) ? this.field34202 : (n15 + n14), n2, n, class22, class23, n3));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            for (int l = 0; l < method27224; ++l) {
                final long n16 = 1L + l * n14;
                array[l] = Class8216.method27227(new Class1300(this, n16, (l == method27224 - 1) ? this.field34202 : (n16 + n14), n, n2, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (long n17 = 0L; n17 < this.field34202; ++n17) {
                this.field34204.method25936(class22, n17 * this.field34203);
            }
            for (long n18 = 0L; n18 < this.field34202; ++n18) {
                class23.method171(n18, class22.method135(n18 * this.field34203));
            }
            this.field34205.method25938(class23);
            for (long n19 = 1L; n19 < n2 - 1L; ++n19) {
                final long n20 = 2L * n19;
                for (long n21 = 0L; n21 < this.field34202; ++n21) {
                    final long n22 = 2L * n21;
                    final long n23 = n21 * this.field34203 + n20;
                    class23.method171(n19 * n3 + n22, class22.method135(n23));
                    class23.method171(n19 * n3 + n22 + 1L, class22.method135(n23 + 1L));
                }
                this.field34205.method25928(class23, n19 * n3);
            }
            if (this.field34203 % 2L == 0L) {
                for (long n24 = 0L; n24 < this.field34202; ++n24) {
                    class23.method171((n2 - 1L) * n3 + n24, class22.method135(n24 * this.field34203 + 1L));
                }
                this.field34205.method25940(class23, (n2 - 1L) * n3);
            }
            else {
                for (long n25 = 0L; n25 < this.field34202; ++n25) {
                    final long n26 = 2L * n25;
                    final long n27 = n25 * this.field34203;
                    final long n28 = n2 - 1L;
                    class23.method171(n28 * n3 + n26, class22.method135(n27 + 2L * n28));
                    class23.method171(n28 * n3 + n26 + 1L, class22.method135(n27 + 1L));
                }
                this.field34205.method25928(class23, (n2 - 1L) * n3);
            }
            for (long n29 = 0L; n29 < this.field34202; ++n29) {
                final long n30 = 2L * n29;
                for (long n31 = 0L; n31 < n2; ++n31) {
                    final long n32 = n29 * n + 2L * n31;
                    class22.method171(n32, class23.method135(n31 * n3 + n30));
                    class22.method171(n32 + 1L, class23.method135(n31 * n3 + n30 + 1L));
                }
            }
            for (long n33 = 1L; n33 < this.field34202; ++n33) {
                final long n34 = n33 * n;
                final long n35 = (this.field34202 - n33 + 1L) * n;
                for (long n36 = n2; n36 < this.field34203; ++n36) {
                    final long n37 = 2L * n36;
                    final long n38 = 2L * (this.field34203 - n36);
                    class22.method171(n37, class22.method135(n38));
                    class22.method171(n37 + 1L, -class22.method135(n38 + 1L));
                    final long n39 = n34 + n37;
                    final long n40 = n35 - n37;
                    class22.method171(n39, class22.method135(n40));
                    class22.method171(n39 + 1L, -class22.method135(n40 + 1L));
                }
            }
        }
    }
    
    private void method27738(final float[][] array, final boolean b) {
        final int n = this.field34201 / 2 + 1;
        final float[][] array2 = new float[n][2 * this.field34200];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field34207 && this.field34200 >= method27224 && n - 2 >= method27224) {
            final Future[] array3 = new Future[method27224];
            final int n2 = this.field34200 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n3 = i * n2;
                array3[i] = Class8216.method27227(new Class999(this, n3, (i == method27224 - 1) ? this.field34200 : (n3 + n2), array, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < this.field34200; ++j) {
                array2[0][j] = array[j][0];
            }
            this.field34205.method25945(array2[0], b);
            final int n4 = (n - 2) / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = 1 + k * n4;
                array3[k] = Class8216.method27227(new Class1245(this, n5, (k == method27224 - 1) ? (n - 1) : (n5 + n4), array2, array, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            if (this.field34201 % 2 == 0) {
                for (int l = 0; l < this.field34200; ++l) {
                    array2[n - 1][l] = array[l][1];
                }
                this.field34205.method25945(array2[n - 1], b);
            }
            else {
                for (int n6 = 0; n6 < this.field34200; ++n6) {
                    final int n7 = 2 * n6;
                    final int n8 = n - 1;
                    array2[n8][n7] = array[n6][2 * n8];
                    array2[n8][n7 + 1] = array[n6][1];
                }
                this.field34205.method25929(array2[n - 1], b);
            }
            final int n9 = this.field34200 / method27224;
            for (int n10 = 0; n10 < method27224; ++n10) {
                final int n11 = n10 * n9;
                array3[n10] = Class8216.method27227(new Class945(this, n11, (n10 == method27224 - 1) ? this.field34200 : (n11 + n9), n, array, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            for (int n12 = 0; n12 < method27224; ++n12) {
                final int n13 = 1 + n12 * n9;
                array3[n12] = Class8216.method27227(new Class1525(this, n13, (n12 == method27224 - 1) ? this.field34200 : (n13 + n9), n, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (int n14 = 0; n14 < this.field34200; ++n14) {
                this.field34204.method25949(array[n14], 0, b);
            }
            for (int n15 = 0; n15 < this.field34200; ++n15) {
                array2[0][n15] = array[n15][0];
            }
            this.field34205.method25945(array2[0], b);
            for (int n16 = 1; n16 < n - 1; ++n16) {
                final int n17 = 2 * n16;
                for (int n18 = 0; n18 < this.field34200; ++n18) {
                    final int n19 = 2 * n18;
                    array2[n16][n19] = array[n18][n17];
                    array2[n16][n19 + 1] = array[n18][n17 + 1];
                }
                this.field34205.method25929(array2[n16], b);
            }
            if (this.field34201 % 2 == 0) {
                for (int n20 = 0; n20 < this.field34200; ++n20) {
                    array2[n - 1][n20] = array[n20][1];
                }
                this.field34205.method25945(array2[n - 1], b);
            }
            else {
                for (int n21 = 0; n21 < this.field34200; ++n21) {
                    final int n22 = 2 * n21;
                    final int n23 = n - 1;
                    array2[n23][n22] = array[n21][2 * n23];
                    array2[n23][n22 + 1] = array[n21][1];
                }
                this.field34205.method25929(array2[n - 1], b);
            }
            for (int n24 = 0; n24 < this.field34200; ++n24) {
                final int n25 = 2 * n24;
                for (int n26 = 0; n26 < n; ++n26) {
                    final int n27 = 2 * n26;
                    array[n24][n27] = array2[n26][n25];
                    array[n24][n27 + 1] = array2[n26][n25 + 1];
                }
            }
            for (int n28 = 1; n28 < this.field34200; ++n28) {
                final int n29 = this.field34200 - n28;
                for (int n30 = n; n30 < this.field34201; ++n30) {
                    final int n31 = 2 * n30;
                    final int n32 = 2 * (this.field34201 - n30);
                    array[0][n31] = array[0][n32];
                    array[0][n31 + 1] = -array[0][n32 + 1];
                    array[n28][n31] = array[n29][n32];
                    array[n28][n31 + 1] = -array[n29][n32 + 1];
                }
            }
        }
    }
    
    private void method27739(final float[] array, final boolean b) {
        final int n = 2 * this.field34201;
        final int n2 = this.field34201 / 2 + 1;
        final float[][] array2 = new float[n2][2 * this.field34200];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field34207 && this.field34200 >= method27224 && n2 - 2 >= method27224) {
            final Future[] array3 = new Future[method27224];
            final int n3 = this.field34200 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n4 = i * n3;
                array3[i] = Class8216.method27227(new Class1108(this, n4, (i == method27224 - 1) ? this.field34200 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < this.field34200; ++j) {
                array2[0][j] = array[j * this.field34201];
            }
            this.field34205.method25945(array2[0], b);
            final int n5 = (n2 - 2) / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n6 = 1 + k * n5;
                array3[k] = Class8216.method27227(new Class1601(this, n6, (k == method27224 - 1) ? (n2 - 1) : (n6 + n5), array2, array, b));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            if (this.field34201 % 2 == 0) {
                for (int l = 0; l < this.field34200; ++l) {
                    array2[n2 - 1][l] = array[l * this.field34201 + 1];
                }
                this.field34205.method25945(array2[n2 - 1], b);
            }
            else {
                for (int n7 = 0; n7 < this.field34200; ++n7) {
                    final int n8 = 2 * n7;
                    final int n9 = n7 * this.field34201;
                    final int n10 = n2 - 1;
                    array2[n10][n8] = array[n9 + 2 * n10];
                    array2[n10][n8 + 1] = array[n9 + 1];
                }
                this.field34205.method25929(array2[n2 - 1], b);
            }
            final int n11 = this.field34200 / method27224;
            for (int n12 = 0; n12 < method27224; ++n12) {
                final int n13 = n12 * n11;
                array3[n12] = Class8216.method27227(new Class937(this, n13, (n12 == method27224 - 1) ? this.field34200 : (n13 + n11), n2, n, array, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            for (int n14 = 0; n14 < method27224; ++n14) {
                final int n15 = 1 + n14 * n11;
                array3[n14] = Class8216.method27227(new Class1387(this, n15, (n14 == method27224 - 1) ? this.field34200 : (n15 + n11), n, n2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (int n16 = 0; n16 < this.field34200; ++n16) {
                this.field34204.method25949(array, n16 * this.field34201, b);
            }
            for (int n17 = 0; n17 < this.field34200; ++n17) {
                array2[0][n17] = array[n17 * this.field34201];
            }
            this.field34205.method25945(array2[0], b);
            for (int n18 = 1; n18 < n2 - 1; ++n18) {
                final int n19 = 2 * n18;
                for (int n20 = 0; n20 < this.field34200; ++n20) {
                    final int n21 = 2 * n20;
                    final int n22 = n20 * this.field34201 + n19;
                    array2[n18][n21] = array[n22];
                    array2[n18][n21 + 1] = array[n22 + 1];
                }
                this.field34205.method25929(array2[n18], b);
            }
            if (this.field34201 % 2 == 0) {
                for (int n23 = 0; n23 < this.field34200; ++n23) {
                    array2[n2 - 1][n23] = array[n23 * this.field34201 + 1];
                }
                this.field34205.method25945(array2[n2 - 1], b);
            }
            else {
                for (int n24 = 0; n24 < this.field34200; ++n24) {
                    final int n25 = 2 * n24;
                    final int n26 = n24 * this.field34201;
                    final int n27 = n2 - 1;
                    array2[n27][n25] = array[n26 + 2 * n27];
                    array2[n27][n25 + 1] = array[n26 + 1];
                }
                this.field34205.method25929(array2[n2 - 1], b);
            }
            for (int n28 = 0; n28 < this.field34200; ++n28) {
                final int n29 = 2 * n28;
                for (int n30 = 0; n30 < n2; ++n30) {
                    final int n31 = n28 * n + 2 * n30;
                    array[n31] = array2[n30][n29];
                    array[n31 + 1] = array2[n30][n29 + 1];
                }
            }
            for (int n32 = 1; n32 < this.field34200; ++n32) {
                final int n33 = n32 * n;
                final int n34 = (this.field34200 - n32 + 1) * n;
                for (int n35 = n2; n35 < this.field34201; ++n35) {
                    final int n36 = 2 * n35;
                    final int n37 = 2 * (this.field34201 - n35);
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
    
    private void method27740(final Class22 class22, final boolean b) {
        final long n = 2L * this.field34203;
        final long n2 = this.field34203 / 2L + 1L;
        final Class22 class23 = new Class22(n2 * 2L * this.field34202);
        final long n3 = 2L * this.field34202;
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field34207 && this.field34202 >= method27224 && n2 - 2L >= method27224) {
            final Future[] array = new Future[method27224];
            final long n4 = this.field34202 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n5 = i * n4;
                array[i] = Class8216.method27227(new Class1549(this, n5, (i == method27224 - 1) ? this.field34202 : (n5 + n4), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (long n6 = 0L; n6 < this.field34202; ++n6) {
                class23.method171(n6, class22.method135(n6 * this.field34203));
            }
            this.field34205.method25946(class23, b);
            final long n7 = (n2 - 2L) / method27224;
            for (int j = 0; j < method27224; ++j) {
                final long n8 = 1L + j * n7;
                array[j] = Class8216.method27227(new Class1591(this, n8, (j == method27224 - 1) ? (n2 - 1L) : (n8 + n7), class23, n3, class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            if (this.field34203 % 2L == 0L) {
                for (long n9 = 0L; n9 < this.field34202; ++n9) {
                    class23.method171((n2 - 1L) * n3 + n9, class22.method135(n9 * this.field34203 + 1L));
                }
                this.field34205.method25948(class23, (n2 - 1L) * n3, b);
            }
            else {
                for (long n10 = 0L; n10 < this.field34202; ++n10) {
                    final long n11 = 2L * n10;
                    final long n12 = n10 * this.field34203;
                    final long n13 = n2 - 1L;
                    class23.method171(n13 * n3 + n11, class22.method135(n12 + 2L * n13));
                    class23.method171(n13 * n3 + n11 + 1L, class22.method135(n12 + 1L));
                }
                this.field34205.method25932(class23, (n2 - 1L) * n3, b);
            }
            final long n14 = this.field34202 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final long n15 = k * n14;
                array[k] = Class8216.method27227(new Class1597(this, n15, (k == method27224 - 1) ? this.field34202 : (n15 + n14), n2, n, class22, class23, n3));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown6);
            }
            for (int l = 0; l < method27224; ++l) {
                final long n16 = 1L + l * n14;
                array[l] = Class8216.method27227(new Class1455(this, n16, (l == method27224 - 1) ? this.field34202 : (n16 + n14), n, n2, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown7) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown7);
            }
            catch (final ExecutionException thrown8) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown8);
            }
        }
        else {
            for (long n17 = 0L; n17 < this.field34202; ++n17) {
                this.field34204.method25950(class22, n17 * this.field34203, b);
            }
            for (long n18 = 0L; n18 < this.field34202; ++n18) {
                class23.method171(n18, class22.method135(n18 * this.field34203));
            }
            this.field34205.method25946(class23, b);
            for (long n19 = 1L; n19 < n2 - 1L; ++n19) {
                final long n20 = 2L * n19;
                for (long n21 = 0L; n21 < this.field34202; ++n21) {
                    final long n22 = 2L * n21;
                    final long n23 = n21 * this.field34203 + n20;
                    class23.method171(n19 * n3 + n22, class22.method135(n23));
                    class23.method171(n19 * n3 + n22 + 1L, class22.method135(n23 + 1L));
                }
                this.field34205.method25932(class23, n19 * n3, b);
            }
            if (this.field34203 % 2L == 0L) {
                for (long n24 = 0L; n24 < this.field34202; ++n24) {
                    class23.method171((n2 - 1L) * n3 + n24, class22.method135(n24 * this.field34203 + 1L));
                }
                this.field34205.method25948(class23, (n2 - 1L) * n3, b);
            }
            else {
                for (long n25 = 0L; n25 < this.field34202; ++n25) {
                    final long n26 = 2L * n25;
                    final long n27 = n25 * this.field34203;
                    final long n28 = n2 - 1L;
                    class23.method171(n28 * n3 + n26, class22.method135(n27 + 2L * n28));
                    class23.method171(n28 * n3 + n26 + 1L, class22.method135(n27 + 1L));
                }
                this.field34205.method25932(class23, (n2 - 1L) * n3, b);
            }
            for (long n29 = 0L; n29 < this.field34202; ++n29) {
                final long n30 = 2L * n29;
                for (long n31 = 0L; n31 < n2; ++n31) {
                    final long n32 = n29 * n + 2L * n31;
                    class22.method171(n32, class23.method135(n31 * n3 + n30));
                    class22.method171(n32 + 1L, class23.method135(n31 * n3 + n30 + 1L));
                }
            }
            for (long n33 = 1L; n33 < this.field34202; ++n33) {
                final long n34 = n33 * n;
                final long n35 = (this.field34202 - n33 + 1L) * n;
                for (long n36 = n2; n36 < this.field34203; ++n36) {
                    final long n37 = 2L * n36;
                    final long n38 = 2L * (this.field34203 - n36);
                    class22.method171(n37, class22.method135(n38));
                    class22.method171(n37 + 1L, -class22.method135(n38 + 1L));
                    final long n39 = n34 + n37;
                    final long n40 = n35 - n37;
                    class22.method171(n39, class22.method135(n40));
                    class22.method171(n39 + 1L, -class22.method135(n40 + 1L));
                }
            }
        }
    }
    
    private void method27741(final int n, final float[] array) {
        final int n2 = this.field34200 >> 1;
        if (n >= 0) {
            for (int i = 1; i < n2; ++i) {
                final int n3 = this.field34200 - i;
                final int n4 = i * this.field34201;
                final int n5 = n3 * this.field34201;
                array[n5] = 0.5f * (array[n4] - array[n5]);
                final int n6 = n4;
                array[n6] -= array[n5];
                array[n5 + 1] = 0.5f * (array[n4 + 1] + array[n5 + 1]);
                final int n7 = n4 + 1;
                array[n7] -= array[n5 + 1];
            }
        }
        else {
            for (int j = 1; j < n2; ++j) {
                final int n8 = this.field34200 - j;
                final int n9 = j * this.field34201;
                final int n10 = n8 * this.field34201;
                final float n11 = array[n9] - array[n10];
                final int n12 = n9;
                array[n12] += array[n10];
                array[n10] = n11;
                final float n13 = array[n10 + 1] - array[n9 + 1];
                final int n14 = n9 + 1;
                array[n14] += array[n10 + 1];
                array[n10 + 1] = n13;
            }
        }
    }
    
    private void method27742(final int n, final Class22 class22) {
        final long n2 = this.field34202 >> 1;
        if (n >= 0) {
            for (long n3 = 1L; n3 < n2; ++n3) {
                final long n4 = this.field34202 - n3;
                final long n5 = n3 * this.field34203;
                final long n6 = n4 * this.field34203;
                class22.method171(n6, 0.5f * (class22.method135(n5) - class22.method135(n6)));
                class22.method171(n5, class22.method135(n5) - class22.method135(n6));
                class22.method171(n6 + 1L, 0.5f * (class22.method135(n5 + 1L) + class22.method135(n6 + 1L)));
                class22.method171(n5 + 1L, class22.method135(n5 + 1L) - class22.method135(n6 + 1L));
            }
        }
        else {
            for (long n7 = 1L; n7 < n2; ++n7) {
                final long n8 = this.field34202 - n7;
                final long n9 = n7 * this.field34203;
                final long n10 = n8 * this.field34203;
                final float n11 = class22.method135(n9) - class22.method135(n10);
                class22.method171(n9, class22.method135(n9) + class22.method135(n10));
                class22.method171(n10, n11);
                final float n12 = class22.method135(n10 + 1L) - class22.method135(n9 + 1L);
                class22.method171(n9 + 1L, class22.method135(n9 + 1L) + class22.method135(n10 + 1L));
                class22.method171(n10 + 1L, n12);
            }
        }
    }
    
    private void method27743(final int n, final float[][] array) {
        final int n2 = this.field34200 >> 1;
        if (n >= 0) {
            for (int i = 1; i < n2; ++i) {
                final int n3 = this.field34200 - i;
                array[n3][0] = 0.5f * (array[i][0] - array[n3][0]);
                final float[] array2 = array[i];
                final int n4 = 0;
                array2[n4] -= array[n3][0];
                array[n3][1] = 0.5f * (array[i][1] + array[n3][1]);
                final float[] array3 = array[i];
                final int n5 = 1;
                array3[n5] -= array[n3][1];
            }
        }
        else {
            for (int j = 1; j < n2; ++j) {
                final int n6 = this.field34200 - j;
                final float n7 = array[j][0] - array[n6][0];
                final float[] array4 = array[j];
                final int n8 = 0;
                array4[n8] += array[n6][0];
                array[n6][0] = n7;
                final float n9 = array[n6][1] - array[j][1];
                final float[] array5 = array[j];
                final int n10 = 1;
                array5[n10] += array[n6][1];
                array[n6][1] = n9;
            }
        }
    }
    
    private void method27744(final int n, final float[] array, final boolean b) {
        int n2 = 8 * this.field34200;
        if (this.field34201 != 4) {
            if (this.field34201 < 4) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            if (this.field34201 <= 4) {
                if (this.field34201 != 4) {
                    if (this.field34201 == 2) {
                        for (int i = 0; i < this.field34200; ++i) {
                            final int n3 = i * this.field34201;
                            final int n4 = 2 * i;
                            array2[n4] = array[n3];
                            array2[n4 + 1] = array[n3 + 1];
                        }
                        this.field34205.method25931(array2, 0, b);
                        for (int j = 0; j < this.field34200; ++j) {
                            final int n5 = j * this.field34201;
                            final int n6 = 2 * j;
                            array[n5] = array2[n6];
                            array[n5 + 1] = array2[n6 + 1];
                        }
                    }
                }
                else {
                    for (int k = 0; k < this.field34200; ++k) {
                        final int n7 = k * this.field34201;
                        final int n8 = 2 * k;
                        final int n9 = 2 * this.field34200 + 2 * k;
                        array2[n8] = array[n7];
                        array2[n8 + 1] = array[n7 + 1];
                        array2[n9] = array[n7 + 2];
                        array2[n9 + 1] = array[n7 + 3];
                    }
                    this.field34205.method25931(array2, 0, b);
                    this.field34205.method25931(array2, 2 * this.field34200, b);
                    for (int l = 0; l < this.field34200; ++l) {
                        final int n10 = l * this.field34201;
                        final int n11 = 2 * l;
                        final int n12 = 2 * this.field34200 + 2 * l;
                        array[n10] = array2[n11];
                        array[n10 + 1] = array2[n11 + 1];
                        array[n10 + 2] = array2[n12];
                        array[n10 + 3] = array2[n12 + 1];
                    }
                }
            }
            else {
                for (int n13 = 0; n13 < this.field34201; n13 += 8) {
                    for (int n14 = 0; n14 < this.field34200; ++n14) {
                        final int n15 = n14 * this.field34201 + n13;
                        final int n16 = 2 * n14;
                        final int n17 = 2 * this.field34200 + 2 * n14;
                        final int n18 = n17 + 2 * this.field34200;
                        final int n19 = n18 + 2 * this.field34200;
                        array2[n16] = array[n15];
                        array2[n16 + 1] = array[n15 + 1];
                        array2[n17] = array[n15 + 2];
                        array2[n17 + 1] = array[n15 + 3];
                        array2[n18] = array[n15 + 4];
                        array2[n18 + 1] = array[n15 + 5];
                        array2[n19] = array[n15 + 6];
                        array2[n19 + 1] = array[n15 + 7];
                    }
                    this.field34205.method25931(array2, 0, b);
                    this.field34205.method25931(array2, 2 * this.field34200, b);
                    this.field34205.method25931(array2, 4 * this.field34200, b);
                    this.field34205.method25931(array2, 6 * this.field34200, b);
                    for (int n20 = 0; n20 < this.field34200; ++n20) {
                        final int n21 = n20 * this.field34201 + n13;
                        final int n22 = 2 * n20;
                        final int n23 = 2 * this.field34200 + 2 * n20;
                        final int n24 = n23 + 2 * this.field34200;
                        final int n25 = n24 + 2 * this.field34200;
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
        else if (this.field34201 <= 4) {
            if (this.field34201 != 4) {
                if (this.field34201 == 2) {
                    for (int n26 = 0; n26 < this.field34200; ++n26) {
                        final int n27 = n26 * this.field34201;
                        final int n28 = 2 * n26;
                        array2[n28] = array[n27];
                        array2[n28 + 1] = array[n27 + 1];
                    }
                    this.field34205.method25927(array2, 0);
                    for (int n29 = 0; n29 < this.field34200; ++n29) {
                        final int n30 = n29 * this.field34201;
                        final int n31 = 2 * n29;
                        array[n30] = array2[n31];
                        array[n30 + 1] = array2[n31 + 1];
                    }
                }
            }
            else {
                for (int n32 = 0; n32 < this.field34200; ++n32) {
                    final int n33 = n32 * this.field34201;
                    final int n34 = 2 * n32;
                    final int n35 = 2 * this.field34200 + 2 * n32;
                    array2[n34] = array[n33];
                    array2[n34 + 1] = array[n33 + 1];
                    array2[n35] = array[n33 + 2];
                    array2[n35 + 1] = array[n33 + 3];
                }
                this.field34205.method25927(array2, 0);
                this.field34205.method25927(array2, 2 * this.field34200);
                for (int n36 = 0; n36 < this.field34200; ++n36) {
                    final int n37 = n36 * this.field34201;
                    final int n38 = 2 * n36;
                    final int n39 = 2 * this.field34200 + 2 * n36;
                    array[n37] = array2[n38];
                    array[n37 + 1] = array2[n38 + 1];
                    array[n37 + 2] = array2[n39];
                    array[n37 + 3] = array2[n39 + 1];
                }
            }
        }
        else {
            for (int n40 = 0; n40 < this.field34201; n40 += 8) {
                for (int n41 = 0; n41 < this.field34200; ++n41) {
                    final int n42 = n41 * this.field34201 + n40;
                    final int n43 = 2 * n41;
                    final int n44 = 2 * this.field34200 + 2 * n41;
                    final int n45 = n44 + 2 * this.field34200;
                    final int n46 = n45 + 2 * this.field34200;
                    array2[n43] = array[n42];
                    array2[n43 + 1] = array[n42 + 1];
                    array2[n44] = array[n42 + 2];
                    array2[n44 + 1] = array[n42 + 3];
                    array2[n45] = array[n42 + 4];
                    array2[n45 + 1] = array[n42 + 5];
                    array2[n46] = array[n42 + 6];
                    array2[n46 + 1] = array[n42 + 7];
                }
                this.field34205.method25927(array2, 0);
                this.field34205.method25927(array2, 2 * this.field34200);
                this.field34205.method25927(array2, 4 * this.field34200);
                this.field34205.method25927(array2, 6 * this.field34200);
                for (int n47 = 0; n47 < this.field34200; ++n47) {
                    final int n48 = n47 * this.field34201 + n40;
                    final int n49 = 2 * n47;
                    final int n50 = 2 * this.field34200 + 2 * n47;
                    final int n51 = n50 + 2 * this.field34200;
                    final int n52 = n51 + 2 * this.field34200;
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
    
    private void method27745(final int n, final Class22 class22, final boolean b) {
        long n2 = 8L * this.field34202;
        if (this.field34203 != 4L) {
            if (this.field34203 < 4L) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final Class22 class23 = new Class22(n2);
        if (n != -1) {
            if (this.field34203 <= 4L) {
                if (this.field34203 != 4L) {
                    if (this.field34203 == 2L) {
                        for (long n3 = 0L; n3 < this.field34202; ++n3) {
                            final long n4 = n3 * this.field34203;
                            final long n5 = 2L * n3;
                            class23.method171(n5, class22.method135(n4));
                            class23.method171(n5 + 1L, class22.method135(n4 + 1L));
                        }
                        this.field34205.method25932(class23, 0L, b);
                        for (long n6 = 0L; n6 < this.field34202; ++n6) {
                            final long n7 = n6 * this.field34203;
                            final long n8 = 2L * n6;
                            class22.method171(n7, class23.method135(n8));
                            class22.method171(n7 + 1L, class23.method135(n8 + 1L));
                        }
                    }
                }
                else {
                    for (long n9 = 0L; n9 < this.field34202; ++n9) {
                        final long n10 = n9 * this.field34203;
                        final long n11 = 2L * n9;
                        final long n12 = 2L * this.field34202 + 2L * n9;
                        class23.method171(n11, class22.method135(n10));
                        class23.method171(n11 + 1L, class22.method135(n10 + 1L));
                        class23.method171(n12, class22.method135(n10 + 2L));
                        class23.method171(n12 + 1L, class22.method135(n10 + 3L));
                    }
                    this.field34205.method25932(class23, 0L, b);
                    this.field34205.method25932(class23, 2L * this.field34202, b);
                    for (long n13 = 0L; n13 < this.field34202; ++n13) {
                        final long n14 = n13 * this.field34203;
                        final long n15 = 2L * n13;
                        final long n16 = 2L * this.field34202 + 2L * n13;
                        class22.method171(n14, class23.method135(n15));
                        class22.method171(n14 + 1L, class23.method135(n15 + 1L));
                        class22.method171(n14 + 2L, class23.method135(n16));
                        class22.method171(n14 + 3L, class23.method135(n16 + 1L));
                    }
                }
            }
            else {
                for (long n17 = 0L; n17 < this.field34203; n17 += 8L) {
                    for (long n18 = 0L; n18 < this.field34202; ++n18) {
                        final long n19 = n18 * this.field34203 + n17;
                        final long n20 = 2L * n18;
                        final long n21 = 2L * this.field34202 + 2L * n18;
                        final long n22 = n21 + 2L * this.field34202;
                        final long n23 = n22 + 2L * this.field34202;
                        class23.method171(n20, class22.method135(n19));
                        class23.method171(n20 + 1L, class22.method135(n19 + 1L));
                        class23.method171(n21, class22.method135(n19 + 2L));
                        class23.method171(n21 + 1L, class22.method135(n19 + 3L));
                        class23.method171(n22, class22.method135(n19 + 4L));
                        class23.method171(n22 + 1L, class22.method135(n19 + 5L));
                        class23.method171(n23, class22.method135(n19 + 6L));
                        class23.method171(n23 + 1L, class22.method135(n19 + 7L));
                    }
                    this.field34205.method25932(class23, 0L, b);
                    this.field34205.method25932(class23, 2L * this.field34202, b);
                    this.field34205.method25932(class23, 4L * this.field34202, b);
                    this.field34205.method25932(class23, 6L * this.field34202, b);
                    for (long n24 = 0L; n24 < this.field34202; ++n24) {
                        final long n25 = n24 * this.field34203 + n17;
                        final long n26 = 2L * n24;
                        final long n27 = 2L * this.field34202 + 2L * n24;
                        final long n28 = n27 + 2L * this.field34202;
                        final long n29 = n28 + 2L * this.field34202;
                        class22.method171(n25, class23.method135(n26));
                        class22.method171(n25 + 1L, class23.method135(n26 + 1L));
                        class22.method171(n25 + 2L, class23.method135(n27));
                        class22.method171(n25 + 3L, class23.method135(n27 + 1L));
                        class22.method171(n25 + 4L, class23.method135(n28));
                        class22.method171(n25 + 5L, class23.method135(n28 + 1L));
                        class22.method171(n25 + 6L, class23.method135(n29));
                        class22.method171(n25 + 7L, class23.method135(n29 + 1L));
                    }
                }
            }
        }
        else if (this.field34203 <= 4L) {
            if (this.field34203 != 4L) {
                if (this.field34203 == 2L) {
                    for (long n30 = 0L; n30 < this.field34202; ++n30) {
                        final long n31 = n30 * this.field34203;
                        final long n32 = 2L * n30;
                        class23.method171(n32, class22.method135(n31));
                        class23.method171(n32 + 1L, class22.method135(n31 + 1L));
                    }
                    this.field34205.method25928(class23, 0L);
                    for (long n33 = 0L; n33 < this.field34202; ++n33) {
                        final long n34 = n33 * this.field34203;
                        final long n35 = 2L * n33;
                        class22.method171(n34, class23.method135(n35));
                        class22.method171(n34 + 1L, class23.method135(n35 + 1L));
                    }
                }
            }
            else {
                for (long n36 = 0L; n36 < this.field34202; ++n36) {
                    final long n37 = n36 * this.field34203;
                    final long n38 = 2L * n36;
                    final long n39 = 2L * this.field34202 + 2L * n36;
                    class23.method171(n38, class22.method135(n37));
                    class23.method171(n38 + 1L, class22.method135(n37 + 1L));
                    class23.method171(n39, class22.method135(n37 + 2L));
                    class23.method171(n39 + 1L, class22.method135(n37 + 3L));
                }
                this.field34205.method25928(class23, 0L);
                this.field34205.method25928(class23, 2L * this.field34202);
                for (long n40 = 0L; n40 < this.field34202; ++n40) {
                    final long n41 = n40 * this.field34203;
                    final long n42 = 2L * n40;
                    final long n43 = 2L * this.field34202 + 2L * n40;
                    class22.method171(n41, class23.method135(n42));
                    class22.method171(n41 + 1L, class23.method135(n42 + 1L));
                    class22.method171(n41 + 2L, class23.method135(n43));
                    class22.method171(n41 + 3L, class23.method135(n43 + 1L));
                }
            }
        }
        else {
            for (long n44 = 0L; n44 < this.field34203; n44 += 8L) {
                for (long n45 = 0L; n45 < this.field34202; ++n45) {
                    final long n46 = n45 * this.field34203 + n44;
                    final long n47 = 2L * n45;
                    final long n48 = 2L * this.field34202 + 2L * n45;
                    final long n49 = n48 + 2L * this.field34202;
                    final long n50 = n49 + 2L * this.field34202;
                    class23.method171(n47, class22.method135(n46));
                    class23.method171(n47 + 1L, class22.method135(n46 + 1L));
                    class23.method171(n48, class22.method135(n46 + 2L));
                    class23.method171(n48 + 1L, class22.method135(n46 + 3L));
                    class23.method171(n49, class22.method135(n46 + 4L));
                    class23.method171(n49 + 1L, class22.method135(n46 + 5L));
                    class23.method171(n50, class22.method135(n46 + 6L));
                    class23.method171(n50 + 1L, class22.method135(n46 + 7L));
                }
                this.field34205.method25928(class23, 0L);
                this.field34205.method25928(class23, 2L * this.field34202);
                this.field34205.method25928(class23, 4L * this.field34202);
                this.field34205.method25928(class23, 6L * this.field34202);
                for (long n51 = 0L; n51 < this.field34202; ++n51) {
                    final long n52 = n51 * this.field34203 + n44;
                    final long n53 = 2L * n51;
                    final long n54 = 2L * this.field34202 + 2L * n51;
                    final long n55 = n54 + 2L * this.field34202;
                    final long n56 = n55 + 2L * this.field34202;
                    class22.method171(n52, class23.method135(n53));
                    class22.method171(n52 + 1L, class23.method135(n53 + 1L));
                    class22.method171(n52 + 2L, class23.method135(n54));
                    class22.method171(n52 + 3L, class23.method135(n54 + 1L));
                    class22.method171(n52 + 4L, class23.method135(n55));
                    class22.method171(n52 + 5L, class23.method135(n55 + 1L));
                    class22.method171(n52 + 6L, class23.method135(n56));
                    class22.method171(n52 + 7L, class23.method135(n56 + 1L));
                }
            }
        }
    }
    
    private void method27746(final int n, final float[][] array, final boolean b) {
        int n2 = 8 * this.field34200;
        if (this.field34201 != 4) {
            if (this.field34201 < 4) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            if (this.field34201 <= 4) {
                if (this.field34201 != 4) {
                    if (this.field34201 == 2) {
                        for (int i = 0; i < this.field34200; ++i) {
                            final int n3 = 2 * i;
                            array2[n3] = array[i][0];
                            array2[n3 + 1] = array[i][1];
                        }
                        this.field34205.method25931(array2, 0, b);
                        for (int j = 0; j < this.field34200; ++j) {
                            final int n4 = 2 * j;
                            array[j][0] = array2[n4];
                            array[j][1] = array2[n4 + 1];
                        }
                    }
                }
                else {
                    for (int k = 0; k < this.field34200; ++k) {
                        final int n5 = 2 * k;
                        final int n6 = 2 * this.field34200 + 2 * k;
                        array2[n5] = array[k][0];
                        array2[n5 + 1] = array[k][1];
                        array2[n6] = array[k][2];
                        array2[n6 + 1] = array[k][3];
                    }
                    this.field34205.method25931(array2, 0, b);
                    this.field34205.method25931(array2, 2 * this.field34200, b);
                    for (int l = 0; l < this.field34200; ++l) {
                        final int n7 = 2 * l;
                        final int n8 = 2 * this.field34200 + 2 * l;
                        array[l][0] = array2[n7];
                        array[l][1] = array2[n7 + 1];
                        array[l][2] = array2[n8];
                        array[l][3] = array2[n8 + 1];
                    }
                }
            }
            else {
                for (int n9 = 0; n9 < this.field34201; n9 += 8) {
                    for (int n10 = 0; n10 < this.field34200; ++n10) {
                        final int n11 = 2 * n10;
                        final int n12 = 2 * this.field34200 + 2 * n10;
                        final int n13 = n12 + 2 * this.field34200;
                        final int n14 = n13 + 2 * this.field34200;
                        array2[n11] = array[n10][n9];
                        array2[n11 + 1] = array[n10][n9 + 1];
                        array2[n12] = array[n10][n9 + 2];
                        array2[n12 + 1] = array[n10][n9 + 3];
                        array2[n13] = array[n10][n9 + 4];
                        array2[n13 + 1] = array[n10][n9 + 5];
                        array2[n14] = array[n10][n9 + 6];
                        array2[n14 + 1] = array[n10][n9 + 7];
                    }
                    this.field34205.method25931(array2, 0, b);
                    this.field34205.method25931(array2, 2 * this.field34200, b);
                    this.field34205.method25931(array2, 4 * this.field34200, b);
                    this.field34205.method25931(array2, 6 * this.field34200, b);
                    for (int n15 = 0; n15 < this.field34200; ++n15) {
                        final int n16 = 2 * n15;
                        final int n17 = 2 * this.field34200 + 2 * n15;
                        final int n18 = n17 + 2 * this.field34200;
                        final int n19 = n18 + 2 * this.field34200;
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
        else if (this.field34201 <= 4) {
            if (this.field34201 != 4) {
                if (this.field34201 == 2) {
                    for (int n20 = 0; n20 < this.field34200; ++n20) {
                        final int n21 = 2 * n20;
                        array2[n21] = array[n20][0];
                        array2[n21 + 1] = array[n20][1];
                    }
                    this.field34205.method25927(array2, 0);
                    for (int n22 = 0; n22 < this.field34200; ++n22) {
                        final int n23 = 2 * n22;
                        array[n22][0] = array2[n23];
                        array[n22][1] = array2[n23 + 1];
                    }
                }
            }
            else {
                for (int n24 = 0; n24 < this.field34200; ++n24) {
                    final int n25 = 2 * n24;
                    final int n26 = 2 * this.field34200 + 2 * n24;
                    array2[n25] = array[n24][0];
                    array2[n25 + 1] = array[n24][1];
                    array2[n26] = array[n24][2];
                    array2[n26 + 1] = array[n24][3];
                }
                this.field34205.method25927(array2, 0);
                this.field34205.method25927(array2, 2 * this.field34200);
                for (int n27 = 0; n27 < this.field34200; ++n27) {
                    final int n28 = 2 * n27;
                    final int n29 = 2 * this.field34200 + 2 * n27;
                    array[n27][0] = array2[n28];
                    array[n27][1] = array2[n28 + 1];
                    array[n27][2] = array2[n29];
                    array[n27][3] = array2[n29 + 1];
                }
            }
        }
        else {
            for (int n30 = 0; n30 < this.field34201; n30 += 8) {
                for (int n31 = 0; n31 < this.field34200; ++n31) {
                    final int n32 = 2 * n31;
                    final int n33 = 2 * this.field34200 + 2 * n31;
                    final int n34 = n33 + 2 * this.field34200;
                    final int n35 = n34 + 2 * this.field34200;
                    array2[n32] = array[n31][n30];
                    array2[n32 + 1] = array[n31][n30 + 1];
                    array2[n33] = array[n31][n30 + 2];
                    array2[n33 + 1] = array[n31][n30 + 3];
                    array2[n34] = array[n31][n30 + 4];
                    array2[n34 + 1] = array[n31][n30 + 5];
                    array2[n35] = array[n31][n30 + 6];
                    array2[n35 + 1] = array[n31][n30 + 7];
                }
                this.field34205.method25927(array2, 0);
                this.field34205.method25927(array2, 2 * this.field34200);
                this.field34205.method25927(array2, 4 * this.field34200);
                this.field34205.method25927(array2, 6 * this.field34200);
                for (int n36 = 0; n36 < this.field34200; ++n36) {
                    final int n37 = 2 * n36;
                    final int n38 = 2 * this.field34200 + 2 * n36;
                    final int n39 = n38 + 2 * this.field34200;
                    final int n40 = n39 + 2 * this.field34200;
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
    
    private void method27747(final int n, final int n2, final float[] array, final boolean b) {
        final int n3 = (Class8216.method27224() > this.field34200) ? this.field34200 : Class8216.method27224();
        final Future[] array2 = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array2[i] = Class8216.method27227(new Class1351(this, n, n2, i, n3, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method27748(final long n, final int n2, final Class22 class22, final boolean b) {
        final int n3 = (int)((Class8216.method27224() > this.field34202) ? this.field34202 : Class8216.method27224());
        final Future[] array = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array[i] = Class8216.method27227(new Class1320(this, n, n2, i, n3, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method27749(final int n, final int n2, final float[] array, final boolean b) {
        final int n3 = (Class8216.method27224() > this.field34200) ? this.field34200 : Class8216.method27224();
        final Future[] array2 = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array2[i] = Class8216.method27227(new Class1130(this, n, n2, i, n3, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method27750(final long n, final int n2, final Class22 class22, final boolean b) {
        final int n3 = (Class8216.method27224() > this.field34200) ? this.field34200 : Class8216.method27224();
        final Future[] array = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array[i] = Class8216.method27227(new Class1121(this, n, n2, i, n3, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method27751(final int n, final int n2, final float[][] array, final boolean b) {
        final int n3 = (Class8216.method27224() > this.field34200) ? this.field34200 : Class8216.method27224();
        final Future[] array2 = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array2[i] = Class8216.method27227(new Class1447(this, n, n2, i, n3, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method27752(final int n, final int n2, final float[][] array, final boolean b) {
        final int n3 = (Class8216.method27224() > this.field34200) ? this.field34200 : Class8216.method27224();
        final Future[] array2 = new Future[n3];
        for (int i = 0; i < n3; ++i) {
            array2[i] = Class8216.method27227(new Class1466(this, n, n2, i, n3, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method27753(final int n, final float[] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field34201 / 2, Class8216.method27224());
        int n2 = 8 * this.field34200;
        if (this.field34201 == 4) {
            n2 >>= 1;
        }
        else if (this.field34201 < 4) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final Future[] array2 = new Future[method24128];
        final int n4 = method24128;
        for (int i = 0; i < method24128; ++i) {
            array2[i] = Class8216.method27227(new Class1296(this, n3, n, n4, i, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method27754(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)Class7640.method24129(this.field34203 / 2L, Class8216.method27224());
        long n3 = 8L * this.field34202;
        if (this.field34203 == 4L) {
            n3 >>= 1;
        }
        else if (this.field34203 < 4L) {
            n3 >>= 2;
        }
        final long n4 = n3;
        final Future[] array = new Future[n2];
        final int n5 = n2;
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1647(this, n4, n, n5, i, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method27755(final int n, final float[][] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field34201 / 2, Class8216.method27224());
        int n2 = 8 * this.field34200;
        if (this.field34201 == 4) {
            n2 >>= 1;
        }
        else if (this.field34201 < 4) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final Future[] array2 = new Future[method24128];
        for (int n4 = method24128, i = 0; i < n4; ++i) {
            array2[i] = Class8216.method27227(new Class1518(this, n3, n, n4, i, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method27756(final float[] array) {
        final int n = 2 * this.field34201;
        final int n2 = this.field34200 / 2;
        for (int i = this.field34200 - 1; i >= 1; --i) {
            final int n3 = i * this.field34201;
            final int n4 = 2 * n3;
            for (int j = 0; j < this.field34201; j += 2) {
                array[n4 + j] = array[n3 + j];
                array[n3 + j] = 0.0f;
                array[n4 + j + 1] = array[n3 + j + 1];
                array[n3 + j + 1] = 0.0f;
            }
        }
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field34207 && n2 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n5 = n2 / method27224;
            final int n6 = 2 * this.field34201;
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
                array2[k] = Class8216.method27227(new Class1154(this, n7, n8, n6, array, n9, n10));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
            }
        }
        else {
            for (int l = 1; l < n2; ++l) {
                final int n11 = l * n;
                final int n12 = (this.field34200 - l) * n;
                array[n11 + this.field34201] = array[n12 + 1];
                array[n11 + this.field34201 + 1] = -array[n12];
            }
            for (int n13 = 1; n13 < n2; ++n13) {
                final int n14 = n13 * n;
                final int n15 = (this.field34200 - n13 + 1) * n;
                for (int n16 = this.field34201 + 2; n16 < n; n16 += 2) {
                    array[n14 + n16] = array[n15 - n16];
                    array[n14 + n16 + 1] = -array[n15 - n16 + 1];
                }
            }
            for (int n17 = 0; n17 <= this.field34200 / 2; ++n17) {
                final int n18 = n17 * n;
                final int n19 = (this.field34200 - n17) % this.field34200 * n;
                for (int n20 = 0; n20 < n; n20 += 2) {
                    final int n21 = n18 + n20;
                    final int n22 = n19 + (n - n20) % n;
                    array[n22] = array[n21];
                    array[n22 + 1] = -array[n21 + 1];
                }
            }
        }
        array[this.field34201] = -array[1];
        array[1] = 0.0f;
        final int n23 = n2 * n;
        array[n23 + this.field34201] = -array[n23 + 1];
        array[n23 + 1] = 0.0f;
        array[n23 + this.field34201 + 1] = 0.0f;
    }
    
    private void method27757(final Class22 class22) {
        final long n = 2L * this.field34203;
        final long n2 = this.field34202 / 2L;
        for (long n3 = this.field34202 - 1L; n3 >= 1L; --n3) {
            final long n4 = n3 * this.field34203;
            final long n5 = 2L * n4;
            for (long n6 = 0L; n6 < this.field34203; n6 += 2L) {
                class22.method171(n5 + n6, class22.method135(n4 + n6));
                class22.method171(n4 + n6, 0.0);
                class22.method171(n5 + n6 + 1L, class22.method135(n4 + n6 + 1L));
                class22.method171(n4 + n6 + 1L, 0.0);
            }
        }
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field34207 && n2 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n7 = n2 / method27224;
            final long n8 = 2L * this.field34203;
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
                array[i] = Class8216.method27227(new Class1256(this, n9, n10, n8, class22, n11, n12));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
            }
        }
        else {
            for (long n13 = 1L; n13 < n2; ++n13) {
                final long n14 = n13 * n;
                final long n15 = (this.field34202 - n13) * n;
                class22.method171(n14 + this.field34203, class22.method135(n15 + 1L));
                class22.method171(n14 + this.field34203 + 1L, -class22.method135(n15));
            }
            for (long n16 = 1L; n16 < n2; ++n16) {
                final long n17 = n16 * n;
                final long n18 = (this.field34202 - n16 + 1L) * n;
                for (long n19 = this.field34203 + 2L; n19 < n; n19 += 2L) {
                    class22.method171(n17 + n19, class22.method135(n18 - n19));
                    class22.method171(n17 + n19 + 1L, -class22.method135(n18 - n19 + 1L));
                }
            }
            for (long n20 = 0L; n20 <= this.field34202 / 2L; ++n20) {
                final long n21 = n20 * n;
                final long n22 = (this.field34202 - n20) % this.field34202 * n;
                for (long n23 = 0L; n23 < n; n23 += 2L) {
                    final long n24 = n21 + n23;
                    final long n25 = n22 + (n - n23) % n;
                    class22.method171(n25, class22.method135(n24));
                    class22.method171(n25 + 1L, -class22.method135(n24 + 1L));
                }
            }
        }
        class22.method171(this.field34203, -class22.method135(1L));
        class22.method171(1L, 0.0);
        final long n26 = n2 * n;
        class22.method171(n26 + this.field34203, -class22.method135(n26 + 1L));
        class22.method171(n26 + 1L, 0.0);
        class22.method171(n26 + this.field34203 + 1L, 0.0);
    }
    
    private void method27758(final float[][] array) {
        final int n = 2 * this.field34201;
        final int n2 = this.field34200 / 2;
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field34207 && n2 >= method27224) {
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
                array2[i] = Class8216.method27227(new Class978(this, n4, n5, array, n, n6, n7));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class8328.class.getName()).log(Level.SEVERE, null, thrown2);
            }
        }
        else {
            for (int j = 1; j < n2; ++j) {
                final int n8 = this.field34200 - j;
                array[j][this.field34201] = array[n8][1];
                array[j][this.field34201 + 1] = -array[n8][0];
            }
            for (int k = 1; k < n2; ++k) {
                final int n9 = this.field34200 - k;
                for (int l = this.field34201 + 2; l < n; l += 2) {
                    final int n10 = n - l;
                    array[k][l] = array[n9][n10];
                    array[k][l + 1] = -array[n9][n10 + 1];
                }
            }
            for (int n11 = 0; n11 <= this.field34200 / 2; ++n11) {
                final int n12 = (this.field34200 - n11) % this.field34200;
                for (int n13 = 0; n13 < n; n13 += 2) {
                    final int n14 = (n - n13) % n;
                    array[n12][n14] = array[n11][n13];
                    array[n12][n14 + 1] = -array[n11][n13 + 1];
                }
            }
        }
        array[0][this.field34201] = -array[0][1];
        array[0][1] = 0.0f;
        array[n2][this.field34201] = -array[n2][1];
        array[n2][1] = 0.0f;
        array[n2][this.field34201 + 1] = 0.0f;
    }
}
