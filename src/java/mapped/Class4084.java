package mapped;

public class Class4084 extends Class4057 {
   public Class4084() {
      super(Class4387.field21428, "sign", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2848();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2848) {
         Class2848 var5 = (Class2848)var1;
         if (!var2.equals("board")) {
            return !var2.equals("stick") ? null : (Class7219)Class9299.field43100.method36565(var5, 1);
         } else {
            return (Class7219)Class9299.field43100.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"board", "stick"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      TileEntityRendererDispatcher var5 = TileEntityRendererDispatcher.instance;
      Object var6 = var5.method27968(Class4387.field21428);
      if (var6 instanceof Class5947) {
         if (((Class5942)var6).method18463() == null) {
            var6 = new Class5947(var5);
         }

         if (Class9299.field43167.method20238()) {
            Class9299.method35082(var6, Class9299.field43167, var1);
            return (Class9492)var6;
         } else {
            Class7944.method26811("Field not found: TileEntitySignRenderer.model");
            return null;
         }
      } else {
         return null;
      }
   }
}
