package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_8418 extends class_5920<class_5886> {
   private static String[] field_43048;
   private final float field_43051;
   private class_1331 field_43050;
   private int field_43047;
   private int field_43049;
   private int field_43046;

   public class_8418(float var1) {
      super(ImmutableMap.of(class_6044.field_30910, class_561.field_3320, class_6044.field_30889, class_561.field_3318));
      this.field_43051 = var1;
   }

   public boolean method_38752(class_6331 var1, class_5886 var2) {
      return var2.method_26449() && this.method_38746(var1, var2);
   }

   public void method_38743(class_6331 var1, class_5886 var2, long var3) {
      super.method_27080(var1, var2, var3);
      this.method_38753(var2).ifPresent(var3x -> {
         this.field_43050 = var3x;
         this.field_43047 = 100;
         this.field_43049 = 3 + var1.field_33033.nextInt(4);
         this.field_43046 = 0;
         this.method_38748(var2, var3x);
      });
   }

   public void method_38747(class_6331 var1, class_5886 var2, long var3) {
      super.method_27081(var1, var2, var3);
      this.field_43050 = null;
      this.field_43047 = 0;
      this.field_43049 = 0;
      this.field_43046 = 0;
   }

   public boolean method_38751(class_6331 var1, class_5886 var2, long var3) {
      return var2.method_26449()
         && this.field_43050 != null
         && this.method_38749(var1, this.field_43050)
         && !this.method_38744(var1, var2)
         && !this.method_38750(var1, var2);
   }

   @Override
   public boolean method_27085(long var1) {
      return false;
   }

   public void method_38742(class_6331 var1, class_5886 var2, long var3) {
      if (this.method_38741(var1, var2)) {
         if (this.field_43046 <= 0) {
            if (this.method_38745(var1, var2)) {
               var2.method_26886().method_18772();
               this.field_43049--;
               this.field_43046 = 5;
            }
         } else {
            this.field_43046--;
         }
      } else {
         this.field_43047--;
      }
   }

   private void method_38748(class_5886 var1, class_1331 var2) {
      var1.method_26525().method_5105(class_6044.field_30889, new class_6651(var2, this.field_43051, 0));
   }

   private boolean method_38746(class_6331 var1, class_5886 var2) {
      return this.method_38741(var1, var2) || this.method_38753(var2).isPresent();
   }

   private boolean method_38741(class_6331 var1, class_5886 var2) {
      class_1331 var5 = var2.method_37075();
      class_1331 var6 = var5.method_6100();
      return this.method_38749(var1, var5) || this.method_38749(var1, var6);
   }

   private boolean method_38745(class_6331 var1, class_5886 var2) {
      return this.method_38749(var1, var2.method_37075());
   }

   private boolean method_38749(class_6331 var1, class_1331 var2) {
      return var1.method_28262(var2).method_8349(class_2351.field_11784);
   }

   private Optional<class_1331> method_38753(class_5886 var1) {
      return var1.method_26525().<class_1331>method_5138(class_6044.field_30910);
   }

   private boolean method_38744(class_6331 var1, class_5886 var2) {
      return !this.method_38741(var1, var2) && this.field_43047 <= 0;
   }

   private boolean method_38750(class_6331 var1, class_5886 var2) {
      return this.method_38741(var1, var2) && this.field_43049 <= 0;
   }
}
