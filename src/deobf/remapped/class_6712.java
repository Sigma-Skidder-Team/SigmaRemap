package remapped;

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

public class class_6712 {
   private static final Logger field_34679 = LogManager.getLogger();
   public static final class_3642<NioEventLoopGroup> field_34682 = new class_3642<NioEventLoopGroup>(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build())
   );
   public static final class_3642<EpollEventLoopGroup> field_34685 = new class_3642<EpollEventLoopGroup>(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build())
   );
   private final class_341 field_34683;
   public volatile boolean field_34681;
   private final List<ChannelFuture> field_34684 = Collections.<ChannelFuture>synchronizedList(Lists.newArrayList());
   private final List<class_5121> field_34680 = Collections.<class_5121>synchronizedList(Lists.newArrayList());

   public class_6712(class_341 var1) {
      this.field_34683 = var1;
      this.field_34681 = true;
   }

   public void method_30822(InetAddress var1, int var2) throws IOException {
      synchronized (this.field_34684) {
         Class<EpollServerSocketChannel> var6;
         class_3642 var7;
         if (Epoll.isAvailable() && this.field_34683.method_1727()) {
            var6 = EpollServerSocketChannel.class;
            var7 = field_34685;
            field_34679.info("Using epoll channel type");
         } else {
            var6 = NioServerSocketChannel.class;
            var7 = field_34682;
            field_34679.info("Using default channel type");
         }

         this.field_34684
            .add(
               ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(var6))
                     .childHandler(new class_1729(this))
                     .group((EventLoopGroup)var7.method_16960())
                     .localAddress(var1, var2))
                  .bind()
                  .syncUninterruptibly()
            );
      }
   }

   public SocketAddress method_30821() {
      ChannelFuture var4;
      synchronized (this.field_34684) {
         var4 = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class))
               .childHandler(new class_3253(this))
               .group((EventLoopGroup)field_34682.method_16960())
               .localAddress(LocalAddress.ANY))
            .bind()
            .syncUninterruptibly();
         this.field_34684.add(var4);
      }

      return var4.channel().localAddress();
   }

   public void method_30824() {
      this.field_34681 = false;

      for (ChannelFuture var4 : this.field_34684) {
         try {
            var4.channel().close().sync();
         } catch (InterruptedException var6) {
            field_34679.error("Interrupted whilst closing channel");
         }
      }
   }

   public void method_30825() {
      synchronized (this.field_34680) {
         Iterator var4 = this.field_34680.iterator();

         while (var4.hasNext()) {
            class_5121 var5 = (class_5121)var4.next();
            if (!var5.method_23505()) {
               if (var5.method_23493()) {
                  try {
                     var5.method_23483();
                  } catch (Exception var9) {
                     if (var5.method_23500()) {
                        throw new class_3297(class_159.method_643(var9, "Ticking memory connection"));
                     }

                     field_34679.warn("Failed to handle packet for {}", var5.method_23494(), var9);
                     StringTextComponent var7 = new StringTextComponent("Internal server error");
                     var5.method_23486(new class_7957(var7), var2 -> var5.method_23482(var7));
                     var5.method_23479();
                  }
               } else {
                  var4.remove();
                  var5.method_23480();
               }
            }
         }
      }
   }

   public class_341 method_30820() {
      return this.field_34683;
   }
}
