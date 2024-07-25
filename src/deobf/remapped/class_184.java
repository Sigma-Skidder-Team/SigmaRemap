package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class class_184 implements class_4219 {
   private final class_4639 field_613;
   private final class_2451 field_615;
   private final int field_610;
   private final String field_617;
   private final List<String> field_619;
   private final Map<Character, class_8137> field_614;
   private final class_3321 field_618;
   private final class_4639 field_612;

   public class_184(
      class_4639 var1,
      class_2451 var2,
      int var3,
      String var4,
      List<String> var5,
      Map<Character, class_8137> var6,
      class_3321 var7,
      class_4639 var8,
      class_4639 var9
   ) {
      this.field_616 = var1;
      this.field_613 = var2;
      this.field_615 = var3;
      this.field_610 = var4;
      this.field_617 = var5;
      this.field_619 = var6;
      this.field_614 = var7;
      this.field_618 = var8;
      this.field_612 = var9;
   }

   @Override
   public void method_19647(JsonObject var1) {
      if (!this.field_617.isEmpty()) {
         var1.addProperty("group", this.field_617);
      }

      JsonArray var4 = new JsonArray();

      for (String var6 : this.field_619) {
         var4.add(var6);
      }

      var1.add("pattern", var4);
      JsonObject var8 = new JsonObject();

      for (Entry var7 : this.field_614.entrySet()) {
         var8.add(String.valueOf(var7.getKey()), ((class_8137)var7.getValue()).method_37027());
      }

      var1.add("key", var8);
      JsonObject var10 = new JsonObject();
      var10.addProperty("item", class_8669.field_44382.method_39797(this.field_615).toString());
      if (this.field_610 > 1) {
         var10.addProperty("count", this.field_610);
      }

      var1.add("result", var10);
   }

   @Override
   public class_2994<?> method_19651() {
      return class_2994.field_14711;
   }

   @Override
   public class_4639 method_19650() {
      return this.field_613;
   }

   @Nullable
   @Override
   public JsonObject method_19649() {
      return this.field_618.method_15265();
   }

   @Nullable
   @Override
   public class_4639 method_19646() {
      return this.field_612;
   }
}
