package net.minecraft.entity.item.minecart;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.tileentity.CommandBlockLogic;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class MinecartCommandBlockEntity extends AbstractMinecartEntity
{
    private static final DataParameter<String> COMMAND = EntityDataManager.createKey(MinecartCommandBlockEntity.class, DataSerializers.STRING);
    private static final DataParameter<ITextComponent> LAST_OUTPUT = EntityDataManager.createKey(MinecartCommandBlockEntity.class, DataSerializers.TEXT_COMPONENT);
    private final CommandBlockLogic commandBlockLogic = new MinecartCommandBlockEntity.MinecartCommandLogic();
    private int activatorRailCooldown;

    public MinecartCommandBlockEntity(EntityType <? extends MinecartCommandBlockEntity > p_i1140_1_, World p_i1140_2_)
    {
        super(p_i1140_1_, p_i1140_2_);
    }

    public MinecartCommandBlockEntity(World p_i1141_1_, double p_i1141_2_, double p_i1141_4_, double p_i1141_6_)
    {
        super(EntityType.COMMAND_BLOCK_MINECART, p_i1141_1_, p_i1141_2_, p_i1141_4_, p_i1141_6_);
    }

    protected void registerData()
    {
        super.registerData();
        this.getDataManager().register(COMMAND, "");
        this.getDataManager().register(LAST_OUTPUT, new StringTextComponent(""));
    }

    protected void readAdditional(CompoundNBT compound)
    {
        super.readAdditional(compound);
        this.commandBlockLogic.read(compound);
        this.getDataManager().set(COMMAND, this.getCommandBlockLogic().getCommand());
        this.getDataManager().set(LAST_OUTPUT, this.getCommandBlockLogic().getLastOutput());
    }

    protected void writeAdditional(CompoundNBT compound)
    {
        super.writeAdditional(compound);
        this.commandBlockLogic.write(compound);
    }

    public AbstractMinecartEntity.Type getMinecartType()
    {
        return AbstractMinecartEntity.Type.COMMAND_BLOCK;
    }

    public BlockState getDefaultDisplayTile()
    {
        return Blocks.COMMAND_BLOCK.getDefaultState();
    }

    public CommandBlockLogic getCommandBlockLogic()
    {
        return this.commandBlockLogic;
    }

    public void onActivatorRailPass(int x, int y, int z, boolean receivingPower)
    {
        if (receivingPower && this.ticksExisted - this.activatorRailCooldown >= 4)
        {
            this.getCommandBlockLogic().trigger(this.world);
            this.activatorRailCooldown = this.ticksExisted;
        }
    }

    public boolean processInitialInteract(PlayerEntity player, Hand hand)
    {
        this.commandBlockLogic.tryOpenEditCommandBlock(player);
        return true;
    }

    public void notifyDataManagerChange(DataParameter<?> key)
    {
        super.notifyDataManagerChange(key);

        if (LAST_OUTPUT.equals(key))
        {
            try
            {
                this.commandBlockLogic.setLastOutput(this.getDataManager().get(LAST_OUTPUT));
            }
            catch (Throwable var3)
            {
                ;
            }
        }
        else if (COMMAND.equals(key))
        {
            this.commandBlockLogic.setCommand(this.getDataManager().get(COMMAND));
        }
    }

    public boolean ignoreItemEntityData()
    {
        return true;
    }

    public class MinecartCommandLogic extends CommandBlockLogic
    {
        public ServerWorld getWorld()
        {
            return (ServerWorld)MinecartCommandBlockEntity.this.world;
        }

        public void updateCommand()
        {
            MinecartCommandBlockEntity.this.getDataManager().set(MinecartCommandBlockEntity.COMMAND, this.getCommand());
            MinecartCommandBlockEntity.this.getDataManager().set(MinecartCommandBlockEntity.LAST_OUTPUT, this.getLastOutput());
        }

        public Vec3d getPositionVector()
        {
            return MinecartCommandBlockEntity.this.getPositionVec();
        }

        public MinecartCommandBlockEntity getMinecart()
        {
            return MinecartCommandBlockEntity.this;
        }

        public CommandSource getCommandSource()
        {
            return new CommandSource(this, MinecartCommandBlockEntity.this.getPositionVec(), MinecartCommandBlockEntity.this.getPitchYaw(), this.getWorld(), 2, this.getName().getString(), MinecartCommandBlockEntity.this.getDisplayName(), this.getWorld().getServer(), MinecartCommandBlockEntity.this);
        }
    }
}
