package remapped;

import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;

public class class_4922 {
   private final int field_25476;
   private final long field_25472;
   private final String field_25475;
   private final int field_25473;
   private final boolean field_25474;

   public class_4922(int var1, long var2, String var4, int var5, boolean var6) {
      this.field_25476 = var1;
      this.field_25472 = var2;
      this.field_25475 = var4;
      this.field_25473 = var5;
      this.field_25474 = var6;
   }

   public static class_4922 method_22546(Dynamic<?> var0) {
      int var3 = var0.get("version").asInt(0);
      long var4 = var0.get("LastPlayed").asLong(0L);
      OptionalDynamic var6 = var0.get("Version");
      return !var6.result().isPresent()
         ? new class_4922(var3, var4, "", 0, false)
         : new class_4922(
            var3,
            var4,
            var6.get("Name").asString(class_7665.method_34674().getName()),
            var6.get("Id").asInt(class_7665.method_34674().getWorldVersion()),
            var6.get("Snapshot").asBoolean(!class_7665.method_34674().isStable())
         );
   }

   public int method_22540() {
      return this.field_25476;
   }

   public long method_22544() {
      return this.field_25472;
   }

   public String method_22545() {
      return this.field_25475;
   }

   public int method_22543() {
      return this.field_25473;
   }

   public boolean method_22542() {
      return this.field_25474;
   }
}
