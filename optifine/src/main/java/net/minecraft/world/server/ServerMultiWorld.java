package net.minecraft.world.server;

import java.util.concurrent.Executor;
import net.minecraft.profiler.IProfiler;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.border.IBorderListener;
import net.minecraft.world.chunk.listener.IChunkStatusListener;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.storage.DerivedWorldInfo;
import net.minecraft.world.storage.SaveHandler;

public class ServerMultiWorld extends ServerWorld
{
    public ServerMultiWorld(ServerWorld p_i4203_1_, MinecraftServer p_i4203_2_, Executor p_i4203_3_, SaveHandler p_i4203_4_, DimensionType p_i4203_5_, IProfiler p_i4203_6_, IChunkStatusListener p_i4203_7_)
    {
        super(p_i4203_2_, p_i4203_3_, p_i4203_4_, new DerivedWorldInfo(p_i4203_1_.getWorldInfo()), p_i4203_5_, p_i4203_6_, p_i4203_7_);
        p_i4203_1_.getWorldBorder().addListener(new IBorderListener.Impl(this.getWorldBorder()));
    }

    protected void advanceTime()
    {
    }
}
