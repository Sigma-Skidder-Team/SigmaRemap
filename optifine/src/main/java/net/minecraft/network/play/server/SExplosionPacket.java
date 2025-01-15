package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class SExplosionPacket implements IPacket<IClientPlayNetHandler>
{
    private double posX;
    private double posY;
    private double posZ;
    private float strength;
    private List<BlockPos> affectedBlockPositions;
    private float motionX;
    private float motionY;
    private float motionZ;

    public SExplosionPacket()
    {
    }

    public SExplosionPacket(double p_i458_1_, double p_i458_3_, double p_i458_5_, float p_i458_7_, List<BlockPos> p_i458_8_, Vec3d p_i458_9_)
    {
        this.posX = p_i458_1_;
        this.posY = p_i458_3_;
        this.posZ = p_i458_5_;
        this.strength = p_i458_7_;
        this.affectedBlockPositions = Lists.newArrayList(p_i458_8_);

        if (p_i458_9_ != null)
        {
            this.motionX = (float)p_i458_9_.x;
            this.motionY = (float)p_i458_9_.y;
            this.motionZ = (float)p_i458_9_.z;
        }
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.posX = (double)buf.readFloat();
        this.posY = (double)buf.readFloat();
        this.posZ = (double)buf.readFloat();
        this.strength = buf.readFloat();
        int i = buf.readInt();
        this.affectedBlockPositions = Lists.newArrayListWithCapacity(i);
        int j = MathHelper.floor(this.posX);
        int k = MathHelper.floor(this.posY);
        int l = MathHelper.floor(this.posZ);

        for (int i1 = 0; i1 < i; ++i1)
        {
            int j1 = buf.readByte() + j;
            int k1 = buf.readByte() + k;
            int l1 = buf.readByte() + l;
            this.affectedBlockPositions.add(new BlockPos(j1, k1, l1));
        }

        this.motionX = buf.readFloat();
        this.motionY = buf.readFloat();
        this.motionZ = buf.readFloat();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeFloat((float)this.posX);
        buf.writeFloat((float)this.posY);
        buf.writeFloat((float)this.posZ);
        buf.writeFloat(this.strength);
        buf.writeInt(this.affectedBlockPositions.size());
        int i = MathHelper.floor(this.posX);
        int j = MathHelper.floor(this.posY);
        int k = MathHelper.floor(this.posZ);

        for (BlockPos blockpos : this.affectedBlockPositions)
        {
            int l = blockpos.getX() - i;
            int i1 = blockpos.getY() - j;
            int j1 = blockpos.getZ() - k;
            buf.writeByte(l);
            buf.writeByte(i1);
            buf.writeByte(j1);
        }

        buf.writeFloat(this.motionX);
        buf.writeFloat(this.motionY);
        buf.writeFloat(this.motionZ);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleExplosion(this);
    }

    public float getMotionX()
    {
        return this.motionX;
    }

    public float getMotionY()
    {
        return this.motionY;
    }

    public float getMotionZ()
    {
        return this.motionZ;
    }

    public double getX()
    {
        return this.posX;
    }

    public double getY()
    {
        return this.posY;
    }

    public double getZ()
    {
        return this.posZ;
    }

    public float getStrength()
    {
        return this.strength;
    }

    public List<BlockPos> getAffectedBlockPositions()
    {
        return this.affectedBlockPositions;
    }
}
