// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public class Class9117
{
    private int field38622;
    private long field38623;
    private int field38624;
    private long field38625;
    private int field38626;
    private long field38627;
    private int field38628;
    private long field38629;
    private int field38630;
    private long field38631;
    private Class8673 field38632;
    private Class8673 field38633;
    private Class8673 field38634;
    private boolean field38635;
    private boolean field38636;
    
    public Class9117(final long field38623, final long field38624, final long n) {
        this.field38635 = false;
        this.field38636 = false;
        if (field38623 > 1L) {
            if (field38624 > 1L) {
                if (n > 1L) {
                    this.field38622 = (int)field38623;
                    this.field38624 = (int)field38624;
                    this.field38626 = (int)n;
                    this.field38623 = field38623;
                    this.field38625 = field38624;
                    this.field38627 = n;
                    this.field38628 = (int)(field38624 * n);
                    this.field38630 = (int)n;
                    this.field38629 = field38624 * n;
                    this.field38631 = n;
                    if (field38623 * field38624 * n >= Class9133.method33161()) {
                        this.field38636 = true;
                    }
                    if (Class9133.method33175(field38623)) {
                        if (Class9133.method33175(field38624)) {
                            if (Class9133.method33175(n)) {
                                this.field38635 = true;
                            }
                        }
                    }
                    Class9133.method33169(field38623 * field38624 * n > Class11.method177());
                    this.field38632 = new Class8673(field38623);
                    if (field38623 != field38624) {
                        this.field38633 = new Class8673(field38624);
                    }
                    else {
                        this.field38633 = this.field38632;
                    }
                    if (field38623 != n) {
                        if (field38624 != n) {
                            this.field38634 = new Class8673(n);
                        }
                        else {
                            this.field38634 = this.field38633;
                        }
                    }
                    else {
                        this.field38634 = this.field38632;
                    }
                    return;
                }
            }
        }
        throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
    }
    
    public void method32984(final float[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field38635) {
            if (method27224 > 1 && this.field38636) {
                this.method32996(-1, array, b);
                this.method32999(-1, array, b);
            }
            else {
                this.method32990(-1, array, b);
                this.method32993(-1, array, b);
            }
        }
        else if (method27224 > 1 && this.field38636 && this.field38622 >= method27224 && this.field38624 >= method27224 && this.field38626 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field38622 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1308(this, n2, (i == method27224 - 1) ? this.field38622 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1573(this, n3, (j == method27224 - 1) ? this.field38622 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field38624 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1152(this, n5, (k == method27224 - 1) ? this.field38624 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field38622; ++l) {
                final int n6 = l * this.field38628;
                for (int n7 = 0; n7 < this.field38624; ++n7) {
                    this.field38634.method29691(array, n6 + n7 * this.field38630, b);
                }
            }
            final float[] array3 = new float[this.field38624];
            for (int n8 = 0; n8 < this.field38622; ++n8) {
                final int n9 = n8 * this.field38628;
                for (int n10 = 0; n10 < this.field38626; ++n10) {
                    for (int n11 = 0; n11 < this.field38624; ++n11) {
                        array3[n11] = array[n9 + n11 * this.field38630 + n10];
                    }
                    this.field38633.method29689(array3, b);
                    for (int n12 = 0; n12 < this.field38624; ++n12) {
                        array[n9 + n12 * this.field38630 + n10] = array3[n12];
                    }
                }
            }
            final float[] array4 = new float[this.field38622];
            for (int n13 = 0; n13 < this.field38624; ++n13) {
                final int n14 = n13 * this.field38630;
                for (int n15 = 0; n15 < this.field38626; ++n15) {
                    for (int n16 = 0; n16 < this.field38622; ++n16) {
                        array4[n16] = array[n16 * this.field38628 + n14 + n15];
                    }
                    this.field38632.method29689(array4, b);
                    for (int n17 = 0; n17 < this.field38622; ++n17) {
                        array[n17 * this.field38628 + n14 + n15] = array4[n17];
                    }
                }
            }
        }
    }
    
    public void method32985(final Class22 class22, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field38635) {
            if (method27224 > 1 && this.field38636) {
                this.method32997(-1, class22, b);
                this.method33000(-1, class22, b);
            }
            else {
                this.method32991(-1, class22, b);
                this.method32994(-1, class22, b);
            }
        }
        else if (method27224 > 1 && this.field38636 && this.field38623 >= method27224 && this.field38625 >= method27224 && this.field38627 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n = this.field38623 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n2 = i * n;
                array[i] = Class8216.method27227(new Class1596(this, n2, (i == method27224 - 1) ? this.field38623 : (n2 + n), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final long n3 = j * n;
                array[j] = Class8216.method27227(new Class1017(this, n3, (j == method27224 - 1) ? this.field38623 : (n3 + n), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final long n4 = this.field38625 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final long n5 = k * n4;
                array[k] = Class8216.method27227(new Class943(this, n5, (k == method27224 - 1) ? this.field38625 : (n5 + n4), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field38623; ++n6) {
                final long n7 = n6 * this.field38629;
                for (long n8 = 0L; n8 < this.field38625; ++n8) {
                    this.field38634.method29692(class22, n7 + n8 * this.field38631, b);
                }
            }
            final Class22 class23 = new Class22(this.field38625, false);
            for (long n9 = 0L; n9 < this.field38623; ++n9) {
                final long n10 = n9 * this.field38629;
                for (long n11 = 0L; n11 < this.field38627; ++n11) {
                    for (long n12 = 0L; n12 < this.field38625; ++n12) {
                        class23.method169(n12, class22.method135(n10 + n12 * this.field38631 + n11));
                    }
                    this.field38633.method29690(class23, b);
                    for (long n13 = 0L; n13 < this.field38625; ++n13) {
                        class22.method169(n10 + n13 * this.field38631 + n11, class23.method135(n13));
                    }
                }
            }
            final Class22 class24 = new Class22(this.field38623, false);
            for (long n14 = 0L; n14 < this.field38625; ++n14) {
                final long n15 = n14 * this.field38631;
                for (long n16 = 0L; n16 < this.field38627; ++n16) {
                    for (long n17 = 0L; n17 < this.field38623; ++n17) {
                        class24.method169(n17, class22.method135(n17 * this.field38629 + n15 + n16));
                    }
                    this.field38632.method29690(class24, b);
                    for (long n18 = 0L; n18 < this.field38623; ++n18) {
                        class22.method169(n18 * this.field38629 + n15 + n16, class24.method135(n18));
                    }
                }
            }
        }
    }
    
    public void method32986(final float[][][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field38635) {
            if (method27224 > 1 && this.field38636) {
                this.method32998(-1, array, b);
                this.method33001(-1, array, b);
            }
            else {
                this.method32992(-1, array, b);
                this.method32995(-1, array, b);
            }
        }
        else if (method27224 > 1 && this.field38636 && this.field38622 >= method27224 && this.field38624 >= method27224 && this.field38626 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field38622 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1063(this, n2, (i == method27224 - 1) ? this.field38622 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1176(this, n3, (j == method27224 - 1) ? this.field38622 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field38624 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1449(this, n5, (k == method27224 - 1) ? this.field38624 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field38622; ++l) {
                for (int n6 = 0; n6 < this.field38624; ++n6) {
                    this.field38634.method29689(array[l][n6], b);
                }
            }
            final float[] array3 = new float[this.field38624];
            for (int n7 = 0; n7 < this.field38622; ++n7) {
                for (int n8 = 0; n8 < this.field38626; ++n8) {
                    for (int n9 = 0; n9 < this.field38624; ++n9) {
                        array3[n9] = array[n7][n9][n8];
                    }
                    this.field38633.method29689(array3, b);
                    for (int n10 = 0; n10 < this.field38624; ++n10) {
                        array[n7][n10][n8] = array3[n10];
                    }
                }
            }
            final float[] array4 = new float[this.field38622];
            for (int n11 = 0; n11 < this.field38624; ++n11) {
                for (int n12 = 0; n12 < this.field38626; ++n12) {
                    for (int n13 = 0; n13 < this.field38622; ++n13) {
                        array4[n13] = array[n13][n11][n12];
                    }
                    this.field38632.method29689(array4, b);
                    for (int n14 = 0; n14 < this.field38622; ++n14) {
                        array[n14][n11][n12] = array4[n14];
                    }
                }
            }
        }
    }
    
    public void method32987(final float[] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field38635) {
            if (method27224 > 1 && this.field38636) {
                this.method32996(1, array, b);
                this.method32999(1, array, b);
            }
            else {
                this.method32990(1, array, b);
                this.method32993(1, array, b);
            }
        }
        else if (method27224 > 1 && this.field38636 && this.field38622 >= method27224 && this.field38624 >= method27224 && this.field38626 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field38622 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1372(this, n2, (i == method27224 - 1) ? this.field38622 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1383(this, n3, (j == method27224 - 1) ? this.field38622 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field38624 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1299(this, n5, (k == method27224 - 1) ? this.field38624 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field38622; ++l) {
                final int n6 = l * this.field38628;
                for (int n7 = 0; n7 < this.field38624; ++n7) {
                    this.field38634.method29695(array, n6 + n7 * this.field38630, b);
                }
            }
            final float[] array3 = new float[this.field38624];
            for (int n8 = 0; n8 < this.field38622; ++n8) {
                final int n9 = n8 * this.field38628;
                for (int n10 = 0; n10 < this.field38626; ++n10) {
                    for (int n11 = 0; n11 < this.field38624; ++n11) {
                        array3[n11] = array[n9 + n11 * this.field38630 + n10];
                    }
                    this.field38633.method29693(array3, b);
                    for (int n12 = 0; n12 < this.field38624; ++n12) {
                        array[n9 + n12 * this.field38630 + n10] = array3[n12];
                    }
                }
            }
            final float[] array4 = new float[this.field38622];
            for (int n13 = 0; n13 < this.field38624; ++n13) {
                final int n14 = n13 * this.field38630;
                for (int n15 = 0; n15 < this.field38626; ++n15) {
                    for (int n16 = 0; n16 < this.field38622; ++n16) {
                        array4[n16] = array[n16 * this.field38628 + n14 + n15];
                    }
                    this.field38632.method29693(array4, b);
                    for (int n17 = 0; n17 < this.field38622; ++n17) {
                        array[n17 * this.field38628 + n14 + n15] = array4[n17];
                    }
                }
            }
        }
    }
    
    public void method32988(final Class22 class22, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field38635) {
            if (method27224 > 1 && this.field38636) {
                this.method32997(1, class22, b);
                this.method33000(1, class22, b);
            }
            else {
                this.method32991(1, class22, b);
                this.method32994(1, class22, b);
            }
        }
        else if (method27224 > 1 && this.field38636 && this.field38623 >= method27224 && this.field38625 >= method27224 && this.field38627 >= method27224) {
            final Future[] array = new Future[method27224];
            final long n = this.field38623 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final long n2 = i * n;
                array[i] = Class8216.method27227(new Class1397(this, n2, (i == method27224 - 1) ? this.field38623 : (n2 + n), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final long n3 = j * n;
                array[j] = Class8216.method27227(new Class1594(this, n3, (j == method27224 - 1) ? this.field38623 : (n3 + n), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final long n4 = this.field38625 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final long n5 = k * n4;
                array[k] = Class8216.method27227(new Class1081(this, n5, (k == method27224 - 1) ? this.field38625 : (n5 + n4), class22, b));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (long n6 = 0L; n6 < this.field38623; ++n6) {
                final long n7 = n6 * this.field38629;
                for (long n8 = 0L; n8 < this.field38625; ++n8) {
                    this.field38634.method29696(class22, n7 + n8 * this.field38631, b);
                }
            }
            final Class22 class23 = new Class22(this.field38625, false);
            for (long n9 = 0L; n9 < this.field38623; ++n9) {
                final long n10 = n9 * this.field38629;
                for (long n11 = 0L; n11 < this.field38627; ++n11) {
                    for (long n12 = 0L; n12 < this.field38625; ++n12) {
                        class23.method169(n12, class22.method135(n10 + n12 * this.field38631 + n11));
                    }
                    this.field38633.method29694(class23, b);
                    for (long n13 = 0L; n13 < this.field38625; ++n13) {
                        class22.method169(n10 + n13 * this.field38631 + n11, class23.method135(n13));
                    }
                }
            }
            final Class22 class24 = new Class22(this.field38623, false);
            for (long n14 = 0L; n14 < this.field38625; ++n14) {
                final long n15 = n14 * this.field38631;
                for (long n16 = 0L; n16 < this.field38627; ++n16) {
                    for (long n17 = 0L; n17 < this.field38623; ++n17) {
                        class24.method169(n17, class22.method135(n17 * this.field38629 + n15 + n16));
                    }
                    this.field38632.method29694(class24, b);
                    for (long n18 = 0L; n18 < this.field38623; ++n18) {
                        class22.method169(n18 * this.field38629 + n15 + n16, class24.method135(n18));
                    }
                }
            }
        }
    }
    
    public void method32989(final float[][][] array, final boolean b) {
        final int method27224 = Class8216.method27224();
        if (this.field38635) {
            if (method27224 > 1 && this.field38636) {
                this.method32998(1, array, b);
                this.method33001(1, array, b);
            }
            else {
                this.method32992(1, array, b);
                this.method32995(1, array, b);
            }
        }
        else if (method27224 > 1 && this.field38636 && this.field38622 >= method27224 && this.field38624 >= method27224 && this.field38626 >= method27224) {
            final Future[] array2 = new Future[method27224];
            final int n = this.field38622 / method27224;
            for (int i = 0; i < method27224; ++i) {
                final int n2 = i * n;
                array2[i] = Class8216.method27227(new Class1156(this, n2, (i == method27224 - 1) ? this.field38622 : (n2 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            for (int j = 0; j < method27224; ++j) {
                final int n3 = j * n;
                array2[j] = Class8216.method27227(new Class1139(this, n3, (j == method27224 - 1) ? this.field38622 : (n3 + n), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            final int n4 = this.field38624 / method27224;
            for (int k = 0; k < method27224; ++k) {
                final int n5 = k * n4;
                array2[k] = Class8216.method27227(new Class1556(this, n5, (k == method27224 - 1) ? this.field38624 : (n5 + n4), array, b));
            }
            try {
                Class8216.method27228(array2);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            for (int l = 0; l < this.field38622; ++l) {
                for (int n6 = 0; n6 < this.field38624; ++n6) {
                    this.field38634.method29693(array[l][n6], b);
                }
            }
            final float[] array3 = new float[this.field38624];
            for (int n7 = 0; n7 < this.field38622; ++n7) {
                for (int n8 = 0; n8 < this.field38626; ++n8) {
                    for (int n9 = 0; n9 < this.field38624; ++n9) {
                        array3[n9] = array[n7][n9][n8];
                    }
                    this.field38633.method29693(array3, b);
                    for (int n10 = 0; n10 < this.field38624; ++n10) {
                        array[n7][n10][n8] = array3[n10];
                    }
                }
            }
            final float[] array4 = new float[this.field38622];
            for (int n11 = 0; n11 < this.field38624; ++n11) {
                for (int n12 = 0; n12 < this.field38626; ++n12) {
                    for (int n13 = 0; n13 < this.field38622; ++n13) {
                        array4[n13] = array[n13][n11][n12];
                    }
                    this.field38632.method29693(array4, b);
                    for (int n14 = 0; n14 < this.field38622; ++n14) {
                        array[n14][n11][n12] = array4[n14];
                    }
                }
            }
        }
    }
    
    private void method32990(final int n, final float[] array, final boolean b) {
        int n2 = 4 * this.field38624;
        if (this.field38626 == 2) {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            for (int i = 0; i < this.field38622; ++i) {
                final int n3 = i * this.field38628;
                for (int j = 0; j < this.field38624; ++j) {
                    this.field38634.method29695(array, n3 + j * this.field38630, b);
                }
                if (this.field38626 <= 2) {
                    if (this.field38626 == 2) {
                        for (int k = 0; k < this.field38624; ++k) {
                            final int n4 = n3 + k * this.field38630;
                            array2[k] = array[n4];
                            array2[this.field38624 + k] = array[n4 + 1];
                        }
                        this.field38633.method29695(array2, 0, b);
                        this.field38633.method29695(array2, this.field38624, b);
                        for (int l = 0; l < this.field38624; ++l) {
                            final int n5 = n3 + l * this.field38630;
                            array[n5] = array2[l];
                            array[n5 + 1] = array2[this.field38624 + l];
                        }
                    }
                }
                else {
                    for (int n6 = 0; n6 < this.field38626; n6 += 4) {
                        for (int n7 = 0; n7 < this.field38624; ++n7) {
                            final int n8 = n3 + n7 * this.field38630 + n6;
                            final int n9 = this.field38624 + n7;
                            array2[n7] = array[n8];
                            array2[n9] = array[n8 + 1];
                            array2[n9 + this.field38624] = array[n8 + 2];
                            array2[n9 + 2 * this.field38624] = array[n8 + 3];
                        }
                        this.field38633.method29695(array2, 0, b);
                        this.field38633.method29695(array2, this.field38624, b);
                        this.field38633.method29695(array2, 2 * this.field38624, b);
                        this.field38633.method29695(array2, 3 * this.field38624, b);
                        for (int n10 = 0; n10 < this.field38624; ++n10) {
                            final int n11 = n3 + n10 * this.field38630 + n6;
                            final int n12 = this.field38624 + n10;
                            array[n11] = array2[n10];
                            array[n11 + 1] = array2[n12];
                            array[n11 + 2] = array2[n12 + this.field38624];
                            array[n11 + 3] = array2[n12 + 2 * this.field38624];
                        }
                    }
                }
            }
        }
        else {
            for (int n13 = 0; n13 < this.field38622; ++n13) {
                final int n14 = n13 * this.field38628;
                for (int n15 = 0; n15 < this.field38624; ++n15) {
                    this.field38634.method29691(array, n14 + n15 * this.field38630, b);
                }
                if (this.field38626 <= 2) {
                    if (this.field38626 == 2) {
                        for (int n16 = 0; n16 < this.field38624; ++n16) {
                            final int n17 = n14 + n16 * this.field38630;
                            array2[n16] = array[n17];
                            array2[this.field38624 + n16] = array[n17 + 1];
                        }
                        this.field38633.method29691(array2, 0, b);
                        this.field38633.method29691(array2, this.field38624, b);
                        for (int n18 = 0; n18 < this.field38624; ++n18) {
                            final int n19 = n14 + n18 * this.field38630;
                            array[n19] = array2[n18];
                            array[n19 + 1] = array2[this.field38624 + n18];
                        }
                    }
                }
                else {
                    for (int n20 = 0; n20 < this.field38626; n20 += 4) {
                        for (int n21 = 0; n21 < this.field38624; ++n21) {
                            final int n22 = n14 + n21 * this.field38630 + n20;
                            final int n23 = this.field38624 + n21;
                            array2[n21] = array[n22];
                            array2[n23] = array[n22 + 1];
                            array2[n23 + this.field38624] = array[n22 + 2];
                            array2[n23 + 2 * this.field38624] = array[n22 + 3];
                        }
                        this.field38633.method29691(array2, 0, b);
                        this.field38633.method29691(array2, this.field38624, b);
                        this.field38633.method29691(array2, 2 * this.field38624, b);
                        this.field38633.method29691(array2, 3 * this.field38624, b);
                        for (int n24 = 0; n24 < this.field38624; ++n24) {
                            final int n25 = n14 + n24 * this.field38630 + n20;
                            final int n26 = this.field38624 + n24;
                            array[n25] = array2[n24];
                            array[n25 + 1] = array2[n26];
                            array[n25 + 2] = array2[n26 + this.field38624];
                            array[n25 + 3] = array2[n26 + 2 * this.field38624];
                        }
                    }
                }
            }
        }
    }
    
    private void method32991(final int n, final Class22 class22, final boolean b) {
        long n2 = 4L * this.field38625;
        if (this.field38627 == 2L) {
            n2 >>= 1;
        }
        final Class22 class23 = new Class22(n2);
        if (n != -1) {
            for (long n3 = 0L; n3 < this.field38623; ++n3) {
                final long n4 = n3 * this.field38629;
                for (long n5 = 0L; n5 < this.field38625; ++n5) {
                    this.field38634.method29696(class22, n4 + n5 * this.field38631, b);
                }
                if (this.field38627 <= 2L) {
                    if (this.field38627 == 2L) {
                        for (long n6 = 0L; n6 < this.field38625; ++n6) {
                            final long n7 = n4 + n6 * this.field38631;
                            class23.method169(n6, class22.method135(n7));
                            class23.method169(this.field38625 + n6, class22.method135(n7 + 1L));
                        }
                        this.field38633.method29696(class23, 0L, b);
                        this.field38633.method29696(class23, this.field38625, b);
                        for (long n8 = 0L; n8 < this.field38625; ++n8) {
                            final long n9 = n4 + n8 * this.field38631;
                            class22.method169(n9, class23.method135(n8));
                            class22.method169(n9 + 1L, class23.method135(this.field38625 + n8));
                        }
                    }
                }
                else {
                    for (long n10 = 0L; n10 < this.field38627; n10 += 4L) {
                        for (long n11 = 0L; n11 < this.field38625; ++n11) {
                            final long n12 = n4 + n11 * this.field38631 + n10;
                            final long n13 = this.field38625 + n11;
                            class23.method169(n11, class22.method135(n12));
                            class23.method169(n13, class22.method135(n12 + 1L));
                            class23.method169(n13 + this.field38625, class22.method135(n12 + 2L));
                            class23.method169(n13 + 2L * this.field38625, class22.method135(n12 + 3L));
                        }
                        this.field38633.method29696(class23, 0L, b);
                        this.field38633.method29696(class23, this.field38625, b);
                        this.field38633.method29696(class23, 2L * this.field38625, b);
                        this.field38633.method29696(class23, 3L * this.field38625, b);
                        for (long n14 = 0L; n14 < this.field38625; ++n14) {
                            final long n15 = n4 + n14 * this.field38631 + n10;
                            final long n16 = this.field38625 + n14;
                            class22.method169(n15, class23.method135(n14));
                            class22.method169(n15 + 1L, class23.method135(n16));
                            class22.method169(n15 + 2L, class23.method135(n16 + this.field38625));
                            class22.method169(n15 + 3L, class23.method135(n16 + 2L * this.field38625));
                        }
                    }
                }
            }
        }
        else {
            for (long n17 = 0L; n17 < this.field38623; ++n17) {
                final long n18 = n17 * this.field38629;
                for (long n19 = 0L; n19 < this.field38625; ++n19) {
                    this.field38634.method29692(class22, n18 + n19 * this.field38631, b);
                }
                if (this.field38627 <= 2L) {
                    if (this.field38627 == 2L) {
                        for (long n20 = 0L; n20 < this.field38625; ++n20) {
                            final long n21 = n18 + n20 * this.field38631;
                            class23.method169(n20, class22.method135(n21));
                            class23.method169(this.field38625 + n20, class22.method135(n21 + 1L));
                        }
                        this.field38633.method29692(class23, 0L, b);
                        this.field38633.method29692(class23, this.field38625, b);
                        for (long n22 = 0L; n22 < this.field38625; ++n22) {
                            final long n23 = n18 + n22 * this.field38631;
                            class22.method169(n23, class23.method135(n22));
                            class22.method169(n23 + 1L, class23.method135(this.field38625 + n22));
                        }
                    }
                }
                else {
                    for (long n24 = 0L; n24 < this.field38627; n24 += 4L) {
                        for (long n25 = 0L; n25 < this.field38625; ++n25) {
                            final long n26 = n18 + n25 * this.field38631 + n24;
                            final long n27 = this.field38625 + n25;
                            class23.method169(n25, class22.method135(n26));
                            class23.method169(n27, class22.method135(n26 + 1L));
                            class23.method169(n27 + this.field38625, class22.method135(n26 + 2L));
                            class23.method169(n27 + 2L * this.field38625, class22.method135(n26 + 3L));
                        }
                        this.field38633.method29692(class23, 0L, b);
                        this.field38633.method29692(class23, this.field38625, b);
                        this.field38633.method29692(class23, 2L * this.field38625, b);
                        this.field38633.method29692(class23, 3L * this.field38625, b);
                        for (long n28 = 0L; n28 < this.field38625; ++n28) {
                            final long n29 = n18 + n28 * this.field38631 + n24;
                            final long n30 = this.field38625 + n28;
                            class22.method169(n29, class23.method135(n28));
                            class22.method169(n29 + 1L, class23.method135(n30));
                            class22.method169(n29 + 2L, class23.method135(n30 + this.field38625));
                            class22.method169(n29 + 3L, class23.method135(n30 + 2L * this.field38625));
                        }
                    }
                }
            }
        }
    }
    
    private void method32992(final int n, final float[][][] array, final boolean b) {
        int n2 = 4 * this.field38624;
        if (this.field38626 == 2) {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            for (int i = 0; i < this.field38622; ++i) {
                for (int j = 0; j < this.field38624; ++j) {
                    this.field38634.method29693(array[i][j], b);
                }
                if (this.field38626 <= 2) {
                    if (this.field38626 == 2) {
                        for (int k = 0; k < this.field38624; ++k) {
                            array2[k] = array[i][k][0];
                            array2[this.field38624 + k] = array[i][k][1];
                        }
                        this.field38633.method29695(array2, 0, b);
                        this.field38633.method29695(array2, this.field38624, b);
                        for (int l = 0; l < this.field38624; ++l) {
                            array[i][l][0] = array2[l];
                            array[i][l][1] = array2[this.field38624 + l];
                        }
                    }
                }
                else {
                    for (int n3 = 0; n3 < this.field38626; n3 += 4) {
                        for (int n4 = 0; n4 < this.field38624; ++n4) {
                            final int n5 = this.field38624 + n4;
                            array2[n4] = array[i][n4][n3];
                            array2[n5] = array[i][n4][n3 + 1];
                            array2[n5 + this.field38624] = array[i][n4][n3 + 2];
                            array2[n5 + 2 * this.field38624] = array[i][n4][n3 + 3];
                        }
                        this.field38633.method29695(array2, 0, b);
                        this.field38633.method29695(array2, this.field38624, b);
                        this.field38633.method29695(array2, 2 * this.field38624, b);
                        this.field38633.method29695(array2, 3 * this.field38624, b);
                        for (int n6 = 0; n6 < this.field38624; ++n6) {
                            final int n7 = this.field38624 + n6;
                            array[i][n6][n3] = array2[n6];
                            array[i][n6][n3 + 1] = array2[n7];
                            array[i][n6][n3 + 2] = array2[n7 + this.field38624];
                            array[i][n6][n3 + 3] = array2[n7 + 2 * this.field38624];
                        }
                    }
                }
            }
        }
        else {
            for (int n8 = 0; n8 < this.field38622; ++n8) {
                for (int n9 = 0; n9 < this.field38624; ++n9) {
                    this.field38634.method29689(array[n8][n9], b);
                }
                if (this.field38626 <= 2) {
                    if (this.field38626 == 2) {
                        for (int n10 = 0; n10 < this.field38624; ++n10) {
                            array2[n10] = array[n8][n10][0];
                            array2[this.field38624 + n10] = array[n8][n10][1];
                        }
                        this.field38633.method29691(array2, 0, b);
                        this.field38633.method29691(array2, this.field38624, b);
                        for (int n11 = 0; n11 < this.field38624; ++n11) {
                            array[n8][n11][0] = array2[n11];
                            array[n8][n11][1] = array2[this.field38624 + n11];
                        }
                    }
                }
                else {
                    for (int n12 = 0; n12 < this.field38626; n12 += 4) {
                        for (int n13 = 0; n13 < this.field38624; ++n13) {
                            final int n14 = this.field38624 + n13;
                            array2[n13] = array[n8][n13][n12];
                            array2[n14] = array[n8][n13][n12 + 1];
                            array2[n14 + this.field38624] = array[n8][n13][n12 + 2];
                            array2[n14 + 2 * this.field38624] = array[n8][n13][n12 + 3];
                        }
                        this.field38633.method29691(array2, 0, b);
                        this.field38633.method29691(array2, this.field38624, b);
                        this.field38633.method29691(array2, 2 * this.field38624, b);
                        this.field38633.method29691(array2, 3 * this.field38624, b);
                        for (int n15 = 0; n15 < this.field38624; ++n15) {
                            final int n16 = this.field38624 + n15;
                            array[n8][n15][n12] = array2[n15];
                            array[n8][n15][n12 + 1] = array2[n16];
                            array[n8][n15][n12 + 2] = array2[n16 + this.field38624];
                            array[n8][n15][n12 + 3] = array2[n16 + 2 * this.field38624];
                        }
                    }
                }
            }
        }
    }
    
    private void method32993(final int n, final float[] array, final boolean b) {
        int n2 = 4 * this.field38622;
        if (this.field38626 == 2) {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            if (this.field38626 <= 2) {
                if (this.field38626 == 2) {
                    for (int i = 0; i < this.field38624; ++i) {
                        final int n3 = i * this.field38630;
                        for (int j = 0; j < this.field38622; ++j) {
                            final int n4 = j * this.field38628 + n3;
                            array2[j] = array[n4];
                            array2[this.field38622 + j] = array[n4 + 1];
                        }
                        this.field38632.method29695(array2, 0, b);
                        this.field38632.method29695(array2, this.field38622, b);
                        for (int k = 0; k < this.field38622; ++k) {
                            final int n5 = k * this.field38628 + n3;
                            array[n5] = array2[k];
                            array[n5 + 1] = array2[this.field38622 + k];
                        }
                    }
                }
            }
            else {
                for (int l = 0; l < this.field38624; ++l) {
                    final int n6 = l * this.field38630;
                    for (int n7 = 0; n7 < this.field38626; n7 += 4) {
                        for (int n8 = 0; n8 < this.field38622; ++n8) {
                            final int n9 = n8 * this.field38628 + n6 + n7;
                            final int n10 = this.field38622 + n8;
                            array2[n8] = array[n9];
                            array2[n10] = array[n9 + 1];
                            array2[n10 + this.field38622] = array[n9 + 2];
                            array2[n10 + 2 * this.field38622] = array[n9 + 3];
                        }
                        this.field38632.method29695(array2, 0, b);
                        this.field38632.method29695(array2, this.field38622, b);
                        this.field38632.method29695(array2, 2 * this.field38622, b);
                        this.field38632.method29695(array2, 3 * this.field38622, b);
                        for (int n11 = 0; n11 < this.field38622; ++n11) {
                            final int n12 = n11 * this.field38628 + n6 + n7;
                            final int n13 = this.field38622 + n11;
                            array[n12] = array2[n11];
                            array[n12 + 1] = array2[n13];
                            array[n12 + 2] = array2[n13 + this.field38622];
                            array[n12 + 3] = array2[n13 + 2 * this.field38622];
                        }
                    }
                }
            }
        }
        else if (this.field38626 <= 2) {
            if (this.field38626 == 2) {
                for (int n14 = 0; n14 < this.field38624; ++n14) {
                    final int n15 = n14 * this.field38630;
                    for (int n16 = 0; n16 < this.field38622; ++n16) {
                        final int n17 = n16 * this.field38628 + n15;
                        array2[n16] = array[n17];
                        array2[this.field38622 + n16] = array[n17 + 1];
                    }
                    this.field38632.method29691(array2, 0, b);
                    this.field38632.method29691(array2, this.field38622, b);
                    for (int n18 = 0; n18 < this.field38622; ++n18) {
                        final int n19 = n18 * this.field38628 + n15;
                        array[n19] = array2[n18];
                        array[n19 + 1] = array2[this.field38622 + n18];
                    }
                }
            }
        }
        else {
            for (int n20 = 0; n20 < this.field38624; ++n20) {
                final int n21 = n20 * this.field38630;
                for (int n22 = 0; n22 < this.field38626; n22 += 4) {
                    for (int n23 = 0; n23 < this.field38622; ++n23) {
                        final int n24 = n23 * this.field38628 + n21 + n22;
                        final int n25 = this.field38622 + n23;
                        array2[n23] = array[n24];
                        array2[n25] = array[n24 + 1];
                        array2[n25 + this.field38622] = array[n24 + 2];
                        array2[n25 + 2 * this.field38622] = array[n24 + 3];
                    }
                    this.field38632.method29691(array2, 0, b);
                    this.field38632.method29691(array2, this.field38622, b);
                    this.field38632.method29691(array2, 2 * this.field38622, b);
                    this.field38632.method29691(array2, 3 * this.field38622, b);
                    for (int n26 = 0; n26 < this.field38622; ++n26) {
                        final int n27 = n26 * this.field38628 + n21 + n22;
                        final int n28 = this.field38622 + n26;
                        array[n27] = array2[n26];
                        array[n27 + 1] = array2[n28];
                        array[n27 + 2] = array2[n28 + this.field38622];
                        array[n27 + 3] = array2[n28 + 2 * this.field38622];
                    }
                }
            }
        }
    }
    
    private void method32994(final int n, final Class22 class22, final boolean b) {
        long n2 = 4L * this.field38623;
        if (this.field38627 == 2L) {
            n2 >>= 1;
        }
        final Class22 class23 = new Class22(n2);
        if (n != -1) {
            if (this.field38627 <= 2L) {
                if (this.field38627 == 2L) {
                    for (long n3 = 0L; n3 < this.field38625; ++n3) {
                        final long n4 = n3 * this.field38631;
                        for (long n5 = 0L; n5 < this.field38623; ++n5) {
                            final long n6 = n5 * this.field38629 + n4;
                            class23.method169(n5, class22.method135(n6));
                            class23.method169(this.field38623 + n5, class22.method135(n6 + 1L));
                        }
                        this.field38632.method29696(class23, 0L, b);
                        this.field38632.method29696(class23, this.field38623, b);
                        for (long n7 = 0L; n7 < this.field38623; ++n7) {
                            final long n8 = n7 * this.field38629 + n4;
                            class22.method169(n8, class23.method135(n7));
                            class22.method169(n8 + 1L, class23.method135(this.field38623 + n7));
                        }
                    }
                }
            }
            else {
                for (long n9 = 0L; n9 < this.field38625; ++n9) {
                    final long n10 = n9 * this.field38631;
                    for (long n11 = 0L; n11 < this.field38627; n11 += 4L) {
                        for (long n12 = 0L; n12 < this.field38623; ++n12) {
                            final long n13 = n12 * this.field38629 + n10 + n11;
                            final long n14 = this.field38623 + n12;
                            class23.method169(n12, class22.method135(n13));
                            class23.method169(n14, class22.method135(n13 + 1L));
                            class23.method169(n14 + this.field38623, class22.method135(n13 + 2L));
                            class23.method169(n14 + 2L * this.field38623, class22.method135(n13 + 3L));
                        }
                        this.field38632.method29696(class23, 0L, b);
                        this.field38632.method29696(class23, this.field38623, b);
                        this.field38632.method29696(class23, 2L * this.field38623, b);
                        this.field38632.method29696(class23, 3L * this.field38623, b);
                        for (long n15 = 0L; n15 < this.field38623; ++n15) {
                            final long n16 = n15 * this.field38629 + n10 + n11;
                            final long n17 = this.field38623 + n15;
                            class22.method169(n16, class23.method135(n15));
                            class22.method169(n16 + 1L, class23.method135(n17));
                            class22.method169(n16 + 2L, class23.method135(n17 + this.field38623));
                            class22.method169(n16 + 3L, class23.method135(n17 + 2L * this.field38623));
                        }
                    }
                }
            }
        }
        else if (this.field38627 <= 2L) {
            if (this.field38627 == 2L) {
                for (long n18 = 0L; n18 < this.field38625; ++n18) {
                    final long n19 = n18 * this.field38631;
                    for (long n20 = 0L; n20 < this.field38623; ++n20) {
                        final long n21 = n20 * this.field38629 + n19;
                        class23.method169(n20, class22.method135(n21));
                        class23.method169(this.field38623 + n20, class22.method135(n21 + 1L));
                    }
                    this.field38632.method29692(class23, 0L, b);
                    this.field38632.method29692(class23, this.field38623, b);
                    for (long n22 = 0L; n22 < this.field38623; ++n22) {
                        final long n23 = n22 * this.field38629 + n19;
                        class22.method169(n23, class23.method135(n22));
                        class22.method169(n23 + 1L, class23.method135(this.field38623 + n22));
                    }
                }
            }
        }
        else {
            for (long n24 = 0L; n24 < this.field38625; ++n24) {
                final long n25 = n24 * this.field38631;
                for (long n26 = 0L; n26 < this.field38627; n26 += 4L) {
                    for (long n27 = 0L; n27 < this.field38623; ++n27) {
                        final long n28 = n27 * this.field38629 + n25 + n26;
                        final long n29 = this.field38623 + n27;
                        class23.method169(n27, class22.method135(n28));
                        class23.method169(n29, class22.method135(n28 + 1L));
                        class23.method169(n29 + this.field38623, class22.method135(n28 + 2L));
                        class23.method169(n29 + 2L * this.field38623, class22.method135(n28 + 3L));
                    }
                    this.field38632.method29692(class23, 0L, b);
                    this.field38632.method29692(class23, this.field38623, b);
                    this.field38632.method29692(class23, 2L * this.field38623, b);
                    this.field38632.method29692(class23, 3L * this.field38623, b);
                    for (long n30 = 0L; n30 < this.field38623; ++n30) {
                        final long n31 = n30 * this.field38629 + n25 + n26;
                        final long n32 = this.field38623 + n30;
                        class22.method169(n31, class23.method135(n30));
                        class22.method169(n31 + 1L, class23.method135(n32));
                        class22.method169(n31 + 2L, class23.method135(n32 + this.field38623));
                        class22.method169(n31 + 3L, class23.method135(n32 + 2L * this.field38623));
                    }
                }
            }
        }
    }
    
    private void method32995(final int n, final float[][][] array, final boolean b) {
        int n2 = 4 * this.field38622;
        if (this.field38626 == 2) {
            n2 >>= 1;
        }
        final float[] array2 = new float[n2];
        if (n != -1) {
            if (this.field38626 <= 2) {
                if (this.field38626 == 2) {
                    for (int i = 0; i < this.field38624; ++i) {
                        for (int j = 0; j < this.field38622; ++j) {
                            array2[j] = array[j][i][0];
                            array2[this.field38622 + j] = array[j][i][1];
                        }
                        this.field38632.method29695(array2, 0, b);
                        this.field38632.method29695(array2, this.field38622, b);
                        for (int k = 0; k < this.field38622; ++k) {
                            array[k][i][0] = array2[k];
                            array[k][i][1] = array2[this.field38622 + k];
                        }
                    }
                }
            }
            else {
                for (int l = 0; l < this.field38624; ++l) {
                    for (int n3 = 0; n3 < this.field38626; n3 += 4) {
                        for (int n4 = 0; n4 < this.field38622; ++n4) {
                            final int n5 = this.field38622 + n4;
                            array2[n4] = array[n4][l][n3];
                            array2[n5] = array[n4][l][n3 + 1];
                            array2[n5 + this.field38622] = array[n4][l][n3 + 2];
                            array2[n5 + 2 * this.field38622] = array[n4][l][n3 + 3];
                        }
                        this.field38632.method29695(array2, 0, b);
                        this.field38632.method29695(array2, this.field38622, b);
                        this.field38632.method29695(array2, 2 * this.field38622, b);
                        this.field38632.method29695(array2, 3 * this.field38622, b);
                        for (int n6 = 0; n6 < this.field38622; ++n6) {
                            final int n7 = this.field38622 + n6;
                            array[n6][l][n3] = array2[n6];
                            array[n6][l][n3 + 1] = array2[n7];
                            array[n6][l][n3 + 2] = array2[n7 + this.field38622];
                            array[n6][l][n3 + 3] = array2[n7 + 2 * this.field38622];
                        }
                    }
                }
            }
        }
        else if (this.field38626 <= 2) {
            if (this.field38626 == 2) {
                for (int n8 = 0; n8 < this.field38624; ++n8) {
                    for (int n9 = 0; n9 < this.field38622; ++n9) {
                        array2[n9] = array[n9][n8][0];
                        array2[this.field38622 + n9] = array[n9][n8][1];
                    }
                    this.field38632.method29691(array2, 0, b);
                    this.field38632.method29691(array2, this.field38622, b);
                    for (int n10 = 0; n10 < this.field38622; ++n10) {
                        array[n10][n8][0] = array2[n10];
                        array[n10][n8][1] = array2[this.field38622 + n10];
                    }
                }
            }
        }
        else {
            for (int n11 = 0; n11 < this.field38624; ++n11) {
                for (int n12 = 0; n12 < this.field38626; n12 += 4) {
                    for (int n13 = 0; n13 < this.field38622; ++n13) {
                        final int n14 = this.field38622 + n13;
                        array2[n13] = array[n13][n11][n12];
                        array2[n14] = array[n13][n11][n12 + 1];
                        array2[n14 + this.field38622] = array[n13][n11][n12 + 2];
                        array2[n14 + 2 * this.field38622] = array[n13][n11][n12 + 3];
                    }
                    this.field38632.method29691(array2, 0, b);
                    this.field38632.method29691(array2, this.field38622, b);
                    this.field38632.method29691(array2, 2 * this.field38622, b);
                    this.field38632.method29691(array2, 3 * this.field38622, b);
                    for (int n15 = 0; n15 < this.field38622; ++n15) {
                        final int n16 = this.field38622 + n15;
                        array[n15][n11][n12] = array2[n15];
                        array[n15][n11][n12 + 1] = array2[n16];
                        array[n15][n11][n12 + 2] = array2[n16 + this.field38622];
                        array[n15][n11][n12 + 3] = array2[n16 + 2 * this.field38622];
                    }
                }
            }
        }
    }
    
    private void method32996(final int n, final float[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field38622) ? this.field38622 : Class8216.method27224();
        int n3 = 4 * this.field38624;
        if (this.field38626 == 2) {
            n3 >>= 1;
        }
        final Future[] array2 = new Future[n2];
        final int n4 = n3;
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1129(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method32997(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field38623) ? this.field38623 : Class8216.method27224());
        long n3 = 4L * this.field38625;
        if (this.field38627 == 2L) {
            n3 >>= 1;
        }
        final Future[] array = new Future[n2];
        final long n4 = n3;
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class1528(this, n4, n, i, n2, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method32998(final int n, final float[][][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field38622) ? this.field38622 : Class8216.method27224();
        int n3 = 4 * this.field38624;
        if (this.field38626 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class951(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method32999(final int n, final float[] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field38624) ? this.field38624 : Class8216.method27224();
        int n3 = 4 * this.field38622;
        if (this.field38626 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1259(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method33000(final int n, final Class22 class22, final boolean b) {
        final int n2 = (int)((Class8216.method27224() > this.field38625) ? this.field38625 : Class8216.method27224());
        long n3 = 4L * this.field38623;
        if (this.field38627 == 2L) {
            n3 >>= 1;
        }
        final long n4 = n3;
        final Future[] array = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = Class8216.method27227(new Class879(this, n4, n, i, n2, class22, b));
        }
        try {
            Class8216.method27228(array);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
    
    private void method33001(final int n, final float[][][] array, final boolean b) {
        final int n2 = (Class8216.method27224() > this.field38624) ? this.field38624 : Class8216.method27224();
        int n3 = 4 * this.field38622;
        if (this.field38626 == 2) {
            n3 >>= 1;
        }
        final int n4 = n3;
        final Future[] array2 = new Future[n2];
        for (int i = 0; i < n2; ++i) {
            array2[i] = Class8216.method27227(new Class1312(this, n4, n, i, n2, array, b));
        }
        try {
            Class8216.method27228(array2);
        }
        catch (final InterruptedException thrown) {
            Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown);
        }
        catch (final ExecutionException thrown2) {
            Logger.getLogger(Class9117.class.getName()).log(Level.SEVERE, null, thrown2);
        }
    }
}
