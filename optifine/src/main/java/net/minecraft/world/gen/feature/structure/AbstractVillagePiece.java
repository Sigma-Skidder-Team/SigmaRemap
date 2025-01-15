package net.minecraft.world.gen.feature.structure;

import com.google.common.collect.Lists;
import com.mojang.datafixers.Dynamic;
import java.util.List;
import java.util.Random;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.NBTDynamicOps;
import net.minecraft.util.IDynamicDeserializer;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.jigsaw.EmptyJigsawPiece;
import net.minecraft.world.gen.feature.jigsaw.JigsawJunction;
import net.minecraft.world.gen.feature.jigsaw.JigsawPiece;
import net.minecraft.world.gen.feature.template.TemplateManager;

public abstract class AbstractVillagePiece extends StructurePiece
{
    protected final JigsawPiece jigsawPiece;
    protected BlockPos pos;
    private final int groundLevelDelta;
    protected final Rotation rotation;
    private final List<JigsawJunction> junctions = Lists.newArrayList();
    private final TemplateManager templateManager;

    public AbstractVillagePiece(IStructurePieceType p_i2476_1_, TemplateManager p_i2476_2_, JigsawPiece p_i2476_3_, BlockPos p_i2476_4_, int p_i2476_5_, Rotation p_i2476_6_, MutableBoundingBox p_i2476_7_)
    {
        super(p_i2476_1_, 0);
        this.templateManager = p_i2476_2_;
        this.jigsawPiece = p_i2476_3_;
        this.pos = p_i2476_4_;
        this.groundLevelDelta = p_i2476_5_;
        this.rotation = p_i2476_6_;
        this.boundingBox = p_i2476_7_;
    }

    public AbstractVillagePiece(TemplateManager p_i2477_1_, CompoundNBT p_i2477_2_, IStructurePieceType p_i2477_3_)
    {
        super(p_i2477_3_, p_i2477_2_);
        this.templateManager = p_i2477_1_;
        this.pos = new BlockPos(p_i2477_2_.getInt("PosX"), p_i2477_2_.getInt("PosY"), p_i2477_2_.getInt("PosZ"));
        this.groundLevelDelta = p_i2477_2_.getInt("ground_level_delta");
        this.jigsawPiece = IDynamicDeserializer.func_214907_a(new Dynamic<>(NBTDynamicOps.INSTANCE, p_i2477_2_.getCompound("pool_element")), Registry.STRUCTURE_POOL_ELEMENT, "element_type", EmptyJigsawPiece.INSTANCE);
        this.rotation = Rotation.valueOf(p_i2477_2_.getString("rotation"));
        this.boundingBox = this.jigsawPiece.getBoundingBox(p_i2477_1_, this.pos, this.rotation);
        ListNBT listnbt = p_i2477_2_.getList("junctions", 10);
        this.junctions.clear();
        listnbt.forEach((p_214827_1_) ->
        {
            this.junctions.add(JigsawJunction.deserialize(new Dynamic<>(NBTDynamicOps.INSTANCE, p_214827_1_)));
        });
    }

    protected void readAdditional(CompoundNBT tagCompound)
    {
        tagCompound.putInt("PosX", this.pos.getX());
        tagCompound.putInt("PosY", this.pos.getY());
        tagCompound.putInt("PosZ", this.pos.getZ());
        tagCompound.putInt("ground_level_delta", this.groundLevelDelta);
        tagCompound.put("pool_element", this.jigsawPiece.serialize(NBTDynamicOps.INSTANCE).getValue());
        tagCompound.putString("rotation", this.rotation.name());
        ListNBT listnbt = new ListNBT();

        for (JigsawJunction jigsawjunction : this.junctions)
        {
            listnbt.add(jigsawjunction.serialize(NBTDynamicOps.INSTANCE).getValue());
        }

        tagCompound.put("junctions", listnbt);
    }

    public boolean func_225577_a_(IWorld p_225577_1_, ChunkGenerator<?> p_225577_2_, Random p_225577_3_, MutableBoundingBox p_225577_4_, ChunkPos p_225577_5_)
    {
        return this.jigsawPiece.func_225575_a_(this.templateManager, p_225577_1_, p_225577_2_, this.pos, this.rotation, p_225577_4_, p_225577_3_);
    }

    public void offset(int x, int y, int z)
    {
        super.offset(x, y, z);
        this.pos = this.pos.add(x, y, z);
    }

    public Rotation getRotation()
    {
        return this.rotation;
    }

    public String toString()
    {
        return String.format("<%s | %s | %s | %s>", this.getClass().getSimpleName(), this.pos, this.rotation, this.jigsawPiece);
    }

    public JigsawPiece getJigsawPiece()
    {
        return this.jigsawPiece;
    }

    public BlockPos getPos()
    {
        return this.pos;
    }

    public int getGroundLevelDelta()
    {
        return this.groundLevelDelta;
    }

    public void addJunction(JigsawJunction junction)
    {
        this.junctions.add(junction);
    }

    public List<JigsawJunction> getJunctions()
    {
        return this.junctions;
    }
}
