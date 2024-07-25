package remapped;

public class class_6553 extends class_7157 {
   public class_6553(class_4639 var1) {
      super(var1);
   }

   public boolean method_29879(class_6946 var1, class_6486 var2) {
      int var5 = 0;
      class_6098 var6 = class_6098.field_31203;

      for (int var7 = 0; var7 < var1.method_31505(); var7++) {
         class_6098 var8 = var1.method_31498(var7);
         if (!var8.method_28022()) {
            if (var8.method_27960() != class_4897.field_24698) {
               if (var8.method_27960() != class_4897.field_24805) {
                  return false;
               }

               var5++;
            } else {
               if (!var6.method_28022()) {
                  return false;
               }

               var6 = var8;
            }
         }
      }

      return !var6.method_28022() && var6.method_28002() && var5 > 0;
   }

   public class_6098 method_29877(class_6946 var1) {
      int var4 = 0;
      class_6098 var5 = class_6098.field_31203;

      for (int var6 = 0; var6 < var1.method_31505(); var6++) {
         class_6098 var7 = var1.method_31498(var6);
         if (!var7.method_28022()) {
            if (var7.method_27960() != class_4897.field_24698) {
               if (var7.method_27960() != class_4897.field_24805) {
                  return class_6098.field_31203;
               }

               var4++;
            } else {
               if (!var5.method_28022()) {
                  return class_6098.field_31203;
               }

               var5 = var7;
            }
         }
      }

      if (!var5.method_28022() && var5.method_28002() && var4 >= 1 && class_1138.method_4992(var5) < 2) {
         class_6098 var8 = new class_6098(class_4897.field_24698, var4);
         class_5734 var9 = var5.method_27990().method_25944();
         var9.method_25931("generation", class_1138.method_4992(var5) + 1);
         var8.method_27965(var9);
         return var8;
      } else {
         return class_6098.field_31203;
      }
   }

   public class_2831<class_6098> method_29878(class_6946 var1) {
      class_2831 var4 = class_2831.<class_6098>method_12872(var1.method_31505(), class_6098.field_31203);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         class_6098 var6 = var1.method_31498(var5);
         if (!var6.method_27960().method_11232()) {
            if (var6.method_27960() instanceof class_1138) {
               class_6098 var7 = var6.method_27973();
               var7.method_28017(1);
               var4.set(var5, var7);
               break;
            }
         } else {
            var4.set(var5, new class_6098(var6.method_27960().method_11241()));
         }
      }

      return var4;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14723;
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 >= 3 && var2 >= 3;
   }
}
