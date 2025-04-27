// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class6710
{
    private final int field26437;
    private final int field26438;
    private final long field26439;
    private final long field26440;
    private final Class9267 field26441;
    private final Class9267 field26442;
    private boolean field26443;
    private boolean field26444;
    
    public Class6710(final long field26439, final long field26440) {
        this.field26443 = false;
        this.field26444 = false;
        if (field26439 > 1L && field26440 > 1L) {
            this.field26437 = (int)field26439;
            this.field26438 = (int)field26440;
            this.field26439 = field26439;
            this.field26440 = field26440;
            if (field26439 * field26440 >= Class9133.method33160()) {
                this.field26444 = true;
            }
            if (Class9133.method33175(field26439)) {
                if (Class9133.method33175(field26440)) {
                    this.field26443 = true;
                }
            }
            Class9133.method33169(field26439 * field26440 > Class11.method177());
            this.field26442 = new Class9267(field26439);
            if (field26439 != field26440) {
                this.field26441 = new Class9267(field26440);
            }
            else {
                this.field26441 = this.field26442;
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be greater than 1");
    }
    
    public void method20365(final float[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field26443) {
            if (method27224 > 1 && this.field26444) {
                this.method20371(-1, array, b);
                this.method20374(-1, array, b);
            }
            else {
                this.method20377(-1, array, b);
                for (int i = 0; i < this.field26437; ++i) {
                    this.field26441.method34183(array, i * this.field26438, b);
                }
            }
        }
        else if (method27224 > 1 && this.field26444 && this.field26437 >= method27224 && this.field26438 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field26437 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class886(this, n2, (j == method27224 - 1) ? this.field26437 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field26438 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1311(this, n4, (k == method27224 - 1) ? this.field26438 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field26437; ++l) {
                this.field26441.method34183(array, l * this.field26438, b);
            }
            final float[] array3 = new float[this.field26437];
            for (int n5 = 0; n5 < this.field26438; ++n5) {
                for (int n6 = 0; n6 < this.field26437; ++n6) {
                    array3[n6] = array[n6 * this.field26438 + n5];
                }
                this.field26442.method34181(array3, b);
                for (int n7 = 0; n7 < this.field26437; ++n7) {
                    array[n7 * this.field26438 + n5] = array3[n7];
                }
            }
        }
    }
    
    public void method20366(final Class22 class22, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field26443) {
            if (method27224 > 1 && this.field26444) {
                this.method20372(-1, class22, b);
                this.method20375(-1, class22, b);
            }
            else {
                this.method20378(-1, class22, b);
                for (long n = 0L; n < this.field26439; ++n) {
                    this.field26441.method34184(class22, n * this.field26440, b);
                }
            }
        }
        else if (method27224 > 1 && this.field26444 && this.field26439 >= method27224 && this.field26440 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n2 = this.field26439 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n3 = i * n2;
                array[i] = Class8216.method27227(new Class1196(this, n3, (i == method27224 - 1) ? this.field26439 : (n3 + n2), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final long n4 = this.field26440 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final long n5 = j * n4;
                array[j] = Class8216.method27227(new Class1029(this, n5, (j == method27224 - 1) ? this.field26440 : (n5 + n4), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field26439; ++n6) {
                this.field26441.method34184(class22, n6 * this.field26440, b);
            }
            final Class22 class23 = new Class22(this.field26439, false);
            for (long n7 = 0L; n7 < this.field26440; ++n7) {
                for (long n8 = 0L; n8 < this.field26439; ++n8) {
                    class23.method169(n8, class22.method135(n8 * this.field26440 + n7));
                }
                this.field26442.method34182(class23, b);
                for (long n9 = 0L; n9 < this.field26439; ++n9) {
                    class22.method169(n9 * this.field26440 + n7, class23.method135(n9));
                }
            }
        }
    }
    
    public void method20367(final float[][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field26443) {
            if (method27224 > 1 && this.field26444) {
                this.method20373(-1, array, b);
                this.method20376(-1, array, b);
            }
            else {
                this.method20379(-1, array, b);
                for (int i = 0; i < this.field26437; ++i) {
                    this.field26441.method34181(array[i], b);
                }
            }
        }
        else if (method27224 > 1 && this.field26444 && this.field26437 >= method27224 && this.field26438 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field26437 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1120(this, n2, (j == method27224 - 1) ? this.field26437 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field26438 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1461(this, n4, (k == method27224 - 1) ? this.field26438 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field26437; ++l) {
                this.field26441.method34181(array[l], b);
            }
            final float[] array3 = new float[this.field26437];
            for (int n5 = 0; n5 < this.field26438; ++n5) {
                for (int n6 = 0; n6 < this.field26437; ++n6) {
                    array3[n6] = array[n6][n5];
                }
                this.field26442.method34181(array3, b);
                for (int n7 = 0; n7 < this.field26437; ++n7) {
                    array[n7][n5] = array3[n7];
                }
            }
        }
    }
    
    public void method20368(final float[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field26443) {
            if (method27224 > 1 && this.field26444) {
                this.method20371(1, array, b);
                this.method20374(1, array, b);
            }
            else {
                this.method20377(1, array, b);
                for (int i = 0; i < this.field26437; ++i) {
                    this.field26441.method34187(array, i * this.field26438, b);
                }
            }
        }
        else if (method27224 > 1 && this.field26444 && this.field26437 >= method27224 && this.field26438 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field26437 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1218(this, n2, (j == method27224 - 1) ? this.field26437 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field26438 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1456(this, n4, (k == method27224 - 1) ? this.field26438 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field26437; ++l) {
                this.field26441.method34187(array, l * this.field26438, b);
            }
            final float[] array3 = new float[this.field26437];
            for (int n5 = 0; n5 < this.field26438; ++n5) {
                for (int n6 = 0; n6 < this.field26437; ++n6) {
                    array3[n6] = array[n6 * this.field26438 + n5];
                }
                this.field26442.method34185(array3, b);
                for (int n7 = 0; n7 < this.field26437; ++n7) {
                    array[n7 * this.field26438 + n5] = array3[n7];
                }
            }
        }
    }
    
    public void method20369(final Class22 class22, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field26443) {
            if (method27224 > 1 && this.field26444) {
                this.method20372(1, class22, b);
                this.method20375(1, class22, b);
            }
            else {
                this.method20378(1, class22, b);
                for (long n = 0L; n < this.field26439; ++n) {
                    this.field26441.method34188(class22, n * this.field26440, b);
                }
            }
        }
        else if (method27224 > 1 && this.field26444 && this.field26439 >= method27224 && this.field26440 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n2 = this.field26439 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n3 = i * n2;
                array[i] = Class8216.method27227(new Class1448(this, n3, (i == method27224 - 1) ? this.field26439 : (n3 + n2), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final long n4 = this.field26440 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final long n5 = j * n4;
                array[j] = Class8216.method27227(new Class1611(this, n5, (j == method27224 - 1) ? this.field26440 : (n5 + n4), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field26439; ++n6) {
                this.field26441.method34188(class22, n6 * this.field26440, b);
            }
            final Class22 class23 = new Class22(this.field26439, false);
            for (long n7 = 0L; n7 < this.field26440; ++n7) {
                for (long n8 = 0L; n8 < this.field26439; ++n8) {
                    class23.method169(n8, class22.method135(n8 * this.field26440 + n7));
                }
                this.field26442.method34186(class23, b);
                for (long n9 = 0L; n9 < this.field26439; ++n9) {
                    class22.method169(n9 * this.field26440 + n7, class23.method135(n9));
                }
            }
        }
    }
    
    public void method20370(final float[][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field26443) {
            if (method27224 > 1 && this.field26444) {
                this.method20373(1, array, b);
                this.method20376(1, array, b);
            }
            else {
                this.method20379(1, array, b);
                for (int i = 0; i < this.field26437; ++i) {
                    this.field26441.method34185(array[i], b);
                }
            }
        }
        else if (method27224 > 1 && this.field26444 && this.field26437 >= method27224 && this.field26438 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field26437 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1217(this, n2, (j == method27224 - 1) ? this.field26437 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field26438 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1207(this, n4, (k == method27224 - 1) ? this.field26438 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field26437; ++l) {
                this.field26441.method34185(array[l], b);
            }
            final float[] array3 = new float[this.field26437];
            for (int n5 = 0; n5 < this.field26438; ++n5) {
                for (int n6 = 0; n6 < this.field26437; ++n6) {
                    array3[n6] = array[n6][n5];
                }
                this.field26442.method34185(array3, b);
                for (int n7 = 0; n7 < this.field26437; ++n7) {
                    array[n7][n5] = array3[n7];
                }
            }
        }
    }
    
    private void method20371(final int n, final float[] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field26438, Class8216.method27224());
        int n2 = 4 * this.field26437;
        if (this.field26438 == 2) {
            n2 >>= 1;
        }
        else if (this.field26438 < 2) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final int n4 = method24128;
        final Future[] array2 = new Future[n4];
        for (int i = 0; i < n4; ++i) {
            array2[i] = Class8216.method27227(new Class1084(this, n3, n, i, n4, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method20372(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)Class7640.method24129(this.field26440, Class8216.method27224());
        long n3 = 4L * this.field26439;
        if (this.field26440 == 2L) {
            n3 >>= 1;
        }
        else if (this.field26440 < 2L) {
            n3 >>= 2;
        }
        final long n4 = n3;
        final int n5 = n2;
        final Future[] array = new Future[n5];
        for (int i = 0; i < n5; ++i) {
            array[i] = Class8216.method27227(new Class1058(this, n4, n, i, n5, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method20373(final int n, final float[][] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field26438, Class8216.method27224());
        int n2 = 4 * this.field26437;
        if (this.field26438 == 2) {
            n2 >>= 1;
        }
        else if (this.field26438 < 2) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final int n4 = method24128;
        final Future[] array2 = new Future[n4];
        for (int i = 0; i < n4; ++i) {
            array2[i] = Class8216.method27227(new Class1291(this, n3, n, i, n4, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method20374(final int n, final float[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field26437) ? this.field26437 : Class8216.method27224();
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1412(this, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method20375(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field26439) ? this.field26439 : Class8216.method27224());
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1191(this, n, i, n2, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method20376(final int n, final float[][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field26437) ? this.field26437 : Class8216.method27224();
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1618(this, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class6710.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method20377(final int n, final float[] array, final boolean b) {
        int n2 = 4 * this.field26437;
        if (this.field26438 != 2) {
            if (this.field26438 < 2) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (this.field26438 <= 2) {
            if (this.field26438 == 2) {
                for (int i = 0; i < this.field26437; ++i) {
                    final int n3 = i * this.field26438;
                    array2[i] = array[n3];
                    array2[this.field26437 + i] = array[n3 + 1];
                }
                if (n != -1) {
                    this.field26442.method34187(array2, 0, b);
                    this.field26442.method34187(array2, this.field26437, b);
                }
                else {
                    this.field26442.method34183(array2, 0, b);
                    this.field26442.method34183(array2, this.field26437, b);
                }
                for (int j = 0; j < this.field26437; ++j) {
                    final int n4 = j * this.field26438;
                    array[n4] = array2[j];
                    array[n4 + 1] = array2[this.field26437 + j];
                }
            }
        }
        else if (n != -1) {
            for (int k = 0; k < this.field26438; k += 4) {
                for (int l = 0; l < this.field26437; ++l) {
                    final int n5 = l * this.field26438 + k;
                    final int n6 = this.field26437 + l;
                    array2[l] = array[n5];
                    array2[n6] = array[n5 + 1];
                    array2[n6 + this.field26437] = array[n5 + 2];
                    array2[n6 + 2 * this.field26437] = array[n5 + 3];
                }
                this.field26442.method34187(array2, 0, b);
                this.field26442.method34187(array2, this.field26437, b);
                this.field26442.method34187(array2, 2 * this.field26437, b);
                this.field26442.method34187(array2, 3 * this.field26437, b);
                for (int n7 = 0; n7 < this.field26437; ++n7) {
                    final int n8 = n7 * this.field26438 + k;
                    final int n9 = this.field26437 + n7;
                    array[n8] = array2[n7];
                    array[n8 + 1] = array2[n9];
                    array[n8 + 2] = array2[n9 + this.field26437];
                    array[n8 + 3] = array2[n9 + 2 * this.field26437];
                }
            }
        }
        else {
            for (int n10 = 0; n10 < this.field26438; n10 += 4) {
                for (int n11 = 0; n11 < this.field26437; ++n11) {
                    final int n12 = n11 * this.field26438 + n10;
                    final int n13 = this.field26437 + n11;
                    array2[n11] = array[n12];
                    array2[n13] = array[n12 + 1];
                    array2[n13 + this.field26437] = array[n12 + 2];
                    array2[n13 + 2 * this.field26437] = array[n12 + 3];
                }
                this.field26442.method34183(array2, 0, b);
                this.field26442.method34183(array2, this.field26437, b);
                this.field26442.method34183(array2, 2 * this.field26437, b);
                this.field26442.method34183(array2, 3 * this.field26437, b);
                for (int n14 = 0; n14 < this.field26437; ++n14) {
                    final int n15 = n14 * this.field26438 + n10;
                    final int n16 = this.field26437 + n14;
                    array[n15] = array2[n14];
                    array[n15 + 1] = array2[n16];
                    array[n15 + 2] = array2[n16 + this.field26437];
                    array[n15 + 3] = array2[n16 + 2 * this.field26437];
                }
            }
        }
    }
    
    private void method20378(final int n, final Class22 class22, final boolean b) {
        long n2 = 4L * this.field26439;
        if (this.field26440 != 2L) {
            if (this.field26440 < 2L) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final Class22 class23 = new Class22(n2);
        if (this.field26440 <= 2L) {
            if (this.field26440 == 2L) {
                for (long n3 = 0L; n3 < this.field26439; ++n3) {
                    final long n4 = n3 * this.field26440;
                    class23.method169(n3, class22.method135(n4));
                    class23.method169(this.field26439 + n3, class22.method135(n4 + 1L));
                }
                if (n != -1) {
                    this.field26442.method34188(class23, 0L, b);
                    this.field26442.method34188(class23, this.field26439, b);
                }
                else {
                    this.field26442.method34184(class23, 0L, b);
                    this.field26442.method34184(class23, this.field26439, b);
                }
                for (long n5 = 0L; n5 < this.field26439; ++n5) {
                    final long n6 = n5 * this.field26440;
                    class22.method169(n6, class23.method135(n5));
                    class22.method169(n6 + 1L, class23.method135(this.field26439 + n5));
                }
            }
        }
        else if (n != -1) {
            for (long n7 = 0L; n7 < this.field26440; n7 += 4L) {
                for (long n8 = 0L; n8 < this.field26439; ++n8) {
                    final long n9 = n8 * this.field26440 + n7;
                    final long n10 = this.field26439 + n8;
                    class23.method169(n8, class22.method135(n9));
                    class23.method169(n10, class22.method135(n9 + 1L));
                    class23.method169(n10 + this.field26439, class22.method135(n9 + 2L));
                    class23.method169(n10 + 2L * this.field26439, class22.method135(n9 + 3L));
                }
                this.field26442.method34188(class23, 0L, b);
                this.field26442.method34188(class23, this.field26439, b);
                this.field26442.method34188(class23, 2L * this.field26439, b);
                this.field26442.method34188(class23, 3L * this.field26439, b);
                for (long n11 = 0L; n11 < this.field26439; ++n11) {
                    final long n12 = n11 * this.field26440 + n7;
                    final long n13 = this.field26439 + n11;
                    class22.method169(n12, class23.method135(n11));
                    class22.method169(n12 + 1L, class23.method135(n13));
                    class22.method169(n12 + 2L, class23.method135(n13 + this.field26439));
                    class22.method169(n12 + 3L, class23.method135(n13 + 2L * this.field26439));
                }
            }
        }
        else {
            for (long n14 = 0L; n14 < this.field26440; n14 += 4L) {
                for (long n15 = 0L; n15 < this.field26439; ++n15) {
                    final long n16 = n15 * this.field26440 + n14;
                    final long n17 = this.field26439 + n15;
                    class23.method169(n15, class22.method135(n16));
                    class23.method169(n17, class22.method135(n16 + 1L));
                    class23.method169(n17 + this.field26439, class22.method135(n16 + 2L));
                    class23.method169(n17 + 2L * this.field26439, class22.method135(n16 + 3L));
                }
                this.field26442.method34184(class23, 0L, b);
                this.field26442.method34184(class23, this.field26439, b);
                this.field26442.method34184(class23, 2L * this.field26439, b);
                this.field26442.method34184(class23, 3L * this.field26439, b);
                for (long n18 = 0L; n18 < this.field26439; ++n18) {
                    final long n19 = n18 * this.field26440 + n14;
                    final long n20 = this.field26439 + n18;
                    class22.method169(n19, class23.method135(n18));
                    class22.method169(n19 + 1L, class23.method135(n20));
                    class22.method169(n19 + 2L, class23.method135(n20 + this.field26439));
                    class22.method169(n19 + 3L, class23.method135(n20 + 2L * this.field26439));
                }
            }
        }
    }
    
    private void method20379(final int n, final float[][] array, final boolean b) {
        int n2 = 4 * this.field26437;
        if (this.field26438 != 2) {
            if (this.field26438 < 2) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (this.field26438 <= 2) {
            if (this.field26438 == 2) {
                for (int i = 0; i < this.field26437; ++i) {
                    array2[i] = array[i][0];
                    array2[this.field26437 + i] = array[i][1];
                }
                if (n != -1) {
                    this.field26442.method34187(array2, 0, b);
                    this.field26442.method34187(array2, this.field26437, b);
                }
                else {
                    this.field26442.method34183(array2, 0, b);
                    this.field26442.method34183(array2, this.field26437, b);
                }
                for (int j = 0; j < this.field26437; ++j) {
                    array[j][0] = array2[j];
                    array[j][1] = array2[this.field26437 + j];
                }
            }
        }
        else if (n != -1) {
            for (int k = 0; k < this.field26438; k += 4) {
                for (int l = 0; l < this.field26437; ++l) {
                    final int n3 = this.field26437 + l;
                    array2[l] = array[l][k];
                    array2[n3] = array[l][k + 1];
                    array2[n3 + this.field26437] = array[l][k + 2];
                    array2[n3 + 2 * this.field26437] = array[l][k + 3];
                }
                this.field26442.method34187(array2, 0, b);
                this.field26442.method34187(array2, this.field26437, b);
                this.field26442.method34187(array2, 2 * this.field26437, b);
                this.field26442.method34187(array2, 3 * this.field26437, b);
                for (int n4 = 0; n4 < this.field26437; ++n4) {
                    final int n5 = this.field26437 + n4;
                    array[n4][k] = array2[n4];
                    array[n4][k + 1] = array2[n5];
                    array[n4][k + 2] = array2[n5 + this.field26437];
                    array[n4][k + 3] = array2[n5 + 2 * this.field26437];
                }
            }
        }
        else {
            for (int n6 = 0; n6 < this.field26438; n6 += 4) {
                for (int n7 = 0; n7 < this.field26437; ++n7) {
                    final int n8 = this.field26437 + n7;
                    array2[n7] = array[n7][n6];
                    array2[n8] = array[n7][n6 + 1];
                    array2[n8 + this.field26437] = array[n7][n6 + 2];
                    array2[n8 + 2 * this.field26437] = array[n7][n6 + 3];
                }
                this.field26442.method34183(array2, 0, b);
                this.field26442.method34183(array2, this.field26437, b);
                this.field26442.method34183(array2, 2 * this.field26437, b);
                this.field26442.method34183(array2, 3 * this.field26437, b);
                for (int n9 = 0; n9 < this.field26437; ++n9) {
                    final int n10 = this.field26437 + n9;
                    array[n9][n6] = array2[n9];
                    array[n9][n6 + 1] = array2[n10];
                    array[n9][n6 + 2] = array2[n10 + this.field26437];
                    array[n9][n6 + 3] = array2[n10 + 2 * this.field26437];
                }
            }
        }
    }
}
