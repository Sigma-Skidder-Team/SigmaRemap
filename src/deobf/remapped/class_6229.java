package remapped;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class class_6229 extends class_7346<class_665> {
   public class_6229(class_1991 var1) {
      this(var1, Collections.emptyList());
   }

   public class_6229(Iterable<class_2496> var1, Iterable var2) {
      super(var1.field_941, var1.field_940, !class_1991.method_9221(var1) ? 32 : class_1991.method_9219(1), var1.field_940 - 40, 46);
      this.field_31802 = var1;
      var2.forEach(this::method_28459);
   }

   public void method_28459(class_2496 var1) {
      class_1991 var10003 = this.field_31802;
      this.field_31802.getClass();
      this.method_33483(new class_665(var10003, var1));
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (var5 == 0 && var3 >= (double)this.field_40876 && var3 <= (double)this.field_40877) {
         int var8 = this.field_40891 / 2 - 150;
         if (class_1991.method_9181(this.field_31802) != null) {
            class_9665.method_44667().method_37581(class_1991.method_9181(this.field_31802));
         }

         int var9 = (int)Math.floor(var3 - (double)this.field_40876) - this.field_40874 + (int)this.method_36228() - 4;
         int var10 = var9 / this.field_40878;
         if (var1 >= (double)var8 && var1 < (double)this.method_36191() && var10 >= 0 && var9 >= 0 && var10 < this.method_36218()) {
            this.method_33482(var10);
            this.method_33484(var9, var10, var1, var3, this.field_40891);
            if (var10 < class_1991.method_9208(this.field_31802).method_36218()) {
               class_1991.method_9189(this.field_31802, class_1991.method_9202(this.field_31802) + 7);
               if (class_1991.method_9202(this.field_31802) >= 10) {
                  class_1991.method_9210(this.field_31802);
               }

               return true;
            }

            return super.method_26940(var1, var3, var5);
         }
      }

      return super.method_26940(var1, var3, var5);
   }

   @Override
   public void method_33482(int var1) {
      this.method_33485(var1);
      if (var1 != -1) {
         class_2496 var4 = class_1991.method_9208(this.field_31802).method_28461(var1);
         String var5 = class_6956.method_31803("narrator.select.list.position", var1 + 1, class_1991.method_9208(this.field_31802).method_36218());
         String var6 = class_6956.method_31803("mco.template.select.narrate.version", var4.field_12417);
         String var7 = class_6956.method_31803("mco.template.select.narrate.authors", var4.field_12413);
         String var8 = class_7567.method_34407(Arrays.<String>asList(var4.field_12418, var7, var4.field_12414, var6, var5));
         class_7567.method_34410(class_6956.method_31803("narrator.select", var8));
      }
   }

   public void method_28460(class_665 var1) {
      super.method_36197(var1);
      class_1991.method_9179(this.field_31802, this.method_41183().indexOf(var1));
      class_1991.method_9193(this.field_31802);
   }

   @Override
   public int method_36205() {
      return this.method_36218() * 46;
   }

   @Override
   public int method_36195() {
      return 300;
   }

   @Override
   public void method_36199(class_7966 var1) {
      this.field_31802.method_1183(var1);
   }

   @Override
   public boolean method_36221() {
      return this.field_31802.method_41185() == this;
   }

   public boolean method_28462() {
      return this.method_36218() == 0;
   }

   public class_2496 method_28461(int var1) {
      return class_665.method_3038(this.method_41183().get(var1));
   }

   public List<class_2496> method_28463() {
      return this.method_41183().stream().<class_2496>map(var0 -> class_665.method_3038(var0)).collect(Collectors.<class_2496>toList());
   }
}
