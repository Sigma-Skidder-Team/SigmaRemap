package remapped;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_8526 extends class_2654 {
   private static String[] field_43627;
   private static final class_6325[] field_43628 = Util.<class_6325[]>method_44659(
      new class_6325[class_546.field_3277], var0 -> Arrays.fill(var0, class_6297.field_32176)
   );

   public class_8526(World var1, class_2034 var2) {
      super(var1, var2, new class_546(var1.method_2755().<class_6325>method_28813(class_8669.field_44359), field_43628));
   }

   @Override
   public class_2522 method_28262(BlockPos var1) {
      return class_4783.field_23424.method_29260();
   }

   @Nullable
   @Override
   public class_2522 method_27348(BlockPos var1, class_2522 var2, boolean var3) {
      return null;
   }

   @Override
   public class_4774 method_28258(BlockPos var1) {
      return class_8532.field_43673.method_10710();
   }

   @Nullable
   @Override
   public class_4663 method_11983() {
      return null;
   }

   @Override
   public int method_28263(BlockPos var1) {
      return 0;
   }

   @Override
   public void method_27342(Entity var1) {
   }

   @Override
   public void method_11995(Entity var1) {
   }

   @Override
   public void method_12000(Entity var1, int var2) {
   }

   @Nullable
   @Override
   public class_3757 method_11988(BlockPos var1, class_1628 var2) {
      return null;
   }

   @Override
   public void method_11982(class_3757 var1) {
   }

   @Override
   public void method_27346(BlockPos var1, class_3757 var2) {
   }

   @Override
   public void method_27370(BlockPos var1) {
   }

   @Override
   public void method_11992() {
   }

   @Override
   public void method_11990(Entity var1, class_4092 var2, List<Entity> var3, Predicate<? super Entity> var4) {
   }

   @Override
   public <T extends Entity> void method_11994(Class<? extends T> var1, class_4092 var2, List<T> var3, Predicate<? super T> var4) {
   }

   @Override
   public boolean method_12003() {
      return true;
   }

   @Override
   public boolean method_27368(int var1, int var2) {
      return true;
   }

   @Override
   public class_7581 method_11999() {
      return class_7581.field_38630;
   }
}
