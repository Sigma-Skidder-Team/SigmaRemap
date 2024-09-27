package mapped;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;

public class Class4777 extends BruhMotha<byte[]> {
   public Class4777() {
      super(byte[].class);
   }

   public void method14895(ByteBuf var1, byte[] var2) throws Exception {
      BruhMotha.field22544.method14908(var1, var2.length);
      var1.writeBytes(var2);
   }

   public byte[] method14894(ByteBuf var1) throws Exception {
      int var4 = BruhMotha.field22544.method14907(var1);
      Preconditions.checkArgument(var1.isReadable(var4), "Length is fewer than readable bytes");
      byte[] var5 = new byte[var4];
      var1.readBytes(var5);
      return var5;
   }
}
