package mapped;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.optifine.Config;
import net.optifine.shaders.ShadersRender;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class Class8836 {
   private RenderType field39905 = null;
   private int field39906 = GlStateManager.method23746();
   private int field39907 = 4096;
   private int field39908 = 0;
   private int field39909;
   private Class9380<Class8697> field39910 = new Class9380<Class8697>();
   private Class8697 field39911 = null;
   private IntBuffer field39912 = Config.method26984(this.field39907);
   private IntBuffer field39913 = Config.method26984(this.field39907);
   private final int field39914 = DefaultVertexFormats.field43334.method26216();
   private int field39915 = 7;
   private boolean field39916 = Config.isShaders();

   public Class8836(RenderType var1) {
      this.field39905 = var1;
      this.method31984();
      long var4 = this.method31989(this.field39907);
      GlStateManager.method23885(GlStateManager.GL_ARRAY_BUFFER, var4, GlStateManager.GL_STATIC_DRAW);
      this.method31987();
   }

   public void method31978(ByteBuffer var1, Class8697 var2) {
      if (this.field39906 >= 0) {
         int var5 = var2.method31335();
         int var6 = var2.method31336();
         int var7 = this.method31990((long)var1.limit());
         if (var7 > 0) {
            if (var7 > var6) {
               var2.method31338(this.field39908);
               var2.method31339(var7);
               this.field39908 += var7;
               if (var5 >= 0) {
                  this.field39910.method35596(var2.method31340());
               }

               this.field39910.method35594(var2.method31340());
            }

            var2.method31339(var7);
            this.field39909 += var7 - var6;
            this.method31981(var2.method31337());
            long var8 = this.method31989(var2.method31335());
            this.method31984();
            GlStateManager.method23886(GlStateManager.GL_ARRAY_BUFFER, var8, var1);
            this.method31987();
            if (this.field39908 > this.field39909 * 11 / 10) {
               this.method31979(1);
            }
         } else if (var5 >= 0) {
            var2.method31338(-1);
            var2.method31339(0);
            this.field39910.method35596(var2.method31340());
            this.field39909 -= var6;
         }
      }
   }

   private void method31979(int var1) {
      if (!this.field39910.method35606()) {
         Class8697 var4 = this.field39911;
         if (var4 == null || !this.field39910.method35601(var4.method31340())) {
            var4 = this.field39910.method35603().method25253();
         }

         int var5 = var4.method31335();
         Class8697 var6 = var4.method31341();
         if (var6 != null) {
            var5 = var6.method31337();
         } else {
            var5 = 0;
         }

         int var7 = 0;

         while (var4 != null && var7 < var1) {
            var7++;
            if (var4.method31335() != var5) {
               int var8 = var4.method31335() - var5;
               if (var4.method31336() > var8) {
                  this.method31981(this.field39908 + var4.method31336());
                  this.method31982(var4.method31335(), this.field39908, var4.method31336());
                  var4.method31338(this.field39908);
                  this.field39908 = this.field39908 + var4.method31336();
                  Class8697 var9 = var4.method31342();
                  this.field39910.method35596(var4.method31340());
                  this.field39910.method35594(var4.method31340());
                  var4 = var9;
               } else {
                  this.method31982(var4.method31335(), var5, var4.method31336());
                  var4.method31338(var5);
                  var5 += var4.method31336();
                  var4 = var4.method31342();
               }
            } else {
               var5 += var4.method31336();
               var4 = var4.method31342();
            }
         }

         if (var4 == null) {
            this.field39908 = this.field39910.method35604().method25253().method31337();
         }

         this.field39911 = var4;
      }
   }

   private void method31980() {
      int var3 = 0;
      int var4 = 0;

      for (Class8697 var5 = this.field39910.method35603().method25253(); var5 != null; var5 = var5.method31342()) {
         var3++;
         var4 += var5.method31336();
         if (var5.method31335() < 0 || var5.method31336() <= 0 || var5.method31337() > this.field39908) {
            throw new RuntimeException("Invalid range: " + var5);
         }

         Class8697 var6 = var5.method31341();
         if (var6 != null && var5.method31335() < var6.method31337()) {
            throw new RuntimeException("Invalid range: " + var5);
         }

         Class8697 var7 = var5.method31342();
         if (var7 != null && var5.method31337() > var7.method31335()) {
            throw new RuntimeException("Invalid range: " + var5);
         }
      }

      if (var3 != this.field39910.method35605()) {
         throw new RuntimeException("Invalid count: " + var3 + " <> " + this.field39910.method35605());
      } else if (var4 != this.field39909) {
         throw new RuntimeException("Invalid size: " + var4 + " <> " + this.field39909);
      }
   }

   private void method31981(int var1) {
      if (this.field39907 < var1) {
         this.method31983(var1);
      }
   }

   private void method31982(int var1, int var2, int var3) {
      long var6 = this.method31989(var1);
      long var8 = this.method31989(var2);
      long var10 = this.method31989(var3);
      GlStateManager.bindBuffer(GlStateManager.GL_COPY_READ_BUFFER, this.field39906);
      GlStateManager.bindBuffer(GlStateManager.GL_COPY_WRITE_BUFFER, this.field39906);
      GlStateManager.method23887(GlStateManager.GL_COPY_READ_BUFFER, GlStateManager.GL_COPY_WRITE_BUFFER, var6, var8, var10);
      Config.method26908("Copy VBO range");
      GlStateManager.bindBuffer(GlStateManager.GL_COPY_READ_BUFFER, 0);
      GlStateManager.bindBuffer(GlStateManager.GL_COPY_WRITE_BUFFER, 0);
   }

   private void method31983(int var1) {
      int var4 = this.field39907 * 6 / 4;

      while (var4 < var1) {
         var4 = var4 * 6 / 4;
      }

      long var5 = this.method31989(this.field39907);
      long var7 = this.method31989(var4);
      int var9 = GlStateManager.method23746();
      GlStateManager.bindBuffer(GlStateManager.GL_ARRAY_BUFFER, var9);
      GlStateManager.method23885(GlStateManager.GL_ARRAY_BUFFER, var7, GlStateManager.GL_STATIC_DRAW);
      Config.method26908("Expand VBO");
      GlStateManager.bindBuffer(GlStateManager.GL_ARRAY_BUFFER, 0);
      GlStateManager.bindBuffer(GlStateManager.GL_COPY_READ_BUFFER, this.field39906);
      GlStateManager.bindBuffer(GlStateManager.GL_COPY_WRITE_BUFFER, var9);
      GlStateManager.method23887(GlStateManager.GL_COPY_READ_BUFFER, GlStateManager.GL_COPY_WRITE_BUFFER, 0L, 0L, var5);
      Config.method26908("Copy VBO: " + var7);
      GlStateManager.bindBuffer(GlStateManager.GL_COPY_READ_BUFFER, 0);
      GlStateManager.bindBuffer(GlStateManager.GL_COPY_WRITE_BUFFER, 0);
      GlStateManager.method23749(this.field39906);
      this.field39912 = Config.method26984(var4);
      this.field39913 = Config.method26984(var4);
      this.field39906 = var9;
      this.field39907 = var4;
   }

   public void method31984() {
      GlStateManager.bindBuffer(GlStateManager.GL_ARRAY_BUFFER, this.field39906);
   }

   public void method31985(int var1, Class8697 var2) {
      if (this.field39915 != var1) {
         if (this.field39912.position() > 0) {
            throw new IllegalArgumentException("Mixed region draw modes: " + this.field39915 + " != " + var1);
         }

         this.field39915 = var1;
      }

      this.field39912.put(var2.method31335());
      this.field39913.put(var2.method31336());
   }

   public void method31986() {
      this.method31984();
      DefaultVertexFormats.field43334.method26218(0L);
      if (this.field39916) {
         ShadersRender.method17166();
      }

      ((Buffer)this.field39912).flip();
      ((Buffer)this.field39913).flip();
      GlStateManager.method23882(this.field39915, this.field39912, this.field39913);
      ((Buffer)this.field39912).limit(this.field39912.capacity());
      ((Buffer)this.field39913).limit(this.field39913.capacity());
      if (this.field39908 > this.field39909 * 11 / 10) {
         this.method31979(1);
      }
   }

   public void method31987() {
      GlStateManager.bindBuffer(GlStateManager.GL_ARRAY_BUFFER, 0);
   }

   public void method31988() {
      if (this.field39906 >= 0) {
         GlStateManager.method23749(this.field39906);
         this.field39906 = -1;
      }
   }

   private long method31989(int var1) {
      return (long)var1 * (long)this.field39914;
   }

   private int method31990(long var1) {
      return (int)(var1 / (long)this.field39914);
   }

   public int method31991() {
      return this.field39908;
   }
}
