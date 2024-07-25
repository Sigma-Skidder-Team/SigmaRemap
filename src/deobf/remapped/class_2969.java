package remapped;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import java.util.zip.Inflater;

public class class_2969 extends ByteToMessageDecoder {
   private final Inflater field_14609;
   private int field_14607;

   public class_2969(int var1) {
      this.field_14607 = var1;
      this.field_14609 = new Inflater();
   }

   public void decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception {
      if (var2.readableBytes() != 0) {
         class_8248 var6 = new class_8248(var2);
         int var7 = var6.method_37778();
         if (var7 != 0) {
            if (var7 < this.field_14607) {
               throw new DecoderException("Badly compressed packet - size of " + var7 + " is below server threshold of " + this.field_14607);
            }

            if (var7 > 2097152) {
               throw new DecoderException("Badly compressed packet - size of " + var7 + " is larger than protocol maximum of " + 2097152);
            }

            byte[] var8 = new byte[var6.readableBytes()];
            var6.readBytes(var8);
            this.field_14609.setInput(var8);
            byte[] var9 = new byte[var7];
            this.field_14609.inflate(var9);
            var3.add(Unpooled.wrappedBuffer(var9));
            this.field_14609.reset();
         } else {
            var3.add(var6.readBytes(var6.readableBytes()));
         }
      }
   }

   public void method_13574(int var1) {
      this.field_14607 = var1;
   }
}
