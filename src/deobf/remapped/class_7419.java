package remapped;

import io.netty.buffer.ByteBuf;

public class class_7419 extends class_8039<Long> implements class_7305<Long> {
   public class_7419() {
      super(Long.class);
   }

   public Long method_33802(ByteBuf var1) {
      return var1.readLong();
   }

   public void method_33800(ByteBuf var1, Long var2) {
      var1.writeLong(var2);
   }

   public Long method_33801(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Long)var1 : !(Boolean)var1 ? 0L : 1L;
      } else {
         return ((Number)var1).longValue();
      }
   }
}
