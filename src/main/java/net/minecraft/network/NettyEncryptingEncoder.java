package net.minecraft.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import mapped.Class9382;

import javax.crypto.Cipher;

public class NettyEncryptingEncoder extends MessageToByteEncoder<ByteBuf> {
   private final Class9382 field43425;

   public NettyEncryptingEncoder(Cipher var1) {
      this.field43425 = new Class9382(var1);
   }

   public void encode(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) throws Exception {
      this.field43425.method35609(var2, var3);
   }
}
