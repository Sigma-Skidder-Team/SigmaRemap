package mapped;

import java.util.UUID;

public class Class1058 extends Class1056 implements Class1011 {
   public static final Class9289<Byte> field5849 = Class9361.<Byte>method35441(Class1058.class, Class7784.field33390);
   private int field5850;
   private int field5851;
   private static final Class8369 field5852 = Class8763.method31620(20, 39);
   private int field5853;
   private UUID field5854;

   public Class1058(Class8992<? extends Class1058> var1, World var2) {
      super(var1, var2);
      this.field5051 = 1.0F;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(1, new Class2647(this, 1.0, true));
      this.field5600.method20002(2, new Class2782(this, 0.9, 32.0F));
      this.field5600.method20002(2, new Class2742(this, 0.6, false));
      this.field5600.method20002(4, new Class2739(this, 0.6));
      this.field5600.method20002(5, new Class2777(this));
      this.field5600.method20002(7, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.method20002(8, new Class2668(this));
      this.field5601.method20002(1, new Class2700(this));
      this.field5601.method20002(2, new Class2704(this));
      this.field5601.method20002(3, new Class2709<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method4367));
      this.field5601
         .method20002(3, new Class2709<Class1006>(this, Class1006.class, 5, false, false, var0 -> var0 instanceof Class1008 && !(var0 instanceof Class1081)));
      this.field5601.method20002(4, new Class2779<Class1058>(this, false));
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5849, (byte)0);
   }

   public static Class7037 method4863() {
      return Class1006.method4220()
         .method21849(Class9173.field42105, 100.0)
         .method21849(Class9173.field42108, 0.25)
         .method21849(Class9173.field42107, 1.0)
         .method21849(Class9173.field42110, 15.0);
   }

   @Override
   public int method3011(int var1) {
      return var1;
   }

   @Override
   public void method3128(Entity var1) {
      if (var1 instanceof Class1008 && !(var1 instanceof Class1081) && this.method3013().nextInt(20) == 0) {
         this.method4233((Class880)var1);
      }

      super.method3128(var1);
   }

   @Override
   public void method2871() {
      super.method2871();
      if (this.field5850 > 0) {
         this.field5850--;
      }

      if (this.field5851 > 0) {
         this.field5851--;
      }

      if (method3234(this.method3433()) > 2.5000003E-7F && this.field5054.nextInt(5) == 0) {
         int var3 = MathHelper.method37769(this.getPosX());
         int var4 = MathHelper.method37769(this.getPosY() - 0.2F);
         int var5 = MathHelper.method37769(this.getPosZ());
         Class7380 var6 = this.field5024.method6738(new BlockPos(var3, var4, var5));
         if (!var6.method23393()) {
            this.field5024
               .method6746(
                  new Class7439(Class7940.field34051, var6),
                  this.getPosX() + ((double)this.field5054.nextFloat() - 0.5) * (double)this.method3429(),
                  this.getPosY() + 0.1,
                  this.getPosZ() + ((double)this.field5054.nextFloat() - 0.5) * (double)this.method3429(),
                  4.0 * ((double)this.field5054.nextFloat() - 0.5),
                  0.5,
                  ((double)this.field5054.nextFloat() - 0.5) * 4.0
               );
         }
      }

      if (!this.field5024.field9020) {
         this.method4366((ServerWorld)this.field5024, true);
      }
   }

   @Override
   public boolean method2996(Class8992<?> var1) {
      if (this.method4869() && var1 == Class8992.field41111) {
         return false;
      } else {
         return var1 != Class8992.field41017 ? super.method2996(var1) : false;
      }
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method115("PlayerCreated", this.method4869());
      this.method4364(var1);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method4870(var1.method132("PlayerCreated"));
      this.method4365((ServerWorld)this.field5024, var1);
   }

   @Override
   public void method4346() {
      this.method4347(field5852.method29319(this.field5054));
   }

   @Override
   public void method4347(int var1) {
      this.field5853 = var1;
   }

   @Override
   public int method4348() {
      return this.field5853;
   }

   @Override
   public void method4349(UUID var1) {
      this.field5854 = var1;
   }

   @Override
   public UUID method4350() {
      return this.field5854;
   }

   private float method4864() {
      return (float)this.method3086(Class9173.field42110);
   }

   @Override
   public boolean method3114(Entity var1) {
      this.field5850 = 10;
      this.field5024.method6786(this, (byte)4);
      float var4 = this.method4864();
      float var5 = (int)var4 <= 0 ? var4 : var4 / 2.0F + (float)this.field5054.nextInt((int)var4);
      boolean var6 = var1.method2741(Class8654.method31115(this), var5);
      if (var6) {
         var1.method3434(var1.method3433().method11339(0.0, 0.4F, 0.0));
         this.method3399(this, var1);
      }

      this.method2863(Class6067.field26700, 1.0F, 1.0F);
      return var6;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      Class2286 var5 = this.method4865();
      boolean var6 = super.method2741(var1, var2);
      if (var6 && this.method4865() != var5) {
         this.method2863(Class6067.field26701, 1.0F, 1.0F);
      }

      return var6;
   }

   public Class2286 method4865() {
      return Class2286.method9024(this.method3042() / this.method3075());
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 4) {
         if (var1 != 11) {
            if (var1 != 34) {
               super.method2866(var1);
            } else {
               this.field5851 = 0;
            }
         } else {
            this.field5851 = 400;
         }
      } else {
         this.field5850 = 10;
         this.method2863(Class6067.field26700, 1.0F, 1.0F);
      }
   }

   public int method4866() {
      return this.field5850;
   }

   public void method4867(boolean var1) {
      if (!var1) {
         this.field5851 = 0;
         this.field5024.method6786(this, (byte)34);
      } else {
         this.field5851 = 400;
         this.field5024.method6786(this, (byte)11);
      }
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26703;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26702;
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      Class3257 var6 = var5.method32107();
      if (var6 == Class8514.field37801) {
         float var7 = this.method3042();
         this.method3041(25.0F);
         if (this.method3042() != var7) {
            float var8 = 1.0F + (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F;
            this.method2863(Class6067.field26704, 1.0F, var8);
            if (!var1.field4919.field29609) {
               var5.method32182(1);
            }

            return ActionResultType.method9002(this.field5024.field9020);
         } else {
            return ActionResultType.field14820;
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field26705, 1.0F, 1.0F);
   }

   public int method4868() {
      return this.field5851;
   }

   public boolean method4869() {
      return (this.field5063.<Byte>method35445(field5849) & 1) != 0;
   }

   public void method4870(boolean var1) {
      byte var4 = this.field5063.<Byte>method35445(field5849);
      if (!var1) {
         this.field5063.method35446(field5849, (byte)(var4 & -2));
      } else {
         this.field5063.method35446(field5849, (byte)(var4 | 1));
      }
   }

   @Override
   public void method2737(Class8654 var1) {
      super.method2737(var1);
   }

   @Override
   public boolean method4266(Class1662 var1) {
      BlockPos var4 = this.method3432();
      BlockPos var5 = var4.method8313();
      Class7380 var6 = var1.method6738(var5);
      if (!var6.method23419(var1, var5, this)) {
         return false;
      } else {
         for (int var7 = 1; var7 < 3; var7++) {
            BlockPos var8 = var4.method8339(var7);
            Class7380 var9 = var1.method6738(var8);
            if (!Class8170.method28428(var1, var8, var9, var9.method23449(), Class8992.field41041)) {
               return false;
            }
         }

         return Class8170.method28428(var1, var4, var1.method6738(var4), Class9479.field44064.method25049(), Class8992.field41041) && var1.method7050(this);
      }
   }

   @Override
   public Vector3d method3394() {
      return new Vector3d(0.0, (double)(0.875F * this.method3393()), (double)(this.method3429() * 0.4F));
   }
}
