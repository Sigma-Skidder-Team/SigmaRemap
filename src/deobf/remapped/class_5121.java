package remapped;

import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.DefaultEventLoopGroup;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class class_5121 extends SimpleChannelInboundHandler<Packet<?>> {
   private static final Logger field_26418 = LogManager.getLogger();
   public static final Marker field_26416 = MarkerManager.getMarker("NETWORK");
   public static final Marker field_26430 = MarkerManager.getMarker("NETWORK_PACKETS", field_26416);
   public static final AttributeKey<class_5776> field_26414 = AttributeKey.valueOf("protocol");
   public static final class_3642<NioEventLoopGroup> field_26413 = new class_3642<NioEventLoopGroup>(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build())
   );
   public static final class_3642<EpollEventLoopGroup> field_26427 = new class_3642<EpollEventLoopGroup>(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build())
   );
   public static final class_3642<DefaultEventLoopGroup> field_26428 = new class_3642<DefaultEventLoopGroup>(
      () -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build())
   );
   private final class_4739 field_26415;
   private final Queue<class_9542> field_26432 = Queues.newConcurrentLinkedQueue();
   private Channel field_26419;
   private SocketAddress field_26421;
   public class_1977 field_26435;
   private ITextComponent field_26424;
   private boolean field_26434;
   private boolean field_26417;
   private int field_26429;
   private int field_26426;
   private float field_26423;
   private float field_26420;
   private int field_26422;
   private boolean field_26433;
   private class_3347 field_26425;

   public class_5121(class_4739 var1) {
      this.field_26415 = var1;
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      super.channelActive(var1);
      this.field_26419 = var1.channel();
      this.field_26421 = this.field_26419.remoteAddress();

      try {
         this.method_23501(class_5776.field_29175);
         this.field_26425 = new class_3347(this.field_26419);
      } catch (Throwable var5) {
         field_26418.fatal(var5);
      }
   }

   public void method_23501(class_5776 var1) {
      this.field_26419.attr(field_26414).set(var1);
      this.field_26419.config().setAutoRead(true);
      field_26418.debug("Enabled auto read");
   }

   public void channelInactive(ChannelHandlerContext var1) throws Exception {
      this.method_23482(new TranslationTextComponent("disconnect.endOfStream"));
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      if (!(var2 instanceof class_7585)) {
         boolean var5 = !this.field_26433;
         this.field_26433 = true;
         if (this.field_26419.isOpen()) {
            if (!(var2 instanceof TimeoutException)) {
               TranslationTextComponent var6 = new TranslationTextComponent("disconnect.genericReason", "Internal Exception: " + var2);
               if (!var5) {
                  field_26418.debug("Double fault", var2);
                  this.method_23482(var6);
               } else {
                  field_26418.debug("Failed to sent packet", var2);
                  this.method_23486(new class_7957(var6), var2x -> this.method_23482(var6));
                  this.method_23479();
               }
            } else {
               field_26418.debug("Timeout", var2);
               this.method_23482(new TranslationTextComponent("disconnect.timeout"));
            }
         }
      } else {
         field_26418.debug("Skipping packet due to errors", var2.getCause());
      }
   }

   public void channelRead0(ChannelHandlerContext var1, Packet<?> var2) throws Exception {
      if (this.field_26419.isOpen()) {
         PacketEvent var5 = new PacketEvent(var2);
         SigmaMainClass.getInstance().getEventManager().call(var5);
         if (var5.method_29716()) {
            return;
         }

         try {
            method_23491(var5.method_557(), this.field_26435);
         } catch (class_2506 var7) {
         }

         this.field_26429++;
      }
   }

   public static <T extends class_1977> void method_23491(Packet<T> var0, class_1977 var1) {
      var0.method_28777(var1);
   }

   public void method_23495(class_1977 var1) {
      Validate.notNull(var1, "packetListener", new Object[0]);
      this.field_26435 = var1;
   }

   public void method_23485(Packet<?> var1) {
      this.method_23486(var1, (GenericFutureListener<? extends Future<? super Void>>)null);
   }

   public void method_23486(Packet<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      class_2157 var5 = new class_2157(var1);
      SigmaMainClass.getInstance().getEventManager().call(var5);
      var1 = var5.method_10047();
      if (!var5.method_29716()) {
         if (!this.method_23493()) {
            this.field_26432.add(new class_9542(var1, var2));
         } else {
            this.method_23497();
            this.method_23502(var1, var2);
         }
      }
   }

   public void method_23481(Packet<?> var1) {
      GenericFutureListener var4 = (GenericFutureListener)null;
      if (!this.method_23493()) {
         this.field_26432.add(new class_9542(var1, var4));
      } else {
         this.method_23497();
         this.method_23502(var1, var4);
      }
   }

   private void method_23502(Packet<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      class_5776 var5 = class_5776.method_26116(var1);
      class_5776 var6 = (class_5776)this.field_26419.attr(field_26414).get();
      this.field_26426++;
      if (var6 != var5) {
         field_26418.debug("Disabled auto read");
         this.field_26419.config().setAutoRead(false);
      }

      if (!this.field_26419.eventLoop().inEventLoop()) {
         this.field_26419.eventLoop().execute(() -> {
            if (var5 != var6) {
               this.method_23501(var5);
            }

            ChannelFuture var7x = this.field_26419.writeAndFlush(var1);
            if (var2 != null) {
               var7x.addListener(var2);
            }

            var7x.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
         });
      } else {
         if (var5 != var6) {
            this.method_23501(var5);
         }

         ChannelFuture var7 = this.field_26419.writeAndFlush(var1);
         if (var2 != null) {
            var7.addListener(var2);
         }

         var7.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
      }
   }

   private void method_23497() {
      if (this.field_26419 != null && this.field_26419.isOpen()) {
         class_9542 var4;
         synchronized (this.field_26432) {
            while ((var4 = this.field_26432.poll()) != null) {
               this.method_23502(class_9542.method_44001(var4), class_9542.method_44003(var4));
            }
         }
      }
   }

   public void method_23483() {
      this.method_23497();
      if (this.field_26435 instanceof class_3194) {
         ((class_3194)this.field_26435).method_14702();
      }

      if (this.field_26435 instanceof class_948) {
         ((class_948)this.field_26435).method_4160();
      }

      if (this.field_26419 != null) {
         this.field_26419.flush();
      }

      if (this.field_26422++ % 20 == 0) {
         this.method_23496();
      }
   }

   public void method_23496() {
      this.field_26420 = class_9299.method_42795(0.75F, (float)this.field_26426, this.field_26420);
      this.field_26423 = class_9299.method_42795(0.75F, (float)this.field_26429, this.field_26423);
      this.field_26426 = 0;
      this.field_26429 = 0;
   }

   public SocketAddress method_23494() {
      return this.field_26421;
   }

   public void method_23482(ITextComponent var1) {
      if (this.field_26419.isOpen()) {
         this.field_26419.close().awaitUninterruptibly();
         this.field_26424 = var1;
      }

      if (this.field_26425 != null) {
         this.field_26425.method_15350();
      }
   }

   public boolean method_23500() {
      return this.field_26419 instanceof LocalChannel || this.field_26419 instanceof LocalServerChannel;
   }

   public static class_5121 method_23489(InetAddress var0, int var1, boolean var2) {
      class_5121 var5 = new class_5121(class_4739.field_22962);
      Class<EpollSocketChannel> var6;
      class_3642 var7;
      if (Epoll.isAvailable() && var2) {
         var6 = EpollSocketChannel.class;
         var7 = field_26427;
      } else {
         var6 = NioSocketChannel.class;
         var7 = field_26413;
      }

      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)var7.method_16960())).handler(new class_2381(var5))).channel(var6))
         .connect(var0, var1)
         .syncUninterruptibly();
      return var5;
   }

   public static class_5121 method_23484(SocketAddress var0) {
      class_5121 var3 = new class_5121(class_4739.field_22962);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)field_26428.method_16960())).handler(new class_7925(var3)))
            .channel(LocalChannel.class))
         .connect(var0)
         .syncUninterruptibly();
      return var3;
   }

   public void method_23488(Cipher var1, Cipher var2) {
      this.field_26434 = true;
      this.field_26419.pipeline().addBefore("splitter", "decrypt", new class_1306(var1));
      this.field_26419.pipeline().addBefore("prepender", "encrypt", new class_8066(var2));
   }

   public boolean method_23503() {
      return this.field_26434;
   }

   public boolean method_23493() {
      return this.field_26419 != null && this.field_26419.isOpen();
   }

   public boolean method_23505() {
      return this.field_26419 == null;
   }

   public class_1977 method_23487() {
      return this.field_26435;
   }

   @Nullable
   public ITextComponent method_23499() {
      return this.field_26424;
   }

   public void method_23479() {
      this.field_26419.config().setAutoRead(false);
   }

   public void method_23504(int var1) {
      if (var1 < 0) {
         if (this.field_26419.pipeline().get("decompress") instanceof class_2969) {
            this.field_26419.pipeline().remove("decompress");
         }

         if (this.field_26419.pipeline().get("compress") instanceof class_5013) {
            this.field_26419.pipeline().remove("compress");
         }
      } else {
         if (!(this.field_26419.pipeline().get("decompress") instanceof class_2969)) {
            this.field_26419.pipeline().addBefore("decoder", "decompress", new class_2969(var1));
         } else {
            ((class_2969)this.field_26419.pipeline().get("decompress")).method_13574(var1);
         }

         if (!(this.field_26419.pipeline().get("compress") instanceof class_5013)) {
            this.field_26419.pipeline().addBefore("encoder", "compress", new class_5013(var1));
         } else {
            ((class_5013)this.field_26419.pipeline().get("compress")).method_23076(var1);
         }
      }

      this.field_26425.method_15347().method_33051(this.field_26419);
   }

   public void method_23480() {
      if (this.field_26419 != null && !this.field_26419.isOpen()) {
         if (!this.field_26417) {
            this.field_26417 = true;
            if (this.method_23499() == null) {
               if (this.method_23487() != null) {
                  this.method_23487().method_9090(new TranslationTextComponent("multiplayer.disconnect.generic"));
               }
            } else {
               this.method_23487().method_9090(this.method_23499());
            }
         } else {
            field_26418.warn("handleDisconnection() called twice");
         }
      }
   }

   public float method_23498() {
      return this.field_26423;
   }

   public float method_23492() {
      return this.field_26420;
   }
}
