package remapped;

import com.google.common.collect.ComparisonChain;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2250 implements Comparable<class_2250> {
   private static final Logger field_11189 = LogManager.getLogger();
   private final class_1425 field_11187;
   private int field_11188;
   private int field_11193;
   private boolean field_11195;
   private boolean field_11191;
   private boolean field_11194;
   private boolean field_11190;
   private boolean field_11186;
   private class_2250 field_11196;

   public class_2250(class_1425 var1) {
      this(var1, 0, 0);
   }

   public class_2250(class_1425 var1, int var2) {
      this(var1, var2, 0);
   }

   public class_2250(class_1425 var1, int var2, int var3) {
      this(var1, var2, var3, false, true);
   }

   public class_2250(class_1425 var1, int var2, int var3, boolean var4, boolean var5) {
      this(var1, var2, var3, var4, var5, var5);
   }

   public class_2250(class_1425 var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, (class_2250)null);
   }

   public class_2250(class_1425 var1, int var2, int var3, boolean var4, boolean var5, boolean var6, class_2250 var7) {
      this.field_11187 = var1;
      this.field_11188 = var2;
      this.field_11193 = var3;
      this.field_11191 = var4;
      this.field_11190 = var5;
      this.field_11186 = var6;
      this.field_11196 = var7;
   }

   public class_2250(class_2250 var1) {
      this.field_11187 = var1.field_11187;
      this.method_10348(var1);
   }

   public void method_10348(class_2250 var1) {
      this.field_11188 = var1.field_11188;
      this.field_11193 = var1.field_11193;
      this.field_11191 = var1.field_11191;
      this.field_11190 = var1.field_11190;
      this.field_11186 = var1.field_11186;
   }

   public boolean method_10331(class_2250 var1) {
      if (this.field_11187 != var1.field_11187) {
         field_11189.warn("This method should only be called for matching effects!");
      }

      boolean var4 = false;
      if (var1.field_11193 <= this.field_11193) {
         if (var1.field_11188 > this.field_11188) {
            if (var1.field_11193 != this.field_11193) {
               if (this.field_11196 != null) {
                  this.field_11196.method_10331(var1);
               } else {
                  this.field_11196 = new class_2250(var1);
               }
            } else {
               this.field_11188 = var1.field_11188;
               var4 = true;
            }
         }
      } else {
         if (var1.field_11188 < this.field_11188) {
            class_2250 var5 = this.field_11196;
            this.field_11196 = new class_2250(this);
            this.field_11196.field_11196 = var5;
         }

         this.field_11193 = var1.field_11193;
         this.field_11188 = var1.field_11188;
         var4 = true;
      }

      if (!var1.field_11191 && this.field_11191 || var4) {
         this.field_11191 = var1.field_11191;
         var4 = true;
      }

      if (var1.field_11190 != this.field_11190) {
         this.field_11190 = var1.field_11190;
         var4 = true;
      }

      if (var1.field_11186 != this.field_11186) {
         this.field_11186 = var1.field_11186;
         var4 = true;
      }

      return var4;
   }

   public class_1425 method_10339() {
      return this.field_11187;
   }

   public int method_10347() {
      return this.field_11188;
   }

   public int method_10333() {
      return this.field_11193;
   }

   public boolean method_10338() {
      return this.field_11191;
   }

   public boolean method_10336() {
      return this.field_11190;
   }

   public boolean method_10342() {
      return this.field_11186;
   }

   public boolean method_10341(class_5834 var1, Runnable var2) {
      if (this.field_11188 > 0) {
         if (this.field_11187.method_6549(this.field_11188, this.field_11193)) {
            this.method_10349(var1);
         }

         this.method_10332();
         if (this.field_11188 == 0 && this.field_11196 != null) {
            this.method_10348(this.field_11196);
            this.field_11196 = this.field_11196.field_11196;
            var2.run();
         }
      }

      return this.field_11188 > 0;
   }

   private int method_10332() {
      if (this.field_11196 != null) {
         this.field_11196.method_10332();
      }

      return --this.field_11188;
   }

   public void method_10349(class_5834 var1) {
      if (this.field_11188 > 0) {
         this.field_11187.method_6537(var1, this.field_11193);
      }
   }

   public String method_10340() {
      return this.field_11187.method_6540();
   }

   @Override
   public String toString() {
      String var3;
      if (this.field_11193 <= 0) {
         var3 = this.method_10340() + ", Duration: " + this.field_11188;
      } else {
         var3 = this.method_10340() + " x " + (this.field_11193 + 1) + ", Duration: " + this.field_11188;
      }

      if (this.field_11195) {
         var3 = var3 + ", Splash: true";
      }

      if (!this.field_11190) {
         var3 = var3 + ", Particles: false";
      }

      if (!this.field_11186) {
         var3 = var3 + ", Show Icon: false";
      }

      return var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof class_2250)) {
            return false;
         } else {
            class_2250 var4 = (class_2250)var1;
            return this.field_11188 == var4.field_11188
               && this.field_11193 == var4.field_11193
               && this.field_11195 == var4.field_11195
               && this.field_11191 == var4.field_11191
               && this.field_11187.equals(var4.field_11187);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_11187.hashCode();
      var3 = 31 * var3 + this.field_11188;
      var3 = 31 * var3 + this.field_11193;
      var3 = 31 * var3 + (!this.field_11195 ? 0 : 1);
      return 31 * var3 + (!this.field_11191 ? 0 : 1);
   }

   public class_5734 method_10345(class_5734 var1) {
      var1.method_25921("Id", (byte)class_1425.method_6536(this.method_10339()));
      this.method_10344(var1);
      return var1;
   }

   private void method_10344(class_5734 var1) {
      var1.method_25921("Amplifier", (byte)this.method_10333());
      var1.method_25931("Duration", this.method_10347());
      var1.method_25934("Ambient", this.method_10338());
      var1.method_25934("ShowParticles", this.method_10336());
      var1.method_25934("ShowIcon", this.method_10342());
      if (this.field_11196 != null) {
         class_5734 var4 = new class_5734();
         this.field_11196.method_10345(var4);
         var1.method_25946("HiddenEffect", var4);
      }
   }

   public static class_2250 method_10343(class_5734 var0) {
      byte var3 = var0.method_25950("Id");
      class_1425 var4 = class_1425.method_6538(var3);
      return var4 != null ? method_10334(var4, var0) : null;
   }

   private static class_2250 method_10334(class_1425 var0, class_5734 var1) {
      byte var4 = var1.method_25950("Amplifier");
      int var5 = var1.method_25947("Duration");
      boolean var6 = var1.method_25933("Ambient");
      boolean var7 = true;
      if (var1.method_25939("ShowParticles", 1)) {
         var7 = var1.method_25933("ShowParticles");
      }

      boolean var8 = var7;
      if (var1.method_25939("ShowIcon", 1)) {
         var8 = var1.method_25933("ShowIcon");
      }

      class_2250 var9 = null;
      if (var1.method_25939("HiddenEffect", 10)) {
         var9 = method_10334(var0, var1.method_25937("HiddenEffect"));
      }

      return new class_2250(var0, var5, var4 >= 0 ? var4 : 0, var6, var7, var8, var9);
   }

   public void method_10335(boolean var1) {
      this.field_11194 = var1;
   }

   public boolean method_10337() {
      return this.field_11194;
   }

   public int compareTo(class_2250 var1) {
      short var4 = 32147;
      return this.method_10347() > 32147 && var1.method_10347() > 32147 || this.method_10338() && var1.method_10338()
         ? ComparisonChain.start()
            .compare(this.method_10338(), var1.method_10338())
            .compare(this.method_10339().method_6544(), var1.method_10339().method_6544())
            .result()
         : ComparisonChain.start()
            .compare(this.method_10338(), var1.method_10338())
            .compare(this.method_10347(), var1.method_10347())
            .compare(this.method_10339().method_6544(), var1.method_10339().method_6544())
            .result();
   }
}
