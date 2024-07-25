package remapped;

import com.google.gson.JsonArray;
import it.unimi.dsi.fastutil.objects.Object2IntMap;

public class class_6452 {
   private final class_1392 field_32903;
   private final int field_32905;
   private final int field_32907;
   private final int field_32904;

   public class_6452(JsonArray var1, class_1392 var2) {
      this.field_32903 = var2;
      Object2IntMap var5 = class_3792.method_17610(var1);
      this.field_32905 = var5.getInt("block");
      this.field_32907 = var5.getInt("falling_dust");
      this.field_32904 = var5.getInt("item");
   }

   public class_1392 method_29412() {
      return this.field_32903;
   }

   public int method_29413() {
      return this.field_32905;
   }

   public int method_29416() {
      return this.field_32907;
   }

   public int method_29415() {
      return this.field_32904;
   }
}
