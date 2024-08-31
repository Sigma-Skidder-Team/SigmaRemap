package mapped;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;
import javax.sound.sampled.AudioFormat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.openal.AL10;

public class Class8506 {
   private static final Logger field37197 = LogManager.getLogger();
   private final int field37198;
   private final AtomicBoolean field37199 = new AtomicBoolean(true);
   private int field37200 = 16384;
   private Class1798 field37201;

   @Nullable
   public static Class8506 method30112() {
      int[] var2 = new int[1];
      AL10.alGenSources(var2);
      return !Class9237.method34745("Allocate new source") ? new Class8506(var2[0]) : null;
   }

   private Class8506(int var1) {
      this.field37198 = var1;
   }

   public void method30113() {
      if (this.field37199.compareAndSet(true, false)) {
         AL10.alSourceStop(this.field37198);
         Class9237.method34745("Stop");
         if (this.field37201 != null) {
            try {
               this.field37201.close();
            } catch (IOException var4) {
               field37197.error("Failed to close audio stream", var4);
            }

            this.method30132();
            this.field37201 = null;
         }

         AL10.alDeleteSources(new int[]{this.field37198});
         Class9237.method34745("Cleanup");
      }
   }

   public void method30114() {
      AL10.alSourcePlay(this.field37198);
   }

   private int method30115() {
      return this.field37199.get() ? AL10.alGetSourcei(this.field37198, 4112) : 4116;
   }

   public void method30116() {
      if (this.method30115() == 4114) {
         AL10.alSourcePause(this.field37198);
      }
   }

   public void method30117() {
      if (this.method30115() == 4115) {
         AL10.alSourcePlay(this.field37198);
      }
   }

   public void method30118() {
      if (this.field37199.get()) {
         AL10.alSourceStop(this.field37198);
         Class9237.method34745("Stop");
      }
   }

   public boolean method30119() {
      return this.method30115() == 4116;
   }

   public void method30120(Vector3d var1) {
      AL10.alSourcefv(this.field37198, 4100, new float[]{(float)var1.x, (float)var1.y, (float)var1.z});
   }

   public void method30121(float var1) {
      AL10.alSourcef(this.field37198, 4099, var1);
   }

   public void method30122(boolean var1) {
      AL10.alSourcei(this.field37198, 4103, !var1 ? 0 : 1);
   }

   public void method30123(float var1) {
      AL10.alSourcef(this.field37198, 4106, var1);
   }

   public void method30124() {
      AL10.alSourcei(this.field37198, 53248, 0);
   }

   public void method30125(float var1) {
      AL10.alSourcei(this.field37198, 53248, 53251);
      AL10.alSourcef(this.field37198, 4131, var1);
      AL10.alSourcef(this.field37198, 4129, 1.0F);
      AL10.alSourcef(this.field37198, 4128, 0.0F);
   }

   public void method30126(boolean var1) {
      AL10.alSourcei(this.field37198, 514, !var1 ? 0 : 1);
   }

   public void method30127(Class9216 var1) {
      var1.method34532().ifPresent(var1x -> AL10.alSourcei(this.field37198, 4105, var1x));
   }

   public void method30128(Class1798 var1) {
      this.field37201 = var1;
      AudioFormat var4 = var1.method7865();
      this.field37200 = method30129(var4, 1);
      this.method30130(4);
   }

   private static int method30129(AudioFormat var0, int var1) {
      return (int)((float)(var1 * var0.getSampleSizeInBits()) / 8.0F * (float)var0.getChannels() * var0.getSampleRate());
   }

   private void method30130(int var1) {
      if (this.field37201 != null) {
         try {
            for (int var4 = 0; var4 < var1; var4++) {
               ByteBuffer var5 = this.field37201.method7866(this.field37200);
               if (var5 != null) {
                  new Class9216(var5, this.field37201.method7865())
                     .method34534()
                     .ifPresent(var1x -> AL10.alSourceQueueBuffers(this.field37198, new int[]{var1x}));
               }
            }
         } catch (IOException var6) {
            field37197.error("Failed to read from audio stream", var6);
         }
      }
   }

   public void method30131() {
      if (this.field37201 != null) {
         int var3 = this.method30132();
         this.method30130(var3);
      }
   }

   private int method30132() {
      int var3 = AL10.alGetSourcei(this.field37198, 4118);
      if (var3 > 0) {
         int[] var4 = new int[var3];
         AL10.alSourceUnqueueBuffers(this.field37198, var4);
         Class9237.method34745("Unqueue buffers");
         AL10.alDeleteBuffers(var4);
         Class9237.method34745("Remove processed buffers");
      }

      return var3;
   }
}
