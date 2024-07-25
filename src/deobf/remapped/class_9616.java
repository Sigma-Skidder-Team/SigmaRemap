package remapped;

import com.google.common.base.MoreObjects;

public class class_9616 {
   public int field_48996;
   public int field_48995;
   public int field_48992;
   public int field_48991;
   public int field_48993;
   public int field_48994;

   public class_9616() {
   }

   public class_9616(int[] var1) {
      if (var1.length == 6) {
         this.field_48996 = var1[0];
         this.field_48995 = var1[1];
         this.field_48992 = var1[2];
         this.field_48991 = var1[3];
         this.field_48993 = var1[4];
         this.field_48994 = var1[5];
      }
   }

   public static class_9616 method_44397() {
      return new class_9616(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
   }

   public static class_9616 method_44389() {
      return new class_9616(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class_9616 method_44386(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class_240 var9) {
      switch (var9) {
         case field_818:
            return new class_9616(var0 + var3, var1 + var4, var2 - var8 + 1 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var5);
         case field_800:
            return new class_9616(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
         case field_809:
            return new class_9616(var0 - var8 + 1 + var5, var1 + var4, var2 + var3, var0 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         case field_804:
            return new class_9616(var0 + var5, var1 + var4, var2 + var3, var0 + var8 - 1 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         default:
            return new class_9616(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
      }
   }

   public static class_9616 method_44400(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new class_9616(Math.min(var0, var3), Math.min(var1, var4), Math.min(var2, var5), Math.max(var0, var3), Math.max(var1, var4), Math.max(var2, var5));
   }

   public class_9616(class_9616 var1) {
      this.field_48996 = var1.field_48996;
      this.field_48995 = var1.field_48995;
      this.field_48992 = var1.field_48992;
      this.field_48991 = var1.field_48991;
      this.field_48993 = var1.field_48993;
      this.field_48994 = var1.field_48994;
   }

   public class_9616(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_48996 = var1;
      this.field_48995 = var2;
      this.field_48992 = var3;
      this.field_48991 = var4;
      this.field_48993 = var5;
      this.field_48994 = var6;
   }

   public class_9616(class_2700 var1, class_2700 var2) {
      this.field_48996 = Math.min(var1.method_12173(), var2.method_12173());
      this.field_48995 = Math.min(var1.method_12165(), var2.method_12165());
      this.field_48992 = Math.min(var1.method_12185(), var2.method_12185());
      this.field_48991 = Math.max(var1.method_12173(), var2.method_12173());
      this.field_48993 = Math.max(var1.method_12165(), var2.method_12165());
      this.field_48994 = Math.max(var1.method_12185(), var2.method_12185());
   }

   public class_9616(int var1, int var2, int var3, int var4) {
      this.field_48996 = var1;
      this.field_48992 = var2;
      this.field_48991 = var3;
      this.field_48994 = var4;
      this.field_48995 = 1;
      this.field_48993 = 512;
   }

   public boolean method_44402(class_9616 var1) {
      return this.field_48991 >= var1.field_48996
         && this.field_48996 <= var1.field_48991
         && this.field_48994 >= var1.field_48992
         && this.field_48992 <= var1.field_48994
         && this.field_48993 >= var1.field_48995
         && this.field_48995 <= var1.field_48993;
   }

   public boolean method_44401(int var1, int var2, int var3, int var4) {
      return this.field_48991 >= var1 && this.field_48996 <= var3 && this.field_48994 >= var2 && this.field_48992 <= var4;
   }

   public void method_44392(class_9616 var1) {
      this.field_48996 = Math.min(this.field_48996, var1.field_48996);
      this.field_48995 = Math.min(this.field_48995, var1.field_48995);
      this.field_48992 = Math.min(this.field_48992, var1.field_48992);
      this.field_48991 = Math.max(this.field_48991, var1.field_48991);
      this.field_48993 = Math.max(this.field_48993, var1.field_48993);
      this.field_48994 = Math.max(this.field_48994, var1.field_48994);
   }

   public void method_44391(int var1, int var2, int var3) {
      this.field_48996 += var1;
      this.field_48995 += var2;
      this.field_48992 += var3;
      this.field_48991 += var1;
      this.field_48993 += var2;
      this.field_48994 += var3;
   }

   public class_9616 method_44399(int var1, int var2, int var3) {
      return new class_9616(
         this.field_48996 + var1, this.field_48995 + var2, this.field_48992 + var3, this.field_48991 + var1, this.field_48993 + var2, this.field_48994 + var3
      );
   }

   public void method_44385(class_2700 var1) {
      this.method_44391(var1.method_12173(), var1.method_12165(), var1.method_12185());
   }

   public boolean method_44395(class_2700 var1) {
      return var1.method_12173() >= this.field_48996
         && var1.method_12173() <= this.field_48991
         && var1.method_12185() >= this.field_48992
         && var1.method_12185() <= this.field_48994
         && var1.method_12165() >= this.field_48995
         && var1.method_12165() <= this.field_48993;
   }

   public class_2700 method_44394() {
      return new class_2700(this.field_48991 - this.field_48996, this.field_48993 - this.field_48995, this.field_48994 - this.field_48992);
   }

   public int method_44393() {
      return this.field_48991 - this.field_48996 + 1;
   }

   public int method_44398() {
      return this.field_48993 - this.field_48995 + 1;
   }

   public int method_44387() {
      return this.field_48994 - this.field_48992 + 1;
   }

   public class_2700 method_44396() {
      return new class_1331(
         this.field_48996 + (this.field_48991 - this.field_48996 + 1) / 2,
         this.field_48995 + (this.field_48993 - this.field_48995 + 1) / 2,
         this.field_48992 + (this.field_48994 - this.field_48992 + 1) / 2
      );
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("x0", this.field_48996)
         .add("y0", this.field_48995)
         .add("z0", this.field_48992)
         .add("x1", this.field_48991)
         .add("y1", this.field_48993)
         .add("z1", this.field_48994)
         .toString();
   }

   public class_6222 method_44388() {
      return new class_6222(new int[]{this.field_48996, this.field_48995, this.field_48992, this.field_48991, this.field_48993, this.field_48994});
   }
}
