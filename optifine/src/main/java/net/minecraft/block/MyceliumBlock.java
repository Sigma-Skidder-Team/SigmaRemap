package net.minecraft.block;

import java.util.Random;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MyceliumBlock extends SpreadableSnowyDirtBlock
{
    public MyceliumBlock(Block.Properties p_i732_1_)
    {
        super(p_i732_1_);
    }

    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        super.animateTick(stateIn, worldIn, pos, rand);

        if (rand.nextInt(10) == 0)
        {
            worldIn.addParticle(ParticleTypes.MYCELIUM, (double)pos.getX() + (double)rand.nextFloat(), (double)pos.getY() + 1.1D, (double)pos.getZ() + (double)rand.nextFloat(), 0.0D, 0.0D, 0.0D);
        }
    }
}
