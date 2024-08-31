package mapped;

import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.unmapped.Class8005;
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
import io.netty.channel.socket.SocketChannel;
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

import net.minecraft.network.INetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SDisconnectPacket;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class NetworkManager extends SimpleChannelInboundHandler<Packet<?>> {
   private static final Logger field38639 = LogManager.getLogger();
   public static final Marker field38640 = MarkerManager.getMarker("NETWORK");
   public static final Marker field38641 = MarkerManager.getMarker("NETWORK_PACKETS", field38640);
   public static final AttributeKey<ProtocolType> field38642 = AttributeKey.valueOf("protocol");
   public static final LazyValue<NioEventLoopGroup> field38643 = new LazyValue<NioEventLoopGroup>(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build())
   );
   public static final LazyValue<EpollEventLoopGroup> field38644 = new LazyValue<EpollEventLoopGroup>(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build())
   );
   public static final LazyValue<DefaultEventLoopGroup> field38645 = new LazyValue<DefaultEventLoopGroup>(
      () -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build())
   );
   private final Class1975 field38646;
   private final Queue<Class9742> field38647 = Queues.newConcurrentLinkedQueue();
   private Channel field38648;
   private SocketAddress field38649;
   public INetHandler field38650;
   private ITextComponent field38651;
   private boolean field38652;
   private boolean field38653;
   private int field38654;
   private int field38655;
   private float field38656;
   private float field38657;
   private int field38658;
   private boolean field38659;
   private Class8005 field38660;

   public NetworkManager(Class1975 var1) {
      this.field38646 = var1;
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      super.channelActive(var1);
      this.field38648 = var1.channel();
      this.field38649 = this.field38648.remoteAddress();

      try {
         this.method30690(ProtocolType.field9901);
        // this.field38660 = new Class8005(this.field38648);
      } catch (Throwable var5) {
         field38639.fatal(var5);
      }
   }

   public void method30690(ProtocolType var1) {
      this.field38648.attr(field38642).set(var1);
      this.field38648.config().setAutoRead(true);
      field38639.debug("Enabled auto read");
   }

   public void channelInactive(ChannelHandlerContext var1) throws Exception {
      this.method30701(new TranslationTextComponent("disconnect.endOfStream"));
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      if (!(var2 instanceof Class9233)) {
         boolean var5 = !this.field38659;
         this.field38659 = true;
         if (this.field38648.isOpen()) {
            if (!(var2 instanceof TimeoutException)) {
               TranslationTextComponent var6 = new TranslationTextComponent("disconnect.genericReason", "Internal Exception: " + var2);
               if (!var5) {
                  field38639.debug("Double fault", var2);
                  this.method30701(var6);
               } else {
                  field38639.debug("Failed to sent packet", var2);
                  this.method30694(new SDisconnectPacket(var6), var2x -> this.method30701(var6));
                  this.method30711();
               }
            } else {
               field38639.debug("Timeout", var2);
               this.method30701(new TranslationTextComponent("disconnect.timeout"));
            }
         }
      } else {
         field38639.debug("Skipping packet due to errors", var2.getCause());
      }
   }

   @Override
   public void channelRead0(ChannelHandlerContext var1, Packet<?> var2) throws Exception {
      if (this.field38648.isOpen()) {
         RecievePacketEvent var5 = new RecievePacketEvent(var2);
         Client.getInstance().getEventManager().call(var5);
         if (var5.isCancelled()) {
            return;
         }

         try {
            method30691(var5.getPacket(), this.field38650);
         } catch (Class2466 var7) {
         }

         this.field38654++;
      }
   }

   public static <T extends INetHandler> void method30691(Packet<T> var0, INetHandler var1) {
      var0.processPacket((T) var1);
   }

   public void setNetHandler(INetHandler var1) {
      Validate.notNull(var1, "packetListener", new Object[0]);
      this.field38650 = var1;
   }

   public void sendPacket(Packet<?> var1) {
      this.method30694(var1, null);
   }

   public void method30694(Packet<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      SendPacketEvent var5 = new SendPacketEvent(var1);
      Client.getInstance().getEventManager().call(var5);
      var1 = var5.method13932();
      if (!var5.isCancelled()) {
         if (!this.isChannelOpen()) {
            this.field38647.add(new Class9742(var1, var2));
         } else {
            this.method30697();
            this.method30696(var1, var2);
         }
      }
   }

   public void method30695(Packet<?> var1) {
      GenericFutureListener var4 = (GenericFutureListener)null;
      if (!this.isChannelOpen()) {
         this.field38647.add(new Class9742(var1, var4));
      } else {
         this.method30697();
         this.method30696(var1, var4);
      }
   }

   private void method30696(Packet<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      ProtocolType var5 = ProtocolType.method8106(var1);
      ProtocolType var6 = (ProtocolType)this.field38648.attr(field38642).get();
      this.field38655++;
      if (var6 != var5) {
         field38639.debug("Disabled auto read");
         this.field38648.config().setAutoRead(false);
      }

      if (!this.field38648.eventLoop().inEventLoop()) {
         this.field38648.eventLoop().execute(() -> {
            if (var5 != var6) {
               this.method30690(var5);
            }

            ChannelFuture var7x = this.field38648.writeAndFlush(var1);
            if (var2 != null) {
               var7x.addListener(var2);
            }

            var7x.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
         });
      } else {
         if (var5 != var6) {
            this.method30690(var5);
         }

         ChannelFuture var7 = this.field38648.writeAndFlush(var1);
         if (var2 != null) {
            var7.addListener(var2);
         }

         var7.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
      }
   }

   private void method30697() {
      if (this.field38648 != null && this.field38648.isOpen()) {
         Class9742 var4;
         synchronized (this.field38647) {
            while ((var4 = this.field38647.poll()) != null) {
               this.method30696(Class9742.method38190(var4), Class9742.method38191(var4));
            }
         }
      }
   }

   public void tick() {
      this.method30697();
      if (this.field38650 instanceof Class5109) {
         ((Class5109)this.field38650).method15599();
      }

      if (this.field38650 instanceof ServerPlayNetHandler) {
         ((ServerPlayNetHandler)this.field38650).method15655();
      }

      if (this.field38648 != null) {
         this.field38648.flush();
      }

      if (this.field38658++ % 20 == 0) {
         this.method30699();
      }
   }

   public void method30699() {
      this.field38657 = MathHelper.lerp(0.75F, (float)this.field38655, this.field38657);
      this.field38656 = MathHelper.lerp(0.75F, (float)this.field38654, this.field38656);
      this.field38655 = 0;
      this.field38654 = 0;
   }

   public SocketAddress method30700() {
      return this.field38649;
   }

   public void method30701(ITextComponent var1) {
      if (this.field38648.isOpen()) {
         this.field38648.close().awaitUninterruptibly();
         this.field38651 = var1;
      }

      if (this.field38660 != null) {
         //this.field38660.method27369();
      }
   }

   public boolean method30702() {
      return this.field38648 instanceof LocalChannel || this.field38648 instanceof LocalServerChannel;
   }

   public static NetworkManager method30703(InetAddress var0, int var1, boolean var2) {
      NetworkManager var5 = new NetworkManager(Class1975.CLIENTBOUND);
      Class<? extends SocketChannel> var6;
      LazyValue<? extends EventLoopGroup> var7;
      if (Epoll.isAvailable() && var2) {
         var6 = EpollSocketChannel.class;
         var7 = field38644;
      } else {
         var6 = NioSocketChannel.class;
         var7 = field38643;
      }

      new Bootstrap().group(var7.getValue()).handler(new Class7669(var5)).channel(var6)
         .connect(var0, var1)
         .syncUninterruptibly();

      return var5;
   }

   public static NetworkManager provideLocalClient(SocketAddress var0) {
      NetworkManager var3 = new NetworkManager(Class1975.CLIENTBOUND);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)field38645.getValue())).handler(new Class9317(var3)))
            .channel(LocalChannel.class))
         .connect(var0)
         .syncUninterruptibly();
      return var3;
   }

   public void method30705(Cipher var1, Cipher var2) {
      this.field38652 = true;
      this.field38648.pipeline().addBefore("splitter", "decrypt", new Class7033(var1));
      this.field38648.pipeline().addBefore("prepender", "encrypt", new Class9357(var2));
   }

   public boolean method30706() {
      return this.field38652;
   }

   public boolean isChannelOpen() {
      return this.field38648 != null && this.field38648.isOpen();
   }

   public boolean method30708() {
      return this.field38648 == null;
   }

   public INetHandler method30709() {
      return this.field38650;
   }

   @Nullable
   public ITextComponent method30710() {
      return this.field38651;
   }

   public void method30711() {
      this.field38648.config().setAutoRead(false);
   }

   public void method30712(int var1) {
      if (var1 < 0) {
         if (this.field38648.pipeline().get("decompress") instanceof Class7877) {
            this.field38648.pipeline().remove("decompress");
         }

         if (this.field38648.pipeline().get("compress") instanceof Class8546) {
            this.field38648.pipeline().remove("compress");
         }
      } else {
         if (!(this.field38648.pipeline().get("decompress") instanceof Class7877)) {
            this.field38648.pipeline().addBefore("decoder", "decompress", new Class7877(var1));
         } else {
            ((Class7877)this.field38648.pipeline().get("decompress")).method26412(var1);
         }

         if (!(this.field38648.pipeline().get("compress") instanceof Class8546)) {
            this.field38648.pipeline().addBefore("encoder", "compress", new Class8546(var1));
         } else {
            ((Class8546)this.field38648.pipeline().get("compress")).method30445(var1);
         }
      }

     // this.field38660.method27373().method34157(this.field38648);
   }

   public void method30713() {
      if (this.field38648 != null && !this.field38648.isOpen()) {
         if (!this.field38653) {
            this.field38653 = true;
            if (this.method30710() == null) {
               if (this.method30709() != null) {
                  this.method30709().method15588(new TranslationTextComponent("multiplayer.disconnect.generic"));
               }
            } else {
               this.method30709().method15588(this.method30710());
            }
         } else {
            field38639.warn("handleDisconnection() called twice");
         }
      }
   }

   public float method30714() {
      return this.field38656;
   }

   public float method30715() {
      return this.field38657;
   }
}
