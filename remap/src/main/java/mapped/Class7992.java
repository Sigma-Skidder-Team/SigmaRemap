// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Future;

public final class Class7992
{
    private final int field32901;
    private final long field32902;
    private int field32903;
    private long field32904;
    private int[] field32905;
    private Class15 field32906;
    private double[] field32907;
    private Class17 field32908;
    private int field32909;
    private long field32910;
    private int field32911;
    private long field32912;
    private double[] field32913;
    private Class17 field32914;
    private double[] field32915;
    private Class17 field32916;
    private double[] field32917;
    private Class17 field32918;
    private double[] field32919;
    private Class17 field32920;
    private final Class262 field32921;
    private final boolean field32922;
    private static final int[] field32923;
    private static final double field32924 = 3.141592653589793;
    private static final double field32925 = 6.283185307179586;
    
    public Class7992(final long field32902) {
        if (field32902 >= 1L) {
            this.field32922 = (Class9133.method33168() || 2L * field32902 > Class11.method177());
            this.field32901 = (int)field32902;
            this.field32902 = field32902;
            if (this.field32922) {
                if (Class9133.method33175(this.field32902)) {
                    this.field32921 = Class262.field1252;
                    this.field32906 = new Class15(2L + (long)Class7640.method24124((double)(2L + (1L << (int)((long)(Class7640.method24089(this.field32902 + 0.5) / Class7640.method24089(2.0)) / 2L)))));
                    this.field32908 = new Class17(this.field32902);
                    Class9133.method33180(this.field32910 = 2L * this.field32902 >> 2, this.field32906, this.field32908);
                    Class9133.method33182(this.field32912 = this.field32902 >> 2, this.field32908, this.field32910, this.field32906);
                }
                else if (Class9133.method33176(this.field32902, Class7992.field32923) < 211L) {
                    this.field32921 = Class262.field1253;
                    this.field32914 = new Class17(4L * this.field32902 + 15L);
                    this.field32916 = new Class17(2L * this.field32902 + 15L);
                    this.method26100();
                    this.method26102();
                }
                else {
                    this.field32921 = Class262.field1254;
                    this.field32904 = Class9133.method33171(this.field32902 * 2L - 1L);
                    this.field32918 = new Class17(2L * this.field32904);
                    this.field32920 = new Class17(2L * this.field32904);
                    this.field32906 = new Class15(2L + (long)Class7640.method24124((double)(2L + (1L << (int)((long)(Class7640.method24089(this.field32904 + 0.5) / Class7640.method24089(2.0)) / 2L)))));
                    this.field32908 = new Class17(this.field32904);
                    Class9133.method33180(this.field32910 = 2L * this.field32904 >> 2, this.field32906, this.field32908);
                    Class9133.method33182(this.field32912 = this.field32904 >> 2, this.field32908, this.field32910, this.field32906);
                    this.method26104();
                }
            }
            else if (Class9133.method33175(field32902)) {
                this.field32921 = Class262.field1252;
                this.field32905 = new int[2 + (int)Class7640.method24124(2 + (1 << (int)(Class7640.method24089(field32902 + 0.5) / Class7640.method24089(2.0)) / 2))];
                this.field32907 = new double[this.field32901];
                Class9133.method33179(this.field32909 = 2 * this.field32901 >> 2, this.field32905, this.field32907);
                Class9133.method33181(this.field32911 = this.field32901 >> 2, this.field32907, this.field32909, this.field32905);
            }
            else if (Class9133.method33176(field32902, Class7992.field32923) < 211L) {
                this.field32921 = Class262.field1253;
                this.field32913 = new double[4 * this.field32901 + 15];
                this.field32915 = new double[2 * this.field32901 + 15];
                this.method26099();
                this.method26101();
            }
            else {
                this.field32921 = Class262.field1254;
                this.field32903 = Class9133.method33170(this.field32901 * 2 - 1);
                this.field32917 = new double[2 * this.field32903];
                this.field32919 = new double[2 * this.field32903];
                this.field32905 = new int[2 + (int)Class7640.method24124(2 + (1 << (int)(Class7640.method24089(this.field32903 + 0.5) / Class7640.method24089(2.0)) / 2))];
                this.field32907 = new double[this.field32903];
                Class9133.method33179(this.field32909 = 2 * this.field32903 >> 2, this.field32905, this.field32907);
                Class9133.method33181(this.field32911 = this.field32903 >> 2, this.field32907, this.field32909, this.field32905);
                this.method26103();
            }
            return;
        }
        throw new IllegalArgumentException("n must be greater than 0");
    }
    
    public void method26072(final double[] array) {
        this.method26074(array, 0);
    }
    
    public void method26073(final Class17 class17) {
        this.method26075(class17, 0L);
    }
    
    public void method26074(final double[] array, final int n) {
        if (this.field32922) {
            this.method26075(new Class17(array), n);
        }
        else {
            if (this.field32901 == 1) {
                return;
            }
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    Class9133.method33189(2 * this.field32901, array, n, this.field32905, this.field32909, this.field32907);
                    break;
                }
                case 2: {
                    this.method26139(array, n, -1);
                    break;
                }
                case 3: {
                    this.method26105(array, n, -1);
                    break;
                }
            }
        }
    }
    
    public void method26075(final Class17 class17, final long n) {
        if (!this.field32922) {
            if (class17.method173() || class17.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method26074(class17.method206(), (int)n);
        }
        else {
            if (this.field32902 == 1L) {
                return;
            }
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    Class9133.method33190(2L * this.field32902, class17, n, this.field32906, this.field32910, this.field32908);
                    break;
                }
                case 2: {
                    this.method26140(class17, n, -1);
                    break;
                }
                case 3: {
                    this.method26106(class17, n, -1);
                    break;
                }
            }
        }
    }
    
    public void method26076(final double[] array, final boolean b) {
        this.method26078(array, 0, b);
    }
    
    public void method26077(final Class17 class17, final boolean b) {
        this.method26079(class17, 0L, b);
    }
    
    public void method26078(final double[] array, final int n, final boolean b) {
        if (this.field32922) {
            this.method26079(new Class17(array), n, b);
        }
        else {
            if (this.field32901 == 1) {
                return;
            }
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    Class9133.method33187(2 * this.field32901, array, n, this.field32905, this.field32909, this.field32907);
                    break;
                }
                case 2: {
                    this.method26139(array, n, 1);
                    break;
                }
                case 3: {
                    this.method26105(array, n, 1);
                    break;
                }
            }
            if (b) {
                Class9133.method33303(this.field32901, 1.0 / this.field32901, array, n, true);
            }
        }
    }
    
    public void method26079(final Class17 class17, final long n, final boolean b) {
        if (!this.field32922) {
            if (class17.method173() || class17.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method26078(class17.method206(), (int)n, b);
        }
        else {
            if (this.field32902 == 1L) {
                return;
            }
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    Class9133.method33188(2L * this.field32902, class17, n, this.field32906, this.field32910, this.field32908);
                    break;
                }
                case 2: {
                    this.method26140(class17, n, 1);
                    break;
                }
                case 3: {
                    this.method26106(class17, n, 1);
                    break;
                }
            }
            if (b) {
                Class9133.method33304(this.field32902, 1.0 / this.field32902, class17, n, true);
            }
        }
    }
    
    public void method26080(final double[] array) {
        this.method26082(array, 0);
    }
    
    public void method26081(final Class17 class17) {
        this.method26083(class17, 0L);
    }
    
    public void method26082(final double[] array, final int n) {
        if (this.field32922) {
            this.method26083(new Class17(array), n);
        }
        else {
            if (this.field32901 == 1) {
                return;
            }
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    if (this.field32901 > 4) {
                        Class9133.method33187(this.field32901, array, n, this.field32905, this.field32909, this.field32907);
                        Class9133.method33239(this.field32901, array, n, this.field32911, this.field32907, this.field32909);
                    }
                    else if (this.field32901 == 4) {
                        Class9133.method33233(array, n);
                    }
                    final double n2 = array[n] - array[n + 1];
                    array[n] += array[n + 1];
                    array[n + 1] = n2;
                    break;
                }
                case 2: {
                    this.method26115(array, n);
                    for (int i = this.field32901 - 1; i >= 2; --i) {
                        final int n3 = n + i;
                        final double n4 = array[n3];
                        array[n3] = array[n3 - 1];
                        array[n3 - 1] = n4;
                    }
                    break;
                }
                case 3: {
                    this.method26109(array, n);
                    break;
                }
            }
        }
    }
    
    public void method26083(final Class17 class17, final long n) {
        if (!this.field32922) {
            if (class17.method173() || class17.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method26082(class17.method206(), (int)n);
        }
        else {
            if (this.field32902 == 1L) {
                return;
            }
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    if (this.field32902 > 4L) {
                        Class9133.method33188(this.field32902, class17, n, this.field32906, this.field32910, this.field32908);
                        Class9133.method33240(this.field32902, class17, n, this.field32912, this.field32908, this.field32910);
                    }
                    else if (this.field32902 == 4L) {
                        Class9133.method33234(class17, n);
                    }
                    final double n2 = class17.method137(n) - class17.method137(n + 1L);
                    class17.method171(n, class17.method137(n) + class17.method137(n + 1L));
                    class17.method171(n + 1L, n2);
                    break;
                }
                case 2: {
                    this.method26116(class17, n);
                    for (long n3 = this.field32902 - 1L; n3 >= 2L; --n3) {
                        final long n4 = n + n3;
                        final double method137 = class17.method137(n4);
                        class17.method171(n4, class17.method137(n4 - 1L));
                        class17.method171(n4 - 1L, method137);
                    }
                    break;
                }
                case 3: {
                    this.method26110(class17, n);
                    break;
                }
            }
        }
    }
    
    public void method26084(final double[] array) {
        this.method26086(array, 0);
    }
    
    public void method26085(final Class17 class17) {
        this.method26087(class17, 0L);
    }
    
    public void method26086(final double[] array, final int n) {
        if (this.field32922) {
            this.method26087(new Class17(array), n);
        }
        else {
            final int n2 = 2 * this.field32901;
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    this.method26082(array, n);
                    final int method27224 = Class8216.method27224();
                    if (method27224 > 1 && this.field32901 / 2 > Class9133.method33158()) {
                        final Future[] array2 = new Future[method27224];
                        final int n3 = this.field32901 / 2 / method27224;
                        for (int i = 0; i < method27224; ++i) {
                            final int n4 = i * n3;
                            array2[i] = Class8216.method27227(new Class1567(this, n4, (i == method27224 - 1) ? (this.field32901 / 2) : (n4 + n3), n, n2, array));
                        }
                        try {
                            Class8216.method27228(array2);
                        }
                        catch (final InterruptedException thrown) {
                            Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
                        }
                        catch (final ExecutionException thrown2) {
                            Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
                        }
                    }
                    else {
                        for (int j = 0; j < this.field32901 / 2; ++j) {
                            final int n5 = 2 * j;
                            final int n6 = n + (n2 - n5) % n2;
                            array[n6] = array[n + n5];
                            array[n6 + 1] = -array[n + n5 + 1];
                        }
                    }
                    array[n + this.field32901] = -array[n + 1];
                    array[n + 1] = 0.0;
                    break;
                }
                case 2: {
                    this.method26115(array, n);
                    int n7;
                    if (this.field32901 % 2 == 0) {
                        n7 = this.field32901 / 2;
                    }
                    else {
                        n7 = (this.field32901 + 1) / 2;
                    }
                    for (int k = 1; k < n7; ++k) {
                        final int n8 = n + n2 - 2 * k;
                        final int n9 = n + 2 * k;
                        array[n8 + 1] = -array[n9];
                        array[n8] = array[n9 - 1];
                    }
                    for (int l = 1; l < this.field32901; ++l) {
                        final int n10 = n + this.field32901 - l;
                        final double n11 = array[n10 + 1];
                        array[n10 + 1] = array[n10];
                        array[n10] = n11;
                    }
                    array[n + 1] = 0.0;
                    break;
                }
                case 3: {
                    this.method26107(array, n, -1);
                    break;
                }
            }
        }
    }
    
    public void method26087(final Class17 class17, final long n) {
        if (!this.field32922) {
            if (class17.method173() || class17.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method26086(class17.method206(), (int)n);
        }
        else {
            final long n2 = 2L * this.field32902;
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    this.method26083(class17, n);
                    final int method27224 = Class8216.method27224();
                    if (method27224 > 1 && this.field32902 / 2L > Class9133.method33158()) {
                        final Future[] array = new Future[method27224];
                        final long n3 = this.field32902 / 2L / method27224;
                        for (int i = 0; i < method27224; ++i) {
                            final long n4 = i * n3;
                            array[i] = Class8216.method27227(new Class1003(this, n4, (i == method27224 - 1) ? (this.field32902 / 2L) : (n4 + n3), n, n2, class17));
                        }
                        try {
                            Class8216.method27228(array);
                        }
                        catch (final InterruptedException thrown) {
                            Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
                        }
                        catch (final ExecutionException thrown2) {
                            Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
                        }
                    }
                    else {
                        for (long n5 = 0L; n5 < this.field32902 / 2L; ++n5) {
                            final long n6 = 2L * n5;
                            final long n7 = n + (n2 - n6) % n2;
                            class17.method171(n7, class17.method137(n + n6));
                            class17.method171(n7 + 1L, -class17.method137(n + n6 + 1L));
                        }
                    }
                    class17.method171(n + this.field32902, -class17.method137(n + 1L));
                    class17.method171(n + 1L, 0.0);
                    break;
                }
                case 2: {
                    this.method26116(class17, n);
                    long n8;
                    if (this.field32902 % 2L == 0L) {
                        n8 = this.field32902 / 2L;
                    }
                    else {
                        n8 = (this.field32902 + 1L) / 2L;
                    }
                    for (long n9 = 1L; n9 < n8; ++n9) {
                        final long n10 = n + n2 - 2L * n9;
                        final long n11 = n + 2L * n9;
                        class17.method171(n10 + 1L, -class17.method137(n11));
                        class17.method171(n10, class17.method137(n11 - 1L));
                    }
                    for (long n12 = 1L; n12 < this.field32902; ++n12) {
                        final long n13 = n + this.field32902 - n12;
                        final double method27225 = class17.method137(n13 + 1L);
                        class17.method171(n13 + 1L, class17.method137(n13));
                        class17.method171(n13, method27225);
                    }
                    class17.method171(n + 1L, 0.0);
                    break;
                }
                case 3: {
                    this.method26108(class17, n, -1L);
                    break;
                }
            }
        }
    }
    
    public void method26088(final double[] array, final boolean b) {
        this.method26090(array, 0, b);
    }
    
    public void method26089(final Class17 class17, final boolean b) {
        this.method26091(class17, 0L, b);
    }
    
    public void method26090(final double[] array, final int n, final boolean b) {
        if (this.field32922) {
            this.method26091(new Class17(array), n, b);
        }
        else {
            if (this.field32901 == 1) {
                return;
            }
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    array[n + 1] = 0.5 * (array[n] - array[n + 1]);
                    array[n] -= array[n + 1];
                    if (this.field32901 > 4) {
                        Class9133.method33239(this.field32901, array, n, this.field32911, this.field32907, this.field32909);
                        Class9133.method33189(this.field32901, array, n, this.field32905, this.field32909, this.field32907);
                    }
                    else if (this.field32901 == 4) {
                        Class9133.method33237(array, n);
                    }
                    if (b) {
                        Class9133.method33303(this.field32901, 1.0 / (this.field32901 / 2.0), array, n, false);
                        break;
                    }
                    break;
                }
                case 2: {
                    for (int i = 2; i < this.field32901; ++i) {
                        final int n2 = n + i;
                        final double n3 = array[n2 - 1];
                        array[n2 - 1] = array[n2];
                        array[n2] = n3;
                    }
                    this.method26117(array, n);
                    if (b) {
                        Class9133.method33303(this.field32901, 1.0 / this.field32901, array, n, false);
                        break;
                    }
                    break;
                }
                case 3: {
                    this.method26111(array, n);
                    if (b) {
                        Class9133.method33303(this.field32901, 1.0 / this.field32901, array, n, false);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void method26091(final Class17 class17, final long n, final boolean b) {
        if (!this.field32922) {
            if (class17.method173() || class17.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method26090(class17.method206(), (int)n, b);
        }
        else {
            if (this.field32902 == 1L) {
                return;
            }
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    class17.method171(n + 1L, 0.5 * (class17.method137(n) - class17.method137(n + 1L)));
                    class17.method171(n, class17.method137(n) - class17.method137(n + 1L));
                    if (this.field32902 > 4L) {
                        Class9133.method33240(this.field32902, class17, n, this.field32912, this.field32908, this.field32910);
                        Class9133.method33190(this.field32902, class17, n, this.field32906, this.field32910, this.field32908);
                    }
                    else if (this.field32902 == 4L) {
                        Class9133.method33238(class17, n);
                    }
                    if (b) {
                        Class9133.method33304(this.field32902, 1.0 / (this.field32902 / 2.0), class17, n, false);
                        break;
                    }
                    break;
                }
                case 2: {
                    for (long n2 = 2L; n2 < this.field32902; ++n2) {
                        final long n3 = n + n2;
                        final double method137 = class17.method137(n3 - 1L);
                        class17.method171(n3 - 1L, class17.method137(n3));
                        class17.method171(n3, method137);
                    }
                    this.method26118(class17, n);
                    if (b) {
                        Class9133.method33304(this.field32902, 1.0 / this.field32902, class17, n, false);
                        break;
                    }
                    break;
                }
                case 3: {
                    this.method26112(class17, n);
                    if (b) {
                        Class9133.method33304(this.field32902, 1.0 / this.field32902, class17, n, false);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void method26092(final double[] array, final boolean b) {
        this.method26094(array, 0, b);
    }
    
    public void method26093(final Class17 class17, final boolean b) {
        this.method26095(class17, 0L, b);
    }
    
    public void method26094(final double[] array, final int n, final boolean b) {
        if (this.field32922) {
            this.method26095(new Class17(array), n, b);
        }
        else {
            final int n2 = 2 * this.field32901;
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    this.method26096(array, n, b);
                    final int method27224 = Class8216.method27224();
                    if (method27224 > 1 && this.field32901 / 2 > Class9133.method33158()) {
                        final Future[] array2 = new Future[method27224];
                        final int n3 = this.field32901 / 2 / method27224;
                        for (int i = 0; i < method27224; ++i) {
                            final int n4 = i * n3;
                            array2[i] = Class8216.method27227(new Class1015(this, n4, (i == method27224 - 1) ? (this.field32901 / 2) : (n4 + n3), n, n2, array));
                        }
                        try {
                            Class8216.method27228(array2);
                        }
                        catch (final InterruptedException thrown) {
                            Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
                        }
                        catch (final ExecutionException thrown2) {
                            Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
                        }
                    }
                    else {
                        for (int j = 0; j < this.field32901 / 2; ++j) {
                            final int n5 = 2 * j;
                            final int n6 = n + (n2 - n5) % n2;
                            array[n6] = array[n + n5];
                            array[n6 + 1] = -array[n + n5 + 1];
                        }
                    }
                    array[n + this.field32901] = -array[n + 1];
                    array[n + 1] = 0.0;
                    break;
                }
                case 2: {
                    this.method26115(array, n);
                    if (b) {
                        Class9133.method33303(this.field32901, 1.0 / this.field32901, array, n, false);
                    }
                    int n7;
                    if (this.field32901 % 2 == 0) {
                        n7 = this.field32901 / 2;
                    }
                    else {
                        n7 = (this.field32901 + 1) / 2;
                    }
                    for (int k = 1; k < n7; ++k) {
                        final int n8 = n + 2 * k;
                        final int n9 = n + n2 - 2 * k;
                        array[n8] = -array[n8];
                        array[n9 + 1] = -array[n8];
                        array[n9] = array[n8 - 1];
                    }
                    for (int l = 1; l < this.field32901; ++l) {
                        final int n10 = n + this.field32901 - l;
                        final double n11 = array[n10 + 1];
                        array[n10 + 1] = array[n10];
                        array[n10] = n11;
                    }
                    array[n + 1] = 0.0;
                    break;
                }
                case 3: {
                    this.method26107(array, n, 1);
                    if (b) {
                        Class9133.method33303(this.field32901, 1.0 / this.field32901, array, n, true);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void method26095(final Class17 class17, final long n, final boolean b) {
        if (!this.field32922) {
            if (class17.method173() || class17.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method26094(class17.method206(), (int)n, b);
        }
        else {
            final long n2 = 2L * this.field32902;
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    this.method26097(class17, n, b);
                    final int method27224 = Class8216.method27224();
                    if (method27224 > 1 && this.field32902 / 2L > Class9133.method33158()) {
                        final Future[] array = new Future[method27224];
                        final long n3 = this.field32902 / 2L / method27224;
                        for (int i = 0; i < method27224; ++i) {
                            final long n4 = i * n3;
                            array[i] = Class8216.method27227(new Class1257(this, n4, (i == method27224 - 1) ? (this.field32902 / 2L) : (n4 + n3), n, n2, class17));
                        }
                        try {
                            Class8216.method27228(array);
                        }
                        catch (final InterruptedException thrown) {
                            Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
                        }
                        catch (final ExecutionException thrown2) {
                            Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
                        }
                    }
                    else {
                        for (long n5 = 0L; n5 < this.field32902 / 2L; ++n5) {
                            final long n6 = 2L * n5;
                            final long n7 = n + (n2 - n6) % n2;
                            class17.method171(n7, class17.method137(n + n6));
                            class17.method171(n7 + 1L, -class17.method137(n + n6 + 1L));
                        }
                    }
                    class17.method171(n + this.field32902, -class17.method137(n + 1L));
                    class17.method171(n + 1L, 0.0);
                    break;
                }
                case 2: {
                    this.method26116(class17, n);
                    if (b) {
                        Class9133.method33304(this.field32902, 1.0 / this.field32902, class17, n, false);
                    }
                    long n8;
                    if (this.field32902 % 2L == 0L) {
                        n8 = this.field32902 / 2L;
                    }
                    else {
                        n8 = (this.field32902 + 1L) / 2L;
                    }
                    for (long n9 = 1L; n9 < n8; ++n9) {
                        final long n10 = n + 2L * n9;
                        final long n11 = n + n2 - 2L * n9;
                        class17.method171(n10, -class17.method137(n10));
                        class17.method171(n11 + 1L, -class17.method137(n10));
                        class17.method171(n11, class17.method137(n10 - 1L));
                    }
                    for (long n12 = 1L; n12 < this.field32902; ++n12) {
                        final long n13 = n + this.field32902 - n12;
                        final double method27225 = class17.method137(n13 + 1L);
                        class17.method171(n13 + 1L, class17.method137(n13));
                        class17.method171(n13, method27225);
                    }
                    class17.method171(n + 1L, 0.0);
                    break;
                }
                case 3: {
                    this.method26108(class17, n, 1L);
                    if (b) {
                        Class9133.method33304(this.field32902, 1.0 / this.field32902, class17, n, true);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void method26096(final double[] array, final int n, final boolean b) {
        if (this.field32922) {
            this.method26097(new Class17(array), n, b);
        }
        else {
            if (this.field32901 == 1) {
                return;
            }
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    if (this.field32901 > 4) {
                        Class9133.method33187(this.field32901, array, n, this.field32905, this.field32909, this.field32907);
                        Class9133.method33241(this.field32901, array, n, this.field32911, this.field32907, this.field32909);
                    }
                    else if (this.field32901 == 4) {
                        Class9133.method33189(this.field32901, array, n, this.field32905, this.field32909, this.field32907);
                    }
                    final double n2 = array[n] - array[n + 1];
                    array[n] += array[n + 1];
                    array[n + 1] = n2;
                    if (b) {
                        Class9133.method33303(this.field32901, 1.0 / this.field32901, array, n, false);
                        break;
                    }
                    break;
                }
                case 2: {
                    this.method26115(array, n);
                    for (int i = this.field32901 - 1; i >= 2; --i) {
                        final int n3 = n + i;
                        final double n4 = array[n3];
                        array[n3] = array[n3 - 1];
                        array[n3 - 1] = n4;
                    }
                    if (b) {
                        Class9133.method33303(this.field32901, 1.0 / this.field32901, array, n, false);
                    }
                    if (this.field32901 % 2 == 0) {
                        for (int n5 = this.field32901 / 2, j = 1; j < n5; ++j) {
                            final int n6 = n + 2 * j + 1;
                            array[n6] = -array[n6];
                        }
                        break;
                    }
                    for (int n7 = (this.field32901 - 1) / 2, k = 0; k < n7; ++k) {
                        final int n8 = n + 2 * k + 1;
                        array[n8] = -array[n8];
                    }
                    break;
                }
                case 3: {
                    this.method26113(array, n);
                    if (b) {
                        Class9133.method33303(this.field32901, 1.0 / this.field32901, array, n, false);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void method26097(final Class17 class17, final long n, final boolean b) {
        if (!this.field32922) {
            if (class17.method173() || class17.method175() || n >= 2147483647L) {
                throw new IllegalArgumentException("The data array is too big.");
            }
            this.method26096(class17.method206(), (int)n, b);
        }
        else {
            if (this.field32902 == 1L) {
                return;
            }
            switch (Class8096.field33330[this.field32921.ordinal()]) {
                case 1: {
                    if (this.field32902 > 4L) {
                        Class9133.method33188(this.field32902, class17, n, this.field32906, this.field32910, this.field32908);
                        Class9133.method33242(this.field32902, class17, n, this.field32912, this.field32908, this.field32910);
                    }
                    else if (this.field32902 == 4L) {
                        Class9133.method33190(this.field32902, class17, n, this.field32906, this.field32910, this.field32908);
                    }
                    final double n2 = class17.method137(n) - class17.method137(n + 1L);
                    class17.method171(n, class17.method137(n) + class17.method137(n + 1L));
                    class17.method171(n + 1L, n2);
                    if (b) {
                        Class9133.method33304(this.field32902, 1.0 / this.field32902, class17, n, false);
                        break;
                    }
                    break;
                }
                case 2: {
                    this.method26116(class17, n);
                    for (long n3 = this.field32902 - 1L; n3 >= 2L; --n3) {
                        final long n4 = n + n3;
                        final double method137 = class17.method137(n4);
                        class17.method171(n4, class17.method137(n4 - 1L));
                        class17.method171(n4 - 1L, method137);
                    }
                    if (b) {
                        Class9133.method33304(this.field32902, 1.0 / this.field32902, class17, n, false);
                    }
                    if (this.field32902 % 2L == 0L) {
                        for (long n5 = this.field32902 / 2L, n6 = 1L; n6 < n5; ++n6) {
                            final long n7 = n + 2L * n6 + 1L;
                            class17.method171(n7, -class17.method137(n7));
                        }
                        break;
                    }
                    for (long n8 = (this.field32902 - 1L) / 2L, n9 = 0L; n9 < n8; ++n9) {
                        final long n10 = n + 2L * n9 + 1L;
                        class17.method171(n10, -class17.method137(n10));
                    }
                    break;
                }
                case 3: {
                    this.method26114(class17, n);
                    if (b) {
                        Class9133.method33304(this.field32902, 1.0 / this.field32902, class17, n, false);
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public void method26098(final int n, final int n2) {
        if (n != 1) {
            final int n3 = 2 * n;
            final int n4 = 4 * n;
            int n5 = 0;
            int n6 = n;
            int n7 = 0;
            int n8 = 0;
        Label_0206:
            while (true) {
                if (++n8 > 4) {
                    n5 += 2;
                }
                else {
                    n5 = Class7992.field32923[n8 - 1];
                }
                while (true) {
                    final int n9 = n6 / n5;
                    if (n6 - n5 * n9 != 0) {
                        break;
                    }
                    ++n7;
                    this.field32913[n2 + n7 + 1 + n4] = n5;
                    n6 = n9;
                    if (n5 == 2) {
                        if (n7 != 1) {
                            for (int i = 2; i <= n7; ++i) {
                                final int n10 = n7 - i + 2 + n4;
                                this.field32913[n2 + n10 + 1] = this.field32913[n2 + n10];
                            }
                            this.field32913[n2 + 2 + n4] = 2.0;
                        }
                    }
                    if (n6 != 1) {
                        continue;
                    }
                    break Label_0206;
                }
            }
            this.field32913[n2 + n4] = n;
            this.field32913[n2 + 1 + n4] = n7;
            final double n11 = 6.283185307179586 / n;
            int n12 = 1;
            int n13 = 1;
            for (int j = 1; j <= n7; ++j) {
                final int n14 = (int)this.field32913[n2 + j + 1 + n4];
                int n15 = 0;
                final int n16 = n13 * n14;
                final int n17 = n / n16;
                final int n18 = n17 + n17 + 2;
                for (int n19 = n14 - 1, k = 1; k <= n19; ++k) {
                    final int n20 = n12;
                    this.field32913[n2 + n12 - 1 + n3] = 1.0;
                    this.field32913[n2 + n12 + n3] = 0.0;
                    n15 += n13;
                    double n21 = 0.0;
                    final double n22 = n15 * n11;
                    for (int l = 4; l <= n18; l += 2) {
                        n12 += 2;
                        ++n21;
                        final double n23 = n21 * n22;
                        final int n24 = n12 + n3;
                        this.field32913[n2 + n24 - 1] = Class7640.method24103(n23);
                        this.field32913[n2 + n24] = Class7640.method24102(n23);
                    }
                    if (n14 > 5) {
                        final int n25 = n20 + n3;
                        final int n26 = n12 + n3;
                        this.field32913[n2 + n25 - 1] = this.field32913[n2 + n26 - 1];
                        this.field32913[n2 + n25] = this.field32913[n2 + n26];
                    }
                }
                n13 = n16;
            }
        }
    }
    
    public void method26099() {
        if (this.field32901 != 1) {
            final int n = 2 * this.field32901;
            final int n2 = 4 * this.field32901;
            int n3 = 0;
            int field32901 = this.field32901;
            int n4 = 0;
            int n5 = 0;
        Label_0209:
            while (true) {
                if (++n5 > 4) {
                    n3 += 2;
                }
                else {
                    n3 = Class7992.field32923[n5 - 1];
                }
                while (true) {
                    final int n6 = field32901 / n3;
                    if (field32901 - n3 * n6 != 0) {
                        break;
                    }
                    ++n4;
                    this.field32913[n4 + 1 + n2] = n3;
                    field32901 = n6;
                    if (n3 == 2) {
                        if (n4 != 1) {
                            for (int i = 2; i <= n4; ++i) {
                                final int n7 = n4 - i + 2 + n2;
                                this.field32913[n7 + 1] = this.field32913[n7];
                            }
                            this.field32913[2 + n2] = 2.0;
                        }
                    }
                    if (field32901 != 1) {
                        continue;
                    }
                    break Label_0209;
                }
            }
            this.field32913[n2] = this.field32901;
            this.field32913[1 + n2] = n4;
            final double n8 = 6.283185307179586 / this.field32901;
            int n9 = 1;
            int n10 = 1;
            for (int j = 1; j <= n4; ++j) {
                final int n11 = (int)this.field32913[j + 1 + n2];
                int n12 = 0;
                final int n13 = n10 * n11;
                final int n14 = this.field32901 / n13;
                final int n15 = n14 + n14 + 2;
                for (int n16 = n11 - 1, k = 1; k <= n16; ++k) {
                    final int n17 = n9;
                    this.field32913[n9 - 1 + n] = 1.0;
                    this.field32913[n9 + n] = 0.0;
                    n12 += n10;
                    double n18 = 0.0;
                    final double n19 = n12 * n8;
                    for (int l = 4; l <= n15; l += 2) {
                        n9 += 2;
                        ++n18;
                        final double n20 = n18 * n19;
                        final int n21 = n9 + n;
                        this.field32913[n21 - 1] = Class7640.method24103(n20);
                        this.field32913[n21] = Class7640.method24102(n20);
                    }
                    if (n11 > 5) {
                        final int n22 = n17 + n;
                        final int n23 = n9 + n;
                        this.field32913[n22 - 1] = this.field32913[n23 - 1];
                        this.field32913[n22] = this.field32913[n23];
                    }
                }
                n10 = n13;
            }
        }
    }
    
    public void method26100() {
        if (this.field32902 != 1L) {
            final long n = 2L * this.field32902;
            final long n2 = 4L * this.field32902;
            long n3 = 0L;
            long field32902 = this.field32902;
            long n4 = 0L;
            long n5 = 0L;
        Label_0255:
            while (true) {
                ++n5;
                if (n5 > 4L) {
                    n3 += 2L;
                }
                else {
                    n3 = Class7992.field32923[(int)(n5 - 1L)];
                }
                while (true) {
                    final long n6 = field32902 / n3;
                    if (field32902 - n3 * n6 != 0L) {
                        break;
                    }
                    ++n4;
                    this.field32914.method171(n4 + 1L + n2, (double)n3);
                    field32902 = n6;
                    if (n3 == 2L) {
                        if (n4 != 1L) {
                            for (long n7 = 2L; n7 <= n4; ++n7) {
                                final long n8 = n4 - n7 + 2L + n2;
                                this.field32914.method171(n8 + 1L, this.field32914.method137(n8));
                            }
                            this.field32914.method171(2L + n2, 2.0);
                        }
                    }
                    if (field32902 != 1L) {
                        continue;
                    }
                    break Label_0255;
                }
            }
            this.field32914.method171(n2, (double)this.field32902);
            this.field32914.method171(1L + n2, (double)n4);
            final double n9 = 6.283185307179586 / this.field32902;
            long n10 = 1L;
            long n11 = 1L;
            for (long n12 = 1L; n12 <= n4; ++n12) {
                final long n13 = (long)this.field32914.method137(n12 + 1L + n2);
                long n14 = 0L;
                final long n15 = n11 * n13;
                final long n16 = this.field32902 / n15;
                final long n17 = n16 + n16 + 2L;
                for (long n18 = n13 - 1L, n19 = 1L; n19 <= n18; ++n19) {
                    final long n20 = n10;
                    this.field32914.method171(n10 - 1L + n, 1.0);
                    this.field32914.method171(n10 + n, 0.0);
                    n14 += n11;
                    double n21 = 0.0;
                    final double n22 = n14 * n9;
                    for (long n23 = 4L; n23 <= n17; n23 += 2L) {
                        n10 += 2L;
                        ++n21;
                        final double n24 = n21 * n22;
                        final long n25 = n10 + n;
                        this.field32914.method171(n25 - 1L, Class7640.method24103(n24));
                        this.field32914.method171(n25, Class7640.method24102(n24));
                    }
                    if (n13 > 5L) {
                        final long n26 = n20 + n;
                        final long n27 = n10 + n;
                        this.field32914.method171(n26 - 1L, this.field32914.method137(n27 - 1L));
                        this.field32914.method171(n26, this.field32914.method137(n27));
                    }
                }
                n11 = n15;
            }
        }
    }
    
    public void method26101() {
        if (this.field32901 == 1) {
            return;
        }
        final int n = 2 * this.field32901;
        int n2 = 0;
        int field32901 = this.field32901;
        int n3 = 0;
        int n4 = 0;
    Label_0198:
        while (true) {
            if (++n4 > 4) {
                n2 += 2;
            }
            else {
                n2 = Class7992.field32923[n4 - 1];
            }
            while (true) {
                final int n5 = field32901 / n2;
                if (field32901 - n2 * n5 != 0) {
                    break;
                }
                ++n3;
                this.field32915[n3 + 1 + n] = n2;
                field32901 = n5;
                if (n2 == 2) {
                    if (n3 != 1) {
                        for (int i = 2; i <= n3; ++i) {
                            final int n6 = n3 - i + 2 + n;
                            this.field32915[n6 + 1] = this.field32915[n6];
                        }
                        this.field32915[2 + n] = 2.0;
                    }
                }
                if (field32901 != 1) {
                    continue;
                }
                break Label_0198;
            }
        }
        this.field32915[n] = this.field32901;
        this.field32915[1 + n] = n3;
        final double n7 = 6.283185307179586 / this.field32901;
        int n8 = 0;
        final int n9 = n3 - 1;
        int n10 = 1;
        if (n9 != 0) {
            for (int j = 1; j <= n9; ++j) {
                final int n11 = (int)this.field32915[j + 1 + n];
                int n12 = 0;
                final int n13 = n10 * n11;
                final int n14 = this.field32901 / n13;
                for (int n15 = n11 - 1, k = 1; k <= n15; ++k) {
                    n12 += n10;
                    int n16 = n8;
                    final double n17 = n12 * n7;
                    double n18 = 0.0;
                    for (int l = 3; l <= n14; l += 2) {
                        n16 += 2;
                        ++n18;
                        final double n19 = n18 * n17;
                        final int n20 = n16 + this.field32901;
                        this.field32915[n20 - 2] = Class7640.method24103(n19);
                        this.field32915[n20 - 1] = Class7640.method24102(n19);
                    }
                    n8 += n14;
                }
                n10 = n13;
            }
        }
    }
    
    public void method26102() {
        if (this.field32902 == 1L) {
            return;
        }
        final long n = 2L * this.field32902;
        long n2 = 0L;
        long field32902 = this.field32902;
        long n3 = 0L;
        long n4 = 0L;
    Label_0242:
        while (true) {
            ++n4;
            if (n4 > 4L) {
                n2 += 2L;
            }
            else {
                n2 = Class7992.field32923[(int)(n4 - 1L)];
            }
            while (true) {
                final long n5 = field32902 / n2;
                if (field32902 - n2 * n5 != 0L) {
                    break;
                }
                ++n3;
                this.field32916.method171(n3 + 1L + n, (double)n2);
                field32902 = n5;
                if (n2 == 2L) {
                    if (n3 != 1L) {
                        for (long n6 = 2L; n6 <= n3; ++n6) {
                            final long n7 = n3 - n6 + 2L + n;
                            this.field32916.method171(n7 + 1L, this.field32916.method137(n7));
                        }
                        this.field32916.method171(2L + n, 2.0);
                    }
                }
                if (field32902 != 1L) {
                    continue;
                }
                break Label_0242;
            }
        }
        this.field32916.method171(n, (double)this.field32902);
        this.field32916.method171(1L + n, (double)n3);
        final double n8 = 6.283185307179586 / this.field32902;
        long n9 = 0L;
        final long n10 = n3 - 1L;
        long n11 = 1L;
        if (n10 != 0L) {
            for (long n12 = 1L; n12 <= n10; ++n12) {
                final long n13 = (long)this.field32916.method137(n12 + 1L + n);
                long n14 = 0L;
                final long n15 = n11 * n13;
                final long n16 = this.field32902 / n15;
                for (long n17 = n13 - 1L, n18 = 1L; n18 <= n17; ++n18) {
                    n14 += n11;
                    long n19 = n9;
                    final double n20 = n14 * n8;
                    double n21 = 0.0;
                    for (long n22 = 3L; n22 <= n16; n22 += 2L) {
                        n19 += 2L;
                        ++n21;
                        final double n23 = n21 * n20;
                        final long n24 = n19 + this.field32902;
                        this.field32916.method171(n24 - 2L, Class7640.method24103(n23));
                        this.field32916.method171(n24 - 1L, Class7640.method24102(n23));
                    }
                    n9 += n16;
                }
                n11 = n15;
            }
        }
    }
    
    private void method26103() {
        int n = 0;
        final double n2 = 3.141592653589793 / this.field32901;
        this.field32917[0] = 1.0;
        this.field32917[1] = 0.0;
        for (int i = 1; i < this.field32901; ++i) {
            n += 2 * i - 1;
            if (n >= 2 * this.field32901) {
                n -= 2 * this.field32901;
            }
            final double n3 = n2 * n;
            this.field32917[2 * i] = Class7640.method24103(n3);
            this.field32917[2 * i + 1] = Class7640.method24102(n3);
        }
        final double n4 = 1.0 / this.field32903;
        this.field32919[0] = this.field32917[0] * n4;
        this.field32919[1] = this.field32917[1] * n4;
        for (int j = 2; j < 2 * this.field32901; j += 2) {
            this.field32919[j] = this.field32917[j] * n4;
            this.field32919[j + 1] = this.field32917[j + 1] * n4;
            this.field32919[2 * this.field32903 - j] = this.field32919[j];
            this.field32919[2 * this.field32903 - j + 1] = this.field32919[j + 1];
        }
        Class9133.method33189(2 * this.field32903, this.field32919, 0, this.field32905, this.field32909, this.field32907);
    }
    
    private void method26104() {
        long n = 0L;
        final double n2 = 3.141592653589793 / this.field32902;
        this.field32918.method171(0L, 1.0);
        this.field32918.method171(1L, 0.0);
        for (int n3 = 1; n3 < this.field32902; ++n3) {
            n += 2L * n3 - 1;
            if (n >= 2L * this.field32902) {
                n -= 2L * this.field32902;
            }
            final double n4 = n2 * n;
            this.field32918.method171(2L * n3, Class7640.method24103(n4));
            this.field32918.method171(2L * n3 + 1, Class7640.method24102(n4));
        }
        final double n5 = 1.0 / this.field32904;
        this.field32920.method171(0L, this.field32918.method137(0L) * n5);
        this.field32920.method171(1L, this.field32918.method137(1L) * n5);
        for (int n6 = 2; n6 < 2L * this.field32902; n6 += 2) {
            this.field32920.method171(n6, this.field32918.method137(n6) * n5);
            this.field32920.method171(n6 + 1, this.field32918.method137(n6 + 1) * n5);
            this.field32920.method171(2L * this.field32904 - n6, this.field32920.method137(n6));
            this.field32920.method171(2L * this.field32904 - n6 + 1L, this.field32920.method137(n6 + 1));
        }
        Class9133.method33190(2L * this.field32904, this.field32920, 0L, this.field32906, this.field32910, this.field32908);
    }
    
    private void method26105(final double[] array, final int n, final int n2) {
        final double[] array2 = new double[2 * this.field32903];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32901 >= Class9133.method33158()) {
            int n3 = 2;
            if (method27224 >= 4 && this.field32901 >= Class9133.method33159()) {
                n3 = 4;
            }
            final Future[] array3 = new Future[n3];
            final int n4 = this.field32901 / n3;
            for (int i = 0; i < n3; ++i) {
                final int n5 = i * n4;
                array3[i] = Class8216.method27227(new Class1089(this, n2, n5, (i == n3 - 1) ? this.field32901 : (n5 + n4), n, array2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33189(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            final int n6 = this.field32903 / n3;
            for (int j = 0; j < n3; ++j) {
                final int n7 = j * n6;
                array3[j] = Class8216.method27227(new Class1269(this, n2, n7, (j == n3 - 1) ? this.field32903 : (n7 + n6), array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            Class9133.method33187(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            final int n8 = this.field32901 / n3;
            for (int k = 0; k < n3; ++k) {
                final int n9 = k * n8;
                array3[k] = Class8216.method27227(new Class1445(this, n2, n9, (k == n3 - 1) ? this.field32901 : (n9 + n8), n, array, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            if (n2 > 0) {
                for (int l = 0; l < this.field32901; ++l) {
                    final int n10 = 2 * l;
                    final int n11 = n10 + 1;
                    final int n12 = n + n10;
                    final int n13 = n + n11;
                    array2[n10] = array[n12] * this.field32917[n10] - array[n13] * this.field32917[n11];
                    array2[n11] = array[n12] * this.field32917[n11] + array[n13] * this.field32917[n10];
                }
            }
            else {
                for (int n14 = 0; n14 < this.field32901; ++n14) {
                    final int n15 = 2 * n14;
                    final int n16 = n15 + 1;
                    final int n17 = n + n15;
                    final int n18 = n + n16;
                    array2[n15] = array[n17] * this.field32917[n15] + array[n18] * this.field32917[n16];
                    array2[n16] = -array[n17] * this.field32917[n16] + array[n18] * this.field32917[n15];
                }
            }
            Class9133.method33189(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            if (n2 > 0) {
                for (int n19 = 0; n19 < this.field32903; ++n19) {
                    final int n20 = 2 * n19;
                    final int n21 = n20 + 1;
                    final double n22 = -array2[n20] * this.field32919[n21] + array2[n21] * this.field32919[n20];
                    array2[n20] = array2[n20] * this.field32919[n20] + array2[n21] * this.field32919[n21];
                    array2[n21] = n22;
                }
            }
            else {
                for (int n23 = 0; n23 < this.field32903; ++n23) {
                    final int n24 = 2 * n23;
                    final int n25 = n24 + 1;
                    final double n26 = array2[n24] * this.field32919[n25] + array2[n25] * this.field32919[n24];
                    array2[n24] = array2[n24] * this.field32919[n24] - array2[n25] * this.field32919[n25];
                    array2[n25] = n26;
                }
            }
            Class9133.method33187(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            if (n2 > 0) {
                for (int n27 = 0; n27 < this.field32901; ++n27) {
                    final int n28 = 2 * n27;
                    final int n29 = n28 + 1;
                    final int n30 = n + n28;
                    final int n31 = n + n29;
                    array[n30] = this.field32917[n28] * array2[n28] - this.field32917[n29] * array2[n29];
                    array[n31] = this.field32917[n29] * array2[n28] + this.field32917[n28] * array2[n29];
                }
            }
            else {
                for (int n32 = 0; n32 < this.field32901; ++n32) {
                    final int n33 = 2 * n32;
                    final int n34 = n33 + 1;
                    final int n35 = n + n33;
                    final int n36 = n + n34;
                    array[n35] = this.field32917[n33] * array2[n33] + this.field32917[n34] * array2[n34];
                    array[n36] = -this.field32917[n34] * array2[n33] + this.field32917[n33] * array2[n34];
                }
            }
        }
    }
    
    private void method26106(final Class17 class17, final long n, final int n2) {
        final Class17 class18 = new Class17(2L * this.field32904);
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32902 > Class9133.method33158()) {
            int n3 = 2;
            if (method27224 >= 4 && this.field32902 > Class9133.method33159()) {
                n3 = 4;
            }
            final Future[] array = new Future[n3];
            final long n4 = this.field32902 / n3;
            for (int i = 0; i < n3; ++i) {
                final long n5 = i * n4;
                array[i] = Class8216.method27227(new Class1255(this, n2, n5, (i == n3 - 1) ? this.field32902 : (n5 + n4), n, class18, class17));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33190(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            final long n6 = this.field32904 / n3;
            for (int j = 0; j < n3; ++j) {
                final long n7 = j * n6;
                array[j] = Class8216.method27227(new Class1069(this, n2, n7, (j == n3 - 1) ? this.field32904 : (n7 + n6), class18));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            Class9133.method33188(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            final long n8 = this.field32902 / n3;
            for (int k = 0; k < n3; ++k) {
                final long n9 = k * n8;
                array[k] = Class8216.method27227(new Class1055(this, n2, n9, (k == n3 - 1) ? this.field32902 : (n9 + n8), n, class17, class18));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            if (n2 > 0) {
                for (long n10 = 0L; n10 < this.field32902; ++n10) {
                    final long n11 = 2L * n10;
                    final long n12 = n11 + 1L;
                    final long n13 = n + n11;
                    final long n14 = n + n12;
                    class18.method171(n11, class17.method137(n13) * this.field32918.method137(n11) - class17.method137(n14) * this.field32918.method137(n12));
                    class18.method171(n12, class17.method137(n13) * this.field32918.method137(n12) + class17.method137(n14) * this.field32918.method137(n11));
                }
            }
            else {
                for (long n15 = 0L; n15 < this.field32902; ++n15) {
                    final long n16 = 2L * n15;
                    final long n17 = n16 + 1L;
                    final long n18 = n + n16;
                    final long n19 = n + n17;
                    class18.method171(n16, class17.method137(n18) * this.field32918.method137(n16) + class17.method137(n19) * this.field32918.method137(n17));
                    class18.method171(n17, -class17.method137(n18) * this.field32918.method137(n17) + class17.method137(n19) * this.field32918.method137(n16));
                }
            }
            Class9133.method33190(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            if (n2 > 0) {
                for (long n20 = 0L; n20 < this.field32904; ++n20) {
                    final long n21 = 2L * n20;
                    final long n22 = n21 + 1L;
                    final double n23 = -class18.method137(n21) * this.field32920.method137(n22) + class18.method137(n22) * this.field32920.method137(n21);
                    class18.method171(n21, class18.method137(n21) * this.field32920.method137(n21) + class18.method137(n22) * this.field32920.method137(n22));
                    class18.method171(n22, n23);
                }
            }
            else {
                for (long n24 = 0L; n24 < this.field32904; ++n24) {
                    final long n25 = 2L * n24;
                    final long n26 = n25 + 1L;
                    final double n27 = class18.method137(n25) * this.field32920.method137(n26) + class18.method137(n26) * this.field32920.method137(n25);
                    class18.method171(n25, class18.method137(n25) * this.field32920.method137(n25) - class18.method137(n26) * this.field32920.method137(n26));
                    class18.method171(n26, n27);
                }
            }
            Class9133.method33188(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            if (n2 > 0) {
                for (long n28 = 0L; n28 < this.field32902; ++n28) {
                    final long n29 = 2L * n28;
                    final long n30 = n29 + 1L;
                    final long n31 = n + n29;
                    final long n32 = n + n30;
                    class17.method171(n31, this.field32918.method137(n29) * class18.method137(n29) - this.field32918.method137(n30) * class18.method137(n30));
                    class17.method171(n32, this.field32918.method137(n30) * class18.method137(n29) + this.field32918.method137(n29) * class18.method137(n30));
                }
            }
            else {
                for (long n33 = 0L; n33 < this.field32902; ++n33) {
                    final long n34 = 2L * n33;
                    final long n35 = n34 + 1L;
                    final long n36 = n + n34;
                    final long n37 = n + n35;
                    class17.method171(n36, this.field32918.method137(n34) * class18.method137(n34) + this.field32918.method137(n35) * class18.method137(n35));
                    class17.method171(n37, -this.field32918.method137(n35) * class18.method137(n34) + this.field32918.method137(n34) * class18.method137(n35));
                }
            }
        }
    }
    
    private void method26107(final double[] array, final int n, final int n2) {
        final double[] array2 = new double[2 * this.field32903];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32901 >= Class9133.method33158()) {
            int n3 = 2;
            if (method27224 >= 4 && this.field32901 >= Class9133.method33159()) {
                n3 = 4;
            }
            final Future[] array3 = new Future[n3];
            final int n4 = this.field32901 / n3;
            for (int i = 0; i < n3; ++i) {
                final int n5 = i * n4;
                array3[i] = Class8216.method27227(new Class1406(this, n2, n5, (i == n3 - 1) ? this.field32901 : (n5 + n4), n, array2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33189(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            final int n6 = this.field32903 / n3;
            for (int j = 0; j < n3; ++j) {
                final int n7 = j * n6;
                array3[j] = Class8216.method27227(new Class1010(this, n2, n7, (j == n3 - 1) ? this.field32903 : (n7 + n6), array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            Class9133.method33187(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            final int n8 = this.field32901 / n3;
            for (int k = 0; k < n3; ++k) {
                final int n9 = k * n8;
                array3[k] = Class8216.method27227(new Class994(this, n2, n9, (k == n3 - 1) ? this.field32901 : (n9 + n8), array, n, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            if (n2 > 0) {
                for (int l = 0; l < this.field32901; ++l) {
                    final int n10 = 2 * l;
                    final int n11 = n10 + 1;
                    final int n12 = n + l;
                    array2[n10] = array[n12] * this.field32917[n10];
                    array2[n11] = array[n12] * this.field32917[n11];
                }
            }
            else {
                for (int n13 = 0; n13 < this.field32901; ++n13) {
                    final int n14 = 2 * n13;
                    final int n15 = n14 + 1;
                    final int n16 = n + n13;
                    array2[n14] = array[n16] * this.field32917[n14];
                    array2[n15] = -array[n16] * this.field32917[n15];
                }
            }
            Class9133.method33189(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            if (n2 > 0) {
                for (int n17 = 0; n17 < this.field32903; ++n17) {
                    final int n18 = 2 * n17;
                    final int n19 = n18 + 1;
                    final double n20 = -array2[n18] * this.field32919[n19] + array2[n19] * this.field32919[n18];
                    array2[n18] = array2[n18] * this.field32919[n18] + array2[n19] * this.field32919[n19];
                    array2[n19] = n20;
                }
            }
            else {
                for (int n21 = 0; n21 < this.field32903; ++n21) {
                    final int n22 = 2 * n21;
                    final int n23 = n22 + 1;
                    final double n24 = array2[n22] * this.field32919[n23] + array2[n23] * this.field32919[n22];
                    array2[n22] = array2[n22] * this.field32919[n22] - array2[n23] * this.field32919[n23];
                    array2[n23] = n24;
                }
            }
            Class9133.method33187(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            if (n2 > 0) {
                for (int n25 = 0; n25 < this.field32901; ++n25) {
                    final int n26 = 2 * n25;
                    final int n27 = n26 + 1;
                    array[n + n26] = this.field32917[n26] * array2[n26] - this.field32917[n27] * array2[n27];
                    array[n + n27] = this.field32917[n27] * array2[n26] + this.field32917[n26] * array2[n27];
                }
            }
            else {
                for (int n28 = 0; n28 < this.field32901; ++n28) {
                    final int n29 = 2 * n28;
                    final int n30 = n29 + 1;
                    array[n + n29] = this.field32917[n29] * array2[n29] + this.field32917[n30] * array2[n30];
                    array[n + n30] = -this.field32917[n30] * array2[n29] + this.field32917[n29] * array2[n30];
                }
            }
        }
    }
    
    private void method26108(final Class17 class17, final long n, final long n2) {
        final Class17 class18 = new Class17(2L * this.field32904);
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32902 > Class9133.method33158()) {
            int n3 = 2;
            if (method27224 >= 4 && this.field32902 > Class9133.method33159()) {
                n3 = 4;
            }
            final Future[] array = new Future[n3];
            final long n4 = this.field32902 / n3;
            for (int i = 0; i < n3; ++i) {
                final long n5 = i * n4;
                array[i] = Class8216.method27227(new Class1613(this, n2, n5, (i == n3 - 1) ? this.field32902 : (n5 + n4), n, class18, class17));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33190(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            final long n6 = this.field32904 / n3;
            for (int j = 0; j < n3; ++j) {
                final long n7 = j * n6;
                array[j] = Class8216.method27227(new Class986(this, n2, n7, (j == n3 - 1) ? this.field32904 : (n7 + n6), class18));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown4);
            }
            Class9133.method33188(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            final long n8 = this.field32902 / n3;
            for (int k = 0; k < n3; ++k) {
                final long n9 = k * n8;
                array[k] = Class8216.method27227(new Class1552(this, n2, n9, (k == n3 - 1) ? this.field32902 : (n9 + n8), class17, n, class18));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown5) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown5);
            }
            catch (final ExecutionException thrown6) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown6);
            }
        }
        else {
            if (n2 > 0L) {
                for (long n10 = 0L; n10 < this.field32902; ++n10) {
                    final long n11 = 2L * n10;
                    final long n12 = n11 + 1L;
                    final long n13 = n + n10;
                    class18.method171(n11, class17.method137(n13) * this.field32918.method137(n11));
                    class18.method171(n12, class17.method137(n13) * this.field32918.method137(n12));
                }
            }
            else {
                for (long n14 = 0L; n14 < this.field32902; ++n14) {
                    final long n15 = 2L * n14;
                    final long n16 = n15 + 1L;
                    final long n17 = n + n14;
                    class18.method171(n15, class17.method137(n17) * this.field32918.method137(n15));
                    class18.method171(n16, -class17.method137(n17) * this.field32918.method137(n16));
                }
            }
            Class9133.method33190(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            if (n2 > 0L) {
                for (long n18 = 0L; n18 < this.field32904; ++n18) {
                    final long n19 = 2L * n18;
                    final long n20 = n19 + 1L;
                    final double n21 = -class18.method137(n19) * this.field32920.method137(n20) + class18.method137(n20) * this.field32920.method137(n19);
                    class18.method171(n19, class18.method137(n19) * this.field32920.method137(n19) + class18.method137(n20) * this.field32920.method137(n20));
                    class18.method171(n20, n21);
                }
            }
            else {
                for (long n22 = 0L; n22 < this.field32904; ++n22) {
                    final long n23 = 2L * n22;
                    final long n24 = n23 + 1L;
                    final double n25 = class18.method137(n23) * this.field32920.method137(n24) + class18.method137(n24) * this.field32920.method137(n23);
                    class18.method171(n23, class18.method137(n23) * this.field32920.method137(n23) - class18.method137(n24) * this.field32920.method137(n24));
                    class18.method171(n24, n25);
                }
            }
            Class9133.method33188(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            if (n2 > 0L) {
                for (long n26 = 0L; n26 < this.field32902; ++n26) {
                    final long n27 = 2L * n26;
                    final long n28 = n27 + 1L;
                    class17.method171(n + n27, this.field32918.method137(n27) * class18.method137(n27) - this.field32918.method137(n28) * class18.method137(n28));
                    class17.method171(n + n28, this.field32918.method137(n28) * class18.method137(n27) + this.field32918.method137(n27) * class18.method137(n28));
                }
            }
            else {
                for (long n29 = 0L; n29 < this.field32902; ++n29) {
                    final long n30 = 2L * n29;
                    final long n31 = n30 + 1L;
                    class17.method171(n + n30, this.field32918.method137(n30) * class18.method137(n30) + this.field32918.method137(n31) * class18.method137(n31));
                    class17.method171(n + n31, -this.field32918.method137(n31) * class18.method137(n30) + this.field32918.method137(n30) * class18.method137(n31));
                }
            }
        }
    }
    
    private void method26109(final double[] array, final int n) {
        final double[] array2 = new double[2 * this.field32903];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32901 >= Class9133.method33158()) {
            int n2 = 2;
            if (method27224 >= 4 && this.field32901 >= Class9133.method33159()) {
                n2 = 4;
            }
            final Future[] array3 = new Future[n2];
            final int n3 = this.field32901 / n2;
            for (int i = 0; i < n2; ++i) {
                final int n4 = i * n3;
                array3[i] = Class8216.method27227(new Class1153(this, n4, (i == n2 - 1) ? this.field32901 : (n4 + n3), n, array2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33189(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            final int n5 = this.field32903 / n2;
            for (int j = 0; j < n2; ++j) {
                final int n6 = j * n5;
                array3[j] = Class8216.method27227(new Class1471(this, n6, (j == n2 - 1) ? this.field32903 : (n6 + n5), array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int k = 0; k < this.field32901; ++k) {
                final int n7 = 2 * k;
                final int n8 = n7 + 1;
                final int n9 = n + k;
                array2[n7] = array[n9] * this.field32917[n7];
                array2[n8] = -array[n9] * this.field32917[n8];
            }
            Class9133.method33189(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            for (int l = 0; l < this.field32903; ++l) {
                final int n10 = 2 * l;
                final int n11 = n10 + 1;
                final double n12 = array2[n10] * this.field32919[n11] + array2[n11] * this.field32919[n10];
                array2[n10] = array2[n10] * this.field32919[n10] - array2[n11] * this.field32919[n11];
                array2[n11] = n12;
            }
        }
        Class9133.method33187(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
        if (this.field32901 % 2 == 0) {
            array[n] = this.field32917[0] * array2[0] + this.field32917[1] * array2[1];
            array[n + 1] = this.field32917[this.field32901] * array2[this.field32901] + this.field32917[this.field32901 + 1] * array2[this.field32901 + 1];
            for (int n13 = 1; n13 < this.field32901 / 2; ++n13) {
                final int n14 = 2 * n13;
                final int n15 = n14 + 1;
                array[n + n14] = this.field32917[n14] * array2[n14] + this.field32917[n15] * array2[n15];
                array[n + n15] = -this.field32917[n15] * array2[n14] + this.field32917[n14] * array2[n15];
            }
        }
        else {
            array[n] = this.field32917[0] * array2[0] + this.field32917[1] * array2[1];
            array[n + 1] = -this.field32917[this.field32901] * array2[this.field32901 - 1] + this.field32917[this.field32901 - 1] * array2[this.field32901];
            for (int n16 = 1; n16 < (this.field32901 - 1) / 2; ++n16) {
                final int n17 = 2 * n16;
                final int n18 = n17 + 1;
                array[n + n17] = this.field32917[n17] * array2[n17] + this.field32917[n18] * array2[n18];
                array[n + n18] = -this.field32917[n18] * array2[n17] + this.field32917[n17] * array2[n18];
            }
            array[n + this.field32901 - 1] = this.field32917[this.field32901 - 1] * array2[this.field32901 - 1] + this.field32917[this.field32901] * array2[this.field32901];
        }
    }
    
    private void method26110(final Class17 class17, final long n) {
        final Class17 class18 = new Class17(2L * this.field32904);
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32902 > Class9133.method33158()) {
            int n2 = 2;
            if (method27224 >= 4 && this.field32902 > Class9133.method33159()) {
                n2 = 4;
            }
            final Future[] array = new Future[n2];
            final long n3 = this.field32902 / n2;
            for (int i = 0; i < n2; ++i) {
                final long n4 = i * n3;
                array[i] = Class8216.method27227(new Class1075(this, n4, (i == n2 - 1) ? this.field32902 : (n4 + n3), n, class18, class17));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33190(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            final long n5 = this.field32904 / n2;
            for (int j = 0; j < n2; ++j) {
                final long n6 = j * n5;
                array[j] = Class8216.method27227(new Class1284(this, n6, (j == n2 - 1) ? this.field32904 : (n6 + n5), class18));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n7 = 0L; n7 < this.field32902; ++n7) {
                final long n8 = 2L * n7;
                final long n9 = n8 + 1L;
                final long n10 = n + n7;
                class18.method171(n8, class17.method137(n10) * this.field32918.method137(n8));
                class18.method171(n9, -class17.method137(n10) * this.field32918.method137(n9));
            }
            Class9133.method33190(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            for (long n11 = 0L; n11 < this.field32904; ++n11) {
                final long n12 = 2L * n11;
                final long n13 = n12 + 1L;
                final double n14 = class18.method137(n12) * this.field32920.method137(n13) + class18.method137(n13) * this.field32920.method137(n12);
                class18.method171(n12, class18.method137(n12) * this.field32920.method137(n12) - class18.method137(n13) * this.field32920.method137(n13));
                class18.method171(n13, n14);
            }
        }
        Class9133.method33188(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
        if (this.field32902 % 2L == 0L) {
            class17.method171(n, this.field32918.method137(0L) * class18.method137(0L) + this.field32918.method137(1L) * class18.method137(1L));
            class17.method171(n + 1L, this.field32918.method137(this.field32902) * class18.method137(this.field32902) + this.field32918.method137(this.field32902 + 1L) * class18.method137(this.field32902 + 1L));
            for (long n15 = 1L; n15 < this.field32902 / 2L; ++n15) {
                final long n16 = 2L * n15;
                final long n17 = n16 + 1L;
                class17.method171(n + n16, this.field32918.method137(n16) * class18.method137(n16) + this.field32918.method137(n17) * class18.method137(n17));
                class17.method171(n + n17, -this.field32918.method137(n17) * class18.method137(n16) + this.field32918.method137(n16) * class18.method137(n17));
            }
        }
        else {
            class17.method171(n, this.field32918.method137(0L) * class18.method137(0L) + this.field32918.method137(1L) * class18.method137(1L));
            class17.method171(n + 1L, -this.field32918.method137(this.field32902) * class18.method137(this.field32902 - 1L) + this.field32918.method137(this.field32902 - 1L) * class18.method137(this.field32902));
            for (long n18 = 1L; n18 < (this.field32902 - 1L) / 2L; ++n18) {
                final long n19 = 2L * n18;
                final long n20 = n19 + 1L;
                class17.method171(n + n19, this.field32918.method137(n19) * class18.method137(n19) + this.field32918.method137(n20) * class18.method137(n20));
                class17.method171(n + n20, -this.field32918.method137(n20) * class18.method137(n19) + this.field32918.method137(n19) * class18.method137(n20));
            }
            class17.method171(n + this.field32902 - 1L, this.field32918.method137(this.field32902 - 1L) * class18.method137(this.field32902 - 1L) + this.field32918.method137(this.field32902) * class18.method137(this.field32902));
        }
    }
    
    private void method26111(final double[] array, final int n) {
        final double[] array2 = new double[2 * this.field32903];
        if (this.field32901 % 2 == 0) {
            array2[0] = array[n] * this.field32917[0];
            array2[1] = array[n] * this.field32917[1];
            for (int i = 1; i < this.field32901 / 2; ++i) {
                final int n2 = 2 * i;
                final int n3 = n2 + 1;
                final int n4 = n + n2;
                final int n5 = n + n3;
                array2[n2] = array[n4] * this.field32917[n2] - array[n5] * this.field32917[n3];
                array2[n3] = array[n4] * this.field32917[n3] + array[n5] * this.field32917[n2];
            }
            array2[this.field32901] = array[n + 1] * this.field32917[this.field32901];
            array2[this.field32901 + 1] = array[n + 1] * this.field32917[this.field32901 + 1];
            for (int j = this.field32901 / 2 + 1; j < this.field32901; ++j) {
                final int n6 = 2 * j;
                final int n7 = n6 + 1;
                final int n8 = n + 2 * this.field32901 - n6;
                final int n9 = n8 + 1;
                array2[n6] = array[n8] * this.field32917[n6] + array[n9] * this.field32917[n7];
                array2[n7] = array[n8] * this.field32917[n7] - array[n9] * this.field32917[n6];
            }
        }
        else {
            array2[0] = array[n] * this.field32917[0];
            array2[1] = array[n] * this.field32917[1];
            for (int k = 1; k < (this.field32901 - 1) / 2; ++k) {
                final int n10 = 2 * k;
                final int n11 = n10 + 1;
                final int n12 = n + n10;
                final int n13 = n + n11;
                array2[n10] = array[n12] * this.field32917[n10] - array[n13] * this.field32917[n11];
                array2[n11] = array[n12] * this.field32917[n11] + array[n13] * this.field32917[n10];
            }
            array2[this.field32901 - 1] = array[n + this.field32901 - 1] * this.field32917[this.field32901 - 1] - array[n + 1] * this.field32917[this.field32901];
            array2[this.field32901] = array[n + this.field32901 - 1] * this.field32917[this.field32901] + array[n + 1] * this.field32917[this.field32901 - 1];
            array2[this.field32901 + 1] = array[n + this.field32901 - 1] * this.field32917[this.field32901 + 1] + array[n + 1] * this.field32917[this.field32901 + 2];
            array2[this.field32901 + 2] = array[n + this.field32901 - 1] * this.field32917[this.field32901 + 2] - array[n + 1] * this.field32917[this.field32901 + 1];
            for (int l = (this.field32901 - 1) / 2 + 2; l < this.field32901; ++l) {
                final int n14 = 2 * l;
                final int n15 = n14 + 1;
                final int n16 = n + 2 * this.field32901 - n14;
                final int n17 = n16 + 1;
                array2[n14] = array[n16] * this.field32917[n14] + array[n17] * this.field32917[n15];
                array2[n15] = array[n16] * this.field32917[n15] - array[n17] * this.field32917[n14];
            }
        }
        Class9133.method33189(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32901 >= Class9133.method33158()) {
            int n18 = 2;
            if (method27224 >= 4 && this.field32901 >= Class9133.method33159()) {
                n18 = 4;
            }
            final Future[] array3 = new Future[n18];
            final int n19 = this.field32903 / n18;
            for (int n20 = 0; n20 < n18; ++n20) {
                final int n21 = n20 * n19;
                array3[n20] = Class8216.method27227(new Class1162(this, n21, (n20 == n18 - 1) ? this.field32903 : (n21 + n19), array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33187(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            final int n22 = this.field32901 / n18;
            for (int n23 = 0; n23 < n18; ++n23) {
                final int n24 = n23 * n22;
                array3[n23] = Class8216.method27227(new Class1321(this, n24, (n23 == n18 - 1) ? this.field32901 : (n24 + n22), array, n, array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int n25 = 0; n25 < this.field32903; ++n25) {
                final int n26 = 2 * n25;
                final int n27 = n26 + 1;
                final double n28 = -array2[n26] * this.field32919[n27] + array2[n27] * this.field32919[n26];
                array2[n26] = array2[n26] * this.field32919[n26] + array2[n27] * this.field32919[n27];
                array2[n27] = n28;
            }
            Class9133.method33187(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            for (int n29 = 0; n29 < this.field32901; ++n29) {
                final int n30 = 2 * n29;
                final int n31 = n30 + 1;
                array[n + n29] = this.field32917[n30] * array2[n30] - this.field32917[n31] * array2[n31];
            }
        }
    }
    
    private void method26112(final Class17 class17, final long n) {
        final Class17 class18 = new Class17(2L * this.field32904);
        if (this.field32902 % 2L == 0L) {
            class18.method171(0L, class17.method137(n) * this.field32918.method137(0L));
            class18.method171(1L, class17.method137(n) * this.field32918.method137(1L));
            for (long n2 = 1L; n2 < this.field32902 / 2L; ++n2) {
                final long n3 = 2L * n2;
                final long n4 = n3 + 1L;
                final long n5 = n + n3;
                final long n6 = n + n4;
                class18.method171(n3, class17.method137(n5) * this.field32918.method137(n3) - class17.method137(n6) * this.field32918.method137(n4));
                class18.method171(n4, class17.method137(n5) * this.field32918.method137(n4) + class17.method137(n6) * this.field32918.method137(n3));
            }
            class18.method171(this.field32902, class17.method137(n + 1L) * this.field32918.method137(this.field32902));
            class18.method171(this.field32902 + 1L, class17.method137(n + 1L) * this.field32918.method137(this.field32902 + 1L));
            for (long n7 = this.field32902 / 2L + 1L; n7 < this.field32902; ++n7) {
                final long n8 = 2L * n7;
                final long n9 = n8 + 1L;
                final long n10 = n + 2L * this.field32902 - n8;
                final long n11 = n10 + 1L;
                class18.method171(n8, class17.method137(n10) * this.field32918.method137(n8) + class17.method137(n11) * this.field32918.method137(n9));
                class18.method171(n9, class17.method137(n10) * this.field32918.method137(n9) - class17.method137(n11) * this.field32918.method137(n8));
            }
        }
        else {
            class18.method171(0L, class17.method137(n) * this.field32918.method137(0L));
            class18.method171(1L, class17.method137(n) * this.field32918.method137(1L));
            for (long n12 = 1L; n12 < (this.field32902 - 1L) / 2L; ++n12) {
                final long n13 = 2L * n12;
                final long n14 = n13 + 1L;
                final long n15 = n + n13;
                final long n16 = n + n14;
                class18.method171(n13, class17.method137(n15) * this.field32918.method137(n13) - class17.method137(n16) * this.field32918.method137(n14));
                class18.method171(n14, class17.method137(n15) * this.field32918.method137(n14) + class17.method137(n16) * this.field32918.method137(n13));
            }
            class18.method171(this.field32902 - 1L, class17.method137(n + this.field32902 - 1L) * this.field32918.method137(this.field32902 - 1L) - class17.method137(n + 1L) * this.field32918.method137(this.field32902));
            class18.method171(this.field32902, class17.method137(n + this.field32902 - 1L) * this.field32918.method137(this.field32902) + class17.method137(n + 1L) * this.field32918.method137(this.field32902 - 1L));
            class18.method171(this.field32902 + 1L, class17.method137(n + this.field32902 - 1L) * this.field32918.method137(this.field32902 + 1L) + class17.method137(n + 1L) * this.field32918.method137(this.field32902 + 2L));
            class18.method171(this.field32902 + 2L, class17.method137(n + this.field32902 - 1L) * this.field32918.method137(this.field32902 + 2L) - class17.method137(n + 1L) * this.field32918.method137(this.field32902 + 1L));
            for (long n17 = (this.field32902 - 1L) / 2L + 2L; n17 < this.field32902; ++n17) {
                final long n18 = 2L * n17;
                final long n19 = n18 + 1L;
                final long n20 = n + 2L * this.field32902 - n18;
                final long n21 = n20 + 1L;
                class18.method171(n18, class17.method137(n20) * this.field32918.method137(n18) + class17.method137(n21) * this.field32918.method137(n19));
                class18.method171(n19, class17.method137(n20) * this.field32918.method137(n19) - class17.method137(n21) * this.field32918.method137(n18));
            }
        }
        Class9133.method33190(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32902 > Class9133.method33158()) {
            int n22 = 2;
            if (method27224 >= 4 && this.field32902 > Class9133.method33159()) {
                n22 = 4;
            }
            final Future[] array = new Future[n22];
            final long n23 = this.field32904 / n22;
            for (int i = 0; i < n22; ++i) {
                final long n24 = i * n23;
                array[i] = Class8216.method27227(new Class1197(this, n24, (i == n22 - 1) ? this.field32904 : (n24 + n23), class18));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33188(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            final long n25 = this.field32902 / n22;
            for (int j = 0; j < n22; ++j) {
                final long n26 = j * n25;
                array[j] = Class8216.method27227(new Class1283(this, n26, (j == n22 - 1) ? this.field32902 : (n26 + n25), class17, n, class18));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n27 = 0L; n27 < this.field32904; ++n27) {
                final long n28 = 2L * n27;
                final long n29 = n28 + 1L;
                final double n30 = -class18.method137(n28) * this.field32920.method137(n29) + class18.method137(n29) * this.field32920.method137(n28);
                class18.method171(n28, class18.method137(n28) * this.field32920.method137(n28) + class18.method137(n29) * this.field32920.method137(n29));
                class18.method171(n29, n30);
            }
            Class9133.method33188(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            for (long n31 = 0L; n31 < this.field32902; ++n31) {
                final long n32 = 2L * n31;
                final long n33 = n32 + 1L;
                class17.method171(n + n31, this.field32918.method137(n32) * class18.method137(n32) - this.field32918.method137(n33) * class18.method137(n33));
            }
        }
    }
    
    private void method26113(final double[] array, final int n) {
        final double[] array2 = new double[2 * this.field32903];
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32901 >= Class9133.method33158()) {
            int n2 = 2;
            if (method27224 >= 4 && this.field32901 >= Class9133.method33159()) {
                n2 = 4;
            }
            final Future[] array3 = new Future[n2];
            final int n3 = this.field32901 / n2;
            for (int i = 0; i < n2; ++i) {
                final int n4 = i * n3;
                array3[i] = Class8216.method27227(new Class1028(this, n4, (i == n2 - 1) ? this.field32901 : (n4 + n3), n, array2, array));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33189(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            final int n5 = this.field32903 / n2;
            for (int j = 0; j < n2; ++j) {
                final int n6 = j * n5;
                array3[j] = Class8216.method27227(new Class1427(this, n6, (j == n2 - 1) ? this.field32903 : (n6 + n5), array2));
            }
            try {
                Class8216.method27228(array3);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (int k = 0; k < this.field32901; ++k) {
                final int n7 = 2 * k;
                final int n8 = n7 + 1;
                final int n9 = n + k;
                array2[n7] = array[n9] * this.field32917[n7];
                array2[n8] = array[n9] * this.field32917[n8];
            }
            Class9133.method33189(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
            for (int l = 0; l < this.field32903; ++l) {
                final int n10 = 2 * l;
                final int n11 = n10 + 1;
                final double n12 = -array2[n10] * this.field32919[n11] + array2[n11] * this.field32919[n10];
                array2[n10] = array2[n10] * this.field32919[n10] + array2[n11] * this.field32919[n11];
                array2[n11] = n12;
            }
        }
        Class9133.method33187(2 * this.field32903, array2, 0, this.field32905, this.field32909, this.field32907);
        if (this.field32901 % 2 == 0) {
            array[n] = this.field32917[0] * array2[0] - this.field32917[1] * array2[1];
            array[n + 1] = this.field32917[this.field32901] * array2[this.field32901] - this.field32917[this.field32901 + 1] * array2[this.field32901 + 1];
            for (int n13 = 1; n13 < this.field32901 / 2; ++n13) {
                final int n14 = 2 * n13;
                final int n15 = n14 + 1;
                array[n + n14] = this.field32917[n14] * array2[n14] - this.field32917[n15] * array2[n15];
                array[n + n15] = this.field32917[n15] * array2[n14] + this.field32917[n14] * array2[n15];
            }
        }
        else {
            array[n] = this.field32917[0] * array2[0] - this.field32917[1] * array2[1];
            array[n + 1] = this.field32917[this.field32901] * array2[this.field32901 - 1] + this.field32917[this.field32901 - 1] * array2[this.field32901];
            for (int n16 = 1; n16 < (this.field32901 - 1) / 2; ++n16) {
                final int n17 = 2 * n16;
                final int n18 = n17 + 1;
                array[n + n17] = this.field32917[n17] * array2[n17] - this.field32917[n18] * array2[n18];
                array[n + n18] = this.field32917[n18] * array2[n17] + this.field32917[n17] * array2[n18];
            }
            array[n + this.field32901 - 1] = this.field32917[this.field32901 - 1] * array2[this.field32901 - 1] - this.field32917[this.field32901] * array2[this.field32901];
        }
    }
    
    private void method26114(final Class17 class17, final long n) {
        final Class17 class18 = new Class17(2L * this.field32904);
        final int method27224 = Class8216.method27224();
        if (method27224 > 1 && this.field32902 > Class9133.method33158()) {
            int n2 = 2;
            if (method27224 >= 4 && this.field32902 > Class9133.method33159()) {
                n2 = 4;
            }
            final Future[] array = new Future[n2];
            final long n3 = this.field32902 / n2;
            for (int i = 0; i < n2; ++i) {
                final long n4 = i * n3;
                array[i] = Class8216.method27227(new Class1025(this, n4, (i == n2 - 1) ? this.field32902 : (n4 + n3), n, class18, class17));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown);
            }
            catch (final ExecutionException thrown2) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown2);
            }
            Class9133.method33190(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            final long n5 = this.field32904 / n2;
            for (int j = 0; j < n2; ++j) {
                final long n6 = j * n5;
                array[j] = Class8216.method27227(new Class1469(this, n6, (j == n2 - 1) ? this.field32904 : (n6 + n5), class18));
            }
            try {
                Class8216.method27228(array);
            }
            catch (final InterruptedException thrown3) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown3);
            }
            catch (final ExecutionException thrown4) {
                Logger.getLogger(Class7992.class.getName()).log(Level.SEVERE, null, thrown4);
            }
        }
        else {
            for (long n7 = 0L; n7 < this.field32902; ++n7) {
                final long n8 = 2L * n7;
                final long n9 = n8 + 1L;
                final long n10 = n + n7;
                class18.method171(n8, class17.method137(n10) * this.field32918.method137(n8));
                class18.method171(n9, class17.method137(n10) * this.field32918.method137(n9));
            }
            Class9133.method33190(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
            for (long n11 = 0L; n11 < this.field32904; ++n11) {
                final long n12 = 2L * n11;
                final long n13 = n12 + 1L;
                final double n14 = -class18.method137(n12) * this.field32920.method137(n13) + class18.method137(n13) * this.field32920.method137(n12);
                class18.method171(n12, class18.method137(n12) * this.field32920.method137(n12) + class18.method137(n13) * this.field32920.method137(n13));
                class18.method171(n13, n14);
            }
        }
        Class9133.method33188(2L * this.field32904, class18, 0L, this.field32906, this.field32910, this.field32908);
        if (this.field32902 % 2L == 0L) {
            class17.method171(n, this.field32918.method137(0L) * class18.method137(0L) - this.field32918.method137(1L) * class18.method137(1L));
            class17.method171(n + 1L, this.field32918.method137(this.field32902) * class18.method137(this.field32902) - this.field32918.method137(this.field32902 + 1L) * class18.method137(this.field32902 + 1L));
            for (long n15 = 1L; n15 < this.field32902 / 2L; ++n15) {
                final long n16 = 2L * n15;
                final long n17 = n16 + 1L;
                class17.method171(n + n16, this.field32918.method137(n16) * class18.method137(n16) - this.field32918.method137(n17) * class18.method137(n17));
                class17.method171(n + n17, this.field32918.method137(n17) * class18.method137(n16) + this.field32918.method137(n16) * class18.method137(n17));
            }
        }
        else {
            class17.method171(n, this.field32918.method137(0L) * class18.method137(0L) - this.field32918.method137(1L) * class18.method137(1L));
            class17.method171(n + 1L, this.field32918.method137(this.field32902) * class18.method137(this.field32902 - 1L) + this.field32918.method137(this.field32902 - 1L) * class18.method137(this.field32902));
            for (long n18 = 1L; n18 < (this.field32902 - 1L) / 2L; ++n18) {
                final long n19 = 2L * n18;
                final long n20 = n19 + 1L;
                class17.method171(n + n19, this.field32918.method137(n19) * class18.method137(n19) - this.field32918.method137(n20) * class18.method137(n20));
                class17.method171(n + n20, this.field32918.method137(n20) * class18.method137(n19) + this.field32918.method137(n19) * class18.method137(n20));
            }
            class17.method171(n + this.field32902 - 1L, this.field32918.method137(this.field32902 - 1L) * class18.method137(this.field32902 - 1L) - this.field32918.method137(this.field32902) * class18.method137(this.field32902));
        }
    }
    
    public void method26115(final double[] array, final int n) {
        if (this.field32901 == 1) {
            return;
        }
        final double[] array2 = new double[this.field32901];
        final int n2 = 2 * this.field32901;
        final int n3 = (int)this.field32915[1 + n2];
        int n4 = 1;
        int field32901 = this.field32901;
        int n5 = n2 - 1;
        for (int i = 1; i <= n3; ++i) {
            final int n6 = (int)this.field32915[n3 - i + 2 + n2];
            final int n7 = field32901 / n6;
            final int n8 = this.field32901 / field32901;
            final int n9 = n8 * n7;
            n5 -= (n6 - 1) * n8;
            n4 = 1 - n4;
            switch (n6) {
                case 2: {
                    if (n4 == 0) {
                        this.method26119(n8, n7, array, n, array2, 0, n5);
                        break;
                    }
                    this.method26119(n8, n7, array2, 0, array, n, n5);
                    break;
                }
                case 3: {
                    if (n4 == 0) {
                        this.method26123(n8, n7, array, n, array2, 0, n5);
                        break;
                    }
                    this.method26123(n8, n7, array2, 0, array, n, n5);
                    break;
                }
                case 4: {
                    if (n4 == 0) {
                        this.method26127(n8, n7, array, n, array2, 0, n5);
                        break;
                    }
                    this.method26127(n8, n7, array2, 0, array, n, n5);
                    break;
                }
                case 5: {
                    if (n4 == 0) {
                        this.method26131(n8, n7, array, n, array2, 0, n5);
                        break;
                    }
                    this.method26131(n8, n7, array2, 0, array, n, n5);
                    break;
                }
                default: {
                    if (n8 == 1) {
                        n4 = 1 - n4;
                    }
                    if (n4 == 0) {
                        this.method26135(n8, n6, n7, n9, array, n, array2, 0, n5);
                        n4 = 1;
                        break;
                    }
                    this.method26135(n8, n6, n7, n9, array2, 0, array, n, n5);
                    n4 = 0;
                    break;
                }
            }
            field32901 = n7;
        }
        if (n4 == 1) {
            return;
        }
        System.arraycopy(array2, 0, array, n, this.field32901);
    }
    
    public void method26116(final Class17 class17, final long n) {
        if (this.field32902 == 1L) {
            return;
        }
        final Class17 class18 = new Class17(this.field32902);
        final long n2 = 2L * this.field32902;
        final long n3 = (long)this.field32916.method137(1L + n2);
        long n4 = 1L;
        long field32902 = this.field32902;
        long n5 = n2 - 1L;
        for (long n6 = 1L; n6 <= n3; ++n6) {
            final int n7 = (int)this.field32916.method137(n3 - n6 + 2L + n2);
            final long n8 = field32902 / n7;
            final long n9 = this.field32902 / field32902;
            final long n10 = n9 * n8;
            n5 -= (n7 - 1) * n9;
            n4 = 1L - n4;
            switch (n7) {
                case 2: {
                    if (n4 == 0L) {
                        this.method26120(n9, n8, class17, n, class18, 0L, n5);
                        break;
                    }
                    this.method26120(n9, n8, class18, 0L, class17, n, n5);
                    break;
                }
                case 3: {
                    if (n4 == 0L) {
                        this.method26124(n9, n8, class17, n, class18, 0L, n5);
                        break;
                    }
                    this.method26124(n9, n8, class18, 0L, class17, n, n5);
                    break;
                }
                case 4: {
                    if (n4 == 0L) {
                        this.method26128(n9, n8, class17, n, class18, 0L, n5);
                        break;
                    }
                    this.method26128(n9, n8, class18, 0L, class17, n, n5);
                    break;
                }
                case 5: {
                    if (n4 == 0L) {
                        this.method26132(n9, n8, class17, n, class18, 0L, n5);
                        break;
                    }
                    this.method26132(n9, n8, class18, 0L, class17, n, n5);
                    break;
                }
                default: {
                    if (n9 == 1L) {
                        n4 = 1L - n4;
                    }
                    if (n4 == 0L) {
                        this.method26136(n9, n7, n8, n10, class17, n, class18, 0L, n5);
                        n4 = 1L;
                        break;
                    }
                    this.method26136(n9, n7, n8, n10, class18, 0L, class17, n, n5);
                    n4 = 0L;
                    break;
                }
            }
            field32902 = n8;
        }
        if (n4 == 1L) {
            return;
        }
        Class8601.method29154(class18, 0L, class17, n, this.field32902);
    }
    
    public void method26117(final double[] array, final int n) {
        if (this.field32901 == 1) {
            return;
        }
        final double[] array2 = new double[this.field32901];
        final int n2 = 2 * this.field32901;
        final int n3 = (int)this.field32915[1 + n2];
        int n4 = 0;
        int n5 = 1;
        int field32901 = this.field32901;
        for (int i = 1; i <= n3; ++i) {
            final int n6 = (int)this.field32915[i + 1 + n2];
            final int n7 = n6 * n5;
            final int n8 = this.field32901 / n7;
            final int n9 = n8 * n5;
            switch (n6) {
                case 2: {
                    if (n4 == 0) {
                        this.method26121(n8, n5, array, n, array2, 0, field32901);
                    }
                    else {
                        this.method26121(n8, n5, array2, 0, array, n, field32901);
                    }
                    n4 = 1 - n4;
                    break;
                }
                case 3: {
                    if (n4 == 0) {
                        this.method26125(n8, n5, array, n, array2, 0, field32901);
                    }
                    else {
                        this.method26125(n8, n5, array2, 0, array, n, field32901);
                    }
                    n4 = 1 - n4;
                    break;
                }
                case 4: {
                    if (n4 == 0) {
                        this.method26129(n8, n5, array, n, array2, 0, field32901);
                    }
                    else {
                        this.method26129(n8, n5, array2, 0, array, n, field32901);
                    }
                    n4 = 1 - n4;
                    break;
                }
                case 5: {
                    if (n4 == 0) {
                        this.method26133(n8, n5, array, n, array2, 0, field32901);
                    }
                    else {
                        this.method26133(n8, n5, array2, 0, array, n, field32901);
                    }
                    n4 = 1 - n4;
                    break;
                }
                default: {
                    if (n4 == 0) {
                        this.method26137(n8, n6, n5, n9, array, n, array2, 0, field32901);
                    }
                    else {
                        this.method26137(n8, n6, n5, n9, array2, 0, array, n, field32901);
                    }
                    if (n8 == 1) {
                        n4 = 1 - n4;
                        break;
                    }
                    break;
                }
            }
            n5 = n7;
            field32901 += (n6 - 1) * n8;
        }
        if (n4 == 0) {
            return;
        }
        System.arraycopy(array2, 0, array, n, this.field32901);
    }
    
    public void method26118(final Class17 class17, final long n) {
        if (this.field32902 == 1L) {
            return;
        }
        final Class17 class18 = new Class17(this.field32902);
        final long n2 = 2L * this.field32902;
        final long n3 = (long)this.field32916.method137(1L + n2);
        long n4 = 0L;
        long n5 = 1L;
        long field32902 = this.field32902;
        for (long n6 = 1L; n6 <= n3; ++n6) {
            final int n7 = (int)this.field32916.method137(n6 + 1L + n2);
            final long n8 = n7 * n5;
            final long n9 = this.field32902 / n8;
            final long n10 = n9 * n5;
            switch (n7) {
                case 2: {
                    if (n4 == 0L) {
                        this.method26122(n9, n5, class17, n, class18, 0L, field32902);
                    }
                    else {
                        this.method26122(n9, n5, class18, 0L, class17, n, field32902);
                    }
                    n4 = 1L - n4;
                    break;
                }
                case 3: {
                    if (n4 == 0L) {
                        this.method26126(n9, n5, class17, n, class18, 0L, field32902);
                    }
                    else {
                        this.method26126(n9, n5, class18, 0L, class17, n, field32902);
                    }
                    n4 = 1L - n4;
                    break;
                }
                case 4: {
                    if (n4 == 0L) {
                        this.method26130(n9, n5, class17, n, class18, 0L, field32902);
                    }
                    else {
                        this.method26130(n9, n5, class18, 0L, class17, n, field32902);
                    }
                    n4 = 1L - n4;
                    break;
                }
                case 5: {
                    if (n4 == 0L) {
                        this.method26134(n9, n5, class17, n, class18, 0L, field32902);
                    }
                    else {
                        this.method26134(n9, n5, class18, 0L, class17, n, field32902);
                    }
                    n4 = 1L - n4;
                    break;
                }
                default: {
                    if (n4 == 0L) {
                        this.method26138(n9, n7, n5, n10, class17, n, class18, 0L, field32902);
                    }
                    else {
                        this.method26138(n9, n7, n5, n10, class18, 0L, class17, n, field32902);
                    }
                    if (n9 == 1L) {
                        n4 = 1L - n4;
                        break;
                    }
                    break;
                }
            }
            n5 = n8;
            field32902 += (n7 - 1) * n9;
        }
        if (n4 == 0L) {
            return;
        }
        Class8601.method29154(class18, 0L, class17, n, this.field32902);
    }
    
    public void method26119(final int n, final int n2, final double[] array, final int n3, final double[] array2, final int n4, final int n5) {
        final int n6 = n2 * n;
        int n7 = 2 * n;
        for (int i = 0; i < n2; ++i) {
            final int n8 = n4 + i * n7;
            final int n9 = n8 + n7 - 1;
            final int n10 = n3 + i * n;
            final int n11 = n10 + n6;
            final double n12 = array[n10];
            final double n13 = array[n11];
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
                        final double n23 = array[n21 - 1];
                        final double n24 = array[n21];
                        final double n25 = array[n22 - 1];
                        final double n26 = array[n22];
                        final double n27 = this.field32915[n18 - 1];
                        final double n28 = this.field32915[n18];
                        final double n29 = n27 * n25 + n28 * n26;
                        final double n30 = n27 * n26 - n28 * n25;
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
    
    public void method26120(final long n, final long n2, final Class17 class17, final long n3, final Class17 class18, final long n4, final long n5) {
        final long n6 = n2 * n;
        long n7 = 2L * n;
        for (long n8 = 0L; n8 < n2; ++n8) {
            final long n9 = n4 + n8 * n7;
            final long n10 = n9 + n7 - 1L;
            final long n11 = n3 + n8 * n;
            final long n12 = n11 + n6;
            final double method137 = class17.method137(n11);
            final double method138 = class17.method137(n12);
            class18.method171(n9, method137 + method138);
            class18.method171(n10, method137 - method138);
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
                        final double method139 = class17.method137(n22 - 1L);
                        final double method140 = class17.method137(n22);
                        final double method141 = class17.method137(n23 - 1L);
                        final double method142 = class17.method137(n23);
                        final double method143 = this.field32916.method137(n19 - 1L);
                        final double method144 = this.field32916.method137(n19);
                        final double n24 = method143 * method141 + method144 * method142;
                        final double n25 = method143 * method142 - method144 * method141;
                        class18.method171(n20, method140 + n25);
                        class18.method171(n20 - 1L, method139 + n24);
                        class18.method171(n21, n25 - method140);
                        class18.method171(n21 - 1L, method139 - n24);
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
                class18.method171(n29, -class17.method137(n30 + n6));
                class18.method171(n29 - 1L, class17.method137(n30));
            }
        }
    }
    
    public void method26121(final int n, final int n2, final double[] array, final int n3, final double[] array2, final int n4, final int n5) {
        final int n6 = n2 * n;
        for (int i = 0; i < n2; ++i) {
            final int n7 = i * n;
            final int n8 = 2 * n7;
            final int n9 = n8 + n;
            final int n10 = n4 + n7;
            final int n11 = n3 + n8;
            final int n12 = n3 + n - 1 + n9;
            final double n13 = array[n11];
            final double n14 = array[n12];
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
                        final double n24 = this.field32915[n20 - 1];
                        final double n25 = this.field32915[n20];
                        final int n26 = n22 + n16;
                        final int n27 = n23 + n17;
                        final int n28 = n21 + n15;
                        final int n29 = n21 + n18;
                        final double n30 = array[n26 - 1] - array[n27 - 1];
                        final double n31 = array[n26] + array[n27];
                        final double n32 = array[n26];
                        final double n33 = array[n26 - 1];
                        final double n34 = array[n27];
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
                array2[n37] = 2.0 * array[n38 - 1];
                array2[n37 + n6] = -2.0 * array[n38];
            }
        }
    }
    
    public void method26122(final long n, final long n2, final Class17 class17, final long n3, final Class17 class18, final long n4, final long n5) {
        final long n6 = n2 * n;
        for (long n7 = 0L; n7 < n2; ++n7) {
            final long n8 = n7 * n;
            final long n9 = 2L * n8;
            final long n10 = n9 + n;
            final long n11 = n4 + n8;
            final long n12 = n3 + n9;
            final long n13 = n3 + n - 1L + n10;
            final double method137 = class17.method137(n12);
            final double method138 = class17.method137(n13);
            class18.method171(n11, method137 + method138);
            class18.method171(n11 + n6, method137 - method138);
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
                        final double method139 = this.field32916.method137(n21 - 1L);
                        final double method140 = this.field32916.method137(n21);
                        final long n25 = n23 + n16;
                        final long n26 = n24 + n17;
                        final long n27 = n22 + n15;
                        final long n28 = n22 + n18;
                        final double n29 = class17.method137(n25 - 1L) - class17.method137(n26 - 1L);
                        final double n30 = class17.method137(n25) + class17.method137(n26);
                        final double method141 = class17.method137(n25);
                        final double method142 = class17.method137(n25 - 1L);
                        final double method143 = class17.method137(n26);
                        class18.method171(n27 - 1L, method142 + class17.method137(n26 - 1L));
                        class18.method171(n27, method141 - method143);
                        class18.method171(n28 - 1L, method139 * n29 - method140 * n30);
                        class18.method171(n28, method139 * n30 + method140 * n29);
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
                class18.method171(n34, 2.0 * class17.method137(n35 - 1L));
                class18.method171(n34 + n6, -2.0 * class17.method137(n35));
            }
        }
    }
    
    public void method26123(final int n, final int n2, final double[] array, final int n3, final double[] array2, final int n4, final int n5) {
        final int n6 = n5 + n;
        final int n7 = n2 * n;
        for (int i = 0; i < n2; ++i) {
            final int n8 = i * n;
            final int n9 = 2 * n7;
            final int n10 = (3 * i + 1) * n;
            final int n11 = n3 + n8;
            final int n12 = n11 + n7;
            final int n13 = n11 + n9;
            final double n14 = array[n11];
            final double n15 = array[n12];
            final double n16 = array[n13];
            final double n17 = n15 + n16;
            array2[n4 + 3 * n8] = n14 + n17;
            array2[n4 + n10 + n] = 0.8660254037844387 * (n16 - n15);
            array2[n4 + n - 1 + n10] = n14 + -0.5 * n17;
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
                    final double n27 = this.field32915[n25 - 1];
                    final double n28 = this.field32915[n25];
                    final double n29 = this.field32915[n26 - 1];
                    final double n30 = this.field32915[n26];
                    final int n31 = n3 + k;
                    final int n32 = n4 + k;
                    final int n33 = n4 + n24;
                    final int n34 = n31 + n18;
                    final int n35 = n31 + n20;
                    final int n36 = n31 + n21;
                    final double n37 = array[n34 - 1];
                    final double n38 = array[n34];
                    final double n39 = array[n35 - 1];
                    final double n40 = array[n35];
                    final double n41 = array[n36 - 1];
                    final double n42 = array[n36];
                    final double n43 = n27 * n39 + n28 * n40;
                    final double n44 = n27 * n40 - n28 * n39;
                    final double n45 = n29 * n41 + n30 * n42;
                    final double n46 = n29 * n42 - n30 * n41;
                    final double n47 = n43 + n45;
                    final double n48 = n44 + n46;
                    final double n49 = n37 + -0.5 * n47;
                    final double n50 = n38 + -0.5 * n48;
                    final double n51 = 0.8660254037844387 * (n44 - n46);
                    final double n52 = 0.8660254037844387 * (n45 - n43);
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
    
    public void method26124(final long n, final long n2, final Class17 class17, final long n3, final Class17 class18, final long n4, final long n5) {
        final long n6 = n5 + n;
        final long n7 = n2 * n;
        for (long n8 = 0L; n8 < n2; ++n8) {
            final long n9 = n8 * n;
            final long n10 = 2L * n7;
            final long n11 = (3L * n8 + 1L) * n;
            final long n12 = n3 + n9;
            final long n13 = n12 + n7;
            final long n14 = n12 + n10;
            final double method137 = class17.method137(n12);
            final double method138 = class17.method137(n13);
            final double method139 = class17.method137(n14);
            final double n15 = method138 + method139;
            class18.method171(n4 + 3L * n9, method137 + n15);
            class18.method171(n4 + n11 + n, 0.8660254037844387 * (method139 - method138));
            class18.method171(n4 + n - 1L + n11, method137 + -0.5 * n15);
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
                    final double method140 = this.field32916.method137(n25 - 1L);
                    final double method141 = this.field32916.method137(n25);
                    final double method142 = this.field32916.method137(n26 - 1L);
                    final double method143 = this.field32916.method137(n26);
                    final long n27 = n3 + n23;
                    final long n28 = n4 + n23;
                    final long n29 = n4 + n24;
                    final long n30 = n27 + n17;
                    final long n31 = n27 + n19;
                    final long n32 = n27 + n20;
                    final double method144 = class17.method137(n30 - 1L);
                    final double method145 = class17.method137(n30);
                    final double method146 = class17.method137(n31 - 1L);
                    final double method147 = class17.method137(n31);
                    final double method148 = class17.method137(n32 - 1L);
                    final double method149 = class17.method137(n32);
                    final double n33 = method140 * method146 + method141 * method147;
                    final double n34 = method140 * method147 - method141 * method146;
                    final double n35 = method142 * method148 + method143 * method149;
                    final double n36 = method142 * method149 - method143 * method148;
                    final double n37 = n33 + n35;
                    final double n38 = n34 + n36;
                    final double n39 = method144 + -0.5 * n37;
                    final double n40 = method145 + -0.5 * n38;
                    final double n41 = 0.8660254037844387 * (n34 - n36);
                    final double n42 = 0.8660254037844387 * (n35 - n33);
                    final long n43 = n28 + n18;
                    final long n44 = n29 + n21;
                    final long n45 = n28 + n22;
                    class18.method171(n43 - 1L, method144 + n37);
                    class18.method171(n43, method145 + n38);
                    class18.method171(n44 - 1L, n39 - n41);
                    class18.method171(n44, n42 - n40);
                    class18.method171(n45 - 1L, n39 + n41);
                    class18.method171(n45, n40 + n42);
                }
            }
        }
    }
    
    public void method26125(final int n, final int n2, final double[] array, final int n3, final double[] array2, final int n4, final int n5) {
        final int n6 = n5 + n;
        for (int i = 0; i < n2; ++i) {
            final int n7 = i * n;
            final int n8 = n3 + 3 * n7;
            final int n9 = n8 + 2 * n;
            final double n10 = array[n8];
            final double n11 = 2.0 * array[n9 - 1];
            final double n12 = n10 + -0.5 * n11;
            final double n13 = 1.7320508075688774 * array[n9];
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
                    final double n28 = array[n25 - 1];
                    final double n29 = array[n25];
                    final double n30 = array[n26 - 1];
                    final double n31 = array[n26];
                    final double n32 = array[n27 - 1];
                    final double n33 = array[n27];
                    final double n34 = n30 + n32;
                    final double n35 = n28 + -0.5 * n34;
                    final double n36 = n31 - n33;
                    final double n37 = n29 + -0.5 * n36;
                    final double n38 = 0.8660254037844387 * (n30 - n32);
                    final double n39 = 0.8660254037844387 * (n31 + n33);
                    final double n40 = n35 - n39;
                    final double n41 = n35 + n39;
                    final double n42 = n37 + n38;
                    final double n43 = n37 - n38;
                    final int n44 = k - 1 + n5;
                    final int n45 = k - 1 + n6;
                    final double n46 = this.field32915[n44 - 1];
                    final double n47 = this.field32915[n44];
                    final double n48 = this.field32915[n45 - 1];
                    final double n49 = this.field32915[n45];
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
    
    public void method26126(final long n, final long n2, final Class17 class17, final long n3, final Class17 class18, final long n4, final long n5) {
        final long n6 = n5 + n;
        for (long n7 = 0L; n7 < n2; ++n7) {
            final long n8 = n7 * n;
            final long n9 = n3 + 3L * n8;
            final long n10 = n9 + 2L * n;
            final double method137 = class17.method137(n9);
            final double n11 = 2.0 * class17.method137(n10 - 1L);
            final double n12 = method137 + -0.5 * n11;
            final double n13 = 1.7320508075688774 * class17.method137(n10);
            class18.method171(n4 + n8, method137 + n11);
            class18.method171(n4 + (n7 + n2) * n, n12 - n13);
            class18.method171(n4 + (n7 + 2L * n2) * n, n12 + n13);
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
                    final double method138 = class17.method137(n27 - 1L);
                    final double method139 = class17.method137(n27);
                    final double method140 = class17.method137(n28 - 1L);
                    final double method141 = class17.method137(n28);
                    final double method142 = class17.method137(n29 - 1L);
                    final double method143 = class17.method137(n29);
                    final double n30 = method140 + method142;
                    final double n31 = method138 + -0.5 * n30;
                    final double n32 = method141 - method143;
                    final double n33 = method139 + -0.5 * n32;
                    final double n34 = 0.8660254037844387 * (method140 - method142);
                    final double n35 = 0.8660254037844387 * (method141 + method143);
                    final double n36 = n31 - n35;
                    final double n37 = n31 + n35;
                    final double n38 = n33 + n34;
                    final double n39 = n33 - n34;
                    final long n40 = n22 - 1L + n5;
                    final long n41 = n22 - 1L + n6;
                    final double method144 = this.field32916.method137(n40 - 1L);
                    final double method145 = this.field32916.method137(n40);
                    final double method146 = this.field32916.method137(n41 - 1L);
                    final double method147 = this.field32916.method137(n41);
                    final long n42 = n26 + n16;
                    final long n43 = n26 + n20;
                    final long n44 = n26 + n21;
                    class18.method171(n42 - 1L, method138 + n30);
                    class18.method171(n42, method139 + n32);
                    class18.method171(n43 - 1L, method144 * n36 - method145 * n38);
                    class18.method171(n43, method144 * n38 + method145 * n36);
                    class18.method171(n44 - 1L, method146 * n37 - method147 * n39);
                    class18.method171(n44, method146 * n39 + method147 * n37);
                }
            }
        }
    }
    
    public void method26127(final int n, final int n2, final double[] array, final int n3, final double[] array2, final int n4, final int n5) {
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
            final double n15 = array[n3 + n9];
            final double n16 = array[n3 + n11];
            final double n17 = array[n3 + n12];
            final double n18 = array[n3 + n13];
            final double n19 = n16 + n18;
            final double n20 = n15 + n17;
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
                        final double n35 = this.field32915[n32 - 1];
                        final double n36 = this.field32915[n32];
                        final double n37 = this.field32915[n33 - 1];
                        final double n38 = this.field32915[n33];
                        final double n39 = this.field32915[n34 - 1];
                        final double n40 = this.field32915[n34];
                        final int n41 = n3 + k;
                        final int n42 = n4 + k;
                        final int n43 = n4 + n31;
                        final int n44 = n41 + n23;
                        final int n45 = n41 + n24;
                        final int n46 = n41 + n25;
                        final int n47 = n41 + n26;
                        final double n48 = array[n44 - 1];
                        final double n49 = array[n44];
                        final double n50 = array[n45 - 1];
                        final double n51 = array[n45];
                        final double n52 = array[n46 - 1];
                        final double n53 = array[n46];
                        final double n54 = array[n47 - 1];
                        final double n55 = array[n47];
                        final double n56 = n35 * n50 + n36 * n51;
                        final double n57 = n35 * n51 - n36 * n50;
                        final double n58 = n37 * n52 + n38 * n53;
                        final double n59 = n37 * n53 - n38 * n52;
                        final double n60 = n39 * n54 + n40 * n55;
                        final double n61 = n39 * n55 - n40 * n54;
                        final double n62 = n56 + n60;
                        final double n63 = n60 - n56;
                        final double n64 = n57 + n61;
                        final double n65 = n57 - n61;
                        final double n66 = n49 + n59;
                        final double n67 = n49 - n59;
                        final double n68 = n48 + n58;
                        final double n69 = n48 - n58;
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
                final double n84 = array[n82 - 1 + n74];
                final double n85 = array[n82 - 1 + n76];
                final double n86 = array[n82 - 1 + n77];
                final double n87 = array[n82 - 1 + n78];
                final double n88 = -0.7071067811865476 * (n85 + n87);
                final double n89 = 0.7071067811865476 * (n85 - n87);
                array2[n83 - 1 + n75] = n89 + n84;
                array2[n83 - 1 + n80] = n84 - n89;
                array2[n4 + n79] = n88 - n86;
                array2[n4 + n81] = n88 + n86;
            }
        }
    }
    
    public void method26128(final long n, final long n2, final Class17 class17, final long n3, final Class17 class18, final long n4, final long n5) {
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
            final double method137 = class17.method137(n3 + n10);
            final double method138 = class17.method137(n3 + n12);
            final double method139 = class17.method137(n3 + n13);
            final double method140 = class17.method137(n3 + n14);
            final double n16 = method138 + method140;
            final double n17 = method137 + method139;
            final long n18 = n4 + n11;
            final long n19 = n4 + n15 + n;
            class18.method171(n18, n16 + n17);
            class18.method171(n19 - 1L + n + n, n17 - n16);
            class18.method171(n19 - 1L, method137 - method139);
            class18.method171(n19, method140 - method138);
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
                        final double method141 = this.field32916.method137(n31 - 1L);
                        final double method142 = this.field32916.method137(n31);
                        final double method143 = this.field32916.method137(n32 - 1L);
                        final double method144 = this.field32916.method137(n32);
                        final double method145 = this.field32916.method137(n33 - 1L);
                        final double method146 = this.field32916.method137(n33);
                        final long n34 = n3 + n29;
                        final long n35 = n4 + n29;
                        final long n36 = n4 + n30;
                        final long n37 = n34 + n21;
                        final long n38 = n34 + n22;
                        final long n39 = n34 + n23;
                        final long n40 = n34 + n24;
                        final double method147 = class17.method137(n37 - 1L);
                        final double method148 = class17.method137(n37);
                        final double method149 = class17.method137(n38 - 1L);
                        final double method150 = class17.method137(n38);
                        final double method151 = class17.method137(n39 - 1L);
                        final double method152 = class17.method137(n39);
                        final double method153 = class17.method137(n40 - 1L);
                        final double method154 = class17.method137(n40);
                        final double n41 = method141 * method149 + method142 * method150;
                        final double n42 = method141 * method150 - method142 * method149;
                        final double n43 = method143 * method151 + method144 * method152;
                        final double n44 = method143 * method152 - method144 * method151;
                        final double n45 = method145 * method153 + method146 * method154;
                        final double n46 = method145 * method154 - method146 * method153;
                        final double n47 = n41 + n45;
                        final double n48 = n45 - n41;
                        final double n49 = n42 + n46;
                        final double n50 = n42 - n46;
                        final double n51 = method148 + n44;
                        final double n52 = method148 - n44;
                        final double n53 = method147 + n43;
                        final double n54 = method147 - n43;
                        final long n55 = n35 + n25;
                        final long n56 = n36 + n26;
                        final long n57 = n35 + n27;
                        final long n58 = n36 + n28;
                        class18.method171(n55 - 1L, n47 + n53);
                        class18.method171(n58 - 1L, n53 - n47);
                        class18.method171(n55, n49 + n51);
                        class18.method171(n58, n49 - n51);
                        class18.method171(n57 - 1L, n50 + n54);
                        class18.method171(n56 - 1L, n54 - n50);
                        class18.method171(n57, n48 + n52);
                        class18.method171(n56, n48 - n52);
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
                final double method155 = class17.method137(n68 - 1L + n60);
                final double method156 = class17.method137(n68 - 1L + n62);
                final double method157 = class17.method137(n68 - 1L + n63);
                final double method158 = class17.method137(n68 - 1L + n64);
                final double n70 = -0.7071067811865476 * (method156 + method158);
                final double n71 = 0.7071067811865476 * (method156 - method158);
                class18.method171(n69 - 1L + n61, n71 + method155);
                class18.method171(n69 - 1L + n66, method155 - n71);
                class18.method171(n4 + n65, n70 - method157);
                class18.method171(n4 + n67, n70 + method157);
            }
        }
    }
    
    public void method26129(final int n, final int n2, final double[] array, final int n3, final double[] array2, final int n4, final int n5) {
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
            final double n17 = array[n3 + n10];
            final double n18 = array[n3 + n15];
            final double n19 = array[n3 + n - 1 + n16];
            final double n20 = array[n3 + n - 1 + n14];
            final double n21 = n17 - n19;
            final double n22 = n17 + n19;
            final double n23 = n20 + n20;
            final double n24 = n18 + n18;
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
                        final double n37 = this.field32915[n34 - 1];
                        final double n38 = this.field32915[n34];
                        final double n39 = this.field32915[n35 - 1];
                        final double n40 = this.field32915[n35];
                        final double n41 = this.field32915[n36 - 1];
                        final double n42 = this.field32915[n36];
                        final int n43 = n3 + k;
                        final int n44 = n3 + n33;
                        final int n45 = n4 + k;
                        final int n46 = n43 + n29;
                        final int n47 = n44 + n30;
                        final int n48 = n43 + n31;
                        final int n49 = n44 + n32;
                        final double n50 = array[n46 - 1];
                        final double n51 = array[n46];
                        final double n52 = array[n47 - 1];
                        final double n53 = array[n47];
                        final double n54 = array[n48 - 1];
                        final double n55 = array[n48];
                        final double n56 = array[n49 - 1];
                        final double n57 = array[n49];
                        final double n58 = n51 + n57;
                        final double n59 = n51 - n57;
                        final double n60 = n55 - n53;
                        final double n61 = n55 + n53;
                        final double n62 = n50 - n56;
                        final double n63 = n50 + n56;
                        final double n64 = n54 - n52;
                        final double n65 = n54 + n52;
                        final double n66 = n63 - n65;
                        final double n67 = n59 - n60;
                        final double n68 = n62 - n61;
                        final double n69 = n62 + n61;
                        final double n70 = n58 + n64;
                        final double n71 = n58 - n64;
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
                final double n86 = array[n84 - 1 + n77];
                final double n87 = array[n84 - 1 + n82];
                final double n88 = array[n3 + n81];
                final double n89 = array[n3 + n83];
                final double n90 = n88 + n89;
                final double n91 = n89 - n88;
                final double n92 = n86 - n87;
                final double n93 = n86 + n87;
                array2[n85 - 1 + n76] = n93 + n93;
                array2[n85 - 1 + n78] = 1.4142135623730951 * (n92 - n90);
                array2[n85 - 1 + n79] = n91 + n91;
                array2[n85 - 1 + n80] = -1.4142135623730951 * (n92 + n90);
            }
        }
    }
    
    public void method26130(final long n, final long n2, final Class17 class17, final long n3, final Class17 class18, final long n4, final long n5) {
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
            final double method137 = class17.method137(n3 + n11);
            final double method138 = class17.method137(n3 + n16);
            final double method139 = class17.method137(n3 + n - 1L + n17);
            final double method140 = class17.method137(n3 + n - 1L + n15);
            final double n18 = method137 - method139;
            final double n19 = method137 + method139;
            final double n20 = method140 + method140;
            final double n21 = method138 + method138;
            class18.method171(n4 + n10, n19 + n20);
            class18.method171(n4 + n12, n18 - n21);
            class18.method171(n4 + n13, n19 - n20);
            class18.method171(n4 + n14, n18 + n21);
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
                        final double method141 = this.field32916.method137(n33 - 1L);
                        final double method142 = this.field32916.method137(n33);
                        final double method143 = this.field32916.method137(n34 - 1L);
                        final double method144 = this.field32916.method137(n34);
                        final double method145 = this.field32916.method137(n35 - 1L);
                        final double method146 = this.field32916.method137(n35);
                        final long n36 = n3 + n31;
                        final long n37 = n3 + n32;
                        final long n38 = n4 + n31;
                        final long n39 = n36 + n27;
                        final long n40 = n37 + n28;
                        final long n41 = n36 + n29;
                        final long n42 = n37 + n30;
                        final double method147 = class17.method137(n39 - 1L);
                        final double method148 = class17.method137(n39);
                        final double method149 = class17.method137(n40 - 1L);
                        final double method150 = class17.method137(n40);
                        final double method151 = class17.method137(n41 - 1L);
                        final double method152 = class17.method137(n41);
                        final double method153 = class17.method137(n42 - 1L);
                        final double method154 = class17.method137(n42);
                        final double n43 = method148 + method154;
                        final double n44 = method148 - method154;
                        final double n45 = method152 - method150;
                        final double n46 = method152 + method150;
                        final double n47 = method147 - method153;
                        final double n48 = method147 + method153;
                        final double n49 = method151 - method149;
                        final double n50 = method151 + method149;
                        final double n51 = n48 - n50;
                        final double n52 = n44 - n45;
                        final double n53 = n47 - n46;
                        final double n54 = n47 + n46;
                        final double n55 = n43 + n49;
                        final double n56 = n43 - n49;
                        final long n57 = n38 + n23;
                        final long n58 = n38 + n24;
                        final long n59 = n38 + n25;
                        final long n60 = n38 + n26;
                        class18.method171(n57 - 1L, n48 + n50);
                        class18.method171(n57, n44 + n45);
                        class18.method171(n58 - 1L, method141 * n53 - method142 * n55);
                        class18.method171(n58, method141 * n55 + method142 * n53);
                        class18.method171(n59 - 1L, method143 * n51 - method144 * n52);
                        class18.method171(n59, method143 * n52 + method144 * n51);
                        class18.method171(n60 - 1L, method145 * n54 - method146 * n56);
                        class18.method171(n60, method145 * n56 + method146 * n54);
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
                final double method155 = class17.method137(n70 - 1L + n63);
                final double method156 = class17.method137(n70 - 1L + n68);
                final double method157 = class17.method137(n3 + n67);
                final double method158 = class17.method137(n3 + n69);
                final double n72 = method157 + method158;
                final double n73 = method158 - method157;
                final double n74 = method155 - method156;
                final double n75 = method155 + method156;
                class18.method171(n71 - 1L + n62, n75 + n75);
                class18.method171(n71 - 1L + n64, 1.4142135623730951 * (n74 - n72));
                class18.method171(n71 - 1L + n65, n73 + n73);
                class18.method171(n71 - 1L + n66, -1.4142135623730951 * (n74 + n72));
            }
        }
    }
    
    public void method26131(final int n, final int n2, final double[] array, final int n3, final double[] array2, final int n4, final int n5) {
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
            final double n21 = array[n3 + n10];
            final double n22 = array[n3 + n16];
            final double n23 = array[n3 + n17];
            final double n24 = array[n3 + n18];
            final double n25 = array[n3 + n19];
            final double n26 = n25 + n22;
            final double n27 = n25 - n22;
            final double n28 = n24 + n23;
            final double n29 = n24 - n23;
            array2[n4 + n11] = n21 + n26 + n28;
            array2[n20 + n12] = n21 + 0.30901699437494745 * n26 + -0.8090169943749473 * n28;
            array2[n4 + n13] = 0.9510565162951535 * n27 + 0.5877852522924732 * n29;
            array2[n20 + n14] = n21 + -0.8090169943749473 * n26 + 0.30901699437494745 * n28;
            array2[n4 + n15] = 0.5877852522924732 * n27 - 0.9510565162951535 * n29;
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
                    final double n44 = this.field32915[n40 - 1];
                    final double n45 = this.field32915[n40];
                    final double n46 = this.field32915[n41 - 1];
                    final double n47 = this.field32915[n41];
                    final double n48 = this.field32915[n42 - 1];
                    final double n49 = this.field32915[n42];
                    final double n50 = this.field32915[n43 - 1];
                    final double n51 = this.field32915[n43];
                    final int n52 = n - k;
                    final int n53 = n3 + k;
                    final int n54 = n4 + k;
                    final int n55 = n4 + n52;
                    final int n56 = n53 + n30;
                    final int n57 = n53 + n36;
                    final int n58 = n53 + n37;
                    final int n59 = n53 + n38;
                    final int n60 = n53 + n39;
                    final double n61 = array[n56 - 1];
                    final double n62 = array[n56];
                    final double n63 = array[n57 - 1];
                    final double n64 = array[n57];
                    final double n65 = array[n58 - 1];
                    final double n66 = array[n58];
                    final double n67 = array[n59 - 1];
                    final double n68 = array[n59];
                    final double n69 = array[n60 - 1];
                    final double n70 = array[n60];
                    final double n71 = n44 * n63 + n45 * n64;
                    final double n72 = n44 * n64 - n45 * n63;
                    final double n73 = n46 * n65 + n47 * n66;
                    final double n74 = n46 * n66 - n47 * n65;
                    final double n75 = n48 * n67 + n49 * n68;
                    final double n76 = n48 * n68 - n49 * n67;
                    final double n77 = n50 * n69 + n51 * n70;
                    final double n78 = n50 * n70 - n51 * n69;
                    final double n79 = n71 + n77;
                    final double n80 = n77 - n71;
                    final double n81 = n72 - n78;
                    final double n82 = n72 + n78;
                    final double n83 = n73 + n75;
                    final double n84 = n75 - n73;
                    final double n85 = n74 - n76;
                    final double n86 = n74 + n76;
                    final double n87 = n61 + 0.30901699437494745 * n79 + -0.8090169943749473 * n83;
                    final double n88 = n62 + 0.30901699437494745 * n82 + -0.8090169943749473 * n86;
                    final double n89 = n61 + -0.8090169943749473 * n79 + 0.30901699437494745 * n83;
                    final double n90 = n62 + -0.8090169943749473 * n82 + 0.30901699437494745 * n86;
                    final double n91 = 0.9510565162951535 * n81 + 0.5877852522924732 * n85;
                    final double n92 = 0.9510565162951535 * n80 + 0.5877852522924732 * n84;
                    final double n93 = 0.5877852522924732 * n81 - 0.9510565162951535 * n85;
                    final double n94 = 0.5877852522924732 * n80 - 0.9510565162951535 * n84;
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
    
    public void method26132(final long n, final long n2, final Class17 class17, final long n3, final Class17 class18, final long n4, final long n5) {
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
            final double method137 = class17.method137(n3 + n11);
            final double method138 = class17.method137(n3 + n17);
            final double method139 = class17.method137(n3 + n18);
            final double method140 = class17.method137(n3 + n19);
            final double method141 = class17.method137(n3 + n20);
            final double n22 = method141 + method138;
            final double n23 = method141 - method138;
            final double n24 = method140 + method139;
            final double n25 = method140 - method139;
            class18.method171(n4 + n12, method137 + n22 + n24);
            class18.method171(n21 + n13, method137 + 0.30901699437494745 * n22 + -0.8090169943749473 * n24);
            class18.method171(n4 + n14, 0.9510565162951535 * n23 + 0.5877852522924732 * n25);
            class18.method171(n21 + n15, method137 + -0.8090169943749473 * n22 + 0.30901699437494745 * n24);
            class18.method171(n4 + n16, 0.5877852522924732 * n23 - 0.9510565162951535 * n25);
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
                    final double method142 = this.field32916.method137(n38 - 1L);
                    final double method143 = this.field32916.method137(n38);
                    final double method144 = this.field32916.method137(n39 - 1L);
                    final double method145 = this.field32916.method137(n39);
                    final double method146 = this.field32916.method137(n40 - 1L);
                    final double method147 = this.field32916.method137(n40);
                    final double method148 = this.field32916.method137(n41 - 1L);
                    final double method149 = this.field32916.method137(n41);
                    final long n42 = n - n37;
                    final long n43 = n3 + n37;
                    final long n44 = n4 + n37;
                    final long n45 = n4 + n42;
                    final long n46 = n43 + n27;
                    final long n47 = n43 + n33;
                    final long n48 = n43 + n34;
                    final long n49 = n43 + n35;
                    final long n50 = n43 + n36;
                    final double method150 = class17.method137(n46 - 1L);
                    final double method151 = class17.method137(n46);
                    final double method152 = class17.method137(n47 - 1L);
                    final double method153 = class17.method137(n47);
                    final double method154 = class17.method137(n48 - 1L);
                    final double method155 = class17.method137(n48);
                    final double method156 = class17.method137(n49 - 1L);
                    final double method157 = class17.method137(n49);
                    final double method158 = class17.method137(n50 - 1L);
                    final double method159 = class17.method137(n50);
                    final double n51 = method142 * method152 + method143 * method153;
                    final double n52 = method142 * method153 - method143 * method152;
                    final double n53 = method144 * method154 + method145 * method155;
                    final double n54 = method144 * method155 - method145 * method154;
                    final double n55 = method146 * method156 + method147 * method157;
                    final double n56 = method146 * method157 - method147 * method156;
                    final double n57 = method148 * method158 + method149 * method159;
                    final double n58 = method148 * method159 - method149 * method158;
                    final double n59 = n51 + n57;
                    final double n60 = n57 - n51;
                    final double n61 = n52 - n58;
                    final double n62 = n52 + n58;
                    final double n63 = n53 + n55;
                    final double n64 = n55 - n53;
                    final double n65 = n54 - n56;
                    final double n66 = n54 + n56;
                    final double n67 = method150 + 0.30901699437494745 * n59 + -0.8090169943749473 * n63;
                    final double n68 = method151 + 0.30901699437494745 * n62 + -0.8090169943749473 * n66;
                    final double n69 = method150 + -0.8090169943749473 * n59 + 0.30901699437494745 * n63;
                    final double n70 = method151 + -0.8090169943749473 * n62 + 0.30901699437494745 * n66;
                    final double n71 = 0.9510565162951535 * n61 + 0.5877852522924732 * n65;
                    final double n72 = 0.9510565162951535 * n60 + 0.5877852522924732 * n64;
                    final double n73 = 0.5877852522924732 * n61 - 0.9510565162951535 * n65;
                    final double n74 = 0.5877852522924732 * n60 - 0.9510565162951535 * n64;
                    final long n75 = n44 + n28;
                    final long n76 = n45 + n29;
                    final long n77 = n44 + n30;
                    final long n78 = n45 + n31;
                    final long n79 = n44 + n32;
                    class18.method171(n75 - 1L, method150 + n59 + n63);
                    class18.method171(n75, method151 + n62 + n66);
                    class18.method171(n77 - 1L, n67 + n71);
                    class18.method171(n76 - 1L, n67 - n71);
                    class18.method171(n77, n68 + n72);
                    class18.method171(n76, n72 - n68);
                    class18.method171(n79 - 1L, n69 + n73);
                    class18.method171(n78 - 1L, n69 - n73);
                    class18.method171(n79, n70 + n74);
                    class18.method171(n78, n74 - n70);
                }
            }
        }
    }
    
    public void method26133(final int n, final int n2, final double[] array, final int n3, final double[] array2, final int n4, final int n5) {
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
            final double n21 = array[n3 + n11];
            final double n22 = 2.0 * array[n3 + n13];
            final double n23 = 2.0 * array[n3 + n15];
            final double n24 = 2.0 * array[n20 + n12];
            final double n25 = 2.0 * array[n20 + n14];
            final double n26 = n21 + 0.30901699437494745 * n24 + -0.8090169943749473 * n25;
            final double n27 = n21 + -0.8090169943749473 * n24 + 0.30901699437494745 * n25;
            final double n28 = 0.9510565162951535 * n22 + 0.5877852522924732 * n23;
            final double n29 = 0.5877852522924732 * n22 - 0.9510565162951535 * n23;
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
                    final double n45 = this.field32915[n41 - 1];
                    final double n46 = this.field32915[n41];
                    final double n47 = this.field32915[n42 - 1];
                    final double n48 = this.field32915[n42];
                    final double n49 = this.field32915[n43 - 1];
                    final double n50 = this.field32915[n43];
                    final double n51 = this.field32915[n44 - 1];
                    final double n52 = this.field32915[n44];
                    final int n53 = n3 + k;
                    final int n54 = n3 + n40;
                    final int n55 = n4 + k;
                    final int n56 = n53 + n31;
                    final int n57 = n54 + n32;
                    final int n58 = n53 + n33;
                    final int n59 = n54 + n34;
                    final int n60 = n53 + n35;
                    final double n61 = array[n56 - 1];
                    final double n62 = array[n56];
                    final double n63 = array[n57 - 1];
                    final double n64 = array[n57];
                    final double n65 = array[n58 - 1];
                    final double n66 = array[n58];
                    final double n67 = array[n59 - 1];
                    final double n68 = array[n59];
                    final double n69 = array[n60 - 1];
                    final double n70 = array[n60];
                    final double n71 = n66 + n64;
                    final double n72 = n66 - n64;
                    final double n73 = n70 + n68;
                    final double n74 = n70 - n68;
                    final double n75 = n65 - n63;
                    final double n76 = n65 + n63;
                    final double n77 = n69 - n67;
                    final double n78 = n69 + n67;
                    final double n79 = n61 + 0.30901699437494745 * n76 + -0.8090169943749473 * n78;
                    final double n80 = n62 + 0.30901699437494745 * n72 + -0.8090169943749473 * n74;
                    final double n81 = n61 + -0.8090169943749473 * n76 + 0.30901699437494745 * n78;
                    final double n82 = n62 + -0.8090169943749473 * n72 + 0.30901699437494745 * n74;
                    final double n83 = 0.9510565162951535 * n75 + 0.5877852522924732 * n77;
                    final double n84 = 0.9510565162951535 * n71 + 0.5877852522924732 * n73;
                    final double n85 = 0.5877852522924732 * n75 - 0.9510565162951535 * n77;
                    final double n86 = 0.5877852522924732 * n71 - 0.9510565162951535 * n73;
                    final double n87 = n81 - n86;
                    final double n88 = n81 + n86;
                    final double n89 = n82 + n85;
                    final double n90 = n82 - n85;
                    final double n91 = n79 + n84;
                    final double n92 = n79 - n84;
                    final double n93 = n80 - n83;
                    final double n94 = n80 + n83;
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
    
    public void method26134(final long n, final long n2, final Class17 class17, final long n3, final Class17 class18, final long n4, final long n5) {
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
            final double method137 = class17.method137(n3 + n12);
            final double n22 = 2.0 * class17.method137(n3 + n14);
            final double n23 = 2.0 * class17.method137(n3 + n16);
            final double n24 = 2.0 * class17.method137(n21 + n13);
            final double n25 = 2.0 * class17.method137(n21 + n15);
            final double n26 = method137 + 0.30901699437494745 * n24 + -0.8090169943749473 * n25;
            final double n27 = method137 + -0.8090169943749473 * n24 + 0.30901699437494745 * n25;
            final double n28 = 0.9510565162951535 * n22 + 0.5877852522924732 * n23;
            final double n29 = 0.5877852522924732 * n22 - 0.9510565162951535 * n23;
            class18.method171(n4 + n11, method137 + n24 + n25);
            class18.method171(n4 + n17, n26 - n28);
            class18.method171(n4 + n18, n27 - n29);
            class18.method171(n4 + n19, n27 + n29);
            class18.method171(n4 + n20, n26 + n28);
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
                    final double method138 = this.field32916.method137(n43 - 1L);
                    final double method139 = this.field32916.method137(n43);
                    final double method140 = this.field32916.method137(n44 - 1L);
                    final double method141 = this.field32916.method137(n44);
                    final double method142 = this.field32916.method137(n45 - 1L);
                    final double method143 = this.field32916.method137(n45);
                    final double method144 = this.field32916.method137(n46 - 1L);
                    final double method145 = this.field32916.method137(n46);
                    final long n47 = n3 + n41;
                    final long n48 = n3 + n42;
                    final long n49 = n4 + n41;
                    final long n50 = n47 + n32;
                    final long n51 = n48 + n33;
                    final long n52 = n47 + n34;
                    final long n53 = n48 + n35;
                    final long n54 = n47 + n36;
                    final double method146 = class17.method137(n50 - 1L);
                    final double method147 = class17.method137(n50);
                    final double method148 = class17.method137(n51 - 1L);
                    final double method149 = class17.method137(n51);
                    final double method150 = class17.method137(n52 - 1L);
                    final double method151 = class17.method137(n52);
                    final double method152 = class17.method137(n53 - 1L);
                    final double method153 = class17.method137(n53);
                    final double method154 = class17.method137(n54 - 1L);
                    final double method155 = class17.method137(n54);
                    final double n55 = method151 + method149;
                    final double n56 = method151 - method149;
                    final double n57 = method155 + method153;
                    final double n58 = method155 - method153;
                    final double n59 = method150 - method148;
                    final double n60 = method150 + method148;
                    final double n61 = method154 - method152;
                    final double n62 = method154 + method152;
                    final double n63 = method146 + 0.30901699437494745 * n60 + -0.8090169943749473 * n62;
                    final double n64 = method147 + 0.30901699437494745 * n56 + -0.8090169943749473 * n58;
                    final double n65 = method146 + -0.8090169943749473 * n60 + 0.30901699437494745 * n62;
                    final double n66 = method147 + -0.8090169943749473 * n56 + 0.30901699437494745 * n58;
                    final double n67 = 0.9510565162951535 * n59 + 0.5877852522924732 * n61;
                    final double n68 = 0.9510565162951535 * n55 + 0.5877852522924732 * n57;
                    final double n69 = 0.5877852522924732 * n59 - 0.9510565162951535 * n61;
                    final double n70 = 0.5877852522924732 * n55 - 0.9510565162951535 * n57;
                    final double n71 = n65 - n70;
                    final double n72 = n65 + n70;
                    final double n73 = n66 + n69;
                    final double n74 = n66 - n69;
                    final double n75 = n63 + n68;
                    final double n76 = n63 - n68;
                    final double n77 = n64 - n67;
                    final double n78 = n64 + n67;
                    final long n79 = n49 + n31;
                    final long n80 = n49 + n37;
                    final long n81 = n49 + n38;
                    final long n82 = n49 + n39;
                    final long n83 = n49 + n40;
                    class18.method171(n79 - 1L, method146 + n60 + n62);
                    class18.method171(n79, method147 + n56 + n58);
                    class18.method171(n80 - 1L, method138 * n76 - method139 * n78);
                    class18.method171(n80, method138 * n78 + method139 * n76);
                    class18.method171(n81 - 1L, method140 * n71 - method141 * n73);
                    class18.method171(n81, method140 * n73 + method141 * n71);
                    class18.method171(n82 - 1L, method142 * n72 - method143 * n74);
                    class18.method171(n82, method142 * n74 + method143 * n72);
                    class18.method171(n83 - 1L, method144 * n75 - method145 * n77);
                    class18.method171(n83, method144 * n77 + method145 * n75);
                }
            }
        }
    }
    
    public void method26135(final int n, final int n2, final int n3, final int n4, final double[] array, final int n5, final double[] array2, final int n6, final int n7) {
        final double n8 = 6.283185307179586 / n2;
        final double method24103 = Class7640.method24103(n8);
        final double method24104 = Class7640.method24102(n8);
        final int n9 = (n2 + 1) / 2;
        final int n10 = (n - 1) / 2;
        if (n == 1) {
            System.arraycopy(array2, n6, array, n5, n4);
        }
        else {
            if (n4 >= 0) System.arraycopy(array, n5 + 0, array2, n6 + 0, n4);
            for (int j = 1; j < n2; ++j) {
                final int n11 = j * n3 * n;
                for (int k = 0; k < n3; ++k) {
                    final int n12 = k * n + n11;
                    array2[n6 + n12] = array[n5 + n12];
                }
            }
            if (n10 > n3) {
                int n13 = -n;
                for (int l = 1; l < n2; ++l) {
                    n13 += n;
                    final int n14 = l * n3 * n;
                    for (int n15 = 0; n15 < n3; ++n15) {
                        int n16 = n13 - 1;
                        final int n17 = n15 * n + n14;
                        for (int n18 = 2; n18 < n; n18 += 2) {
                            n16 += 2;
                            final int n19 = n16 + n7;
                            final double n20 = this.field32915[n19 - 1];
                            final double n21 = this.field32915[n19];
                            final int n22 = n6 + n18 + n17;
                            final int n23 = n5 + n18 + n17;
                            final double n24 = array[n23 - 1];
                            final double n25 = array[n23];
                            array2[n22 - 1] = n20 * n24 + n21 * n25;
                            array2[n22] = n20 * n25 - n21 * n24;
                        }
                    }
                }
            }
            else {
                int n26 = -n;
                for (int n27 = 1; n27 < n2; ++n27) {
                    n26 += n;
                    int n28 = n26 - 1;
                    final int n29 = n27 * n3 * n;
                    for (int n30 = 2; n30 < n; n30 += 2) {
                        n28 += 2;
                        final int n31 = n28 + n7;
                        final int n32 = n5 + n30;
                        final int n33 = n6 + n30;
                        final double n34 = this.field32915[n31 - 1];
                        final double n35 = this.field32915[n31];
                        for (int n36 = 0; n36 < n3; ++n36) {
                            final int n37 = n36 * n + n29;
                            final int n38 = n33 + n37;
                            final int n39 = n32 + n37;
                            final double n40 = array[n39 - 1];
                            final double n41 = array[n39];
                            array2[n38 - 1] = n34 * n40 + n35 * n41;
                            array2[n38] = n34 * n41 - n35 * n40;
                        }
                    }
                }
            }
            if (n10 < n3) {
                for (int n42 = 1; n42 < n9; ++n42) {
                    final int n43 = n2 - n42;
                    final int n44 = n42 * n3 * n;
                    final int n45 = n43 * n3 * n;
                    for (int n46 = 2; n46 < n; n46 += 2) {
                        final int n47 = n5 + n46;
                        final int n48 = n6 + n46;
                        for (int n49 = 0; n49 < n3; ++n49) {
                            final int n50 = n49 * n + n44;
                            final int n51 = n49 * n + n45;
                            final int n52 = n47 + n50;
                            final int n53 = n47 + n51;
                            final int n54 = n48 + n50;
                            final int n55 = n48 + n51;
                            final double n56 = array2[n54 - 1];
                            final double n57 = array2[n54];
                            final double n58 = array2[n55 - 1];
                            final double n59 = array2[n55];
                            array[n52 - 1] = n56 + n58;
                            array[n52] = n57 + n59;
                            array[n53 - 1] = n57 - n59;
                            array[n53] = n58 - n56;
                        }
                    }
                }
            }
            else {
                for (int n60 = 1; n60 < n9; ++n60) {
                    final int n61 = n2 - n60;
                    final int n62 = n60 * n3 * n;
                    final int n63 = n61 * n3 * n;
                    for (int n64 = 0; n64 < n3; ++n64) {
                        final int n65 = n64 * n + n62;
                        final int n66 = n64 * n + n63;
                        for (int n67 = 2; n67 < n; n67 += 2) {
                            final int n68 = n5 + n67;
                            final int n69 = n6 + n67;
                            final int n70 = n68 + n65;
                            final int n71 = n68 + n66;
                            final int n72 = n69 + n65;
                            final int n73 = n69 + n66;
                            final double n74 = array2[n72 - 1];
                            final double n75 = array2[n72];
                            final double n76 = array2[n73 - 1];
                            final double n77 = array2[n73];
                            array[n70 - 1] = n74 + n76;
                            array[n70] = n75 + n77;
                            array[n71 - 1] = n75 - n77;
                            array[n71] = n76 - n74;
                        }
                    }
                }
            }
        }
        for (int n78 = 1; n78 < n9; ++n78) {
            final int n79 = n2 - n78;
            final int n80 = n78 * n3 * n;
            final int n81 = n79 * n3 * n;
            for (int n82 = 0; n82 < n3; ++n82) {
                final int n83 = n82 * n + n80;
                final int n84 = n82 * n + n81;
                final int n85 = n6 + n83;
                final int n86 = n6 + n84;
                final double n87 = array2[n85];
                final double n88 = array2[n86];
                array[n5 + n83] = n87 + n88;
                array[n5 + n84] = n88 - n87;
            }
        }
        double n89 = 1.0;
        double n90 = 0.0;
        final int n91 = (n2 - 1) * n4;
        for (int n92 = 1; n92 < n9; ++n92) {
            final int n93 = n2 - n92;
            final double n94 = method24103 * n89 - method24104 * n90;
            n90 = method24103 * n90 + method24104 * n89;
            n89 = n94;
            final int n95 = n92 * n4;
            final int n96 = n93 * n4;
            for (int n97 = 0; n97 < n4; ++n97) {
                final int n98 = n6 + n97;
                final int n99 = n5 + n97;
                array2[n98 + n95] = array[n99] + n89 * array[n99 + n4];
                array2[n98 + n96] = n90 * array[n99 + n91];
            }
            final double n100 = n89;
            final double n101 = n90;
            double n102 = n89;
            double n103 = n90;
            for (int n104 = 2; n104 < n9; ++n104) {
                final int n105 = n2 - n104;
                final double n106 = n100 * n102 - n101 * n103;
                n103 = n100 * n103 + n101 * n102;
                n102 = n106;
                final int n107 = n104 * n4;
                final int n108 = n105 * n4;
                for (int n109 = 0; n109 < n4; ++n109) {
                    final int n110 = n6 + n109;
                    final int n111 = n5 + n109;
                    final int n112 = n110 + n95;
                    array2[n112] += n102 * array[n111 + n107];
                    final int n113 = n110 + n96;
                    array2[n113] += n103 * array[n111 + n108];
                }
            }
        }
        for (int n114 = 1; n114 < n9; ++n114) {
            final int n115 = n114 * n4;
            for (int n116 = 0; n116 < n4; ++n116) {
                final int n117 = n6 + n116;
                array2[n117] += array[n5 + n116 + n115];
            }
        }
        if (n < n3) {
            for (int n118 = 0; n118 < n; ++n118) {
                for (int n119 = 0; n119 < n3; ++n119) {
                    final int n120 = n119 * n;
                    array[n5 + n118 + n120 * n2] = array2[n6 + n118 + n120];
                }
            }
        }
        else {
            for (int n121 = 0; n121 < n3; ++n121) {
                final int n122 = n121 * n;
                final int n123 = n122 * n2;
                for (int n124 = 0; n124 < n; ++n124) {
                    array[n5 + n124 + n123] = array2[n6 + n124 + n122];
                }
            }
        }
        final int n125 = n2 * n;
        for (int n126 = 1; n126 < n9; ++n126) {
            final int n127 = n2 - n126;
            final int n128 = 2 * n126;
            final int n129 = n126 * n3 * n;
            final int n130 = n127 * n3 * n;
            final int n131 = n128 * n;
            for (int n132 = 0; n132 < n3; ++n132) {
                final int n133 = n132 * n;
                final int n134 = n133 + n129;
                final int n135 = n133 + n130;
                final int n136 = n132 * n125;
                array[n5 + n - 1 + n131 - n + n136] = array2[n6 + n134];
                array[n5 + n131 + n136] = array2[n6 + n135];
            }
        }
        if (n != 1) {
            if (n10 < n3) {
                for (int n137 = 1; n137 < n9; ++n137) {
                    final int n138 = n2 - n137;
                    final int n139 = 2 * n137;
                    final int n140 = n137 * n3 * n;
                    final int n141 = n138 * n3 * n;
                    final int n142 = n139 * n;
                    for (int n143 = 2; n143 < n; n143 += 2) {
                        final int n144 = n - n143;
                        final int n145 = n5 + n143;
                        final int n146 = n5 + n144;
                        final int n147 = n6 + n143;
                        for (int n148 = 0; n148 < n3; ++n148) {
                            final int n149 = n148 * n125;
                            final int n150 = n148 * n;
                            final int n151 = n145 + n142 + n149;
                            final int n152 = n146 + n142 - n + n149;
                            final int n153 = n147 + n150 + n140;
                            final int n154 = n147 + n150 + n141;
                            final double n155 = array2[n153 - 1];
                            final double n156 = array2[n153];
                            final double n157 = array2[n154 - 1];
                            final double n158 = array2[n154];
                            array[n151 - 1] = n155 + n157;
                            array[n152 - 1] = n155 - n157;
                            array[n151] = n156 + n158;
                            array[n152] = n158 - n156;
                        }
                    }
                }
            }
            else {
                for (int n159 = 1; n159 < n9; ++n159) {
                    final int n160 = n2 - n159;
                    final int n161 = 2 * n159;
                    final int n162 = n159 * n3 * n;
                    final int n163 = n160 * n3 * n;
                    final int n164 = n161 * n;
                    for (int n165 = 0; n165 < n3; ++n165) {
                        final int n166 = n165 * n125;
                        final int n167 = n165 * n;
                        for (int n168 = 2; n168 < n; n168 += 2) {
                            final int n169 = n - n168;
                            final int n170 = n5 + n168;
                            final int n171 = n5 + n169;
                            final int n172 = n6 + n168;
                            final int n173 = n170 + n164 + n166;
                            final int n174 = n171 + n164 - n + n166;
                            final int n175 = n172 + n167 + n162;
                            final int n176 = n172 + n167 + n163;
                            final double n177 = array2[n175 - 1];
                            final double n178 = array2[n175];
                            final double n179 = array2[n176 - 1];
                            final double n180 = array2[n176];
                            array[n173 - 1] = n177 + n179;
                            array[n174 - 1] = n177 - n179;
                            array[n173] = n178 + n180;
                            array[n174] = n180 - n178;
                        }
                    }
                }
            }
        }
    }
    
    public void method26136(final long n, final long n2, final long n3, final long n4, final Class17 class17, final long n5, final Class17 class18, final long n6, final long n7) {
        final double n8 = 6.283185307179586 / n2;
        final double method24103 = Class7640.method24103(n8);
        final double method24104 = Class7640.method24102(n8);
        final long n9 = (n2 + 1L) / 2L;
        final long n10 = (n - 1L) / 2L;
        if (n == 1L) {
            Class8601.method29154(class18, n6, class17, n5, n4);
        }
        else {
            for (long n11 = 0L; n11 < n4; ++n11) {
                class18.method171(n6 + n11, class17.method137(n5 + n11));
            }
            for (long n12 = 1L; n12 < n2; ++n12) {
                final long n13 = n12 * n3 * n;
                for (long n14 = 0L; n14 < n3; ++n14) {
                    final long n15 = n14 * n + n13;
                    class18.method171(n6 + n15, class17.method137(n5 + n15));
                }
            }
            if (n10 > n3) {
                long n16 = -n;
                for (long n17 = 1L; n17 < n2; ++n17) {
                    n16 += n;
                    final long n18 = n17 * n3 * n;
                    for (long n19 = 0L; n19 < n3; ++n19) {
                        long n20 = n16 - 1L;
                        final long n21 = n19 * n + n18;
                        for (long n22 = 2L; n22 < n; n22 += 2L) {
                            n20 += 2L;
                            final long n23 = n20 + n7;
                            final double method24105 = this.field32916.method137(n23 - 1L);
                            final double method24106 = this.field32916.method137(n23);
                            final long n24 = n6 + n22 + n21;
                            final long n25 = n5 + n22 + n21;
                            final double method24107 = class17.method137(n25 - 1L);
                            final double method24108 = class17.method137(n25);
                            class18.method171(n24 - 1L, method24105 * method24107 + method24106 * method24108);
                            class18.method171(n24, method24105 * method24108 - method24106 * method24107);
                        }
                    }
                }
            }
            else {
                long n26 = -n;
                for (long n27 = 1L; n27 < n2; ++n27) {
                    n26 += n;
                    long n28 = n26 - 1L;
                    final long n29 = n27 * n3 * n;
                    for (long n30 = 2L; n30 < n; n30 += 2L) {
                        n28 += 2L;
                        final long n31 = n28 + n7;
                        final long n32 = n5 + n30;
                        final long n33 = n6 + n30;
                        final double method24109 = this.field32916.method137(n31 - 1L);
                        final double method24110 = this.field32916.method137(n31);
                        for (long n34 = 0L; n34 < n3; ++n34) {
                            final long n35 = n34 * n + n29;
                            final long n36 = n33 + n35;
                            final long n37 = n32 + n35;
                            final double method24111 = class17.method137(n37 - 1L);
                            final double method24112 = class17.method137(n37);
                            class18.method171(n36 - 1L, method24109 * method24111 + method24110 * method24112);
                            class18.method171(n36, method24109 * method24112 - method24110 * method24111);
                        }
                    }
                }
            }
            if (n10 < n3) {
                for (long n38 = 1L; n38 < n9; ++n38) {
                    final long n39 = n2 - n38;
                    final long n40 = n38 * n3 * n;
                    final long n41 = n39 * n3 * n;
                    for (long n42 = 2L; n42 < n; n42 += 2L) {
                        final long n43 = n5 + n42;
                        final long n44 = n6 + n42;
                        for (long n45 = 0L; n45 < n3; ++n45) {
                            final long n46 = n45 * n + n40;
                            final long n47 = n45 * n + n41;
                            final long n48 = n43 + n46;
                            final long n49 = n43 + n47;
                            final long n50 = n44 + n46;
                            final long n51 = n44 + n47;
                            final double method24113 = class18.method137(n50 - 1L);
                            final double method24114 = class18.method137(n50);
                            final double method24115 = class18.method137(n51 - 1L);
                            final double method24116 = class18.method137(n51);
                            class17.method171(n48 - 1L, method24113 + method24115);
                            class17.method171(n48, method24114 + method24116);
                            class17.method171(n49 - 1L, method24114 - method24116);
                            class17.method171(n49, method24115 - method24113);
                        }
                    }
                }
            }
            else {
                for (long n52 = 1L; n52 < n9; ++n52) {
                    final long n53 = n2 - n52;
                    final long n54 = n52 * n3 * n;
                    final long n55 = n53 * n3 * n;
                    for (long n56 = 0L; n56 < n3; ++n56) {
                        final long n57 = n56 * n + n54;
                        final long n58 = n56 * n + n55;
                        for (long n59 = 2L; n59 < n; n59 += 2L) {
                            final long n60 = n5 + n59;
                            final long n61 = n6 + n59;
                            final long n62 = n60 + n57;
                            final long n63 = n60 + n58;
                            final long n64 = n61 + n57;
                            final long n65 = n61 + n58;
                            final double method24117 = class18.method137(n64 - 1L);
                            final double method24118 = class18.method137(n64);
                            final double method24119 = class18.method137(n65 - 1L);
                            final double method24120 = class18.method137(n65);
                            class17.method171(n62 - 1L, method24117 + method24119);
                            class17.method171(n62, method24118 + method24120);
                            class17.method171(n63 - 1L, method24118 - method24120);
                            class17.method171(n63, method24119 - method24117);
                        }
                    }
                }
            }
        }
        for (long n66 = 1L; n66 < n9; ++n66) {
            final long n67 = n2 - n66;
            final long n68 = n66 * n3 * n;
            final long n69 = n67 * n3 * n;
            for (long n70 = 0L; n70 < n3; ++n70) {
                final long n71 = n70 * n + n68;
                final long n72 = n70 * n + n69;
                final long n73 = n6 + n71;
                final long n74 = n6 + n72;
                final double method24121 = class18.method137(n73);
                final double method24122 = class18.method137(n74);
                class17.method171(n5 + n71, method24121 + method24122);
                class17.method171(n5 + n72, method24122 - method24121);
            }
        }
        double n75 = 1.0;
        double n76 = 0.0;
        final long n77 = (n2 - 1L) * n4;
        for (long n78 = 1L; n78 < n9; ++n78) {
            final long n79 = n2 - n78;
            final double n80 = method24103 * n75 - method24104 * n76;
            n76 = method24103 * n76 + method24104 * n75;
            n75 = n80;
            final long n81 = n78 * n4;
            final long n82 = n79 * n4;
            for (long n83 = 0L; n83 < n4; ++n83) {
                final long n84 = n6 + n83;
                final long n85 = n5 + n83;
                class18.method171(n84 + n81, class17.method137(n85) + n75 * class17.method137(n85 + n4));
                class18.method171(n84 + n82, n76 * class17.method137(n85 + n77));
            }
            final double n86 = n75;
            final double n87 = n76;
            double n88 = n75;
            double n89 = n76;
            for (long n90 = 2L; n90 < n9; ++n90) {
                final long n91 = n2 - n90;
                final double n92 = n86 * n88 - n87 * n89;
                n89 = n86 * n89 + n87 * n88;
                n88 = n92;
                final long n93 = n90 * n4;
                final long n94 = n91 * n4;
                for (long n95 = 0L; n95 < n4; ++n95) {
                    final long n96 = n6 + n95;
                    final long n97 = n5 + n95;
                    class18.method171(n96 + n81, class18.method137(n96 + n81) + n88 * class17.method137(n97 + n93));
                    class18.method171(n96 + n82, class18.method137(n96 + n82) + n89 * class17.method137(n97 + n94));
                }
            }
        }
        for (long n98 = 1L; n98 < n9; ++n98) {
            final long n99 = n98 * n4;
            for (long n100 = 0L; n100 < n4; ++n100) {
                class18.method171(n6 + n100, class18.method137(n6 + n100) + class17.method137(n5 + n100 + n99));
            }
        }
        if (n < n3) {
            for (long n101 = 0L; n101 < n; ++n101) {
                for (long n102 = 0L; n102 < n3; ++n102) {
                    final long n103 = n102 * n;
                    class17.method171(n5 + n101 + n103 * n2, class18.method137(n6 + n101 + n103));
                }
            }
        }
        else {
            for (long n104 = 0L; n104 < n3; ++n104) {
                final long n105 = n104 * n;
                final long n106 = n105 * n2;
                for (long n107 = 0L; n107 < n; ++n107) {
                    class17.method171(n5 + n107 + n106, class18.method137(n6 + n107 + n105));
                }
            }
        }
        final long n108 = n2 * n;
        for (long n109 = 1L; n109 < n9; ++n109) {
            final long n110 = n2 - n109;
            final long n111 = 2L * n109;
            final long n112 = n109 * n3 * n;
            final long n113 = n110 * n3 * n;
            final long n114 = n111 * n;
            for (long n115 = 0L; n115 < n3; ++n115) {
                final long n116 = n115 * n;
                final long n117 = n116 + n112;
                final long n118 = n116 + n113;
                final long n119 = n115 * n108;
                class17.method171(n5 + n - 1L + n114 - n + n119, class18.method137(n6 + n117));
                class17.method171(n5 + n114 + n119, class18.method137(n6 + n118));
            }
        }
        if (n != 1L) {
            if (n10 < n3) {
                for (long n120 = 1L; n120 < n9; ++n120) {
                    final long n121 = n2 - n120;
                    final long n122 = 2L * n120;
                    final long n123 = n120 * n3 * n;
                    final long n124 = n121 * n3 * n;
                    final long n125 = n122 * n;
                    for (long n126 = 2L; n126 < n; n126 += 2L) {
                        final long n127 = n - n126;
                        final long n128 = n5 + n126;
                        final long n129 = n5 + n127;
                        final long n130 = n6 + n126;
                        for (long n131 = 0L; n131 < n3; ++n131) {
                            final long n132 = n131 * n108;
                            final long n133 = n131 * n;
                            final long n134 = n128 + n125 + n132;
                            final long n135 = n129 + n125 - n + n132;
                            final long n136 = n130 + n133 + n123;
                            final long n137 = n130 + n133 + n124;
                            final double method24123 = class18.method137(n136 - 1L);
                            final double method24124 = class18.method137(n136);
                            final double method24125 = class18.method137(n137 - 1L);
                            final double method24126 = class18.method137(n137);
                            class17.method171(n134 - 1L, method24123 + method24125);
                            class17.method171(n135 - 1L, method24123 - method24125);
                            class17.method171(n134, method24124 + method24126);
                            class17.method171(n135, method24126 - method24124);
                        }
                    }
                }
            }
            else {
                for (long n138 = 1L; n138 < n9; ++n138) {
                    final long n139 = n2 - n138;
                    final long n140 = 2L * n138;
                    final long n141 = n138 * n3 * n;
                    final long n142 = n139 * n3 * n;
                    final long n143 = n140 * n;
                    for (long n144 = 0L; n144 < n3; ++n144) {
                        final long n145 = n144 * n108;
                        final long n146 = n144 * n;
                        for (long n147 = 2L; n147 < n; n147 += 2L) {
                            final long n148 = n - n147;
                            final long n149 = n5 + n147;
                            final long n150 = n5 + n148;
                            final long n151 = n6 + n147;
                            final long n152 = n149 + n143 + n145;
                            final long n153 = n150 + n143 - n + n145;
                            final long n154 = n151 + n146 + n141;
                            final long n155 = n151 + n146 + n142;
                            final double method24127 = class18.method137(n154 - 1L);
                            final double method24128 = class18.method137(n154);
                            final double method24129 = class18.method137(n155 - 1L);
                            final double method24130 = class18.method137(n155);
                            class17.method171(n152 - 1L, method24127 + method24129);
                            class17.method171(n153 - 1L, method24127 - method24129);
                            class17.method171(n152, method24128 + method24130);
                            class17.method171(n153, method24130 - method24128);
                        }
                    }
                }
            }
        }
    }
    
    public void method26137(final int n, final int n2, final int n3, final int n4, final double[] array, final int n5, final double[] array2, final int n6, final int n7) {
        final double n8 = 6.283185307179586 / n2;
        final double method24103 = Class7640.method24103(n8);
        final double method24104 = Class7640.method24102(n8);
        final int n9 = (n - 1) / 2;
        final int n10 = (n2 + 1) / 2;
        final int n11 = n2 * n;
        if (n < n3) {
            for (int i = 0; i < n; ++i) {
                final int n12 = n6 + i;
                final int n13 = n5 + i;
                for (int j = 0; j < n3; ++j) {
                    array2[n12 + j * n] = array[n13 + j * n11];
                }
            }
        }
        else {
            for (int k = 0; k < n3; ++k) {
                final int n14 = k * n;
                final int n15 = k * n11;
                for (int l = 0; l < n; ++l) {
                    array2[n6 + l + n14] = array[n5 + l + n15];
                }
            }
        }
        final int n16 = n5 + n - 1;
        for (int n17 = 1; n17 < n10; ++n17) {
            final int n18 = n2 - n17;
            final int n19 = 2 * n17;
            final int n20 = n17 * n3 * n;
            final int n21 = n18 * n3 * n;
            final int n22 = n19 * n;
            for (int n23 = 0; n23 < n3; ++n23) {
                final int n24 = n23 * n;
                final int n25 = n24 * n2;
                final int n26 = n16 + n22 + n25 - n;
                final int n27 = n5 + n22 + n25;
                final double n28 = array[n26];
                final double n29 = array[n27];
                array2[n6 + n24 + n20] = n28 + n28;
                array2[n6 + n24 + n21] = n29 + n29;
            }
        }
        if (n != 1) {
            if (n9 < n3) {
                for (int n30 = 1; n30 < n10; ++n30) {
                    final int n31 = n2 - n30;
                    final int n32 = n30 * n3 * n;
                    final int n33 = n31 * n3 * n;
                    final int n34 = 2 * n30 * n;
                    for (int n35 = 2; n35 < n; n35 += 2) {
                        final int n36 = n - n35;
                        final int n37 = n6 + n35;
                        final int n38 = n5 + n36;
                        final int n39 = n5 + n35;
                        for (int n40 = 0; n40 < n3; ++n40) {
                            final int n41 = n40 * n + n32;
                            final int n42 = n40 * n + n33;
                            final int n43 = n40 * n2 * n + n34;
                            final int n44 = n37 + n41;
                            final int n45 = n37 + n42;
                            final int n46 = n39 + n43;
                            final int n47 = n38 + n43 - n;
                            final double n48 = array[n46 - 1];
                            final double n49 = array[n46];
                            final double n50 = array[n47 - 1];
                            final double n51 = array[n47];
                            array2[n44 - 1] = n48 + n50;
                            array2[n45 - 1] = n48 - n50;
                            array2[n44] = n49 - n51;
                            array2[n45] = n49 + n51;
                        }
                    }
                }
            }
            else {
                for (int n52 = 1; n52 < n10; ++n52) {
                    final int n53 = n2 - n52;
                    final int n54 = n52 * n3 * n;
                    final int n55 = n53 * n3 * n;
                    final int n56 = 2 * n52 * n;
                    for (int n57 = 0; n57 < n3; ++n57) {
                        final int n58 = n57 * n + n54;
                        final int n59 = n57 * n + n55;
                        final int n60 = n57 * n2 * n + n56;
                        for (int n61 = 2; n61 < n; n61 += 2) {
                            final int n62 = n - n61;
                            final int n63 = n6 + n61;
                            final int n64 = n5 + n62;
                            final int n65 = n5 + n61;
                            final int n66 = n63 + n58;
                            final int n67 = n63 + n59;
                            final int n68 = n65 + n60;
                            final int n69 = n64 + n60 - n;
                            final double n70 = array[n68 - 1];
                            final double n71 = array[n68];
                            final double n72 = array[n69 - 1];
                            final double n73 = array[n69];
                            array2[n66 - 1] = n70 + n72;
                            array2[n67 - 1] = n70 - n72;
                            array2[n66] = n71 - n73;
                            array2[n67] = n71 + n73;
                        }
                    }
                }
            }
        }
        double n74 = 1.0;
        double n75 = 0.0;
        final int n76 = (n2 - 1) * n4;
        for (int n77 = 1; n77 < n10; ++n77) {
            final int n78 = n2 - n77;
            final double n79 = method24103 * n74 - method24104 * n75;
            n75 = method24103 * n75 + method24104 * n74;
            n74 = n79;
            final int n80 = n77 * n4;
            final int n81 = n78 * n4;
            for (int n82 = 0; n82 < n4; ++n82) {
                final int n83 = n5 + n82;
                final int n84 = n6 + n82;
                array[n83 + n80] = array2[n84] + n74 * array2[n84 + n4];
                array[n83 + n81] = n75 * array2[n84 + n76];
            }
            final double n85 = n74;
            final double n86 = n75;
            double n87 = n74;
            double n88 = n75;
            for (int n89 = 2; n89 < n10; ++n89) {
                final int n90 = n2 - n89;
                final double n91 = n85 * n87 - n86 * n88;
                n88 = n85 * n88 + n86 * n87;
                n87 = n91;
                final int n92 = n89 * n4;
                final int n93 = n90 * n4;
                for (int n94 = 0; n94 < n4; ++n94) {
                    final int n95 = n5 + n94;
                    final int n96 = n6 + n94;
                    final int n97 = n95 + n80;
                    array[n97] += n87 * array2[n96 + n92];
                    final int n98 = n95 + n81;
                    array[n98] += n88 * array2[n96 + n93];
                }
            }
        }
        for (int n99 = 1; n99 < n10; ++n99) {
            final int n100 = n99 * n4;
            for (int n101 = 0; n101 < n4; ++n101) {
                final int n102;
                array2[n102] += array2[(n102 = n6 + n101) + n100];
            }
        }
        for (int n103 = 1; n103 < n10; ++n103) {
            final int n104 = n2 - n103;
            final int n105 = n103 * n3 * n;
            final int n106 = n104 * n3 * n;
            for (int n107 = 0; n107 < n3; ++n107) {
                final int n108 = n107 * n;
                final int n109 = n6 + n108;
                final int n110 = n5 + n108 + n105;
                final int n111 = n5 + n108 + n106;
                final double n112 = array[n110];
                final double n113 = array[n111];
                array2[n109 + n105] = n112 - n113;
                array2[n109 + n106] = n112 + n113;
            }
        }
        if (n != 1) {
            if (n9 < n3) {
                for (int n114 = 1; n114 < n10; ++n114) {
                    final int n115 = n2 - n114;
                    final int n116 = n114 * n3 * n;
                    final int n117 = n115 * n3 * n;
                    for (int n118 = 2; n118 < n; n118 += 2) {
                        final int n119 = n6 + n118;
                        final int n120 = n5 + n118;
                        for (int n121 = 0; n121 < n3; ++n121) {
                            final int n122 = n121 * n;
                            final int n123 = n119 + n122 + n116;
                            final int n124 = n119 + n122 + n117;
                            final int n125 = n120 + n122 + n116;
                            final int n126 = n120 + n122 + n117;
                            final double n127 = array[n125 - 1];
                            final double n128 = array[n125];
                            final double n129 = array[n126 - 1];
                            final double n130 = array[n126];
                            array2[n123 - 1] = n127 - n130;
                            array2[n124 - 1] = n127 + n130;
                            array2[n123] = n128 + n129;
                            array2[n124] = n128 - n129;
                        }
                    }
                }
            }
            else {
                for (int n131 = 1; n131 < n10; ++n131) {
                    final int n132 = n2 - n131;
                    final int n133 = n131 * n3 * n;
                    final int n134 = n132 * n3 * n;
                    for (int n135 = 0; n135 < n3; ++n135) {
                        final int n136 = n135 * n;
                        for (int n137 = 2; n137 < n; n137 += 2) {
                            final int n138 = n6 + n137;
                            final int n139 = n5 + n137;
                            final int n140 = n138 + n136 + n133;
                            final int n141 = n138 + n136 + n134;
                            final int n142 = n139 + n136 + n133;
                            final int n143 = n139 + n136 + n134;
                            final double n144 = array[n142 - 1];
                            final double n145 = array[n142];
                            final double n146 = array[n143 - 1];
                            final double n147 = array[n143];
                            array2[n140 - 1] = n144 - n147;
                            array2[n141 - 1] = n144 + n147;
                            array2[n140] = n145 + n146;
                            array2[n141] = n145 - n146;
                        }
                    }
                }
            }
            System.arraycopy(array2, n6, array, n5, n4);
            for (int n148 = 1; n148 < n2; ++n148) {
                final int n149 = n148 * n3 * n;
                for (int n150 = 0; n150 < n3; ++n150) {
                    final int n151 = n150 * n + n149;
                    array[n5 + n151] = array2[n6 + n151];
                }
            }
            if (n9 > n3) {
                int n152 = -n;
                for (int n153 = 1; n153 < n2; ++n153) {
                    n152 += n;
                    final int n154 = n153 * n3 * n;
                    for (int n155 = 0; n155 < n3; ++n155) {
                        int n156 = n152 - 1;
                        final int n157 = n155 * n + n154;
                        for (int n158 = 2; n158 < n; n158 += 2) {
                            n156 += 2;
                            final int n159 = n156 + n7;
                            final double n160 = this.field32915[n159 - 1];
                            final double n161 = this.field32915[n159];
                            final int n162 = n5 + n158;
                            final int n163 = n6 + n158;
                            final int n164 = n162 + n157;
                            final int n165 = n163 + n157;
                            final double n166 = array2[n165 - 1];
                            final double n167 = array2[n165];
                            array[n164 - 1] = n160 * n166 - n161 * n167;
                            array[n164] = n160 * n167 + n161 * n166;
                        }
                    }
                }
            }
            else {
                int n168 = -n;
                for (int n169 = 1; n169 < n2; ++n169) {
                    n168 += n;
                    int n170 = n168 - 1;
                    final int n171 = n169 * n3 * n;
                    for (int n172 = 2; n172 < n; n172 += 2) {
                        n170 += 2;
                        final int n173 = n170 + n7;
                        final double n174 = this.field32915[n173 - 1];
                        final double n175 = this.field32915[n173];
                        final int n176 = n5 + n172;
                        final int n177 = n6 + n172;
                        for (int n178 = 0; n178 < n3; ++n178) {
                            final int n179 = n178 * n + n171;
                            final int n180 = n176 + n179;
                            final int n181 = n177 + n179;
                            final double n182 = array2[n181 - 1];
                            final double n183 = array2[n181];
                            array[n180 - 1] = n174 * n182 - n175 * n183;
                            array[n180] = n174 * n183 + n175 * n182;
                        }
                    }
                }
            }
        }
    }
    
    public void method26138(final long n, final long n2, final long n3, final long n4, final Class17 class17, final long n5, final Class17 class18, final long n6, final long n7) {
        final double n8 = 6.283185307179586 / n2;
        final double method24103 = Class7640.method24103(n8);
        final double method24104 = Class7640.method24102(n8);
        final long n9 = (n - 1L) / 2L;
        final long n10 = (n2 + 1L) / 2L;
        final long n11 = n2 * n;
        if (n < n3) {
            for (long n12 = 0L; n12 < n; ++n12) {
                final long n13 = n6 + n12;
                final long n14 = n5 + n12;
                for (long n15 = 0L; n15 < n3; ++n15) {
                    class18.method171(n13 + n15 * n, class17.method137(n14 + n15 * n11));
                }
            }
        }
        else {
            for (long n16 = 0L; n16 < n3; ++n16) {
                final long n17 = n16 * n;
                final long n18 = n16 * n11;
                for (long n19 = 0L; n19 < n; ++n19) {
                    class18.method171(n6 + n19 + n17, class17.method137(n5 + n19 + n18));
                }
            }
        }
        final long n20 = n5 + n - 1L;
        for (long n21 = 1L; n21 < n10; ++n21) {
            final long n22 = n2 - n21;
            final long n23 = 2L * n21;
            final long n24 = n21 * n3 * n;
            final long n25 = n22 * n3 * n;
            final long n26 = n23 * n;
            for (long n27 = 0L; n27 < n3; ++n27) {
                final long n28 = n27 * n;
                final long n29 = n28 * n2;
                final long n30 = n20 + n26 + n29 - n;
                final long n31 = n5 + n26 + n29;
                final double method24105 = class17.method137(n30);
                final double method24106 = class17.method137(n31);
                class18.method171(n6 + n28 + n24, method24105 + method24105);
                class18.method171(n6 + n28 + n25, method24106 + method24106);
            }
        }
        if (n != 1L) {
            if (n9 < n3) {
                for (long n32 = 1L; n32 < n10; ++n32) {
                    final long n33 = n2 - n32;
                    final long n34 = n32 * n3 * n;
                    final long n35 = n33 * n3 * n;
                    final long n36 = 2L * n32 * n;
                    for (long n37 = 2L; n37 < n; n37 += 2L) {
                        final long n38 = n - n37;
                        final long n39 = n6 + n37;
                        final long n40 = n5 + n38;
                        final long n41 = n5 + n37;
                        for (long n42 = 0L; n42 < n3; ++n42) {
                            final long n43 = n42 * n + n34;
                            final long n44 = n42 * n + n35;
                            final long n45 = n42 * n2 * n + n36;
                            final long n46 = n39 + n43;
                            final long n47 = n39 + n44;
                            final long n48 = n41 + n45;
                            final long n49 = n40 + n45 - n;
                            final double method24107 = class17.method137(n48 - 1L);
                            final double method24108 = class17.method137(n48);
                            final double method24109 = class17.method137(n49 - 1L);
                            final double method24110 = class17.method137(n49);
                            class18.method171(n46 - 1L, method24107 + method24109);
                            class18.method171(n47 - 1L, method24107 - method24109);
                            class18.method171(n46, method24108 - method24110);
                            class18.method171(n47, method24108 + method24110);
                        }
                    }
                }
            }
            else {
                for (long n50 = 1L; n50 < n10; ++n50) {
                    final long n51 = n2 - n50;
                    final long n52 = n50 * n3 * n;
                    final long n53 = n51 * n3 * n;
                    final long n54 = 2L * n50 * n;
                    for (long n55 = 0L; n55 < n3; ++n55) {
                        final long n56 = n55 * n + n52;
                        final long n57 = n55 * n + n53;
                        final long n58 = n55 * n2 * n + n54;
                        for (long n59 = 2L; n59 < n; n59 += 2L) {
                            final long n60 = n - n59;
                            final long n61 = n6 + n59;
                            final long n62 = n5 + n60;
                            final long n63 = n5 + n59;
                            final long n64 = n61 + n56;
                            final long n65 = n61 + n57;
                            final long n66 = n63 + n58;
                            final long n67 = n62 + n58 - n;
                            final double method24111 = class17.method137(n66 - 1L);
                            final double method24112 = class17.method137(n66);
                            final double method24113 = class17.method137(n67 - 1L);
                            final double method24114 = class17.method137(n67);
                            class18.method171(n64 - 1L, method24111 + method24113);
                            class18.method171(n65 - 1L, method24111 - method24113);
                            class18.method171(n64, method24112 - method24114);
                            class18.method171(n65, method24112 + method24114);
                        }
                    }
                }
            }
        }
        double n68 = 1.0;
        double n69 = 0.0;
        final long n70 = (n2 - 1L) * n4;
        for (long n71 = 1L; n71 < n10; ++n71) {
            final long n72 = n2 - n71;
            final double n73 = method24103 * n68 - method24104 * n69;
            n69 = method24103 * n69 + method24104 * n68;
            n68 = n73;
            final long n74 = n71 * n4;
            final long n75 = n72 * n4;
            for (long n76 = 0L; n76 < n4; ++n76) {
                final long n77 = n5 + n76;
                final long n78 = n6 + n76;
                class17.method171(n77 + n74, class18.method137(n78) + n68 * class18.method137(n78 + n4));
                class17.method171(n77 + n75, n69 * class18.method137(n78 + n70));
            }
            final double n79 = n68;
            final double n80 = n69;
            double n81 = n68;
            double n82 = n69;
            for (long n83 = 2L; n83 < n10; ++n83) {
                final long n84 = n2 - n83;
                final double n85 = n79 * n81 - n80 * n82;
                n82 = n79 * n82 + n80 * n81;
                n81 = n85;
                final long n86 = n83 * n4;
                final long n87 = n84 * n4;
                for (long n88 = 0L; n88 < n4; ++n88) {
                    final long n89 = n5 + n88;
                    final long n90 = n6 + n88;
                    class17.method171(n89 + n74, class17.method137(n89 + n74) + n81 * class18.method137(n90 + n86));
                    class17.method171(n89 + n75, class17.method137(n89 + n75) + n82 * class18.method137(n90 + n87));
                }
            }
        }
        for (long n91 = 1L; n91 < n10; ++n91) {
            final long n92 = n91 * n4;
            for (long n93 = 0L; n93 < n4; ++n93) {
                final long n94 = n6 + n93;
                class18.method171(n94, class18.method137(n94) + class18.method137(n94 + n92));
            }
        }
        for (long n95 = 1L; n95 < n10; ++n95) {
            final long n96 = n2 - n95;
            final long n97 = n95 * n3 * n;
            final long n98 = n96 * n3 * n;
            for (long n99 = 0L; n99 < n3; ++n99) {
                final long n100 = n99 * n;
                final long n101 = n6 + n100;
                final long n102 = n5 + n100 + n97;
                final long n103 = n5 + n100 + n98;
                final double method24115 = class17.method137(n102);
                final double method24116 = class17.method137(n103);
                class18.method171(n101 + n97, method24115 - method24116);
                class18.method171(n101 + n98, method24115 + method24116);
            }
        }
        if (n != 1L) {
            if (n9 < n3) {
                for (long n104 = 1L; n104 < n10; ++n104) {
                    final long n105 = n2 - n104;
                    final long n106 = n104 * n3 * n;
                    final long n107 = n105 * n3 * n;
                    for (long n108 = 2L; n108 < n; n108 += 2L) {
                        final long n109 = n6 + n108;
                        final long n110 = n5 + n108;
                        for (long n111 = 0L; n111 < n3; ++n111) {
                            final long n112 = n111 * n;
                            final long n113 = n109 + n112 + n106;
                            final long n114 = n109 + n112 + n107;
                            final long n115 = n110 + n112 + n106;
                            final long n116 = n110 + n112 + n107;
                            final double method24117 = class17.method137(n115 - 1L);
                            final double method24118 = class17.method137(n115);
                            final double method24119 = class17.method137(n116 - 1L);
                            final double method24120 = class17.method137(n116);
                            class18.method171(n113 - 1L, method24117 - method24120);
                            class18.method171(n114 - 1L, method24117 + method24120);
                            class18.method171(n113, method24118 + method24119);
                            class18.method171(n114, method24118 - method24119);
                        }
                    }
                }
            }
            else {
                for (long n117 = 1L; n117 < n10; ++n117) {
                    final long n118 = n2 - n117;
                    final long n119 = n117 * n3 * n;
                    final long n120 = n118 * n3 * n;
                    for (long n121 = 0L; n121 < n3; ++n121) {
                        final long n122 = n121 * n;
                        for (long n123 = 2L; n123 < n; n123 += 2L) {
                            final long n124 = n6 + n123;
                            final long n125 = n5 + n123;
                            final long n126 = n124 + n122 + n119;
                            final long n127 = n124 + n122 + n120;
                            final long n128 = n125 + n122 + n119;
                            final long n129 = n125 + n122 + n120;
                            final double method24121 = class17.method137(n128 - 1L);
                            final double method24122 = class17.method137(n128);
                            final double method24123 = class17.method137(n129 - 1L);
                            final double method24124 = class17.method137(n129);
                            class18.method171(n126 - 1L, method24121 - method24124);
                            class18.method171(n127 - 1L, method24121 + method24124);
                            class18.method171(n126, method24122 + method24123);
                            class18.method171(n127, method24122 - method24123);
                        }
                    }
                }
            }
            Class8601.method29154(class18, n6, class17, n5, n4);
            for (long n130 = 1L; n130 < n2; ++n130) {
                final long n131 = n130 * n3 * n;
                for (long n132 = 0L; n132 < n3; ++n132) {
                    final long n133 = n132 * n + n131;
                    class17.method171(n5 + n133, class18.method137(n6 + n133));
                }
            }
            if (n9 > n3) {
                long n134 = -n;
                for (long n135 = 1L; n135 < n2; ++n135) {
                    n134 += n;
                    final long n136 = n135 * n3 * n;
                    for (long n137 = 0L; n137 < n3; ++n137) {
                        long n138 = n134 - 1L;
                        final long n139 = n137 * n + n136;
                        for (long n140 = 2L; n140 < n; n140 += 2L) {
                            n138 += 2L;
                            final long n141 = n138 + n7;
                            final double method24125 = this.field32916.method137(n141 - 1L);
                            final double method24126 = this.field32916.method137(n141);
                            final long n142 = n5 + n140;
                            final long n143 = n6 + n140;
                            final long n144 = n142 + n139;
                            final long n145 = n143 + n139;
                            final double method24127 = class18.method137(n145 - 1L);
                            final double method24128 = class18.method137(n145);
                            class17.method171(n144 - 1L, method24125 * method24127 - method24126 * method24128);
                            class17.method171(n144, method24125 * method24128 + method24126 * method24127);
                        }
                    }
                }
            }
            else {
                long n146 = -n;
                for (long n147 = 1L; n147 < n2; ++n147) {
                    n146 += n;
                    long n148 = n146 - 1L;
                    final long n149 = n147 * n3 * n;
                    for (long n150 = 2L; n150 < n; n150 += 2L) {
                        n148 += 2L;
                        final long n151 = n148 + n7;
                        final double method24129 = this.field32916.method137(n151 - 1L);
                        final double method24130 = this.field32916.method137(n151);
                        final long n152 = n5 + n150;
                        final long n153 = n6 + n150;
                        for (long n154 = 0L; n154 < n3; ++n154) {
                            final long n155 = n154 * n + n149;
                            final long n156 = n152 + n155;
                            final long n157 = n153 + n155;
                            final double method24131 = class18.method137(n157 - 1L);
                            final double method24132 = class18.method137(n157);
                            class17.method171(n156 - 1L, method24129 * method24131 - method24130 * method24132);
                            class17.method171(n156, method24129 * method24132 + method24130 * method24131);
                        }
                    }
                }
            }
        }
    }
    
    public void method26139(final double[] array, final int n, final int n2) {
        final int[] array2 = { 0 };
        final int n3 = 2 * this.field32901;
        final double[] array3 = new double[n3];
        final int n4 = n3;
        final int n5 = 4 * this.field32901;
        array2[0] = 0;
        final int n6 = (int)this.field32913[1 + n5];
        int n7 = 0;
        int n8 = 1;
        int n9 = n4;
        for (int i = 2; i <= n6 + 1; ++i) {
            final int n10 = (int)this.field32913[i + n5];
            final int n11 = n10 * n8;
            final int n12 = this.field32901 / n11;
            final int n13 = n12 + n12;
            final int n14 = n13 * n8;
            switch (n10) {
                case 4: {
                    if (n7 == 0) {
                        this.method26145(n13, n8, array, n, array3, 0, n9, n2);
                    }
                    else {
                        this.method26145(n13, n8, array3, 0, array, n, n9, n2);
                    }
                    n7 = 1 - n7;
                    break;
                }
                case 2: {
                    if (n7 == 0) {
                        this.method26141(n13, n8, array, n, array3, 0, n9, n2);
                    }
                    else {
                        this.method26141(n13, n8, array3, 0, array, n, n9, n2);
                    }
                    n7 = 1 - n7;
                    break;
                }
                case 3: {
                    if (n7 == 0) {
                        this.method26143(n13, n8, array, n, array3, 0, n9, n2);
                    }
                    else {
                        this.method26143(n13, n8, array3, 0, array, n, n9, n2);
                    }
                    n7 = 1 - n7;
                    break;
                }
                case 5: {
                    if (n7 == 0) {
                        this.method26147(n13, n8, array, n, array3, 0, n9, n2);
                    }
                    else {
                        this.method26147(n13, n8, array3, 0, array, n, n9, n2);
                    }
                    n7 = 1 - n7;
                    break;
                }
                default: {
                    if (n7 == 0) {
                        this.method26149(array2, n13, n10, n8, n14, array, n, array3, 0, n9, n2);
                    }
                    else {
                        this.method26149(array2, n13, n10, n8, n14, array3, 0, array, n, n9, n2);
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
    
    public void method26140(final Class17 class17, final long n, final int n2) {
        final int[] array = { 0 };
        final long n3 = 2L * this.field32902;
        final Class17 class18 = new Class17(n3);
        final long n4 = n3;
        final long n5 = 4L * this.field32902;
        array[0] = 0;
        final long n6 = (long)this.field32914.method137(1L + n5);
        long n7 = 0L;
        long n8 = 1L;
        long n9 = n4;
        for (long n10 = 2L; n10 <= n6 + 1L; ++n10) {
            final int n11 = (int)this.field32914.method137(n10 + n5);
            final long n12 = n11 * n8;
            final long n13 = this.field32902 / n12;
            final long n14 = n13 + n13;
            final long n15 = n14 * n8;
            switch (n11) {
                case 4: {
                    if (n7 == 0L) {
                        this.method26146(n14, n8, class17, n, class18, 0L, n9, n2);
                    }
                    else {
                        this.method26146(n14, n8, class18, 0L, class17, n, n9, n2);
                    }
                    n7 = 1L - n7;
                    break;
                }
                case 2: {
                    if (n7 == 0L) {
                        this.method26142(n14, n8, class17, n, class18, 0L, n9, n2);
                    }
                    else {
                        this.method26142(n14, n8, class18, 0L, class17, n, n9, n2);
                    }
                    n7 = 1L - n7;
                    break;
                }
                case 3: {
                    if (n7 == 0L) {
                        this.method26144(n14, n8, class17, n, class18, 0L, n9, n2);
                    }
                    else {
                        this.method26144(n14, n8, class18, 0L, class17, n, n9, n2);
                    }
                    n7 = 1L - n7;
                    break;
                }
                case 5: {
                    if (n7 == 0L) {
                        this.method26148(n14, n8, class17, n, class18, 0L, n9, n2);
                    }
                    else {
                        this.method26148(n14, n8, class18, 0L, class17, n, n9, n2);
                    }
                    n7 = 1L - n7;
                    break;
                }
                default: {
                    if (n7 == 0L) {
                        this.method26150(array, n14, n11, n8, n15, class17, n, class18, 0L, n9, n2);
                    }
                    else {
                        this.method26150(array, n14, n11, n8, n15, class18, 0L, class17, n, n9, n2);
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
        Class8601.method29154(class18, 0L, class17, n, n3);
    }
    
    public void method26141(final int n, final int n2, final double[] array, final int n3, final double[] array2, final int n4, final int n5, final int n6) {
        final int n7 = n * n2;
        if (n > 2) {
            for (int i = 0; i < n2; ++i) {
                for (int j = 0; j < n - 1; j += 2) {
                    final int n8 = i * n;
                    final int n9 = n3 + j + 2 * n8;
                    final int n10 = n9 + n;
                    final double n11 = array[n9];
                    final double n12 = array[n9 + 1];
                    final double n13 = array[n10];
                    final double n14 = array[n10 + 1];
                    final int n15 = j + n5;
                    final double n16 = this.field32913[n15];
                    final double n17 = n6 * this.field32913[n15 + 1];
                    final double n18 = n11 - n13;
                    final double n19 = n12 - n14;
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
                final double n25 = array[n23];
                final double n26 = array[n23 + 1];
                final double n27 = array[n24];
                final double n28 = array[n24 + 1];
                final int n29 = n4 + n22;
                final int n30 = n29 + n7;
                array2[n29] = n25 + n27;
                array2[n29 + 1] = n26 + n28;
                array2[n30] = n25 - n27;
                array2[n30 + 1] = n26 - n28;
            }
        }
    }
    
    public void method26142(final long n, final long n2, final Class17 class17, final long n3, final Class17 class18, final long n4, final long n5, final long n6) {
        final long n7 = n * n2;
        if (n > 2L) {
            for (long n8 = 0L; n8 < n2; ++n8) {
                for (long n9 = 0L; n9 < n - 1L; n9 += 2L) {
                    final long n10 = n8 * n;
                    final long n11 = n3 + n9 + 2L * n10;
                    final long n12 = n11 + n;
                    final double method137 = class17.method137(n11);
                    final double method138 = class17.method137(n11 + 1L);
                    final double method139 = class17.method137(n12);
                    final double method140 = class17.method137(n12 + 1L);
                    final long n13 = n9 + n5;
                    final double method141 = this.field32914.method137(n13);
                    final double n14 = n6 * this.field32914.method137(n13 + 1L);
                    final double n15 = method137 - method139;
                    final double n16 = method138 - method140;
                    final long n17 = n4 + n9 + n10;
                    final long n18 = n17 + n7;
                    class18.method171(n17, method137 + method139);
                    class18.method171(n17 + 1L, method138 + method140);
                    class18.method171(n18, method141 * n15 - n14 * n16);
                    class18.method171(n18 + 1L, method141 * n16 + n14 * n15);
                }
            }
        }
        else {
            for (long n19 = 0L; n19 < n2; ++n19) {
                final long n20 = n19 * n;
                final long n21 = n3 + 2L * n20;
                final long n22 = n21 + n;
                final double method142 = class17.method137(n21);
                final double method143 = class17.method137(n21 + 1L);
                final double method144 = class17.method137(n22);
                final double method145 = class17.method137(n22 + 1L);
                final long n23 = n4 + n20;
                final long n24 = n23 + n7;
                class18.method171(n23, method142 + method144);
                class18.method171(n23 + 1L, method143 + method145);
                class18.method171(n24, method142 - method144);
                class18.method171(n24 + 1L, method143 - method145);
            }
        }
    }
    
    public void method26143(final int n, final int n2, final double[] array, final int n3, final double[] array2, final int n4, final int n5, final int n6) {
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
                    final double n14 = array[n11];
                    final double n15 = array[n11 + 1];
                    final double n16 = array[n12];
                    final double n17 = array[n12 + 1];
                    final double n18 = array[n13];
                    final double n19 = array[n13 + 1];
                    final double n20 = n14 + n16;
                    final double n21 = n18 + -0.5 * n20;
                    final double n22 = n15 + n17;
                    final double n23 = n19 + -0.5 * n22;
                    final double n24 = n6 * 0.8660254037844387 * (n14 - n16);
                    final double n25 = n6 * 0.8660254037844387 * (n15 - n17);
                    final double n26 = n21 - n25;
                    final double n27 = n21 + n25;
                    final double n28 = n23 + n24;
                    final double n29 = n23 - n24;
                    final int n30 = j + n5;
                    final int n31 = j + n7;
                    final double n32 = this.field32913[n30];
                    final double n33 = n6 * this.field32913[n30 + 1];
                    final double n34 = this.field32913[n31];
                    final double n35 = n6 * this.field32913[n31 + 1];
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
                final double n42 = array[n39];
                final double n43 = array[n39 + 1];
                final double n44 = array[n40];
                final double n45 = array[n40 + 1];
                final double n46 = array[n41];
                final double n47 = array[n41 + 1];
                final double n48 = n42 + n44;
                final double n49 = n46 + -0.5 * n48;
                final double n50 = n43 + n45;
                final double n51 = n47 + -0.5 * n50;
                final double n52 = n6 * 0.8660254037844387 * (n42 - n44);
                final double n53 = n6 * 0.8660254037844387 * (n43 - n45);
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
    
    public void method26144(final long n, final long n2, final Class17 class17, final long n3, final Class17 class18, final long n4, final long n5, final long n6) {
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
                    final double method137 = class17.method137(n13);
                    final double method138 = class17.method137(n13 + 1L);
                    final double method139 = class17.method137(n14);
                    final double method140 = class17.method137(n14 + 1L);
                    final double method141 = class17.method137(n15);
                    final double method142 = class17.method137(n15 + 1L);
                    final double n16 = method137 + method139;
                    final double n17 = method141 + -0.5 * n16;
                    final double n18 = method138 + method140;
                    final double n19 = method142 + -0.5 * n18;
                    final double n20 = n6 * 0.8660254037844387 * (method137 - method139);
                    final double n21 = n6 * 0.8660254037844387 * (method138 - method140);
                    final double n22 = n17 - n21;
                    final double n23 = n17 + n21;
                    final double n24 = n19 + n20;
                    final double n25 = n19 - n20;
                    final long n26 = n12 + n5;
                    final long n27 = n12 + n7;
                    final double method143 = this.field32914.method137(n26);
                    final double n28 = n6 * this.field32914.method137(n26 + 1L);
                    final double method144 = this.field32914.method137(n27);
                    final double n29 = n6 * this.field32914.method137(n27 + 1L);
                    final long n30 = n12 + n11;
                    final long n31 = n30 + n8;
                    final long n32 = n31 + n8;
                    class18.method171(n30, method141 + n16);
                    class18.method171(n30 + 1L, method142 + n18);
                    class18.method171(n31, method143 * n22 - n28 * n24);
                    class18.method171(n31 + 1L, method143 * n24 + n28 * n22);
                    class18.method171(n32, method144 * n23 - n29 * n25);
                    class18.method171(n32 + 1L, method144 * n25 + n29 * n23);
                }
            }
        }
        else {
            for (long n33 = 1L; n33 <= n2; ++n33) {
                final long n34 = n3 + (3L * n33 - 2L) * n;
                final long n35 = n34 + n;
                final long n36 = n34 - n;
                final double method145 = class17.method137(n34);
                final double method146 = class17.method137(n34 + 1L);
                final double method147 = class17.method137(n35);
                final double method148 = class17.method137(n35 + 1L);
                final double method149 = class17.method137(n36);
                final double method150 = class17.method137(n36 + 1L);
                final double n37 = method145 + method147;
                final double n38 = method149 + -0.5 * n37;
                final double n39 = method146 + method148;
                final double n40 = method150 + -0.5 * n39;
                final double n41 = n6 * 0.8660254037844387 * (method145 - method147);
                final double n42 = n6 * 0.8660254037844387 * (method146 - method148);
                final long n43 = n4 + (n33 - 1L) * n;
                final long n44 = n43 + n8;
                final long n45 = n44 + n8;
                class18.method171(n43, class17.method137(n36) + n37);
                class18.method171(n43 + 1L, method150 + n39);
                class18.method171(n44, n38 - n42);
                class18.method171(n44 + 1L, n40 + n41);
                class18.method171(n45, n38 + n42);
                class18.method171(n45 + 1L, n40 - n41);
            }
        }
    }
    
    public void method26145(final int n, final int n2, final double[] array, final int n3, final double[] array2, final int n4, final int n5, final int n6) {
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
                    final double n16 = array[n12 - 1];
                    final double n17 = array[n12];
                    final double n18 = array[n13 - 1];
                    final double n19 = array[n13];
                    final double n20 = array[n14 - 1];
                    final double n21 = array[n14];
                    final double n22 = array[n15 - 1];
                    final double n23 = array[n15];
                    final double n24 = n17 - n21;
                    final double n25 = n17 + n21;
                    final double n26 = n19 + n23;
                    final double n27 = n23 - n19;
                    final double n28 = n16 - n20;
                    final double n29 = n16 + n20;
                    final double n30 = n18 - n22;
                    final double n31 = n18 + n22;
                    final double n32 = n29 - n31;
                    final double n33 = n25 - n26;
                    final double n34 = n28 + n6 * n27;
                    final double n35 = n28 - n6 * n27;
                    final double n36 = n24 + n6 * n30;
                    final double n37 = n24 - n6 * n30;
                    final int n38 = j + n5;
                    final int n39 = j + n7;
                    final int n40 = j + n8;
                    final double n41 = this.field32913[n38];
                    final double n42 = n6 * this.field32913[n38 + 1];
                    final double n43 = this.field32913[n39];
                    final double n44 = n6 * this.field32913[n39 + 1];
                    final double n45 = this.field32913[n40];
                    final double n46 = n6 * this.field32913[n40 + 1];
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
                final double n56 = array[n52 - 1];
                final double n57 = array[n52];
                final double n58 = array[n53 - 1];
                final double n59 = array[n53];
                final double n60 = array[n54 - 1];
                final double n61 = array[n54];
                final double n62 = array[n55 - 1];
                final double n63 = array[n55];
                final double n64 = n57 - n61;
                final double n65 = n57 + n61;
                final double n66 = n63 - n59;
                final double n67 = n59 + n63;
                final double n68 = n56 - n60;
                final double n69 = n56 + n60;
                final double n70 = n58 - n62;
                final double n71 = n58 + n62;
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
    
    public void method26146(final long n, final long n2, final Class17 class17, final long n3, final Class17 class18, final long n4, final long n5, final int n6) {
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
                    final double method137 = class17.method137(n14 - 1L);
                    final double method138 = class17.method137(n14);
                    final double method139 = class17.method137(n15 - 1L);
                    final double method140 = class17.method137(n15);
                    final double method141 = class17.method137(n16 - 1L);
                    final double method142 = class17.method137(n16);
                    final double method143 = class17.method137(n17 - 1L);
                    final double method144 = class17.method137(n17);
                    final double n18 = method138 - method142;
                    final double n19 = method138 + method142;
                    final double n20 = method140 + method144;
                    final double n21 = method144 - method140;
                    final double n22 = method137 - method141;
                    final double n23 = method137 + method141;
                    final double n24 = method139 - method143;
                    final double n25 = method139 + method143;
                    final double n26 = n23 - n25;
                    final double n27 = n19 - n20;
                    final double n28 = n22 + n6 * n21;
                    final double n29 = n22 - n6 * n21;
                    final double n30 = n18 + n6 * n24;
                    final double n31 = n18 - n6 * n24;
                    final long n32 = n13 + n5;
                    final long n33 = n13 + n7;
                    final long n34 = n13 + n8;
                    final double method145 = this.field32914.method137(n32);
                    final double n35 = n6 * this.field32914.method137(n32 + 1L);
                    final double method146 = this.field32914.method137(n33);
                    final double n36 = n6 * this.field32914.method137(n33 + 1L);
                    final double method147 = this.field32914.method137(n34);
                    final double n37 = n6 * this.field32914.method137(n34 + 1L);
                    final long n38 = n4 + n13 + n11;
                    final long n39 = n38 + n9;
                    final long n40 = n39 + n9;
                    final long n41 = n40 + n9;
                    class18.method171(n38, n23 + n25);
                    class18.method171(n38 + 1L, n19 + n20);
                    class18.method171(n39, method145 * n28 - n35 * n30);
                    class18.method171(n39 + 1L, method145 * n30 + n35 * n28);
                    class18.method171(n40, method146 * n26 - n36 * n27);
                    class18.method171(n40 + 1L, method146 * n27 + n36 * n26);
                    class18.method171(n41, method147 * n29 - n37 * n31);
                    class18.method171(n41 + 1L, method147 * n31 + n37 * n29);
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
                final double method148 = class17.method137(n44 - 1L);
                final double method149 = class17.method137(n44);
                final double method150 = class17.method137(n45 - 1L);
                final double method151 = class17.method137(n45);
                final double method152 = class17.method137(n46 - 1L);
                final double method153 = class17.method137(n46);
                final double method154 = class17.method137(n47 - 1L);
                final double method155 = class17.method137(n47);
                final double n48 = method149 - method153;
                final double n49 = method149 + method153;
                final double n50 = method155 - method151;
                final double n51 = method151 + method155;
                final double n52 = method148 - method152;
                final double n53 = method148 + method152;
                final double n54 = method150 - method154;
                final double n55 = method150 + method154;
                final long n56 = n4 + n43;
                final long n57 = n56 + n9;
                final long n58 = n57 + n9;
                final long n59 = n58 + n9;
                class18.method171(n56, n53 + n55);
                class18.method171(n56 + 1L, n49 + n51);
                class18.method171(n57, n52 + n6 * n50);
                class18.method171(n57 + 1L, n48 + n6 * n54);
                class18.method171(n58, n53 - n55);
                class18.method171(n58 + 1L, n49 - n51);
                class18.method171(n59, n52 - n6 * n50);
                class18.method171(n59 + 1L, n48 - n6 * n54);
            }
        }
    }
    
    public void method26147(final int n, final int n2, final double[] array, final int n3, final double[] array2, final int n4, final int n5, final int n6) {
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
                    final double n18 = array[n13 - 1];
                    final double n19 = array[n13];
                    final double n20 = array[n14 - 1];
                    final double n21 = array[n14];
                    final double n22 = array[n15 - 1];
                    final double n23 = array[n15];
                    final double n24 = array[n16 - 1];
                    final double n25 = array[n16];
                    final double n26 = array[n17 - 1];
                    final double n27 = array[n17];
                    final double n28 = n19 - n27;
                    final double n29 = n19 + n27;
                    final double n30 = n21 - n25;
                    final double n31 = n21 + n25;
                    final double n32 = n18 - n26;
                    final double n33 = n18 + n26;
                    final double n34 = n20 - n24;
                    final double n35 = n20 + n24;
                    final double n36 = n22 + 0.30901699437494745 * n33 + -0.8090169943749473 * n35;
                    final double n37 = n23 + 0.30901699437494745 * n29 + -0.8090169943749473 * n31;
                    final double n38 = n22 + -0.8090169943749473 * n33 + 0.30901699437494745 * n35;
                    final double n39 = n23 + -0.8090169943749473 * n29 + 0.30901699437494745 * n31;
                    final double n40 = n6 * (0.9510565162951535 * n32 + 0.5877852522924732 * n34);
                    final double n41 = n6 * (0.9510565162951535 * n28 + 0.5877852522924732 * n30);
                    final double n42 = n6 * (0.5877852522924732 * n32 - 0.9510565162951535 * n34);
                    final double n43 = n6 * (0.5877852522924732 * n28 - 0.9510565162951535 * n30);
                    final double n44 = n38 - n43;
                    final double n45 = n38 + n43;
                    final double n46 = n39 + n42;
                    final double n47 = n39 - n42;
                    final double n48 = n36 + n41;
                    final double n49 = n36 - n41;
                    final double n50 = n37 - n40;
                    final double n51 = n37 + n40;
                    final int n52 = j + n5;
                    final int n53 = j + n7;
                    final int n54 = j + n8;
                    final int n55 = j + n9;
                    final double n56 = this.field32913[n52];
                    final double n57 = n6 * this.field32913[n52 + 1];
                    final double n58 = this.field32913[n53];
                    final double n59 = n6 * this.field32913[n53 + 1];
                    final double n60 = this.field32913[n54];
                    final double n61 = n6 * this.field32913[n54 + 1];
                    final double n62 = this.field32913[n55];
                    final double n63 = n6 * this.field32913[n55 + 1];
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
                final double n74 = array[n69 - 1];
                final double n75 = array[n69];
                final double n76 = array[n70 - 1];
                final double n77 = array[n70];
                final double n78 = array[n71 - 1];
                final double n79 = array[n71];
                final double n80 = array[n72 - 1];
                final double n81 = array[n72];
                final double n82 = array[n73 - 1];
                final double n83 = array[n73];
                final double n84 = n75 - n83;
                final double n85 = n75 + n83;
                final double n86 = n77 - n81;
                final double n87 = n77 + n81;
                final double n88 = n74 - n82;
                final double n89 = n74 + n82;
                final double n90 = n76 - n80;
                final double n91 = n76 + n80;
                final double n92 = n78 + 0.30901699437494745 * n89 + -0.8090169943749473 * n91;
                final double n93 = n79 + 0.30901699437494745 * n85 + -0.8090169943749473 * n87;
                final double n94 = n78 + -0.8090169943749473 * n89 + 0.30901699437494745 * n91;
                final double n95 = n79 + -0.8090169943749473 * n85 + 0.30901699437494745 * n87;
                final double n96 = n6 * (0.9510565162951535 * n88 + 0.5877852522924732 * n90);
                final double n97 = n6 * (0.9510565162951535 * n84 + 0.5877852522924732 * n86);
                final double n98 = n6 * (0.5877852522924732 * n88 - 0.9510565162951535 * n90);
                final double n99 = n6 * (0.5877852522924732 * n84 - 0.9510565162951535 * n86);
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
    
    public void method26148(final long n, final long n2, final Class17 class17, final long n3, final Class17 class18, final long n4, final long n5, final long n6) {
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
                    final double method137 = class17.method137(n15 - 1L);
                    final double method138 = class17.method137(n15);
                    final double method139 = class17.method137(n16 - 1L);
                    final double method140 = class17.method137(n16);
                    final double method141 = class17.method137(n17 - 1L);
                    final double method142 = class17.method137(n17);
                    final double method143 = class17.method137(n18 - 1L);
                    final double method144 = class17.method137(n18);
                    final double method145 = class17.method137(n19 - 1L);
                    final double method146 = class17.method137(n19);
                    final double n20 = method138 - method146;
                    final double n21 = method138 + method146;
                    final double n22 = method140 - method144;
                    final double n23 = method140 + method144;
                    final double n24 = method137 - method145;
                    final double n25 = method137 + method145;
                    final double n26 = method139 - method143;
                    final double n27 = method139 + method143;
                    final double n28 = method141 + 0.30901699437494745 * n25 + -0.8090169943749473 * n27;
                    final double n29 = method142 + 0.30901699437494745 * n21 + -0.8090169943749473 * n23;
                    final double n30 = method141 + -0.8090169943749473 * n25 + 0.30901699437494745 * n27;
                    final double n31 = method142 + -0.8090169943749473 * n21 + 0.30901699437494745 * n23;
                    final double n32 = n6 * (0.9510565162951535 * n24 + 0.5877852522924732 * n26);
                    final double n33 = n6 * (0.9510565162951535 * n20 + 0.5877852522924732 * n22);
                    final double n34 = n6 * (0.5877852522924732 * n24 - 0.9510565162951535 * n26);
                    final double n35 = n6 * (0.5877852522924732 * n20 - 0.9510565162951535 * n22);
                    final double n36 = n30 - n35;
                    final double n37 = n30 + n35;
                    final double n38 = n31 + n34;
                    final double n39 = n31 - n34;
                    final double n40 = n28 + n33;
                    final double n41 = n28 - n33;
                    final double n42 = n29 - n32;
                    final double n43 = n29 + n32;
                    final long n44 = n14 + n5;
                    final long n45 = n14 + n7;
                    final long n46 = n14 + n8;
                    final long n47 = n14 + n9;
                    final double method147 = this.field32914.method137(n44);
                    final double n48 = n6 * this.field32914.method137(n44 + 1L);
                    final double method148 = this.field32914.method137(n45);
                    final double n49 = n6 * this.field32914.method137(n45 + 1L);
                    final double method149 = this.field32914.method137(n46);
                    final double n50 = n6 * this.field32914.method137(n46 + 1L);
                    final double method150 = this.field32914.method137(n47);
                    final double n51 = n6 * this.field32914.method137(n47 + 1L);
                    final long n52 = n14 + n13;
                    final long n53 = n52 + n10;
                    final long n54 = n53 + n10;
                    final long n55 = n54 + n10;
                    final long n56 = n55 + n10;
                    class18.method171(n52, method141 + n25 + n27);
                    class18.method171(n52 + 1L, method142 + n21 + n23);
                    class18.method171(n53, method147 * n41 - n48 * n43);
                    class18.method171(n53 + 1L, method147 * n43 + n48 * n41);
                    class18.method171(n54, method148 * n36 - n49 * n38);
                    class18.method171(n54 + 1L, method148 * n38 + n49 * n36);
                    class18.method171(n55, method149 * n37 - n50 * n39);
                    class18.method171(n55 + 1L, method149 * n39 + n50 * n37);
                    class18.method171(n56, method150 * n40 - n51 * n42);
                    class18.method171(n56 + 1L, method150 * n42 + n51 * n40);
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
                final double method151 = class17.method137(n58 - 1L);
                final double method152 = class17.method137(n58);
                final double method153 = class17.method137(n59 - 1L);
                final double method154 = class17.method137(n59);
                final double method155 = class17.method137(n60 - 1L);
                final double method156 = class17.method137(n60);
                final double method157 = class17.method137(n61 - 1L);
                final double method158 = class17.method137(n61);
                final double method159 = class17.method137(n62 - 1L);
                final double method160 = class17.method137(n62);
                final double n63 = method152 - method160;
                final double n64 = method152 + method160;
                final double n65 = method154 - method158;
                final double n66 = method154 + method158;
                final double n67 = method151 - method159;
                final double n68 = method151 + method159;
                final double n69 = method153 - method157;
                final double n70 = method153 + method157;
                final double n71 = method155 + 0.30901699437494745 * n68 + -0.8090169943749473 * n70;
                final double n72 = method156 + 0.30901699437494745 * n64 + -0.8090169943749473 * n66;
                final double n73 = method155 + -0.8090169943749473 * n68 + 0.30901699437494745 * n70;
                final double n74 = method156 + -0.8090169943749473 * n64 + 0.30901699437494745 * n66;
                final double n75 = n6 * (0.9510565162951535 * n67 + 0.5877852522924732 * n69);
                final double n76 = n6 * (0.9510565162951535 * n63 + 0.5877852522924732 * n65);
                final double n77 = n6 * (0.5877852522924732 * n67 - 0.9510565162951535 * n69);
                final double n78 = n6 * (0.5877852522924732 * n63 - 0.9510565162951535 * n65);
                final long n79 = n4 + (n57 - 1L) * n;
                final long n80 = n79 + n10;
                final long n81 = n80 + n10;
                final long n82 = n81 + n10;
                final long n83 = n82 + n10;
                class18.method171(n79, method155 + n68 + n70);
                class18.method171(n79 + 1L, method156 + n64 + n66);
                class18.method171(n80, n71 - n76);
                class18.method171(n80 + 1L, n72 + n75);
                class18.method171(n81, n73 - n78);
                class18.method171(n81 + 1L, n74 + n77);
                class18.method171(n82, n73 + n78);
                class18.method171(n82 + 1L, n74 - n77);
                class18.method171(n83, n71 + n76);
                class18.method171(n83 + 1L, n72 - n75);
            }
        }
    }
    
    public void method26149(final int[] array, final int n, final int n2, final int n3, final int n4, final double[] array2, final int n5, final double[] array3, final int n6, final int n7, final int n8) {
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
                        final double n21 = array2[n20 + n15 + n18];
                        final double n22 = array2[n20 + n16 + n18];
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
                        final double n36 = array2[n5 + n34 + n27 + n33];
                        final double n37 = array2[n5 + n34 + n28 + n33];
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
            final double n50 = this.field32913[n49 - 2];
            final double n51 = n8 * this.field32913[n49 - 1];
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
                final double n59 = this.field32913[n58 - 2];
                final double n60 = n8 * this.field32913[n58 - 1];
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
                final double n81 = array2[n79 - 1];
                final double n82 = array2[n79];
                final double n83 = array2[n80 - 1];
                final double n84 = array2[n80];
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
                            final double n102 = this.field32913[n101 - 1];
                            final double n103 = n8 * this.field32913[n101];
                            final int n104 = n5 + n100 + n99;
                            final int n105 = n6 + n100 + n99;
                            final double n106 = array3[n105 - 1];
                            final double n107 = array3[n105];
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
                        final double n113 = this.field32913[n112 - 1];
                        final double n114 = n8 * this.field32913[n112];
                        final int n115 = n5 + n111;
                        final int n116 = n6 + n111;
                        for (int n117 = 0; n117 < n3; ++n117) {
                            final int n118 = n117 * n + n110;
                            final int n119 = n115 + n118;
                            final int n120 = n116 + n118;
                            final double n121 = array3[n120 - 1];
                            final double n122 = array3[n120];
                            array2[n119 - 1] = n113 * n121 - n114 * n122;
                            array2[n119] = n113 * n122 + n114 * n121;
                        }
                    }
                }
            }
        }
    }
    
    public void method26150(final int[] array, final long n, final long n2, final long n3, final long n4, final Class17 class17, final long n5, final Class17 class18, final long n6, final long n7, final long n8) {
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
                        final double method137 = class17.method137(n23 + n16 + n21);
                        final double method138 = class17.method137(n23 + n17 + n21);
                        class18.method171(n22 + n20 + n14, method137 + method138);
                        class18.method171(n22 + n20 + n15, method137 - method138);
                    }
                }
            }
            for (long n24 = 0L; n24 < n; ++n24) {
                for (long n25 = 0L; n25 < n3; ++n25) {
                    final long n26 = n25 * n;
                    class18.method171(n6 + n24 + n26, class17.method137(n5 + n24 + n26 * n2));
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
                        final double method139 = class17.method137(n5 + n36 + n29 + n35);
                        final double method140 = class17.method137(n5 + n36 + n30 + n35);
                        class18.method171(n37 + n33, method139 + method140);
                        class18.method171(n37 + n34, method139 - method140);
                    }
                }
            }
            for (long n38 = 0L; n38 < n3; ++n38) {
                final long n39 = n38 * n;
                final long n40 = n39 * n2;
                for (long n41 = 0L; n41 < n; ++n41) {
                    class18.method171(n6 + n41 + n39, class17.method137(n5 + n41 + n40));
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
            final double method141 = this.field32914.method137(n49 - 2L);
            final double n50 = n8 * this.field32914.method137(n49 - 1L);
            for (long n51 = 0L; n51 < n4; ++n51) {
                final long n52 = n5 + n51;
                final long n53 = n6 + n51;
                class17.method171(n52 + n47, class18.method137(n53) + method141 * class18.method137(n53 + n4));
                class17.method171(n52 + n48, n50 * class18.method137(n53 + n44));
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
                final double method142 = this.field32914.method137(n57 - 2L);
                final double n58 = n8 * this.field32914.method137(n57 - 1L);
                final long n59 = n55 * n4;
                final long n60 = n56 * n4;
                for (long n61 = 0L; n61 < n4; ++n61) {
                    final long n62 = n5 + n61;
                    final long n63 = n6 + n61;
                    class17.method171(n62 + n47, class17.method137(n62 + n47) + method142 * class18.method137(n63 + n59));
                    class17.method171(n62 + n48, class17.method137(n62 + n48) + n58 * class18.method137(n63 + n60));
                }
            }
        }
        for (long n64 = 1L; n64 < n10; ++n64) {
            final long n65 = n64 * n4;
            for (long n66 = 0L; n66 < n4; ++n66) {
                final long n67 = n6 + n66;
                class18.method171(n67, class18.method137(n67) + class18.method137(n67 + n65));
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
                final double method143 = class17.method137(n75 - 1L);
                final double method144 = class17.method137(n75);
                final double method145 = class17.method137(n76 - 1L);
                final double method146 = class17.method137(n76);
                final long n77 = n73 + n70;
                final long n78 = n73 + n71;
                class18.method171(n77 - 1L, method143 - method146);
                class18.method171(n78 - 1L, method143 + method146);
                class18.method171(n77, method144 + method145);
                class18.method171(n78, method144 - method145);
            }
        }
        array[0] = 1;
        if (n != 2L) {
            array[0] = 0;
            Class8601.method29154(class18, n6, class17, n5, n4);
            final long n79 = n3 * n;
            for (long n80 = 1L; n80 < n2; ++n80) {
                final long n81 = n80 * n79;
                for (long n82 = 0L; n82 < n3; ++n82) {
                    final long n83 = n82 * n;
                    final long n84 = n6 + n83 + n81;
                    final long n85 = n5 + n83 + n81;
                    class17.method171(n85, class18.method137(n84));
                    class17.method171(n85 + 1L, class18.method137(n84 + 1L));
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
                            final double method147 = this.field32914.method137(n93 - 1L);
                            final double n94 = n8 * this.field32914.method137(n93);
                            final long n95 = n5 + n92 + n91;
                            final long n96 = n6 + n92 + n91;
                            final double method148 = class18.method137(n96 - 1L);
                            final double method149 = class18.method137(n96);
                            class17.method171(n95 - 1L, method147 * method148 - n94 * method149);
                            class17.method171(n95, method147 * method149 + n94 * method148);
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
                        final double method150 = this.field32914.method137(n101 - 1L);
                        final double n102 = n8 * this.field32914.method137(n101);
                        final long n103 = n5 + n100;
                        final long n104 = n6 + n100;
                        for (long n105 = 0L; n105 < n3; ++n105) {
                            final long n106 = n105 * n + n99;
                            final long n107 = n103 + n106;
                            final long n108 = n104 + n106;
                            final double method151 = class18.method137(n108 - 1L);
                            final double method152 = class18.method137(n108);
                            class17.method171(n107 - 1L, method150 * method151 - n102 * method152);
                            class17.method171(n107, method150 * method152 + n102 * method151);
                        }
                    }
                }
            }
        }
    }
    
    static {
        field32923 = new int[] { 4, 2, 3, 5 };
    }
}
