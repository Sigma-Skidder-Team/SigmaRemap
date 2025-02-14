package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;

public class Class8565 {
   private final int field38513;
   private final int field38514;
   private final int field38515;
   private final int field38516;
   private List<Class8565> field38517;
   private Class6485 field38518;

   public Class8565(int var1, int var2, int var3, int var4) {
      this.field38513 = var1;
      this.field38514 = var2;
      this.field38515 = var3;
      this.field38516 = var4;
   }

   public Class6485 method30608() {
      return this.field38518;
   }

   public int method30609() {
      return this.field38513;
   }

   public int method30610() {
      return this.field38514;
   }

   public boolean method30611(Class6485 var1) {
      if (this.field38518 != null) {
         return false;
      } else {
         int var4 = var1.field28433;
         int var5 = var1.field28434;
         if (var4 > this.field38515 || var5 > this.field38516) {
            return false;
         } else if (var4 == this.field38515 && var5 == this.field38516) {
            this.field38518 = var1;
            return true;
         } else {
            if (this.field38517 == null) {
               this.field38517 = Lists.newArrayListWithCapacity(1);
               this.field38517.add(new Class8565(this.field38513, this.field38514, var4, var5));
               int var6 = this.field38515 - var4;
               int var7 = this.field38516 - var5;
               if (var7 > 0 && var6 > 0) {
                  int var8 = Math.max(this.field38516, var6);
                  int var9 = Math.max(this.field38515, var7);
                  if (var8 < var9) {
                     this.field38517.add(new Class8565(this.field38513 + var4, this.field38514, var6, var5));
                     this.field38517.add(new Class8565(this.field38513, this.field38514 + var5, this.field38515, var7));
                  } else {
                     this.field38517.add(new Class8565(this.field38513, this.field38514 + var5, var4, var7));
                     this.field38517.add(new Class8565(this.field38513 + var4, this.field38514, var6, this.field38516));
                  }
               } else if (var6 != 0) {
                  if (var7 == 0) {
                     this.field38517.add(new Class8565(this.field38513 + var4, this.field38514, var6, var5));
                  }
               } else {
                  this.field38517.add(new Class8565(this.field38513, this.field38514 + var5, var4, var7));
               }
            }

            for (Class8565 var11 : this.field38517) {
               if (var11.method30611(var1)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public void method30612(Consumer<Class8565> var1) {
      if (this.field38518 == null) {
         if (this.field38517 != null) {
            for (Class8565 var5 : this.field38517) {
               var5.method30612(var1);
            }
         }
      } else {
         var1.accept(this);
      }
   }

   @Override
   public String toString() {
      return "Slot{originX="
         + this.field38513
         + ", originY="
         + this.field38514
         + ", width="
         + this.field38515
         + ", height="
         + this.field38516
         + ", texture="
         + this.field38518
         + ", subSlots="
         + this.field38517
         + '}';
   }
}
