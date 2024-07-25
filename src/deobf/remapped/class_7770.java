package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_7770 extends class_5920<class_7666> {
   private static String[] field_39374;
   private long field_39373;

   public class_7770() {
      super(ImmutableMap.of(class_6044.field_30892, class_561.field_3320, class_6044.field_30901, class_561.field_3320), 350, 350);
   }

   public boolean method_35252(class_6331 var1, class_7666 var2) {
      return this.method_35250(var2);
   }

   public boolean method_35251(class_6331 var1, class_7666 var2, long var3) {
      return var3 <= this.field_39373 && this.method_35250(var2);
   }

   public void method_35244(class_6331 var1, class_7666 var2, long var3) {
      class_1899 var7 = var2.method_26525().<class_1899>method_5138(class_6044.field_30892).get();
      class_1225.method_5443(var2, var7, 0.5F);
      var1.method_29587(var7, (byte)18);
      var1.method_29587(var2, (byte)18);
      int var8 = 275 + var2.method_26594().nextInt(50);
      this.field_39373 = var3 + (long)var8;
   }

   public void method_35243(class_6331 var1, class_7666 var2, long var3) {
      class_7666 var7 = (class_7666)var2.method_26525().<class_1899>method_5138(class_6044.field_30892).get();
      if (!(var2.method_37275(var7) > 5.0)) {
         class_1225.method_5443(var2, var7, 0.5F);
         if (var3 < this.field_39373) {
            if (var2.method_26594().nextInt(35) == 0) {
               var1.method_29587(var7, (byte)12);
               var1.method_29587(var2, (byte)12);
            }
         } else {
            var2.method_34703();
            var7.method_34703();
            this.method_35247(var1, var2, var7);
         }
      }
   }

   private void method_35247(class_6331 var1, class_7666 var2, class_7666 var3) {
      Optional var6 = this.method_35253(var1, var2);
      if (var6.isPresent()) {
         Optional var7 = this.method_35245(var1, var2, var3);
         if (!var7.isPresent()) {
            var1.method_28969().method_6860((class_1331)var6.get());
            class_1892.method_8433(var1, (class_1331)var6.get());
         } else {
            this.method_35248(var1, (class_7666)var7.get(), (class_1331)var6.get());
         }
      } else {
         var1.method_29587(var3, (byte)13);
         var1.method_29587(var2, (byte)13);
      }
   }

   public void method_35246(class_6331 var1, class_7666 var2, long var3) {
      var2.method_26525().method_5127(class_6044.field_30892);
   }

   private boolean method_35250(class_7666 var1) {
      class_1150 var4 = var1.method_26525();
      Optional var5 = var4.<class_1899>method_5138(class_6044.field_30892).filter(var0 -> var0.method_37387() == class_6629.field_34276);
      return !var5.isPresent()
         ? false
         : class_1225.method_5450(var4, class_6044.field_30892, class_6629.field_34276) && var1.method_8636() && ((class_1899)var5.get()).method_8636();
   }

   private Optional<class_1331> method_35253(class_6331 var1, class_7666 var2) {
      return var1.method_28969().method_6861(class_236.field_778.method_1007(), var2x -> this.method_35249(var2, var2x), var2.method_37075(), 48);
   }

   private boolean method_35249(class_7666 var1, class_1331 var2) {
      class_3998 var5 = var1.method_26927().method_5615(var2, class_236.field_778.method_1006());
      return var5 != null && var5.method_18433();
   }

   private Optional<class_7666> method_35245(class_6331 var1, class_7666 var2, class_7666 var3) {
      class_7666 var6 = var2.method_34730(var1, var3);
      if (var6 != null) {
         var2.method_8635(6000);
         var3.method_8635(6000);
         var6.method_8635(-24000);
         var6.method_37144(var2.method_37302(), var2.method_37309(), var2.method_37156(), 0.0F, 0.0F);
         var1.method_7065(var6);
         var1.method_29587(var6, (byte)12);
         return Optional.<class_7666>of(var6);
      } else {
         return Optional.<class_7666>empty();
      }
   }

   private void method_35248(class_6331 var1, class_7666 var2, class_1331 var3) {
      class_8150 var6 = class_8150.method_37410(var1.method_29545(), var3);
      var2.method_26525().method_5105(class_6044.field_30854, var6);
   }
}
