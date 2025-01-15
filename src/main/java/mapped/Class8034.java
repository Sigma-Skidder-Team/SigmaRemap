// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.List;
import java.util.Arrays;

public final class Class8034
{
    private static String[] field33074;
    private static final int field33075 = 4096;
    private static final int field33076 = 16384;
    private final Class1680 field33077;
    private final boolean field33078;
    private int field33079;
    private boolean field33080;
    public int field33081;
    public int field33082;
    public Class8975[] field33083;
    public int field33084;
    public int field33085;
    public int field33086;
    
    public Class8034(final Class1680 class1680) {
        this(4096, true, class1680);
    }
    
    public Class8034(final int n, final boolean field33078, final Class1680 field33079) {
        this.field33079 = Integer.MAX_VALUE;
        this.field33083 = new Class8975[8];
        this.field33084 = this.field33083.length - 1;
        this.field33085 = 0;
        this.field33086 = 0;
        this.field33081 = n;
        this.field33082 = n;
        this.field33078 = field33078;
        this.field33077 = field33079;
    }
    
    private void method26350() {
        Arrays.fill(this.field33083, null);
        this.field33084 = this.field33083.length - 1;
        this.field33085 = 0;
        this.field33086 = 0;
    }
    
    private int method26351(int n) {
        int n2 = 0;
        if (n > 0) {
            for (int n3 = this.field33083.length - 1; n3 >= this.field33084 && n > 0; n -= this.field33083[n3].field37842, this.field33086 -= this.field33083[n3].field37842, --this.field33085, ++n2, --n3) {}
            System.arraycopy(this.field33083, this.field33084 + 1, this.field33083, this.field33084 + 1 + n2, this.field33085);
            Arrays.fill(this.field33083, this.field33084 + 1, this.field33084 + 1 + n2, null);
            this.field33084 += n2;
        }
        return n2;
    }
    
    private void method26352(final Class8975 class8975) {
        final int field37842 = class8975.field37842;
        if (field37842 <= this.field33082) {
            this.method26351(this.field33086 + field37842 - this.field33082);
            if (this.field33085 + 1 > this.field33083.length) {
                final Class8975[] field37843 = new Class8975[this.field33083.length * 2];
                System.arraycopy(this.field33083, 0, field37843, this.field33083.length, this.field33083.length);
                this.field33084 = this.field33083.length - 1;
                this.field33083 = field37843;
            }
            this.field33083[this.field33084--] = class8975;
            ++this.field33085;
            this.field33086 += field37842;
            return;
        }
        this.method26350();
    }
    
    public void method26353(final List<Class8975> list) throws IOException {
        if (this.field33080) {
            if (this.field33079 < this.field33082) {
                this.method26354(this.field33079, 31, 32);
            }
            this.field33080 = false;
            this.field33079 = Integer.MAX_VALUE;
            this.method26354(this.field33082, 31, 32);
        }
        for (int i = 0; i < list.size(); ++i) {
            final Class8975 class8975 = list.get(i);
            final Class1929 method7761 = class8975.field37840.method7761();
            final Class1929 field37841 = class8975.field37841;
            int n = -1;
            int n2 = -1;
            final Integer n3 = Class9477.field40754.get(method7761);
            if (n3 != null) {
                n2 = n3 + 1;
                if (n2 > 1) {
                    if (n2 < 8) {
                        if (!Class7690.method24431(Class9477.field40753[n2 - 1].field37841, field37841)) {
                            if (Class7690.method24431(Class9477.field40753[n2].field37841, field37841)) {
                                n = n2 + 1;
                            }
                        }
                        else {
                            n = n2;
                        }
                    }
                }
            }
            if (n == -1) {
                for (int j = this.field33084 + 1; j < this.field33083.length; ++j) {
                    if (Class7690.method24431(this.field33083[j].field37840, method7761)) {
                        if (Class7690.method24431(this.field33083[j].field37841, field37841)) {
                            n = j - this.field33084 + Class9477.field40753.length;
                            break;
                        }
                        if (n2 == -1) {
                            n2 = j - this.field33084 + Class9477.field40753.length;
                        }
                    }
                }
            }
            if (n == -1) {
                if (n2 != -1) {
                    if (method7761.method7774(Class8975.field37834) && !Class8975.field37839.equals(method7761)) {
                        this.method26354(n2, 15, 0);
                        this.method26355(field37841);
                    }
                    else {
                        this.method26354(n2, 63, 64);
                        this.method26355(field37841);
                        this.method26352(class8975);
                    }
                }
                else {
                    this.field33077.method6004(64);
                    this.method26355(method7761);
                    this.method26355(field37841);
                    this.method26352(class8975);
                }
            }
            else {
                this.method26354(n, 127, 128);
            }
        }
    }
    
    public void method26354(int i, final int n, final int n2) {
        if (i >= n) {
            this.field33077.method6004(n2 | n);
            for (i -= n; i >= 128; i >>>= 7) {
                this.field33077.method6004((i & 0x7F) | 0x80);
            }
            this.field33077.method6004(i);
            return;
        }
        this.field33077.method6004(n2 | i);
    }
    
    public void method26355(final Class1929 class1929) throws IOException {
        if (this.field33078 && Class6771.method20659().method20661(class1929) < class1929.method7766()) {
            final Class1680 class1930 = new Class1680();
            Class6771.method20659().method20660(class1929, class1930);
            final Class1929 method5974 = class1930.method5974();
            this.method26354(method5974.method7766(), 127, 128);
            this.field33077.method5996(method5974);
        }
        else {
            this.method26354(class1929.method7766(), 127, 0);
            this.field33077.method5996(class1929);
        }
    }
    
    public void method26356(final int n) {
        this.field33081 = n;
        final int min = Math.min(n, 16384);
        if (this.field33082 != min) {
            if (min < this.field33082) {
                this.field33079 = Math.min(this.field33079, min);
            }
            this.field33080 = true;
            this.field33082 = min;
            this.method26357();
        }
    }
    
    private void method26357() {
        if (this.field33082 < this.field33086) {
            if (this.field33082 != 0) {
                this.method26351(this.field33086 - this.field33082);
            }
            else {
                this.method26350();
            }
        }
    }
}
