package mapped;

import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;

public class Class8519 {
   private final int field38225;
   private final long field38226;
   private final String field38227;
   private final int field38228;
   private final boolean field38229;

   public Class8519(int var1, long var2, String var4, int var5, boolean var6) {
      this.field38225 = var1;
      this.field38226 = var2;
      this.field38227 = var4;
      this.field38228 = var5;
      this.field38229 = var6;
   }

   public static Class8519 method30181(Dynamic<?> var0) {
      int var3 = var0.get("version").asInt(0);
      long var4 = var0.get("LastPlayed").asLong(0L);
      OptionalDynamic var6 = var0.get("Version");
      return !var6.result().isPresent()
         ? new Class8519(var3, var4, "", 0, false)
         : new Class8519(
            var3,
            var4,
            var6.get("Name").asString(Class9246.method34773().getName()),
            var6.get("Id").asInt(Class9246.method34773().getWorldVersion()),
            var6.get("Snapshot").asBoolean(!Class9246.method34773().isStable())
         );
   }

   public int method30182() {
      return this.field38225;
   }

   public long method30183() {
      return this.field38226;
   }

   public String method30184() {
      return this.field38227;
   }

   public int method30185() {
      return this.field38228;
   }

   public boolean method30186() {
      return this.field38229;
   }
}
