package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.LightType;
import net.minecraft.world.chunk.NibbleArray;
import net.minecraft.world.lighting.WorldLightManager;

public class SUpdateLightPacket implements IPacket<IClientPlayNetHandler>
{
    private int chunkX;
    private int chunkZ;
    private int skyLightUpdateMask;
    private int blockLightUpdateMask;
    private int skyLightResetMask;
    private int blockLightResetMask;
    private List<byte[]> skyLightData;
    private List<byte[]> blockLightData;

    public SUpdateLightPacket()
    {
    }

    public SUpdateLightPacket(ChunkPos p_i273_1_, WorldLightManager p_i273_2_)
    {
        this.chunkX = p_i273_1_.x;
        this.chunkZ = p_i273_1_.z;
        this.skyLightData = Lists.newArrayList();
        this.blockLightData = Lists.newArrayList();

        for (int i = 0; i < 18; ++i)
        {
            NibbleArray nibblearray = p_i273_2_.getLightEngine(LightType.SKY).getData(SectionPos.from(p_i273_1_, -1 + i));
            NibbleArray nibblearray1 = p_i273_2_.getLightEngine(LightType.BLOCK).getData(SectionPos.from(p_i273_1_, -1 + i));

            if (nibblearray != null)
            {
                if (nibblearray.isEmpty())
                {
                    this.skyLightResetMask |= 1 << i;
                }
                else
                {
                    this.skyLightUpdateMask |= 1 << i;
                    this.skyLightData.add((byte[])nibblearray.getData().clone());
                }
            }

            if (nibblearray1 != null)
            {
                if (nibblearray1.isEmpty())
                {
                    this.blockLightResetMask |= 1 << i;
                }
                else
                {
                    this.blockLightUpdateMask |= 1 << i;
                    this.blockLightData.add((byte[])nibblearray1.getData().clone());
                }
            }
        }
    }

    public SUpdateLightPacket(ChunkPos p_i274_1_, WorldLightManager p_i274_2_, int p_i274_3_, int p_i274_4_)
    {
        this.chunkX = p_i274_1_.x;
        this.chunkZ = p_i274_1_.z;
        this.skyLightUpdateMask = p_i274_3_;
        this.blockLightUpdateMask = p_i274_4_;
        this.skyLightData = Lists.newArrayList();
        this.blockLightData = Lists.newArrayList();

        for (int i = 0; i < 18; ++i)
        {
            if ((this.skyLightUpdateMask & 1 << i) != 0)
            {
                NibbleArray nibblearray = p_i274_2_.getLightEngine(LightType.SKY).getData(SectionPos.from(p_i274_1_, -1 + i));

                if (nibblearray != null && !nibblearray.isEmpty())
                {
                    this.skyLightData.add((byte[])nibblearray.getData().clone());
                }
                else
                {
                    this.skyLightUpdateMask &= ~(1 << i);

                    if (nibblearray != null)
                    {
                        this.skyLightResetMask |= 1 << i;
                    }
                }
            }

            if ((this.blockLightUpdateMask & 1 << i) != 0)
            {
                NibbleArray nibblearray1 = p_i274_2_.getLightEngine(LightType.BLOCK).getData(SectionPos.from(p_i274_1_, -1 + i));

                if (nibblearray1 != null && !nibblearray1.isEmpty())
                {
                    this.blockLightData.add((byte[])nibblearray1.getData().clone());
                }
                else
                {
                    this.blockLightUpdateMask &= ~(1 << i);

                    if (nibblearray1 != null)
                    {
                        this.blockLightResetMask |= 1 << i;
                    }
                }
            }
        }
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.chunkX = buf.readVarInt();
        this.chunkZ = buf.readVarInt();
        this.skyLightUpdateMask = buf.readVarInt();
        this.blockLightUpdateMask = buf.readVarInt();
        this.skyLightResetMask = buf.readVarInt();
        this.blockLightResetMask = buf.readVarInt();
        this.skyLightData = Lists.newArrayList();

        for (int i = 0; i < 18; ++i)
        {
            if ((this.skyLightUpdateMask & 1 << i) != 0)
            {
                this.skyLightData.add(buf.readByteArray(2048));
            }
        }

        this.blockLightData = Lists.newArrayList();

        for (int j = 0; j < 18; ++j)
        {
            if ((this.blockLightUpdateMask & 1 << j) != 0)
            {
                this.blockLightData.add(buf.readByteArray(2048));
            }
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.chunkX);
        buf.writeVarInt(this.chunkZ);
        buf.writeVarInt(this.skyLightUpdateMask);
        buf.writeVarInt(this.blockLightUpdateMask);
        buf.writeVarInt(this.skyLightResetMask);
        buf.writeVarInt(this.blockLightResetMask);

        for (byte[] abyte : this.skyLightData)
        {
            buf.writeByteArray(abyte);
        }

        for (byte[] abyte1 : this.blockLightData)
        {
            buf.writeByteArray(abyte1);
        }
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleUpdateLight(this);
    }

    public int getChunkX()
    {
        return this.chunkX;
    }

    public int getChunkZ()
    {
        return this.chunkZ;
    }

    public int getSkyLightUpdateMask()
    {
        return this.skyLightUpdateMask;
    }

    public int getSkyLightResetMask()
    {
        return this.skyLightResetMask;
    }

    public List<byte[]> getSkyLightData()
    {
        return this.skyLightData;
    }

    public int getBlockLightUpdateMask()
    {
        return this.blockLightUpdateMask;
    }

    public int getBlockLightResetMask()
    {
        return this.blockLightResetMask;
    }

    public List<byte[]> getBlockLightData()
    {
        return this.blockLightData;
    }
}
