package mapped;

import com.mentalfrostbyte.jello.Client;

public class Class9624 {
   private static String[] field45004;
   private boolean field45005;
   private Class1665 field45006;
   private Entity field45007;
   private Vector3d field45008 = Vector3d.field18047;
   private final Mutable field45009 = new Mutable();
   private final Class7680 field45010 = new Class7680(0.0F, 0.0F, 1.0F);
   private final Class7680 field45011 = new Class7680(0.0F, 1.0F, 0.0F);
   private final Class7680 field45012 = new Class7680(1.0F, 0.0F, 0.0F);
   private float field45013;
   private float field45014;
   private final Class8661 field45015 = new Class8661(0.0F, 0.0F, 0.0F, 1.0F);
   private boolean field45016;
   private boolean field45017;
   private float field45018;
   private float field45019;

   public void method37497(Class1665 var1, Entity var2, boolean var3, boolean var4, float var5) {
      this.field45005 = true;
      this.field45006 = var1;
      this.field45007 = var2;
      this.field45016 = var3;
      this.field45017 = var4;
      this.method37501(var2.method3136(var5), var2.method3282(var5));
      this.method37502(
         MathHelper.method37822((double)var5, var2.field5025, var2.getPosX()),
         MathHelper.method37822((double)var5, var2.field5026, var2.getPosY()) + (double) MathHelper.method37821(var5, this.field45019, this.field45018),
         MathHelper.method37822((double)var5, var2.field5027, var2.getPosZ())
      );
      if (!var3) {
         if (var2 instanceof Class880 && ((Class880)var2).isSleeping()) {
            Direction var8 = ((Class880)var2).method3179();
            this.method37501(var8 == null ? 0.0F : var8.method551() - 180.0F, 0.0F);
            this.method37500(0.0, 0.3, 0.0);
         }
      } else {
         if (var4) {
            this.method37501(this.field45014 + 180.0F, -this.field45013);
         }

         this.method37500(-this.method37499(4.0), 0.0, 0.0);
      }
   }

   public void method37498() {
      if (this.field45007 != null) {
         this.field45019 = this.field45018;
         this.field45018 = this.field45018 + (this.field45007.method3393() - this.field45018) * 0.5F;
      }
   }

   private double method37499(double var1) {
      for (int var5 = 0; var5 < 8; var5++) {
         float var6 = (float)((var5 & 1) * 2 - 1);
         float var7 = (float)((var5 >> 1 & 1) * 2 - 1);
         float var8 = (float)((var5 >> 2 & 1) * 2 - 1);
         var6 *= 0.1F;
         var7 *= 0.1F;
         var8 *= 0.1F;
         Vector3d var9 = this.field45008.method11339((double)var6, (double)var7, (double)var8);
         Vector3d var10 = new Vector3d(
            this.field45008.field18048 - (double)this.field45010.method25269() * var1 + (double)var6 + (double)var8,
            this.field45008.field18049 - (double)this.field45010.method25270() * var1 + (double)var7,
            this.field45008.field18050 - (double)this.field45010.method25271() * var1 + (double)var8
         );
         Class8711 var11 = this.field45006.method7036(new Class6809(var9, var10, Class2271.field14776, Class1985.field12962, this.field45007));
         if (var11.method31417() != Class2100.field13689) {
            double var12 = var11.method31419().method11341(this.field45008);
            if (var12 < var1 && !Client.getInstance().getModuleManager().method14662(Class5273.class).method15996()) {
               var1 = var12;
            }
         }
      }

      return var1;
   }

   public void method37500(double var1, double var3, double var5) {
      double var9 = (double)this.field45010.method25269() * var1 + (double)this.field45011.method25269() * var3 + (double)this.field45012.method25269() * var5;
      double var11 = (double)this.field45010.method25270() * var1 + (double)this.field45011.method25270() * var3 + (double)this.field45012.method25270() * var5;
      double var13 = (double)this.field45010.method25271() * var1 + (double)this.field45011.method25271() * var3 + (double)this.field45012.method25271() * var5;
      this.method37503(new Vector3d(this.field45008.field18048 + var9, this.field45008.field18049 + var11, this.field45008.field18050 + var13));
   }

   public void method37501(float var1, float var2) {
      this.field45013 = var2;
      this.field45014 = var1;
      this.field45015.method31185(0.0F, 0.0F, 0.0F, 1.0F);
      this.field45015.method31182(Class7680.field32900.method25286(-var1));
      this.field45015.method31182(Class7680.field32898.method25286(var2));
      this.field45010.method25275(0.0F, 0.0F, 1.0F);
      this.field45010.method25283(this.field45015);
      this.field45011.method25275(0.0F, 1.0F, 0.0F);
      this.field45011.method25283(this.field45015);
      this.field45012.method25275(1.0F, 0.0F, 0.0F);
      this.field45012.method25283(this.field45015);
   }

   public void method37502(double var1, double var3, double var5) {
      this.method37503(new Vector3d(var1, var3, var5));
   }

   public void method37503(Vector3d var1) {
      this.field45008 = var1;
      this.field45009.method8373(var1.field18048, var1.field18049, var1.field18050);
   }

   public Vector3d method37504() {
      return this.field45008;
   }

   public BlockPos method37505() {
      return this.field45009;
   }

   public float method37506() {
      return this.field45013;
   }

   public float method37507() {
      return this.field45014;
   }

   public Class8661 method37508() {
      return this.field45015;
   }

   public Entity method37509() {
      return this.field45007;
   }

   public boolean method37510() {
      return this.field45005;
   }

   public boolean method37511() {
      return this.field45016;
   }

   public Class7379 method37512() {
      if (!this.field45005) {
         return Class9479.field44064.method25049();
      } else {
         Class7379 var3 = this.field45006.method6739(this.field45009);
         return !var3.method23474()
               && this.field45008.field18049 >= (double)((float)this.field45009.getY() + var3.method23475(this.field45006, this.field45009))
            ? Class9479.field44064.method25049()
            : var3;
      }
   }

   public Class7380 method37513() {
      return this.field45005 ? this.field45006.method6738(this.field45009) : Blocks.AIR.method11579();
   }

   public void method37514(float var1, float var2) {
      this.field45014 = var1;
      this.field45013 = var2;
   }

   public Class7380 method37515() {
      if (this.field45005) {
         Class7380 var3 = this.field45006.method6738(this.field45009);
         if (Class9299.field42828.method20214()) {
            var3 = (Class7380)Class9299.method35070(var3, Class9299.field42828, this.field45006, this.field45009, this.field45008);
         }

         return var3;
      } else {
         return Blocks.AIR.method11579();
      }
   }

   public final Class7680 method37516() {
      return this.field45010;
   }

   public final Class7680 method37517() {
      return this.field45011;
   }

   public void method37518() {
      this.field45006 = null;
      this.field45007 = null;
      this.field45005 = false;
   }
}
