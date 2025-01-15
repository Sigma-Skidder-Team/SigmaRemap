package net.minecraft.enchantment;

import net.minecraft.block.AbstractSkullBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.TridentItem;

public enum EnchantmentType
{
    ALL {
        public boolean canEnchantItem(Item itemIn)
        {
            for (EnchantmentType enchantmenttype : EnchantmentType.values())
            {
                if (enchantmenttype != EnchantmentType.ALL && enchantmenttype.canEnchantItem(itemIn))
                {
                    return true;
                }
            }

            return false;
        }
    },
    ARMOR {
        public boolean canEnchantItem(Item itemIn)
        {
            return itemIn instanceof ArmorItem;
        }
    },
    ARMOR_FEET {
        public boolean canEnchantItem(Item itemIn)
        {
            return itemIn instanceof ArmorItem && ((ArmorItem)itemIn).getEquipmentSlot() == EquipmentSlotType.FEET;
        }
    },
    ARMOR_LEGS {
        public boolean canEnchantItem(Item itemIn)
        {
            return itemIn instanceof ArmorItem && ((ArmorItem)itemIn).getEquipmentSlot() == EquipmentSlotType.LEGS;
        }
    },
    ARMOR_CHEST {
        public boolean canEnchantItem(Item itemIn)
        {
            return itemIn instanceof ArmorItem && ((ArmorItem)itemIn).getEquipmentSlot() == EquipmentSlotType.CHEST;
        }
    },
    ARMOR_HEAD {
        public boolean canEnchantItem(Item itemIn)
        {
            return itemIn instanceof ArmorItem && ((ArmorItem)itemIn).getEquipmentSlot() == EquipmentSlotType.HEAD;
        }
    },
    WEAPON {
        public boolean canEnchantItem(Item itemIn)
        {
            return itemIn instanceof SwordItem;
        }
    },
    DIGGER {
        public boolean canEnchantItem(Item itemIn)
        {
            return itemIn instanceof ToolItem;
        }
    },
    FISHING_ROD {
        public boolean canEnchantItem(Item itemIn)
        {
            return itemIn instanceof FishingRodItem;
        }
    },
    TRIDENT {
        public boolean canEnchantItem(Item itemIn)
        {
            return itemIn instanceof TridentItem;
        }
    },
    BREAKABLE {
        public boolean canEnchantItem(Item itemIn)
        {
            return itemIn.isDamageable();
        }
    },
    BOW {
        public boolean canEnchantItem(Item itemIn)
        {
            return itemIn instanceof BowItem;
        }
    },
    WEARABLE {
        public boolean canEnchantItem(Item itemIn)
        {
            Block block = Block.getBlockFromItem(itemIn);
            return itemIn instanceof ArmorItem || itemIn instanceof ElytraItem || block instanceof AbstractSkullBlock || block instanceof CarvedPumpkinBlock;
        }
    },
    CROSSBOW {
        public boolean canEnchantItem(Item itemIn)
        {
            return itemIn instanceof CrossbowItem;
        }
    };

    private EnchantmentType()
    {
    }

    public abstract boolean canEnchantItem(Item itemIn);
}
