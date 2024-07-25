package remapped;

import java.util.List;

public class class_3136 extends class_2932 {
   private static String[] field_15612;
   public final List<Entity> field_15613;

   public class_3136(List<Entity> var1) {
      this.field_15613 = var1;
   }

   @Override
   public boolean method_13435(class_7047 var1) {
      for (Entity var5 : this.field_15613) {
         if (var5.method_37274(var1.method_32363()) < 5.0) {
            return true;
         }
      }

      return false;
   }

   @Override
   public double method_13436(class_7047 var1) {
      double var4 = 0.0;

      for (Entity var7 : this.field_15613) {
         double var8 = var7.method_37274(var1.method_32363());
         if (var8 < var4) {
            var4 = var8;
         }
      }

      return var4;
   }
}
