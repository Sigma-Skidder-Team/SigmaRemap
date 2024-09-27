package mapped;

import io.netty.buffer.ByteBuf;
import java.nio.ByteOrder;

public class Class4793 extends BruhMotha<Class8225> {
   public Class4793() {
      super("Chunk Section Type", Class8225.class);
   }

   public Class8225 method14894(ByteBuf var1) throws Exception {
      Class8225 var4 = new Class8225();
      var4.method28635(0);
      ByteBuf var5 = var1.order(ByteOrder.LITTLE_ENDIAN);

      for (int var6 = 0; var6 < 4096; var6++) {
         short var7 = var5.readShort();
         int var8 = var7 >> 4;
         int var9 = var7 & 15;
         var4.method28628(var6, var8, var9);
      }

      return var4;
   }

   public void method14895(ByteBuf var1, Class8225 var2) throws Exception {
      throw new UnsupportedOperationException();
   }
}
