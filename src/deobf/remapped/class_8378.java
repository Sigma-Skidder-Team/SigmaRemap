package remapped;

import io.netty.buffer.ByteBuf;

public class class_8378 extends class_8039<class_9371> {
   public class_8378() {
      super(class_9371.class);
   }

   public class_9371 method_38620(ByteBuf var1) throws Exception {
      boolean var4 = var1.readBoolean();
      return var4 ? class_8039.field_41137.method_9912(var1) : null;
   }

   public void method_38619(ByteBuf var1, class_9371 var2) throws Exception {
      var1.writeBoolean(var2 != null);
      if (var2 != null) {
         class_8039.field_41137.method_33275(var1, var2);
      }
   }
}
