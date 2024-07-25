package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;

public class class_2634 extends class_3956 {
   private static String[] field_12971;
   public static final class_6162 field_12970 = class_380.field_1543;
   private static final Map<class_240, class_4190> field_12969 = Maps.newEnumMap(
      ImmutableMap.of(
         class_240.field_818,
         class_6414.method_29292(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         class_240.field_800,
         class_6414.method_29292(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         class_240.field_809,
         class_6414.method_29292(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         class_240.field_804,
         class_6414.method_29292(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   public class_2634(class_3073 var1, class_5079 var2) {
      super(var1, var2);
      this.method_29284(this.field_32751.method_36446().method_10308(field_12970, class_240.field_818));
   }

   @Override
   public String method_29271() {
      return this.method_10803().method_11216();
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return method_11913(var1);
   }

   public static class_4190 method_11913(class_2522 var0) {
      return field_12969.get(var0.<class_240>method_10313(field_12970));
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_240 var6 = var1.<class_240>method_10313(field_12970);
      class_1331 var7 = var3.method_6098(var6.method_1046());
      class_2522 var8 = var2.method_28262(var7);
      return var8.method_8308(var2, var7, var6);
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = this.method_29260();
      class_6486 var5 = var1.method_21862();
      class_1331 var6 = var1.method_21858();
      class_240[] var7 = var1.method_1786();

      for (class_240 var11 : var7) {
         if (var11.method_1029().method_42629()) {
            class_240 var12 = var11.method_1046();
            var4 = var4.method_10308(field_12970, var12);
            if (var4.method_8309(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return var2.method_1046() == var1.method_10313(field_12970) && !var1.method_8309(var4, var5) ? class_4783.field_23184.method_29260() : var1;
   }

   @Override
   public void method_29280(class_2522 var1, class_6486 var2, class_1331 var3, Random var4) {
      class_240 var7 = var1.<class_240>method_10313(field_12970);
      double var8 = (double)var3.method_12173() + 0.5;
      double var10 = (double)var3.method_12165() + 0.7;
      double var12 = (double)var3.method_12185() + 0.5;
      double var14 = 0.22;
      double var16 = 0.27;
      class_240 var18 = var7.method_1046();
      var2.method_43361(
         class_3090.field_15376, var8 + 0.27 * (double)var18.method_1041(), var10 + 0.22, var12 + 0.27 * (double)var18.method_1034(), 0.0, 0.0, 0.0
      );
      var2.method_43361(this.field_19181, var8 + 0.27 * (double)var18.method_1041(), var10 + 0.22, var12 + 0.27 * (double)var18.method_1034(), 0.0, 0.0, 0.0);
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_12970, var2.method_30489(var1.<class_240>method_10313(field_12970)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<class_240>method_10313(field_12970)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_12970);
   }
}
