package remapped;

import java.util.HashSet;
import java.util.Set;

public class class_8670 {
   private static String[] field_44467;
   public class_7047 field_44468;
   public int field_44475;
   public int field_44480 = 0;
   public Float field_44473;
   public Float field_44479 = 0.0F;
   public int field_44471 = 1;
   public int field_44474 = 2500;
   public class_8670 field_44476;
   public class_4748 field_44477 = class_4748.field_23006;
   public class_8104 field_44469 = class_8104.field_41499;
   public Set<Long> field_44472 = new HashSet<Long>();
   public Set<Long> field_44478 = new HashSet<Long>();
   public Set<Long> field_44466 = new HashSet<Long>();
   public Set<Long> field_44470 = new HashSet<Long>();

   public class_8670(class_7047 var1, int var2, Float var3) {
      this.field_44468 = var1;
      this.field_44475 = var2;
      this.field_44473 = var3;
   }

   public class_8670(class_7047 var1) {
      this.field_44468 = var1;
   }

   public class_8670(class_7047 var1, int var2) {
      this.field_44468 = var1;
      this.field_44471 += var2;
   }

   public class_8670(class_7047 var1, int var2, class_4748 var3) {
      this.field_44468 = var1;
      this.field_44471 += var2;
      this.field_44477 = var3;
   }

   public class_8670(class_7047 var1, int var2, class_4748 var3, class_8104 var4) {
      this.field_44468 = var1;
      this.field_44471 += var2;
      this.field_44477 = var3;
      this.field_44469 = var4;
   }

   public class_8670 method_39817(class_7047 var1, boolean var2) {
      long var5 = var1.method_32355().method_6077();
      if (var2) {
         long var7 = var1.method_32355().method_6081().method_6077();
         this.field_44466.add(var7);
         this.field_44472.add(var7);
         this.field_44470.remove(var7);
      }

      this.field_44466.add(var5);
      this.field_44472.add(var5);
      this.field_44470.remove(var5);
      return this;
   }

   public class_8670 method_39816(class_7047 var1) {
      long var4 = var1.method_32355().method_6077();
      this.field_44466.remove(var4);
      this.field_44470.add(var4);
      return this;
   }

   public class_8670 method_39815(class_7047 var1) {
      this.field_44478.add(var1.method_32355().method_6077());
      return this;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_8670 var4 = (class_8670)var1;
            if (this.field_44468.method_32381() != var4.field_44468.method_32381()) {
               return false;
            } else {
               return this.field_44468.method_32375() != var4.field_44468.method_32375()
                  ? false
                  : this.field_44468.method_32382() == var4.field_44468.method_32382();
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = (int)((long)this.field_44468.method_32381() ^ (long)this.field_44468.method_32381() >>> 32);
      var3 = 31 * var3 + (int)((long)this.field_44468.method_32375() ^ (long)this.field_44468.method_32375() >>> 32);
      return 31 * var3 + (int)((long)this.field_44468.method_32382() ^ (long)this.field_44468.method_32382() >>> 32);
   }
}
