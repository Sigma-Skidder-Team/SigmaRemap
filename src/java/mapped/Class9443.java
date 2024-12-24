package mapped;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;

import java.util.stream.Collectors;

public class Class9443 {
   private static String[] field43871;
   private static volatile ITagCollectionSupplier field43872 = ITagCollectionSupplier.method32664(
      ITagCollection.<Block>method27142(BlockTags.method25116().stream().collect(Collectors.toMap(Class7610::getName, var0 -> (ITag<Block>)var0))),
      ITagCollection.<Item>method27142(ItemTags.method18562().stream().collect(Collectors.toMap(Class7610::getName, var0 -> (ITag<Item>)var0))),
      ITagCollection.<Fluid>method27142(FluidTags.method32717().stream().collect(Collectors.toMap(Class7610::getName, var0 -> (ITag<Fluid>)var0))),
      ITagCollection.<EntityType<?>>method27142(
         EntityTypeTags.method30862().stream().collect(Collectors.toMap(Class7610::getName, var0 -> (ITag<EntityType<?>>)var0))
      )
   );

   public static ITagCollectionSupplier method36296() {
      return field43872;
   }

   public static void method36297(ITagCollectionSupplier var0) {
      field43872 = var0;
   }
}
