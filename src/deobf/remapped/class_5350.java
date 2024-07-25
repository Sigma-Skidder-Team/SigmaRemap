package remapped;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5350 implements class_3293 {
   private static final Logger field_27333 = LogManager.getLogger();
   private final class_7832 field_27332;
   private final byte[] field_27334;
   private final String field_27336;
   private final Map<class_4639, class_5797> field_27335 = Maps.newHashMap();

   public class_5350(class_7832 var1, byte[] var2, String var3) {
      this.field_27332 = var1;
      this.field_27334 = var2;
      this.field_27336 = var3;

      for (int var6 = 0; var6 < 256; var6++) {
         int var7 = var6 * 256;
         class_4639 var8 = this.method_24427(var7);

         try (
            class_4038 var9 = this.field_27332.method_35458(var8);
            class_5797 var11 = class_5797.method_26232(class_5810.field_29333, var9.method_18576());
         ) {
            if (var11.method_26228() == 256 && var11.method_26253() == 256) {
               for (int var13 = 0; var13 < 256; var13++) {
                  byte var14 = var2[var7 + var13];
                  if (var14 != 0 && method_24425(var14) > method_24429(var14)) {
                     var2[var7 + var13] = 0;
                  }
               }
               continue;
            }
         } catch (IOException var45) {
         }

         Arrays.fill(var2, var7, var7 + 256, (byte)0);
      }
   }

   @Override
   public void close() {
      this.field_27335.values().forEach(class_5797::close);
   }

   private class_4639 method_24427(int var1) {
      class_4639 var4 = new class_4639(String.format(this.field_27336, String.format("%02x", var1 / 256)));
      return new class_4639(var4.method_21461(), "textures/" + var4.method_21456());
   }

   @Nullable
   @Override
   public class_3354 method_15109(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         byte var4 = this.field_27334[var1];
         if (var4 != 0) {
            class_5797 var5 = this.field_27335.computeIfAbsent(this.method_24427(var1), this::method_24426);
            if (var5 != null) {
               int var6 = method_24425(var4);
               return new class_3478(var1 % 16 * 16 + var6, (var1 & 0xFF) / 16 * 16, method_24429(var4) - var6, 16, var5, null);
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Override
   public IntSet method_15108() {
      IntOpenHashSet var3 = new IntOpenHashSet();

      for (int var4 = 0; var4 < 65535; var4++) {
         if (this.field_27334[var4] != 0) {
            var3.add(var4);
         }
      }

      return var3;
   }

   @Nullable
   private class_5797 method_24426(class_4639 var1) {
      try (class_4038 var4 = this.field_27332.method_35458(var1)) {
         return class_5797.method_26232(class_5810.field_29333, var4.method_18576());
      } catch (IOException var18) {
         field_27333.error("Couldn't load texture {}", var1, var18);
         return null;
      }
   }

   private static int method_24425(byte var0) {
      return var0 >> 4 & 15;
   }

   private static int method_24429(byte var0) {
      return (var0 & 15) + 1;
   }
}
