package mapped;

import net.minecraft.entity.Entity;

import java.util.List;

public class Class7862 extends Class7859 {
   private static String[] field33673;
   public final List<Entity> field33674;

   public Class7862(List<Entity> var1) {
      this.field33674 = var1;
   }

   @Override
   public boolean method26354(Class9110 var1) {
      for (Entity var5 : this.field33674) {
         if (var5.method3278(var1.method33972()) < 5.0) {
            return true;
         }
      }

      return false;
   }

   @Override
   public double method26355(Class9110 var1) {
      double var4 = 0.0;

      for (Entity var7 : this.field33674) {
         double var8 = var7.method3278(var1.method33972());
         if (var8 < var4) {
            var4 = var8;
         }
      }

      return var4;
   }
}
