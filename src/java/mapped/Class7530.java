package mapped;

import java.io.File;
import java.io.IOException;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class7530 {
   private static final Logger field32329 = LogManager.getLogger();
   private final String field32330;
   private boolean field32331;

   public Class7530(String var1) {
      this.field32330 = var1;
   }

   public abstract void method24591(CompoundNBT var1);

   public abstract CompoundNBT method24592(CompoundNBT var1);

   public void method24605() {
      this.method24606(true);
   }

   public void method24606(boolean var1) {
      this.field32331 = var1;
   }

   public boolean method24607() {
      return this.field32331;
   }

   public String method24608() {
      return this.field32330;
   }

   public void method24609(File var1) {
      if (this.method24607()) {
         CompoundNBT var4 = new CompoundNBT();
         var4.put("data", this.method24592(new CompoundNBT()));
         var4.method102("DataVersion", SharedConstants.getVersion().getWorldVersion());

         try {
            CompressedStreamTools.writeCompressed(var4, var1);
         } catch (IOException var6) {
            field32329.error("Could not save data {}", this, var6);
         }

         this.method24606(false);
      }
   }
}
