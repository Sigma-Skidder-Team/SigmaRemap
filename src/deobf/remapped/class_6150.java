package remapped;

import com.google.gson.JsonObject;
import org.jetbrains.annotations.Nullable;

public class class_6150 {
   public final String field_31511;
   public final String field_31514;
   public final boolean field_31513;
   public class_3020 field_31507;
   public class_6452 field_31515;
   public class_1392 field_31510;
   public class_1392 field_31506;
   public class_1392 field_31516;
   public class_1392 field_31512;
   public boolean field_31508 = true;

   public class_6150(String var1, String var2) {
      this(var1, var2, false);
   }

   public class_6150(String var1, String var2, boolean var3) {
      this.field_31511 = var1;
      this.field_31514 = var2;
      this.field_31513 = var3;
   }

   public void method_28212() {
      class_3446.method_15886().method_34617().info("Loading " + this.field_31511 + " -> " + this.field_31514 + " mappings...");
      JsonObject var3 = !this.field_31513 ? null : this.method_28206();
      JsonObject var4 = class_3792.method_17614("mapping-" + this.field_31511 + ".json", true);
      JsonObject var5 = class_3792.method_17614("mapping-" + this.field_31514 + ".json", true);
      this.field_31510 = this.method_28209(var4, var5, var3, "blocks");
      this.field_31506 = this.method_28209(var4, var5, var3, "blockstates");
      this.field_31516 = this.method_28218(var4, var5, var3, "sounds");
      this.field_31512 = this.method_28218(var4, var5, var3, "statistics");
      class_1392 var6 = this.method_28218(var4, var5, var3, "particles");
      if (var6 != null) {
         this.field_31515 = new class_6452(var4.getAsJsonArray("particles"), var6);
      }

      if (this.field_31508 && var5.has("items")) {
         this.field_31507 = new class_3020();
         this.field_31507.defaultReturnValue(-1);
         class_3792.method_17616(
            this.field_31507, var4.getAsJsonObject("items"), var5.getAsJsonObject("items"), var3 == null ? null : var3.getAsJsonObject("items")
         );
      }

      this.method_28216(var4, var5, var3);
   }

   public int method_28217(int var1) {
      return this.method_28214(var1, this.field_31506.method_6437(var1), "blockstate");
   }

   public int method_28207(int var1) {
      return this.method_28214(var1, this.field_31510.method_6437(var1), "block");
   }

   public int method_28210(int var1) {
      return this.method_28214(var1, this.field_31507.get(var1), "item");
   }

   public int method_28204(int var1) {
      int var4 = this.field_31507.method_13803().get(var1);
      return var4 == -1 ? 1 : var4;
   }

   public int method_28202(int var1) {
      return this.method_28214(var1, this.field_31515.method_29412().method_6437(var1), "particles");
   }

   @Nullable
   public class_3020 method_28215() {
      return this.field_31507;
   }

   @Nullable
   public class_6452 method_28203() {
      return this.field_31515;
   }

   @Nullable
   public class_1392 method_28211() {
      return this.field_31510;
   }

   @Nullable
   public class_1392 method_28201() {
      return this.field_31506;
   }

   @Nullable
   public class_1392 method_28213() {
      return this.field_31516;
   }

   @Nullable
   public class_1392 method_28208() {
      return this.field_31512;
   }

   @Nullable
   public class_1392 method_28218(JsonObject var1, JsonObject var2, JsonObject var3, String var4) {
      if (var1.has(var4) && var2.has(var4)) {
         JsonObject var7 = var3 == null ? null : var3.getAsJsonObject(var4);
         return new class_1392(var1.getAsJsonArray(var4), var2.getAsJsonArray(var4), var7);
      } else {
         return null;
      }
   }

   @Nullable
   public class_1392 method_28209(JsonObject var1, JsonObject var2, JsonObject var3, String var4) {
      if (var1.has(var4) && var2.has(var4)) {
         JsonObject var7 = var3 == null ? null : var3.getAsJsonObject(var4);
         return new class_1392(var1.getAsJsonObject(var4), var2.getAsJsonObject(var4), var7);
      } else {
         return null;
      }
   }

   public JsonObject method_28206() {
      return class_3792.method_17613("mappingdiff-" + this.field_31511 + "to" + this.field_31514 + ".json");
   }

   public int method_28214(int var1, int var2, String var3) {
      if (var2 != -1) {
         return var2;
      } else {
         class_3446.method_15886().method_34617().warning(String.format("Missing %s %s for %s %s %d", this.field_31514, var3, this.field_31511, var3, var1));
         return 0;
      }
   }

   public void method_28216(JsonObject var1, JsonObject var2, JsonObject var3) {
   }
}
