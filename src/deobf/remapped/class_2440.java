package remapped;

import java.util.Date;

public class class_2440 {
   private static String[] field_12125;
   public int field_12126;
   public int field_12128;
   public class_4043 field_12129 = class_4043.field_19620;
   public Date field_12127;
   public Date field_12130;

   public class_2440(int var1, int var2) {
      this(var1, var2, class_4043.field_19620);
   }

   public class_2440(int var1, int var2, class_4043 var3) {
      this.field_12126 = var1;
      this.field_12128 = var2;
      this.field_12127 = new Date();
      this.field_12130 = new Date();
      this.method_11119(var3);
   }

   public int method_11121() {
      return this.field_12126;
   }

   public void method_11119(class_4043 var1) {
      if (this.field_12129 != var1) {
         switch (var1) {
            case field_19620:
               long var4 = (long)(this.method_11123() * (float)this.field_12126);
               this.field_12127 = new Date(new Date().getTime() - var4);
               break;
            case field_19618:
               long var6 = (long)((1.0F - this.method_11123()) * (float)this.field_12128);
               this.field_12130 = new Date(new Date().getTime() - var6);
         }

         this.field_12129 = var1;
      }
   }

   public void method_11122(float var1) {
      switch (this.field_12129) {
         case field_19620:
            long var4 = (long)(var1 * (float)this.field_12126);
            this.field_12127 = new Date(new Date().getTime() - var4);
            break;
         case field_19618:
            long var6 = (long)((1.0F - var1) * (float)this.field_12128);
            this.field_12130 = new Date(new Date().getTime() - var6);
      }
   }

   public class_4043 method_11128() {
      return this.field_12129;
   }

   public float method_11123() {
      return this.field_12129 != class_4043.field_19620
         ? 1.0F - (float)Math.min((long)this.field_12128, new Date().getTime() - this.field_12130.getTime()) / (float)this.field_12128
         : (float)Math.min((long)this.field_12126, new Date().getTime() - this.field_12127.getTime()) / (float)this.field_12126;
   }

   public static float method_11126(Date var0, Date var1, float var2, float var3) {
      float var6 = Math.min(var2, (float)(new Date().getTime() - (var0 != null ? var0.getTime() : new Date().getTime())))
         / var2
         * (1.0F - Math.min(var3, (float)(new Date().getTime() - (var1 != null ? var1.getTime() : new Date().getTime()))) / var3);
      return Math.max(0.0F, Math.min(1.0F, var6));
   }

   public static float method_11124(Date var0, float var1) {
      float var4 = Math.min(var1, (float)(new Date().getTime() - (var0 != null ? var0.getTime() : new Date().getTime()))) / var1;
      return Math.max(0.0F, Math.min(1.0F, var4));
   }

   public static float method_11125(Date var0, Date var1, float var2) {
      return method_11126(var0, var1, var2, var2);
   }

   public static boolean method_11120(Date var0, float var1) {
      return var0 != null && (float)(new Date().getTime() - var0.getTime()) > var1;
   }
}
