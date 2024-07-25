package remapped;

import io.netty.buffer.ByteBuf;

public class class_5742 extends class_8039<byte[]> {
   public class_5742() {
      super(byte[].class);
   }

   public byte[] method_25990(ByteBuf var1) {
      byte[] var4 = new byte[var1.readableBytes()];
      var1.readBytes(var4);
      return var4;
   }

   public void method_25989(ByteBuf var1, byte[] var2) {
      var1.writeBytes(var2);
   }
}
