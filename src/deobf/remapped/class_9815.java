package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class class_9815 extends class_764 {
   private static String[] field_49743;
   public static final class_7044 field_49744 = class_6023.field_30680;
   private static final Map<class_9077, class_6414> field_49746 = Maps.newHashMap();
   private static final class_4190 field_49745 = class_6414.method_29292(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public class_9815(class_9077 var1, class_3073 var2) {
      super(var1, var2);
      this.method_29284(this.field_32751.method_36446().method_10308(field_49744, Integer.valueOf(0)));
      field_49746.put(var1, this);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      return var2.method_28262(var3.method_6100()).method_8362().method_24499();
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_49745;
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260()
         .method_10308(field_49744, Integer.valueOf(MathHelper.floor((double)((180.0F + var1.method_21861()) * 16.0F / 360.0F) + 0.5) & 15));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.field_802 && !var1.method_8309(var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_49744, Integer.valueOf(var2.method_30488(var1.<Integer>method_10313(field_49744), 16)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_10308(field_49744, Integer.valueOf(var2.method_41389(var1.<Integer>method_10313(field_49744), 16)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_49744);
   }

   public static class_6414 method_45242(class_9077 var0) {
      return field_49746.getOrDefault(var0, class_4783.field_23597);
   }
}
