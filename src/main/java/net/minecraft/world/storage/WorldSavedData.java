package net.minecraft.world.storage;

import java.io.File;
import java.io.IOException;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.util.SharedConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class WorldSavedData {
   private static final Logger LOGGER = LogManager.getLogger();
   private final String name;
   private boolean dirty;

   public WorldSavedData(String name) {
      this.name = name;
   }

   public abstract void read(CompoundNBT compoundNBT);

   public abstract CompoundNBT write(CompoundNBT compoundNBT);

   public void markDirty() {
      this.setDirty(true);
   }

   public void setDirty(boolean dirty) {
      this.dirty = dirty;
   }

   public boolean isDirty() {
      return this.dirty;
   }

   public String getName() {
      return this.name;
   }

   public void save(File var1) {
      if (this.isDirty()) {
         CompoundNBT compoundNBT = new CompoundNBT();
         compoundNBT.put("data", this.write(new CompoundNBT()));
         compoundNBT.putInt("DataVersion", SharedConstants.getVersion().getWorldVersion());

         try {
            CompressedStreamTools.writeCompressed(compoundNBT, var1);
         } catch (IOException var6) {
            LOGGER.error("Could not save data {}", this, var6);
         }

         this.setDirty(false);
      }
   }
}
