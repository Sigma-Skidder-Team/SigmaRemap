package remapped;

import io.netty.buffer.ByteBuf;

public class class_7893 extends class_6172 {
   private static String[] field_40371;

   public class_5407 method_35690(ByteBuf var1) throws Exception {
      byte var4 = var1.readByte();
      if (var4 != 127) {
         int var5 = (var4 & 224) >> 5;
         class_7616 var6 = class_7616.method_34537(var5);
         int var7 = var4 & 31;
         return new class_5407(var7, var6, var6.method_25777().method_9912(var1));
      } else {
         return null;
      }
   }

   public void method_35689(ByteBuf var1, class_5407 var2) throws Exception {
      byte var5 = (byte)(var2.method_24603().method_25778() << 5 | var2.method_24602() & 31);
      var1.writeByte(var5);
      var2.method_24603().method_25777().method_33275(var1, var2.method_24609());
   }
}
