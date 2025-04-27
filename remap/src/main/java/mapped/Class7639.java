// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.Iterator;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalServerChannel;
import java.net.SocketAddress;
import java.io.IOException;
import java.io.Serializable;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.ChannelHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.epoll.Epoll;
import java.net.InetAddress;
import java.util.Collections;
import com.google.common.collect.Lists;
import io.netty.channel.ChannelFuture;
import java.util.List;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import org.apache.logging.log4j.Logger;

public class Class7639
{
    private static final Logger field30276;
    public static final Class8656<NioEventLoopGroup> field30277;
    public static final Class8656<EpollEventLoopGroup> field30278;
    private final MinecraftServer field30279;
    public volatile boolean field30280;
    private final List<ChannelFuture> field30281;
    private final List<NetworkManager> field30282;
    
    public Class7639(final MinecraftServer field30279) {
        this.field30281 = Collections.synchronizedList(Lists.newArrayList());
        this.field30282 = Collections.synchronizedList(Lists.newArrayList());
        this.field30279 = field30279;
        this.field30280 = true;
    }
    
    public void method24060(final InetAddress inetAddress, final int n) throws IOException {
        synchronized (this.field30281) {
            Serializable s;
            Object o;
            if (Epoll.isAvailable() && this.field30279.method1525()) {
                s = EpollServerSocketChannel.class;
                o = Class7639.field30278;
                Class7639.field30276.info("Using epoll channel type");
            }
            else {
                s = NioServerSocketChannel.class;
                o = Class7639.field30277;
                Class7639.field30276.info("Using default channel type");
            }
            this.field30281.add(new ServerBootstrap().channel((Class)s).childHandler(new Class8041(this)).group(((Class8656<EventLoopGroup>)o).method29528()).localAddress(inetAddress, n).bind().syncUninterruptibly());
        }
    }
    
    public SocketAddress method24061() {
        final ChannelFuture syncUninterruptibly;
        synchronized (this.field30281) {
            syncUninterruptibly = new ServerBootstrap().channel(LocalServerChannel.class).childHandler(new Class4147(this)).group(Class7639.field30277.method29528()).localAddress(LocalAddress.ANY).bind().syncUninterruptibly();
            this.field30281.add(syncUninterruptibly);
        }
        return syncUninterruptibly.channel().localAddress();
    }
    
    public void method24062() {
        this.field30280 = false;
        for (final ChannelFuture channelFuture : this.field30281) {
            try {
                channelFuture.channel().close().sync();
            }
            catch (final InterruptedException ex) {
                Class7639.field30276.error("Interrupted whilst closing channel");
            }
        }
    }
    
    public void method24063() {
        synchronized (this.field30282) {
            final Iterator<NetworkManager> iterator = this.field30282.iterator();
            while (iterator.hasNext()) {
                final NetworkManager class3641 = iterator.next();
                if (!class3641.method11188()) {
                    if (class3641.method11187()) {
                        try {
                            class3641.method11179();
                            continue;
                        }
                        catch (final Exception ex) {
                            if (class3641.method11182()) {
                                final CrashReport method24421 = CrashReport.makeCrashReport(ex, "Ticking memory connection");
                                method24421.makeCategory("Ticking connection").addDetail("Connection", class3641::toString);
                                throw new ReportedException(method24421);
                            }
                        }
                        final Exception ex;
                        Class7639.field30276.warn("Failed to handle packet for {}", class3641.method11180(), ex);
                        final StringTextComponent class3642 = new StringTextComponent("Internal server error");
                        class3641.method11175(new Class4262(class3642), (GenericFutureListener<? extends Future<? super Void>>)(future -> class3641.method11181(class3642)));
                        class3641.method11191();
                    }
                    else {
                        iterator.remove();
                        class3641.method11193();
                    }
                }
            }
        }
    }
    
    public MinecraftServer method24064() {
        return this.field30279;
    }
    
    static {
        field30276 = LogManager.getLogger();
        field30277 = new Class8656<NioEventLoopGroup>(() -> {
            new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build());
            return;
        });
        field30278 = new Class8656<EpollEventLoopGroup>(() -> {
            new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build());
            return;
        });
    }
}
