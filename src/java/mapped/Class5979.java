package mapped;

import com.google.gson.JsonObject;

import javax.annotation.Nullable;

public class Class5979 {
   public final String field26038;
   public final String field26039;
   public final boolean field26040;
   public Class11 field26041;
   public Class8939 field26042;
   public Class7112 field26043;
   public Class7112 field26044;
   public Class7112 field26045;
   public Class7112 field26046;
   public boolean field26047 = true;

   public Class5979(String var1, String var2) {
      this(var1, var2, false);
   }

   public Class5979(String var1, String var2, boolean var3) {
      this.field26038 = var1;
      this.field26039 = var2;
      this.field26040 = var3;
   }

   public void method18527() {
      ViaVersion3.method27613().getLogger().info("Loading " + this.field26038 + " -> " + this.field26039 + " mappings...");
      JsonObject var3 = !this.field26040 ? null : this.method18541();
      JsonObject var4 = Class8159.method28359("mapping-" + this.field26038 + ".json", true);
      JsonObject var5 = Class8159.method28359("mapping-" + this.field26039 + ".json", true);
      this.field26043 = this.method18540(var4, var5, var3, "blocks");
      this.field26044 = this.method18540(var4, var5, var3, "blockstates");
      this.field26045 = this.method18539(var4, var5, var3, "sounds");
      this.field26046 = this.method18539(var4, var5, var3, "statistics");
      Class7112 var6 = this.method18539(var4, var5, var3, "particles");
      if (var6 != null) {
         this.field26042 = new Class8939(var4.getAsJsonArray("particles"), var6);
      }

      if (this.field26047 && var5.has("items")) {
         this.field26041 = new Class11();
         this.field26041.defaultReturnValue(-1);
         Class8159.method28360(
            this.field26041, var4.getAsJsonObject("items"), var5.getAsJsonObject("items"), var3 == null ? null : var3.getAsJsonObject("items")
         );
      }

      this.method18524(var4, var5, var3);
   }

   public int method18528(int var1) {
      return this.method18542(var1, this.field26044.method22147(var1), "blockstate");
   }

   public int method18529(int var1) {
      return this.method18542(var1, this.field26043.method22147(var1), "block");
   }

   public int method18530(int var1) {
      return this.method18542(var1, this.field26041.get(var1), "item");
   }

   public int method18531(int var1) {
      int var4 = this.field26041.method57().get(var1);
      return var4 == -1 ? 1 : var4;
   }

   public int method18532(int var1) {
      return this.method18542(var1, this.field26042.method32666().method22147(var1), "particles");
   }

   @Nullable
   public Class11 method18533() {
      return this.field26041;
   }

   @Nullable
   public Class8939 method18534() {
      return this.field26042;
   }

   @Nullable
   public Class7112 method18535() {
      return this.field26043;
   }

   @Nullable
   public Class7112 method18536() {
      return this.field26044;
   }

   @Nullable
   public Class7112 method18537() {
      return this.field26045;
   }

   @Nullable
   public Class7112 method18538() {
      return this.field26046;
   }

   @Nullable
   public Class7112 method18539(JsonObject var1, JsonObject var2, JsonObject var3, String var4) {
      if (var1.has(var4) && var2.has(var4)) {
         JsonObject var7 = var3 == null ? null : var3.getAsJsonObject(var4);
         return new Class7112(var1.getAsJsonArray(var4), var2.getAsJsonArray(var4), var7);
      } else {
         return null;
      }
   }

   @Nullable
   public Class7112 method18540(JsonObject var1, JsonObject var2, JsonObject var3, String var4) {
      if (var1.has(var4) && var2.has(var4)) {
         JsonObject var7 = var3 == null ? null : var3.getAsJsonObject(var4);
         return new Class7112(var1.getAsJsonObject(var4), var2.getAsJsonObject(var4), var7);
      } else {
         return null;
      }
   }

   public JsonObject method18541() {
      return Class8159.method28358("mappingdiff-" + this.field26038 + "to" + this.field26039 + ".json");
   }

   public int method18542(int var1, int var2, String var3) {
      if (var2 != -1) {
         return var2;
      } else {
         ViaVersion3.method27613().getLogger().warning(String.format("Missing %s %s for %s %s %d", this.field26039, var3, this.field26038, var3, var1));
         return 0;
      }
   }

   public void method18524(JsonObject var1, JsonObject var2, JsonObject var3) {
   }
}
