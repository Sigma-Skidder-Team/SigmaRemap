package remapped;

import java.util.Random;

public class class_8870 extends class_4285<class_1941> {
   private static String[] field_45349;
   public static final class_1331 field_45348 = class_1331.field_7306;
   private final boolean field_45350;

   public class_8870(boolean var1) {
      super(class_1941.field_9913);
      this.field_45350 = var1;
   }

   public boolean method_40805(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_1941 var5) {
      for (class_1331 var9 : class_1331.method_6076(
         new class_1331(var4.method_12173() - 4, var4.method_12165() - 1, var4.method_12185() - 4),
         new class_1331(var4.method_12173() + 4, var4.method_12165() + 32, var4.method_12185() + 4)
      )) {
         boolean var10 = var9.method_12171(var4, 2.5);
         if (var10 || var9.method_12171(var4, 3.5)) {
            if (var9.method_12165() >= var4.method_12165()) {
               if (var9.method_12165() <= var4.method_12165()) {
                  if (var10) {
                     if (!this.field_45350) {
                        this.method_19906(var1, new class_1331(var9), class_4783.field_23184.method_29260());
                     } else {
                        this.method_19906(var1, new class_1331(var9), class_4783.field_23258.method_29260());
                     }
                  } else {
                     this.method_19906(var1, var9, class_4783.field_23433.method_29260());
                  }
               } else {
                  this.method_19906(var1, var9, class_4783.field_23184.method_29260());
               }
            } else if (!var10) {
               if (var9.method_12165() < var4.method_12165()) {
                  this.method_19906(var1, var9, class_4783.field_23894.method_29260());
               }
            } else {
               this.method_19906(var1, var9, class_4783.field_23433.method_29260());
            }
         }
      }

      for (int var11 = 0; var11 < 4; var11++) {
         this.method_19906(var1, var4.method_6082(var11), class_4783.field_23433.method_29260());
      }

      class_1331 var12 = var4.method_6082(2);

      for (Direction var14 : class_9594.field_48893) {
         this.method_19906(var1, var12.method_6098(var14), class_4783.field_23740.method_29260().method_10308(class_2634.field_12970, var14));
      }

      return true;
   }
}