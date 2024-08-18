package remapped;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class class_6650 {
   private static String[] field_34412;
   private final class_7772 field_34414;
   private final Entity field_34409;
   private final int field_34413;
   private class_6979 field_34411;
   private final Set<class_9359> field_34410;

   public class_6650(class_916 var1, Entity var2, int var3, int var4, boolean var5) {
      this.field_34408 = var1;
      this.field_34410 = Sets.newHashSet();
      this.field_34414 = new class_7772(class_916.method_4025(var1), var2, var4, var5, this::method_30548);
      this.field_34409 = var2;
      this.field_34413 = var3;
      this.field_34411 = class_6979.method_31923(var2);
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof class_6650) ? false : ((class_6650)var1).field_34409.method_37145() == this.field_34409.method_37145();
   }

   @Override
   public int hashCode() {
      return this.field_34409.method_37145();
   }

   public void method_30548(Packet<?> var1) {
      for (class_9359 var5 : this.field_34410) {
         var5.field_47794.method_4156(var1);
      }
   }

   public void method_30551(Packet<?> var1) {
      this.method_30548(var1);
      if (this.field_34409 instanceof class_9359) {
         ((class_9359)this.field_34409).field_47794.method_4156(var1);
      }
   }

   public void method_30553() {
      for (class_9359 var4 : this.field_34410) {
         this.field_34414.method_35262(var4);
      }
   }

   public void method_30558(class_9359 var1) {
      if (this.field_34410.remove(var1)) {
         this.field_34414.method_35262(var1);
      }
   }

   public void method_30550(class_9359 var1) {
      if (var1 != this.field_34409) {
         Vector3d var4 = var1.method_37245().method_6194(this.field_34414.method_35255());
         int var5 = Math.min(this.method_30556(), (class_916.method_4026(this.field_34408) - 1) * 16);
         boolean var6 = var4.field_7336 >= (double)(-var5)
            && var4.field_7336 <= (double)var5
            && var4.field_7334 >= (double)(-var5)
            && var4.field_7334 <= (double)var5
            && this.field_34409.method_37209(var1);
         if (!var6) {
            if (this.field_34410.remove(var1)) {
               this.field_34414.method_35262(var1);
            }
         } else {
            boolean var7 = this.field_34409.forceSpawn;
            if (!var7) {
               class_2034 var8 = new class_2034(this.field_34409.field_41742, this.field_34409.field_41714);
               class_5344 var9 = this.field_34408.method_4023(var8.method_9539());
               if (var9 != null && var9.method_24349() != null) {
                  var7 = class_916.method_4020(var8, var1, false) <= class_916.method_4026(this.field_34408);
               }
            }

            if (var7 && this.field_34410.add(var1)) {
               this.field_34414.method_35258(var1);
            }
         }
      }
   }

   private int method_30546(int var1) {
      return class_916.method_4025(this.field_34408).method_29522().method_1638(var1);
   }

   private int method_30556() {
      Collection var3 = this.field_34409.method_37379();
      int var4 = this.field_34413;

      for (Entity var6 : var3) {
         int var7 = var6.getType().method_30462() * 16;
         if (var7 > var4) {
            var4 = var7;
         }
      }

      return this.method_30546(var4);
   }

   public void method_30549(List<class_9359> var1) {
      for (class_9359 var5 : var1) {
         this.method_30550(var5);
      }
   }
}
