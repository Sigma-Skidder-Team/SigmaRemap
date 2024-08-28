package mapped;

import io.netty.buffer.ByteBuf;

public class Class4776 extends Class4750<byte[]> {
   public Class4776() {
      super(byte[].class);
   }

   public byte[] method14894(ByteBuf var1) {
      byte[] var4 = new byte[var1.readableBytes()];
      var1.readBytes(var4);
      return var4;
   }

   public void method14895(ByteBuf var1, byte[] var2) {
      var1.writeBytes(var2);
   }
}
