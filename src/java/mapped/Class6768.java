package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public abstract class Class6768<C extends Class8277> {
   private static final Class7380 field29487 = Blocks.field36396.method11579();
   private static final Class7380 field29488 = Blocks.field36395.method11579();
   private static final Class7380 field29489 = Blocks.field36398.method11579();
   private static final Class7380 field29490 = Blocks.GRAVEL.method11579();
   private static final Class7380 field29491 = Blocks.STONE.method11579();
   private static final Class7380 field29492 = Blocks.field36397.method11579();
   private static final Class7380 field29493 = Blocks.SAND.method11579();
   private static final Class7380 field29494 = Blocks.RED_SAND.method11579();
   private static final Class7380 field29495 = Blocks.field36730.method11579();
   private static final Class7380 field29496 = Blocks.MYCELIUM.method11579();
   private static final Class7380 field29497 = Blocks.SOUL_SAND.method11579();
   private static final Class7380 field29498 = Blocks.NETHERRACK.method11579();
   private static final Class7380 field29499 = Blocks.field36651.method11579();
   private static final Class7380 field29500 = Blocks.field37083.method11579();
   private static final Class7380 field29501 = Blocks.field37074.method11579();
   private static final Class7380 field29502 = Blocks.field36891.method11579();
   private static final Class7380 field29503 = Blocks.field37076.method11579();
   private static final Class7380 field29504 = Blocks.field37130.method11579();
   private static final Class7380 field29505 = Blocks.BASALT.method11579();
   private static final Class7380 field29506 = Blocks.field36890.method11579();
   public static final Class8278 field29507 = new Class8278(field29489, field29487, field29490);
   public static final Class8278 field29508 = new Class8278(field29490, field29490, field29490);
   public static final Class8278 field29509 = new Class8278(field29488, field29487, field29490);
   public static final Class8278 field29510 = new Class8278(field29491, field29491, field29490);
   public static final Class8278 field29511 = new Class8278(field29492, field29487, field29490);
   public static final Class8278 field29512 = new Class8278(field29493, field29493, field29490);
   public static final Class8278 field29513 = new Class8278(field29488, field29487, field29493);
   public static final Class8278 field29514 = new Class8278(field29493, field29493, field29493);
   public static final Class8278 field29515 = new Class8278(field29494, field29495, field29490);
   public static final Class8278 field29516 = new Class8278(field29496, field29487, field29490);
   public static final Class8278 field29517 = new Class8278(field29498, field29498, field29498);
   public static final Class8278 field29518 = new Class8278(field29497, field29497, field29497);
   public static final Class8278 field29519 = new Class8278(field29499, field29499, field29499);
   public static final Class8278 field29520 = new Class8278(field29500, field29498, field29502);
   public static final Class8278 field29521 = new Class8278(field29501, field29498, field29503);
   public static final Class8278 field29522 = new Class8278(field29504, field29505, field29506);
   public static final Class6768<Class8278> field29523 = method20655("default", new Class6783(Class8278.field35569));
   public static final Class6768<Class8278> field29524 = method20655("mountain", new Class6780(Class8278.field35569));
   public static final Class6768<Class8278> field29525 = method20655("shattered_savanna", new Class6767(Class8278.field35569));
   public static final Class6768<Class8278> field29526 = method20655("gravelly_mountain", new Class6776(Class8278.field35569));
   public static final Class6768<Class8278> field29527 = method20655("giant_tree_taiga", new Class6769(Class8278.field35569));
   public static final Class6768<Class8278> field29528 = method20655("swamp", new Class6770(Class8278.field35569));
   public static final Class6768<Class8278> field29529 = method20655("badlands", new Class6773(Class8278.field35569));
   public static final Class6768<Class8278> field29530 = method20655("wooded_badlands", new Class6775(Class8278.field35569));
   public static final Class6768<Class8278> field29531 = method20655("eroded_badlands", new Class6774(Class8278.field35569));
   public static final Class6768<Class8278> field29532 = method20655("frozen_ocean", new Class6771(Class8278.field35569));
   public static final Class6768<Class8278> field29533 = method20655("nether", new Class6781(Class8278.field35569));
   public static final Class6768<Class8278> field29534 = method20655("nether_forest", new Class6772(Class8278.field35569));
   public static final Class6768<Class8278> field29535 = method20655("soul_sand_valley", new Class6778(Class8278.field35569));
   public static final Class6768<Class8278> field29536 = method20655("basalt_deltas", new Class6779(Class8278.field35569));
   public static final Class6768<Class8278> field29537 = method20655("nope", new Class6782(Class8278.field35569));
   private final Codec<Class9319<C>> field29538;

   private static <C extends Class8277, F extends Class6768<C>> F method20655(String var0, F var1) {
      return Registry.<F>method9194(Registry.field16108, var0, (F)var1);
   }

   public Class6768(Codec<C> var1) {
      this.field29538 = var1.fieldOf("config").xmap(this::method20657, Class9319::method35211).codec();
   }

   public Codec<Class9319<C>> method20656() {
      return this.field29538;
   }

   public Class9319<C> method20657(C var1) {
      return new Class9319<C>(this, var1);
   }

   public abstract void method20654(
           Random var1, Class1670 var2, Biome var3, int var4, int var5, int var6, double var7, Class7380 var9, Class7380 var10, int var11, long var12, C var14
   );

   public void method20658(long var1) {
   }
}
