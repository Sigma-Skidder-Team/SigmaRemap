package remapped;

import java.util.Map;
import java.util.Map.Entry;

public class class_8267 extends class_7934 {
   private static String[] field_42416;

   public class_8267(class_1039 var1, class_6867 var2, int var3, int var4, int var5, class_9210 var6) {
      super(var2, var3, var4, var5);
      this.field_42415 = var1;
      this.field_42414 = var6;
   }

   @Override
   public boolean method_35889(class_6098 var1) {
      return false;
   }

   @Override
   public class_6098 method_35892(class_704 var1, class_6098 var2) {
      this.field_42414
         .method_42533(
            (var1x, var2x) -> {
               int var5 = this.method_38116(var1x);

               while (var5 > 0) {
                  int var6 = class_5614.method_25476(var5);
                  var5 -= var6;
                  var1x.method_7509(
                     new class_5614(var1x, (double)var2x.method_12173(), (double)var2x.method_12165() + 0.5, (double)var2x.method_12185() + 0.5, var6)
                  );
               }

               var1x.method_43364(1042, var2x, 0);
            }
         );
      class_1039.method_4598(this.field_42415).method_31503(0, class_6098.field_31203);
      class_1039.method_4598(this.field_42415).method_31503(1, class_6098.field_31203);
      return var2;
   }

   private int method_38116(World var1) {
      int var4 = 0;
      var4 += this.method_38117(class_1039.method_4598(this.field_42415).method_31498(0));
      var4 += this.method_38117(class_1039.method_4598(this.field_42415).method_31498(1));
      if (var4 <= 0) {
         return 0;
      } else {
         int var5 = (int)Math.ceil((double)var4 / 2.0);
         return var5 + var1.field_33033.nextInt(var5);
      }
   }

   private int method_38117(class_6098 var1) {
      int var4 = 0;
      Map var5 = class_2931.method_13402(var1);

      for (Entry var7 : var5.entrySet()) {
         class_4382 var8 = (class_4382)var7.getKey();
         Integer var9 = (Integer)var7.getValue();
         if (!var8.method_20435()) {
            var4 += var8.method_20433(var9);
         }
      }

      return var4;
   }
}
