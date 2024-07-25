package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_3213 extends class_8601 {
   private static String[] field_16029;
   public static final class_6162 field_16028 = class_380.field_1543;
   public static final class_6720 field_16027 = class_8601.field_44047;

   public class_3213(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_16028, Direction.field_818).method_10308(field_16027, Boolean.valueOf(true)));
   }

   @Override
   public String method_29271() {
      return this.method_10803().method_11216();
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return class_2634.method_11913(var1);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      return class_4783.field_23740.method_10787(var1, var2, var3);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      return class_4783.field_23740.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = class_4783.field_23740.method_29302(var1);
      return var4 != null ? this.method_29260().method_10308(field_16028, var4.<Direction>method_10313(field_16028)) : null;
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method_10313(field_16027)) {
         Direction var7 = var1.<Direction>method_10313(field_16028).method_1046();
         double var8 = 0.27;
         double var10 = (double)var3.method_12173() + 0.5 + (var4.nextDouble() - 0.5) * 0.2 + 0.27 * (double)var7.method_1041();
         double var12 = (double)var3.method_12165() + 0.7 + (var4.nextDouble() - 0.5) * 0.2 + 0.22;
         double var14 = (double)var3.method_12185() + 0.5 + (var4.nextDouble() - 0.5) * 0.2 + 0.27 * (double)var7.method_1034();
         var2.method_43361(this.field_19181, var10, var12, var14, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean method_39536(World var1, BlockPos var2, class_2522 var3) {
      Direction var6 = var3.<Direction>method_10313(field_16028).method_1046();
      return var1.method_29588(var2.method_6098(var6), var6);
   }

   @Override
   public int method_10766(class_2522 var1, class_6163 var2, BlockPos var3, Direction var4) {
      return var1.<Boolean>method_10313(field_16027) && var1.method_10313(field_16028) != var4 ? 15 : 0;
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return class_4783.field_23740.method_10785(var1, var2);
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return class_4783.field_23740.method_10773(var1, var2);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_16028, field_16027);
   }
}
