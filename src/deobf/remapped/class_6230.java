package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class class_6230 {
   private final class_3139 field_31810;
   private final class_6230 field_31805;
   private final class_6230 field_31815;
   private final int field_31814;
   private final List<class_6230> field_31811 = Lists.newArrayList();
   private class_6230 field_31808;
   private class_6230 field_31812;
   private int field_31806;
   private float field_31816;
   private float field_31807;
   private float field_31804;
   private float field_31813;

   public class_6230(class_3139 var1, class_6230 var2, class_6230 var3, int var4, int var5) {
      if (var1.method_14511() == null) {
         throw new IllegalArgumentException("Can't position an invisible advancement!");
      } else {
         this.field_31810 = var1;
         this.field_31805 = var2;
         this.field_31815 = var3;
         this.field_31814 = var4;
         this.field_31808 = this;
         this.field_31806 = var5;
         this.field_31816 = -1.0F;
         class_6230 var8 = null;

         for (class_3139 var10 : var1.method_14516()) {
            var8 = this.method_28465(var10, var8);
         }
      }
   }

   @Nullable
   private class_6230 method_28465(class_3139 var1, class_6230 var2) {
      if (var1.method_14511() == null) {
         for (class_3139 var6 : var1.method_14516()) {
            var2 = this.method_28465(var6, var2);
         }
      } else {
         var2 = new class_6230(var1, this, var2, this.field_31811.size() + 1, this.field_31806 + 1);
         this.field_31811.add(var2);
      }

      return var2;
   }

   private void method_28466() {
      if (!this.field_31811.isEmpty()) {
         class_6230 var3 = null;

         for (class_6230 var5 : this.field_31811) {
            var5.method_28466();
            var3 = var5.method_28471(var3 != null ? var3 : var5);
         }

         this.method_28473();
         float var6 = (this.field_31811.get(0).field_31816 + this.field_31811.get(this.field_31811.size() - 1).field_31816) / 2.0F;
         if (this.field_31815 == null) {
            this.field_31816 = var6;
         } else {
            this.field_31816 = this.field_31815.field_31816 + 1.0F;
            this.field_31807 = this.field_31816 - var6;
         }
      } else if (this.field_31815 == null) {
         this.field_31816 = 0.0F;
      } else {
         this.field_31816 = this.field_31815.field_31816 + 1.0F;
      }
   }

   private float method_28464(float var1, int var2, float var3) {
      this.field_31816 += var1;
      this.field_31806 = var2;
      if (this.field_31816 < var3) {
         var3 = this.field_31816;
      }

      for (class_6230 var7 : this.field_31811) {
         var3 = var7.method_28464(var1 + this.field_31807, var2 + 1, var3);
      }

      return var3;
   }

   private void method_28468(float var1) {
      this.field_31816 += var1;

      for (class_6230 var5 : this.field_31811) {
         var5.method_28468(var1);
      }
   }

   private void method_28473() {
      float var3 = 0.0F;
      float var4 = 0.0F;

      for (int var5 = this.field_31811.size() - 1; var5 >= 0; var5--) {
         class_6230 var6 = this.field_31811.get(var5);
         var6.field_31816 += var3;
         var6.field_31807 += var3;
         var4 += var6.field_31804;
         var3 += var6.field_31813 + var4;
      }
   }

   @Nullable
   private class_6230 method_28474() {
      if (this.field_31812 == null) {
         return this.field_31811.isEmpty() ? null : this.field_31811.get(0);
      } else {
         return this.field_31812;
      }
   }

   @Nullable
   private class_6230 method_28472() {
      if (this.field_31812 == null) {
         return this.field_31811.isEmpty() ? null : this.field_31811.get(this.field_31811.size() - 1);
      } else {
         return this.field_31812;
      }
   }

   private class_6230 method_28471(class_6230 var1) {
      if (this.field_31815 == null) {
         return var1;
      } else {
         class_6230 var4 = this;
         class_6230 var5 = this;
         class_6230 var6 = this.field_31815;
         class_6230 var7 = this.field_31805.field_31811.get(0);
         float var8 = this.field_31807;
         float var9 = this.field_31807;
         float var10 = var6.field_31807;

         float var11;
         for (var11 = var7.field_31807; var6.method_28472() != null && var4.method_28474() != null; var9 += var5.field_31807) {
            var6 = var6.method_28472();
            var4 = var4.method_28474();
            var7 = var7.method_28474();
            var5 = var5.method_28472();
            var5.field_31808 = this;
            float var12 = var6.field_31816 + var10 - (var4.field_31816 + var8) + 1.0F;
            if (var12 > 0.0F) {
               var6.method_28470(this, var1).method_28469(this, var12);
               var8 += var12;
               var9 += var12;
            }

            var10 += var6.field_31807;
            var8 += var4.field_31807;
            var11 += var7.field_31807;
         }

         if (var6.method_28472() != null && var5.method_28472() == null) {
            var5.field_31812 = var6.method_28472();
            var5.field_31807 += var10 - var9;
         } else {
            if (var4.method_28474() != null && var7.method_28474() == null) {
               var7.field_31812 = var4.method_28474();
               var7.field_31807 += var8 - var11;
            }

            var1 = this;
         }

         return var1;
      }
   }

   private void method_28469(class_6230 var1, float var2) {
      float var5 = (float)(var1.field_31814 - this.field_31814);
      if (var5 != 0.0F) {
         var1.field_31804 -= var2 / var5;
         this.field_31804 += var2 / var5;
      }

      var1.field_31813 += var2;
      var1.field_31816 += var2;
      var1.field_31807 += var2;
   }

   private class_6230 method_28470(class_6230 var1, class_6230 var2) {
      return this.field_31808 != null && var1.field_31805.field_31811.contains(this.field_31808) ? this.field_31808 : var2;
   }

   private void method_28476() {
      if (this.field_31810.method_14511() != null) {
         this.field_31810.method_14511().method_35155((float)this.field_31806, this.field_31816);
      }

      if (!this.field_31811.isEmpty()) {
         for (class_6230 var4 : this.field_31811) {
            var4.method_28476();
         }
      }
   }

   public static void method_28467(class_3139 var0) {
      if (var0.method_14511() != null) {
         class_6230 var3 = new class_6230(var0, (class_6230)null, (class_6230)null, 1, 0);
         var3.method_28466();
         float var4 = var3.method_28464(0.0F, 0, var3.field_31816);
         if (var4 < 0.0F) {
            var3.method_28468(-var4);
         }

         var3.method_28476();
      } else {
         throw new IllegalArgumentException("Can't position children of an invisible root!");
      }
   }
}
