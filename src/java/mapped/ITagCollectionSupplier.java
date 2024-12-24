package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tags.TagRegistryManager;
import net.minecraft.util.registry.Registry;

public interface ITagCollectionSupplier {
   ITagCollectionSupplier field40418 = method32664(
      ITagCollection.<Block>getEmptyTagCollection(), ITagCollection.<Item>getEmptyTagCollection(), ITagCollection.<Fluid>getEmptyTagCollection(), ITagCollection.<EntityType<?>>getEmptyTagCollection()
   );

   ITagCollection<Block> method32657();

   ITagCollection<Item> method32658();

   ITagCollection<Fluid> method32659();

   ITagCollection<EntityType<?>> method32660();

   default void method32661() {
      TagRegistryManager.fetchTags(this);
      Blocks.method30025();
   }

   default void method32662(PacketBuffer var1) {
      this.method32657().method27139(var1, Registry.BLOCK);
      this.method32658().method27139(var1, Registry.ITEM);
      this.method32659().method27139(var1, Registry.FLUID);
      this.method32660().method27139(var1, Registry.ENTITY_TYPE);
   }

   static ITagCollectionSupplier method32663(PacketBuffer var0) {
      ITagCollection var3 = ITagCollection.<Block>method27140(var0, Registry.BLOCK);
      ITagCollection var4 = ITagCollection.<Item>method27140(var0, Registry.ITEM);
      ITagCollection var5 = ITagCollection.<Fluid>method27140(var0, Registry.FLUID);
      ITagCollection var6 = ITagCollection.<EntityType<?>>method27140(var0, Registry.ENTITY_TYPE);
      return method32664(var3, var4, var5, var6);
   }

   static ITagCollectionSupplier method32664(ITagCollection<Block> var0, ITagCollection<Item> var1, ITagCollection<Fluid> var2, ITagCollection<EntityType<?>> var3) {
      return new Class8934(var0, var1, var2, var3);
   }
}
