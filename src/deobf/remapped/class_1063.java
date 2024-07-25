package remapped;

import io.netty.buffer.ByteBuf;

public abstract class class_1063 extends class_6172 {
   public class_5407 method_4668(ByteBuf var1) throws Exception {
      short var4 = var1.readUnsignedByte();
      if (var4 != 255) {
         class_5700 var5 = this.method_4666(var1.readByte());
         return new class_5407(var4, var5, var5.method_25777().method_9912(var1));
      } else {
         return null;
      }
   }

   public abstract class_5700 method_4666(int var1);

   public void method_4667(ByteBuf var1, class_5407 var2) throws Exception {
      if (var2 != null) {
         var1.writeByte(var2.method_24602());
         class_5700 var5 = var2.method_24603();
         var1.writeByte(var5.method_25778());
         var5.method_25777().method_33275(var1, var2.method_24609());
      } else {
         var1.writeByte(255);
      }
   }
}
