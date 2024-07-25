package remapped;

import io.netty.buffer.ByteBuf;

public class class_6228 extends class_8039<Boolean> implements class_7305<Boolean> {
   public class_6228() {
      super(Boolean.class);
   }

   public Boolean method_28457(ByteBuf var1) {
      return var1.readBoolean();
   }

   public void method_28455(ByteBuf var1, Boolean var2) {
      var1.writeBoolean(var2);
   }

   public Boolean method_28456(Object var1) {
      return !(var1 instanceof Number) ? (Boolean)var1 : ((Number)var1).intValue() == 1;
   }
}
