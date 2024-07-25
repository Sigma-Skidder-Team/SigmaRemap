package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
import javax.annotation.Nullable;

public class class_1619 implements class_4219 {
   private final Identifier field_8421;
   private final class_2451 field_8419;
   private final int field_8418;
   private final String field_8420;
   private final List<class_8137> field_8414;
   private final class_3321 field_8416;
   private final Identifier field_8417;

   public class_1619(Identifier var1, class_2451 var2, int var3, String var4, List<class_8137> var5, class_3321 var6, Identifier var7) {
      this.field_8421 = var1;
      this.field_8419 = var2;
      this.field_8418 = var3;
      this.field_8420 = var4;
      this.field_8414 = var5;
      this.field_8416 = var6;
      this.field_8417 = var7;
   }

   @Override
   public void method_19647(JsonObject var1) {
      if (!this.field_8420.isEmpty()) {
         var1.addProperty("group", this.field_8420);
      }

      JsonArray var4 = new JsonArray();

      for (class_8137 var6 : this.field_8414) {
         var4.add(var6.method_37027());
      }

      var1.add("ingredients", var4);
      JsonObject var7 = new JsonObject();
      var7.addProperty("item", class_8669.field_44382.method_39797(this.field_8419).toString());
      if (this.field_8418 > 1) {
         var7.addProperty("count", this.field_8418);
      }

      var1.add("result", var7);
   }

   @Override
   public class_2994<?> method_19651() {
      return class_2994.field_14706;
   }

   @Override
   public Identifier method_19650() {
      return this.field_8421;
   }

   @Nullable
   @Override
   public JsonObject method_19649() {
      return this.field_8416.method_15265();
   }

   @Nullable
   @Override
   public Identifier method_19646() {
      return this.field_8417;
   }
}
