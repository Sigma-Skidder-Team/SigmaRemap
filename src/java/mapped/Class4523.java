package mapped;

public class Class4523 extends Class4510 {
   private final boolean field21828;
   private final boolean field21829;

   public Class4523(boolean var1, boolean var2) {
      super("write_mask_state", () -> {
         if (!var2) {
            RenderSystem.depthMask(var2);
         }

         if (!var1) {
            RenderSystem.method27870(var1, var1, var1, var1);
         }
      }, () -> {
         if (!var2) {
            RenderSystem.depthMask(true);
         }

         if (!var1) {
            RenderSystem.method27870(true, true, true, true);
         }
      });
      this.field21828 = var1;
      this.field21829 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Class4523 var4 = (Class4523)var1;
         return this.field21828 == var4.field21828 && this.field21829 == var4.field21829;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Class8589.method30728(this.field21828, this.field21829);
   }

   @Override
   public String toString() {
      return this.field21734 + "[writeColor=" + this.field21828 + ", writeDepth=" + this.field21829 + ']';
   }
}
