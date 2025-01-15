// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.EOFException;
import java.io.IOException;

public final class Class7812 implements Class7811
{
    private static final int field32003 = 0;
    private static final int field32004 = 1;
    private static final int field32005 = 2;
    private static final int field32006 = 3;
    private static final int field32007 = 4;
    private static final int field32008 = 5;
    private static final int field32009 = 6;
    public final Class2309 field32010;
    public final Class8904 field32011;
    public final Class1681 field32012;
    public final Class1679 field32013;
    public int field32014;
    
    public Class7812(final Class2309 field32010, final Class8904 field32011, final Class1681 field32012, final Class1679 field32013) {
        this.field32014 = 0;
        this.field32010 = field32010;
        this.field32011 = field32011;
        this.field32012 = field32012;
        this.field32013 = field32013;
    }
    
    @Override
    public Class1676 method25220(final Class8596 class8596, final long n) {
        if ("chunked".equalsIgnoreCase(class8596.method29112("Transfer-Encoding"))) {
            return this.method25233();
        }
        if (n == -1L) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        return this.method25234(n);
    }
    
    @Override
    public void method25228() {
        final Class5040 method31371 = this.field32011.method31371();
        if (method31371 != null) {
            method31371.method15345();
        }
    }
    
    @Override
    public void method25221(final Class8596 class8596) throws IOException {
        this.method25231(class8596.method29111(), Class7621.method23956(class8596, this.field32011.method31371().method15329().method23002().type()));
    }
    
    @Override
    public Class1760 method25227(final Class1753 class1753) throws IOException {
        return new Class1761(class1753.method6195(), Class8753.method30275(this.method25229(class1753)));
    }
    
    private Class1682 method25229(final Class1753 class1753) throws IOException {
        if (!Class9558.method35763(class1753)) {
            return this.method25235(0L);
        }
        if ("chunked".equalsIgnoreCase(class1753.method6193("Transfer-Encoding"))) {
            return this.method25236(class1753.method6186().method29109());
        }
        final long method35751 = Class9558.method35751(class1753);
        if (method35751 == -1L) {
            return this.method25237();
        }
        return this.method25235(method35751);
    }
    
    public boolean method25230() {
        return this.field32014 == 6;
    }
    
    @Override
    public void method25222() throws IOException {
        this.field32013.flush();
    }
    
    @Override
    public void method25223() throws IOException {
        this.field32013.flush();
    }
    
    public void method25231(final Class6957 class6957, final String s) throws IOException {
        if (this.field32014 == 0) {
            this.field32013.method5932(s).method5932("\r\n");
            for (int i = 0; i < class6957.method21362(); ++i) {
                this.field32013.method5932(class6957.method21363(i)).method5932(": ").method5932(class6957.method21364(i)).method5932("\r\n");
            }
            this.field32013.method5932("\r\n");
            this.field32014 = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.field32014);
    }
    
    @Override
    public Class9189 method25224(final boolean b) throws IOException {
        if (this.field32014 != 1 && this.field32014 != 3) {
            throw new IllegalStateException("state: " + this.field32014);
        }
        try {
            final Class8482 method28317 = Class8482.method28317(this.field32012.method5985());
            final Class9189 method28318 = new Class9189().method33596(method28317.field34806).method33597(method28317.field34807).method33598(method28317.field34808).method33603(this.method25232());
            if (b && method28317.field34807 == 100) {
                return null;
            }
            this.field32014 = 4;
            return method28318;
        }
        catch (final EOFException cause) {
            final IOException ex = new IOException("unexpected end of stream on " + this.field32011);
            ex.initCause(cause);
            throw ex;
        }
    }
    
    public Class6957 method25232() throws IOException {
        final Class8640 class8640 = new Class8640();
        String method5985;
        while ((method5985 = this.field32012.method5985()).length() != 0) {
            Class9013.field38043.method32264(class8640, method5985);
        }
        return class8640.method29384();
    }
    
    public Class1676 method25233() {
        if (this.field32014 == 1) {
            this.field32014 = 2;
            return new Class1711(this);
        }
        throw new IllegalStateException("state: " + this.field32014);
    }
    
    public Class1676 method25234(final long n) {
        if (this.field32014 == 1) {
            this.field32014 = 2;
            return new Class1712(this, n);
        }
        throw new IllegalStateException("state: " + this.field32014);
    }
    
    public Class1682 method25235(final long n) throws IOException {
        if (this.field32014 == 4) {
            this.field32014 = 5;
            return new Class1688(this, n);
        }
        throw new IllegalStateException("state: " + this.field32014);
    }
    
    public Class1682 method25236(final Class8846 class8846) throws IOException {
        if (this.field32014 == 4) {
            this.field32014 = 5;
            return new Class1687(this, class8846);
        }
        throw new IllegalStateException("state: " + this.field32014);
    }
    
    public Class1682 method25237() throws IOException {
        if (this.field32014 != 4) {
            throw new IllegalStateException("state: " + this.field32014);
        }
        if (this.field32011 != null) {
            this.field32014 = 5;
            this.field32011.method31373();
            return new Class1686(this);
        }
        throw new IllegalStateException("streamAllocation == null");
    }
    
    public void method25238(final Class8022 class8022) {
        final Class8020 method26307 = class8022.method26307();
        class8022.method26308(Class8020.field33035);
        method26307.method26304();
        method26307.method26303();
    }
}
