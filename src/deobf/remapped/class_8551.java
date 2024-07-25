package remapped;

import java.util.List;

public class class_8551 extends class_691 {
   private static String[] field_43754;
   public static final class_6720 field_43752 = class_6023.field_30696;
   private final class_6288 field_43753;

   public class_8551(class_6288 var1, class_3073 var2) {
      super(var2);
      this.method_29284(this.field_32751.method_36446().method_10308(field_43752, Boolean.valueOf(false)));
      this.field_43753 = var1;
   }

   @Override
   public int method_3119(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_43752) ? 0 : 15;
   }

   @Override
   public class_2522 method_3116(class_2522 var1, int var2) {
      return var1.method_10308(field_43752, Boolean.valueOf(var2 > 0));
   }

   @Override
   public void method_3117(class_9379 var1, BlockPos var2) {
      if (this.field_11820 != class_5371.field_27441 && this.field_11820 != class_5371.field_27389) {
         var1.method_43359((class_704)null, var2, class_463.field_2900, class_562.field_3322, 0.3F, 0.6F);
      } else {
         var1.method_43359((class_704)null, var2, class_463.field_2506, class_562.field_3322, 0.3F, 0.8F);
      }
   }

   @Override
   public void method_3120(class_9379 var1, BlockPos var2) {
      if (this.field_11820 != class_5371.field_27441 && this.field_11820 != class_5371.field_27389) {
         var1.method_43359((class_704)null, var2, class_463.field_2855, class_562.field_3322, 0.3F, 0.5F);
      } else {
         var1.method_43359((class_704)null, var2, class_463.field_2411, class_562.field_3322, 0.3F, 0.7F);
      }
   }

   @Override
   public int method_3122(World var1, BlockPos var2) {
      Box var5 = field_3798.method_18919(var2);
      List var6;
      switch (this.field_43753) {
         case field_32138:
            var6 = var1.method_25870((Entity)null, var5);
            break;
         case field_32140:
            var6 = var1.<class_5834>method_25868(class_5834.class, var5);
            break;
         default:
            return 0;
      }

      if (!var6.isEmpty()) {
         for (Entity var8 : var6) {
            if (!var8.method_37276()) {
               return 15;
            }
         }
      }

      return 0;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_43752);
   }
}
