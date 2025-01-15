// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class4406
{
    private int field19730;
    private int field19731;
    private long field19732;
    private long field19733;
    private Class8806 field19734;
    private Class8806 field19735;
    private boolean field19736;
    private boolean field19737;
    
    public Class4406(final long field19732, final long field19733) {
        this.field19736 = false;
        this.field19737 = false;
        if (field19732 > 1L && field19733 > 1L) {
            this.field19730 = (int)field19732;
            this.field19731 = (int)field19733;
            this.field19732 = field19732;
            this.field19733 = field19733;
            if (field19732 * field19733 >= Class9133.method33160()) {
                this.field19737 = true;
            }
            if (Class9133.method33175(field19732)) {
                if (Class9133.method33175(field19733)) {
                    this.field19736 = true;
                }
            }
            Class9133.method33169(field19732 * field19733 > Class11.method177());
            this.field19735 = new Class8806(field19732);
            if (field19732 != field19733) {
                this.field19734 = new Class8806(field19733);
            }
            else {
                this.field19734 = this.field19735;
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be greater than 1");
    }
    
    public void method13317(final double[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field19736) {
            if (method27224 > 1 && this.field19737) {
                this.method13323(-1, array, b);
                this.method13326(-1, array, b);
            }
            else {
                this.method13329(-1, array, b);
                for (int i = 0; i < this.field19730; ++i) {
                    this.field19734.method30723(array, i * this.field19731, b);
                }
            }
        }
        else if (method27224 > 1 && this.field19737 && this.field19730 >= method27224 && this.field19731 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field19730 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class944(this, n2, (j == method27224 - 1) ? this.field19730 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field19731 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1024(this, n4, (k == method27224 - 1) ? this.field19731 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field19730; ++l) {
                this.field19734.method30723(array, l * this.field19731, b);
            }
            final double[] array3 = new double[this.field19730];
            for (int n5 = 0; n5 < this.field19731; ++n5) {
                for (int n6 = 0; n6 < this.field19730; ++n6) {
                    array3[n6] = array[n6 * this.field19731 + n5];
                }
                this.field19735.method30721(array3, b);
                for (int n7 = 0; n7 < this.field19730; ++n7) {
                    array[n7 * this.field19731 + n5] = array3[n7];
                }
            }
        }
    }
    
    public void method13318(final Class17 class17, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field19736) {
            if (method27224 > 1 && this.field19737) {
                this.method13324(-1, class17, b);
                this.method13327(-1, class17, b);
            }
            else {
                this.method13330(-1, class17, b);
                for (long n = 0L; n < this.field19732; ++n) {
                    this.field19734.method30724(class17, n * this.field19733, b);
                }
            }
        }
        else if (method27224 > 1 && this.field19737 && this.field19732 >= method27224 && this.field19733 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n2 = this.field19732 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n3 = i * n2;
                array[i] = Class8216.method27227(new Class895(this, n3, (i == method27224 - 1) ? this.field19732 : (n3 + n2), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final long n4 = this.field19733 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final long n5 = j * n4;
                array[j] = Class8216.method27227(new Class1198(this, n5, (j == method27224 - 1) ? this.field19733 : (n5 + n4), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field19732; ++n6) {
                this.field19734.method30724(class17, n6 * this.field19733, b);
            }
            final Class17 class18 = new Class17(this.field19732, false);
            for (long n7 = 0L; n7 < this.field19733; ++n7) {
                for (long n8 = 0L; n8 < this.field19732; ++n8) {
                    class18.method171(n8, class17.method137(n8 * this.field19733 + n7));
                }
                this.field19735.method30722(class18, b);
                for (long n9 = 0L; n9 < this.field19732; ++n9) {
                    class17.method171(n9 * this.field19733 + n7, class18.method137(n9));
                }
            }
        }
    }
    
    public void method13319(final double[][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field19736) {
            if (method27224 > 1 && this.field19737) {
                this.method13325(-1, array, b);
                this.method13328(-1, array, b);
            }
            else {
                this.method13331(-1, array, b);
                for (int i = 0; i < this.field19730; ++i) {
                    this.field19734.method30721(array[i], b);
                }
            }
        }
        else if (method27224 > 1 && this.field19737 && this.field19730 >= method27224 && this.field19731 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field19730 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1559(this, n2, (j == method27224 - 1) ? this.field19730 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field19731 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1432(this, n4, (k == method27224 - 1) ? this.field19731 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field19730; ++l) {
                this.field19734.method30721(array[l], b);
            }
            final double[] array3 = new double[this.field19730];
            for (int n5 = 0; n5 < this.field19731; ++n5) {
                for (int n6 = 0; n6 < this.field19730; ++n6) {
                    array3[n6] = array[n6][n5];
                }
                this.field19735.method30721(array3, b);
                for (int n7 = 0; n7 < this.field19730; ++n7) {
                    array[n7][n5] = array3[n7];
                }
            }
        }
    }
    
    public void method13320(final double[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field19736) {
            if (method27224 > 1 && this.field19737) {
                this.method13323(1, array, b);
                this.method13326(1, array, b);
            }
            else {
                this.method13329(1, array, b);
                for (int i = 0; i < this.field19730; ++i) {
                    this.field19734.method30727(array, i * this.field19731, b);
                }
            }
        }
        else if (method27224 > 1 && this.field19737 && this.field19730 >= method27224 && this.field19731 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field19730 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1195(this, n2, (j == method27224 - 1) ? this.field19730 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field19731 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1290(this, n4, (k == method27224 - 1) ? this.field19731 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field19730; ++l) {
                this.field19734.method30727(array, l * this.field19731, b);
            }
            final double[] array3 = new double[this.field19730];
            for (int n5 = 0; n5 < this.field19731; ++n5) {
                for (int n6 = 0; n6 < this.field19730; ++n6) {
                    array3[n6] = array[n6 * this.field19731 + n5];
                }
                this.field19735.method30725(array3, b);
                for (int n7 = 0; n7 < this.field19730; ++n7) {
                    array[n7 * this.field19731 + n5] = array3[n7];
                }
            }
        }
    }
    
    public void method13321(final Class17 class17, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field19736) {
            if (method27224 > 1 && this.field19737) {
                this.method13324(1, class17, b);
                this.method13327(1, class17, b);
            }
            else {
                this.method13330(1, class17, b);
                for (long n = 0L; n < this.field19732; ++n) {
                    this.field19734.method30728(class17, n * this.field19733, b);
                }
            }
        }
        else if (method27224 > 1 && this.field19737 && this.field19732 >= method27224 && this.field19733 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n2 = this.field19732 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n3 = i * n2;
                array[i] = Class8216.method27227(new Class1018(this, n3, (i == method27224 - 1) ? this.field19732 : (n3 + n2), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final long n4 = this.field19733 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final long n5 = j * n4;
                array[j] = Class8216.method27227(new Class1199(this, n5, (j == method27224 - 1) ? this.field19733 : (n5 + n4), class17, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field19732; ++n6) {
                this.field19734.method30728(class17, n6 * this.field19733, b);
            }
            final Class17 class18 = new Class17(this.field19732, false);
            for (long n7 = 0L; n7 < this.field19733; ++n7) {
                for (long n8 = 0L; n8 < this.field19732; ++n8) {
                    class18.method171(n8, class17.method137(n8 * this.field19733 + n7));
                }
                this.field19735.method30726(class18, b);
                for (long n9 = 0L; n9 < this.field19732; ++n9) {
                    class17.method171(n9 * this.field19733 + n7, class18.method137(n9));
                }
            }
        }
    }
    
    public void method13322(final double[][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field19736) {
            if (method27224 > 1 && this.field19737) {
                this.method13325(1, array, b);
                this.method13328(1, array, b);
            }
            else {
                this.method13331(1, array, b);
                for (int i = 0; i < this.field19730; ++i) {
                    this.field19734.method30725(array[i], b);
                }
            }
        }
        else if (method27224 > 1 && this.field19737 && this.field19730 >= method27224 && this.field19731 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field19730 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1273(this, n2, (j == method27224 - 1) ? this.field19730 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field19731 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1348(this, n4, (k == method27224 - 1) ? this.field19731 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field19730; ++l) {
                this.field19734.method30725(array[l], b);
            }
            final double[] array3 = new double[this.field19730];
            for (int n5 = 0; n5 < this.field19731; ++n5) {
                for (int n6 = 0; n6 < this.field19730; ++n6) {
                    array3[n6] = array[n6][n5];
                }
                this.field19735.method30725(array3, b);
                for (int n7 = 0; n7 < this.field19730; ++n7) {
                    array[n7][n5] = array3[n7];
                }
            }
        }
    }
    
    private void method13323(final int n, final double[] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field19731, Class8216.method27224());
        int n2 = 4 * this.field19730;
        if (this.field19731 == 2) {
            n2 >>= 1;
        }
        else if (this.field19731 < 2) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final int n4 = method24128;
        final Future[] array2 = new Future[n4];
        for (int i = 0; i < n4; ++i) {
            array2[i] = Class8216.method27227(new Class1295(this, n3, n, i, n4, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method13324(final int n, final Class17 class17, final boolean b) {
        final int n2 = (int)Class7640.method24129(this.field19733, Class8216.method27224());
        long n3 = 4L * this.field19732;
        if (this.field19733 == 2L) {
            n3 >>= 1;
        }
        else if (this.field19733 < 2L) {
            n3 >>= 2;
        }
        final long n4 = n3;
        final int n5 = n2;
        final Future[] array = new Future[n5];
        for (int i = 0; i < n5; ++i) {
            array[i] = Class8216.method27227(new Class1293(this, n4, n, i, n5, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method13325(final int n, final double[][] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field19731, Class8216.method27224());
        int n2 = 4 * this.field19730;
        if (this.field19731 == 2) {
            n2 >>= 1;
        }
        else if (this.field19731 < 2) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final int n4 = method24128;
        final Future[] array2 = new Future[n4];
        for (int i = 0; i < n4; ++i) {
            array2[i] = Class8216.method27227(new Class971(this, n3, n, i, n4, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method13326(final int n, final double[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field19730) ? this.field19730 : Class8216.method27224();
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1086(this, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method13327(final int n, final Class17 class17, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field19732) ? this.field19732 : Class8216.method27224());
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1486(this, n, i, n2, class17, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method13328(final int n, final double[][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field19730) ? this.field19730 : Class8216.method27224();
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1140(this, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class4406.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method13329(final int n, final double[] array, final boolean b) {
        int n2 = 4 * this.field19730;
        if (this.field19731 != 2) {
            if (this.field19731 < 2) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (this.field19731 <= 2) {
            if (this.field19731 == 2) {
                for (int i = 0; i < this.field19730; ++i) {
                    final int n3 = i * this.field19731;
                    array2[i] = array[n3];
                    array2[this.field19730 + i] = array[n3 + 1];
                }
                if (n != -1) {
                    this.field19735.method30727(array2, 0, b);
                    this.field19735.method30727(array2, this.field19730, b);
                }
                else {
                    this.field19735.method30723(array2, 0, b);
                    this.field19735.method30723(array2, this.field19730, b);
                }
                for (int j = 0; j < this.field19730; ++j) {
                    final int n4 = j * this.field19731;
                    array[n4] = array2[j];
                    array[n4 + 1] = array2[this.field19730 + j];
                }
            }
        }
        else if (n != -1) {
            for (int k = 0; k < this.field19731; k += 4) {
                for (int l = 0; l < this.field19730; ++l) {
                    final int n5 = l * this.field19731 + k;
                    final int n6 = this.field19730 + l;
                    array2[l] = array[n5];
                    array2[n6] = array[n5 + 1];
                    array2[n6 + this.field19730] = array[n5 + 2];
                    array2[n6 + 2 * this.field19730] = array[n5 + 3];
                }
                this.field19735.method30727(array2, 0, b);
                this.field19735.method30727(array2, this.field19730, b);
                this.field19735.method30727(array2, 2 * this.field19730, b);
                this.field19735.method30727(array2, 3 * this.field19730, b);
                for (int n7 = 0; n7 < this.field19730; ++n7) {
                    final int n8 = n7 * this.field19731 + k;
                    final int n9 = this.field19730 + n7;
                    array[n8] = array2[n7];
                    array[n8 + 1] = array2[n9];
                    array[n8 + 2] = array2[n9 + this.field19730];
                    array[n8 + 3] = array2[n9 + 2 * this.field19730];
                }
            }
        }
        else {
            for (int n10 = 0; n10 < this.field19731; n10 += 4) {
                for (int n11 = 0; n11 < this.field19730; ++n11) {
                    final int n12 = n11 * this.field19731 + n10;
                    final int n13 = this.field19730 + n11;
                    array2[n11] = array[n12];
                    array2[n13] = array[n12 + 1];
                    array2[n13 + this.field19730] = array[n12 + 2];
                    array2[n13 + 2 * this.field19730] = array[n12 + 3];
                }
                this.field19735.method30723(array2, 0, b);
                this.field19735.method30723(array2, this.field19730, b);
                this.field19735.method30723(array2, 2 * this.field19730, b);
                this.field19735.method30723(array2, 3 * this.field19730, b);
                for (int n14 = 0; n14 < this.field19730; ++n14) {
                    final int n15 = n14 * this.field19731 + n10;
                    final int n16 = this.field19730 + n14;
                    array[n15] = array2[n14];
                    array[n15 + 1] = array2[n16];
                    array[n15 + 2] = array2[n16 + this.field19730];
                    array[n15 + 3] = array2[n16 + 2 * this.field19730];
                }
            }
        }
    }
    
    private void method13330(final int n, final Class17 class17, final boolean b) {
        long n2 = 4L * this.field19732;
        if (this.field19733 != 2L) {
            if (this.field19733 < 2L) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final Class17 class18 = new Class17(n2);
        if (this.field19733 <= 2L) {
            if (this.field19733 == 2L) {
                for (long n3 = 0L; n3 < this.field19732; ++n3) {
                    final long n4 = n3 * this.field19733;
                    class18.method171(n3, class17.method137(n4));
                    class18.method171(this.field19732 + n3, class17.method137(n4 + 1L));
                }
                if (n != -1) {
                    this.field19735.method30728(class18, 0L, b);
                    this.field19735.method30728(class18, this.field19732, b);
                }
                else {
                    this.field19735.method30724(class18, 0L, b);
                    this.field19735.method30724(class18, this.field19732, b);
                }
                for (long n5 = 0L; n5 < this.field19732; ++n5) {
                    final long n6 = n5 * this.field19733;
                    class17.method171(n6, class18.method137(n5));
                    class17.method171(n6 + 1L, class18.method137(this.field19732 + n5));
                }
            }
        }
        else if (n != -1) {
            for (long n7 = 0L; n7 < this.field19733; n7 += 4L) {
                for (long n8 = 0L; n8 < this.field19732; ++n8) {
                    final long n9 = n8 * this.field19733 + n7;
                    final long n10 = this.field19732 + n8;
                    class18.method171(n8, class17.method137(n9));
                    class18.method171(n10, class17.method137(n9 + 1L));
                    class18.method171(n10 + this.field19732, class17.method137(n9 + 2L));
                    class18.method171(n10 + 2L * this.field19732, class17.method137(n9 + 3L));
                }
                this.field19735.method30728(class18, 0L, b);
                this.field19735.method30728(class18, this.field19732, b);
                this.field19735.method30728(class18, 2L * this.field19732, b);
                this.field19735.method30728(class18, 3L * this.field19732, b);
                for (long n11 = 0L; n11 < this.field19732; ++n11) {
                    final long n12 = n11 * this.field19733 + n7;
                    final long n13 = this.field19732 + n11;
                    class17.method171(n12, class18.method137(n11));
                    class17.method171(n12 + 1L, class18.method137(n13));
                    class17.method171(n12 + 2L, class18.method137(n13 + this.field19732));
                    class17.method171(n12 + 3L, class18.method137(n13 + 2L * this.field19732));
                }
            }
        }
        else {
            for (long n14 = 0L; n14 < this.field19733; n14 += 4L) {
                for (long n15 = 0L; n15 < this.field19732; ++n15) {
                    final long n16 = n15 * this.field19733 + n14;
                    final long n17 = this.field19732 + n15;
                    class18.method171(n15, class17.method137(n16));
                    class18.method171(n17, class17.method137(n16 + 1L));
                    class18.method171(n17 + this.field19732, class17.method137(n16 + 2L));
                    class18.method171(n17 + 2L * this.field19732, class17.method137(n16 + 3L));
                }
                this.field19735.method30724(class18, 0L, b);
                this.field19735.method30724(class18, this.field19732, b);
                this.field19735.method30724(class18, 2L * this.field19732, b);
                this.field19735.method30724(class18, 3L * this.field19732, b);
                for (long n18 = 0L; n18 < this.field19732; ++n18) {
                    final long n19 = n18 * this.field19733 + n14;
                    final long n20 = this.field19732 + n18;
                    class17.method171(n19, class18.method137(n18));
                    class17.method171(n19 + 1L, class18.method137(n20));
                    class17.method171(n19 + 2L, class18.method137(n20 + this.field19732));
                    class17.method171(n19 + 3L, class18.method137(n20 + 2L * this.field19732));
                }
            }
        }
    }
    
    private void method13331(final int n, final double[][] array, final boolean b) {
        int n2 = 4 * this.field19730;
        if (this.field19731 != 2) {
            if (this.field19731 < 2) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final double[] array2 = new double[n2];
        if (this.field19731 <= 2) {
            if (this.field19731 == 2) {
                for (int i = 0; i < this.field19730; ++i) {
                    array2[i] = array[i][0];
                    array2[this.field19730 + i] = array[i][1];
                }
                if (n != -1) {
                    this.field19735.method30727(array2, 0, b);
                    this.field19735.method30727(array2, this.field19730, b);
                }
                else {
                    this.field19735.method30723(array2, 0, b);
                    this.field19735.method30723(array2, this.field19730, b);
                }
                for (int j = 0; j < this.field19730; ++j) {
                    array[j][0] = array2[j];
                    array[j][1] = array2[this.field19730 + j];
                }
            }
        }
        else if (n != -1) {
            for (int k = 0; k < this.field19731; k += 4) {
                for (int l = 0; l < this.field19730; ++l) {
                    final int n3 = this.field19730 + l;
                    array2[l] = array[l][k];
                    array2[n3] = array[l][k + 1];
                    array2[n3 + this.field19730] = array[l][k + 2];
                    array2[n3 + 2 * this.field19730] = array[l][k + 3];
                }
                this.field19735.method30727(array2, 0, b);
                this.field19735.method30727(array2, this.field19730, b);
                this.field19735.method30727(array2, 2 * this.field19730, b);
                this.field19735.method30727(array2, 3 * this.field19730, b);
                for (int n4 = 0; n4 < this.field19730; ++n4) {
                    final int n5 = this.field19730 + n4;
                    array[n4][k] = array2[n4];
                    array[n4][k + 1] = array2[n5];
                    array[n4][k + 2] = array2[n5 + this.field19730];
                    array[n4][k + 3] = array2[n5 + 2 * this.field19730];
                }
            }
        }
        else {
            for (int n6 = 0; n6 < this.field19731; n6 += 4) {
                for (int n7 = 0; n7 < this.field19730; ++n7) {
                    final int n8 = this.field19730 + n7;
                    array2[n7] = array[n7][n6];
                    array2[n8] = array[n7][n6 + 1];
                    array2[n8 + this.field19730] = array[n7][n6 + 2];
                    array2[n8 + 2 * this.field19730] = array[n7][n6 + 3];
                }
                this.field19735.method30723(array2, 0, b);
                this.field19735.method30723(array2, this.field19730, b);
                this.field19735.method30723(array2, 2 * this.field19730, b);
                this.field19735.method30723(array2, 3 * this.field19730, b);
                for (int n9 = 0; n9 < this.field19730; ++n9) {
                    final int n10 = this.field19730 + n9;
                    array[n9][n6] = array2[n9];
                    array[n9][n6 + 1] = array2[n10];
                    array[n9][n6 + 2] = array2[n10 + this.field19730];
                    array[n9][n6 + 3] = array2[n10 + 2 * this.field19730];
                }
            }
        }
    }
}
