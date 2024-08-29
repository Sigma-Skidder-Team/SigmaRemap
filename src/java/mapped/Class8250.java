package mapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8250 {
   private static final Logger field35445 = LogManager.getLogger();
   private final Map<String, Class7530> field35446 = Maps.newHashMap();
   private final DataFixer field35447;
   private final File field35448;

   public Class8250(File var1, DataFixer var2) {
      this.field35447 = var2;
      this.field35448 = var1;
   }

   private File method28766(String var1) {
      return new File(this.field35448, var1 + ".dat");
   }

   public <T extends Class7530> T method28767(Supplier<T> var1, String var2) {
      Class7530 var5 = this.method28768(var1, var2);
      if (var5 == null) {
         Class7530 var6 = var1.get();
         this.method28770(var6);
         return (T)var6;
      } else {
         return (T)var5;
      }
   }

   @Nullable
   public <T extends Class7530> T method28768(Supplier<T> var1, String var2) {
      Class7530 var5 = this.field35446.get(var2);
      if (var5 == null && !this.field35446.containsKey(var2)) {
         var5 = this.method28769(var1, var2);
         this.field35446.put(var2, var5);
      }

      return (T)var5;
   }

   @Nullable
   private <T extends Class7530> T method28769(Supplier<T> var1, String var2) {
      try {
         File var5 = this.method28766(var2);
         if (var5.exists()) {
            Class7530 var6 = (Class7530)var1.get();
            CompoundNBT var7 = this.method28771(var2, SharedConstants.getVersion().getWorldVersion());
            var6.method24591(var7.getCompound("data"));
            return (T)var6;
         }
      } catch (Exception var8) {
         field35445.error("Error loading saved data: {}", var2, var8);
      }

      return null;
   }

   public void method28770(Class7530 var1) {
      this.field35446.put(var1.method24608(), var1);
   }

   public CompoundNBT method28771(String var1, int var2) throws IOException {
      File var5 = this.method28766(var1);

      CompoundNBT var16;
      try (
         FileInputStream var6 = new FileInputStream(var5);
         PushbackInputStream var8 = new PushbackInputStream(var6, 2);
      ) {
         CompoundNBT var10;
         if (this.method28772(var8)) {
            var10 = Class8799.method31766(var8);
         } else {
            try (DataInputStream var11 = new DataInputStream(var8)) {
               var10 = Class8799.method31771(var11);
            }
         }

         int var63 = var10.method119("DataVersion", 99) ? var10.method122("DataVersion") : 1343;
         var16 = Class8354.method29290(this.field35447, Class2108.field13755, var10, var63, var2);
      }

      return var16;
   }

   private boolean method28772(PushbackInputStream var1) throws IOException {
      byte[] var4 = new byte[2];
      boolean var5 = false;
      int var6 = var1.read(var4, 0, 2);
      if (var6 == 2) {
         int var7 = (var4[1] & 255) << 8 | var4[0] & 255;
         if (var7 == 35615) {
            var5 = true;
         }
      }

      if (var6 != 0) {
         var1.unread(var4, 0, var6);
      }

      return var5;
   }

   public void method28773() {
      for (Class7530 var4 : this.field35446.values()) {
         if (var4 != null) {
            var4.method24609(this.method28766(var4.method24608()));
         }
      }
   }
}
