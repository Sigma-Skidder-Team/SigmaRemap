package mapped;

import com.google.common.base.MoreObjects;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4400;

import java.util.Objects;

public class Class9641 {
   private static final Class4520 field45076 = Class4520.method14339(new ResourceLocation("textures/map/map_background.png"));
   private static final Class4520 field45077 = Class4520.method14339(new ResourceLocation("textures/map/map_background_checkerboard.png"));
   private final Minecraft field45078;
   private ItemStack field45079 = ItemStack.EMPTY;
   private ItemStack field45080 = ItemStack.EMPTY;
   private float field45081;
   private float field45082;
   private float field45083;
   private float field45084;
   private final Class8853 field45085;
   private final Class216 field45086;

   public Class9641(Minecraft var1) {
      this.field45078 = var1;
      this.field45085 = var1.method1554();
      this.field45086 = var1.method1555();
   }

   public void method37580(Class880 var1, ItemStack var2, Class2327 var3, boolean var4, MatrixStack var5, Class7733 var6, int var7) {
      Class7992.method27282(var4);
      if (!var2.method32105()) {
         this.field45086.method790(var1, var2, var3, var4, var5, var6, var1.field5024, var7, Class213.field798);
      }

      Class7992.method27282(false);
   }

   private float method37581(float var1) {
      float var4 = 1.0F - var1 / 45.0F + 0.1F;
      var4 = MathHelper.method37777(var4, 0.0F, 1.0F);
      return -MathHelper.method37764(var4 * (float) Math.PI) * 0.5F + 0.5F;
   }

   private void method37582(MatrixStack var1, Class7733 var2, int var3, Class2205 var4) {
      this.field45078.getTextureManager().bindTexture(this.field45078.player.method5371());
      Class5713 var7 = (Class5713)this.field45085.<AbstractClientPlayerEntity>method32212(this.field45078.player);
      var1.method35294();
      float var8 = var4 != Class2205.field14418 ? -1.0F : 1.0F;
      var1.method35293(Class7680.field32900.method25286(92.0F));
      var1.method35293(Class7680.field32898.method25286(45.0F));
      var1.method35293(Class7680.field32902.method25286(var8 * -41.0F));
      var1.method35291((double)(var8 * 0.3F), -1.1F, 0.45F);
      if (var4 != Class2205.field14418) {
         var7.method17891(var1, var2, var3, this.field45078.player);
      } else {
         var7.method17890(var1, var2, var3, this.field45078.player);
      }

      var1.method35295();
   }

   private void method37583(MatrixStack var1, Class7733 var2, int var3, float var4, Class2205 var5, float var6, ItemStack var7) {
      float var10 = var5 != Class2205.field14418 ? -1.0F : 1.0F;
      var1.method35291((double)(var10 * 0.125F), -0.125, 0.0);
      if (!this.field45078.player.method3342()) {
         var1.method35294();
         var1.method35293(Class7680.field32902.method25286(var10 * 10.0F));
         this.method37586(var1, var2, var3, var4, var6, var5);
         var1.method35295();
      }

      var1.method35294();
      var1.method35291((double)(var10 * 0.51F), (double)(-0.08F + var4 * -1.2F), -0.75);
      float var11 = MathHelper.method37765(var6);
      float var12 = MathHelper.method37763(var11 * (float) Math.PI);
      float var13 = -0.5F * var12;
      float var14 = 0.4F * MathHelper.method37763(var11 * (float) (Math.PI * 2));
      float var15 = -0.3F * MathHelper.method37763(var6 * (float) Math.PI);
      var1.method35291((double)(var10 * var13), (double)(var14 - 0.3F * var12), (double)var15);
      var1.method35293(Class7680.field32898.method25286(var12 * -45.0F));
      var1.method35293(Class7680.field32900.method25286(var10 * var12 * -30.0F));
      this.method37585(var1, var2, var3, var7);
      var1.method35295();
   }

   private void method37584(MatrixStack var1, Class7733 var2, int var3, float var4, float var5, float var6) {
      float var9 = MathHelper.method37765(var6);
      float var10 = -0.2F * MathHelper.method37763(var6 * (float) Math.PI);
      float var11 = -0.4F * MathHelper.method37763(var9 * (float) Math.PI);
      var1.method35291(0.0, (double)(-var10 / 2.0F), (double)var11);
      float var12 = this.method37581(var4);
      var1.method35291(0.0, (double)(0.04F + var5 * -1.2F + var12 * -0.5F), -0.72F);
      var1.method35293(Class7680.field32898.method25286(var12 * -85.0F));
      if (!this.field45078.player.method3342()) {
         var1.method35294();
         var1.method35293(Class7680.field32900.method25286(90.0F));
         this.method37582(var1, var2, var3, Class2205.field14418);
         this.method37582(var1, var2, var3, Class2205.field14417);
         var1.method35295();
      }

      float var13 = MathHelper.method37763(var9 * (float) Math.PI);
      var1.method35293(Class7680.field32898.method25286(var13 * 20.0F));
      var1.method35292(2.0F, 2.0F, 2.0F);
      this.method37585(var1, var2, var3, this.field45079);
   }

   private void method37585(MatrixStack var1, Class7733 var2, int var3, ItemStack var4) {
      var1.method35293(Class7680.field32900.method25286(180.0F));
      var1.method35293(Class7680.field32902.method25286(180.0F));
      var1.method35292(0.38F, 0.38F, 0.38F);
      var1.method35291(-0.5, -0.5, 0.0);
      var1.method35292(0.0078125F, 0.0078125F, 0.0078125F);
      Class7529 var7 = Class3316.method11861(var4, this.field45078.world);
      Class5422 var8 = var2.method25597(var7 != null ? field45077 : field45076);
      Class9367 var9 = var1.method35296().method32361();
      var8.method17040(var9, -7.0F, 135.0F, 0.0F).method17026(255, 255, 255, 255).method17027(0.0F, 1.0F).method17034(var3).method17031();
      var8.method17040(var9, 135.0F, 135.0F, 0.0F).method17026(255, 255, 255, 255).method17027(1.0F, 1.0F).method17034(var3).method17031();
      var8.method17040(var9, 135.0F, -7.0F, 0.0F).method17026(255, 255, 255, 255).method17027(1.0F, 0.0F).method17034(var3).method17031();
      var8.method17040(var9, -7.0F, -7.0F, 0.0F).method17026(255, 255, 255, 255).method17027(0.0F, 0.0F).method17034(var3).method17031();
      if (var7 != null) {
         this.field45078.gameRenderer.method756().method593(var1, var2, var7, false, var3);
      }
   }

   private void method37586(MatrixStack var1, Class7733 var2, int var3, float var4, float var5, Class2205 var6) {
      boolean var9 = var6 != Class2205.field14417;
      float var10 = !var9 ? -1.0F : 1.0F;
      float var11 = MathHelper.method37765(var5);
      float var12 = -0.3F * MathHelper.method37763(var11 * (float) Math.PI);
      float var13 = 0.4F * MathHelper.method37763(var11 * (float) (Math.PI * 2));
      float var14 = -0.4F * MathHelper.method37763(var5 * (float) Math.PI);
      var1.method35291((double)(var10 * (var12 + 0.64000005F)), (double)(var13 + -0.6F + var4 * -0.6F), (double)(var14 + -0.71999997F));
      var1.method35293(Class7680.field32900.method25286(var10 * 45.0F));
      float var15 = MathHelper.method37763(var5 * var5 * (float) Math.PI);
      float var16 = MathHelper.method37763(var11 * (float) Math.PI);
      var1.method35293(Class7680.field32900.method25286(var10 * var16 * 70.0F));
      var1.method35293(Class7680.field32902.method25286(var10 * var15 * -20.0F));
      ClientPlayerEntity var17 = this.field45078.player;
      this.field45078.getTextureManager().bindTexture(var17.method5371());
      var1.method35291((double)(var10 * -1.0F), 3.6F, 3.5);
      var1.method35293(Class7680.field32902.method25286(var10 * 120.0F));
      var1.method35293(Class7680.field32898.method25286(200.0F));
      var1.method35293(Class7680.field32900.method25286(var10 * -135.0F));
      var1.method35291((double)(var10 * 5.6F), 0.0, 0.0);
      Class5713 var18 = (Class5713)this.field45085.<AbstractClientPlayerEntity>method32212(var17);
      if (!var9) {
         var18.method17891(var1, var2, var3, var17);
      } else {
         var18.method17890(var1, var2, var3, var17);
      }
   }

   private void method37587(MatrixStack var1, float var2, Class2205 var3, ItemStack var4) {
      float var7 = (float)this.field45078.player.method3159() - var2 + 1.0F;
      float var8 = var7 / (float)var4.method32137();
      if (var8 < 0.8F) {
         float var9 = MathHelper.method37771(MathHelper.method37764(var7 / 4.0F * (float) Math.PI) * 0.1F);
         var1.method35291(0.0, (double)var9, 0.0);
      }

      float var11 = 1.0F - (float)Math.pow((double)var8, 27.0);
      int var10 = var3 != Class2205.field14418 ? -1 : 1;
      var1.method35291((double)(var11 * 0.6F * (float)var10), (double)(var11 * -0.5F), (double)(var11 * 0.0F));
      var1.method35293(Class7680.field32900.method25286((float)var10 * var11 * 90.0F));
      var1.method35293(Class7680.field32898.method25286(var11 * 10.0F));
      var1.method35293(Class7680.field32902.method25286((float)var10 * var11 * 30.0F));
   }

   private void method37588(MatrixStack var1, Class2205 var2, float var3) {
      int var6 = var2 != Class2205.field14418 ? -1 : 1;
      float var7 = MathHelper.method37763(var3 * var3 * (float) Math.PI);
      var1.method35293(Class7680.field32900.method25286((float)var6 * (45.0F + var7 * -20.0F)));
      float var8 = MathHelper.method37763(MathHelper.method37765(var3) * (float) Math.PI);
      var1.method35293(Class7680.field32902.method25286((float)var6 * var8 * -20.0F));
      var1.method35293(Class7680.field32898.method25286(var8 * -80.0F));
      var1.method35293(Class7680.field32900.method25286((float)var6 * -45.0F));
   }

   private void method37589(MatrixStack var1, Class2205 var2, float var3) {
      int var6 = var2 != Class2205.field14418 ? -1 : 1;
      var1.method35291((double)((float)var6 * 0.56F), (double)(-0.52F + var3 * -0.6F), -0.72F);
   }

   public void method37590(float var1, MatrixStack var2, Class7735 var3, ClientPlayerEntity var4, int var5) {
      float var8 = var4.method3137(var1);
      Hand var9 = (Hand)MoreObjects.firstNonNull(var4.field4948, Hand.field182);
      float var10 = MathHelper.method37821(var1, var4.field5034, var4.field5032);
      boolean var11 = true;
      boolean var12 = true;
      if (!var4.method3148()) {
         ItemStack var13 = var4.method3090();
         ItemStack var14 = var4.method3091();
         if (var13.method32107() instanceof Class3261 && Class3261.method11755(var13)) {
            var12 = !var11;
         }

         if (var14.method32107() instanceof Class3261 && Class3261.method11755(var14)) {
            var11 = !var13.method32105();
            var12 = !var11;
         }
      } else {
         ItemStack var17 = var4.method3158();
         if (var17.method32107() instanceof Class3262) {
            var11 = var4.method3149() == Hand.field182;
            var12 = !var11;
         }

         Hand var19 = var4.method3149();
         if (var19 == Hand.field182) {
            ItemStack var15 = var4.method3091();
            if (var15.method32107() instanceof Class3261 && Class3261.method11755(var15)) {
               var12 = false;
            }
         }
      }

      float var18 = MathHelper.method37821(var1, var4.field6138, var4.field6136);
      float var20 = MathHelper.method37821(var1, var4.field6137, var4.field6135);
      var2.method35293(Class7680.field32898.method25286((var4.method3282(var1) - var18) * 0.1F));
      var2.method35293(Class7680.field32900.method25286((var4.method3136(var1) - var20) * 0.1F));
      if (var11) {
         float var21 = var9 != Hand.field182 ? 0.0F : var8;
         float var16 = 1.0F - MathHelper.method37821(var1, this.field45082, this.field45081);
         if (!Class9299.field42894.method20214()
            || !Class9299.method35056(Class9299.field42894, Hand.field182, var2, var3, var5, var1, var10, var21, var16, this.field45079)) {
            this.method37591(var4, var1, var10, Hand.field182, var21, this.field45079, var16, var2, var3, var5);
         }
      }

      if (var12) {
         float var22 = var9 != Hand.field183 ? 0.0F : var8;
         float var23 = 1.0F - MathHelper.method37821(var1, this.field45084, this.field45083);
         if (!Class9299.field42894.method20214()
            || !Class9299.method35056(Class9299.field42894, Hand.field183, var2, var3, var5, var1, var10, var22, var23, this.field45080)) {
            this.method37591(var4, var1, var10, Hand.field183, var22, this.field45080, var23, var2, var3, var5);
         }
      }

      var3.method25602();
   }

   private void method37591(
           AbstractClientPlayerEntity var1, float var2, float var3, Hand var4, float var5, ItemStack var6, float var7, MatrixStack var8, Class7733 var9, int var10
   ) {
      if (!Class7944.method26921() || !Class8981.method33153(var4)) {
         boolean var13 = var4 == Hand.field182;
         Class2205 var14 = var13 ? var1.method2967() : var1.method2967().method8920();
         var8.method35294();
         if (var6.method32105()) {
            if (var13 && !var1.method3342()) {
               this.method37586(var8, var9, var10, var7, var5, var14);
            }
         } else if (var6.method32107() instanceof Class3316) {
            if (var13 && this.field45080.method32105()) {
               this.method37584(var8, var9, var10, var3, var7, var5);
            } else {
               this.method37583(var8, var9, var10, var7, var14, var5, var6);
            }
         } else if (var6.method32107() instanceof Class3261) {
            boolean var25 = Class3261.method11755(var6);
            boolean var27 = var14 == Class2205.field14418;
            int var30 = var27 ? 1 : -1;
            if (var1.method3148() && var1.method3159() > 0 && var1.method3149() == var4) {
               this.method37589(var8, var14, var7);
               var8.method35291((double)((float)var30 * -0.4785682F), -0.094387F, 0.05731531F);
               var8.method35293(Class7680.field32898.method25286(-11.935F));
               var8.method35293(Class7680.field32900.method25286((float)var30 * 65.3F));
               var8.method35293(Class7680.field32902.method25286((float)var30 * -9.785F));
               float var33 = (float)var6.method32137() - ((float)this.field45078.player.method3159() - var2 + 1.0F);
               float var37 = var33 / (float)Class3261.method11767(var6);
               if (var37 > 1.0F) {
                  var37 = 1.0F;
               }

               if (var37 > 0.1F) {
                  float var41 = MathHelper.method37763((var33 - 0.1F) * 1.3F);
                  float var43 = var37 - 0.1F;
                  float var45 = var41 * var43;
                  var8.method35291((double)(var45 * 0.0F), (double)(var45 * 0.004F), (double)(var45 * 0.0F));
               }

               var8.method35291((double)(var37 * 0.0F), (double)(var37 * 0.0F), (double)(var37 * 0.04F));
               var8.method35292(1.0F, 1.0F, 1.0F + var37 * 0.2F);
               var8.method35293(Class7680.field32899.method25286((float)var30 * 45.0F));
            } else {
               float var32 = -0.4F * MathHelper.method37763(MathHelper.method37765(var5) * (float) Math.PI);
               float var36 = 0.2F * MathHelper.method37763(MathHelper.method37765(var5) * (float) (Math.PI * 2));
               float var40 = -0.2F * MathHelper.method37763(var5 * (float) Math.PI);
               var8.method35291((double)((float)var30 * var32), (double)var36, (double)var40);
               this.method37589(var8, var14, var7);
               this.method37588(var8, var14, var5);
               if (var25 && var5 < 0.001F) {
                  var8.method35291((double)((float)var30 * -0.641864F), 0.0, 0.0);
                  var8.method35293(Class7680.field32900.method25286((float)var30 * 10.0F));
               }
            }

            this.method37580(var1, var6, var27 ? Class2327.field15928 : Class2327.field15927, !var27, var8, var9, var10);
         } else {
            boolean var15 = var14 == Class2205.field14418;
            Class4400 var16 = new Class4400(true, var5, var7, var14, var6, var8);

            if (var1.method3148() && var1.method3159() > 0 && var1.method3149() == var4) {
               int var29 = var15 ? 1 : -1;
               switch (Class6063.field26304[var6.method32138().ordinal()]) {
                  case 1:
                     this.method37589(var8, var14, var7);
                     break;
                  case 2:
                  case 3:
                     this.method37587(var8, var2, var14, var6);
                     this.method37589(var8, var14, var7);
                     break;
                  case 4:
                     this.method37589(var8, var14, var7);
                     break;
                  case 5:
                     this.method37589(var8, var14, var7);
                     var8.method35291((double)((float)var29 * -0.2785682F), 0.18344387F, 0.15731531F);
                     var8.method35293(Class7680.field32898.method25286(-13.935F));
                     var8.method35293(Class7680.field32900.method25286((float)var29 * 35.3F));
                     var8.method35293(Class7680.field32902.method25286((float)var29 * -9.785F));
                     float var31 = (float)var6.method32137() - ((float)this.field45078.player.method3159() - var2 + 1.0F);
                     float var34 = var31 / 20.0F;
                     var34 = (var34 * var34 + var34 * 2.0F) / 3.0F;
                     if (var34 > 1.0F) {
                        var34 = 1.0F;
                     }

                     if (var34 > 0.1F) {
                        float var39 = MathHelper.method37763((var31 - 0.1F) * 1.3F);
                        float var42 = var34 - 0.1F;
                        float var44 = var39 * var42;
                        var8.method35291((double)(var44 * 0.0F), (double)(var44 * 0.004F), (double)(var44 * 0.0F));
                     }

                     var8.method35291((double)(var34 * 0.0F), (double)(var34 * 0.0F), (double)(var34 * 0.04F));
                     var8.method35292(1.0F, 1.0F, 1.0F + var34 * 0.2F);
                     var8.method35293(Class7680.field32899.method25286((float)var29 * 45.0F));
                     break;
                  case 6:
                     this.method37589(var8, var14, var7);
                     var8.method35291((double)((float)var29 * -0.5F), 0.7F, 0.1F);
                     var8.method35293(Class7680.field32898.method25286(-55.0F));
                     var8.method35293(Class7680.field32900.method25286((float)var29 * 35.3F));
                     var8.method35293(Class7680.field32902.method25286((float)var29 * -9.785F));
                     float var38 = (float)var6.method32137() - ((float)this.field45078.player.method3159() - var2 + 1.0F);
                     float var21 = var38 / 10.0F;
                     if (var21 > 1.0F) {
                        var21 = 1.0F;
                     }

                     if (var21 > 0.1F) {
                        float var22 = MathHelper.method37763((var38 - 0.1F) * 1.3F);
                        float var23 = var21 - 0.1F;
                        float var24 = var22 * var23;
                        var8.method35291((double)(var24 * 0.0F), (double)(var24 * 0.004F), (double)(var24 * 0.0F));
                     }

                     var8.method35291(0.0, 0.0, (double)(var21 * 0.2F));
                     var8.method35292(1.0F, 1.0F, 1.0F + var21 * 0.2F);
                     var8.method35293(Class7680.field32899.method25286((float)var29 * 45.0F));
               }
            } else if (var1.method3130()) {
               this.method37589(var8, var14, var7);
               int var17 = var15 ? 1 : -1;
               var8.method35291((double)((float)var17 * -0.4F), 0.8F, 0.3F);
               var8.method35293(Class7680.field32900.method25286((float)var17 * 65.0F));
               var8.method35293(Class7680.field32902.method25286((float)var17 * -85.0F));
            } else {
               Client.getInstance().getEventManager().call(var16);

               if (!var16.isCancelled()) {
                  float var28 = -0.4F * MathHelper.method37763(MathHelper.method37765(var5) * (float) Math.PI);
                  float var18 = 0.2F * MathHelper.method37763(MathHelper.method37765(var5) * (float) (Math.PI * 2));
                  float var19 = -0.2F * MathHelper.method37763(var5 * (float) Math.PI);
                  int var20 = var15 ? 1 : -1;
                  var8.method35291((double)((float)var20 * var28), (double)var18, (double)var19);
                  this.method37589(var8, var14, var7);
                  this.method37588(var8, var14, var5);
               }
            }

            if (var16 == null || var16.method13930()) {
               this.method37580(var1, var6, var15 ? Class2327.field15928 : Class2327.field15927, !var15, var8, var9, var10);
            }

            var16 = new Class4400(false, var5, var7, var14, var6, var8);
            Client.getInstance().getEventManager().call(var16);
         }

         var8.method35295();
      }
   }

   public void method37592() {
      this.field45082 = this.field45081;
      this.field45084 = this.field45083;
      ClientPlayerEntity var3 = this.field45078.player;
      ItemStack var4 = var3.method3090();
      ItemStack var5 = var3.method3091();
      if (ItemStack.method32128(this.field45079, var4)) {
         this.field45079 = var4;
      }

      if (ItemStack.method32128(this.field45080, var5)) {
         this.field45080 = var5;
      }

      if (!var3.method5410()) {
         float var6 = var3.method2974(1.0F);
         if (Class9299.field42896.method20214()) {
            boolean var7 = Class9299.method35056(Class9299.field42896, this.field45079, var4, var3.field4902.field5443);
            boolean var8 = Class9299.method35056(Class9299.field42896, this.field45080, var5, -1);
            if (!var7 && !Objects.equals(this.field45079, var4)) {
               this.field45079 = var4;
            }

            if (!var8 && !Objects.equals(this.field45080, var5)) {
               this.field45080 = var5;
            }
         }

         this.field45081 = this.field45081 + MathHelper.method37777((this.field45079 != var4 ? 0.0F : var6 * var6 * var6) - this.field45081, -0.4F, 0.4F);
         this.field45083 = this.field45083 + MathHelper.method37777((float)(this.field45080 != var5 ? 0 : 1) - this.field45083, -0.4F, 0.4F);
      } else {
         this.field45081 = MathHelper.method37777(this.field45081 - 0.4F, 0.0F, 1.0F);
         this.field45083 = MathHelper.method37777(this.field45083 - 0.4F, 0.0F, 1.0F);
      }

      if (this.field45081 < 0.1F) {
         this.field45079 = var4;
         if (Class7944.method26921()) {
            Class8981.method33147(this.field45079);
         }
      }

      if (this.field45083 < 0.1F) {
         this.field45080 = var5;
         if (Class7944.method26921()) {
            Class8981.method33148(this.field45080);
         }
      }
   }

   public void method37593(Hand var1) {
      if (var1 != Hand.field182) {
         this.field45083 = 0.0F;
      } else {
         this.field45081 = 0.0F;
      }
   }
}
