// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.io.Closeable;
import java.io.IOException;

public class Class1583 extends Class1574 implements Class1584
{
    public final Class1736 field8846;
    public final /* synthetic */ Class1758 field8847;
    
    public Class1583(final Class1758 field8847, final Class1736 field8848) {
        this.field8847 = field8847;
        super("OkHttp %s", new Object[] { field8847.field9779 });
        this.field8846 = field8848;
    }
    
    @Override
    public void method5660() {
        Class2082 class2082 = Class2082.field12041;
        Class2082 class2083 = Class2082.field12041;
        try {
            this.field8846.method6135(this);
            while (this.field8846.method6136(false, this)) {}
            class2082 = Class2082.field12039;
            class2083 = Class2082.field12044;
        }
        catch (final IOException ex) {
            class2082 = Class2082.field12040;
            class2083 = Class2082.field12040;
        }
        finally {
            try {
                this.field8847.close(class2082, class2083);
            }
            catch (final IOException ex2) {}
            Class7690.method24432(this.field8846);
        }
    }
    
    @Override
    public void method5664(final boolean b, final int n, final Class1681 class1681, final int n2) throws IOException {
        if (this.field8847.method6258(n)) {
            this.field8847.method6261(n, class1681, n2, b);
            return;
        }
        final Class8082 method6236 = this.field8847.method6236(n);
        if (method6236 != null) {
            method6236.method26533(class1681, n2);
            if (b) {
                method6236.method26534();
            }
            return;
        }
        this.field8847.method6245(n, Class2082.field12040);
        class1681.method5995(n2);
    }
    
    @Override
    public void method5665(final boolean b, final int i, final int n, final List<Class8975> list) {
        if (this.field8847.method6258(i)) {
            this.field8847.method6260(i, list, b);
            return;
        }
        final Class8082 method6236;
        synchronized (this.field8847) {
            if (this.field8847.field9782) {
                return;
            }
            method6236 = this.field8847.method6236(i);
            if (method6236 == null) {
                if (i <= this.field8847.field9780) {
                    return;
                }
                if (i % 2 == this.field8847.field9781 % 2) {
                    return;
                }
                final Class8082 class8082 = new Class8082(i, this.field8847, false, b, list);
                this.field8847.field9780 = i;
                this.field8847.field9778.put(i, class8082);
                Class1758.field9775.execute(new Class1582(this, "OkHttp %s stream %d", new Object[] { this.field8847.field9779, i }, class8082));
                return;
            }
        }
        method6236.method26532(list);
        if (b) {
            method6236.method26534();
        }
    }
    
    @Override
    public void method5666(final int n, final Class2082 class2082) {
        if (!this.field8847.method6258(n)) {
            final Class8082 method6237 = this.field8847.method6237(n);
            if (method6237 != null) {
                method6237.method26535(class2082);
            }
            return;
        }
        this.field8847.method6262(n, class2082);
    }
    
    @Override
    public void method5667(final boolean b, final Class8703 class8703) {
        long n = 0L;
        Class8082[] array = null;
        synchronized (this.field8847) {
            final int method29870 = this.field8847.field9791.method29870();
            if (b) {
                this.field8847.field9791.method29860();
            }
            this.field8847.field9791.method29871(class8703);
            this.method5668(class8703);
            final int method29871 = this.field8847.field9791.method29870();
            if (method29871 != -1 && method29871 != method29870) {
                n = method29871 - method29870;
                if (!this.field8847.field9792) {
                    this.field8847.method6244(n);
                    this.field8847.field9792 = true;
                }
                if (!this.field8847.field9778.isEmpty()) {
                    array = this.field8847.field9778.values().toArray(new Class8082[this.field8847.field9778.size()]);
                }
            }
            Class1758.field9775.execute(new Class1575(this, "OkHttp %s settings", new Object[] { this.field8847.field9779 }));
        }
        if (array != null && n != 0L) {
            for (final Class8082 class8704 : array) {
                synchronized (class8704) {
                    class8704.method26537(n);
                }
            }
        }
    }
    
    private void method5668(final Class8703 class8703) {
        Class1758.field9775.execute(new Class1587(this, "OkHttp %s ACK Settings", new Object[] { this.field8847.field9779 }, class8703));
    }
    
    @Override
    public void method5669() {
    }
    
    @Override
    public void method5670(final boolean b, final int n, final int n2) {
        if (!b) {
            this.field8847.method6249(true, n, n2, null);
        }
        else {
            final Class9116 method6251 = this.field8847.method6251(n);
            if (method6251 != null) {
                method6251.method32980();
            }
        }
    }
    
    @Override
    public void method5671(final int n, final Class2082 class2082, final Class1929 class2083) {
        if (class2083.method7766() > 0) {}
        final Class8082[] array;
        synchronized (this.field8847) {
            array = this.field8847.field9778.values().toArray(new Class8082[this.field8847.field9778.size()]);
            this.field8847.field9782 = true;
        }
        for (final Class8082 class2084 : array) {
            if (class2084.method26517() > n && class2084.method26519()) {
                class2084.method26535(Class2082.field12043);
                this.field8847.method6237(class2084.method26517());
            }
        }
    }
    
    @Override
    public void method5672(final int n, final long n2) {
        if (n == 0) {
            synchronized (this.field8847) {
                final Class1758 field8847 = this.field8847;
                field8847.field9788 += n2;
                this.field8847.notifyAll();
            }
        }
        else {
            final Class8082 method6236 = this.field8847.method6236(n);
            if (method6236 != null) {
                synchronized (method6236) {
                    method6236.method26537(n2);
                }
            }
        }
    }
    
    @Override
    public void method5673(final int n, final int n2, final int n3, final boolean b) {
    }
    
    @Override
    public void method5674(final int n, final int n2, final List<Class8975> list) {
        this.field8847.method6259(n2, list);
    }
    
    @Override
    public void method5675(final int n, final String s, final Class1929 class1929, final String s2, final int n2, final long n3) {
    }
}
