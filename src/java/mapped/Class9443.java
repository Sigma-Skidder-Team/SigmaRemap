package mapped;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluid;

import java.util.stream.Collectors;

public class Class9443 {
   private static String[] field43871;
   private static volatile Class8933 field43872 = Class8933.method32664(
      Class7984.<Block>method27142(BlockTags.method25116().stream().collect(Collectors.toMap(Class7610::getName, var0 -> (ITag<Block>)var0))),
      Class7984.<Item>method27142(Class5985.method18562().stream().collect(Collectors.toMap(Class7610::getName, var0 -> (ITag<Item>)var0))),
      Class7984.<Fluid>method27142(FluidTags.method32717().stream().collect(Collectors.toMap(Class7610::getName, var0 -> (ITag<Fluid>)var0))),
      Class7984.<EntityType<?>>method27142(
         Class8613.method30862().stream().collect(Collectors.toMap(Class7610::getName, var0 -> (ITag<EntityType<?>>)var0))
      )
   );

   public static Class8933 method36296() {
      return field43872;
   }

   public static void method36297(Class8933 var0) {
      field43872 = var0;
   }
}
