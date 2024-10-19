package net.minecraft.enchantment;

import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

public enum EnchantmentType {
   field14670 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem;
      }
   },
   field14671 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem && ((ArmorItem)var1).getType() == EquipmentSlotType.FEET;
      }
   },
   field14672 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem && ((ArmorItem)var1).getType() == EquipmentSlotType.LEGS;
      }
   },
   field14673 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem && ((ArmorItem)var1).getType() == EquipmentSlotType.CHEST;
      }
   },
   field14674 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem && ((ArmorItem)var1).getType() == EquipmentSlotType.HEAD;
      }
   },
   WEAPON {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof SwordItem;
      }
   },
   DIGGER {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ToolItem;
      }
   },
   FISHING_ROD {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof Class3259;
      }
   },
   field14678 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof Class3272;
      }
   },
   field14679 {
      @Override
      public boolean method8990(Item var1) {
         return var1.isDamageable();
      }
   },
   field14680 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof BowItem;
      }
   },
   field14681 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof Class3255 || Block.method11537(var1) instanceof Class3255;
      }
   },
   field14682 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof CrossbowItem;
      }
   },
   field14683 {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof IVanishable || Block.method11537(var1) instanceof IVanishable || field14679.method8990(var1);
      }
   };

   private static final EnchantmentType[] field14684 = new EnchantmentType[]{
      field14670,
      field14671,
      field14672,
      field14673,
      field14674,
           WEAPON,
           DIGGER,
           FISHING_ROD,
      field14678,
      field14679,
      field14680,
      field14681,
      field14682,
      field14683
   };

   private EnchantmentType() {
   }

   public abstract boolean method8990(Item var1);

}
