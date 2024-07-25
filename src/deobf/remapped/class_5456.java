package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_5456 extends class_5920<class_5834> {
   private static String[] field_27810;
   private long field_27809;

   public class_5456() {
      super(ImmutableMap.of(class_6044.field_30854, class_561.field_3320, class_6044.field_30858, class_561.field_3319));
   }

   @Override
   public boolean method_27088(class_6331 var1, class_5834 var2) {
      if (var2.method_37070()) {
         return false;
      } else {
         class_1150 var5 = var2.method_26525();
         class_8150 var6 = var5.<class_8150>method_5138(class_6044.field_30854).get();
         if (var1.method_29545() == var6.method_37408()) {
            Optional var7 = var5.<Long>method_5138(class_6044.field_30858);
            if (var7.isPresent()) {
               long var9 = var1.method_29546() - (Long)var7.get();
               if (var9 > 0L && var9 < 100L) {
                  return false;
               }
            }

            class_2522 var8 = var1.method_28262(var6.method_37409());
            return var6.method_37409().method_12170(var2.method_37245(), 2.0)
               && var8.method_8360().method_29299(class_2351.field_11784)
               && !var8.<Boolean>method_10313(class_3633.field_17728);
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean method_27086(class_6331 var1, class_5834 var2, long var3) {
      Optional var7 = var2.method_26525().<class_8150>method_5138(class_6044.field_30854);
      if (!var7.isPresent()) {
         return false;
      } else {
         class_1331 var8 = ((class_8150)var7.get()).method_37409();
         return var2.method_26525().method_5134(class_6275.field_32079)
            && var2.method_37309() > (double)var8.method_12165() + 0.4
            && var8.method_12170(var2.method_37245(), 1.14);
      }
   }

   @Override
   public void method_27080(class_6331 var1, class_5834 var2, long var3) {
      if (var3 > this.field_27809) {
         class_3371.method_15548(var1, var2, (class_5851)null, (class_5851)null);
         var2.method_26470(var2.method_26525().<class_8150>method_5138(class_6044.field_30854).get().method_37409());
      }
   }

   @Override
   public boolean method_27085(long var1) {
      return false;
   }

   @Override
   public void method_27081(class_6331 var1, class_5834 var2, long var3) {
      if (var2.method_26507()) {
         var2.method_26557();
         this.field_27809 = var3 + 40L;
      }
   }
}
