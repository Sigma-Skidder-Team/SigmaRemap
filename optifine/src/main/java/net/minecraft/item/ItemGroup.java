package net.minecraft.item;

import javax.annotation.Nullable;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.util.NonNullList;
import net.minecraft.util.registry.Registry;

public abstract class ItemGroup
{
    public static final ItemGroup[] GROUPS = new ItemGroup[12];
    public static final ItemGroup BUILDING_BLOCKS = (new ItemGroup(0, "buildingBlocks")
    {
        public ItemStack createIcon()
        {
            return new ItemStack(Blocks.BRICKS);
        }
    }).setTabPath("building_blocks");
    public static final ItemGroup DECORATIONS = new ItemGroup(1, "decorations")
    {
        public ItemStack createIcon()
        {
            return new ItemStack(Blocks.PEONY);
        }
    };
    public static final ItemGroup REDSTONE = new ItemGroup(2, "redstone")
    {
        public ItemStack createIcon()
        {
            return new ItemStack(Items.REDSTONE);
        }
    };
    public static final ItemGroup TRANSPORTATION = new ItemGroup(3, "transportation")
    {
        public ItemStack createIcon()
        {
            return new ItemStack(Blocks.POWERED_RAIL);
        }
    };
    public static final ItemGroup MISC = new ItemGroup(6, "misc")
    {
        public ItemStack createIcon()
        {
            return new ItemStack(Items.LAVA_BUCKET);
        }
    };
    public static final ItemGroup SEARCH = (new ItemGroup(5, "search")
    {
        public ItemStack createIcon()
        {
            return new ItemStack(Items.COMPASS);
        }
    }).setBackgroundImageName("item_search.png");
    public static final ItemGroup FOOD = new ItemGroup(7, "food")
    {
        public ItemStack createIcon()
        {
            return new ItemStack(Items.APPLE);
        }
    };
    public static final ItemGroup TOOLS = (new ItemGroup(8, "tools")
    {
        public ItemStack createIcon()
        {
            return new ItemStack(Items.IRON_AXE);
        }
    }).setRelevantEnchantmentTypes(new EnchantmentType[] {EnchantmentType.ALL, EnchantmentType.DIGGER, EnchantmentType.FISHING_ROD, EnchantmentType.BREAKABLE});
    public static final ItemGroup COMBAT = (new ItemGroup(9, "combat")
    {
        public ItemStack createIcon()
        {
            return new ItemStack(Items.GOLDEN_SWORD);
        }
    }).setRelevantEnchantmentTypes(new EnchantmentType[] {EnchantmentType.ALL, EnchantmentType.ARMOR, EnchantmentType.ARMOR_FEET, EnchantmentType.ARMOR_HEAD, EnchantmentType.ARMOR_LEGS, EnchantmentType.ARMOR_CHEST, EnchantmentType.BOW, EnchantmentType.WEAPON, EnchantmentType.WEARABLE, EnchantmentType.BREAKABLE, EnchantmentType.TRIDENT, EnchantmentType.CROSSBOW});
    public static final ItemGroup BREWING = new ItemGroup(10, "brewing")
    {
        public ItemStack createIcon()
        {
            return PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), Potions.WATER);
        }
    };
    public static final ItemGroup MATERIALS = MISC;
    public static final ItemGroup HOTBAR = new ItemGroup(4, "hotbar")
    {
        public ItemStack createIcon()
        {
            return new ItemStack(Blocks.BOOKSHELF);
        }
        public void fill(NonNullList<ItemStack> items)
        {
            throw new RuntimeException("Implement exception client-side.");
        }
        public boolean isAlignedRight()
        {
            return true;
        }
    };
    public static final ItemGroup INVENTORY = (new ItemGroup(11, "inventory")
    {
        public ItemStack createIcon()
        {
            return new ItemStack(Blocks.CHEST);
        }
    }).setBackgroundImageName("inventory.png").setNoScrollbar().setNoTitle();
    private final int index;
    private final String tabLabel;
    private String tabPath;
    private String backgroundTexture = "items.png";
    private boolean hasScrollbar = true;
    private boolean drawTitle = true;
    private EnchantmentType[] enchantmentTypes = new EnchantmentType[0];
    private ItemStack icon;

    public ItemGroup(int p_i448_1_, String p_i448_2_)
    {
        this.index = p_i448_1_;
        this.tabLabel = p_i448_2_;
        this.icon = ItemStack.EMPTY;
        GROUPS[p_i448_1_] = this;
    }

    public int getIndex()
    {
        return this.index;
    }

    public String getTabLabel()
    {
        return this.tabLabel;
    }

    public String getPath()
    {
        return this.tabPath == null ? this.tabLabel : this.tabPath;
    }

    public String getTranslationKey()
    {
        return "itemGroup." + this.getTabLabel();
    }

    public ItemStack getIcon()
    {
        if (this.icon.isEmpty())
        {
            this.icon = this.createIcon();
        }

        return this.icon;
    }

    public abstract ItemStack createIcon();

    public String getBackgroundImageName()
    {
        return this.backgroundTexture;
    }

    public ItemGroup setBackgroundImageName(String texture)
    {
        this.backgroundTexture = texture;
        return this;
    }

    public ItemGroup setTabPath(String pathIn)
    {
        this.tabPath = pathIn;
        return this;
    }

    public boolean drawInForegroundOfTab()
    {
        return this.drawTitle;
    }

    public ItemGroup setNoTitle()
    {
        this.drawTitle = false;
        return this;
    }

    public boolean hasScrollbar()
    {
        return this.hasScrollbar;
    }

    public ItemGroup setNoScrollbar()
    {
        this.hasScrollbar = false;
        return this;
    }

    public int getColumn()
    {
        return this.index % 6;
    }

    public boolean isOnTopRow()
    {
        return this.index < 6;
    }

    public boolean isAlignedRight()
    {
        return this.getColumn() == 5;
    }

    public EnchantmentType[] getRelevantEnchantmentTypes()
    {
        return this.enchantmentTypes;
    }

    public ItemGroup setRelevantEnchantmentTypes(EnchantmentType... types)
    {
        this.enchantmentTypes = types;
        return this;
    }

    public boolean hasRelevantEnchantmentType(@Nullable EnchantmentType enchantmentType)
    {
        if (enchantmentType != null)
        {
            for (EnchantmentType enchantmenttype : this.enchantmentTypes)
            {
                if (enchantmenttype == enchantmentType)
                {
                    return true;
                }
            }
        }

        return false;
    }

    public void fill(NonNullList<ItemStack> items)
    {
        for (Item item : Registry.ITEM)
        {
            item.fillItemGroup(this, items);
        }
    }
}
