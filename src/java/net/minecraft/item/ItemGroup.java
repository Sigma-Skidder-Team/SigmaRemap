package net.minecraft.item;

import mapped.*;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public abstract class ItemGroup {
   public static final ItemGroup[] GROUPS = new ItemGroup[12];
   public static final ItemGroup BUILDING_BLOCKS = new BuildingBlocksGroup(0, "buildingBlocks").setTabPath("building_blocks");
   public static final ItemGroup DECORATIONS = new DecorationsGroup(1, "decorations");
   public static final ItemGroup REDSTONE = new RedstoneGroup(2, "redstone");
   public static final ItemGroup TRANSPORTATION = new TransportationGroup(3, "transportation");
   public static final ItemGroup MISC = new MiscGroup(6, "misc");
   public static final ItemGroup SEARCH = new SearchGroup(5, "search").setBackgroundImageName("item_search.png");
   public static final ItemGroup FOOD = new FoodGroup(7, "food");
   public static final ItemGroup TOOLS = new ToolsGroup(8, "tools")
      .setRelevantEnchantmentTypes(EnchantmentType.VANISHABLE, EnchantmentType.DIGGER, EnchantmentType.FISHING_ROD, EnchantmentType.BREAKABLE);
   public static final ItemGroup COMBAT = new CombatGroup(9, "combat")
      .setRelevantEnchantmentTypes(
              EnchantmentType.VANISHABLE,
              EnchantmentType.ARMOR,
              EnchantmentType.ARMOR_FEET,
              EnchantmentType.ARMOR_HEAD,
              EnchantmentType.ARMOR_LEGS,
              EnchantmentType.ARMOR_CHEST,
              EnchantmentType.BOW,
              EnchantmentType.WEAPON,
              EnchantmentType.WEARABLE,
              EnchantmentType.BREAKABLE,
              EnchantmentType.TRIDENT,
              EnchantmentType.CROSSBOW);
   public static final ItemGroup BREWING = new BrewingGroup(10, "brewing");
   public static final ItemGroup MATERIALS = MISC;
   public static final ItemGroup HOTBAR = new HotbarGroup(4, "hotbar");
   public static final ItemGroup INVENTORY = new InventoryGroup(11, "inventory").setBackgroundImageName("inventory.png").setNoScrollbar().setNoTitle();
   private final int index;
   private final String tabLabel;
   private final ITextComponent groupName;
   private String tabPath;
   private String backgroundTexture = "items.png";
   private boolean hasScrollbar = true;
   private boolean drawTitle = true;
   private EnchantmentType[] enchantmentTypes = new EnchantmentType[0];
   private ItemStack icon;

   public ItemGroup(int index, String label) {
      this.index = index;
      this.tabLabel = label;
      this.groupName = new TranslationTextComponent("itemGroup." + label);
      this.icon = ItemStack.EMPTY;
      GROUPS[index] = this;
   }

   public int getIndex() {
      return this.index;
   }

   public String getPath() {
      return this.tabPath != null ? this.tabPath : this.tabLabel;
   }

   public ITextComponent getGroupName() {
      return this.groupName;
   }

   public ItemStack getIcon() {
      if (this.icon.isEmpty()) {
         this.icon = this.createIcon();
      }

      return this.icon;
   }

   public abstract ItemStack createIcon();

   public String getBackgroundTextureImageName() {
      return this.backgroundTexture;
   }

   public ItemGroup setBackgroundImageName(String pathIn) {
      this.backgroundTexture = pathIn;
      return this;
   }

   public ItemGroup setTabPath(String var1) {
      this.tabPath = var1;
      return this;
   }

   public boolean drawInForegroundOfTab() {
      return this.drawTitle;
   }

   public ItemGroup setNoTitle() {
      this.drawTitle = false;
      return this;
   }

   public boolean hasScrollbar() {
      return this.hasScrollbar;
   }

   public ItemGroup setNoScrollbar() {
      this.hasScrollbar = false;
      return this;
   }

   public int getColumn() {
      return this.index % 6;
   }

   public boolean isOnTopRow() {
      return this.index < 6;
   }

   public boolean isAlignedRight() {
      return this.getColumn() == 5;
   }

   public EnchantmentType[] getRelevantEnchantmentTypes() {
      return this.enchantmentTypes;
   }

   public ItemGroup setRelevantEnchantmentTypes(EnchantmentType... var1) {
      this.enchantmentTypes = var1;
      return this;
   }

   public boolean hasRelevantEnchantmentType(@Nullable EnchantmentType enchantmentType) {
      if (enchantmentType != null) {
         for (EnchantmentType type : this.enchantmentTypes) {
            if (type == enchantmentType) {
               return true;
            }
         }
      }

      return false;
   }

   public void fill(NonNullList<ItemStack> items) {
      for (Item item : Registry.ITEM) {
         item.fillItemGroup(this, items);
      }
   }
}
