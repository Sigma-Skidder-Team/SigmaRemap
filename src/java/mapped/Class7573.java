package mapped;

public class Class7573 extends Class7574 {
   private static String[] field32513;
   public final Class960 field32514;

   public Class7573(Class960 var1) {
      this.field32514 = var1;
   }

   @Override
   public void method24785(int var1) {
      this.field32514.field5324.method6787(this.field32514.field5325, Class8487.field36532, var1, 0);
   }

   @Override
   public Class1655 method24786() {
      return this.field32514.field5324;
   }

   @Override
   public BlockPos method24787() {
      return this.field32514.field5325;
   }

   @Override
   public void method24788(Class6693 var1) {
      super.method24788(var1);
      if (this.method24786() != null) {
         Class7380 var4 = this.method24786().method6738(this.method24787());
         this.method24786().method6731(this.field32514.field5325, var4, var4, 4);
      }
   }
}
