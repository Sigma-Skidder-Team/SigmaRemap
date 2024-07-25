package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_1936 extends class_6414 {
   private static String[] field_9895;
   public static final class_6720 field_9896 = class_8601.field_44047;

   public class_1936(class_3073 var1) {
      super(var1);
      this.method_29284(this.method_29260().method_10308(field_9896, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_9896, Boolean.valueOf(var1.method_21862().method_29576(var1.method_21858())));
   }

   @Override
   public void method_10801(class_2522 var1, class_6486 var2, class_1331 var3, class_6414 var4, class_1331 var5, boolean var6) {
      if (!var2.field_33055) {
         boolean var9 = var1.<Boolean>method_10313(field_9896);
         if (var9 != var2.method_29576(var3)) {
            if (!var9) {
               var2.method_7513(var3, var1.method_10317(field_9896), 2);
            } else {
               var2.method_43367().method_14011(var3, this, 4);
            }
         }
      }
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (var1.<Boolean>method_10313(field_9896) && !var2.method_29576(var3)) {
         var2.method_7513(var3, var1.method_10317(field_9896), 2);
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_9896);
   }
}
