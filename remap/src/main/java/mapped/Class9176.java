// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import okhttp3.OkHttpClient;
import org.java_websocket.client.DnsResolver;

import java.util.Collections;
import javax.net.ssl.X509TrustManager;
import java.util.concurrent.TimeUnit;
import java.util.Collection;
import java.util.ArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.SocketFactory;
import java.net.ProxySelector;
import java.util.List;
import java.net.Proxy;

public final class Class9176
{
    public Class8993 field38868;
    public Proxy field38869;
    public List<Class190> field38870;
    public List<Class8248> field38871;
    public final List<Class6814> field38872;
    public final List<Class6814> field38873;
    public Class8856 field38874;
    public ProxySelector field38875;
    public Class7536 field38876;
    public Class1726 field38877;
    public Class8674 field38878;
    public SocketFactory field38879;
    public SSLSocketFactory field38880;
    public Class7744 field38881;
    public HostnameVerifier field38882;
    public Class8645 field38883;
    public Class4972 field38884;
    public Class4972 field38885;
    public Class8015 field38886;
    public DnsResolver field38887;
    public boolean field38888;
    public boolean field38889;
    public boolean field38890;
    public int field38891;
    public int field38892;
    public int field38893;
    public int field38894;
    
    public Class9176() {
        this.field38872 = new ArrayList<Class6814>();
        this.field38873 = new ArrayList<Class6814>();
        this.field38868 = new Class8993();
        this.field38870 = OkHttpClient.field14002;
        this.field38871 = OkHttpClient.field14003;
        this.field38874 = Class8648.method29415(Class8648.field36304);
        this.field38875 = ProxySelector.getDefault();
        this.field38876 = Class7536.field29918;
        this.field38879 = SocketFactory.getDefault();
        this.field38882 = Class9314.field40001;
        this.field38883 = Class8645.field36293;
        this.field38884 = Class4972.field21434;
        this.field38885 = Class4972.field21434;
        this.field38886 = new Class8015();
        this.field38887 = DnsResolver.field30530;
        this.field38888 = true;
        this.field38889 = true;
        this.field38890 = true;
        this.field38891 = 10000;
        this.field38892 = 10000;
        this.field38893 = 10000;
        this.field38894 = 0;
    }
    
    public Class9176(final OkHttpClient okHttpClient) {
        this.field38872 = new ArrayList<Class6814>();
        this.field38873 = new ArrayList<Class6814>();
        this.field38868 = okHttpClient.field14004;
        this.field38869 = okHttpClient.field14005;
        this.field38870 = okHttpClient.field14006;
        this.field38871 = okHttpClient.field14007;
        this.field38872.addAll(okHttpClient.field14008);
        this.field38873.addAll(okHttpClient.field14009);
        this.field38874 = okHttpClient.field14010;
        this.field38875 = okHttpClient.field14011;
        this.field38876 = okHttpClient.field14012;
        this.field38878 = okHttpClient.field14014;
        this.field38877 = okHttpClient.field14013;
        this.field38879 = okHttpClient.field14015;
        this.field38880 = okHttpClient.field14016;
        this.field38881 = okHttpClient.field14017;
        this.field38882 = okHttpClient.field14018;
        this.field38883 = okHttpClient.field14019;
        this.field38884 = okHttpClient.field14020;
        this.field38885 = okHttpClient.field14021;
        this.field38886 = okHttpClient.field14022;
        this.field38887 = okHttpClient.field14023;
        this.field38888 = okHttpClient.field14024;
        this.field38889 = okHttpClient.field14025;
        this.field38890 = okHttpClient.field14026;
        this.field38891 = okHttpClient.field14027;
        this.field38892 = okHttpClient.field14028;
        this.field38893 = okHttpClient.field14029;
        this.field38894 = okHttpClient.field14030;
    }
    
    public Class9176 method33500(final long n, final TimeUnit timeUnit) {
        this.field38891 = method33504("timeout", n, timeUnit);
        return this;
    }
    
    public Class9176 method33501(final long n, final TimeUnit timeUnit) {
        this.field38892 = method33504("timeout", n, timeUnit);
        return this;
    }
    
    public Class9176 method33502(final long n, final TimeUnit timeUnit) {
        this.field38893 = method33504("timeout", n, timeUnit);
        return this;
    }
    
    public Class9176 method33503(final long n, final TimeUnit timeUnit) {
        this.field38894 = method33504("interval", n, timeUnit);
        return this;
    }
    
    private static int method33504(final String str, final long duration, final TimeUnit timeUnit) {
        if (duration < 0L) {
            throw new IllegalArgumentException(str + " < 0");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        final long millis = timeUnit.toMillis(duration);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str + " too large.");
        }
        if (millis == 0L && duration > 0L) {
            throw new IllegalArgumentException(str + " too small.");
        }
        return (int)millis;
    }
    
    public Class9176 method33505(final Proxy field38869) {
        this.field38869 = field38869;
        return this;
    }
    
    public Class9176 method33506(final ProxySelector field38875) {
        this.field38875 = field38875;
        return this;
    }
    
    public Class9176 method33507(final Class7536 field38876) {
        if (field38876 != null) {
            this.field38876 = field38876;
            return this;
        }
        throw new NullPointerException("cookieJar == null");
    }
    
    public void method33508(final Class8674 field38878) {
        this.field38878 = field38878;
        this.field38877 = null;
    }
    
    public Class9176 method33509(final Class1726 field38877) {
        this.field38877 = field38877;
        this.field38878 = null;
        return this;
    }
    
    public Class9176 method33510(final DnsResolver field38887) {
        if (field38887 != null) {
            this.field38887 = field38887;
            return this;
        }
        throw new NullPointerException("dns == null");
    }
    
    public Class9176 method33511(final SocketFactory field38879) {
        if (field38879 != null) {
            this.field38879 = field38879;
            return this;
        }
        throw new NullPointerException("socketFactory == null");
    }
    
    @Deprecated
    public Class9176 method33512(final SSLSocketFactory field38880) {
        if (field38880 == null) {
            throw new NullPointerException("sslSocketFactory == null");
        }
        final X509TrustManager method19844 = Class6550.method19842().method19844(field38880);
        if (method19844 != null) {
            this.field38880 = field38880;
            this.field38881 = Class7744.method24709(method19844);
            return this;
        }
        throw new IllegalStateException("Unable to extract the trust manager on " + Class6550.method19842() + ", sslSocketFactory is " + field38880.getClass());
    }
    
    public Class9176 method33513(final SSLSocketFactory field38880, final X509TrustManager x509TrustManager) {
        if (field38880 == null) {
            throw new NullPointerException("sslSocketFactory == null");
        }
        if (x509TrustManager != null) {
            this.field38880 = field38880;
            this.field38881 = Class7744.method24709(x509TrustManager);
            return this;
        }
        throw new NullPointerException("trustManager == null");
    }
    
    public Class9176 method33514(final HostnameVerifier field38882) {
        if (field38882 != null) {
            this.field38882 = field38882;
            return this;
        }
        throw new NullPointerException("hostnameVerifier == null");
    }
    
    public Class9176 method33515(final Class8645 field38883) {
        if (field38883 != null) {
            this.field38883 = field38883;
            return this;
        }
        throw new NullPointerException("certificatePinner == null");
    }
    
    public Class9176 method33516(final Class4972 field38885) {
        if (field38885 != null) {
            this.field38885 = field38885;
            return this;
        }
        throw new NullPointerException("authenticator == null");
    }
    
    public Class9176 method33517(final Class4972 field38884) {
        if (field38884 != null) {
            this.field38884 = field38884;
            return this;
        }
        throw new NullPointerException("proxyAuthenticator == null");
    }
    
    public Class9176 method33518(final Class8015 field38886) {
        if (field38886 != null) {
            this.field38886 = field38886;
            return this;
        }
        throw new NullPointerException("connectionPool == null");
    }
    
    public Class9176 method33519(final boolean field38888) {
        this.field38888 = field38888;
        return this;
    }
    
    public Class9176 method33520(final boolean field38889) {
        this.field38889 = field38889;
        return this;
    }
    
    public Class9176 method33521(final boolean field38890) {
        this.field38890 = field38890;
        return this;
    }
    
    public Class9176 method33522(final Class8993 field38868) {
        if (field38868 != null) {
            this.field38868 = field38868;
            return this;
        }
        throw new IllegalArgumentException("dispatcher == null");
    }
    
    public Class9176 method33523(final List<Class190> c) {
        final ArrayList list = new ArrayList((Collection<? extends E>)c);
        if (!list.contains(Class190.field623)) {
            throw new IllegalArgumentException("protocols doesn't contain http/1.1: " + list);
        }
        if (list.contains(Class190.field622)) {
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + list);
        }
        if (!list.contains(null)) {
            list.remove(Class190.field624);
            this.field38870 = (List<Class190>)Collections.unmodifiableList((List<?>)list);
            return this;
        }
        throw new IllegalArgumentException("protocols must not contain null");
    }
    
    public Class9176 method33524(final List<Class8248> list) {
        this.field38871 = Class7690.method24437(list);
        return this;
    }
    
    public List<Class6814> method33525() {
        return this.field38872;
    }
    
    public Class9176 method33526(final Class6814 class6814) {
        this.field38872.add(class6814);
        return this;
    }
    
    public List<Class6814> method33527() {
        return this.field38873;
    }
    
    public Class9176 method33528(final Class6814 class6814) {
        this.field38873.add(class6814);
        return this;
    }
    
    public Class9176 method33529(final Class8648 class8648) {
        if (class8648 != null) {
            this.field38874 = Class8648.method29415(class8648);
            return this;
        }
        throw new NullPointerException("eventListener == null");
    }
    
    public Class9176 method33530(final Class8856 field38874) {
        if (field38874 != null) {
            this.field38874 = field38874;
            return this;
        }
        throw new NullPointerException("eventListenerFactory == null");
    }
    
    public OkHttpClient method33531() {
        return new OkHttpClient(this);
    }
}
