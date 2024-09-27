package net.minecraft.network;

import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import javax.annotation.Nullable;
import javax.crypto.Cipher;

import mapped.*;
import net.minecraft.network.play.ServerLoginNetHandler;
import net.minecraft.network.play.server.SDisconnectPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class NetworkManager extends SimpleChannelInboundHandler<IPacket<?>> {
   private static final Logger LOGGER = LogManager.getLogger();
   public static final Marker NETWORK_MARKER = MarkerManager.getMarker("NETWORK");
   public static final Marker NETWORK_PACKETS_MARKER = MarkerManager.getMarker("NETWORK_PACKETS", NETWORK_MARKER);
   public static final AttributeKey<ProtocolType> PROTOCOL_ATTRIBUTE_KEY = AttributeKey.valueOf("protocol");
   public static final LazyValue<NioEventLoopGroup> CLIENT_NIO_EVENTLOOP = new LazyValue<NioEventLoopGroup>(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build())
   );
   public static final LazyValue<EpollEventLoopGroup> CLIENT_EPOLL_EVENTLOOP = new LazyValue<EpollEventLoopGroup>(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build())
   );
   public static final LazyValue<DefaultEventLoopGroup> CLIENT_LOCAL_EVENTLOOP = new LazyValue<DefaultEventLoopGroup>(
      () -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build())
   );
   private final PacketDirection direction;
   private final Queue<QueuedPacket> outboundPacketsQueue = Queues.newConcurrentLinkedQueue();
   private Channel channel;
   private SocketAddress socketAddress;
   public INetHandler packetListener;
   private ITextComponent terminationReason;
   private boolean isEncrypted;
   private boolean disconnected;

   private int field_211394_q;
   private int field_211395_r;
   private float field_211396_s;
   private float field_211397_t;
   private boolean field_211399_v;

   private int ticks;

   public NetworkManager(PacketDirection packetDirection) {
      this.direction = packetDirection;
   }

   public void channelActive(ChannelHandlerContext p_channelActive_1_) throws Exception {
      super.channelActive(p_channelActive_1_);
      this.channel = p_channelActive_1_.channel();
      this.socketAddress = this.channel.remoteAddress();

      try {
         this.setConnectionState(ProtocolType.field9901);
      } catch (Throwable var5) {
         System.out.println("LINE 89 NetworkManager");
         LOGGER.fatal(var5);
      }
   }

   public void setConnectionState(ProtocolType var1) {
      this.channel.attr(PROTOCOL_ATTRIBUTE_KEY).set(var1);
      this.channel.config().setAutoRead(true);
      LOGGER.debug("Enabled auto read");
   }

   public void channelInactive(ChannelHandlerContext p_channelInactive_1_) throws Exception {
      this.closeChannel(new TranslationTextComponent("disconnect.endOfStream"));
   }

   public void exceptionCaught(ChannelHandlerContext p_exceptionCaught_1_, Throwable p_exceptionCaught_2_) {
      if (p_exceptionCaught_2_ instanceof SkipableEncoderException)
      {
         LOGGER.debug("Skipping packet due to errors", p_exceptionCaught_2_.getCause());
      }
      else
      {
         boolean flag = !this.field_211399_v;
         this.field_211399_v = true;

         if (this.channel.isOpen())
         {
            if (p_exceptionCaught_2_ instanceof TimeoutException)
            {
               LOGGER.debug("Timeout", p_exceptionCaught_2_);
               this.closeChannel(new TranslationTextComponent("disconnect.timeout"));
            }
            else
            {
               ITextComponent itextcomponent = new TranslationTextComponent("disconnect.genericReason", "Internal Exception: " + p_exceptionCaught_2_);

               if (flag)
               {
                  LOGGER.debug("Failed to sent packet", p_exceptionCaught_2_);
                  this.sendPacket(new SDisconnectPacket(itextcomponent), (p_211391_2_) ->
                  {
                     this.closeChannel(itextcomponent);
                  });
                  this.disableAutoRead();
               }
               else
               {
                  LOGGER.debug("Double fault", p_exceptionCaught_2_);
                  this.closeChannel(itextcomponent);
               }
            }
         }
      }
   }

   @Override
   public void channelRead0(ChannelHandlerContext p_channelRead0_1_, IPacket<?> p_channelRead0_2_) throws Exception {
      if (this.channel.isOpen()) {
         ReceivePacketEvent event = new ReceivePacketEvent(p_channelRead0_2_);
         Client.getInstance().getEventManager().call(event);
         if (event.isCancelled()) {
            return;
         }

         try {
            processPacket(event.getPacket(), this.packetListener);
         } catch (ThreadQuickExitException var7) {
         }

         ++this.field_211394_q;
      }
   }

   public static <T extends INetHandler> void processPacket(IPacket<T> var0, INetHandler p_197664_1_) {
      var0.processPacket((T) p_197664_1_);
   }

   public void setNetHandler(INetHandler handler) {
      Validate.notNull(handler, "packetListener");
      this.packetListener = handler;
   }

   public void sendPacket(IPacket<?> packetIn) {
      this.sendPacket(packetIn, null);
   }

   public void sendPacket(IPacket<?> packetIn, GenericFutureListener<? extends Future<? super Void>> p_201058_2_) {
      SendPacketEvent var5 = new SendPacketEvent(packetIn);
      Client.getInstance().getEventManager().call(var5);
      packetIn = var5.getPacket();
      if (!var5.isCancelled()) {
         if (!this.isChannelOpen()) {
            this.outboundPacketsQueue.add(new QueuedPacket(packetIn, p_201058_2_));
         } else {
            this.flushOutboundQueue();
            this.dispatchPacket(packetIn, p_201058_2_);
         }
      }
   }

   public void sendNoEventPacket(IPacket<?> packet) {
      if (!this.isChannelOpen()) {
         this.outboundPacketsQueue.add(new QueuedPacket(packet, null));
      } else {
         this.flushOutboundQueue();
         this.dispatchPacket(packet, null);
      }
   }

   private void dispatchPacket(IPacket<?> inPacket, GenericFutureListener<? extends Future<? super Void>> futureListeners) {
      ProtocolType protocoltype = ProtocolType.getFromPacket(inPacket);
      ProtocolType protocoltype1 = this.channel.attr(PROTOCOL_ATTRIBUTE_KEY).get();
      this.field_211395_r++;
      if (protocoltype1 != protocoltype) {
         LOGGER.debug("Disabled auto read");
         this.channel.config().setAutoRead(false);
      }

      if (!this.channel.eventLoop().inEventLoop()) {
         this.channel.eventLoop().execute(() -> {
            if (protocoltype != protocoltype1) {
               this.setConnectionState(protocoltype);
            }

            ChannelFuture channelfuture = this.channel.writeAndFlush(inPacket);
            if (futureListeners != null) {
               channelfuture.addListener(futureListeners);
            }

            channelfuture.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
         });
      } else {
         if (protocoltype != protocoltype1) {
            this.setConnectionState(protocoltype);
         }

         ChannelFuture channelfuture1 = this.channel.writeAndFlush(inPacket);
         if (futureListeners != null) {
            channelfuture1.addListener(futureListeners);
         }

         channelfuture1.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
      }
   }

   private void flushOutboundQueue() {
      if (this.channel != null && this.channel.isOpen())
      {
         synchronized (this.outboundPacketsQueue)
         {
            NetworkManager.QueuedPacket networkmanager$queuedpacket;

            while ((networkmanager$queuedpacket = this.outboundPacketsQueue.poll()) != null)
            {
               this.dispatchPacket(networkmanager$queuedpacket.packet, networkmanager$queuedpacket.field_201049_b);
            }
         }
      }
   }

   public void tick() {
      this.flushOutboundQueue();
      if (this.packetListener instanceof ServerLoginNetHandler) {
         ((ServerLoginNetHandler)this.packetListener).tick();
      }

      if (this.packetListener instanceof ServerPlayNetHandler) {
         ((ServerPlayNetHandler)this.packetListener).tick();
      }

      if (this.channel != null) {
         this.channel.flush();
      }

      if (this.ticks++ % 20 == 0) {
         this.func_241877_b();
      }
   }

   public void func_241877_b() {
      this.field_211397_t = MathHelper.lerp(0.75F, (float)this.field_211395_r, this.field_211397_t);
      this.field_211396_s = MathHelper.lerp(0.75F, (float)this.field_211394_q, this.field_211396_s);
      this.field_211395_r = 0;
      this.field_211394_q = 0;
   }

   public SocketAddress getRemoteAddress() {
      return this.socketAddress;
   }

   public void closeChannel(ITextComponent message) {
      if (this.channel.isOpen()) {
         this.channel.close().awaitUninterruptibly();
         this.terminationReason = message;
      }
   }

   public boolean isLocalChannel() {
      return this.channel instanceof LocalChannel || this.channel instanceof LocalServerChannel;
   }

   public static NetworkManager createNetworkManagerAndConnect(InetAddress address, int serverPort, boolean useNativeTransport) {
      final NetworkManager networkmanager = new NetworkManager(PacketDirection.CLIENTBOUND);
      Class <? extends SocketChannel > oclass;
      LazyValue <? extends EventLoopGroup > lazyvalue;

      if (Epoll.isAvailable() && useNativeTransport)
      {
         oclass = EpollSocketChannel.class;
         lazyvalue = CLIENT_EPOLL_EVENTLOOP;
      }
      else
      {
         oclass = NioSocketChannel.class;
         lazyvalue = CLIENT_NIO_EVENTLOOP;
      }

      (new Bootstrap()).group(lazyvalue.getValue()).handler(new ChannelInitializer<Channel>()
      {
         protected void initChannel(Channel p_initChannel_1_) throws Exception
         {
            try
            {
               p_initChannel_1_.config().setOption(ChannelOption.TCP_NODELAY, true);
            }
            catch (ChannelException channelexception)
            {
            }

            p_initChannel_1_.pipeline().addLast("timeout", new ReadTimeoutHandler(30)).addLast("splitter", new NettyVarint21FrameDecoder()).addLast("decoder", new NettyPacketDecoder(PacketDirection.CLIENTBOUND)).addLast("prepender", new NettyVarint21FrameEncoder()).addLast("encoder", new NettyPacketEncoder(PacketDirection.SERVERBOUND)).addLast("packet_handler", networkmanager);
         }
      }).channel(oclass).connect(address, serverPort).syncUninterruptibly();
      return networkmanager;
   }

   public static NetworkManager provideLocalClient(SocketAddress address) {
      final NetworkManager networkmanager = new NetworkManager(PacketDirection.CLIENTBOUND);
      (new Bootstrap()).group(CLIENT_LOCAL_EVENTLOOP.getValue()).handler(new ChannelInitializer<Channel>()
      {
         protected void initChannel(Channel p_initChannel_1_) throws Exception
         {
            p_initChannel_1_.pipeline().addLast("packet_handler", networkmanager);
         }
      }).channel(LocalChannel.class).connect(address).syncUninterruptibly();
      return networkmanager;
   }

   public void func_244777_a(Cipher var1, Cipher var2) {
      this.isEncrypted = true;
      this.channel.pipeline().addBefore("splitter", "decrypt", new NettyEncryptingDecoder(var1));
      this.channel.pipeline().addBefore("prepender", "encrypt", new NettyEncryptingEncoder(var2));
   }

   public boolean isEncrypted() {
      return this.isEncrypted;
   }

   public boolean isChannelOpen() {
      return this.channel != null && this.channel.isOpen();
   }

   public boolean hasNoChannel() {
      return this.channel == null;
   }

   public INetHandler getNetHandler() {
      return this.packetListener;
   }

   @Nullable
   public ITextComponent getExitMessage() {
      return this.terminationReason;
   }

   public void disableAutoRead() {
      this.channel.config().setAutoRead(false);
   }

   public void setCompressionThreshold(int threshold) {
      if (threshold >= 0)
      {
         if (this.channel.pipeline().get("decompress") instanceof NettyCompressionDecoder)
         {
            ((NettyCompressionDecoder)this.channel.pipeline().get("decompress")).setCompressionThreshold(threshold);
         }
         else
         {
            this.channel.pipeline().addBefore("decoder", "decompress", new NettyCompressionDecoder(threshold));
         }

         if (this.channel.pipeline().get("compress") instanceof NettyCompressionEncoder)
         {
            ((NettyCompressionEncoder)this.channel.pipeline().get("compress")).setCompressionThreshold(threshold);
         }
         else
         {
            this.channel.pipeline().addBefore("encoder", "compress", new NettyCompressionEncoder(threshold));
         }
      }
      else
      {
         if (this.channel.pipeline().get("decompress") instanceof NettyCompressionDecoder)
         {
            this.channel.pipeline().remove("decompress");
         }

         if (this.channel.pipeline().get("compress") instanceof NettyCompressionEncoder)
         {
            this.channel.pipeline().remove("compress");
         }
      }
   }

   public void handleDisconnection() {
      if (this.channel != null && !this.channel.isOpen()) {
         if (!this.disconnected) {
            this.disconnected = true;
            if (this.getExitMessage() == null) {
               if (this.getNetHandler() != null) {
                  this.getNetHandler().onDisconnect(new TranslationTextComponent("multiplayer.disconnect.generic"));
               }
            } else {
               this.getNetHandler().onDisconnect(this.getExitMessage());
            }
         } else {
            LOGGER.warn("handleDisconnection() called twice");
         }
      }
   }

   public float getPacketsReceived() {
      return this.field_211396_s;
   }

   public float getPacketsSent() {
      return this.field_211397_t;
   }

   public static class QueuedPacket {
      private final IPacket<?> packet;
      @org.jetbrains.annotations.Nullable
      private final GenericFutureListener <? extends Future <? super Void >> field_201049_b;

      public QueuedPacket(IPacket<?> p_i48604_1_, @org.jetbrains.annotations.Nullable GenericFutureListener <? extends Future <? super Void >> p_i48604_2_)
      {
         this.packet = p_i48604_1_;
         this.field_201049_b = p_i48604_2_;
      }
   }
}
