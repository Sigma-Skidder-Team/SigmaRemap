package mapped;

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

public class Class1769 implements Class1768 {
   private static String[] field9577;
   private final ByteBuffer field9578;
   private final STBTTFontinfo field9579;
   private final float field9580;
   private final IntSet field9581 = new IntArraySet();
   private final float field9582;
   private final float field9583;
   private final float field9584;
   private final float field9585;

   public Class1769(ByteBuffer var1, STBTTFontinfo var2, float var3, float var4, float var5, float var6, String var7) {
      this.field9578 = var1;
      this.field9579 = var2;
      this.field9580 = var4;
      var7.codePoints().forEach(this.field9581::add);
      this.field9582 = var5 * var4;
      this.field9583 = var6 * var4;
      this.field9584 = STBTruetype.stbtt_ScaleForPixelHeight(var2, var3 * var4);
      MemoryStack var10 = MemoryStack.stackPush();
      Throwable var11 = null;

      try {
         IntBuffer var12 = var10.mallocInt(1);
         IntBuffer var13 = var10.mallocInt(1);
         IntBuffer var14 = var10.mallocInt(1);
         STBTruetype.stbtt_GetFontVMetrics(var2, var12, var13, var14);
         this.field9585 = (float)var12.get(0) * this.field9584;
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
   public Class2056 method7734(int var1) {
      if (this.field9581.contains(var1)) {
         return null;
      } else {
         MemoryStack var4 = MemoryStack.stackPush();
         Throwable var5 = null;

         Class2056 var15;
         try {
            IntBuffer var6 = var4.mallocInt(1);
            IntBuffer var7 = var4.mallocInt(1);
            IntBuffer var8 = var4.mallocInt(1);
            IntBuffer var9 = var4.mallocInt(1);
            int var10 = STBTruetype.stbtt_FindGlyphIndex(this.field9579, var1);
            if (var10 == 0) {
               Object var17 = null;
               return (Class2056)var17;
            }

            STBTruetype.stbtt_GetGlyphBitmapBoxSubpixel(
               this.field9579, var10, this.field9584, this.field9584, this.field9582, this.field9583, var6, var7, var8, var9
            );
            int var11 = var8.get(0) - var6.get(0);
            int var12 = var9.get(0) - var7.get(0);
            if (var11 == 0 || var12 == 0) {
               return null;
            }

            IntBuffer var13 = var4.mallocInt(1);
            IntBuffer var14 = var4.mallocInt(1);
            STBTruetype.stbtt_GetGlyphHMetrics(this.field9579, var10, var13, var14);
            var15 = new Class2056(
               this,
               var6.get(0),
               var8.get(0),
               -var7.get(0),
               -var9.get(0),
               (float)var13.get(0) * this.field9584,
               (float)var14.get(0) * this.field9584,
               var10
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
      this.field9579.free();
      MemoryUtil.memFree(this.field9578);
   }

   @Override
   public IntSet method7735() {
      return IntStream.range(0, 65535)
         .filter(var1 -> !this.field9581.contains(var1))
         .<IntSet>collect(IntOpenHashSet::new, IntCollection::add, IntCollection::addAll);
   }

   // $VF: synthetic method
   public static float method7737(Class1769 var0) {
      return var0.field9580;
   }

   // $VF: synthetic method
   public static float method7738(Class1769 var0) {
      return var0.field9582;
   }

   // $VF: synthetic method
   public static float method7739(Class1769 var0) {
      return var0.field9585;
   }

   // $VF: synthetic method
   public static float method7740(Class1769 var0) {
      return var0.field9583;
   }

   // $VF: synthetic method
   public static STBTTFontinfo method7741(Class1769 var0) {
      return var0.field9579;
   }

   // $VF: synthetic method
   public static float method7742(Class1769 var0) {
      return var0.field9584;
   }
}
