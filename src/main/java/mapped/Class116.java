package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;

import java.util.function.Predicate;

public class Class116 implements Predicate<BlockState> {
   private static String[] field421;
   private static final Class116 field422 = new Class117(Material.AIR);
   private final Material field423;

   private Class116(Material var1) {
      this.field423 = var1;
   }

   public static Class116 method330(Material var0) {
      return var0 != Material.AIR ? new Class116(var0) : field422;
   }

   public boolean test(BlockState var1) {
      return var1 != null && var1.getMaterial() == this.field423;
   }

   // $VF: synthetic method
   public Class116(Material var1, Class117 var2) {
      this(var1);
   }
}
