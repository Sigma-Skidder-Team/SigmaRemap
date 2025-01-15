// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.channel.ChannelFuture;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.Collection;
import java.io.IOException;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import io.netty.buffer.ByteBuf;

public class Class8699
{
    public static final int field36556 = 1000;
    private final ByteBuf field36557;
    private final Class6108 field36558;
    private boolean field36559;
    private int field36560;
    private final LinkedList<Class7803<Class5260, Object>> field36561;
    private final List<Class7803<Class5260, Object>> field36562;
    
    public Class8699(final int field36560, final ByteBuf field36561, final Class6108 field36562) {
        this.field36559 = true;
        this.field36560 = -1;
        this.field36561 = new LinkedList<Class7803<Class5260, Object>>();
        this.field36562 = new ArrayList<Class7803<Class5260, Object>>();
        this.field36560 = field36560;
        this.field36557 = field36561;
        this.field36558 = field36562;
    }
    
    public <T> T method29818(final Class5260<T> class5260, final int n) throws Exception {
        int n2 = 0;
        for (final Class7803 class5261 : this.field36562) {
            if (class5261.method25203() != class5260) {
                continue;
            }
            if (n2 == n) {
                return (T)class5261.method25204();
            }
            ++n2;
        }
        throw new Class2328(new ArrayIndexOutOfBoundsException("Could not find type " + class5260.method16382() + " at " + n)).method9449("Type", class5260.method16382()).method9449("Index", n).method9449("Packet ID", this.method29848()).method9449("Data", this.field36562);
    }
    
    public boolean method29819(final Class5260 class5260, final int n) {
        int n2 = 0;
        final Iterator<Class7803<Class5260, Object>> iterator = this.field36562.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method25203() != class5260) {
                continue;
            }
            if (n2 == n) {
                return true;
            }
            ++n2;
        }
        return false;
    }
    
    public boolean method29820(final Class5260 class5260, final int n) {
        int n2 = 0;
        final Iterator<Object> iterator = this.field36561.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method25203().method16380() != class5260.method16380()) {
                continue;
            }
            if (n2 == n) {
                return true;
            }
            ++n2;
        }
        return false;
    }
    
    public <T> void method29821(final Class5260<T> class5260, final int n, final T t) throws Exception {
        int n2 = 0;
        for (final Class7803 class5261 : this.field36562) {
            if (class5261.method25203() != class5260) {
                continue;
            }
            if (n2 == n) {
                class5261.method25206(t);
                return;
            }
            ++n2;
        }
        throw new Class2328(new ArrayIndexOutOfBoundsException("Could not find type " + class5260.method16382() + " at " + n)).method9449("Type", class5260.method16382()).method9449("Index", n).method9449("Packet ID", this.method29848());
    }
    
    public <T> T method29822(final Class5260<T> obj) throws Exception {
        if (obj == Class5260.field22317) {
            return null;
        }
        if (this.field36561.isEmpty()) {
            Preconditions.checkNotNull((Object)this.field36557, (Object)"This packet does not have an input buffer.");
            try {
                return (T)obj.method16378(this.field36557);
            }
            catch (final Exception ex) {
                throw new Class2328(ex).method9449("Type", obj.method16382()).method9449("Packet ID", this.method29848()).method9449("Data", this.field36562);
            }
        }
        final Class7803 class7803 = this.field36561.poll();
        final Class5260 class7804 = (Class5260)class7803.method25203();
        if (class7804.equals(obj) || (obj.method16380().equals(class7804.method16380()) && obj.method16381().equals(class7804.method16381()))) {
            return (T)class7803.method25204();
        }
        if (class7804 == Class5260.field22317) {
            return (T)this.method29822((Class5260<Object>)obj);
        }
        throw new Class2328(new IOException("Unable to read type " + obj.method16382() + ", found " + ((Class5260)class7803.method25203()).method16382())).method9449("Type", obj.method16382()).method9449("Packet ID", this.method29848()).method9449("Data", this.field36562);
    }
    
    public <T> void method29823(final Class5260<T> class5260, T method16390) {
        if (method16390 != null) {
            if (!class5260.method16381().isAssignableFrom(method16390.getClass())) {
                if (!(class5260 instanceof Class5264)) {
                    Class8563.method28793().method34742().warning("Possible type mismatch: " + method16390.getClass().getName() + " -> " + class5260.method16381());
                }
                else {
                    method16390 = (T)((Class5264<Object>)class5260).method16390(method16390);
                }
            }
        }
        this.field36562.add(new Class7803<Class5260, Object>(class5260, method16390));
    }
    
    public <T> T method29824(final Class5260<T> class5260) throws Exception {
        final Object method29822 = this.method29822((Class5260<Object>)class5260);
        this.method29823(class5260, (T)method29822);
        return (T)method29822;
    }
    
    public void method29825() throws Exception {
        this.field36562.addAll(this.field36561);
        this.field36561.clear();
        if (this.field36557.readableBytes() > 0) {
            this.method29824(Class5260.field22291);
        }
    }
    
    public void method29826(final ByteBuf byteBuf) throws Exception {
        if (this.field36560 != -1) {
            Class5260.field22312.method16379(byteBuf, this.field36560);
        }
        if (this.field36561.size() > 0) {
            this.field36562.addAll(this.field36561);
            this.field36561.clear();
        }
        int n = 0;
        for (final Class7803 class7803 : this.field36562) {
            try {
                Object o = class7803.method25204();
                if (o != null && !((Class5260)class7803.method25203()).method16381().isAssignableFrom(o.getClass())) {
                    if (class7803.method25203() instanceof Class5264) {
                        o = ((Class5264<Object>)class7803.method25203()).method16390(o);
                    }
                    else {
                        Class8563.method28793().method34742().warning("Possible type mismatch: " + o.getClass().getName() + " -> " + ((Class5260)class7803.method25203()).method16381());
                    }
                }
                ((Class5260<Object>)class7803.method25203()).method16379(byteBuf, o);
            }
            catch (final Exception ex) {
                byteBuf.clear();
            }
            ++n;
        }
        this.method29829(byteBuf);
    }
    
    public void method29827() {
        if (this.field36557 != null) {
            this.field36557.clear();
        }
        this.field36561.clear();
    }
    
    public void method29828() {
        this.method29827();
        this.field36562.clear();
    }
    
    private void method29829(final ByteBuf byteBuf) {
        if (this.field36557 != null) {
            byteBuf.writeBytes(this.field36557, this.field36557.readableBytes());
        }
    }
    
    public void method29830(final Class<? extends Class5207> clazz, final boolean b) throws Exception {
        this.method29831(clazz, b, false);
    }
    
    public void method29831(final Class<? extends Class5207> clazz, final boolean b, final boolean b2) throws Exception {
        if (!this.method29840()) {
            try {
                this.method29841().method18211(this.method29832(clazz, b, Class2128.field12427), b2);
            }
            catch (final Exception ex) {
                if (!Class8485.method28338(ex, Class2334.class)) {
                    throw ex;
                }
            }
        }
    }
    
    private ByteBuf method29832(final Class<? extends Class5207> obj, final boolean b, final Class2128 class2128) throws Exception {
        final ArrayList list = new ArrayList((Collection<? extends E>)this.method29841().method18207(Class6651.class).method20211().method16337());
        if (class2128 == Class2128.field12427) {
            Collections.reverse(list);
        }
        int n = -1;
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getClass().equals(obj)) {
                n = (b ? (i + 1) : i);
                break;
            }
        }
        if (n != -1) {
            this.method29842();
            this.method29838(class2128, this.method29841().method18207(Class6651.class).method20206(), n, list);
            final ByteBuf byteBuf = (this.field36557 != null) ? this.field36557.alloc().buffer() : this.method29841().method18220().alloc().buffer();
            this.method29826(byteBuf);
            return byteBuf;
        }
        throw new NoSuchElementException(obj.getCanonicalName());
    }
    
    public void method29833(final Class<? extends Class5207> clazz) throws Exception {
        this.method29830(clazz, true);
    }
    
    public ChannelFuture method29834(final Class<? extends Class5207> clazz) throws Exception {
        if (this.method29840()) {
            return this.method29841().method18220().newFailedFuture((Throwable)new Exception("Cancelled packet"));
        }
        return this.method29841().method18212(this.method29832(clazz, true, Class2128.field12427));
    }
    
    @Deprecated
    public void method29835() throws Exception {
        if (!this.method29840()) {
            final ByteBuf byteBuf = (this.field36557 != null) ? this.field36557.alloc().buffer() : this.method29841().method18220().alloc().buffer();
            this.method29826(byteBuf);
            this.method29841().method18213(byteBuf);
        }
    }
    
    public Class8699 method29836(final int n) {
        return new Class8699(n, null, this.method29841());
    }
    
    public Class8699 method29837(final int n, final Class2437 class2437) throws Exception {
        final Class8699 method29836 = this.method29836(n);
        class2437.method9788(method29836);
        return method29836;
    }
    
    public Class8699 method29838(final Class2128 class2128, final Class2044 class2129, final int n, final List<Class5207> list) throws Exception {
        for (int i = n; i < list.size(); ++i) {
            ((Class5207)list.get(i)).method16318(class2128, class2129, this);
            this.method29842();
        }
        return this;
    }
    
    public void method29839() {
        this.field36559 = false;
    }
    
    public boolean method29840() {
        return !this.field36559;
    }
    
    public Class6108 method29841() {
        return this.field36558;
    }
    
    public void method29842() {
        this.field36562.addAll(this.field36561);
        this.field36561.clear();
        this.field36561.addAll(this.field36562);
        this.field36562.clear();
    }
    
    @Deprecated
    public void method29843() throws Exception {
        if (!this.method29840()) {
            final ByteBuf byteBuf = (this.field36557 != null) ? this.field36557.alloc().buffer() : this.method29841().method18220().alloc().buffer();
            this.method29826(byteBuf);
            this.method29841().method18218(byteBuf, true);
        }
    }
    
    public void method29844(final Class<? extends Class5207> clazz, final boolean b, final boolean b2) throws Exception {
        if (!this.method29840()) {
            try {
                this.method29841().method18218(this.method29832(clazz, b, Class2128.field12428), b2);
            }
            catch (final Exception ex) {
                if (!Class8485.method28338(ex, Class2334.class)) {
                    throw ex;
                }
            }
        }
    }
    
    public void method29845(final Class<? extends Class5207> clazz, final boolean b) throws Exception {
        this.method29844(clazz, b, false);
    }
    
    public void method29846(final Class<? extends Class5207> clazz) throws Exception {
        this.method29845(clazz, true);
    }
    
    @Override
    public String toString() {
        return "PacketWrapper{packetValues=" + this.field36562 + ", readableObjects=" + this.field36561 + ", id=" + this.field36560 + '}';
    }
    
    public void method29847(final int field36560) {
        this.field36560 = field36560;
    }
    
    public int method29848() {
        return this.field36560;
    }
}
