package remapped;

import java.io.IOException;
import java.net.ProtocolException;

public class class_7286 implements class_120 {
   public class_7286(class_4046 var1, class_3918 var2, int var3) {
      this.field_37281 = var1;
      this.field_37282 = var2;
      this.field_37284 = var3;
   }

   @Override
   public void method_351(class_4365 var1, class_7839 var2) {
      try {
         this.field_37281.method_18616(var2);
      } catch (ProtocolException var9) {
         this.field_37281.method_18619(var9, var2);
         class_8515.method_39200(var2);
         return;
      }

      class_327 var5 = class_1850.field_9389.method_8182(var1);
      var5.method_1527();
      class_7201 var6 = var5.method_1522().method_7203(var5);

      try {
         this.field_37281.field_19653.method_33217(this.field_37281, var2);
         String var7 = "OkHttp WebSocket " + this.field_37282.method_18136().method_7482();
         this.field_37281.method_18617(var7, (long)this.field_37284, var6);
         var5.method_1522().method_21599().setSoTimeout(0);
         this.field_37281.method_18630();
      } catch (Exception var8) {
         this.field_37281.method_18619(var8, null);
      }
   }

   @Override
   public void method_350(class_4365 var1, IOException var2) {
      this.field_37281.method_18619(var2, null);
   }
}
