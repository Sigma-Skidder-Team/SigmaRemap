package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public enum Class2210 {
   field14452("red", Blocks.RED_MUSHROOM.getDefaultState()),
   field14453("brown", Blocks.BROWN_MUSHROOM.getDefaultState());

   private final String field14454;
   private final BlockState field14455;
   private static final Class2210[] field14456 = new Class2210[]{field14452, field14453};

   private Class2210(String var3, BlockState var4) {
      this.field14454 = var3;
      this.field14455 = var4;
   }

   public BlockState method8934() {
      return this.field14455;
   }

   private static Class2210 method8935(String var0) {
      for (Class2210 var6 : values()) {
         if (var6.field14454.equals(var0)) {
            return var6;
         }
      }

      return field14452;
   }

   // $VF: synthetic method
   public static String method8936(Class2210 var0) {
      return var0.field14454;
   }

   // $VF: synthetic method
   public static BlockState method8937(Class2210 var0) {
      return var0.field14455;
   }

   // $VF: synthetic method
   public static Class2210 method8938(String var0) {
      return method8935(var0);
   }
}
