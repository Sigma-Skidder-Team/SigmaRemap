package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class class_4590 extends class_6143 {
   private static String[] field_22312;
   public static final class_6162 field_22314 = class_380.field_1543;
   private static final Map<class_240, class_4190> field_22313 = Maps.newEnumMap(
      ImmutableMap.of(
         class_240.field_818,
         class_6414.method_29292(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         class_240.field_800,
         class_6414.method_29292(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         class_240.field_809,
         class_6414.method_29292(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         class_240.field_804,
         class_6414.method_29292(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   public class_4590(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_22314, class_240.field_818).method_10308(field_31998, Boolean.valueOf(true)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_22313.get(var1.<class_240>method_10313(field_22314));
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_22314, var2.method_30489(var1.<class_240>method_10313(field_22314)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<class_240>method_10313(field_22314)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_22314, field_31998);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var1.<Boolean>method_10313(field_31998)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return var2.method_1046() == var1.method_10313(field_22314) && !var1.method_8309(var4, var5) ? class_4783.field_23184.method_29260() : var1;
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_240 var6 = var1.<class_240>method_10313(field_22314);
      class_1331 var7 = var3.method_6098(var6.method_1046());
      class_2522 var8 = var2.method_28262(var7);
      return var8.method_8308(var2, var7, var6);
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = super.method_29302(var1);
      class_6486 var5 = var1.method_21862();
      class_1331 var6 = var1.method_21858();
      class_240[] var7 = var1.method_1786();

      for (class_240 var11 : var7) {
         if (var11.method_1029().method_42629()) {
            var4 = var4.method_10308(field_22314, var11.method_1046());
            if (var4.method_8309(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }
}
