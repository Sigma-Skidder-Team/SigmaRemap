// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;

public final class Class6353
{
    public final Class8846 field25405;
    public final Class7687 field25406;
    public final SocketFactory field25407;
    public final Class4972 field25408;
    public final List<Class190> field25409;
    public final List<Class8248> field25410;
    public final ProxySelector field25411;
    public final Proxy field25412;
    public final SSLSocketFactory field25413;
    public final HostnameVerifier field25414;
    public final Class8645 field25415;
    
    public Class6353(final String s, final int n, final Class7687 field25406, final SocketFactory field25407, final SSLSocketFactory field25408, final HostnameVerifier field25409, final Class8645 field25410, final Class4972 field25411, final Proxy field25412, final List<Class190> list, final List<Class8248> list2, final ProxySelector field25413) {
        this.field25405 = new Class9085().method32786((field25408 == null) ? "http" : "https").method32791(s).method32792(n).method32815();
        if (field25406 == null) {
            throw new NullPointerException("dns == null");
        }
        this.field25406 = field25406;
        if (field25407 == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.field25407 = field25407;
        if (field25411 == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.field25408 = field25411;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.field25409 = Class7690.method24437(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.field25410 = Class7690.method24437(list2);
        if (field25413 != null) {
            this.field25411 = field25413;
            this.field25412 = field25412;
            this.field25413 = field25408;
            this.field25414 = field25409;
            this.field25415 = field25410;
            return;
        }
        throw new NullPointerException("proxySelector == null");
    }
    
    public Class8846 method18889() {
        return this.field25405;
    }
    
    public Class7687 method18890() {
        return this.field25406;
    }
    
    public SocketFactory method18891() {
        return this.field25407;
    }
    
    public Class4972 method18892() {
        return this.field25408;
    }
    
    public List<Class190> method18893() {
        return this.field25409;
    }
    
    public List<Class8248> method18894() {
        return this.field25410;
    }
    
    public ProxySelector method18895() {
        return this.field25411;
    }
    
    @Nullable
    public Proxy method18896() {
        return this.field25412;
    }
    
    @Nullable
    public SSLSocketFactory method18897() {
        return this.field25413;
    }
    
    @Nullable
    public HostnameVerifier method18898() {
        return this.field25414;
    }
    
    @Nullable
    public Class8645 method18899() {
        return this.field25415;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class6353) {
            if (this.field25405.equals(((Class6353)o).field25405)) {
                if (this.method18900((Class6353)o)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * 17 + this.field25405.hashCode()) + this.field25406.hashCode()) + this.field25408.hashCode()) + this.field25409.hashCode()) + this.field25410.hashCode()) + this.field25411.hashCode()) + ((this.field25412 == null) ? 0 : this.field25412.hashCode())) + ((this.field25413 == null) ? 0 : this.field25413.hashCode())) + ((this.field25414 == null) ? 0 : this.field25414.hashCode())) + ((this.field25415 == null) ? 0 : this.field25415.hashCode());
    }
    
    public boolean method18900(final Class6353 class6353) {
        if (this.field25406.equals(class6353.field25406)) {
            if (this.field25408.equals(class6353.field25408)) {
                if (this.field25409.equals(class6353.field25409)) {
                    if (this.field25410.equals(class6353.field25410)) {
                        if (this.field25411.equals(class6353.field25411)) {
                            if (Class7690.method24431(this.field25412, class6353.field25412)) {
                                if (Class7690.method24431(this.field25413, class6353.field25413)) {
                                    if (Class7690.method24431(this.field25414, class6353.field25414)) {
                                        if (Class7690.method24431(this.field25415, class6353.field25415)) {
                                            if (this.method18889().method30937() == class6353.method18889().method30937()) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        final StringBuilder append = new StringBuilder().append("Address{").append(this.field25405.method30936()).append(":").append(this.field25405.method30937());
        if (this.field25412 == null) {
            append.append(", proxySelector=").append(this.field25411);
        }
        else {
            append.append(", proxy=").append(this.field25412);
        }
        append.append("}");
        return append.toString();
    }
}
