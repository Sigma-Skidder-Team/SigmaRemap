package remapped;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.MemoryUtil;

public class class_3972 extends class_7049 implements AutoCloseable {
   private static final Logger field_19267 = LogManager.getLogger();
   private int field_19270;
   private final int field_19268;
   private final int field_19274;
   private final IntBuffer field_19271;
   private final FloatBuffer field_19272;
   private final String field_19273;
   private boolean field_19276;
   private final class_2072 field_19269;

   public class_3972(String var1, int var2, int var3, class_2072 var4) {
      this.field_19273 = var1;
      this.field_19268 = var3;
      this.field_19274 = var2;
      this.field_19269 = var4;
      if (var2 > 3) {
         this.field_19271 = null;
         this.field_19272 = MemoryUtil.memAllocFloat(var3);
      } else {
         this.field_19271 = MemoryUtil.memAllocInt(var3);
         this.field_19272 = null;
      }

      this.field_19270 = -1;
      this.method_18336();
   }

   public static int method_18332(int var0, CharSequence var1) {
      return class_1920.method_8900(var0, var1);
   }

   public static void method_18331(int var0, int var1) {
      class_3542.method_16414(var0, var1);
   }

   public static int method_18338(int var0, CharSequence var1) {
      return class_1920.method_8815(var0, var1);
   }

   @Override
   public void close() {
      if (this.field_19271 != null) {
         MemoryUtil.memFree(this.field_19271);
      }

      if (this.field_19272 != null) {
         MemoryUtil.memFree(this.field_19272);
      }
   }

   private void method_18336() {
      this.field_19276 = true;
      if (this.field_19269 != null) {
         this.field_19269.method_9675();
      }
   }

   public static int method_18330(String var0) {
      byte var3 = -1;
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

   public void method_18337(int var1) {
      this.field_19270 = var1;
   }

   public String method_18340() {
      return this.field_19273;
   }

   @Override
   public void method_32385(float var1) {
      ((Buffer)this.field_19272).position(0);
      this.field_19272.put(0, var1);
      this.method_18336();
   }

   @Override
   public void method_32386(float var1, float var2) {
      ((Buffer)this.field_19272).position(0);
      this.field_19272.put(0, var1);
      this.field_19272.put(1, var2);
      this.method_18336();
   }

   @Override
   public void method_32387(float var1, float var2, float var3) {
      ((Buffer)this.field_19272).position(0);
      this.field_19272.put(0, var1);
      this.field_19272.put(1, var2);
      this.field_19272.put(2, var3);
      this.method_18336();
   }

   @Override
   public void method_32388(float var1, float var2, float var3, float var4) {
      ((Buffer)this.field_19272).position(0);
      this.field_19272.put(var1);
      this.field_19272.put(var2);
      this.field_19272.put(var3);
      this.field_19272.put(var4);
      ((Buffer)this.field_19272).flip();
      this.method_18336();
   }

   @Override
   public void method_32392(float var1, float var2, float var3, float var4) {
      ((Buffer)this.field_19272).position(0);
      if (this.field_19274 >= 4) {
         this.field_19272.put(0, var1);
      }

      if (this.field_19274 >= 5) {
         this.field_19272.put(1, var2);
      }

      if (this.field_19274 >= 6) {
         this.field_19272.put(2, var3);
      }

      if (this.field_19274 >= 7) {
         this.field_19272.put(3, var4);
      }

      this.method_18336();
   }

   @Override
   public void method_32389(int var1, int var2, int var3, int var4) {
      ((Buffer)this.field_19271).position(0);
      if (this.field_19274 >= 0) {
         this.field_19271.put(0, var1);
      }

      if (this.field_19274 >= 1) {
         this.field_19271.put(1, var2);
      }

      if (this.field_19274 >= 2) {
         this.field_19271.put(2, var3);
      }

      if (this.field_19274 >= 3) {
         this.field_19271.put(3, var4);
      }

      this.method_18336();
   }

   @Override
   public void method_32391(float[] var1) {
      if (var1.length >= this.field_19268) {
         ((Buffer)this.field_19272).position(0);
         this.field_19272.put(var1);
         ((Buffer)this.field_19272).position(0);
         this.method_18336();
      } else {
         field_19267.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", this.field_19268, var1.length);
      }
   }

   @Override
   public void method_32390(class_8107 var1) {
      ((Buffer)this.field_19272).position(0);
      var1.method_36827(this.field_19272);
      this.method_18336();
   }

   public void method_18339() {
      if (this.field_19276) {
      }

      this.field_19276 = false;
      if (this.field_19274 > 3) {
         if (this.field_19274 > 7) {
            if (this.field_19274 > 10) {
               field_19267.warn("Uniform.upload called, but type value ({}) is not a valid type. Ignoring.", this.field_19274);
               return;
            }

            this.method_18335();
         } else {
            this.method_18334();
         }
      } else {
         this.method_18333();
      }
   }

   private void method_18333() {
      ((Buffer)this.field_19272).clear();
      switch (this.field_19274) {
         case 0:
            class_3542.method_16379(this.field_19270, this.field_19271);
            break;
         case 1:
            class_3542.method_16427(this.field_19270, this.field_19271);
            break;
         case 2:
            class_3542.method_16384(this.field_19270, this.field_19271);
            break;
         case 3:
            class_3542.method_16469(this.field_19270, this.field_19271);
            break;
         default:
            field_19267.warn("Uniform.upload called, but count value ({}) is  not in the range of 1 to 4. Ignoring.", this.field_19268);
      }
   }

   private void method_18334() {
      ((Buffer)this.field_19272).clear();
      switch (this.field_19274) {
         case 4:
            class_3542.method_16378(this.field_19270, this.field_19272);
            break;
         case 5:
            class_3542.method_16426(this.field_19270, this.field_19272);
            break;
         case 6:
            class_3542.method_16383(this.field_19270, this.field_19272);
            break;
         case 7:
            class_3542.method_16468(this.field_19270, this.field_19272);
            break;
         default:
            field_19267.warn("Uniform.upload called, but count value ({}) is not in the range of 1 to 4. Ignoring.", this.field_19268);
      }
   }

   private void method_18335() {
      ((Buffer)this.field_19272).clear();
      switch (this.field_19274) {
         case 8:
            class_3542.method_16423(this.field_19270, false, this.field_19272);
            break;
         case 9:
            class_3542.method_16394(this.field_19270, false, this.field_19272);
            break;
         case 10:
            class_3542.method_16375(this.field_19270, false, this.field_19272);
      }
   }
}
