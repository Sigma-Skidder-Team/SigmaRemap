// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class4149 extends Class4150
{
    Class7187 method12404();
    
    void method12398();
    
    void method12394(final int p0, final byte p1);
    
    void method12395(final int p0, final short p1);
    
    void method12396(final int p0, final float p1);
    
    default Class4150 method12432(final double n, final double n2, final double n3) {
        if (this.method12404().method22048() == Class297.field1700) {
            this.method12396(0, (float)n);
            this.method12396(4, (float)n2);
            this.method12396(8, (float)n3);
            this.method12398();
            return this;
        }
        throw new IllegalStateException();
    }
    
    default Class4150 method12399(final int n, final int n2, final int n3, final int n4) {
        final Class7187 method12404 = this.method12404();
        if (method12404.method22049() != Class2078.field12012) {
            return this;
        }
        if (method12404.method22048() == Class297.field1701) {
            this.method12394(0, (byte)n);
            this.method12394(1, (byte)n2);
            this.method12394(2, (byte)n3);
            this.method12394(3, (byte)n4);
            this.method12398();
            return this;
        }
        throw new IllegalStateException();
    }
    
    default Class4150 method12391(final float n, final float n2) {
        final Class7187 method12404 = this.method12404();
        if (method12404.method22049() != Class2078.field12013 || method12404.method22051() != 0) {
            return this;
        }
        if (method12404.method22048() == Class297.field1700) {
            this.method12396(0, n);
            this.method12396(4, n2);
            this.method12398();
            return this;
        }
        throw new IllegalStateException();
    }
    
    default Class4150 method12433(final int n, final int n2) {
        return this.method12435((short)n, (short)n2, 1);
    }
    
    default Class4150 method12434(final int n, final int n2) {
        return this.method12435((short)n, (short)n2, 2);
    }
    
    default Class4150 method12435(final short n, final short n2, final int n3) {
        final Class7187 method12404 = this.method12404();
        if (method12404.method22049() != Class2078.field12013 || method12404.method22051() != n3) {
            return this;
        }
        if (method12404.method22048() == Class297.field1704) {
            this.method12395(0, n);
            this.method12395(2, n2);
            this.method12398();
            return this;
        }
        throw new IllegalStateException();
    }
    
    default Class4150 method12436(final float n, final float n2, final float n3) {
        final Class7187 method12404 = this.method12404();
        if (method12404.method22049() != Class2078.field12011) {
            return this;
        }
        if (method12404.method22048() == Class297.field1702) {
            this.method12394(0, method12437(n));
            this.method12394(1, method12437(n2));
            this.method12394(2, method12437(n3));
            this.method12398();
            return this;
        }
        throw new IllegalStateException();
    }
    
    default byte method12437(final float n) {
        return (byte)((int)(Class9546.method35653(n, -1.0f, 1.0f) * 127.0f) & 0xFF);
    }
}
