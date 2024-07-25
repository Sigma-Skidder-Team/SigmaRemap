package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;

public class class_5054 {
   private final int field_26123;
   private final int field_26127;
   private final int field_26126;
   private final int field_26125;
   private List<class_5054> field_26121;
   private class_678 field_26122;

   public class_5054(int var1, int var2, int var3, int var4) {
      this.field_26123 = var1;
      this.field_26127 = var2;
      this.field_26126 = var3;
      this.field_26125 = var4;
   }

   public class_678 method_23291() {
      return this.field_26122;
   }

   public int method_23289() {
      return this.field_26123;
   }

   public int method_23288() {
      return this.field_26127;
   }

   public boolean method_23292(class_678 var1) {
      if (this.field_26122 != null) {
         return false;
      } else {
         int var4 = var1.field_3744;
         int var5 = var1.field_3742;
         if (var4 > this.field_26126 || var5 > this.field_26125) {
            return false;
         } else if (var4 == this.field_26126 && var5 == this.field_26125) {
            this.field_26122 = var1;
            return true;
         } else {
            if (this.field_26121 == null) {
               this.field_26121 = Lists.newArrayListWithCapacity(1);
               this.field_26121.add(new class_5054(this.field_26123, this.field_26127, var4, var5));
               int var6 = this.field_26126 - var4;
               int var7 = this.field_26125 - var5;
               if (var7 > 0 && var6 > 0) {
                  int var8 = Math.max(this.field_26125, var6);
                  int var9 = Math.max(this.field_26126, var7);
                  if (var8 < var9) {
                     this.field_26121.add(new class_5054(this.field_26123 + var4, this.field_26127, var6, var5));
                     this.field_26121.add(new class_5054(this.field_26123, this.field_26127 + var5, this.field_26126, var7));
                  } else {
                     this.field_26121.add(new class_5054(this.field_26123, this.field_26127 + var5, var4, var7));
                     this.field_26121.add(new class_5054(this.field_26123 + var4, this.field_26127, var6, this.field_26125));
                  }
               } else if (var6 != 0) {
                  if (var7 == 0) {
                     this.field_26121.add(new class_5054(this.field_26123 + var4, this.field_26127, var6, var5));
                  }
               } else {
                  this.field_26121.add(new class_5054(this.field_26123, this.field_26127 + var5, var4, var7));
               }
            }

            for (class_5054 var11 : this.field_26121) {
               if (var11.method_23292(var1)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public void method_23290(Consumer<class_5054> var1) {
      if (this.field_26122 == null) {
         if (this.field_26121 != null) {
            for (class_5054 var5 : this.field_26121) {
               var5.method_23290(var1);
            }
         }
      } else {
         var1.accept(this);
      }
   }

   @Override
   public String toString() {
      return "Slot{originX="
         + this.field_26123
         + ", originY="
         + this.field_26127
         + ", width="
         + this.field_26126
         + ", height="
         + this.field_26125
         + ", texture="
         + this.field_26122
         + ", subSlots="
         + this.field_26121
         + '}';
   }
}
