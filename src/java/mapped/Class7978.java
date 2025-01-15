// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public final class Class7978
{
    private int field32814;
    private long field32815;
    private int field32816;
    private long field32817;
    private int[] field32818;
    private Class15 field32819;
    private float[] field32820;
    private Class22 field32821;
    private int field32822;
    private long field32823;
    private int field32824;
    private long field32825;
    private float[] field32826;
    private Class22 field32827;
    private float[] field32828;
    private Class22 field32829;
    private float[] field32830;
    private Class22 field32831;
    private float[] field32832;
    private Class22 field32833;
    private Class2070 field32834;
    private boolean field32835;
    private static final int[] field32836;
    private static final float field32837 = 3.1415927f;
    private static final float field32838 = 6.2831855f;
    
    public Class7978(final long field32815) {
        if (field32815 >= 1L) {
            this.field32835 = (Class9133.method33168() || 2L * field32815 > Class11.method177());
            this.field32814 = (int)field32815;
            this.field32815 = field32815;
            if (this.field32835) {
                if (Class9133.method33175(this.field32815)) {
                    this.field32834 = Class2070.field11848;
                    this.field32819 = new Class15(2L + (long)Class7640.method24124((double)(2L + (1L << (int)((long)(Class7640.method24089(this.field32815 + 0.5f) / Class7640.method24089(2.0)) / 2L)))));
                    this.field32821 = new Class22(this.field32815);
                    Class9133.method33186(this.field32823 = 2L * this.field32815 >> 2, this.field32819, this.field32821);
                    Class9133.method33184(this.field32825 = this.field32815 >> 2, this.field32821, this.field32823, this.field32819);
                }
                else if (Class9133.method33176(this.field32815, Class7978.field32836) < 211L) {
                    this.field32834 = Class2070.field11849;
                    this.field32827 = new Class22(4L * this.field32815 + 15L);
                    this.field32829 = new Class22(2L * this.field32815 + 15L);
                    this.method25953();
                    this.method25955();
                }
                else {
                    this.field32834 = Class2070.field11850;
                    this.field32817 = Class9133.method33171(this.field32815 * 2L - 1L);
                    this.field32831 = new Class22(2L * this.field32817);
                    this.field32833 = new Class22(2L * this.field32817);
                    this.field32819 = new Class15(2L + (long)Class7640.method24124((double)(2L + (1L << (int)((long)(Class7640.method24089(this.field32817 + 0.5f) / Class7640.method24089(2.0)) / 2L)))));
                    this.field32821 = new Class22(this.field32817);
                    Class9133.method33186(this.field32823 = 2L * this.field32817 >> 2, this.field32819, this.field32821);
                    Class9133.method33184(this.field32825 = this.field32817 >> 2, this.field32821, this.field32823, this.field32819);
                    this.method25957();
                }
            }
            else if (Class9133.method33175(field32815)) {
                this.field32834 = Class2070.field11848;
                this.field32818 = new int[2 + (int)Class7640.method24124(2 + (1 << (int)(Class7640.method24089(field32815 + 0.5f) / Class7640.method24089(2.0)) / 2))];
                this.field32820 = new float[this.field32814];
                Class9133.method33185(this.field32822 = 2 * this.field32814 >> 2, this.field32818, this.field32820);
                Class9133.method33183(this.field32824 = this.field32814 >> 2, this.field32820, this.field32822, this.field32818);
            }
            else if (Class9133.method33176(field32815, Class7978.field32836) < 211L) {
                this.field32834 = Class2070.field11849;
                this.field32826 = new float[4 * this.field32814 + 15];
                this.field32828 = new float[2 * this.field32814 + 15];
                this.method25952();
                this.method25954();
            }
            else {
                this.field32834 = Class2070.field11850;
                this.field32816 = Class9133.method33170(this.field32814 * 2 - 1);
                this.field32830 = new float[2 * this.field32816];
                this.field32832 = new float[2 * this.field32816];
                this.field32818 = new int[2 + (int)Class7640.method24124(2 + (1 << (int)(Class7640.method24089(this.field32816 + 0.5f) / Class7640.method24089(2.0)) / 2))];
                this.field32820 = new float[this.field32816];
                Class9133.method33185(this.field32822 = 2 * this.field32816 >> 2, this.field32818, this.field32820);
                Class9133.method33183(this.field32824 = this.field32816 >> 2, this.field32820, this.field32822, this.field32818);
                this.method25956();
            }
            return;
        }
        throw new IllegalArgumentException("n must be greater than 0");
    }
    
    public void method25925(final float[] array) {
        this.method25927(array, 0);
    }
    
    public void method25926(final Class22 class22) {
        this.method25928(class22, 0L);
    }
    
    public void method25927(final float[] array, final int n) {
        if (this.field32835) {
            this.method25928(new Class22(array), n);
        }
        else {
            if (this.field32814 == 1) {
                return;
            }
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    Class9133.method33247(2 * this.field32814, array, n, this.field32818, this.field32822, this.field32820);
                    break;
                }
                case 2: {
                    this.method25992(array, n, -1);
                    break;
                }
                case 3: {
                    this.method25958(array, n, -1);
                    break;
                }
            }
        }
    }
    
    public void method25928(final Class22 class22, final long n) {
        if (!this.field32835) {
            if (class22.method173() || class22.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method25927(class22.method230(), (int)n);
        }
        else {
            if (this.field32815 == 1L) {
                return;
            }
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    Class9133.method33248(2L * this.field32815, class22, n, this.field32819, this.field32823, this.field32821);
                    break;
                }
                case 2: {
                    this.method25993(class22, n, -1);
                    break;
                }
                case 3: {
                    this.method25959(class22, n, -1);
                    break;
                }
            }
        }
    }
    
    public void method25929(final float[] array, final boolean b) {
        this.method25931(array, 0, b);
    }
    
    public void method25930(final Class22 class22, final boolean b) {
        this.method25932(class22, 0L, b);
    }
    
    public void method25931(final float[] array, final int n, final boolean b) {
        if (this.field32835) {
            this.method25932(new Class22(array), n, b);
        }
        else {
            if (this.field32814 == 1) {
                return;
            }
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    Class9133.method33245(2 * this.field32814, array, n, this.field32818, this.field32822, this.field32820);
                    break;
                }
                case 2: {
                    this.method25992(array, n, 1);
                    break;
                }
                case 3: {
                    this.method25958(array, n, 1);
                    break;
                }
            }
            if (b) {
                Class9133.method33305(this.field32814, 1.0f / this.field32814, array, n, true);
            }
        }
    }
    
    public void method25932(final Class22 class22, final long n, final boolean b) {
        if (!this.field32835) {
            if (class22.method173() || class22.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method25931(class22.method230(), (int)n, b);
        }
        else {
            if (this.field32815 == 1L) {
                return;
            }
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    Class9133.method33246(2L * this.field32815, class22, n, this.field32819, this.field32823, this.field32821);
                    break;
                }
                case 2: {
                    this.method25993(class22, n, 1);
                    break;
                }
                case 3: {
                    this.method25959(class22, n, 1);
                    break;
                }
            }
            if (b) {
                Class9133.method33306(this.field32815, 1.0f / this.field32815, class22, n, true);
            }
        }
    }
    
    public void method25933(final float[] array) {
        this.method25935(array, 0);
    }
    
    public void method25934(final Class22 class22) {
        this.method25936(class22, 0L);
    }
    
    public void method25935(final float[] array, final int n) {
        if (this.field32835) {
            this.method25936(new Class22(array), n);
        }
        else {
            if (this.field32814 == 1) {
                return;
            }
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    if (this.field32814 > 4) {
                        Class9133.method33245(this.field32814, array, n, this.field32818, this.field32822, this.field32820);
                        Class9133.method33297(this.field32814, array, n, this.field32824, this.field32820, this.field32822);
                    }
                    else if (this.field32814 == 4) {
                        Class9133.method33291(array, n);
                    }
                    final float n2 = array[n] - array[n + 1];
                    array[n] += array[n + 1];
                    array[n + 1] = n2;
                    break;
                }
                case 2: {
                    this.method25968(array, n);
                    for (int i = this.field32814 - 1; i >= 2; --i) {
                        final int n3 = n + i;
                        final float n4 = array[n3];
                        array[n3] = array[n3 - 1];
                        array[n3 - 1] = n4;
                    }
                    break;
                }
                case 3: {
                    this.method25962(array, n);
                    break;
                }
            }
        }
    }
    
    public void method25936(final Class22 class22, final long n) {
        if (!this.field32835) {
            if (class22.method173() || class22.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method25935(class22.method230(), (int)n);
        }
        else {
            if (this.field32815 == 1L) {
                return;
            }
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    if (this.field32815 > 4L) {
                        Class9133.method33246(this.field32815, class22, n, this.field32819, this.field32823, this.field32821);
                        Class9133.method33298(this.field32815, class22, n, this.field32825, this.field32821, this.field32823);
                    }
                    else if (this.field32815 == 4L) {
                        Class9133.method33292(class22, n);
                    }
                    final float n2 = class22.method135(n) - class22.method135(n + 1L);
                    class22.method169(n, class22.method135(n) + class22.method135(n + 1L));
                    class22.method169(n + 1L, n2);
                    break;
                }
                case 2: {
                    this.method25969(class22, n);
                    for (long n3 = this.field32815 - 1L; n3 >= 2L; --n3) {
                        final long n4 = n + n3;
                        final float method135 = class22.method135(n4);
                        class22.method169(n4, class22.method135(n4 - 1L));
                        class22.method169(n4 - 1L, method135);
                    }
                    break;
                }
                case 3: {
                    this.method25963(class22, n);
                    break;
                }
            }
        }
    }
    
    public void method25937(final float[] array) {
        this.method25939(array, 0);
    }
    
    public void method25938(final Class22 class22) {
        this.method25940(class22, 0L);
    }
    
    public void method25939(final float[] array, final int n) {
        if (this.field32835) {
            this.method25940(new Class22(array), n);
        }
        else {
            final int n2 = 2 * this.field32814;
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    this.method25935(array, n);
                    final int method27224 = Class8216.method27224();
                    if (method27224 > 1 && this.field32814 / 2 > Class9133.method33158()) {
                        final Future[] array2 = new Future[method27224];
                        final int n3 = this.field32814 / 2 / method27224;
                        for (int i = 0; i < method27224; ++i) {
                            final int n4 = i * n3;
                            array2[i] = Class8216.method27227(new Class891(this, n4, (i == method27224 - 1) ? (this.field32814 / 2) : (n4 + n3), n, n2, array));
                        }
                        try {
                            Class8216.method27228(array2);
                        }
                        catch (final InterruptedException thrown) {
                            Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
                        }
                        catch (final ExecutionException thrown2) {
                            Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
                        }
                    }
                    else {
                        for (int j = 0; j < this.field32814 / 2; ++j) {
                            final int n5 = 2 * j;
                            final int n6 = n + (n2 - n5) % n2;
                            array[n6] = array[n + n5];
                            array[n6 + 1] = -array[n + n5 + 1];
                        }
                    }
                    array[n + this.field32814] = -array[n + 1];
                    array[n + 1] = 0.0f;
                    break;
                }
                case 2: {
                    this.method25968(array, n);
                    int n7;
                    if (this.field32814 % 2 == 0) {
                        n7 = this.field32814 / 2;
                    }
                    else {
                        n7 = (this.field32814 + 1) / 2;
                    }
                    for (int k = 1; k < n7; ++k) {
                        final int n8 = n + n2 - 2 * k;
                        final int n9 = n + 2 * k;
                        array[n8 + 1] = -array[n9];
                        array[n8] = array[n9 - 1];
                    }
                    for (int l = 1; l < this.field32814; ++l) {
                        final int n10 = n + this.field32814 - l;
                        final float n11 = array[n10 + 1];
                        array[n10 + 1] = array[n10];
                        array[n10] = n11;
                    }
                    array[n + 1] = 0.0f;
                    break;
                }
                case 3: {
                    this.method25960(array, n, -1);
                    break;
                }
            }
        }
    }
    
    public void method25940(final Class22 class22, final long n) {
        if (!this.field32835) {
            if (class22.method173() || class22.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method25939(class22.method230(), (int)n);
        }
        else {
            final long n2 = 2L * this.field32815;
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    this.method25936(class22, n);
                    final int method27224 = Class8216.method27224();
                    if (method27224 > 1 && this.field32815 / 2L > Class9133.method33158()) {
                        final Future[] array = new Future[method27224];
                        final long n3 = this.field32815 / 2L / method27224;
                        for (int i = 0; i < method27224; ++i) {
                            final long n4 = i * n3;
                            array[i] = Class8216.method27227(new Class1641(this, n4, (i == method27224 - 1) ? (this.field32815 / 2L) : (n4 + n3), n, n2, class22));
                        }
                        try {
                            Class8216.method27228(array);
                        }
                        catch (final InterruptedException thrown) {
                            Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
                        }
                        catch (final ExecutionException thrown2) {
                            Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
                        }
                    }
                    else {
                        for (long n5 = 0L; n5 < this.field32815 / 2L; ++n5) {
                            final long n6 = 2L * n5;
                            final long n7 = n + (n2 - n6) % n2;
                            class22.method169(n7, class22.method135(n + n6));
                            class22.method169(n7 + 1L, -class22.method135(n + n6 + 1L));
                        }
                    }
                    class22.method169(n + this.field32815, -class22.method135(n + 1L));
                    class22.method169(n + 1L, 0.0f);
                    break;
                }
                case 2: {
                    this.method25969(class22, n);
                    long n8;
                    if (this.field32815 % 2L == 0L) {
                        n8 = this.field32815 / 2L;
                    }
                    else {
                        n8 = (this.field32815 + 1L) / 2L;
                    }
                    for (long n9 = 1L; n9 < n8; ++n9) {
                        final long n10 = n + n2 - 2L * n9;
                        final long n11 = n + 2L * n9;
                        class22.method169(n10 + 1L, -class22.method135(n11));
                        class22.method169(n10, class22.method135(n11 - 1L));
                    }
                    for (long n12 = 1L; n12 < this.field32815; ++n12) {
                        final long n13 = n + this.field32815 - n12;
                        final float method27225 = class22.method135(n13 + 1L);
                        class22.method169(n13 + 1L, class22.method135(n13));
                        class22.method169(n13, method27225);
                    }
                    class22.method169(n + 1L, 0.0f);
                    break;
                }
                case 3: {
                    this.method25961(class22, n, -1L);
                    break;
                }
            }
        }
    }
    
    public void method25941(final float[] array, final boolean b) {
        this.method25943(array, 0, b);
    }
    
    public void method25942(final Class22 class22, final boolean b) {
        this.method25944(class22, 0L, b);
    }
    
    public void method25943(final float[] array, final int n, final boolean b) {
        if (this.field32835) {
            this.method25944(new Class22(array), n, b);
        }
        else {
            if (this.field32814 == 1) {
                return;
            }
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    array[n + 1] = 0.5f * (array[n] - array[n + 1]);
                    array[n] -= array[n + 1];
                    if (this.field32814 > 4) {
                        Class9133.method33297(this.field32814, array, n, this.field32824, this.field32820, this.field32822);
                        Class9133.method33247(this.field32814, array, n, this.field32818, this.field32822, this.field32820);
                    }
                    else if (this.field32814 == 4) {
                        Class9133.method33295(array, n);
                    }
                    if (b) {
                        Class9133.method33305(this.field32814, 1.0f / (this.field32814 / 2.0f), array, n, false);
                        break;
                    }
                    break;
                }
                case 2: {
                    for (int i = 2; i < this.field32814; ++i) {
                        final int n2 = n + i;
                        final float n3 = array[n2 - 1];
                        array[n2 - 1] = array[n2];
                        array[n2] = n3;
                    }
                    this.method25970(array, n);
                    if (b) {
                        Class9133.method33305(this.field32814, 1.0f / this.field32814, array, n, false);
                        break;
                    }
                    break;
                }
                case 3: {
                    this.method25964(array, n);
                    if (b) {
                        Class9133.method33305(this.field32814, 1.0f / this.field32814, array, n, false);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void method25944(final Class22 class22, final long n, final boolean b) {
        if (!this.field32835) {
            if (class22.method173() || class22.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method25943(class22.method230(), (int)n, b);
        }
        else {
            if (this.field32815 == 1L) {
                return;
            }
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    class22.method169(n + 1L, 0.5f * (class22.method135(n) - class22.method135(n + 1L)));
                    class22.method169(n, class22.method135(n) - class22.method135(n + 1L));
                    if (this.field32815 > 4L) {
                        Class9133.method33298(this.field32815, class22, n, this.field32825, this.field32821, this.field32823);
                        Class9133.method33248(this.field32815, class22, n, this.field32819, this.field32823, this.field32821);
                    }
                    else if (this.field32815 == 4L) {
                        Class9133.method33296(class22, n);
                    }
                    if (b) {
                        Class9133.method33306(this.field32815, 1.0f / (this.field32815 / 2.0f), class22, n, false);
                        break;
                    }
                    break;
                }
                case 2: {
                    for (long n2 = 2L; n2 < this.field32815; ++n2) {
                        final long n3 = n + n2;
                        final float method135 = class22.method135(n3 - 1L);
                        class22.method169(n3 - 1L, class22.method135(n3));
                        class22.method169(n3, method135);
                    }
                    this.method25971(class22, n);
                    if (b) {
                        Class9133.method33306(this.field32815, 1.0f / this.field32815, class22, n, false);
                        break;
                    }
                    break;
                }
                case 3: {
                    this.method25965(class22, n);
                    if (b) {
                        Class9133.method33306(this.field32815, 1.0f / this.field32815, class22, n, false);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void method25945(final float[] array, final boolean b) {
        this.method25947(array, 0, b);
    }
    
    public void method25946(final Class22 class22, final boolean b) {
        this.method25948(class22, 0L, b);
    }
    
    public void method25947(final float[] array, final int n, final boolean b) {
        if (this.field32835) {
            this.method25948(new Class22(array), n, b);
        }
        else {
            final int n2 = 2 * this.field32814;
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    this.method25949(array, n, b);
                    final int method27224 = Class8216.method27224();
                    if (method27224 > 1 && this.field32814 / 2 > Class9133.method33158()) {
                        final Future[] array2 = new Future[method27224];
                        final int n3 = this.field32814 / 2 / method27224;
                        for (int i = 0; i < method27224; ++i) {
                            final int n4 = i * n3;
                            array2[i] = Class8216.method27227(new Class1169(this, n4, (i == method27224 - 1) ? (this.field32814 / 2) : (n4 + n3), n, n2, array));
                        }
                        try {
                            Class8216.method27228(array2);
                        }
                        catch (final InterruptedException thrown) {
                            Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
                        }
                        catch (final ExecutionException thrown2) {
                            Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
                        }
                    }
                    else {
                        for (int j = 0; j < this.field32814 / 2; ++j) {
                            final int n5 = 2 * j;
                            final int n6 = n + (n2 - n5) % n2;
                            array[n6] = array[n + n5];
                            array[n6 + 1] = -array[n + n5 + 1];
                        }
                    }
                    array[n + this.field32814] = -array[n + 1];
                    array[n + 1] = 0.0f;
                    break;
                }
                case 2: {
                    this.method25968(array, n);
                    if (b) {
                        Class9133.method33305(this.field32814, 1.0f / this.field32814, array, n, false);
                    }
                    int n7;
                    if (this.field32814 % 2 == 0) {
                        n7 = this.field32814 / 2;
                    }
                    else {
                        n7 = (this.field32814 + 1) / 2;
                    }
                    for (int k = 1; k < n7; ++k) {
                        final int n8 = n + 2 * k;
                        final int n9 = n + n2 - 2 * k;
                        array[n8] = -array[n8];
                        array[n9 + 1] = -array[n8];
                        array[n9] = array[n8 - 1];
                    }
                    for (int l = 1; l < this.field32814; ++l) {
                        final int n10 = n + this.field32814 - l;
                        final float n11 = array[n10 + 1];
                        array[n10 + 1] = array[n10];
                        array[n10] = n11;
                    }
                    array[n + 1] = 0.0f;
                    break;
                }
                case 3: {
                    this.method25960(array, n, 1);
                    if (b) {
                        Class9133.method33305(this.field32814, 1.0f / this.field32814, array, n, true);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void method25948(final Class22 class22, final long n, final boolean b) {
        if (!this.field32835) {
            if (class22.method173() || class22.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method25947(class22.method230(), (int)n, b);
        }
        else {
            final long n2 = 2L * this.field32815;
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    this.method25950(class22, n, b);
                    final int method27224 = Class8216.method27224();
                    if (method27224 > 1 && this.field32815 / 2L > Class9133.method33158()) {
                        final Future[] array = new Future[method27224];
                        final long n3 = this.field32815 / 2L / method27224;
                        for (int i = 0; i < method27224; ++i) {
                            final long n4 = i * n3;
                            array[i] = Class8216.method27227(new Class1006(this, n4, (i == method27224 - 1) ? (this.field32815 / 2L) : (n4 + n3), n, n2, class22));
                        }
                        try {
                            Class8216.method27228(array);
                        }
                        catch (final InterruptedException thrown) {
                            Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
                        }
                        catch (final ExecutionException thrown2) {
                            Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
                        }
                    }
                    else {
                        for (long n5 = 0L; n5 < this.field32815 / 2L; ++n5) {
                            final long n6 = 2L * n5;
                            final long n7 = n + (n2 - n6) % n2;
                            class22.method169(n7, class22.method135(n + n6));
                            class22.method169(n7 + 1L, -class22.method135(n + n6 + 1L));
                        }
                    }
                    class22.method169(n + this.field32815, -class22.method135(n + 1L));
                    class22.method169(n + 1L, 0.0f);
                    break;
                }
                case 2: {
                    this.method25969(class22, n);
                    if (b) {
                        Class9133.method33306(this.field32815, 1.0f / this.field32815, class22, n, false);
                    }
                    long n8;
                    if (this.field32815 % 2L == 0L) {
                        n8 = this.field32815 / 2L;
                    }
                    else {
                        n8 = (this.field32815 + 1L) / 2L;
                    }
                    for (long n9 = 1L; n9 < n8; ++n9) {
                        final long n10 = n + 2L * n9;
                        final long n11 = n + n2 - 2L * n9;
                        class22.method169(n10, -class22.method135(n10));
                        class22.method169(n11 + 1L, -class22.method135(n10));
                        class22.method169(n11, class22.method135(n10 - 1L));
                    }
                    for (long n12 = 1L; n12 < this.field32815; ++n12) {
                        final long n13 = n + this.field32815 - n12;
                        final float method27225 = class22.method135(n13 + 1L);
                        class22.method169(n13 + 1L, class22.method135(n13));
                        class22.method169(n13, method27225);
                    }
                    class22.method169(n + 1L, 0.0f);
                    break;
                }
                case 3: {
                    this.method25961(class22, n, 1L);
                    if (b) {
                        Class9133.method33306(this.field32815, 1.0f / this.field32815, class22, n, true);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void method25949(final float[] array, final int n, final boolean b) {
        if (this.field32835) {
            this.method25950(new Class22(array), n, b);
        }
        else {
            if (this.field32814 == 1) {
                return;
            }
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    if (this.field32814 > 4) {
                        Class9133.method33245(this.field32814, array, n, this.field32818, this.field32822, this.field32820);
                        Class9133.method33299(this.field32814, array, n, this.field32824, this.field32820, this.field32822);
                    }
                    else if (this.field32814 == 4) {
                        Class9133.method33247(this.field32814, array, n, this.field32818, this.field32822, this.field32820);
                    }
                    final float n2 = array[n] - array[n + 1];
                    array[n] += array[n + 1];
                    array[n + 1] = n2;
                    if (b) {
                        Class9133.method33305(this.field32814, 1.0f / this.field32814, array, n, false);
                        break;
                    }
                    break;
                }
                case 2: {
                    this.method25968(array, n);
                    for (int i = this.field32814 - 1; i >= 2; --i) {
                        final int n3 = n + i;
                        final float n4 = array[n3];
                        array[n3] = array[n3 - 1];
                        array[n3 - 1] = n4;
                    }
                    if (b) {
                        Class9133.method33305(this.field32814, 1.0f / this.field32814, array, n, false);
                    }
                    if (this.field32814 % 2 == 0) {
                        for (int n5 = this.field32814 / 2, j = 1; j < n5; ++j) {
                            final int n6 = n + 2 * j + 1;
                            array[n6] = -array[n6];
                        }
                        break;
                    }
                    for (int n7 = (this.field32814 - 1) / 2, k = 0; k < n7; ++k) {
                        final int n8 = n + 2 * k + 1;
                        array[n8] = -array[n8];
                    }
                    break;
                }
                case 3: {
                    this.method25966(array, n);
                    if (b) {
                        Class9133.method33305(this.field32814, 1.0f / this.field32814, array, n, false);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void method25950(final Class22 class22, final long n, final boolean b) {
        if (!this.field32835) {
            if (class22.method173() || class22.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method25949(class22.method230(), (int)n, b);
        }
        else {
            if (this.field32815 == 1L) {
                return;
            }
            switch (Class7797.field31958[this.field32834.ordinal()]) {
                case 1: {
                    if (this.field32815 > 4L) {
                        Class9133.method33246(this.field32815, class22, n, this.field32819, this.field32823, this.field32821);
                        Class9133.method33300(this.field32815, class22, n, this.field32825, this.field32821, this.field32823);
                    }
                    else if (this.field32815 == 4L) {
                        Class9133.method33248(this.field32815, class22, n, this.field32819, this.field32823, this.field32821);
                    }
                    final float n2 = class22.method135(n) - class22.method135(n + 1L);
                    class22.method169(n, class22.method135(n) + class22.method135(n + 1L));
                    class22.method169(n + 1L, n2);
                    if (b) {
                        Class9133.method33306(this.field32815, 1.0f / this.field32815, class22, n, false);
                        break;
                    }
                    break;
                }
                case 2: {
                    this.method25969(class22, n);
                    for (long n3 = this.field32815 - 1L; n3 >= 2L; --n3) {
                        final long n4 = n + n3;
                        final float method135 = class22.method135(n4);
                        class22.method169(n4, class22.method135(n4 - 1L));
                        class22.method169(n4 - 1L, method135);
                    }
                    if (b) {
                        Class9133.method33306(this.field32815, 1.0f / this.field32815, class22, n, false);
                    }
                    if (this.field32815 % 2L == 0L) {
                        for (long n5 = this.field32815 / 2L, n6 = 1L; n6 < n5; ++n6) {
                            final long n7 = n + 2L * n6 + 1L;
                            class22.method169(n7, -class22.method135(n7));
                        }
                        break;
                    }
                    for (long n8 = (this.field32815 - 1L) / 2L, n9 = 0L; n9 < n8; ++n9) {
                        final long n10 = n + 2L * n9 + 1L;
                        class22.method169(n10, -class22.method135(n10));
                    }
                    break;
                }
                case 3: {
                    this.method25967(class22, n);
                    if (b) {
                        Class9133.method33306(this.field32815, 1.0f / this.field32815, class22, n, false);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void method25951(final int n, final int n2) {
        if (n != 1) {
            final int n3 = 2 * n;
            final int n4 = 4 * n;
            int n5 = 0;
            int n6 = n;
            int n7 = 0;
            int n8 = 0;
        Label_0204:
            while (true) {
                if (++n8 > 4) {
                    n5 += 2;
                }
                else {
                    n5 = Class7978.field32836[n8 - 1];
                }
                while (true) {
                    final int n9 = n6 / n5;
                    if (n6 - n5 * n9 != 0) {
                        break;
                    }
                    ++n7;
                    this.field32826[n2 + n7 + 1 + n4] = (float)n5;
                    n6 = n9;
                    if (n5 == 2) {
                        if (n7 != 1) {
                            for (int i = 2; i <= n7; ++i) {
                                final int n10 = n7 - i + 2 + n4;
                                this.field32826[n2 + n10 + 1] = this.field32826[n2 + n10];
                            }
                            this.field32826[n2 + 2 + n4] = 2.0f;
                        }
                    }
                    if (n6 != 1) {
                        continue;
                    }
                    break Label_0204;
                }
            }
            this.field32826[n2 + n4] = (float)n;
            this.field32826[n2 + 1 + n4] = (float)n7;
            final float n11 = 6.2831855f / n;
            int n12 = 1;
            int n13 = 1;
            for (int j = 1; j <= n7; ++j) {
                final int n14 = (int)this.field32826[n2 + j + 1 + n4];
                int n15 = 0;
                final int n16 = n13 * n14;
                final int n17 = n / n16;
                final int n18 = n17 + n17 + 2;
                for (int n19 = n14 - 1, k = 1; k <= n19; ++k) {
                    final int n20 = n12;
                    this.field32826[n2 + n12 - 1 + n3] = 1.0f;
                    this.field32826[n2 + n12 + n3] = 0.0f;
                    n15 += n13;
                    float n21 = 0.0f;
                    final float n22 = n15 * n11;
                    for (int l = 4; l <= n18; l += 2) {
                        n12 += 2;
                        ++n21;
                        final float n23 = n21 * n22;
                        final int n24 = n12 + n3;
                        this.field32826[n2 + n24 - 1] = (float)Class7640.method24103(n23);
                        this.field32826[n2 + n24] = (float)Class7640.method24102(n23);
                    }
                    if (n14 > 5) {
                        final int n25 = n20 + n3;
                        final int n26 = n12 + n3;
                        this.field32826[n2 + n25 - 1] = this.field32826[n2 + n26 - 1];
                        this.field32826[n2 + n25] = this.field32826[n2 + n26];
                    }
                }
                n13 = n16;
            }
        }
    }
    
    public final void method25952() {
        if (this.field32814 != 1) {
            final int n = 2 * this.field32814;
            final int n2 = 4 * this.field32814;
            int n3 = 0;
            int field32814 = this.field32814;
            int n4 = 0;
            int n5 = 0;
        Label_0207:
            while (true) {
                if (++n5 > 4) {
                    n3 += 2;
                }
                else {
                    n3 = Class7978.field32836[n5 - 1];
                }
                while (true) {
                    final int n6 = field32814 / n3;
                    if (field32814 - n3 * n6 != 0) {
                        break;
                    }
                    ++n4;
                    this.field32826[n4 + 1 + n2] = (float)n3;
                    field32814 = n6;
                    if (n3 == 2) {
                        if (n4 != 1) {
                            for (int i = 2; i <= n4; ++i) {
                                final int n7 = n4 - i + 2 + n2;
                                this.field32826[n7 + 1] = this.field32826[n7];
                            }
                            this.field32826[2 + n2] = 2.0f;
                        }
                    }
                    if (field32814 != 1) {
                        continue;
                    }
                    break Label_0207;
                }
            }
            this.field32826[n2] = (float)this.field32814;
            this.field32826[1 + n2] = (float)n4;
            final float n8 = 6.2831855f / this.field32814;
            int n9 = 1;
            int n10 = 1;
            for (int j = 1; j <= n4; ++j) {
                final int n11 = (int)this.field32826[j + 1 + n2];
                int n12 = 0;
                final int n13 = n10 * n11;
                final int n14 = this.field32814 / n13;
                final int n15 = n14 + n14 + 2;
                for (int n16 = n11 - 1, k = 1; k <= n16; ++k) {
                    final int n17 = n9;
                    this.field32826[n9 - 1 + n] = 1.0f;
                    this.field32826[n9 + n] = 0.0f;
                    n12 += n10;
                    float n18 = 0.0f;
                    final float n19 = n12 * n8;
                    for (int l = 4; l <= n15; l += 2) {
                        n9 += 2;
                        ++n18;
                        final float n20 = n18 * n19;
                        final int n21 = n9 + n;
                        this.field32826[n21 - 1] = (float)Class7640.method24103(n20);
                        this.field32826[n21] = (float)Class7640.method24102(n20);
                    }
                    if (n11 > 5) {
                        final int n22 = n17 + n;
                        final int n23 = n9 + n;
                        this.field32826[n22 - 1] = this.field32826[n23 - 1];
                        this.field32826[n22] = this.field32826[n23];
                    }
                }
                n10 = n13;
            }
        }
    }
    
    public final void method25953() {
        if (this.field32815 != 1L) {
            final long n = 2L * this.field32815;
            final long n2 = 4L * this.field32815;
            long n3 = 0L;
            long field32815 = this.field32815;
            long n4 = 0L;
            long n5 = 0L;
        Label_0253:
            while (true) {
                ++n5;
                if (n5 > 4L) {
                    n3 += 2L;
                }
                else {
                    n3 = Class7978.field32836[(int)(n5 - 1L)];
                }
                while (true) {
                    final long n6 = field32815 / n3;
                    if (field32815 - n3 * n6 != 0L) {
                        break;
                    }
                    ++n4;
                    this.field32827.method169(n4 + 1L + n2, (float)n3);
                    field32815 = n6;
                    if (n3 == 2L) {
                        if (n4 != 1L) {
                            for (long n7 = 2L; n7 <= n4; ++n7) {
                                final long n8 = n4 - n7 + 2L + n2;
                                this.field32827.method169(n8 + 1L, this.field32827.method135(n8));
                            }
                            this.field32827.method169(2L + n2, 2.0f);
                        }
                    }
                    if (field32815 != 1L) {
                        continue;
                    }
                    break Label_0253;
                }
            }
            this.field32827.method169(n2, (float)this.field32815);
            this.field32827.method169(1L + n2, (float)n4);
            final float n9 = 6.2831855f / this.field32815;
            long n10 = 1L;
            long n11 = 1L;
            for (long n12 = 1L; n12 <= n4; ++n12) {
                final long n13 = (long)this.field32827.method135(n12 + 1L + n2);
                long n14 = 0L;
                final long n15 = n11 * n13;
                final long n16 = this.field32815 / n15;
                final long n17 = n16 + n16 + 2L;
                for (long n18 = n13 - 1L, n19 = 1L; n19 <= n18; ++n19) {
                    final long n20 = n10;
                    this.field32827.method169(n10 - 1L + n, 1.0f);
                    this.field32827.method169(n10 + n, 0.0f);
                    n14 += n11;
                    float n21 = 0.0f;
                    final float n22 = n14 * n9;
                    for (long n23 = 4L; n23 <= n17; n23 += 2L) {
                        n10 += 2L;
                        ++n21;
                        final float n24 = n21 * n22;
                        final long n25 = n10 + n;
                        this.field32827.method169(n25 - 1L, (float)Class7640.method24103(n24));
                        this.field32827.method169(n25, (float)Class7640.method24102(n24));
                    }
                    if (n13 > 5L) {
                        final long n26 = n20 + n;
                        final long n27 = n10 + n;
                        this.field32827.method169(n26 - 1L, this.field32827.method135(n27 - 1L));
                        this.field32827.method169(n26, this.field32827.method135(n27));
                    }
                }
                n11 = n15;
            }
        }
    }
    
    public void method25954() {
        if (this.field32814 == 1) {
            return;
        }
        final int n = 2 * this.field32814;
        int n2 = 0;
        int field32814 = this.field32814;
        int n3 = 0;
        int n4 = 0;
    Label_0196:
        while (true) {
            if (++n4 > 4) {
                n2 += 2;
            }
            else {
                n2 = Class7978.field32836[n4 - 1];
            }
            while (true) {
                final int n5 = field32814 / n2;
                if (field32814 - n2 * n5 != 0) {
                    break;
                }
                ++n3;
                this.field32828[n3 + 1 + n] = (float)n2;
                field32814 = n5;
                if (n2 == 2) {
                    if (n3 != 1) {
                        for (int i = 2; i <= n3; ++i) {
                            final int n6 = n3 - i + 2 + n;
                            this.field32828[n6 + 1] = this.field32828[n6];
                        }
                        this.field32828[2 + n] = 2.0f;
                    }
                }
                if (field32814 != 1) {
                    continue;
                }
                break Label_0196;
            }
        }
        this.field32828[n] = (float)this.field32814;
        this.field32828[1 + n] = (float)n3;
        final float n7 = 6.2831855f / this.field32814;
        int n8 = 0;
        final int n9 = n3 - 1;
        int n10 = 1;
        if (n9 != 0) {
            for (int j = 1; j <= n9; ++j) {
                final int n11 = (int)this.field32828[j + 1 + n];
                int n12 = 0;
                final int n13 = n10 * n11;
                final int n14 = this.field32814 / n13;
                for (int n15 = n11 - 1, k = 1; k <= n15; ++k) {
                    n12 += n10;
                    int n16 = n8;
                    final float n17 = n12 * n7;
                    float n18 = 0.0f;
                    for (int l = 3; l <= n14; l += 2) {
                        n16 += 2;
                        ++n18;
                        final float n19 = n18 * n17;
                        final int n20 = n16 + this.field32814;
                        this.field32828[n20 - 2] = (float)Class7640.method24103(n19);
                        this.field32828[n20 - 1] = (float)Class7640.method24102(n19);
                    }
                    n8 += n14;
                }
                n10 = n13;
            }
        }
    }
    
    public void method25955() {
        if (this.field32815 == 1L) {
            return;
        }
        final long n = 2L * this.field32815;
        long n2 = 0L;
        long field32815 = this.field32815;
        long n3 = 0L;
        long n4 = 0L;
    Label_0240:
        while (true) {
            ++n4;
            if (n4 > 4L) {
                n2 += 2L;
            }
            else {
                n2 = Class7978.field32836[(int)(n4 - 1L)];
            }
            while (true) {
                final long n5 = field32815 / n2;
                if (field32815 - n2 * n5 != 0L) {
                    break;
                }
                ++n3;
                this.field32829.method169(n3 + 1L + n, (float)n2);
                field32815 = n5;
                if (n2 == 2L) {
                    if (n3 != 1L) {
                        for (long n6 = 2L; n6 <= n3; ++n6) {
                            final long n7 = n3 - n6 + 2L + n;
                            this.field32829.method169(n7 + 1L, this.field32829.method135(n7));
                        }
                        this.field32829.method169(2L + n, 2.0f);
                    }
                }
                if (field32815 != 1L) {
                    continue;
                }
                break Label_0240;
            }
        }
        this.field32829.method169(n, (float)this.field32815);
        this.field32829.method169(1L + n, (float)n3);
        final float n8 = 6.2831855f / this.field32815;
        long n9 = 0L;
        final long n10 = n3 - 1L;
        long n11 = 1L;
        if (n10 != 0L) {
            for (long n12 = 1L; n12 <= n10; ++n12) {
                final long n13 = (long)this.field32829.method135(n12 + 1L + n);
                long n14 = 0L;
                final long n15 = n11 * n13;
                final long n16 = this.field32815 / n15;
                for (long n17 = n13 - 1L, n18 = 1L; n18 <= n17; ++n18) {
                    n14 += n11;
                    long n19 = n9;
                    final float n20 = n14 * n8;
                    float n21 = 0.0f;
                    for (long n22 = 3L; n22 <= n16; n22 += 2L) {
                        n19 += 2L;
                        ++n21;
                        final float n23 = n21 * n20;
                        final long n24 = n19 + this.field32815;
                        this.field32829.method169(n24 - 2L, (float)Class7640.method24103(n23));
                        this.field32829.method169(n24 - 1L, (float)Class7640.method24102(n23));
                    }
                    n9 += n16;
                }
                n11 = n15;
            }
        }
    }
    
    private void method25956() {
        int n = 0;
        final float n2 = 3.1415927f / this.field32814;
        this.field32830[0] = 1.0f;
        this.field32830[1] = 0.0f;
        for (int i = 1; i < this.field32814; ++i) {
            n += 2 * i - 1;
            if (n >= 2 * this.field32814) {
                n -= 2 * this.field32814;
            }
            final float n3 = n2 * n;
            this.field32830[2 * i] = (float)Class7640.method24103(n3);
            this.field32830[2 * i + 1] = (float)Class7640.method24102(n3);
        }
        final float n4 = 1.0f / this.field32816;
        this.field32832[0] = this.field32830[0] * n4;
        this.field32832[1] = this.field32830[1] * n4;
        for (int j = 2; j < 2 * this.field32814; j += 2) {
            this.field32832[j] = this.field32830[j] * n4;
            this.field32832[j + 1] = this.field32830[j + 1] * n4;
            this.field32832[2 * this.field32816 - j] = this.field32832[j];
            this.field32832[2 * this.field32816 - j + 1] = this.field32832[j + 1];
        }
        Class9133.method33247(2 * this.field32816, this.field32832, 0, this.field32818, this.field32822, this.field32820);
    }
    
    private void method25957() {
        long n = 0L;
        final float n2 = 3.1415927f / this.field32815;
        this.field32831.method169(0L, 1.0f);
        this.field32831.method169(1L, 0.0f);
        for (int n3 = 1; n3 < this.field32815; ++n3) {
            n += 2 * n3 - 1;
            if (n >= 2L * this.field32815) {
                n -= 2L * this.field32815;
            }
            final float n4 = n2 * n;
            this.field32831.method169(2 * n3, (float)Class7640.method24103(n4));
            this.field32831.method169(2 * n3 + 1, (float)Class7640.method24102(n4));
        }
        final float n5 = 1.0f / this.field32817;
        this.field32833.method169(0L, this.field32831.method135(0L) * n5);
        this.field32833.method169(1L, this.field32831.method135(1L) * n5);
        for (int n6 = 2; n6 < 2L * this.field32815; n6 += 2) {
            this.field32833.method169(n6, this.field32831.method135(n6) * n5);
            this.field32833.method169(n6 + 1, this.field32831.method135(n6 + 1) * n5);
            this.field32833.method169(2L * this.field32817 - n6, this.field32833.method135(n6));
            this.field32833.method169(2L * this.field32817 - n6 + 1L, this.field32833.method135(n6 + 1));
        }
        Class9133.method33248(2L * this.field32817, this.field32833, 0L, this.field32819, this.field32823, this.field32821);
    }
    
    private void method25958(final float[] array, final int n, final int n2) {
        final float[] array2 = new float[2 * this.field32816];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32814 >= Class9133.method33158()) {
            int n3 = 2;
            if (method27224 >= 4 && this.field32814 >= Class9133.method33159()) {
                n3 = 4;
            }
            final Future[] array3 = new Future[n3];
            final int n4 = this.field32814 / n3;
            for (int i = 0; i < n3; ++i) {
                final int n5 = i * n4;
                array3[i] = Class8216.method27227(new Class1210(this, n2, n5, (i == n3 - 1) ? this.field32814 : (n5 + n4), n, array2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33247(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            final int n6 = this.field32816 / n3;
            for (int j = 0; j < n3; ++j) {
                final int n7 = j * n6;
                array3[j] = Class8216.method27227(new Class1048(this, n2, n7, (j == n3 - 1) ? this.field32816 : (n7 + n6), array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            Class9133.method33245(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            final int n8 = this.field32814 / n3;
            for (int k = 0; k < n3; ++k) {
                final int n9 = k * n8;
                array3[k] = Class8216.method27227(new Class1184(this, n2, n9, (k == n3 - 1) ? this.field32814 : (n9 + n8), n, array, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            if (n2 > 0) {
                for (int l = 0; l < this.field32814; ++l) {
                    final int n10 = 2 * l;
                    final int n11 = n10 + 1;
                    final int n12 = n + n10;
                    final int n13 = n + n11;
                    array2[n10] = array[n12] * this.field32830[n10] - array[n13] * this.field32830[n11];
                    array2[n11] = array[n12] * this.field32830[n11] + array[n13] * this.field32830[n10];
                }
            }
            else {
                for (int n14 = 0; n14 < this.field32814; ++n14) {
                    final int n15 = 2 * n14;
                    final int n16 = n15 + 1;
                    final int n17 = n + n15;
                    final int n18 = n + n16;
                    array2[n15] = array[n17] * this.field32830[n15] + array[n18] * this.field32830[n16];
                    array2[n16] = -array[n17] * this.field32830[n16] + array[n18] * this.field32830[n15];
                }
            }
            Class9133.method33247(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            if (n2 > 0) {
                for (int n19 = 0; n19 < this.field32816; ++n19) {
                    final int n20 = 2 * n19;
                    final int n21 = n20 + 1;
                    final float n22 = -array2[n20] * this.field32832[n21] + array2[n21] * this.field32832[n20];
                    array2[n20] = array2[n20] * this.field32832[n20] + array2[n21] * this.field32832[n21];
                    array2[n21] = n22;
                }
            }
            else {
                for (int n23 = 0; n23 < this.field32816; ++n23) {
                    final int n24 = 2 * n23;
                    final int n25 = n24 + 1;
                    final float n26 = array2[n24] * this.field32832[n25] + array2[n25] * this.field32832[n24];
                    array2[n24] = array2[n24] * this.field32832[n24] - array2[n25] * this.field32832[n25];
                    array2[n25] = n26;
                }
            }
            Class9133.method33245(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            if (n2 > 0) {
                for (int n27 = 0; n27 < this.field32814; ++n27) {
                    final int n28 = 2 * n27;
                    final int n29 = n28 + 1;
                    final int n30 = n + n28;
                    final int n31 = n + n29;
                    array[n30] = this.field32830[n28] * array2[n28] - this.field32830[n29] * array2[n29];
                    array[n31] = this.field32830[n29] * array2[n28] + this.field32830[n28] * array2[n29];
                }
            }
            else {
                for (int n32 = 0; n32 < this.field32814; ++n32) {
                    final int n33 = 2 * n32;
                    final int n34 = n33 + 1;
                    final int n35 = n + n33;
                    final int n36 = n + n34;
                    array[n35] = this.field32830[n33] * array2[n33] + this.field32830[n34] * array2[n34];
                    array[n36] = -this.field32830[n34] * array2[n33] + this.field32830[n33] * array2[n34];
                }
            }
        }
    }
    
    private void method25959(final Class22 class22, final long n, final int n2) {
        final Class22 class23 = new Class22(2L * this.field32817);
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32815 > Class9133.method33158()) {
            int n3 = 2;
            if (method27224 >= 4 && this.field32815 > Class9133.method33159()) {
                n3 = 4;
            }
            final Future[] array = new Future[n3];
            final long n4 = this.field32815 / n3;
            for (int i = 0; i < n3; ++i) {
                final long n5 = i * n4;
                array[i] = Class8216.method27227(new Class1307(this, n2, n5, (i == n3 - 1) ? this.field32815 : (n5 + n4), n, class23, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33248(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            final long n6 = this.field32817 / n3;
            for (int j = 0; j < n3; ++j) {
                final long n7 = j * n6;
                array[j] = Class8216.method27227(new Class976(this, n2, n7, (j == n3 - 1) ? this.field32817 : (n7 + n6), class23));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            Class9133.method33246(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            final long n8 = this.field32815 / n3;
            for (int k = 0; k < n3; ++k) {
                final long n9 = k * n8;
                array[k] = Class8216.method27227(new Class1636(this, n2, n9, (k == n3 - 1) ? this.field32815 : (n9 + n8), n, class22, class23));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            if (n2 > 0) {
                for (long n10 = 0L; n10 < this.field32815; ++n10) {
                    final long n11 = 2L * n10;
                    final long n12 = n11 + 1L;
                    final long n13 = n + n11;
                    final long n14 = n + n12;
                    class23.method169(n11, class22.method135(n13) * this.field32831.method135(n11) - class22.method135(n14) * this.field32831.method135(n12));
                    class23.method169(n12, class22.method135(n13) * this.field32831.method135(n12) + class22.method135(n14) * this.field32831.method135(n11));
                }
            }
            else {
                for (long n15 = 0L; n15 < this.field32815; ++n15) {
                    final long n16 = 2L * n15;
                    final long n17 = n16 + 1L;
                    final long n18 = n + n16;
                    final long n19 = n + n17;
                    class23.method169(n16, class22.method135(n18) * this.field32831.method135(n16) + class22.method135(n19) * this.field32831.method135(n17));
                    class23.method169(n17, -class22.method135(n18) * this.field32831.method135(n17) + class22.method135(n19) * this.field32831.method135(n16));
                }
            }
            Class9133.method33248(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            if (n2 > 0) {
                for (long n20 = 0L; n20 < this.field32817; ++n20) {
                    final long n21 = 2L * n20;
                    final long n22 = n21 + 1L;
                    final float n23 = -class23.method135(n21) * this.field32833.method135(n22) + class23.method135(n22) * this.field32833.method135(n21);
                    class23.method169(n21, class23.method135(n21) * this.field32833.method135(n21) + class23.method135(n22) * this.field32833.method135(n22));
                    class23.method169(n22, n23);
                }
            }
            else {
                for (long n24 = 0L; n24 < this.field32817; ++n24) {
                    final long n25 = 2L * n24;
                    final long n26 = n25 + 1L;
                    final float n27 = class23.method135(n25) * this.field32833.method135(n26) + class23.method135(n26) * this.field32833.method135(n25);
                    class23.method169(n25, class23.method135(n25) * this.field32833.method135(n25) - class23.method135(n26) * this.field32833.method135(n26));
                    class23.method169(n26, n27);
                }
            }
            Class9133.method33246(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            if (n2 > 0) {
                for (long n28 = 0L; n28 < this.field32815; ++n28) {
                    final long n29 = 2L * n28;
                    final long n30 = n29 + 1L;
                    final long n31 = n + n29;
                    final long n32 = n + n30;
                    class22.method169(n31, this.field32831.method135(n29) * class23.method135(n29) - this.field32831.method135(n30) * class23.method135(n30));
                    class22.method169(n32, this.field32831.method135(n30) * class23.method135(n29) + this.field32831.method135(n29) * class23.method135(n30));
                }
            }
            else {
                for (long n33 = 0L; n33 < this.field32815; ++n33) {
                    final long n34 = 2L * n33;
                    final long n35 = n34 + 1L;
                    final long n36 = n + n34;
                    final long n37 = n + n35;
                    class22.method169(n36, this.field32831.method135(n34) * class23.method135(n34) + this.field32831.method135(n35) * class23.method135(n35));
                    class22.method169(n37, -this.field32831.method135(n35) * class23.method135(n34) + this.field32831.method135(n34) * class23.method135(n35));
                }
            }
        }
    }
    
    private void method25960(final float[] array, final int n, final int n2) {
        final float[] array2 = new float[2 * this.field32816];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32814 >= Class9133.method33158()) {
            int n3 = 2;
            if (method27224 >= 4 && this.field32814 >= Class9133.method33159()) {
                n3 = 4;
            }
            final Future[] array3 = new Future[n3];
            final int n4 = this.field32814 / n3;
            for (int i = 0; i < n3; ++i) {
                final int n5 = i * n4;
                array3[i] = Class8216.method27227(new Class892(this, n2, n5, (i == n3 - 1) ? this.field32814 : (n5 + n4), n, array2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33247(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            final int n6 = this.field32816 / n3;
            for (int j = 0; j < n3; ++j) {
                final int n7 = j * n6;
                array3[j] = Class8216.method27227(new Class984(this, n2, n7, (j == n3 - 1) ? this.field32816 : (n7 + n6), array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            Class9133.method33245(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            final int n8 = this.field32814 / n3;
            for (int k = 0; k < n3; ++k) {
                final int n9 = k * n8;
                array3[k] = Class8216.method27227(new Class1373(this, n2, n9, (k == n3 - 1) ? this.field32814 : (n9 + n8), array, n, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            if (n2 > 0) {
                for (int l = 0; l < this.field32814; ++l) {
                    final int n10 = 2 * l;
                    final int n11 = n10 + 1;
                    final int n12 = n + l;
                    array2[n10] = array[n12] * this.field32830[n10];
                    array2[n11] = array[n12] * this.field32830[n11];
                }
            }
            else {
                for (int n13 = 0; n13 < this.field32814; ++n13) {
                    final int n14 = 2 * n13;
                    final int n15 = n14 + 1;
                    final int n16 = n + n13;
                    array2[n14] = array[n16] * this.field32830[n14];
                    array2[n15] = -array[n16] * this.field32830[n15];
                }
            }
            Class9133.method33247(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            if (n2 > 0) {
                for (int n17 = 0; n17 < this.field32816; ++n17) {
                    final int n18 = 2 * n17;
                    final int n19 = n18 + 1;
                    final float n20 = -array2[n18] * this.field32832[n19] + array2[n19] * this.field32832[n18];
                    array2[n18] = array2[n18] * this.field32832[n18] + array2[n19] * this.field32832[n19];
                    array2[n19] = n20;
                }
            }
            else {
                for (int n21 = 0; n21 < this.field32816; ++n21) {
                    final int n22 = 2 * n21;
                    final int n23 = n22 + 1;
                    final float n24 = array2[n22] * this.field32832[n23] + array2[n23] * this.field32832[n22];
                    array2[n22] = array2[n22] * this.field32832[n22] - array2[n23] * this.field32832[n23];
                    array2[n23] = n24;
                }
            }
            Class9133.method33245(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            if (n2 > 0) {
                for (int n25 = 0; n25 < this.field32814; ++n25) {
                    final int n26 = 2 * n25;
                    final int n27 = n26 + 1;
                    array[n + n26] = this.field32830[n26] * array2[n26] - this.field32830[n27] * array2[n27];
                    array[n + n27] = this.field32830[n27] * array2[n26] + this.field32830[n26] * array2[n27];
                }
            }
            else {
                for (int n28 = 0; n28 < this.field32814; ++n28) {
                    final int n29 = 2 * n28;
                    final int n30 = n29 + 1;
                    array[n + n29] = this.field32830[n29] * array2[n29] + this.field32830[n30] * array2[n30];
                    array[n + n30] = -this.field32830[n30] * array2[n29] + this.field32830[n29] * array2[n30];
                }
            }
        }
    }
    
    private void method25961(final Class22 class22, final long n, final long n2) {
        final Class22 class23 = new Class22(2L * this.field32817);
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32815 > Class9133.method33158()) {
            int n3 = 2;
            if (method27224 >= 4 && this.field32815 > Class9133.method33159()) {
                n3 = 4;
            }
            final Future[] array = new Future[n3];
            final long n4 = this.field32815 / n3;
            for (int i = 0; i < n3; ++i) {
                final long n5 = i * n4;
                array[i] = Class8216.method27227(new Class1157(this, n2, n5, (i == n3 - 1) ? this.field32815 : (n5 + n4), n, class23, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33248(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            final long n6 = this.field32817 / n3;
            for (int j = 0; j < n3; ++j) {
                final long n7 = j * n6;
                array[j] = Class8216.method27227(new Class1249(this, n2, n7, (j == n3 - 1) ? this.field32817 : (n7 + n6), class23));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            Class9133.method33246(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            final long n8 = this.field32815 / n3;
            for (int k = 0; k < n3; ++k) {
                final long n9 = k * n8;
                array[k] = Class8216.method27227(new Class1357(this, n2, n9, (k == n3 - 1) ? this.field32815 : (n9 + n8), class22, n, class23));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            if (n2 > 0L) {
                for (long n10 = 0L; n10 < this.field32815; ++n10) {
                    final long n11 = 2L * n10;
                    final long n12 = n11 + 1L;
                    final long n13 = n + n10;
                    class23.method169(n11, class22.method135(n13) * this.field32831.method135(n11));
                    class23.method169(n12, class22.method135(n13) * this.field32831.method135(n12));
                }
            }
            else {
                for (long n14 = 0L; n14 < this.field32815; ++n14) {
                    final long n15 = 2L * n14;
                    final long n16 = n15 + 1L;
                    final long n17 = n + n14;
                    class23.method169(n15, class22.method135(n17) * this.field32831.method135(n15));
                    class23.method169(n16, -class22.method135(n17) * this.field32831.method135(n16));
                }
            }
            Class9133.method33248(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            if (n2 > 0L) {
                for (long n18 = 0L; n18 < this.field32817; ++n18) {
                    final long n19 = 2L * n18;
                    final long n20 = n19 + 1L;
                    final float n21 = -class23.method135(n19) * this.field32833.method135(n20) + class23.method135(n20) * this.field32833.method135(n19);
                    class23.method169(n19, class23.method135(n19) * this.field32833.method135(n19) + class23.method135(n20) * this.field32833.method135(n20));
                    class23.method169(n20, n21);
                }
            }
            else {
                for (long n22 = 0L; n22 < this.field32817; ++n22) {
                    final long n23 = 2L * n22;
                    final long n24 = n23 + 1L;
                    final float n25 = class23.method135(n23) * this.field32833.method135(n24) + class23.method135(n24) * this.field32833.method135(n23);
                    class23.method169(n23, class23.method135(n23) * this.field32833.method135(n23) - class23.method135(n24) * this.field32833.method135(n24));
                    class23.method169(n24, n25);
                }
            }
            Class9133.method33246(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            if (n2 > 0L) {
                for (long n26 = 0L; n26 < this.field32815; ++n26) {
                    final long n27 = 2L * n26;
                    final long n28 = n27 + 1L;
                    class22.method169(n + n27, this.field32831.method135(n27) * class23.method135(n27) - this.field32831.method135(n28) * class23.method135(n28));
                    class22.method169(n + n28, this.field32831.method135(n28) * class23.method135(n27) + this.field32831.method135(n27) * class23.method135(n28));
                }
            }
            else {
                for (long n29 = 0L; n29 < this.field32815; ++n29) {
                    final long n30 = 2L * n29;
                    final long n31 = n30 + 1L;
                    class22.method169(n + n30, this.field32831.method135(n30) * class23.method135(n30) + this.field32831.method135(n31) * class23.method135(n31));
                    class22.method169(n + n31, -this.field32831.method135(n31) * class23.method135(n30) + this.field32831.method135(n30) * class23.method135(n31));
                }
            }
        }
    }
    
    private void method25962(final float[] array, final int n) {
        final float[] array2 = new float[2 * this.field32816];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32814 >= Class9133.method33158()) {
            int n2 = 2;
            if (method27224 >= 4 && this.field32814 >= Class9133.method33159()) {
                n2 = 4;
            }
            final Future[] array3 = new Future[n2];
            final int n3 = this.field32814 / n2;
            for (int i = 0; i < n2; ++i) {
                final int n4 = i * n3;
                array3[i] = Class8216.method27227(new Class1444(this, n4, (i == n2 - 1) ? this.field32814 : (n4 + n3), n, array2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33247(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            final int n5 = this.field32816 / n2;
            for (int j = 0; j < n2; ++j) {
                final int n6 = j * n5;
                array3[j] = Class8216.method27227(new Class1523(this, n6, (j == n2 - 1) ? this.field32816 : (n6 + n5), array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int k = 0; k < this.field32814; ++k) {
                final int n7 = 2 * k;
                final int n8 = n7 + 1;
                final int n9 = n + k;
                array2[n7] = array[n9] * this.field32830[n7];
                array2[n8] = -array[n9] * this.field32830[n8];
            }
            Class9133.method33247(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            for (int l = 0; l < this.field32816; ++l) {
                final int n10 = 2 * l;
                final int n11 = n10 + 1;
                final float n12 = array2[n10] * this.field32832[n11] + array2[n11] * this.field32832[n10];
                array2[n10] = array2[n10] * this.field32832[n10] - array2[n11] * this.field32832[n11];
                array2[n11] = n12;
            }
        }
        Class9133.method33245(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
        if (this.field32814 % 2 == 0) {
            array[n] = this.field32830[0] * array2[0] + this.field32830[1] * array2[1];
            array[n + 1] = this.field32830[this.field32814] * array2[this.field32814] + this.field32830[this.field32814 + 1] * array2[this.field32814 + 1];
            for (int n13 = 1; n13 < this.field32814 / 2; ++n13) {
                final int n14 = 2 * n13;
                final int n15 = n14 + 1;
                array[n + n14] = this.field32830[n14] * array2[n14] + this.field32830[n15] * array2[n15];
                array[n + n15] = -this.field32830[n15] * array2[n14] + this.field32830[n14] * array2[n15];
            }
        }
        else {
            array[n] = this.field32830[0] * array2[0] + this.field32830[1] * array2[1];
            array[n + 1] = -this.field32830[this.field32814] * array2[this.field32814 - 1] + this.field32830[this.field32814 - 1] * array2[this.field32814];
            for (int n16 = 1; n16 < (this.field32814 - 1) / 2; ++n16) {
                final int n17 = 2 * n16;
                final int n18 = n17 + 1;
                array[n + n17] = this.field32830[n17] * array2[n17] + this.field32830[n18] * array2[n18];
                array[n + n18] = -this.field32830[n18] * array2[n17] + this.field32830[n17] * array2[n18];
            }
            array[n + this.field32814 - 1] = this.field32830[this.field32814 - 1] * array2[this.field32814 - 1] + this.field32830[this.field32814] * array2[this.field32814];
        }
    }
    
    private void method25963(final Class22 class22, final long n) {
        final Class22 class23 = new Class22(2L * this.field32817);
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32815 > Class9133.method33158()) {
            int n2 = 2;
            if (method27224 >= 4 && this.field32815 > Class9133.method33159()) {
                n2 = 4;
            }
            final Future[] array = new Future[n2];
            final long n3 = this.field32815 / n2;
            for (int i = 0; i < n2; ++i) {
                final long n4 = i * n3;
                array[i] = Class8216.method27227(new Class1563(this, n4, (i == n2 - 1) ? this.field32815 : (n4 + n3), n, class23, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33248(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            final long n5 = this.field32817 / n2;
            for (int j = 0; j < n2; ++j) {
                final long n6 = j * n5;
                array[j] = Class8216.method27227(new Class1462(this, n6, (j == n2 - 1) ? this.field32817 : (n6 + n5), class23));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n7 = 0L; n7 < this.field32815; ++n7) {
                final long n8 = 2L * n7;
                final long n9 = n8 + 1L;
                final long n10 = n + n7;
                class23.method169(n8, class22.method135(n10) * this.field32831.method135(n8));
                class23.method169(n9, -class22.method135(n10) * this.field32831.method135(n9));
            }
            Class9133.method33248(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            for (long n11 = 0L; n11 < this.field32817; ++n11) {
                final long n12 = 2L * n11;
                final long n13 = n12 + 1L;
                final float n14 = class23.method135(n12) * this.field32833.method135(n13) + class23.method135(n13) * this.field32833.method135(n12);
                class23.method169(n12, class23.method135(n12) * this.field32833.method135(n12) - class23.method135(n13) * this.field32833.method135(n13));
                class23.method169(n13, n14);
            }
        }
        Class9133.method33246(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
        if (this.field32815 % 2L == 0L) {
            class22.method169(n, this.field32831.method135(0L) * class23.method135(0L) + this.field32831.method135(1L) * class23.method135(1L));
            class22.method169(n + 1L, this.field32831.method135(this.field32815) * class23.method135(this.field32815) + this.field32831.method135(this.field32815 + 1L) * class23.method135(this.field32815 + 1L));
            for (long n15 = 1L; n15 < this.field32815 / 2L; ++n15) {
                final long n16 = 2L * n15;
                final long n17 = n16 + 1L;
                class22.method169(n + n16, this.field32831.method135(n16) * class23.method135(n16) + this.field32831.method135(n17) * class23.method135(n17));
                class22.method169(n + n17, -this.field32831.method135(n17) * class23.method135(n16) + this.field32831.method135(n16) * class23.method135(n17));
            }
        }
        else {
            class22.method169(n, this.field32831.method135(0L) * class23.method135(0L) + this.field32831.method135(1L) * class23.method135(1L));
            class22.method169(n + 1L, -this.field32831.method135(this.field32815) * class23.method135(this.field32815 - 1L) + this.field32831.method135(this.field32815 - 1L) * class23.method135(this.field32815));
            for (long n18 = 1L; n18 < (this.field32815 - 1L) / 2L; ++n18) {
                final long n19 = 2L * n18;
                final long n20 = n19 + 1L;
                class22.method169(n + n19, this.field32831.method135(n19) * class23.method135(n19) + this.field32831.method135(n20) * class23.method135(n20));
                class22.method169(n + n20, -this.field32831.method135(n20) * class23.method135(n19) + this.field32831.method135(n19) * class23.method135(n20));
            }
            class22.method169(n + this.field32815 - 1L, this.field32831.method135(this.field32815 - 1L) * class23.method135(this.field32815 - 1L) + this.field32831.method135(this.field32815) * class23.method135(this.field32815));
        }
    }
    
    private void method25964(final float[] array, final int n) {
        final float[] array2 = new float[2 * this.field32816];
        if (this.field32814 % 2 == 0) {
            array2[0] = array[n] * this.field32830[0];
            array2[1] = array[n] * this.field32830[1];
            for (int i = 1; i < this.field32814 / 2; ++i) {
                final int n2 = 2 * i;
                final int n3 = n2 + 1;
                final int n4 = n + n2;
                final int n5 = n + n3;
                array2[n2] = array[n4] * this.field32830[n2] - array[n5] * this.field32830[n3];
                array2[n3] = array[n4] * this.field32830[n3] + array[n5] * this.field32830[n2];
            }
            array2[this.field32814] = array[n + 1] * this.field32830[this.field32814];
            array2[this.field32814 + 1] = array[n + 1] * this.field32830[this.field32814 + 1];
            for (int j = this.field32814 / 2 + 1; j < this.field32814; ++j) {
                final int n6 = 2 * j;
                final int n7 = n6 + 1;
                final int n8 = n + 2 * this.field32814 - n6;
                final int n9 = n8 + 1;
                array2[n6] = array[n8] * this.field32830[n6] + array[n9] * this.field32830[n7];
                array2[n7] = array[n8] * this.field32830[n7] - array[n9] * this.field32830[n6];
            }
        }
        else {
            array2[0] = array[n] * this.field32830[0];
            array2[1] = array[n] * this.field32830[1];
            for (int k = 1; k < (this.field32814 - 1) / 2; ++k) {
                final int n10 = 2 * k;
                final int n11 = n10 + 1;
                final int n12 = n + n10;
                final int n13 = n + n11;
                array2[n10] = array[n12] * this.field32830[n10] - array[n13] * this.field32830[n11];
                array2[n11] = array[n12] * this.field32830[n11] + array[n13] * this.field32830[n10];
            }
            array2[this.field32814 - 1] = array[n + this.field32814 - 1] * this.field32830[this.field32814 - 1] - array[n + 1] * this.field32830[this.field32814];
            array2[this.field32814] = array[n + this.field32814 - 1] * this.field32830[this.field32814] + array[n + 1] * this.field32830[this.field32814 - 1];
            array2[this.field32814 + 1] = array[n + this.field32814 - 1] * this.field32830[this.field32814 + 1] + array[n + 1] * this.field32830[this.field32814 + 2];
            array2[this.field32814 + 2] = array[n + this.field32814 - 1] * this.field32830[this.field32814 + 2] - array[n + 1] * this.field32830[this.field32814 + 1];
            for (int l = (this.field32814 - 1) / 2 + 2; l < this.field32814; ++l) {
                final int n14 = 2 * l;
                final int n15 = n14 + 1;
                final int n16 = n + 2 * this.field32814 - n14;
                final int n17 = n16 + 1;
                array2[n14] = array[n16] * this.field32830[n14] + array[n17] * this.field32830[n15];
                array2[n15] = array[n16] * this.field32830[n15] - array[n17] * this.field32830[n14];
            }
        }
        Class9133.method33247(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32814 >= Class9133.method33158()) {
            int n18 = 2;
            if (method27224 >= 4 && this.field32814 >= Class9133.method33159()) {
                n18 = 4;
            }
            final Future[] array3 = new Future[n18];
            final int n19 = this.field32816 / n18;
            for (int n20 = 0; n20 < n18; ++n20) {
                final int n21 = n20 * n19;
                array3[n20] = Class8216.method27227(new Class1037(this, n21, (n20 == n18 - 1) ? this.field32816 : (n21 + n19), array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33245(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            final int n22 = this.field32814 / n18;
            for (int n23 = 0; n23 < n18; ++n23) {
                final int n24 = n23 * n22;
                array3[n23] = Class8216.method27227(new Class941(this, n24, (n23 == n18 - 1) ? this.field32814 : (n24 + n22), array, n, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int n25 = 0; n25 < this.field32816; ++n25) {
                final int n26 = 2 * n25;
                final int n27 = n26 + 1;
                final float n28 = -array2[n26] * this.field32832[n27] + array2[n27] * this.field32832[n26];
                array2[n26] = array2[n26] * this.field32832[n26] + array2[n27] * this.field32832[n27];
                array2[n27] = n28;
            }
            Class9133.method33245(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            for (int n29 = 0; n29 < this.field32814; ++n29) {
                final int n30 = 2 * n29;
                final int n31 = n30 + 1;
                array[n + n29] = this.field32830[n30] * array2[n30] - this.field32830[n31] * array2[n31];
            }
        }
    }
    
    private void method25965(final Class22 class22, final long n) {
        final Class22 class23 = new Class22(2L * this.field32817);
        if (this.field32815 % 2L == 0L) {
            class23.method169(0L, class22.method135(n) * this.field32831.method135(0L));
            class23.method169(1L, class22.method135(n) * this.field32831.method135(1L));
            for (long n2 = 1L; n2 < this.field32815 / 2L; ++n2) {
                final long n3 = 2L * n2;
                final long n4 = n3 + 1L;
                final long n5 = n + n3;
                final long n6 = n + n4;
                class23.method169(n3, class22.method135(n5) * this.field32831.method135(n3) - class22.method135(n6) * this.field32831.method135(n4));
                class23.method169(n4, class22.method135(n5) * this.field32831.method135(n4) + class22.method135(n6) * this.field32831.method135(n3));
            }
            class23.method169(this.field32815, class22.method135(n + 1L) * this.field32831.method135(this.field32815));
            class23.method169(this.field32815 + 1L, class22.method135(n + 1L) * this.field32831.method135(this.field32815 + 1L));
            for (long n7 = this.field32815 / 2L + 1L; n7 < this.field32815; ++n7) {
                final long n8 = 2L * n7;
                final long n9 = n8 + 1L;
                final long n10 = n + 2L * this.field32815 - n8;
                final long n11 = n10 + 1L;
                class23.method169(n8, class22.method135(n10) * this.field32831.method135(n8) + class22.method135(n11) * this.field32831.method135(n9));
                class23.method169(n9, class22.method135(n10) * this.field32831.method135(n9) - class22.method135(n11) * this.field32831.method135(n8));
            }
        }
        else {
            class23.method169(0L, class22.method135(n) * this.field32831.method135(0L));
            class23.method169(1L, class22.method135(n) * this.field32831.method135(1L));
            for (long n12 = 1L; n12 < (this.field32815 - 1L) / 2L; ++n12) {
                final long n13 = 2L * n12;
                final long n14 = n13 + 1L;
                final long n15 = n + n13;
                final long n16 = n + n14;
                class23.method169(n13, class22.method135(n15) * this.field32831.method135(n13) - class22.method135(n16) * this.field32831.method135(n14));
                class23.method169(n14, class22.method135(n15) * this.field32831.method135(n14) + class22.method135(n16) * this.field32831.method135(n13));
            }
            class23.method169(this.field32815 - 1L, class22.method135(n + this.field32815 - 1L) * this.field32831.method135(this.field32815 - 1L) - class22.method135(n + 1L) * this.field32831.method135(this.field32815));
            class23.method169(this.field32815, class22.method135(n + this.field32815 - 1L) * this.field32831.method135(this.field32815) + class22.method135(n + 1L) * this.field32831.method135(this.field32815 - 1L));
            class23.method169(this.field32815 + 1L, class22.method135(n + this.field32815 - 1L) * this.field32831.method135(this.field32815 + 1L) + class22.method135(n + 1L) * this.field32831.method135(this.field32815 + 2L));
            class23.method169(this.field32815 + 2L, class22.method135(n + this.field32815 - 1L) * this.field32831.method135(this.field32815 + 2L) - class22.method135(n + 1L) * this.field32831.method135(this.field32815 + 1L));
            for (long n17 = (this.field32815 - 1L) / 2L + 2L; n17 < this.field32815; ++n17) {
                final long n18 = 2L * n17;
                final long n19 = n18 + 1L;
                final long n20 = n + 2L * this.field32815 - n18;
                final long n21 = n20 + 1L;
                class23.method169(n18, class22.method135(n20) * this.field32831.method135(n18) + class22.method135(n21) * this.field32831.method135(n19));
                class23.method169(n19, class22.method135(n20) * this.field32831.method135(n19) - class22.method135(n21) * this.field32831.method135(n18));
            }
        }
        Class9133.method33248(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32815 > Class9133.method33158()) {
            int n22 = 2;
            if (method27224 >= 4 && this.field32815 > Class9133.method33159()) {
                n22 = 4;
            }
            final Future[] array = new Future[n22];
            final long n23 = this.field32817 / n22;
            for (int i = 0; i < n22; ++i) {
                final long n24 = i * n23;
                array[i] = Class8216.method27227(new Class1323(this, n24, (i == n22 - 1) ? this.field32817 : (n24 + n23), class23));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33246(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            final long n25 = this.field32815 / n22;
            for (int j = 0; j < n22; ++j) {
                final long n26 = j * n25;
                array[j] = Class8216.method27227(new Class1476(this, n26, (j == n22 - 1) ? this.field32815 : (n26 + n25), class22, n, class23));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n27 = 0L; n27 < this.field32817; ++n27) {
                final long n28 = 2L * n27;
                final long n29 = n28 + 1L;
                final float n30 = -class23.method135(n28) * this.field32833.method135(n29) + class23.method135(n29) * this.field32833.method135(n28);
                class23.method169(n28, class23.method135(n28) * this.field32833.method135(n28) + class23.method135(n29) * this.field32833.method135(n29));
                class23.method169(n29, n30);
            }
            Class9133.method33246(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            for (long n31 = 0L; n31 < this.field32815; ++n31) {
                final long n32 = 2L * n31;
                final long n33 = n32 + 1L;
                class22.method169(n + n31, this.field32831.method135(n32) * class23.method135(n32) - this.field32831.method135(n33) * class23.method135(n33));
            }
        }
    }
    
    private void method25966(final float[] array, final int n) {
        final float[] array2 = new float[2 * this.field32816];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32814 >= Class9133.method33158()) {
            int n2 = 2;
            if (method27224 >= 4 && this.field32814 >= Class9133.method33159()) {
                n2 = 4;
            }
            final Future[] array3 = new Future[n2];
            final int n3 = this.field32814 / n2;
            for (int i = 0; i < n2; ++i) {
                final int n4 = i * n3;
                array3[i] = Class8216.method27227(new Class1329(this, n4, (i == n2 - 1) ? this.field32814 : (n4 + n3), n, array2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33247(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            final int n5 = this.field32816 / n2;
            for (int j = 0; j < n2; ++j) {
                final int n6 = j * n5;
                array3[j] = Class8216.method27227(new Class1503(this, n6, (j == n2 - 1) ? this.field32816 : (n6 + n5), array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int k = 0; k < this.field32814; ++k) {
                final int n7 = 2 * k;
                final int n8 = n7 + 1;
                final int n9 = n + k;
                array2[n7] = array[n9] * this.field32830[n7];
                array2[n8] = array[n9] * this.field32830[n8];
            }
            Class9133.method33247(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
            for (int l = 0; l < this.field32816; ++l) {
                final int n10 = 2 * l;
                final int n11 = n10 + 1;
                final float n12 = -array2[n10] * this.field32832[n11] + array2[n11] * this.field32832[n10];
                array2[n10] = array2[n10] * this.field32832[n10] + array2[n11] * this.field32832[n11];
                array2[n11] = n12;
            }
        }
        Class9133.method33245(2 * this.field32816, array2, 0, this.field32818, this.field32822, this.field32820);
        if (this.field32814 % 2 == 0) {
            array[n] = this.field32830[0] * array2[0] - this.field32830[1] * array2[1];
            array[n + 1] = this.field32830[this.field32814] * array2[this.field32814] - this.field32830[this.field32814 + 1] * array2[this.field32814 + 1];
            for (int n13 = 1; n13 < this.field32814 / 2; ++n13) {
                final int n14 = 2 * n13;
                final int n15 = n14 + 1;
                array[n + n14] = this.field32830[n14] * array2[n14] - this.field32830[n15] * array2[n15];
                array[n + n15] = this.field32830[n15] * array2[n14] + this.field32830[n14] * array2[n15];
            }
        }
        else {
            array[n] = this.field32830[0] * array2[0] - this.field32830[1] * array2[1];
            array[n + 1] = this.field32830[this.field32814] * array2[this.field32814 - 1] + this.field32830[this.field32814 - 1] * array2[this.field32814];
            for (int n16 = 1; n16 < (this.field32814 - 1) / 2; ++n16) {
                final int n17 = 2 * n16;
                final int n18 = n17 + 1;
                array[n + n17] = this.field32830[n17] * array2[n17] - this.field32830[n18] * array2[n18];
                array[n + n18] = this.field32830[n18] * array2[n17] + this.field32830[n17] * array2[n18];
            }
            array[n + this.field32814 - 1] = this.field32830[this.field32814 - 1] * array2[this.field32814 - 1] - this.field32830[this.field32814] * array2[this.field32814];
        }
    }
    
    private void method25967(final Class22 class22, final long n) {
        final Class22 class23 = new Class22(2L * this.field32817);
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32815 > Class9133.method33158()) {
            int n2 = 2;
            if (method27224 >= 4 && this.field32815 > Class9133.method33159()) {
                n2 = 4;
            }
            final Future[] array = new Future[n2];
            final long n3 = this.field32815 / n2;
            for (int i = 0; i < n2; ++i) {
                final long n4 = i * n3;
                array[i] = Class8216.method27227(new Class1225(this, n4, (i == n2 - 1) ? this.field32815 : (n4 + n3), n, class23, class22));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33248(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            final long n5 = this.field32817 / n2;
            for (int j = 0; j < n2; ++j) {
                final long n6 = j * n5;
                array[j] = Class8216.method27227(new Class1288(this, n6, (j == n2 - 1) ? this.field32817 : (n6 + n5), class23));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7978.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n7 = 0L; n7 < this.field32815; ++n7) {
                final long n8 = 2L * n7;
                final long n9 = n8 + 1L;
                final long n10 = n + n7;
                class23.method169(n8, class22.method135(n10) * this.field32831.method135(n8));
                class23.method169(n9, class22.method135(n10) * this.field32831.method135(n9));
            }
            Class9133.method33248(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
            for (long n11 = 0L; n11 < this.field32817; ++n11) {
                final long n12 = 2L * n11;
                final long n13 = n12 + 1L;
                final float n14 = -class23.method135(n12) * this.field32833.method135(n13) + class23.method135(n13) * this.field32833.method135(n12);
                class23.method169(n12, class23.method135(n12) * this.field32833.method135(n12) + class23.method135(n13) * this.field32833.method135(n13));
                class23.method169(n13, n14);
            }
        }
        Class9133.method33246(2L * this.field32817, class23, 0L, this.field32819, this.field32823, this.field32821);
        if (this.field32815 % 2L == 0L) {
            class22.method169(n, this.field32831.method135(0L) * class23.method135(0L) - this.field32831.method135(1L) * class23.method135(1L));
            class22.method169(n + 1L, this.field32831.method135(this.field32815) * class23.method135(this.field32815) - this.field32831.method135(this.field32815 + 1L) * class23.method135(this.field32815 + 1L));
            for (long n15 = 1L; n15 < this.field32815 / 2L; ++n15) {
                final long n16 = 2L * n15;
                final long n17 = n16 + 1L;
                class22.method169(n + n16, this.field32831.method135(n16) * class23.method135(n16) - this.field32831.method135(n17) * class23.method135(n17));
                class22.method169(n + n17, this.field32831.method135(n17) * class23.method135(n16) + this.field32831.method135(n16) * class23.method135(n17));
            }
        }
        else {
            class22.method169(n, this.field32831.method135(0L) * class23.method135(0L) - this.field32831.method135(1L) * class23.method135(1L));
            class22.method169(n + 1L, this.field32831.method135(this.field32815) * class23.method135(this.field32815 - 1L) + this.field32831.method135(this.field32815 - 1L) * class23.method135(this.field32815));
            for (long n18 = 1L; n18 < (this.field32815 - 1L) / 2L; ++n18) {
                final long n19 = 2L * n18;
                final long n20 = n19 + 1L;
                class22.method169(n + n19, this.field32831.method135(n19) * class23.method135(n19) - this.field32831.method135(n20) * class23.method135(n20));
                class22.method169(n + n20, this.field32831.method135(n20) * class23.method135(n19) + this.field32831.method135(n19) * class23.method135(n20));
            }
            class22.method169(n + this.field32815 - 1L, this.field32831.method135(this.field32815 - 1L) * class23.method135(this.field32815 - 1L) - this.field32831.method135(this.field32815) * class23.method135(this.field32815));
        }
    }
    
    public void method25968(final float[] array, final int n) {
        if (this.field32814 == 1) {
            return;
        }
        final float[] array2 = new float[this.field32814];
        final int n2 = 2 * this.field32814;
        final int n3 = (int)this.field32828[1 + n2];
        int n4 = 1;
        int field32814 = this.field32814;
        int n5 = n2 - 1;
        for (int i = 1; i <= n3; ++i) {
            final int n6 = (int)this.field32828[n3 - i + 2 + n2];
            final int n7 = field32814 / n6;
            final int n8 = this.field32814 / field32814;
            final int n9 = n8 * n7;
            n5 -= (n6 - 1) * n8;
            n4 = 1 - n4;
            switch (n6) {
                case 2: {
                    if (n4 == 0) {
                        this.method25972(n8, n7, array, n, array2, 0, n5);
                        break;
                    }
                    this.method25972(n8, n7, array2, 0, array, n, n5);
                    break;
                }
                case 3: {
                    if (n4 == 0) {
                        this.method25976(n8, n7, array, n, array2, 0, n5);
                        break;
                    }
                    this.method25976(n8, n7, array2, 0, array, n, n5);
                    break;
                }
                case 4: {
                    if (n4 == 0) {
                        this.method25980(n8, n7, array, n, array2, 0, n5);
                        break;
                    }
                    this.method25980(n8, n7, array2, 0, array, n, n5);
                    break;
                }
                case 5: {
                    if (n4 == 0) {
                        this.method25984(n8, n7, array, n, array2, 0, n5);
                        break;
                    }
                    this.method25984(n8, n7, array2, 0, array, n, n5);
                    break;
                }
                default: {
                    if (n8 == 1) {
                        n4 = 1 - n4;
                    }
                    if (n4 == 0) {
                        this.method25988(n8, n6, n7, n9, array, n, array2, 0, n5);
                        n4 = 1;
                        break;
                    }
                    this.method25988(n8, n6, n7, n9, array2, 0, array, n, n5);
                    n4 = 0;
                    break;
                }
            }
            field32814 = n7;
        }
        if (n4 == 1) {
            return;
        }
        System.arraycopy(array2, 0, array, n, this.field32814);
    }
    
    public void method25969(final Class22 class22, final long n) {
        if (this.field32815 == 1L) {
            return;
        }
        final Class22 class23 = new Class22(this.field32815);
        final long n2 = 2L * this.field32815;
        final long n3 = (long)this.field32829.method135(1L + n2);
        long n4 = 1L;
        long field32815 = this.field32815;
        long n5 = n2 - 1L;
        for (long n6 = 1L; n6 <= n3; ++n6) {
            final int n7 = (int)this.field32829.method135(n3 - n6 + 2L + n2);
            final long n8 = field32815 / n7;
            final long n9 = this.field32815 / field32815;
            final long n10 = n9 * n8;
            n5 -= (n7 - 1) * n9;
            n4 = 1L - n4;
            switch (n7) {
                case 2: {
                    if (n4 == 0L) {
                        this.method25973(n9, n8, class22, n, class23, 0L, n5);
                        break;
                    }
                    this.method25973(n9, n8, class23, 0L, class22, n, n5);
                    break;
                }
                case 3: {
                    if (n4 == 0L) {
                        this.method25977(n9, n8, class22, n, class23, 0L, n5);
                        break;
                    }
                    this.method25977(n9, n8, class23, 0L, class22, n, n5);
                    break;
                }
                case 4: {
                    if (n4 == 0L) {
                        this.method25981(n9, n8, class22, n, class23, 0L, n5);
                        break;
                    }
                    this.method25981(n9, n8, class23, 0L, class22, n, n5);
                    break;
                }
                case 5: {
                    if (n4 == 0L) {
                        this.method25985(n9, n8, class22, n, class23, 0L, n5);
                        break;
                    }
                    this.method25985(n9, n8, class23, 0L, class22, n, n5);
                    break;
                }
                default: {
                    if (n9 == 1L) {
                        n4 = 1L - n4;
                    }
                    if (n4 == 0L) {
                        this.method25989(n9, n7, n8, n10, class22, n, class23, 0L, n5);
                        n4 = 1L;
                        break;
                    }
                    this.method25989(n9, n7, n8, n10, class23, 0L, class22, n, n5);
                    n4 = 0L;
                    break;
                }
            }
            field32815 = n8;
        }
        if (n4 == 1L) {
            return;
        }
        Class8601.method29152(class23, 0L, class22, n, this.field32815);
    }
    
    public void method25970(final float[] array, final int n) {
        if (this.field32814 == 1) {
            return;
        }
        final float[] array2 = new float[this.field32814];
        final int n2 = 2 * this.field32814;
        final int n3 = (int)this.field32828[1 + n2];
        int n4 = 0;
        int n5 = 1;
        int field32814 = this.field32814;
        for (int i = 1; i <= n3; ++i) {
            final int n6 = (int)this.field32828[i + 1 + n2];
            final int n7 = n6 * n5;
            final int n8 = this.field32814 / n7;
            final int n9 = n8 * n5;
            switch (n6) {
                case 2: {
                    if (n4 == 0) {
                        this.method25974(n8, n5, array, n, array2, 0, field32814);
                    }
                    else {
                        this.method25974(n8, n5, array2, 0, array, n, field32814);
                    }
                    n4 = 1 - n4;
                    break;
                }
                case 3: {
                    if (n4 == 0) {
                        this.method25978(n8, n5, array, n, array2, 0, field32814);
                    }
                    else {
                        this.method25978(n8, n5, array2, 0, array, n, field32814);
                    }
                    n4 = 1 - n4;
                    break;
                }
                case 4: {
                    if (n4 == 0) {
                        this.method25982(n8, n5, array, n, array2, 0, field32814);
                    }
                    else {
                        this.method25982(n8, n5, array2, 0, array, n, field32814);
                    }
                    n4 = 1 - n4;
                    break;
                }
                case 5: {
                    if (n4 == 0) {
                        this.method25986(n8, n5, array, n, array2, 0, field32814);
                    }
                    else {
                        this.method25986(n8, n5, array2, 0, array, n, field32814);
                    }
                    n4 = 1 - n4;
                    break;
                }
                default: {
                    if (n4 == 0) {
                        this.method25990(n8, n6, n5, n9, array, n, array2, 0, field32814);
                    }
                    else {
                        this.method25990(n8, n6, n5, n9, array2, 0, array, n, field32814);
                    }
                    if (n8 == 1) {
                        n4 = 1 - n4;
                        break;
                    }
                    break;
                }
            }
            n5 = n7;
            field32814 += (n6 - 1) * n8;
        }
        if (n4 == 0) {
            return;
        }
        System.arraycopy(array2, 0, array, n, this.field32814);
    }
    
    public void method25971(final Class22 class22, final long n) {
        if (this.field32815 == 1L) {
            return;
        }
        final Class22 class23 = new Class22(this.field32815);
        final long n2 = 2L * this.field32815;
        final long n3 = (long)this.field32829.method135(1L + n2);
        long n4 = 0L;
        long n5 = 1L;
        long field32815 = this.field32815;
        for (long n6 = 1L; n6 <= n3; ++n6) {
            final int n7 = (int)this.field32829.method135(n6 + 1L + n2);
            final long n8 = n7 * n5;
            final long n9 = this.field32815 / n8;
            final long n10 = n9 * n5;
            switch (n7) {
                case 2: {
                    if (n4 == 0L) {
                        this.method25975(n9, n5, class22, n, class23, 0L, field32815);
                    }
                    else {
                        this.method25975(n9, n5, class23, 0L, class22, n, field32815);
                    }
                    n4 = 1L - n4;
                    break;
                }
                case 3: {
                    if (n4 == 0L) {
                        this.method25979(n9, n5, class22, n, class23, 0L, field32815);
                    }
                    else {
                        this.method25979(n9, n5, class23, 0L, class22, n, field32815);
                    }
                    n4 = 1L - n4;
                    break;
                }
                case 4: {
                    if (n4 == 0L) {
                        this.method25983(n9, n5, class22, n, class23, 0L, field32815);
                    }
                    else {
                        this.method25983(n9, n5, class23, 0L, class22, n, field32815);
                    }
                    n4 = 1L - n4;
                    break;
                }
                case 5: {
                    if (n4 == 0L) {
                        this.method25987(n9, n5, class22, n, class23, 0L, field32815);
                    }
                    else {
                        this.method25987(n9, n5, class23, 0L, class22, n, field32815);
                    }
                    n4 = 1L - n4;
                    break;
                }
                default: {
                    if (n4 == 0L) {
                        this.method25991(n9, n7, n5, n10, class22, n, class23, 0L, field32815);
                    }
                    else {
                        this.method25991(n9, n7, n5, n10, class23, 0L, class22, n, field32815);
                    }
                    if (n9 == 1L) {
                        n4 = 1L - n4;
                        break;
                    }
                    break;
                }
            }
            n5 = n8;
            field32815 += (n7 - 1) * n9;
        }
        if (n4 == 0L) {
            return;
        }
        Class8601.method29152(class23, 0L, class22, n, this.field32815);
    }
    
    public void method25972(final int n, final int n2, final float[] array, final int n3, final float[] array2, final int n4, final int n5) {
        final int n6 = n2 * n;
        int n7 = 2 * n;
        for (int i = 0; i < n2; ++i) {
            final int n8 = n4 + i * n7;
            final int n9 = n8 + n7 - 1;
            final int n10 = n3 + i * n;
            final int n11 = n10 + n6;
            final float n12 = array[n10];
            final float n13 = array[n11];
            array2[n8] = n12 + n13;
            array2[n9] = n12 - n13;
        }
        if (n >= 2) {
            if (n != 2) {
                for (int j = 0; j < n2; ++j) {
                    n7 = j * n;
                    final int n14 = 2 * n7;
                    final int n15 = n14 + n;
                    final int n16 = n7 + n6;
                    for (int k = 2; k < n; k += 2) {
                        final int n17 = n - k;
                        final int n18 = k - 1 + n5;
                        final int n19 = n4 + k + n14;
                        final int n20 = n4 + n17 + n15;
                        final int n21 = n3 + k + n7;
                        final int n22 = n3 + k + n16;
                        final float n23 = array[n21 - 1];
                        final float n24 = array[n21];
                        final float n25 = array[n22 - 1];
                        final float n26 = array[n22];
                        final float n27 = this.field32828[n18 - 1];
                        final float n28 = this.field32828[n18];
                        final float n29 = n27 * n25 + n28 * n26;
                        final float n30 = n27 * n26 - n28 * n25;
                        array2[n19] = n24 + n30;
                        array2[n19 - 1] = n23 + n29;
                        array2[n20] = n30 - n24;
                        array2[n20 - 1] = n23 - n29;
                    }
                }
                if (n % 2 == 1) {
                    return;
                }
            }
            final int n31 = 2 * n7;
            for (int l = 0; l < n2; ++l) {
                final int n32 = l * n;
                final int n33 = n4 + n31 + n;
                final int n34 = n3 + n - 1 + n32;
                array2[n33] = -array[n34 + n6];
                array2[n33 - 1] = array[n34];
            }
        }
    }
    
    public void method25973(final long n, final long n2, final Class22 class22, final long n3, final Class22 class23, final long n4, final long n5) {
        final long n6 = n2 * n;
        long n7 = 2L * n;
        for (long n8 = 0L; n8 < n2; ++n8) {
            final long n9 = n4 + n8 * n7;
            final long n10 = n9 + n7 - 1L;
            final long n11 = n3 + n8 * n;
            final long n12 = n11 + n6;
            final float method135 = class22.method135(n11);
            final float method136 = class22.method135(n12);
            class23.method169(n9, method135 + method136);
            class23.method169(n10, method135 - method136);
        }
        if (n >= 2L) {
            if (n != 2L) {
                for (long n13 = 0L; n13 < n2; ++n13) {
                    n7 = n13 * n;
                    final long n14 = 2L * n7;
                    final long n15 = n14 + n;
                    final long n16 = n7 + n6;
                    for (long n17 = 2L; n17 < n; n17 += 2L) {
                        final long n18 = n - n17;
                        final long n19 = n17 - 1L + n5;
                        final long n20 = n4 + n17 + n14;
                        final long n21 = n4 + n18 + n15;
                        final long n22 = n3 + n17 + n7;
                        final long n23 = n3 + n17 + n16;
                        final float method137 = class22.method135(n22 - 1L);
                        final float method138 = class22.method135(n22);
                        final float method139 = class22.method135(n23 - 1L);
                        final float method140 = class22.method135(n23);
                        final float method141 = this.field32829.method135(n19 - 1L);
                        final float method142 = this.field32829.method135(n19);
                        final float n24 = method141 * method139 + method142 * method140;
                        final float n25 = method141 * method140 - method142 * method139;
                        class23.method169(n20, method138 + n25);
                        class23.method169(n20 - 1L, method137 + n24);
                        class23.method169(n21, n25 - method138);
                        class23.method169(n21 - 1L, method137 - n24);
                    }
                }
                if (n % 2L == 1L) {
                    return;
                }
            }
            final long n26 = 2L * n7;
            for (long n27 = 0L; n27 < n2; ++n27) {
                final long n28 = n27 * n;
                final long n29 = n4 + n26 + n;
                final long n30 = n3 + n - 1L + n28;
                class23.method169(n29, -class22.method135(n30 + n6));
                class23.method169(n29 - 1L, class22.method135(n30));
            }
        }
    }
    
    public void method25974(final int n, final int n2, final float[] array, final int n3, final float[] array2, final int n4, final int n5) {
        final int n6 = n2 * n;
        for (int i = 0; i < n2; ++i) {
            final int n7 = i * n;
            final int n8 = 2 * n7;
            final int n9 = n8 + n;
            final int n10 = n4 + n7;
            final int n11 = n3 + n8;
            final int n12 = n3 + n - 1 + n9;
            final float n13 = array[n11];
            final float n14 = array[n12];
            array2[n10] = n13 + n14;
            array2[n10 + n6] = n13 - n14;
        }
        if (n >= 2) {
            if (n != 2) {
                for (int j = 0; j < n2; ++j) {
                    final int n15 = j * n;
                    final int n16 = 2 * n15;
                    final int n17 = n16 + n;
                    final int n18 = n15 + n6;
                    for (int k = 2; k < n; k += 2) {
                        final int n19 = n - k;
                        final int n20 = k - 1 + n5;
                        final int n21 = n4 + k;
                        final int n22 = n3 + k;
                        final int n23 = n3 + n19;
                        final float n24 = this.field32828[n20 - 1];
                        final float n25 = this.field32828[n20];
                        final int n26 = n22 + n16;
                        final int n27 = n23 + n17;
                        final int n28 = n21 + n15;
                        final int n29 = n21 + n18;
                        final float n30 = array[n26 - 1] - array[n27 - 1];
                        final float n31 = array[n26] + array[n27];
                        final float n32 = array[n26];
                        final float n33 = array[n26 - 1];
                        final float n34 = array[n27];
                        array2[n28 - 1] = n33 + array[n27 - 1];
                        array2[n28] = n32 - n34;
                        array2[n29 - 1] = n24 * n30 - n25 * n31;
                        array2[n29] = n24 * n31 + n25 * n30;
                    }
                }
                if (n % 2 == 1) {
                    return;
                }
            }
            for (int l = 0; l < n2; ++l) {
                final int n35 = l * n;
                final int n36 = 2 * n35;
                final int n37 = n4 + n - 1 + n35;
                final int n38 = n3 + n36 + n;
                array2[n37] = 2.0f * array[n38 - 1];
                array2[n37 + n6] = -2.0f * array[n38];
            }
        }
    }
    
    public void method25975(final long n, final long n2, final Class22 class22, final long n3, final Class22 class23, final long n4, final long n5) {
        final long n6 = n2 * n;
        for (long n7 = 0L; n7 < n2; ++n7) {
            final long n8 = n7 * n;
            final long n9 = 2L * n8;
            final long n10 = n9 + n;
            final long n11 = n4 + n8;
            final long n12 = n3 + n9;
            final long n13 = n3 + n - 1L + n10;
            final float method135 = class22.method135(n12);
            final float method136 = class22.method135(n13);
            class23.method169(n11, method135 + method136);
            class23.method169(n11 + n6, method135 - method136);
        }
        if (n >= 2L) {
            if (n != 2L) {
                for (long n14 = 0L; n14 < n2; ++n14) {
                    final long n15 = n14 * n;
                    final long n16 = 2L * n15;
                    final long n17 = n16 + n;
                    final long n18 = n15 + n6;
                    for (long n19 = 2L; n19 < n; n19 += 2L) {
                        final long n20 = n - n19;
                        final long n21 = n19 - 1L + n5;
                        final long n22 = n4 + n19;
                        final long n23 = n3 + n19;
                        final long n24 = n3 + n20;
                        final float method137 = this.field32829.method135(n21 - 1L);
                        final float method138 = this.field32829.method135(n21);
                        final long n25 = n23 + n16;
                        final long n26 = n24 + n17;
                        final long n27 = n22 + n15;
                        final long n28 = n22 + n18;
                        final float n29 = class22.method135(n25 - 1L) - class22.method135(n26 - 1L);
                        final float n30 = class22.method135(n25) + class22.method135(n26);
                        final float method139 = class22.method135(n25);
                        final float method140 = class22.method135(n25 - 1L);
                        final float method141 = class22.method135(n26);
                        class23.method169(n27 - 1L, method140 + class22.method135(n26 - 1L));
                        class23.method169(n27, method139 - method141);
                        class23.method169(n28 - 1L, method137 * n29 - method138 * n30);
                        class23.method169(n28, method137 * n30 + method138 * n29);
                    }
                }
                if (n % 2L == 1L) {
                    return;
                }
            }
            for (long n31 = 0L; n31 < n2; ++n31) {
                final long n32 = n31 * n;
                final long n33 = 2L * n32;
                final long n34 = n4 + n - 1L + n32;
                final long n35 = n3 + n33 + n;
                class23.method169(n34, 2.0f * class22.method135(n35 - 1L));
                class23.method169(n34 + n6, -2.0f * class22.method135(n35));
            }
        }
    }
    
    public void method25976(final int n, final int n2, final float[] array, final int n3, final float[] array2, final int n4, final int n5) {
        final int n6 = n5 + n;
        final int n7 = n2 * n;
        for (int i = 0; i < n2; ++i) {
            final int n8 = i * n;
            final int n9 = 2 * n7;
            final int n10 = (3 * i + 1) * n;
            final int n11 = n3 + n8;
            final int n12 = n11 + n7;
            final int n13 = n11 + n9;
            final float n14 = array[n11];
            final float n15 = array[n12];
            final float n16 = array[n13];
            final float n17 = n15 + n16;
            array2[n4 + 3 * n8] = n14 + n17;
            array2[n4 + n10 + n] = 0.8660254f * (n16 - n15);
            array2[n4 + n - 1 + n10] = n14 + -0.5f * n17;
        }
        if (n != 1) {
            for (int j = 0; j < n2; ++j) {
                final int n18 = j * n;
                final int n19 = 3 * n18;
                final int n20 = n18 + n7;
                final int n21 = n20 + n7;
                final int n22 = n19 + n;
                final int n23 = n22 + n;
                for (int k = 2; k < n; k += 2) {
                    final int n24 = n - k;
                    final int n25 = k - 1 + n5;
                    final int n26 = k - 1 + n6;
                    final float n27 = this.field32828[n25 - 1];
                    final float n28 = this.field32828[n25];
                    final float n29 = this.field32828[n26 - 1];
                    final float n30 = this.field32828[n26];
                    final int n31 = n3 + k;
                    final int n32 = n4 + k;
                    final int n33 = n4 + n24;
                    final int n34 = n31 + n18;
                    final int n35 = n31 + n20;
                    final int n36 = n31 + n21;
                    final float n37 = array[n34 - 1];
                    final float n38 = array[n34];
                    final float n39 = array[n35 - 1];
                    final float n40 = array[n35];
                    final float n41 = array[n36 - 1];
                    final float n42 = array[n36];
                    final float n43 = n27 * n39 + n28 * n40;
                    final float n44 = n27 * n40 - n28 * n39;
                    final float n45 = n29 * n41 + n30 * n42;
                    final float n46 = n29 * n42 - n30 * n41;
                    final float n47 = n43 + n45;
                    final float n48 = n44 + n46;
                    final float n49 = n37 + -0.5f * n47;
                    final float n50 = n38 + -0.5f * n48;
                    final float n51 = 0.8660254f * (n44 - n46);
                    final float n52 = 0.8660254f * (n45 - n43);
                    final int n53 = n32 + n19;
                    final int n54 = n33 + n22;
                    final int n55 = n32 + n23;
                    array2[n53 - 1] = n37 + n47;
                    array2[n53] = n38 + n48;
                    array2[n54 - 1] = n49 - n51;
                    array2[n54] = n52 - n50;
                    array2[n55 - 1] = n49 + n51;
                    array2[n55] = n50 + n52;
                }
            }
        }
    }
    
    public void method25977(final long n, final long n2, final Class22 class22, final long n3, final Class22 class23, final long n4, final long n5) {
        final long n6 = n5 + n;
        final long n7 = n2 * n;
        for (long n8 = 0L; n8 < n2; ++n8) {
            final long n9 = n8 * n;
            final long n10 = 2L * n7;
            final long n11 = (3L * n8 + 1L) * n;
            final long n12 = n3 + n9;
            final long n13 = n12 + n7;
            final long n14 = n12 + n10;
            final float method135 = class22.method135(n12);
            final float method136 = class22.method135(n13);
            final float method137 = class22.method135(n14);
            final float n15 = method136 + method137;
            class23.method169(n4 + 3L * n9, method135 + n15);
            class23.method169(n4 + n11 + n, 0.8660254f * (method137 - method136));
            class23.method169(n4 + n - 1L + n11, method135 + -0.5f * n15);
        }
        if (n != 1L) {
            for (long n16 = 0L; n16 < n2; ++n16) {
                final long n17 = n16 * n;
                final long n18 = 3L * n17;
                final long n19 = n17 + n7;
                final long n20 = n19 + n7;
                final long n21 = n18 + n;
                final long n22 = n21 + n;
                for (long n23 = 2L; n23 < n; n23 += 2L) {
                    final long n24 = n - n23;
                    final long n25 = n23 - 1L + n5;
                    final long n26 = n23 - 1L + n6;
                    final float method138 = this.field32829.method135(n25 - 1L);
                    final float method139 = this.field32829.method135(n25);
                    final float method140 = this.field32829.method135(n26 - 1L);
                    final float method141 = this.field32829.method135(n26);
                    final long n27 = n3 + n23;
                    final long n28 = n4 + n23;
                    final long n29 = n4 + n24;
                    final long n30 = n27 + n17;
                    final long n31 = n27 + n19;
                    final long n32 = n27 + n20;
                    final float method142 = class22.method135(n30 - 1L);
                    final float method143 = class22.method135(n30);
                    final float method144 = class22.method135(n31 - 1L);
                    final float method145 = class22.method135(n31);
                    final float method146 = class22.method135(n32 - 1L);
                    final float method147 = class22.method135(n32);
                    final float n33 = method138 * method144 + method139 * method145;
                    final float n34 = method138 * method145 - method139 * method144;
                    final float n35 = method140 * method146 + method141 * method147;
                    final float n36 = method140 * method147 - method141 * method146;
                    final float n37 = n33 + n35;
                    final float n38 = n34 + n36;
                    final float n39 = method142 + -0.5f * n37;
                    final float n40 = method143 + -0.5f * n38;
                    final float n41 = 0.8660254f * (n34 - n36);
                    final float n42 = 0.8660254f * (n35 - n33);
                    final long n43 = n28 + n18;
                    final long n44 = n29 + n21;
                    final long n45 = n28 + n22;
                    class23.method169(n43 - 1L, method142 + n37);
                    class23.method169(n43, method143 + n38);
                    class23.method169(n44 - 1L, n39 - n41);
                    class23.method169(n44, n42 - n40);
                    class23.method169(n45 - 1L, n39 + n41);
                    class23.method169(n45, n40 + n42);
                }
            }
        }
    }
    
    public void method25978(final int n, final int n2, final float[] array, final int n3, final float[] array2, final int n4, final int n5) {
        final int n6 = n5 + n;
        for (int i = 0; i < n2; ++i) {
            final int n7 = i * n;
            final int n8 = n3 + 3 * n7;
            final int n9 = n8 + 2 * n;
            final float n10 = array[n8];
            final float n11 = 2.0f * array[n9 - 1];
            final float n12 = n10 + -0.5f * n11;
            final float n13 = 1.7320508f * array[n9];
            array2[n4 + n7] = n10 + n11;
            array2[n4 + (i + n2) * n] = n12 - n13;
            array2[n4 + (i + 2 * n2) * n] = n12 + n13;
        }
        if (n != 1) {
            final int n14 = n2 * n;
            for (int j = 0; j < n2; ++j) {
                final int n15 = j * n;
                final int n16 = 3 * n15;
                final int n17 = n16 + n;
                final int n18 = n17 + n;
                final int n19 = n15 + n14;
                final int n20 = n19 + n14;
                for (int k = 2; k < n; k += 2) {
                    final int n21 = n - k;
                    final int n22 = n3 + k;
                    final int n23 = n3 + n21;
                    final int n24 = n4 + k;
                    final int n25 = n22 + n16;
                    final int n26 = n22 + n18;
                    final int n27 = n23 + n17;
                    final float n28 = array[n25 - 1];
                    final float n29 = array[n25];
                    final float n30 = array[n26 - 1];
                    final float n31 = array[n26];
                    final float n32 = array[n27 - 1];
                    final float n33 = array[n27];
                    final float n34 = n30 + n32;
                    final float n35 = n28 + -0.5f * n34;
                    final float n36 = n31 - n33;
                    final float n37 = n29 + -0.5f * n36;
                    final float n38 = 0.8660254f * (n30 - n32);
                    final float n39 = 0.8660254f * (n31 + n33);
                    final float n40 = n35 - n39;
                    final float n41 = n35 + n39;
                    final float n42 = n37 + n38;
                    final float n43 = n37 - n38;
                    final int n44 = k - 1 + n5;
                    final int n45 = k - 1 + n6;
                    final float n46 = this.field32828[n44 - 1];
                    final float n47 = this.field32828[n44];
                    final float n48 = this.field32828[n45 - 1];
                    final float n49 = this.field32828[n45];
                    final int n50 = n24 + n15;
                    final int n51 = n24 + n19;
                    final int n52 = n24 + n20;
                    array2[n50 - 1] = n28 + n34;
                    array2[n50] = n29 + n36;
                    array2[n51 - 1] = n46 * n40 - n47 * n42;
                    array2[n51] = n46 * n42 + n47 * n40;
                    array2[n52 - 1] = n48 * n41 - n49 * n43;
                    array2[n52] = n48 * n43 + n49 * n41;
                }
            }
        }
    }
    
    public void method25979(final long n, final long n2, final Class22 class22, final long n3, final Class22 class23, final long n4, final long n5) {
        final long n6 = n5 + n;
        for (long n7 = 0L; n7 < n2; ++n7) {
            final long n8 = n7 * n;
            final long n9 = n3 + 3L * n8;
            final long n10 = n9 + 2L * n;
            final float method135 = class22.method135(n9);
            final float n11 = 2.0f * class22.method135(n10 - 1L);
            final float n12 = method135 + -0.5f * n11;
            final float n13 = 1.7320508f * class22.method135(n10);
            class23.method169(n4 + n8, method135 + n11);
            class23.method169(n4 + (n7 + n2) * n, n12 - n13);
            class23.method169(n4 + (n7 + 2L * n2) * n, n12 + n13);
        }
        if (n != 1L) {
            final long n14 = n2 * n;
            for (long n15 = 0L; n15 < n2; ++n15) {
                final long n16 = n15 * n;
                final long n17 = 3L * n16;
                final long n18 = n17 + n;
                final long n19 = n18 + n;
                final long n20 = n16 + n14;
                final long n21 = n20 + n14;
                for (long n22 = 2L; n22 < n; n22 += 2L) {
                    final long n23 = n - n22;
                    final long n24 = n3 + n22;
                    final long n25 = n3 + n23;
                    final long n26 = n4 + n22;
                    final long n27 = n24 + n17;
                    final long n28 = n24 + n19;
                    final long n29 = n25 + n18;
                    final float method136 = class22.method135(n27 - 1L);
                    final float method137 = class22.method135(n27);
                    final float method138 = class22.method135(n28 - 1L);
                    final float method139 = class22.method135(n28);
                    final float method140 = class22.method135(n29 - 1L);
                    final float method141 = class22.method135(n29);
                    final float n30 = method138 + method140;
                    final float n31 = method136 + -0.5f * n30;
                    final float n32 = method139 - method141;
                    final float n33 = method137 + -0.5f * n32;
                    final float n34 = 0.8660254f * (method138 - method140);
                    final float n35 = 0.8660254f * (method139 + method141);
                    final float n36 = n31 - n35;
                    final float n37 = n31 + n35;
                    final float n38 = n33 + n34;
                    final float n39 = n33 - n34;
                    final long n40 = n22 - 1L + n5;
                    final long n41 = n22 - 1L + n6;
                    final float method142 = this.field32829.method135(n40 - 1L);
                    final float method143 = this.field32829.method135(n40);
                    final float method144 = this.field32829.method135(n41 - 1L);
                    final float method145 = this.field32829.method135(n41);
                    final long n42 = n26 + n16;
                    final long n43 = n26 + n20;
                    final long n44 = n26 + n21;
                    class23.method169(n42 - 1L, method136 + n30);
                    class23.method169(n42, method137 + n32);
                    class23.method169(n43 - 1L, method142 * n36 - method143 * n38);
                    class23.method169(n43, method142 * n38 + method143 * n36);
                    class23.method169(n44 - 1L, method144 * n37 - method145 * n39);
                    class23.method169(n44, method144 * n39 + method145 * n37);
                }
            }
        }
    }
    
    public void method25980(final int n, final int n2, final float[] array, final int n3, final float[] array2, final int n4, final int n5) {
        final int n6 = n5 + n;
        final int n7 = n6 + n;
        final int n8 = n2 * n;
        for (int i = 0; i < n2; ++i) {
            final int n9 = i * n;
            final int n10 = 4 * n9;
            final int n11 = n9 + n8;
            final int n12 = n11 + n8;
            final int n13 = n12 + n8;
            final int n14 = n10 + n;
            final float n15 = array[n3 + n9];
            final float n16 = array[n3 + n11];
            final float n17 = array[n3 + n12];
            final float n18 = array[n3 + n13];
            final float n19 = n16 + n18;
            final float n20 = n15 + n17;
            final int n21 = n4 + n10;
            final int n22 = n4 + n14 + n;
            array2[n21] = n19 + n20;
            array2[n22 - 1 + n + n] = n20 - n19;
            array2[n22 - 1] = n15 - n17;
            array2[n22] = n18 - n16;
        }
        if (n >= 2) {
            if (n != 2) {
                for (int j = 0; j < n2; ++j) {
                    final int n23 = j * n;
                    final int n24 = n23 + n8;
                    final int n25 = n24 + n8;
                    final int n26 = n25 + n8;
                    final int n27 = 4 * n23;
                    final int n28 = n27 + n;
                    final int n29 = n28 + n;
                    final int n30 = n29 + n;
                    for (int k = 2; k < n; k += 2) {
                        final int n31 = n - k;
                        final int n32 = k - 1 + n5;
                        final int n33 = k - 1 + n6;
                        final int n34 = k - 1 + n7;
                        final float n35 = this.field32828[n32 - 1];
                        final float n36 = this.field32828[n32];
                        final float n37 = this.field32828[n33 - 1];
                        final float n38 = this.field32828[n33];
                        final float n39 = this.field32828[n34 - 1];
                        final float n40 = this.field32828[n34];
                        final int n41 = n3 + k;
                        final int n42 = n4 + k;
                        final int n43 = n4 + n31;
                        final int n44 = n41 + n23;
                        final int n45 = n41 + n24;
                        final int n46 = n41 + n25;
                        final int n47 = n41 + n26;
                        final float n48 = array[n44 - 1];
                        final float n49 = array[n44];
                        final float n50 = array[n45 - 1];
                        final float n51 = array[n45];
                        final float n52 = array[n46 - 1];
                        final float n53 = array[n46];
                        final float n54 = array[n47 - 1];
                        final float n55 = array[n47];
                        final float n56 = n35 * n50 + n36 * n51;
                        final float n57 = n35 * n51 - n36 * n50;
                        final float n58 = n37 * n52 + n38 * n53;
                        final float n59 = n37 * n53 - n38 * n52;
                        final float n60 = n39 * n54 + n40 * n55;
                        final float n61 = n39 * n55 - n40 * n54;
                        final float n62 = n56 + n60;
                        final float n63 = n60 - n56;
                        final float n64 = n57 + n61;
                        final float n65 = n57 - n61;
                        final float n66 = n49 + n59;
                        final float n67 = n49 - n59;
                        final float n68 = n48 + n58;
                        final float n69 = n48 - n58;
                        final int n70 = n42 + n27;
                        final int n71 = n43 + n28;
                        final int n72 = n42 + n29;
                        final int n73 = n43 + n30;
                        array2[n70 - 1] = n62 + n68;
                        array2[n73 - 1] = n68 - n62;
                        array2[n70] = n64 + n66;
                        array2[n73] = n64 - n66;
                        array2[n72 - 1] = n65 + n69;
                        array2[n71 - 1] = n69 - n65;
                        array2[n72] = n63 + n67;
                        array2[n71] = n63 - n67;
                    }
                }
                if (n % 2 == 1) {
                    return;
                }
            }
            for (int l = 0; l < n2; ++l) {
                final int n74 = l * n;
                final int n75 = 4 * n74;
                final int n76 = n74 + n8;
                final int n77 = n76 + n8;
                final int n78 = n77 + n8;
                final int n79 = n75 + n;
                final int n80 = n79 + n;
                final int n81 = n80 + n;
                final int n82 = n3 + n;
                final int n83 = n4 + n;
                final float n84 = array[n82 - 1 + n74];
                final float n85 = array[n82 - 1 + n76];
                final float n86 = array[n82 - 1 + n77];
                final float n87 = array[n82 - 1 + n78];
                final float n88 = -0.70710677f * (n85 + n87);
                final float n89 = 0.70710677f * (n85 - n87);
                array2[n83 - 1 + n75] = n89 + n84;
                array2[n83 - 1 + n80] = n84 - n89;
                array2[n4 + n79] = n88 - n86;
                array2[n4 + n81] = n88 + n86;
            }
        }
    }
    
    public void method25981(final long n, final long n2, final Class22 class22, final long n3, final Class22 class23, final long n4, final long n5) {
        final long n6 = n5 + n;
        final long n7 = n6 + n;
        final long n8 = n2 * n;
        for (long n9 = 0L; n9 < n2; ++n9) {
            final long n10 = n9 * n;
            final long n11 = 4L * n10;
            final long n12 = n10 + n8;
            final long n13 = n12 + n8;
            final long n14 = n13 + n8;
            final long n15 = n11 + n;
            final float method135 = class22.method135(n3 + n10);
            final float method136 = class22.method135(n3 + n12);
            final float method137 = class22.method135(n3 + n13);
            final float method138 = class22.method135(n3 + n14);
            final float n16 = method136 + method138;
            final float n17 = method135 + method137;
            final long n18 = n4 + n11;
            final long n19 = n4 + n15 + n;
            class23.method169(n18, n16 + n17);
            class23.method169(n19 - 1L + n + n, n17 - n16);
            class23.method169(n19 - 1L, method135 - method137);
            class23.method169(n19, method138 - method136);
        }
        if (n >= 2L) {
            if (n != 2L) {
                for (long n20 = 0L; n20 < n2; ++n20) {
                    final long n21 = n20 * n;
                    final long n22 = n21 + n8;
                    final long n23 = n22 + n8;
                    final long n24 = n23 + n8;
                    final long n25 = 4L * n21;
                    final long n26 = n25 + n;
                    final long n27 = n26 + n;
                    final long n28 = n27 + n;
                    for (long n29 = 2L; n29 < n; n29 += 2L) {
                        final long n30 = n - n29;
                        final long n31 = n29 - 1L + n5;
                        final long n32 = n29 - 1L + n6;
                        final long n33 = n29 - 1L + n7;
                        final float method139 = this.field32829.method135(n31 - 1L);
                        final float method140 = this.field32829.method135(n31);
                        final float method141 = this.field32829.method135(n32 - 1L);
                        final float method142 = this.field32829.method135(n32);
                        final float method143 = this.field32829.method135(n33 - 1L);
                        final float method144 = this.field32829.method135(n33);
                        final long n34 = n3 + n29;
                        final long n35 = n4 + n29;
                        final long n36 = n4 + n30;
                        final long n37 = n34 + n21;
                        final long n38 = n34 + n22;
                        final long n39 = n34 + n23;
                        final long n40 = n34 + n24;
                        final float method145 = class22.method135(n37 - 1L);
                        final float method146 = class22.method135(n37);
                        final float method147 = class22.method135(n38 - 1L);
                        final float method148 = class22.method135(n38);
                        final float method149 = class22.method135(n39 - 1L);
                        final float method150 = class22.method135(n39);
                        final float method151 = class22.method135(n40 - 1L);
                        final float method152 = class22.method135(n40);
                        final float n41 = method139 * method147 + method140 * method148;
                        final float n42 = method139 * method148 - method140 * method147;
                        final float n43 = method141 * method149 + method142 * method150;
                        final float n44 = method141 * method150 - method142 * method149;
                        final float n45 = method143 * method151 + method144 * method152;
                        final float n46 = method143 * method152 - method144 * method151;
                        final float n47 = n41 + n45;
                        final float n48 = n45 - n41;
                        final float n49 = n42 + n46;
                        final float n50 = n42 - n46;
                        final float n51 = method146 + n44;
                        final float n52 = method146 - n44;
                        final float n53 = method145 + n43;
                        final float n54 = method145 - n43;
                        final long n55 = n35 + n25;
                        final long n56 = n36 + n26;
                        final long n57 = n35 + n27;
                        final long n58 = n36 + n28;
                        class23.method169(n55 - 1L, n47 + n53);
                        class23.method169(n58 - 1L, n53 - n47);
                        class23.method169(n55, n49 + n51);
                        class23.method169(n58, n49 - n51);
                        class23.method169(n57 - 1L, n50 + n54);
                        class23.method169(n56 - 1L, n54 - n50);
                        class23.method169(n57, n48 + n52);
                        class23.method169(n56, n48 - n52);
                    }
                }
                if (n % 2L == 1L) {
                    return;
                }
            }
            for (long n59 = 0L; n59 < n2; ++n59) {
                final long n60 = n59 * n;
                final long n61 = 4L * n60;
                final long n62 = n60 + n8;
                final long n63 = n62 + n8;
                final long n64 = n63 + n8;
                final long n65 = n61 + n;
                final long n66 = n65 + n;
                final long n67 = n66 + n;
                final long n68 = n3 + n;
                final long n69 = n4 + n;
                final float method153 = class22.method135(n68 - 1L + n60);
                final float method154 = class22.method135(n68 - 1L + n62);
                final float method155 = class22.method135(n68 - 1L + n63);
                final float method156 = class22.method135(n68 - 1L + n64);
                final float n70 = -0.70710677f * (method154 + method156);
                final float n71 = 0.70710677f * (method154 - method156);
                class23.method169(n69 - 1L + n61, n71 + method153);
                class23.method169(n69 - 1L + n66, method153 - n71);
                class23.method169(n4 + n65, n70 - method155);
                class23.method169(n4 + n67, n70 + method155);
            }
        }
    }
    
    public void method25982(final int n, final int n2, final float[] array, final int n3, final float[] array2, final int n4, final int n5) {
        final int n6 = n5 + n;
        final int n7 = n6 + n;
        final int n8 = n2 * n;
        for (int i = 0; i < n2; ++i) {
            final int n9 = i * n;
            final int n10 = 4 * n9;
            final int n11 = n9 + n8;
            final int n12 = n11 + n8;
            final int n13 = n12 + n8;
            final int n14 = n10 + n;
            final int n15 = n14 + n;
            final int n16 = n15 + n;
            final float n17 = array[n3 + n10];
            final float n18 = array[n3 + n15];
            final float n19 = array[n3 + n - 1 + n16];
            final float n20 = array[n3 + n - 1 + n14];
            final float n21 = n17 - n19;
            final float n22 = n17 + n19;
            final float n23 = n20 + n20;
            final float n24 = n18 + n18;
            array2[n4 + n9] = n22 + n23;
            array2[n4 + n11] = n21 - n24;
            array2[n4 + n12] = n22 - n23;
            array2[n4 + n13] = n21 + n24;
        }
        if (n >= 2) {
            if (n != 2) {
                for (int j = 0; j < n2; ++j) {
                    final int n25 = j * n;
                    final int n26 = n25 + n8;
                    final int n27 = n26 + n8;
                    final int n28 = n27 + n8;
                    final int n29 = 4 * n25;
                    final int n30 = n29 + n;
                    final int n31 = n30 + n;
                    final int n32 = n31 + n;
                    for (int k = 2; k < n; k += 2) {
                        final int n33 = n - k;
                        final int n34 = k - 1 + n5;
                        final int n35 = k - 1 + n6;
                        final int n36 = k - 1 + n7;
                        final float n37 = this.field32828[n34 - 1];
                        final float n38 = this.field32828[n34];
                        final float n39 = this.field32828[n35 - 1];
                        final float n40 = this.field32828[n35];
                        final float n41 = this.field32828[n36 - 1];
                        final float n42 = this.field32828[n36];
                        final int n43 = n3 + k;
                        final int n44 = n3 + n33;
                        final int n45 = n4 + k;
                        final int n46 = n43 + n29;
                        final int n47 = n44 + n30;
                        final int n48 = n43 + n31;
                        final int n49 = n44 + n32;
                        final float n50 = array[n46 - 1];
                        final float n51 = array[n46];
                        final float n52 = array[n47 - 1];
                        final float n53 = array[n47];
                        final float n54 = array[n48 - 1];
                        final float n55 = array[n48];
                        final float n56 = array[n49 - 1];
                        final float n57 = array[n49];
                        final float n58 = n51 + n57;
                        final float n59 = n51 - n57;
                        final float n60 = n55 - n53;
                        final float n61 = n55 + n53;
                        final float n62 = n50 - n56;
                        final float n63 = n50 + n56;
                        final float n64 = n54 - n52;
                        final float n65 = n54 + n52;
                        final float n66 = n63 - n65;
                        final float n67 = n59 - n60;
                        final float n68 = n62 - n61;
                        final float n69 = n62 + n61;
                        final float n70 = n58 + n64;
                        final float n71 = n58 - n64;
                        final int n72 = n45 + n25;
                        final int n73 = n45 + n26;
                        final int n74 = n45 + n27;
                        final int n75 = n45 + n28;
                        array2[n72 - 1] = n63 + n65;
                        array2[n72] = n59 + n60;
                        array2[n73 - 1] = n37 * n68 - n38 * n70;
                        array2[n73] = n37 * n70 + n38 * n68;
                        array2[n74 - 1] = n39 * n66 - n40 * n67;
                        array2[n74] = n39 * n67 + n40 * n66;
                        array2[n75 - 1] = n41 * n69 - n42 * n71;
                        array2[n75] = n41 * n71 + n42 * n69;
                    }
                }
                if (n % 2 == 1) {
                    return;
                }
            }
            for (int l = 0; l < n2; ++l) {
                final int n76 = l * n;
                final int n77 = 4 * n76;
                final int n78 = n76 + n8;
                final int n79 = n78 + n8;
                final int n80 = n79 + n8;
                final int n81 = n77 + n;
                final int n82 = n81 + n;
                final int n83 = n82 + n;
                final int n84 = n3 + n;
                final int n85 = n4 + n;
                final float n86 = array[n84 - 1 + n77];
                final float n87 = array[n84 - 1 + n82];
                final float n88 = array[n3 + n81];
                final float n89 = array[n3 + n83];
                final float n90 = n88 + n89;
                final float n91 = n89 - n88;
                final float n92 = n86 - n87;
                final float n93 = n86 + n87;
                array2[n85 - 1 + n76] = n93 + n93;
                array2[n85 - 1 + n78] = 1.4142135f * (n92 - n90);
                array2[n85 - 1 + n79] = n91 + n91;
                array2[n85 - 1 + n80] = -1.4142135f * (n92 + n90);
            }
        }
    }
    
    public void method25983(final long n, final long n2, final Class22 class22, final long n3, final Class22 class23, final long n4, final long n5) {
        final long n6 = n5 + n;
        final long n7 = n6 + n;
        final long n8 = n2 * n;
        for (long n9 = 0L; n9 < n2; ++n9) {
            final long n10 = n9 * n;
            final long n11 = 4L * n10;
            final long n12 = n10 + n8;
            final long n13 = n12 + n8;
            final long n14 = n13 + n8;
            final long n15 = n11 + n;
            final long n16 = n15 + n;
            final long n17 = n16 + n;
            final float method135 = class22.method135(n3 + n11);
            final float method136 = class22.method135(n3 + n16);
            final float method137 = class22.method135(n3 + n - 1L + n17);
            final float method138 = class22.method135(n3 + n - 1L + n15);
            final float n18 = method135 - method137;
            final float n19 = method135 + method137;
            final float n20 = method138 + method138;
            final float n21 = method136 + method136;
            class23.method169(n4 + n10, n19 + n20);
            class23.method169(n4 + n12, n18 - n21);
            class23.method169(n4 + n13, n19 - n20);
            class23.method169(n4 + n14, n18 + n21);
        }
        if (n >= 2L) {
            if (n != 2L) {
                for (long n22 = 0L; n22 < n2; ++n22) {
                    final long n23 = n22 * n;
                    final long n24 = n23 + n8;
                    final long n25 = n24 + n8;
                    final long n26 = n25 + n8;
                    final long n27 = 4L * n23;
                    final long n28 = n27 + n;
                    final long n29 = n28 + n;
                    final long n30 = n29 + n;
                    for (long n31 = 2L; n31 < n; n31 += 2L) {
                        final long n32 = n - n31;
                        final long n33 = n31 - 1L + n5;
                        final long n34 = n31 - 1L + n6;
                        final long n35 = n31 - 1L + n7;
                        final float method139 = this.field32829.method135(n33 - 1L);
                        final float method140 = this.field32829.method135(n33);
                        final float method141 = this.field32829.method135(n34 - 1L);
                        final float method142 = this.field32829.method135(n34);
                        final float method143 = this.field32829.method135(n35 - 1L);
                        final float method144 = this.field32829.method135(n35);
                        final long n36 = n3 + n31;
                        final long n37 = n3 + n32;
                        final long n38 = n4 + n31;
                        final long n39 = n36 + n27;
                        final long n40 = n37 + n28;
                        final long n41 = n36 + n29;
                        final long n42 = n37 + n30;
                        final float method145 = class22.method135(n39 - 1L);
                        final float method146 = class22.method135(n39);
                        final float method147 = class22.method135(n40 - 1L);
                        final float method148 = class22.method135(n40);
                        final float method149 = class22.method135(n41 - 1L);
                        final float method150 = class22.method135(n41);
                        final float method151 = class22.method135(n42 - 1L);
                        final float method152 = class22.method135(n42);
                        final float n43 = method146 + method152;
                        final float n44 = method146 - method152;
                        final float n45 = method150 - method148;
                        final float n46 = method150 + method148;
                        final float n47 = method145 - method151;
                        final float n48 = method145 + method151;
                        final float n49 = method149 - method147;
                        final float n50 = method149 + method147;
                        final float n51 = n48 - n50;
                        final float n52 = n44 - n45;
                        final float n53 = n47 - n46;
                        final float n54 = n47 + n46;
                        final float n55 = n43 + n49;
                        final float n56 = n43 - n49;
                        final long n57 = n38 + n23;
                        final long n58 = n38 + n24;
                        final long n59 = n38 + n25;
                        final long n60 = n38 + n26;
                        class23.method169(n57 - 1L, n48 + n50);
                        class23.method169(n57, n44 + n45);
                        class23.method169(n58 - 1L, method139 * n53 - method140 * n55);
                        class23.method169(n58, method139 * n55 + method140 * n53);
                        class23.method169(n59 - 1L, method141 * n51 - method142 * n52);
                        class23.method169(n59, method141 * n52 + method142 * n51);
                        class23.method169(n60 - 1L, method143 * n54 - method144 * n56);
                        class23.method169(n60, method143 * n56 + method144 * n54);
                    }
                }
                if (n % 2L == 1L) {
                    return;
                }
            }
            for (long n61 = 0L; n61 < n2; ++n61) {
                final long n62 = n61 * n;
                final long n63 = 4L * n62;
                final long n64 = n62 + n8;
                final long n65 = n64 + n8;
                final long n66 = n65 + n8;
                final long n67 = n63 + n;
                final long n68 = n67 + n;
                final long n69 = n68 + n;
                final long n70 = n3 + n;
                final long n71 = n4 + n;
                final float method153 = class22.method135(n70 - 1L + n63);
                final float method154 = class22.method135(n70 - 1L + n68);
                final float method155 = class22.method135(n3 + n67);
                final float method156 = class22.method135(n3 + n69);
                final float n72 = method155 + method156;
                final float n73 = method156 - method155;
                final float n74 = method153 - method154;
                final float n75 = method153 + method154;
                class23.method169(n71 - 1L + n62, n75 + n75);
                class23.method169(n71 - 1L + n64, 1.4142135f * (n74 - n72));
                class23.method169(n71 - 1L + n65, n73 + n73);
                class23.method169(n71 - 1L + n66, -1.4142135f * (n74 + n72));
            }
        }
    }
    
    public void method25984(final int n, final int n2, final float[] array, final int n3, final float[] array2, final int n4, final int n5) {
        final int n6 = n5 + n;
        final int n7 = n6 + n;
        final int n8 = n7 + n;
        final int n9 = n2 * n;
        for (int i = 0; i < n2; ++i) {
            final int n10 = i * n;
            final int n11 = 5 * n10;
            final int n12 = n11 + n;
            final int n13 = n12 + n;
            final int n14 = n13 + n;
            final int n15 = n14 + n;
            final int n16 = n10 + n9;
            final int n17 = n16 + n9;
            final int n18 = n17 + n9;
            final int n19 = n18 + n9;
            final int n20 = n4 + n - 1;
            final float n21 = array[n3 + n10];
            final float n22 = array[n3 + n16];
            final float n23 = array[n3 + n17];
            final float n24 = array[n3 + n18];
            final float n25 = array[n3 + n19];
            final float n26 = n25 + n22;
            final float n27 = n25 - n22;
            final float n28 = n24 + n23;
            final float n29 = n24 - n23;
            array2[n4 + n11] = n21 + n26 + n28;
            array2[n20 + n12] = n21 + 0.309017f * n26 + -0.809017f * n28;
            array2[n4 + n13] = 0.95105654f * n27 + 0.58778524f * n29;
            array2[n20 + n14] = n21 + -0.809017f * n26 + 0.309017f * n28;
            array2[n4 + n15] = 0.58778524f * n27 - 0.95105654f * n29;
        }
        if (n != 1) {
            for (int j = 0; j < n2; ++j) {
                final int n30 = j * n;
                final int n31 = 5 * n30;
                final int n32 = n31 + n;
                final int n33 = n32 + n;
                final int n34 = n33 + n;
                final int n35 = n34 + n;
                final int n36 = n30 + n9;
                final int n37 = n36 + n9;
                final int n38 = n37 + n9;
                final int n39 = n38 + n9;
                for (int k = 2; k < n; k += 2) {
                    final int n40 = k - 1 + n5;
                    final int n41 = k - 1 + n6;
                    final int n42 = k - 1 + n7;
                    final int n43 = k - 1 + n8;
                    final float n44 = this.field32828[n40 - 1];
                    final float n45 = this.field32828[n40];
                    final float n46 = this.field32828[n41 - 1];
                    final float n47 = this.field32828[n41];
                    final float n48 = this.field32828[n42 - 1];
                    final float n49 = this.field32828[n42];
                    final float n50 = this.field32828[n43 - 1];
                    final float n51 = this.field32828[n43];
                    final int n52 = n - k;
                    final int n53 = n3 + k;
                    final int n54 = n4 + k;
                    final int n55 = n4 + n52;
                    final int n56 = n53 + n30;
                    final int n57 = n53 + n36;
                    final int n58 = n53 + n37;
                    final int n59 = n53 + n38;
                    final int n60 = n53 + n39;
                    final float n61 = array[n56 - 1];
                    final float n62 = array[n56];
                    final float n63 = array[n57 - 1];
                    final float n64 = array[n57];
                    final float n65 = array[n58 - 1];
                    final float n66 = array[n58];
                    final float n67 = array[n59 - 1];
                    final float n68 = array[n59];
                    final float n69 = array[n60 - 1];
                    final float n70 = array[n60];
                    final float n71 = n44 * n63 + n45 * n64;
                    final float n72 = n44 * n64 - n45 * n63;
                    final float n73 = n46 * n65 + n47 * n66;
                    final float n74 = n46 * n66 - n47 * n65;
                    final float n75 = n48 * n67 + n49 * n68;
                    final float n76 = n48 * n68 - n49 * n67;
                    final float n77 = n50 * n69 + n51 * n70;
                    final float n78 = n50 * n70 - n51 * n69;
                    final float n79 = n71 + n77;
                    final float n80 = n77 - n71;
                    final float n81 = n72 - n78;
                    final float n82 = n72 + n78;
                    final float n83 = n73 + n75;
                    final float n84 = n75 - n73;
                    final float n85 = n74 - n76;
                    final float n86 = n74 + n76;
                    final float n87 = n61 + 0.309017f * n79 + -0.809017f * n83;
                    final float n88 = n62 + 0.309017f * n82 + -0.809017f * n86;
                    final float n89 = n61 + -0.809017f * n79 + 0.309017f * n83;
                    final float n90 = n62 + -0.809017f * n82 + 0.309017f * n86;
                    final float n91 = 0.95105654f * n81 + 0.58778524f * n85;
                    final float n92 = 0.95105654f * n80 + 0.58778524f * n84;
                    final float n93 = 0.58778524f * n81 - 0.95105654f * n85;
                    final float n94 = 0.58778524f * n80 - 0.95105654f * n84;
                    final int n95 = n54 + n31;
                    final int n96 = n55 + n32;
                    final int n97 = n54 + n33;
                    final int n98 = n55 + n34;
                    final int n99 = n54 + n35;
                    array2[n95 - 1] = n61 + n79 + n83;
                    array2[n95] = n62 + n82 + n86;
                    array2[n97 - 1] = n87 + n91;
                    array2[n96 - 1] = n87 - n91;
                    array2[n97] = n88 + n92;
                    array2[n96] = n92 - n88;
                    array2[n99 - 1] = n89 + n93;
                    array2[n98 - 1] = n89 - n93;
                    array2[n99] = n90 + n94;
                    array2[n98] = n94 - n90;
                }
            }
        }
    }
    
    public void method25985(final long n, final long n2, final Class22 class22, final long n3, final Class22 class23, final long n4, final long n5) {
        final long n6 = n5 + n;
        final long n7 = n6 + n;
        final long n8 = n7 + n;
        final long n9 = n2 * n;
        for (long n10 = 0L; n10 < n2; ++n10) {
            final long n11 = n10 * n;
            final long n12 = 5L * n11;
            final long n13 = n12 + n;
            final long n14 = n13 + n;
            final long n15 = n14 + n;
            final long n16 = n15 + n;
            final long n17 = n11 + n9;
            final long n18 = n17 + n9;
            final long n19 = n18 + n9;
            final long n20 = n19 + n9;
            final long n21 = n4 + n - 1L;
            final float method135 = class22.method135(n3 + n11);
            final float method136 = class22.method135(n3 + n17);
            final float method137 = class22.method135(n3 + n18);
            final float method138 = class22.method135(n3 + n19);
            final float method139 = class22.method135(n3 + n20);
            final float n22 = method139 + method136;
            final float n23 = method139 - method136;
            final float n24 = method138 + method137;
            final float n25 = method138 - method137;
            class23.method169(n4 + n12, method135 + n22 + n24);
            class23.method169(n21 + n13, method135 + 0.309017f * n22 + -0.809017f * n24);
            class23.method169(n4 + n14, 0.95105654f * n23 + 0.58778524f * n25);
            class23.method169(n21 + n15, method135 + -0.809017f * n22 + 0.309017f * n24);
            class23.method169(n4 + n16, 0.58778524f * n23 - 0.95105654f * n25);
        }
        if (n != 1L) {
            for (long n26 = 0L; n26 < n2; ++n26) {
                final long n27 = n26 * n;
                final long n28 = 5L * n27;
                final long n29 = n28 + n;
                final long n30 = n29 + n;
                final long n31 = n30 + n;
                final long n32 = n31 + n;
                final long n33 = n27 + n9;
                final long n34 = n33 + n9;
                final long n35 = n34 + n9;
                final long n36 = n35 + n9;
                for (long n37 = 2L; n37 < n; n37 += 2L) {
                    final long n38 = n37 - 1L + n5;
                    final long n39 = n37 - 1L + n6;
                    final long n40 = n37 - 1L + n7;
                    final long n41 = n37 - 1L + n8;
                    final float method140 = this.field32829.method135(n38 - 1L);
                    final float method141 = this.field32829.method135(n38);
                    final float method142 = this.field32829.method135(n39 - 1L);
                    final float method143 = this.field32829.method135(n39);
                    final float method144 = this.field32829.method135(n40 - 1L);
                    final float method145 = this.field32829.method135(n40);
                    final float method146 = this.field32829.method135(n41 - 1L);
                    final float method147 = this.field32829.method135(n41);
                    final long n42 = n - n37;
                    final long n43 = n3 + n37;
                    final long n44 = n4 + n37;
                    final long n45 = n4 + n42;
                    final long n46 = n43 + n27;
                    final long n47 = n43 + n33;
                    final long n48 = n43 + n34;
                    final long n49 = n43 + n35;
                    final long n50 = n43 + n36;
                    final float method148 = class22.method135(n46 - 1L);
                    final float method149 = class22.method135(n46);
                    final float method150 = class22.method135(n47 - 1L);
                    final float method151 = class22.method135(n47);
                    final float method152 = class22.method135(n48 - 1L);
                    final float method153 = class22.method135(n48);
                    final float method154 = class22.method135(n49 - 1L);
                    final float method155 = class22.method135(n49);
                    final float method156 = class22.method135(n50 - 1L);
                    final float method157 = class22.method135(n50);
                    final float n51 = method140 * method150 + method141 * method151;
                    final float n52 = method140 * method151 - method141 * method150;
                    final float n53 = method142 * method152 + method143 * method153;
                    final float n54 = method142 * method153 - method143 * method152;
                    final float n55 = method144 * method154 + method145 * method155;
                    final float n56 = method144 * method155 - method145 * method154;
                    final float n57 = method146 * method156 + method147 * method157;
                    final float n58 = method146 * method157 - method147 * method156;
                    final float n59 = n51 + n57;
                    final float n60 = n57 - n51;
                    final float n61 = n52 - n58;
                    final float n62 = n52 + n58;
                    final float n63 = n53 + n55;
                    final float n64 = n55 - n53;
                    final float n65 = n54 - n56;
                    final float n66 = n54 + n56;
                    final float n67 = method148 + 0.309017f * n59 + -0.809017f * n63;
                    final float n68 = method149 + 0.309017f * n62 + -0.809017f * n66;
                    final float n69 = method148 + -0.809017f * n59 + 0.309017f * n63;
                    final float n70 = method149 + -0.809017f * n62 + 0.309017f * n66;
                    final float n71 = 0.95105654f * n61 + 0.58778524f * n65;
                    final float n72 = 0.95105654f * n60 + 0.58778524f * n64;
                    final float n73 = 0.58778524f * n61 - 0.95105654f * n65;
                    final float n74 = 0.58778524f * n60 - 0.95105654f * n64;
                    final long n75 = n44 + n28;
                    final long n76 = n45 + n29;
                    final long n77 = n44 + n30;
                    final long n78 = n45 + n31;
                    final long n79 = n44 + n32;
                    class23.method169(n75 - 1L, method148 + n59 + n63);
                    class23.method169(n75, method149 + n62 + n66);
                    class23.method169(n77 - 1L, n67 + n71);
                    class23.method169(n76 - 1L, n67 - n71);
                    class23.method169(n77, n68 + n72);
                    class23.method169(n76, n72 - n68);
                    class23.method169(n79 - 1L, n69 + n73);
                    class23.method169(n78 - 1L, n69 - n73);
                    class23.method169(n79, n70 + n74);
                    class23.method169(n78, n74 - n70);
                }
            }
        }
    }
    
    public void method25986(final int n, final int n2, final float[] array, final int n3, final float[] array2, final int n4, final int n5) {
        final int n6 = n5 + n;
        final int n7 = n6 + n;
        final int n8 = n7 + n;
        final int n9 = n2 * n;
        for (int i = 0; i < n2; ++i) {
            final int n10 = i * n;
            final int n11 = 5 * n10;
            final int n12 = n11 + n;
            final int n13 = n12 + n;
            final int n14 = n13 + n;
            final int n15 = n14 + n;
            final int n16 = n10 + n9;
            final int n17 = n16 + n9;
            final int n18 = n17 + n9;
            final int n19 = n18 + n9;
            final int n20 = n3 + n - 1;
            final float n21 = array[n3 + n11];
            final float n22 = 2.0f * array[n3 + n13];
            final float n23 = 2.0f * array[n3 + n15];
            final float n24 = 2.0f * array[n20 + n12];
            final float n25 = 2.0f * array[n20 + n14];
            final float n26 = n21 + 0.309017f * n24 + -0.809017f * n25;
            final float n27 = n21 + -0.809017f * n24 + 0.309017f * n25;
            final float n28 = 0.95105654f * n22 + 0.58778524f * n23;
            final float n29 = 0.58778524f * n22 - 0.95105654f * n23;
            array2[n4 + n10] = n21 + n24 + n25;
            array2[n4 + n16] = n26 - n28;
            array2[n4 + n17] = n27 - n29;
            array2[n4 + n18] = n27 + n29;
            array2[n4 + n19] = n26 + n28;
        }
        if (n != 1) {
            for (int j = 0; j < n2; ++j) {
                final int n30 = j * n;
                final int n31 = 5 * n30;
                final int n32 = n31 + n;
                final int n33 = n32 + n;
                final int n34 = n33 + n;
                final int n35 = n34 + n;
                final int n36 = n30 + n9;
                final int n37 = n36 + n9;
                final int n38 = n37 + n9;
                final int n39 = n38 + n9;
                for (int k = 2; k < n; k += 2) {
                    final int n40 = n - k;
                    final int n41 = k - 1 + n5;
                    final int n42 = k - 1 + n6;
                    final int n43 = k - 1 + n7;
                    final int n44 = k - 1 + n8;
                    final float n45 = this.field32828[n41 - 1];
                    final float n46 = this.field32828[n41];
                    final float n47 = this.field32828[n42 - 1];
                    final float n48 = this.field32828[n42];
                    final float n49 = this.field32828[n43 - 1];
                    final float n50 = this.field32828[n43];
                    final float n51 = this.field32828[n44 - 1];
                    final float n52 = this.field32828[n44];
                    final int n53 = n3 + k;
                    final int n54 = n3 + n40;
                    final int n55 = n4 + k;
                    final int n56 = n53 + n31;
                    final int n57 = n54 + n32;
                    final int n58 = n53 + n33;
                    final int n59 = n54 + n34;
                    final int n60 = n53 + n35;
                    final float n61 = array[n56 - 1];
                    final float n62 = array[n56];
                    final float n63 = array[n57 - 1];
                    final float n64 = array[n57];
                    final float n65 = array[n58 - 1];
                    final float n66 = array[n58];
                    final float n67 = array[n59 - 1];
                    final float n68 = array[n59];
                    final float n69 = array[n60 - 1];
                    final float n70 = array[n60];
                    final float n71 = n66 + n64;
                    final float n72 = n66 - n64;
                    final float n73 = n70 + n68;
                    final float n74 = n70 - n68;
                    final float n75 = n65 - n63;
                    final float n76 = n65 + n63;
                    final float n77 = n69 - n67;
                    final float n78 = n69 + n67;
                    final float n79 = n61 + 0.309017f * n76 + -0.809017f * n78;
                    final float n80 = n62 + 0.309017f * n72 + -0.809017f * n74;
                    final float n81 = n61 + -0.809017f * n76 + 0.309017f * n78;
                    final float n82 = n62 + -0.809017f * n72 + 0.309017f * n74;
                    final float n83 = 0.95105654f * n75 + 0.58778524f * n77;
                    final float n84 = 0.95105654f * n71 + 0.58778524f * n73;
                    final float n85 = 0.58778524f * n75 - 0.95105654f * n77;
                    final float n86 = 0.58778524f * n71 - 0.95105654f * n73;
                    final float n87 = n81 - n86;
                    final float n88 = n81 + n86;
                    final float n89 = n82 + n85;
                    final float n90 = n82 - n85;
                    final float n91 = n79 + n84;
                    final float n92 = n79 - n84;
                    final float n93 = n80 - n83;
                    final float n94 = n80 + n83;
                    final int n95 = n55 + n30;
                    final int n96 = n55 + n36;
                    final int n97 = n55 + n37;
                    final int n98 = n55 + n38;
                    final int n99 = n55 + n39;
                    array2[n95 - 1] = n61 + n76 + n78;
                    array2[n95] = n62 + n72 + n74;
                    array2[n96 - 1] = n45 * n92 - n46 * n94;
                    array2[n96] = n45 * n94 + n46 * n92;
                    array2[n97 - 1] = n47 * n87 - n48 * n89;
                    array2[n97] = n47 * n89 + n48 * n87;
                    array2[n98 - 1] = n49 * n88 - n50 * n90;
                    array2[n98] = n49 * n90 + n50 * n88;
                    array2[n99 - 1] = n51 * n91 - n52 * n93;
                    array2[n99] = n51 * n93 + n52 * n91;
                }
            }
        }
    }
    
    public void method25987(final long n, final long n2, final Class22 class22, final long n3, final Class22 class23, final long n4, final long n5) {
        final long n6 = n5 + n;
        final long n7 = n6 + n;
        final long n8 = n7 + n;
        final long n9 = n2 * n;
        for (long n10 = 0L; n10 < n2; ++n10) {
            final long n11 = n10 * n;
            final long n12 = 5L * n11;
            final long n13 = n12 + n;
            final long n14 = n13 + n;
            final long n15 = n14 + n;
            final long n16 = n15 + n;
            final long n17 = n11 + n9;
            final long n18 = n17 + n9;
            final long n19 = n18 + n9;
            final long n20 = n19 + n9;
            final long n21 = n3 + n - 1L;
            final float method135 = class22.method135(n3 + n12);
            final float n22 = 2.0f * class22.method135(n3 + n14);
            final float n23 = 2.0f * class22.method135(n3 + n16);
            final float n24 = 2.0f * class22.method135(n21 + n13);
            final float n25 = 2.0f * class22.method135(n21 + n15);
            final float n26 = method135 + 0.309017f * n24 + -0.809017f * n25;
            final float n27 = method135 + -0.809017f * n24 + 0.309017f * n25;
            final float n28 = 0.95105654f * n22 + 0.58778524f * n23;
            final float n29 = 0.58778524f * n22 - 0.95105654f * n23;
            class23.method169(n4 + n11, method135 + n24 + n25);
            class23.method169(n4 + n17, n26 - n28);
            class23.method169(n4 + n18, n27 - n29);
            class23.method169(n4 + n19, n27 + n29);
            class23.method169(n4 + n20, n26 + n28);
        }
        if (n != 1L) {
            for (long n30 = 0L; n30 < n2; ++n30) {
                final long n31 = n30 * n;
                final long n32 = 5L * n31;
                final long n33 = n32 + n;
                final long n34 = n33 + n;
                final long n35 = n34 + n;
                final long n36 = n35 + n;
                final long n37 = n31 + n9;
                final long n38 = n37 + n9;
                final long n39 = n38 + n9;
                final long n40 = n39 + n9;
                for (long n41 = 2L; n41 < n; n41 += 2L) {
                    final long n42 = n - n41;
                    final long n43 = n41 - 1L + n5;
                    final long n44 = n41 - 1L + n6;
                    final long n45 = n41 - 1L + n7;
                    final long n46 = n41 - 1L + n8;
                    final float method136 = this.field32829.method135(n43 - 1L);
                    final float method137 = this.field32829.method135(n43);
                    final float method138 = this.field32829.method135(n44 - 1L);
                    final float method139 = this.field32829.method135(n44);
                    final float method140 = this.field32829.method135(n45 - 1L);
                    final float method141 = this.field32829.method135(n45);
                    final float method142 = this.field32829.method135(n46 - 1L);
                    final float method143 = this.field32829.method135(n46);
                    final long n47 = n3 + n41;
                    final long n48 = n3 + n42;
                    final long n49 = n4 + n41;
                    final long n50 = n47 + n32;
                    final long n51 = n48 + n33;
                    final long n52 = n47 + n34;
                    final long n53 = n48 + n35;
                    final long n54 = n47 + n36;
                    final float method144 = class22.method135(n50 - 1L);
                    final float method145 = class22.method135(n50);
                    final float method146 = class22.method135(n51 - 1L);
                    final float method147 = class22.method135(n51);
                    final float method148 = class22.method135(n52 - 1L);
                    final float method149 = class22.method135(n52);
                    final float method150 = class22.method135(n53 - 1L);
                    final float method151 = class22.method135(n53);
                    final float method152 = class22.method135(n54 - 1L);
                    final float method153 = class22.method135(n54);
                    final float n55 = method149 + method147;
                    final float n56 = method149 - method147;
                    final float n57 = method153 + method151;
                    final float n58 = method153 - method151;
                    final float n59 = method148 - method146;
                    final float n60 = method148 + method146;
                    final float n61 = method152 - method150;
                    final float n62 = method152 + method150;
                    final float n63 = method144 + 0.309017f * n60 + -0.809017f * n62;
                    final float n64 = method145 + 0.309017f * n56 + -0.809017f * n58;
                    final float n65 = method144 + -0.809017f * n60 + 0.309017f * n62;
                    final float n66 = method145 + -0.809017f * n56 + 0.309017f * n58;
                    final float n67 = 0.95105654f * n59 + 0.58778524f * n61;
                    final float n68 = 0.95105654f * n55 + 0.58778524f * n57;
                    final float n69 = 0.58778524f * n59 - 0.95105654f * n61;
                    final float n70 = 0.58778524f * n55 - 0.95105654f * n57;
                    final float n71 = n65 - n70;
                    final float n72 = n65 + n70;
                    final float n73 = n66 + n69;
                    final float n74 = n66 - n69;
                    final float n75 = n63 + n68;
                    final float n76 = n63 - n68;
                    final float n77 = n64 - n67;
                    final float n78 = n64 + n67;
                    final long n79 = n49 + n31;
                    final long n80 = n49 + n37;
                    final long n81 = n49 + n38;
                    final long n82 = n49 + n39;
                    final long n83 = n49 + n40;
                    class23.method169(n79 - 1L, method144 + n60 + n62);
                    class23.method169(n79, method145 + n56 + n58);
                    class23.method169(n80 - 1L, method136 * n76 - method137 * n78);
                    class23.method169(n80, method136 * n78 + method137 * n76);
                    class23.method169(n81 - 1L, method138 * n71 - method139 * n73);
                    class23.method169(n81, method138 * n73 + method139 * n71);
                    class23.method169(n82 - 1L, method140 * n72 - method141 * n74);
                    class23.method169(n82, method140 * n74 + method141 * n72);
                    class23.method169(n83 - 1L, method142 * n75 - method143 * n77);
                    class23.method169(n83, method142 * n77 + method143 * n75);
                }
            }
        }
    }
    
    public void method25988(final int n, final int n2, final int n3, final int n4, final float[] array, final int n5, final float[] array2, final int n6, final int n7) {
        final float n8 = 6.2831855f / n2;
        final float n9 = (float)Class7640.method24103(n8);
        final float n10 = (float)Class7640.method24102(n8);
        final int n11 = (n2 + 1) / 2;
        final int n12 = (n - 1) / 2;
        if (n == 1) {
            System.arraycopy(array2, n6, array, n5, n4);
        }
        else {
            for (int i = 0; i < n4; ++i) {
                array2[n6 + i] = array[n5 + i];
            }
            for (int j = 1; j < n2; ++j) {
                final int n13 = j * n3 * n;
                for (int k = 0; k < n3; ++k) {
                    final int n14 = k * n + n13;
                    array2[n6 + n14] = array[n5 + n14];
                }
            }
            if (n12 > n3) {
                int n15 = -n;
                for (int l = 1; l < n2; ++l) {
                    n15 += n;
                    final int n16 = l * n3 * n;
                    for (int n17 = 0; n17 < n3; ++n17) {
                        int n18 = n15 - 1;
                        final int n19 = n17 * n + n16;
                        for (int n20 = 2; n20 < n; n20 += 2) {
                            n18 += 2;
                            final int n21 = n18 + n7;
                            final float n22 = this.field32828[n21 - 1];
                            final float n23 = this.field32828[n21];
                            final int n24 = n6 + n20 + n19;
                            final int n25 = n5 + n20 + n19;
                            final float n26 = array[n25 - 1];
                            final float n27 = array[n25];
                            array2[n24 - 1] = n22 * n26 + n23 * n27;
                            array2[n24] = n22 * n27 - n23 * n26;
                        }
                    }
                }
            }
            else {
                int n28 = -n;
                for (int n29 = 1; n29 < n2; ++n29) {
                    n28 += n;
                    int n30 = n28 - 1;
                    final int n31 = n29 * n3 * n;
                    for (int n32 = 2; n32 < n; n32 += 2) {
                        n30 += 2;
                        final int n33 = n30 + n7;
                        final int n34 = n5 + n32;
                        final int n35 = n6 + n32;
                        final float n36 = this.field32828[n33 - 1];
                        final float n37 = this.field32828[n33];
                        for (int n38 = 0; n38 < n3; ++n38) {
                            final int n39 = n38 * n + n31;
                            final int n40 = n35 + n39;
                            final int n41 = n34 + n39;
                            final float n42 = array[n41 - 1];
                            final float n43 = array[n41];
                            array2[n40 - 1] = n36 * n42 + n37 * n43;
                            array2[n40] = n36 * n43 - n37 * n42;
                        }
                    }
                }
            }
            if (n12 < n3) {
                for (int n44 = 1; n44 < n11; ++n44) {
                    final int n45 = n2 - n44;
                    final int n46 = n44 * n3 * n;
                    final int n47 = n45 * n3 * n;
                    for (int n48 = 2; n48 < n; n48 += 2) {
                        final int n49 = n5 + n48;
                        final int n50 = n6 + n48;
                        for (int n51 = 0; n51 < n3; ++n51) {
                            final int n52 = n51 * n + n46;
                            final int n53 = n51 * n + n47;
                            final int n54 = n49 + n52;
                            final int n55 = n49 + n53;
                            final int n56 = n50 + n52;
                            final int n57 = n50 + n53;
                            final float n58 = array2[n56 - 1];
                            final float n59 = array2[n56];
                            final float n60 = array2[n57 - 1];
                            final float n61 = array2[n57];
                            array[n54 - 1] = n58 + n60;
                            array[n54] = n59 + n61;
                            array[n55 - 1] = n59 - n61;
                            array[n55] = n60 - n58;
                        }
                    }
                }
            }
            else {
                for (int n62 = 1; n62 < n11; ++n62) {
                    final int n63 = n2 - n62;
                    final int n64 = n62 * n3 * n;
                    final int n65 = n63 * n3 * n;
                    for (int n66 = 0; n66 < n3; ++n66) {
                        final int n67 = n66 * n + n64;
                        final int n68 = n66 * n + n65;
                        for (int n69 = 2; n69 < n; n69 += 2) {
                            final int n70 = n5 + n69;
                            final int n71 = n6 + n69;
                            final int n72 = n70 + n67;
                            final int n73 = n70 + n68;
                            final int n74 = n71 + n67;
                            final int n75 = n71 + n68;
                            final float n76 = array2[n74 - 1];
                            final float n77 = array2[n74];
                            final float n78 = array2[n75 - 1];
                            final float n79 = array2[n75];
                            array[n72 - 1] = n76 + n78;
                            array[n72] = n77 + n79;
                            array[n73 - 1] = n77 - n79;
                            array[n73] = n78 - n76;
                        }
                    }
                }
            }
        }
        for (int n80 = 1; n80 < n11; ++n80) {
            final int n81 = n2 - n80;
            final int n82 = n80 * n3 * n;
            final int n83 = n81 * n3 * n;
            for (int n84 = 0; n84 < n3; ++n84) {
                final int n85 = n84 * n + n82;
                final int n86 = n84 * n + n83;
                final int n87 = n6 + n85;
                final int n88 = n6 + n86;
                final float n89 = array2[n87];
                final float n90 = array2[n88];
                array[n5 + n85] = n89 + n90;
                array[n5 + n86] = n90 - n89;
            }
        }
        float n91 = 1.0f;
        float n92 = 0.0f;
        final int n93 = (n2 - 1) * n4;
        for (int n94 = 1; n94 < n11; ++n94) {
            final int n95 = n2 - n94;
            final float n96 = n9 * n91 - n10 * n92;
            n92 = n9 * n92 + n10 * n91;
            n91 = n96;
            final int n97 = n94 * n4;
            final int n98 = n95 * n4;
            for (int n99 = 0; n99 < n4; ++n99) {
                final int n100 = n6 + n99;
                final int n101 = n5 + n99;
                array2[n100 + n97] = array[n101] + n91 * array[n101 + n4];
                array2[n100 + n98] = n92 * array[n101 + n93];
            }
            final float n102 = n91;
            final float n103 = n92;
            float n104 = n91;
            float n105 = n92;
            for (int n106 = 2; n106 < n11; ++n106) {
                final int n107 = n2 - n106;
                final float n108 = n102 * n104 - n103 * n105;
                n105 = n102 * n105 + n103 * n104;
                n104 = n108;
                final int n109 = n106 * n4;
                final int n110 = n107 * n4;
                for (int n111 = 0; n111 < n4; ++n111) {
                    final int n112 = n6 + n111;
                    final int n113 = n5 + n111;
                    final int n114 = n112 + n97;
                    array2[n114] += n104 * array[n113 + n109];
                    final int n115 = n112 + n98;
                    array2[n115] += n105 * array[n113 + n110];
                }
            }
        }
        for (int n116 = 1; n116 < n11; ++n116) {
            final int n117 = n116 * n4;
            for (int n118 = 0; n118 < n4; ++n118) {
                final int n119 = n6 + n118;
                array2[n119] += array[n5 + n118 + n117];
            }
        }
        if (n < n3) {
            for (int n120 = 0; n120 < n; ++n120) {
                for (int n121 = 0; n121 < n3; ++n121) {
                    final int n122 = n121 * n;
                    array[n5 + n120 + n122 * n2] = array2[n6 + n120 + n122];
                }
            }
        }
        else {
            for (int n123 = 0; n123 < n3; ++n123) {
                final int n124 = n123 * n;
                final int n125 = n124 * n2;
                for (int n126 = 0; n126 < n; ++n126) {
                    array[n5 + n126 + n125] = array2[n6 + n126 + n124];
                }
            }
        }
        final int n127 = n2 * n;
        for (int n128 = 1; n128 < n11; ++n128) {
            final int n129 = n2 - n128;
            final int n130 = 2 * n128;
            final int n131 = n128 * n3 * n;
            final int n132 = n129 * n3 * n;
            final int n133 = n130 * n;
            for (int n134 = 0; n134 < n3; ++n134) {
                final int n135 = n134 * n;
                final int n136 = n135 + n131;
                final int n137 = n135 + n132;
                final int n138 = n134 * n127;
                array[n5 + n - 1 + n133 - n + n138] = array2[n6 + n136];
                array[n5 + n133 + n138] = array2[n6 + n137];
            }
        }
        if (n != 1) {
            if (n12 < n3) {
                for (int n139 = 1; n139 < n11; ++n139) {
                    final int n140 = n2 - n139;
                    final int n141 = 2 * n139;
                    final int n142 = n139 * n3 * n;
                    final int n143 = n140 * n3 * n;
                    final int n144 = n141 * n;
                    for (int n145 = 2; n145 < n; n145 += 2) {
                        final int n146 = n - n145;
                        final int n147 = n5 + n145;
                        final int n148 = n5 + n146;
                        final int n149 = n6 + n145;
                        for (int n150 = 0; n150 < n3; ++n150) {
                            final int n151 = n150 * n127;
                            final int n152 = n150 * n;
                            final int n153 = n147 + n144 + n151;
                            final int n154 = n148 + n144 - n + n151;
                            final int n155 = n149 + n152 + n142;
                            final int n156 = n149 + n152 + n143;
                            final float n157 = array2[n155 - 1];
                            final float n158 = array2[n155];
                            final float n159 = array2[n156 - 1];
                            final float n160 = array2[n156];
                            array[n153 - 1] = n157 + n159;
                            array[n154 - 1] = n157 - n159;
                            array[n153] = n158 + n160;
                            array[n154] = n160 - n158;
                        }
                    }
                }
            }
            else {
                for (int n161 = 1; n161 < n11; ++n161) {
                    final int n162 = n2 - n161;
                    final int n163 = 2 * n161;
                    final int n164 = n161 * n3 * n;
                    final int n165 = n162 * n3 * n;
                    final int n166 = n163 * n;
                    for (int n167 = 0; n167 < n3; ++n167) {
                        final int n168 = n167 * n127;
                        final int n169 = n167 * n;
                        for (int n170 = 2; n170 < n; n170 += 2) {
                            final int n171 = n - n170;
                            final int n172 = n5 + n170;
                            final int n173 = n5 + n171;
                            final int n174 = n6 + n170;
                            final int n175 = n172 + n166 + n168;
                            final int n176 = n173 + n166 - n + n168;
                            final int n177 = n174 + n169 + n164;
                            final int n178 = n174 + n169 + n165;
                            final float n179 = array2[n177 - 1];
                            final float n180 = array2[n177];
                            final float n181 = array2[n178 - 1];
                            final float n182 = array2[n178];
                            array[n175 - 1] = n179 + n181;
                            array[n176 - 1] = n179 - n181;
                            array[n175] = n180 + n182;
                            array[n176] = n182 - n180;
                        }
                    }
                }
            }
        }
    }
    
    public void method25989(final long n, final long n2, final long n3, final long n4, final Class22 class22, final long n5, final Class22 class23, final long n6, final long n7) {
        final float n8 = 6.2831855f / n2;
        final float n9 = (float)Class7640.method24103(n8);
        final float n10 = (float)Class7640.method24102(n8);
        final long n11 = (n2 + 1L) / 2L;
        final long n12 = (n - 1L) / 2L;
        if (n == 1L) {
            Class8601.method29152(class23, n6, class22, n5, n4);
        }
        else {
            for (long n13 = 0L; n13 < n4; ++n13) {
                class23.method169(n6 + n13, class22.method135(n5 + n13));
            }
            for (long n14 = 1L; n14 < n2; ++n14) {
                final long n15 = n14 * n3 * n;
                for (long n16 = 0L; n16 < n3; ++n16) {
                    final long n17 = n16 * n + n15;
                    class23.method169(n6 + n17, class22.method135(n5 + n17));
                }
            }
            if (n12 > n3) {
                long n18 = -n;
                for (long n19 = 1L; n19 < n2; ++n19) {
                    n18 += n;
                    final long n20 = n19 * n3 * n;
                    for (long n21 = 0L; n21 < n3; ++n21) {
                        long n22 = n18 - 1L;
                        final long n23 = n21 * n + n20;
                        for (long n24 = 2L; n24 < n; n24 += 2L) {
                            n22 += 2L;
                            final long n25 = n22 + n7;
                            final float method135 = this.field32829.method135(n25 - 1L);
                            final float method136 = this.field32829.method135(n25);
                            final long n26 = n6 + n24 + n23;
                            final long n27 = n5 + n24 + n23;
                            final float method137 = class22.method135(n27 - 1L);
                            final float method138 = class22.method135(n27);
                            class23.method169(n26 - 1L, method135 * method137 + method136 * method138);
                            class23.method169(n26, method135 * method138 - method136 * method137);
                        }
                    }
                }
            }
            else {
                long n28 = -n;
                for (long n29 = 1L; n29 < n2; ++n29) {
                    n28 += n;
                    long n30 = n28 - 1L;
                    final long n31 = n29 * n3 * n;
                    for (long n32 = 2L; n32 < n; n32 += 2L) {
                        n30 += 2L;
                        final long n33 = n30 + n7;
                        final long n34 = n5 + n32;
                        final long n35 = n6 + n32;
                        final float method139 = this.field32829.method135(n33 - 1L);
                        final float method140 = this.field32829.method135(n33);
                        for (long n36 = 0L; n36 < n3; ++n36) {
                            final long n37 = n36 * n + n31;
                            final long n38 = n35 + n37;
                            final long n39 = n34 + n37;
                            final float method141 = class22.method135(n39 - 1L);
                            final float method142 = class22.method135(n39);
                            class23.method169(n38 - 1L, method139 * method141 + method140 * method142);
                            class23.method169(n38, method139 * method142 - method140 * method141);
                        }
                    }
                }
            }
            if (n12 < n3) {
                for (long n40 = 1L; n40 < n11; ++n40) {
                    final long n41 = n2 - n40;
                    final long n42 = n40 * n3 * n;
                    final long n43 = n41 * n3 * n;
                    for (long n44 = 2L; n44 < n; n44 += 2L) {
                        final long n45 = n5 + n44;
                        final long n46 = n6 + n44;
                        for (long n47 = 0L; n47 < n3; ++n47) {
                            final long n48 = n47 * n + n42;
                            final long n49 = n47 * n + n43;
                            final long n50 = n45 + n48;
                            final long n51 = n45 + n49;
                            final long n52 = n46 + n48;
                            final long n53 = n46 + n49;
                            final float method143 = class23.method135(n52 - 1L);
                            final float method144 = class23.method135(n52);
                            final float method145 = class23.method135(n53 - 1L);
                            final float method146 = class23.method135(n53);
                            class22.method169(n50 - 1L, method143 + method145);
                            class22.method169(n50, method144 + method146);
                            class22.method169(n51 - 1L, method144 - method146);
                            class22.method169(n51, method145 - method143);
                        }
                    }
                }
            }
            else {
                for (long n54 = 1L; n54 < n11; ++n54) {
                    final long n55 = n2 - n54;
                    final long n56 = n54 * n3 * n;
                    final long n57 = n55 * n3 * n;
                    for (long n58 = 0L; n58 < n3; ++n58) {
                        final long n59 = n58 * n + n56;
                        final long n60 = n58 * n + n57;
                        for (long n61 = 2L; n61 < n; n61 += 2L) {
                            final long n62 = n5 + n61;
                            final long n63 = n6 + n61;
                            final long n64 = n62 + n59;
                            final long n65 = n62 + n60;
                            final long n66 = n63 + n59;
                            final long n67 = n63 + n60;
                            final float method147 = class23.method135(n66 - 1L);
                            final float method148 = class23.method135(n66);
                            final float method149 = class23.method135(n67 - 1L);
                            final float method150 = class23.method135(n67);
                            class22.method169(n64 - 1L, method147 + method149);
                            class22.method169(n64, method148 + method150);
                            class22.method169(n65 - 1L, method148 - method150);
                            class22.method169(n65, method149 - method147);
                        }
                    }
                }
            }
        }
        for (long n68 = 1L; n68 < n11; ++n68) {
            final long n69 = n2 - n68;
            final long n70 = n68 * n3 * n;
            final long n71 = n69 * n3 * n;
            for (long n72 = 0L; n72 < n3; ++n72) {
                final long n73 = n72 * n + n70;
                final long n74 = n72 * n + n71;
                final long n75 = n6 + n73;
                final long n76 = n6 + n74;
                final float method151 = class23.method135(n75);
                final float method152 = class23.method135(n76);
                class22.method169(n5 + n73, method151 + method152);
                class22.method169(n5 + n74, method152 - method151);
            }
        }
        float n77 = 1.0f;
        float n78 = 0.0f;
        final long n79 = (n2 - 1L) * n4;
        for (long n80 = 1L; n80 < n11; ++n80) {
            final long n81 = n2 - n80;
            final float n82 = n9 * n77 - n10 * n78;
            n78 = n9 * n78 + n10 * n77;
            n77 = n82;
            final long n83 = n80 * n4;
            final long n84 = n81 * n4;
            for (long n85 = 0L; n85 < n4; ++n85) {
                final long n86 = n6 + n85;
                final long n87 = n5 + n85;
                class23.method169(n86 + n83, class22.method135(n87) + n77 * class22.method135(n87 + n4));
                class23.method169(n86 + n84, n78 * class22.method135(n87 + n79));
            }
            final float n88 = n77;
            final float n89 = n78;
            float n90 = n77;
            float n91 = n78;
            for (long n92 = 2L; n92 < n11; ++n92) {
                final long n93 = n2 - n92;
                final float n94 = n88 * n90 - n89 * n91;
                n91 = n88 * n91 + n89 * n90;
                n90 = n94;
                final long n95 = n92 * n4;
                final long n96 = n93 * n4;
                for (long n97 = 0L; n97 < n4; ++n97) {
                    final long n98 = n6 + n97;
                    final long n99 = n5 + n97;
                    class23.method169(n98 + n83, class23.method135(n98 + n83) + n90 * class22.method135(n99 + n95));
                    class23.method169(n98 + n84, class23.method135(n98 + n84) + n91 * class22.method135(n99 + n96));
                }
            }
        }
        for (long n100 = 1L; n100 < n11; ++n100) {
            final long n101 = n100 * n4;
            for (long n102 = 0L; n102 < n4; ++n102) {
                class23.method169(n6 + n102, class23.method135(n6 + n102) + class22.method135(n5 + n102 + n101));
            }
        }
        if (n < n3) {
            for (long n103 = 0L; n103 < n; ++n103) {
                for (long n104 = 0L; n104 < n3; ++n104) {
                    final long n105 = n104 * n;
                    class22.method169(n5 + n103 + n105 * n2, class23.method135(n6 + n103 + n105));
                }
            }
        }
        else {
            for (long n106 = 0L; n106 < n3; ++n106) {
                final long n107 = n106 * n;
                final long n108 = n107 * n2;
                for (long n109 = 0L; n109 < n; ++n109) {
                    class22.method169(n5 + n109 + n108, class23.method135(n6 + n109 + n107));
                }
            }
        }
        final long n110 = n2 * n;
        for (long n111 = 1L; n111 < n11; ++n111) {
            final long n112 = n2 - n111;
            final long n113 = 2L * n111;
            final long n114 = n111 * n3 * n;
            final long n115 = n112 * n3 * n;
            final long n116 = n113 * n;
            for (long n117 = 0L; n117 < n3; ++n117) {
                final long n118 = n117 * n;
                final long n119 = n118 + n114;
                final long n120 = n118 + n115;
                final long n121 = n117 * n110;
                class22.method169(n5 + n - 1L + n116 - n + n121, class23.method135(n6 + n119));
                class22.method169(n5 + n116 + n121, class23.method135(n6 + n120));
            }
        }
        if (n != 1L) {
            if (n12 < n3) {
                for (long n122 = 1L; n122 < n11; ++n122) {
                    final long n123 = n2 - n122;
                    final long n124 = 2L * n122;
                    final long n125 = n122 * n3 * n;
                    final long n126 = n123 * n3 * n;
                    final long n127 = n124 * n;
                    for (long n128 = 2L; n128 < n; n128 += 2L) {
                        final long n129 = n - n128;
                        final long n130 = n5 + n128;
                        final long n131 = n5 + n129;
                        final long n132 = n6 + n128;
                        for (long n133 = 0L; n133 < n3; ++n133) {
                            final long n134 = n133 * n110;
                            final long n135 = n133 * n;
                            final long n136 = n130 + n127 + n134;
                            final long n137 = n131 + n127 - n + n134;
                            final long n138 = n132 + n135 + n125;
                            final long n139 = n132 + n135 + n126;
                            final float method153 = class23.method135(n138 - 1L);
                            final float method154 = class23.method135(n138);
                            final float method155 = class23.method135(n139 - 1L);
                            final float method156 = class23.method135(n139);
                            class22.method169(n136 - 1L, method153 + method155);
                            class22.method169(n137 - 1L, method153 - method155);
                            class22.method169(n136, method154 + method156);
                            class22.method169(n137, method156 - method154);
                        }
                    }
                }
            }
            else {
                for (long n140 = 1L; n140 < n11; ++n140) {
                    final long n141 = n2 - n140;
                    final long n142 = 2L * n140;
                    final long n143 = n140 * n3 * n;
                    final long n144 = n141 * n3 * n;
                    final long n145 = n142 * n;
                    for (long n146 = 0L; n146 < n3; ++n146) {
                        final long n147 = n146 * n110;
                        final long n148 = n146 * n;
                        for (long n149 = 2L; n149 < n; n149 += 2L) {
                            final long n150 = n - n149;
                            final long n151 = n5 + n149;
                            final long n152 = n5 + n150;
                            final long n153 = n6 + n149;
                            final long n154 = n151 + n145 + n147;
                            final long n155 = n152 + n145 - n + n147;
                            final long n156 = n153 + n148 + n143;
                            final long n157 = n153 + n148 + n144;
                            final float method157 = class23.method135(n156 - 1L);
                            final float method158 = class23.method135(n156);
                            final float method159 = class23.method135(n157 - 1L);
                            final float method160 = class23.method135(n157);
                            class22.method169(n154 - 1L, method157 + method159);
                            class22.method169(n155 - 1L, method157 - method159);
                            class22.method169(n154, method158 + method160);
                            class22.method169(n155, method160 - method158);
                        }
                    }
                }
            }
        }
    }
    
    public void method25990(final int n, final int n2, final int n3, final int n4, final float[] array, final int n5, final float[] array2, final int n6, final int n7) {
        final float n8 = 6.2831855f / n2;
        final float n9 = (float)Class7640.method24103(n8);
        final float n10 = (float)Class7640.method24102(n8);
        final int n11 = (n - 1) / 2;
        final int n12 = (n2 + 1) / 2;
        final int n13 = n2 * n;
        if (n < n3) {
            for (int i = 0; i < n; ++i) {
                final int n14 = n6 + i;
                final int n15 = n5 + i;
                for (int j = 0; j < n3; ++j) {
                    array2[n14 + j * n] = array[n15 + j * n13];
                }
            }
        }
        else {
            for (int k = 0; k < n3; ++k) {
                final int n16 = k * n;
                final int n17 = k * n13;
                for (int l = 0; l < n; ++l) {
                    array2[n6 + l + n16] = array[n5 + l + n17];
                }
            }
        }
        final int n18 = n5 + n - 1;
        for (int n19 = 1; n19 < n12; ++n19) {
            final int n20 = n2 - n19;
            final int n21 = 2 * n19;
            final int n22 = n19 * n3 * n;
            final int n23 = n20 * n3 * n;
            final int n24 = n21 * n;
            for (int n25 = 0; n25 < n3; ++n25) {
                final int n26 = n25 * n;
                final int n27 = n26 * n2;
                final int n28 = n18 + n24 + n27 - n;
                final int n29 = n5 + n24 + n27;
                final float n30 = array[n28];
                final float n31 = array[n29];
                array2[n6 + n26 + n22] = n30 + n30;
                array2[n6 + n26 + n23] = n31 + n31;
            }
        }
        if (n != 1) {
            if (n11 < n3) {
                for (int n32 = 1; n32 < n12; ++n32) {
                    final int n33 = n2 - n32;
                    final int n34 = n32 * n3 * n;
                    final int n35 = n33 * n3 * n;
                    final int n36 = 2 * n32 * n;
                    for (int n37 = 2; n37 < n; n37 += 2) {
                        final int n38 = n - n37;
                        final int n39 = n6 + n37;
                        final int n40 = n5 + n38;
                        final int n41 = n5 + n37;
                        for (int n42 = 0; n42 < n3; ++n42) {
                            final int n43 = n42 * n + n34;
                            final int n44 = n42 * n + n35;
                            final int n45 = n42 * n2 * n + n36;
                            final int n46 = n39 + n43;
                            final int n47 = n39 + n44;
                            final int n48 = n41 + n45;
                            final int n49 = n40 + n45 - n;
                            final float n50 = array[n48 - 1];
                            final float n51 = array[n48];
                            final float n52 = array[n49 - 1];
                            final float n53 = array[n49];
                            array2[n46 - 1] = n50 + n52;
                            array2[n47 - 1] = n50 - n52;
                            array2[n46] = n51 - n53;
                            array2[n47] = n51 + n53;
                        }
                    }
                }
            }
            else {
                for (int n54 = 1; n54 < n12; ++n54) {
                    final int n55 = n2 - n54;
                    final int n56 = n54 * n3 * n;
                    final int n57 = n55 * n3 * n;
                    final int n58 = 2 * n54 * n;
                    for (int n59 = 0; n59 < n3; ++n59) {
                        final int n60 = n59 * n + n56;
                        final int n61 = n59 * n + n57;
                        final int n62 = n59 * n2 * n + n58;
                        for (int n63 = 2; n63 < n; n63 += 2) {
                            final int n64 = n - n63;
                            final int n65 = n6 + n63;
                            final int n66 = n5 + n64;
                            final int n67 = n5 + n63;
                            final int n68 = n65 + n60;
                            final int n69 = n65 + n61;
                            final int n70 = n67 + n62;
                            final int n71 = n66 + n62 - n;
                            final float n72 = array[n70 - 1];
                            final float n73 = array[n70];
                            final float n74 = array[n71 - 1];
                            final float n75 = array[n71];
                            array2[n68 - 1] = n72 + n74;
                            array2[n69 - 1] = n72 - n74;
                            array2[n68] = n73 - n75;
                            array2[n69] = n73 + n75;
                        }
                    }
                }
            }
        }
        float n76 = 1.0f;
        float n77 = 0.0f;
        final int n78 = (n2 - 1) * n4;
        for (int n79 = 1; n79 < n12; ++n79) {
            final int n80 = n2 - n79;
            final float n81 = n9 * n76 - n10 * n77;
            n77 = n9 * n77 + n10 * n76;
            n76 = n81;
            final int n82 = n79 * n4;
            final int n83 = n80 * n4;
            for (int n84 = 0; n84 < n4; ++n84) {
                final int n85 = n5 + n84;
                final int n86 = n6 + n84;
                array[n85 + n82] = array2[n86] + n76 * array2[n86 + n4];
                array[n85 + n83] = n77 * array2[n86 + n78];
            }
            final float n87 = n76;
            final float n88 = n77;
            float n89 = n76;
            float n90 = n77;
            for (int n91 = 2; n91 < n12; ++n91) {
                final int n92 = n2 - n91;
                final float n93 = n87 * n89 - n88 * n90;
                n90 = n87 * n90 + n88 * n89;
                n89 = n93;
                final int n94 = n91 * n4;
                final int n95 = n92 * n4;
                for (int n96 = 0; n96 < n4; ++n96) {
                    final int n97 = n5 + n96;
                    final int n98 = n6 + n96;
                    final int n99 = n97 + n82;
                    array[n99] += n89 * array2[n98 + n94];
                    final int n100 = n97 + n83;
                    array[n100] += n90 * array2[n98 + n95];
                }
            }
        }
        for (int n101 = 1; n101 < n12; ++n101) {
            final int n102 = n101 * n4;
            for (int n103 = 0; n103 < n4; ++n103) {
                final int n104;
                array2[n104] += array2[(n104 = n6 + n103) + n102];
            }
        }
        for (int n105 = 1; n105 < n12; ++n105) {
            final int n106 = n2 - n105;
            final int n107 = n105 * n3 * n;
            final int n108 = n106 * n3 * n;
            for (int n109 = 0; n109 < n3; ++n109) {
                final int n110 = n109 * n;
                final int n111 = n6 + n110;
                final int n112 = n5 + n110 + n107;
                final int n113 = n5 + n110 + n108;
                final float n114 = array[n112];
                final float n115 = array[n113];
                array2[n111 + n107] = n114 - n115;
                array2[n111 + n108] = n114 + n115;
            }
        }
        if (n != 1) {
            if (n11 < n3) {
                for (int n116 = 1; n116 < n12; ++n116) {
                    final int n117 = n2 - n116;
                    final int n118 = n116 * n3 * n;
                    final int n119 = n117 * n3 * n;
                    for (int n120 = 2; n120 < n; n120 += 2) {
                        final int n121 = n6 + n120;
                        final int n122 = n5 + n120;
                        for (int n123 = 0; n123 < n3; ++n123) {
                            final int n124 = n123 * n;
                            final int n125 = n121 + n124 + n118;
                            final int n126 = n121 + n124 + n119;
                            final int n127 = n122 + n124 + n118;
                            final int n128 = n122 + n124 + n119;
                            final float n129 = array[n127 - 1];
                            final float n130 = array[n127];
                            final float n131 = array[n128 - 1];
                            final float n132 = array[n128];
                            array2[n125 - 1] = n129 - n132;
                            array2[n126 - 1] = n129 + n132;
                            array2[n125] = n130 + n131;
                            array2[n126] = n130 - n131;
                        }
                    }
                }
            }
            else {
                for (int n133 = 1; n133 < n12; ++n133) {
                    final int n134 = n2 - n133;
                    final int n135 = n133 * n3 * n;
                    final int n136 = n134 * n3 * n;
                    for (int n137 = 0; n137 < n3; ++n137) {
                        final int n138 = n137 * n;
                        for (int n139 = 2; n139 < n; n139 += 2) {
                            final int n140 = n6 + n139;
                            final int n141 = n5 + n139;
                            final int n142 = n140 + n138 + n135;
                            final int n143 = n140 + n138 + n136;
                            final int n144 = n141 + n138 + n135;
                            final int n145 = n141 + n138 + n136;
                            final float n146 = array[n144 - 1];
                            final float n147 = array[n144];
                            final float n148 = array[n145 - 1];
                            final float n149 = array[n145];
                            array2[n142 - 1] = n146 - n149;
                            array2[n143 - 1] = n146 + n149;
                            array2[n142] = n147 + n148;
                            array2[n143] = n147 - n148;
                        }
                    }
                }
            }
            System.arraycopy(array2, n6, array, n5, n4);
            for (int n150 = 1; n150 < n2; ++n150) {
                final int n151 = n150 * n3 * n;
                for (int n152 = 0; n152 < n3; ++n152) {
                    final int n153 = n152 * n + n151;
                    array[n5 + n153] = array2[n6 + n153];
                }
            }
            if (n11 > n3) {
                int n154 = -n;
                for (int n155 = 1; n155 < n2; ++n155) {
                    n154 += n;
                    final int n156 = n155 * n3 * n;
                    for (int n157 = 0; n157 < n3; ++n157) {
                        int n158 = n154 - 1;
                        final int n159 = n157 * n + n156;
                        for (int n160 = 2; n160 < n; n160 += 2) {
                            n158 += 2;
                            final int n161 = n158 + n7;
                            final float n162 = this.field32828[n161 - 1];
                            final float n163 = this.field32828[n161];
                            final int n164 = n5 + n160;
                            final int n165 = n6 + n160;
                            final int n166 = n164 + n159;
                            final int n167 = n165 + n159;
                            final float n168 = array2[n167 - 1];
                            final float n169 = array2[n167];
                            array[n166 - 1] = n162 * n168 - n163 * n169;
                            array[n166] = n162 * n169 + n163 * n168;
                        }
                    }
                }
            }
            else {
                int n170 = -n;
                for (int n171 = 1; n171 < n2; ++n171) {
                    n170 += n;
                    int n172 = n170 - 1;
                    final int n173 = n171 * n3 * n;
                    for (int n174 = 2; n174 < n; n174 += 2) {
                        n172 += 2;
                        final int n175 = n172 + n7;
                        final float n176 = this.field32828[n175 - 1];
                        final float n177 = this.field32828[n175];
                        final int n178 = n5 + n174;
                        final int n179 = n6 + n174;
                        for (int n180 = 0; n180 < n3; ++n180) {
                            final int n181 = n180 * n + n173;
                            final int n182 = n178 + n181;
                            final int n183 = n179 + n181;
                            final float n184 = array2[n183 - 1];
                            final float n185 = array2[n183];
                            array[n182 - 1] = n176 * n184 - n177 * n185;
                            array[n182] = n176 * n185 + n177 * n184;
                        }
                    }
                }
            }
        }
    }
    
    public void method25991(final long n, final long n2, final long n3, final long n4, final Class22 class22, final long n5, final Class22 class23, final long n6, final long n7) {
        final float n8 = 6.2831855f / n2;
        final float n9 = (float)Class7640.method24103(n8);
        final float n10 = (float)Class7640.method24102(n8);
        final long n11 = (n - 1L) / 2L;
        final long n12 = (n2 + 1L) / 2L;
        final long n13 = n2 * n;
        if (n < n3) {
            for (long n14 = 0L; n14 < n; ++n14) {
                final long n15 = n6 + n14;
                final long n16 = n5 + n14;
                for (long n17 = 0L; n17 < n3; ++n17) {
                    class23.method169(n15 + n17 * n, class22.method135(n16 + n17 * n13));
                }
            }
        }
        else {
            for (long n18 = 0L; n18 < n3; ++n18) {
                final long n19 = n18 * n;
                final long n20 = n18 * n13;
                for (long n21 = 0L; n21 < n; ++n21) {
                    class23.method169(n6 + n21 + n19, class22.method135(n5 + n21 + n20));
                }
            }
        }
        final long n22 = n5 + n - 1L;
        for (long n23 = 1L; n23 < n12; ++n23) {
            final long n24 = n2 - n23;
            final long n25 = 2L * n23;
            final long n26 = n23 * n3 * n;
            final long n27 = n24 * n3 * n;
            final long n28 = n25 * n;
            for (long n29 = 0L; n29 < n3; ++n29) {
                final long n30 = n29 * n;
                final long n31 = n30 * n2;
                final long n32 = n22 + n28 + n31 - n;
                final long n33 = n5 + n28 + n31;
                final float method135 = class22.method135(n32);
                final float method136 = class22.method135(n33);
                class23.method169(n6 + n30 + n26, method135 + method135);
                class23.method169(n6 + n30 + n27, method136 + method136);
            }
        }
        if (n != 1L) {
            if (n11 < n3) {
                for (long n34 = 1L; n34 < n12; ++n34) {
                    final long n35 = n2 - n34;
                    final long n36 = n34 * n3 * n;
                    final long n37 = n35 * n3 * n;
                    final long n38 = 2L * n34 * n;
                    for (long n39 = 2L; n39 < n; n39 += 2L) {
                        final long n40 = n - n39;
                        final long n41 = n6 + n39;
                        final long n42 = n5 + n40;
                        final long n43 = n5 + n39;
                        for (long n44 = 0L; n44 < n3; ++n44) {
                            final long n45 = n44 * n + n36;
                            final long n46 = n44 * n + n37;
                            final long n47 = n44 * n2 * n + n38;
                            final long n48 = n41 + n45;
                            final long n49 = n41 + n46;
                            final long n50 = n43 + n47;
                            final long n51 = n42 + n47 - n;
                            final float method137 = class22.method135(n50 - 1L);
                            final float method138 = class22.method135(n50);
                            final float method139 = class22.method135(n51 - 1L);
                            final float method140 = class22.method135(n51);
                            class23.method169(n48 - 1L, method137 + method139);
                            class23.method169(n49 - 1L, method137 - method139);
                            class23.method169(n48, method138 - method140);
                            class23.method169(n49, method138 + method140);
                        }
                    }
                }
            }
            else {
                for (long n52 = 1L; n52 < n12; ++n52) {
                    final long n53 = n2 - n52;
                    final long n54 = n52 * n3 * n;
                    final long n55 = n53 * n3 * n;
                    final long n56 = 2L * n52 * n;
                    for (long n57 = 0L; n57 < n3; ++n57) {
                        final long n58 = n57 * n + n54;
                        final long n59 = n57 * n + n55;
                        final long n60 = n57 * n2 * n + n56;
                        for (long n61 = 2L; n61 < n; n61 += 2L) {
                            final long n62 = n - n61;
                            final long n63 = n6 + n61;
                            final long n64 = n5 + n62;
                            final long n65 = n5 + n61;
                            final long n66 = n63 + n58;
                            final long n67 = n63 + n59;
                            final long n68 = n65 + n60;
                            final long n69 = n64 + n60 - n;
                            final float method141 = class22.method135(n68 - 1L);
                            final float method142 = class22.method135(n68);
                            final float method143 = class22.method135(n69 - 1L);
                            final float method144 = class22.method135(n69);
                            class23.method169(n66 - 1L, method141 + method143);
                            class23.method169(n67 - 1L, method141 - method143);
                            class23.method169(n66, method142 - method144);
                            class23.method169(n67, method142 + method144);
                        }
                    }
                }
            }
        }
        float n70 = 1.0f;
        float n71 = 0.0f;
        final long n72 = (n2 - 1L) * n4;
        for (long n73 = 1L; n73 < n12; ++n73) {
            final long n74 = n2 - n73;
            final float n75 = n9 * n70 - n10 * n71;
            n71 = n9 * n71 + n10 * n70;
            n70 = n75;
            final long n76 = n73 * n4;
            final long n77 = n74 * n4;
            for (long n78 = 0L; n78 < n4; ++n78) {
                final long n79 = n5 + n78;
                final long n80 = n6 + n78;
                class22.method169(n79 + n76, class23.method135(n80) + n70 * class23.method135(n80 + n4));
                class22.method169(n79 + n77, n71 * class23.method135(n80 + n72));
            }
            final float n81 = n70;
            final float n82 = n71;
            float n83 = n70;
            float n84 = n71;
            for (long n85 = 2L; n85 < n12; ++n85) {
                final long n86 = n2 - n85;
                final float n87 = n81 * n83 - n82 * n84;
                n84 = n81 * n84 + n82 * n83;
                n83 = n87;
                final long n88 = n85 * n4;
                final long n89 = n86 * n4;
                for (long n90 = 0L; n90 < n4; ++n90) {
                    final long n91 = n5 + n90;
                    final long n92 = n6 + n90;
                    class22.method169(n91 + n76, class22.method135(n91 + n76) + n83 * class23.method135(n92 + n88));
                    class22.method169(n91 + n77, class22.method135(n91 + n77) + n84 * class23.method135(n92 + n89));
                }
            }
        }
        for (long n93 = 1L; n93 < n12; ++n93) {
            final long n94 = n93 * n4;
            for (long n95 = 0L; n95 < n4; ++n95) {
                final long n96 = n6 + n95;
                class23.method169(n96, class23.method135(n96) + class23.method135(n96 + n94));
            }
        }
        for (long n97 = 1L; n97 < n12; ++n97) {
            final long n98 = n2 - n97;
            final long n99 = n97 * n3 * n;
            final long n100 = n98 * n3 * n;
            for (long n101 = 0L; n101 < n3; ++n101) {
                final long n102 = n101 * n;
                final long n103 = n6 + n102;
                final long n104 = n5 + n102 + n99;
                final long n105 = n5 + n102 + n100;
                final float method145 = class22.method135(n104);
                final float method146 = class22.method135(n105);
                class23.method169(n103 + n99, method145 - method146);
                class23.method169(n103 + n100, method145 + method146);
            }
        }
        if (n != 1L) {
            if (n11 < n3) {
                for (long n106 = 1L; n106 < n12; ++n106) {
                    final long n107 = n2 - n106;
                    final long n108 = n106 * n3 * n;
                    final long n109 = n107 * n3 * n;
                    for (long n110 = 2L; n110 < n; n110 += 2L) {
                        final long n111 = n6 + n110;
                        final long n112 = n5 + n110;
                        for (long n113 = 0L; n113 < n3; ++n113) {
                            final long n114 = n113 * n;
                            final long n115 = n111 + n114 + n108;
                            final long n116 = n111 + n114 + n109;
                            final long n117 = n112 + n114 + n108;
                            final long n118 = n112 + n114 + n109;
                            final float method147 = class22.method135(n117 - 1L);
                            final float method148 = class22.method135(n117);
                            final float method149 = class22.method135(n118 - 1L);
                            final float method150 = class22.method135(n118);
                            class23.method169(n115 - 1L, method147 - method150);
                            class23.method169(n116 - 1L, method147 + method150);
                            class23.method169(n115, method148 + method149);
                            class23.method169(n116, method148 - method149);
                        }
                    }
                }
            }
            else {
                for (long n119 = 1L; n119 < n12; ++n119) {
                    final long n120 = n2 - n119;
                    final long n121 = n119 * n3 * n;
                    final long n122 = n120 * n3 * n;
                    for (long n123 = 0L; n123 < n3; ++n123) {
                        final long n124 = n123 * n;
                        for (long n125 = 2L; n125 < n; n125 += 2L) {
                            final long n126 = n6 + n125;
                            final long n127 = n5 + n125;
                            final long n128 = n126 + n124 + n121;
                            final long n129 = n126 + n124 + n122;
                            final long n130 = n127 + n124 + n121;
                            final long n131 = n127 + n124 + n122;
                            final float method151 = class22.method135(n130 - 1L);
                            final float method152 = class22.method135(n130);
                            final float method153 = class22.method135(n131 - 1L);
                            final float method154 = class22.method135(n131);
                            class23.method169(n128 - 1L, method151 - method154);
                            class23.method169(n129 - 1L, method151 + method154);
                            class23.method169(n128, method152 + method153);
                            class23.method169(n129, method152 - method153);
                        }
                    }
                }
            }
            Class8601.method29152(class23, n6, class22, n5, n4);
            for (long n132 = 1L; n132 < n2; ++n132) {
                final long n133 = n132 * n3 * n;
                for (long n134 = 0L; n134 < n3; ++n134) {
                    final long n135 = n134 * n + n133;
                    class22.method169(n5 + n135, class23.method135(n6 + n135));
                }
            }
            if (n11 > n3) {
                long n136 = -n;
                for (long n137 = 1L; n137 < n2; ++n137) {
                    n136 += n;
                    final long n138 = n137 * n3 * n;
                    for (long n139 = 0L; n139 < n3; ++n139) {
                        long n140 = n136 - 1L;
                        final long n141 = n139 * n + n138;
                        for (long n142 = 2L; n142 < n; n142 += 2L) {
                            n140 += 2L;
                            final long n143 = n140 + n7;
                            final float method155 = this.field32829.method135(n143 - 1L);
                            final float method156 = this.field32829.method135(n143);
                            final long n144 = n5 + n142;
                            final long n145 = n6 + n142;
                            final long n146 = n144 + n141;
                            final long n147 = n145 + n141;
                            final float method157 = class23.method135(n147 - 1L);
                            final float method158 = class23.method135(n147);
                            class22.method169(n146 - 1L, method155 * method157 - method156 * method158);
                            class22.method169(n146, method155 * method158 + method156 * method157);
                        }
                    }
                }
            }
            else {
                long n148 = -n;
                for (long n149 = 1L; n149 < n2; ++n149) {
                    n148 += n;
                    long n150 = n148 - 1L;
                    final long n151 = n149 * n3 * n;
                    for (long n152 = 2L; n152 < n; n152 += 2L) {
                        n150 += 2L;
                        final long n153 = n150 + n7;
                        final float method159 = this.field32829.method135(n153 - 1L);
                        final float method160 = this.field32829.method135(n153);
                        final long n154 = n5 + n152;
                        final long n155 = n6 + n152;
                        for (long n156 = 0L; n156 < n3; ++n156) {
                            final long n157 = n156 * n + n151;
                            final long n158 = n154 + n157;
                            final long n159 = n155 + n157;
                            final float method161 = class23.method135(n159 - 1L);
                            final float method162 = class23.method135(n159);
                            class22.method169(n158 - 1L, method159 * method161 - method160 * method162);
                            class22.method169(n158, method159 * method162 + method160 * method161);
                        }
                    }
                }
            }
        }
    }
    
    public void method25992(final float[] array, final int n, final int n2) {
        final int[] array2 = { 0 };
        final int n3 = 2 * this.field32814;
        final float[] array3 = new float[n3];
        final int n4 = n3;
        final int n5 = 4 * this.field32814;
        array2[0] = 0;
        final int n6 = (int)this.field32826[1 + n5];
        int n7 = 0;
        int n8 = 1;
        int n9 = n4;
        for (int i = 2; i <= n6 + 1; ++i) {
            final int n10 = (int)this.field32826[i + n5];
            final int n11 = n10 * n8;
            final int n12 = this.field32814 / n11;
            final int n13 = n12 + n12;
            final int n14 = n13 * n8;
            switch (n10) {
                case 4: {
                    if (n7 == 0) {
                        this.method25998(n13, n8, array, n, array3, 0, n9, n2);
                    }
                    else {
                        this.method25998(n13, n8, array3, 0, array, n, n9, n2);
                    }
                    n7 = 1 - n7;
                    break;
                }
                case 2: {
                    if (n7 == 0) {
                        this.method25994(n13, n8, array, n, array3, 0, n9, n2);
                    }
                    else {
                        this.method25994(n13, n8, array3, 0, array, n, n9, n2);
                    }
                    n7 = 1 - n7;
                    break;
                }
                case 3: {
                    if (n7 == 0) {
                        this.method25996(n13, n8, array, n, array3, 0, n9, n2);
                    }
                    else {
                        this.method25996(n13, n8, array3, 0, array, n, n9, n2);
                    }
                    n7 = 1 - n7;
                    break;
                }
                case 5: {
                    if (n7 == 0) {
                        this.method26000(n13, n8, array, n, array3, 0, n9, n2);
                    }
                    else {
                        this.method26000(n13, n8, array3, 0, array, n, n9, n2);
                    }
                    n7 = 1 - n7;
                    break;
                }
                default: {
                    if (n7 == 0) {
                        this.method26002(array2, n13, n10, n8, n14, array, n, array3, 0, n9, n2);
                    }
                    else {
                        this.method26002(array2, n13, n10, n8, n14, array3, 0, array, n, n9, n2);
                    }
                    if (array2[0] != 0) {
                        n7 = 1 - n7;
                        break;
                    }
                    break;
                }
            }
            n8 = n11;
            n9 += (n10 - 1) * n13;
        }
        if (n7 == 0) {
            return;
        }
        System.arraycopy(array3, 0, array, n, n3);
    }
    
    public void method25993(final Class22 class22, final long n, final int n2) {
        final int[] array = { 0 };
        final long n3 = 2L * this.field32815;
        final Class22 class23 = new Class22(n3);
        final long n4 = n3;
        final long n5 = 4L * this.field32815;
        array[0] = 0;
        final long n6 = (long)this.field32827.method135(1L + n5);
        long n7 = 0L;
        long n8 = 1L;
        long n9 = n4;
        for (long n10 = 2L; n10 <= n6 + 1L; ++n10) {
            final int n11 = (int)this.field32827.method135(n10 + n5);
            final long n12 = n11 * n8;
            final long n13 = this.field32815 / n12;
            final long n14 = n13 + n13;
            final long n15 = n14 * n8;
            switch (n11) {
                case 4: {
                    if (n7 == 0L) {
                        this.method25999(n14, n8, class22, n, class23, 0L, n9, n2);
                    }
                    else {
                        this.method25999(n14, n8, class23, 0L, class22, n, n9, n2);
                    }
                    n7 = 1L - n7;
                    break;
                }
                case 2: {
                    if (n7 == 0L) {
                        this.method25995(n14, n8, class22, n, class23, 0L, n9, n2);
                    }
                    else {
                        this.method25995(n14, n8, class23, 0L, class22, n, n9, n2);
                    }
                    n7 = 1L - n7;
                    break;
                }
                case 3: {
                    if (n7 == 0L) {
                        this.method25997(n14, n8, class22, n, class23, 0L, n9, n2);
                    }
                    else {
                        this.method25997(n14, n8, class23, 0L, class22, n, n9, n2);
                    }
                    n7 = 1L - n7;
                    break;
                }
                case 5: {
                    if (n7 == 0L) {
                        this.method26001(n14, n8, class22, n, class23, 0L, n9, n2);
                    }
                    else {
                        this.method26001(n14, n8, class23, 0L, class22, n, n9, n2);
                    }
                    n7 = 1L - n7;
                    break;
                }
                default: {
                    if (n7 == 0L) {
                        this.method26003(array, n14, n11, n8, n15, class22, n, class23, 0L, n9, n2);
                    }
                    else {
                        this.method26003(array, n14, n11, n8, n15, class23, 0L, class22, n, n9, n2);
                    }
                    if (array[0] != 0) {
                        n7 = 1L - n7;
                        break;
                    }
                    break;
                }
            }
            n8 = n12;
            n9 += (n11 - 1) * n14;
        }
        if (n7 == 0L) {
            return;
        }
        Class8601.method29152(class23, 0L, class22, n, n3);
    }
    
    public void method25994(final int n, final int n2, final float[] array, final int n3, final float[] array2, final int n4, final int n5, final int n6) {
        final int n7 = n * n2;
        if (n > 2) {
            for (int i = 0; i < n2; ++i) {
                for (int j = 0; j < n - 1; j += 2) {
                    final int n8 = i * n;
                    final int n9 = n3 + j + 2 * n8;
                    final int n10 = n9 + n;
                    final float n11 = array[n9];
                    final float n12 = array[n9 + 1];
                    final float n13 = array[n10];
                    final float n14 = array[n10 + 1];
                    final int n15 = j + n5;
                    final float n16 = this.field32826[n15];
                    final float n17 = n6 * this.field32826[n15 + 1];
                    final float n18 = n11 - n13;
                    final float n19 = n12 - n14;
                    final int n20 = n4 + j + n8;
                    final int n21 = n20 + n7;
                    array2[n20] = n11 + n13;
                    array2[n20 + 1] = n12 + n14;
                    array2[n21] = n16 * n18 - n17 * n19;
                    array2[n21 + 1] = n16 * n19 + n17 * n18;
                }
            }
        }
        else {
            for (int k = 0; k < n2; ++k) {
                final int n22 = k * n;
                final int n23 = n3 + 2 * n22;
                final int n24 = n23 + n;
                final float n25 = array[n23];
                final float n26 = array[n23 + 1];
                final float n27 = array[n24];
                final float n28 = array[n24 + 1];
                final int n29 = n4 + n22;
                final int n30 = n29 + n7;
                array2[n29] = n25 + n27;
                array2[n29 + 1] = n26 + n28;
                array2[n30] = n25 - n27;
                array2[n30 + 1] = n26 - n28;
            }
        }
    }
    
    public void method25995(final long n, final long n2, final Class22 class22, final long n3, final Class22 class23, final long n4, final long n5, final long n6) {
        final long n7 = n * n2;
        if (n > 2L) {
            for (long n8 = 0L; n8 < n2; ++n8) {
                for (long n9 = 0L; n9 < n - 1L; n9 += 2L) {
                    final long n10 = n8 * n;
                    final long n11 = n3 + n9 + 2L * n10;
                    final long n12 = n11 + n;
                    final float method135 = class22.method135(n11);
                    final float method136 = class22.method135(n11 + 1L);
                    final float method137 = class22.method135(n12);
                    final float method138 = class22.method135(n12 + 1L);
                    final long n13 = n9 + n5;
                    final float method139 = this.field32827.method135(n13);
                    final float n14 = n6 * this.field32827.method135(n13 + 1L);
                    final float n15 = method135 - method137;
                    final float n16 = method136 - method138;
                    final long n17 = n4 + n9 + n10;
                    final long n18 = n17 + n7;
                    class23.method169(n17, method135 + method137);
                    class23.method169(n17 + 1L, method136 + method138);
                    class23.method169(n18, method139 * n15 - n14 * n16);
                    class23.method169(n18 + 1L, method139 * n16 + n14 * n15);
                }
            }
        }
        else {
            for (long n19 = 0L; n19 < n2; ++n19) {
                final long n20 = n19 * n;
                final long n21 = n3 + 2L * n20;
                final long n22 = n21 + n;
                final float method140 = class22.method135(n21);
                final float method141 = class22.method135(n21 + 1L);
                final float method142 = class22.method135(n22);
                final float method143 = class22.method135(n22 + 1L);
                final long n23 = n4 + n20;
                final long n24 = n23 + n7;
                class23.method169(n23, method140 + method142);
                class23.method169(n23 + 1L, method141 + method143);
                class23.method169(n24, method140 - method142);
                class23.method169(n24 + 1L, method141 - method143);
            }
        }
    }
    
    public void method25996(final int n, final int n2, final float[] array, final int n3, final float[] array2, final int n4, final int n5, final int n6) {
        final int n7 = n5 + n;
        final int n8 = n2 * n;
        if (n != 2) {
            for (int i = 1; i <= n2; ++i) {
                final int n9 = n3 + (3 * i - 2) * n;
                final int n10 = n4 + (i - 1) * n;
                for (int j = 0; j < n - 1; j += 2) {
                    final int n11 = j + n9;
                    final int n12 = n11 + n;
                    final int n13 = n11 - n;
                    final float n14 = array[n11];
                    final float n15 = array[n11 + 1];
                    final float n16 = array[n12];
                    final float n17 = array[n12 + 1];
                    final float n18 = array[n13];
                    final float n19 = array[n13 + 1];
                    final float n20 = n14 + n16;
                    final float n21 = n18 + -0.5f * n20;
                    final float n22 = n15 + n17;
                    final float n23 = n19 + -0.5f * n22;
                    final float n24 = n6 * 0.8660254f * (n14 - n16);
                    final float n25 = n6 * 0.8660254f * (n15 - n17);
                    final float n26 = n21 - n25;
                    final float n27 = n21 + n25;
                    final float n28 = n23 + n24;
                    final float n29 = n23 - n24;
                    final int n30 = j + n5;
                    final int n31 = j + n7;
                    final float n32 = this.field32826[n30];
                    final float n33 = n6 * this.field32826[n30 + 1];
                    final float n34 = this.field32826[n31];
                    final float n35 = n6 * this.field32826[n31 + 1];
                    final int n36 = j + n10;
                    final int n37 = n36 + n8;
                    final int n38 = n37 + n8;
                    array2[n36] = n18 + n20;
                    array2[n36 + 1] = n19 + n22;
                    array2[n37] = n32 * n26 - n33 * n28;
                    array2[n37 + 1] = n32 * n28 + n33 * n26;
                    array2[n38] = n34 * n27 - n35 * n29;
                    array2[n38 + 1] = n34 * n29 + n35 * n27;
                }
            }
        }
        else {
            for (int k = 1; k <= n2; ++k) {
                final int n39 = n3 + (3 * k - 2) * n;
                final int n40 = n39 + n;
                final int n41 = n39 - n;
                final float n42 = array[n39];
                final float n43 = array[n39 + 1];
                final float n44 = array[n40];
                final float n45 = array[n40 + 1];
                final float n46 = array[n41];
                final float n47 = array[n41 + 1];
                final float n48 = n42 + n44;
                final float n49 = n46 + -0.5f * n48;
                final float n50 = n43 + n45;
                final float n51 = n47 + -0.5f * n50;
                final float n52 = n6 * 0.8660254f * (n42 - n44);
                final float n53 = n6 * 0.8660254f * (n43 - n45);
                final int n54 = n4 + (k - 1) * n;
                final int n55 = n54 + n8;
                final int n56 = n55 + n8;
                array2[n54] = array[n41] + n48;
                array2[n54 + 1] = n47 + n50;
                array2[n55] = n49 - n53;
                array2[n55 + 1] = n51 + n52;
                array2[n56] = n49 + n53;
                array2[n56 + 1] = n51 - n52;
            }
        }
    }
    
    public void method25997(final long n, final long n2, final Class22 class22, final long n3, final Class22 class23, final long n4, final long n5, final long n6) {
        final long n7 = n5 + n;
        final long n8 = n2 * n;
        if (n != 2L) {
            for (long n9 = 1L; n9 <= n2; ++n9) {
                final long n10 = n3 + (3L * n9 - 2L) * n;
                final long n11 = n4 + (n9 - 1L) * n;
                for (long n12 = 0L; n12 < n - 1L; n12 += 2L) {
                    final long n13 = n12 + n10;
                    final long n14 = n13 + n;
                    final long n15 = n13 - n;
                    final float method135 = class22.method135(n13);
                    final float method136 = class22.method135(n13 + 1L);
                    final float method137 = class22.method135(n14);
                    final float method138 = class22.method135(n14 + 1L);
                    final float method139 = class22.method135(n15);
                    final float method140 = class22.method135(n15 + 1L);
                    final float n16 = method135 + method137;
                    final float n17 = method139 + -0.5f * n16;
                    final float n18 = method136 + method138;
                    final float n19 = method140 + -0.5f * n18;
                    final float n20 = n6 * 0.8660254f * (method135 - method137);
                    final float n21 = n6 * 0.8660254f * (method136 - method138);
                    final float n22 = n17 - n21;
                    final float n23 = n17 + n21;
                    final float n24 = n19 + n20;
                    final float n25 = n19 - n20;
                    final long n26 = n12 + n5;
                    final long n27 = n12 + n7;
                    final float method141 = this.field32827.method135(n26);
                    final float n28 = n6 * this.field32827.method135(n26 + 1L);
                    final float method142 = this.field32827.method135(n27);
                    final float n29 = n6 * this.field32827.method135(n27 + 1L);
                    final long n30 = n12 + n11;
                    final long n31 = n30 + n8;
                    final long n32 = n31 + n8;
                    class23.method169(n30, method139 + n16);
                    class23.method169(n30 + 1L, method140 + n18);
                    class23.method169(n31, method141 * n22 - n28 * n24);
                    class23.method169(n31 + 1L, method141 * n24 + n28 * n22);
                    class23.method169(n32, method142 * n23 - n29 * n25);
                    class23.method169(n32 + 1L, method142 * n25 + n29 * n23);
                }
            }
        }
        else {
            for (long n33 = 1L; n33 <= n2; ++n33) {
                final long n34 = n3 + (3L * n33 - 2L) * n;
                final long n35 = n34 + n;
                final long n36 = n34 - n;
                final float method143 = class22.method135(n34);
                final float method144 = class22.method135(n34 + 1L);
                final float method145 = class22.method135(n35);
                final float method146 = class22.method135(n35 + 1L);
                final float method147 = class22.method135(n36);
                final float method148 = class22.method135(n36 + 1L);
                final float n37 = method143 + method145;
                final float n38 = method147 + -0.5f * n37;
                final float n39 = method144 + method146;
                final float n40 = method148 + -0.5f * n39;
                final float n41 = n6 * 0.8660254f * (method143 - method145);
                final float n42 = n6 * 0.8660254f * (method144 - method146);
                final long n43 = n4 + (n33 - 1L) * n;
                final long n44 = n43 + n8;
                final long n45 = n44 + n8;
                class23.method169(n43, class22.method135(n36) + n37);
                class23.method169(n43 + 1L, method148 + n39);
                class23.method169(n44, n38 - n42);
                class23.method169(n44 + 1L, n40 + n41);
                class23.method169(n45, n38 + n42);
                class23.method169(n45 + 1L, n40 - n41);
            }
        }
    }
    
    public void method25998(final int n, final int n2, final float[] array, final int n3, final float[] array2, final int n4, final int n5, final int n6) {
        final int n7 = n5 + n;
        final int n8 = n7 + n;
        final int n9 = n2 * n;
        if (n != 2) {
            for (int i = 0; i < n2; ++i) {
                final int n10 = i * n;
                final int n11 = n3 + 1 + 4 * n10;
                for (int j = 0; j < n - 1; j += 2) {
                    final int n12 = j + n11;
                    final int n13 = n12 + n;
                    final int n14 = n13 + n;
                    final int n15 = n14 + n;
                    final float n16 = array[n12 - 1];
                    final float n17 = array[n12];
                    final float n18 = array[n13 - 1];
                    final float n19 = array[n13];
                    final float n20 = array[n14 - 1];
                    final float n21 = array[n14];
                    final float n22 = array[n15 - 1];
                    final float n23 = array[n15];
                    final float n24 = n17 - n21;
                    final float n25 = n17 + n21;
                    final float n26 = n19 + n23;
                    final float n27 = n23 - n19;
                    final float n28 = n16 - n20;
                    final float n29 = n16 + n20;
                    final float n30 = n18 - n22;
                    final float n31 = n18 + n22;
                    final float n32 = n29 - n31;
                    final float n33 = n25 - n26;
                    final float n34 = n28 + n6 * n27;
                    final float n35 = n28 - n6 * n27;
                    final float n36 = n24 + n6 * n30;
                    final float n37 = n24 - n6 * n30;
                    final int n38 = j + n5;
                    final int n39 = j + n7;
                    final int n40 = j + n8;
                    final float n41 = this.field32826[n38];
                    final float n42 = n6 * this.field32826[n38 + 1];
                    final float n43 = this.field32826[n39];
                    final float n44 = n6 * this.field32826[n39 + 1];
                    final float n45 = this.field32826[n40];
                    final float n46 = n6 * this.field32826[n40 + 1];
                    final int n47 = n4 + j + n10;
                    final int n48 = n47 + n9;
                    final int n49 = n48 + n9;
                    final int n50 = n49 + n9;
                    array2[n47] = n29 + n31;
                    array2[n47 + 1] = n25 + n26;
                    array2[n48] = n41 * n34 - n42 * n36;
                    array2[n48 + 1] = n41 * n36 + n42 * n34;
                    array2[n49] = n43 * n32 - n44 * n33;
                    array2[n49 + 1] = n43 * n33 + n44 * n32;
                    array2[n50] = n45 * n35 - n46 * n37;
                    array2[n50 + 1] = n45 * n37 + n46 * n35;
                }
            }
        }
        else {
            for (int k = 0; k < n2; ++k) {
                final int n51 = k * n;
                final int n52 = n3 + 4 * n51 + 1;
                final int n53 = n52 + n;
                final int n54 = n53 + n;
                final int n55 = n54 + n;
                final float n56 = array[n52 - 1];
                final float n57 = array[n52];
                final float n58 = array[n53 - 1];
                final float n59 = array[n53];
                final float n60 = array[n54 - 1];
                final float n61 = array[n54];
                final float n62 = array[n55 - 1];
                final float n63 = array[n55];
                final float n64 = n57 - n61;
                final float n65 = n57 + n61;
                final float n66 = n63 - n59;
                final float n67 = n59 + n63;
                final float n68 = n56 - n60;
                final float n69 = n56 + n60;
                final float n70 = n58 - n62;
                final float n71 = n58 + n62;
                final int n72 = n4 + n51;
                final int n73 = n72 + n9;
                final int n74 = n73 + n9;
                final int n75 = n74 + n9;
                array2[n72] = n69 + n71;
                array2[n72 + 1] = n65 + n67;
                array2[n73] = n68 + n6 * n66;
                array2[n73 + 1] = n64 + n6 * n70;
                array2[n74] = n69 - n71;
                array2[n74 + 1] = n65 - n67;
                array2[n75] = n68 - n6 * n66;
                array2[n75 + 1] = n64 - n6 * n70;
            }
        }
    }
    
    public void method25999(final long n, final long n2, final Class22 class22, final long n3, final Class22 class23, final long n4, final long n5, final int n6) {
        final long n7 = n5 + n;
        final long n8 = n7 + n;
        final long n9 = n2 * n;
        if (n != 2L) {
            for (long n10 = 0L; n10 < n2; ++n10) {
                final long n11 = n10 * n;
                final long n12 = n3 + 1L + 4L * n11;
                for (long n13 = 0L; n13 < n - 1L; n13 += 2L) {
                    final long n14 = n13 + n12;
                    final long n15 = n14 + n;
                    final long n16 = n15 + n;
                    final long n17 = n16 + n;
                    final float method135 = class22.method135(n14 - 1L);
                    final float method136 = class22.method135(n14);
                    final float method137 = class22.method135(n15 - 1L);
                    final float method138 = class22.method135(n15);
                    final float method139 = class22.method135(n16 - 1L);
                    final float method140 = class22.method135(n16);
                    final float method141 = class22.method135(n17 - 1L);
                    final float method142 = class22.method135(n17);
                    final float n18 = method136 - method140;
                    final float n19 = method136 + method140;
                    final float n20 = method138 + method142;
                    final float n21 = method142 - method138;
                    final float n22 = method135 - method139;
                    final float n23 = method135 + method139;
                    final float n24 = method137 - method141;
                    final float n25 = method137 + method141;
                    final float n26 = n23 - n25;
                    final float n27 = n19 - n20;
                    final float n28 = n22 + n6 * n21;
                    final float n29 = n22 - n6 * n21;
                    final float n30 = n18 + n6 * n24;
                    final float n31 = n18 - n6 * n24;
                    final long n32 = n13 + n5;
                    final long n33 = n13 + n7;
                    final long n34 = n13 + n8;
                    final float method143 = this.field32827.method135(n32);
                    final float n35 = n6 * this.field32827.method135(n32 + 1L);
                    final float method144 = this.field32827.method135(n33);
                    final float n36 = n6 * this.field32827.method135(n33 + 1L);
                    final float method145 = this.field32827.method135(n34);
                    final float n37 = n6 * this.field32827.method135(n34 + 1L);
                    final long n38 = n4 + n13 + n11;
                    final long n39 = n38 + n9;
                    final long n40 = n39 + n9;
                    final long n41 = n40 + n9;
                    class23.method169(n38, n23 + n25);
                    class23.method169(n38 + 1L, n19 + n20);
                    class23.method169(n39, method143 * n28 - n35 * n30);
                    class23.method169(n39 + 1L, method143 * n30 + n35 * n28);
                    class23.method169(n40, method144 * n26 - n36 * n27);
                    class23.method169(n40 + 1L, method144 * n27 + n36 * n26);
                    class23.method169(n41, method145 * n29 - n37 * n31);
                    class23.method169(n41 + 1L, method145 * n31 + n37 * n29);
                }
            }
        }
        else {
            for (long n42 = 0L; n42 < n2; ++n42) {
                final long n43 = n42 * n;
                final long n44 = n3 + 4L * n43 + 1L;
                final long n45 = n44 + n;
                final long n46 = n45 + n;
                final long n47 = n46 + n;
                final float method146 = class22.method135(n44 - 1L);
                final float method147 = class22.method135(n44);
                final float method148 = class22.method135(n45 - 1L);
                final float method149 = class22.method135(n45);
                final float method150 = class22.method135(n46 - 1L);
                final float method151 = class22.method135(n46);
                final float method152 = class22.method135(n47 - 1L);
                final float method153 = class22.method135(n47);
                final float n48 = method147 - method151;
                final float n49 = method147 + method151;
                final float n50 = method153 - method149;
                final float n51 = method149 + method153;
                final float n52 = method146 - method150;
                final float n53 = method146 + method150;
                final float n54 = method148 - method152;
                final float n55 = method148 + method152;
                final long n56 = n4 + n43;
                final long n57 = n56 + n9;
                final long n58 = n57 + n9;
                final long n59 = n58 + n9;
                class23.method169(n56, n53 + n55);
                class23.method169(n56 + 1L, n49 + n51);
                class23.method169(n57, n52 + n6 * n50);
                class23.method169(n57 + 1L, n48 + n6 * n54);
                class23.method169(n58, n53 - n55);
                class23.method169(n58 + 1L, n49 - n51);
                class23.method169(n59, n52 - n6 * n50);
                class23.method169(n59 + 1L, n48 - n6 * n54);
            }
        }
    }
    
    public void method26000(final int n, final int n2, final float[] array, final int n3, final float[] array2, final int n4, final int n5, final int n6) {
        final int n7 = n5 + n;
        final int n8 = n7 + n;
        final int n9 = n8 + n;
        final int n10 = n2 * n;
        if (n != 2) {
            for (int i = 1; i <= n2; ++i) {
                final int n11 = n3 + 1 + (i * 5 - 4) * n;
                final int n12 = n4 + (i - 1) * n;
                for (int j = 0; j < n - 1; j += 2) {
                    final int n13 = j + n11;
                    final int n14 = n13 + n;
                    final int n15 = n13 - n;
                    final int n16 = n14 + n;
                    final int n17 = n16 + n;
                    final float n18 = array[n13 - 1];
                    final float n19 = array[n13];
                    final float n20 = array[n14 - 1];
                    final float n21 = array[n14];
                    final float n22 = array[n15 - 1];
                    final float n23 = array[n15];
                    final float n24 = array[n16 - 1];
                    final float n25 = array[n16];
                    final float n26 = array[n17 - 1];
                    final float n27 = array[n17];
                    final float n28 = n19 - n27;
                    final float n29 = n19 + n27;
                    final float n30 = n21 - n25;
                    final float n31 = n21 + n25;
                    final float n32 = n18 - n26;
                    final float n33 = n18 + n26;
                    final float n34 = n20 - n24;
                    final float n35 = n20 + n24;
                    final float n36 = n22 + 0.309017f * n33 + -0.809017f * n35;
                    final float n37 = n23 + 0.309017f * n29 + -0.809017f * n31;
                    final float n38 = n22 + -0.809017f * n33 + 0.309017f * n35;
                    final float n39 = n23 + -0.809017f * n29 + 0.309017f * n31;
                    final float n40 = n6 * (0.95105654f * n32 + 0.58778524f * n34);
                    final float n41 = n6 * (0.95105654f * n28 + 0.58778524f * n30);
                    final float n42 = n6 * (0.58778524f * n32 - 0.95105654f * n34);
                    final float n43 = n6 * (0.58778524f * n28 - 0.95105654f * n30);
                    final float n44 = n38 - n43;
                    final float n45 = n38 + n43;
                    final float n46 = n39 + n42;
                    final float n47 = n39 - n42;
                    final float n48 = n36 + n41;
                    final float n49 = n36 - n41;
                    final float n50 = n37 - n40;
                    final float n51 = n37 + n40;
                    final int n52 = j + n5;
                    final int n53 = j + n7;
                    final int n54 = j + n8;
                    final int n55 = j + n9;
                    final float n56 = this.field32826[n52];
                    final float n57 = n6 * this.field32826[n52 + 1];
                    final float n58 = this.field32826[n53];
                    final float n59 = n6 * this.field32826[n53 + 1];
                    final float n60 = this.field32826[n54];
                    final float n61 = n6 * this.field32826[n54 + 1];
                    final float n62 = this.field32826[n55];
                    final float n63 = n6 * this.field32826[n55 + 1];
                    final int n64 = j + n12;
                    final int n65 = n64 + n10;
                    final int n66 = n65 + n10;
                    final int n67 = n66 + n10;
                    final int n68 = n67 + n10;
                    array2[n64] = n22 + n33 + n35;
                    array2[n64 + 1] = n23 + n29 + n31;
                    array2[n65] = n56 * n49 - n57 * n51;
                    array2[n65 + 1] = n56 * n51 + n57 * n49;
                    array2[n66] = n58 * n44 - n59 * n46;
                    array2[n66 + 1] = n58 * n46 + n59 * n44;
                    array2[n67] = n60 * n45 - n61 * n47;
                    array2[n67 + 1] = n60 * n47 + n61 * n45;
                    array2[n68] = n62 * n48 - n63 * n50;
                    array2[n68 + 1] = n62 * n50 + n63 * n48;
                }
            }
        }
        else {
            for (int k = 1; k <= n2; ++k) {
                final int n69 = n3 + (5 * k - 4) * n + 1;
                final int n70 = n69 + n;
                final int n71 = n69 - n;
                final int n72 = n70 + n;
                final int n73 = n72 + n;
                final float n74 = array[n69 - 1];
                final float n75 = array[n69];
                final float n76 = array[n70 - 1];
                final float n77 = array[n70];
                final float n78 = array[n71 - 1];
                final float n79 = array[n71];
                final float n80 = array[n72 - 1];
                final float n81 = array[n72];
                final float n82 = array[n73 - 1];
                final float n83 = array[n73];
                final float n84 = n75 - n83;
                final float n85 = n75 + n83;
                final float n86 = n77 - n81;
                final float n87 = n77 + n81;
                final float n88 = n74 - n82;
                final float n89 = n74 + n82;
                final float n90 = n76 - n80;
                final float n91 = n76 + n80;
                final float n92 = n78 + 0.309017f * n89 + -0.809017f * n91;
                final float n93 = n79 + 0.309017f * n85 + -0.809017f * n87;
                final float n94 = n78 + -0.809017f * n89 + 0.309017f * n91;
                final float n95 = n79 + -0.809017f * n85 + 0.309017f * n87;
                final float n96 = n6 * (0.95105654f * n88 + 0.58778524f * n90);
                final float n97 = n6 * (0.95105654f * n84 + 0.58778524f * n86);
                final float n98 = n6 * (0.58778524f * n88 - 0.95105654f * n90);
                final float n99 = n6 * (0.58778524f * n84 - 0.95105654f * n86);
                final int n100 = n4 + (k - 1) * n;
                final int n101 = n100 + n10;
                final int n102 = n101 + n10;
                final int n103 = n102 + n10;
                final int n104 = n103 + n10;
                array2[n100] = n78 + n89 + n91;
                array2[n100 + 1] = n79 + n85 + n87;
                array2[n101] = n92 - n97;
                array2[n101 + 1] = n93 + n96;
                array2[n102] = n94 - n99;
                array2[n102 + 1] = n95 + n98;
                array2[n103] = n94 + n99;
                array2[n103 + 1] = n95 - n98;
                array2[n104] = n92 + n97;
                array2[n104 + 1] = n93 - n96;
            }
        }
    }
    
    public void method26001(final long n, final long n2, final Class22 class22, final long n3, final Class22 class23, final long n4, final long n5, final long n6) {
        final long n7 = n5 + n;
        final long n8 = n7 + n;
        final long n9 = n8 + n;
        final long n10 = n2 * n;
        if (n != 2L) {
            for (long n11 = 1L; n11 <= n2; ++n11) {
                final long n12 = n3 + 1L + (n11 * 5L - 4L) * n;
                final long n13 = n4 + (n11 - 1L) * n;
                for (long n14 = 0L; n14 < n - 1L; n14 += 2L) {
                    final long n15 = n14 + n12;
                    final long n16 = n15 + n;
                    final long n17 = n15 - n;
                    final long n18 = n16 + n;
                    final long n19 = n18 + n;
                    final float method135 = class22.method135(n15 - 1L);
                    final float method136 = class22.method135(n15);
                    final float method137 = class22.method135(n16 - 1L);
                    final float method138 = class22.method135(n16);
                    final float method139 = class22.method135(n17 - 1L);
                    final float method140 = class22.method135(n17);
                    final float method141 = class22.method135(n18 - 1L);
                    final float method142 = class22.method135(n18);
                    final float method143 = class22.method135(n19 - 1L);
                    final float method144 = class22.method135(n19);
                    final float n20 = method136 - method144;
                    final float n21 = method136 + method144;
                    final float n22 = method138 - method142;
                    final float n23 = method138 + method142;
                    final float n24 = method135 - method143;
                    final float n25 = method135 + method143;
                    final float n26 = method137 - method141;
                    final float n27 = method137 + method141;
                    final float n28 = method139 + 0.309017f * n25 + -0.809017f * n27;
                    final float n29 = method140 + 0.309017f * n21 + -0.809017f * n23;
                    final float n30 = method139 + -0.809017f * n25 + 0.309017f * n27;
                    final float n31 = method140 + -0.809017f * n21 + 0.309017f * n23;
                    final float n32 = n6 * (0.95105654f * n24 + 0.58778524f * n26);
                    final float n33 = n6 * (0.95105654f * n20 + 0.58778524f * n22);
                    final float n34 = n6 * (0.58778524f * n24 - 0.95105654f * n26);
                    final float n35 = n6 * (0.58778524f * n20 - 0.95105654f * n22);
                    final float n36 = n30 - n35;
                    final float n37 = n30 + n35;
                    final float n38 = n31 + n34;
                    final float n39 = n31 - n34;
                    final float n40 = n28 + n33;
                    final float n41 = n28 - n33;
                    final float n42 = n29 - n32;
                    final float n43 = n29 + n32;
                    final long n44 = n14 + n5;
                    final long n45 = n14 + n7;
                    final long n46 = n14 + n8;
                    final long n47 = n14 + n9;
                    final float method145 = this.field32827.method135(n44);
                    final float n48 = n6 * this.field32827.method135(n44 + 1L);
                    final float method146 = this.field32827.method135(n45);
                    final float n49 = n6 * this.field32827.method135(n45 + 1L);
                    final float method147 = this.field32827.method135(n46);
                    final float n50 = n6 * this.field32827.method135(n46 + 1L);
                    final float method148 = this.field32827.method135(n47);
                    final float n51 = n6 * this.field32827.method135(n47 + 1L);
                    final long n52 = n14 + n13;
                    final long n53 = n52 + n10;
                    final long n54 = n53 + n10;
                    final long n55 = n54 + n10;
                    final long n56 = n55 + n10;
                    class23.method169(n52, method139 + n25 + n27);
                    class23.method169(n52 + 1L, method140 + n21 + n23);
                    class23.method169(n53, method145 * n41 - n48 * n43);
                    class23.method169(n53 + 1L, method145 * n43 + n48 * n41);
                    class23.method169(n54, method146 * n36 - n49 * n38);
                    class23.method169(n54 + 1L, method146 * n38 + n49 * n36);
                    class23.method169(n55, method147 * n37 - n50 * n39);
                    class23.method169(n55 + 1L, method147 * n39 + n50 * n37);
                    class23.method169(n56, method148 * n40 - n51 * n42);
                    class23.method169(n56 + 1L, method148 * n42 + n51 * n40);
                }
            }
        }
        else {
            for (long n57 = 1L; n57 <= n2; ++n57) {
                final long n58 = n3 + (5L * n57 - 4L) * n + 1L;
                final long n59 = n58 + n;
                final long n60 = n58 - n;
                final long n61 = n59 + n;
                final long n62 = n61 + n;
                final float method149 = class22.method135(n58 - 1L);
                final float method150 = class22.method135(n58);
                final float method151 = class22.method135(n59 - 1L);
                final float method152 = class22.method135(n59);
                final float method153 = class22.method135(n60 - 1L);
                final float method154 = class22.method135(n60);
                final float method155 = class22.method135(n61 - 1L);
                final float method156 = class22.method135(n61);
                final float method157 = class22.method135(n62 - 1L);
                final float method158 = class22.method135(n62);
                final float n63 = method150 - method158;
                final float n64 = method150 + method158;
                final float n65 = method152 - method156;
                final float n66 = method152 + method156;
                final float n67 = method149 - method157;
                final float n68 = method149 + method157;
                final float n69 = method151 - method155;
                final float n70 = method151 + method155;
                final float n71 = method153 + 0.309017f * n68 + -0.809017f * n70;
                final float n72 = method154 + 0.309017f * n64 + -0.809017f * n66;
                final float n73 = method153 + -0.809017f * n68 + 0.309017f * n70;
                final float n74 = method154 + -0.809017f * n64 + 0.309017f * n66;
                final float n75 = n6 * (0.95105654f * n67 + 0.58778524f * n69);
                final float n76 = n6 * (0.95105654f * n63 + 0.58778524f * n65);
                final float n77 = n6 * (0.58778524f * n67 - 0.95105654f * n69);
                final float n78 = n6 * (0.58778524f * n63 - 0.95105654f * n65);
                final long n79 = n4 + (n57 - 1L) * n;
                final long n80 = n79 + n10;
                final long n81 = n80 + n10;
                final long n82 = n81 + n10;
                final long n83 = n82 + n10;
                class23.method169(n79, method153 + n68 + n70);
                class23.method169(n79 + 1L, method154 + n64 + n66);
                class23.method169(n80, n71 - n76);
                class23.method169(n80 + 1L, n72 + n75);
                class23.method169(n81, n73 - n78);
                class23.method169(n81 + 1L, n74 + n77);
                class23.method169(n82, n73 + n78);
                class23.method169(n82 + 1L, n74 - n77);
                class23.method169(n83, n71 + n76);
                class23.method169(n83 + 1L, n72 - n75);
            }
        }
    }
    
    public void method26002(final int[] array, final int n, final int n2, final int n3, final int n4, final float[] array2, final int n5, final float[] array3, final int n6, final int n7, final int n8) {
        final int n9 = n / 2;
        final int n10 = (n2 + 1) / 2;
        final int n11 = n2 * n;
        if (n < n3) {
            for (int i = 1; i < n10; ++i) {
                final int n12 = n2 - i;
                final int n13 = i * n3 * n;
                final int n14 = n12 * n3 * n;
                final int n15 = i * n;
                final int n16 = n12 * n;
                for (int j = 0; j < n; ++j) {
                    for (int k = 0; k < n3; ++k) {
                        final int n17 = k * n;
                        final int n18 = n17 * n2;
                        final int n19 = n6 + j;
                        final int n20 = n5 + j;
                        final float n21 = array2[n20 + n15 + n18];
                        final float n22 = array2[n20 + n16 + n18];
                        array3[n19 + n17 + n13] = n21 + n22;
                        array3[n19 + n17 + n14] = n21 - n22;
                    }
                }
            }
            for (int l = 0; l < n; ++l) {
                for (int n23 = 0; n23 < n3; ++n23) {
                    final int n24 = n23 * n;
                    array3[n6 + l + n24] = array2[n5 + l + n24 * n2];
                }
            }
        }
        else {
            for (int n25 = 1; n25 < n10; ++n25) {
                final int n26 = n2 - n25;
                final int n27 = n25 * n;
                final int n28 = n26 * n;
                for (int n29 = 0; n29 < n3; ++n29) {
                    final int n30 = n29 * n;
                    final int n31 = n30 + n27 * n3;
                    final int n32 = n30 + n28 * n3;
                    final int n33 = n30 * n2;
                    for (int n34 = 0; n34 < n; ++n34) {
                        final int n35 = n6 + n34;
                        final float n36 = array2[n5 + n34 + n27 + n33];
                        final float n37 = array2[n5 + n34 + n28 + n33];
                        array3[n35 + n31] = n36 + n37;
                        array3[n35 + n32] = n36 - n37;
                    }
                }
            }
            for (int n38 = 0; n38 < n3; ++n38) {
                final int n39 = n38 * n;
                final int n40 = n39 * n2;
                for (int n41 = 0; n41 < n; ++n41) {
                    array3[n6 + n41 + n39] = array2[n5 + n41 + n40];
                }
            }
        }
        int n42 = 2 - n;
        int n43 = 0;
        final int n44 = (n2 - 1) * n4;
        for (int n45 = 1; n45 < n10; ++n45) {
            final int n46 = n2 - n45;
            n42 += n;
            final int n47 = n45 * n4;
            final int n48 = n46 * n4;
            final int n49 = n42 + n7;
            final float n50 = this.field32826[n49 - 2];
            final float n51 = n8 * this.field32826[n49 - 1];
            for (int n52 = 0; n52 < n4; ++n52) {
                final int n53 = n5 + n52;
                final int n54 = n6 + n52;
                array2[n53 + n47] = array3[n54] + n50 * array3[n54 + n4];
                array2[n53 + n48] = n51 * array3[n54 + n44];
            }
            int n55 = n42;
            n43 += n;
            for (int n56 = 2; n56 < n10; ++n56) {
                final int n57 = n2 - n56;
                n55 += n43;
                if (n55 > n11) {
                    n55 -= n11;
                }
                final int n58 = n55 + n7;
                final float n59 = this.field32826[n58 - 2];
                final float n60 = n8 * this.field32826[n58 - 1];
                final int n61 = n56 * n4;
                final int n62 = n57 * n4;
                for (int n63 = 0; n63 < n4; ++n63) {
                    final int n64 = n5 + n63;
                    final int n65 = n6 + n63;
                    final int n66 = n64 + n47;
                    array2[n66] += n59 * array3[n65 + n61];
                    final int n67 = n64 + n48;
                    array2[n67] += n60 * array3[n65 + n62];
                }
            }
        }
        for (int n68 = 1; n68 < n10; ++n68) {
            final int n69 = n68 * n4;
            for (int n70 = 0; n70 < n4; ++n70) {
                final int n71;
                array3[n71] += array3[(n71 = n6 + n70) + n69];
            }
        }
        for (int n72 = 1; n72 < n10; ++n72) {
            final int n73 = n2 - n72;
            final int n74 = n72 * n4;
            final int n75 = n73 * n4;
            for (int n76 = 1; n76 < n4; n76 += 2) {
                final int n77 = n6 + n76;
                final int n78 = n5 + n76;
                final int n79 = n78 + n74;
                final int n80 = n78 + n75;
                final float n81 = array2[n79 - 1];
                final float n82 = array2[n79];
                final float n83 = array2[n80 - 1];
                final float n84 = array2[n80];
                final int n85 = n77 + n74;
                final int n86 = n77 + n75;
                array3[n85 - 1] = n81 - n84;
                array3[n86 - 1] = n81 + n84;
                array3[n85] = n82 + n83;
                array3[n86] = n82 - n83;
            }
        }
        array[0] = 1;
        if (n != 2) {
            array[0] = 0;
            System.arraycopy(array3, n6, array2, n5, n4);
            final int n87 = n3 * n;
            for (int n88 = 1; n88 < n2; ++n88) {
                final int n89 = n88 * n87;
                for (int n90 = 0; n90 < n3; ++n90) {
                    final int n91 = n90 * n;
                    final int n92 = n6 + n91 + n89;
                    final int n93 = n5 + n91 + n89;
                    array2[n93] = array3[n92];
                    array2[n93 + 1] = array3[n92 + 1];
                }
            }
            if (n9 > n3) {
                int n94 = 2 - n;
                for (int n95 = 1; n95 < n2; ++n95) {
                    n94 += n;
                    final int n96 = n95 * n3 * n;
                    for (int n97 = 0; n97 < n3; ++n97) {
                        int n98 = n94;
                        final int n99 = n97 * n + n96;
                        for (int n100 = 3; n100 < n; n100 += 2) {
                            n98 += 2;
                            final int n101 = n98 - 1 + n7;
                            final float n102 = this.field32826[n101 - 1];
                            final float n103 = n8 * this.field32826[n101];
                            final int n104 = n5 + n100 + n99;
                            final int n105 = n6 + n100 + n99;
                            final float n106 = array3[n105 - 1];
                            final float n107 = array3[n105];
                            array2[n104 - 1] = n102 * n106 - n103 * n107;
                            array2[n104] = n102 * n107 + n103 * n106;
                        }
                    }
                }
            }
            else {
                int n108 = 0;
                for (int n109 = 1; n109 < n2; ++n109) {
                    n108 += 2;
                    final int n110 = n109 * n3 * n;
                    for (int n111 = 3; n111 < n; n111 += 2) {
                        n108 += 2;
                        final int n112 = n108 + n7 - 1;
                        final float n113 = this.field32826[n112 - 1];
                        final float n114 = n8 * this.field32826[n112];
                        final int n115 = n5 + n111;
                        final int n116 = n6 + n111;
                        for (int n117 = 0; n117 < n3; ++n117) {
                            final int n118 = n117 * n + n110;
                            final int n119 = n115 + n118;
                            final int n120 = n116 + n118;
                            final float n121 = array3[n120 - 1];
                            final float n122 = array3[n120];
                            array2[n119 - 1] = n113 * n121 - n114 * n122;
                            array2[n119] = n113 * n122 + n114 * n121;
                        }
                    }
                }
            }
        }
    }
    
    public void method26003(final int[] array, final long n, final long n2, final long n3, final long n4, final Class22 class22, final long n5, final Class22 class23, final long n6, final long n7, final long n8) {
        final long n9 = n / 2L;
        final long n10 = (n2 + 1L) / 2L;
        final long n11 = n2 * n;
        if (n < n3) {
            for (long n12 = 1L; n12 < n10; ++n12) {
                final long n13 = n2 - n12;
                final long n14 = n12 * n3 * n;
                final long n15 = n13 * n3 * n;
                final long n16 = n12 * n;
                final long n17 = n13 * n;
                for (long n18 = 0L; n18 < n; ++n18) {
                    for (long n19 = 0L; n19 < n3; ++n19) {
                        final long n20 = n19 * n;
                        final long n21 = n20 * n2;
                        final long n22 = n6 + n18;
                        final long n23 = n5 + n18;
                        final float method135 = class22.method135(n23 + n16 + n21);
                        final float method136 = class22.method135(n23 + n17 + n21);
                        class23.method169(n22 + n20 + n14, method135 + method136);
                        class23.method169(n22 + n20 + n15, method135 - method136);
                    }
                }
            }
            for (long n24 = 0L; n24 < n; ++n24) {
                for (long n25 = 0L; n25 < n3; ++n25) {
                    final long n26 = n25 * n;
                    class23.method169(n6 + n24 + n26, class22.method135(n5 + n24 + n26 * n2));
                }
            }
        }
        else {
            for (long n27 = 1L; n27 < n10; ++n27) {
                final long n28 = n2 - n27;
                final long n29 = n27 * n;
                final long n30 = n28 * n;
                for (long n31 = 0L; n31 < n3; ++n31) {
                    final long n32 = n31 * n;
                    final long n33 = n32 + n29 * n3;
                    final long n34 = n32 + n30 * n3;
                    final long n35 = n32 * n2;
                    for (long n36 = 0L; n36 < n; ++n36) {
                        final long n37 = n6 + n36;
                        final float method137 = class22.method135(n5 + n36 + n29 + n35);
                        final float method138 = class22.method135(n5 + n36 + n30 + n35);
                        class23.method169(n37 + n33, method137 + method138);
                        class23.method169(n37 + n34, method137 - method138);
                    }
                }
            }
            for (long n38 = 0L; n38 < n3; ++n38) {
                final long n39 = n38 * n;
                final long n40 = n39 * n2;
                for (long n41 = 0L; n41 < n; ++n41) {
                    class23.method169(n6 + n41 + n39, class22.method135(n5 + n41 + n40));
                }
            }
        }
        long n42 = 2L - n;
        long n43 = 0L;
        final long n44 = (n2 - 1L) * n4;
        for (long n45 = 1L; n45 < n10; ++n45) {
            final long n46 = n2 - n45;
            n42 += n;
            final long n47 = n45 * n4;
            final long n48 = n46 * n4;
            final long n49 = n42 + n7;
            final float method139 = this.field32827.method135(n49 - 2L);
            final float n50 = n8 * this.field32827.method135(n49 - 1L);
            for (long n51 = 0L; n51 < n4; ++n51) {
                final long n52 = n5 + n51;
                final long n53 = n6 + n51;
                class22.method169(n52 + n47, class23.method135(n53) + method139 * class23.method135(n53 + n4));
                class22.method169(n52 + n48, n50 * class23.method135(n53 + n44));
            }
            long n54 = n42;
            n43 += n;
            for (long n55 = 2L; n55 < n10; ++n55) {
                final long n56 = n2 - n55;
                n54 += n43;
                if (n54 > n11) {
                    n54 -= n11;
                }
                final long n57 = n54 + n7;
                final float method140 = this.field32827.method135(n57 - 2L);
                final float n58 = n8 * this.field32827.method135(n57 - 1L);
                final long n59 = n55 * n4;
                final long n60 = n56 * n4;
                for (long n61 = 0L; n61 < n4; ++n61) {
                    final long n62 = n5 + n61;
                    final long n63 = n6 + n61;
                    class22.method169(n62 + n47, class22.method135(n62 + n47) + method140 * class23.method135(n63 + n59));
                    class22.method169(n62 + n48, class22.method135(n62 + n48) + n58 * class23.method135(n63 + n60));
                }
            }
        }
        for (long n64 = 1L; n64 < n10; ++n64) {
            final long n65 = n64 * n4;
            for (long n66 = 0L; n66 < n4; ++n66) {
                final long n67 = n6 + n66;
                class23.method169(n67, class23.method135(n67) + class23.method135(n67 + n65));
            }
        }
        for (long n68 = 1L; n68 < n10; ++n68) {
            final long n69 = n2 - n68;
            final long n70 = n68 * n4;
            final long n71 = n69 * n4;
            for (long n72 = 1L; n72 < n4; n72 += 2L) {
                final long n73 = n6 + n72;
                final long n74 = n5 + n72;
                final long n75 = n74 + n70;
                final long n76 = n74 + n71;
                final float method141 = class22.method135(n75 - 1L);
                final float method142 = class22.method135(n75);
                final float method143 = class22.method135(n76 - 1L);
                final float method144 = class22.method135(n76);
                final long n77 = n73 + n70;
                final long n78 = n73 + n71;
                class23.method169(n77 - 1L, method141 - method144);
                class23.method169(n78 - 1L, method141 + method144);
                class23.method169(n77, method142 + method143);
                class23.method169(n78, method142 - method143);
            }
        }
        array[0] = 1;
        if (n != 2L) {
            array[0] = 0;
            Class8601.method29152(class23, n6, class22, n5, n4);
            final long n79 = n3 * n;
            for (long n80 = 1L; n80 < n2; ++n80) {
                final long n81 = n80 * n79;
                for (long n82 = 0L; n82 < n3; ++n82) {
                    final long n83 = n82 * n;
                    final long n84 = n6 + n83 + n81;
                    final long n85 = n5 + n83 + n81;
                    class22.method169(n85, class23.method135(n84));
                    class22.method169(n85 + 1L, class23.method135(n84 + 1L));
                }
            }
            if (n9 > n3) {
                long n86 = 2L - n;
                for (long n87 = 1L; n87 < n2; ++n87) {
                    n86 += n;
                    final long n88 = n87 * n3 * n;
                    for (long n89 = 0L; n89 < n3; ++n89) {
                        long n90 = n86;
                        final long n91 = n89 * n + n88;
                        for (long n92 = 3L; n92 < n; n92 += 2L) {
                            n90 += 2L;
                            final long n93 = n90 - 1L + n7;
                            final float method145 = this.field32827.method135(n93 - 1L);
                            final float n94 = n8 * this.field32827.method135(n93);
                            final long n95 = n5 + n92 + n91;
                            final long n96 = n6 + n92 + n91;
                            final float method146 = class23.method135(n96 - 1L);
                            final float method147 = class23.method135(n96);
                            class22.method169(n95 - 1L, method145 * method146 - n94 * method147);
                            class22.method169(n95, method145 * method147 + n94 * method146);
                        }
                    }
                }
            }
            else {
                long n97 = 0L;
                for (long n98 = 1L; n98 < n2; ++n98) {
                    n97 += 2L;
                    final long n99 = n98 * n3 * n;
                    for (long n100 = 3L; n100 < n; n100 += 2L) {
                        n97 += 2L;
                        final long n101 = n97 + n7 - 1L;
                        final float method148 = this.field32827.method135(n101 - 1L);
                        final float n102 = n8 * this.field32827.method135(n101);
                        final long n103 = n5 + n100;
                        final long n104 = n6 + n100;
                        for (long n105 = 0L; n105 < n3; ++n105) {
                            final long n106 = n105 * n + n99;
                            final long n107 = n103 + n106;
                            final long n108 = n104 + n106;
                            final float method149 = class23.method135(n108 - 1L);
                            final float method150 = class23.method135(n108);
                            class22.method169(n107 - 1L, method148 * method149 - n102 * method150);
                            class22.method169(n107, method148 * method150 + n102 * method149);
                        }
                    }
                }
            }
        }
    }
    
    static {
        field32836 = new int[] { 4, 2, 3, 5 };
    }
}
