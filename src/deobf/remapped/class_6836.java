package remapped;

import java.util.logging.Level;

public class class_6836 implements class_6224 {
   public class_6836(class_1144 var1, boolean[] var2, String var3, class_2291[] var4, class_1144 var5, Runnable[] var6) {
      this.field_35243 = var1;
      this.field_35246 = var2;
      this.field_35248 = var3;
      this.field_35244 = var4;
      this.field_35249 = var5;
      this.field_35245 = var6;
   }

   @Override
   public void method_28452(Object... var1) {
      if (!this.field_35246[0]) {
         if (class_1144.method_5064().isLoggable(Level.FINE)) {
            class_1144.method_5064().fine(String.format("probe transport '%s' opened", this.field_35248));
         }

         class_8970 var4 = new class_8970<String>("ping", "probe");
         this.field_35244[0].method_10541(new class_8970[]{var4});
         this.field_35244[0].method_19331("packet", new class_8638(this));
      }
   }
}
