package mapped;

public class Class262<T extends Class1086> extends Class219<T, Class2870<T>> {
   private Class7219 field923;
   private static final ResourceLocation field924 = new ResourceLocation("textures/entity/cow/red_mushroom.png");
   private static final ResourceLocation field925 = new ResourceLocation("textures/entity/cow/brown_mushroom.png");
   private static boolean field926 = false;
   private static boolean field927 = false;

   public Class262(Class5714<T, Class2870<T>> class5714) {
      super(class5714);
      this.field923 = new Class7219(class5714.method17881());
      this.field923.method22684(16, 16);
      this.field923.field31032 = 8.0f;
      this.field923.field31034 = 8.0f;
      this.field923.field31036 = Class9679.field45210 / 4.0f;
      int[][] nArrayArray = new int[][]{null, null, {16, 16, 0, 0}, {16, 16, 0, 0}, null, null};
      this.field923.method22691(nArrayArray, -10.0f, 0.0f, 0.0f, 20.0f, 16.0f, 0.0f, 0.0f);
      int[][] nArrayArray2 = new int[][]{null, null, null, null, {16, 16, 0, 0}, {16, 16, 0, 0}};
      this.field923.method22691(nArrayArray2, 0.0f, 0.0f, -10.0f, 0.0f, 16.0f, 20.0f, 0.0f);
   }

   public void method820(Class9332 var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.method3005() && !var4.method3342()) {
         Class217 var13 = Minecraft.getInstance().method1553();
         Class7380 var14 = var4.method5037().method8934();
         ResourceLocation var15 = this.method852(var14);
         Class5422 var16 = null;
         if (var15 != null) {
            var16 = var2.method25597(Class4520.method14310(var15));
         }

         int var17 = Class5712.method17883(var4, 0.0F);
         var1.method35294();
         var1.method35291(0.2F, -0.35F, 0.5);
         var1.method35293(Class7680.field32900.method25286(-48.0F));
         var1.method35292(-1.0F, -1.0F, 1.0F);
         var1.method35291(-0.5, -0.5, -0.5);
         if (var15 == null) {
            var13.method814(var14, var1, var2, var3, var17);
         } else {
            this.field923.method22680(var1, var16, var3, var17);
         }

         var1.method35295();
         var1.method35294();
         var1.method35291(0.2F, -0.35F, 0.5);
         var1.method35293(Class7680.field32900.method25286(42.0F));
         var1.method35291(0.1F, 0.0, -0.6F);
         var1.method35293(Class7680.field32900.method25286(-48.0F));
         var1.method35292(-1.0F, -1.0F, 1.0F);
         var1.method35291(-0.5, -0.5, -0.5);
         if (var15 == null) {
            var13.method814(var14, var1, var2, var3, var17);
         } else {
            this.field923.method22680(var1, var16, var3, var17);
         }

         var1.method35295();
         var1.method35294();
         this.method825().method11191().method22682(var1);
         var1.method35291(0.0, -0.7F, -0.2F);
         var1.method35293(Class7680.field32900.method25286(-78.0F));
         var1.method35292(-1.0F, -1.0F, 1.0F);
         var1.method35291(-0.5, -0.5, -0.5);
         if (var15 == null) {
            var13.method814(var14, var1, var2, var3, var17);
         } else {
            this.field923.method22680(var1, var16, var3, var17);
         }

         var1.method35295();
      }
   }

   private ResourceLocation method852(Class7380 var1) {
      Block var4 = var1.method23383();
      if (var4 == Blocks.RED_MUSHROOM && field926) {
         return field924;
      } else {
         return var4 == Blocks.BROWN_MUSHROOM && field927 ? field925 : null;
      }
   }

   public static void method853() {
      field926 = Class7944.method26866(field924);
      field927 = Class7944.method26866(field925);
   }
}
