package mapped;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.util.text.StringTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9021 {
   private static final Logger field41274 = LogManager.getLogger();
   public static final Class8112<NioEventLoopGroup> field41275 = new Class8112<NioEventLoopGroup>(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build())
   );
   public static final Class8112<EpollEventLoopGroup> field41276 = new Class8112<EpollEventLoopGroup>(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build())
   );
   private final MinecraftServer field41277;
   public volatile boolean field41278;
   private final List<ChannelFuture> field41279 = Collections.<ChannelFuture>synchronizedList(Lists.newArrayList());
   private final List<NetworkManager> field41280 = Collections.<NetworkManager>synchronizedList(Lists.newArrayList());

   public Class9021(MinecraftServer var1) {
      this.field41277 = var1;
      this.field41278 = true;
   }

   public void method33398(InetAddress var1, int var2) throws IOException {
      synchronized (this.field41279) {
         Class<? extends ServerSocketChannel> var6;
         Class8112 var7;
         if (Epoll.isAvailable() && this.field41277.method1356()) {
            var6 = EpollServerSocketChannel.class;
            var7 = field41276;
            field41274.info("Using epoll channel type");
         } else {
            var6 = NioServerSocketChannel.class;
            var7 = field41275;
            field41274.info("Using default channel type");
         }

         this.field41279
            .add(
               ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(var6))
                     .childHandler(new Class7308(this))
                     .group((EventLoopGroup)var7.method28097())
                     .localAddress(var1, var2))
                  .bind()
                  .syncUninterruptibly()
            );
      }
   }

   public SocketAddress method33399() {
      ChannelFuture var4;
      synchronized (this.field41279) {
         var4 = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class))
               .childHandler(new Class7985(this))
               .group((EventLoopGroup)field41275.method28097())
               .localAddress(LocalAddress.ANY))
            .bind()
            .syncUninterruptibly();
         this.field41279.add(var4);
      }

      return var4.channel().localAddress();
   }

   public void method33400() {
      this.field41278 = false;

      for (ChannelFuture var4 : this.field41279) {
         try {
            var4.channel().close().sync();
         } catch (InterruptedException var6) {
            field41274.error("Interrupted whilst closing channel");
         }
      }
   }

   public void method33401() {
      synchronized (this.field41280) {
         Iterator var4 = this.field41280.iterator();

         while (var4.hasNext()) {
            NetworkManager var5 = (NetworkManager)var4.next();
            if (!var5.method30708()) {
               if (var5.method30707()) {
                  try {
                     var5.method30698();
                  } catch (Exception var9) {
                     if (var5.method30702()) {
                        throw new Class2506(Class4526.method14413(var9, "Ticking memory connection"));
                     }

                     field41274.warn("Failed to handle packet for {}", var5.method30700(), var9);
                     StringTextComponent var7 = new StringTextComponent("Internal server error");
                     var5.method30694(new Class5530(var7), var2 -> var5.method30701(var7));
                     var5.method30711();
                  }
               } else {
                  var4.remove();
                  var5.method30713();
               }
            }
         }
      }
   }

   public MinecraftServer method33402() {
      return this.field41277;
   }

   // $VF: synthetic method
   public static MinecraftServer method33406(Class9021 var0) {
      return var0.field41277;
   }

   // $VF: synthetic method
   public static List method33407(Class9021 var0) {
      return var0.field41280;
   }
}
