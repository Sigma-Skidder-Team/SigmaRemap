package mapped;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6393 extends ChannelInboundHandlerAdapter {
   private static final Logger field27981 = LogManager.getLogger();
   private final Class9021 field27982;

   public Class6393(Class9021 var1) {
      this.field27982 = var1;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) throws Exception {
      ByteBuf var5 = (ByteBuf)var2;
      var5.markReaderIndex();
      boolean var6 = true;

      try {
         if (var5.readUnsignedByte() == 254) {
            InetSocketAddress var7 = (InetSocketAddress)var1.channel().remoteAddress();
            MinecraftServer var8 = this.field27982.method33402();
            int var9 = var5.readableBytes();
            switch (var9) {
               case 0:
                  field27981.debug("Ping: (<1.3.x) from {}:{}", var7.getAddress(), var7.getPort());
                  String var10 = String.format("%s§%d§%d", var8.method1362(), var8.method1322(), var8.method1323());
                  this.method19427(var1, this.method19428(var10));
                  break;
               case 1:
                  if (var5.readUnsignedByte() != 1) {
                     return;
                  }

                  field27981.debug("Ping: (1.4-1.5.x) from {}:{}", var7.getAddress(), var7.getPort());
                  String var11 = String.format(
                     "§1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, var8.method1321(), var8.method1362(), var8.method1322(), var8.method1323()
                  );
                  this.method19427(var1, this.method19428(var11));
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

                  field27981.debug("Ping: (1.6) from {}:{}", var7.getAddress(), var7.getPort());
                  String var14 = String.format(
                     "§1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, var8.method1321(), var8.method1362(), var8.method1322(), var8.method1323()
                  );
                  ByteBuf var15 = this.method19428(var14);

                  try {
                     this.method19427(var1, var15);
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

   private void method19427(ChannelHandlerContext var1, ByteBuf var2) {
      var1.pipeline().firstContext().writeAndFlush(var2).addListener(ChannelFutureListener.CLOSE);
   }

   private ByteBuf method19428(String var1) {
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
