package mapped;

import com.mojang.datafixers.DataFixer;
import java.io.File;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.SharedConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreativeSettings {
   private static final Logger field34553 = LogManager.getLogger();
   private final File field34554;
   private final DataFixer field34555;
   private final Class2356[] field34556 = new Class2356[9];
   private boolean field34557;

   public CreativeSettings(File var1, DataFixer var2) {
      this.field34554 = new File(var1, "hotbar.nbt");
      this.field34555 = var2;

      for (int var5 = 0; var5 < 9; var5++) {
         this.field34556[var5] = new Class2356();
      }
   }

   private void method27627() {
      try {
         CompoundNBT var3 = CompressedStreamTools.method31770(this.field34554);
         if (var3 == null) {
            return;
         }

         if (!var3.contains("DataVersion", 99)) {
            var3.putInt("DataVersion", 1343);
         }

         var3 = NBTUtil.method29289(this.field34555, Class2108.field13751, var3, var3.getInt("DataVersion"));

         for (int var4 = 0; var4 < 9; var4++) {
            this.field34556[var4].method9285(var3.getList(String.valueOf(var4), 10));
         }
      } catch (Exception var5) {
         field34553.error("Failed to load creative mode options", var5);
      }
   }

   public void method27628() {
      try {
         CompoundNBT var3 = new CompoundNBT();
         var3.putInt("DataVersion", SharedConstants.getVersion().getWorldVersion());

         for (int var4 = 0; var4 < 9; var4++) {
            var3.put(String.valueOf(var4), this.method27629(var4).method9284());
         }

         CompressedStreamTools.write(var3, this.field34554);
      } catch (Exception var5) {
         field34553.error("Failed to save creative mode options", var5);
      }
   }

   public Class2356 method27629(int var1) {
      if (!this.field34557) {
         this.method27627();
         this.field34557 = true;
      }

      return this.field34556[var1];
   }
}
