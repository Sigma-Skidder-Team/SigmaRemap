package remapped;

import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class class_5821 implements class_4219 {
   private final Identifier field_29532;
   private final class_8137 field_29525;
   private final class_8137 field_29527;
   private final class_2451 field_29528;
   private final class_3321 field_29530;
   private final Identifier field_29529;
   private final class_2994<?> field_29531;

   public class_5821(Identifier var1, class_2994<?> var2, class_8137 var3, class_8137 var4, class_2451 var5, class_3321 var6, Identifier var7) {
      this.field_29532 = var1;
      this.field_29531 = var2;
      this.field_29525 = var3;
      this.field_29527 = var4;
      this.field_29528 = var5;
      this.field_29530 = var6;
      this.field_29529 = var7;
   }

   @Override
   public void method_19647(JsonObject var1) {
      var1.add("base", this.field_29525.method_37027());
      var1.add("addition", this.field_29527.method_37027());
      JsonObject var4 = new JsonObject();
      var4.addProperty("item", class_8669.field_44382.method_39797(this.field_29528).toString());
      var1.add("result", var4);
   }

   @Override
   public Identifier method_19650() {
      return this.field_29532;
   }

   @Override
   public class_2994<?> method_19651() {
      return this.field_29531;
   }

   @Nullable
   @Override
   public JsonObject method_19649() {
      return this.field_29530.method_15265();
   }

   @Nullable
   @Override
   public Identifier method_19646() {
      return this.field_29529;
   }
}
