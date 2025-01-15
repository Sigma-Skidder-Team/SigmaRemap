package net.minecraft.item;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.gson.JsonParseException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.command.arguments.BlockPredicateArgument;
import net.minecraft.command.arguments.BlockStateParser;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.UnbreakingEnchantment;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.stats.Stats;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.NetworkTagManager;
import net.minecraft.tags.Tag;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.CachedBlockInfo;
import net.minecraft.util.Hand;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
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

public final class ItemStack
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final ItemStack EMPTY = new ItemStack((Item)null);
    public static final DecimalFormat DECIMALFORMAT = createAttributeModifierDecimalFormat();
    private int count;
    private int animationsToGo;
    @Deprecated
    private final Item item;
    private CompoundNBT tag;
    private boolean isEmpty;
    private ItemFrameEntity itemFrame;
    private CachedBlockInfo canDestroyCacheBlock;
    private boolean canDestroyCacheResult;
    private CachedBlockInfo canPlaceOnCacheBlock;
    private boolean canPlaceOnCacheResult;

    private static DecimalFormat createAttributeModifierDecimalFormat()
    {
        DecimalFormat decimalformat = new DecimalFormat("#.##");
        decimalformat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
        return decimalformat;
    }

    public ItemStack(IItemProvider p_i1984_1_)
    {
        this(p_i1984_1_, 1);
    }

    public ItemStack(IItemProvider p_i1985_1_, int p_i1985_2_)
    {
        this.item = p_i1985_1_ == null ? null : p_i1985_1_.asItem();
        this.count = p_i1985_2_;

        if (this.item != null && this.item.isDamageable())
        {
            this.setDamage(this.getDamage());
        }

        this.updateEmptyState();
    }

    private void updateEmptyState()
    {
        this.isEmpty = false;
        this.isEmpty = this.isEmpty();
    }

    private ItemStack(CompoundNBT p_i1986_1_)
    {
        this.item = Registry.ITEM.getOrDefault(new ResourceLocation(p_i1986_1_.getString("id")));
        this.count = p_i1986_1_.getByte("Count");

        if (p_i1986_1_.contains("tag", 10))
        {
            this.tag = p_i1986_1_.getCompound("tag");
            this.getItem().updateItemStackNBT(p_i1986_1_);
        }

        if (this.getItem().isDamageable())
        {
            this.setDamage(this.getDamage());
        }

        this.updateEmptyState();
    }

    public static ItemStack read(CompoundNBT compound)
    {
        try
        {
            return new ItemStack(compound);
        }
        catch (RuntimeException runtimeexception)
        {
            LOGGER.debug("Tried to load invalid item: {}", compound, runtimeexception);
            return EMPTY;
        }
    }

    public boolean isEmpty()
    {
        if (this == EMPTY)
        {
            return true;
        }
        else if (this.getItem() != null && this.getItem() != Items.AIR)
        {
            return this.count <= 0;
        }
        else
        {
            return true;
        }
    }

    public ItemStack split(int amount)
    {
        int i = Math.min(amount, this.count);
        ItemStack itemstack = this.copy();
        itemstack.setCount(i);
        this.shrink(i);
        return itemstack;
    }

    public Item getItem()
    {
        return this.isEmpty ? Items.AIR : this.item;
    }

    public ActionResultType onItemUse(ItemUseContext context)
    {
        PlayerEntity playerentity = context.getPlayer();
        BlockPos blockpos = context.getPos();
        CachedBlockInfo cachedblockinfo = new CachedBlockInfo(context.getWorld(), blockpos, false);

        if (playerentity != null && !playerentity.abilities.allowEdit && !this.canPlaceOn(context.getWorld().getTags(), cachedblockinfo))
        {
            return ActionResultType.PASS;
        }
        else
        {
            Item item = this.getItem();
            ActionResultType actionresulttype = item.onItemUse(context);

            if (playerentity != null && actionresulttype == ActionResultType.SUCCESS)
            {
                playerentity.addStat(Stats.ITEM_USED.get(item));
            }

            return actionresulttype;
        }
    }

    public float getDestroySpeed(BlockState blockIn)
    {
        return this.getItem().getDestroySpeed(this, blockIn);
    }

    public ActionResult<ItemStack> useItemRightClick(World worldIn, PlayerEntity playerIn, Hand hand)
    {
        return this.getItem().onItemRightClick(worldIn, playerIn, hand);
    }

    public ItemStack onItemUseFinish(World worldIn, LivingEntity entityLiving)
    {
        return this.getItem().onItemUseFinish(this, worldIn, entityLiving);
    }

    public CompoundNBT write(CompoundNBT nbt)
    {
        ResourceLocation resourcelocation = Registry.ITEM.getKey(this.getItem());
        nbt.putString("id", resourcelocation == null ? "minecraft:air" : resourcelocation.toString());
        nbt.putByte("Count", (byte)this.count);

        if (this.tag != null)
        {
            nbt.put("tag", this.tag.copy());
        }

        return nbt;
    }

    public int getMaxStackSize()
    {
        return this.getItem().getMaxStackSize();
    }

    public boolean isStackable()
    {
        return this.getMaxStackSize() > 1 && (!this.isDamageable() || !this.isDamaged());
    }

    public boolean isDamageable()
    {
        if (!this.isEmpty && this.getItem().getMaxDamage() > 0)
        {
            CompoundNBT compoundnbt = this.getTag();
            return compoundnbt == null || !compoundnbt.getBoolean("Unbreakable");
        }
        else
        {
            return false;
        }
    }

    public boolean isDamaged()
    {
        return this.isDamageable() && this.getDamage() > 0;
    }

    public int getDamage()
    {
        return this.tag == null ? 0 : this.tag.getInt("Damage");
    }

    public void setDamage(int damage)
    {
        this.getOrCreateTag().putInt("Damage", Math.max(0, damage));
    }

    public int getMaxDamage()
    {
        return this.getItem().getMaxDamage();
    }

    public boolean attemptDamageItem(int amount, Random rand, @Nullable ServerPlayerEntity damager)
    {
        if (!this.isDamageable())
        {
            return false;
        }
        else
        {
            if (amount > 0)
            {
                int i = EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, this);
                int j = 0;

                for (int k = 0; i > 0 && k < amount; ++k)
                {
                    if (UnbreakingEnchantment.negateDamage(this, i, rand))
                    {
                        ++j;
                    }
                }

                amount -= j;

                if (amount <= 0)
                {
                    return false;
                }
            }

            if (damager != null && amount != 0)
            {
                CriteriaTriggers.ITEM_DURABILITY_CHANGED.trigger(damager, this, this.getDamage() + amount);
            }

            int l = this.getDamage() + amount;
            this.setDamage(l);
            return l >= this.getMaxDamage();
        }
    }

    public <T extends LivingEntity> void damageItem(int amount, T entityIn, Consumer<T> onBroken)
    {
        if (!entityIn.world.isRemote && (!(entityIn instanceof PlayerEntity) || !((PlayerEntity)entityIn).abilities.isCreativeMode))
        {
            if (this.isDamageable())
            {
                if (this.attemptDamageItem(amount, entityIn.getRNG(), entityIn instanceof ServerPlayerEntity ? (ServerPlayerEntity)entityIn : null))
                {
                    onBroken.accept(entityIn);
                    Item item = this.getItem();
                    this.shrink(1);

                    if (entityIn instanceof PlayerEntity)
                    {
                        ((PlayerEntity)entityIn).addStat(Stats.ITEM_BROKEN.get(item));
                    }

                    this.setDamage(0);
                }
            }
        }
    }

    public void hitEntity(LivingEntity entityIn, PlayerEntity playerIn)
    {
        Item item = this.getItem();

        if (item.hitEntity(this, entityIn, playerIn))
        {
            playerIn.addStat(Stats.ITEM_USED.get(item));
        }
    }

    public void onBlockDestroyed(World worldIn, BlockState blockIn, BlockPos pos, PlayerEntity playerIn)
    {
        Item item = this.getItem();

        if (item.onBlockDestroyed(this, worldIn, blockIn, pos, playerIn))
        {
            playerIn.addStat(Stats.ITEM_USED.get(item));
        }
    }

    public boolean canHarvestBlock(BlockState blockIn)
    {
        return this.getItem().canHarvestBlock(blockIn);
    }

    public boolean interactWithEntity(PlayerEntity playerIn, LivingEntity entityIn, Hand hand)
    {
        return this.getItem().itemInteractionForEntity(this, playerIn, entityIn, hand);
    }

    public ItemStack copy()
    {
        if (this.isEmpty())
        {
            return EMPTY;
        }
        else
        {
            ItemStack itemstack = new ItemStack(this.getItem(), this.count);
            itemstack.setAnimationsToGo(this.getAnimationsToGo());

            if (this.tag != null)
            {
                itemstack.tag = this.tag.copy();
            }

            return itemstack;
        }
    }

    public static boolean areItemStackTagsEqual(ItemStack stackA, ItemStack stackB)
    {
        if (stackA.isEmpty() && stackB.isEmpty())
        {
            return true;
        }
        else if (!stackA.isEmpty() && !stackB.isEmpty())
        {
            if (stackA.tag == null && stackB.tag != null)
            {
                return false;
            }
            else
            {
                return stackA.tag == null || stackA.tag.equals(stackB.tag);
            }
        }
        else
        {
            return false;
        }
    }

    public static boolean areItemStacksEqual(ItemStack stackA, ItemStack stackB)
    {
        if (stackA.isEmpty() && stackB.isEmpty())
        {
            return true;
        }
        else
        {
            return !stackA.isEmpty() && !stackB.isEmpty() ? stackA.isItemStackEqual(stackB) : false;
        }
    }

    private boolean isItemStackEqual(ItemStack other)
    {
        if (this.count != other.count)
        {
            return false;
        }
        else if (this.getItem() != other.getItem())
        {
            return false;
        }
        else if (this.tag == null && other.tag != null)
        {
            return false;
        }
        else
        {
            return this.tag == null || this.tag.equals(other.tag);
        }
    }

    public static boolean areItemsEqual(ItemStack stackA, ItemStack stackB)
    {
        if (stackA == stackB)
        {
            return true;
        }
        else
        {
            return !stackA.isEmpty() && !stackB.isEmpty() ? stackA.isItemEqual(stackB) : false;
        }
    }

    public static boolean areItemsEqualIgnoreDurability(ItemStack stackA, ItemStack stackB)
    {
        if (stackA == stackB)
        {
            return true;
        }
        else
        {
            return !stackA.isEmpty() && !stackB.isEmpty() ? stackA.isItemEqualIgnoreDurability(stackB) : false;
        }
    }

    public boolean isItemEqual(ItemStack other)
    {
        return !other.isEmpty() && this.getItem() == other.getItem();
    }

    public boolean isItemEqualIgnoreDurability(ItemStack stack)
    {
        if (!this.isDamageable())
        {
            return this.isItemEqual(stack);
        }
        else
        {
            return !stack.isEmpty() && this.getItem() == stack.getItem();
        }
    }

    public String getTranslationKey()
    {
        return this.getItem().getTranslationKey(this);
    }

    public String toString()
    {
        return this.count + " " + this.getItem();
    }

    public void inventoryTick(World worldIn, Entity entityIn, int inventorySlot, boolean isCurrentItem)
    {
        if (this.animationsToGo > 0)
        {
            --this.animationsToGo;
        }

        if (this.getItem() != null)
        {
            this.getItem().inventoryTick(this, worldIn, entityIn, inventorySlot, isCurrentItem);
        }
    }

    public void onCrafting(World worldIn, PlayerEntity playerIn, int amount)
    {
        playerIn.addStat(Stats.ITEM_CRAFTED.get(this.getItem()), amount);
        this.getItem().onCreated(this, worldIn, playerIn);
    }

    public int getUseDuration()
    {
        return this.getItem().getUseDuration(this);
    }

    public UseAction getUseAction()
    {
        return this.getItem().getUseAction(this);
    }

    public void onPlayerStoppedUsing(World worldIn, LivingEntity entityLiving, int timeLeft)
    {
        this.getItem().onPlayerStoppedUsing(this, worldIn, entityLiving, timeLeft);
    }

    public boolean isCrossbowStack()
    {
        return this.getItem().isCrossbow(this);
    }

    public boolean hasTag()
    {
        return !this.isEmpty && this.tag != null && !this.tag.isEmpty();
    }

    @Nullable
    public CompoundNBT getTag()
    {
        return this.tag;
    }

    public CompoundNBT getOrCreateTag()
    {
        if (this.tag == null)
        {
            this.setTag(new CompoundNBT());
        }

        return this.tag;
    }

    public CompoundNBT getOrCreateChildTag(String key)
    {
        if (this.tag != null && this.tag.contains(key, 10))
        {
            return this.tag.getCompound(key);
        }
        else
        {
            CompoundNBT compoundnbt = new CompoundNBT();
            this.setTagInfo(key, compoundnbt);
            return compoundnbt;
        }
    }

    @Nullable
    public CompoundNBT getChildTag(String key)
    {
        return this.tag != null && this.tag.contains(key, 10) ? this.tag.getCompound(key) : null;
    }

    public void removeChildTag(String p_196083_1_)
    {
        if (this.tag != null && this.tag.contains(p_196083_1_))
        {
            this.tag.remove(p_196083_1_);

            if (this.tag.isEmpty())
            {
                this.tag = null;
            }
        }
    }

    public ListNBT getEnchantmentTagList()
    {
        return this.tag != null ? this.tag.getList("Enchantments", 10) : new ListNBT();
    }

    public void setTag(@Nullable CompoundNBT nbt)
    {
        this.tag = nbt;

        if (this.getItem().isDamageable())
        {
            this.setDamage(this.getDamage());
        }
    }

    public ITextComponent getDisplayName()
    {
        CompoundNBT compoundnbt = this.getChildTag("display");

        if (compoundnbt != null && compoundnbt.contains("Name", 8))
        {
            try
            {
                ITextComponent itextcomponent = ITextComponent.Serializer.fromJson(compoundnbt.getString("Name"));

                if (itextcomponent != null)
                {
                    return itextcomponent;
                }

                compoundnbt.remove("Name");
            }
            catch (JsonParseException var3)
            {
                compoundnbt.remove("Name");
            }
        }

        return this.getItem().getDisplayName(this);
    }

    public ItemStack setDisplayName(@Nullable ITextComponent name)
    {
        CompoundNBT compoundnbt = this.getOrCreateChildTag("display");

        if (name != null)
        {
            compoundnbt.putString("Name", ITextComponent.Serializer.toJson(name));
        }
        else
        {
            compoundnbt.remove("Name");
        }

        return this;
    }

    public void clearCustomName()
    {
        CompoundNBT compoundnbt = this.getChildTag("display");

        if (compoundnbt != null)
        {
            compoundnbt.remove("Name");

            if (compoundnbt.isEmpty())
            {
                this.removeChildTag("display");
            }
        }

        if (this.tag != null && this.tag.isEmpty())
        {
            this.tag = null;
        }
    }

    public boolean hasDisplayName()
    {
        CompoundNBT compoundnbt = this.getChildTag("display");
        return compoundnbt != null && compoundnbt.contains("Name", 8);
    }

    public List<ITextComponent> getTooltip(@Nullable PlayerEntity playerIn, ITooltipFlag advanced)
    {
        List<ITextComponent> list = Lists.newArrayList();
        ITextComponent itextcomponent = (new StringTextComponent("")).appendSibling(this.getDisplayName()).applyTextStyle(this.getRarity().color);

        if (this.hasDisplayName())
        {
            itextcomponent.applyTextStyle(TextFormatting.ITALIC);
        }

        list.add(itextcomponent);

        if (!advanced.isAdvanced() && !this.hasDisplayName() && this.getItem() == Items.FILLED_MAP)
        {
            list.add((new StringTextComponent("#" + FilledMapItem.getMapId(this))).applyTextStyle(TextFormatting.GRAY));
        }

        int i = 0;

        if (this.hasTag() && this.tag.contains("HideFlags", 99))
        {
            i = this.tag.getInt("HideFlags");
        }

        if ((i & 32) == 0)
        {
            this.getItem().addInformation(this, playerIn == null ? null : playerIn.world, list, advanced);
        }

        if (this.hasTag())
        {
            if ((i & 1) == 0)
            {
                addEnchantmentTooltips(list, this.getEnchantmentTagList());
            }

            if (this.tag.contains("display", 10))
            {
                CompoundNBT compoundnbt = this.tag.getCompound("display");

                if (compoundnbt.contains("color", 3))
                {
                    if (advanced.isAdvanced())
                    {
                        list.add((new TranslationTextComponent("item.color", String.format("#%06X", compoundnbt.getInt("color")))).applyTextStyle(TextFormatting.GRAY));
                    }
                    else
                    {
                        list.add((new TranslationTextComponent("item.dyed")).applyTextStyles(new TextFormatting[] {TextFormatting.GRAY, TextFormatting.ITALIC}));
                    }
                }

                if (compoundnbt.getTagId("Lore") == 9)
                {
                    ListNBT listnbt = compoundnbt.getList("Lore", 8);

                    for (int j = 0; j < listnbt.size(); ++j)
                    {
                        String s = listnbt.getString(j);

                        try
                        {
                            ITextComponent itextcomponent1 = ITextComponent.Serializer.fromJson(s);

                            if (itextcomponent1 != null)
                            {
                                list.add(TextComponentUtils.mergeStyles(itextcomponent1, (new Style()).setColor(TextFormatting.DARK_PURPLE).setItalic(true)));
                            }
                        }
                        catch (JsonParseException var19)
                        {
                            compoundnbt.remove("Lore");
                        }
                    }
                }
            }
        }

        for (EquipmentSlotType equipmentslottype : EquipmentSlotType.values())
        {
            Multimap<String, AttributeModifier> multimap = this.getAttributeModifiers(equipmentslottype);

            if (!multimap.isEmpty() && (i & 2) == 0)
            {
                list.add(new StringTextComponent(""));
                list.add((new TranslationTextComponent("item.modifiers." + equipmentslottype.getName())).applyTextStyle(TextFormatting.GRAY));

                for (Entry<String, AttributeModifier> entry : multimap.entries())
                {
                    AttributeModifier attributemodifier = entry.getValue();
                    double d0 = attributemodifier.getAmount();
                    boolean flag = false;

                    if (playerIn != null)
                    {
                        if (attributemodifier.getID() == Item.ATTACK_DAMAGE_MODIFIER)
                        {
                            d0 = d0 + playerIn.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getBaseValue();
                            d0 = d0 + (double)EnchantmentHelper.getModifierForCreature(this, CreatureAttribute.UNDEFINED);
                            flag = true;
                        }
                        else if (attributemodifier.getID() == Item.ATTACK_SPEED_MODIFIER)
                        {
                            d0 += playerIn.getAttribute(SharedMonsterAttributes.ATTACK_SPEED).getBaseValue();
                            flag = true;
                        }
                    }

                    double d1;

                    if (attributemodifier.getOperation() != AttributeModifier.Operation.MULTIPLY_BASE && attributemodifier.getOperation() != AttributeModifier.Operation.MULTIPLY_TOTAL)
                    {
                        d1 = d0;
                    }
                    else
                    {
                        d1 = d0 * 100.0D;
                    }

                    if (flag)
                    {
                        list.add((new StringTextComponent(" ")).appendSibling(new TranslationTextComponent("attribute.modifier.equals." + attributemodifier.getOperation().getId(), DECIMALFORMAT.format(d1), new TranslationTextComponent("attribute.name." + (String)entry.getKey()))).applyTextStyle(TextFormatting.DARK_GREEN));
                    }
                    else if (d0 > 0.0D)
                    {
                        list.add((new TranslationTextComponent("attribute.modifier.plus." + attributemodifier.getOperation().getId(), DECIMALFORMAT.format(d1), new TranslationTextComponent("attribute.name." + (String)entry.getKey()))).applyTextStyle(TextFormatting.BLUE));
                    }
                    else if (d0 < 0.0D)
                    {
                        d1 = d1 * -1.0D;
                        list.add((new TranslationTextComponent("attribute.modifier.take." + attributemodifier.getOperation().getId(), DECIMALFORMAT.format(d1), new TranslationTextComponent("attribute.name." + (String)entry.getKey()))).applyTextStyle(TextFormatting.RED));
                    }
                }
            }
        }

        if (this.hasTag() && this.getTag().getBoolean("Unbreakable") && (i & 4) == 0)
        {
            list.add((new TranslationTextComponent("item.unbreakable")).applyTextStyle(TextFormatting.BLUE));
        }

        if (this.hasTag() && this.tag.contains("CanDestroy", 9) && (i & 8) == 0)
        {
            ListNBT listnbt1 = this.tag.getList("CanDestroy", 8);

            if (!listnbt1.isEmpty())
            {
                list.add(new StringTextComponent(""));
                list.add((new TranslationTextComponent("item.canBreak")).applyTextStyle(TextFormatting.GRAY));

                for (int k = 0; k < listnbt1.size(); ++k)
                {
                    list.addAll(getPlacementTooltip(listnbt1.getString(k)));
                }
            }
        }

        if (this.hasTag() && this.tag.contains("CanPlaceOn", 9) && (i & 16) == 0)
        {
            ListNBT listnbt2 = this.tag.getList("CanPlaceOn", 8);

            if (!listnbt2.isEmpty())
            {
                list.add(new StringTextComponent(""));
                list.add((new TranslationTextComponent("item.canPlace")).applyTextStyle(TextFormatting.GRAY));

                for (int l = 0; l < listnbt2.size(); ++l)
                {
                    list.addAll(getPlacementTooltip(listnbt2.getString(l)));
                }
            }
        }

        if (advanced.isAdvanced())
        {
            if (this.isDamaged())
            {
                list.add(new TranslationTextComponent("item.durability", this.getMaxDamage() - this.getDamage(), this.getMaxDamage()));
            }

            list.add((new StringTextComponent(Registry.ITEM.getKey(this.getItem()).toString())).applyTextStyle(TextFormatting.DARK_GRAY));

            if (this.hasTag())
            {
                list.add((new TranslationTextComponent("item.nbt_tags", this.getTag().keySet().size())).applyTextStyle(TextFormatting.DARK_GRAY));
            }
        }

        return list;
    }

    public static void addEnchantmentTooltips(List<ITextComponent> p_222120_0_, ListNBT p_222120_1_)
    {
        for (int i = 0; i < p_222120_1_.size(); ++i)
        {
            CompoundNBT compoundnbt = p_222120_1_.getCompound(i);
            Registry.ENCHANTMENT.getValue(ResourceLocation.tryCreate(compoundnbt.getString("id"))).ifPresent((p_222123_2_) ->
            {
                p_222120_0_.add(p_222123_2_.getDisplayName(compoundnbt.getInt("lvl")));
            });
        }
    }

    private static Collection<ITextComponent> getPlacementTooltip(String stateString)
    {
        try
        {
            BlockStateParser blockstateparser = (new BlockStateParser(new StringReader(stateString), true)).parse(true);
            BlockState blockstate = blockstateparser.getState();
            ResourceLocation resourcelocation = blockstateparser.getTag();
            boolean flag = blockstate != null;
            boolean flag1 = resourcelocation != null;

            if (flag || flag1)
            {
                if (flag)
                {
                    return Lists.newArrayList(blockstate.getBlock().getNameTextComponent().applyTextStyle(TextFormatting.DARK_GRAY));
                }

                Tag<Block> tag = BlockTags.getCollection().get(resourcelocation);

                if (tag != null)
                {
                    Collection<Block> collection = tag.getAllElements();

                    if (!collection.isEmpty())
                    {
                        return collection.stream().map(Block::getNameTextComponent).map((p_222119_0_) ->
                        {
                            return p_222119_0_.applyTextStyle(TextFormatting.DARK_GRAY);
                        }).collect(Collectors.toList());
                    }
                }
            }
        }
        catch (CommandSyntaxException var8)
        {
            ;
        }

        return Lists.newArrayList((new StringTextComponent("missingno")).applyTextStyle(TextFormatting.DARK_GRAY));
    }

    public boolean hasEffect()
    {
        return this.getItem().hasEffect(this);
    }

    public Rarity getRarity()
    {
        return this.getItem().getRarity(this);
    }

    public boolean isEnchantable()
    {
        if (!this.getItem().isEnchantable(this))
        {
            return false;
        }
        else
        {
            return !this.isEnchanted();
        }
    }

    public void addEnchantment(Enchantment ench, int level)
    {
        this.getOrCreateTag();

        if (!this.tag.contains("Enchantments", 9))
        {
            this.tag.put("Enchantments", new ListNBT());
        }

        ListNBT listnbt = this.tag.getList("Enchantments", 10);
        CompoundNBT compoundnbt = new CompoundNBT();
        compoundnbt.putString("id", String.valueOf((Object)Registry.ENCHANTMENT.getKey(ench)));
        compoundnbt.putShort("lvl", (short)((byte)level));
        listnbt.add(compoundnbt);
    }

    public boolean isEnchanted()
    {
        if (this.tag != null && this.tag.contains("Enchantments", 9))
        {
            return !this.tag.getList("Enchantments", 10).isEmpty();
        }
        else
        {
            return false;
        }
    }

    public void setTagInfo(String key, INBT value)
    {
        this.getOrCreateTag().put(key, value);
    }

    public boolean isOnItemFrame()
    {
        return this.itemFrame != null;
    }

    public void setItemFrame(@Nullable ItemFrameEntity frame)
    {
        this.itemFrame = frame;
    }

    @Nullable
    public ItemFrameEntity getItemFrame()
    {
        return this.isEmpty ? null : this.itemFrame;
    }

    public int getRepairCost()
    {
        return this.hasTag() && this.tag.contains("RepairCost", 3) ? this.tag.getInt("RepairCost") : 0;
    }

    public void setRepairCost(int cost)
    {
        this.getOrCreateTag().putInt("RepairCost", cost);
    }

    public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot)
    {
        Multimap<String, AttributeModifier> multimap;

        if (this.hasTag() && this.tag.contains("AttributeModifiers", 9))
        {
            multimap = HashMultimap.create();
            ListNBT listnbt = this.tag.getList("AttributeModifiers", 10);

            for (int i = 0; i < listnbt.size(); ++i)
            {
                CompoundNBT compoundnbt = listnbt.getCompound(i);
                AttributeModifier attributemodifier = SharedMonsterAttributes.readAttributeModifier(compoundnbt);

                if (attributemodifier != null && (!compoundnbt.contains("Slot", 8) || compoundnbt.getString("Slot").equals(equipmentSlot.getName())) && attributemodifier.getID().getLeastSignificantBits() != 0L && attributemodifier.getID().getMostSignificantBits() != 0L)
                {
                    multimap.put(compoundnbt.getString("AttributeName"), attributemodifier);
                }
            }
        }
        else
        {
            multimap = this.getItem().getAttributeModifiers(equipmentSlot);
        }

        multimap.values().forEach((p_226631_0_) ->
        {
            p_226631_0_.setSaved(false);
        });
        return multimap;
    }

    public void addAttributeModifier(String attributeName, AttributeModifier modifier, @Nullable EquipmentSlotType equipmentSlot)
    {
        this.getOrCreateTag();

        if (!this.tag.contains("AttributeModifiers", 9))
        {
            this.tag.put("AttributeModifiers", new ListNBT());
        }

        ListNBT listnbt = this.tag.getList("AttributeModifiers", 10);
        CompoundNBT compoundnbt = SharedMonsterAttributes.writeAttributeModifier(modifier);
        compoundnbt.putString("AttributeName", attributeName);

        if (equipmentSlot != null)
        {
            compoundnbt.putString("Slot", equipmentSlot.getName());
        }

        listnbt.add(compoundnbt);
    }

    public ITextComponent getTextComponent()
    {
        ITextComponent itextcomponent = (new StringTextComponent("")).appendSibling(this.getDisplayName());

        if (this.hasDisplayName())
        {
            itextcomponent.applyTextStyle(TextFormatting.ITALIC);
        }

        ITextComponent itextcomponent1 = TextComponentUtils.wrapInSquareBrackets(itextcomponent);

        if (!this.isEmpty)
        {
            CompoundNBT compoundnbt = this.write(new CompoundNBT());
            itextcomponent1.applyTextStyle(this.getRarity().color).applyTextStyle((p_226632_1_) ->
            {
                p_226632_1_.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_ITEM, new StringTextComponent(compoundnbt.toString())));
            });
        }

        return itextcomponent1;
    }

    private static boolean isStateAndTileEntityEqual(CachedBlockInfo p_206846_0_, @Nullable CachedBlockInfo p_206846_1_)
    {
        if (p_206846_1_ != null && p_206846_0_.getBlockState() == p_206846_1_.getBlockState())
        {
            if (p_206846_0_.getTileEntity() == null && p_206846_1_.getTileEntity() == null)
            {
                return true;
            }
            else
            {
                return p_206846_0_.getTileEntity() != null && p_206846_1_.getTileEntity() != null ? Objects.equals(p_206846_0_.getTileEntity().write(new CompoundNBT()), p_206846_1_.getTileEntity().write(new CompoundNBT())) : false;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean canDestroy(NetworkTagManager p_206848_1_, CachedBlockInfo p_206848_2_)
    {
        if (isStateAndTileEntityEqual(p_206848_2_, this.canDestroyCacheBlock))
        {
            return this.canDestroyCacheResult;
        }
        else
        {
            this.canDestroyCacheBlock = p_206848_2_;

            if (this.hasTag() && this.tag.contains("CanDestroy", 9))
            {
                ListNBT listnbt = this.tag.getList("CanDestroy", 8);

                for (int i = 0; i < listnbt.size(); ++i)
                {
                    String s = listnbt.getString(i);

                    try
                    {
                        Predicate<CachedBlockInfo> predicate = BlockPredicateArgument.blockPredicate().parse(new StringReader(s)).create(p_206848_1_);

                        if (predicate.test(p_206848_2_))
                        {
                            this.canDestroyCacheResult = true;
                            return true;
                        }
                    }
                    catch (CommandSyntaxException var7)
                    {
                        ;
                    }
                }
            }

            this.canDestroyCacheResult = false;
            return false;
        }
    }

    public boolean canPlaceOn(NetworkTagManager p_206847_1_, CachedBlockInfo p_206847_2_)
    {
        if (isStateAndTileEntityEqual(p_206847_2_, this.canPlaceOnCacheBlock))
        {
            return this.canPlaceOnCacheResult;
        }
        else
        {
            this.canPlaceOnCacheBlock = p_206847_2_;

            if (this.hasTag() && this.tag.contains("CanPlaceOn", 9))
            {
                ListNBT listnbt = this.tag.getList("CanPlaceOn", 8);

                for (int i = 0; i < listnbt.size(); ++i)
                {
                    String s = listnbt.getString(i);

                    try
                    {
                        Predicate<CachedBlockInfo> predicate = BlockPredicateArgument.blockPredicate().parse(new StringReader(s)).create(p_206847_1_);

                        if (predicate.test(p_206847_2_))
                        {
                            this.canPlaceOnCacheResult = true;
                            return true;
                        }
                    }
                    catch (CommandSyntaxException var7)
                    {
                        ;
                    }
                }
            }

            this.canPlaceOnCacheResult = false;
            return false;
        }
    }

    public int getAnimationsToGo()
    {
        return this.animationsToGo;
    }

    public void setAnimationsToGo(int animations)
    {
        this.animationsToGo = animations;
    }

    public int getCount()
    {
        return this.isEmpty ? 0 : this.count;
    }

    public void setCount(int count)
    {
        this.count = count;
        this.updateEmptyState();
    }

    public void grow(int count)
    {
        this.setCount(this.count + count);
    }

    public void shrink(int count)
    {
        this.grow(-count);
    }

    public void func_222121_b(World worldIn, LivingEntity livingEntityIn, int countIn)
    {
        this.getItem().func_219972_a(worldIn, livingEntityIn, this, countIn);
    }

    public boolean isFood()
    {
        return this.getItem().isFood();
    }

    public SoundEvent func_226629_F_()
    {
        return this.getItem().func_225520_U__();
    }

    public SoundEvent func_226630_G_()
    {
        return this.getItem().func_225519_S__();
    }
}
