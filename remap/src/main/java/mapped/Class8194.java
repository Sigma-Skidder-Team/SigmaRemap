// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.SocketAddress;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.SocketException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.net.InetSocketAddress;
import java.net.Proxy;

public final class Class8194 {
    private final Class6353 field33708;
    private final Class9482 field33709;
    private Proxy field33710;
    private InetSocketAddress field33711;
    private List<Proxy> field33712;
    private int field33713;
    private List<InetSocketAddress> field33714;
    private int field33715;
    private final List<Class7465> field33716;

    public Class8194(final Class6353 field33708, final Class9482 field33709) {
        this.field33712 = Collections.emptyList();
        this.field33714 = Collections.emptyList();
        this.field33716 = new ArrayList<Class7465>();
        this.field33708 = field33708;
        this.field33709 = field33709;
        this.method27131(field33708.method18889(), field33708.method18896());
    }

    public boolean method27128() {
        if (!this.method27136()) {
            if (!this.method27132()) {
                if (!this.method27138()) {
                    return false;
                }
            }
        }
        return true;
    }

    public Class7465 method27129() throws IOException {
        if (!this.method27136()) {
            if (this.method27132()) {
                this.field33710 = this.method27133();
            } else {
                if (this.method27138()) {
                    return this.method27139();
                }
                throw new NoSuchElementException();
            }
        }
        this.field33711 = this.method27137();
        final Class7465 class7465 = new Class7465(this.field33708, this.field33710, this.field33711);
        if (!this.field33709.method35307(class7465)) {
            return class7465;
        }
        this.field33716.add(class7465);
        return this.method27129();
    }

    public void method27130(final Class7465 class7465, final IOException ex) {
        if (class7465.method23002().type() != Proxy.Type.DIRECT) {
            if (this.field33708.method18895() != null) {
                this.field33708.method18895().connectFailed(this.field33708.method18889().method30929(), class7465.method23002().address(), ex);
            }
        }
        this.field33709.method35305(class7465);
    }

    private void method27131(final Class8846 class8846, final Proxy o) {
        if (o == null) {
            final List<Proxy> select = this.field33708.method18895().select(class8846.method30929());
            this.field33712 = ((select != null && !select.isEmpty()) ? Class7690.method24437(select) : Class7690.method24438(Proxy.NO_PROXY));
        } else {
            this.field33712 = Collections.singletonList(o);
        }
        this.field33713 = 0;
    }

    private boolean method27132() {
        return this.field33713 < this.field33712.size();
    }

    private Proxy method27133() throws IOException {
        if (this.method27132()) {
            final Proxy proxy = this.field33712.get(this.field33713++);
            this.method27134(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.field33708.method18889().method30936() + "; exhausted proxy configurations: " + this.field33712);
    }

    private void method27134(final Proxy proxy) throws IOException {
        this.field33714 = new ArrayList<InetSocketAddress>();
        String str;
        int i;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            final SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + ((InetSocketAddress) address).getClass());
            }
            final InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            str = method27135(inetSocketAddress);
            i = inetSocketAddress.getPort();
        } else {
            str = this.field33708.method18889().method30936();
            i = this.field33708.method18889().method30937();
        }
        if (i >= 1 && i <= 65535) {
            if (proxy.type() != Proxy.Type.SOCKS) {
                final List<InetAddress> method24408 = this.field33708.method18890().resolve(str);
                if (method24408.isEmpty()) {
                    throw new UnknownHostException(this.field33708.method18890() + " returned no addresses for " + str);
                }
                for (int j = 0; j < method24408.size(); ++j) {
                    this.field33714.add(new InetSocketAddress((InetAddress) method24408.get(j), i));
                }
            } else {
                this.field33714.add(InetSocketAddress.createUnresolved(str, i));
            }
            this.field33715 = 0;
            return;
        }
        throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
    }

    public static String method27135(final InetSocketAddress inetSocketAddress) {
        final InetAddress address = inetSocketAddress.getAddress();
        if (address != null) {
            return address.getHostAddress();
        }
        return inetSocketAddress.getHostName();
    }

    private boolean method27136() {
        return this.field33715 < this.field33714.size();
    }

    private InetSocketAddress method27137() throws IOException {
        if (this.method27136()) {
            return this.field33714.get(this.field33715++);
        }
        throw new SocketException("No route to " + this.field33708.method18889().method30936() + "; exhausted inet socket addresses: " + this.field33714);
    }

    private boolean method27138() {
        return !this.field33716.isEmpty();
    }

    private Class7465 method27139() {
        return this.field33716.remove(0);
    }
}
