package remapped;

public class class_4877 extends class_1047 {
   private final CompoundNBT field_24267;

   public class_4877() {
      super(1);
      this.field_24267 = new CompoundNBT();
      this.field_24267.method_25941("id", "minecraft:pig");
   }

   public class_4877(CompoundNBT var1) {
      this(!var1.method_25939("Weight", 99) ? 1 : var1.method_25947("Weight"), var1.method_25937("Entity"));
   }

   public class_4877(int var1, CompoundNBT var2) {
      super(var1);
      this.field_24267 = var2;
      Identifier var5 = Identifier.method_21455(var2.method_25965("id"));
      if (var5 == null) {
         var2.method_25941("id", "minecraft:pig");
      } else {
         var2.method_25941("id", var5.toString());
      }
   }

   public CompoundNBT method_22390() {
      CompoundNBT var3 = new CompoundNBT();
      var3.method_25946("Entity", this.field_24267);
      var3.method_25931("Weight", this.field_5753);
      return var3;
   }

   public CompoundNBT method_22391() {
      return this.field_24267;
   }
}
