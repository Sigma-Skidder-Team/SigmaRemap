package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class Class8874 {
   private final Class7952 field40082;
   private final Class8874 field40083;
   private final Class8874 field40084;
   private final int field40085;
   private final List<Class8874> field40086 = Lists.newArrayList();
   private Class8874 field40087;
   private Class8874 field40088;
   private int field40089;
   private float field40090;
   private float field40091;
   private float field40092;
   private float field40093;

   public Class8874(Class7952 var1, Class8874 var2, Class8874 var3, int var4, int var5) {
      if (var1.method27027() == null) {
         throw new IllegalArgumentException("Can't position an invisible advancement!");
      } else {
         this.field40082 = var1;
         this.field40083 = var2;
         this.field40084 = var3;
         this.field40085 = var4;
         this.field40087 = this;
         this.field40089 = var5;
         this.field40090 = -1.0F;
         Class8874 var8 = null;

         for (Class7952 var10 : var1.method27029()) {
            var8 = this.method32282(var10, var8);
         }
      }
   }

   @Nullable
   private Class8874 method32282(Class7952 var1, Class8874 var2) {
      if (var1.method27027() == null) {
         for (Class7952 var6 : var1.method27029()) {
            var2 = this.method32282(var6, var2);
         }
      } else {
         var2 = new Class8874(var1, this, var2, this.field40086.size() + 1, this.field40089 + 1);
         this.field40086.add(var2);
      }

      return var2;
   }

   private void method32283() {
      if (!this.field40086.isEmpty()) {
         Class8874 var3 = null;

         for (Class8874 var5 : this.field40086) {
            var5.method32283();
            var3 = var5.method32289(var3 != null ? var3 : var5);
         }

         this.method32286();
         float var6 = (this.field40086.get(0).field40090 + this.field40086.get(this.field40086.size() - 1).field40090) / 2.0F;
         if (this.field40084 == null) {
            this.field40090 = var6;
         } else {
            this.field40090 = this.field40084.field40090 + 1.0F;
            this.field40091 = this.field40090 - var6;
         }
      } else if (this.field40084 == null) {
         this.field40090 = 0.0F;
      } else {
         this.field40090 = this.field40084.field40090 + 1.0F;
      }
   }

   private float method32284(float var1, int var2, float var3) {
      this.field40090 += var1;
      this.field40089 = var2;
      if (this.field40090 < var3) {
         var3 = this.field40090;
      }

      for (Class8874 var7 : this.field40086) {
         var3 = var7.method32284(var1 + this.field40091, var2 + 1, var3);
      }

      return var3;
   }

   private void method32285(float var1) {
      this.field40090 += var1;

      for (Class8874 var5 : this.field40086) {
         var5.method32285(var1);
      }
   }

   private void method32286() {
      float var3 = 0.0F;
      float var4 = 0.0F;

      for (int var5 = this.field40086.size() - 1; var5 >= 0; var5--) {
         Class8874 var6 = this.field40086.get(var5);
         var6.field40090 += var3;
         var6.field40091 += var3;
         var4 += var6.field40092;
         var3 += var6.field40093 + var4;
      }
   }

   @Nullable
   private Class8874 method32287() {
      if (this.field40088 == null) {
         return this.field40086.isEmpty() ? null : this.field40086.get(0);
      } else {
         return this.field40088;
      }
   }

   @Nullable
   private Class8874 method32288() {
      if (this.field40088 == null) {
         return this.field40086.isEmpty() ? null : this.field40086.get(this.field40086.size() - 1);
      } else {
         return this.field40088;
      }
   }

   private Class8874 method32289(Class8874 var1) {
      if (this.field40084 == null) {
         return var1;
      } else {
         Class8874 var4 = this;
         Class8874 var5 = this;
         Class8874 var6 = this.field40084;
         Class8874 var7 = this.field40083.field40086.get(0);
         float var8 = this.field40091;
         float var9 = this.field40091;
         float var10 = var6.field40091;

         float var11;
         for (var11 = var7.field40091; var6.method32288() != null && var4.method32287() != null; var9 += var5.field40091) {
            var6 = var6.method32288();
            var4 = var4.method32287();
            var7 = var7.method32287();
            var5 = var5.method32288();
            var5.field40087 = this;
            float var12 = var6.field40090 + var10 - (var4.field40090 + var8) + 1.0F;
            if (var12 > 0.0F) {
               var6.method32291(this, var1).method32290(this, var12);
               var8 += var12;
               var9 += var12;
            }

            var10 += var6.field40091;
            var8 += var4.field40091;
            var11 += var7.field40091;
         }

         if (var6.method32288() != null && var5.method32288() == null) {
            var5.field40088 = var6.method32288();
            var5.field40091 += var10 - var9;
         } else {
            if (var4.method32287() != null && var7.method32287() == null) {
               var7.field40088 = var4.method32287();
               var7.field40091 += var8 - var11;
            }

            var1 = this;
         }

         return var1;
      }
   }

   private void method32290(Class8874 var1, float var2) {
      float var5 = (float)(var1.field40085 - this.field40085);
      if (var5 != 0.0F) {
         var1.field40092 -= var2 / var5;
         this.field40092 += var2 / var5;
      }

      var1.field40093 += var2;
      var1.field40090 += var2;
      var1.field40091 += var2;
   }

   private Class8874 method32291(Class8874 var1, Class8874 var2) {
      return this.field40087 != null && var1.field40083.field40086.contains(this.field40087) ? this.field40087 : var2;
   }

   private void method32292() {
      if (this.field40082.method27027() != null) {
         this.field40082.method27027().method34933((float)this.field40089, this.field40090);
      }

      if (!this.field40086.isEmpty()) {
         for (Class8874 var4 : this.field40086) {
            var4.method32292();
         }
      }
   }

   public static void method32293(Class7952 var0) {
      if (var0.method27027() != null) {
         Class8874 var3 = new Class8874(var0, (Class8874)null, (Class8874)null, 1, 0);
         var3.method32283();
         float var4 = var3.method32284(0.0F, 0, var3.field40090);
         if (var4 < 0.0F) {
            var3.method32285(-var4);
         }

         var3.method32292();
      } else {
         throw new IllegalArgumentException("Can't position children of an invisible root!");
      }
   }
}
