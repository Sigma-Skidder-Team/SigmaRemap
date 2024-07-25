package remapped;

public class class_5960 extends class_956 {
   private static String[] field_30374;
   private final class_4931 field_30376;

   public class_5960(class_2519 var1, class_4612 var2) {
      super(var2, false);
      this.field_30375 = var1;
      this.field_30376 = new class_4931().method_22602().method_22608();
   }

   @Override
   public boolean method_16795() {
      return class_2519.method_11456(this.field_30375) != null
         && class_2519.method_11456(this.field_30375).method_17809() != null
         && this.method_4210(class_2519.method_11456(this.field_30375).method_17809(), this.field_30376);
   }

   @Override
   public void method_16796() {
      this.field_30375.method_26860(class_2519.method_11456(this.field_30375).method_17809());
      super.method_16796();
   }
}
