package remapped;

import java.util.EnumSet;
import java.util.function.Predicate;

public class class_6837<T extends class_5834> extends class_3599 {
   private static String[] field_35254;
   public final class_4612 field_35261;
   private final double field_35256;
   private final double field_35255;
   public T field_35258;
   public final float field_35250;
   public class_3998 field_35253;
   public final class_1249 field_35257;
   public final Class<T> field_35259;
   public final Predicate<class_5834> field_35251;
   public final Predicate<class_5834> field_35252;
   private final class_4931 field_35260;

   public class_6837(class_4612 var1, Class<T> var2, float var3, double var4, double var6) {
      this(var1, var2, var0 -> true, var3, var4, var6, class_3572.field_17479::test);
   }

   public class_6837(class_4612 var1, Class<T> var2, Predicate<class_5834> var3, float var4, double var5, double var7, Predicate<class_5834> var9) {
      this.field_35261 = var1;
      this.field_35259 = var2;
      this.field_35251 = var3;
      this.field_35250 = var4;
      this.field_35256 = var5;
      this.field_35255 = var7;
      this.field_35252 = var9;
      this.field_35257 = var1.method_26927();
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564));
      this.field_35260 = new class_4931().method_22607((double)var4).method_22606(var9.and(var3));
   }

   public class_6837(class_4612 var1, Class<T> var2, float var3, double var4, double var6, Predicate<class_5834> var8) {
      this(var1, var2, var0 -> true, var3, var4, var6, var8);
   }

   @Override
   public boolean method_16795() {
      this.field_35258 = this.field_35261
         .world
         .<T>method_25872(
            this.field_35259,
            this.field_35260,
            this.field_35261,
            this.field_35261.method_37302(),
            this.field_35261.method_37309(),
            this.field_35261.method_37156(),
            this.field_35261.method_37241().method_18899((double)this.field_35250, 3.0, (double)this.field_35250)
         );
      if (this.field_35258 != null) {
         class_1343 var3 = class_3425.method_15835(this.field_35261, 16, 7, this.field_35258.method_37245());
         if (var3 != null) {
            if (!(this.field_35258.method_37273(var3.field_7336, var3.field_7333, var3.field_7334) < this.field_35258.method_37275(this.field_35261))) {
               this.field_35253 = this.field_35257.method_5614(var3.field_7336, var3.field_7333, var3.field_7334, 0);
               return this.field_35253 != null;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return !this.field_35257.method_5591();
   }

   @Override
   public void method_16796() {
      this.field_35257.method_5607(this.field_35253, this.field_35256);
   }

   @Override
   public void method_16793() {
      this.field_35258 = null;
   }

   @Override
   public void method_16794() {
      if (!(this.field_35261.method_37275(this.field_35258) < 49.0)) {
         this.field_35261.method_26927().method_5600(this.field_35256);
      } else {
         this.field_35261.method_26927().method_5600(this.field_35255);
      }
   }
}
