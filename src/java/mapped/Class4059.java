package mapped;

public class Class4059 extends Class4057 {
   public Class4059() {
      this("end_crystal");
   }

   public Class4059(String var1) {
      super(EntityType.field41023, var1, 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2849();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2849) {
         Class2849 var5 = (Class2849)var1;
         if (!var2.equals("cube")) {
            if (!var2.equals("glass")) {
               return !var2.equals("base") ? null : var5.field17654;
            } else {
               return var5.field17653;
            }
         } else {
            return var5.field17652;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"cube", "glass", "base"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5715 var6 = var5.method32232().get(EntityType.field41023);
      if (var6 instanceof Class5723) {
         Class5723 var7 = (Class5723)var6;
         if (var7.method17898() == null) {
            var7 = new Class5723(var5);
         }

         if (var1 instanceof Class2849) {
            Class2849 var8 = (Class2849)var1;
            var7 = var8.method11175(var7);
            var7.field25098 = var2;
            return (Class9492)var7;
         } else {
            Class7944.method26811("Not a EnderCrystalModel model: " + var1);
            return null;
         }
      } else {
         Class7944.method26811("Not an instance of RenderEnderCrystal: " + var6);
         return null;
      }
   }
}
