package remapped;

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

public class class_4050 {
   private static final Logger field_19698 = LogManager.getLogger();
   private final Map<String, class_7186> field_19696 = Maps.newHashMap();
   private final DataFixer field_19699;
   private final File field_19697;

   public class_4050(File var1, DataFixer var2) {
      this.field_19699 = var2;
      this.field_19697 = var1;
   }

   private File method_18701(String var1) {
      return new File(this.field_19697, var1 + ".dat");
   }

   public <T extends class_7186> T method_18708(Supplier<T> var1, String var2) {
      class_7186 var5 = this.<class_7186>method_18707(var1, var2);
      if (var5 == null) {
         class_7186 var6 = (class_7186)var1.get();
         this.method_18702(var6);
         return (T)var6;
      } else {
         return (T)var5;
      }
   }

   @Nullable
   public <T extends class_7186> T method_18707(Supplier<T> var1, String var2) {
      class_7186 var5 = this.field_19696.get(var2);
      if (var5 == null && !this.field_19696.containsKey(var2)) {
         var5 = this.<class_7186>method_18703(var1, var2);
         this.field_19696.put(var2, var5);
      }

      return (T)var5;
   }

   @Nullable
   private <T extends class_7186> T method_18703(Supplier<T> var1, String var2) {
      try {
         File var5 = this.method_18701(var2);
         if (var5.exists()) {
            class_7186 var6 = (class_7186)var1.get();
            CompoundNBT var7 = this.method_18704(var2, class_7665.method_34674().getWorldVersion());
            var6.method_32924(var7.getCompound("data"));
            return (T)var6;
         }
      } catch (Exception var8) {
         field_19698.error("Error loading saved data: {}", var2, var8);
      }

      return null;
   }

   public void method_18702(class_7186 var1) {
      this.field_19696.put(var1.method_32926(), var1);
   }

   public CompoundNBT method_18704(String var1, int var2) throws IOException {
      File var5 = this.method_18701(var1);

      CompoundNBT var16;
      try (
         FileInputStream var6 = new FileInputStream(var5);
         PushbackInputStream var8 = new PushbackInputStream(var6, 2);
      ) {
         CompoundNBT var10;
         if (this.method_18709(var8)) {
            var10 = class_5957.method_27219(var8);
         } else {
            try (DataInputStream var11 = new DataInputStream(var8)) {
               var10 = class_5957.method_27220(var11);
            }
         }

         int var63 = var10.contains("DataVersion", 99) ? var10.method_25947("DataVersion") : 1343;
         var16 = class_4338.method_20180(this.field_19699, class_5397.field_27555, var10, var63, var2);
      }

      return var16;
   }

   private boolean method_18709(PushbackInputStream var1) throws IOException {
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

   public void method_18705() {
      for (class_7186 var4 : this.field_19696.values()) {
         if (var4 != null) {
            var4.method_32927(this.method_18701(var4.method_32926()));
         }
      }
   }
}
