package mapped;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import javax.annotation.Nullable;

import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALCCapabilities;
import org.lwjgl.openal.ALCapabilities;
import org.lwjgl.system.MemoryStack;

public class Class7993 {
   private static final Logger field34370 = LogManager.getLogger();
   private long field34371;
   private long field34372;
   private static final Class6759 field34373 = new Class6758();
   private Class6759 field34374 = field34373;
   private Class6759 field34375 = field34373;
   private final Class9675 field34376 = new Class9675();

   public void method27283() {
      this.field34371 = method27285();
      ALCCapabilities var3 = ALC.createCapabilities(this.field34371);
      if (!Class9237.method34747(this.field34371, "Get capabilities")) {
         if (var3.OpenALC11) {
            this.field34372 = ALC10.alcCreateContext(this.field34371, (IntBuffer)null);
            ALC10.alcMakeContextCurrent(this.field34372);
            int var4 = this.method27284();
            int var5 = MathHelper.clamp((int) MathHelper.sqrt((float)var4), 2, 8);
            int var6 = MathHelper.clamp(var4 - var5, 8, 255);
            this.field34374 = new Class6760(var6);
            this.field34375 = new Class6760(var5);
            ALCapabilities var7 = AL.createCapabilities(var3);
            Class9237.method34745("Initialization");
            if (var7.AL_EXT_source_distance_model) {
               AL10.alEnable(512);
               if (var7.AL_EXT_LINEAR_DISTANCE) {
                  Class9237.method34745("Enable per-source distance models");
                  field34370.info("OpenAL initialized.");
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

   private int method27284() {
      MemoryStack var3 = MemoryStack.stackPush();
      Throwable var4 = null;

      try {
         int var5 = ALC10.alcGetInteger(this.field34371, 4098);
         if (Class9237.method34747(this.field34371, "Get attributes size")) {
            throw new IllegalStateException("Failed to get OpenAL attributes");
         } else {
            IntBuffer var6 = var3.mallocInt(var5);
            ALC10.alcGetIntegerv(this.field34371, 4099, var6);
            if (Class9237.method34747(this.field34371, "Get attributes")) {
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

   private static long method27285() {
      for (int var2 = 0; var2 < 3; var2++) {
         long var3 = ALC10.alcOpenDevice((ByteBuffer)null);
         if (var3 != 0L && !Class9237.method34747(var3, "Open device")) {
            return var3;
         }
      }

      throw new IllegalStateException("Failed to open OpenAL device");
   }

   public void method27286() {
      this.field34374.method20610();
      this.field34375.method20610();
      ALC10.alcDestroyContext(this.field34372);
      if (this.field34371 != 0L) {
         ALC10.alcCloseDevice(this.field34371);
      }
   }

   public Class9675 method27287() {
      return this.field34376;
   }

   @Nullable
   public Class8506 method27288(Class2149 var1) {
      return (var1 != Class2149.field14053 ? this.field34374 : this.field34375).method20608();
   }

   public void method27289(Class8506 var1) {
      if (!this.field34374.method20609(var1) && !this.field34375.method20609(var1)) {
         throw new IllegalStateException("Tried to release unknown channel");
      }
   }

   public String method27290() {
      return String.format(
         "Sounds: %d/%d + %d/%d", this.field34374.method20612(), this.field34374.method20611(), this.field34375.method20612(), this.field34375.method20611()
      );
   }

   // $VF: synthetic method
   public static Logger method27291() {
      return field34370;
   }
}
