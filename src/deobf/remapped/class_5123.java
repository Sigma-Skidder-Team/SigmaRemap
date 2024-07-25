package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Arrays;

public class class_5123 {
   public static final class_5123 field_26441 = new class_5123(0, new Identifier[0], new Identifier[0], class_7181.field_36927);
   private final int field_26445;
   private final Identifier[] field_26443;
   private final Identifier[] field_26446;
   private final class_7181 field_26444;

   public class_5123(int var1, Identifier[] var2, Identifier[] var3, class_7181 var4) {
      this.field_26445 = var1;
      this.field_26443 = var2;
      this.field_26446 = var3;
      this.field_26444 = var4;
   }

   public void method_23509(class_9359 var1) {
      var1.method_3159(this.field_26445);
      class_2792 var4 = new class_8480(var1.method_43235())
         .method_39065(class_8712.field_44676, var1)
         .method_39065(class_8712.field_44671, var1.method_37245())
         .method_39068(var1.method_26594())
         .method_39064(class_4933.field_25568);
      boolean var5 = false;

      for (Identifier var9 : this.field_26443) {
         for (ItemStack var11 : var1.field_47801.method_1722().method_4604(var9).method_7862(var4)) {
            if (!var1.method_3245(var11)) {
               class_91 var12 = var1.method_3153(var11, false);
               if (var12 != null) {
                  var12.method_250();
                  var12.method_252(var1.method_37328());
               }
            } else {
               var1.world
                  .method_29528(
                     (PlayerEntity)null,
                     var1.getPosX(),
                     var1.method_37309(),
                     var1.getPosZ(),
                     SoundEvents.field_2732,
                     class_562.field_3335,
                     0.2F,
                     ((var1.method_26594().nextFloat() - var1.method_26594().nextFloat()) * 0.7F + 1.0F) * 2.0F
                  );
               var5 = true;
            }
         }
      }

      if (var5) {
         var1.field_3869.method_18877();
      }

      if (this.field_26446.length > 0) {
         var1.method_3224(this.field_26446);
      }

      class_341 var13 = var1.field_47801;
      this.field_26444
         .method_32900(var13.method_1642())
         .ifPresent(var2 -> var13.method_1642().method_7251(var2, var1.method_37320().method_42185().method_42194(2)));
   }

   @Override
   public String toString() {
      return "AdvancementRewards{experience="
         + this.field_26445
         + ", loot="
         + Arrays.toString(this.field_26443)
         + ", recipes="
         + Arrays.toString(this.field_26446)
         + ", function="
         + this.field_26444
         + '}';
   }

   public JsonElement method_23508() {
      if (this != field_26441) {
         JsonObject var3 = new JsonObject();
         if (this.field_26445 != 0) {
            var3.addProperty("experience", this.field_26445);
         }

         if (this.field_26443.length > 0) {
            JsonArray var4 = new JsonArray();

            for (Identifier var8 : this.field_26443) {
               var4.add(var8.toString());
            }

            var3.add("loot", var4);
         }

         if (this.field_26446.length > 0) {
            JsonArray var9 = new JsonArray();

            for (Identifier var13 : this.field_26446) {
               var9.add(var13.toString());
            }

            var3.add("recipes", var9);
         }

         if (this.field_26444.method_32899() != null) {
            var3.addProperty("function", this.field_26444.method_32899().toString());
         }

         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }

   public static class_5123 method_23511(JsonObject var0) throws JsonParseException {
      int var3 = class_6539.method_29768(var0, "experience", 0);
      JsonArray var4 = class_6539.method_29788(var0, "loot", new JsonArray());
      Identifier[] var5 = new Identifier[var4.size()];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = new Identifier(class_6539.method_29795(var4.get(var6), "loot[" + var6 + "]"));
      }

      JsonArray var9 = class_6539.method_29788(var0, "recipes", new JsonArray());
      Identifier[] var7 = new Identifier[var9.size()];

      for (int var8 = 0; var8 < var7.length; var8++) {
         var7[var8] = new Identifier(class_6539.method_29795(var9.get(var8), "recipes[" + var8 + "]"));
      }

      class_7181 var10;
      if (!var0.has("function")) {
         var10 = class_7181.field_36927;
      } else {
         var10 = new class_7181(new Identifier(class_6539.method_29796(var0, "function")));
      }

      return new class_5123(var3, var5, var7, var10);
   }
}
