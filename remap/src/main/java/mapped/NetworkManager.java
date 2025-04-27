// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.LogManager;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import javax.annotation.Nullable;
import javax.crypto.SecretKey;
import java.io.Serializable;

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

public class NetworkManager extends SimpleChannelInboundHandler<IPacket<?>>
{
    private static final Logger field16890;
    public static final Marker field16891;
    public static final Marker field16892;
    public static final AttributeKey<?> field16893;
    public static final Class8656<NioEventLoopGroup> field16894 = null;
    public static final Class8656<EpollEventLoopGroup> field16895 = null;
    public static final Class8656<DefaultEventLoopGroup> field16896 = null;
    private final Class2060 field16897;
    private final Queue<Class8043> field16898;
    private Channel field16899;
    private SocketAddress field16900;
    private INetHandler field16901;
    private ITextComponent field16902;
    private boolean field16903;
    private boolean field16904;
    private int field16905;
    private int field16906;
    private float field16907;
    private float field16908;
    private int field16909;
    private boolean field16910;
    private ViaManager field16911;
    
    public NetworkManager(final Class2060 field16897) {
        this.field16898 = Queues.newConcurrentLinkedQueue();
        this.field16897 = field16897;
    }
    
    public void channelActive(final ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelActive(channelHandlerContext);
        this.field16899 = channelHandlerContext.channel();
        this.field16900 = this.field16899.remoteAddress();
    }
    
    public void channelInactive(final ChannelHandlerContext channelHandlerContext) throws Exception {
        this.method11181(new Class2259("disconnect.endOfStream"));
    }
    
    public void exceptionCaught(final ChannelHandlerContext channelHandlerContext, final Throwable obj) {
        if (!(obj instanceof Class6577)) {
            final boolean b = !this.field16910;
            this.field16910 = true;
            if (this.field16899.isOpen()) {
                if (!(obj instanceof TimeoutException)) {
                    final Class2259 class2259 = new Class2259("disconnect.genericReason", "Internal Exception: " + obj);
                    obj.printStackTrace(System.out);
                    if (!b) {
                        NetworkManager.field16890.debug("Double fault", obj);
                        this.method11181(class2259);
                    }
                    else {
                        NetworkManager.field16890.debug("Failed to sent packet", obj);
                        this.method11175(new SDisconnectPacket(class2259), (GenericFutureListener<? extends Future<? super Void>>)(future -> this.method11181(class2259)));
                        this.method11191();
                    }
                }
                else {
                    NetworkManager.field16890.debug("Timeout", obj);
                    this.method11181(new Class2259("disconnect.timeout"));
                }
            }
        }
        else {
            NetworkManager.field16890.debug("Skipping packet due to errors", obj.getCause());
        }
    }
    
    public void channelRead0(final ChannelHandlerContext channelHandlerContext, final IPacket<?> class4252) throws Exception {
        if (this.field16899.isOpen()) {
            final EventReceivePacket class4253 = new EventReceivePacket(class4252);
            Client.getInstance().getEventBus().post(class4253);
            if (class4253.isCancelled()) {
                return;
            }
            try {
                method11172((IPacket<INetHandler>)class4253.getPacket(), this.field16901);
            }
            catch (final Class2382 class4254) {}
            ++this.field16905;
        }
    }
    
    private static <T extends INetHandler> void method11172(final IPacket<T> class4252, final INetHandler class4253) {
        class4252.processPacket((T)class4253);
    }
    
    public void method11173(final INetHandler field16901) {
        Validate.notNull((Object)field16901, "packetListener");
        NetworkManager.field16890.debug("Set listener of {} to {}", this, field16901);
        this.field16901 = field16901;
    }
    
    public void method11174(final IPacket<?> class4252) {
        this.method11175(class4252, null);
    }
    
    public void method11175(final IPacket<?> class4252, final GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        final Class5721 class4253 = new Class5721(class4252);
        Client.getInstance().getEventBus().post(class4253);
        final IPacket method16990 = class4253.method16990();
        if (!class4253.isCancelled()) {
            if (!this.method11187()) {
                this.field16898.add(new Class8043(method16990, genericFutureListener));
            }
            else {
                this.method11178();
                this.method11177(method16990, genericFutureListener);
            }
        }
    }
    
    public void method11176(final IPacket<?> class4252) {
        final GenericFutureListener genericFutureListener = null;
        if (!this.method11187()) {
            this.field16898.add(new Class8043(class4252, (GenericFutureListener<? extends Future<? super Void>>)genericFutureListener));
        }
        else {
            this.method11178();
            this.method11177(class4252, (GenericFutureListener<? extends Future<? super Void>>)genericFutureListener);
        }
    }
    
    private void method11177(final IPacket<?> class4252, final GenericFutureListener<? extends Future<? super Void>> genericFutureListener) {
        ++this.field16906;
    }
    
    private void method11178() {
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
    
    public static NetworkManager method11183(final InetAddress inetAddress, final int n, final boolean b) {
        final NetworkManager class3641 = new NetworkManager(Class2060.field11780);
        Serializable s;
        Object o;
        if (Epoll.isAvailable() && b) {
            s = EpollSocketChannel.class;
            o = NetworkManager.field16895;
        }
        else {
            s = NioSocketChannel.class;
            o = NetworkManager.field16894;
        }
        new Bootstrap().group(((Class8656<EventLoopGroup>)o).method29528()).handler(new Class8457(class3641)).channel((Class)s).connect(inetAddress, n).syncUninterruptibly();
        return class3641;
    }
    
    public static NetworkManager method11184(final SocketAddress socketAddress) {
        final NetworkManager class3641 = new NetworkManager(Class2060.field11780);
        new Bootstrap().group(NetworkManager.field16896.method29528()).handler(new Class7681(class3641)).channel(LocalChannel.class).connect(socketAddress).syncUninterruptibly();
        return class3641;
    }
    
    public void method11185(final SecretKey secretKey) {
        this.field16903 = true;
        this.field16899.pipeline().addBefore("splitter", "decrypt", new Class9002(Class9359.method34707(2, secretKey)));
        this.field16899.pipeline().addBefore("prepender", "encrypt", new Class7664(Class9359.method34707(1, secretKey)));
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
    
    public INetHandler method11189() {
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
                this.field16899.pipeline().addBefore("decoder", "decompress", new Class9213(n));
            }
            else {
                ((Class9213)this.field16899.pipeline().get("decompress")).method33695(n);
            }
            if (!(this.field16899.pipeline().get("compress") instanceof Class8982)) {
                this.field16899.pipeline().addBefore("encoder", "compress", new Class8982(n));
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
                            this.method11189().onDisconnect(new Class2259("multiplayer.disconnect.generic"));
                        }
                    }
                    else {
                        this.method11189().onDisconnect(this.method11190());
                    }
                }
                else {
                    NetworkManager.field16890.warn("handleDisconnection() called twice");
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
        field16892 = MarkerManager.getMarker("NETWORK_PACKETS", NetworkManager.field16891);
        field16893 = AttributeKey.valueOf("protocol");
    }
}
