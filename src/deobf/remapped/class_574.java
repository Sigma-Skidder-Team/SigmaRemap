package remapped;

import io.netty.buffer.ByteBuf;

public class class_574 extends class_8039<Float> implements class_7305<Float> {
   public class_574() {
      super(Float.class);
   }

   public float method_2740(ByteBuf var1) {
      return var1.readFloat();
   }

   public void method_2738(ByteBuf var1, float var2) {
      var1.writeFloat(var2);
   }

   @Deprecated
   public Float method_2742(ByteBuf var1) {
      return var1.readFloat();
   }

   @Deprecated
   public void method_2739(ByteBuf var1, Float var2) {
      var1.writeFloat(var2);
   }

   public Float method_2741(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Float)var1 : !(Boolean)var1 ? 0.0F : 1.0F;
      } else {
         return ((Number)var1).floatValue();
      }
   }
}
