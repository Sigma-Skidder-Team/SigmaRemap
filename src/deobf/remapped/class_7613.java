package remapped;

import java.io.IOException;
import java.util.List;

public final class class_7613 extends class_9001 {
   private static final class_1972 field_38747 = class_1972.method_9069("application/x-www-form-urlencoded");
   private final List<String> field_38746;
   private final List<String> field_38749;

   public class_7613(List<String> var1, List<String> var2) {
      this.field_38746 = class_8515.<String>method_39210(var1);
      this.field_38749 = class_8515.<String>method_39210(var2);
   }

   public int method_34529() {
      return this.field_38746.size();
   }

   public String method_34532(int var1) {
      return this.field_38746.get(var1);
   }

   public String method_34533(int var1) {
      return class_1672.method_7461(this.method_34532(var1), true);
   }

   public String method_34530(int var1) {
      return this.field_38749.get(var1);
   }

   public String method_34531(int var1) {
      return class_1672.method_7461(this.method_34530(var1), true);
   }

   @Override
   public class_1972 method_41290() {
      return field_38747;
   }

   @Override
   public long method_41288() {
      return this.method_34528(null, true);
   }

   @Override
   public void method_41289(class_3947 var1) throws IOException {
      this.method_34528(var1, false);
   }

   private long method_34528(class_3947 var1, boolean var2) {
      long var5 = 0L;
      class_7059 var7;
      if (!var2) {
         var7 = var1.method_18234();
      } else {
         var7 = new class_7059();
      }

      int var8 = 0;

      for (int var9 = this.field_38746.size(); var8 < var9; var8++) {
         if (var8 > 0) {
            var7.method_32494(38);
         }

         var7.method_32491(this.field_38746.get(var8));
         var7.method_32494(61);
         var7.method_32491(this.field_38749.get(var8));
      }

      if (var2) {
         var5 = var7.method_32468();
         var7.method_32455();
      }

      return var5;
   }
}
