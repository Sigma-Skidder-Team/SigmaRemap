package remapped;

import java.util.ArrayList;

public class class_3270 implements class_4189 {
   private ArrayList field_16191 = new ArrayList();
   private int field_16193 = -1;
   private long field_16197 = 0L;
   private boolean field_16205 = false;
   private long field_16198;
   private float field_16199 = 1.0F;
   private int field_16204 = -2;
   private long field_16195;
   private boolean field_16201 = true;
   private boolean field_16203 = true;
   private int field_16200 = 1;
   private boolean field_16192;
   private boolean field_16202 = true;
   private class_1888 field_16196 = null;

   public class_3270() {
      this(true);
   }

   public class_3270(class_8112[] var1, int var2) {
      this(var1, var2, true);
   }

   public class_3270(class_8112[] var1, int[] var2) {
      this(var1, var2, true);
   }

   public class_3270(boolean var1) {
      this.field_16193 = 0;
      this.field_16203 = var1;
   }

   public class_3270(class_8112[] var1, int var2, boolean var3) {
      for (int var6 = 0; var6 < var1.length; var6++) {
         this.method_14913(var1[var6], var2);
      }

      this.field_16193 = 0;
      this.field_16203 = var3;
   }

   public class_3270(class_8112[] var1, int[] var2, boolean var3) {
      this.field_16203 = var3;
      if (var1.length != var2.length) {
         throw new RuntimeException("There must be one duration per frame");
      } else {
         for (int var6 = 0; var6 < var1.length; var6++) {
            this.method_14913(var1[var6], var2[var6]);
         }

         this.field_16193 = 0;
      }
   }

   public class_3270(class_1888 var1, int var2) {
      this(var1, 0, 0, var1.method_8427() - 1, var1.method_8425() - 1, true, var2, true);
   }

   public class_3270(class_1888 var1, int var2, int var3, int var4, int var5, boolean var6, int var7, boolean var8) {
      this.field_16203 = var8;
      if (var6) {
         for (int var11 = var3; var11 <= var5; var11++) {
            for (int var12 = var2; var12 <= var4; var12++) {
               this.method_14913(var1.method_8424(var12, var11), var7);
            }
         }
      } else {
         for (int var13 = var2; var13 <= var4; var13++) {
            for (int var14 = var3; var14 <= var5; var14++) {
               this.method_14913(var1.method_8424(var13, var14), var7);
            }
         }
      }
   }

   public class_3270(class_1888 var1, int[] var2, int[] var3) {
      this.field_16196 = var1;
      int var6 = -1;
      int var7 = -1;

      for (int var8 = 0; var8 < var2.length / 2; var8++) {
         var6 = var2[var8 * 2];
         var7 = var2[var8 * 2 + 1];
         this.method_14912(var3[var8], var6, var7);
      }
   }

   public void method_14912(int var1, int var2, int var3) {
      if (var1 != 0) {
         if (this.field_16191.isEmpty()) {
            this.field_16197 = (long)((int)((float)var1 / this.field_16199));
         }

         this.field_16191.add(new class_4443(this, var1, var2, var3));
         this.field_16193 = 0;
      } else {
         class_2598.method_11783("Invalid duration: " + var1);
         throw new RuntimeException("Invalid duration: " + var1);
      }
   }

   public void method_14897(boolean var1) {
      this.field_16203 = var1;
   }

   public void method_14914(boolean var1) {
      this.field_16192 = var1;
   }

   public boolean method_14905() {
      return this.field_16205;
   }

   public void method_14923(float var1) {
      if (var1 > 0.0F) {
         this.field_16197 = (long)((float)this.field_16197 * this.field_16199 / var1);
         this.field_16199 = var1;
      }
   }

   public float method_14903() {
      return this.field_16199;
   }

   public void method_14919() {
      if (this.field_16191.size() != 0) {
         this.field_16198 = this.field_16197;
         this.field_16205 = true;
      }
   }

   public void method_14904() {
      if (this.field_16205) {
         if (this.field_16191.size() != 0) {
            this.field_16205 = false;
            this.field_16197 = this.field_16198;
         }
      }
   }

   public void method_14922() {
      if (this.field_16191.size() != 0) {
         this.field_16205 = false;
         this.field_16193 = 0;
         this.field_16197 = (long)((int)((float)((class_4443)this.field_16191.get(0)).field_21660 / this.field_16199));
         this.field_16201 = true;
         this.field_16195 = 0L;
      }
   }

   public void method_14913(class_8112 var1, int var2) {
      if (var2 != 0) {
         if (this.field_16191.isEmpty()) {
            this.field_16197 = (long)((int)((float)var2 / this.field_16199));
         }

         this.field_16191.add(new class_4443(this, var1, var2));
         this.field_16193 = 0;
      } else {
         class_2598.method_11783("Invalid duration: " + var2);
         throw new RuntimeException("Invalid duration: " + var2);
      }
   }

   public void method_14924() {
      this.method_19475(0.0F, 0.0F);
   }

   @Override
   public void method_19475(float var1, float var2) {
      this.method_14925(var1, var2, (float)this.method_14911(), (float)this.method_14931());
   }

   public void method_14927(float var1, float var2, class_8709 var3) {
      this.method_14926(var1, var2, (float)this.method_14911(), (float)this.method_14931(), var3);
   }

   public void method_14925(float var1, float var2, float var3, float var4) {
      this.method_14926(var1, var2, var3, var4, class_8709.field_44646);
   }

   public void method_14926(float var1, float var2, float var3, float var4, class_8709 var5) {
      if (this.field_16191.size() != 0) {
         if (this.field_16203) {
            long var9 = this.method_14915();
            long var11 = var9 - this.field_16195;
            if (this.field_16201) {
               var11 = 0L;
               this.field_16201 = false;
            }

            this.field_16195 = var9;
            this.method_14908(var11);
         }

         class_4443 var8 = (class_4443)this.field_16191.get(this.field_16193);
         var8.field_21659.method_36892(var1, var2, var3, var4, var5);
      }
   }

   public void method_14918(int var1, int var2) {
      if (this.field_16191.size() != 0) {
         if (this.field_16203) {
            long var6 = this.method_14915();
            long var8 = var6 - this.field_16195;
            if (this.field_16201) {
               var8 = 0L;
               this.field_16201 = false;
            }

            this.field_16195 = var6;
            this.method_14908(var8);
         }

         class_4443 var5 = (class_4443)this.field_16191.get(this.field_16193);
         this.field_16196.method_8426(var1, var2, var5.field_21662, var5.field_21661);
      }
   }

   public int method_14911() {
      return ((class_4443)this.field_16191.get(this.field_16193)).field_21659.method_36877();
   }

   public int method_14931() {
      return ((class_4443)this.field_16191.get(this.field_16193)).field_21659.method_36856();
   }

   public void method_14899(float var1, float var2, float var3, float var4) {
      this.method_14900(var1, var2, var3, var4, class_8709.field_44646);
   }

   public void method_14900(float var1, float var2, float var3, float var4, class_8709 var5) {
      if (this.field_16191.size() != 0) {
         if (this.field_16203) {
            long var9 = this.method_14915();
            long var11 = var9 - this.field_16195;
            if (this.field_16201) {
               var11 = 0L;
               this.field_16201 = false;
            }

            this.field_16195 = var9;
            this.method_14908(var11);
         }

         class_4443 var8 = (class_4443)this.field_16191.get(this.field_16193);
         var8.field_21659.method_36848(var1, var2, var3, var4, var5);
      }
   }

   /** @deprecated */
   public void method_14898() {
      if (this.field_16203) {
         long var3 = this.method_14915();
         long var5 = var3 - this.field_16195;
         if (this.field_16201) {
            var5 = 0L;
            this.field_16201 = false;
         }

         this.field_16195 = var3;
         this.method_14908(var5);
      }
   }

   public void method_14902(long var1) {
      this.method_14908(var1);
   }

   public int method_14907() {
      return this.field_16193;
   }

   public void method_14928(int var1) {
      this.field_16193 = var1;
   }

   public class_8112 method_14920(int var1) {
      class_4443 var4 = (class_4443)this.field_16191.get(var1);
      return var4.field_21659;
   }

   public int method_14906() {
      return this.field_16191.size();
   }

   public class_8112 method_14930() {
      class_4443 var3 = (class_4443)this.field_16191.get(this.field_16193);
      return var3.field_21659;
   }

   private void method_14908(long var1) {
      if (!this.field_16205) {
         if (this.field_16191.size() != 0) {
            this.field_16197 -= var1;

            while (this.field_16197 < 0L && !this.field_16205) {
               if (this.field_16193 == this.field_16204) {
                  this.field_16205 = true;
                  break;
               }

               if (this.field_16193 == this.field_16191.size() - 1 && !this.field_16202 && !this.field_16192) {
                  this.field_16205 = true;
                  break;
               }

               this.field_16193 = (this.field_16193 + this.field_16200) % this.field_16191.size();
               if (this.field_16192) {
                  if (this.field_16193 > 0) {
                     if (this.field_16193 >= this.field_16191.size() - 1) {
                        this.field_16193 = this.field_16191.size() - 1;
                        this.field_16200 = -1;
                     }
                  } else {
                     this.field_16193 = 0;
                     this.field_16200 = 1;
                     if (!this.field_16202) {
                        this.field_16205 = true;
                        break;
                     }
                  }
               }

               int var5 = (int)((float)((class_4443)this.field_16191.get(this.field_16193)).field_21660 / this.field_16199);
               this.field_16197 += (long)var5;
            }
         }
      }
   }

   public void method_14917(boolean var1) {
      this.field_16202 = var1;
   }

   private long method_14915() {
      return 0L;
   }

   public void method_14901(int var1) {
      this.field_16204 = var1;
   }

   public int method_14896(int var1) {
      return ((class_4443)this.field_16191.get(var1)).field_21660;
   }

   public void method_14910(int var1, int var2) {
      ((class_4443)this.field_16191.get(var1)).field_21660 = var2;
   }

   public int[] method_14916() {
      int[] var3 = new int[this.field_16191.size()];

      for (int var4 = 0; var4 < this.field_16191.size(); var4++) {
         var3[var4] = this.method_14896(var4);
      }

      return var3;
   }

   @Override
   public String toString() {
      String var3 = "[Animation (" + this.field_16191.size() + ") ";

      for (int var4 = 0; var4 < this.field_16191.size(); var4++) {
         class_4443 var5 = (class_4443)this.field_16191.get(var4);
         var3 = var3 + var5.field_21660 + ",";
      }

      return var3 + "]";
   }

   public class_3270 method_14921() {
      class_3270 var3 = new class_3270();
      var3.field_16196 = this.field_16196;
      var3.field_16191 = this.field_16191;
      var3.field_16203 = this.field_16203;
      var3.field_16200 = this.field_16200;
      var3.field_16202 = this.field_16202;
      var3.field_16192 = this.field_16192;
      var3.field_16199 = this.field_16199;
      return var3;
   }
}
