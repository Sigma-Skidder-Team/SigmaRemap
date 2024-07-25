package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class class_4853 extends class_5210 {
   private static String[] field_24192;
   public static final class_6162 field_24194 = class_380.field_1543;
   private static final Map<class_240, class_4190> field_24193 = Maps.newEnumMap(
      ImmutableMap.of(
         class_240.field_818,
         class_6414.method_29292(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         class_240.field_800,
         class_6414.method_29292(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         class_240.field_804,
         class_6414.method_29292(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         class_240.field_809,
         class_6414.method_29292(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   public class_4853(class_3073 var1, class_9271 var2) {
      super(var1, var2);
      this.method_29284(this.field_32751.method_36446().method_10308(field_24194, class_240.field_818).method_10308(field_26767, Boolean.valueOf(false)));
   }

   @Override
   public String method_29271() {
      return this.method_10803().method_11216();
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_24193.get(var1.<class_240>method_10313(field_24194));
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      return var2.method_28262(var3.method_6098(var1.<class_240>method_10313(field_24194).method_1046())).method_8362().method_24499();
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = this.method_29260();
      class_4774 var5 = var1.method_21862().method_28258(var1.method_21858());
      class_6486 var6 = var1.method_21862();
      class_1331 var7 = var1.method_21858();
      class_240[] var8 = var1.method_1786();

      for (class_240 var12 : var8) {
         if (var12.method_1029().method_42629()) {
            class_240 var13 = var12.method_1046();
            var4 = var4.method_10308(field_24194, var13);
            if (var4.method_8309(var6, var7)) {
               return var4.method_10308(field_26767, Boolean.valueOf(var5.method_22005() == class_8532.field_43674));
            }
         }
      }

      return null;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var2.method_1046() == var1.method_10313(field_24194) && !var1.method_8309(var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_24194, var2.method_30489(var1.<class_240>method_10313(field_24194)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<class_240>method_10313(field_24194)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_24194, field_26767);
   }
}
