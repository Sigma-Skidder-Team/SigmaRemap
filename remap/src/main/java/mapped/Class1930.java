// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.nio.charset.Charset;

public final class Class1930 extends Class1929
{
    public final transient byte[][] field10536;
    public final transient int[] field10537;
    
    public Class1930(final Class1680 class1680, final int n) {
        super(null);
        Class9476.method35277(class1680.field9512, 0L, n);
        int i = 0;
        int n2 = 0;
        for (Class9258 class1681 = class1680.field9511; i < n; i += class1681.field39715 - class1681.field39714, ++n2, class1681 = class1681.field39718) {
            if (class1681.field39715 == class1681.field39714) {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.field10536 = new byte[n2][];
        this.field10537 = new int[n2 * 2];
        int j = 0;
        int n3 = 0;
        Class9258 class1682 = class1680.field9511;
        while (j < n) {
            this.field10536[n3] = class1682.field39713;
            j += class1682.field39715 - class1682.field39714;
            if (j > n) {
                j = n;
            }
            this.field10537[n3] = j;
            this.field10537[n3 + this.field10536.length] = class1682.field39714;
            class1682.field39716 = true;
            ++n3;
            class1682 = class1682.field39718;
        }
    }
    
    @Override
    public String method7743() {
        return this.method7790().method7743();
    }
    
    @Override
    public String method7744(final Charset charset) {
        return this.method7790().method7744(charset);
    }
    
    @Override
    public String method7745() {
        return this.method7790().method7745();
    }
    
    @Override
    public String method7757() {
        return this.method7790().method7757();
    }
    
    @Override
    public Class1929 method7761() {
        return this.method7790().method7761();
    }
    
    @Override
    public Class1929 method7762() {
        return this.method7790().method7762();
    }
    
    @Override
    public Class1929 method7746() {
        return this.method7790().method7746();
    }
    
    @Override
    public Class1929 method7747() {
        return this.method7790().method7747();
    }
    
    @Override
    public Class1929 method7748() {
        return this.method7790().method7748();
    }
    
    @Override
    public Class1929 method7751(final Class1929 class1929) {
        return this.method7790().method7751(class1929);
    }
    
    @Override
    public Class1929 method7752(final Class1929 class1929) {
        return this.method7790().method7752(class1929);
    }
    
    @Override
    public String method7755() {
        return this.method7790().method7755();
    }
    
    @Override
    public Class1929 method7763(final int n) {
        return this.method7790().method7763(n);
    }
    
    @Override
    public Class1929 method7764(final int n, final int n2) {
        return this.method7790().method7764(n, n2);
    }
    
    @Override
    public byte method7765(final int n) {
        Class9476.method35277(this.field10537[this.field10536.length - 1], n, 1L);
        final int method7789 = this.method7789(n);
        return this.field10536[method7789][n - ((method7789 != 0) ? this.field10537[method7789 - 1] : 0) + this.field10537[method7789 + this.field10536.length]];
    }
    
    private int method7789(final int n) {
        final int binarySearch = Arrays.binarySearch(this.field10537, 0, this.field10536.length, n + 1);
        return (binarySearch < 0) ? (~binarySearch) : binarySearch;
    }
    
    @Override
    public int method7766() {
        return this.field10537[this.field10536.length - 1];
    }
    
    @Override
    public byte[] method7767() {
        final byte[] array = new byte[this.field10537[this.field10536.length - 1]];
        int n = 0;
        for (int i = 0, length = this.field10536.length; i < length; ++i) {
            final int n2 = this.field10537[length + i];
            final int n3 = this.field10537[i];
            System.arraycopy(this.field10536[i], n2, array, n, n3 - n);
            n = n3;
        }
        return array;
    }
    
    @Override
    public ByteBuffer method7769() {
        return ByteBuffer.wrap(this.method7767()).asReadOnlyBuffer();
    }
    
    @Override
    public void method7770(final OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            int n = 0;
            for (int i = 0, length = this.field10536.length; i < length; ++i) {
                final int off = this.field10537[length + i];
                final int n2 = this.field10537[i];
                outputStream.write(this.field10536[i], off, n2 - n);
                n = n2;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }
    
    @Override
    public void method7771(final Class1680 class1680) {
        int n = 0;
        for (int i = 0, length = this.field10536.length; i < length; ++i) {
            final int n2 = this.field10537[length + i];
            final int n3 = this.field10537[i];
            final Class9258 class1681 = new Class9258(this.field10536[i], n2, n2 + n3 - n);
            if (class1680.field9511 != null) {
                class1680.field9511.field39719.method34163(class1681);
            }
            else {
                final Class9258 class1682 = class1681;
                final Class9258 class1683 = class1681;
                final Class9258 field9511 = class1681;
                class1683.field39719 = field9511;
                class1682.field39718 = field9511;
                class1680.field9511 = field9511;
            }
            n = n3;
        }
        class1680.field9512 += n;
    }
    
    @Override
    public boolean method7772(int n, final Class1929 class1929, int n2, int i) {
        if (n >= 0 && n <= this.method7766() - i) {
            int min;
            for (int method7789 = this.method7789(n); i > 0; i -= min, ++method7789) {
                final int n3 = (method7789 != 0) ? this.field10537[method7789 - 1] : 0;
                min = Math.min(i, n3 + (this.field10537[method7789] - n3) - n);
                if (!class1929.method7773(n2, this.field10536[method7789], n - n3 + this.field10537[this.field10536.length + method7789], min)) {
                    return false;
                }
                n += min;
                n2 += min;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method7773(int n, final byte[] array, int n2, int i) {
        if (n >= 0) {
            if (n <= this.method7766() - i) {
                if (n2 >= 0) {
                    if (n2 <= array.length - i) {
                        int min;
                        for (int method7789 = this.method7789(n); i > 0; i -= min, ++method7789) {
                            final int n3 = (method7789 != 0) ? this.field10537[method7789 - 1] : 0;
                            min = Math.min(i, n3 + (this.field10537[method7789] - n3) - n);
                            if (!Class9476.method35283(this.field10536[method7789], n - n3 + this.field10537[this.field10536.length + method7789], array, n2, min)) {
                                return false;
                            }
                            n += min;
                            n2 += min;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int method7781(final byte[] array, final int n) {
        return this.method7790().method7781(array, n);
    }
    
    @Override
    public int method7785(final byte[] array, final int n) {
        return this.method7790().method7785(array, n);
    }
    
    private Class1929 method7790() {
        return new Class1929(this.method7767());
    }
    
    @Override
    public byte[] method7768() {
        return this.method7767();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (o instanceof Class1929) {
                if (((Class1929)o).method7766() == this.method7766()) {
                    return this.method7772(0, (Class1929) o, 0, this.method7766());
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int field10534 = this.field10534;
        if (field10534 == 0) {
            int field10535 = 1;
            int n = 0;
            for (int i = 0, length = this.field10536.length; i < length; ++i) {
                final byte[] array = this.field10536[i];
                final int n2 = this.field10537[length + i];
                final int n3 = this.field10537[i];
                for (int n4 = n3 - n, j = n2; j < n2 + n4; ++j) {
                    field10535 = 31 * field10535 + array[j];
                }
                n = n3;
            }
            return this.field10534 = field10535;
        }
        return field10534;
    }
    
    @Override
    public String toString() {
        return this.method7790().toString();
    }
    
    private Object method7791() {
        return this.method7790();
    }
}
