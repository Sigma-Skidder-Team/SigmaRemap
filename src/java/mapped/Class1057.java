package mapped;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public class Class1057 extends Class1056 implements Class1008 {
   private static final UUID field5839 = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final Class9689 field5840 = new Class9689(field5839, "Covered armor bonus", 20.0, Class2045.field13352);
   public static final Class9289<Direction> field5841 = Class9361.<Direction>method35441(Class1057.class, Class7784.field33403);
   public static final Class9289<Optional<BlockPos>> field5842 = Class9361.<Optional<BlockPos>>method35441(Class1057.class, Class7784.field33402);
   public static final Class9289<Byte> field5843 = Class9361.<Byte>method35441(Class1057.class, Class7784.field33390);
   public static final Class9289<Byte> field5844 = Class9361.<Byte>method35441(Class1057.class, Class7784.field33390);
   private float field5845;
   private float field5846;
   private BlockPos field5847 = null;
   private int field5848;

   public Class1057(EntityType<? extends Class1057> var1, World var2) {
      super(var1, var2);
      this.field5594 = 5;
   }

   @Override
   public void method4219() {
      this.field5600.method20002(1, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(4, new Class2746(this));
      this.field5600.method20002(7, new Class2600(this));
      this.field5600.method20002(8, new Class2668(this));
      this.field5601.method20002(1, new Class2704(this).method10918());
      this.field5601.method20002(2, new Class2721(this, this));
      this.field5601.method20002(3, new Class2719(this));
   }

   @Override
   public boolean method2940() {
      return false;
   }

   @Override
   public Class2266 method2864() {
      return Class2266.field14733;
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field27043;
   }

   @Override
   public void method4237() {
      if (!this.method4847()) {
         super.method4237();
      }
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27049;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return !this.method4847() ? Class6067.field27050 : Class6067.field27051;
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5841, Direction.DOWN);
      this.field5063.method35442(field5842, Optional.<BlockPos>empty());
      this.field5063.method35442(field5843, (byte)0);
      this.field5063.method35442(field5844, (byte)16);
   }

   public static Class7037 method4843() {
      return Class1006.method4220().method21849(Class9173.field42105, 30.0);
   }

   @Override
   public Class7395 method4226() {
      return new Class7396(this, this);
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.field5063.method35446(field5841, Direction.method546(var1.method120("AttachFace")));
      this.field5063.method35446(field5843, var1.method120("Peek"));
      this.field5063.method35446(field5844, var1.method120("Color"));
      if (!var1.contains("APX")) {
         this.field5063.method35446(field5842, Optional.<BlockPos>empty());
      } else {
         int var4 = var1.method122("APX");
         int var5 = var1.method122("APY");
         int var6 = var1.method122("APZ");
         this.field5063.method35446(field5842, Optional.<BlockPos>of(new BlockPos(var4, var5, var6)));
      }
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method100("AttachFace", (byte)this.field5063.<Direction>method35445(field5841).method533());
      var1.method100("Peek", this.field5063.<Byte>method35445(field5843));
      var1.method100("Color", this.field5063.<Byte>method35445(field5844));
      BlockPos var4 = this.method4849();
      if (var4 != null) {
         var1.method102("APX", var4.getX());
         var1.method102("APY", var4.getY());
         var1.method102("APZ", var4.getZ());
      }
   }

   @Override
   public void tick() {
      super.tick();
      BlockPos var3 = this.field5063.<Optional<BlockPos>>method35445(field5842).orElse((BlockPos)null);
      if (var3 == null && !this.world.field9020) {
         var3 = this.getPosition();
         this.field5063.method35446(field5842, Optional.<BlockPos>of(var3));
      }

      if (!this.method3328()) {
         if (!this.world.field9020) {
            BlockState var4 = this.world.getBlockState(var3);
            if (!var4.isAir()) {
               if (!var4.method23448(Blocks.MOVING_PISTON)) {
                  if (!var4.method23448(Blocks.PISTON_HEAD)) {
                     this.method4846();
                  } else {
                     Direction var5 = var4.<Direction>method23463(Class3436.field19198);
                     if (!this.world.method7007(var3.method8349(var5))) {
                        this.method4846();
                     } else {
                        var3 = var3.method8349(var5);
                        this.field5063.method35446(field5842, Optional.<BlockPos>of(var3));
                     }
                  }
               } else {
                  Direction var19 = var4.<Direction>method23463(Class3435.field19198);
                  if (!this.world.method7007(var3.method8349(var19))) {
                     this.method4846();
                  } else {
                     var3 = var3.method8349(var19);
                     this.field5063.method35446(field5842, Optional.<BlockPos>of(var3));
                  }
               }
            }

            Direction var20 = this.method4848();
            if (!this.method4845(var3, var20)) {
               Direction var6 = this.method4844(var3);
               if (var6 == null) {
                  this.method4846();
               } else {
                  this.field5063.method35446(field5841, var6);
               }
            }
         }
      } else {
         var3 = null;
         float var17 = this.getRidingEntity().field5031;
         this.field5031 = var17;
         this.field4965 = var17;
         this.field4966 = var17;
         this.field5848 = 0;
      }

      float var18 = (float)this.method4851() * 0.01F;
      this.field5845 = this.field5846;
      if (!(this.field5846 > var18)) {
         if (this.field5846 < var18) {
            this.field5846 = MathHelper.method37777(this.field5846 + 0.05F, 0.0F, var18);
         }
      } else {
         this.field5846 = MathHelper.method37777(this.field5846 - 0.05F, var18, 1.0F);
      }

      if (var3 != null) {
         if (this.world.field9020) {
            if (this.field5848 > 0 && this.field5847 != null) {
               this.field5848--;
            } else {
               this.field5847 = var3;
            }
         }

         this.method3274((double)var3.getX() + 0.5, (double)var3.getY(), (double)var3.getZ() + 0.5);
         double var7 = 0.5 - (double) MathHelper.sin((0.5F + this.field5846) * (float) Math.PI) * 0.5;
         double var9 = 0.5 - (double) MathHelper.sin((0.5F + this.field5845) * (float) Math.PI) * 0.5;
         Direction var11 = this.method4848().method536();
         this.method3391(
            new Class6488(
                  this.getPosX() - 0.5,
                  this.getPosY(),
                  this.getPosZ() - 0.5,
                  this.getPosX() + 0.5,
                  this.getPosY() + 1.0,
                  this.getPosZ() + 0.5
               )
               .method19662((double)var11.method539() * var7, (double)var11.method540() * var7, (double)var11.method541() * var7)
         );
         double var12 = var7 - var9;
         if (var12 > 0.0) {
            List<Entity> var14 = this.world.method7181(this, this.method3389());
            if (!var14.isEmpty()) {
               for (Entity var16 : var14) {
                  if (!(var16 instanceof Class1057) && !var16.field5052) {
                     var16.move(
                        Class2107.field13746,
                        new Vector3d(var12 * (double)var11.method539(), var12 * (double)var11.method540(), var12 * (double)var11.method541())
                     );
                  }
               }
            }
         }
      }
   }

   @Override
   public void move(Class2107 var1, Vector3d var2) {
      if (var1 != Class2107.field13745) {
         super.move(var1, var2);
      } else {
         this.method4846();
      }
   }

   @Override
   public void method3215(double var1, double var3, double var5) {
      super.method3215(var1, var3, var5);
      if (this.field5063 != null && this.field5055 != 0) {
         Optional var9 = this.field5063.method35445(field5842);
         Optional var10 = Optional.<BlockPos>of(new BlockPos(var1, var3, var5));
         if (!var10.equals(var9)) {
            this.field5063.method35446(field5842, var10);
            this.field5063.method35446(field5843, (byte)0);
            this.field5078 = true;
         }
      }
   }

   @Nullable
   public Direction method4844(BlockPos var1) {
      for (Direction var7 : Direction.values()) {
         if (this.method4845(var1, var7)) {
            return var7;
         }
      }

      return null;
   }

   private boolean method4845(BlockPos var1, Direction var2) {
      return this.world.method6764(var1.method8349(var2), this, var2.method536())
         && this.world.method7053(this, Class8919.method32596(var1, var2.method536()));
   }

   public boolean method4846() {
      if (!this.method4305() && this.method3066()) {
         BlockPos var3 = this.getPosition();

         for (int var4 = 0; var4 < 5; var4++) {
            BlockPos var5 = var3.method8336(8 - this.field5054.nextInt(17), 8 - this.field5054.nextInt(17), 8 - this.field5054.nextInt(17));
            if (var5.getY() > 0
               && this.world.method7007(var5)
               && this.world.method6810().method24523(var5)
               && this.world.method7053(this, new Class6488(var5))) {
               Direction var6 = this.method4844(var5);
               if (var6 != null) {
                  this.field5063.method35446(field5841, var6);
                  this.method2863(Class6067.field27054, 1.0F, 1.0F);
                  this.field5063.method35446(field5842, Optional.<BlockPos>of(var5));
                  this.field5063.method35446(field5843, (byte)0);
                  this.method4233((Class880)null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public void method2871() {
      super.method2871();
      this.method3434(Vector3d.field18047);
      if (!this.method4305()) {
         this.field4966 = 0.0F;
         this.field4965 = 0.0F;
      }
   }

   @Override
   public void method3155(Class9289<?> var1) {
      if (field5842.equals(var1) && this.world.field9020 && !this.method3328()) {
         BlockPos var4 = this.method4849();
         if (var4 != null) {
            if (this.field5847 != null) {
               this.field5848 = 6;
            } else {
               this.field5847 = var4;
            }

            this.method3274((double)var4.getX() + 0.5, (double)var4.getY(), (double)var4.getZ() + 0.5);
         }
      }

      super.method3155(var1);
   }

   @Override
   public void method3131(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.field4985 = 0;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (this.method4847()) {
         Entity var5 = var1.method31113();
         if (var5 instanceof AbstractArrowEntity) {
            return false;
         }
      }

      if (!super.method2741(var1, var2)) {
         return false;
      } else {
         if ((double)this.method3042() < (double)this.method3075() * 0.5 && this.field5054.nextInt(4) == 0) {
            this.method4846();
         }

         return true;
      }
   }

   private boolean method4847() {
      return this.method4851() == 0;
   }

   @Override
   public boolean method3306() {
      return this.method3066();
   }

   public Direction method4848() {
      return this.field5063.<Direction>method35445(field5841);
   }

   @Nullable
   public BlockPos method4849() {
      return this.field5063.<Optional<BlockPos>>method35445(field5842).orElse((BlockPos)null);
   }

   public void method4850(BlockPos var1) {
      this.field5063.method35446(field5842, Optional.<BlockPos>ofNullable(var1));
   }

   public int method4851() {
      return this.field5063.<Byte>method35445(field5843);
   }

   public void method4852(int var1) {
      if (!this.world.field9020) {
         this.method3085(Class9173.field42113).method38670(field5840);
         if (var1 != 0) {
            this.method2863(Class6067.field27052, 1.0F, 1.0F);
         } else {
            this.method3085(Class9173.field42113).method38668(field5840);
            this.method2863(Class6067.field27048, 1.0F, 1.0F);
         }
      }

      this.field5063.method35446(field5843, (byte)var1);
   }

   public float method4853(float var1) {
      return MathHelper.method37821(var1, this.field5845, this.field5846);
   }

   public int method4854() {
      return this.field5848;
   }

   public BlockPos method4855() {
      return this.field5847;
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return 0.5F;
   }

   @Override
   public int method4259() {
      return 180;
   }

   @Override
   public int method4260() {
      return 180;
   }

   @Override
   public void method3101(Entity var1) {
   }

   @Override
   public float method3319() {
      return 0.0F;
   }

   public boolean method4856() {
      return this.field5847 != null && this.method4849() != null;
   }

   @Nullable
   public Class112 method4857() {
      Byte var3 = this.field5063.<Byte>method35445(field5844);
      return var3 != 16 && var3 <= 15 ? Class112.method315(var3) : null;
   }

   // $VF: synthetic method
   public static Random method4858(Class1057 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method4859(Class1057 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method4860(Class1057 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method4861(Class1057 var0) {
      return var0.field5054;
   }

   // $VF: synthetic method
   public static Random method4862(Class1057 var0) {
      return var0.field5054;
   }
}
