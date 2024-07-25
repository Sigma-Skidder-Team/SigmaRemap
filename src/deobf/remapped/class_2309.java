package remapped;

import java.util.Arrays;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;

public abstract class class_2309<M extends class_8666<M>, S extends class_3808<M>> extends class_6057 implements class_9840 {
   private static final class_240[] field_11558 = class_240.values();
   public final class_5002 field_11553;
   public final class_2957 field_11556;
   public final S field_11554;
   private boolean field_11552;
   public final class_2921 field_11557 = new class_2921();
   private final long[] field_11555 = new long[2];
   private final class_6163[] field_11559 = new class_6163[2];

   public class_2309(class_5002 var1, class_2957 var2, S var3) {
      super(16, 256, 8192);
      this.field_11553 = var1;
      this.field_11556 = var2;
      this.field_11554 = (S)var3;
      this.method_10623();
   }

   @Override
   public void method_27702(long var1) {
      this.field_11554.method_17732();
      if (this.field_11554.method_17749(class_6979.method_31903(var1))) {
         super.method_27702(var1);
      }
   }

   @Nullable
   private class_6163 method_10625(int var1, int var2) {
      long var5 = class_2034.method_9540(var1, var2);

      for (int var7 = 0; var7 < 2; var7++) {
         if (var5 == this.field_11555[var7]) {
            return this.field_11559[var7];
         }
      }

      class_6163 var9 = this.field_11553.method_23025(var1, var2);

      for (int var8 = 1; var8 > 0; var8--) {
         this.field_11555[var8] = this.field_11555[var8 - 1];
         this.field_11559[var8] = this.field_11559[var8 - 1];
      }

      this.field_11555[0] = var5;
      this.field_11559[0] = var9;
      return var9;
   }

   private void method_10623() {
      Arrays.fill(this.field_11555, class_2034.field_10326);
      Arrays.fill(this.field_11559, null);
   }

   public class_2522 method_10615(long var1, MutableInt var3) {
      if (var1 != Long.MAX_VALUE) {
         int var6 = class_6979.method_31915(class_1331.method_6080(var1));
         int var7 = class_6979.method_31915(class_1331.method_6092(var1));
         class_6163 var8 = this.method_10625(var6, var7);
         if (var8 == null) {
            if (var3 != null) {
               var3.setValue(16);
            }

            return class_4783.field_23433.method_29260();
         } else {
            this.field_11557.method_13363(var1);
            class_2522 var9 = var8.method_28262(this.field_11557);
            boolean var10 = var9.method_8302() && var9.method_8358();
            if (var3 != null) {
               var3.setValue(var9.method_8320(this.field_11553.method_23027(), this.field_11557));
            }

            return !var10 ? class_4783.field_23184.method_29260() : var9;
         }
      } else {
         if (var3 != null) {
            var3.setValue(0);
         }

         return class_4783.field_23184.method_29260();
      }
   }

   public class_4190 method_10614(class_2522 var1, long var2, class_240 var4) {
      return !var1.method_8302() ? class_3370.method_15536() : var1.method_8346(this.field_11553.method_23027(), this.field_11557.method_13363(var2), var4);
   }

   public static int method_10626(class_6163 var0, class_2522 var1, class_1331 var2, class_2522 var3, class_1331 var4, class_240 var5, int var6) {
      boolean var9 = var1.method_8302() && var1.method_8358();
      boolean var10 = var3.method_8302() && var3.method_8358();
      if (!var9 && !var10) {
         return var6;
      } else {
         class_4190 var11 = !var9 ? class_3370.method_15536() : var1.method_8377(var0, var2);
         class_4190 var12 = !var10 ? class_3370.method_15536() : var3.method_8377(var0, var4);
         return !class_3370.method_15525(var11, var12, var5) ? var6 : 16;
      }
   }

   @Override
   public boolean method_27692(long var1) {
      return var1 == Long.MAX_VALUE;
   }

   @Override
   public int method_27695(long var1, long var3, int var5) {
      return 0;
   }

   @Override
   public int method_27698(long var1) {
      return var1 != Long.MAX_VALUE ? 15 - this.field_11554.method_17733(var1) : 0;
   }

   public int method_10617(class_1201 var1, long var2) {
      return 15
         - var1.method_5314(
            class_6979.method_31913(class_1331.method_6080(var2)),
            class_6979.method_31913(class_1331.method_6067(var2)),
            class_6979.method_31913(class_1331.method_6092(var2))
         );
   }

   @Override
   public void method_27689(long var1, int var3) {
      this.field_11554.method_17742(var1, Math.min(15, 15 - var3));
   }

   @Override
   public int method_27700(long var1, long var3, int var5) {
      return 0;
   }

   public boolean method_10621() {
      return this.method_27685() || this.field_11554.method_27685() || this.field_11554.method_17740();
   }

   public int method_10622(int var1, boolean var2, boolean var3) {
      if (!this.field_11552) {
         if (this.field_11554.method_27685()) {
            var1 = this.field_11554.method_27693(var1);
            if (var1 == 0) {
               return var1;
            }
         }

         this.field_11554.method_17747(this, var2, var3);
      }

      this.field_11552 = true;
      if (this.method_27685()) {
         var1 = this.method_27693(var1);
         this.method_10623();
         if (var1 == 0) {
            return var1;
         }
      }

      this.field_11552 = false;
      this.field_11554.method_17735();
      return var1;
   }

   public void method_10627(long var1, class_1201 var3, boolean var4) {
      this.field_11554.method_17731(var1, var3, var4);
   }

   @Nullable
   @Override
   public class_1201 method_45336(class_6979 var1) {
      return this.field_11554.method_17743(var1.method_31925());
   }

   @Override
   public int method_45335(class_1331 var1) {
      return this.field_11554.method_17737(var1.method_6077());
   }

   public String method_10620(long var1) {
      return "" + this.field_11554.method_27698(var1);
   }

   public void method_10616(class_1331 var1) {
      long var4 = var1.method_6077();
      this.method_27702(var4);

      for (class_240 var9 : field_11558) {
         this.method_27702(class_1331.method_6097(var4, var9));
      }
   }

   public void method_10624(class_1331 var1, int var2) {
   }

   @Override
   public void method_34830(class_6979 var1, boolean var2) {
      this.field_11554.method_17734(var1.method_31925(), var2);
   }

   public void method_10618(class_2034 var1, boolean var2) {
      long var5 = class_6979.method_31910(class_6979.method_31926(var1.field_10328, 0, var1.field_10327));
      this.field_11554.method_17738(var5, var2);
   }

   public void method_10619(class_2034 var1, boolean var2) {
      long var5 = class_6979.method_31910(class_6979.method_31926(var1.field_10328, 0, var1.field_10327));
      this.field_11554.method_17748(var5, var2);
   }
}
