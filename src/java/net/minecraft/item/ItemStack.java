package net.minecraft.item;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.gson.JsonParseException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

import mapped.*;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ITagCollectionSupplier;
import net.minecraft.util.Util;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.UnbreakingEnchantment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.stats.Stats;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ItemStack {
   public static final Codec<ItemStack> field39971 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Registry.ITEM.fieldOf("id").forGetter(var0x -> var0x.item),
               Codec.INT.fieldOf("Count").forGetter(var0x -> var0x.count),
               CompoundNBT.CODEC.optionalFieldOf("tag").forGetter(var0x -> Optional.<CompoundNBT>ofNullable(var0x.tag))
            )
            .apply(var0, ItemStack::new)
   );
   private static final Logger field39972 = LogManager.getLogger();
   public static final ItemStack EMPTY = new ItemStack((Item)null);
   public static final DecimalFormat field39974 = Util.<DecimalFormat>make(
      new DecimalFormat("#.##"), var0 -> var0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT))
   );
   private static final Style LORE_STYLE = Style.EMPTY.setFormatting(TextFormatting.DARK_PURPLE).setItalic(true);
   public int count;
   private int animationsToGo;
   @Deprecated
   private final Item item;
   private CompoundNBT tag;
   private boolean isEmpty;
   private Entity attachedEntity;
   private CachedBlockInfo canDestroyCacheBlock;
   private boolean canDestroyCacheResult;
   private CachedBlockInfo canPlaceOnCacheBlock;
   private boolean canPlaceOnCacheResult;

   public ItemStack(IItemProvider var1) {
      this(var1, 1);
   }

   private ItemStack(IItemProvider var1, int var2, Optional<CompoundNBT> var3) {
      this(var1, var2);
      var3.ifPresent(this::setTag);
   }

   public ItemStack(IItemProvider var1, int var2) {
      this.item = var1 != null ? var1.asItem() : null;
      this.count = var2;
      if (this.item != null && this.item.isDamageable()) {
         this.method32118(this.method32117());
      }

      this.method32103();
   }

   private void method32103() {
      this.isEmpty = false;
      this.isEmpty = this.isEmpty();
   }

   private ItemStack(CompoundNBT var1) {
      this.item = Registry.ITEM.getOrDefault(new ResourceLocation(var1.getString("id")));
      this.count = var1.getByte("Count");
      if (var1.contains("tag", 10)) {
         this.tag = var1.getCompound("tag");
         this.getItem().method11705(var1);
      }

      if (this.getItem().isDamageable()) {
         this.method32118(this.method32117());
      }

      this.method32103();
   }

   public static ItemStack read(CompoundNBT var0) {
      try {
         return new ItemStack(var0);
      } catch (RuntimeException var4) {
         field39972.debug("Tried to load invalid item: {}", var0, var4);
         return EMPTY;
      }
   }

   public boolean isEmpty() {
      if (this != EMPTY) {
         return this.getItem() != null && this.getItem() != Items.AIR ? this.count <= 0 : true;
      } else {
         return true;
      }
   }

   public ItemStack split(int var1) {
      int var4 = Math.min(var1, this.count);
      ItemStack var5 = this.copy();
      var5.setCount(var4);
      this.shrink(var4);
      return var5;
   }

   public Item getItem() {
      return !this.isEmpty ? this.item : Items.AIR;
   }

   public ActionResultType onItemUse(ItemUseContext var1) {
      PlayerEntity var4 = var1.method18358();
      BlockPos var5 = var1.getPos();
      CachedBlockInfo var6 = new CachedBlockInfo(var1.getWorld(), var5, false);
      if (var4 != null && !var4.abilities.allowEdit && !this.method32176(var1.getWorld().method6817(), var6)) {
         return ActionResultType.field14820;
      } else {
         Item var7 = this.getItem();
         ActionResultType var8 = var7.onItemUse(var1);
         if (var4 != null && var8.isSuccessOrConsume()) {
            var4.addStat(Stats.field40098.method172(var7));
         }

         return var8;
      }
   }

   public float method32109(BlockState var1) {
      return this.getItem().getDestroySpeed(this, var1);
   }

   public ActionResult<ItemStack> method32110(World var1, PlayerEntity var2, Hand var3) {
      return this.getItem().method11700(var1, var2, var3);
   }

   public ItemStack method32111(World var1, LivingEntity var2) {
      return this.getItem().onItemUseFinish(this, var1, var2);
   }

   public CompoundNBT method32112(CompoundNBT var1) {
      ResourceLocation var4 = Registry.ITEM.getKey(this.getItem());
      var1.putString("id", var4 != null ? var4.toString() : "minecraft:air");
      var1.putByte("Count", (byte)this.count);
      if (this.tag != null) {
         var1.put("tag", this.tag.copy());
      }

      return var1;
   }

   public int getMaxStackSize() {
      return this.getItem().getMaxStackSize();
   }

   public boolean method32114() {
      return this.getMaxStackSize() > 1 && (!this.method32115() || !this.method32116());
   }

   public boolean method32115() {
      if (!this.isEmpty && this.getItem().getMaxDamage() > 0) {
         CompoundNBT var3 = this.getTag();
         return var3 == null || !var3.getBoolean("Unbreakable");
      } else {
         return false;
      }
   }

   public boolean method32116() {
      return this.method32115() && this.method32117() > 0;
   }

   public int method32117() {
      return this.tag != null ? this.tag.getInt("Damage") : 0;
   }

   public void method32118(int var1) {
      this.getOrCreateTag().putInt("Damage", Math.max(0, var1));
   }

   public int method32119() {
      return this.getItem().getMaxDamage();
   }

   public boolean method32120(int var1, Random var2, ServerPlayerEntity var3) {
      if (!this.method32115()) {
         return false;
      } else {
         if (var1 > 0) {
            int var6 = EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, this);
            int var7 = 0;

            for (int var8 = 0; var6 > 0 && var8 < var1; var8++) {
               if (UnbreakingEnchantment.method18833(this, var6, var2)) {
                  var7++;
               }
            }

            var1 -= var7;
            if (var1 <= 0) {
               return false;
            }
         }

         if (var3 != null && var1 != 0) {
            CriteriaTriggers.field44484.method15106(var3, this, this.method32117() + var1);
         }

         int var9 = this.method32117() + var1;
         this.method32118(var9);
         return var9 >= this.method32119();
      }
   }

   public <T extends LivingEntity> void damageItem(int var1, T var2, Consumer<T> var3) {
      if (!var2.world.isRemote
         && (!(var2 instanceof PlayerEntity) || !((PlayerEntity)var2).abilities.isCreativeMode)
         && this.method32115()
         && this.method32120(var1, var2.getRNG(), !(var2 instanceof ServerPlayerEntity) ? null : (ServerPlayerEntity)var2)) {
         var3.accept(var2);
         Item var6 = this.getItem();
         this.shrink(1);
         if (var2 instanceof PlayerEntity) {
            ((PlayerEntity)var2).addStat(Stats.field40099.method172(var6));
         }

         this.method32118(0);
      }
   }

   public void hitEntity(LivingEntity var1, PlayerEntity var2) {
      Item var5 = this.getItem();
      if (var5.hitEntity(this, var1, var2)) {
         var2.addStat(Stats.field40098.method172(var5));
      }
   }

   public void method32123(World var1, BlockState var2, BlockPos var3, PlayerEntity var4) {
      Item var7 = this.getItem();
      if (var7.onBlockDestroyed(this, var1, var2, var3, var4)) {
         var4.addStat(Stats.field40098.method172(var7));
      }
   }

   public boolean method32124(BlockState var1) {
      return this.getItem().canHarvestBlock(var1);
   }

   public ActionResultType method32125(PlayerEntity var1, LivingEntity var2, Hand var3) {
      return this.getItem().method11716(this, var1, var2, var3);
   }

   public ItemStack copy() {
      if (!this.isEmpty()) {
         ItemStack var3 = new ItemStack(this.getItem(), this.count);
         var3.method32178(this.method32177());
         if (this.tag != null) {
            var3.tag = this.tag.copy();
         }

         return var3;
      } else {
         return EMPTY;
      }
   }

   public static boolean method32127(ItemStack var0, ItemStack var1) {
      if (var0.isEmpty() && var1.isEmpty()) {
         return true;
      } else if (var0.isEmpty() || var1.isEmpty()) {
         return false;
      } else {
         return var0.tag == null && var1.tag != null ? false : var0.tag == null || var0.tag.equals(var1.tag);
      }
   }

   public static boolean areItemStacksEqual(ItemStack var0, ItemStack var1) {
      if (var0.isEmpty() && var1.isEmpty()) {
         return true;
      } else {
         return !var0.isEmpty() && !var1.isEmpty() ? var0.method32129(var1) : false;
      }
   }

   private boolean method32129(ItemStack var1) {
      if (this.count != var1.count) {
         return false;
      } else if (this.getItem() == var1.getItem()) {
         return this.tag == null && var1.tag != null ? false : this.tag == null || this.tag.equals(var1.tag);
      } else {
         return false;
      }
   }

   public static boolean areItemsEqualIgnoreDurability(ItemStack var0, ItemStack var1) {
      if (var0 == var1) {
         return true;
      } else {
         return !var0.isEmpty() && !var1.isEmpty() ? var0.method32133(var1) : false;
      }
   }

   public boolean method32132(ItemStack var1) {
      return !var1.isEmpty() && this.getItem() == var1.getItem();
   }

   public boolean method32133(ItemStack var1) {
      return !this.method32115() ? this.method32132(var1) : !var1.isEmpty() && this.getItem() == var1.getItem();
   }

   public String getTranslationKey() {
      return this.getItem().method11720(this);
   }

   @Override
   public String toString() {
      return this.count + " " + this.getItem();
   }

   public void method32135(World var1, Entity var2, int var3, boolean var4) {
      if (this.animationsToGo > 0) {
         this.animationsToGo--;
      }

      if (this.getItem() != null) {
         this.getItem().method11724(this, var1, var2, var3, var4);
      }
   }

   public void method32136(World var1, PlayerEntity var2, int var3) {
      var2.method2776(Stats.field40097.method172(this.getItem()), var3);
      this.getItem().method11725(this, var1, var2);
   }

   public int getUseDuration() {
      return this.getItem().method11728(this);
   }

   public UseAction getUseAction() {
      return this.getItem().method11727(this);
   }

   public void method32139(World var1, LivingEntity var2, int var3) {
      this.getItem().method11729(this, var1, var2, var3);
   }

   public boolean method32140() {
      return this.getItem().method11741(this);
   }

   public boolean method32141() {
      return !this.isEmpty && this.tag != null && !this.tag.isEmpty();
   }

   @Nullable
   public CompoundNBT getTag() {
      return this.tag;
   }

   public CompoundNBT getOrCreateTag() {
      if (this.tag == null) {
         this.setTag(new CompoundNBT());
      }

      return this.tag;
   }

   public CompoundNBT method32144(String var1) {
      if (this.tag != null && this.tag.contains(var1, 10)) {
         return this.tag.getCompound(var1);
      } else {
         CompoundNBT var4 = new CompoundNBT();
         this.setTagInfo(var1, var4);
         return var4;
      }
   }

   @Nullable
   public CompoundNBT method32145(String var1) {
      return this.tag != null && this.tag.contains(var1, 10) ? this.tag.getCompound(var1) : null;
   }

   public void method32146(String var1) {
      if (this.tag != null && this.tag.contains(var1)) {
         this.tag.remove(var1);
         if (this.tag.isEmpty()) {
            this.tag = null;
         }
      }
   }

   public ListNBT method32147() {
      return this.tag == null ? new ListNBT() : this.tag.getList("Enchantments", 10);
   }

   public void setTag(CompoundNBT var1) {
      this.tag = var1;
      if (this.getItem().isDamageable()) {
         this.method32118(this.method32117());
      }
   }

   public ITextComponent method32149() {
      CompoundNBT var3 = this.method32145("display");
      if (var3 != null && var3.contains("Name", 8)) {
         try {
            IFormattableTextComponent var4 = ITextComponent.Serializer.getComponentFromJson(var3.getString("Name"));
            if (var4 != null) {
               return var4;
            }

            var3.remove("Name");
         } catch (JsonParseException var5) {
            var3.remove("Name");
         }
      }

      return this.getItem().method11731(this);
   }

   public ItemStack method32150(ITextComponent var1) {
      CompoundNBT var4 = this.method32144("display");
      if (var1 == null) {
         var4.remove("Name");
      } else {
         var4.putString("Name", ITextComponent.Serializer.toJson(var1));
      }

      return this;
   }

   public void method32151() {
      CompoundNBT var3 = this.method32145("display");
      if (var3 != null) {
         var3.remove("Name");
         if (var3.isEmpty()) {
            this.method32146("display");
         }
      }

      if (this.tag != null && this.tag.isEmpty()) {
         this.tag = null;
      }
   }

   public boolean method32152() {
      CompoundNBT var3 = this.method32145("display");
      return var3 != null && var3.contains("Name", 8);
   }

   public List<ITextComponent> getTooltip(PlayerEntity var1, Class2216 var2) {
      ArrayList var5 = Lists.newArrayList();
      IFormattableTextComponent var6 = new StringTextComponent("").append(this.method32149()).mergeStyle(this.method32160().field12889);
      if (this.method32152()) {
         var6.mergeStyle(TextFormatting.ITALIC);
      }

      var5.add(var6);
      if (!var2.method8944() && !this.method32152() && this.getItem() == Items.field37955) {
         var5.add(new StringTextComponent("#" + Class3316.method11862(this)).mergeStyle(TextFormatting.GRAY));
      }

      int var7 = this.method32155();
      if (method32154(var7, Class2304.field15735)) {
         this.getItem().method11730(this, var1 == null ? null : var1.world, var5, var2);
      }

      if (this.method32141()) {
         if (method32154(var7, Class2304.field15730)) {
            method32157(var5, this.method32147());
         }

         if (this.tag.contains("display", 10)) {
            CompoundNBT var8 = this.tag.getCompound("display");
            if (method32154(var7, Class2304.field15736) && var8.contains("color", 99)) {
               if (var2.method8944()) {
                  var5.add(new TranslationTextComponent("item.color", String.format("#%06X", var8.getInt("color"))).mergeStyle(TextFormatting.GRAY));
               } else {
                  var5.add(new TranslationTextComponent("item.dyed").mergeStyle(new TextFormatting[]{TextFormatting.GRAY, TextFormatting.ITALIC}));
               }
            }

            if (var8.getTagID("Lore") == 9) {
               ListNBT var9 = var8.getList("Lore", 8);

               for (int var10 = 0; var10 < var9.size(); var10++) {
                  String var11 = var9.getString(var10);

                  try {
                     IFormattableTextComponent var12 = ITextComponent.Serializer.getComponentFromJson(var11);
                     if (var12 != null) {
                        var5.add(TextComponentUtils.func_240648_a_(var12, LORE_STYLE));
                     }
                  } catch (JsonParseException var21) {
                     var8.remove("Lore");
                  }
               }
            }
         }
      }

      if (method32154(var7, Class2304.field15731)) {
         for (EquipmentSlotType var29 : EquipmentSlotType.values()) {
            Multimap<Attribute, AttributeModifier> var30 = this.method32171(var29);
            if (!var30.isEmpty()) {
               var5.add(StringTextComponent.EMPTY);
               var5.add(new TranslationTextComponent("item.modifiers." + var29.getName()).mergeStyle(TextFormatting.GRAY));

               for (Entry var14 : var30.entries()) {
                  AttributeModifier var15 = (AttributeModifier)var14.getValue();
                  double var16 = var15.getAmount();
                  boolean var18 = false;
                  if (var1 != null) {
                     if (var15.getID() == Item.ATTACK_DAMAGE_MODIFIER) {
                        var16 += var1.method3087(Attributes.ATTACK_DAMAGE);
                        var16 += (double) EnchantmentHelper.getModifierForCreature(this, CreatureAttribute.UNDEFINED);
                        var18 = true;
                     } else if (var15.getID() == Item.ATTACK_SPEED_MODIFIER) {
                        var16 += var1.method3087(Attributes.ATTACK_SPEED);
                        var18 = true;
                     }
                  }

                  double var19;
                  if (var15.getOperation() == AttributeModifier.Operation.field13353 || var15.getOperation() == AttributeModifier.Operation.MULTIPLY_TOTAL) {
                     var19 = var16 * 100.0;
                  } else if (((Attribute)var14.getKey()).equals(Attributes.KNOCKBACK_RESISTANCE)) {
                     var19 = var16 * 10.0;
                  } else {
                     var19 = var16;
                  }

                  if (var18) {
                     var5.add(
                        new StringTextComponent(" ")
                           .append(
                              new TranslationTextComponent(
                                 "attribute.modifier.equals." + var15.getOperation().getId(),
                                 field39974.format(var19),
                                 new TranslationTextComponent(((Attribute)var14.getKey()).getAttributeName())
                              )
                           )
                           .mergeStyle(TextFormatting.DARK_GREEN)
                     );
                  } else if (var16 > 0.0) {
                     var5.add(
                        new TranslationTextComponent(
                              "attribute.modifier.plus." + var15.getOperation().getId(),
                              field39974.format(var19),
                              new TranslationTextComponent(((Attribute)var14.getKey()).getAttributeName())
                           )
                           .mergeStyle(TextFormatting.BLUE)
                     );
                  } else if (var16 < 0.0) {
                     var19 *= -1.0;
                     var5.add(
                        new TranslationTextComponent(
                              "attribute.modifier.take." + var15.getOperation().getId(),
                              field39974.format(var19),
                              new TranslationTextComponent(((Attribute)var14.getKey()).getAttributeName())
                           )
                           .mergeStyle(TextFormatting.RED)
                     );
                  }
               }
            }
         }
      }

      if (this.method32141()) {
         if (method32154(var7, Class2304.field15732) && this.tag.getBoolean("Unbreakable")) {
            var5.add(new TranslationTextComponent("item.unbreakable").mergeStyle(TextFormatting.BLUE));
         }

         if (method32154(var7, Class2304.field15733) && this.tag.contains("CanDestroy", 9)) {
            ListNBT var23 = this.tag.getList("CanDestroy", 8);
            if (!var23.isEmpty()) {
               var5.add(StringTextComponent.EMPTY);
               var5.add(new TranslationTextComponent("item.canBreak").mergeStyle(TextFormatting.GRAY));

               for (int var26 = 0; var26 < var23.size(); var26++) {
                  var5.addAll(method32158(var23.getString(var26)));
               }
            }
         }

         if (method32154(var7, Class2304.field15734) && this.tag.contains("CanPlaceOn", 9)) {
            ListNBT var24 = this.tag.getList("CanPlaceOn", 8);
            if (!var24.isEmpty()) {
               var5.add(StringTextComponent.EMPTY);
               var5.add(new TranslationTextComponent("item.canPlace").mergeStyle(TextFormatting.GRAY));

               for (int var27 = 0; var27 < var24.size(); var27++) {
                  var5.addAll(method32158(var24.getString(var27)));
               }
            }
         }
      }

      if (var2.method8944()) {
         if (this.method32116()) {
            var5.add(new TranslationTextComponent("item.durability", this.method32119() - this.method32117(), this.method32119()));
         }

         var5.add(new StringTextComponent(Registry.ITEM.getKey(this.getItem()).toString()).mergeStyle(TextFormatting.DARK_GRAY));
         if (this.method32141()) {
            var5.add(new TranslationTextComponent("item.nbt_tags", this.tag.keySet().size()).mergeStyle(TextFormatting.DARK_GRAY));
         }
      }

      return var5;
   }

   private static boolean method32154(int var0, Class2304 var1) {
      return (var0 & var1.method9072()) == 0;
   }

   private int method32155() {
      return this.method32141() && this.tag.contains("HideFlags", 99) ? this.tag.getInt("HideFlags") : 0;
   }

   public void method32156(Class2304 var1) {
      CompoundNBT var4 = this.getOrCreateTag();
      var4.putInt("HideFlags", var4.getInt("HideFlags") | var1.method9072());
   }

   public static void method32157(List<ITextComponent> var0, ListNBT var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         CompoundNBT var5 = var1.getCompound(var4);
         Registry.ENCHANTMENT.method9187(ResourceLocation.method8289(var5.getString("id"))).ifPresent(var2 -> var0.add(var2.method18820(var5.getInt("lvl"))));
      }
   }

   private static Collection<ITextComponent> method32158(String var0) {
      try {
         Class8268 var3 = new Class8268(new StringReader(var0), true).method28840(true);
         BlockState var4 = var3.method28837();
         ResourceLocation var5 = var3.method28839();
         boolean var6 = var4 != null;
         boolean var7 = var5 != null;
         if (var6 || var7) {
            if (var6) {
               return Lists.newArrayList(new ITextComponent[]{var4.getBlock().method11565().mergeStyle(TextFormatting.DARK_GRAY)});
            }

            ITag<Block> var8 = BlockTags.getCollection().get(var5);
            if (var8 != null) {
               List<Block> var9 = var8.getAllElements();
               if (!var9.isEmpty()) {
                  return var9.stream()
                     .map(Block::method11565)
                     .map(var0x -> var0x.mergeStyle(TextFormatting.DARK_GRAY))
                     .collect(Collectors.toList());
               }
            }
         }
      } catch (CommandSyntaxException var10) {
      }

      return Lists.newArrayList(new ITextComponent[]{new StringTextComponent("missingno").mergeStyle(TextFormatting.DARK_GRAY)});
   }

   public boolean method32159() {
      return this.getItem().method11732(this);
   }

   public Class1978 method32160() {
      return this.getItem().method11733(this);
   }

   public boolean method32161() {
      return this.getItem().method11734(this) ? !this.method32163() : false;
   }

   public void method32162(Enchantment var1, int var2) {
      this.getOrCreateTag();
      if (!this.tag.contains("Enchantments", 9)) {
         this.tag.put("Enchantments", new ListNBT());
      }

      ListNBT var5 = this.tag.getList("Enchantments", 10);
      CompoundNBT var6 = new CompoundNBT();
      var6.putString("id", String.valueOf(Registry.ENCHANTMENT.getKey(var1)));
      var6.putShort("lvl", (short)((byte)var2));
      var5.add(var6);
   }

   public boolean method32163() {
      return this.tag != null && this.tag.contains("Enchantments", 9) ? !this.tag.getList("Enchantments", 10).isEmpty() : false;
   }

   public void setTagInfo(String var1, INBT var2) {
      this.getOrCreateTag().put(var1, var2);
   }

   public boolean method32165() {
      return this.attachedEntity instanceof ItemFrameEntity;
   }

   public void method32166(Entity var1) {
      this.attachedEntity = var1;
   }

   @Nullable
   public ItemFrameEntity method32167() {
      return !(this.attachedEntity instanceof ItemFrameEntity) ? null : (ItemFrameEntity)this.method32168();
   }

   @Nullable
   public Entity method32168() {
      return this.isEmpty ? null : this.attachedEntity;
   }

   public int method32169() {
      return this.method32141() && this.tag.contains("RepairCost", 3) ? this.tag.getInt("RepairCost") : 0;
   }

   public void method32170(int var1) {
      this.getOrCreateTag().putInt("RepairCost", var1);
   }

   public Multimap<Attribute, AttributeModifier> method32171(EquipmentSlotType var1) {
      Multimap<Attribute, AttributeModifier> var4;
      if (this.method32141() && this.tag.contains("AttributeModifiers", 9)) {
         var4 = HashMultimap.create();
         ListNBT var5 = this.tag.getList("AttributeModifiers", 10);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            CompoundNBT var7 = var5.getCompound(var6);
            if (!var7.contains("Slot", 8) || var7.getString("Slot").equals(var1.getName())) {
               Optional<Attribute> var8 = Registry.ATTRIBUTE.method9187(ResourceLocation.method8289(var7.getString("AttributeName")));
               if (var8.isPresent()) {
                  AttributeModifier var9 = AttributeModifier.method37935(var7);
                  if (var9 != null && var9.getID().getLeastSignificantBits() != 0L && var9.getID().getMostSignificantBits() != 0L) {
                     var4.put(var8.get(), var9);
                  }
               }
            }
         }
      } else {
         var4 = this.getItem().getAttributeModifiers(var1);
      }

      return var4;
   }

   public void method32172(Attribute var1, AttributeModifier var2, EquipmentSlotType var3) {
      this.getOrCreateTag();
      if (!this.tag.contains("AttributeModifiers", 9)) {
         this.tag.put("AttributeModifiers", new ListNBT());
      }

      ListNBT var6 = this.tag.getList("AttributeModifiers", 10);
      CompoundNBT var7 = var2.method37934();
      var7.putString("AttributeName", Registry.ATTRIBUTE.getKey(var1).toString());
      if (var3 != null) {
         var7.putString("Slot", var3.getName());
      }

      var6.add(var7);
   }

   public ITextComponent method32173() {
      IFormattableTextComponent var3 = new StringTextComponent("").append(this.method32149());
      if (this.method32152()) {
         var3.mergeStyle(TextFormatting.ITALIC);
      }

      IFormattableTextComponent var4 = TextComponentUtils.wrapWithSquareBrackets(var3);
      if (!this.isEmpty) {
         var4.mergeStyle(this.method32160().field12889)
            .modifyStyle(var1 -> var1.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_ITEM, new HoverEvent.ItemHover(this))));
      }

      return var4;
   }

   private static boolean method32174(CachedBlockInfo var0, CachedBlockInfo var1) {
      if (var1 == null || var0.method37548() != var1.method37548()) {
         return false;
      } else if (var0.method37549() == null && var1.method37549() == null) {
         return true;
      } else {
         return var0.method37549() != null && var1.method37549() != null
            ? Objects.equals(var0.method37549().write(new CompoundNBT()), var1.method37549().write(new CompoundNBT()))
            : false;
      }
   }

   public boolean method32175(ITagCollectionSupplier var1, CachedBlockInfo var2) {
      if (method32174(var2, this.canDestroyCacheBlock)) {
         return this.canDestroyCacheResult;
      } else {
         this.canDestroyCacheBlock = var2;
         if (this.method32141() && this.tag.contains("CanDestroy", 9)) {
            ListNBT var5 = this.tag.getList("CanDestroy", 8);

            for (int var6 = 0; var6 < var5.size(); var6++) {
               String var7 = var5.getString(var6);

               try {
                  Predicate var8 = Class7505.method24464().parse(new StringReader(var7)).method29657(var1);
                  if (var8.test(var2)) {
                     this.canDestroyCacheResult = true;
                     return true;
                  }
               } catch (CommandSyntaxException var9) {
               }
            }
         }

         this.canDestroyCacheResult = false;
         return false;
      }
   }

   public boolean method32176(ITagCollectionSupplier var1, CachedBlockInfo var2) {
      if (method32174(var2, this.canPlaceOnCacheBlock)) {
         return this.canPlaceOnCacheResult;
      } else {
         this.canPlaceOnCacheBlock = var2;
         if (this.method32141() && this.tag.contains("CanPlaceOn", 9)) {
            ListNBT var5 = this.tag.getList("CanPlaceOn", 8);

            for (int var6 = 0; var6 < var5.size(); var6++) {
               String var7 = var5.getString(var6);

               try {
                  Predicate var8 = Class7505.method24464().parse(new StringReader(var7)).method29657(var1);
                  if (var8.test(var2)) {
                     this.canPlaceOnCacheResult = true;
                     return true;
                  }
               } catch (CommandSyntaxException var9) {
               }
            }
         }

         this.canPlaceOnCacheResult = false;
         return false;
      }
   }

   public int method32177() {
      return this.animationsToGo;
   }

   public void method32178(int var1) {
      this.animationsToGo = var1;
   }

   public int getCount() {
      return !this.isEmpty ? this.count : 0;
   }

   public void setCount(int var1) {
      this.count = var1;
      this.method32103();
   }

   public void grow(int var1) {
      this.setCount(this.count + var1);
   }

   public void shrink(int var1) {
      this.grow(-var1);
   }

   public void onItemUsed(World var1, LivingEntity var2, int var3) {
      this.getItem().method11704(var1, var2, this, var3);
   }

   public boolean isFood() {
      return this.getItem().isFood();
   }

   public SoundEvent getDrinkSound() {
      return this.getItem().getDrinkSound();
   }

   public SoundEvent getEatSound() {
      return this.getItem().getEatSound();
   }
}
