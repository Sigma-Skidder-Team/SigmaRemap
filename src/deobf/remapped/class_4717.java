package remapped;

public class class_4717 extends class_9153 {
   private static String[] field_22887;
   private boolean field_22886 = false;
   private class_1331 field_22889 = null;
   private Entity field_22888 = null;

   public class_4717(MinecraftClient var1, class_1092 var2) {
      super(var1, var2);
   }

   @Override
   public boolean method_42142(class_1331 var1, Direction var2) {
      this.field_22886 = true;
      this.field_22889 = var1;
      boolean var5 = super.method_42142(var1, var2);
      this.field_22886 = false;
      return var5;
   }

   @Override
   public boolean method_42163(class_1331 var1, Direction var2) {
      this.field_22886 = true;
      this.field_22889 = var1;
      boolean var5 = super.method_42163(var1, var2);
      this.field_22886 = false;
      return var5;
   }

   @Override
   public class_6910 method_42155(class_704 var1, World var2, class_2584 var3) {
      this.field_22886 = true;
      class_6910 var6 = super.method_42155(var1, var2, var3);
      this.field_22886 = false;
      return var6;
   }

   @Override
   public class_6910 method_42147(class_5989 var1, class_174 var2, class_2584 var3, class_9529 var4) {
      this.field_22886 = true;
      this.field_22889 = var4.method_43955();
      class_6910 var7 = super.method_42147(var1, var2, var3, var4);
      this.field_22886 = false;
      return var7;
   }

   @Override
   public class_6910 method_42144(class_704 var1, Entity var2, class_2584 var3) {
      this.field_22888 = var2;
      return super.method_42144(var1, var2, var3);
   }

   @Override
   public class_6910 method_42145(class_704 var1, Entity var2, class_5631 var3, class_2584 var4) {
      this.field_22888 = var2;
      return super.method_42145(var1, var2, var3, var4);
   }

   public boolean method_21813() {
      return this.field_22886;
   }

   public class_1331 method_21812() {
      return this.field_22889;
   }

   public Entity method_21814() {
      return this.field_22888;
   }
}
