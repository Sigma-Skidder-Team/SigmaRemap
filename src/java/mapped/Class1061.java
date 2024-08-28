package mapped;

import javax.annotation.Nullable;

public class Class1061 implements Class1060 {
   private static String[] field5855;
   private final Class988 field5856;
   private final PlayerEntity field5857;
   private Class46 field5858 = new Class46();
   private int field5859;

   public Class1061(PlayerEntity var1) {
      this.field5857 = var1;
      this.field5856 = new Class988(this);
   }

   @Nullable
   @Override
   public PlayerEntity method4740() {
      return this.field5857;
   }

   @Override
   public void method4683(PlayerEntity var1) {
   }

   @Override
   public Class46 method4742() {
      return this.field5858;
   }

   @Override
   public void method4743(Class46 var1) {
      this.field5858 = var1;
   }

   @Override
   public void method4745(Class9346 var1) {
      var1.method35374();
   }

   @Override
   public void method4747(ItemStack var1) {
   }

   @Override
   public Class1655 method4753() {
      return this.field5857.field5024;
   }

   @Override
   public int method4721() {
      return this.field5859;
   }

   @Override
   public void method4744(int var1) {
      this.field5859 = var1;
   }

   @Override
   public boolean method4746() {
      return true;
   }

   @Override
   public Class9455 method4748() {
      return Class6067.field27195;
   }
}
