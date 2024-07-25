package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class class_8330 extends class_2830 {
   private static String[] field_42656;
   public static final class_6162 field_42655 = class_380.field_1543;
   private final class_8497 field_42654;
   private static final Map<class_240, class_4190> field_42653 = Maps.newEnumMap(
      ImmutableMap.of(
         class_240.field_800,
         class_6414.method_29292(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         class_240.field_809,
         class_6414.method_29292(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         class_240.field_818,
         class_6414.method_29292(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         class_240.field_804,
         class_6414.method_29292(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );

   public class_8330(class_8497 var1, class_3073 var2) {
      super(var2);
      this.method_29284(this.field_32751.method_36446().method_10308(field_42655, class_240.field_818));
      this.field_42654 = var1;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_42653.get(var1.<class_240>method_10313(field_42655));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return !var3.method_8350(this.field_42654) && var2 == var1.method_10313(field_42655)
         ? this.field_42654.method_39158().method_29260().method_10308(class_8138.field_41679, Integer.valueOf(7))
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_12870(class_2522 var1, class_6163 var2, class_1331 var3) {
      return var1.method_8350(class_4783.field_23421);
   }

   public class_2451 method_38368() {
      if (this.field_42654 != class_4783.field_23871) {
         return this.field_42654 != class_4783.field_23261 ? class_4897.field_25302 : class_4897.field_24435;
      } else {
         return class_4897.field_24480;
      }
   }

   @Override
   public class_6098 method_29276(class_6163 var1, class_1331 var2, class_2522 var3) {
      return new class_6098(this.method_38368());
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_42655, var2.method_30489(var1.<class_240>method_10313(field_42655)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<class_240>method_10313(field_42655)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_42655);
   }
}
