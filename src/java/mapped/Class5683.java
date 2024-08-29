package mapped;

public class Class5683 extends Class5651<Class1057, Class2887<Class1057>> {
   public static final ResourceLocation field25048 = new ResourceLocation("textures/" +Class8624.field38782.method26197().method8292()  + ".png");
   public static final ResourceLocation[] field25049 = Class8624.field38783
      .stream()
      .<ResourceLocation>map(var0 -> new ResourceLocation("textures/" + var0.method26197().method8292() + ".png"))
      .<ResourceLocation>toArray(ResourceLocation[]::new);

   public Class5683(EntityRendererManager var1) {
      super(var1, new Class2887<Class1057>(), 0.0F);
      this.method17880(new Class246(this));
   }

   public Vector3d method17867(Class1057 var1, float var2) {
      int var5 = var1.method4854();
      if (var5 > 0 && var1.method4856()) {
         BlockPos var6 = var1.method4849();
         BlockPos var7 = var1.method4855();
         double var8 = (double)((float)var5 - var2) / 6.0;
         var8 *= var8;
         double var10 = (double)(var6.getX() - var7.getX()) * var8;
         double var12 = (double)(var6.getY() - var7.getY()) * var8;
         double var14 = (double)(var6.getZ() - var7.getZ()) * var8;
         return new Vector3d(-var10, -var12, -var14);
      } else {
         return super.method17867(var1, var2);
      }
   }

   public boolean method17854(Class1057 var1, Class7647 var2, double var3, double var5, double var7) {
      if (!super.method17854(var1, var2, var3, var5, var7)) {
         if (var1.method4854() > 0 && var1.method4856()) {
            Vector3d var11 = Vector3d.method11329(var1.method4849());
            Vector3d var12 = Vector3d.method11329(var1.method4855());
            if (var2.method25122(new AxisAlignedBB(var12.field18048, var12.field18049, var12.field18050, var11.field18048, var11.field18049, var11.field18050))) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public ResourceLocation method17843(Class1057 var1) {
      return var1.method4857() != null ? field25049[var1.method4857().method309()] : field25048;
   }

   public void method17842(Class1057 var1, MatrixStack var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4 + 180.0F, var5);
      var2.translate(0.0, 0.5, 0.0);
      var2.method35293(var1.method4848().method536().method532());
      var2.translate(0.0, -0.5, 0.0);
   }
}
