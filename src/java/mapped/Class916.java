package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public abstract class Class916 extends Entity {
   private static final Class9289<Integer> field5213 = Class9361.<Integer>method35441(Class916.class, Class7784.field33391);
   private static final Class9289<Integer> field5214 = Class9361.<Integer>method35441(Class916.class, Class7784.field33391);
   private static final Class9289<Float> field5215 = Class9361.<Float>method35441(Class916.class, Class7784.field33392);
   private static final Class9289<Integer> field5216 = Class9361.<Integer>method35441(Class916.class, Class7784.field33391);
   private static final Class9289<Integer> field5217 = Class9361.<Integer>method35441(Class916.class, Class7784.field33391);
   private static final Class9289<Boolean> field5218 = Class9361.<Boolean>method35441(Class916.class, Class7784.field33398);
   private static final ImmutableMap<Class2090, ImmutableList<Integer>> field5219 = ImmutableMap.of(
      Class2090.field13619, ImmutableList.of(0, 1, -1), Class2090.field13624, ImmutableList.of(0, 1, -1), Class2090.field13622, ImmutableList.of(0, 1)
   );
   private boolean field5220;
   private static final Map<Class96, Pair<Class1998, Class1998>> field5221 = Util.<Map<Class96, Pair<Class1998, Class1998>>>method38508(
      Maps.newEnumMap(Class96.class), var0 -> {
         Class1998 var3 = Direction.WEST.method556();
         Class1998 var4 = Direction.EAST.method556();
         Class1998 var5 = Direction.NORTH.method556();
         Class1998 var6 = Direction.SOUTH.method556();
         Class1998 var7 = var3.method8312();
         Class1998 var8 = var4.method8312();
         Class1998 var9 = var5.method8312();
         Class1998 var10 = var6.method8312();
         var0.put(Class96.field247, Pair.of(var5, var6));
         var0.put(Class96.field248, Pair.of(var3, var4));
         var0.put(Class96.field249, Pair.of(var7, var4));
         var0.put(Class96.field250, Pair.of(var3, var8));
         var0.put(Class96.field251, Pair.of(var5, var10));
         var0.put(Class96.field252, Pair.of(var9, var6));
         var0.put(Class96.field253, Pair.of(var6, var4));
         var0.put(Class96.field254, Pair.of(var6, var3));
         var0.put(Class96.field255, Pair.of(var5, var3));
         var0.put(Class96.field256, Pair.of(var5, var4));
      }
   );
   private int field5222;
   private double field5223;
   private double field5224;
   private double field5225;
   private double field5226;
   private double field5227;
   private double field5228;
   private double field5229;
   private double field5230;

   public Class916(Class8992<?> var1, Class1655 var2) {
      super(var1, var2);
      this.field5019 = true;
   }

   public Class916(Class8992<?> var1, Class1655 var2, double var3, double var5, double var7) {
      this(var1, var2);
      this.method3215(var3, var5, var7);
      this.method3434(Vector3d.field18047);
      this.field5025 = var3;
      this.field5026 = var5;
      this.field5027 = var7;
   }

   public static Class916 method3585(Class1655 var0, double var1, double var3, double var5, Class2177 var7) {
      if (var7 != Class2177.field14288) {
         if (var7 != Class2177.field14289) {
            if (var7 != Class2177.field14290) {
               if (var7 != Class2177.field14291) {
                  if (var7 != Class2177.field14292) {
                     return (Class916)(var7 != Class2177.field14293 ? new Class917(var0, var1, var3, var5) : new Class918(var0, var1, var3, var5));
                  } else {
                     return new Class938(var0, var1, var3, var5);
                  }
               } else {
                  return new Class992(var0, var1, var3, var5);
               }
            } else {
               return new Class993(var0, var1, var3, var5);
            }
         } else {
            return new Class994(var0, var1, var3, var5);
         }
      } else {
         return new Class991(var0, var1, var3, var5);
      }
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public void method2850() {
      this.field5063.method35442(field5213, 0);
      this.field5063.method35442(field5214, 1);
      this.field5063.method35442(field5215, 0.0F);
      this.field5063.method35442(field5216, Class3209.method11535(Class8487.field36387.method11579()));
      this.field5063.method35442(field5217, 6);
      this.field5063.method35442(field5218, false);
   }

   @Override
   public boolean method3305(Entity var1) {
      return Class1002.method4146(this, var1);
   }

   @Override
   public boolean method3140() {
      return true;
   }

   @Override
   public Vector3d method3145(Class113 var1, Class9502 var2) {
      return Class880.method3146(super.method3145(var1, var2));
   }

   @Override
   public double method3310() {
      return 0.0;
   }

   @Override
   public Vector3d method3420(Class880 var1) {
      Direction var4 = this.method3387();
      if (var4.method544() == Class113.field414) {
         return super.method3420(var1);
      } else {
         int[][] var5 = Class4527.method14422(var4);
         BlockPos var6 = this.method3432();
         Mutable var7 = new Mutable();
         ImmutableList var8 = var1.method2982();
         UnmodifiableIterator var9 = var8.iterator();

         while (var9.hasNext()) {
            Class2090 var13 = (Class2090)var9.next();
            Class8847 var12 = var1.method2981(var13);
            float var14 = Math.min(var12.field39968, 1.0F) / 2.0F;
            UnmodifiableIterator var15 = ((ImmutableList)field5219.get(var13)).iterator();

            while (var15.hasNext()) {
               int var16 = (Integer)var15.next();

               for (int[] var20 : var5) {
                  var7.method8372(var6.method8304() + var20[0], var6.getY() + var16, var6.method8306() + var20[1]);
                  double var21 = this.field5024
                     .method7038(Class4527.method14426(this.field5024, var7), () -> Class4527.method14426(this.field5024, var7.method8313()));
                  if (Class4527.method14423(var21)) {
                     Class6488 var23 = new Class6488((double)(-var14), 0.0, (double)(-var14), (double)var14, (double)var12.field39969, (double)var14);
                     Vector3d var24 = Vector3d.method11331(var7, var21);
                     if (Class4527.method14424(this.field5024, var1, var23.method19669(var24))) {
                        var1.method3211(var13);
                        return var24;
                     }
                  }
               }
            }
         }

         double var10 = this.method3389().field28453;
         var7.method8373((double)var6.method8304(), var10, (double)var6.method8306());
         UnmodifiableIterator var29 = var8.iterator();

         while (var29.hasNext()) {
            Class2090 var30 = (Class2090)var29.next();
            double var25 = (double)var1.method2981(var30).field39969;
            int var31 = Class9679.method37774(var10 - (double)var7.getY() + var25);
            double var27 = Class4527.method14427(var7, var31, var1x -> this.field5024.method6738(var1x).method23414(this.field5024, var1x));
            if (var10 + var25 <= var27) {
               var1.method3211(var30);
               break;
            }
         }

         return super.method3420(var1);
      }
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (this.field5024.field9020 || this.field5041) {
         return true;
      } else if (this.method2760(var1)) {
         return false;
      } else {
         this.method3600(-this.method3601());
         this.method3598(10);
         this.method3141();
         this.method3596(this.method3597() + var2 * 10.0F);
         boolean var5 = var1.method31109() instanceof PlayerEntity && ((PlayerEntity)var1.method31109()).field4919.field29609;
         if (var5 || this.method3597() > 40.0F) {
            this.method3315();
            if (var5 && !this.method3381()) {
               this.method2904();
            } else {
               this.method3586(var1);
            }
         }

         return true;
      }
   }

   @Override
   public float method2977() {
      Class7380 var3 = this.field5024.method6738(this.method3432());
      return !var3.method23446(Class7645.field32766) ? super.method2977() : 1.0F;
   }

   public void method3586(Class8654 var1) {
      this.method2904();
      if (this.field5024.method6789().method17135(Class5462.field24229)) {
         Class8848 var4 = new Class8848(Class8514.field37885);
         if (this.method3381()) {
            var4.method32150(this.method3380());
         }

         this.method3302(var4);
      }
   }

   @Override
   public void method3069() {
      this.method3600(-this.method3601());
      this.method3598(10);
      this.method3596(this.method3597() + this.method3597() * 10.0F);
   }

   @Override
   public boolean method3139() {
      return !this.field5041;
   }

   private static Pair<Class1998, Class1998> method3587(Class96 var0) {
      return field5221.get(var0);
   }

   @Override
   public Direction method3387() {
      return !this.field5220 ? this.method3386().method537() : this.method3386().method536().method537();
   }

   @Override
   public void tick() {
      if (this.method3599() > 0) {
         this.method3598(this.method3599() - 1);
      }

      if (this.method3597() > 0.0F) {
         this.method3596(this.method3597() - 1.0F);
      }

      if (this.getPosY() < -64.0) {
         this.method3083();
      }

      this.method3324();
      if (!this.field5024.field9020) {
         if (!this.method3247()) {
            this.method3434(this.method3433().method11339(0.0, -0.04, 0.0));
         }

         int var3 = Class9679.method37769(this.getPosX());
         int var4 = Class9679.method37769(this.getPosY());
         int var5 = Class9679.method37769(this.getPosZ());
         if (this.field5024.method6738(new BlockPos(var3, var4 - 1, var5)).method23446(Class7645.field32766)) {
            var4--;
         }

         BlockPos var6 = new BlockPos(var3, var4, var5);
         Class7380 var7 = this.field5024.method6738(var6);
         if (!Class3429.method12087(var7)) {
            this.method3590();
         } else {
            this.method3591(var6, var7);
            if (var7.method23448(Class8487.field36728)) {
               this.method3589(var3, var4, var5, var7.<Boolean>method23463(Class3432.field19197));
            }
         }

         this.method3240();
         this.field5032 = 0.0F;
         double var16 = this.field5025 - this.getPosX();
         double var18 = this.field5027 - this.getPosZ();
         if (var16 * var16 + var18 * var18 > 0.001) {
            this.field5031 = (float)(Class9679.method37814(var18, var16) * 180.0 / Math.PI);
            if (this.field5220) {
               this.field5031 += 180.0F;
            }
         }

         double var20 = (double)Class9679.method37792(this.field5031 - this.field5033);
         if (var20 < -170.0 || var20 >= 170.0) {
            this.field5031 += 180.0F;
            this.field5220 = !this.field5220;
         }

         this.method3214(this.field5031, this.field5032);
         if (this.method3602() == Class2177.field14287 && method3234(this.method3433()) > 0.01) {
            List var25 = this.field5024.method6770(this, this.method3389().method19663(0.2F, 0.0, 0.2F), Class8088.method27981(this));
            if (!var25.isEmpty()) {
               for (int var26 = 0; var26 < var25.size(); var26++) {
                  Entity var24 = (Entity)var25.get(var26);
                  if (!(var24 instanceof PlayerEntity)
                     && !(var24 instanceof Class1058)
                     && !(var24 instanceof Class916)
                     && !this.method3329()
                     && !var24.method3328()) {
                     var24.method3311(this);
                  } else {
                     var24.method3101(this);
                  }
               }
            }
         } else {
            for (Entity var23 : this.field5024.method7181(this, this.method3389().method19663(0.2F, 0.0, 0.2F))) {
               if (!this.method3409(var23) && var23.method3140() && var23 instanceof Class916) {
                  var23.method3101(this);
               }
            }
         }

         this.method3257();
         if (this.method3264()) {
            this.method3220();
            this.field5045 *= 0.5F;
         }

         this.field5062 = false;
      } else if (this.field5222 <= 0) {
         this.method3216();
         this.method3214(this.field5031, this.field5032);
      } else {
         double var8 = this.getPosX() + (this.field5223 - this.getPosX()) / (double)this.field5222;
         double var10 = this.getPosY() + (this.field5224 - this.getPosY()) / (double)this.field5222;
         double var12 = this.getPosZ() + (this.field5225 - this.getPosZ()) / (double)this.field5222;
         double var14 = Class9679.method37793(this.field5226 - (double)this.field5031);
         this.field5031 = (float)((double)this.field5031 + var14 / (double)this.field5222);
         this.field5032 = (float)((double)this.field5032 + (this.field5227 - (double)this.field5032) / (double)this.field5222);
         this.field5222--;
         this.method3215(var8, var10, var12);
         this.method3214(this.field5031, this.field5032);
      }
   }

   public double method3588() {
      return 0.4;
   }

   public void method3589(int var1, int var2, int var3, boolean var4) {
   }

   public void method3590() {
      double var3 = this.method3588();
      Vector3d var5 = this.method3433();
      this.method3435(Class9679.method37778(var5.field18048, -var3, var3), var5.field18049, Class9679.method37778(var5.field18050, -var3, var3));
      if (this.field5036) {
         this.method3434(this.method3433().method11344(0.5));
      }

      this.move(Class2107.field13742, this.method3433());
      if (!this.field5036) {
         this.method3434(this.method3433().method11344(0.95));
      }
   }

   public void method3591(BlockPos var1, Class7380 var2) {
      this.field5045 = 0.0F;
      double var5 = this.getPosX();
      double var7 = this.getPosY();
      double var9 = this.getPosZ();
      Vector3d var11 = this.method3595(var5, var7, var9);
      var7 = (double)var1.getY();
      boolean var12 = false;
      boolean var13 = false;
      Class3429 var14 = (Class3429)var2.method23383();
      if (var14 == Class8487.field36478) {
         var12 = var2.<Boolean>method23463(Class3432.field19197);
         var13 = !var12;
      }

      double var15 = 0.0078125;
      Vector3d var17 = this.method3433();
      Class96 var18 = var2.<Class96>method23463(var14.method12093());
      switch (Class9345.field43383[var18.ordinal()]) {
         case 1:
            this.method3434(var17.method11339(-0.0078125, 0.0, 0.0));
            var7++;
            break;
         case 2:
            this.method3434(var17.method11339(0.0078125, 0.0, 0.0));
            var7++;
            break;
         case 3:
            this.method3434(var17.method11339(0.0, 0.0, 0.0078125));
            var7++;
            break;
         case 4:
            this.method3434(var17.method11339(0.0, 0.0, -0.0078125));
            var7++;
      }

      var17 = this.method3433();
      Pair var19 = method3587(var18);
      Class1998 var20 = (Class1998)var19.getFirst();
      Class1998 var21 = (Class1998)var19.getSecond();
      double var22 = (double)(var21.method8304() - var20.method8304());
      double var24 = (double)(var21.method8306() - var20.method8306());
      double var26 = Math.sqrt(var22 * var22 + var24 * var24);
      double var28 = var17.field18048 * var22 + var17.field18050 * var24;
      if (var28 < 0.0) {
         var22 = -var22;
         var24 = -var24;
      }

      double var30 = Math.min(2.0, Math.sqrt(method3234(var17)));
      var17 = new Vector3d(var30 * var22 / var26, var17.field18049, var30 * var24 / var26);
      this.method3434(var17);
      Entity var32 = this.method3408().isEmpty() ? null : this.method3408().get(0);
      if (var32 instanceof PlayerEntity) {
         Vector3d var33 = var32.method3433();
         double var34 = method3234(var33);
         double var36 = method3234(this.method3433());
         if (var34 > 1.0E-4 && var36 < 0.01) {
            this.method3434(this.method3433().method11339(var33.field18048 * 0.1, 0.0, var33.field18050 * 0.1));
            var13 = false;
         }
      }

      if (var13) {
         double var38 = Math.sqrt(method3234(this.method3433()));
         if (var38 < 0.03) {
            this.method3434(Vector3d.field18047);
         } else {
            this.method3434(this.method3433().method11347(0.5, 0.0, 0.5));
         }
      }

      double var75 = (double)var1.method8304() + 0.5 + (double)var20.method8304() * 0.5;
      double var40 = (double)var1.method8306() + 0.5 + (double)var20.method8306() * 0.5;
      double var42 = (double)var1.method8304() + 0.5 + (double)var21.method8304() * 0.5;
      double var44 = (double)var1.method8306() + 0.5 + (double)var21.method8306() * 0.5;
      var22 = var42 - var75;
      var24 = var44 - var40;
      double var46;
      if (var22 == 0.0) {
         var46 = var9 - (double)var1.method8306();
      } else if (var24 == 0.0) {
         var46 = var5 - (double)var1.method8304();
      } else {
         double var48 = var5 - var75;
         double var50 = var9 - var40;
         var46 = (var48 * var22 + var50 * var24) * 2.0;
      }

      var5 = var75 + var22 * var46;
      var9 = var40 + var24 * var46;
      this.method3215(var5, var7, var9);
      double var76 = this.method3329() ? 0.75 : 1.0;
      double var77 = this.method3588();
      var17 = this.method3433();
      this.move(
         Class2107.field13742,
         new Vector3d(Class9679.method37778(var76 * var17.field18048, -var77, var77), 0.0, Class9679.method37778(var76 * var17.field18050, -var77, var77))
      );
      if (var20.getY() != 0
         && Class9679.method37769(this.getPosX()) - var1.method8304() == var20.method8304()
         && Class9679.method37769(this.getPosZ()) - var1.method8306() == var20.method8306()) {
         this.method3215(this.getPosX(), this.getPosY() + (double)var20.getY(), this.getPosZ());
      } else if (var21.getY() != 0
         && Class9679.method37769(this.getPosX()) - var1.method8304() == var21.method8304()
         && Class9679.method37769(this.getPosZ()) - var1.method8306() == var21.method8306()) {
         this.method3215(this.getPosX(), this.getPosY() + (double)var21.getY(), this.getPosZ());
      }

      this.method3593();
      Vector3d var52 = this.method3595(this.getPosX(), this.getPosY(), this.getPosZ());
      if (var52 != null && var11 != null) {
         double var53 = (var11.field18049 - var52.field18049) * 0.05;
         Vector3d var55 = this.method3433();
         double var56 = Math.sqrt(method3234(var55));
         if (var56 > 0.0) {
            this.method3434(var55.method11347((var56 + var53) / var56, 1.0, (var56 + var53) / var56));
         }

         this.method3215(this.getPosX(), var52.field18049, this.getPosZ());
      }

      int var58 = Class9679.method37769(this.getPosX());
      int var59 = Class9679.method37769(this.getPosZ());
      if (var58 != var1.method8304() || var59 != var1.method8306()) {
         Vector3d var78 = this.method3433();
         double var80 = Math.sqrt(method3234(var78));
         this.method3435(var80 * (double)(var58 - var1.method8304()), var78.field18049, var80 * (double)(var59 - var1.method8306()));
      }

      if (var12) {
         Vector3d var79 = this.method3433();
         double var81 = Math.sqrt(method3234(var79));
         if (var81 > 0.01) {
            double var60 = 0.06;
            this.method3434(var79.method11339(var79.field18048 / var81 * 0.06, 0.0, var79.field18050 / var81 * 0.06));
         } else {
            Vector3d var62 = this.method3433();
            double var63 = var62.field18048;
            double var65 = var62.field18050;
            if (var18 == Class96.field248) {
               if (this.method3592(var1.method8345())) {
                  var63 = 0.02;
               } else if (this.method3592(var1.method8347())) {
                  var63 = -0.02;
               }
            } else {
               if (var18 != Class96.field247) {
                  return;
               }

               if (this.method3592(var1.method8341())) {
                  var65 = 0.02;
               } else if (this.method3592(var1.method8343())) {
                  var65 = -0.02;
               }
            }

            this.method3435(var63, var62.field18049, var65);
         }
      }
   }

   private boolean method3592(BlockPos var1) {
      return this.field5024.method6738(var1).method23400(this.field5024, var1);
   }

   public void method3593() {
      double var3 = !this.method3329() ? 0.96 : 0.997;
      this.method3434(this.method3433().method11347(var3, 0.0, var3));
   }

   @Nullable
   public Vector3d method3594(double var1, double var3, double var5, double var7) {
      int var11 = Class9679.method37769(var1);
      int var12 = Class9679.method37769(var3);
      int var13 = Class9679.method37769(var5);
      if (this.field5024.method6738(new BlockPos(var11, var12 - 1, var13)).method23446(Class7645.field32766)) {
         var12--;
      }

      Class7380 var14 = this.field5024.method6738(new BlockPos(var11, var12, var13));
      if (!Class3429.method12087(var14)) {
         return null;
      } else {
         Class96 var15 = var14.<Class96>method23463(((Class3429)var14.method23383()).method12093());
         var3 = (double)var12;
         if (var15.method275()) {
            var3 = (double)(var12 + 1);
         }

         Pair var16 = method3587(var15);
         Class1998 var17 = (Class1998)var16.getFirst();
         Class1998 var18 = (Class1998)var16.getSecond();
         double var19 = (double)(var18.method8304() - var17.method8304());
         double var21 = (double)(var18.method8306() - var17.method8306());
         double var23 = Math.sqrt(var19 * var19 + var21 * var21);
         var19 /= var23;
         var21 /= var23;
         var1 += var19 * var7;
         var5 += var21 * var7;
         if (var17.getY() != 0 && Class9679.method37769(var1) - var11 == var17.method8304() && Class9679.method37769(var5) - var13 == var17.method8306()) {
            var3 += (double)var17.getY();
         } else if (var18.getY() != 0
            && Class9679.method37769(var1) - var11 == var18.method8304()
            && Class9679.method37769(var5) - var13 == var18.method8306()) {
            var3 += (double)var18.getY();
         }

         return this.method3595(var1, var3, var5);
      }
   }

   @Nullable
   public Vector3d method3595(double var1, double var3, double var5) {
      int var9 = Class9679.method37769(var1);
      int var10 = Class9679.method37769(var3);
      int var11 = Class9679.method37769(var5);
      if (this.field5024.method6738(new BlockPos(var9, var10 - 1, var11)).method23446(Class7645.field32766)) {
         var10--;
      }

      Class7380 var12 = this.field5024.method6738(new BlockPos(var9, var10, var11));
      if (!Class3429.method12087(var12)) {
         return null;
      } else {
         Class96 var13 = var12.<Class96>method23463(((Class3429)var12.method23383()).method12093());
         Pair var14 = method3587(var13);
         Class1998 var15 = (Class1998)var14.getFirst();
         Class1998 var16 = (Class1998)var14.getSecond();
         double var17 = (double)var9 + 0.5 + (double)var15.method8304() * 0.5;
         double var19 = (double)var10 + 0.0625 + (double)var15.getY() * 0.5;
         double var21 = (double)var11 + 0.5 + (double)var15.method8306() * 0.5;
         double var23 = (double)var9 + 0.5 + (double)var16.method8304() * 0.5;
         double var25 = (double)var10 + 0.0625 + (double)var16.getY() * 0.5;
         double var27 = (double)var11 + 0.5 + (double)var16.method8306() * 0.5;
         double var29 = var23 - var17;
         double var31 = (var25 - var19) * 2.0;
         double var33 = var27 - var21;
         double var39;
         if (var29 != 0.0) {
            if (var33 != 0.0) {
               double var35 = var1 - var17;
               double var37 = var5 - var21;
               var39 = (var35 * var29 + var37 * var33) * 2.0;
            } else {
               var39 = var1 - (double)var9;
            }
         } else {
            var39 = var5 - (double)var11;
         }

         var1 = var17 + var29 * var39;
         var3 = var19 + var31 * var39;
         var5 = var21 + var33 * var39;
         if (!(var31 < 0.0)) {
            if (var31 > 0.0) {
               var3 += 0.5;
            }
         } else {
            var3++;
         }

         return new Vector3d(var1, var3, var5);
      }
   }

   @Override
   public Class6488 method3186() {
      Class6488 var3 = this.method3389();
      return !this.method3609() ? var3 : var3.method19664((double)Math.abs(this.method3605()) / 16.0);
   }

   @Override
   public void method2723(Class39 var1) {
      if (var1.method132("CustomDisplayTile")) {
         this.method3607(Class8354.method29285(var1.method130("DisplayState")));
         this.method3608(var1.method122("DisplayOffset"));
      }
   }

   @Override
   public void method2724(Class39 var1) {
      if (this.method3609()) {
         var1.method115("CustomDisplayTile", true);
         var1.method99("DisplayState", Class8354.method29287(this.method3603()));
         var1.method102("DisplayOffset", this.method3605());
      }
   }

   @Override
   public void method3101(Entity var1) {
      if (!this.field5024.field9020 && !var1.field5052 && !this.field5052 && !this.method3409(var1)) {
         double var4 = var1.getPosX() - this.getPosX();
         double var6 = var1.getPosZ() - this.getPosZ();
         double var8 = var4 * var4 + var6 * var6;
         if (var8 >= 1.0E-4F) {
            var8 = (double)Class9679.method37766(var8);
            var4 /= var8;
            var6 /= var8;
            double var10 = 1.0 / var8;
            if (var10 > 1.0) {
               var10 = 1.0;
            }

            var4 *= var10;
            var6 *= var10;
            var4 *= 0.1F;
            var6 *= 0.1F;
            var4 *= (double)(1.0F - this.field5053);
            var6 *= (double)(1.0F - this.field5053);
            var4 *= 0.5;
            var6 *= 0.5;
            if (!(var1 instanceof Class916)) {
               this.method3280(-var4, 0.0, -var6);
               var1.method3280(var4 / 4.0, 0.0, var6 / 4.0);
            } else {
               double var12 = var1.getPosX() - this.getPosX();
               double var14 = var1.getPosZ() - this.getPosZ();
               Vector3d var16 = new Vector3d(var12, 0.0, var14).method11333();
               Vector3d var17 = new Vector3d(
                     (double)Class9679.method37764(this.field5031 * (float) (Math.PI / 180.0)),
                     0.0,
                     (double)Class9679.method37763(this.field5031 * (float) (Math.PI / 180.0))
                  )
                  .method11333();
               double var18 = Math.abs(var16.method11334(var17));
               if (var18 < 0.8F) {
                  return;
               }

               Vector3d var20 = this.method3433();
               Vector3d var21 = var1.method3433();
               if (((Class916)var1).method3602() == Class2177.field14289 && this.method3602() != Class2177.field14289) {
                  this.method3434(var20.method11347(0.2, 1.0, 0.2));
                  this.method3280(var21.field18048 - var4, 0.0, var21.field18050 - var6);
                  var1.method3434(var21.method11347(0.95, 1.0, 0.95));
               } else if (((Class916)var1).method3602() != Class2177.field14289 && this.method3602() == Class2177.field14289) {
                  var1.method3434(var21.method11347(0.2, 1.0, 0.2));
                  var1.method3280(var20.field18048 + var4, 0.0, var20.field18050 + var6);
                  this.method3434(var20.method11347(0.95, 1.0, 0.95));
               } else {
                  double var22 = (var21.field18048 + var20.field18048) / 2.0;
                  double var24 = (var21.field18050 + var20.field18050) / 2.0;
                  this.method3434(var20.method11347(0.2, 1.0, 0.2));
                  this.method3280(var22 - var4, 0.0, var24 - var6);
                  var1.method3434(var21.method11347(0.2, 1.0, 0.2));
                  var1.method3280(var22 + var4, 0.0, var24 + var6);
               }
            }
         }
      }
   }

   @Override
   public void method3131(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.field5223 = var1;
      this.field5224 = var3;
      this.field5225 = var5;
      this.field5226 = (double)var7;
      this.field5227 = (double)var8;
      this.field5222 = var9 + 2;
      this.method3435(this.field5228, this.field5229, this.field5230);
   }

   @Override
   public void method3325(double var1, double var3, double var5) {
      this.field5228 = var1;
      this.field5229 = var3;
      this.field5230 = var5;
      this.method3435(this.field5228, this.field5229, this.field5230);
   }

   public void method3596(float var1) {
      this.field5063.method35446(field5215, var1);
   }

   public float method3597() {
      return this.field5063.<Float>method35445(field5215);
   }

   public void method3598(int var1) {
      this.field5063.method35446(field5213, var1);
   }

   public int method3599() {
      return this.field5063.<Integer>method35445(field5213);
   }

   public void method3600(int var1) {
      this.field5063.method35446(field5214, var1);
   }

   public int method3601() {
      return this.field5063.<Integer>method35445(field5214);
   }

   public abstract Class2177 method3602();

   public Class7380 method3603() {
      return this.method3609() ? Class3209.method11536(this.method3210().<Integer>method35445(field5216)) : this.method3604();
   }

   public Class7380 method3604() {
      return Class8487.field36387.method11579();
   }

   public int method3605() {
      return this.method3609() ? this.method3210().<Integer>method35445(field5217) : this.method3606();
   }

   public int method3606() {
      return 6;
   }

   public void method3607(Class7380 var1) {
      this.method3210().method35446(field5216, Class3209.method11535(var1));
      this.method3610(true);
   }

   public void method3608(int var1) {
      this.method3210().method35446(field5217, var1);
      this.method3610(true);
   }

   public boolean method3609() {
      return this.method3210().<Boolean>method35445(field5218);
   }

   public void method3610(boolean var1) {
      this.method3210().method35446(field5218, var1);
   }

   @Override
   public Packet<?> method2835() {
      return new Class5487(this);
   }
}
