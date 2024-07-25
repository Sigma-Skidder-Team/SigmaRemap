package remapped;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.system.MemoryStack;

public class class_3301 {
   private static final Logger field_16338 = LogManager.getLogger();
   private long field_16342;
   private long field_16341;
   private static final class_1654 field_16340 = new class_927();
   private class_1654 field_16339 = field_16340;
   private class_1654 field_16335 = field_16340;
   private final class_9285 field_16337 = new class_9285();

   public void method_15141() {
      this.field_16342 = method_15142();
      ALCCapabilities var3 = ALC.createCapabilities(this.field_16342);
      if (!class_7604.method_34516(this.field_16342, "Get capabilities")) {
         if (var3.OpenALC11) {
            this.field_16341 = ALC10.alcCreateContext(this.field_16342, (IntBuffer)null);
            ALC10.alcMakeContextCurrent(this.field_16341);
            int var4 = this.method_15144();
            int var5 = class_9299.method_42829((int)class_9299.method_42843((float)var4), 2, 8);
            int var6 = class_9299.method_42829(var4 - var5, 8, 255);
            this.field_16339 = new class_5544(var6);
            this.field_16335 = new class_5544(var5);
            ALCapabilities var7 = AL.createCapabilities(var3);
            class_7604.method_34512("Initialization");
            if (var7.AL_EXT_source_distance_model) {
               AL10.alEnable(512);
               if (var7.AL_EXT_LINEAR_DISTANCE) {
                  class_7604.method_34512("Enable per-source distance models");
                  field_16338.info("OpenAL initialized.");
               } else {
                  throw new IllegalStateException("AL_EXT_LINEAR_DISTANCE is not supported");
               }
            } else {
               throw new IllegalStateException("AL_EXT_source_distance_model is not supported");
            }
         } else {
            throw new IllegalStateException("OpenAL 1.1 not supported");
         }
      } else {
         throw new IllegalStateException("Failed to get OpenAL capabilities");
      }
   }

   private int method_15144() {
      MemoryStack var3 = MemoryStack.stackPush();
      Throwable var4 = null;

      try {
         int var5 = ALC10.alcGetInteger(this.field_16342, 4098);
         if (class_7604.method_34516(this.field_16342, "Get attributes size")) {
            throw new IllegalStateException("Failed to get OpenAL attributes");
         } else {
            IntBuffer var6 = var3.mallocInt(var5);
            ALC10.alcGetIntegerv(this.field_16342, 4099, var6);
            if (class_7604.method_34516(this.field_16342, "Get attributes")) {
               throw new IllegalStateException("Failed to get OpenAL attributes");
            } else {
               int var7 = 0;

               while (var7 < var5) {
                  int var10 = var6.get(var7++);
                  if (var10 == 0) {
                     return 30;
                  }

                  int var11 = var6.get(var7++);
                  if (var10 == 4112) {
                     return var11;
                  }
               }

               return 30;
            }
         }
      } catch (Throwable var22) {
         var4 = var22;
         throw var22;
      } finally {
         if (var3 != null) {
            if (var4 != null) {
               try {
                  var3.close();
               } catch (Throwable var21) {
                  var4.addSuppressed(var21);
               }
            } else {
               var3.close();
            }
         }
      }
   }

   private static long method_15142() {
      for (int var2 = 0; var2 < 3; var2++) {
         long var3 = ALC10.alcOpenDevice((ByteBuffer)null);
         if (var3 != 0L && !class_7604.method_34516(var3, "Open device")) {
            return var3;
         }
      }

      throw new IllegalStateException("Failed to open OpenAL device");
   }

   public void method_15140() {
      this.field_16339.method_7379();
      this.field_16335.method_7379();
      ALC10.alcDestroyContext(this.field_16341);
      if (this.field_16342 != 0L) {
         ALC10.alcCloseDevice(this.field_16342);
      }
   }

   public class_9285 method_15139() {
      return this.field_16337;
   }

   @Nullable
   public class_4850 method_15146(class_8959 var1) {
      return (var1 != class_8959.field_45897 ? this.field_16339 : this.field_16335).method_7383();
   }

   public void method_15143(class_4850 var1) {
      if (!this.field_16339.method_7382(var1) && !this.field_16335.method_7382(var1)) {
         throw new IllegalStateException("Tried to release unknown channel");
      }
   }

   public String method_15145() {
      return String.format(
         "Sounds: %d/%d + %d/%d",
         this.field_16339.method_7380(),
         this.field_16339.method_7381(),
         this.field_16335.method_7380(),
         this.field_16335.method_7381()
      );
   }
}
