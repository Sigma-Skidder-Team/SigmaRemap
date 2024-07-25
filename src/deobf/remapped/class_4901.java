package remapped;

public class class_4901 extends class_958 {
   private static String[] field_25334;

   private class_4901(class_8829 var1) {
      super(var1, null);
      this.field_25333 = var1;
   }

   @Override
   public boolean method_4213() {
      if (class_8829.method_40557(this.field_25333) < 10) {
         return class_8829.method_40552(this.field_25333).nextFloat() < 0.3F
            ? false
            : this.field_25333.method_40592() && class_8829.method_40604(this.field_25333);
      } else {
         return false;
      }
   }

   @Override
   public boolean method_4214() {
      return this.method_4213();
   }

   @Override
   public void method_16794() {
      if (class_8829.method_40601(this.field_25333).nextInt(30) == 0) {
         for (int var3 = 1; var3 <= 2; var3++) {
            class_1331 var4 = this.field_25333.method_37075().method_6101(var3);
            class_2522 var5 = this.field_25333.field_41768.method_28262(var4);
            class_6414 var6 = var5.method_8360();
            boolean var7 = false;
            class_7044 var8 = null;
            if (var6.method_29299(class_2351.field_11750)) {
               if (!(var6 instanceof class_8557)) {
                  if (!(var6 instanceof class_8138)) {
                     if (var6 == class_4783.field_23637) {
                        int var9 = var5.<Integer>method_10313(class_7086.field_36577);
                        if (var9 < 3) {
                           var7 = true;
                           var8 = class_7086.field_36577;
                        }
                     }
                  } else {
                     int var10 = var5.<Integer>method_10313(class_8138.field_41679);
                     if (var10 < 7) {
                        var7 = true;
                        var8 = class_8138.field_41679;
                     }
                  }
               } else {
                  class_8557 var11 = (class_8557)var6;
                  if (!var11.method_39383(var5)) {
                     var7 = true;
                     var8 = var11.method_39380();
                  }
               }

               if (var7) {
                  this.field_25333.field_41768.method_43364(2005, var4, 0);
                  this.field_25333.field_41768.method_29594(var4, var5.method_10308(var8, Integer.valueOf(var5.<Integer>method_10313(var8) + 1)));
                  class_8829.method_40595(this.field_25333);
               }
            }
         }
      }
   }
}
