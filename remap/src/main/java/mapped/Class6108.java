// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import lombok.NonNull;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.Map;
import io.netty.channel.Channel;

public class Class6108
{
    private final Channel field24771;
    public Map<Class, Class6635> field24772;
    private boolean field24773;
    private boolean field24774;
    private Object field24775;
    private long field24776;
    private long field24777;
    private long field24778;
    private long field24779;
    private long field24780;
    private int field24781;
    private int field24782;
    private ReadWriteLock field24783;
    
    public Class6108(final Channel field24771) {
        this.field24772 = new ConcurrentHashMap<Class, Class6635>();
        this.field24773 = true;
        this.field24774 = false;
        this.field24776 = 0L;
        this.field24777 = 0L;
        this.field24778 = 0L;
        this.field24779 = 0L;
        this.field24780 = -1L;
        this.field24781 = 0;
        this.field24782 = 0;
        this.field24783 = new ReentrantReadWriteLock();
        this.field24771 = field24771;
    }
    
    public <T extends Class6635> T method18207(final Class<T> clazz) {
        return (T)this.field24772.get(clazz);
    }
    
    public boolean method18208(final Class<? extends Class6635> clazz) {
        return this.field24772.containsKey(clazz);
    }
    
    public void method18209(final Class6635 class6635) {
        this.field24772.put(class6635.getClass(), class6635);
    }
    
    public void method18210() {
        this.field24772.clear();
    }
    
    public void method18211(final ByteBuf byteBuf, final boolean b) {
        final ByteBuf buffer = byteBuf.alloc().buffer();
        try {
            try {
                Class5260.field22312.method16379(buffer, 1000);
            }
            catch (final Exception obj) {
                Class8563.method28793().method34742().warning("Type.VAR_INT.write thrown an exception: " + obj);
            }
            buffer.writeBytes(byteBuf);
            final ChannelHandlerContext method28340 = Class8485.method28340(Class8563.method28794().method33560().method30253(), this.method18220().pipeline());
            if (b) {
                if (method28340 != null) {
                    method28340.fireChannelRead(buffer);
                }
                else {
                    this.method18220().pipeline().fireChannelRead(buffer);
                }
            }
            else {
                try {
                    this.field24771.eventLoop().submit(new Class973(this, method28340, buffer));
                }
                catch (final Throwable t) {
                    buffer.release();
                    throw t;
                }
            }
        }
        finally {
            byteBuf.release();
        }
    }
    
    public ChannelFuture method18212(final ByteBuf byteBuf) {
        return this.field24771.pipeline().context(this.field24771.pipeline().get(Class8563.method28794().method33560().method30252())).writeAndFlush(byteBuf);
    }
    
    public void method18213(final ByteBuf byteBuf) {
        this.method18211(byteBuf, false);
    }
    
    public void method18214() {
        ++this.field24776;
    }
    
    public boolean method18215() {
        if (System.currentTimeMillis() - this.field24778 < 1000L) {
            ++this.field24779;
            ++this.field24777;
            return false;
        }
        this.field24780 = this.field24779;
        this.field24778 = System.currentTimeMillis();
        this.field24779 = 1L;
        return true;
    }
    
    public boolean method18216() {
        final Class7493 method28792 = Class8563.method28792();
        if (method28792.method23276() > 0 && this.method18229() >= method28792.method23276()) {
            this.method18217(method28792.method23277().replace("%pps", Long.toString(this.method18229())));
            return true;
        }
        if (method28792.method23280() > 0) {
            if (method28792.method23278() > 0) {
                if (this.method18230() <= method28792.method23278()) {
                    this.method18242(this.method18230() + 1);
                    if (this.method18229() >= method28792.method23279()) {
                        this.method18243(this.method18231() + 1);
                    }
                    if (this.method18231() >= method28792.method23280()) {
                        this.method18217(method28792.method23281().replace("%pps", Long.toString(this.method18229())));
                        return true;
                    }
                }
                else {
                    this.method18243(0);
                    this.method18242(1);
                }
            }
        }
        return false;
    }
    
    public void method18217(final String s) {
        if (!this.method18220().isOpen()) {
            return;
        }
        if (!this.field24774) {
            this.field24774 = true;
            if (this.method18207(Class6651.class).method20210() != null) {
                Class8563.method28793().method34747(new Class1205(this, this.method18207(Class6651.class).method20210(), s));
            }
        }
    }
    
    public void method18218(final ByteBuf byteBuf, final boolean b) {
        final ChannelHandler value = this.field24771.pipeline().get(Class8563.method28794().method33560().method30252());
        if (!b) {
            this.field24771.eventLoop().submit(new Class1227(this, value, byteBuf));
        }
        else {
            this.field24771.pipeline().context(value).writeAndFlush(byteBuf);
        }
    }
    
    public void method18219(final ByteBuf byteBuf) {
        this.method18218(byteBuf, false);
    }
    
    @NonNull
    public Channel method18220() {
        return this.field24771;
    }
    
    public Map<Class, Class6635> method18221() {
        return this.field24772;
    }
    
    public boolean method18222() {
        return this.field24773;
    }
    
    public boolean method18223() {
        return this.field24774;
    }
    
    public Object method18224() {
        return this.field24775;
    }
    
    public long method18225() {
        return this.field24776;
    }
    
    public long method18226() {
        return this.field24777;
    }
    
    public long method18227() {
        return this.field24778;
    }
    
    public long method18228() {
        return this.field24779;
    }
    
    public long method18229() {
        return this.field24780;
    }
    
    public int method18230() {
        return this.field24781;
    }
    
    public int method18231() {
        return this.field24782;
    }
    
    public ReadWriteLock method18232() {
        return this.field24783;
    }
    
    public void method18233(final Map<Class, Class6635> field24772) {
        this.field24772 = field24772;
    }
    
    public void method18234(final boolean field24773) {
        this.field24773 = field24773;
    }
    
    public void method18235(final boolean field24774) {
        this.field24774 = field24774;
    }
    
    public void method18236(final Object field24775) {
        this.field24775 = field24775;
    }
    
    public void method18237(final long field24776) {
        this.field24776 = field24776;
    }
    
    public void method18238(final long field24777) {
        this.field24777 = field24777;
    }
    
    public void method18239(final long field24778) {
        this.field24778 = field24778;
    }
    
    public void method18240(final long field24779) {
        this.field24779 = field24779;
    }
    
    public void method18241(final long field24780) {
        this.field24780 = field24780;
    }
    
    public void method18242(final int field24781) {
        this.field24781 = field24781;
    }
    
    public void method18243(final int field24782) {
        this.field24782 = field24782;
    }
    
    public void method18244(final ReadWriteLock field24783) {
        this.field24783 = field24783;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class6108)) {
            return false;
        }
        final Class6108 class6108 = (Class6108)o;
        if (class6108.method18245(this)) {
            final Channel method18220 = this.method18220();
            final Channel method18221 = class6108.method18220();
            if (method18220 != null) {
                if (!method18220.equals(method18221)) {
                    return false;
                }
            }
            else if (method18221 != null) {
                return false;
            }
            final Map<Class, Class6635> method18222 = this.method18221();
            final Map<Class, Class6635> method18223 = class6108.method18221();
            if (method18222 != null) {
                if (!method18222.equals(method18223)) {
                    return false;
                }
            }
            else if (method18223 != null) {
                return false;
            }
            if (this.method18222() != class6108.method18222()) {
                return false;
            }
            if (this.method18223() == class6108.method18223()) {
                final Object method18224 = this.method18224();
                final Object method18225 = class6108.method18224();
                if (method18224 != null) {
                    if (!method18224.equals(method18225)) {
                        return false;
                    }
                }
                else if (method18225 != null) {
                    return false;
                }
                if (this.method18225() != class6108.method18225()) {
                    return false;
                }
                if (this.method18226() != class6108.method18226()) {
                    return false;
                }
                if (this.method18227() != class6108.method18227()) {
                    return false;
                }
                if (this.method18228() != class6108.method18228()) {
                    return false;
                }
                if (this.method18229() != class6108.method18229()) {
                    return false;
                }
                if (this.method18230() != class6108.method18230()) {
                    return false;
                }
                if (this.method18231() == class6108.method18231()) {
                    final ReadWriteLock method18226 = this.method18232();
                    final ReadWriteLock method18227 = class6108.method18232();
                    if (method18226 != null) {
                        return method18226.equals(method18227);
                    }
                    else return method18227 == null;
                }
                return false;
            }
            return false;
        }
        return false;
    }
    
    public boolean method18245(final Object o) {
        return o instanceof Class6108;
    }
    
    @Override
    public int hashCode() {
        final int n = 1;
        final Channel method18220 = this.method18220();
        final int n2 = n * 59 + ((method18220 != null) ? method18220.hashCode() : 43);
        final Map<Class, Class6635> method18221 = this.method18221();
        final int n3 = ((n2 * 59 + ((method18221 != null) ? method18221.hashCode() : 43)) * 59 + (this.method18222() ? 79 : 97)) * 59 + (this.method18223() ? 79 : 97);
        final Object method18222 = this.method18224();
        final int n4 = n3 * 59 + ((method18222 != null) ? method18222.hashCode() : 43);
        final long method18223 = this.method18225();
        final int n5 = n4 * 59 + (int)(method18223 >>> 32 ^ method18223);
        final long method18224 = this.method18226();
        final int n6 = n5 * 59 + (int)(method18224 >>> 32 ^ method18224);
        final long method18225 = this.method18227();
        final int n7 = n6 * 59 + (int)(method18225 >>> 32 ^ method18225);
        final long method18226 = this.method18228();
        final int n8 = n7 * 59 + (int)(method18226 >>> 32 ^ method18226);
        final long method18227 = this.method18229();
        final int n9 = ((n8 * 59 + (int)(method18227 >>> 32 ^ method18227)) * 59 + this.method18230()) * 59 + this.method18231();
        final ReadWriteLock method18228 = this.method18232();
        return n9 * 59 + ((method18228 != null) ? method18228.hashCode() : 43);
    }
    
    @Override
    public String toString() {
        return "UserConnection(channel=" + this.method18220() + ", storedObjects=" + this.method18221() + ", active=" + this.method18222() + ", pendingDisconnect=" + this.method18223() + ", lastPacket=" + this.method18224() + ", sentPackets=" + this.method18225() + ", receivedPackets=" + this.method18226() + ", startTime=" + this.method18227() + ", intervalPackets=" + this.method18228() + ", packetsPerSecond=" + this.method18229() + ", secondsObserved=" + this.method18230() + ", warnings=" + this.method18231() + ", velocityLock=" + this.method18232() + ")";
    }
}
