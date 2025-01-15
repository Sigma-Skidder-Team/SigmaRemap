package net.minecraft.world.storage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.util.SharedConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class WorldSavedData
{
    private static final Logger LOGGER = LogManager.getLogger();
    private final String name;
    private boolean dirty;

    public WorldSavedData(String p_i3097_1_)
    {
        this.name = p_i3097_1_;
    }

    public abstract void read(CompoundNBT nbt);

    public abstract CompoundNBT write(CompoundNBT compound);

    public void markDirty()
    {
        this.setDirty(true);
    }

    public void setDirty(boolean isDirty)
    {
        this.dirty = isDirty;
    }

    public boolean isDirty()
    {
        return this.dirty;
    }

    public String getName()
    {
        return this.name;
    }

    public void save(File fileIn)
    {
        if (this.isDirty())
        {
            CompoundNBT compoundnbt = new CompoundNBT();
            compoundnbt.put("data", this.write(new CompoundNBT()));
            compoundnbt.putInt("DataVersion", SharedConstants.getVersion().getWorldVersion());

            try (FileOutputStream fileoutputstream = new FileOutputStream(fileIn))
            {
                CompressedStreamTools.writeCompressed(compoundnbt, fileoutputstream);
            }
            catch (IOException ioexception)
            {
                LOGGER.error("Could not save data {}", this, ioexception);
            }

            this.setDirty(false);
        }
    }
}
