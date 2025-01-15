package net.minecraft.client.particle;

import javax.annotation.Nullable;
import net.minecraft.particles.IParticleData;
import net.minecraft.world.World;

public interface IParticleFactory<T extends IParticleData>
{
    @Nullable
    Particle makeParticle(T typeIn, World worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed);
}
