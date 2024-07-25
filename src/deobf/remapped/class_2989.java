package remapped;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class class_2989 extends class_4855<class_5530> {
   private static String[] field_14693;
   private final class_1840 field_14696;
   private final class_1893 field_14695;
   private final List<class_5530> field_14694 = Lists.newArrayList();
   private String field_14697;

   public class_2989(class_1840 var1, class_1893 var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_14696 = var1;
      this.field_14695 = var2;
      this.method_36201(false);
      this.method_36207(false);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      double var7 = this.field_14695.method_8552().method_43189();
      class_3542.method_16452(
         (int)((double)this.method_36229() * var7),
         (int)((double)(this.field_40886 - this.field_40877) * var7),
         (int)((double)(this.method_36191() + 6) * var7),
         (int)((double)(this.field_40886 - (this.field_40886 - this.field_40877) - this.field_40876 - 4) * var7)
      );
      super.method_6767(var1, var2, var3, var4);
      class_3542.method_16372();
   }

   public void method_13681(Collection<UUID> var1, double var2) {
      this.field_14694.clear();

      for (UUID var7 : var1) {
         class_753 var8 = this.field_14695.field_9632.field_30532.method_4800(var7);
         if (var8 != null) {
            this.field_14694
               .add(new class_5530(this.field_14695, this.field_14696, var8.method_3392().getId(), var8.method_3392().getName(), var8::method_3402));
         }
      }

      this.method_13677();
      this.field_14694.sort((var0, var1x) -> var0.method_25111().compareToIgnoreCase(var1x.method_25111()));
      this.method_36225(this.field_14694);
      this.method_36222(var2);
   }

   private void method_13677() {
      if (this.field_14697 != null) {
         this.field_14694.removeIf(var1 -> !var1.method_25111().toLowerCase(Locale.ROOT).contains(this.field_14697));
         this.method_36225(this.field_14694);
      }
   }

   public void method_13680(String var1) {
      this.field_14697 = var1;
   }

   public boolean method_13678() {
      return this.field_14694.isEmpty();
   }

   public void method_13682(class_753 var1, class_5011 var2) {
      UUID var5 = var1.method_3392().getId();

      for (class_5530 var7 : this.field_14694) {
         if (var7.method_25113().equals(var5)) {
            var7.method_25115(false);
            return;
         }
      }

      if ((var2 == class_5011.field_25921 || this.field_14695.method_8586().method_42337(var5))
         && (Strings.isNullOrEmpty(this.field_14697) || var1.method_3392().getName().toLowerCase(Locale.ROOT).contains(this.field_14697))) {
         class_5530 var8 = new class_5530(this.field_14695, this.field_14696, var1.method_3392().getId(), var1.method_3392().getName(), var1::method_3402);
         this.method_36202(var8);
         this.field_14694.add(var8);
      }
   }

   public void method_13679(UUID var1) {
      for (class_5530 var5 : this.field_14694) {
         if (var5.method_25113().equals(var1)) {
            var5.method_25115(true);
            return;
         }
      }
   }
}
