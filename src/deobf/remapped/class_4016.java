package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class class_4016 {
   public static final class_8141 field_19496 = new class_8141();
   public static final class_4016 field_19494 = new class_2737(Lists.newArrayList(), -1, -1, 1, false);
   private final List<class_9417> field_19498;
   private final int field_19499;
   private final int field_19493;
   private final int field_19497;
   private final boolean field_19492;

   public class_4016(List<class_9417> var1, int var2, int var3, int var4, boolean var5) {
      this.field_19498 = var1;
      this.field_19499 = var2;
      this.field_19493 = var3;
      this.field_19497 = var4;
      this.field_19492 = var5;
   }

   private static boolean method_18502(int var0, int var1) {
      return var0 / var1 * var1 == var0;
   }

   public Pair<Integer, Integer> method_18505(int var1, int var2) {
      Pair var5 = this.method_18503(var1, var2);
      int var6 = (Integer)var5.getFirst();
      int var7 = (Integer)var5.getSecond();
      if (method_18502(var1, var6) && method_18502(var2, var7)) {
         return var5;
      } else {
         throw new IllegalArgumentException(String.format("Image size %s,%s is not multiply of frame size %s,%s", var1, var2, var6, var7));
      }
   }

   private Pair<Integer, Integer> method_18503(int var1, int var2) {
      if (this.field_19499 == -1) {
         if (this.field_19493 == -1) {
            int var5 = Math.min(var1, var2);
            return Pair.of(var5, var5);
         } else {
            return Pair.of(var1, this.field_19493);
         }
      } else {
         return this.field_19493 == -1 ? Pair.of(this.field_19499, var2) : Pair.of(this.field_19499, this.field_19493);
      }
   }

   public int method_18509(int var1) {
      return this.field_19493 != -1 ? this.field_19493 : var1;
   }

   public int method_18497(int var1) {
      return this.field_19499 != -1 ? this.field_19499 : var1;
   }

   public int method_18507() {
      return this.field_19498.size();
   }

   public int method_18498() {
      return this.field_19497;
   }

   public boolean method_18501() {
      return this.field_19492;
   }

   private class_9417 method_18499(int var1) {
      return this.field_19498.get(var1);
   }

   public int method_18500(int var1) {
      class_9417 var4 = this.method_18499(var1);
      return !var4.method_43602() ? var4.method_43601() : this.field_19497;
   }

   public int method_18506(int var1) {
      return this.field_19498.get(var1).method_43604();
   }

   public Set<Integer> method_18508() {
      HashSet var3 = Sets.newHashSet();

      for (class_9417 var5 : this.field_19498) {
         var3.add(var5.method_43604());
      }

      return var3;
   }
}
