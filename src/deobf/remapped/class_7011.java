package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class class_7011 extends class_8550 {
   private static String[] field_35951;
   public static final class_6162 field_35952 = class_380.field_1543;
   private static final Map<Direction, class_4190> field_35950 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.field_818,
         class_6414.method_29292(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         Direction.field_800,
         class_6414.method_29292(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         Direction.field_804,
         class_6414.method_29292(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         Direction.field_809,
         class_6414.method_29292(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   public class_7011(class_558 var1, class_3073 var2) {
      super(var1, var2);
      this.method_29284(this.field_32751.method_36446().method_10308(field_35952, Direction.field_818));
   }

   @Override
   public String method_29271() {
      return this.method_10803().method_11216();
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_35950.get(var1.<Direction>method_10313(field_35952));
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = this.method_29260();
      World var5 = var1.method_21862();
      class_1331 var6 = var1.method_21858();
      Direction[] var7 = var1.method_1786();

      for (Direction var11 : var7) {
         if (var11.method_1029().method_42629()) {
            Direction var12 = var11.method_1046();
            var4 = var4.method_10308(field_35952, var12);
            if (!var5.method_28262(var6.method_6098(var11)).method_8374(var1)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_35952, var2.method_30489(var1.<Direction>method_10313(field_35952)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_35952)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_35952);
   }
}
