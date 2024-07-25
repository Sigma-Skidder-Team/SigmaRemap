package remapped;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;

public class class_5466 extends class_8039<byte[]> {
   public class_5466() {
      super(byte[].class);
   }

   public void method_24864(ByteBuf var1, byte[] var2) throws Exception {
      class_8039.field_41157.method_15644(var1, var2.length);
      var1.writeBytes(var2);
   }

   public byte[] method_24865(ByteBuf var1) throws Exception {
      int var4 = class_8039.field_41157.method_15647(var1);
      Preconditions.checkArgument(var1.isReadable(var4), "Length is fewer than readable bytes");
      byte[] var5 = new byte[var4];
      var1.readBytes(var5);
      return var5;
   }
}
