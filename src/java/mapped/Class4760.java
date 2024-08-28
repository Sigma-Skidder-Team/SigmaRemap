package mapped;

import io.netty.buffer.ByteBuf;

public class Class4760 extends Class4750<Float> implements Class4755<Float> {
   public Class4760() {
      super(Float.class);
   }

   public float method14905(ByteBuf var1) {
      return var1.readFloat();
   }

   public void method14906(ByteBuf var1, float var2) {
      var1.writeFloat(var2);
   }

   @Deprecated
   public Float method14894(ByteBuf var1) {
      return var1.readFloat();
   }

   @Deprecated
   public void method14895(ByteBuf var1, Float var2) {
      var1.writeFloat(var2);
   }

   public Float method14904(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Float)var1 : !(Boolean)var1 ? 0.0F : 1.0F;
      } else {
         return ((Number)var1).floatValue();
      }
   }
}
