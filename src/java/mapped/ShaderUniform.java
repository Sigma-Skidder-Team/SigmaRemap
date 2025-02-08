package mapped;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.MemoryUtil;

public class ShaderUniform extends ShaderDefault implements AutoCloseable {
   private static final Logger field9306 = LogManager.getLogger();
   private int field9307;
   private final int field9308;
   private final int field9309;
   private final IntBuffer field9310;
   private final FloatBuffer field9311;
   private final String field9312;
   private boolean field9313;
   private final Class1809 field9314;

   public ShaderUniform(String var1, int var2, int var3, Class1809 var4) {
      this.field9312 = var1;
      this.field9308 = var3;
      this.field9309 = var2;
      this.field9314 = var4;
      if (var2 > 3) {
         this.field9310 = null;
         this.field9311 = MemoryUtil.memAllocFloat(var3);
      } else {
         this.field9310 = MemoryUtil.memAllocInt(var3);
         this.field9311 = null;
      }

      this.field9307 = -1;
      this.method7433();
   }

   public static int method7430(int var0, CharSequence var1) {
      return GlStateManager.method23732(var0, var1);
   }

   public static void method7431(int var0, int var1) {
      RenderSystem.method27912(var0, var1);
   }

   public static int method7432(int var0, CharSequence var1) {
      return GlStateManager.method23745(var0, var1);
   }

   @Override
   public void close() {
      if (this.field9310 != null) {
         MemoryUtil.memFree(this.field9310);
      }

      if (this.field9311 != null) {
         MemoryUtil.memFree(this.field9311);
      }
   }

   private void method7433() {
      this.field9313 = true;
      if (this.field9314 != null) {
         this.field9314.method7935();
      }
   }

   public static int method7434(String var0) {
      int var3 = -1;
      if (!"int".equals(var0)) {
         if (!"float".equals(var0)) {
            if (var0.startsWith("matrix")) {
               if (!var0.endsWith("2x2")) {
                  if (!var0.endsWith("3x3")) {
                     if (var0.endsWith("4x4")) {
                        var3 = 10;
                     }
                  } else {
                     var3 = 9;
                  }
               } else {
                  var3 = 8;
               }
            }
         } else {
            var3 = 4;
         }
      } else {
         var3 = 0;
      }

      return var3;
   }

   public void method7435(int var1) {
      this.field9307 = var1;
   }

   public String method7436() {
      return this.field9312;
   }

   @Override
   public void set(float var1) {
      ((Buffer)this.field9311).position(0);
      this.field9311.put(0, var1);
      this.method7433();
   }

   @Override
   public void set(float var1, float var2) {
      ((Buffer)this.field9311).position(0);
      this.field9311.put(0, var1);
      this.field9311.put(1, var2);
      this.method7433();
   }

   @Override
   public void set(float var1, float var2, float var3) {
      ((Buffer)this.field9311).position(0);
      this.field9311.put(0, var1);
      this.field9311.put(1, var2);
      this.field9311.put(2, var3);
      this.method7433();
   }

   @Override
   public void set(float var1, float var2, float var3, float var4) {
      ((Buffer)this.field9311).position(0);
      this.field9311.put(var1);
      this.field9311.put(var2);
      this.field9311.put(var3);
      this.field9311.put(var4);
      ((Buffer)this.field9311).flip();
      this.method7433();
   }

   @Override
   public void setSafe(float var1, float var2, float var3, float var4) {
      ((Buffer)this.field9311).position(0);
      if (this.field9309 >= 4) {
         this.field9311.put(0, var1);
      }

      if (this.field9309 >= 5) {
         this.field9311.put(1, var2);
      }

      if (this.field9309 >= 6) {
         this.field9311.put(2, var3);
      }

      if (this.field9309 >= 7) {
         this.field9311.put(3, var4);
      }

      this.method7433();
   }

   @Override
   public void set(int var1, int var2, int var3, int var4) {
      ((Buffer)this.field9310).position(0);
      if (this.field9309 >= 0) {
         this.field9310.put(0, var1);
      }

      if (this.field9309 >= 1) {
         this.field9310.put(1, var2);
      }

      if (this.field9309 >= 2) {
         this.field9310.put(2, var3);
      }

      if (this.field9309 >= 3) {
         this.field9310.put(3, var4);
      }

      this.method7433();
   }

   @Override
   public void set(float[] var1) {
      if (var1.length >= this.field9308) {
         ((Buffer)this.field9311).position(0);
         this.field9311.put(var1);
         ((Buffer)this.field9311).position(0);
         this.method7433();
      } else {
         field9306.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", this.field9308, var1.length);
      }
   }

   @Override
   public void set(Matrix4f var1) {
      ((Buffer)this.field9311).position(0);
      var1.write(this.field9311);
      this.method7433();
   }

   public void method7445() {
      if (this.field9313) {
      }

      this.field9313 = false;
      if (this.field9309 > 3) {
         if (this.field9309 > 7) {
            if (this.field9309 > 10) {
               field9306.warn("Uniform.upload called, but type value ({}) is not a valid type. Ignoring.", this.field9309);
               return;
            }

            this.method7448();
         } else {
            this.method7447();
         }
      } else {
         this.method7446();
      }
   }

   private void method7446() {
      ((Buffer)this.field9311).clear();
      switch (this.field9309) {
         case 0:
            RenderSystem.method27913(this.field9307, this.field9310);
            break;
         case 1:
            RenderSystem.method27914(this.field9307, this.field9310);
            break;
         case 2:
            RenderSystem.method27915(this.field9307, this.field9310);
            break;
         case 3:
            RenderSystem.method27916(this.field9307, this.field9310);
            break;
         default:
            field9306.warn("Uniform.upload called, but count value ({}) is  not in the range of 1 to 4. Ignoring.", this.field9308);
      }
   }

   private void method7447() {
      ((Buffer)this.field9311).clear();
      switch (this.field9309) {
         case 4:
            RenderSystem.method27917(this.field9307, this.field9311);
            break;
         case 5:
            RenderSystem.method27918(this.field9307, this.field9311);
            break;
         case 6:
            RenderSystem.method27919(this.field9307, this.field9311);
            break;
         case 7:
            RenderSystem.method27920(this.field9307, this.field9311);
            break;
         default:
            field9306.warn("Uniform.upload called, but count value ({}) is not in the range of 1 to 4. Ignoring.", this.field9308);
      }
   }

   private void method7448() {
      ((Buffer)this.field9311).clear();
      switch (this.field9309) {
         case 8:
            RenderSystem.method27921(this.field9307, false, this.field9311);
            break;
         case 9:
            RenderSystem.method27922(this.field9307, false, this.field9311);
            break;
         case 10:
            RenderSystem.method27923(this.field9307, false, this.field9311);
      }
   }
}
