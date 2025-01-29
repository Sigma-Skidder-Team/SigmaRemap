package lol;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;

import mapped.*;
import org.lwjgl.BufferUtils;
import org.newdawn.slick.opengl.ImageData;
import org.newdawn.slick.opengl.ImageDataFactory;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

public class InternalTextureLoader {
   public static SGL field43633 = Renderer.get();
   private static final InternalTextureLoader field43634 = new InternalTextureLoader();
   private HashMap field43635 = new HashMap();
   private HashMap field43636 = new HashMap();
   private int field43637 = 6408;
   private boolean field43638;
   private boolean field43639;

   public static InternalTextureLoader get() {
      return field43634;
   }

   private InternalTextureLoader() {
   }

   public void method35783(boolean var1) {
      this.field43639 = var1;
   }

   public void method35784(boolean var1) {
      this.field43638 = var1;
   }

   public boolean method35785() {
      return this.field43638;
   }

   public void method35786(String var1) {
      this.field43635.remove(var1);
      this.field43636.remove(var1);
   }

   public void method35787() {
      this.field43635.clear();
      this.field43636.clear();
   }

   public void method35788() {
      this.field43637 = 32859;
   }

   public static int method35789() {
      IntBuffer var2 = method35801(1);
      field43633.glGenTextures(var2);
      return var2.get(0);
   }

   public Texture method35790(File var1, boolean var2, int var3) throws IOException {
      String var6 = var1.getAbsolutePath();
      FileInputStream var7 = new FileInputStream(var1);
      return this.method35795(var7, var6, var2, var3, null);
   }

   public Texture method35791(File var1, boolean var2, int var3, int[] var4) throws IOException {
      String var7 = var1.getAbsolutePath();
      FileInputStream var8 = new FileInputStream(var1);
      return this.method35795(var8, var7, var2, var3, var4);
   }

   public Texture method35792(String var1, boolean var2, int var3) throws IOException {
      InputStream var6 = ResourceLoader.getResourceAsStream(var1);
      return this.method35795(var6, var1, var2, var3, null);
   }

   public Texture getTexture(String var1, boolean var2, int var3, int[] var4) throws IOException {
      InputStream var7 = ResourceLoader.getResourceAsStream(var1);
      return this.method35795(var7, var1, var2, var3, var4);
   }

   public Texture getTexture(InputStream var1, String var2, boolean var3, int var4) throws IOException {
      return this.method35795(var1, var2, var3, var4, null);
   }

   public TextureImpl method35795(InputStream var1, String var2, boolean var3, int var4, int[] var5) throws IOException {
      HashMap var8 = this.field43635;
      if (var4 == 9728) {
         var8 = this.field43636;
      }

      String var9 = var2;
      if (var5 != null) {
         var9 = var2 + ":" + var5[0] + ":" + var5[1] + ":" + var5[2];
      }

      var9 = var9 + ":" + var3;
      if (this.field43639) {
         TextureImpl var10 = (TextureImpl)var8.get(var9);
         if (var10 != null) {
            return var10;
         }
      } else {
         SoftReference var14 = (SoftReference)var8.get(var9);
         if (var14 != null) {
            TextureImpl var11 = (TextureImpl)var14.get();
            if (var11 != null) {
               return var11;
            }

            var8.remove(var9);
         }
      }

      try {
         field43633.glGetError();
      } catch (NullPointerException var12) {
         throw new RuntimeException("Image based resources must be loaded as part of init() or the game loop. They cannot be loaded before initialisation.");
      }

      TextureImpl var15 = this.method35796(var1, var2, 3553, var4, var4, var3, var5);
      var15.method36177(var9);
      if (this.field43639) {
         var8.put(var9, var15);
      } else {
         var8.put(var9, new SoftReference<TextureImpl>(var15));
      }

      return var15;
   }

   private TextureImpl method35796(InputStream var1, String var2, int var3, int var4, int var5, boolean var6, int[] var7) throws IOException {
      LoadableImageData var10 = ImageDataFactory.getImageDataFor(var2);
      ByteBuffer var11 = var10.method21468(new BufferedInputStream(var1), var6, var7);
      int var12 = method35789();
      TextureImpl var13 = new TextureImpl(var2, var3, var12);
      field43633.glBindTexture(var3, var12);
      int var14 = var10.getWidth();
      int var15 = var10.getHeight();
      boolean var16 = var10.getDepth() == 32;
      var13.method36184(var10.getTexWidth());
      var13.method36183(var10.getTexHeight());
      int var17 = var13.getTextureWidth();
      int var18 = var13.getTextureHeight();
      IntBuffer var19 = BufferUtils.createIntBuffer(16);
      field43633.glGetInteger(3379, var19);
      int var20 = var19.get(0);
      int var21 = !var16 ? 6407 : 6408;
      int var22 = !var16 ? 3 : 4;
      var13.method36182(var14);
      var13.method36181(var15);
      var13.method36178(var16);
      if (this.field43639) {
         var13.method36189(var21, var22, var5, var4, var11);
      }

      field43633.glTexParameteri(var3, 10241, var5);
      field43633.glTexParameteri(var3, 10240, var4);
      field43633.glTexImage2D(var3, 0, this.field43637, method35800(var14), method35800(var15), 0, var21, 5121, var11);
      return var13;
   }

   public Texture method35797(int var1, int var2) throws IOException {
      return this.method35798(var1, var2, 9728);
   }

   public Texture method35798(int var1, int var2, int var3) throws IOException {
      EmptyImageData var6 = new EmptyImageData(var1, var2);
      return this.method35799(var6, var3);
   }

   public Texture method35799(ImageData var1, int var2) throws IOException {
      short var5 = 3553;
      ByteBuffer var6 = var1.getImageBufferData();
      int var7 = method35789();
      TextureImpl var8 = new TextureImpl("generated:" + var1, var5, var7);
      boolean var11 = false;
      field43633.glBindTexture(var5, var7);
      int var12 = var1.getWidth();
      int var13 = var1.getHeight();
      boolean var14 = var1.getDepth() == 32;
      var8.method36184(var1.getTexWidth());
      var8.method36183(var1.getTexHeight());
      int var15 = var8.getTextureWidth();
      int var16 = var8.getTextureHeight();
      int var17 = !var14 ? 6407 : 6408;
      int var18 = !var14 ? 3 : 4;
      var8.method36182(var12);
      var8.method36181(var13);
      var8.method36178(var14);
      IntBuffer var19 = BufferUtils.createIntBuffer(16);
      field43633.glGetInteger(3379, var19);
      int var20 = var19.get(0);
      if (var15 <= var20 && var16 <= var20) {
         if (this.field43639) {
            var8.method36189(var17, var18, var2, var2, var6);
         }

         field43633.glTexParameteri(var5, 10241, var2);
         field43633.glTexParameteri(var5, 10240, var2);
         field43633.glTexImage2D(var5, 0, this.field43637, method35800(var12), method35800(var13), 0, var17, 5121, var6);
         return var8;
      } else {
         throw new IOException("Attempt to allocate a texture to big for the current hardware");
      }
   }

   public static int method35800(int var0) {
      int var3 = 2;

      while (var3 < var0) {
         var3 *= 2;
      }

      return var3;
   }

   public static IntBuffer method35801(int var0) {
      ByteBuffer var3 = ByteBuffer.allocateDirect(4 * var0);
      var3.order(ByteOrder.nativeOrder());
      return var3.asIntBuffer();
   }

   public void method35802() {
      Iterator var3 = this.field43635.values().iterator();

      while (var3.hasNext()) {
         ((TextureImpl)var3.next()).method36190();
      }

      var3 = this.field43636.values().iterator();

      while (var3.hasNext()) {
         ((TextureImpl)var3.next()).method36190();
      }
   }

   public int method35803(TextureImpl var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      short var9 = 3553;
      int var10 = method35789();
      field43633.glBindTexture(var9, var10);
      field43633.glTexParameteri(var9, 10241, var4);
      field43633.glTexParameteri(var9, 10240, var5);
      field43633.glTexImage2D(var9, 0, this.field43637, var1.getTextureWidth(), var1.getTextureHeight(), 0, var2, 5121, var6);
      return var10;
   }
}
