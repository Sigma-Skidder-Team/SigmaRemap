package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.registry.Registry;

public interface Class8933 {
   Class8933 field40418 = method32664(
      Class7984.<Block>method27141(), Class7984.<Item>method27141(), Class7984.<Fluid>method27141(), Class7984.<EntityType<?>>method27141()
   );

   Class7984<Block> method32657();

   Class7984<Item> method32658();

   Class7984<Fluid> method32659();

   Class7984<EntityType<?>> method32660();

   default void method32661() {
      TagRegistryManager.method29378(this);
      Blocks.method30025();
   }

   default void method32662(PacketBuffer var1) {
      this.method32657().method27139(var1, Registry.BLOCK);
      this.method32658().method27139(var1, Registry.ITEM);
      this.method32659().method27139(var1, Registry.FLUID);
      this.method32660().method27139(var1, Registry.ENTITY_TYPE);
   }

   static Class8933 method32663(PacketBuffer var0) {
      Class7984 var3 = Class7984.<Block>method27140(var0, Registry.BLOCK);
      Class7984 var4 = Class7984.<Item>method27140(var0, Registry.ITEM);
      Class7984 var5 = Class7984.<Fluid>method27140(var0, Registry.FLUID);
      Class7984 var6 = Class7984.<EntityType<?>>method27140(var0, Registry.ENTITY_TYPE);
      return method32664(var3, var4, var5, var6);
   }

   static Class8933 method32664(Class7984<Block> var0, Class7984<Item> var1, Class7984<Fluid> var2, Class7984<EntityType<?>> var3) {
      return new Class8934(var0, var1, var2, var3);
   }
}
