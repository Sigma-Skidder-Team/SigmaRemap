package remapped;

import io.netty.buffer.ByteBuf;

public class class_994 extends class_8039<Integer> implements class_7305<Integer> {
   public class_994() {
      super(Integer.class);
   }

   public Integer method_4328(ByteBuf var1) {
      return var1.readUnsignedShort();
   }

   public void method_4326(ByteBuf var1, Integer var2) {
      var1.writeShort(var2);
   }

   public Integer method_4327(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Integer)var1 : !(Boolean)var1 ? 0 : 1;
      } else {
         return ((Number)var1).intValue();
      }
   }
}
