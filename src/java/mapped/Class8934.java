package mapped;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;

public final class Class8934 implements ITagCollectionSupplier {
   private static String[] field40419;
   public final ITagCollection field40420;
   public final ITagCollection field40421;
   public final ITagCollection field40422;
   public final ITagCollection field40423;

   public Class8934(ITagCollection var1, ITagCollection var2, ITagCollection var3, ITagCollection var4) {
      this.field40420 = var1;
      this.field40421 = var2;
      this.field40422 = var3;
      this.field40423 = var4;
   }

   @Override
   public ITagCollection<Block> method32657() {
      return this.field40420;
   }

   @Override
   public ITagCollection<Item> method32658() {
      return this.field40421;
   }

   @Override
   public ITagCollection<Fluid> method32659() {
      return this.field40422;
   }

   @Override
   public ITagCollection<EntityType<?>> method32660() {
      return this.field40423;
   }
}
