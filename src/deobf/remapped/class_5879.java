package remapped;

public class class_5879 extends class_7164<class_9310, class_9166<class_9310>> {
   private static final Identifier[] field_29858 = new Identifier[]{
      new Identifier("textures/entity/llama/creamy.png"),
      new Identifier("textures/entity/llama/white.png"),
      new Identifier("textures/entity/llama/brown.png"),
      new Identifier("textures/entity/llama/gray.png")
   };

   public class_5879(class_6122 var1) {
      super(var1, new class_9166<class_9310>(0.0F), 0.7F);
      this.method_29100(new class_6418(this));
   }

   public Identifier method_26812(class_9310 var1) {
      return field_29858[var1.method_42977()];
   }
}
