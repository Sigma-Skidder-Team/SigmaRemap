package remapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class class_8510 extends class_6541 {
   private static String[] field_43558;
   public static final Codec<class_8510> field_43560 = class_5203.<class_6325>method_23878(class_8669.field_44359)
      .xmap(class_8510::new, class_8510::method_39185)
      .stable()
      .codec();
   private static final List<class_2522> field_43559 = StreamSupport.<class_6414>stream(class_8669.field_44462.spliterator(), false)
      .<class_2522>flatMap(var0 -> var0.method_29306().method_36441().stream())
      .collect(Collectors.<class_2522>toList());
   private static final int field_43565 = class_9299.method_42816(class_9299.method_42843((float)field_43559.size()));
   private static final int field_43563 = class_9299.method_42816((float)field_43559.size() / (float)field_43565);
   public static final class_2522 field_43564 = class_4783.field_23184.method_29260();
   public static final class_2522 field_43562 = class_4783.field_23207.method_29260();
   private final class_8669<class_6325> field_43561;

   public class_8510(class_8669<class_6325> var1) {
      super(new class_2136(var1.method_39807(class_8606.field_44136)), new class_9610(false));
      this.field_43561 = var1;
   }

   public class_8669<class_6325> method_39185() {
      return this.field_43561;
   }

   @Override
   public Codec<? extends class_6541> method_29835() {
      return field_43560;
   }

   @Override
   public class_6541 method_29828(long var1) {
      return this;
   }

   @Override
   public void method_29814(class_702 var1, class_5990 var2) {
   }

   @Override
   public void method_29829(long var1, class_859 var3, class_5990 var4, class_6033 var5) {
   }

   @Override
   public void method_29818(class_702 var1, class_2033 var2) {
      class_2921 var5 = new class_2921();
      int var6 = var1.method_3137();
      int var7 = var1.method_3139();

      for (int var8 = 0; var8 < 16; var8++) {
         for (int var9 = 0; var9 < 16; var9++) {
            int var10 = (var6 << 4) + var8;
            int var11 = (var7 << 4) + var9;
            var1.method_7513(var5.method_13362(var10, 60, var11), field_43562, 2);
            class_2522 var12 = method_39186(var10, var11);
            if (var12 != null) {
               var1.method_7513(var5.method_13362(var10, 70, var11), var12, 2);
            }
         }
      }
   }

   @Override
   public void method_29824(class_9379 var1, class_2033 var2, class_5990 var3) {
   }

   @Override
   public int method_29830(int var1, int var2, class_3801 var3) {
      return 0;
   }

   @Override
   public class_6163 method_29822(int var1, int var2) {
      return new class_4795(new class_2522[0]);
   }

   public static class_2522 method_39186(int var0, int var1) {
      class_2522 var4 = field_43564;
      if (var0 > 0 && var1 > 0 && var0 % 2 != 0 && var1 % 2 != 0) {
         var0 /= 2;
         var1 /= 2;
         if (var0 <= field_43565 && var1 <= field_43563) {
            int var5 = class_9299.method_42805(var0 * field_43565 + var1);
            if (var5 < field_43559.size()) {
               var4 = field_43559.get(var5);
            }
         }
      }

      return var4;
   }
}
