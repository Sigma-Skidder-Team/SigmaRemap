package remapped;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;
import javax.sound.sampled.AudioFormat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL10;

public class class_4850 {
   private static final Logger field_24187 = LogManager.getLogger();
   private final int field_24188;
   private final AtomicBoolean field_24185 = new AtomicBoolean(true);
   private int field_24184 = 16384;
   private class_2613 field_24186;

   @Nullable
   public static class_4850 method_22347() {
      int[] var2 = new int[1];
      AL10.alGenSources(var2);
      return !class_7604.method_34512("Allocate new source") ? new class_4850(var2[0]) : null;
   }

   private class_4850(int var1) {
      this.field_24188 = var1;
   }

   public void method_22341() {
      if (this.field_24185.compareAndSet(true, false)) {
         AL10.alSourceStop(this.field_24188);
         class_7604.method_34512("Stop");
         if (this.field_24186 != null) {
            try {
               this.field_24186.close();
            } catch (IOException var4) {
               field_24187.error("Failed to close audio stream", var4);
            }

            this.method_22345();
            this.field_24186 = null;
         }

         AL10.alDeleteSources(new int[]{this.field_24188});
         class_7604.method_34512("Cleanup");
      }
   }

   public void method_22343() {
      AL10.alSourcePlay(this.field_24188);
   }

   private int method_22342() {
      return this.field_24185.get() ? AL10.alGetSourcei(this.field_24188, 4112) : 4116;
   }

   public void method_22339() {
      if (this.method_22342() == 4114) {
         AL10.alSourcePause(this.field_24188);
      }
   }

   public void method_22328() {
      if (this.method_22342() == 4115) {
         AL10.alSourcePlay(this.field_24188);
      }
   }

   public void method_22337() {
      if (this.field_24185.get()) {
         AL10.alSourceStop(this.field_24188);
         class_7604.method_34512("Stop");
      }
   }

   public boolean method_22346() {
      return this.method_22342() == 4116;
   }

   public void method_22330(Vector3d var1) {
      AL10.alSourcefv(this.field_24188, 4100, new float[]{(float)var1.field_7336, (float)var1.field_7333, (float)var1.field_7334});
   }

   public void method_22344(float var1) {
      AL10.alSourcef(this.field_24188, 4099, var1);
   }

   public void method_22338(boolean var1) {
      AL10.alSourcei(this.field_24188, 4103, !var1 ? 0 : 1);
   }

   public void method_22340(float var1) {
      AL10.alSourcef(this.field_24188, 4106, var1);
   }

   public void method_22336() {
      AL10.alSourcei(this.field_24188, 53248, 0);
   }

   public void method_22332(float var1) {
      AL10.alSourcei(this.field_24188, 53248, 53251);
      AL10.alSourcef(this.field_24188, 4131, var1);
      AL10.alSourcef(this.field_24188, 4129, 1.0F);
      AL10.alSourcef(this.field_24188, 4128, 0.0F);
   }

   public void method_22335(boolean var1) {
      AL10.alSourcei(this.field_24188, 514, !var1 ? 0 : 1);
   }

   public void method_22329(class_7493 var1) {
      var1.method_34066().ifPresent(var1x -> AL10.alSourcei(this.field_24188, 4105, var1x));
   }

   public void method_22331(class_2613 var1) {
      this.field_24186 = var1;
      AudioFormat var4 = var1.method_11855();
      this.field_24184 = method_22334(var4, 1);
      this.method_22333(4);
   }

   private static int method_22334(AudioFormat var0, int var1) {
      return (int)((float)(var1 * var0.getSampleSizeInBits()) / 8.0F * (float)var0.getChannels() * var0.getSampleRate());
   }

   private void method_22333(int var1) {
      if (this.field_24186 != null) {
         try {
            for (int var4 = 0; var4 < var1; var4++) {
               ByteBuffer var5 = this.field_24186.method_11856(this.field_24184);
               if (var5 != null) {
                  new class_7493(var5, this.field_24186.method_11855())
                     .method_34069()
                     .ifPresent(var1x -> AL10.alSourceQueueBuffers(this.field_24188, new int[]{var1x}));
               }
            }
         } catch (IOException var6) {
            field_24187.error("Failed to read from audio stream", var6);
         }
      }
   }

   public void method_22327() {
      if (this.field_24186 != null) {
         int var3 = this.method_22345();
         this.method_22333(var3);
      }
   }

   private int method_22345() {
      int var3 = AL10.alGetSourcei(this.field_24188, 4118);
      if (var3 > 0) {
         int[] var4 = new int[var3];
         AL10.alSourceUnqueueBuffers(this.field_24188, var4);
         class_7604.method_34512("Unqueue buffers");
         AL10.alDeleteBuffers(var4);
         class_7604.method_34512("Remove processed buffers");
      }

      return var3;
   }
}
