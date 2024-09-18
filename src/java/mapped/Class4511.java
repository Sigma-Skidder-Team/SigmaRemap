package mapped;

import com.mojang.blaze3d.systems.RenderSystem;

public class Class4511 extends Class4510 {
   private final float field21784;

   public Class4511(float var1) {
      super("alpha", () -> {
         if (!(var1 > 0.0F)) {
            RenderSystem.method27817();
         } else {
            RenderSystem.disableAlphaTest();
            RenderSystem.method27819(516, var1);
         }
      }, () -> {
         RenderSystem.method27817();
         RenderSystem.method27939();
      });
      this.field21784 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 == null || this.getClass() != var1.getClass()) {
            return false;
         } else {
            return super.equals(var1) ? this.field21784 == ((Class4511)var1).field21784 : false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Class8589.method30726(super.hashCode(), this.field21784);
   }

   @Override
   public String toString() {
      return this.field21734 + '[' + this.field21784 + ']';
   }
}
