package remapped;

import java.util.Map;
import java.util.Map.Entry;

public class class_9487 {
   private static String[] field_48349;
   public final class_2426 field_48352;
   public final class_2426 field_48350;
   public final Map<class_240, class_7300> field_48353;
   public final class_1868 field_48351;
   public final boolean field_48348;

   public class_9487(class_2426 var1, class_2426 var2, Map<class_240, class_7300> var3, class_1868 var4, boolean var5) {
      this.field_48352 = var1;
      this.field_48350 = var2;
      this.field_48353 = var3;
      this.field_48351 = var4;
      this.field_48348 = var5;
      this.method_43823();
   }

   private void method_43823() {
      for (Entry var4 : this.field_48353.entrySet()) {
         float[] var5 = this.method_43822((class_240)var4.getKey());
         ((class_7300)var4.getValue()).field_37314.method_45506(var5);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private float[] method_43822(class_240 var1) {
      switch (var1) {
         case field_802:
            return new float[]{
               this.field_48352.method_11057(),
               16.0F - this.field_48350.method_11055(),
               this.field_48350.method_11057(),
               16.0F - this.field_48352.method_11055()
            };
         case field_817:
            return new float[]{
               this.field_48352.method_11057(), this.field_48352.method_11055(), this.field_48350.method_11057(), this.field_48350.method_11055()
            };
         case field_818:
         default:
            return new float[]{
               16.0F - this.field_48350.method_11057(),
               16.0F - this.field_48350.method_11061(),
               16.0F - this.field_48352.method_11057(),
               16.0F - this.field_48352.method_11061()
            };
         case field_800:
            return new float[]{
               this.field_48352.method_11057(),
               16.0F - this.field_48350.method_11061(),
               this.field_48350.method_11057(),
               16.0F - this.field_48352.method_11061()
            };
         case field_809:
            return new float[]{
               this.field_48352.method_11055(),
               16.0F - this.field_48350.method_11061(),
               this.field_48350.method_11055(),
               16.0F - this.field_48352.method_11061()
            };
         case field_804:
            return new float[]{
               16.0F - this.field_48350.method_11055(),
               16.0F - this.field_48350.method_11061(),
               16.0F - this.field_48352.method_11055(),
               16.0F - this.field_48352.method_11061()
            };
      }
   }
}
