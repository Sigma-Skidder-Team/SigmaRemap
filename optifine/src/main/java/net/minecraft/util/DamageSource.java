package net.minecraft.util;

import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.DamagingProjectileEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;

public class DamageSource
{
    public static final DamageSource IN_FIRE = (new DamageSource("inFire")).setFireDamage();
    public static final DamageSource LIGHTNING_BOLT = new DamageSource("lightningBolt");
    public static final DamageSource ON_FIRE = (new DamageSource("onFire")).setDamageBypassesArmor().setFireDamage();
    public static final DamageSource LAVA = (new DamageSource("lava")).setFireDamage();
    public static final DamageSource HOT_FLOOR = (new DamageSource("hotFloor")).setFireDamage();
    public static final DamageSource IN_WALL = (new DamageSource("inWall")).setDamageBypassesArmor();
    public static final DamageSource CRAMMING = (new DamageSource("cramming")).setDamageBypassesArmor();
    public static final DamageSource DROWN = (new DamageSource("drown")).setDamageBypassesArmor();
    public static final DamageSource STARVE = (new DamageSource("starve")).setDamageBypassesArmor().setDamageIsAbsolute();
    public static final DamageSource CACTUS = new DamageSource("cactus");
    public static final DamageSource FALL = (new DamageSource("fall")).setDamageBypassesArmor();
    public static final DamageSource FLY_INTO_WALL = (new DamageSource("flyIntoWall")).setDamageBypassesArmor();
    public static final DamageSource OUT_OF_WORLD = (new DamageSource("outOfWorld")).setDamageBypassesArmor().setDamageAllowedInCreativeMode();
    public static final DamageSource GENERIC = (new DamageSource("generic")).setDamageBypassesArmor();
    public static final DamageSource MAGIC = (new DamageSource("magic")).setDamageBypassesArmor().setMagicDamage();
    public static final DamageSource WITHER = (new DamageSource("wither")).setDamageBypassesArmor();
    public static final DamageSource ANVIL = new DamageSource("anvil");
    public static final DamageSource FALLING_BLOCK = new DamageSource("fallingBlock");
    public static final DamageSource DRAGON_BREATH = (new DamageSource("dragonBreath")).setDamageBypassesArmor();
    public static final DamageSource FIREWORKS = (new DamageSource("fireworks")).setExplosion();
    public static final DamageSource DRYOUT = new DamageSource("dryout");
    public static final DamageSource SWEET_BERRY_BUSH = new DamageSource("sweetBerryBush");
    private boolean isUnblockable;
    private boolean isDamageAllowedInCreativeMode;
    private boolean damageIsAbsolute;
    private float hungerDamage = 0.1F;
    private boolean fireDamage;
    private boolean projectile;
    private boolean difficultyScaled;
    private boolean magicDamage;
    private boolean explosion;
    public final String damageType;

    public static DamageSource func_226252_a_(LivingEntity p_226252_0_)
    {
        return new EntityDamageSource("sting", p_226252_0_);
    }

    public static DamageSource causeMobDamage(LivingEntity mob)
    {
        return new EntityDamageSource("mob", mob);
    }

    public static DamageSource causeIndirectDamage(Entity source, LivingEntity indirectEntityIn)
    {
        return new IndirectEntityDamageSource("mob", source, indirectEntityIn);
    }

    public static DamageSource causePlayerDamage(PlayerEntity player)
    {
        return new EntityDamageSource("player", player);
    }

    public static DamageSource causeArrowDamage(AbstractArrowEntity arrow, @Nullable Entity indirectEntityIn)
    {
        return (new IndirectEntityDamageSource("arrow", arrow, indirectEntityIn)).setProjectile();
    }

    public static DamageSource causeTridentDamage(Entity source, @Nullable Entity indirectEntityIn)
    {
        return (new IndirectEntityDamageSource("trident", source, indirectEntityIn)).setProjectile();
    }

    public static DamageSource causeFireballDamage(DamagingProjectileEntity fireball, @Nullable Entity indirectEntityIn)
    {
        return indirectEntityIn == null ? (new IndirectEntityDamageSource("onFire", fireball, fireball)).setFireDamage().setProjectile() : (new IndirectEntityDamageSource("fireball", fireball, indirectEntityIn)).setFireDamage().setProjectile();
    }

    public static DamageSource causeThrownDamage(Entity source, @Nullable Entity indirectEntityIn)
    {
        return (new IndirectEntityDamageSource("thrown", source, indirectEntityIn)).setProjectile();
    }

    public static DamageSource causeIndirectMagicDamage(Entity source, @Nullable Entity indirectEntityIn)
    {
        return (new IndirectEntityDamageSource("indirectMagic", source, indirectEntityIn)).setDamageBypassesArmor().setMagicDamage();
    }

    public static DamageSource causeThornsDamage(Entity source)
    {
        return (new EntityDamageSource("thorns", source)).setIsThornsDamage().setMagicDamage();
    }

    public static DamageSource causeExplosionDamage(@Nullable Explosion explosionIn)
    {
        return explosionIn != null && explosionIn.getExplosivePlacedBy() != null ? (new EntityDamageSource("explosion.player", explosionIn.getExplosivePlacedBy())).setDifficultyScaled().setExplosion() : (new DamageSource("explosion")).setDifficultyScaled().setExplosion();
    }

    public static DamageSource causeExplosionDamage(@Nullable LivingEntity entityLivingBaseIn)
    {
        return entityLivingBaseIn != null ? (new EntityDamageSource("explosion.player", entityLivingBaseIn)).setDifficultyScaled().setExplosion() : (new DamageSource("explosion")).setDifficultyScaled().setExplosion();
    }

    public static DamageSource netherBedExplosion()
    {
        return new NetherBedDamageSource();
    }

    public boolean isProjectile()
    {
        return this.projectile;
    }

    public DamageSource setProjectile()
    {
        this.projectile = true;
        return this;
    }

    public boolean isExplosion()
    {
        return this.explosion;
    }

    public DamageSource setExplosion()
    {
        this.explosion = true;
        return this;
    }

    public boolean isUnblockable()
    {
        return this.isUnblockable;
    }

    public float getHungerDamage()
    {
        return this.hungerDamage;
    }

    public boolean canHarmInCreative()
    {
        return this.isDamageAllowedInCreativeMode;
    }

    public boolean isDamageAbsolute()
    {
        return this.damageIsAbsolute;
    }

    protected DamageSource(String p_i2513_1_)
    {
        this.damageType = p_i2513_1_;
    }

    @Nullable
    public Entity getImmediateSource()
    {
        return this.getTrueSource();
    }

    @Nullable
    public Entity getTrueSource()
    {
        return null;
    }

    protected DamageSource setDamageBypassesArmor()
    {
        this.isUnblockable = true;
        this.hungerDamage = 0.0F;
        return this;
    }

    protected DamageSource setDamageAllowedInCreativeMode()
    {
        this.isDamageAllowedInCreativeMode = true;
        return this;
    }

    protected DamageSource setDamageIsAbsolute()
    {
        this.damageIsAbsolute = true;
        this.hungerDamage = 0.0F;
        return this;
    }

    protected DamageSource setFireDamage()
    {
        this.fireDamage = true;
        return this;
    }

    public ITextComponent getDeathMessage(LivingEntity entityLivingBaseIn)
    {
        LivingEntity livingentity = entityLivingBaseIn.getAttackingEntity();
        String s = "death.attack." + this.damageType;
        String s1 = s + ".player";
        return livingentity != null ? new TranslationTextComponent(s1, entityLivingBaseIn.getDisplayName(), livingentity.getDisplayName()) : new TranslationTextComponent(s, entityLivingBaseIn.getDisplayName());
    }

    public boolean isFireDamage()
    {
        return this.fireDamage;
    }

    public String getDamageType()
    {
        return this.damageType;
    }

    public DamageSource setDifficultyScaled()
    {
        this.difficultyScaled = true;
        return this;
    }

    public boolean isDifficultyScaled()
    {
        return this.difficultyScaled;
    }

    public boolean isMagicDamage()
    {
        return this.magicDamage;
    }

    public DamageSource setMagicDamage()
    {
        this.magicDamage = true;
        return this;
    }

    public boolean isCreativePlayer()
    {
        Entity entity = this.getTrueSource();
        return entity instanceof PlayerEntity && ((PlayerEntity)entity).abilities.isCreativeMode;
    }

    @Nullable
    public Vec3d getDamageLocation()
    {
        return null;
    }
}
