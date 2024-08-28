package mapped;

public class Class6693 extends Class6691 {
   private final Class39 field29314;

   public Class6693() {
      super(1);
      this.field29314 = new Class39();
      this.field29314.method109("id", "minecraft:pig");
   }

   public Class6693(Class39 var1) {
      this(!var1.method119("Weight", 99) ? 1 : var1.method122("Weight"), var1.method130("Entity"));
   }

   public Class6693(int var1, Class39 var2) {
      super(var1);
      this.field29314 = var2;
      ResourceLocation var5 = ResourceLocation.method8289(var2.method126("id"));
      if (var5 == null) {
         var2.method109("id", "minecraft:pig");
      } else {
         var2.method109("id", var5.toString());
      }
   }

   public Class39 method20413() {
      Class39 var3 = new Class39();
      var3.method99("Entity", this.field29314);
      var3.method102("Weight", this.field29309);
      return var3;
   }

   public Class39 method20414() {
      return this.field29314;
   }
}
