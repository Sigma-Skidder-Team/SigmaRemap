package mapped;

import com.google.common.collect.Lists;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4410;
import com.mentalfrostbyte.jello.event.impl.Class4433;
import net.minecraft.util.text.TextFormatting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.List;

public abstract class Class5712<T extends Class880, M extends Class2827<T>> extends Class5715<T> implements Class5714<T, M> {
   private static final Logger field25085 = LogManager.getLogger();
   public M field25086;
   public final List<Class219<T, M>> field25087 = Lists.newArrayList();
   public Class880 field25088;
   public float field25089;
   public float field25090;
   public float field25091;
   public float field25092;
   public float field25093;
   public float field25094;
   public static final boolean field25095 = Boolean.getBoolean("animate.model.living");
   public float field25096 = 1.0F;

   public Class5712(Class8853 var1, M var2, float var3) {
      super(var1);
      this.field25086 = (M)var2;
      this.field25098 = var3;
   }

   public final boolean method17880(Class219<T, M> var1) {
      return this.field25087.add(var1);
   }

   @Override
   public M method17881() {
      return this.field25086;
   }

   public void method17853(T var1, float var2, float var3, Class9332 var4, Class7733 var5, int var6) {
      if (!Class9299.field42990.method20241() || !Class9299.method35085(Class9299.field42990, var1, this, var3, var4, var5, var6)) {
         if (field25095) {
            var1.field4960 = 1.0F;
         }

         var4.method35294();
         this.field25086.field17600 = this.method17885((T)var1, var3);
         this.field25086.field17601 = var1.method3328();
         if (Class9299.field42838.method20214()) {
            this.field25086.field17601 = var1.method3328() && var1.getRidingEntity() != null && Class9299.method35064(var1.getRidingEntity(), Class9299.field42838);
         }

         this.field25086.field17602 = var1.method3005();
         float var9 = MathHelper.method37827(var3, var1.field4966, var1.field4965);
         float var10 = MathHelper.method37827(var3, var1.field4968, var1.field4967);
         float var11 = var10 - var9;
         if (this.field25086.field17601 && var1.getRidingEntity() instanceof Class880) {
            Class880 var12 = (Class880)var1.getRidingEntity();
            var9 = MathHelper.method37827(var3, var12.field4966, var12.field4965);
            var11 = var10 - var9;
            float var13 = MathHelper.method37792(var11);
            if (var13 < -85.0F) {
               var13 = -85.0F;
            }

            if (var13 >= 85.0F) {
               var13 = 85.0F;
            }

            var9 = var10 - var13;
            if (var13 * var13 > 2500.0F) {
               var9 += var13 * 0.2F;
            }

            var11 = var10 - var9;
         }

         float var31 = MathHelper.method37821(var3, var1.field5034, var1.field5032);
         Class4410 var33 = new Class4410(var9, var10, var11, var31, var3, var1);
         Client.getInstance().getEventManager().call(var33);
         if (var33.isCancelled()) {
            var4.method35295();
            return;
         }

         var9 = var33.method13944();
         var10 = var33.method13945();
         var11 = var33.method13946();
         var31 = var33.method13947();
         if (var1.method3212() == Class2090.field13621) {
            Direction var14 = var1.method3179();
            if (var14 != null) {
               float var15 = var1.method3392(Class2090.field13619) - 0.1F;
               var4.method35291((double)((float)(-var14.method539()) * var15), 0.0, (double)((float)(-var14.method541()) * var15));
            }
         }

         float var34 = this.method17871((T)var1, var3);
         this.method17842((T)var1, var4, var34, var9, var3);
         var4.method35292(-1.0F, -1.0F, 1.0F);
         this.method17857((T)var1, var4, var3);
         var4.method35291(0.0, -1.501F, 0.0);
         float var35 = 0.0F;
         float var16 = 0.0F;
         if (!var1.method3328() && var1.method3066()) {
            var35 = MathHelper.method37821(var3, var1.field4959, var1.field4960);
            var16 = var1.field4961 - var1.field4960 * (1.0F - var3);
            if (var1.method3005()) {
               var16 *= 3.0F;
            }

            if (var35 > 1.0F) {
               var35 = 1.0F;
            }
         }

         var33.method13942(Class2035.field13213);
         Client.getInstance().getEventManager().call(var33);
         this.field25086.method10997((T)var1, var16, var35, var3);
         this.field25086.method10998((T)var1, var16, var35, var34, var11, var31);
         if (Class9810.method38699()) {
            this.field25088 = var1;
            this.field25089 = var16;
            this.field25090 = var35;
            this.field25091 = var34;
            this.field25092 = var11;
            this.field25093 = var31;
            this.field25094 = var3;
         }

         boolean var17 = Class7944.method26921();
         Minecraft var18 = Minecraft.getInstance();
         boolean var19 = this.method17869((T)var1);
         boolean var20 = !var19 && !var1.method3343(var18.field1339);
         boolean var21 = var18.method1552(var1);
         Class4520 var22 = this.method17882((T)var1, var19, var20, var21);
         if (var22 != null) {
            Class5422 var23 = var5.method25597(var22);
            float var24 = this.method17879((T)var1, var3);
            if (var17) {
               if (var1.field4952 > 0 || var1.field4955 > 0) {
                  Class8981.method33086(1.0F, 0.0F, 0.0F, 0.3F);
               }

               if (var24 > 0.0F) {
                  Class8981.method33086(var24, var24, var24, 0.5F);
               }
            }

            int var25 = method17883(var1, var24);
            this.field25086.method11016(var4, var23, var6, var25, 1.0F, 1.0F, 1.0F, (!var20 ? 1.0F : 0.15F) * this.field25096);
         }

         if (!var1.method2800() && var33.method13954()) {
            for (Class219 var37 : this.field25087) {
               var37.method820(var4, var5, var6, var1, var16, var35, var3, var34, var11, var31);
            }
         }

         if (Class7944.method26921()) {
            Class8981.method33086(0.0F, 0.0F, 0.0F, 0.0F);
         }

         if (Class9810.method38699()) {
            this.field25088 = null;
         }

         var33.method13942(Class2035.field13214);
         Client.getInstance().getEventManager().call(var33);
         var4.method35295();
         super.method17853((T)var1, var2, var3, var4, var5, var6);
         if (Class9299.field42992.method20241()) {
            Class9299.method35085(Class9299.field42992, var1, this, var3, var4, var5, var6);
         }
      }
   }

   @Nullable
   public Class4520 method17882(T var1, boolean var2, boolean var3, boolean var4) {
      ResourceLocation var7 = this.method17843((T)var1);
      if (this.method17900() != null) {
         var7 = this.method17900();
      }

      if (!var3) {
         if (!var2) {
            if (var1.method3340() && !Class7944.method26860().field1287.method861()) {
               return this.field25086.method11028(var7);
            } else {
               return !var4 ? null : Class4520.method14329(var7);
            }
         } else {
            return this.field25086.method11028(var7);
         }
      } else {
         return Class4520.method14315(var7);
      }
   }

   public static int method17883(Class880 var0, float var1) {
      return Class213.method730(Class213.method728(var1), Class213.method729(var0.field4952 > 0 || var0.field4955 > 0));
   }

   public boolean method17869(T var1) {
      return !var1.method3342();
   }

   private static float method17884(Direction var0) {
      switch (Class8663.field39038[var0.ordinal()]) {
         case 1:
            return 90.0F;
         case 2:
            return 0.0F;
         case 3:
            return 270.0F;
         case 4:
            return 180.0F;
         default:
            return 0.0F;
      }
   }

   public boolean method17860(T var1) {
      return false;
   }

   public void method17842(T var1, Class9332 var2, float var3, float var4, float var5) {
      if (this.method17860((T)var1)) {
         var4 += (float)(Math.cos((double)var1.field5055 * 3.25) * Math.PI * 0.4F);
      }

      Class2090 var8 = var1.method3212();
      if (var8 != Class2090.field13621) {
         var2.method35293(Class7680.field32900.method25286(180.0F - var4));
      }

      if (var1.field4955 <= 0) {
         if (!var1.method3130()) {
            if (var8 != Class2090.field13621) {
               if (var1.method3381() || var1 instanceof PlayerEntity) {
                  String var9 = TextFormatting.getTextWithoutFormattingCodes(var1.getName().getString());
                  if (("Dinnerbone".equals(var9) || "Grumm".equals(var9)) && (!(var1 instanceof PlayerEntity) || ((PlayerEntity)var1).method2962(Class2318.field15879))
                     )
                   {
                     var2.method35291(0.0, (double)(var1.method3430() + 0.1F), 0.0);
                     var2.method35293(Class7680.field32902.method25286(180.0F));
                  }
               }
            } else {
               Direction var11 = var1.method3179();
               float var10 = var11 == null ? var4 : method17884(var11);
               var2.method35293(Class7680.field32900.method25286(var10));
               var2.method35293(Class7680.field32902.method25286(this.method17865((T)var1)));
               var2.method35293(Class7680.field32900.method25286(270.0F));
            }
         } else {
            var2.method35293(Class7680.field32898.method25286(-90.0F - var1.field5032));
            var2.method35293(Class7680.field32900.method25286(((float)var1.field5055 + var5) * -75.0F));
         }
      } else {
         float var12 = ((float)var1.field4955 + var5 - 1.0F) / 20.0F * 1.6F;
         var12 = MathHelper.method37765(var12);
         if (var12 > 1.0F) {
            var12 = 1.0F;
         }

         var2.method35293(Class7680.field32902.method25286(var12 * this.method17865((T)var1)));
      }
   }

   public float method17885(T var1, float var2) {
      return var1.method3137(var2);
   }

   public float method17871(T var1, float var2) {
      return (float)var1.field5055 + var2;
   }

   public float method17865(T var1) {
      return 90.0F;
   }

   public float method17879(T var1, float var2) {
      return 0.0F;
   }

   public void method17857(T var1, Class9332 var2, float var3) {
   }

   public boolean method17852(T var1) {
      Class4433 var4 = new Class4433(var1);
      Client.getInstance().getEventManager().call(var4);
      if (var4.isCancelled()) {
         return false;
      } else {
         double var5 = this.field25097.method32228(var1);
         float var7 = var1.method3334() ? 32.0F : 64.0F;
         if (var5 >= (double)(var7 * var7)) {
            return false;
         } else {
            Minecraft var8 = Minecraft.getInstance();
            ClientPlayerEntity var9 = var8.field1339;
            boolean var10 = !var1.method3343(var9);
            if (var1 != var9) {
               Class8219 var11 = var1.method3344();
               Class8219 var12 = var9.method3344();
               if (var11 != null) {
                  Class2225 var13 = var11.method28582();
                  switch (Class8663.field39039[var13.ordinal()]) {
                     case 1:
                        return var10;
                     case 2:
                        return false;
                     case 3:
                        return var12 == null ? var10 : var11.method28592(var12) && (var11.method28580() || var10);
                     case 4:
                        return var12 == null ? var10 : !var11.method28592(var12) && var10;
                     default:
                        return true;
                  }
               }
            }

            return Minecraft.method1515() && var1 != var8.method1550() && var10 && !var1.method3329();
         }
      }
   }

   public List<Class219<T, M>> method17886() {
      return this.field25087;
   }
}
