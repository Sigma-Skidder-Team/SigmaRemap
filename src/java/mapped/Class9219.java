package mapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.security.AccessController;
import java.util.ArrayList;

import lol.*;
import org.lwjgl.BufferUtils;

public class Class9219 {
   public static SGL field42419 = Renderer.get();
   private static LineStripRenderer field42420 = Renderer.method28671();
   public static int field42421 = 1;
   public static int field42422 = 2;
   public static int field42423 = 3;
   public static int field42424 = 4;
   public static int field42425 = 5;
   public static int field42426 = 6;
   private static final int field42427 = 50;
   public static Class9219 field42428 = null;
   public static Class7427 field42429;
   private float field42430 = 1.0F;
   private float field42431 = 1.0F;
   private Class7427 field42432;
   private Color field42433 = Color.field16442;
   public int field42434;
   public int field42435;
   private boolean field42436;
   private Class2527 field42437;
   private DoubleBuffer field42438 = BufferUtils.createDoubleBuffer(4);
   private ByteBuffer field42439 = BufferUtils.createByteBuffer(4);
   private boolean field42440;
   private Class2527 field42441;
   private int field42442 = field42421;
   private float field42443 = 1.0F;
   private ArrayList field42444 = new ArrayList();
   private int field42445;

   public static void method34587(Class9219 var0) {
      if (field42428 != var0) {
         if (field42428 != null) {
            field42428.method34595();
         }

         field42428 = var0;
         field42428.method34593();
      }
   }

   public Class9219() {
   }

   public Class9219(int var1, int var2) {
      if (field42429 == null) {
         AccessController.doPrivileged(new Class2539(this));
      }

      this.field42432 = field42429;
      this.field42434 = var1;
      this.field42435 = var2;
   }

   public void method34588(int var1, int var2) {
      this.field42434 = var1;
      this.field42435 = var2;
   }

   public void method34589(int var1) {
      this.method34591();
      this.field42442 = var1;
      if (this.field42442 == field42421) {
         field42419.method18381(3042);
         field42419.method18377(true, true, true, true);
         field42419.method18371(770, 771);
      }

      if (this.field42442 == field42422) {
         field42419.method18380(3042);
         field42419.method18377(false, false, false, true);
      }

      if (this.field42442 == field42423) {
         field42419.method18381(3042);
         field42419.method18377(true, true, true, false);
         field42419.method18371(772, 773);
      }

      if (this.field42442 == field42424) {
         field42419.method18381(3042);
         field42419.method18377(true, true, true, true);
         field42419.method18371(769, 768);
      }

      if (this.field42442 == field42425) {
         field42419.method18381(3042);
         field42419.method18377(true, true, true, true);
         field42419.method18371(1, 1);
      }

      if (this.field42442 == field42426) {
         field42419.method18381(3042);
         field42419.method18377(true, true, true, true);
         field42419.method18371(1, 769);
      }

      this.method34592();
   }

   public void method34590() {
      this.method34663();
      field42419.method18389();
      int var3 = this.field42442;
      this.method34589(field42422);
      this.method34607(new Color(0, 0, 0, 0));
      this.method34630(0.0F, 0.0F, (float)this.field42434, (float)this.field42435);
      this.method34607(this.field42433);
      this.method34589(var3);
      this.method34664();
   }

   private void method34591() {
      method34587(this);
   }

   private void method34592() {
   }

   public void method34593() {
   }

   public void method34594() {
      if (field42428 == this) {
         field42428.method34595();
         field42428 = null;
      }
   }

   public void method34595() {
   }

   public Class7427 method34596() {
      return this.field42432;
   }

   public void method34597(Color var1) {
      this.method34591();
      field42419.method18374(var1.r, var1.g, var1.b, var1.a);
      this.method34592();
   }

   public Color method34598() {
      this.method34591();
      FloatBuffer var3 = BufferUtils.createFloatBuffer(16);
      field42419.method18385(3106, var3);
      this.method34592();
      return new Color(var3);
   }

   public void method34599() {
      this.method34591();
      field42419.method18373(16384);
      this.method34592();
   }

   public void method34600() {
      this.field42430 = 1.0F;
      this.field42431 = 1.0F;
      if (this.field42436) {
         this.method34591();
         field42419.method18392();
         this.field42436 = false;
         this.method34592();
      }
   }

   private void method34601() {
      if (!this.field42436) {
         this.method34591();
         field42419.method18393();
         this.field42436 = true;
         this.method34592();
      }
   }

   public void method34602(float var1, float var2) {
      this.field42430 *= var1;
      this.field42431 *= var2;
      this.method34601();
      this.method34591();
      field42419.method18396(var1, var2, 1.0F);
      this.method34592();
   }

   public void method34603(float var1, float var2, float var3) {
      this.method34601();
      this.method34591();
      this.method34604(var1, var2);
      field42419.method18395(var3, 0.0F, 0.0F, 1.0F);
      this.method34604(-var1, -var2);
      this.method34592();
   }

   public void method34604(float var1, float var2) {
      this.method34601();
      this.method34591();
      field42419.method18400(var1, var2, 0.0F);
      this.method34592();
   }

   public void method34605(Class7427 var1) {
      this.field42432 = var1;
   }

   public void method34606() {
      this.field42432 = field42429;
   }

   public void method34607(Color var1) {
      if (var1 != null) {
         this.field42433 = new Color(var1);
         this.method34591();
         this.field42433.method10392();
         this.method34592();
      }
   }

   public Color method34608() {
      return new Color(this.field42433);
   }

   public void method34609(float var1, float var2, float var3, float var4) {
      float var7 = this.field42443 - 1.0F;
      if (field42420.method23239()) {
         if (var1 == var3) {
            if (var2 > var4) {
               float var12 = var4;
               var4 = var2;
               var2 = var12;
            }

            float var13 = 1.0F / this.field42431;
            var7 /= this.field42431;
            this.method34630(var1 - var7 / 2.0F, var2 - var7 / 2.0F, var7 + var13, var4 - var2 + var7 + var13);
            return;
         }

         if (var2 == var4) {
            if (var1 > var3) {
               float var8 = var3;
               var3 = var1;
               var1 = var8;
            }

            float var11 = 1.0F / this.field42430;
            var7 /= this.field42430;
            this.method34630(var1 - var7 / 2.0F, var2 - var7 / 2.0F, var3 - var1 + var7 + var11, var7 + var11);
            return;
         }
      }

      this.method34591();
      this.field42433.method10392();
      TextureImpl.bindNone();
      field42420.method23240();
      field42420.method23242(var1, var2);
      field42420.method23242(var3, var4);
      field42420.method23241();
      this.method34592();
   }

   public void method34610(Class2520 var1, Class8518 var2) {
      this.method34591();
      TextureImpl.bindNone();
      Class9247.method34776(var1, var2);
      this.field42433.method10392();
      this.method34592();
   }

   public void method34611(Class2520 var1, Class8518 var2) {
      this.method34591();
      TextureImpl.bindNone();
      Class9247.method34784(var1, var2);
      this.field42433.method10392();
      this.method34592();
   }

   public void method34612(Class2520 var1) {
      this.method34591();
      TextureImpl.bindNone();
      this.field42433.method10392();
      Class9247.method34775(var1);
      this.method34592();
   }

   public void method34613(Class2520 var1) {
      this.method34591();
      TextureImpl.bindNone();
      this.field42433.method10392();
      Class9247.method34778(var1);
      this.method34592();
   }

   public void method34614(Class2520 var1, Image var2) {
      this.method34618(var1, var2, 0.01F, 0.01F, false);
   }

   public void method34615(Class2520 var1, Image var2, Class8518 var3) {
      this.method34619(var1, var2, 0.01F, 0.01F, var3);
   }

   public void method34616(Class2520 var1, Image var2, boolean var3) {
      if (!var3) {
         this.method34618(var1, var2, 0.01F, 0.01F, false);
      } else {
         this.method34618(var1, var2, 1.0F, 1.0F, true);
      }
   }

   public void method34617(Class2520 var1, Image var2, float var3, float var4) {
      this.method34618(var1, var2, var3, var4, false);
   }

   public void method34618(Class2520 var1, Image var2, float var3, float var4, boolean var5) {
      this.method34591();
      TextureImpl.bindNone();
      this.field42433.method10392();
      if (var5) {
         Class9247.method34783(var1, var2, var3, var4);
      }

      this.method34592();
   }

   public void method34619(Class2520 var1, Image var2, float var3, float var4, Class8518 var5) {
      this.method34591();
      TextureImpl.bindNone();
      this.field42433.method10392();
      Class9247.method34785(var1, var2, var3, var4, var5);
      this.method34592();
   }

   public void method34620(float var1, float var2, float var3, float var4) {
      float var7 = this.method34644();
      this.method34609(var1, var2, var1 + var3, var2);
      this.method34609(var1 + var3, var2, var1 + var3, var2 + var4);
      this.method34609(var1 + var3, var2 + var4, var1, var2 + var4);
      this.method34609(var1, var2 + var4, var1, var2);
   }

   public void method34621() {
      this.field42437 = null;
      this.method34591();
      field42419.method18380(3089);
      this.method34592();
   }

   public void method34622(float var1, float var2, float var3, float var4) {
      this.method34591();
      this.field42441 = new Class2527(var1, var2, var3, var4);
      field42419.method18381(12288);
      ((Buffer)this.field42438.put(1.0).put(0.0).put(0.0).put((double)(-var1))).flip();
      field42419.method18375(12288, this.field42438);
      field42419.method18381(12289);
      ((Buffer)this.field42438.put(-1.0).put(0.0).put(0.0).put((double)(var1 + var3))).flip();
      field42419.method18375(12289, this.field42438);
      field42419.method18381(12290);
      ((Buffer)this.field42438.put(0.0).put(1.0).put(0.0).put((double)(-var2))).flip();
      field42419.method18375(12290, this.field42438);
      field42419.method18381(12291);
      ((Buffer)this.field42438.put(0.0).put(-1.0).put(0.0).put((double)(var2 + var4))).flip();
      field42419.method18375(12291, this.field42438);
      this.method34592();
   }

   public void method34623() {
      this.method34591();
      this.field42441 = null;
      field42419.method18380(12288);
      field42419.method18380(12289);
      field42419.method18380(12290);
      field42419.method18380(12291);
      this.method34592();
   }

   public void method34624(Class2527 var1) {
      if (var1 != null) {
         this.method34622(var1.method10579(), var1.method10582(), var1.method10616(), var1.method10617());
      } else {
         this.method34623();
      }
   }

   public Class2527 method34625() {
      return this.field42441;
   }

   public void method34626(int var1, int var2, int var3, int var4) {
      this.method34591();
      if (this.field42437 != null) {
         this.field42437.method10646((float)var1, (float)var2, (float)var3, (float)var4);
      } else {
         field42419.method18381(3089);
         this.field42437 = new Class2527((float)var1, (float)var2, (float)var3, (float)var4);
      }

      field42419.method18397(var1, this.field42435 - var2 - var4, var3, var4);
      this.method34592();
   }

   public void method34627(Class2527 var1) {
      if (var1 != null) {
         this.method34626((int)var1.method10579(), (int)var1.method10582(), (int)var1.method10616(), (int)var1.method10617());
      } else {
         this.method34621();
      }
   }

   public Class2527 method34628() {
      return this.field42437;
   }

   public void method34629(float var1, float var2, float var3, float var4, Image var5, float var6, float var7) {
      int var10 = (int)Math.ceil((double)(var3 / (float)var5.method23558())) + 2;
      int var11 = (int)Math.ceil((double)(var4 / (float)var5.method23559())) + 2;
      Class2527 var12 = this.method34625();
      this.method34622(var1, var2, var3, var4);
      this.method34591();

      for (int var13 = 0; var13 < var10; var13++) {
         for (int var14 = 0; var14 < var11; var14++) {
            var5.method23527((float)(var13 * var5.method23558()) + var1 - var6, (float)(var14 * var5.method23559()) + var2 - var7);
         }
      }

      this.method34592();
      this.method34624(var12);
   }

   public void method34630(float var1, float var2, float var3, float var4) {
      this.method34591();
      TextureImpl.bindNone();
      this.field42433.method10392();
      field42419.method18369(7);
      field42419.method18401(var1, var2);
      field42419.method18401(var1 + var3, var2);
      field42419.method18401(var1 + var3, var2 + var4);
      field42419.method18401(var1, var2 + var4);
      field42419.method18382();
      this.method34592();
   }

   public void method34631(float var1, float var2, float var3, float var4) {
      this.method34632(var1, var2, var3, var4, 50);
   }

   public void method34632(float var1, float var2, float var3, float var4, int var5) {
      this.method34634(var1, var2, var3, var4, var5, 0.0F, 360.0F);
   }

   public void method34633(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method34634(var1, var2, var3, var4, 50, var5, var6);
   }

   public void method34634(float var1, float var2, float var3, float var4, int var5, float var6, float var7) {
      this.method34591();
      TextureImpl.bindNone();
      this.field42433.method10392();

      while (var7 < var6) {
         var7 += 360.0F;
      }

      float var10 = var1 + var3 / 2.0F;
      float var11 = var2 + var4 / 2.0F;
      field42420.method23240();
      int var12 = 360 / var5;

      for (int var13 = (int)var6; var13 < (int)(var7 + (float)var12); var13 += var12) {
         float var14 = (float)var13;
         if (var14 > var7) {
            var14 = var7;
         }

         float var15 = (float)((double)var10 + Class4835.method14957(Math.toRadians((double)var14)) * (double)var3 / 2.0);
         float var16 = (float)((double)var11 + Class4835.method14956(Math.toRadians((double)var14)) * (double)var4 / 2.0);
         field42420.method23242(var15, var16);
      }

      field42420.method23241();
      this.method34592();
   }

   public void method34635(float var1, float var2, float var3, float var4) {
      this.method34636(var1, var2, var3, var4, 50);
   }

   public void method34636(float var1, float var2, float var3, float var4, int var5) {
      this.method34638(var1, var2, var3, var4, var5, 0.0F, 360.0F);
   }

   public void method34637(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method34638(var1, var2, var3, var4, 50, var5, var6);
   }

   public void method34638(float var1, float var2, float var3, float var4, int var5, float var6, float var7) {
      this.method34591();
      TextureImpl.bindNone();
      this.field42433.method10392();

      while (var7 < var6) {
         var7 += 360.0F;
      }

      float var10 = var1 + var3 / 2.0F;
      float var11 = var2 + var4 / 2.0F;
      field42419.method18369(6);
      int var12 = 360 / var5;
      field42419.method18401(var10, var11);

      for (int var13 = (int)var6; var13 < (int)(var7 + (float)var12); var13 += var12) {
         float var14 = (float)var13;
         if (var14 > var7) {
            var14 = var7;
         }

         float var15 = (float)((double)var10 + Class4835.method14957(Math.toRadians((double)var14)) * (double)var3 / 2.0);
         float var16 = (float)((double)var11 + Class4835.method14956(Math.toRadians((double)var14)) * (double)var4 / 2.0);
         field42419.method18401(var15, var16);
      }

      field42419.method18382();
      if (this.field42440) {
         field42419.method18369(6);
         field42419.method18401(var10, var11);
         if (var7 != 360.0F) {
            var7 -= 10.0F;
         }

         for (int var17 = (int)var6; var17 < (int)(var7 + (float)var12); var17 += var12) {
            float var18 = (float)var17;
            if (var18 > var7) {
               var18 = var7;
            }

            float var19 = (float)((double)var10 + Class4835.method14957(Math.toRadians((double)(var18 + 10.0F))) * (double)var3 / 2.0);
            float var20 = (float)((double)var11 + Class4835.method14956(Math.toRadians((double)(var18 + 10.0F))) * (double)var4 / 2.0);
            field42419.method18401(var19, var20);
         }

         field42419.method18382();
      }

      this.method34592();
   }

   public void method34639(float var1, float var2, float var3, float var4, int var5) {
      this.method34640(var1, var2, var3, var4, var5, 50);
   }

   public void method34640(float var1, float var2, float var3, float var4, int var5, int var6) {
      if (var5 >= 0) {
         if (var5 != 0) {
            int var9 = (int)Math.min(var3, var4) / 2;
            if (var5 > var9) {
               var5 = var9;
            }

            this.method34609(var1 + (float)var5, var2, var1 + var3 - (float)var5, var2);
            this.method34609(var1, var2 + (float)var5, var1, var2 + var4 - (float)var5);
            this.method34609(var1 + var3, var2 + (float)var5, var1 + var3, var2 + var4 - (float)var5);
            this.method34609(var1 + (float)var5, var2 + var4, var1 + var3 - (float)var5, var2 + var4);
            float var10 = (float)(var5 * 2);
            this.method34634(var1 + var3 - var10, var2 + var4 - var10, var10, var10, var6, 0.0F, 90.0F);
            this.method34634(var1, var2 + var4 - var10, var10, var10, var6, 90.0F, 180.0F);
            this.method34634(var1 + var3 - var10, var2, var10, var10, var6, 270.0F, 360.0F);
            this.method34634(var1, var2, var10, var10, var6, 180.0F, 270.0F);
         } else {
            this.method34620(var1, var2, var3, var4);
         }
      } else {
         throw new IllegalArgumentException("corner radius must be > 0");
      }
   }

   public void method34641(float var1, float var2, float var3, float var4, int var5) {
      this.method34642(var1, var2, var3, var4, var5, 50);
   }

   public void method34642(float var1, float var2, float var3, float var4, int var5, int var6) {
      if (var5 >= 0) {
         if (var5 != 0) {
            int var9 = (int)Math.min(var3, var4) / 2;
            if (var5 > var9) {
               var5 = var9;
            }

            float var10 = (float)(var5 * 2);
            this.method34630(var1 + (float)var5, var2, var3 - var10, (float)var5);
            this.method34630(var1, var2 + (float)var5, (float)var5, var4 - var10);
            this.method34630(var1 + var3 - (float)var5, var2 + (float)var5, (float)var5, var4 - var10);
            this.method34630(var1 + (float)var5, var2 + var4 - (float)var5, var3 - var10, (float)var5);
            this.method34630(var1 + (float)var5, var2 + (float)var5, var3 - var10, var4 - var10);
            this.method34638(var1 + var3 - var10, var2 + var4 - var10, var10, var10, var6, 0.0F, 90.0F);
            this.method34638(var1, var2 + var4 - var10, var10, var10, var6, 90.0F, 180.0F);
            this.method34638(var1 + var3 - var10, var2, var10, var10, var6, 270.0F, 360.0F);
            this.method34638(var1, var2, var10, var10, var6, 180.0F, 270.0F);
         } else {
            this.method34630(var1, var2, var3, var4);
         }
      } else {
         throw new IllegalArgumentException("corner radius must be > 0");
      }
   }

   public void method34643(float var1) {
      this.method34591();
      this.field42443 = var1;
      field42420.method23244(var1);
      field42419.method18391(var1);
      this.method34592();
   }

   public float method34644() {
      return this.field42443;
   }

   public void method34645() {
      this.method34591();
      Renderer.method28671().method23244(1.0F);
      field42419.method18388(1.0F);
      field42419.method18391(1.0F);
      this.method34592();
   }

   public void method34646(boolean var1) {
      this.method34591();
      this.field42440 = var1;
      field42420.method23245(var1);
      if (!var1) {
         field42419.method18380(2881);
      } else {
         field42419.method18381(2881);
      }

      this.method34592();
   }

   public boolean method34647() {
      return this.field42440;
   }

   public void method34648(String var1, float var2, float var3) {
      this.method34591();
      this.field42432.drawString(var2, var3, var1, this.field42433);
      this.method34592();
   }

   public void method34649(Image var1, float var2, float var3, Color var4) {
      this.method34591();
      var1.method23528(var2, var3, var4);
      this.field42433.method10392();
      this.method34592();
   }

   public void method34650(Class7389 var1, float var2, float var3) {
      this.method34651(var1, var2, var3, Color.field16442);
   }

   public void method34651(Class7389 var1, float var2, float var3, Color var4) {
      this.method34591();
      var1.method23528(var2, var3, var4);
      this.field42433.method10392();
      this.method34592();
   }

   public void method34652(Image var1, float var2, float var3) {
      this.method34649(var1, var2, var3, Color.field16442);
   }

   public void method34653(Image var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      this.method34591();
      var1.method23553(var2, var3, var4, var5, var6, var7, var8, var9);
      this.field42433.method10392();
      this.method34592();
   }

   public void method34654(Image var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method34653(var1, var2, var3, var2 + (float)var1.method23558(), var3 + (float)var1.method23559(), var4, var5, var6, var7);
   }

   public void method34655(Image var1, int var2, int var3) {
      int var6 = !var1.method23565().hasAlpha() ? 6407 : 6408;
      var1.method23522();
      field42419.method18378(
         3553, 0, var6, var2, this.field42435 - (var3 + var1.method23559()), var1.method23565().getTextureWidth(), var1.method23565().getTextureHeight(), 0
      );
      var1.method23563();
   }

   private int method34656(byte var1) {
      return var1 >= 0 ? var1 : 256 + var1;
   }

   public Color method34657(int var1, int var2) {
      this.method34591();
      field42419.method18394(var1, this.field42435 - var2, 1, 1, 6408, 5121, this.field42439);
      this.method34592();
      return new Color(
         this.method34656(this.field42439.get(0)),
         this.method34656(this.field42439.get(1)),
         this.method34656(this.field42439.get(2)),
         this.method34656(this.field42439.get(3))
      );
   }

   public void method34658(int var1, int var2, int var3, int var4, ByteBuffer var5) {
      if (var5.capacity() >= var3 * var4 * 4) {
         this.method34591();
         field42419.method18394(var1, this.field42435 - var2 - var4, var3, var4, 6408, 5121, var5);
         this.method34592();
      } else {
         throw new IllegalArgumentException("Byte buffer provided to get area is not big enough");
      }
   }

   public void method34659(Image var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, Color var10) {
      this.method34591();
      var1.method23554(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.field42433.method10392();
      this.method34592();
   }

   public void method34660(Image var1, float var2, float var3, float var4, float var5, float var6, float var7, Color var8) {
      this.method34659(var1, var2, var3, var2 + (float)var1.method23558(), var3 + (float)var1.method23559(), var4, var5, var6, var7, var8);
   }

   public void method34661(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12
   ) {
      this.method34591();
      TextureImpl.bindNone();
      field42419.method18369(1);
      field42419.method18376(var3, var4, var5, var6);
      field42419.method18401(var1, var2);
      field42419.method18376(var9, var10, var11, var12);
      field42419.method18401(var7, var8);
      field42419.method18382();
      this.method34592();
   }

   public void method34662(float var1, float var2, Color var3, float var4, float var5, Color var6) {
      this.method34591();
      TextureImpl.bindNone();
      field42419.method18369(1);
      var3.method10392();
      field42419.method18401(var1, var2);
      var6.method10392();
      field42419.method18401(var4, var5);
      field42419.method18382();
      this.method34592();
   }

   public void method34663() {
      this.method34591();
      FloatBuffer var3;
      if (this.field42445 < this.field42444.size()) {
         var3 = (FloatBuffer)this.field42444.get(this.field42445);
      } else {
         var3 = BufferUtils.createFloatBuffer(18);
         this.field42444.add(var3);
      }

      field42419.method18385(2982, var3);
      var3.put(16, this.field42430);
      var3.put(17, this.field42431);
      this.field42445++;
      this.method34592();
   }

   public void method34664() {
      if (this.field42445 != 0) {
         this.method34591();
         this.field42445--;
         FloatBuffer var3 = (FloatBuffer)this.field42444.get(this.field42445);
         field42419.method18411(var3);
         this.field42430 = var3.get(16);
         this.field42431 = var3.get(17);
         this.method34592();
      } else {
         throw new RuntimeException("Attempt to pop a transform that hasn't be pushed");
      }
   }

   public void method34665() {
   }
}
