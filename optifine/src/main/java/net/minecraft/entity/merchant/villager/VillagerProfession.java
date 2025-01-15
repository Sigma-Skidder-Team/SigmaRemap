package net.minecraft.entity.merchant.villager;

import com.google.common.collect.ImmutableSet;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.registry.Registry;
import net.minecraft.village.PointOfInterestType;

public class VillagerProfession
{
    public static final VillagerProfession NONE = func_226556_a_("none", PointOfInterestType.UNEMPLOYED, (SoundEvent)null);
    public static final VillagerProfession ARMORER = func_226556_a_("armorer", PointOfInterestType.ARMORER, SoundEvents.ENTITY_VILLAGER_WORK_ARMORER);
    public static final VillagerProfession BUTCHER = func_226556_a_("butcher", PointOfInterestType.BUTCHER, SoundEvents.ENTITY_VILLAGER_WORK_BUTCHER);
    public static final VillagerProfession CARTOGRAPHER = func_226556_a_("cartographer", PointOfInterestType.CARTOGRAPHER, SoundEvents.ENTITY_VILLAGER_WORK_CARTOGRAPHER);
    public static final VillagerProfession CLERIC = func_226556_a_("cleric", PointOfInterestType.CLERIC, SoundEvents.ENTITY_VILLAGER_WORK_CLERIC);
    public static final VillagerProfession FARMER = func_226557_a_("farmer", PointOfInterestType.FARMER, ImmutableSet.of(Items.WHEAT, Items.WHEAT_SEEDS, Items.BEETROOT_SEEDS), ImmutableSet.of(Blocks.FARMLAND), SoundEvents.ENTITY_VILLAGER_WORK_FARMER);
    public static final VillagerProfession FISHERMAN = func_226556_a_("fisherman", PointOfInterestType.FISHERMAN, SoundEvents.ENTITY_VILLAGER_WORK_FISHERMAN);
    public static final VillagerProfession FLETCHER = func_226556_a_("fletcher", PointOfInterestType.FLETCHER, SoundEvents.ENTITY_VILLAGER_WORK_FLETCHER);
    public static final VillagerProfession LEATHERWORKER = func_226556_a_("leatherworker", PointOfInterestType.LEATHERWORKER, SoundEvents.ENTITY_VILLAGER_WORK_LEATHERWORKER);
    public static final VillagerProfession LIBRARIAN = func_226556_a_("librarian", PointOfInterestType.LIBRARIAN, SoundEvents.ENTITY_VILLAGER_WORK_LIBRARIAN);
    public static final VillagerProfession MASON = func_226556_a_("mason", PointOfInterestType.MASON, SoundEvents.ENTITY_VILLAGER_WORK_MASON);
    public static final VillagerProfession NITWIT = func_226556_a_("nitwit", PointOfInterestType.NITWIT, (SoundEvent)null);
    public static final VillagerProfession SHEPHERD = func_226556_a_("shepherd", PointOfInterestType.SHEPHERD, SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD);
    public static final VillagerProfession TOOLSMITH = func_226556_a_("toolsmith", PointOfInterestType.TOOLSMITH, SoundEvents.ENTITY_VILLAGER_WORK_TOOLSMITH);
    public static final VillagerProfession WEAPONSMITH = func_226556_a_("weaponsmith", PointOfInterestType.WEAPONSMITH, SoundEvents.ENTITY_VILLAGER_WORK_WEAPONSMITH);
    private final String name;
    private final PointOfInterestType pointOfInterest;
    private final ImmutableSet<Item> specificItems;
    private final ImmutableSet<Block> relatedWorldBlocks;
    @Nullable
    private final SoundEvent field_226555_t_;

    private VillagerProfession(String p_i587_1_, PointOfInterestType p_i587_2_, ImmutableSet<Item> p_i587_3_, ImmutableSet<Block> p_i587_4_, @Nullable SoundEvent p_i587_5_)
    {
        this.name = p_i587_1_;
        this.pointOfInterest = p_i587_2_;
        this.specificItems = p_i587_3_;
        this.relatedWorldBlocks = p_i587_4_;
        this.field_226555_t_ = p_i587_5_;
    }

    public PointOfInterestType getPointOfInterest()
    {
        return this.pointOfInterest;
    }

    public ImmutableSet<Item> getSpecificItems()
    {
        return this.specificItems;
    }

    public ImmutableSet<Block> getRelatedWorldBlocks()
    {
        return this.relatedWorldBlocks;
    }

    @Nullable
    public SoundEvent func_226558_e_()
    {
        return this.field_226555_t_;
    }

    public String toString()
    {
        return this.name;
    }

    static VillagerProfession func_226556_a_(String p_226556_0_, PointOfInterestType p_226556_1_, @Nullable SoundEvent p_226556_2_)
    {
        return func_226557_a_(p_226556_0_, p_226556_1_, ImmutableSet.of(), ImmutableSet.of(), p_226556_2_);
    }

    static VillagerProfession func_226557_a_(String p_226557_0_, PointOfInterestType p_226557_1_, ImmutableSet<Item> p_226557_2_, ImmutableSet<Block> p_226557_3_, @Nullable SoundEvent p_226557_4_)
    {
        return Registry.register(Registry.VILLAGER_PROFESSION, new ResourceLocation(p_226557_0_), new VillagerProfession(p_226557_0_, p_226557_1_, p_226557_2_, p_226557_3_, p_226557_4_));
    }
}
