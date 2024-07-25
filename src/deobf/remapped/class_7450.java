package remapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Properties;
import org.lwjgl.opengl.GL11;

public class class_7450 {
   private String field_37957 = null;
   private String field_37960 = null;
   public Identifier field_37970 = null;
   private int field_37958 = -1;
   private int field_37962 = 0;
   private int field_37956 = 0;
   private int field_37964 = 0;
   private int field_37966 = 0;
   private class_9165[] field_37969 = null;
   private int field_37971 = 0;
   private boolean field_37968 = false;
   private int field_37959 = 0;
   private ByteBuffer field_37963 = null;
   public byte[] field_37955 = null;
   private ByteBuffer field_37967 = null;
   private boolean field_37965 = true;
   private boolean field_37961 = true;

   public class_7450(String var1, byte[] var2, String var3, Identifier var4, int var5, int var6, int var7, int var8, Properties var9) {
      this.field_37957 = var1;
      this.field_37960 = var3;
      this.field_37970 = var4;
      this.field_37962 = var5;
      this.field_37956 = var6;
      this.field_37964 = var7;
      this.field_37966 = var8;
      int var12 = var7 * var8 * 4;
      if (var2.length % var12 != 0) {
         class_3111.method_14317("Invalid animated texture length: " + var2.length + ", frameWidth: " + var7 + ", frameHeight: " + var8);
      }

      this.field_37955 = var2;
      int var13 = var2.length / var12;
      if (var9.get("tile.0") != null) {
         for (int var14 = 0; var9.get("tile." + var14) != null; var14++) {
            var13 = var14 + 1;
         }
      }

      String var22 = (String)var9.get("duration");
      int var15 = Math.max(class_3111.method_14361(var22, 1), 1);
      this.field_37969 = new class_9165[var13];

      for (int var16 = 0; var16 < this.field_37969.length; var16++) {
         String var17 = (String)var9.get("tile." + var16);
         int var18 = class_3111.method_14361(var17, var16);
         String var19 = (String)var9.get("duration." + var16);
         int var20 = Math.max(class_3111.method_14361(var19, var15), 1);
         class_9165 var21 = new class_9165(var18, var20);
         this.field_37969[var16] = var21;
      }

      this.field_37968 = class_3111.method_14257(var9.getProperty("interpolate"), false);
      this.field_37959 = class_3111.method_14361(var9.getProperty("skip"), 0);
      if (this.field_37968) {
         this.field_37963 = class_1423.method_6528(var12);
      }
   }

   public boolean method_33901() {
      class_9165 var3 = this.method_33894();
      if (var3 != null) {
         var3.field_46911++;
         if (var3.field_46911 >= var3.field_46909) {
            var3.field_46911 = 0;
            this.field_37971++;
            if (this.field_37971 >= this.field_37969.length) {
               this.field_37971 = 0;
            }

            return true;
         } else {
            return this.field_37968;
         }
      } else {
         return false;
      }
   }

   public class_9165 method_33894() {
      return this.method_33896(this.field_37971);
   }

   public class_9165 method_33896(int var1) {
      if (this.field_37969.length <= 0) {
         return null;
      } else {
         if (var1 < 0 || var1 >= this.field_37969.length) {
            var1 = 0;
         }

         return this.field_37969[var1];
      }
   }

   public int method_33904() {
      return this.field_37969.length;
   }

   public void method_33897() {
      if (this.field_37961) {
         if (this.field_37958 < 0) {
            class_8143 var3 = class_5525.method_25065(this.field_37970);
            if (var3 == null) {
               this.field_37961 = false;
               return;
            }

            this.field_37958 = var3.method_37055();
         }

         if (this.field_37967 == null) {
            this.field_37967 = class_1423.method_6528(this.field_37955.length);
            this.field_37967.put(this.field_37955);
            ((Buffer)this.field_37967).flip();
            this.field_37955 = null;
         }

         this.field_37965 = !class_153.method_611() ? true : class_153.method_616(this.field_37958);
         if (this.method_33901() && this.field_37965) {
            int var9 = this.field_37964 * this.field_37966 * 4;
            class_9165 var4 = this.method_33894();
            if (var4 != null) {
               int var5 = var9 * var4.field_46908;
               if (var5 + var9 <= this.field_37967.limit()) {
                  if (!this.field_37968 || var4.field_46911 <= 0) {
                     ((Buffer)this.field_37967).position(var5);
                     class_1920.method_8791(this.field_37958);
                     class_5525.method_25072();
                     GL11.glTexSubImage2D(3553, 0, this.field_37962, this.field_37956, this.field_37964, this.field_37966, 6408, 5121, this.field_37967);
                  } else if (this.field_37959 <= 1 || var4.field_46911 % this.field_37959 == 0) {
                     class_9165 var6 = this.method_33896(this.field_37971 + 1);
                     double var7 = 1.0 * (double)var4.field_46911 / (double)var4.field_46909;
                     this.method_33893(var4, var6, var7);
                  }
               }
            }
         }
      }
   }

   private void method_33893(class_9165 var1, class_9165 var2, double var3) {
      int var7 = this.field_37964 * this.field_37966 * 4;
      int var8 = var7 * var1.field_46908;
      if (var8 + var7 <= this.field_37967.limit()) {
         int var9 = var7 * var2.field_46908;
         if (var9 + var7 <= this.field_37967.limit()) {
            ((Buffer)this.field_37963).clear();

            for (int var10 = 0; var10 < var7; var10++) {
               int var11 = this.field_37967.get(var8 + var10) & 255;
               int var12 = this.field_37967.get(var9 + var10) & 255;
               int var13 = this.method_33899(var11, var12, var3);
               byte var14 = (byte)var13;
               this.field_37963.put(var14);
            }

            ((Buffer)this.field_37963).flip();
            class_1920.method_8791(this.field_37958);
            class_5525.method_25072();
            GL11.glTexSubImage2D(3553, 0, this.field_37962, this.field_37956, this.field_37964, this.field_37966, 6408, 5121, this.field_37963);
         }
      }
   }

   private int method_33899(int var1, int var2, double var3) {
      return (int)((double)var1 * (1.0 - var3) + (double)var2 * var3);
   }

   public String method_33900() {
      return this.field_37957;
   }

   public String method_33898() {
      return this.field_37960;
   }

   public Identifier method_33903() {
      return this.field_37970;
   }

   public boolean method_33902() {
      return this.field_37965;
   }
}
