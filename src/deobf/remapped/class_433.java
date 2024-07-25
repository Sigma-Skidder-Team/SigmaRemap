package remapped;

import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class class_433 implements class_4219 {
   private final Identifier field_1814;
   private final String field_1811;
   private final class_8137 field_1816;
   private final class_2451 field_1817;
   private final int field_1818;
   private final class_3321 field_1813;
   private final Identifier field_1819;
   private final class_2994<?> field_1815;

   public class_433(Identifier var1, class_2994<?> var2, String var3, class_8137 var4, class_2451 var5, int var6, class_3321 var7, Identifier var8) {
      this.field_1814 = var1;
      this.field_1815 = var2;
      this.field_1811 = var3;
      this.field_1816 = var4;
      this.field_1817 = var5;
      this.field_1818 = var6;
      this.field_1813 = var7;
      this.field_1819 = var8;
   }

   @Override
   public void method_19647(JsonObject var1) {
      if (!this.field_1811.isEmpty()) {
         var1.addProperty("group", this.field_1811);
      }

      var1.add("ingredient", this.field_1816.method_37027());
      var1.addProperty("result", class_8669.field_44382.method_39797(this.field_1817).toString());
      var1.addProperty("count", this.field_1818);
   }

   @Override
   public Identifier method_19650() {
      return this.field_1814;
   }

   @Override
   public class_2994<?> method_19651() {
      return this.field_1815;
   }

   @Nullable
   @Override
   public JsonObject method_19649() {
      return this.field_1813.method_15265();
   }

   @Nullable
   @Override
   public Identifier method_19646() {
      return this.field_1819;
   }
}
