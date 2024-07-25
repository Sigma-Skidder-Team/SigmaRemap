package remapped;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_616 extends ChannelInboundHandlerAdapter {
   private static final Logger field_3499 = LogManager.getLogger();
   private final class_6712 field_3498;

   public class_616(class_6712 var1) {
      this.field_3498 = var1;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) throws Exception {
      ByteBuf var5 = (ByteBuf)var2;
      var5.markReaderIndex();
      boolean var6 = true;

      try {
         if (var5.readUnsignedByte() == 254) {
            InetSocketAddress var7 = (InetSocketAddress)var1.channel().remoteAddress();
            class_341 var8 = this.field_3498.method_30820();
            int var9 = var5.readableBytes();
            switch (var9) {
               case 0:
                  field_3499.debug("Ping: (<1.3.x) from {}:{}", var7.getAddress(), var7.getPort());
                  String var10 = String.format("%s§%d§%d", var8.method_1748(), var8.method_1656(), var8.method_1732());
                  this.method_2878(var1, this.method_2877(var10));
                  break;
               case 1:
                  if (var5.readUnsignedByte() != 1) {
                     return;
                  }

                  field_3499.debug("Ping: (1.4-1.5.x) from {}:{}", var7.getAddress(), var7.getPort());
                  String var11 = String.format(
                     "§1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, var8.method_1603(), var8.method_1748(), var8.method_1656(), var8.method_1732()
                  );
                  this.method_2878(var1, this.method_2877(var11));
                  break;
               default:
                  boolean var12 = var5.readUnsignedByte() == 1;
                  var12 &= var5.readUnsignedByte() == 250;
                  var12 &= "MC|PingHost".equals(new String(var5.readBytes(var5.readShort() * 2).array(), StandardCharsets.UTF_16BE));
                  int var13 = var5.readUnsignedShort();
                  var12 &= var5.readUnsignedByte() >= 73;
                  var12 &= 3 + var5.readBytes(var5.readShort() * 2).array().length + 4 == var13;
                  var12 &= var5.readInt() <= 65535;
                  var12 &= var5.readableBytes() == 0;
                  if (!var12) {
                     return;
                  }

                  field_3499.debug("Ping: (1.6) from {}:{}", var7.getAddress(), var7.getPort());
                  String var14 = String.format(
                     "§1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, var8.method_1603(), var8.method_1748(), var8.method_1656(), var8.method_1732()
                  );
                  ByteBuf var15 = this.method_2877(var14);

                  try {
                     this.method_2878(var1, var15);
                  } finally {
                     var15.release();
                  }
            }

            var5.release();
            var6 = false;
         }
      } catch (RuntimeException var25) {
      } finally {
         if (var6) {
            var5.resetReaderIndex();
            var1.channel().pipeline().remove("legacy_query");
            var1.fireChannelRead(var2);
         }
      }
   }

   private void method_2878(ChannelHandlerContext var1, ByteBuf var2) {
      var1.pipeline().firstContext().writeAndFlush(var2).addListener(ChannelFutureListener.CLOSE);
   }

   private ByteBuf method_2877(String var1) {
      ByteBuf var4 = Unpooled.buffer();
      var4.writeByte(255);
      char[] var5 = var1.toCharArray();
      var4.writeShort(var5.length);

      for (char var9 : var5) {
         var4.writeChar(var9);
      }

      return var4;
   }
}
