package remapped;

import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class class_2979 implements class_3293 {
   private static String[] field_14676;
   private final ByteBuffer field_14671;
   private final STBTTFontinfo field_14669;
   private final float field_14675;
   private final IntSet field_14670 = new IntArraySet();
   private final float field_14672;
   private final float field_14674;
   private final float field_14673;
   private final float field_14668;

   public class_2979(ByteBuffer var1, STBTTFontinfo var2, float var3, float var4, float var5, float var6, String var7) {
      this.field_14671 = var1;
      this.field_14669 = var2;
      this.field_14675 = var4;
      var7.codePoints().forEach(this.field_14670::add);
      this.field_14672 = var5 * var4;
      this.field_14674 = var6 * var4;
      this.field_14673 = STBTruetype.stbtt_ScaleForPixelHeight(var2, var3 * var4);
      MemoryStack var10 = MemoryStack.stackPush();
      Throwable var11 = null;

      try {
         IntBuffer var12 = var10.mallocInt(1);
         IntBuffer var13 = var10.mallocInt(1);
         IntBuffer var14 = var10.mallocInt(1);
         STBTruetype.stbtt_GetFontVMetrics(var2, var12, var13, var14);
         this.field_14668 = (float)var12.get(0) * this.field_14673;
      } catch (Throwable var22) {
         var11 = var22;
         throw var22;
      } finally {
         if (var10 != null) {
            if (var11 != null) {
               try {
                  var10.close();
               } catch (Throwable var21) {
                  var11.addSuppressed(var21);
               }
            } else {
               var10.close();
            }
         }
      }
   }

   @Nullable
   public class_2617 method_13652(int var1) {
      if (this.field_14670.contains(var1)) {
         return null;
      } else {
         MemoryStack var4 = MemoryStack.stackPush();
         Throwable var5 = null;

         class_2617 var15;
         try {
            IntBuffer var6 = var4.mallocInt(1);
            IntBuffer var7 = var4.mallocInt(1);
            IntBuffer var8 = var4.mallocInt(1);
            IntBuffer var9 = var4.mallocInt(1);
            int var10 = STBTruetype.stbtt_FindGlyphIndex(this.field_14669, var1);
            if (var10 == 0) {
               Object var17 = null;
               return (class_2617)var17;
            }

            STBTruetype.stbtt_GetGlyphBitmapBoxSubpixel(
               this.field_14669, var10, this.field_14673, this.field_14673, this.field_14672, this.field_14674, var6, var7, var8, var9
            );
            int var11 = var8.get(0) - var6.get(0);
            int var12 = var9.get(0) - var7.get(0);
            if (var11 == 0 || var12 == 0) {
               return null;
            }

            IntBuffer var13 = var4.mallocInt(1);
            IntBuffer var14 = var4.mallocInt(1);
            STBTruetype.stbtt_GetGlyphHMetrics(this.field_14669, var10, var13, var14);
            var15 = new class_2617(
               this,
               var6.get(0),
               var8.get(0),
               -var7.get(0),
               -var9.get(0),
               (float)var13.get(0) * this.field_14673,
               (float)var14.get(0) * this.field_14673,
               var10,
               null
            );
         } catch (Throwable var27) {
            var5 = var27;
            throw var27;
         } finally {
            if (var4 != null) {
               if (var5 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var26) {
                     var5.addSuppressed(var26);
                  }
               } else {
                  var4.close();
               }
            }
         }

         return var15;
      }
   }

   @Override
   public void close() {
      this.field_14669.free();
      MemoryUtil.memFree(this.field_14671);
   }

   @Override
   public IntSet method_15108() {
      return IntStream.range(0, 65535)
         .filter(var1 -> !this.field_14670.contains(var1))
         .<IntSet>collect(IntOpenHashSet::new, IntCollection::add, IntCollection::addAll);
   }
}
