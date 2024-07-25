package remapped;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class class_3840 extends class_8002 {
   private Iterator<class_2451> field_18749;
   private Set<class_2451> field_18747;
   private class_7934 field_18748;
   private class_2451 field_18746;
   private float field_18750;

   @Override
   public void method_36317() {
      this.field_40991.method_27297(152, 182, 28, 18, field_40990);
   }

   @Override
   public void method_36309(class_7934 var1) {
      super.method_36309(var1);
      if (var1 != null && var1.field_40588 < this.field_41004.method_18265()) {
         this.field_18748 = null;
      }
   }

   @Override
   public void method_36302(class_8932<?> var1, List<class_7934> var2) {
      class_6098 var5 = var1.method_41044();
      this.field_41000.method_34490(var1);
      this.field_41000.method_34491(class_8137.method_37029(var5), ((class_7934)var2.get(2)).field_40589, ((class_7934)var2.get(2)).field_40590);
      class_2831 var6 = var1.method_41043();
      this.field_18748 = (class_7934)var2.get(1);
      if (this.field_18747 == null) {
         this.field_18747 = this.method_17831();
      }

      this.field_18749 = this.field_18747.iterator();
      this.field_18746 = null;
      Iterator var7 = var6.iterator();

      for (int var8 = 0; var8 < 2; var8++) {
         if (!var7.hasNext()) {
            return;
         }

         class_8137 var9 = (class_8137)var7.next();
         if (!var9.method_37033()) {
            class_7934 var10 = (class_7934)var2.get(var8);
            this.field_41000.method_34491(var9, var10.field_40589, var10.field_40590);
         }
      }
   }

   public abstract Set<class_2451> method_17831();

   @Override
   public void method_36322(class_7966 var1, int var2, int var3, boolean var4, float var5) {
      super.method_36322(var1, var2, var3, var4, var5);
      if (this.field_18748 != null) {
         if (!Screen.method_1185()) {
            this.field_18750 += var5;
         }

         int var8 = this.field_18748.field_40589 + var2;
         int var9 = this.field_18748.field_40590 + var3;
         class_2089.method_9774(var1, var8, var9, var8 + 16, var9 + 16, 822018048);
         this.field_41006.method_8511().method_40273(this.field_41006.field_9632, this.method_17832().method_11207(), var8, var9);
         class_3542.method_16457(516);
         class_2089.method_9774(var1, var8, var9, var8 + 16, var9 + 16, 822083583);
         class_3542.method_16457(515);
      }
   }

   private class_2451 method_17832() {
      if (this.field_18746 == null || this.field_18750 > 30.0F) {
         this.field_18750 = 0.0F;
         if (this.field_18749 == null || !this.field_18749.hasNext()) {
            if (this.field_18747 == null) {
               this.field_18747 = this.method_17831();
            }

            this.field_18749 = this.field_18747.iterator();
         }

         this.field_18746 = this.field_18749.next();
      }

      return this.field_18746;
   }
}
