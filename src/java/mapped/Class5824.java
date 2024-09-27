package mapped;

import java.util.Map;

import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.IntReferenceHolder;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class5824 extends Class5823 {
   private static String[] field25516;
   private static final Logger field25517 = LogManager.getLogger();
   private int field25518;
   private String field25519;
   private final IntReferenceHolder field25520 = IntReferenceHolder.method15238();

   public Class5824(int var1, PlayerInventory var2) {
      this(var1, var2, IWorldPosCallable.field39521);
   }

   public Class5824(int var1, PlayerInventory var2, IWorldPosCallable var3) {
      super(ContainerType.field35655, var1, var2, var3);
      this.trackInt(this.field25520);
   }

   @Override
   public boolean method18191(BlockState var1) {
      return var1.isIn(BlockTags.field32765);
   }

   @Override
   public boolean method18189(PlayerEntity var1, boolean var2) {
      return (var1.abilities.isCreativeMode || var1.field4920 >= this.field25520.get()) && this.field25520.get() > 0;
   }

   @Override
   public ItemStack method18190(PlayerEntity var1, ItemStack var2) {
      if (!var1.abilities.isCreativeMode) {
         var1.method2727(-this.field25520.get());
      }

      this.field25513.setInventorySlotContents(0, ItemStack.EMPTY);
      if (this.field25518 <= 0) {
         this.field25513.setInventorySlotContents(1, ItemStack.EMPTY);
      } else {
         ItemStack var5 = this.field25513.getStackInSlot(1);
         if (!var5.isEmpty() && var5.getCount() > this.field25518) {
            var5.shrink(this.field25518);
            this.field25513.setInventorySlotContents(1, var5);
         } else {
            this.field25513.setInventorySlotContents(1, ItemStack.EMPTY);
         }
      }

      this.field25520.method15235(0);
      this.field25514.method31716((var1x, var2x) -> {
         BlockState var5x = var1x.getBlockState(var2x);
         if (!var1.abilities.isCreativeMode && var5x.isIn(BlockTags.field32765) && var1.getRNG().nextFloat() < 0.12F) {
            BlockState var6 = Class3218.method11607(var5x);
            if (var6 != null) {
               var1x.setBlockState(var2x, var6, 2);
               var1x.playEvent(1030, var2x, 0);
            } else {
               var1x.removeBlock(var2x, false);
               var1x.playEvent(1029, var2x, 0);
            }
         } else {
            var1x.playEvent(1030, var2x, 0);
         }
      });
      return var2;
   }

   @Override
   public void method18192() {
      ItemStack var3 = this.field25513.getStackInSlot(0);
      this.field25520.method15235(1);
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      if (var3.isEmpty()) {
         this.field25512.setInventorySlotContents(0, ItemStack.EMPTY);
         this.field25520.method15235(0);
      } else {
         ItemStack var7 = var3.copy();
         ItemStack var8 = this.field25513.getStackInSlot(1);
         Map<Enchantment, Integer> var9 = EnchantmentHelper.method26312(var7);
         var5 = var5 + var3.method32169() + (var8.isEmpty() ? 0 : var8.method32169());
         this.field25518 = 0;
         if (!var8.isEmpty()) {
            boolean var10 = var8.getItem() == Items.field38070 && !Class3290.method11830(var8).isEmpty();
            if (var7.method32115() && var7.getItem().method11699(var3, var8)) {
               int var24 = Math.min(var7.method32117(), var7.method32119() / 4);
               if (var24 <= 0) {
                  this.field25512.setInventorySlotContents(0, ItemStack.EMPTY);
                  this.field25520.method15235(0);
                  return;
               }

               int var26;
               for (var26 = 0; var24 > 0 && var26 < var8.getCount(); var26++) {
                  int var28 = var7.method32117() - var24;
                  var7.method32118(var28);
                  var4++;
                  var24 = Math.min(var7.method32117(), var7.method32119() / 4);
               }

               this.field25518 = var26;
            } else {
               if (!var10 && (var7.getItem() != var8.getItem() || !var7.method32115())) {
                  this.field25512.setInventorySlotContents(0, ItemStack.EMPTY);
                  this.field25520.method15235(0);
                  return;
               }

               if (var7.method32115() && !var10) {
                  int var11 = var3.method32119() - var3.method32117();
                  int var12 = var8.method32119() - var8.method32117();
                  int var13 = var12 + var7.method32119() * 12 / 100;
                  int var14 = var11 + var13;
                  int var15 = var7.method32119() - var14;
                  if (var15 < 0) {
                     var15 = 0;
                  }

                  if (var15 < var7.method32117()) {
                     var7.method32118(var15);
                     var4 += 2;
                  }
               }

               Map<Enchantment, Integer> var23 = EnchantmentHelper.method26312(var8);
               boolean var25 = false;
               boolean var27 = false;

               for (Enchantment var30 : var23.keySet()) {
                  if (var30 != null) {
                     int var16 = var9.getOrDefault(var30, 0);
                     int var17 = (Integer)var23.get(var30);
                     var17 = var16 == var17 ? var17 + 1 : Math.max(var17, var16);
                     boolean var18 = var30.method18821(var3);
                     if (this.field25515.abilities.isCreativeMode || var3.getItem() == Items.field38070) {
                        var18 = true;
                     }

                     for (Enchantment var20 : var9.keySet()) {
                        if (var20 != var30 && !var30.method18816(var20)) {
                           var18 = false;
                           var4++;
                        }
                     }

                     if (!var18) {
                        var27 = true;
                     } else {
                        var25 = true;
                        if (var17 > var30.method18809()) {
                           var17 = var30.method18809();
                        }

                        var9.put(var30, var17);
                        int var32 = 0;
                        switch (Class9719.field45410[var30.method18812().ordinal()]) {
                           case 1:
                              var32 = 1;
                              break;
                           case 2:
                              var32 = 2;
                              break;
                           case 3:
                              var32 = 4;
                              break;
                           case 4:
                              var32 = 8;
                        }

                        if (var10) {
                           var32 = Math.max(1, var32 / 2);
                        }

                        var4 += var32 * var17;
                        if (var3.getCount() > 1) {
                           var4 = 40;
                        }
                     }
                  }
               }

               if (var27 && !var25) {
                  this.field25512.setInventorySlotContents(0, ItemStack.EMPTY);
                  this.field25520.method15235(0);
                  return;
               }
            }
         }

         if (StringUtils.isBlank(this.field25519)) {
            if (var3.method32152()) {
               var6 = 1;
               var4 += var6;
               var7.method32151();
            }
         } else if (!this.field25519.equals(var3.method32149().getString())) {
            var6 = 1;
            var4 += var6;
            var7.method32150(new StringTextComponent(this.field25519));
         }

         this.field25520.method15235(var5 + var4);
         if (var4 <= 0) {
            var7 = ItemStack.EMPTY;
         }

         if (var6 == var4 && var6 > 0 && this.field25520.get() >= 40) {
            this.field25520.method15235(39);
         }

         if (this.field25520.get() >= 40 && !this.field25515.abilities.isCreativeMode) {
            var7 = ItemStack.EMPTY;
         }

         if (!var7.isEmpty()) {
            int var22 = var7.method32169();
            if (!var8.isEmpty() && var22 < var8.method32169()) {
               var22 = var8.method32169();
            }

            if (var6 != var4 || var6 == 0) {
               var22 = method18196(var22);
            }

            var7.method32170(var22);
            EnchantmentHelper.method26314(var9, var7);
         }

         this.field25512.setInventorySlotContents(0, var7);
         this.detectAndSendChanges();
      }
   }

   public static int method18196(int var0) {
      return var0 * 2 + 1;
   }

   public void method18197(String var1) {
      this.field25519 = var1;
      if (this.getSlot(2).getHasStack()) {
         ItemStack var4 = this.getSlot(2).getStack();
         if (!StringUtils.isBlank(var1)) {
            var4.method32150(new StringTextComponent(this.field25519));
         } else {
            var4.method32151();
         }
      }

      this.method18192();
   }

   public int method18198() {
      return this.field25520.get();
   }
}
