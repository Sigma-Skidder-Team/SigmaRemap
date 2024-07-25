package remapped;

import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class class_7106 implements class_4219 {
   private final Identifier field_36648;
   private final String field_36645;
   private final class_8137 field_36650;
   private final class_2451 field_36651;
   private final float field_36649;
   private final int field_36644;
   private final class_3321 field_36652;
   private final Identifier field_36643;
   private final class_2994<? extends class_3151> field_36646;

   public class_7106(
      Identifier var1,
      String var2,
      class_8137 var3,
      class_2451 var4,
      float var5,
      int var6,
      class_3321 var7,
      Identifier var8,
      class_2994<? extends class_3151> var9
   ) {
      this.field_36648 = var1;
      this.field_36645 = var2;
      this.field_36650 = var3;
      this.field_36651 = var4;
      this.field_36649 = var5;
      this.field_36644 = var6;
      this.field_36652 = var7;
      this.field_36643 = var8;
      this.field_36646 = var9;
   }

   @Override
   public void method_19647(JsonObject var1) {
      if (!this.field_36645.isEmpty()) {
         var1.addProperty("group", this.field_36645);
      }

      var1.add("ingredient", this.field_36650.method_37027());
      var1.addProperty("result", class_8669.field_44382.method_39797(this.field_36651).toString());
      var1.addProperty("experience", this.field_36649);
      var1.addProperty("cookingtime", this.field_36644);
   }

   @Override
   public class_2994<?> method_19651() {
      return this.field_36646;
   }

   @Override
   public Identifier method_19650() {
      return this.field_36648;
   }

   @Nullable
   @Override
   public JsonObject method_19649() {
      return this.field_36652.method_15265();
   }

   @Nullable
   @Override
   public Identifier method_19646() {
      return this.field_36643;
   }
}
