package remapped;

import io.netty.buffer.ByteBuf;

public class class_1483 extends class_8039<Integer> implements class_7305<Integer> {
   public class_1483() {
      super(Integer.class);
   }

   public Integer method_6833(ByteBuf var1) {
      return var1.readInt();
   }

   public void method_6831(ByteBuf var1, Integer var2) {
      var1.writeInt(var2);
   }

   public Integer method_6832(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Integer)var1 : !(Boolean)var1 ? 0 : 1;
      } else {
         return ((Number)var1).intValue();
      }
   }
}
