package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelProgressivePromise;
import io.netty.channel.ChannelPromise;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.EventExecutor;
import java.net.SocketAddress;

public class Class7512 implements ChannelHandlerContext {
   private static String[] field32231;
   private final ChannelHandlerContext field32232;
   private final Class8175 field32233;

   public Class7512(ChannelHandlerContext var1, Class8175 var2) {
      this.field32232 = var1;
      this.field32233 = var2;
   }

   public Channel channel() {
      return this.field32232.channel();
   }

   public EventExecutor executor() {
      return this.field32232.executor();
   }

   public String name() {
      return this.field32232.name();
   }

   public ChannelHandler handler() {
      return this.field32232.handler();
   }

   public boolean isRemoved() {
      return this.field32232.isRemoved();
   }

   public ChannelHandlerContext fireChannelRegistered() {
      this.field32232.fireChannelRegistered();
      return this;
   }

   public ChannelHandlerContext fireChannelUnregistered() {
      this.field32232.fireChannelUnregistered();
      return this;
   }

   public ChannelHandlerContext fireChannelActive() {
      this.field32232.fireChannelActive();
      return this;
   }

   public ChannelHandlerContext fireChannelInactive() {
      this.field32232.fireChannelInactive();
      return this;
   }

   public ChannelHandlerContext fireExceptionCaught(Throwable var1) {
      this.field32232.fireExceptionCaught(var1);
      return this;
   }

   public ChannelHandlerContext fireUserEventTriggered(Object var1) {
      this.field32232.fireUserEventTriggered(var1);
      return this;
   }

   public ChannelHandlerContext fireChannelRead(Object var1) {
      this.field32232.fireChannelRead(var1);
      return this;
   }

   public ChannelHandlerContext fireChannelReadComplete() {
      this.field32232.fireChannelReadComplete();
      return this;
   }

   public ChannelHandlerContext fireChannelWritabilityChanged() {
      this.field32232.fireChannelWritabilityChanged();
      return this;
   }

   public ChannelFuture bind(SocketAddress var1) {
      return this.field32232.bind(var1);
   }

   public ChannelFuture connect(SocketAddress var1) {
      return this.field32232.connect(var1);
   }

   public ChannelFuture connect(SocketAddress var1, SocketAddress var2) {
      return this.field32232.connect(var1, var2);
   }

   public ChannelFuture disconnect() {
      return this.field32232.disconnect();
   }

   public ChannelFuture close() {
      return this.field32232.close();
   }

   public ChannelFuture deregister() {
      return this.field32232.deregister();
   }

   public ChannelFuture bind(SocketAddress var1, ChannelPromise var2) {
      return this.field32232.bind(var1, var2);
   }

   public ChannelFuture connect(SocketAddress var1, ChannelPromise var2) {
      return this.field32232.connect(var1, var2);
   }

   public ChannelFuture connect(SocketAddress var1, SocketAddress var2, ChannelPromise var3) {
      return this.field32232.connect(var1, var2, var3);
   }

   public ChannelFuture disconnect(ChannelPromise var1) {
      return this.field32232.disconnect(var1);
   }

   public ChannelFuture close(ChannelPromise var1) {
      return this.field32232.close(var1);
   }

   public ChannelFuture deregister(ChannelPromise var1) {
      return this.field32232.deregister(var1);
   }

   public ChannelHandlerContext read() {
      this.field32232.read();
      return this;
   }

   public ChannelFuture write(Object var1) {
      return var1 instanceof ByteBuf && this.method24484((ByteBuf)var1) ? this.field32232.newFailedFuture(new Throwable()) : this.field32232.write(var1);
   }

   public ChannelFuture write(Object var1, ChannelPromise var2) {
      return var1 instanceof ByteBuf && this.method24484((ByteBuf)var1) ? this.field32232.newFailedFuture(new Throwable()) : this.field32232.write(var1, var2);
   }

   public boolean method24484(ByteBuf var1) {
      try {
         this.field32233.method28465(var1);
         return false;
      } catch (Exception var7) {
         Exception var4 = var7;

         try {
            this.field32233.method28466(this.field32232, var4);
         } catch (Exception var6) {
            this.field32232.fireExceptionCaught(var6);
         }

         return true;
      }
   }

   public ChannelHandlerContext flush() {
      this.field32232.flush();
      return this;
   }

   public ChannelFuture writeAndFlush(Object var1, ChannelPromise var2) {
      ChannelFuture var5 = this.write(var1, var2);
      this.flush();
      return var5;
   }

   public ChannelFuture writeAndFlush(Object var1) {
      ChannelFuture var4 = this.write(var1);
      this.flush();
      return var4;
   }

   public ChannelPipeline pipeline() {
      return this.field32232.pipeline();
   }

   public ByteBufAllocator alloc() {
      return this.field32232.alloc();
   }

   public ChannelPromise newPromise() {
      return this.field32232.newPromise();
   }

   public ChannelProgressivePromise newProgressivePromise() {
      return this.field32232.newProgressivePromise();
   }

   public ChannelFuture newSucceededFuture() {
      return this.field32232.newSucceededFuture();
   }

   public ChannelFuture newFailedFuture(Throwable var1) {
      return this.field32232.newFailedFuture(var1);
   }

   public ChannelPromise voidPromise() {
      return this.field32232.voidPromise();
   }

   public <T> Attribute<T> attr(AttributeKey<T> var1) {
      return this.field32232.attr(var1);
   }

   public <T> boolean hasAttr(AttributeKey<T> var1) {
      return false;
   }
}
