package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class class_6832 extends class_764 {
   private static String[] field_35226;
   public static final class_6162 field_35227 = class_380.field_1543;
   private static final Map<Direction, class_4190> field_35228 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.field_818,
         class_6414.method_29292(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         Direction.field_800,
         class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         Direction.field_809,
         class_6414.method_29292(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         Direction.field_804,
         class_6414.method_29292(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   public class_6832(class_9077 var1, class_3073 var2) {
      super(var1, var2);
      this.method_29284(this.field_32751.method_36446().method_10308(field_35227, Direction.field_818));
   }

   @Override
   public String method_29271() {
      return this.method_10803().method_11216();
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      return var2.method_28262(var3.method_6098(var1.<Direction>method_10313(field_35227).method_1046())).method_8362().method_24499();
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var2 == var1.<Direction>method_10313(field_35227).method_1046() && !var1.method_8309(var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_35228.get(var1.<Direction>method_10313(field_35227));
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
            var4 = var4.method_10308(field_35227, var12);
            if (var4.method_8309(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_35227, var2.method_30489(var1.<Direction>method_10313(field_35227)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_35227)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_35227);
   }
}
