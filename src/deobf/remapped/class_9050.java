package remapped;

import io.netty.buffer.ByteBuf;

public class class_9050 extends class_7050 {
   public class_9050() {
      super("FlatVarIntItem");
   }

   public class_9530 method_41587(ByteBuf var1) throws Exception {
      boolean var4 = var1.readBoolean();
      if (var4) {
         class_9530 var5 = new class_9530();
         var5.method_43965(class_8039.field_41157.method_15647(var1));
         var5.method_43961(var1.readByte());
         var5.method_43960(class_8039.field_41158.method_9912(var1));
         return var5;
      } else {
         return null;
      }
   }

   public void method_41586(ByteBuf var1, class_9530 var2) throws Exception {
      if (var2 != null) {
         var1.writeBoolean(true);
         class_8039.field_41157.method_15644(var1, var2.method_43963());
         var1.writeByte(var2.method_43967());
         class_8039.field_41158.method_33275(var1, var2.method_43959());
      } else {
         var1.writeBoolean(false);
      }
   }
}
