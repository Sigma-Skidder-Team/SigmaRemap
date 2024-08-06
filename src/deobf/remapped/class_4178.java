package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_4178 extends class_7038 implements class_333 {
   private static String[] field_20338;
   public boolean field_20343;
   public boolean field_20339;
   public int field_20345;
   public int field_20342;
   public int field_20332;
   public int field_20344;
   public boolean field_20333 = true;
   public boolean field_20341 = false;
   public boolean field_20336 = true;
   public boolean field_20340 = true;
   public boolean field_20347 = false;
   public final Timer field_20334 = new Timer();
   public int field_20346 = 300;
   public int field_20337 = 2;
   private final List<class_918> field_20335 = new ArrayList<class_918>();

   public class_4178(class_7038 var1, String var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field_20343 = var7;
   }

   public class_4178(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, boolean var8) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.field_20343 = var8;
   }

   public class_4178(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, boolean var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field_20343 = var9;
   }

   public class_4178(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, FontRenderer var9, boolean var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      this.field_20343 = var10;
   }

   @Override
   public boolean method_32185() {
      return this.field_36267 && !this.method_1535();
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      if (this.method_1537()) {
         if (!this.field_36267 && !this.field_20339) {
            this.field_20332 = this.method_32109() / 2;
            this.field_20344 = this.method_32137() / 2;
         }

         this.method_1534(var1, var2);
      }
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      if (!super.method_29508(var1, var2, var3)) {
         if (this.method_1537()) {
            this.field_20334.method_14776();
            this.field_20345 = var1;
            this.field_20342 = var2;
            this.field_20332 = this.field_20345 - this.method_32155();
            this.field_20344 = this.field_20342 - this.method_32093();
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method_29505(int var1, int var2, int var3) {
      super.method_29505(var1, var2, var3);
      if (this.method_1537()) {
         this.field_20334.method_14774();
         this.field_20334.method_14773();
      }

      this.method_1536(false);
   }

   @Override
   public void method_1534(int var1, int var2) {
      boolean var5 = this.field_20339;
      if (!this.method_1535() && this.method_1537()) {
         boolean var6 = this.field_20336 && this.field_20334.method_14772() >= (long)this.field_20346;
         boolean var7 = this.field_20340
            && this.field_36267
            && (Math.abs(this.field_20345 - var1) > this.field_20337 || Math.abs(this.field_20342 - var2) > this.field_20337);
         boolean var8 = this.field_20347 && this.field_36267;
         if (var6 || var7 || var8) {
            this.method_1536(true);
         }
      } else if (this.method_1535()) {
         this.method_32175(var1 - this.field_20332 - (this.field_36283 == null ? 0 : this.field_36283.method_32155()));
         this.method_32117(var2 - this.field_20344 - (this.field_36283 == null ? 0 : this.field_36283.method_32093()));
         if (this.field_20333) {
            if (this.field_36283 == null) {
               if (this.method_32132() < 0) {
                  this.method_32175(0);
               }

               if (this.method_32132() + this.method_32109() > MinecraftClient.getInstance().window.method_43166()) {
                  this.method_32175(MinecraftClient.getInstance().window.method_43166() - this.method_32109());
               }

               if (this.method_32173() < 0) {
                  this.method_32117(0);
               }

               if (this.method_32173() + this.method_32137() > MinecraftClient.getInstance().window.method_43163()) {
                  this.method_32117(MinecraftClient.getInstance().window.method_43163() - this.method_32137());
               }
            } else {
               if (this.method_32132() < 0) {
                  this.method_32175(0);
               }

               if (this.method_32132() + this.method_32109() > this.field_36283.method_32109()) {
                  this.method_32175(this.field_36283.method_32109() - this.method_32109());
               }

               if (this.method_32173() < 0) {
                  this.method_32117(0);
               }

               if (this.method_32173() + this.method_32137() > this.field_36283.method_32137() && !this.field_20341) {
                  this.method_32117(this.field_36283.method_32137() - this.method_32137());
               }
            }
         }
      }

      if (this.method_1535() && !var5) {
         this.field_20334.method_14774();
         this.field_20334.method_14773();
      }
   }

   @Override
   public boolean method_1537() {
      return this.field_20343;
   }

   @Override
   public void method_1533(boolean var1) {
      this.field_20343 = var1;
   }

   @Override
   public boolean method_1535() {
      return this.field_20339;
   }

   @Override
   public void method_1536(boolean var1) {
      this.field_20339 = var1;
      if (var1) {
         this.method_1533(true);
         this.method_19446();
      }
   }

   public class_4178 method_19447(class_918 var1) {
      this.field_20335.add(var1);
      return this;
   }

   public void method_19446() {
      for (class_918 var4 : this.field_20335) {
         var4.method_4029(this);
      }
   }
}
