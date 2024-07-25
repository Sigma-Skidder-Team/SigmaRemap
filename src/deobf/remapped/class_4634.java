package remapped;

import com.google.common.collect.ImmutableMap;

public class class_4634 extends class_5920<class_5886> {
   private static String[] field_22642;

   public class_4634(int var1, int var2) {
      super(ImmutableMap.of(class_6044.field_30874, class_561.field_3320), var1, var2);
   }

   public boolean method_21431(class_6331 var1, class_5886 var2, long var3) {
      return var2.method_26525().<class_7835>method_5138(class_6044.field_30874).filter(var1x -> var1x.method_35463(var2)).isPresent();
   }

   public void method_21430(class_6331 var1, class_5886 var2, long var3) {
      var2.method_26525().method_5127(class_6044.field_30874);
   }

   public void method_21429(class_6331 var1, class_5886 var2, long var3) {
      var2.method_26525().<class_7835>method_5138(class_6044.field_30874).ifPresent(var1x -> var2.method_26865().method_17232(var1x.method_35464()));
   }
}
