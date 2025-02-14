package net.minecraft.enchantment;

import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

public enum EnchantmentType {
   ARMOR {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem;
      }
   },
   ARMOR_FEET {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem && ((ArmorItem)var1).getType() == EquipmentSlotType.FEET;
      }
   },
   ARMOR_LEGS {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem && ((ArmorItem)var1).getType() == EquipmentSlotType.LEGS;
      }
   },
   ARMOR_CHEST {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof ArmorItem && ((ArmorItem)var1).getType() == EquipmentSlotType.CHEST;
      }
   },
   ARMOR_HEAD {
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
   TRIDENT {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof Class3272;
      }
   },
   BREAKABLE {
      @Override
      public boolean method8990(Item var1) {
         return var1.isDamageable();
      }
   },
   BOW {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof BowItem;
      }
   },
   WEARABLE {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof Class3255 || Block.method11537(var1) instanceof Class3255;
      }
   },
   CROSSBOW {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof CrossbowItem;
      }
   },
   VANISHABLE {
      @Override
      public boolean method8990(Item var1) {
         return var1 instanceof IVanishable || Block.method11537(var1) instanceof IVanishable || BREAKABLE.method8990(var1);
      }
   };

   private static final EnchantmentType[] field14684 = new EnchantmentType[]{
           ARMOR,
           ARMOR_FEET,
           ARMOR_LEGS,
           ARMOR_CHEST,
           ARMOR_HEAD,
           WEAPON,
           DIGGER,
           FISHING_ROD,
           TRIDENT,
           BREAKABLE,
           BOW,
           WEARABLE,
           CROSSBOW,
           VANISHABLE
   };

   private EnchantmentType() {
   }

   public abstract boolean method8990(Item var1);

}
