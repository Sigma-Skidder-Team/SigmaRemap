// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3;

import mapped.*;

import java.net.Proxy;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import java.io.InterruptedIOException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.io.IOException;

public final class RetryAndFollowUpInterceptor implements Class6814 {
    private static final int field26760 = 20;
    private final OkHttpClient field26761;
    private final boolean field26762;
    private StreamAllocation field26763;
    private Object field26764;
    private volatile boolean field26765;

    public RetryAndFollowUpInterceptor(final OkHttpClient field26761, final boolean field26762) {
        this.field26761 = field26761;
        this.field26762 = field26762;
    }

    public void cancel() {
        this.field26765 = true;
        final StreamAllocation field26763 = this.field26763;
        if (field26763 != null) {
            field26763.method31375();
        }
    }

    public boolean isCanceled() {
        return this.field26765;
    }

    public void method20864(final Object field26764) {
        this.field26764 = field26764;
    }

    public StreamAllocation streamAllocation() {
        return this.field26763;
    }

    @Override
    public Response method20856(final Class8711 class8711) throws IOException {
        Request method29905 = class8711.method29905();
        this.field26763 = new StreamAllocation(this.field26761.method9405(), this.method20866(method29905.url()), this.field26764);
        int i = 0;
        Response class8712 = null;
        while (!this.field26765) {
            Response obj = null;
            boolean b = true;
            try {
                obj = ((RealInterceptorChain) class8711).method29910(method29905, this.field26763, null, null);
                b = false;
            } catch (final Class2384 class8713) {
                if (!this.method20867(class8713.method9507(), false, method29905)) {
                    throw class8713.method9507();
                }
                b = false;
                continue;
            } catch (final IOException ex) {
                if (!this.method20867(ex, !(ex instanceof Class2352), method29905)) {
                    throw ex;
                }
                b = false;
                continue;
            } finally {
                if (b) {
                    this.field26763.method31376(null);
                    this.field26763.method31372();
                }
            }
            if (class8712 != null) {
                obj = obj.method6198().method33608(class8712.method6198().method33604(null).method33612()).method33612();
            }
            final Request method29906 = this.method20869(obj);
            if (method29906 == null) {
                if (!this.field26762) {
                    this.field26763.method31372();
                }
                return obj;
            }
            Class7690.method24432(obj.method6197());
            if (++i > 20) {
                this.field26763.method31372();
                throw new ProtocolException("Too many follow-up requests: " + i);
            }
            if (method29906.method29114() instanceof Class7772) {
                this.field26763.method31372();
                throw new HttpRetryException("Cannot retry streamed HTTP body", obj.method6188());
            }
            if (!this.method20870(obj, method29906.url())) {
                this.field26763.method31372();
                this.field26763 = new StreamAllocation(this.field26761.method9405(), this.method20866(method29906.url()), this.field26764);
            } else if (this.field26763.method31369() != null) {
                throw new IllegalStateException("Closing the body of " + obj + " didn't close its backing stream. Bad interceptor?");
            }
            method29905 = method29906;
            class8712 = obj;
        }
        this.field26763.method31372();
        throw new IOException("Canceled");
    }

    private Class6353 method20866(final Class8846 class8846) {
        SSLSocketFactory method9400 = null;
        HostnameVerifier method9401 = null;
        Class8645 method9402 = null;
        if (class8846.method30931()) {
            method9400 = this.field26761.method9400();
            method9401 = this.field26761.method9401();
            method9402 = this.field26761.method9402();
        }
        return new Class6353(class8846.method30936(), class8846.method30937(), this.field26761.method9398(), this.field26761.method9399(), method9400, method9401, method9402, this.field26761.method9404(), this.field26761.method9393(), this.field26761.method9410(), this.field26761.method9411(), this.field26761.method9394());
    }

    private boolean method20867(final IOException ex, final boolean b, final Request request) {
        this.field26763.method31376(ex);
        return this.field26761.method9408() && (!b || !(request.method29114() instanceof Class7772)) && this.method20868(ex, b) && this.field26763.method31380();
    }

    private boolean method20868(final IOException ex, final boolean b) {
        if (ex instanceof ProtocolException) {
            return false;
        }
        if (!(ex instanceof InterruptedIOException)) {
            return (!(ex instanceof SSLHandshakeException) || !(ex.getCause() instanceof CertificateException)) && !(ex instanceof SSLPeerUnverifiedException);
        }
        return ex instanceof SocketTimeoutException && !b;
    }

    private Request method20869(final Response class1753) throws IOException {
        if (class1753 == null) {
            throw new IllegalStateException();
        }
        final Class5040 method31371 = this.field26763.method31371();
        final Class7465 class1754 = (method31371 != null) ? method31371.method15329() : null;
        final int method31372 = class1753.method6188();
        final String method31373 = class1753.method6186().method29110();
        switch (method31372) {
            case 407: {
                if (((class1754 != null) ? class1754.method23002() : this.field26761.method9393()).type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.field26761.method9404().method15158(class1754, class1753);
            }
            case 401: {
                return this.field26761.method9403().method15158(class1754, class1753);
            }
            case 307:
            case 308: {
                if (!method31373.equals("GET") && !method31373.equals("HEAD")) {
                    return null;
                }
            }
            case 300:
            case 301:
            case 302:
            case 303: {
                if (!this.field26761.method9407()) {
                    return null;
                }
                final String method31374 = class1753.method6193("Location");
                if (method31374 == null) {
                    return null;
                }
                final Class8846 method31375 = class1753.method6186().url().method30957(method31374);
                if (method31375 == null) {
                    return null;
                }
                if (!method31375.method30930().equals(class1753.method6186().url().method30930()) && !this.field26761.method9406()) {
                    return null;
                }
                final Class8896 method31376 = class1753.method6186().method29116();
                if (Class8196.method27144(method31373)) {
                    final boolean method31377 = Class8196.method27145(method31373);
                    if (Class8196.method27146(method31373)) {
                        method31376.method31324("GET", null);
                    } else {
                        method31376.method31324(method31373, method31377 ? class1753.method6186().method29114() : null);
                    }
                    if (!method31377) {
                        method31376.method31314("Transfer-Encoding");
                        method31376.method31314("Content-Length");
                        method31376.method31314("Content-Type");
                    }
                }
                if (!this.method20870(class1753, method31375)) {
                    method31376.method31314("Authorization");
                }
                return method31376.method31309(method31375).method31326();
            }
            case 408: {
                if (class1753.method6186().method29114() instanceof Class7772) {
                    return null;
                }
                return class1753.method6186();
            }
            default: {
                return null;
            }
        }
    }

    private boolean method20870(final Response class1753, final Class8846 class1754) {
        final Class8846 method29109 = class1753.method6186().url();
        if (method29109.method30936().equals(class1754.method30936())) {
            if (method29109.method30937() == class1754.method30937()) {
                if (method29109.method30930().equals(class1754.method30930())) {
                    return true;
                }
            }
        }
        return false;
    }
}
