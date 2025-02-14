package mapped;

import com.mojang.blaze3d.systems.RenderSystem;

public class Class4517 extends Class4510 {
   private final String field21789;
   private final int field21790;

   public Class4517(String var1, int var2) {
      super("depth_test", () -> {
         if (var2 != 519) {
            RenderSystem.enableDepthTest();
            RenderSystem.depthFunc(var2);
         }
      }, () -> {
         if (var2 != 519) {
            RenderSystem.disableDepthTest();
            RenderSystem.depthFunc(515);
         }
      });
      this.field21789 = var1;
      this.field21790 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class4517 var4 = (Class4517)var1;
            return this.field21790 == var4.field21790;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.field21790);
   }

   @Override
   public String toString() {
      return this.field21734 + '[' + this.field21789 + ']';
   }
}
