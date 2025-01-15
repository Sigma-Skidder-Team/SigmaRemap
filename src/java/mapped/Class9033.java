// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class9033
{
    private int field38198;
    private int field38199;
    private long field38200;
    private long field38201;
    private Class6062 field38202;
    private Class6062 field38203;
    private boolean field38204;
    private boolean field38205;
    
    public Class9033(final long field38200, final long field38201) {
        this.field38204 = false;
        this.field38205 = false;
        if (field38200 > 1L && field38201 > 1L) {
            this.field38198 = (int)field38200;
            this.field38199 = (int)field38201;
            this.field38200 = field38200;
            this.field38201 = field38201;
            if (field38200 * field38201 >= Class9133.method33160()) {
                this.field38205 = true;
            }
            if (Class9133.method33175(field38200)) {
                if (Class9133.method33175(field38201)) {
                    this.field38204 = true;
                }
            }
            Class9133.method33169(field38200 * field38201 > Class11.method177());
            this.field38203 = new Class6062(field38200);
            if (field38200 != field38201) {
                this.field38202 = new Class6062(field38201);
            }
            else {
                this.field38202 = this.field38203;
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be greater than 1");
    }
    
    public void method32436(final double[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field38204) {
            if (method27224 > 1 && this.field38205) {
                this.method32442(-1, array, b);
                this.method32445(-1, array, b);
            }
            else {
                this.method32448(-1, array, b);
                for (int i = 0; i < this.field38198; ++i) {
                    this.field38202.method18038(array, i * this.field38199, b);
                }
            }
        }
        else if (method27224 > 1 && this.field38205 && this.field38198 >= method27224 && this.field38199 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field38198 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1389(this, n2, (j == method27224 - 1) ? this.field38198 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field38199 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1497(this, n4, (k == method27224 - 1) ? this.field38199 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field38198; ++l) {
                this.field38202.method18038(array, l * this.field38199, b);
            }
            final double[] array3 = new double[this.field38198];
            for (int n5 = 0; n5 < this.field38199; ++n5) {
                for (int n6 = 0; n6 < this.field38198; ++n6) {
                    array3[n6] = array[n6 * this.field38199 + n5];
                }
                this.field38203.method18036(array3, b);
                for (int n7 = 0; n7 < this.field38198; ++n7) {
                    array[n7 * this.field38199 + n5] = array3[n7];
                }
            }
        }
    }
    
    public void method32437(final Class17 class17, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field38204) {
            if (method27224 > 1 && this.field38205) {
                this.method32443(-1, class17, b);
                this.method32446(-1, class17, b);
            }
            else {
                this.method32449(-1, class17, b);
                for (long n = 0L; n < this.field38200; ++n) {
                    this.field38202.method18039(class17, n * this.field38201, b);
                }
            }
        }
        else if (method27224 > 1 && this.field38205 && this.field38200 >= method27224 && this.field38201 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n2 = this.field38200 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n3 = i * n2;
                array[i] = Class8216.method27227(new Class1264(this, n3, (i == method27224 - 1) ? this.field38200 : (n3 + n2), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final long n4 = this.field38201 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final long n5 = j * n4;
                array[j] = Class8216.method27227(new Class1082(this, n5, (j == method27224 - 1) ? this.field38201 : (n5 + n4), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field38200; ++n6) {
                this.field38202.method18039(class17, n6 * this.field38201, b);
            }
            final Class17 class18 = new Class17(this.field38200, false);
            for (long n7 = 0L; n7 < this.field38201; ++n7) {
                for (long n8 = 0L; n8 < this.field38200; ++n8) {
                    class18.method171(n8, class17.method137(n8 * this.field38201 + n7));
                }
                this.field38203.method18037(class18, b);
                for (long n9 = 0L; n9 < this.field38200; ++n9) {
                    class17.method171(n9 * this.field38201 + n7, class18.method137(n9));
                }
            }
        }
    }
    
    public void method32438(final double[][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field38204) {
            if (method27224 > 1 && this.field38205) {
                this.method32444(-1, array, b);
                this.method32447(-1, array, b);
            }
            else {
                this.method32450(-1, array, b);
                for (int i = 0; i < this.field38198; ++i) {
                    this.field38202.method18036(array[i], b);
                }
            }
        }
        else if (method27224 > 1 && this.field38205 && this.field38198 >= method27224 && this.field38199 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field38198 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1022(this, n2, (j == method27224 - 1) ? this.field38198 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field38199 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1533(this, n4, (k == method27224 - 1) ? this.field38199 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field38198; ++l) {
                this.field38202.method18036(array[l], b);
            }
            final double[] array3 = new double[this.field38198];
            for (int n5 = 0; n5 < this.field38199; ++n5) {
                for (int n6 = 0; n6 < this.field38198; ++n6) {
                    array3[n6] = array[n6][n5];
                }
                this.field38203.method18036(array3, b);
                for (int n7 = 0; n7 < this.field38198; ++n7) {
                    array[n7][n5] = array3[n7];
                }
            }
        }
    }
    
    public void method32439(final double[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field38204) {
            if (method27224 > 1 && this.field38205) {
                this.method32442(1, array, b);
                this.method32445(1, array, b);
            }
            else {
                this.method32448(1, array, b);
                for (int i = 0; i < this.field38198; ++i) {
                    this.field38202.method18042(array, i * this.field38199, b);
                }
            }
        }
        else if (method27224 > 1 && this.field38205 && this.field38198 >= method27224 && this.field38199 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field38198 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1493(this, n2, (j == method27224 - 1) ? this.field38198 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field38199 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1020(this, n4, (k == method27224 - 1) ? this.field38199 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field38198; ++l) {
                this.field38202.method18042(array, l * this.field38199, b);
            }
            final double[] array3 = new double[this.field38198];
            for (int n5 = 0; n5 < this.field38199; ++n5) {
                for (int n6 = 0; n6 < this.field38198; ++n6) {
                    array3[n6] = array[n6 * this.field38199 + n5];
                }
                this.field38203.method18040(array3, b);
                for (int n7 = 0; n7 < this.field38198; ++n7) {
                    array[n7 * this.field38199 + n5] = array3[n7];
                }
            }
        }
    }
    
    public void method32440(final Class17 class17, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field38204) {
            if (method27224 > 1 && this.field38205) {
                this.method32443(1, class17, b);
                this.method32446(1, class17, b);
            }
            else {
                this.method32449(1, class17, b);
                for (long n = 0L; n < this.field38200; ++n) {
                    this.field38202.method18043(class17, n * this.field38201, b);
                }
            }
        }
        else if (method27224 > 1 && this.field38205 && this.field38200 >= method27224 && this.field38201 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n2 = this.field38200 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n3 = i * n2;
                array[i] = Class8216.method27227(new Class1526(this, n3, (i == method27224 - 1) ? this.field38200 : (n3 + n2), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final long n4 = this.field38201 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final long n5 = j * n4;
                array[j] = Class8216.method27227(new Class996(this, n5, (j == method27224 - 1) ? this.field38201 : (n5 + n4), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field38200; ++n6) {
                this.field38202.method18043(class17, n6 * this.field38201, b);
            }
            final Class17 class18 = new Class17(this.field38200, false);
            for (long n7 = 0L; n7 < this.field38201; ++n7) {
                for (long n8 = 0L; n8 < this.field38200; ++n8) {
                    class18.method171(n8, class17.method137(n8 * this.field38201 + n7));
                }
                this.field38203.method18041(class18, b);
                for (long n9 = 0L; n9 < this.field38200; ++n9) {
                    class17.method171(n9 * this.field38201 + n7, class18.method137(n9));
                }
            }
        }
    }
    
    public void method32441(final double[][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field38204) {
            if (method27224 > 1 && this.field38205) {
                this.method32444(1, array, b);
                this.method32447(1, array, b);
            }
            else {
                this.method32450(1, array, b);
                for (int i = 0; i < this.field38198; ++i) {
                    this.field38202.method18040(array[i], b);
                }
            }
        }
        else if (method27224 > 1 && this.field38205 && this.field38198 >= method27224 && this.field38199 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field38198 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1381(this, n2, (j == method27224 - 1) ? this.field38198 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field38199 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1224(this, n4, (k == method27224 - 1) ? this.field38199 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field38198; ++l) {
                this.field38202.method18040(array[l], b);
            }
            final double[] array3 = new double[this.field38198];
            for (int n5 = 0; n5 < this.field38199; ++n5) {
                for (int n6 = 0; n6 < this.field38198; ++n6) {
                    array3[n6] = array[n6][n5];
                }
                this.field38203.method18040(array3, b);
                for (int n7 = 0; n7 < this.field38198; ++n7) {
                    array[n7][n5] = array3[n7];
                }
            }
        }
    }
    
    private void method32442(final int n, final double[] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field38199, Class8216.method27224());
        int n2 = 4 * this.field38198;
        if (this.field38199 == 2) {
            n2 >>= 1;
        }
        else if (this.field38199 < 2) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final int n4 = method24128;
        final Future[] array2 = new Future[method24128];
        for (int i = 0; i < method24128; ++i) {
            array2[i] = Class8216.method27227(new Class1534(this, n3, n, i, n4, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method32443(final int n, final Class17 class17, final boolean b) {
        final int n2 = (int)Class7640.method24129(this.field38201, Class8216.method27224());
        long n3 = 4L * this.field38200;
        if (this.field38201 == 2L) {
            n3 >>= 1;
        }
        else if (this.field38201 < 2L) {
            n3 >>= 2;
        }
        final long n4 = n3;
        final long n5 = n2;
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1317(this, n4, n, i, n5, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method32444(final int n, final double[][] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field38199, Class8216.method27224());
        int n2 = 4 * this.field38198;
        if (this.field38199 == 2) {
            n2 >>= 1;
        }
        else if (this.field38199 < 2) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final int n4 = method24128;
        final Future[] array2 = new Future[method24128];
        for (int i = 0; i < method24128; ++i) {
            array2[i] = Class8216.method27227(new Class1627(this, n3, n, i, n4, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method32445(final int n, final double[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field38198) ? this.field38198 : Class8216.method27224();
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1484(this, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method32446(final int n, final Class17 class17, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field38200) ? this.field38200 : Class8216.method27224());
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1491(this, n, i, n2, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method32447(final int n, final double[][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field38198) ? this.field38198 : Class8216.method27224();
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class889(this, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9033.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method32448(final int n, final double[] array, final boolean b) {
        int n2 = 4 * this.field38198;
        if (this.field38199 != 2) {
            if (this.field38199 < 2) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (this.field38199 <= 2) {
            if (this.field38199 == 2) {
                for (int i = 0; i < this.field38198; ++i) {
                    final int n3 = i * this.field38199;
                    array2[i] = array[n3];
                    array2[this.field38198 + i] = array[n3 + 1];
                }
                if (n != -1) {
                    this.field38203.method18042(array2, 0, b);
                    this.field38203.method18042(array2, this.field38198, b);
                }
                else {
                    this.field38203.method18038(array2, 0, b);
                    this.field38203.method18038(array2, this.field38198, b);
                }
                for (int j = 0; j < this.field38198; ++j) {
                    final int n4 = j * this.field38199;
                    array[n4] = array2[j];
                    array[n4 + 1] = array2[this.field38198 + j];
                }
            }
        }
        else if (n != -1) {
            for (int k = 0; k < this.field38199; k += 4) {
                for (int l = 0; l < this.field38198; ++l) {
                    final int n5 = l * this.field38199 + k;
                    final int n6 = this.field38198 + l;
                    array2[l] = array[n5];
                    array2[n6] = array[n5 + 1];
                    array2[n6 + this.field38198] = array[n5 + 2];
                    array2[n6 + 2 * this.field38198] = array[n5 + 3];
                }
                this.field38203.method18042(array2, 0, b);
                this.field38203.method18042(array2, this.field38198, b);
                this.field38203.method18042(array2, 2 * this.field38198, b);
                this.field38203.method18042(array2, 3 * this.field38198, b);
                for (int n7 = 0; n7 < this.field38198; ++n7) {
                    final int n8 = n7 * this.field38199 + k;
                    final int n9 = this.field38198 + n7;
                    array[n8] = array2[n7];
                    array[n8 + 1] = array2[n9];
                    array[n8 + 2] = array2[n9 + this.field38198];
                    array[n8 + 3] = array2[n9 + 2 * this.field38198];
                }
            }
        }
        else {
            for (int n10 = 0; n10 < this.field38199; n10 += 4) {
                for (int n11 = 0; n11 < this.field38198; ++n11) {
                    final int n12 = n11 * this.field38199 + n10;
                    final int n13 = this.field38198 + n11;
                    array2[n11] = array[n12];
                    array2[n13] = array[n12 + 1];
                    array2[n13 + this.field38198] = array[n12 + 2];
                    array2[n13 + 2 * this.field38198] = array[n12 + 3];
                }
                this.field38203.method18038(array2, 0, b);
                this.field38203.method18038(array2, this.field38198, b);
                this.field38203.method18038(array2, 2 * this.field38198, b);
                this.field38203.method18038(array2, 3 * this.field38198, b);
                for (int n14 = 0; n14 < this.field38198; ++n14) {
                    final int n15 = n14 * this.field38199 + n10;
                    final int n16 = this.field38198 + n14;
                    array[n15] = array2[n14];
                    array[n15 + 1] = array2[n16];
                    array[n15 + 2] = array2[n16 + this.field38198];
                    array[n15 + 3] = array2[n16 + 2 * this.field38198];
                }
            }
        }
    }
    
    private void method32449(final int n, final Class17 class17, final boolean b) {
        long n2 = 4L * this.field38200;
        if (this.field38201 != 2L) {
            if (this.field38201 < 2L) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final Class17 class18 = new Class17(n2);
        if (this.field38201 <= 2L) {
            if (this.field38201 == 2L) {
                for (long n3 = 0L; n3 < this.field38200; ++n3) {
                    final long n4 = n3 * this.field38201;
                    class18.method171(n3, class17.method137(n4));
                    class18.method171(this.field38200 + n3, class17.method137(n4 + 1L));
                }
                if (n != -1) {
                    this.field38203.method18043(class18, 0L, b);
                    this.field38203.method18043(class18, this.field38200, b);
                }
                else {
                    this.field38203.method18039(class18, 0L, b);
                    this.field38203.method18039(class18, this.field38200, b);
                }
                for (long n5 = 0L; n5 < this.field38200; ++n5) {
                    final long n6 = n5 * this.field38201;
                    class17.method171(n6, class18.method137(n5));
                    class17.method171(n6 + 1L, class18.method137(this.field38200 + n5));
                }
            }
        }
        else if (n != -1) {
            for (long n7 = 0L; n7 < this.field38201; n7 += 4L) {
                for (long n8 = 0L; n8 < this.field38200; ++n8) {
                    final long n9 = n8 * this.field38201 + n7;
                    final long n10 = this.field38200 + n8;
                    class18.method171(n8, class17.method137(n9));
                    class18.method171(n10, class17.method137(n9 + 1L));
                    class18.method171(n10 + this.field38200, class17.method137(n9 + 2L));
                    class18.method171(n10 + 2L * this.field38200, class17.method137(n9 + 3L));
                }
                this.field38203.method18043(class18, 0L, b);
                this.field38203.method18043(class18, this.field38200, b);
                this.field38203.method18043(class18, 2L * this.field38200, b);
                this.field38203.method18043(class18, 3L * this.field38200, b);
                for (long n11 = 0L; n11 < this.field38200; ++n11) {
                    final long n12 = n11 * this.field38201 + n7;
                    final long n13 = this.field38200 + n11;
                    class17.method171(n12, class18.method137(n11));
                    class17.method171(n12 + 1L, class18.method137(n13));
                    class17.method171(n12 + 2L, class18.method137(n13 + this.field38200));
                    class17.method171(n12 + 3L, class18.method137(n13 + 2L * this.field38200));
                }
            }
        }
        else {
            for (long n14 = 0L; n14 < this.field38201; n14 += 4L) {
                for (long n15 = 0L; n15 < this.field38200; ++n15) {
                    final long n16 = n15 * this.field38201 + n14;
                    final long n17 = this.field38200 + n15;
                    class18.method171(n15, class17.method137(n16));
                    class18.method171(n17, class17.method137(n16 + 1L));
                    class18.method171(n17 + this.field38200, class17.method137(n16 + 2L));
                    class18.method171(n17 + 2L * this.field38200, class17.method137(n16 + 3L));
                }
                this.field38203.method18039(class18, 0L, b);
                this.field38203.method18039(class18, this.field38200, b);
                this.field38203.method18039(class18, 2L * this.field38200, b);
                this.field38203.method18039(class18, 3L * this.field38200, b);
                for (long n18 = 0L; n18 < this.field38200; ++n18) {
                    final long n19 = n18 * this.field38201 + n14;
                    final long n20 = this.field38200 + n18;
                    class17.method171(n19, class18.method137(n18));
                    class17.method171(n19 + 1L, class18.method137(n20));
                    class17.method171(n19 + 2L, class18.method137(n20 + this.field38200));
                    class17.method171(n19 + 3L, class18.method137(n20 + 2L * this.field38200));
                }
            }
        }
    }
    
    private void method32450(final int n, final double[][] array, final boolean b) {
        int n2 = 4 * this.field38198;
        if (this.field38199 != 2) {
            if (this.field38199 < 2) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (this.field38199 <= 2) {
            if (this.field38199 == 2) {
                for (int i = 0; i < this.field38198; ++i) {
                    array2[i] = array[i][0];
                    array2[this.field38198 + i] = array[i][1];
                }
                if (n != -1) {
                    this.field38203.method18042(array2, 0, b);
                    this.field38203.method18042(array2, this.field38198, b);
                }
                else {
                    this.field38203.method18038(array2, 0, b);
                    this.field38203.method18038(array2, this.field38198, b);
                }
                for (int j = 0; j < this.field38198; ++j) {
                    array[j][0] = array2[j];
                    array[j][1] = array2[this.field38198 + j];
                }
            }
        }
        else if (n != -1) {
            for (int k = 0; k < this.field38199; k += 4) {
                for (int l = 0; l < this.field38198; ++l) {
                    final int n3 = this.field38198 + l;
                    array2[l] = array[l][k];
                    array2[n3] = array[l][k + 1];
                    array2[n3 + this.field38198] = array[l][k + 2];
                    array2[n3 + 2 * this.field38198] = array[l][k + 3];
                }
                this.field38203.method18042(array2, 0, b);
                this.field38203.method18042(array2, this.field38198, b);
                this.field38203.method18042(array2, 2 * this.field38198, b);
                this.field38203.method18042(array2, 3 * this.field38198, b);
                for (int n4 = 0; n4 < this.field38198; ++n4) {
                    final int n5 = this.field38198 + n4;
                    array[n4][k] = array2[n4];
                    array[n4][k + 1] = array2[n5];
                    array[n4][k + 2] = array2[n5 + this.field38198];
                    array[n4][k + 3] = array2[n5 + 2 * this.field38198];
                }
            }
        }
        else {
            for (int n6 = 0; n6 < this.field38199; n6 += 4) {
                for (int n7 = 0; n7 < this.field38198; ++n7) {
                    final int n8 = this.field38198 + n7;
                    array2[n7] = array[n7][n6];
                    array2[n8] = array[n7][n6 + 1];
                    array2[n8 + this.field38198] = array[n7][n6 + 2];
                    array2[n8 + 2 * this.field38198] = array[n7][n6 + 3];
                }
                this.field38203.method18038(array2, 0, b);
                this.field38203.method18038(array2, this.field38198, b);
                this.field38203.method18038(array2, 2 * this.field38198, b);
                this.field38203.method18038(array2, 3 * this.field38198, b);
                for (int n9 = 0; n9 < this.field38198; ++n9) {
                    final int n10 = this.field38198 + n9;
                    array[n9][n6] = array2[n9];
                    array[n9][n6 + 1] = array2[n10];
                    array[n9][n6 + 2] = array2[n10 + this.field38198];
                    array[n9][n6 + 3] = array2[n10 + 2 * this.field38198];
                }
            }
        }
    }
}
