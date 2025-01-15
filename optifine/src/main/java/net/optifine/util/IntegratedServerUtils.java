package net.optifine.util;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.server.ServerWorld;
import net.optifine.Config;

public class IntegratedServerUtils
{
    public static ServerWorld getWorldServer()
    {
        Minecraft minecraft = Config.getMinecraft();
        World world = minecraft.world;

        if (world == null)
        {
            return null;
        }
        else if (!minecraft.isIntegratedServerRunning())
        {
            return null;
        }
        else
        {
            IntegratedServer integratedserver = minecraft.getIntegratedServer();

            if (integratedserver == null)
            {
                return null;
            }
            else
            {
                Dimension dimension = world.dimension;

                if (dimension == null)
                {
                    return null;
                }
                else
                {
                    DimensionType dimensiontype = dimension.getType();

                    try
                    {
                        ServerWorld serverworld = integratedserver.getWorld(dimensiontype);
                        return serverworld;
                    }
                    catch (NullPointerException var6)
                    {
                        return null;
                    }
                }
            }
        }
    }

    public static Entity getEntity(UUID uuid)
    {
        ServerWorld serverworld = getWorldServer();

        if (serverworld == null)
        {
            return null;
        }
        else
        {
            Entity entity = serverworld.getEntityByUuid(uuid);
            return entity;
        }
    }

    public static TileEntity getTileEntity(BlockPos pos)
    {
        ServerWorld serverworld = getWorldServer();

        if (serverworld == null)
        {
            return null;
        }
        else
        {
            IChunk ichunk = serverworld.getChunkProvider().getChunk(pos.getX() >> 4, pos.getZ() >> 4, ChunkStatus.FULL, false);

            if (ichunk == null)
            {
                return null;
            }
            else
            {
                TileEntity tileentity = ichunk.getTileEntity(pos);
                return tileentity;
            }
        }
    }
}
