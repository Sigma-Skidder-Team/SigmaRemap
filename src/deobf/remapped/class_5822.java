package remapped;

public abstract class class_5822 implements class_8932<class_6867> {
   public final class_8137 field_29533;
   public final class_6098 field_29534;
   private final class_1510<?> field_29537;
   private final class_2994<?> field_29535;
   public final class_4639 field_29536;
   public final String field_29538;

   public class_5822(class_1510<?> var1, class_2994<?> var2, class_4639 var3, String var4, class_8137 var5, class_6098 var6) {
      this.field_29537 = var1;
      this.field_29535 = var2;
      this.field_29536 = var3;
      this.field_29538 = var4;
      this.field_29533 = var5;
      this.field_29534 = var6;
   }

   @Override
   public class_1510<?> method_41045() {
      return this.field_29537;
   }

   @Override
   public class_2994<?> method_41048() {
      return this.field_29535;
   }

   @Override
   public class_4639 method_41050() {
      return this.field_29536;
   }

   @Override
   public String method_41051() {
      return this.field_29538;
   }

   @Override
   public class_6098 method_41044() {
      return this.field_29534;
   }

   @Override
   public class_2831<class_8137> method_41043() {
      class_2831 var3 = class_2831.method_12874();
      var3.add(this.field_29533);
      return var3;
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return true;
   }

   @Override
   public class_6098 method_41042(class_6867 var1) {
      return this.field_29534.method_27973();
   }
}
