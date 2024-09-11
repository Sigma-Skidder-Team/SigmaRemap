package mapped;

import net.minecraft.world.GameType;

public enum Class2079 {
   field13539("survival", GameType.field11102),
   field13540("hardcore", GameType.field11102),
   field13541("creative", GameType.field11103),
   field13542("spectator", GameType.SPECTATOR);

   private final String field13543;
   private final GameType field13544;
   private static final Class2079[] field13545 = new Class2079[]{field13539, field13540, field13541, field13542};

   private Class2079(String var3, GameType var4) {
      this.field13543 = var3;
      this.field13544 = var4;
   }

   // $VF: synthetic method
   public static String method8734(Class2079 var0) {
      return var0.field13543;
   }

   // $VF: synthetic method
   public static GameType method8735(Class2079 var0) {
      return var0.field13544;
   }
}
