// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class Class7465
{
    public final Class6353 field28839;
    public final Proxy field28840;
    public final InetSocketAddress field28841;
    
    public Class7465(final Class6353 field28839, final Proxy field28840, final InetSocketAddress field28841) {
        if (field28839 == null) {
            throw new NullPointerException("address == null");
        }
        if (field28840 == null) {
            throw new NullPointerException("proxy == null");
        }
        if (field28841 != null) {
            this.field28839 = field28839;
            this.field28840 = field28840;
            this.field28841 = field28841;
            return;
        }
        throw new NullPointerException("inetSocketAddress == null");
    }
    
    public Class6353 method23001() {
        return this.field28839;
    }
    
    public Proxy method23002() {
        return this.field28840;
    }
    
    public InetSocketAddress method23003() {
        return this.field28841;
    }
    
    public boolean method23004() {
        return this.field28839.field25413 != null && this.field28840.type() == Proxy.Type.HTTP;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class7465) {
            if (((Class7465)o).field28839.equals(this.field28839)) {
                if (((Class7465)o).field28840.equals(this.field28840)) {
                    if (((Class7465)o).field28841.equals(this.field28841)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * 17 + this.field28839.hashCode()) + this.field28840.hashCode()) + this.field28841.hashCode();
    }
    
    @Override
    public String toString() {
        return "Route{" + this.field28841 + "}";
    }
}
