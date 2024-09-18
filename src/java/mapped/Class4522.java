package mapped;

import com.mojang.blaze3d.systems.RenderSystem;

public class Class4522 extends Class4510 {
   private final boolean field21827;

   public Class4522(boolean var1) {
      super("shade_model", () -> RenderSystem.method27866(!var1 ? 7424 : 7425), () -> RenderSystem.method27866(7424));
      this.field21827 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class4522 var4 = (Class4522)var1;
            return this.field21827 == var4.field21827;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Boolean.hashCode(this.field21827);
   }

   @Override
   public String toString() {
      return this.field21734 + '[' + (!this.field21827 ? "flat" : "smooth") + ']';
   }
}
