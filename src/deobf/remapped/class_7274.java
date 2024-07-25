package remapped;

import java.util.Date;

public class class_7274 {
   private static String[] field_37244;
   public boolean field_37242;
   public String[] field_37243;
   public Date field_37245 = new Date();

   public class_7274(String var1, boolean var2) {
      this.field_37242 = var2;
      this.field_37243 = class_314.method_1393(var1, 200, class_5320.field_27139);
   }

   public int method_33251() {
      return class_6430.method_29375().method_15654() * this.field_37243.length + 20;
   }

   public int method_33249() {
      return this.field_37243.length != 1 ? 225 : class_6430.method_29375().method_18547(this.field_37243[0]) + 20;
   }
}
