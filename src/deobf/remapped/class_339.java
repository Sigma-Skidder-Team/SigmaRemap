package remapped;

import io.netty.buffer.ByteBuf;
import java.nio.ByteOrder;

public class class_339 extends class_8039<class_3929> {
   public class_339() {
      super("Chunk Section Type", class_3929.class);
   }

   public class_3929 method_1572(ByteBuf var1) throws Exception {
      class_3929 var4 = new class_3929();
      var4.method_18187(0);
      ByteBuf var5 = var1.order(ByteOrder.LITTLE_ENDIAN);

      for (int var6 = 0; var6 < 4096; var6++) {
         short var7 = var5.readShort();
         int var8 = var7 >> 4;
         int var9 = var7 & 15;
         var4.method_18189(var6, var8, var9);
      }

      return var4;
   }

   public void method_1571(ByteBuf var1, class_3929 var2) throws Exception {
      throw new UnsupportedOperationException();
   }
}
