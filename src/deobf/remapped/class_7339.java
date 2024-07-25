package remapped;

public class class_7339 extends AbstractMinecartEntity {
   private static String[] field_37530;
   private final class_3521 field_37529 = new class_4070(this);

   public class_7339(class_6629<? extends class_7339> var1, World var2) {
      super(var1, var2);
   }

   public class_7339(World var1, double var2, double var4, double var6) {
      super(class_6629.field_34209, var1, var2, var4, var6);
   }

   @Override
   public class_3481 method_4737() {
      return class_3481.field_17070;
   }

   @Override
   public class_2522 method_4752() {
      return class_4783.field_23617.method_29260();
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.field_37529.method_16255(var1);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      this.field_37529.method_16258(var1);
   }

   @Override
   public void method_37336(byte var1) {
      this.field_37529.method_16262(var1);
   }

   @Override
   public void method_37123() {
      super.method_37123();
      this.field_37529.method_16267();
   }

   @Override
   public boolean method_37131() {
      return true;
   }
}
