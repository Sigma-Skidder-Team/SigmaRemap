// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import okhttp3.OkHttpClient;

import java.net.SocketTimeoutException;
import java.net.SocketException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLSocket;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.ProtocolException;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.lang.ref.Reference;
import java.util.List;
import java.net.Socket;

public final class Class5040 extends Class5041 implements Class5039
{
    private static final String field21581 = "throw with null exception";
    private final Class8015 field21582;
    private final Class7465 field21583;
    private Socket field21584;
    private Socket field21585;
    private Class8772 field21586;
    private Class190 field21587;
    private Class1758 field21588;
    private Class1681 field21589;
    private Class1679 field21590;
    public boolean field21591;
    public int field21592;
    public int field21593;
    public final List<Reference<StreamAllocation>> field21594;
    public long field21595;
    
    public Class5040(final Class8015 field21582, final Class7465 field21583) {
        this.field21593 = 1;
        this.field21594 = new ArrayList<Reference<StreamAllocation>>();
        this.field21595 = Long.MAX_VALUE;
        this.field21582 = field21582;
        this.field21583 = field21583;
    }
    
    public static Class5040 method15333(final Class8015 class8015, final Class7465 class8016, final Socket field21585, final long field21586) {
        final Class5040 class8017 = new Class5040(class8015, class8016);
        class8017.field21585 = field21585;
        class8017.field21595 = field21586;
        return class8017;
    }
    
    public void method15334(final int n, final int n2, final int n3, final boolean b) {
        if (this.field21587 != null) {
            throw new IllegalStateException("already connected");
        }
        Class2384 class2384 = null;
        final List<Class8248> method18894 = this.field21583.method23001().method18894();
        final Class8838 class2385 = new Class8838(method18894);
        if (this.field21583.method23001().method18897() == null) {
            if (!method18894.contains(Class8248.field33884)) {
                throw new Class2384(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            final String method18895 = this.field21583.method23001().method18889().method30936();
            if (!Class6550.method19842().method19847(method18895)) {
                throw new Class2384(new UnknownServiceException("CLEARTEXT communication to " + method18895 + " not permitted by network security policy"));
            }
        }
        while (true) {
            try {
                if (this.field21583.method23004()) {
                    this.method15335(n, n2, n3);
                }
                else {
                    this.method15336(n, n2);
                }
                this.method15337(class2385);
                break;
            }
            catch (final IOException ex) {
                Class7690.method24433(this.field21585);
                Class7690.method24433(this.field21584);
                this.field21585 = null;
                this.field21584 = null;
                this.field21589 = null;
                this.field21590 = null;
                this.field21586 = null;
                this.field21587 = null;
                this.field21588 = null;
                if (class2384 == null) {
                    class2384 = new Class2384(ex);
                }
                else {
                    class2384.method9508(ex);
                }
                if (!b || !class2385.method30865(ex)) {
                    throw class2384;
                }
                continue;
            }
        }
        if (this.field21588 != null) {
            synchronized (this.field21582) {
                this.field21593 = this.field21588.method6238();
            }
        }
    }
    
    private void method15335(final int n, final int n2, final int n3) throws IOException {
        Request request = this.method15340();
        final Class8846 method29109 = request.url();
        int n4 = 0;
        final int i = 21;
        while (++n4 <= i) {
            this.method15336(n, n2);
            request = this.method15339(n2, n3, request, method29109);
            if (request == null) {
                return;
            }
            Class7690.method24433(this.field21584);
            this.field21584 = null;
            this.field21590 = null;
            this.field21589 = null;
        }
        throw new ProtocolException("Too many tunnel connections attempted: " + i);
    }
    
    private void method15336(final int n, final int soTimeout) throws IOException {
        final Proxy method23002 = this.field21583.method23002();
        final Class6353 method23003 = this.field21583.method23001();
        (this.field21584 = ((method23002.type() == Proxy.Type.DIRECT || method23002.type() == Proxy.Type.HTTP) ? method23003.method18891().createSocket() : new Socket(method23002))).setSoTimeout(soTimeout);
        try {
            Class6550.method19842().method19845(this.field21584, this.field21583.method23003(), n);
        }
        catch (final ConnectException cause) {
            final ConnectException ex = new ConnectException("Failed to connect to " + this.field21583.method23003());
            ex.initCause(cause);
            throw ex;
        }
        try {
            this.field21589 = Class8753.method30275(Class8753.method30288(this.field21584));
            this.field21590 = Class8753.method30276(Class8753.method30279(this.field21584));
        }
        catch (final NullPointerException cause2) {
            if ("throw with null exception".equals(cause2.getMessage())) {
                throw new IOException(cause2);
            }
        }
    }
    
    private void method15337(final Class8838 class8838) throws IOException {
        if (this.field21583.method23001().method18897() != null) {
            this.method15338(class8838);
            if (this.field21587 == Class190.field625) {
                this.field21585.setSoTimeout(0);
                (this.field21588 = new Class9164(true).method33448(this.field21585, this.field21583.method23001().method18889().method30936(), this.field21589, this.field21590).method33449(this).method33451()).method6254();
            }
            return;
        }
        this.field21587 = Class190.field623;
        this.field21585 = this.field21584;
    }
    
    private void method15338(final Class8838 class8838) throws IOException {
        final Class6353 method23001 = this.field21583.method23001();
        final SSLSocketFactory method23002 = method23001.method18897();
        boolean b = false;
        SSLSocket field21585 = null;
        try {
            try {
                field21585 = (SSLSocket)method23002.createSocket(this.field21584, method23001.method18889().method30936(), method23001.method18889().method30937(), true);
                final Class8248 method23003 = class8838.method30864(field21585);
                if (method23003.method27347()) {
                    Class6550.method19842().method19838(field21585, method23001.method18889().method30936(), method23001.method18893());
                }
                field21585.startHandshake();
                final Class8772 method23004 = Class8772.method30462(field21585.getSession());
                if (!method23001.method18898().verify(method23001.method18889().method30936(), field21585.getSession())) {
                    final X509Certificate x509Certificate = method23004.method30466().get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + method23001.method18889().method30936() + " not verified:\n    certificate: " + Class8645.method29406(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + Class9314.method34472(x509Certificate));
                }
                method23001.method18899().method29402(method23001.method18889().method30936(), method23004.method30466());
                final String s = method23003.method27347() ? Class6550.method19842().method19840(field21585) : null;
                this.field21585 = field21585;
                this.field21589 = Class8753.method30275(Class8753.method30288(this.field21585));
                this.field21590 = Class8753.method30276(Class8753.method30279(this.field21585));
                this.field21586 = method23004;
                this.field21587 = ((s != null) ? Class190.method831(s) : Class190.field623);
                b = true;
                return;
            }
            catch (final AssertionError cause) {
                if (Class7690.method24444(cause)) {
                    throw new IOException(cause);
                }
            }
            throw;
        }
        finally {
            if (field21585 != null) {
                Class6550.method19842().method19839(field21585);
            }
            if (!b) {
                Class7690.method24433(field21585);
            }
        }
    }
    
    private Request method15339(final int n, final int n2, Request method15158, final Class8846 class8846) throws IOException {
        final String string = "CONNECT " + Class7690.method24442(class8846, true) + " HTTP/1.1";
        while (true) {
            final Class7812 class8847 = new Class7812(null, null, this.field21589, this.field21590);
            this.field21589.method5921().method26297(n, TimeUnit.MILLISECONDS);
            this.field21590.method5921().method26297(n2, TimeUnit.MILLISECONDS);
            class8847.method25231(method15158.method29111(), string);
            class8847.method25223();
            final Response method15159 = class8847.method25224(false).method33595(method15158).method33612();
            long method15160 = Class9558.method35751(method15159);
            if (method15160 == -1L) {
                method15160 = 0L;
            }
            final Class1682 method15161 = class8847.method25235(method15160);
            Class7690.method24436(method15161, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            method15161.close();
            switch (method15159.method6188()) {
                case 200: {
                    if (!this.field21589.method5926().method5951() || !this.field21590.method5926().method5951()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    return null;
                }
                case 407: {
                    method15158 = this.field21583.method23001().method18892().method15158(this.field21583, method15159);
                    if (method15158 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                    if ("close".equalsIgnoreCase(method15159.method6193("Connection"))) {
                        return method15158;
                    }
                    continue;
                }
                default: {
                    throw new IOException("Unexpected response code for CONNECT: " + method15159.method6188());
                }
            }
        }
    }
    
    private Request method15340() {
        return new Class8896().method31309(this.field21583.method23001().method18889()).method31312("Host", Class7690.method24442(this.field21583.method23001().method18889(), true)).method31312("Proxy-Connection", "Keep-Alive").method31312("User-Agent", Class8286.method27533()).method31326();
    }
    
    public boolean method15341(final Class6353 class6353, final Class7465 class6354) {
        if (this.field21594.size() >= this.field21593 || this.field21591) {
            return false;
        }
        if (!Class9013.field38043.method32269(this.field21583.method23001(), class6353)) {
            return false;
        }
        if (class6353.method18889().method30936().equals(this.method15329().method23001().method18889().method30936())) {
            return true;
        }
        if (this.field21588 == null) {
            return false;
        }
        if (class6354 == null) {
            return false;
        }
        if (class6354.method23002().type() != Proxy.Type.DIRECT) {
            return false;
        }
        if (this.field21583.method23002().type() != Proxy.Type.DIRECT) {
            return false;
        }
        if (!this.field21583.method23003().equals(class6354.method23003())) {
            return false;
        }
        if (class6354.method23001().method18898() != Class9314.field40001) {
            return false;
        }
        if (!this.method15342(class6353.method18889())) {
            return false;
        }
        try {
            class6353.method18899().method29402(class6353.method18889().method30936(), this.method15331().method30466());
        }
        catch (final SSLPeerUnverifiedException ex) {
            return false;
        }
        return true;
    }
    
    public boolean method15342(final Class8846 class8846) {
        return class8846.method30937() == this.field21583.method23001().method18889().method30937() && (class8846.method30936().equals(this.field21583.method23001().method18889().method30936()) || (this.field21586 != null && Class9314.field40001.verify(class8846.method30936(), this.field21586.method30466().get(0))));
    }
    
    public Class7811 method15343(final OkHttpClient okHttpClient, final StreamAllocation class2310) throws SocketException {
        if (this.field21588 == null) {
            this.field21585.setSoTimeout(okHttpClient.method9390());
            this.field21589.method5921().method26297(okHttpClient.method9390(), TimeUnit.MILLISECONDS);
            this.field21590.method5921().method26297(okHttpClient.method9391(), TimeUnit.MILLISECONDS);
            return new Class7812(okHttpClient, class2310, this.field21589, this.field21590);
        }
        return new Class7810(okHttpClient, class2310, this.field21588);
    }
    
    public Class1669 method15344(final StreamAllocation streamAllocation) {
        return new Class1670(this, true, this.field21589, this.field21590, streamAllocation);
    }
    
    @Override
    public Class7465 method15329() {
        return this.field21583;
    }
    
    public void method15345() {
        Class7690.method24433(this.field21584);
    }
    
    @Override
    public Socket method15330() {
        return this.field21585;
    }
    
    public boolean method15346(final boolean b) {
        if (this.field21585.isClosed() || this.field21585.isInputShutdown() || this.field21585.isOutputShutdown()) {
            return false;
        }
        if (this.field21588 != null) {
            return !this.field21588.method6257();
        }
        if (b) {
            try {
                final int soTimeout = this.field21585.getSoTimeout();
                try {
                    this.field21585.setSoTimeout(1);
                    return !this.field21589.method5951();
                }
                finally {
                    this.field21585.setSoTimeout(soTimeout);
                }
            }
            catch (final SocketTimeoutException ex) {}
            catch (final IOException ex2) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void method15347(final Class8082 class8082) throws IOException {
        class8082.method26529(Class2082.field12043);
    }
    
    @Override
    public void method15348(final Class1758 class1758) {
        synchronized (this.field21582) {
            this.field21593 = class1758.method6238();
        }
    }
    
    @Override
    public Class8772 method15331() {
        return this.field21586;
    }
    
    public boolean method15349() {
        return this.field21588 != null;
    }
    
    @Override
    public Class190 method15332() {
        return this.field21587;
    }
    
    @Override
    public String toString() {
        return "Connection{" + this.field21583.method23001().method18889().method30936() + ":" + this.field21583.method23001().method18889().method30937() + ", proxy=" + this.field21583.method23002() + " hostAddress=" + this.field21583.method23003() + " cipherSuite=" + ((this.field21586 == null) ? "none" : this.field21586.method30465()) + " protocol=" + this.field21587 + '}';
    }
}
