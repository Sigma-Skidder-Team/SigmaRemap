package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import java.util.Comparator;
import java.util.Random;

public abstract class class_8403 extends class_3133<class_5194> {
   private long field_42989;
   private ImmutableMap<class_2522, class_2439> field_42988 = ImmutableMap.of();
   private ImmutableMap<class_2522, class_2439> field_42991 = ImmutableMap.of();
   private class_2439 field_42990;

   public class_8403(Codec<class_5194> var1) {
      super(var1);
   }

   public void method_38699(
      Random var1,
      class_5990 var2,
      class_6325 var3,
      int var4,
      int var5,
      int var6,
      double var7,
      class_2522 var9,
      class_2522 var10,
      int var11,
      long var12,
      class_5194 var14
   ) {
      int var17 = var11 + 1;
      int var18 = var4 & 15;
      int var19 = var5 & 15;
      int var20 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      int var21 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      double var22 = 0.03125;
      boolean var24 = this.field_42990.method_11112((double)var4 * 0.03125, 109.0, (double)var5 * 0.03125) * 75.0 + var1.nextDouble() > 0.0;
      class_2522 var25 = (class_2522)this.field_42991
         .entrySet()
         .stream()
         .max(Comparator.comparing(var3x -> ((class_2439)var3x.getValue()).method_11112((double)var4, (double)var11, (double)var5)))
         .get()
         .getKey();
      class_2522 var26 = (class_2522)this.field_42988
         .entrySet()
         .stream()
         .max(Comparator.comparing(var3x -> ((class_2439)var3x.getValue()).method_11112((double)var4, (double)var11, (double)var5)))
         .get()
         .getKey();
      class_2921 var27 = new class_2921();
      class_2522 var28 = var2.method_28262(var27.method_13362(var18, 128, var19));

      for (int var29 = 127; var29 >= 0; var29--) {
         var27.method_13362(var18, var29, var19);
         class_2522 var30 = var2.method_28262(var27);
         if (var28.method_8350(var9.method_8360()) && (var30.method_8345() || var30 == var10)) {
            for (int var31 = 0; var31 < var20; var31++) {
               var27.method_13368(Direction.field_817);
               if (!var2.method_28262(var27).method_8350(var9.method_8360())) {
                  break;
               }

               var2.method_27348(var27, var25, false);
            }

            var27.method_13362(var18, var29, var19);
         }

         if ((var28.method_8345() || var28 == var10) && var30.method_8350(var9.method_8360())) {
            for (int var32 = 0; var32 < var21 && var2.method_28262(var27).method_8350(var9.method_8360()); var32++) {
               if (var24 && var29 >= var17 - 4 && var29 <= var17 + 1) {
                  var2.method_27348(var27, this.method_38697(), false);
               } else {
                  var2.method_27348(var27, var26, false);
               }

               var27.method_13368(Direction.field_802);
            }
         }

         var28 = var30;
      }
   }

   @Override
   public void method_14499(long var1) {
      if (this.field_42989 != var1 || this.field_42990 == null || this.field_42988.isEmpty() || this.field_42991.isEmpty()) {
         this.field_42988 = method_38698(this.method_38696(), var1);
         this.field_42991 = method_38698(this.method_38695(), var1 + (long)this.field_42988.size());
         this.field_42990 = new class_2439(new class_8679(var1 + (long)this.field_42988.size() + (long)this.field_42991.size()), ImmutableList.of(0));
      }

      this.field_42989 = var1;
   }

   private static ImmutableMap<class_2522, class_2439> method_38698(ImmutableList<class_2522> var0, long var1) {
      Builder var5 = new Builder();
      UnmodifiableIterator var6 = var0.iterator();

      while (var6.hasNext()) {
         class_2522 var7 = (class_2522)var6.next();
         var5.put(var7, new class_2439(new class_8679(var1), ImmutableList.of(-4)));
         var1++;
      }

      return var5.build();
   }

   public abstract ImmutableList<class_2522> method_38696();

   public abstract ImmutableList<class_2522> method_38695();

   public abstract class_2522 method_38697();
}
