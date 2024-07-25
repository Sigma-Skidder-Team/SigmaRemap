package remapped;

import io.netty.buffer.ByteBuf;

public class class_4185 extends class_7050 {
   public class_4185() {
      super("Item");
   }

   public class_9530 method_19466(ByteBuf var1) throws Exception {
      short var4 = var1.readShort();
      if (var4 >= 0) {
         class_9530 var5 = new class_9530();
         var5.method_43965(var4);
         var5.method_43961(var1.readByte());
         var5.method_43966(var1.readShort());
         var5.method_43960(class_8039.field_41158.method_9912(var1));
         return var5;
      } else {
         return null;
      }
   }

   public void method_19465(ByteBuf var1, class_9530 var2) throws Exception {
      if (var2 != null) {
         var1.writeShort(var2.method_43963());
         var1.writeByte(var2.method_43967());
         var1.writeShort(var2.method_43962());
         class_8039.field_41158.method_33275(var1, var2.method_43959());
      } else {
         var1.writeShort(-1);
      }
   }
}
