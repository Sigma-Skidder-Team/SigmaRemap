package remapped;

import java.io.IOException;

public class class_4174 extends class_5548 {
   public class_4174(class_961 var1, String var2, Object[] var3, class_9388 var4) {
      super(var2, var3);
      this.field_20324 = var1;
      this.field_20323 = var4;
   }

   @Override
   public void method_25227() {
      try {
         this.field_20324.field_4935.field_13185.method_40965(this.field_20323);
      } catch (IOException var6) {
         class_3307.method_15163().method_15167(4, "Http2Connection.Listener failure for " + this.field_20324.field_4935.field_13202, var6);

         try {
            this.field_20323.method_43415(class_1692.field_8760);
         } catch (IOException var5) {
         }
      }
   }
}
