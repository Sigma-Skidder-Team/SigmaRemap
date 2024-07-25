package remapped;

import com.google.common.collect.ImmutableMap;

public class class_7443 extends class_5920<class_7666> {
   private static String[] field_37942;
   private final float field_37941;

   public class_7443(float var1) {
      super(ImmutableMap.of(class_6044.field_30889, class_561.field_3319, class_6044.field_30874, class_561.field_3319), Integer.MAX_VALUE);
      this.field_37941 = var1;
   }

   public boolean method_33874(class_6331 var1, class_7666 var2) {
      class_704 var5 = var2.method_978();
      return var2.isAlive() && var5 != null && !var2.method_37285() && !var2.field_41743 && var2.method_37275(var5) <= 16.0 && var5.field_3874 != null;
   }

   public boolean method_33873(class_6331 var1, class_7666 var2, long var3) {
      return this.method_33874(var1, var2);
   }

   public void method_33871(class_6331 var1, class_7666 var2, long var3) {
      this.method_33875(var2);
   }

   public void method_33872(class_6331 var1, class_7666 var2, long var3) {
      class_1150 var7 = var2.method_26525();
      var7.method_5127(class_6044.field_30889);
      var7.method_5127(class_6044.field_30874);
   }

   public void method_33870(class_6331 var1, class_7666 var2, long var3) {
      this.method_33875(var2);
   }

   @Override
   public boolean method_27085(long var1) {
      return false;
   }

   private void method_33875(class_7666 var1) {
      class_1150 var4 = var1.method_26525();
      var4.method_5105(class_6044.field_30889, new class_6651(new class_4843(var1.method_978(), false), this.field_37941, 2));
      var4.method_5105(class_6044.field_30874, new class_4843(var1.method_978(), true));
   }
}
