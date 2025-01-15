// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.LogManager;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import javax.annotation.Nullable;
import javax.crypto.SecretKey;
import java.io.Serializable;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.epoll.Epoll;
import java.net.InetAddress;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import org.apache.commons.lang3.Validate;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.handler.timeout.TimeoutException;
import io.netty.channel.ChannelHandlerContext;
import com.google.common.collect.Queues;
import java.net.SocketAddress;
import io.netty.channel.Channel;
import java.util.Queue;
import io.netty.channel.DefaultEventLoopGroup;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.util.AttributeKey;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.Logger;
import io.netty.channel.SimpleChannelInboundHandler;

public class Class3641 extends SimpleChannelInboundHandler<Class4252<?>>
{
    private static final Logger field16890;
    public static final Marker field16891;
    public static final Marker field16892;
    public static final AttributeKey<Class2208> field16893;
    public static final Class8656<NioEventLoopGroup> field16894;
    public static final Class8656<EpollEventLoopGroup> field16895;
    public static final Class8656<DefaultEventLoopGroup> field16896;
    private final Class2060 field16897;
    private final Queue<Class8043> field16898;
    private Channel field16899;
    private SocketAddress field16900;
    private Class5801 field16901;
    private ITextComponent field16902;
    private boolean field16903;
    private boolean field16904;
    private int field16905;
    private int field16906;
    private float field16907;
    private float field16908;
    private int field16909;
    private boolean field16910;
    private Class9367 field16911;
    
    public Class3641(final Class2060 field16897) {
        this.field16898 = Queues.newConcurrentLinkedQueue();
        this.field16897 = field16897;
    }
    
    public void channelActive(final ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelActive(channelHandlerContext);
        this.field16899 = channelHandlerContext.channel();
        this.field16900 = this.field16899.remoteAddress();
        try {
            this.method11171(Class2208.field13454);
            this.field16911 = new Class9367(this.field16899);
        }
        catch (final Throwable t) {
            Class3641.field16890.fatal((Object)t);
        }
    }
    
    public void method11171(final Class2208 class2208) {
        this.field16899.attr((AttributeKey)Class3641.field16893).set((Object)class2208);
        this.field16899.config().setAutoRead(true);
        Class3641.field16890.debug("Enabled auto read");
    }
    
    public void channelInactive(final ChannelHandlerContext channelHandlerContext) throws Exception {
        this.method11181(new Class2259("disconnect.endOfStream", new Object[0]));
    }
    
    public void exceptionCaught(final ChannelHandlerContext channelHandlerContext, final Throwable obj) {
        if (!(obj instanceof Class6577)) {
            final boolean b = !this.field16910;
            this.field16910 = true;
            if (this.field16899.isOpen()) {
                if (!(obj instanceof TimeoutException)) {
                    final Class2259 class2259 = new Class2259("disconnect.genericReason", new Object[] { "Internal Exception: " + obj });
                    obj.printStackTrace(System.out);
                    if (!b) {
                        Class3641.field16890.debug("Double fault", obj);
                        this.method11181(class2259);
                    }
                    else {
                        Class3641.field16890.debug("Failed to sent packet", obj);
                        this.method11175(new Class4262(class2259), (GenericFutureListener<? extends Future<? super Void>>)(future -> this.method11181(class2259)));
                        this.method11191();
                    }
                }
                else {
                    Class3641.field16890.debug("Timeout", obj);
                    this.method11181(new Class2259("disconnect.timeout", new Object[0]));
                }
            }
        }
        else {
            Class3641.field16890.debug("Skipping packet due to errors", obj.getCause());
        }
    }
    
    public void channelRead0(final ChannelHandlerContext channelHandlerContext, final Class4252<?> class4252) throws Exception {
        if (this.field16899.isOpen()) {
            final Class5723 class4253 = new Class5723(class4252);
            Class9463.method35173().method35188().method21097(class4253);
            if (class4253.method16962()) {
                return;
            }
            try {
                method11172((Class4252<Class5801>)class4253.method16998(), this.field16901);
            }
            catch (final Class2382 class4254) {}
            ++this.field16905;
        }
    }
    
    private static <T extends Class5801> void method11172(final Class4252<T> class4252, final Class5801 class4253) {
        class4252.method12762((T)class4253);
    }
    
    public void method11173(final Class5801 field16901) {
        Validate.notNull((Object)field16901, "packetListener", new Object[0]);
        Class3641.field16890.debug("Set listener of {} to {}", (Object)this, (Object)field16901);
        this.field16901 = field16901;
    }
    
    public void method11174(final Class4252<?> class4252) {
        this.method11175(class4252, null);
    }
    
    public void method11175(final Class4252<?> class4252, final GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        final Class5721 class4253 = new Class5721(class4252);
        Class9463.method35173().method35188().method21097(class4253);
        final Class4252 method16990 = class4253.method16990();
        if (!class4253.method16962()) {
            if (!this.method11187()) {
                this.field16898.add(new Class8043(method16990, genericFutureListener));
            }
            else {
                this.method11178();
                this.method11177(method16990, genericFutureListener);
            }
        }
    }
    
    public void method11176(final Class4252<?> class4252) {
        final GenericFutureListener genericFutureListener = null;
        if (!this.method11187()) {
            this.field16898.add(new Class8043(class4252, (GenericFutureListener<? extends Future<? super Void>>)genericFutureListener));
        }
        else {
            this.method11178();
            this.method11177(class4252, (GenericFutureListener<? extends Future<? super Void>>)genericFutureListener);
        }
    }
    
    private void method11177(final Class4252<?> class4252, final GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        final Class2208 method8391 = Class2208.method8391(class4252);
        final Class2208 class4253 = (Class2208)this.field16899.attr((AttributeKey)Class3641.field16893).get();
        ++this.field16906;
        if (class4253 != method8391) {
            Class3641.field16890.debug("Disabled auto read");
            this.field16899.config().setAutoRead(false);
        }
        if (!this.field16899.eventLoop().inEventLoop()) {
            this.field16899.eventLoop().execute(() -> {
                if (class4254 != class4255) {
                    this.method11171(class4254);
                }
                this.field16899.writeAndFlush((Object)class4256);
                final ChannelFuture channelFuture;
                if (genericFutureListener2 != null) {
                    channelFuture.addListener(genericFutureListener2);
                }
                channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
            });
        }
        else {
            if (method8391 != class4253) {
                this.method11171(method8391);
            }
            final ChannelFuture writeAndFlush = this.field16899.writeAndFlush((Object)class4252);
            if (genericFutureListener != null) {
                writeAndFlush.addListener((GenericFutureListener)genericFutureListener);
            }
            writeAndFlush.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        }
    }
    
    private void method11178() {
        if (this.field16899 != null && this.field16899.isOpen()) {
            synchronized (this.field16898) {
                Class8043 class8043;
                while ((class8043 = this.field16898.poll()) != null) {
                    this.method11177(Class8043.method26385(class8043), (GenericFutureListener<? extends Future<? super Void>>)Class8043.method26386(class8043));
                }
            }
        }
    }
    
    public void method11179() {
        this.method11178();
        if (this.field16901 instanceof Class5803) {
            ((Class5803)this.field16901).method17391();
        }
        if (this.field16901 instanceof Class5814) {
            ((Class5814)this.field16901).method17460();
        }
        if (this.field16899 != null) {
            this.field16899.flush();
        }
        if (this.field16909++ % 20 == 0) {
            this.field16908 = this.field16908 * 0.75f + this.field16906 * 0.25f;
            this.field16907 = this.field16907 * 0.75f + this.field16905 * 0.25f;
            this.field16906 = 0;
            this.field16905 = 0;
        }
    }
    
    public SocketAddress method11180() {
        return this.field16900;
    }
    
    public void method11181(final ITextComponent field16902) {
        if (this.field16899.isOpen()) {
            this.field16899.close().awaitUninterruptibly();
            this.field16902 = field16902;
        }
        if (this.field16911 != null) {
            this.field16911.method34763();
        }
    }
    
    public boolean method11182() {
        return this.field16899 instanceof LocalChannel || this.field16899 instanceof LocalServerChannel;
    }
    
    public static Class3641 method11183(final InetAddress inetAddress, final int n, final boolean b) {
        final Class3641 class3641 = new Class3641(Class2060.field11780);
        Serializable s;
        Object o;
        if (Epoll.isAvailable() && b) {
            s = EpollSocketChannel.class;
            o = Class3641.field16895;
        }
        else {
            s = NioSocketChannel.class;
            o = Class3641.field16894;
        }
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)((Class8656<EventLoopGroup>)o).method29528())).handler((ChannelHandler)new Class8457(class3641))).channel((Class)s)).connect(inetAddress, n).syncUninterruptibly();
        return class3641;
    }
    
    public static Class3641 method11184(final SocketAddress socketAddress) {
        final Class3641 class3641 = new Class3641(Class2060.field11780);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)Class3641.field16896.method29528())).handler((ChannelHandler)new Class7681(class3641))).channel((Class)LocalChannel.class)).connect(socketAddress).syncUninterruptibly();
        return class3641;
    }
    
    public void method11185(final SecretKey secretKey) {
        this.field16903 = true;
        this.field16899.pipeline().addBefore("splitter", "decrypt", (ChannelHandler)new Class9002(Class9359.method34707(2, secretKey)));
        this.field16899.pipeline().addBefore("prepender", "encrypt", (ChannelHandler)new Class7664(Class9359.method34707(1, secretKey)));
    }
    
    public boolean method11186() {
        return this.field16903;
    }
    
    public boolean method11187() {
        return this.field16899 != null && this.field16899.isOpen();
    }
    
    public boolean method11188() {
        return this.field16899 == null;
    }
    
    public Class5801 method11189() {
        return this.field16901;
    }
    
    @Nullable
    public ITextComponent method11190() {
        return this.field16902;
    }
    
    public void method11191() {
        this.field16899.config().setAutoRead(false);
    }
    
    public void method11192(final int n) {
        if (n < 0) {
            if (this.field16899.pipeline().get("decompress") instanceof Class9213) {
                this.field16899.pipeline().remove("decompress");
            }
            if (this.field16899.pipeline().get("compress") instanceof Class8982) {
                this.field16899.pipeline().remove("compress");
            }
        }
        else {
            if (!(this.field16899.pipeline().get("decompress") instanceof Class9213)) {
                this.field16899.pipeline().addBefore("decoder", "decompress", (ChannelHandler)new Class9213(n));
            }
            else {
                ((Class9213)this.field16899.pipeline().get("decompress")).method33695(n);
            }
            if (!(this.field16899.pipeline().get("compress") instanceof Class8982)) {
                this.field16899.pipeline().addBefore("encoder", "compress", (ChannelHandler)new Class8982(n));
            }
            else {
                ((Class8982)this.field16899.pipeline().get("compress")).method31932(n);
            }
        }
        this.field16911.method34764().method19783(this.field16899);
    }
    
    public void method11193() {
        if (this.field16899 != null) {
            if (!this.field16899.isOpen()) {
                if (!this.field16904) {
                    this.field16904 = true;
                    if (this.method11190() == null) {
                        if (this.method11189() != null) {
                            this.method11189().method17291(new Class2259("multiplayer.disconnect.generic", new Object[0]));
                        }
                    }
                    else {
                        this.method11189().method17291(this.method11190());
                    }
                }
                else {
                    Class3641.field16890.warn("handleDisconnection() called twice");
                }
            }
        }
    }
    
    public float method11194() {
        return this.field16907;
    }
    
    public float method11195() {
        return this.field16908;
    }
    
    static {
        field16890 = LogManager.getLogger();
        field16891 = MarkerManager.getMarker("NETWORK");
        field16892 = MarkerManager.getMarker("NETWORK_PACKETS", Class3641.field16891);
        field16893 = AttributeKey.valueOf("protocol");
        field16894 = new Class8656<NioEventLoopGroup>(() -> {
            new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build());
            return;
        });
        field16895 = new Class8656<EpollEventLoopGroup>(() -> {
            new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build());
            return;
        });
        field16896 = new Class8656<DefaultEventLoopGroup>(() -> {
            new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build());
            return;
        });
    }
}
