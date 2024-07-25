package remapped;

public class class_4735 implements class_857 {
   public class_4735(class_3393 var1) {
      this.field_22946 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      byte var4 = var1.<Byte>method_23248(class_8039.field_41133, 0);
      if (var4 == 0 || var4 == 2) {
         var1.<String>method_23261(class_8039.field_41171);
         var1.<String>method_23261(class_8039.field_41171);
         var1.<String>method_23261(class_8039.field_41171);
         var1.<Byte>method_23261(class_8039.field_41133);
         var1.<String>method_23261(class_8039.field_41171);
         var1.method_23236(class_8039.field_41171, !class_3446.method_15884().method_25831() ? "" : "never");
         var1.<Byte>method_23261(class_8039.field_41133);
      }

      if (var4 == 0 || var4 == 3 || var4 == 4) {
         String[] var5 = var1.<String[]>method_23261(class_8039.field_41152);
         class_1189 var6 = var1.method_23255().<class_1189>method_6746(class_1189.class);
         String var7 = var1.method_23255().method_6744().method_17602();
         String var8 = var1.<String>method_23248(class_8039.field_41171, 0);

         for (String var12 : var5) {
            if (var6.method_5266() && var12.equalsIgnoreCase(var7)) {
               if (var4 != 4) {
                  var6.method_5263(false, true);
                  var6.method_5247(var8);
               } else {
                  var1.method_23235(class_6890.class, true, true);
                  var1.method_23245();
                  var6.method_5263(true, true);
                  var6.method_5247("viaversion");
               }
            }
         }
      }

      if (var4 == 1) {
         class_1189 var13 = var1.method_23255().<class_1189>method_6746(class_1189.class);
         String var14 = var1.<String>method_23248(class_8039.field_41171, 0);
         if (var13.method_5266() && var14.equals(var13.method_5248())) {
            var1.method_23235(class_6890.class, true, true);
            var1.method_23245();
            var13.method_5263(true, true);
            var13.method_5247("viaversion");
         }
      }
   }
}
