package remapped;

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

public class class_2077 implements ChannelHandlerContext {
   private static String[] field_10454;
   private final ChannelHandlerContext field_10456;
   private final class_3824 field_10455;

   public class_2077(ChannelHandlerContext var1, class_3824 var2) {
      this.field_10456 = var1;
      this.field_10455 = var2;
   }

   public Channel channel() {
      return this.field_10456.channel();
   }

   public EventExecutor executor() {
      return this.field_10456.executor();
   }

   public String name() {
      return this.field_10456.name();
   }

   public ChannelHandler handler() {
      return this.field_10456.handler();
   }

   public boolean isRemoved() {
      return this.field_10456.isRemoved();
   }

   public ChannelHandlerContext fireChannelRegistered() {
      this.field_10456.fireChannelRegistered();
      return this;
   }

   public ChannelHandlerContext fireChannelUnregistered() {
      this.field_10456.fireChannelUnregistered();
      return this;
   }

   public ChannelHandlerContext fireChannelActive() {
      this.field_10456.fireChannelActive();
      return this;
   }

   public ChannelHandlerContext fireChannelInactive() {
      this.field_10456.fireChannelInactive();
      return this;
   }

   public ChannelHandlerContext fireExceptionCaught(Throwable var1) {
      this.field_10456.fireExceptionCaught(var1);
      return this;
   }

   public ChannelHandlerContext fireUserEventTriggered(Object var1) {
      this.field_10456.fireUserEventTriggered(var1);
      return this;
   }

   public ChannelHandlerContext fireChannelRead(Object var1) {
      this.field_10456.fireChannelRead(var1);
      return this;
   }

   public ChannelHandlerContext fireChannelReadComplete() {
      this.field_10456.fireChannelReadComplete();
      return this;
   }

   public ChannelHandlerContext fireChannelWritabilityChanged() {
      this.field_10456.fireChannelWritabilityChanged();
      return this;
   }

   public ChannelFuture bind(SocketAddress var1) {
      return this.field_10456.bind(var1);
   }

   public ChannelFuture connect(SocketAddress var1) {
      return this.field_10456.connect(var1);
   }

   public ChannelFuture connect(SocketAddress var1, SocketAddress var2) {
      return this.field_10456.connect(var1, var2);
   }

   public ChannelFuture disconnect() {
      return this.field_10456.disconnect();
   }

   public ChannelFuture close() {
      return this.field_10456.close();
   }

   public ChannelFuture deregister() {
      return this.field_10456.deregister();
   }

   public ChannelFuture bind(SocketAddress var1, ChannelPromise var2) {
      return this.field_10456.bind(var1, var2);
   }

   public ChannelFuture connect(SocketAddress var1, ChannelPromise var2) {
      return this.field_10456.connect(var1, var2);
   }

   public ChannelFuture connect(SocketAddress var1, SocketAddress var2, ChannelPromise var3) {
      return this.field_10456.connect(var1, var2, var3);
   }

   public ChannelFuture disconnect(ChannelPromise var1) {
      return this.field_10456.disconnect(var1);
   }

   public ChannelFuture close(ChannelPromise var1) {
      return this.field_10456.close(var1);
   }

   public ChannelFuture deregister(ChannelPromise var1) {
      return this.field_10456.deregister(var1);
   }

   public ChannelHandlerContext read() {
      this.field_10456.read();
      return this;
   }

   public ChannelFuture write(Object var1) {
      return var1 instanceof ByteBuf && this.method_9692((ByteBuf)var1) ? this.field_10456.newFailedFuture(new Throwable()) : this.field_10456.write(var1);
   }

   public ChannelFuture write(Object var1, ChannelPromise var2) {
      return var1 instanceof ByteBuf && this.method_9692((ByteBuf)var1)
         ? this.field_10456.newFailedFuture(new Throwable())
         : this.field_10456.write(var1, var2);
   }

   public boolean method_9692(ByteBuf var1) {
      try {
         this.field_10455.method_17801(var1);
         return false;
      } catch (Exception var7) {
         Exception var4 = var7;

         try {
            this.field_10455.method_17800(this.field_10456, var4);
         } catch (Exception var6) {
            this.field_10456.fireExceptionCaught(var6);
         }

         return true;
      }
   }

   public ChannelHandlerContext flush() {
      this.field_10456.flush();
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
      return this.field_10456.pipeline();
   }

   public ByteBufAllocator alloc() {
      return this.field_10456.alloc();
   }

   public ChannelPromise newPromise() {
      return this.field_10456.newPromise();
   }

   public ChannelProgressivePromise newProgressivePromise() {
      return this.field_10456.newProgressivePromise();
   }

   public ChannelFuture newSucceededFuture() {
      return this.field_10456.newSucceededFuture();
   }

   public ChannelFuture newFailedFuture(Throwable var1) {
      return this.field_10456.newFailedFuture(var1);
   }

   public ChannelPromise voidPromise() {
      return this.field_10456.voidPromise();
   }

   public <T> Attribute<T> attr(AttributeKey<T> var1) {
      return this.field_10456.attr(var1);
   }

   public <T> boolean hasAttr(AttributeKey<T> var1) {
      return false;
   }
}
