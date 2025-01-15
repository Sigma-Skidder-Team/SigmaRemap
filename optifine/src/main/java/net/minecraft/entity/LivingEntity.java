package net.minecraft.entity;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.datafixers.Dynamic;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HoneyBlock;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.command.arguments.EntityAnchorArgument;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.FrostWalkerEnchantment;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.entity.ai.attributes.AttributeMap;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.brain.Brain;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.passive.IFlyingAnimal;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.NBTDynamicOps;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.server.SAnimateHandPacket;
import net.minecraft.network.play.server.SCollectItemPacket;
import net.minecraft.network.play.server.SEntityEquipmentPacket;
import net.minecraft.network.play.server.SSpawnMobPacket;
import net.minecraft.particles.BlockParticleData;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectUtils;
import net.minecraft.potion.Effects;
import net.minecraft.potion.PotionUtils;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.stats.Stats;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.CombatRules;
import net.minecraft.util.CombatTracker;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerChunkProvider;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootParameterSets;
import net.minecraft.world.storage.loot.LootParameters;
import net.minecraft.world.storage.loot.LootTable;
import org.apache.commons.lang3.tuple.Pair;

public abstract class LivingEntity extends Entity
{
    private static final UUID SPRINTING_SPEED_BOOST_ID = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
    private static final AttributeModifier SPRINTING_SPEED_BOOST = (new AttributeModifier(SPRINTING_SPEED_BOOST_ID, "Sprinting speed boost", (double)0.3F, AttributeModifier.Operation.MULTIPLY_TOTAL)).setSaved(false);
    protected static final DataParameter<Byte> LIVING_FLAGS = EntityDataManager.createKey(LivingEntity.class, DataSerializers.BYTE);
    private static final DataParameter<Float> HEALTH = EntityDataManager.createKey(LivingEntity.class, DataSerializers.FLOAT);
    private static final DataParameter<Integer> POTION_EFFECTS = EntityDataManager.createKey(LivingEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Boolean> HIDE_PARTICLES = EntityDataManager.createKey(LivingEntity.class, DataSerializers.BOOLEAN);
    private static final DataParameter<Integer> ARROW_COUNT_IN_ENTITY = EntityDataManager.createKey(LivingEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> BEE_STING_COUNT = EntityDataManager.createKey(LivingEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Optional<BlockPos>> BED_POSITION = EntityDataManager.createKey(LivingEntity.class, DataSerializers.OPTIONAL_BLOCK_POS);
    protected static final EntitySize SLEEPING_SIZE = EntitySize.fixed(0.2F, 0.2F);
    private AbstractAttributeMap attributes;
    private final CombatTracker combatTracker = new CombatTracker(this);
    private final Map<Effect, EffectInstance> activePotionsMap = Maps.newHashMap();
    private final NonNullList<ItemStack> handInventory = NonNullList.withSize(2, ItemStack.EMPTY);
    private final NonNullList<ItemStack> armorArray = NonNullList.withSize(4, ItemStack.EMPTY);
    public boolean isSwingInProgress;
    public Hand swingingHand;
    public int swingProgressInt;
    public int arrowHitTimer;
    public int beeStingRemovalCooldown;
    public int hurtTime;
    public int maxHurtTime;
    public float attackedAtYaw;
    public int deathTime;
    public float prevSwingProgress;
    public float swingProgress;
    protected int ticksSinceLastSwing;
    public float prevLimbSwingAmount;
    public float limbSwingAmount;
    public float limbSwing;
    public final int maxHurtResistantTime = 20;
    public final float randomUnused2;
    public final float randomUnused1;
    public float renderYawOffset;
    public float prevRenderYawOffset;
    public float rotationYawHead;
    public float prevRotationYawHead;
    public float jumpMovementFactor = 0.02F;
    protected PlayerEntity attackingPlayer;
    protected int recentlyHit;
    protected boolean dead;
    protected int idleTime;
    protected float prevOnGroundSpeedFactor;
    protected float onGroundSpeedFactor;
    protected float movedDistance;
    protected float prevMovedDistance;
    protected float unused180;
    protected int scoreValue;
    protected float lastDamage;
    protected boolean isJumping;
    public float moveStrafing;
    public float moveVertical;
    public float moveForward;
    protected int newPosRotationIncrements;
    protected double interpTargetX;
    protected double interpTargetY;
    protected double interpTargetZ;
    protected double interpTargetYaw;
    protected double interpTargetPitch;
    protected double interpTargetHeadYaw;
    protected int interpTicksHead;
    private boolean potionsNeedUpdate = true;
    @Nullable
    private LivingEntity revengeTarget;
    private int revengeTimer;
    private LivingEntity lastAttackedEntity;
    private int lastAttackedEntityTime;
    private float landMovementFactor;
    private int jumpTicks;
    private float absorptionAmount;
    protected ItemStack activeItemStack = ItemStack.EMPTY;
    protected int activeItemStackUseCount;
    protected int ticksElytraFlying;
    private BlockPos prevBlockpos;
    private DamageSource lastDamageSource;
    private long lastDamageStamp;
    protected int spinAttackDuration;
    private float swimAnimation;
    private float lastSwimAnimation;
    protected Brain<?> brain;

    protected LivingEntity(EntityType <? extends LivingEntity > p_i1837_1_, World p_i1837_2_)
    {
        super(p_i1837_1_, p_i1837_2_);
        this.registerAttributes();
        this.setHealth(this.getMaxHealth());
        this.preventEntitySpawning = true;
        this.randomUnused1 = (float)((Math.random() + 1.0D) * (double)0.01F);
        this.recenterBoundingBox();
        this.randomUnused2 = (float)Math.random() * 12398.0F;
        this.rotationYaw = (float)(Math.random() * (double)((float)Math.PI * 2F));
        this.rotationYawHead = this.rotationYaw;
        this.stepHeight = 0.6F;
        this.brain = this.createBrain(new Dynamic<>(NBTDynamicOps.INSTANCE, new CompoundNBT()));
    }

    public Brain<?> getBrain()
    {
        return this.brain;
    }

    protected Brain<?> createBrain(Dynamic<?> dynamicIn)
    {
        return new Brain<>(ImmutableList.of(), ImmutableList.of(), dynamicIn);
    }

    public void onKillCommand()
    {
        this.attackEntityFrom(DamageSource.OUT_OF_WORLD, Float.MAX_VALUE);
    }

    public boolean canAttack(EntityType<?> typeIn)
    {
        return true;
    }

    protected void registerData()
    {
        this.dataManager.register(LIVING_FLAGS, (byte)0);
        this.dataManager.register(POTION_EFFECTS, 0);
        this.dataManager.register(HIDE_PARTICLES, false);
        this.dataManager.register(ARROW_COUNT_IN_ENTITY, 0);
        this.dataManager.register(BEE_STING_COUNT, 0);
        this.dataManager.register(HEALTH, 1.0F);
        this.dataManager.register(BED_POSITION, Optional.empty());
    }

    protected void registerAttributes()
    {
        this.getAttributes().registerAttribute(SharedMonsterAttributes.MAX_HEALTH);
        this.getAttributes().registerAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE);
        this.getAttributes().registerAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
        this.getAttributes().registerAttribute(SharedMonsterAttributes.ARMOR);
        this.getAttributes().registerAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS);
    }

    protected void updateFallState(double y, boolean onGroundIn, BlockState state, BlockPos pos)
    {
        if (!this.isInWater())
        {
            this.handleWaterMovement();
        }

        if (!this.world.isRemote && this.fallDistance > 3.0F && onGroundIn)
        {
            float f = (float)MathHelper.ceil(this.fallDistance - 3.0F);

            if (!state.isAir())
            {
                double d0 = Math.min((double)(0.2F + f / 15.0F), 2.5D);
                int i = (int)(150.0D * d0);
                ((ServerWorld)this.world).spawnParticle(new BlockParticleData(ParticleTypes.BLOCK, state), this.getPosX(), this.getPosY(), this.getPosZ(), i, 0.0D, 0.0D, 0.0D, (double)0.15F);
            }
        }

        super.updateFallState(y, onGroundIn, state, pos);
    }

    public boolean canBreatheUnderwater()
    {
        return this.getCreatureAttribute() == CreatureAttribute.UNDEAD;
    }

    public float getSwimAnimation(float partialTicks)
    {
        return MathHelper.lerp(partialTicks, this.lastSwimAnimation, this.swimAnimation);
    }

    public void baseTick()
    {
        this.prevSwingProgress = this.swingProgress;

        if (this.firstUpdate)
        {
            this.getBedPosition().ifPresent(this::setSleepingPosition);
        }

        super.baseTick();
        this.world.getProfiler().startSection("livingEntityBaseTick");
        boolean flag = this instanceof PlayerEntity;

        if (this.isAlive())
        {
            if (this.isEntityInsideOpaqueBlock())
            {
                this.attackEntityFrom(DamageSource.IN_WALL, 1.0F);
            }
            else if (flag && !this.world.getWorldBorder().contains(this.getBoundingBox()))
            {
                double d0 = this.world.getWorldBorder().getClosestDistance(this) + this.world.getWorldBorder().getDamageBuffer();

                if (d0 < 0.0D)
                {
                    double d1 = this.world.getWorldBorder().getDamagePerBlock();

                    if (d1 > 0.0D)
                    {
                        this.attackEntityFrom(DamageSource.IN_WALL, (float)Math.max(1, MathHelper.floor(-d0 * d1)));
                    }
                }
            }
        }

        if (this.isImmuneToFire() || this.world.isRemote)
        {
            this.extinguish();
        }

        boolean flag1 = flag && ((PlayerEntity)this).abilities.disableDamage;

        if (this.isAlive())
        {
            if (this.areEyesInFluid(FluidTags.WATER) && this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosYEye(), this.getPosZ())).getBlock() != Blocks.BUBBLE_COLUMN)
            {
                if (!this.canBreatheUnderwater() && !EffectUtils.canBreatheUnderwater(this) && !flag1)
                {
                    this.setAir(this.decreaseAirSupply(this.getAir()));

                    if (this.getAir() == -20)
                    {
                        this.setAir(0);
                        Vec3d vec3d = this.getMotion();

                        for (int i = 0; i < 8; ++i)
                        {
                            float f = this.rand.nextFloat() - this.rand.nextFloat();
                            float f1 = this.rand.nextFloat() - this.rand.nextFloat();
                            float f2 = this.rand.nextFloat() - this.rand.nextFloat();
                            this.world.addParticle(ParticleTypes.BUBBLE, this.getPosX() + (double)f, this.getPosY() + (double)f1, this.getPosZ() + (double)f2, vec3d.x, vec3d.y, vec3d.z);
                        }

                        this.attackEntityFrom(DamageSource.DROWN, 2.0F);
                    }
                }

                if (!this.world.isRemote && this.isPassenger() && this.getRidingEntity() != null && !this.getRidingEntity().canBeRiddenInWater())
                {
                    this.stopRiding();
                }
            }
            else if (this.getAir() < this.getMaxAir())
            {
                this.setAir(this.determineNextAir(this.getAir()));
            }

            if (!this.world.isRemote)
            {
                BlockPos blockpos = new BlockPos(this);

                if (!Objects.equal(this.prevBlockpos, blockpos))
                {
                    this.prevBlockpos = blockpos;
                    this.frostWalk(blockpos);
                }
            }
        }

        if (this.isAlive() && this.isInWaterRainOrBubbleColumn())
        {
            this.extinguish();
        }

        if (this.hurtTime > 0)
        {
            --this.hurtTime;
        }

        if (this.hurtResistantTime > 0 && !(this instanceof ServerPlayerEntity))
        {
            --this.hurtResistantTime;
        }

        if (this.getHealth() <= 0.0F)
        {
            this.onDeathUpdate();
        }

        if (this.recentlyHit > 0)
        {
            --this.recentlyHit;
        }
        else
        {
            this.attackingPlayer = null;
        }

        if (this.lastAttackedEntity != null && !this.lastAttackedEntity.isAlive())
        {
            this.lastAttackedEntity = null;
        }

        if (this.revengeTarget != null)
        {
            if (!this.revengeTarget.isAlive())
            {
                this.setRevengeTarget((LivingEntity)null);
            }
            else if (this.ticksExisted - this.revengeTimer > 100)
            {
                this.setRevengeTarget((LivingEntity)null);
            }
        }

        this.updatePotionEffects();
        this.prevMovedDistance = this.movedDistance;
        this.prevRenderYawOffset = this.renderYawOffset;
        this.prevRotationYawHead = this.rotationYawHead;
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
        this.world.getProfiler().endSection();
    }

    protected void frostWalk(BlockPos pos)
    {
        int i = EnchantmentHelper.getMaxEnchantmentLevel(Enchantments.FROST_WALKER, this);

        if (i > 0)
        {
            FrostWalkerEnchantment.freezeNearby(this, this.world, pos, i);
        }
    }

    public boolean isChild()
    {
        return false;
    }

    public float getRenderScale()
    {
        return this.isChild() ? 0.5F : 1.0F;
    }

    public boolean canBeRiddenInWater()
    {
        return false;
    }

    protected void onDeathUpdate()
    {
        ++this.deathTime;

        if (this.deathTime == 20)
        {
            this.remove();

            for (int i = 0; i < 20; ++i)
            {
                double d0 = this.rand.nextGaussian() * 0.02D;
                double d1 = this.rand.nextGaussian() * 0.02D;
                double d2 = this.rand.nextGaussian() * 0.02D;
                this.world.addParticle(ParticleTypes.POOF, this.getPosXRandom(1.0D), this.getPosYRandom(), this.getPosZRandom(1.0D), d0, d1, d2);
            }
        }
    }

    protected boolean canDropLoot()
    {
        return !this.isChild();
    }

    protected int decreaseAirSupply(int air)
    {
        int i = EnchantmentHelper.getRespirationModifier(this);
        return i > 0 && this.rand.nextInt(i + 1) > 0 ? air : air - 1;
    }

    protected int determineNextAir(int currentAir)
    {
        return Math.min(currentAir + 4, this.getMaxAir());
    }

    protected int getExperiencePoints(PlayerEntity player)
    {
        return 0;
    }

    protected boolean isPlayer()
    {
        return false;
    }

    public Random getRNG()
    {
        return this.rand;
    }

    @Nullable
    public LivingEntity getRevengeTarget()
    {
        return this.revengeTarget;
    }

    public int getRevengeTimer()
    {
        return this.revengeTimer;
    }

    public void setRevengeTarget(@Nullable LivingEntity livingBase)
    {
        this.revengeTarget = livingBase;
        this.revengeTimer = this.ticksExisted;
    }

    @Nullable
    public LivingEntity getLastAttackedEntity()
    {
        return this.lastAttackedEntity;
    }

    public int getLastAttackedEntityTime()
    {
        return this.lastAttackedEntityTime;
    }

    public void setLastAttackedEntity(Entity entityIn)
    {
        if (entityIn instanceof LivingEntity)
        {
            this.lastAttackedEntity = (LivingEntity)entityIn;
        }
        else
        {
            this.lastAttackedEntity = null;
        }

        this.lastAttackedEntityTime = this.ticksExisted;
    }

    public int getIdleTime()
    {
        return this.idleTime;
    }

    public void setIdleTime(int idleTimeIn)
    {
        this.idleTime = idleTimeIn;
    }

    protected void playEquipSound(ItemStack stack)
    {
        if (!stack.isEmpty())
        {
            SoundEvent soundevent = SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
            Item item = stack.getItem();

            if (item instanceof ArmorItem)
            {
                soundevent = ((ArmorItem)item).getArmorMaterial().getSoundEvent();
            }
            else if (item == Items.ELYTRA)
            {
                soundevent = SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA;
            }

            this.playSound(soundevent, 1.0F, 1.0F);
        }
    }

    public void writeAdditional(CompoundNBT compound)
    {
        compound.putFloat("Health", this.getHealth());
        compound.putShort("HurtTime", (short)this.hurtTime);
        compound.putInt("HurtByTimestamp", this.revengeTimer);
        compound.putShort("DeathTime", (short)this.deathTime);
        compound.putFloat("AbsorptionAmount", this.getAbsorptionAmount());
        compound.put("Attributes", SharedMonsterAttributes.writeAttributes(this.getAttributes()));

        if (!this.activePotionsMap.isEmpty())
        {
            ListNBT listnbt = new ListNBT();

            for (EffectInstance effectinstance : this.activePotionsMap.values())
            {
                listnbt.add(effectinstance.write(new CompoundNBT()));
            }

            compound.put("ActiveEffects", listnbt);
        }

        compound.putBoolean("FallFlying", this.isElytraFlying());
        this.getBedPosition().ifPresent((p_213338_1_) ->
        {
            compound.putInt("SleepingX", p_213338_1_.getX());
            compound.putInt("SleepingY", p_213338_1_.getY());
            compound.putInt("SleepingZ", p_213338_1_.getZ());
        });
        compound.put("Brain", this.brain.serialize(NBTDynamicOps.INSTANCE));
    }

    public void readAdditional(CompoundNBT compound)
    {
        this.setAbsorptionAmount(compound.getFloat("AbsorptionAmount"));

        if (compound.contains("Attributes", 9) && this.world != null && !this.world.isRemote)
        {
            SharedMonsterAttributes.readAttributes(this.getAttributes(), compound.getList("Attributes", 10));
        }

        if (compound.contains("ActiveEffects", 9))
        {
            ListNBT listnbt = compound.getList("ActiveEffects", 10);

            for (int i = 0; i < listnbt.size(); ++i)
            {
                CompoundNBT compoundnbt = listnbt.getCompound(i);
                EffectInstance effectinstance = EffectInstance.read(compoundnbt);

                if (effectinstance != null)
                {
                    this.activePotionsMap.put(effectinstance.getPotion(), effectinstance);
                }
            }
        }

        if (compound.contains("Health", 99))
        {
            this.setHealth(compound.getFloat("Health"));
        }

        this.hurtTime = compound.getShort("HurtTime");
        this.deathTime = compound.getShort("DeathTime");
        this.revengeTimer = compound.getInt("HurtByTimestamp");

        if (compound.contains("Team", 8))
        {
            String s = compound.getString("Team");
            ScorePlayerTeam scoreplayerteam = this.world.getScoreboard().getTeam(s);
            boolean flag = scoreplayerteam != null && this.world.getScoreboard().addPlayerToTeam(this.getCachedUniqueIdString(), scoreplayerteam);

            if (!flag)
            {
                LOGGER.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", (Object)s);
            }
        }

        if (compound.getBoolean("FallFlying"))
        {
            this.setFlag(7, true);
        }

        if (compound.contains("SleepingX", 99) && compound.contains("SleepingY", 99) && compound.contains("SleepingZ", 99))
        {
            BlockPos blockpos = new BlockPos(compound.getInt("SleepingX"), compound.getInt("SleepingY"), compound.getInt("SleepingZ"));
            this.setBedPosition(blockpos);
            this.dataManager.set(POSE, Pose.SLEEPING);

            if (!this.firstUpdate)
            {
                this.setSleepingPosition(blockpos);
            }
        }

        if (compound.contains("Brain", 10))
        {
            this.brain = this.createBrain(new Dynamic<>(NBTDynamicOps.INSTANCE, compound.get("Brain")));
        }
    }

    protected void updatePotionEffects()
    {
        Iterator<Effect> iterator = this.activePotionsMap.keySet().iterator();

        try
        {
            while (iterator.hasNext())
            {
                Effect effect = iterator.next();
                EffectInstance effectinstance = this.activePotionsMap.get(effect);

                if (!effectinstance.tick(this, () ->
            {
                this.onChangedPotionEffect(effectinstance, true);
                }))
                {
                    if (!this.world.isRemote)
                    {
                        iterator.remove();
                        this.onFinishedPotionEffect(effectinstance);
                    }
                }
                else if (effectinstance.getDuration() % 600 == 0)
                {
                    this.onChangedPotionEffect(effectinstance, false);
                }
            }
        }
        catch (ConcurrentModificationException var11)
        {
            ;
        }

        if (this.potionsNeedUpdate)
        {
            if (!this.world.isRemote)
            {
                this.updatePotionMetadata();
            }

            this.potionsNeedUpdate = false;
        }

        int i = this.dataManager.get(POTION_EFFECTS);
        boolean flag1 = this.dataManager.get(HIDE_PARTICLES);

        if (i > 0)
        {
            boolean flag;

            if (this.isInvisible())
            {
                flag = this.rand.nextInt(15) == 0;
            }
            else
            {
                flag = this.rand.nextBoolean();
            }

            if (flag1)
            {
                flag &= this.rand.nextInt(5) == 0;
            }

            if (flag && i > 0)
            {
                double d0 = (double)(i >> 16 & 255) / 255.0D;
                double d1 = (double)(i >> 8 & 255) / 255.0D;
                double d2 = (double)(i >> 0 & 255) / 255.0D;
                this.world.addParticle(flag1 ? ParticleTypes.AMBIENT_ENTITY_EFFECT : ParticleTypes.ENTITY_EFFECT, this.getPosXRandom(0.5D), this.getPosYRandom(), this.getPosZRandom(0.5D), d0, d1, d2);
            }
        }
    }

    protected void updatePotionMetadata()
    {
        if (this.activePotionsMap.isEmpty())
        {
            this.resetPotionEffectMetadata();
            this.setInvisible(false);
        }
        else
        {
            Collection<EffectInstance> collection = this.activePotionsMap.values();
            this.dataManager.set(HIDE_PARTICLES, areAllPotionsAmbient(collection));
            this.dataManager.set(POTION_EFFECTS, PotionUtils.getPotionColorFromEffectList(collection));
            this.setInvisible(this.isPotionActive(Effects.INVISIBILITY));
        }
    }

    public double getVisibilityMultiplier(@Nullable Entity lookingEntity)
    {
        double d0 = 1.0D;

        if (this.isDiscrete())
        {
            d0 *= 0.8D;
        }

        if (this.isInvisible())
        {
            float f = this.func_213343_cS();

            if (f < 0.1F)
            {
                f = 0.1F;
            }

            d0 *= 0.7D * (double)f;
        }

        if (lookingEntity != null)
        {
            ItemStack itemstack = this.getItemStackFromSlot(EquipmentSlotType.HEAD);
            Item item = itemstack.getItem();
            EntityType<?> entitytype = lookingEntity.getType();

            if (entitytype == EntityType.SKELETON && item == Items.SKELETON_SKULL || entitytype == EntityType.ZOMBIE && item == Items.ZOMBIE_HEAD || entitytype == EntityType.CREEPER && item == Items.CREEPER_HEAD)
            {
                d0 *= 0.5D;
            }
        }

        return d0;
    }

    public boolean canAttack(LivingEntity target)
    {
        return true;
    }

    public boolean canAttack(LivingEntity livingentityIn, EntityPredicate predicateIn)
    {
        return predicateIn.canTarget(this, livingentityIn);
    }

    public static boolean areAllPotionsAmbient(Collection<EffectInstance> potionEffects)
    {
        for (EffectInstance effectinstance : potionEffects)
        {
            if (!effectinstance.isAmbient())
            {
                return false;
            }
        }

        return true;
    }

    protected void resetPotionEffectMetadata()
    {
        this.dataManager.set(HIDE_PARTICLES, false);
        this.dataManager.set(POTION_EFFECTS, 0);
    }

    public boolean clearActivePotions()
    {
        if (this.world.isRemote)
        {
            return false;
        }
        else
        {
            Iterator<EffectInstance> iterator = this.activePotionsMap.values().iterator();
            boolean flag;

            for (flag = false; iterator.hasNext(); flag = true)
            {
                this.onFinishedPotionEffect(iterator.next());
                iterator.remove();
            }

            return flag;
        }
    }

    public Collection<EffectInstance> getActivePotionEffects()
    {
        return this.activePotionsMap.values();
    }

    public Map<Effect, EffectInstance> getActivePotionMap()
    {
        return this.activePotionsMap;
    }

    public boolean isPotionActive(Effect potionIn)
    {
        return this.activePotionsMap.containsKey(potionIn);
    }

    @Nullable
    public EffectInstance getActivePotionEffect(Effect potionIn)
    {
        return this.activePotionsMap.get(potionIn);
    }

    public boolean addPotionEffect(EffectInstance effectInstanceIn)
    {
        if (!this.isPotionApplicable(effectInstanceIn))
        {
            return false;
        }
        else
        {
            EffectInstance effectinstance = this.activePotionsMap.get(effectInstanceIn.getPotion());

            if (effectinstance == null)
            {
                this.activePotionsMap.put(effectInstanceIn.getPotion(), effectInstanceIn);
                this.onNewPotionEffect(effectInstanceIn);
                return true;
            }
            else if (effectinstance.combine(effectInstanceIn))
            {
                this.onChangedPotionEffect(effectinstance, true);
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public boolean isPotionApplicable(EffectInstance potioneffectIn)
    {
        if (this.getCreatureAttribute() == CreatureAttribute.UNDEAD)
        {
            Effect effect = potioneffectIn.getPotion();

            if (effect == Effects.REGENERATION || effect == Effects.POISON)
            {
                return false;
            }
        }

        return true;
    }

    public boolean isEntityUndead()
    {
        return this.getCreatureAttribute() == CreatureAttribute.UNDEAD;
    }

    @Nullable
    public EffectInstance removeActivePotionEffect(@Nullable Effect potioneffectin)
    {
        return this.activePotionsMap.remove(potioneffectin);
    }

    public boolean removePotionEffect(Effect effectIn)
    {
        EffectInstance effectinstance = this.removeActivePotionEffect(effectIn);

        if (effectinstance != null)
        {
            this.onFinishedPotionEffect(effectinstance);
            return true;
        }
        else
        {
            return false;
        }
    }

    protected void onNewPotionEffect(EffectInstance id)
    {
        this.potionsNeedUpdate = true;

        if (!this.world.isRemote)
        {
            id.getPotion().applyAttributesModifiersToEntity(this, this.getAttributes(), id.getAmplifier());
        }
    }

    protected void onChangedPotionEffect(EffectInstance id, boolean reapply)
    {
        this.potionsNeedUpdate = true;

        if (reapply && !this.world.isRemote)
        {
            Effect effect = id.getPotion();
            effect.removeAttributesModifiersFromEntity(this, this.getAttributes(), id.getAmplifier());
            effect.applyAttributesModifiersToEntity(this, this.getAttributes(), id.getAmplifier());
        }
    }

    protected void onFinishedPotionEffect(EffectInstance effect)
    {
        this.potionsNeedUpdate = true;

        if (!this.world.isRemote)
        {
            effect.getPotion().removeAttributesModifiersFromEntity(this, this.getAttributes(), effect.getAmplifier());
        }
    }

    public void heal(float healAmount)
    {
        float f = this.getHealth();

        if (f > 0.0F)
        {
            this.setHealth(f + healAmount);
        }
    }

    public float getHealth()
    {
        return this.dataManager.get(HEALTH);
    }

    public void setHealth(float health)
    {
        this.dataManager.set(HEALTH, MathHelper.clamp(health, 0.0F, this.getMaxHealth()));
    }

    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        if (this.isInvulnerableTo(source))
        {
            return false;
        }
        else if (this.world.isRemote)
        {
            return false;
        }
        else if (this.getHealth() <= 0.0F)
        {
            return false;
        }
        else if (source.isFireDamage() && this.isPotionActive(Effects.FIRE_RESISTANCE))
        {
            return false;
        }
        else
        {
            if (this.isSleeping() && !this.world.isRemote)
            {
                this.wakeUp();
            }

            this.idleTime = 0;
            float f = amount;

            if ((source == DamageSource.ANVIL || source == DamageSource.FALLING_BLOCK) && !this.getItemStackFromSlot(EquipmentSlotType.HEAD).isEmpty())
            {
                this.getItemStackFromSlot(EquipmentSlotType.HEAD).damageItem((int)(amount * 4.0F + this.rand.nextFloat() * amount * 2.0F), this, (p_213341_0_) ->
                {
                    p_213341_0_.sendBreakAnimation(EquipmentSlotType.HEAD);
                });
                amount *= 0.75F;
            }

            boolean flag = false;
            float f1 = 0.0F;

            if (amount > 0.0F && this.canBlockDamageSource(source))
            {
                this.damageShield(amount);
                f1 = amount;
                amount = 0.0F;

                if (!source.isProjectile())
                {
                    Entity entity = source.getImmediateSource();

                    if (entity instanceof LivingEntity)
                    {
                        this.blockUsingShield((LivingEntity)entity);
                    }
                }

                flag = true;
            }

            this.limbSwingAmount = 1.5F;
            boolean flag1 = true;

            if ((float)this.hurtResistantTime > 10.0F)
            {
                if (amount <= this.lastDamage)
                {
                    return false;
                }

                this.damageEntity(source, amount - this.lastDamage);
                this.lastDamage = amount;
                flag1 = false;
            }
            else
            {
                this.lastDamage = amount;
                this.hurtResistantTime = 20;
                this.damageEntity(source, amount);
                this.maxHurtTime = 10;
                this.hurtTime = this.maxHurtTime;
            }

            this.attackedAtYaw = 0.0F;
            Entity entity1 = source.getTrueSource();

            if (entity1 != null)
            {
                if (entity1 instanceof LivingEntity)
                {
                    this.setRevengeTarget((LivingEntity)entity1);
                }

                if (entity1 instanceof PlayerEntity)
                {
                    this.recentlyHit = 100;
                    this.attackingPlayer = (PlayerEntity)entity1;
                }
                else if (entity1 instanceof WolfEntity)
                {
                    WolfEntity wolfentity = (WolfEntity)entity1;

                    if (wolfentity.isTamed())
                    {
                        this.recentlyHit = 100;
                        LivingEntity livingentity = wolfentity.getOwner();

                        if (livingentity != null && livingentity.getType() == EntityType.PLAYER)
                        {
                            this.attackingPlayer = (PlayerEntity)livingentity;
                        }
                        else
                        {
                            this.attackingPlayer = null;
                        }
                    }
                }
            }

            if (flag1)
            {
                if (flag)
                {
                    this.world.setEntityState(this, (byte)29);
                }
                else if (source instanceof EntityDamageSource && ((EntityDamageSource)source).getIsThornsDamage())
                {
                    this.world.setEntityState(this, (byte)33);
                }
                else
                {
                    byte b0;

                    if (source == DamageSource.DROWN)
                    {
                        b0 = 36;
                    }
                    else if (source.isFireDamage())
                    {
                        b0 = 37;
                    }
                    else if (source == DamageSource.SWEET_BERRY_BUSH)
                    {
                        b0 = 44;
                    }
                    else
                    {
                        b0 = 2;
                    }

                    this.world.setEntityState(this, b0);
                }

                if (source != DamageSource.DROWN && (!flag || amount > 0.0F))
                {
                    this.markVelocityChanged();
                }

                if (entity1 != null)
                {
                    double d1 = entity1.getPosX() - this.getPosX();
                    double d0;

                    for (d0 = entity1.getPosZ() - this.getPosZ(); d1 * d1 + d0 * d0 < 1.0E-4D; d0 = (Math.random() - Math.random()) * 0.01D)
                    {
                        d1 = (Math.random() - Math.random()) * 0.01D;
                    }

                    this.attackedAtYaw = (float)(MathHelper.atan2(d0, d1) * (double)(180F / (float)Math.PI) - (double)this.rotationYaw);
                    this.knockBack(entity1, 0.4F, d1, d0);
                }
                else
                {
                    this.attackedAtYaw = (float)((int)(Math.random() * 2.0D) * 180);
                }
            }

            if (this.getHealth() <= 0.0F)
            {
                if (!this.checkTotemDeathProtection(source))
                {
                    SoundEvent soundevent = this.getDeathSound();

                    if (flag1 && soundevent != null)
                    {
                        this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
                    }

                    this.onDeath(source);
                }
            }
            else if (flag1)
            {
                this.playHurtSound(source);
            }

            boolean flag2 = !flag || amount > 0.0F;

            if (flag2)
            {
                this.lastDamageSource = source;
                this.lastDamageStamp = this.world.getGameTime();
            }

            if (this instanceof ServerPlayerEntity)
            {
                CriteriaTriggers.ENTITY_HURT_PLAYER.trigger((ServerPlayerEntity)this, source, f, amount, flag);

                if (f1 > 0.0F && f1 < 3.4028235E37F)
                {
                    ((ServerPlayerEntity)this).addStat(Stats.DAMAGE_BLOCKED_BY_SHIELD, Math.round(f1 * 10.0F));
                }
            }

            if (entity1 instanceof ServerPlayerEntity)
            {
                CriteriaTriggers.PLAYER_HURT_ENTITY.trigger((ServerPlayerEntity)entity1, this, source, f, amount, flag);
            }

            return flag2;
        }
    }

    protected void blockUsingShield(LivingEntity entityIn)
    {
        entityIn.constructKnockBackVector(this);
    }

    protected void constructKnockBackVector(LivingEntity entityIn)
    {
        entityIn.knockBack(this, 0.5F, entityIn.getPosX() - this.getPosX(), entityIn.getPosZ() - this.getPosZ());
    }

    private boolean checkTotemDeathProtection(DamageSource damageSourceIn)
    {
        if (damageSourceIn.canHarmInCreative())
        {
            return false;
        }
        else
        {
            ItemStack itemstack = null;

            for (Hand hand : Hand.values())
            {
                ItemStack itemstack1 = this.getHeldItem(hand);

                if (itemstack1.getItem() == Items.TOTEM_OF_UNDYING)
                {
                    itemstack = itemstack1.copy();
                    itemstack1.shrink(1);
                    break;
                }
            }

            if (itemstack != null)
            {
                if (this instanceof ServerPlayerEntity)
                {
                    ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)this;
                    serverplayerentity.addStat(Stats.ITEM_USED.get(Items.TOTEM_OF_UNDYING));
                    CriteriaTriggers.USED_TOTEM.trigger(serverplayerentity, itemstack);
                }

                this.setHealth(1.0F);
                this.clearActivePotions();
                this.addPotionEffect(new EffectInstance(Effects.REGENERATION, 900, 1));
                this.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 100, 1));
                this.world.setEntityState(this, (byte)35);
            }

            return itemstack != null;
        }
    }

    @Nullable
    public DamageSource getLastDamageSource()
    {
        if (this.world.getGameTime() - this.lastDamageStamp > 40L)
        {
            this.lastDamageSource = null;
        }

        return this.lastDamageSource;
    }

    protected void playHurtSound(DamageSource source)
    {
        SoundEvent soundevent = this.getHurtSound(source);

        if (soundevent != null)
        {
            this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
        }
    }

    private boolean canBlockDamageSource(DamageSource damageSourceIn)
    {
        Entity entity = damageSourceIn.getImmediateSource();
        boolean flag = false;

        if (entity instanceof AbstractArrowEntity)
        {
            AbstractArrowEntity abstractarrowentity = (AbstractArrowEntity)entity;

            if (abstractarrowentity.getPierceLevel() > 0)
            {
                flag = true;
            }
        }

        if (!damageSourceIn.isUnblockable() && this.isActiveItemStackBlocking() && !flag)
        {
            Vec3d vec3d2 = damageSourceIn.getDamageLocation();

            if (vec3d2 != null)
            {
                Vec3d vec3d = this.getLook(1.0F);
                Vec3d vec3d1 = vec3d2.subtractReverse(this.getPositionVec()).normalize();
                vec3d1 = new Vec3d(vec3d1.x, 0.0D, vec3d1.z);

                if (vec3d1.dotProduct(vec3d) < 0.0D)
                {
                    return true;
                }
            }
        }

        return false;
    }

    private void renderBrokenItemStack(ItemStack stack)
    {
        if (!stack.isEmpty())
        {
            if (!this.isSilent())
            {
                this.world.playSound(this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ENTITY_ITEM_BREAK, this.getSoundCategory(), 0.8F, 0.8F + this.world.rand.nextFloat() * 0.4F, false);
            }

            this.addItemParticles(stack, 5);
        }
    }

    public void onDeath(DamageSource cause)
    {
        if (!this.removed && !this.dead)
        {
            Entity entity = cause.getTrueSource();
            LivingEntity livingentity = this.getAttackingEntity();

            if (this.scoreValue >= 0 && livingentity != null)
            {
                livingentity.awardKillScore(this, this.scoreValue, cause);
            }

            if (entity != null)
            {
                entity.onKillEntity(this);
            }

            if (this.isSleeping())
            {
                this.wakeUp();
            }

            this.dead = true;
            this.getCombatTracker().reset();

            if (!this.world.isRemote)
            {
                this.spawnDrops(cause);
                this.func_226298_f_(livingentity);
            }

            this.world.setEntityState(this, (byte)3);
            this.setPose(Pose.DYING);
        }
    }

    protected void func_226298_f_(@Nullable LivingEntity p_226298_1_)
    {
        if (!this.world.isRemote)
        {
            boolean flag = false;

            if (p_226298_1_ instanceof WitherEntity)
            {
                if (this.world.getGameRules().getBoolean(GameRules.MOB_GRIEFING))
                {
                    BlockPos blockpos = new BlockPos(this);
                    BlockState blockstate = Blocks.WITHER_ROSE.getDefaultState();

                    if (this.world.getBlockState(blockpos).isAir() && blockstate.isValidPosition(this.world, blockpos))
                    {
                        this.world.setBlockState(blockpos, blockstate, 3);
                        flag = true;
                    }
                }

                if (!flag)
                {
                    ItemEntity itementity = new ItemEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), new ItemStack(Items.WITHER_ROSE));
                    this.world.addEntity(itementity);
                }
            }
        }
    }

    protected void spawnDrops(DamageSource damageSourceIn)
    {
        Entity entity = damageSourceIn.getTrueSource();
        int i;

        if (entity instanceof PlayerEntity)
        {
            i = EnchantmentHelper.getLootingModifier((LivingEntity)entity);
        }
        else
        {
            i = 0;
        }

        boolean flag = this.recentlyHit > 0;

        if (this.canDropLoot() && this.world.getGameRules().getBoolean(GameRules.DO_MOB_LOOT))
        {
            this.dropLoot(damageSourceIn, flag);
            this.dropSpecialItems(damageSourceIn, i, flag);
        }

        this.dropInventory();
        this.func_226294_cV_();
    }

    protected void dropInventory()
    {
    }

    protected void func_226294_cV_()
    {
        if (!this.world.isRemote && (this.isPlayer() || this.recentlyHit > 0 && this.canDropLoot() && this.world.getGameRules().getBoolean(GameRules.DO_MOB_LOOT)))
        {
            int i = this.getExperiencePoints(this.attackingPlayer);

            while (i > 0)
            {
                int j = ExperienceOrbEntity.getXPSplit(i);
                i -= j;
                this.world.addEntity(new ExperienceOrbEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), j));
            }
        }
    }

    protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn)
    {
    }

    public ResourceLocation getLootTableResourceLocation()
    {
        return this.getType().getLootTable();
    }

    protected void dropLoot(DamageSource damageSourceIn, boolean p_213354_2_)
    {
        ResourceLocation resourcelocation = this.getLootTableResourceLocation();
        LootTable loottable = this.world.getServer().getLootTableManager().getLootTableFromLocation(resourcelocation);
        LootContext.Builder lootcontext$builder = this.getLootContextBuilder(p_213354_2_, damageSourceIn);
        loottable.generate(lootcontext$builder.build(LootParameterSets.ENTITY), this::entityDropItem);
    }

    protected LootContext.Builder getLootContextBuilder(boolean p_213363_1_, DamageSource damageSourceIn)
    {
        LootContext.Builder lootcontext$builder = (new LootContext.Builder((ServerWorld)this.world)).withRandom(this.rand).withParameter(LootParameters.THIS_ENTITY, this).withParameter(LootParameters.POSITION, new BlockPos(this)).withParameter(LootParameters.DAMAGE_SOURCE, damageSourceIn).withNullableParameter(LootParameters.KILLER_ENTITY, damageSourceIn.getTrueSource()).withNullableParameter(LootParameters.DIRECT_KILLER_ENTITY, damageSourceIn.getImmediateSource());

        if (p_213363_1_ && this.attackingPlayer != null)
        {
            lootcontext$builder = lootcontext$builder.withParameter(LootParameters.LAST_DAMAGE_PLAYER, this.attackingPlayer).withLuck(this.attackingPlayer.getLuck());
        }

        return lootcontext$builder;
    }

    public void knockBack(Entity entityIn, float strength, double xRatio, double zRatio)
    {
        if (!(this.rand.nextDouble() < this.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).getValue()))
        {
            this.isAirBorne = true;
            Vec3d vec3d = this.getMotion();
            Vec3d vec3d1 = (new Vec3d(xRatio, 0.0D, zRatio)).normalize().scale((double)strength);
            this.setMotion(vec3d.x / 2.0D - vec3d1.x, this.onGround ? Math.min(0.4D, vec3d.y / 2.0D + (double)strength) : vec3d.y, vec3d.z / 2.0D - vec3d1.z);
        }
    }

    @Nullable
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.ENTITY_GENERIC_HURT;
    }

    @Nullable
    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_GENERIC_DEATH;
    }

    protected SoundEvent getFallSound(int heightIn)
    {
        return heightIn > 4 ? SoundEvents.ENTITY_GENERIC_BIG_FALL : SoundEvents.ENTITY_GENERIC_SMALL_FALL;
    }

    protected SoundEvent getDrinkSound(ItemStack stack)
    {
        return stack.func_226629_F_();
    }

    public SoundEvent getEatSound(ItemStack itemStackIn)
    {
        return itemStackIn.func_226630_G_();
    }

    public boolean isOnLadder()
    {
        if (this.isSpectator())
        {
            return false;
        }
        else
        {
            BlockState blockstate = this.getBlockState();
            Block block = blockstate.getBlock();

            if (block != Blocks.LADDER && block != Blocks.VINE && block != Blocks.SCAFFOLDING)
            {
                return block instanceof TrapDoorBlock && this.canGoThroughtTrapDoorOnLadder(new BlockPos(this), blockstate);
            }
            else
            {
                return true;
            }
        }
    }

    public BlockState getBlockState()
    {
        return this.world.getBlockState(new BlockPos(this));
    }

    private boolean canGoThroughtTrapDoorOnLadder(BlockPos pos, BlockState state)
    {
        if (state.get(TrapDoorBlock.OPEN))
        {
            BlockState blockstate = this.world.getBlockState(pos.down());

            if (blockstate.getBlock() == Blocks.LADDER && blockstate.get(LadderBlock.FACING) == state.get(TrapDoorBlock.HORIZONTAL_FACING))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isAlive()
    {
        return !this.removed && this.getHealth() > 0.0F;
    }

    public boolean onLivingFall(float distance, float damageMultiplier)
    {
        boolean flag = super.onLivingFall(distance, damageMultiplier);
        int i = this.func_225508_e_(distance, damageMultiplier);

        if (i > 0)
        {
            this.playSound(this.getFallSound(i), 1.0F, 1.0F);
            this.playFallSound();
            this.attackEntityFrom(DamageSource.FALL, (float)i);
            return true;
        }
        else
        {
            return flag;
        }
    }

    protected int func_225508_e_(float p_225508_1_, float p_225508_2_)
    {
        EffectInstance effectinstance = this.getActivePotionEffect(Effects.JUMP_BOOST);
        float f = effectinstance == null ? 0.0F : (float)(effectinstance.getAmplifier() + 1);
        return MathHelper.ceil((p_225508_1_ - 3.0F - f) * p_225508_2_);
    }

    protected void playFallSound()
    {
        if (!this.isSilent())
        {
            int i = MathHelper.floor(this.getPosX());
            int j = MathHelper.floor(this.getPosY() - (double)0.2F);
            int k = MathHelper.floor(this.getPosZ());
            BlockState blockstate = this.world.getBlockState(new BlockPos(i, j, k));

            if (!blockstate.isAir())
            {
                SoundType soundtype = blockstate.getSoundType();
                this.playSound(soundtype.getFallSound(), soundtype.getVolume() * 0.5F, soundtype.getPitch() * 0.75F);
            }
        }
    }

    public void performHurtAnimation()
    {
        this.maxHurtTime = 10;
        this.hurtTime = this.maxHurtTime;
        this.attackedAtYaw = 0.0F;
    }

    public int getTotalArmorValue()
    {
        IAttributeInstance iattributeinstance = this.getAttribute(SharedMonsterAttributes.ARMOR);
        return MathHelper.floor(iattributeinstance.getValue());
    }

    protected void damageArmor(float damage)
    {
    }

    protected void damageShield(float damage)
    {
    }

    protected float applyArmorCalculations(DamageSource source, float damage)
    {
        if (!source.isUnblockable())
        {
            this.damageArmor(damage);
            damage = CombatRules.getDamageAfterAbsorb(damage, (float)this.getTotalArmorValue(), (float)this.getAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getValue());
        }

        return damage;
    }

    protected float applyPotionDamageCalculations(DamageSource source, float damage)
    {
        if (source.isDamageAbsolute())
        {
            return damage;
        }
        else
        {
            if (this.isPotionActive(Effects.RESISTANCE) && source != DamageSource.OUT_OF_WORLD)
            {
                int i = (this.getActivePotionEffect(Effects.RESISTANCE).getAmplifier() + 1) * 5;
                int j = 25 - i;
                float f = damage * (float)j;
                float f1 = damage;
                damage = Math.max(f / 25.0F, 0.0F);
                float f2 = f1 - damage;

                if (f2 > 0.0F && f2 < 3.4028235E37F)
                {
                    if (this instanceof ServerPlayerEntity)
                    {
                        ((ServerPlayerEntity)this).addStat(Stats.DAMAGE_RESISTED, Math.round(f2 * 10.0F));
                    }
                    else if (source.getTrueSource() instanceof ServerPlayerEntity)
                    {
                        ((ServerPlayerEntity)source.getTrueSource()).addStat(Stats.DAMAGE_DEALT_RESISTED, Math.round(f2 * 10.0F));
                    }
                }
            }

            if (damage <= 0.0F)
            {
                return 0.0F;
            }
            else
            {
                int k = EnchantmentHelper.getEnchantmentModifierDamage(this.getArmorInventoryList(), source);

                if (k > 0)
                {
                    damage = CombatRules.getDamageAfterMagicAbsorb(damage, (float)k);
                }

                return damage;
            }
        }
    }

    protected void damageEntity(DamageSource damageSrc, float damageAmount)
    {
        if (!this.isInvulnerableTo(damageSrc))
        {
            damageAmount = this.applyArmorCalculations(damageSrc, damageAmount);
            damageAmount = this.applyPotionDamageCalculations(damageSrc, damageAmount);
            float f2 = Math.max(damageAmount - this.getAbsorptionAmount(), 0.0F);
            this.setAbsorptionAmount(this.getAbsorptionAmount() - (damageAmount - f2));
            float f = damageAmount - f2;

            if (f > 0.0F && f < 3.4028235E37F && damageSrc.getTrueSource() instanceof ServerPlayerEntity)
            {
                ((ServerPlayerEntity)damageSrc.getTrueSource()).addStat(Stats.DAMAGE_DEALT_ABSORBED, Math.round(f * 10.0F));
            }

            if (f2 != 0.0F)
            {
                float f1 = this.getHealth();
                this.setHealth(f1 - f2);
                this.getCombatTracker().trackDamage(damageSrc, f1, f2);
                this.setAbsorptionAmount(this.getAbsorptionAmount() - f2);
            }
        }
    }

    public CombatTracker getCombatTracker()
    {
        return this.combatTracker;
    }

    @Nullable
    public LivingEntity getAttackingEntity()
    {
        if (this.combatTracker.getBestAttacker() != null)
        {
            return this.combatTracker.getBestAttacker();
        }
        else if (this.attackingPlayer != null)
        {
            return this.attackingPlayer;
        }
        else
        {
            return this.revengeTarget != null ? this.revengeTarget : null;
        }
    }

    public final float getMaxHealth()
    {
        return (float)this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).getValue();
    }

    public final int getArrowCountInEntity()
    {
        return this.dataManager.get(ARROW_COUNT_IN_ENTITY);
    }

    public final void setArrowCountInEntity(int count)
    {
        this.dataManager.set(ARROW_COUNT_IN_ENTITY, count);
    }

    public final int getBeeStingCount()
    {
        return this.dataManager.get(BEE_STING_COUNT);
    }

    public final void setBeeStingCount(int p_226300_1_)
    {
        this.dataManager.set(BEE_STING_COUNT, p_226300_1_);
    }

    private int getArmSwingAnimationEnd()
    {
        if (EffectUtils.hasMiningSpeedup(this))
        {
            return 6 - (1 + EffectUtils.getMiningSpeedup(this));
        }
        else
        {
            return this.isPotionActive(Effects.MINING_FATIGUE) ? 6 + (1 + this.getActivePotionEffect(Effects.MINING_FATIGUE).getAmplifier()) * 2 : 6;
        }
    }

    public void swingArm(Hand hand)
    {
        this.func_226292_a_(hand, false);
    }

    public void func_226292_a_(Hand p_226292_1_, boolean p_226292_2_)
    {
        if (!this.isSwingInProgress || this.swingProgressInt >= this.getArmSwingAnimationEnd() / 2 || this.swingProgressInt < 0)
        {
            this.swingProgressInt = -1;
            this.isSwingInProgress = true;
            this.swingingHand = p_226292_1_;

            if (this.world instanceof ServerWorld)
            {
                SAnimateHandPacket sanimatehandpacket = new SAnimateHandPacket(this, p_226292_1_ == Hand.MAIN_HAND ? 0 : 3);
                ServerChunkProvider serverchunkprovider = ((ServerWorld)this.world).getChunkProvider();

                if (p_226292_2_)
                {
                    serverchunkprovider.sendToTrackingAndSelf(this, sanimatehandpacket);
                }
                else
                {
                    serverchunkprovider.sendToAllTracking(this, sanimatehandpacket);
                }
            }
        }
    }

    public void handleStatusUpdate(byte id)
    {
        switch (id)
        {
            case 2:
            case 33:
            case 36:
            case 37:
            case 44:
                boolean flag1 = id == 33;
                boolean flag2 = id == 36;
                boolean flag3 = id == 37;
                boolean flag = id == 44;
                this.limbSwingAmount = 1.5F;
                this.hurtResistantTime = 20;
                this.maxHurtTime = 10;
                this.hurtTime = this.maxHurtTime;
                this.attackedAtYaw = 0.0F;

                if (flag1)
                {
                    this.playSound(SoundEvents.ENCHANT_THORNS_HIT, this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                }

                DamageSource damagesource;

                if (flag3)
                {
                    damagesource = DamageSource.ON_FIRE;
                }
                else if (flag2)
                {
                    damagesource = DamageSource.DROWN;
                }
                else if (flag)
                {
                    damagesource = DamageSource.SWEET_BERRY_BUSH;
                }
                else
                {
                    damagesource = DamageSource.GENERIC;
                }

                SoundEvent soundevent1 = this.getHurtSound(damagesource);

                if (soundevent1 != null)
                {
                    this.playSound(soundevent1, this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                }

                this.attackEntityFrom(DamageSource.GENERIC, 0.0F);
                break;

            case 3:
                SoundEvent soundevent = this.getDeathSound();

                if (soundevent != null)
                {
                    this.playSound(soundevent, this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
                }

                if (!(this instanceof PlayerEntity))
                {
                    this.setHealth(0.0F);
                    this.onDeath(DamageSource.GENERIC);
                }

                break;

            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 31:
            case 32:
            case 34:
            case 35:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 45:
            case 53:
            default:
                super.handleStatusUpdate(id);
                break;

            case 29:
                this.playSound(SoundEvents.ITEM_SHIELD_BLOCK, 1.0F, 0.8F + this.world.rand.nextFloat() * 0.4F);
                break;

            case 30:
                this.playSound(SoundEvents.ITEM_SHIELD_BREAK, 0.8F, 0.8F + this.world.rand.nextFloat() * 0.4F);
                break;

            case 46:
                int i = 128;

                for (int j = 0; j < 128; ++j)
                {
                    double d0 = (double)j / 127.0D;
                    float f = (this.rand.nextFloat() - 0.5F) * 0.2F;
                    float f1 = (this.rand.nextFloat() - 0.5F) * 0.2F;
                    float f2 = (this.rand.nextFloat() - 0.5F) * 0.2F;
                    double d1 = MathHelper.lerp(d0, this.prevPosX, this.getPosX()) + (this.rand.nextDouble() - 0.5D) * (double)this.getWidth() * 2.0D;
                    double d2 = MathHelper.lerp(d0, this.prevPosY, this.getPosY()) + this.rand.nextDouble() * (double)this.getHeight();
                    double d3 = MathHelper.lerp(d0, this.prevPosZ, this.getPosZ()) + (this.rand.nextDouble() - 0.5D) * (double)this.getWidth() * 2.0D;
                    this.world.addParticle(ParticleTypes.PORTAL, d1, d2, d3, (double)f, (double)f1, (double)f2);
                }

                break;

            case 47:
                this.renderBrokenItemStack(this.getItemStackFromSlot(EquipmentSlotType.MAINHAND));
                break;

            case 48:
                this.renderBrokenItemStack(this.getItemStackFromSlot(EquipmentSlotType.OFFHAND));
                break;

            case 49:
                this.renderBrokenItemStack(this.getItemStackFromSlot(EquipmentSlotType.HEAD));
                break;

            case 50:
                this.renderBrokenItemStack(this.getItemStackFromSlot(EquipmentSlotType.CHEST));
                break;

            case 51:
                this.renderBrokenItemStack(this.getItemStackFromSlot(EquipmentSlotType.LEGS));
                break;

            case 52:
                this.renderBrokenItemStack(this.getItemStackFromSlot(EquipmentSlotType.FEET));
                break;

            case 54:
                HoneyBlock.func_226936_b_(this);
        }
    }

    protected void outOfWorld()
    {
        this.attackEntityFrom(DamageSource.OUT_OF_WORLD, 4.0F);
    }

    protected void updateArmSwingProgress()
    {
        int i = this.getArmSwingAnimationEnd();

        if (this.isSwingInProgress)
        {
            ++this.swingProgressInt;

            if (this.swingProgressInt >= i)
            {
                this.swingProgressInt = 0;
                this.isSwingInProgress = false;
            }
        }
        else
        {
            this.swingProgressInt = 0;
        }

        this.swingProgress = (float)this.swingProgressInt / (float)i;
    }

    public IAttributeInstance getAttribute(IAttribute attribute)
    {
        return this.getAttributes().getAttributeInstance(attribute);
    }

    public AbstractAttributeMap getAttributes()
    {
        if (this.attributes == null)
        {
            this.attributes = new AttributeMap();
        }

        return this.attributes;
    }

    public CreatureAttribute getCreatureAttribute()
    {
        return CreatureAttribute.UNDEFINED;
    }

    public ItemStack getHeldItemMainhand()
    {
        return this.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
    }

    public ItemStack getHeldItemOffhand()
    {
        return this.getItemStackFromSlot(EquipmentSlotType.OFFHAND);
    }

    public ItemStack getHeldItem(Hand hand)
    {
        if (hand == Hand.MAIN_HAND)
        {
            return this.getItemStackFromSlot(EquipmentSlotType.MAINHAND);
        }
        else if (hand == Hand.OFF_HAND)
        {
            return this.getItemStackFromSlot(EquipmentSlotType.OFFHAND);
        }
        else
        {
            throw new IllegalArgumentException("Invalid hand " + hand);
        }
    }

    public void setHeldItem(Hand hand, ItemStack stack)
    {
        if (hand == Hand.MAIN_HAND)
        {
            this.setItemStackToSlot(EquipmentSlotType.MAINHAND, stack);
        }
        else
        {
            if (hand != Hand.OFF_HAND)
            {
                throw new IllegalArgumentException("Invalid hand " + hand);
            }

            this.setItemStackToSlot(EquipmentSlotType.OFFHAND, stack);
        }
    }

    public boolean hasItemInSlot(EquipmentSlotType slotIn)
    {
        return !this.getItemStackFromSlot(slotIn).isEmpty();
    }

    public abstract Iterable<ItemStack> getArmorInventoryList();

    public abstract ItemStack getItemStackFromSlot(EquipmentSlotType slotIn);

    public abstract void setItemStackToSlot(EquipmentSlotType slotIn, ItemStack stack);

    public float func_213343_cS()
    {
        Iterable<ItemStack> iterable = this.getArmorInventoryList();
        int i = 0;
        int j = 0;

        for (ItemStack itemstack : iterable)
        {
            if (!itemstack.isEmpty())
            {
                ++j;
            }

            ++i;
        }

        return i > 0 ? (float)j / (float)i : 0.0F;
    }

    public void setSprinting(boolean sprinting)
    {
        super.setSprinting(sprinting);
        IAttributeInstance iattributeinstance = this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);

        if (iattributeinstance.getModifier(SPRINTING_SPEED_BOOST_ID) != null)
        {
            iattributeinstance.removeModifier(SPRINTING_SPEED_BOOST);
        }

        if (sprinting)
        {
            iattributeinstance.applyModifier(SPRINTING_SPEED_BOOST);
        }
    }

    protected float getSoundVolume()
    {
        return 1.0F;
    }

    protected float getSoundPitch()
    {
        return this.isChild() ? (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.5F : (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F;
    }

    protected boolean isMovementBlocked()
    {
        return this.getHealth() <= 0.0F;
    }

    public void applyEntityCollision(Entity entityIn)
    {
        if (!this.isSleeping())
        {
            super.applyEntityCollision(entityIn);
        }
    }

    private void dismountEntity(Entity entityIn)
    {
        if (this.world.getBlockState(new BlockPos(entityIn)).getBlock().isIn(BlockTags.PORTALS))
        {
            this.setPosition(entityIn.getPosX(), entityIn.getPosYHeight(1.0D) + 0.001D, entityIn.getPosZ());
        }
        else if (!(entityIn instanceof BoatEntity) && !(entityIn instanceof AbstractHorseEntity))
        {
            double d1 = entityIn.getPosX();
            double d13 = entityIn.getPosYHeight(1.0D);
            double d3 = entityIn.getPosZ();
            Direction direction = entityIn.getAdjustedHorizontalFacing();

            if (direction != null && direction.getAxis() != Direction.Axis.Y)
            {
                Direction direction1 = direction.rotateY();
                int[][] aint1 = new int[][] {{0, 1}, {0, -1}, { -1, 1}, { -1, -1}, {1, 1}, {1, -1}, { -1, 0}, {1, 0}, {0, 1}};
                double d14 = Math.floor(this.getPosX()) + 0.5D;
                double d15 = Math.floor(this.getPosZ()) + 0.5D;
                double d16 = this.getBoundingBox().maxX - this.getBoundingBox().minX;
                double d17 = this.getBoundingBox().maxZ - this.getBoundingBox().minZ;
                AxisAlignedBB axisalignedbb3 = new AxisAlignedBB(d14 - d16 / 2.0D, entityIn.getBoundingBox().minY, d15 - d17 / 2.0D, d14 + d16 / 2.0D, Math.floor(entityIn.getBoundingBox().minY) + (double)this.getHeight(), d15 + d17 / 2.0D);

                for (int[] aint : aint1)
                {
                    double d9 = (double)(direction.getXOffset() * aint[0] + direction1.getXOffset() * aint[1]);
                    double d10 = (double)(direction.getZOffset() * aint[0] + direction1.getZOffset() * aint[1]);
                    double d11 = d14 + d9;
                    double d12 = d15 + d10;
                    AxisAlignedBB axisalignedbb2 = axisalignedbb3.offset(d9, 0.0D, d10);

                    if (this.world.hasNoCollisions(this, axisalignedbb2))
                    {
                        BlockPos blockpos2 = new BlockPos(d11, this.getPosY(), d12);

                        if (this.world.getBlockState(blockpos2).isTopSolid(this.world, blockpos2, this))
                        {
                            this.setPositionAndUpdate(d11, this.getPosY() + 1.0D, d12);
                            return;
                        }

                        BlockPos blockpos1 = new BlockPos(d11, this.getPosY() - 1.0D, d12);

                        if (this.world.getBlockState(blockpos1).isTopSolid(this.world, blockpos1, this) || this.world.getFluidState(blockpos1).isTagged(FluidTags.WATER))
                        {
                            d1 = d11;
                            d13 = this.getPosY() + 1.0D;
                            d3 = d12;
                        }
                    }
                    else
                    {
                        BlockPos blockpos = new BlockPos(d11, this.getPosY() + 1.0D, d12);

                        if (this.world.hasNoCollisions(this, axisalignedbb2.offset(0.0D, 1.0D, 0.0D)) && this.world.getBlockState(blockpos).isTopSolid(this.world, blockpos, this))
                        {
                            d1 = d11;
                            d13 = this.getPosY() + 2.0D;
                            d3 = d12;
                        }
                    }
                }
            }

            this.setPositionAndUpdate(d1, d13, d3);
        }
        else
        {
            double d0 = (double)(this.getWidth() / 2.0F + entityIn.getWidth() / 2.0F) + 0.4D;
            AxisAlignedBB axisalignedbb = entityIn.getBoundingBox();
            float f;
            double d2;
            int i;

            if (entityIn instanceof BoatEntity)
            {
                d2 = axisalignedbb.maxY;
                i = 2;
                f = 0.0F;
            }
            else
            {
                d2 = axisalignedbb.minY;
                i = 3;
                f = ((float)Math.PI / 2F) * (float)(this.getPrimaryHand() == HandSide.RIGHT ? -1 : 1);
            }

            float f1 = -this.rotationYaw * ((float)Math.PI / 180F) - (float)Math.PI + f;
            float f2 = -MathHelper.sin(f1);
            float f3 = -MathHelper.cos(f1);
            double d4 = Math.abs(f2) > Math.abs(f3) ? d0 / (double)Math.abs(f2) : d0 / (double)Math.abs(f3);
            AxisAlignedBB axisalignedbb1 = this.getBoundingBox().offset(-this.getPosX(), -this.getPosY(), -this.getPosZ());
            ImmutableSet<Entity> immutableset = ImmutableSet.of(this, entityIn);
            double d5 = this.getPosX() + (double)f2 * d4;
            double d6 = this.getPosZ() + (double)f3 * d4;
            double d7 = 0.001D;

            for (int j = 0; j < i; ++j)
            {
                double d8 = d2 + d7;

                if (this.world.hasNoCollisions(this, axisalignedbb1.offset(d5, d8, d6), immutableset))
                {
                    this.setPosition(d5, d8, d6);
                    return;
                }

                ++d7;
            }

            this.setPosition(entityIn.getPosX(), entityIn.getPosYHeight(1.0D) + 0.001D, entityIn.getPosZ());
        }
    }

    public boolean getAlwaysRenderNameTagForRender()
    {
        return this.isCustomNameVisible();
    }

    protected float getJumpUpwardsMotion()
    {
        return 0.42F * this.getJumpFactor();
    }

    protected void jump()
    {
        float f = this.getJumpUpwardsMotion();

        if (this.isPotionActive(Effects.JUMP_BOOST))
        {
            f += 0.1F * (float)(this.getActivePotionEffect(Effects.JUMP_BOOST).getAmplifier() + 1);
        }

        Vec3d vec3d = this.getMotion();
        this.setMotion(vec3d.x, (double)f, vec3d.z);

        if (this.isSprinting())
        {
            float f1 = this.rotationYaw * ((float)Math.PI / 180F);
            this.setMotion(this.getMotion().add((double)(-MathHelper.sin(f1) * 0.2F), 0.0D, (double)(MathHelper.cos(f1) * 0.2F)));
        }

        this.isAirBorne = true;
    }

    protected void handleFluidSneak()
    {
        this.setMotion(this.getMotion().add(0.0D, (double) - 0.04F, 0.0D));
    }

    protected void handleFluidJump(Tag<Fluid> fluidTag)
    {
        this.setMotion(this.getMotion().add(0.0D, (double)0.04F, 0.0D));
    }

    protected float getWaterSlowDown()
    {
        return 0.8F;
    }

    public void travel(Vec3d p_213352_1_)
    {
        if (this.isServerWorld() || this.canPassengerSteer())
        {
            double d0 = 0.08D;
            boolean flag = this.getMotion().y <= 0.0D;

            if (flag && this.isPotionActive(Effects.SLOW_FALLING))
            {
                d0 = 0.01D;
                this.fallDistance = 0.0F;
            }

            if (!this.isInWater() || this instanceof PlayerEntity && ((PlayerEntity)this).abilities.isFlying)
            {
                if (!this.isInLava() || this instanceof PlayerEntity && ((PlayerEntity)this).abilities.isFlying)
                {
                    if (this.isElytraFlying())
                    {
                        Vec3d vec3d3 = this.getMotion();

                        if (vec3d3.y > -0.5D)
                        {
                            this.fallDistance = 1.0F;
                        }

                        Vec3d vec3d = this.getLookVec();
                        float f6 = this.rotationPitch * ((float)Math.PI / 180F);
                        double d9 = Math.sqrt(vec3d.x * vec3d.x + vec3d.z * vec3d.z);
                        double d11 = Math.sqrt(horizontalMag(vec3d3));
                        double d12 = vec3d.length();
                        float f3 = MathHelper.cos(f6);
                        f3 = (float)((double)f3 * (double)f3 * Math.min(1.0D, d12 / 0.4D));
                        vec3d3 = this.getMotion().add(0.0D, d0 * (-1.0D + (double)f3 * 0.75D), 0.0D);

                        if (vec3d3.y < 0.0D && d9 > 0.0D)
                        {
                            double d3 = vec3d3.y * -0.1D * (double)f3;
                            vec3d3 = vec3d3.add(vec3d.x * d3 / d9, d3, vec3d.z * d3 / d9);
                        }

                        if (f6 < 0.0F && d9 > 0.0D)
                        {
                            double d13 = d11 * (double)(-MathHelper.sin(f6)) * 0.04D;
                            vec3d3 = vec3d3.add(-vec3d.x * d13 / d9, d13 * 3.2D, -vec3d.z * d13 / d9);
                        }

                        if (d9 > 0.0D)
                        {
                            vec3d3 = vec3d3.add((vec3d.x / d9 * d11 - vec3d3.x) * 0.1D, 0.0D, (vec3d.z / d9 * d11 - vec3d3.z) * 0.1D);
                        }

                        this.setMotion(vec3d3.mul((double)0.99F, (double)0.98F, (double)0.99F));
                        this.move(MoverType.SELF, this.getMotion());

                        if (this.collidedHorizontally && !this.world.isRemote)
                        {
                            double d14 = Math.sqrt(horizontalMag(this.getMotion()));
                            double d4 = d11 - d14;
                            float f4 = (float)(d4 * 10.0D - 3.0D);

                            if (f4 > 0.0F)
                            {
                                this.playSound(this.getFallSound((int)f4), 1.0F, 1.0F);
                                this.attackEntityFrom(DamageSource.FLY_INTO_WALL, f4);
                            }
                        }

                        if (this.onGround && !this.world.isRemote)
                        {
                            this.setFlag(7, false);
                        }
                    }
                    else
                    {
                        BlockPos blockpos = this.getPositionUnderneath();
                        float f5 = this.world.getBlockState(blockpos).getBlock().getSlipperiness();
                        float f7 = this.onGround ? f5 * 0.91F : 0.91F;
                        this.moveRelative(this.getRelevantMoveFactor(f5), p_213352_1_);
                        this.setMotion(this.func_213362_f(this.getMotion()));
                        this.move(MoverType.SELF, this.getMotion());
                        Vec3d vec3d5 = this.getMotion();

                        if ((this.collidedHorizontally || this.isJumping) && this.isOnLadder())
                        {
                            vec3d5 = new Vec3d(vec3d5.x, 0.2D, vec3d5.z);
                        }

                        double d10 = vec3d5.y;

                        if (this.isPotionActive(Effects.LEVITATION))
                        {
                            d10 += (0.05D * (double)(this.getActivePotionEffect(Effects.LEVITATION).getAmplifier() + 1) - vec3d5.y) * 0.2D;
                            this.fallDistance = 0.0F;
                        }
                        else if (this.world.isRemote && !this.world.isBlockLoaded(blockpos))
                        {
                            if (this.getPosY() > 0.0D)
                            {
                                d10 = -0.1D;
                            }
                            else
                            {
                                d10 = 0.0D;
                            }
                        }
                        else if (!this.hasNoGravity())
                        {
                            d10 -= d0;
                        }

                        this.setMotion(vec3d5.x * (double)f7, d10 * (double)0.98F, vec3d5.z * (double)f7);
                    }
                }
                else
                {
                    double d7 = this.getPosY();
                    this.moveRelative(0.02F, p_213352_1_);
                    this.move(MoverType.SELF, this.getMotion());
                    this.setMotion(this.getMotion().scale(0.5D));

                    if (!this.hasNoGravity())
                    {
                        this.setMotion(this.getMotion().add(0.0D, -d0 / 4.0D, 0.0D));
                    }

                    Vec3d vec3d4 = this.getMotion();

                    if (this.collidedHorizontally && this.isOffsetPositionInLiquid(vec3d4.x, vec3d4.y + (double)0.6F - this.getPosY() + d7, vec3d4.z))
                    {
                        this.setMotion(vec3d4.x, (double)0.3F, vec3d4.z);
                    }
                }
            }
            else
            {
                double d1 = this.getPosY();
                float f = this.isSprinting() ? 0.9F : this.getWaterSlowDown();
                float f1 = 0.02F;
                float f2 = (float)EnchantmentHelper.getDepthStriderModifier(this);

                if (f2 > 3.0F)
                {
                    f2 = 3.0F;
                }

                if (!this.onGround)
                {
                    f2 *= 0.5F;
                }

                if (f2 > 0.0F)
                {
                    f += (0.54600006F - f) * f2 / 3.0F;
                    f1 += (this.getAIMoveSpeed() - f1) * f2 / 3.0F;
                }

                if (this.isPotionActive(Effects.DOLPHINS_GRACE))
                {
                    f = 0.96F;
                }

                this.moveRelative(f1, p_213352_1_);
                this.move(MoverType.SELF, this.getMotion());
                Vec3d vec3d1 = this.getMotion();

                if (this.collidedHorizontally && this.isOnLadder())
                {
                    vec3d1 = new Vec3d(vec3d1.x, 0.2D, vec3d1.z);
                }

                this.setMotion(vec3d1.mul((double)f, (double)0.8F, (double)f));

                if (!this.hasNoGravity() && !this.isSprinting())
                {
                    Vec3d vec3d2 = this.getMotion();
                    double d2;

                    if (flag && Math.abs(vec3d2.y - 0.005D) >= 0.003D && Math.abs(vec3d2.y - d0 / 16.0D) < 0.003D)
                    {
                        d2 = -0.003D;
                    }
                    else
                    {
                        d2 = vec3d2.y - d0 / 16.0D;
                    }

                    this.setMotion(vec3d2.x, d2, vec3d2.z);
                }

                Vec3d vec3d6 = this.getMotion();

                if (this.collidedHorizontally && this.isOffsetPositionInLiquid(vec3d6.x, vec3d6.y + (double)0.6F - this.getPosY() + d1, vec3d6.z))
                {
                    this.setMotion(vec3d6.x, (double)0.3F, vec3d6.z);
                }
            }
        }

        this.prevLimbSwingAmount = this.limbSwingAmount;
        double d5 = this.getPosX() - this.prevPosX;
        double d6 = this.getPosZ() - this.prevPosZ;
        double d8 = this instanceof IFlyingAnimal ? this.getPosY() - this.prevPosY : 0.0D;
        float f8 = MathHelper.sqrt(d5 * d5 + d8 * d8 + d6 * d6) * 4.0F;

        if (f8 > 1.0F)
        {
            f8 = 1.0F;
        }

        this.limbSwingAmount += (f8 - this.limbSwingAmount) * 0.4F;
        this.limbSwing += this.limbSwingAmount;
    }

    private Vec3d func_213362_f(Vec3d p_213362_1_)
    {
        if (this.isOnLadder())
        {
            this.fallDistance = 0.0F;
            float f = 0.15F;
            double d0 = MathHelper.clamp(p_213362_1_.x, (double) - 0.15F, (double)0.15F);
            double d1 = MathHelper.clamp(p_213362_1_.z, (double) - 0.15F, (double)0.15F);
            double d2 = Math.max(p_213362_1_.y, (double) - 0.15F);

            if (d2 < 0.0D && this.getBlockState().getBlock() != Blocks.SCAFFOLDING && this.func_226296_dJ_() && this instanceof PlayerEntity)
            {
                d2 = 0.0D;
            }

            p_213362_1_ = new Vec3d(d0, d2, d1);
        }

        return p_213362_1_;
    }

    private float getRelevantMoveFactor(float p_213335_1_)
    {
        return this.onGround ? this.getAIMoveSpeed() * (0.21600002F / (p_213335_1_ * p_213335_1_ * p_213335_1_)) : this.jumpMovementFactor;
    }

    public float getAIMoveSpeed()
    {
        return this.landMovementFactor;
    }

    public void setAIMoveSpeed(float speedIn)
    {
        this.landMovementFactor = speedIn;
    }

    public boolean attackEntityAsMob(Entity entityIn)
    {
        this.setLastAttackedEntity(entityIn);
        return false;
    }

    public void tick()
    {
        super.tick();
        this.updateActiveHand();
        this.updateSwimAnimation();

        if (!this.world.isRemote)
        {
            int i = this.getArrowCountInEntity();

            if (i > 0)
            {
                if (this.arrowHitTimer <= 0)
                {
                    this.arrowHitTimer = 20 * (30 - i);
                }

                --this.arrowHitTimer;

                if (this.arrowHitTimer <= 0)
                {
                    this.setArrowCountInEntity(i - 1);
                }
            }

            int j = this.getBeeStingCount();

            if (j > 0)
            {
                if (this.beeStingRemovalCooldown <= 0)
                {
                    this.beeStingRemovalCooldown = 20 * (30 - j);
                }

                --this.beeStingRemovalCooldown;

                if (this.beeStingRemovalCooldown <= 0)
                {
                    this.setBeeStingCount(j - 1);
                }
            }

            for (EquipmentSlotType equipmentslottype : EquipmentSlotType.values())
            {
                ItemStack itemstack;

                switch (equipmentslottype.getSlotType())
                {
                    case HAND:
                        itemstack = this.handInventory.get(equipmentslottype.getIndex());
                        break;

                    case ARMOR:
                        itemstack = this.armorArray.get(equipmentslottype.getIndex());
                        break;

                    default:
                        continue;
                }

                ItemStack itemstack1 = this.getItemStackFromSlot(equipmentslottype);

                if (!ItemStack.areItemStacksEqual(itemstack1, itemstack))
                {
                    ((ServerWorld)this.world).getChunkProvider().sendToAllTracking(this, new SEntityEquipmentPacket(this.getEntityId(), equipmentslottype, itemstack1));

                    if (!itemstack.isEmpty())
                    {
                        this.getAttributes().removeAttributeModifiers(itemstack.getAttributeModifiers(equipmentslottype));
                    }

                    if (!itemstack1.isEmpty())
                    {
                        this.getAttributes().applyAttributeModifiers(itemstack1.getAttributeModifiers(equipmentslottype));
                    }

                    switch (equipmentslottype.getSlotType())
                    {
                        case HAND:
                            this.handInventory.set(equipmentslottype.getIndex(), itemstack1.copy());
                            break;

                        case ARMOR:
                            this.armorArray.set(equipmentslottype.getIndex(), itemstack1.copy());
                    }
                }
            }

            if (this.ticksExisted % 20 == 0)
            {
                this.getCombatTracker().reset();
            }

            if (!this.glowing)
            {
                boolean flag = this.isPotionActive(Effects.GLOWING);

                if (this.getFlag(6) != flag)
                {
                    this.setFlag(6, flag);
                }
            }

            if (this.isSleeping() && !this.isInValidBed())
            {
                this.wakeUp();
            }
        }

        this.livingTick();
        double d0 = this.getPosX() - this.prevPosX;
        double d1 = this.getPosZ() - this.prevPosZ;
        float f2 = (float)(d0 * d0 + d1 * d1);
        float f3 = this.renderYawOffset;
        float f4 = 0.0F;
        this.prevOnGroundSpeedFactor = this.onGroundSpeedFactor;
        float f5 = 0.0F;

        if (f2 > 0.0025000002F)
        {
            f5 = 1.0F;
            f4 = (float)Math.sqrt((double)f2) * 3.0F;
            float f = (float)MathHelper.atan2(d1, d0) * (180F / (float)Math.PI) - 90.0F;
            float f1 = MathHelper.abs(MathHelper.wrapDegrees(this.rotationYaw) - f);

            if (95.0F < f1 && f1 < 265.0F)
            {
                f3 = f - 180.0F;
            }
            else
            {
                f3 = f;
            }
        }

        if (this.swingProgress > 0.0F)
        {
            f3 = this.rotationYaw;
        }

        if (!this.onGround)
        {
            f5 = 0.0F;
        }

        this.onGroundSpeedFactor += (f5 - this.onGroundSpeedFactor) * 0.3F;
        this.world.getProfiler().startSection("headTurn");
        f4 = this.updateDistance(f3, f4);
        this.world.getProfiler().endSection();
        this.world.getProfiler().startSection("rangeChecks");

        while (this.rotationYaw - this.prevRotationYaw < -180.0F)
        {
            this.prevRotationYaw -= 360.0F;
        }

        while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
        {
            this.prevRotationYaw += 360.0F;
        }

        while (this.renderYawOffset - this.prevRenderYawOffset < -180.0F)
        {
            this.prevRenderYawOffset -= 360.0F;
        }

        while (this.renderYawOffset - this.prevRenderYawOffset >= 180.0F)
        {
            this.prevRenderYawOffset += 360.0F;
        }

        while (this.rotationPitch - this.prevRotationPitch < -180.0F)
        {
            this.prevRotationPitch -= 360.0F;
        }

        while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
        {
            this.prevRotationPitch += 360.0F;
        }

        while (this.rotationYawHead - this.prevRotationYawHead < -180.0F)
        {
            this.prevRotationYawHead -= 360.0F;
        }

        while (this.rotationYawHead - this.prevRotationYawHead >= 180.0F)
        {
            this.prevRotationYawHead += 360.0F;
        }

        this.world.getProfiler().endSection();
        this.movedDistance += f4;

        if (this.isElytraFlying())
        {
            ++this.ticksElytraFlying;
        }
        else
        {
            this.ticksElytraFlying = 0;
        }

        if (this.isSleeping())
        {
            this.rotationPitch = 0.0F;
        }
    }

    protected float updateDistance(float p_110146_1_, float p_110146_2_)
    {
        float f = MathHelper.wrapDegrees(p_110146_1_ - this.renderYawOffset);
        this.renderYawOffset += f * 0.3F;
        float f1 = MathHelper.wrapDegrees(this.rotationYaw - this.renderYawOffset);
        boolean flag = f1 < -90.0F || f1 >= 90.0F;

        if (f1 < -75.0F)
        {
            f1 = -75.0F;
        }

        if (f1 >= 75.0F)
        {
            f1 = 75.0F;
        }

        this.renderYawOffset = this.rotationYaw - f1;

        if (f1 * f1 > 2500.0F)
        {
            this.renderYawOffset += f1 * 0.2F;
        }

        if (flag)
        {
            p_110146_2_ *= -1.0F;
        }

        return p_110146_2_;
    }

    public void livingTick()
    {
        if (this.jumpTicks > 0)
        {
            --this.jumpTicks;
        }

        if (this.canPassengerSteer())
        {
            this.newPosRotationIncrements = 0;
            this.setPacketCoordinates(this.getPosX(), this.getPosY(), this.getPosZ());
        }

        if (this.newPosRotationIncrements > 0)
        {
            double d0 = this.getPosX() + (this.interpTargetX - this.getPosX()) / (double)this.newPosRotationIncrements;
            double d2 = this.getPosY() + (this.interpTargetY - this.getPosY()) / (double)this.newPosRotationIncrements;
            double d4 = this.getPosZ() + (this.interpTargetZ - this.getPosZ()) / (double)this.newPosRotationIncrements;
            double d6 = MathHelper.wrapDegrees(this.interpTargetYaw - (double)this.rotationYaw);
            this.rotationYaw = (float)((double)this.rotationYaw + d6 / (double)this.newPosRotationIncrements);
            this.rotationPitch = (float)((double)this.rotationPitch + (this.interpTargetPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
            --this.newPosRotationIncrements;
            this.setPosition(d0, d2, d4);
            this.setRotation(this.rotationYaw, this.rotationPitch);
        }
        else if (!this.isServerWorld())
        {
            this.setMotion(this.getMotion().scale(0.98D));
        }

        if (this.interpTicksHead > 0)
        {
            this.rotationYawHead = (float)((double)this.rotationYawHead + MathHelper.wrapDegrees(this.interpTargetHeadYaw - (double)this.rotationYawHead) / (double)this.interpTicksHead);
            --this.interpTicksHead;
        }

        Vec3d vec3d = this.getMotion();
        double d1 = vec3d.x;
        double d3 = vec3d.y;
        double d5 = vec3d.z;

        if (Math.abs(vec3d.x) < 0.003D)
        {
            d1 = 0.0D;
        }

        if (Math.abs(vec3d.y) < 0.003D)
        {
            d3 = 0.0D;
        }

        if (Math.abs(vec3d.z) < 0.003D)
        {
            d5 = 0.0D;
        }

        this.setMotion(d1, d3, d5);
        this.world.getProfiler().startSection("ai");

        if (this.isMovementBlocked())
        {
            this.isJumping = false;
            this.moveStrafing = 0.0F;
            this.moveForward = 0.0F;
        }
        else if (this.isServerWorld())
        {
            this.world.getProfiler().startSection("newAi");
            this.updateEntityActionState();
            this.world.getProfiler().endSection();
        }

        this.world.getProfiler().endSection();
        this.world.getProfiler().startSection("jump");

        if (this.isJumping)
        {
            if (!(this.submergedHeight > 0.0D) || this.onGround && !(this.submergedHeight > 0.4D))
            {
                if (this.isInLava())
                {
                    this.handleFluidJump(FluidTags.LAVA);
                }
                else if ((this.onGround || this.submergedHeight > 0.0D && this.submergedHeight <= 0.4D) && this.jumpTicks == 0)
                {
                    this.jump();
                    this.jumpTicks = 10;
                }
            }
            else
            {
                this.handleFluidJump(FluidTags.WATER);
            }
        }
        else
        {
            this.jumpTicks = 0;
        }

        this.world.getProfiler().endSection();
        this.world.getProfiler().startSection("travel");
        this.moveStrafing *= 0.98F;
        this.moveForward *= 0.98F;
        this.updateElytra();
        AxisAlignedBB axisalignedbb = this.getBoundingBox();
        this.travel(new Vec3d((double)this.moveStrafing, (double)this.moveVertical, (double)this.moveForward));
        this.world.getProfiler().endSection();
        this.world.getProfiler().startSection("push");

        if (this.spinAttackDuration > 0)
        {
            --this.spinAttackDuration;
            this.updateSpinAttack(axisalignedbb, this.getBoundingBox());
        }

        this.collideWithNearbyEntities();
        this.world.getProfiler().endSection();
    }

    private void updateElytra()
    {
        boolean flag = this.getFlag(7);

        if (flag && !this.onGround && !this.isPassenger())
        {
            ItemStack itemstack = this.getItemStackFromSlot(EquipmentSlotType.CHEST);

            if (itemstack.getItem() == Items.ELYTRA && ElytraItem.isUsable(itemstack))
            {
                flag = true;

                if (!this.world.isRemote && (this.ticksElytraFlying + 1) % 20 == 0)
                {
                    itemstack.damageItem(1, this, (p_213360_0_) ->
                    {
                        p_213360_0_.sendBreakAnimation(EquipmentSlotType.CHEST);
                    });
                }
            }
            else
            {
                flag = false;
            }
        }
        else
        {
            flag = false;
        }

        if (!this.world.isRemote)
        {
            this.setFlag(7, flag);
        }
    }

    protected void updateEntityActionState()
    {
    }

    protected void collideWithNearbyEntities()
    {
        List<Entity> list = this.world.getEntitiesInAABBexcluding(this, this.getBoundingBox(), EntityPredicates.pushableBy(this));

        if (!list.isEmpty())
        {
            int i = this.world.getGameRules().getInt(GameRules.MAX_ENTITY_CRAMMING);

            if (i > 0 && list.size() > i - 1 && this.rand.nextInt(4) == 0)
            {
                int j = 0;

                for (int k = 0; k < list.size(); ++k)
                {
                    if (!list.get(k).isPassenger())
                    {
                        ++j;
                    }
                }

                if (j > i - 1)
                {
                    this.attackEntityFrom(DamageSource.CRAMMING, 6.0F);
                }
            }

            for (int l = 0; l < list.size(); ++l)
            {
                Entity entity = list.get(l);
                this.collideWithEntity(entity);
            }
        }
    }

    protected void updateSpinAttack(AxisAlignedBB p_204801_1_, AxisAlignedBB p_204801_2_)
    {
        AxisAlignedBB axisalignedbb = p_204801_1_.union(p_204801_2_);
        List<Entity> list = this.world.getEntitiesWithinAABBExcludingEntity(this, axisalignedbb);

        if (!list.isEmpty())
        {
            for (int i = 0; i < list.size(); ++i)
            {
                Entity entity = list.get(i);

                if (entity instanceof LivingEntity)
                {
                    this.spinAttack((LivingEntity)entity);
                    this.spinAttackDuration = 0;
                    this.setMotion(this.getMotion().scale(-0.2D));
                    break;
                }
            }
        }
        else if (this.collidedHorizontally)
        {
            this.spinAttackDuration = 0;
        }

        if (!this.world.isRemote && this.spinAttackDuration <= 0)
        {
            this.setLivingFlag(4, false);
        }
    }

    protected void collideWithEntity(Entity entityIn)
    {
        entityIn.applyEntityCollision(this);
    }

    protected void spinAttack(LivingEntity p_204804_1_)
    {
    }

    public void startSpinAttack(int p_204803_1_)
    {
        this.spinAttackDuration = p_204803_1_;

        if (!this.world.isRemote)
        {
            this.setLivingFlag(4, true);
        }
    }

    public boolean isSpinAttacking()
    {
        return (this.dataManager.get(LIVING_FLAGS) & 4) != 0;
    }

    public void stopRiding()
    {
        Entity entity = this.getRidingEntity();
        super.stopRiding();

        if (entity != null && entity != this.getRidingEntity() && !this.world.isRemote)
        {
            this.dismountEntity(entity);
        }
    }

    public void updateRidden()
    {
        super.updateRidden();
        this.prevOnGroundSpeedFactor = this.onGroundSpeedFactor;
        this.onGroundSpeedFactor = 0.0F;
        this.fallDistance = 0.0F;
    }

    public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean teleport)
    {
        this.interpTargetX = x;
        this.interpTargetY = y;
        this.interpTargetZ = z;
        this.interpTargetYaw = (double)yaw;
        this.interpTargetPitch = (double)pitch;
        this.newPosRotationIncrements = posRotationIncrements;
    }

    public void setHeadRotation(float yaw, int pitch)
    {
        this.interpTargetHeadYaw = (double)yaw;
        this.interpTicksHead = pitch;
    }

    public void setJumping(boolean jumping)
    {
        this.isJumping = jumping;
    }

    public void onItemPickup(Entity entityIn, int quantity)
    {
        if (!entityIn.removed && !this.world.isRemote && (entityIn instanceof ItemEntity || entityIn instanceof AbstractArrowEntity || entityIn instanceof ExperienceOrbEntity))
        {
            ((ServerWorld)this.world).getChunkProvider().sendToAllTracking(entityIn, new SCollectItemPacket(entityIn.getEntityId(), this.getEntityId(), quantity));
        }
    }

    public boolean canEntityBeSeen(Entity entityIn)
    {
        Vec3d vec3d = new Vec3d(this.getPosX(), this.getPosYEye(), this.getPosZ());
        Vec3d vec3d1 = new Vec3d(entityIn.getPosX(), entityIn.getPosYEye(), entityIn.getPosZ());
        return this.world.rayTraceBlocks(new RayTraceContext(vec3d, vec3d1, RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, this)).getType() == RayTraceResult.Type.MISS;
    }

    public float getYaw(float partialTicks)
    {
        return partialTicks == 1.0F ? this.rotationYawHead : MathHelper.lerp(partialTicks, this.prevRotationYawHead, this.rotationYawHead);
    }

    public float getSwingProgress(float partialTickTime)
    {
        float f = this.swingProgress - this.prevSwingProgress;

        if (f < 0.0F)
        {
            ++f;
        }

        return this.prevSwingProgress + f * partialTickTime;
    }

    public boolean isServerWorld()
    {
        return !this.world.isRemote;
    }

    public boolean canBeCollidedWith()
    {
        return !this.removed;
    }

    public boolean canBePushed()
    {
        return this.isAlive() && !this.isOnLadder();
    }

    protected void markVelocityChanged()
    {
        this.velocityChanged = this.rand.nextDouble() >= this.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).getValue();
    }

    public float getRotationYawHead()
    {
        return this.rotationYawHead;
    }

    public void setRotationYawHead(float rotation)
    {
        this.rotationYawHead = rotation;
    }

    public void setRenderYawOffset(float offset)
    {
        this.renderYawOffset = offset;
    }

    public float getAbsorptionAmount()
    {
        return this.absorptionAmount;
    }

    public void setAbsorptionAmount(float amount)
    {
        if (amount < 0.0F)
        {
            amount = 0.0F;
        }

        this.absorptionAmount = amount;
    }

    public void sendEnterCombat()
    {
    }

    public void sendEndCombat()
    {
    }

    protected void markPotionsDirty()
    {
        this.potionsNeedUpdate = true;
    }

    public abstract HandSide getPrimaryHand();

    public boolean isHandActive()
    {
        return (this.dataManager.get(LIVING_FLAGS) & 1) > 0;
    }

    public Hand getActiveHand()
    {
        return (this.dataManager.get(LIVING_FLAGS) & 2) > 0 ? Hand.OFF_HAND : Hand.MAIN_HAND;
    }

    private void updateActiveHand()
    {
        if (this.isHandActive())
        {
            if (ItemStack.areItemsEqualIgnoreDurability(this.getHeldItem(this.getActiveHand()), this.activeItemStack))
            {
                this.activeItemStack.func_222121_b(this.world, this, this.getItemInUseCount());

                if (this.func_226299_p_())
                {
                    this.func_226293_b_(this.activeItemStack, 5);
                }

                if (--this.activeItemStackUseCount == 0 && !this.world.isRemote && !this.activeItemStack.isCrossbowStack())
                {
                    this.onItemUseFinish();
                }
            }
            else
            {
                this.resetActiveHand();
            }
        }
    }

    private boolean func_226299_p_()
    {
        int i = this.getItemInUseCount();
        Food food = this.activeItemStack.getItem().getFood();
        boolean flag = food != null && food.isFastEating();
        flag = flag | i <= this.activeItemStack.getUseDuration() - 7;
        return flag && i % 4 == 0;
    }

    private void updateSwimAnimation()
    {
        this.lastSwimAnimation = this.swimAnimation;

        if (this.isActualySwimming())
        {
            this.swimAnimation = Math.min(1.0F, this.swimAnimation + 0.09F);
        }
        else
        {
            this.swimAnimation = Math.max(0.0F, this.swimAnimation - 0.09F);
        }
    }

    protected void setLivingFlag(int key, boolean value)
    {
        int i = this.dataManager.get(LIVING_FLAGS);

        if (value)
        {
            i = i | key;
        }
        else
        {
            i = i & ~key;
        }

        this.dataManager.set(LIVING_FLAGS, (byte)i);
    }

    public void setActiveHand(Hand hand)
    {
        ItemStack itemstack = this.getHeldItem(hand);

        if (!itemstack.isEmpty() && !this.isHandActive())
        {
            this.activeItemStack = itemstack;
            this.activeItemStackUseCount = itemstack.getUseDuration();

            if (!this.world.isRemote)
            {
                this.setLivingFlag(1, true);
                this.setLivingFlag(2, hand == Hand.OFF_HAND);
            }
        }
    }

    public void notifyDataManagerChange(DataParameter<?> key)
    {
        super.notifyDataManagerChange(key);

        if (BED_POSITION.equals(key))
        {
            if (this.world.isRemote)
            {
                this.getBedPosition().ifPresent(this::setSleepingPosition);
            }
        }
        else if (LIVING_FLAGS.equals(key) && this.world.isRemote)
        {
            if (this.isHandActive() && this.activeItemStack.isEmpty())
            {
                this.activeItemStack = this.getHeldItem(this.getActiveHand());

                if (!this.activeItemStack.isEmpty())
                {
                    this.activeItemStackUseCount = this.activeItemStack.getUseDuration();
                }
            }
            else if (!this.isHandActive() && !this.activeItemStack.isEmpty())
            {
                this.activeItemStack = ItemStack.EMPTY;
                this.activeItemStackUseCount = 0;
            }
        }
    }

    public void lookAt(EntityAnchorArgument.Type p_200602_1_, Vec3d p_200602_2_)
    {
        super.lookAt(p_200602_1_, p_200602_2_);
        this.prevRotationYawHead = this.rotationYawHead;
        this.renderYawOffset = this.rotationYawHead;
        this.prevRenderYawOffset = this.renderYawOffset;
    }

    protected void func_226293_b_(ItemStack p_226293_1_, int p_226293_2_)
    {
        if (!p_226293_1_.isEmpty() && this.isHandActive())
        {
            if (p_226293_1_.getUseAction() == UseAction.DRINK)
            {
                this.playSound(this.getDrinkSound(p_226293_1_), 0.5F, this.world.rand.nextFloat() * 0.1F + 0.9F);
            }

            if (p_226293_1_.getUseAction() == UseAction.EAT)
            {
                this.addItemParticles(p_226293_1_, p_226293_2_);
                this.playSound(this.getEatSound(p_226293_1_), 0.5F + 0.5F * (float)this.rand.nextInt(2), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
            }
        }
    }

    private void addItemParticles(ItemStack stack, int count)
    {
        for (int i = 0; i < count; ++i)
        {
            Vec3d vec3d = new Vec3d(((double)this.rand.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
            vec3d = vec3d.rotatePitch(-this.rotationPitch * ((float)Math.PI / 180F));
            vec3d = vec3d.rotateYaw(-this.rotationYaw * ((float)Math.PI / 180F));
            double d0 = (double)(-this.rand.nextFloat()) * 0.6D - 0.3D;
            Vec3d vec3d1 = new Vec3d(((double)this.rand.nextFloat() - 0.5D) * 0.3D, d0, 0.6D);
            vec3d1 = vec3d1.rotatePitch(-this.rotationPitch * ((float)Math.PI / 180F));
            vec3d1 = vec3d1.rotateYaw(-this.rotationYaw * ((float)Math.PI / 180F));
            vec3d1 = vec3d1.add(this.getPosX(), this.getPosYEye(), this.getPosZ());
            this.world.addParticle(new ItemParticleData(ParticleTypes.ITEM, stack), vec3d1.x, vec3d1.y, vec3d1.z, vec3d.x, vec3d.y + 0.05D, vec3d.z);
        }
    }

    protected void onItemUseFinish()
    {
        if (!this.activeItemStack.equals(this.getHeldItem(this.getActiveHand())))
        {
            this.stopActiveHand();
        }
        else
        {
            if (!this.activeItemStack.isEmpty() && this.isHandActive())
            {
                this.func_226293_b_(this.activeItemStack, 16);
                this.setHeldItem(this.getActiveHand(), this.activeItemStack.onItemUseFinish(this.world, this));
                this.resetActiveHand();
            }
        }
    }

    public ItemStack getActiveItemStack()
    {
        return this.activeItemStack;
    }

    public int getItemInUseCount()
    {
        return this.activeItemStackUseCount;
    }

    public int getItemInUseMaxCount()
    {
        return this.isHandActive() ? this.activeItemStack.getUseDuration() - this.getItemInUseCount() : 0;
    }

    public void stopActiveHand()
    {
        if (!this.activeItemStack.isEmpty())
        {
            this.activeItemStack.onPlayerStoppedUsing(this.world, this, this.getItemInUseCount());

            if (this.activeItemStack.isCrossbowStack())
            {
                this.updateActiveHand();
            }
        }

        this.resetActiveHand();
    }

    public void resetActiveHand()
    {
        if (!this.world.isRemote)
        {
            this.setLivingFlag(1, false);
        }

        this.activeItemStack = ItemStack.EMPTY;
        this.activeItemStackUseCount = 0;
    }

    public boolean isActiveItemStackBlocking()
    {
        if (this.isHandActive() && !this.activeItemStack.isEmpty())
        {
            Item item = this.activeItemStack.getItem();

            if (item.getUseAction(this.activeItemStack) != UseAction.BLOCK)
            {
                return false;
            }
            else
            {
                return item.getUseDuration(this.activeItemStack) - this.activeItemStackUseCount >= 5;
            }
        }
        else
        {
            return false;
        }
    }

    public boolean func_226296_dJ_()
    {
        return this.isShiftKeyDown();
    }

    public boolean isElytraFlying()
    {
        return this.getFlag(7);
    }

    public boolean isActualySwimming()
    {
        return super.isActualySwimming() || !this.isElytraFlying() && this.getPose() == Pose.FALL_FLYING;
    }

    public int getTicksElytraFlying()
    {
        return this.ticksElytraFlying;
    }

    public boolean attemptTeleport(double p_213373_1_, double p_213373_3_, double p_213373_5_, boolean p_213373_7_)
    {
        double d0 = this.getPosX();
        double d1 = this.getPosY();
        double d2 = this.getPosZ();
        double d3 = p_213373_3_;
        boolean flag = false;
        BlockPos blockpos = new BlockPos(p_213373_1_, p_213373_3_, p_213373_5_);
        World world = this.world;

        if (world.isBlockLoaded(blockpos))
        {
            boolean flag1 = false;

            while (!flag1 && blockpos.getY() > 0)
            {
                BlockPos blockpos1 = blockpos.down();
                BlockState blockstate = world.getBlockState(blockpos1);

                if (blockstate.getMaterial().blocksMovement())
                {
                    flag1 = true;
                }
                else
                {
                    --d3;
                    blockpos = blockpos1;
                }
            }

            if (flag1)
            {
                this.setPositionAndUpdate(p_213373_1_, d3, p_213373_5_);

                if (world.hasNoCollisions(this) && !world.containsAnyLiquid(this.getBoundingBox()))
                {
                    flag = true;
                }
            }
        }

        if (!flag)
        {
            this.setPositionAndUpdate(d0, d1, d2);
            return false;
        }
        else
        {
            if (p_213373_7_)
            {
                world.setEntityState(this, (byte)46);
            }

            if (this instanceof CreatureEntity)
            {
                ((CreatureEntity)this).getNavigator().clearPath();
            }

            return true;
        }
    }

    public boolean canBeHitWithPotion()
    {
        return true;
    }

    public boolean attackable()
    {
        return true;
    }

    public void setPartying(BlockPos pos, boolean isPartying)
    {
    }

    public boolean canPickUpItem(ItemStack itemstackIn)
    {
        return false;
    }

    public IPacket<?> createSpawnPacket()
    {
        return new SSpawnMobPacket(this);
    }

    public EntitySize getSize(Pose poseIn)
    {
        return poseIn == Pose.SLEEPING ? SLEEPING_SIZE : super.getSize(poseIn).scale(this.getRenderScale());
    }

    public Optional<BlockPos> getBedPosition()
    {
        return this.dataManager.get(BED_POSITION);
    }

    public void setBedPosition(BlockPos p_213369_1_)
    {
        this.dataManager.set(BED_POSITION, Optional.of(p_213369_1_));
    }

    public void clearBedPosition()
    {
        this.dataManager.set(BED_POSITION, Optional.empty());
    }

    public boolean isSleeping()
    {
        return this.getBedPosition().isPresent();
    }

    public void startSleeping(BlockPos p_213342_1_)
    {
        if (this.isPassenger())
        {
            this.stopRiding();
        }

        BlockState blockstate = this.world.getBlockState(p_213342_1_);

        if (blockstate.getBlock() instanceof BedBlock)
        {
            this.world.setBlockState(p_213342_1_, blockstate.with(BedBlock.OCCUPIED, Boolean.valueOf(true)), 3);
        }

        this.setPose(Pose.SLEEPING);
        this.setSleepingPosition(p_213342_1_);
        this.setBedPosition(p_213342_1_);
        this.setMotion(Vec3d.ZERO);
        this.isAirBorne = true;
    }

    private void setSleepingPosition(BlockPos p_213370_1_)
    {
        this.setPosition((double)p_213370_1_.getX() + 0.5D, (double)((float)p_213370_1_.getY() + 0.6875F), (double)p_213370_1_.getZ() + 0.5D);
    }

    private boolean isInValidBed()
    {
        return this.getBedPosition().map((p_213347_1_) ->
        {
            return this.world.getBlockState(p_213347_1_).getBlock() instanceof BedBlock;
        }).orElse(false);
    }

    public void wakeUp()
    {
        this.getBedPosition().filter(this.world::isBlockLoaded).ifPresent((p_213368_1_) ->
        {
            BlockState blockstate = this.world.getBlockState(p_213368_1_);

            if (blockstate.getBlock() instanceof BedBlock)
            {
                this.world.setBlockState(p_213368_1_, blockstate.with(BedBlock.OCCUPIED, Boolean.valueOf(false)), 3);
                Vec3d vec3d = BedBlock.func_220172_a(this.getType(), this.world, p_213368_1_, 0).orElseGet(() ->
                {
                    BlockPos blockpos = p_213368_1_.up();
                    return new Vec3d((double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 0.1D, (double)blockpos.getZ() + 0.5D);
                });
                this.setPosition(vec3d.x, vec3d.y, vec3d.z);
            }
        });
        this.setPose(Pose.STANDING);
        this.clearBedPosition();
    }

    @Nullable
    public Direction getBedDirection()
    {
        BlockPos blockpos = this.getBedPosition().orElse((BlockPos)null);
        return blockpos != null ? BedBlock.func_220174_a(this.world, blockpos) : null;
    }

    public boolean isEntityInsideOpaqueBlock()
    {
        return !this.isSleeping() && super.isEntityInsideOpaqueBlock();
    }

    protected final float getEyeHeight(Pose poseIn, EntitySize sizeIn)
    {
        return poseIn == Pose.SLEEPING ? 0.2F : this.getStandingEyeHeight(poseIn, sizeIn);
    }

    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn)
    {
        return super.getEyeHeight(poseIn, sizeIn);
    }

    public ItemStack findAmmo(ItemStack shootable)
    {
        return ItemStack.EMPTY;
    }

    public ItemStack onFoodEaten(World p_213357_1_, ItemStack p_213357_2_)
    {
        if (p_213357_2_.isFood())
        {
            p_213357_1_.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), this.getEatSound(p_213357_2_), SoundCategory.NEUTRAL, 1.0F, 1.0F + (p_213357_1_.rand.nextFloat() - p_213357_1_.rand.nextFloat()) * 0.4F);
            this.applyFoodEffects(p_213357_2_, p_213357_1_, this);

            if (!(this instanceof PlayerEntity) || !((PlayerEntity)this).abilities.isCreativeMode)
            {
                p_213357_2_.shrink(1);
            }
        }

        return p_213357_2_;
    }

    private void applyFoodEffects(ItemStack p_213349_1_, World p_213349_2_, LivingEntity p_213349_3_)
    {
        Item item = p_213349_1_.getItem();

        if (item.isFood())
        {
            for (Pair<EffectInstance, Float> pair : item.getFood().getEffects())
            {
                if (!p_213349_2_.isRemote && pair.getLeft() != null && p_213349_2_.rand.nextFloat() < pair.getRight())
                {
                    p_213349_3_.addPotionEffect(new EffectInstance(pair.getLeft()));
                }
            }
        }
    }

    private static byte equipmentSlotToEntityState(EquipmentSlotType p_213350_0_)
    {
        switch (p_213350_0_)
        {
            case MAINHAND:
                return 47;

            case OFFHAND:
                return 48;

            case HEAD:
                return 49;

            case CHEST:
                return 50;

            case FEET:
                return 52;

            case LEGS:
                return 51;

            default:
                return 47;
        }
    }

    public void sendBreakAnimation(EquipmentSlotType p_213361_1_)
    {
        this.world.setEntityState(this, equipmentSlotToEntityState(p_213361_1_));
    }

    public void sendBreakAnimation(Hand p_213334_1_)
    {
        this.sendBreakAnimation(p_213334_1_ == Hand.MAIN_HAND ? EquipmentSlotType.MAINHAND : EquipmentSlotType.OFFHAND);
    }
}
