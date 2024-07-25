package remapped;

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
import org.lwjgl.BufferUtils;

public class class_8256 {
   public static class_1299 field_42368 = class_3980.method_18363();
   private static final class_8256 field_42367 = new class_8256();
   private HashMap field_42366 = new HashMap();
   private HashMap field_42362 = new HashMap();
   private int field_42369 = 6408;
   private boolean field_42364;
   private boolean field_42363;

   public static class_8256 method_37848() {
      return field_42367;
   }

   private class_8256() {
   }

   public void method_37847(boolean var1) {
      this.field_42363 = var1;
   }

   public void method_37856(boolean var1) {
      this.field_42364 = var1;
   }

   public boolean method_37850() {
      return this.field_42364;
   }

   public void method_37855(String var1) {
      this.field_42366.remove(var1);
      this.field_42362.remove(var1);
   }

   public void method_37854() {
      this.field_42366.clear();
      this.field_42362.clear();
   }

   public void method_37867() {
      this.field_42369 = 32859;
   }

   public static int method_37849() {
      IntBuffer var2 = method_37846(1);
      field_42368.method_5901(var2);
      return var2.get(0);
   }

   public class_8343 method_37857(File var1, boolean var2, int var3) throws IOException {
      String var6 = var1.getAbsolutePath();
      FileInputStream var7 = new FileInputStream(var1);
      return this.method_37861(var7, var6, var2, var3, null);
   }

   public class_8343 method_37858(File var1, boolean var2, int var3, int[] var4) throws IOException {
      String var7 = var1.getAbsolutePath();
      FileInputStream var8 = new FileInputStream(var1);
      return this.method_37861(var8, var7, var2, var3, var4);
   }

   public class_8343 method_37862(String var1, boolean var2, int var3) throws IOException {
      InputStream var6 = class_8975.method_41153(var1);
      return this.method_37861(var6, var1, var2, var3, null);
   }

   public class_8343 method_37863(String var1, boolean var2, int var3, int[] var4) throws IOException {
      InputStream var7 = class_8975.method_41153(var1);
      return this.method_37861(var7, var1, var2, var3, var4);
   }

   public class_8343 method_37860(InputStream var1, String var2, boolean var3, int var4) throws IOException {
      return this.method_37861(var1, var2, var3, var4, null);
   }

   public class_9162 method_37861(InputStream var1, String var2, boolean var3, int var4, int[] var5) throws IOException {
      HashMap var8 = this.field_42366;
      if (var4 == 9728) {
         var8 = this.field_42362;
      }

      String var9 = var2;
      if (var5 != null) {
         var9 = var2 + ":" + var5[0] + ":" + var5[1] + ":" + var5[2];
      }

      var9 = var9 + ":" + var3;
      if (this.field_42363) {
         class_9162 var10 = (class_9162)var8.get(var9);
         if (var10 != null) {
            return var10;
         }
      } else {
         SoftReference var14 = (SoftReference)var8.get(var9);
         if (var14 != null) {
            class_9162 var11 = (class_9162)var14.get();
            if (var11 != null) {
               return var11;
            }

            var8.remove(var9);
         }
      }

      try {
         field_42368.method_5894();
      } catch (NullPointerException var12) {
         throw new RuntimeException("Image based resources must be loaded as part of init() or the game loop. They cannot be loaded before initialisation.");
      }

      class_9162 var15 = this.method_37859(var1, var2, 3553, var4, var4, var3, var5);
      var15.method_42210(var9);
      if (this.field_42363) {
         var8.put(var9, var15);
      } else {
         var8.put(var9, new SoftReference<class_9162>(var15));
      }

      return var15;
   }

   private class_9162 method_37859(InputStream var1, String var2, int var3, int var4, int var5, boolean var6, int[] var7) throws IOException {
      class_7411 var10 = class_5449.method_24832(var2);
      ByteBuffer var11 = var10.method_33770(new BufferedInputStream(var1), var6, var7);
      int var12 = method_37849();
      class_9162 var13 = new class_9162(var2, var3, var12);
      field_42368.method_5904(var3, var12);
      int var14 = var10.method_5155();
      int var15 = var10.method_5153();
      boolean var16 = var10.method_5154() == 32;
      var13.method_42216(var10.method_5150());
      var13.method_42226(var10.method_5151());
      int var17 = var13.method_38420();
      int var18 = var13.method_38422();
      IntBuffer var19 = BufferUtils.createIntBuffer(16);
      field_42368.method_5932(3379, var19);
      int var20 = var19.get(0);
      int var21 = !var16 ? 6407 : 6408;
      int var22 = !var16 ? 3 : 4;
      var13.method_42225(var14);
      var13.method_42215(var15);
      var13.method_42221(var16);
      if (this.field_42363) {
         var13.method_42211(var21, var22, var5, var4, var11);
      }

      field_42368.method_5908(var3, 10241, var5);
      field_42368.method_5908(var3, 10240, var4);
      field_42368.method_5939(var3, 0, this.field_42369, method_37851(var14), method_37851(var15), 0, var21, 5121, var11);
      return var13;
   }

   public class_8343 method_37865(int var1, int var2) throws IOException {
      return this.method_37866(var1, var2, 9728);
   }

   public class_8343 method_37866(int var1, int var2, int var3) throws IOException {
      class_4728 var6 = new class_4728(var1, var2);
      return this.method_37864(var6, var3);
   }

   public class_8343 method_37864(class_1155 var1, int var2) throws IOException {
      short var5 = 3553;
      ByteBuffer var6 = var1.method_5152();
      int var7 = method_37849();
      class_9162 var8 = new class_9162("generated:" + var1, var5, var7);
      boolean var11 = false;
      field_42368.method_5904(var5, var7);
      int var12 = var1.method_5155();
      int var13 = var1.method_5153();
      boolean var14 = var1.method_5154() == 32;
      var8.method_42216(var1.method_5150());
      var8.method_42226(var1.method_5151());
      int var15 = var8.method_38420();
      int var16 = var8.method_38422();
      int var17 = !var14 ? 6407 : 6408;
      int var18 = !var14 ? 3 : 4;
      var8.method_42225(var12);
      var8.method_42215(var13);
      var8.method_42221(var14);
      IntBuffer var19 = BufferUtils.createIntBuffer(16);
      field_42368.method_5932(3379, var19);
      int var20 = var19.get(0);
      if (var15 <= var20 && var16 <= var20) {
         if (this.field_42363) {
            var8.method_42211(var17, var18, var2, var2, var6);
         }

         field_42368.method_5908(var5, 10241, var2);
         field_42368.method_5908(var5, 10240, var2);
         field_42368.method_5939(var5, 0, this.field_42369, method_37851(var12), method_37851(var13), 0, var17, 5121, var6);
         return var8;
      } else {
         throw new IOException("Attempt to allocate a texture to big for the current hardware");
      }
   }

   public static int method_37851(int var0) {
      byte var3 = 2;

      while (var3 < var0) {
         var3 *= 2;
      }

      return var3;
   }

   public static IntBuffer method_37846(int var0) {
      ByteBuffer var3 = ByteBuffer.allocateDirect(4 * var0);
      var3.order(ByteOrder.nativeOrder());
      return var3.asIntBuffer();
   }

   public void method_37852() {
      Iterator var3 = this.field_42366.values().iterator();

      while (var3.hasNext()) {
         ((class_9162)var3.next()).method_42218();
      }

      var3 = this.field_42362.values().iterator();

      while (var3.hasNext()) {
         ((class_9162)var3.next()).method_42218();
      }
   }

   public int method_37853(class_9162 var1, int var2, int var3, int var4, int var5, ByteBuffer var6) {
      short var9 = 3553;
      int var10 = method_37849();
      field_42368.method_5904(var9, var10);
      field_42368.method_5908(var9, 10241, var4);
      field_42368.method_5908(var9, 10240, var5);
      field_42368.method_5939(var9, 0, this.field_42369, var1.method_38420(), var1.method_38422(), 0, var2, 5121, var6);
      return var10;
   }
}
