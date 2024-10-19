package mapped;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.Random;

public class Class5395 implements Class5391 {
   private static String[] field24047;
   private final ItemStack field24048;
   private final int field24049;
   private final int field24050;
   private final int field24051;
   private final int field24052;
   private final float field24053;

   public Class5395(Block var1, int var2, int var3, int var4, int var5) {
      this(new ItemStack(var1), var2, var3, var4, var5);
   }

   public Class5395(Item var1, int var2, int var3, int var4) {
      this(new ItemStack(var1), var2, var3, 12, var4);
   }

   public Class5395(Item var1, int var2, int var3, int var4, int var5) {
      this(new ItemStack(var1), var2, var3, var4, var5);
   }

   public Class5395(ItemStack var1, int var2, int var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, 0.05F);
   }

   public Class5395(ItemStack var1, int var2, int var3, int var4, int var5, float var6) {
      this.field24048 = var1;
      this.field24049 = var2;
      this.field24050 = var3;
      this.field24051 = var4;
      this.field24052 = var5;
      this.field24053 = var6;
   }

   @Override
   public Class9346 method16977(Entity var1, Random var2) {
      return new Class9346(
         new ItemStack(Items.field38049, this.field24049),
         new ItemStack(this.field24048.getItem(), this.field24050),
         this.field24051,
         this.field24052,
         this.field24053
      );
   }
}
