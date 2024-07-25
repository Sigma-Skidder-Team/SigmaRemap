package remapped;

public final class class_7935 extends class_7149 {
   public class_7935(String var1) {
      super(var1, null);
   }

   @Override
   public class_2904 method_32810(class_7522 var1, long var2, boolean var4, boolean var5) {
      class_6433 var8 = var1.<class_6325>method_28813(class_8669.field_44359);
      class_6433 var9 = var1.<class_8760>method_28813(class_8669.field_44415);
      class_6433 var10 = var1.<class_7902>method_28813(class_8669.field_44360);
      return new class_2904(
         var2,
         var4,
         var5,
         class_2904.method_13284(
            class_8760.method_40218(var9, var8, var10, var2), () -> var9.method_39807(class_8760.field_44834), this.method_32813(var8, var10, var2)
         )
      );
   }

   @Override
   public class_6541 method_32813(class_8669<class_6325> var1, class_8669<class_7902> var2, long var3) {
      return new class_322(new class_2136(var1.method_39807(class_8606.field_44136)), var3, () -> var2.method_39807(class_7902.field_40408));
   }
}
