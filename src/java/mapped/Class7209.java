package mapped;

import java.util.UUID;

public class Class7209 {
   private static final ResourceLocation field30944 = new ResourceLocation("textures/entity/steve.png");
   private static final ResourceLocation field30945 = new ResourceLocation("textures/entity/alex.png");

   public static ResourceLocation method22636() {
      return field30944;
   }

   public static ResourceLocation method22637(UUID var0) {
      return !method22639(var0) ? field30944 : field30945;
   }

   public static String method22638(UUID var0) {
      return !method22639(var0) ? "default" : "slim";
   }

   private static boolean method22639(UUID var0) {
      return (var0.hashCode() & 1) == 1;
   }
}
