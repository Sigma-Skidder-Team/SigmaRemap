// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public final class Class8916
{
    private final List<Class8975> field37494;
    private final Class1681 field37495;
    private final int field37496;
    private int field37497;
    public Class8975[] field37498;
    public int field37499;
    public int field37500;
    public int field37501;
    
    public Class8916(final int n, final Class1682 class1682) {
        this(n, n, class1682);
    }
    
    public Class8916(final int field37496, final int field37497, final Class1682 class1682) {
        this.field37494 = new ArrayList<Class8975>();
        this.field37498 = new Class8975[8];
        this.field37499 = this.field37498.length - 1;
        this.field37500 = 0;
        this.field37501 = 0;
        this.field37496 = field37496;
        this.field37497 = field37497;
        this.field37495 = Class8753.method30275(class1682);
    }
    
    public int method31425() {
        return this.field37497;
    }
    
    private void method31426() {
        if (this.field37497 < this.field37501) {
            if (this.field37497 != 0) {
                this.method31428(this.field37501 - this.field37497);
            }
            else {
                this.method31427();
            }
        }
    }
    
    private void method31427() {
        Arrays.fill(this.field37498, null);
        this.field37499 = this.field37498.length - 1;
        this.field37500 = 0;
        this.field37501 = 0;
    }
    
    private int method31428(int n) {
        int n2 = 0;
        if (n > 0) {
            for (int n3 = this.field37498.length - 1; n3 >= this.field37499 && n > 0; n -= this.field37498[n3].field37842, this.field37501 -= this.field37498[n3].field37842, --this.field37500, ++n2, --n3) {}
            System.arraycopy(this.field37498, this.field37499 + 1, this.field37498, this.field37499 + 1 + n2, this.field37500);
            this.field37499 += n2;
        }
        return n2;
    }
    
    public void method31429() throws IOException {
        while (!this.field37495.method5951()) {
            final int n = this.field37495.method5964() & 0xFF;
            if (n == 128) {
                throw new IOException("index == 0");
            }
            if ((n & 0x80) != 0x80) {
                if (n != 64) {
                    if ((n & 0x40) != 0x40) {
                        if ((n & 0x20) != 0x20) {
                            if (n != 16 && n != 0) {
                                this.method31433(this.method31441(n, 15) - 1);
                            }
                            else {
                                this.method31434();
                            }
                        }
                        else {
                            this.field37497 = this.method31441(n, 31);
                            if (this.field37497 < 0 || this.field37497 > this.field37496) {
                                throw new IOException("Invalid dynamic table size update " + this.field37497);
                            }
                            this.method31426();
                        }
                    }
                    else {
                        this.method31435(this.method31441(n, 63) - 1);
                    }
                }
                else {
                    this.method31436();
                }
            }
            else {
                this.method31431(this.method31441(n, 127) - 1);
            }
        }
    }
    
    public List<Class8975> method31430() {
        final ArrayList list = new ArrayList(this.field37494);
        this.field37494.clear();
        return list;
    }
    
    private void method31431(final int n) throws IOException {
        if (!this.method31438(n)) {
            final int method31432 = this.method31432(n - Class9477.field40753.length);
            if (method31432 < 0 || method31432 > this.field37498.length - 1) {
                throw new IOException("Header index too large " + (n + 1));
            }
            this.field37494.add(this.field37498[method31432]);
        }
        else {
            this.field37494.add(Class9477.field40753[n]);
        }
    }
    
    private int method31432(final int n) {
        return this.field37499 + 1 + n;
    }
    
    private void method31433(final int n) throws IOException {
        this.field37494.add(new Class8975(this.method31437(n), this.method31442()));
    }
    
    private void method31434() throws IOException {
        this.field37494.add(new Class8975(Class9477.method35285(this.method31442()), this.method31442()));
    }
    
    private void method31435(final int n) throws IOException {
        this.method31439(-1, new Class8975(this.method31437(n), this.method31442()));
    }
    
    private void method31436() throws IOException {
        this.method31439(-1, new Class8975(Class9477.method35285(this.method31442()), this.method31442()));
    }
    
    private Class1929 method31437(final int n) {
        if (!this.method31438(n)) {
            return this.field37498[this.method31432(n - Class9477.field40753.length)].field37840;
        }
        return Class9477.field40753[n].field37840;
    }
    
    private boolean method31438(final int n) {
        return n >= 0 && n <= Class9477.field40753.length - 1;
    }
    
    private void method31439(int n, final Class8975 class8975) {
        this.field37494.add(class8975);
        int field37842 = class8975.field37842;
        if (n != -1) {
            field37842 -= this.field37498[this.method31432(n)].field37842;
        }
        if (field37842 <= this.field37497) {
            final int method31428 = this.method31428(this.field37501 + field37842 - this.field37497);
            if (n != -1) {
                n += this.method31432(n) + method31428;
                this.field37498[n] = class8975;
            }
            else {
                if (this.field37500 + 1 > this.field37498.length) {
                    final Class8975[] field37843 = new Class8975[this.field37498.length * 2];
                    System.arraycopy(this.field37498, 0, field37843, this.field37498.length, this.field37498.length);
                    this.field37499 = this.field37498.length - 1;
                    this.field37498 = field37843;
                }
                n = this.field37499--;
                this.field37498[n] = class8975;
                ++this.field37500;
            }
            this.field37501 += field37842;
            return;
        }
        this.method31427();
    }
    
    private int method31440() throws IOException {
        return this.field37495.method5964() & 0xFF;
    }
    
    public int method31441(final int n, final int n2) throws IOException {
        final int n3 = n & n2;
        if (n3 >= n2) {
            return n2 + (this.method31440() << 0);
        }
        return n3;
    }
    
    public Class1929 method31442() throws IOException {
        final int method31440 = this.method31440();
        final boolean b = (method31440 & 0x80) == 0x80;
        final int method31441 = this.method31441(method31440, 127);
        if (!b) {
            return this.field37495.method5975(method31441);
        }
        return Class1929.method7738(Class6771.method20659().method20662(this.field37495.method5990(method31441)));
    }
}
