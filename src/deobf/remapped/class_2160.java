package remapped;

public class class_2160<T extends class_5886, M extends class_2344<T>> extends class_7164<T, M> {
   private static final Identifier field_10775 = new Identifier("textures/entity/steve.png");

   public class_2160(class_6122 var1, M var2, float var3) {
      this(var1, (M)var2, var3, 1.0F, 1.0F, 1.0F);
   }

   public class_2160(class_6122 var1, M var2, float var3, float var4, float var5, float var6) {
      super(var1, (M)var2, var3);
      this.method_29100(new class_8386<T, M>(this, var4, var5, var6));
      this.method_29100(new class_8062<T, M>(this));
      this.method_29100(new class_6329<T, M>(this));
   }

   public Identifier method_10053(T var1) {
      return field_10775;
   }
}
