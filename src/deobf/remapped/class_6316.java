package remapped;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.Set;

public class class_6316 extends class_3599 {
   private static String[] field_32262;
   private static final class_4931 field_32259 = new class_4931().method_22607(10.0).method_22601().method_22603();
   private final class_3845 field_32260;
   private final double field_32265;
   private class_704 field_32263;
   private int field_32264;
   private final Set<class_2451> field_32261;

   public class_6316(class_3845 var1, double var2, class_2451 var4) {
      this.field_32260 = var1;
      this.field_32265 = var2;
      this.field_32261 = Sets.newHashSet(new class_2451[]{var4});
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
   }

   @Override
   public boolean method_16795() {
      if (this.field_32264 <= 0) {
         this.field_32263 = this.field_32260.field_41768.method_25859(field_32259, this.field_32260);
         return this.field_32263 == null ? false : this.method_28788(this.field_32263.method_26446()) || this.method_28788(this.field_32263.method_26568());
      } else {
         this.field_32264--;
         return false;
      }
   }

   private boolean method_28788(class_6098 var1) {
      return this.field_32261.contains(var1.method_27960());
   }

   @Override
   public boolean method_16799() {
      return this.method_16795();
   }

   @Override
   public void method_16793() {
      this.field_32263 = null;
      this.field_32260.method_26927().method_5620();
      this.field_32264 = 100;
   }

   @Override
   public void method_16794() {
      this.field_32260.method_26865().method_17240(this.field_32263, (float)(this.field_32260.method_26903() + 20), (float)this.field_32260.method_26862());
      if (!(this.field_32260.method_37275(this.field_32263) < 6.25)) {
         this.field_32260.method_26927().method_5616(this.field_32263, this.field_32265);
      } else {
         this.field_32260.method_26927().method_5620();
      }
   }
}
