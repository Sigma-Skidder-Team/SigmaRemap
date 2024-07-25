package remapped;

public class class_1148 extends class_5923<class_341, class_1057> {
   public class_1148() {
      super(new Identifier("function"), class_1057.class);
   }

   public void method_5089(CompoundNBT var1, class_1057 var2) {
      var1.method_25941("Name", class_1057.method_4641(var2).toString());
   }

   public class_1057 method_5090(CompoundNBT var1) {
      Identifier var4 = new Identifier(var1.method_25965("Name"));
      return new class_1057(var4);
   }
}
