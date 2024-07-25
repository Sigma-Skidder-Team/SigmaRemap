package remapped;

import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import java.io.File;
import javax.annotation.Nullable;

public abstract class class_9716 extends class_704 {
   public class_753 field_49385;
   public float field_49391;
   public float field_49394;
   public float field_49384;
   public final class_174 field_49392;
   private class_4639 field_49387 = null;
   private long field_49390 = 0L;
   private boolean field_49382 = false;
   private String field_49389 = null;
   public class_7819 field_49383;
   public class_7819 field_49395;
   public float field_49393;
   public float field_49381;
   public float field_49386;
   private static final class_4639 field_49388 = new class_4639("textures/entity/elytra.png");

   public class_9716(class_174 var1, GameProfile var2) {
      super(var1, var1.method_758(), var1.method_734(), var2);
      this.field_49392 = var1;
      this.field_49389 = var2.getName();
      if (this.field_49389 != null && !this.field_49389.isEmpty()) {
         this.field_49389 = class_6660.method_30578(this.field_49389);
      }

      class_2614.method_11857(this);
   }

   @Override
   public boolean method_37221() {
      class_753 var3 = MinecraftClient.getInstance().method_8614().method_4800(this.method_3247().getId());
      return var3 != null && var3.method_3393() == class_4666.field_22756;
   }

   @Override
   public boolean method_3186() {
      class_753 var3 = MinecraftClient.getInstance().method_8614().method_4800(this.method_3247().getId());
      return var3 != null && var3.method_3393() == class_4666.field_22761;
   }

   public boolean method_44885() {
      return this.method_44881() != null;
   }

   @Nullable
   public class_753 method_44881() {
      if (this.field_49385 == null) {
         this.field_49385 = MinecraftClient.getInstance().method_8614().method_4800(this.method_37328());
      }

      return this.field_49385;
   }

   public boolean method_44880() {
      class_753 var3 = this.method_44881();
      return var3 != null && var3.method_3404();
   }

   public class_4639 method_44889() {
      class_753 var3 = this.method_44881();
      return var3 != null ? var3.method_3402() : class_1512.method_6921(this.method_37328());
   }

   @Nullable
   public class_4639 method_44891() {
      if (class_3111.method_14274()) {
         if (this.field_49390 != 0L && System.currentTimeMillis() > this.field_49390) {
            class_3773.method_17459(this);
            this.field_49390 = 0L;
         }

         if (this.field_49387 == null) {
            class_753 var3 = this.method_44881();
            return var3 != null ? var3.method_3397() : null;
         } else {
            return this.field_49387;
         }
      } else {
         return null;
      }
   }

   public boolean method_44884() {
      return this.method_44881() != null;
   }

   @Nullable
   public class_4639 method_44883() {
      class_753 var3 = this.method_44881();
      return var3 != null ? var3.method_3413() : null;
   }

   public static class_9211 method_44882(class_4639 var0, String var1) {
      class_7889 var4 = MinecraftClient.getInstance().method_8577();
      Object var5 = var4.method_35679(var0);
      if (var5 == null) {
         var5 = new class_9211(
            (File)null,
            String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", class_6660.method_30578(var1)),
            class_1512.method_6921(method_3249(var1)),
            true,
            (Runnable)null
         );
         var4.method_35682(var0, (class_8143)var5);
      }

      return (class_9211)var5;
   }

   public static class_4639 method_44890(String var0) {
      return new class_4639("skins/" + Hashing.sha1().hashUnencodedChars(class_6660.method_30578(var0)));
   }

   public String method_44874() {
      class_753 var3 = this.method_44881();
      return var3 != null ? var3.method_3409() : class_1512.method_6923(this.method_37328());
   }

   public float method_44876() {
      float var3 = 1.0F;
      if (this.field_3876.field_4942) {
         var3 *= 1.1F;
      }

      var3 = (float)((double)var3 * ((this.method_26575(class_7331.field_37465) / (double)this.field_3876.method_4229() + 1.0) / 2.0));
      if (this.field_3876.method_4229() == 0.0F || Float.isNaN(var3) || Float.isInfinite(var3)) {
         var3 = 1.0F;
      }

      if (this.method_26554() && this.method_26576().method_27960() instanceof class_2100) {
         int var4 = this.method_26613();
         float var5 = (float)var4 / 20.0F;
         if (!(var5 > 1.0F)) {
            var5 *= var5;
         } else {
            var5 = 1.0F;
         }

         var3 *= 1.0F - var5 * 0.15F;
      }

      float var7 = !class_7860.field_40182.method_3596() ? var3 : class_7860.method_35586(class_7860.field_40182, this, var3);
      class_8128 var9 = new class_8128(var7);
      SigmaMainClass.method_3328().method_3302().method_7914(var9);
      return var9.field_41637;
   }

   public String method_44878() {
      return this.field_49389;
   }

   public class_4639 method_44877() {
      return this.field_49387;
   }

   public void method_44886(class_4639 var1) {
      this.field_49387 = var1;
   }

   public boolean method_44887() {
      class_4639 var3 = this.method_44891();
      if (var3 != null) {
         return var3 != this.field_49387 ? true : this.field_49382;
      } else {
         return false;
      }
   }

   public void method_44875(boolean var1) {
      this.field_49382 = var1;
   }

   public boolean method_44892() {
      return this.field_49382;
   }

   public long method_44888() {
      return this.field_49390;
   }

   public void method_44879(long var1) {
      this.field_49390 = var1;
   }
}
