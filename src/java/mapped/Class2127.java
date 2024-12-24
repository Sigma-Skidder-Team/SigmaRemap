package mapped;

import net.minecraft.entity.EntityType;

public enum Class2127 {
   field13877(EntityType.VINDICATOR, new int[]{0, 0, 2, 0, 1, 4, 2, 5}),
   field13878(EntityType.EVOKER, new int[]{0, 0, 0, 0, 0, 1, 1, 2}),
   field13879(EntityType.PILLAGER, new int[]{0, 4, 3, 3, 4, 4, 4, 2}),
   field13880(EntityType.WITCH, new int[]{0, 0, 0, 0, 3, 0, 0, 1}),
   field13881(EntityType.RAVAGER, new int[]{0, 0, 0, 1, 0, 1, 0, 2});

   private static final Class2127[] field13882 = values();
   private final EntityType<? extends Class1026> field13883;
   private final int[] field13884;
   private static final Class2127[] field13885 = new Class2127[]{field13877, field13878, field13879, field13880, field13881};

   private Class2127(EntityType<? extends Class1026> var3, int[] var4) {
      this.field13883 = var3;
      this.field13884 = var4;
   }

   // $VF: synthetic method
   public static Class2127[] method8808() {
      return field13882;
   }

   // $VF: synthetic method
   public static EntityType method8809(Class2127 var0) {
      return var0.field13883;
   }

   // $VF: synthetic method
   public static int[] method8810(Class2127 var0) {
      return var0.field13884;
   }
}
