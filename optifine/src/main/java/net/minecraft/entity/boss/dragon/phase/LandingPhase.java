package net.minecraft.entity.boss.dragon.phase;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.EndPodiumFeature;

public class LandingPhase extends Phase
{
    private Vec3d targetLocation;

    public LandingPhase(EnderDragonEntity p_i4009_1_)
    {
        super(p_i4009_1_);
    }

    public void clientTick()
    {
        Vec3d vec3d = this.dragon.getHeadLookVec(1.0F).normalize();
        vec3d.rotateYaw((-(float)Math.PI / 4F));
        double d0 = this.dragon.dragonPartHead.getPosX();
        double d1 = this.dragon.dragonPartHead.getPosYHeight(0.5D);
        double d2 = this.dragon.dragonPartHead.getPosZ();

        for (int i = 0; i < 8; ++i)
        {
            Random random = this.dragon.getRNG();
            double d3 = d0 + random.nextGaussian() / 2.0D;
            double d4 = d1 + random.nextGaussian() / 2.0D;
            double d5 = d2 + random.nextGaussian() / 2.0D;
            Vec3d vec3d1 = this.dragon.getMotion();
            this.dragon.world.addParticle(ParticleTypes.DRAGON_BREATH, d3, d4, d5, -vec3d.x * (double)0.08F + vec3d1.x, -vec3d.y * (double)0.3F + vec3d1.y, -vec3d.z * (double)0.08F + vec3d1.z);
            vec3d.rotateYaw(0.19634955F);
        }
    }

    public void serverTick()
    {
        if (this.targetLocation == null)
        {
            this.targetLocation = new Vec3d(this.dragon.world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EndPodiumFeature.END_PODIUM_LOCATION));
        }

        if (this.targetLocation.squareDistanceTo(this.dragon.getPosX(), this.dragon.getPosY(), this.dragon.getPosZ()) < 1.0D)
        {
            this.dragon.getPhaseManager().getPhase(PhaseType.SITTING_FLAMING).resetFlameCount();
            this.dragon.getPhaseManager().setPhase(PhaseType.SITTING_SCANNING);
        }
    }

    public float getMaxRiseOrFall()
    {
        return 1.5F;
    }

    public float getYawFactor()
    {
        float f = MathHelper.sqrt(Entity.horizontalMag(this.dragon.getMotion())) + 1.0F;
        float f1 = Math.min(f, 40.0F);
        return f1 / f;
    }

    public void initPhase()
    {
        this.targetLocation = null;
    }

    @Nullable
    public Vec3d getTargetLocation()
    {
        return this.targetLocation;
    }

    public PhaseType<LandingPhase> getType()
    {
        return PhaseType.LANDING;
    }
}
