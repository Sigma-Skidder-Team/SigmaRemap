// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class7706
{
    private final int field30625;
    private final int field30626;
    private final long field30627;
    private final long field30628;
    private final Class8673 field30629;
    private final Class8673 field30630;
    private boolean field30631;
    private boolean field30632;
    
    public Class7706(final long field30627, final long field30628) {
        this.field30631 = false;
        this.field30632 = false;
        if (field30627 > 1L && field30628 > 1L) {
            this.field30625 = (int)field30627;
            this.field30626 = (int)field30628;
            this.field30627 = field30627;
            this.field30628 = field30628;
            if (field30627 * field30628 >= Class9133.method33160()) {
                this.field30632 = true;
            }
            if (Class9133.method33175(field30627)) {
                if (Class9133.method33175(field30628)) {
                    this.field30631 = true;
                }
            }
            Class9133.method33169(field30627 * field30628 > Class11.method177());
            this.field30630 = new Class8673(field30627);
            if (field30627 != field30628) {
                this.field30629 = new Class8673(field30628);
            }
            else {
                this.field30629 = this.field30630;
            }
            return;
        }
        throw new IllegalArgumentException("rows and columns must be greater than 1");
    }
    
    public void method24561(final float[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field30631) {
            if (method27224 > 1 && this.field30632) {
                this.method24567(-1, array, b);
                this.method24570(-1, array, b);
            }
            else {
                this.method24573(-1, array, b);
                for (int i = 0; i < this.field30625; ++i) {
                    this.field30629.method29691(array, i * this.field30626, b);
                }
            }
        }
        else if (method27224 > 1 && this.field30632 && this.field30625 >= method27224 && this.field30626 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field30625 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1651(this, n2, (j == method27224 - 1) ? this.field30625 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field30626 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1571(this, n4, (k == method27224 - 1) ? this.field30626 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field30625; ++l) {
                this.field30629.method29691(array, l * this.field30626, b);
            }
            final float[] array3 = new float[this.field30625];
            for (int n5 = 0; n5 < this.field30626; ++n5) {
                for (int n6 = 0; n6 < this.field30625; ++n6) {
                    array3[n6] = array[n6 * this.field30626 + n5];
                }
                this.field30630.method29689(array3, b);
                for (int n7 = 0; n7 < this.field30625; ++n7) {
                    array[n7 * this.field30626 + n5] = array3[n7];
                }
            }
        }
    }
    
    public void method24562(final Class22 class22, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field30631) {
            if (method27224 > 1 && this.field30632) {
                this.method24568(-1, class22, b);
                this.method24571(-1, class22, b);
            }
            else {
                this.method24574(-1, class22, b);
                for (long n = 0L; n < this.field30627; ++n) {
                    this.field30629.method29692(class22, n * this.field30628, b);
                }
            }
        }
        else if (method27224 > 1 && this.field30632 && this.field30627 >= method27224 && this.field30628 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n2 = this.field30627 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n3 = i * n2;
                array[i] = Class8216.method27227(new Class1477(this, n3, (i == method27224 - 1) ? this.field30627 : (n3 + n2), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final long n4 = this.field30628 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final long n5 = j * n4;
                array[j] = Class8216.method27227(new Class1235(this, n5, (j == method27224 - 1) ? this.field30628 : (n5 + n4), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field30627; ++n6) {
                this.field30629.method29692(class22, n6 * this.field30628, b);
            }
            final Class22 class23 = new Class22(this.field30627, false);
            for (long n7 = 0L; n7 < this.field30628; ++n7) {
                for (long n8 = 0L; n8 < this.field30627; ++n8) {
                    class23.method169(n8, class22.method135(n8 * this.field30628 + n7));
                }
                this.field30630.method29690(class23, b);
                for (long n9 = 0L; n9 < this.field30627; ++n9) {
                    class22.method169(n9 * this.field30628 + n7, class23.method135(n9));
                }
            }
        }
    }
    
    public void method24563(final float[][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field30631) {
            if (method27224 > 1 && this.field30632) {
                this.method24569(-1, array, b);
                this.method24572(-1, array, b);
            }
            else {
                this.method24575(-1, array, b);
                for (int i = 0; i < this.field30625; ++i) {
                    this.field30629.method29689(array[i], b);
                }
            }
        }
        else if (method27224 > 1 && this.field30632 && this.field30625 >= method27224 && this.field30626 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field30625 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1353(this, n2, (j == method27224 - 1) ? this.field30625 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field30626 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1148(this, n4, (k == method27224 - 1) ? this.field30626 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field30625; ++l) {
                this.field30629.method29689(array[l], b);
            }
            final float[] array3 = new float[this.field30625];
            for (int n5 = 0; n5 < this.field30626; ++n5) {
                for (int n6 = 0; n6 < this.field30625; ++n6) {
                    array3[n6] = array[n6][n5];
                }
                this.field30630.method29689(array3, b);
                for (int n7 = 0; n7 < this.field30625; ++n7) {
                    array[n7][n5] = array3[n7];
                }
            }
        }
    }
    
    public void method24564(final float[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field30631) {
            if (method27224 > 1 && this.field30632) {
                this.method24567(1, array, b);
                this.method24570(1, array, b);
            }
            else {
                this.method24573(1, array, b);
                for (int i = 0; i < this.field30625; ++i) {
                    this.field30629.method29695(array, i * this.field30626, b);
                }
            }
        }
        else if (method27224 > 1 && this.field30632 && this.field30625 >= method27224 && this.field30626 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field30625 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1165(this, n2, (j == method27224 - 1) ? this.field30625 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field30626 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1049(this, n4, (k == method27224 - 1) ? this.field30626 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field30625; ++l) {
                this.field30629.method29695(array, l * this.field30626, b);
            }
            final float[] array3 = new float[this.field30625];
            for (int n5 = 0; n5 < this.field30626; ++n5) {
                for (int n6 = 0; n6 < this.field30625; ++n6) {
                    array3[n6] = array[n6 * this.field30626 + n5];
                }
                this.field30630.method29693(array3, b);
                for (int n7 = 0; n7 < this.field30625; ++n7) {
                    array[n7 * this.field30626 + n5] = array3[n7];
                }
            }
        }
    }
    
    public void method24565(final Class22 class22, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field30631) {
            if (method27224 > 1 && this.field30632) {
                this.method24568(1, class22, b);
                this.method24571(1, class22, b);
            }
            else {
                this.method24574(1, class22, b);
                for (long n = 0L; n < this.field30627; ++n) {
                    this.field30629.method29696(class22, n * this.field30628, b);
                }
            }
        }
        else if (method27224 > 1 && this.field30632 && this.field30627 >= method27224 && this.field30628 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n2 = this.field30627 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n3 = i * n2;
                array[i] = Class8216.method27227(new Class1639(this, n3, (i == method27224 - 1) ? this.field30627 : (n3 + n2), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final long n4 = this.field30628 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final long n5 = j * n4;
                array[j] = Class8216.method27227(new Class1501(this, n5, (j == method27224 - 1) ? this.field30628 : (n5 + n4), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field30627; ++n6) {
                this.field30629.method29696(class22, n6 * this.field30628, b);
            }
            final Class22 class23 = new Class22(this.field30627, false);
            for (long n7 = 0L; n7 < this.field30628; ++n7) {
                for (long n8 = 0L; n8 < this.field30627; ++n8) {
                    class23.method169(n8, class22.method135(n8 * this.field30628 + n7));
                }
                this.field30630.method29694(class23, b);
                for (long n9 = 0L; n9 < this.field30627; ++n9) {
                    class22.method169(n9 * this.field30628 + n7, class23.method135(n9));
                }
            }
        }
    }
    
    public void method24566(final float[][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field30631) {
            if (method27224 > 1 && this.field30632) {
                this.method24569(1, array, b);
                this.method24572(1, array, b);
            }
            else {
                this.method24575(1, array, b);
                for (int i = 0; i < this.field30625; ++i) {
                    this.field30629.method29693(array[i], b);
                }
            }
        }
        else if (method27224 > 1 && this.field30632 && this.field30625 >= method27224 && this.field30626 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field30625 / method27224;
            for (int j = 0; j < method27224; ++j) {
                final int n2 = j * n;
                array2[j] = Class8216.method27227(new Class1119(this, n2, (j == method27224 - 1) ? this.field30625 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            final int n3 = this.field30626 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n4 = k * n3;
                array2[k] = Class8216.method27227(new Class1030(this, n4, (k == method27224 - 1) ? this.field30626 : (n4 + n3), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int l = 0; l < this.field30625; ++l) {
                this.field30629.method29693(array[l], b);
            }
            final float[] array3 = new float[this.field30625];
            for (int n5 = 0; n5 < this.field30626; ++n5) {
                for (int n6 = 0; n6 < this.field30625; ++n6) {
                    array3[n6] = array[n6][n5];
                }
                this.field30630.method29693(array3, b);
                for (int n7 = 0; n7 < this.field30625; ++n7) {
                    array[n7][n5] = array3[n7];
                }
            }
        }
    }
    
    private void method24567(final int n, final float[] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field30626, Class8216.method27224());
        int n2 = 4 * this.field30625;
        if (this.field30626 == 2) {
            n2 >>= 1;
        }
        else if (this.field30626 < 2) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final int n4 = method24128;
        final Future[] array2 = new Future[method24128];
        for (int i = 0; i < method24128; ++i) {
            array2[i] = Class8216.method27227(new Class1628(this, n3, n, i, n4, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method24568(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)Class7640.method24129(this.field30628, Class8216.method27224());
        long n3 = 4L * this.field30627;
        if (this.field30628 == 2L) {
            n3 >>= 1;
        }
        else if (this.field30628 < 2L) {
            n3 >>= 2;
        }
        final long n4 = n3;
        final long n5 = n2;
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1221(this, n4, n, i, n5, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method24569(final int n, final float[][] array, final boolean b) {
        final int method24128 = Class7640.method24128(this.field30626, Class8216.method27224());
        int n2 = 4 * this.field30625;
        if (this.field30626 == 2) {
            n2 >>= 1;
        }
        else if (this.field30626 < 2) {
            n2 >>= 2;
        }
        final int n3 = n2;
        final int n4 = method24128;
        final Future[] array2 = new Future[method24128];
        for (int i = 0; i < method24128; ++i) {
            array2[i] = Class8216.method27227(new Class1280(this, n3, n, i, n4, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method24570(final int n, final float[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field30625) ? this.field30625 : Class8216.method27224();
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1388(this, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method24571(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field30627) ? this.field30627 : Class8216.method27224());
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class947(this, n, i, n2, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method24572(final int n, final float[][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field30625) ? this.field30625 : Class8216.method27224();
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class972(this, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class7706.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method24573(final int n, final float[] array, final boolean b) {
        int n2 = 4 * this.field30625;
        if (this.field30626 != 2) {
            if (this.field30626 < 2) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (this.field30626 <= 2) {
            if (this.field30626 == 2) {
                for (int i = 0; i < this.field30625; ++i) {
                    final int n3 = i * this.field30626;
                    array2[i] = array[n3];
                    array2[this.field30625 + i] = array[n3 + 1];
                }
                if (n != -1) {
                    this.field30630.method29695(array2, 0, b);
                    this.field30630.method29695(array2, this.field30625, b);
                }
                else {
                    this.field30630.method29691(array2, 0, b);
                    this.field30630.method29691(array2, this.field30625, b);
                }
                for (int j = 0; j < this.field30625; ++j) {
                    final int n4 = j * this.field30626;
                    array[n4] = array2[j];
                    array[n4 + 1] = array2[this.field30625 + j];
                }
            }
        }
        else if (n != -1) {
            for (int k = 0; k < this.field30626; k += 4) {
                for (int l = 0; l < this.field30625; ++l) {
                    final int n5 = l * this.field30626 + k;
                    final int n6 = this.field30625 + l;
                    array2[l] = array[n5];
                    array2[n6] = array[n5 + 1];
                    array2[n6 + this.field30625] = array[n5 + 2];
                    array2[n6 + 2 * this.field30625] = array[n5 + 3];
                }
                this.field30630.method29695(array2, 0, b);
                this.field30630.method29695(array2, this.field30625, b);
                this.field30630.method29695(array2, 2 * this.field30625, b);
                this.field30630.method29695(array2, 3 * this.field30625, b);
                for (int n7 = 0; n7 < this.field30625; ++n7) {
                    final int n8 = n7 * this.field30626 + k;
                    final int n9 = this.field30625 + n7;
                    array[n8] = array2[n7];
                    array[n8 + 1] = array2[n9];
                    array[n8 + 2] = array2[n9 + this.field30625];
                    array[n8 + 3] = array2[n9 + 2 * this.field30625];
                }
            }
        }
        else {
            for (int n10 = 0; n10 < this.field30626; n10 += 4) {
                for (int n11 = 0; n11 < this.field30625; ++n11) {
                    final int n12 = n11 * this.field30626 + n10;
                    final int n13 = this.field30625 + n11;
                    array2[n11] = array[n12];
                    array2[n13] = array[n12 + 1];
                    array2[n13 + this.field30625] = array[n12 + 2];
                    array2[n13 + 2 * this.field30625] = array[n12 + 3];
                }
                this.field30630.method29691(array2, 0, b);
                this.field30630.method29691(array2, this.field30625, b);
                this.field30630.method29691(array2, 2 * this.field30625, b);
                this.field30630.method29691(array2, 3 * this.field30625, b);
                for (int n14 = 0; n14 < this.field30625; ++n14) {
                    final int n15 = n14 * this.field30626 + n10;
                    final int n16 = this.field30625 + n14;
                    array[n15] = array2[n14];
                    array[n15 + 1] = array2[n16];
                    array[n15 + 2] = array2[n16 + this.field30625];
                    array[n15 + 3] = array2[n16 + 2 * this.field30625];
                }
            }
        }
    }
    
    private void method24574(final int n, final Class22 class22, final boolean b) {
        long n2 = 4L * this.field30627;
        if (this.field30628 != 2L) {
            if (this.field30628 < 2L) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final Class22 class23 = new Class22(n2);
        if (this.field30628 <= 2L) {
            if (this.field30628 == 2L) {
                for (long n3 = 0L; n3 < this.field30627; ++n3) {
                    final long n4 = n3 * this.field30628;
                    class23.method169(n3, class22.method135(n4));
                    class23.method169(this.field30627 + n3, class22.method135(n4 + 1L));
                }
                if (n != -1) {
                    this.field30630.method29696(class23, 0L, b);
                    this.field30630.method29696(class23, this.field30627, b);
                }
                else {
                    this.field30630.method29692(class23, 0L, b);
                    this.field30630.method29692(class23, this.field30627, b);
                }
                for (long n5 = 0L; n5 < this.field30627; ++n5) {
                    final long n6 = n5 * this.field30628;
                    class22.method169(n6, class23.method135(n5));
                    class22.method169(n6 + 1L, class23.method135(this.field30627 + n5));
                }
            }
        }
        else if (n != -1) {
            for (long n7 = 0L; n7 < this.field30628; n7 += 4L) {
                for (long n8 = 0L; n8 < this.field30627; ++n8) {
                    final long n9 = n8 * this.field30628 + n7;
                    final long n10 = this.field30627 + n8;
                    class23.method169(n8, class22.method135(n9));
                    class23.method169(n10, class22.method135(n9 + 1L));
                    class23.method169(n10 + this.field30627, class22.method135(n9 + 2L));
                    class23.method169(n10 + 2L * this.field30627, class22.method135(n9 + 3L));
                }
                this.field30630.method29696(class23, 0L, b);
                this.field30630.method29696(class23, this.field30627, b);
                this.field30630.method29696(class23, 2L * this.field30627, b);
                this.field30630.method29696(class23, 3L * this.field30627, b);
                for (long n11 = 0L; n11 < this.field30627; ++n11) {
                    final long n12 = n11 * this.field30628 + n7;
                    final long n13 = this.field30627 + n11;
                    class22.method169(n12, class23.method135(n11));
                    class22.method169(n12 + 1L, class23.method135(n13));
                    class22.method169(n12 + 2L, class23.method135(n13 + this.field30627));
                    class22.method169(n12 + 3L, class23.method135(n13 + 2L * this.field30627));
                }
            }
        }
        else {
            for (long n14 = 0L; n14 < this.field30628; n14 += 4L) {
                for (long n15 = 0L; n15 < this.field30627; ++n15) {
                    final long n16 = n15 * this.field30628 + n14;
                    final long n17 = this.field30627 + n15;
                    class23.method169(n15, class22.method135(n16));
                    class23.method169(n17, class22.method135(n16 + 1L));
                    class23.method169(n17 + this.field30627, class22.method135(n16 + 2L));
                    class23.method169(n17 + 2L * this.field30627, class22.method135(n16 + 3L));
                }
                this.field30630.method29692(class23, 0L, b);
                this.field30630.method29692(class23, this.field30627, b);
                this.field30630.method29692(class23, 2L * this.field30627, b);
                this.field30630.method29692(class23, 3L * this.field30627, b);
                for (long n18 = 0L; n18 < this.field30627; ++n18) {
                    final long n19 = n18 * this.field30628 + n14;
                    final long n20 = this.field30627 + n18;
                    class22.method169(n19, class23.method135(n18));
                    class22.method169(n19 + 1L, class23.method135(n20));
                    class22.method169(n19 + 2L, class23.method135(n20 + this.field30627));
                    class22.method169(n19 + 3L, class23.method135(n20 + 2L * this.field30627));
                }
            }
        }
    }
    
    private void method24575(final int n, final float[][] array, final boolean b) {
        int n2 = 4 * this.field30625;
        if (this.field30626 != 2) {
            if (this.field30626 < 2) {
                n2 >>= 2;
            }
        }
        else {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (this.field30626 <= 2) {
            if (this.field30626 == 2) {
                for (int i = 0; i < this.field30625; ++i) {
                    array2[i] = array[i][0];
                    array2[this.field30625 + i] = array[i][1];
                }
                if (n != -1) {
                    this.field30630.method29695(array2, 0, b);
                    this.field30630.method29695(array2, this.field30625, b);
                }
                else {
                    this.field30630.method29691(array2, 0, b);
                    this.field30630.method29691(array2, this.field30625, b);
                }
                for (int j = 0; j < this.field30625; ++j) {
                    array[j][0] = array2[j];
                    array[j][1] = array2[this.field30625 + j];
                }
            }
        }
        else if (n != -1) {
            for (int k = 0; k < this.field30626; k += 4) {
                for (int l = 0; l < this.field30625; ++l) {
                    final int n3 = this.field30625 + l;
                    array2[l] = array[l][k];
                    array2[n3] = array[l][k + 1];
                    array2[n3 + this.field30625] = array[l][k + 2];
                    array2[n3 + 2 * this.field30625] = array[l][k + 3];
                }
                this.field30630.method29695(array2, 0, b);
                this.field30630.method29695(array2, this.field30625, b);
                this.field30630.method29695(array2, 2 * this.field30625, b);
                this.field30630.method29695(array2, 3 * this.field30625, b);
                for (int n4 = 0; n4 < this.field30625; ++n4) {
                    final int n5 = this.field30625 + n4;
                    array[n4][k] = array2[n4];
                    array[n4][k + 1] = array2[n5];
                    array[n4][k + 2] = array2[n5 + this.field30625];
                    array[n4][k + 3] = array2[n5 + 2 * this.field30625];
                }
            }
        }
        else {
            for (int n6 = 0; n6 < this.field30626; n6 += 4) {
                for (int n7 = 0; n7 < this.field30625; ++n7) {
                    final int n8 = this.field30625 + n7;
                    array2[n7] = array[n7][n6];
                    array2[n8] = array[n7][n6 + 1];
                    array2[n8 + this.field30625] = array[n7][n6 + 2];
                    array2[n8 + 2 * this.field30625] = array[n7][n6 + 3];
                }
                this.field30630.method29691(array2, 0, b);
                this.field30630.method29691(array2, this.field30625, b);
                this.field30630.method29691(array2, 2 * this.field30625, b);
                this.field30630.method29691(array2, 3 * this.field30625, b);
                for (int n9 = 0; n9 < this.field30625; ++n9) {
                    final int n10 = this.field30625 + n9;
                    array[n9][n6] = array2[n9];
                    array[n9][n6 + 1] = array2[n10];
                    array[n9][n6 + 2] = array2[n10 + this.field30625];
                    array[n9][n6 + 3] = array2[n10 + 2 * this.field30625];
                }
            }
        }
    }
}
