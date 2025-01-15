// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.channel.ChannelOutboundInvoker;
import io.netty.channel.ChannelInboundInvoker;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import io.netty.channel.ChannelProgressivePromise;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelPipeline;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelPromise;
import io.netty.channel.ChannelFuture;
import java.net.SocketAddress;
import io.netty.channel.ChannelHandler;
import io.netty.util.concurrent.EventExecutor;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;

public class Class7127 implements ChannelHandlerContext
{
    private static String[] field27773;
    private ChannelHandlerContext field27774;
    private Class9153 field27775;
    
    public Class7127(final ChannelHandlerContext field27774, final Class9153 field27775) {
        this.field27774 = field27774;
        this.field27775 = field27775;
    }
    
    public Channel channel() {
        return this.field27774.channel();
    }
    
    public EventExecutor executor() {
        return this.field27774.executor();
    }
    
    public String name() {
        return this.field27774.name();
    }
    
    public ChannelHandler handler() {
        return this.field27774.handler();
    }
    
    public boolean isRemoved() {
        return this.field27774.isRemoved();
    }
    
    public ChannelHandlerContext fireChannelRegistered() {
        this.field27774.fireChannelRegistered();
        return (ChannelHandlerContext)this;
    }
    
    public ChannelHandlerContext fireChannelUnregistered() {
        this.field27774.fireChannelUnregistered();
        return (ChannelHandlerContext)this;
    }
    
    public ChannelHandlerContext fireChannelActive() {
        this.field27774.fireChannelActive();
        return (ChannelHandlerContext)this;
    }
    
    public ChannelHandlerContext fireChannelInactive() {
        this.field27774.fireChannelInactive();
        return (ChannelHandlerContext)this;
    }
    
    public ChannelHandlerContext fireExceptionCaught(final Throwable t) {
        this.field27774.fireExceptionCaught(t);
        return (ChannelHandlerContext)this;
    }
    
    public ChannelHandlerContext fireUserEventTriggered(final Object o) {
        this.field27774.fireUserEventTriggered(o);
        return (ChannelHandlerContext)this;
    }
    
    public ChannelHandlerContext fireChannelRead(final Object o) {
        this.field27774.fireChannelRead(o);
        return (ChannelHandlerContext)this;
    }
    
    public ChannelHandlerContext fireChannelReadComplete() {
        this.field27774.fireChannelReadComplete();
        return (ChannelHandlerContext)this;
    }
    
    public ChannelHandlerContext fireChannelWritabilityChanged() {
        this.field27774.fireChannelWritabilityChanged();
        return (ChannelHandlerContext)this;
    }
    
    public ChannelFuture bind(final SocketAddress socketAddress) {
        return this.field27774.bind(socketAddress);
    }
    
    public ChannelFuture connect(final SocketAddress socketAddress) {
        return this.field27774.connect(socketAddress);
    }
    
    public ChannelFuture connect(final SocketAddress socketAddress, final SocketAddress socketAddress2) {
        return this.field27774.connect(socketAddress, socketAddress2);
    }
    
    public ChannelFuture disconnect() {
        return this.field27774.disconnect();
    }
    
    public ChannelFuture close() {
        return this.field27774.close();
    }
    
    public ChannelFuture deregister() {
        return this.field27774.deregister();
    }
    
    public ChannelFuture bind(final SocketAddress socketAddress, final ChannelPromise channelPromise) {
        return this.field27774.bind(socketAddress, channelPromise);
    }
    
    public ChannelFuture connect(final SocketAddress socketAddress, final ChannelPromise channelPromise) {
        return this.field27774.connect(socketAddress, channelPromise);
    }
    
    public ChannelFuture connect(final SocketAddress socketAddress, final SocketAddress socketAddress2, final ChannelPromise channelPromise) {
        return this.field27774.connect(socketAddress, socketAddress2, channelPromise);
    }
    
    public ChannelFuture disconnect(final ChannelPromise channelPromise) {
        return this.field27774.disconnect(channelPromise);
    }
    
    public ChannelFuture close(final ChannelPromise channelPromise) {
        return this.field27774.close(channelPromise);
    }
    
    public ChannelFuture deregister(final ChannelPromise channelPromise) {
        return this.field27774.deregister(channelPromise);
    }
    
    public ChannelHandlerContext read() {
        this.field27774.read();
        return (ChannelHandlerContext)this;
    }
    
    public ChannelFuture write(final Object o) {
        if (o instanceof ByteBuf && this.method21872((ByteBuf)o)) {
            return this.field27774.newFailedFuture(new Throwable());
        }
        return this.field27774.write(o);
    }
    
    public ChannelFuture write(final Object o, final ChannelPromise channelPromise) {
        if (o instanceof ByteBuf && this.method21872((ByteBuf)o)) {
            return this.field27774.newFailedFuture(new Throwable());
        }
        return this.field27774.write(o, channelPromise);
    }
    
    public boolean method21872(final ByteBuf byteBuf) {
        try {
            this.field27775.method33412(byteBuf);
            return false;
        }
        catch (final Exception ex) {
            try {
                this.field27775.method33413(this.field27774, ex);
            }
            catch (final Exception ex2) {
                this.field27774.fireExceptionCaught((Throwable)ex2);
            }
            return true;
        }
    }
    
    public ChannelHandlerContext flush() {
        this.field27774.flush();
        return (ChannelHandlerContext)this;
    }
    
    public ChannelFuture writeAndFlush(final Object o, final ChannelPromise channelPromise) {
        final ChannelFuture write = this.write(o, channelPromise);
        this.flush();
        return write;
    }
    
    public ChannelFuture writeAndFlush(final Object o) {
        final ChannelFuture write = this.write(o);
        this.flush();
        return write;
    }
    
    public ChannelPipeline pipeline() {
        return this.field27774.pipeline();
    }
    
    public ByteBufAllocator alloc() {
        return this.field27774.alloc();
    }
    
    public ChannelPromise newPromise() {
        return this.field27774.newPromise();
    }
    
    public ChannelProgressivePromise newProgressivePromise() {
        return this.field27774.newProgressivePromise();
    }
    
    public ChannelFuture newSucceededFuture() {
        return this.field27774.newSucceededFuture();
    }
    
    public ChannelFuture newFailedFuture(final Throwable t) {
        return this.field27774.newFailedFuture(t);
    }
    
    public ChannelPromise voidPromise() {
        return this.field27774.voidPromise();
    }
    
    public <T> Attribute<T> attr(final AttributeKey<T> attributeKey) {
        return (Attribute<T>)this.field27774.attr((AttributeKey)attributeKey);
    }
    
    public <T> boolean hasAttr(final AttributeKey<T> attributeKey) {
        return false;
    }
}
