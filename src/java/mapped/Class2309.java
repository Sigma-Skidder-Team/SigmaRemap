// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.security.KeyStore;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.util.Iterator;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.SocketFactory;
import java.net.ProxySelector;
import java.net.Proxy;
import java.util.List;

public class Class2309 implements Cloneable, Class2310, Class2311
{
    public static final List<Class190> field14002;
    public static final List<Class8248> field14003;
    public final Class8993 field14004;
    public final Proxy field14005;
    public final List<Class190> field14006;
    public final List<Class8248> field14007;
    public final List<Class6814> field14008;
    public final List<Class6814> field14009;
    public final Class8856 field14010;
    public final ProxySelector field14011;
    public final Class7536 field14012;
    public final Class1726 field14013;
    public final Class8674 field14014;
    public final SocketFactory field14015;
    public final SSLSocketFactory field14016;
    public final Class7744 field14017;
    public final HostnameVerifier field14018;
    public final Class8645 field14019;
    public final Class4972 field14020;
    public final Class4972 field14021;
    public final Class8015 field14022;
    public final Class7687 field14023;
    public final boolean field14024;
    public final boolean field14025;
    public final boolean field14026;
    public final int field14027;
    public final int field14028;
    public final int field14029;
    public final int field14030;
    
    public Class2309() {
        this(new Class9176());
    }
    
    public Class2309(final Class9176 class9176) {
        this.field14004 = class9176.field38868;
        this.field14005 = class9176.field38869;
        this.field14006 = class9176.field38870;
        this.field14007 = class9176.field38871;
        this.field14008 = Class7690.method24437(class9176.field38872);
        this.field14009 = Class7690.method24437(class9176.field38873);
        this.field14010 = class9176.field38874;
        this.field14011 = class9176.field38875;
        this.field14012 = class9176.field38876;
        this.field14013 = class9176.field38877;
        this.field14014 = class9176.field38878;
        this.field14015 = class9176.field38879;
        boolean b = false;
        for (final Class8248 class9177 : this.field14007) {
            b = (b || class9177.method27344());
        }
        if (class9176.field38880 == null && b) {
            final X509TrustManager method9387 = this.method9387();
            this.field14016 = this.method9388(method9387);
            this.field14017 = Class7744.method24709(method9387);
        }
        else {
            this.field14016 = class9176.field38880;
            this.field14017 = class9176.field38881;
        }
        this.field14018 = class9176.field38882;
        this.field14019 = class9176.field38883.method29405(this.field14017);
        this.field14020 = class9176.field38884;
        this.field14021 = class9176.field38885;
        this.field14022 = class9176.field38886;
        this.field14023 = class9176.field38887;
        this.field14024 = class9176.field38888;
        this.field14025 = class9176.field38889;
        this.field14026 = class9176.field38890;
        this.field14027 = class9176.field38891;
        this.field14028 = class9176.field38892;
        this.field14029 = class9176.field38893;
        this.field14030 = class9176.field38894;
    }
    
    private X509TrustManager method9387() {
        try {
            final TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore)null);
            final TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            }
            return (X509TrustManager)trustManagers[0];
        }
        catch (final GeneralSecurityException ex) {
            throw new AssertionError();
        }
    }
    
    private SSLSocketFactory method9388(final X509TrustManager x509TrustManager) {
        try {
            final SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, new TrustManager[] { x509TrustManager }, null);
            return instance.getSocketFactory();
        }
        catch (final GeneralSecurityException ex) {
            throw new AssertionError();
        }
    }
    
    public int method9389() {
        return this.field14027;
    }
    
    public int method9390() {
        return this.field14028;
    }
    
    public int method9391() {
        return this.field14029;
    }
    
    public int method9392() {
        return this.field14030;
    }
    
    public Proxy method9393() {
        return this.field14005;
    }
    
    public ProxySelector method9394() {
        return this.field14011;
    }
    
    public Class7536 method9395() {
        return this.field14012;
    }
    
    public Class1726 method9396() {
        return this.field14013;
    }
    
    public Class8674 method9397() {
        return (this.field14013 == null) ? this.field14014 : this.field14013.field9652;
    }
    
    public Class7687 method9398() {
        return this.field14023;
    }
    
    public SocketFactory method9399() {
        return this.field14015;
    }
    
    public SSLSocketFactory method9400() {
        return this.field14016;
    }
    
    public HostnameVerifier method9401() {
        return this.field14018;
    }
    
    public Class8645 method9402() {
        return this.field14019;
    }
    
    public Class4972 method9403() {
        return this.field14021;
    }
    
    public Class4972 method9404() {
        return this.field14020;
    }
    
    public Class8015 method9405() {
        return this.field14022;
    }
    
    public boolean method9406() {
        return this.field14024;
    }
    
    public boolean method9407() {
        return this.field14025;
    }
    
    public boolean method9408() {
        return this.field14026;
    }
    
    public Class8993 method9409() {
        return this.field14004;
    }
    
    public List<Class190> method9410() {
        return this.field14006;
    }
    
    public List<Class8248> method9411() {
        return this.field14007;
    }
    
    public List<Class6814> method9412() {
        return this.field14008;
    }
    
    public List<Class6814> method9413() {
        return this.field14009;
    }
    
    public Class8856 method9414() {
        return this.field14010;
    }
    
    @Override
    public Class2305 method9415(final Class8596 class8596) {
        return new Class2306(this, class8596, false);
    }
    
    @Override
    public Class7481 method9416(final Class8596 class8596, final Class9345 class8597) {
        final Class7479 class8598 = new Class7479(class8596, class8597, new Random());
        class8598.method23112(this);
        return class8598;
    }
    
    public Class9176 method9417() {
        return new Class9176(this);
    }
    
    static {
        field14002 = Class7690.method24438(Class190.field625, Class190.field623);
        field14003 = Class7690.method24438(Class8248.field33882, Class8248.field33884);
        Class9013.field38043 = new Class9012();
    }
}
