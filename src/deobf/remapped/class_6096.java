package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.annotation.Nullable;

public class class_6096 implements class_3592 {
   private class_4639 field_31195;
   private final List<int[]> field_31192;
   private final int field_31196;
   private final int field_31194;

   public class_6096(class_4639 var1, int var2, int var3, List<int[]> var4) {
      this.field_31195 = new class_4639(var1.method_21461(), "textures/" + var1.method_21456());
      this.field_31195 = class_4077.method_18801(this.field_31195);
      this.field_31192 = var4;
      this.field_31196 = var2;
      this.field_31194 = var3;
   }

   public static class_6096 method_27934(JsonObject var0) {
      int var3 = class_6539.method_29768(var0, "height", 8);
      int var4 = class_6539.method_29767(var0, "ascent");
      if (var4 <= var3) {
         ArrayList var5 = Lists.newArrayList();
         JsonArray var6 = class_6539.method_29787(var0, "chars");

         for (int var7 = 0; var7 < var6.size(); var7++) {
            String var8 = class_6539.method_29795(var6.get(var7), "chars[" + var7 + "]");
            int[] var9 = var8.codePoints().toArray();
            if (var7 > 0) {
               int var10 = ((int[])var5.get(0)).length;
               if (var9.length != var10) {
                  throw new JsonParseException(
                     "Elements of chars have to be the same length (found: " + var9.length + ", expected: " + var10 + "), pad with space or \\u0000"
                  );
               }
            }

            var5.add(var9);
         }

         if (!var5.isEmpty() && ((int[])var5.get(0)).length != 0) {
            return new class_6096(new class_4639(class_6539.method_29796(var0, "file")), var3, var4, var5);
         } else {
            throw new JsonParseException("Expected to find data in chars, found none.");
         }
      } else {
         throw new JsonParseException("Ascent " + var4 + " higher than height " + var3);
      }
   }

   @Nullable
   @Override
   public class_3293 method_16786(class_7832 var1) {
      try (class_4038 var4 = var1.method_35458(this.field_31195)) {
         class_5797 var6 = class_5797.method_26232(class_5810.field_29333, var4.method_18576());
         int var7 = var6.method_26228();
         int var8 = var6.method_26253();
         int var9 = var7 / this.field_31192.get(0).length;
         int var10 = var8 / this.field_31192.size();
         float var11 = (float)this.field_31196 / (float)var10;
         Int2ObjectOpenHashMap var12 = new Int2ObjectOpenHashMap();
         Properties var13 = class_4077.method_18799(this.field_31195);
         Int2ObjectMap var14 = class_4077.method_18802(var13);
         Float var15 = (Float)var14.get(32);
         boolean var16 = class_4077.method_18796(var13, "blend", false);
         float var17 = class_4077.method_18797(var13, "offsetBold", -1.0F);
         if (var17 < 0.0F) {
            var17 = var9 > 8 ? 0.5F : 1.0F;
         }

         for (int var18 = 0; var18 < this.field_31192.size(); var18++) {
            int var19 = 0;

            for (int var23 : this.field_31192.get(var18)) {
               int var24 = var19++;
               if (var23 != 0 && var23 != 32) {
                  float var25 = (float)this.method_27936(var6, var9, var10, var24, var18);
                  Float var26 = (Float)var14.get(var23);
                  if (var26 != null) {
                     var25 = var26 * ((float)var9 / 8.0F);
                  }

                  class_8392 var27 = (class_8392)var12.put(
                     var23,
                     new class_8392(var11, var6, var24 * var9, var18 * var10, var9, var10, (int)(0.5 + (double)(var25 * var11)) + 1, this.field_31194, null)
                  );
                  if (var27 != null) {
                     class_7103.method_32645().warn("Codepoint '{}' declared multiple times in {}", Integer.toHexString(var23), this.field_31195);
                  }

                  class_8392 var28 = (class_8392)var12.get(var23);
                  class_8392.method_38665(var28, var17);
               }
            }
         }

         class_7103 var40 = new class_7103(var6, var12, null);
         class_7103.method_32643(var40, var16);
         if (var15 != null) {
            class_7103.method_32641(var40, var15);
         }

         return var40;
      } catch (IOException var39) {
         throw new RuntimeException(var39.getMessage());
      }
   }

   private int method_27936(class_5797 var1, int var2, int var3, int var4, int var5) {
      int var8;
      for (var8 = var2 - 1; var8 >= 0; var8--) {
         int var9 = var4 * var2 + var8;

         for (int var10 = 0; var10 < var3; var10++) {
            int var11 = var5 * var3 + var10;
            if ((var1.method_26265(var9, var11) & 255) > 16) {
               return var8 + 1;
            }
         }
      }

      return var8 + 1;
   }
}
