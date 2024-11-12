package mapped;

import org.newdawn.slick.util.Log;
import org.newdawn.slick.Color;

import java.util.ArrayList;

public class Class7389 implements Renderable {
   private ArrayList field31629 = new ArrayList();
   private int field31630 = -1;
   private long field31631 = 0L;
   private boolean field31632 = false;
   private long field31633;
   private float field31634 = 1.0F;
   private int field31635 = -2;
   private long field31636;
   private boolean field31637 = true;
   private boolean field31638 = true;
   private int field31639 = 1;
   private boolean field31640;
   private boolean field31641 = true;
   private Class7386 field31642 = null;

   public Class7389() {
      this(true);
   }

   public Class7389(Image[] var1, int var2) {
      this(var1, var2, true);
   }

   public Class7389(Image[] var1, int[] var2) {
      this(var1, var2, true);
   }

   public Class7389(boolean var1) {
      this.field31630 = 0;
      this.field31638 = var1;
   }

   public Class7389(Image[] var1, int var2, boolean var3) {
      for (int var6 = 0; var6 < var1.length; var6++) {
         this.method23580(var1[var6], var2);
      }

      this.field31630 = 0;
      this.field31638 = var3;
   }

   public Class7389(Image[] var1, int[] var2, boolean var3) {
      this.field31638 = var3;
      if (var1.length != var2.length) {
         throw new RuntimeException("There must be one duration per frame");
      } else {
         for (int var6 = 0; var6 < var1.length; var6++) {
            this.method23580(var1[var6], var2[var6]);
         }

         this.field31630 = 0;
      }
   }

   public Class7389(Class7386 var1, int var2) {
      this(var1, 0, 0, var1.method23505() - 1, var1.method23506() - 1, true, var2, true);
   }

   public Class7389(Class7386 var1, int var2, int var3, int var4, int var5, boolean var6, int var7, boolean var8) {
      this.field31638 = var8;
      if (var6) {
         for (int var11 = var3; var11 <= var5; var11++) {
            for (int var12 = var2; var12 <= var4; var12++) {
               this.method23580(var1.method23504(var12, var11), var7);
            }
         }
      } else {
         for (int var13 = var2; var13 <= var4; var13++) {
            for (int var14 = var3; var14 <= var5; var14++) {
               this.method23580(var1.method23504(var13, var14), var7);
            }
         }
      }
   }

   public Class7389(Class7386 var1, int[] var2, int[] var3) {
      this.field31642 = var1;
      int var6 = -1;
      int var7 = -1;

      for (int var8 = 0; var8 < var2.length / 2; var8++) {
         var6 = var2[var8 * 2];
         var7 = var2[var8 * 2 + 1];
         this.method23571(var3[var8], var6, var7);
      }
   }

   public void method23571(int var1, int var2, int var3) {
      if (var1 != 0) {
         if (this.field31629.isEmpty()) {
            this.field31631 = (long)((int)((float)var1 / this.field31634));
         }

         this.field31629.add(new Class8385(this, var1, var2, var3));
         this.field31630 = 0;
      } else {
         Log.error("Invalid duration: " + var1);
         throw new RuntimeException("Invalid duration: " + var1);
      }
   }

   public void method23572(boolean var1) {
      this.field31638 = var1;
   }

   public void method23573(boolean var1) {
      this.field31640 = var1;
   }

   public boolean method23574() {
      return this.field31632;
   }

   public void method23575(float var1) {
      if (var1 > 0.0F) {
         this.field31631 = (long)((float)this.field31631 * this.field31634 / var1);
         this.field31634 = var1;
      }
   }

   public float method23576() {
      return this.field31634;
   }

   public void method23577() {
      if (this.field31629.size() != 0) {
         this.field31633 = this.field31631;
         this.field31632 = true;
      }
   }

   public void method23578() {
      if (this.field31632) {
         if (this.field31629.size() != 0) {
            this.field31632 = false;
            this.field31631 = this.field31633;
         }
      }
   }

   public void method23579() {
      if (this.field31629.size() != 0) {
         this.field31632 = false;
         this.field31630 = 0;
         this.field31631 = (long)((int)((float)((Class8385)this.field31629.get(0)).field35960 / this.field31634));
         this.field31637 = true;
         this.field31636 = 0L;
      }
   }

   public void method23580(Image var1, int var2) {
      if (var2 != 0) {
         if (this.field31629.isEmpty()) {
            this.field31631 = (long)((int)((float)var2 / this.field31634));
         }

         this.field31629.add(new Class8385(this, var1, var2));
         this.field31630 = 0;
      } else {
         Log.error("Invalid duration: " + var2);
         throw new RuntimeException("Invalid duration: " + var2);
      }
   }

   public void method23525() {
      this.method23527(0.0F, 0.0F);
   }

   @Override
   public void method23527(float var1, float var2) {
      this.method23536(var1, var2, (float)this.method23582(), (float)this.method23583());
   }

   public void method23528(float var1, float var2, Color var3) {
      this.method23539(var1, var2, (float)this.method23582(), (float)this.method23583(), var3);
   }

   public void method23536(float var1, float var2, float var3, float var4) {
      this.method23539(var1, var2, var3, var4, Color.white);
   }

   public void method23539(float var1, float var2, float var3, float var4, Color var5) {
      if (this.field31629.size() != 0) {
         if (this.field31638) {
            long var9 = this.method23595();
            long var11 = var9 - this.field31636;
            if (this.field31637) {
               var11 = 0L;
               this.field31637 = false;
            }

            this.field31636 = var9;
            this.method23593(var11);
         }

         Class8385 var8 = (Class8385)this.field31629.get(this.field31630);
         var8.field35959.method23539(var1, var2, var3, var4, var5);
      }
   }

   public void method23581(int var1, int var2) {
      if (this.field31629.size() != 0) {
         if (this.field31638) {
            long var6 = this.method23595();
            long var8 = var6 - this.field31636;
            if (this.field31637) {
               var8 = 0L;
               this.field31637 = false;
            }

            this.field31636 = var6;
            this.method23593(var8);
         }

         Class8385 var5 = (Class8385)this.field31629.get(this.field31630);
         this.field31642.method23507(var1, var2, var5.field35961, var5.field35962);
      }
   }

   public int method23582() {
      return ((Class8385)this.field31629.get(this.field31630)).field35959.method23558();
   }

   public int method23583() {
      return ((Class8385)this.field31629.get(this.field31630)).field35959.method23559();
   }

   public void method23584(float var1, float var2, float var3, float var4) {
      this.method23585(var1, var2, var3, var4, Color.white);
   }

   public void method23585(float var1, float var2, float var3, float var4, Color var5) {
      if (this.field31629.size() != 0) {
         if (this.field31638) {
            long var9 = this.method23595();
            long var11 = var9 - this.field31636;
            if (this.field31637) {
               var11 = 0L;
               this.field31637 = false;
            }

            this.field31636 = var9;
            this.method23593(var11);
         }

         Class8385 var8 = (Class8385)this.field31629.get(this.field31630);
         var8.field35959.method23544(var1, var2, var3, var4, var5);
      }
   }

   /** @deprecated */
   public void method23586() {
      if (this.field31638) {
         long var3 = this.method23595();
         long var5 = var3 - this.field31636;
         if (this.field31637) {
            var5 = 0L;
            this.field31637 = false;
         }

         this.field31636 = var3;
         this.method23593(var5);
      }
   }

   public void method23587(long var1) {
      this.method23593(var1);
   }

   public int method23588() {
      return this.field31630;
   }

   public void method23589(int var1) {
      this.field31630 = var1;
   }

   public Image method23590(int var1) {
      Class8385 var4 = (Class8385)this.field31629.get(var1);
      return var4.field35959;
   }

   public int method23591() {
      return this.field31629.size();
   }

   public Image method23592() {
      Class8385 var3 = (Class8385)this.field31629.get(this.field31630);
      return var3.field35959;
   }

   private void method23593(long var1) {
      if (!this.field31632) {
         if (this.field31629.size() != 0) {
            this.field31631 -= var1;

            while (this.field31631 < 0L && !this.field31632) {
               if (this.field31630 == this.field31635) {
                  this.field31632 = true;
                  break;
               }

               if (this.field31630 == this.field31629.size() - 1 && !this.field31641 && !this.field31640) {
                  this.field31632 = true;
                  break;
               }

               this.field31630 = (this.field31630 + this.field31639) % this.field31629.size();
               if (this.field31640) {
                  if (this.field31630 > 0) {
                     if (this.field31630 >= this.field31629.size() - 1) {
                        this.field31630 = this.field31629.size() - 1;
                        this.field31639 = -1;
                     }
                  } else {
                     this.field31630 = 0;
                     this.field31639 = 1;
                     if (!this.field31641) {
                        this.field31632 = true;
                        break;
                     }
                  }
               }

               int var5 = (int)((float)((Class8385)this.field31629.get(this.field31630)).field35960 / this.field31634);
               this.field31631 += (long)var5;
            }
         }
      }
   }

   public void method23594(boolean var1) {
      this.field31641 = var1;
   }

   private long method23595() {
      return 0L;
   }

   public void method23596(int var1) {
      this.field31635 = var1;
   }

   public int method23597(int var1) {
      return ((Class8385)this.field31629.get(var1)).field35960;
   }

   public void method23598(int var1, int var2) {
      ((Class8385)this.field31629.get(var1)).field35960 = var2;
   }

   public int[] method23599() {
      int[] var3 = new int[this.field31629.size()];

      for (int var4 = 0; var4 < this.field31629.size(); var4++) {
         var3[var4] = this.method23597(var4);
      }

      return var3;
   }

   @Override
   public String toString() {
      String var3 = "[Animation (" + this.field31629.size() + ") ";

      for (int var4 = 0; var4 < this.field31629.size(); var4++) {
         Class8385 var5 = (Class8385)this.field31629.get(var4);
         var3 = var3 + var5.field35960 + ",";
      }

      return var3 + "]";
   }

   public Class7389 method23600() {
      Class7389 var3 = new Class7389();
      var3.field31642 = this.field31642;
      var3.field31629 = this.field31629;
      var3.field31638 = this.field31638;
      var3.field31639 = this.field31639;
      var3.field31641 = this.field31641;
      var3.field31640 = this.field31640;
      var3.field31634 = this.field31634;
      return var3;
   }

   // $VF: synthetic method
   public static Class7386 method23601(Class7389 var0) {
      return var0.field31642;
   }
}
