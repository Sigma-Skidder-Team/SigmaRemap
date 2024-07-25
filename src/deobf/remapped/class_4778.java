package remapped;

import java.io.IOException;

public final class class_4778 implements class_9833 {
   public final class_8075 field_23148;

   public class_4778(class_8075 var1) {
      this.field_23148 = var1;
   }

   @Override
   public class_7839 method_45321(class_8047 var1) throws IOException {
      class_3805 var4 = (class_3805)var1;
      class_3918 var5 = var4.method_36516();
      class_327 var6 = var4.method_17718();
      boolean var7 = !var5.method_18137().equals("GET");
      class_9328 var8 = var6.method_1520(this.field_23148, var7);
      class_1617 var9 = var6.method_1522();
      return var4.method_17719(var5, var6, var8, var9);
   }
}
