package net.minecraft.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import mapped.Class9382;

import java.util.List;
import javax.crypto.Cipher;

public class NettyEncryptingDecoder extends MessageToMessageDecoder<ByteBuf> {
   private static String[] field30345;
   private final Class9382 field30346;

   public NettyEncryptingDecoder(Cipher var1) {
      this.field30346 = new Class9382(var1);
   }

   public void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      var3.add(this.field30346.method35608(var1, var2));
   }
}
