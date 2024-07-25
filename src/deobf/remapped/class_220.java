package remapped;

public class class_220 extends class_7157 {
   private static String[] field_724;

   public class_220(Identifier var1) {
      super(var1);
   }

   public boolean method_938(class_6946 var1, class_6486 var2) {
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;

      for (int var9 = 0; var9 < var1.method_31505(); var9++) {
         class_6098 var10 = var1.method_31498(var9);
         if (!var10.method_28022()) {
            if (var10.method_27960() == class_4783.field_23729.method_10803() && !var7) {
               var7 = true;
            } else if (var10.method_27960() == class_4783.field_23594.method_10803() && !var6) {
               var6 = true;
            } else if (var10.method_27960().method_11250(class_391.field_1644) && !var5) {
               var5 = true;
            } else {
               if (var10.method_27960() != class_4897.field_24454 || var8) {
                  return false;
               }

               var8 = true;
            }
         }
      }

      return var5 && var7 && var6 && var8;
   }

   public class_6098 method_937(class_6946 var1) {
      class_6098 var4 = class_6098.field_31203;

      for (int var5 = 0; var5 < var1.method_31505(); var5++) {
         class_6098 var6 = var1.method_31498(var5);
         if (!var6.method_28022() && var6.method_27960().method_11250(class_391.field_1644)) {
            var4 = var6;
            break;
         }
      }

      class_6098 var8 = new class_6098(class_4897.field_24846, 1);
      if (var4.method_27960() instanceof class_6201 && ((class_6201)var4.method_27960()).method_28392() instanceof class_8543) {
         class_8543 var9 = (class_8543)((class_6201)var4.method_27960()).method_28392();
         class_1425 var7 = var9.method_39321();
         class_4699.method_21671(var8, var7, var9.method_39322());
      }

      return var8;
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 >= 2 && var2 >= 2;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14721;
   }
}
