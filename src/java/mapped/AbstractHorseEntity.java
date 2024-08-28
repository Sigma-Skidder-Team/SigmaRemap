package mapped;

import com.google.common.collect.UnmodifiableIterator;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public abstract class AbstractHorseEntity extends Class1018 implements Class1073, IJumpingMount, Class1069 {
   private static final Predicate<Class880> field5879 = var0 -> var0 instanceof AbstractHorseEntity && ((AbstractHorseEntity)var0).method4940();
   private static final Class8522 field5880 = new Class8522().method30203(16.0).method30204().method30205().method30206().method30209(field5879);
   private static final Class120 field5881 = Class120.method339(
      Class8514.field37842,
      Class8514.field37936,
      Blocks.field36777.method11581(),
      Class8514.field37795,
      Class8514.field38057,
      Class8514.field37872,
      Class8514.field37873
   );
   private static final Class9289<Byte> field5882 = Class9361.<Byte>method35441(AbstractHorseEntity.class, Class7784.field33390);
   private static final Class9289<Optional<UUID>> field5883 = Class9361.<Optional<UUID>>method35441(AbstractHorseEntity.class, Class7784.field33404);
   private int field5884;
   private int field5885;
   private int field5886;
   public int field5887;
   public int field5888;
   public boolean field5889;
   public Class927 field5890;
   public int field5891;
   public float field5892;
   private boolean field5893;
   private float field5894;
   private float field5895;
   private float field5896;
   private float field5897;
   private float field5898;
   private float field5899;
   public boolean field5900 = true;
   public int field5901;

   public AbstractHorseEntity(Class8992<? extends AbstractHorseEntity> var1, Class1655 var2) {
      super(var1, var2);
      this.field5051 = 1.0F;
      this.method4948();
   }

   @Override
   public void method4219() {
      this.field5600.method20002(1, new Class2747(this, 1.2));
      this.field5600.method20002(1, new Class2762(this, 1.2));
      this.field5600.method20002(2, new Class2785(this, 1.0, AbstractHorseEntity.class));
      this.field5600.method20002(4, new Class2764(this, 1.0));
      this.field5600.method20002(6, new Class2737(this, 0.7));
      this.field5600.method20002(7, new Class2612(this, PlayerEntity.class, 6.0F));
      this.field5600.method20002(8, new Class2668(this));
      this.method4929();
   }

   public void method4929() {
      this.field5600.method20002(0, new Class2603(this));
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5882, (byte)0);
      this.field5063.method35442(field5883, Optional.<UUID>empty());
   }

   public boolean method4930(int var1) {
      return (this.field5063.<Byte>method35445(field5882) & var1) != 0;
   }

   public void method4931(int var1, boolean var2) {
      byte var5 = this.field5063.<Byte>method35445(field5882);
      if (!var2) {
         this.field5063.method35446(field5882, (byte)(var5 & ~var1));
      } else {
         this.field5063.method35446(field5882, (byte)(var5 | var1));
      }
   }

   public boolean method4932() {
      return this.method4930(2);
   }

   @Nullable
   public UUID method4933() {
      return this.field5063.<Optional<UUID>>method35445(field5883).orElse((UUID)null);
   }

   public void method4934(UUID var1) {
      this.field5063.method35446(field5883, Optional.<UUID>ofNullable(var1));
   }

   public boolean method4935() {
      return this.field5889;
   }

   public void method4936(boolean var1) {
      this.method4931(2, var1);
   }

   public void method4937(boolean var1) {
      this.field5889 = var1;
   }

   @Override
   public void method4774(float var1) {
      if (var1 > 6.0F && this.method4938()) {
         this.method4956(false);
      }
   }

   public boolean method4938() {
      return this.method4930(16);
   }

   public boolean method4939() {
      return this.method4930(32);
   }

   public boolean method4940() {
      return this.method4930(8);
   }

   public void method4941(boolean var1) {
      this.method4931(8, var1);
   }

   @Override
   public boolean method4901() {
      return this.method3066() && !this.method3005() && this.method4932();
   }

   @Override
   public void method4942(Class2266 var1) {
      this.field5890.method3621(0, new ItemStack(Class8514.field37886));
      if (var1 != null) {
         this.field5024.method6744((PlayerEntity)null, this, Class6067.field26677, var1, 0.5F, 1.0F);
      }
   }

   @Override
   public boolean method4943() {
      return this.method4930(4);
   }

   public int method4944() {
      return this.field5891;
   }

   public void method4945(int var1) {
      this.field5891 = var1;
   }

   public int method4946(int var1) {
      int var4 = MathHelper.method37775(this.method4944() + var1, 0, this.method4907());
      this.method4945(var4);
      return var4;
   }

   @Override
   public boolean method3140() {
      return !this.method3329();
   }

   private void method4947() {
      this.method4955();
      if (!this.method3245()) {
         Class9455 var3 = this.method4894();
         if (var3 != null) {
            this.field5024
               .method6743(
                  (PlayerEntity)null,
                  this.getPosX(),
                  this.getPosY(),
                  this.getPosZ(),
                  var3,
                  this.method2864(),
                  1.0F,
                  1.0F + (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F
               );
         }
      }
   }

   @Override
   public boolean method2921(float var1, float var2) {
      if (var1 > 1.0F) {
         this.method2863(Class6067.field26676, 0.4F, 1.0F);
      }

      int var5 = this.method3067(var1, var2);
      if (var5 <= 0) {
         return false;
      } else {
         this.method2741(Class8654.field39002, (float)var5);
         if (this.method3329()) {
            for (Entity var7 : this.method3411()) {
               var7.method2741(Class8654.field39002, (float)var5);
            }
         }

         this.method3068();
         return true;
      }
   }

   @Override
   public int method3067(float var1, float var2) {
      return MathHelper.method37773((var1 * 0.5F - 3.0F) * var2);
   }

   public int method4891() {
      return 2;
   }

   public void method4948() {
      Class927 var3 = this.field5890;
      this.field5890 = new Class927(this.method4891());
      if (var3 != null) {
         var3.method3673(this);
         int var4 = Math.min(var3.method3629(), this.field5890.method3629());

         for (int var5 = 0; var5 < var4; var5++) {
            ItemStack var6 = var3.method3618(var5);
            if (!var6.method32105()) {
               this.field5890.method3621(var5, var6.method32126());
            }
         }
      }

      this.field5890.method3672(this);
      this.method4903();
   }

   public void method4903() {
      if (!this.field5024.field9020) {
         this.method4931(4, !this.field5890.method3618(0).method32105());
      }
   }

   @Override
   public void method4902(Class920 var1) {
      boolean var4 = this.method4943();
      this.method4903();
      if (this.field5055 > 20 && !var4 && this.method4943()) {
         this.method2863(Class6067.field26677, 0.5F, 1.0F);
      }
   }

   public double method4949() {
      return this.method3086(Class9173.field42117);
   }

   @Nullable
   public Class9455 method4894() {
      return null;
   }

   @Nullable
   @Override
   public Class9455 method2880() {
      return null;
   }

   @Nullable
   @Override
   public Class9455 method2879(Class8654 var1) {
      if (this.field5054.nextInt(3) == 0) {
         this.method4958();
      }

      return null;
   }

   @Nullable
   @Override
   public Class9455 method4241() {
      if (this.field5054.nextInt(10) == 0 && !this.method2896()) {
         this.method4958();
      }

      return null;
   }

   @Nullable
   public Class9455 method4893() {
      this.method4958();
      return null;
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      if (!var2.method23384().method31085()) {
         Class7380 var5 = this.field5024.method6738(var1.method8311());
         Class8447 var6 = var2.method23452();
         if (var5.method23448(Blocks.SNOW)) {
            var6 = var5.method23452();
         }

         if (this.method3329() && this.field5900) {
            this.field5901++;
            if (this.field5901 > 5 && this.field5901 % 3 == 0) {
               this.method4950(var6);
            } else if (this.field5901 <= 5) {
               this.method2863(Class6067.field26679, var6.method29710() * 0.15F, var6.method29711());
            }
         } else if (var6 != Class8447.field36200) {
            this.method2863(Class6067.field26678, var6.method29710() * 0.15F, var6.method29711());
         } else {
            this.method2863(Class6067.field26679, var6.method29710() * 0.15F, var6.method29711());
         }
      }
   }

   public void method4950(Class8447 var1) {
      this.method2863(Class6067.field26673, var1.method29710() * 0.15F, var1.method29711());
   }

   public static Class7037 method4951() {
      return Class1006.method4220().method21848(Class9173.field42117).method21849(Class9173.field42105, 53.0).method21849(Class9173.field42108, 0.225F);
   }

   @Override
   public int method4267() {
      return 6;
   }

   public int method4907() {
      return 100;
   }

   @Override
   public float method3099() {
      return 0.8F;
   }

   @Override
   public int method4236() {
      return 400;
   }

   public void openGUI(PlayerEntity var1) {
      if (!this.field5024.field9020 && (!this.method3329() || this.method3409(var1)) && this.method4932()) {
         var1.method2768(this, this.field5890);
      }
   }

   public Class2274 method4953(PlayerEntity var1, ItemStack var2) {
      boolean var5 = this.method4892(var1, var2);
      if (!var1.field4919.field29609) {
         var2.method32182(1);
      }

      if (!this.field5024.field9020) {
         return !var5 ? Class2274.field14820 : Class2274.field14818;
      } else {
         return Class2274.field14819;
      }
   }

   public boolean method4892(PlayerEntity var1, ItemStack var2) {
      boolean var5 = false;
      float var6 = 0.0F;
      short var7 = 0;
      byte var8 = 0;
      Class3257 var9 = var2.method32107();
      if (var9 != Class8514.field37842) {
         if (var9 != Class8514.field37936) {
            if (var9 != Blocks.field36777.method11581()) {
               if (var9 != Class8514.field37795) {
                  if (var9 != Class8514.field38057) {
                     if (var9 == Class8514.field37872 || var9 == Class8514.field37873) {
                        var6 = 10.0F;
                        var7 = 240;
                        var8 = 10;
                        if (!this.field5024.field9020 && this.method4932() && this.method4767() == 0 && !this.method4507()) {
                           var5 = true;
                           this.method4503(var1);
                        }
                     }
                  } else {
                     var6 = 4.0F;
                     var7 = 60;
                     var8 = 5;
                     if (!this.field5024.field9020 && this.method4932() && this.method4767() == 0 && !this.method4507()) {
                        var5 = true;
                        this.method4503(var1);
                     }
                  }
               } else {
                  var6 = 3.0F;
                  var7 = 60;
                  var8 = 3;
               }
            } else {
               var6 = 20.0F;
               var7 = 180;
            }
         } else {
            var6 = 1.0F;
            var7 = 30;
            var8 = 3;
         }
      } else {
         var6 = 2.0F;
         var7 = 20;
         var8 = 3;
      }

      if (this.method3042() < this.method3075() && var6 > 0.0F) {
         this.method3041(var6);
         var5 = true;
      }

      if (this.method3005() && var7 > 0) {
         this.field5024.method6746(Class7940.field34078, this.method3438(1.0), this.method3441() + 0.5, this.method3445(1.0), 0.0, 0.0, 0.0);
         if (!this.field5024.field9020) {
            this.method4769(var7);
         }

         var5 = true;
      }

      if (var8 > 0 && (var5 || !this.method4932()) && this.method4944() < this.method4907()) {
         var5 = true;
         if (!this.field5024.field9020) {
            this.method4946(var8);
         }
      }

      if (var5) {
         this.method4947();
      }

      return var5;
   }

   public void method4920(PlayerEntity var1) {
      this.method4956(false);
      this.method4957(false);
      if (!this.field5024.field9020) {
         var1.field5031 = this.field5031;
         var1.field5032 = this.field5032;
         var1.method3311(this);
      }
   }

   @Override
   public boolean method2896() {
      return super.method2896() && this.method3329() && this.method4943() || this.method4938() || this.method4939();
   }

   @Override
   public boolean method4381(ItemStack var1) {
      return field5881.test(var1);
   }

   private void method4954() {
      this.field5887 = 1;
   }

   @Override
   public void method2877() {
      super.method2877();
      if (this.field5890 != null) {
         for (int var3 = 0; var3 < this.field5890.method3629(); var3++) {
            ItemStack var4 = this.field5890.method3618(var3);
            if (!var4.method32105() && !Class7858.method26335(var4)) {
               this.method3302(var4);
            }
         }
      }
   }

   @Override
   public void method2871() {
      if (this.field5054.nextInt(200) == 0) {
         this.method4954();
      }

      super.method2871();
      if (!this.field5024.field9020 && this.method3066()) {
         if (this.field5054.nextInt(900) == 0 && this.field4955 == 0) {
            this.method3041(1.0F);
         }

         if (this.method4917()) {
            if (!this.method4938()
               && !this.method3329()
               && this.field5054.nextInt(300) == 0
               && this.field5024.method6738(this.method3432().method8313()).method23448(Blocks.field36395)) {
               this.method4956(true);
            }

            if (this.method4938() && ++this.field5884 > 50) {
               this.field5884 = 0;
               this.method4956(false);
            }
         }

         this.method4916();
      }
   }

   public void method4916() {
      if (this.method4940() && this.method3005() && !this.method4938()) {
         Class880 var3 = this.field5024
            .<AbstractHorseEntity>method7191(
               AbstractHorseEntity.class, field5880, this, this.getPosX(), this.getPosY(), this.getPosZ(), this.method3389().method19664(16.0)
            );
         if (var3 != null && this.getDistanceSq(var3) > 4.0) {
            this.field5599.method21652(var3, 0);
         }
      }
   }

   public boolean method4917() {
      return true;
   }

   @Override
   public void tick() {
      super.tick();
      if (this.field5885 > 0 && ++this.field5885 > 30) {
         this.field5885 = 0;
         this.method4931(64, false);
      }

      if ((this.method3418() || this.method3138()) && this.field5886 > 0 && ++this.field5886 > 20) {
         this.field5886 = 0;
         this.method4957(false);
      }

      if (this.field5887 > 0 && ++this.field5887 > 8) {
         this.field5887 = 0;
      }

      if (this.field5888 > 0) {
         this.field5888++;
         if (this.field5888 > 300) {
            this.field5888 = 0;
         }
      }

      this.field5895 = this.field5894;
      if (!this.method4938()) {
         this.field5894 = this.field5894 + ((0.0F - this.field5894) * 0.4F - 0.05F);
         if (this.field5894 < 0.0F) {
            this.field5894 = 0.0F;
         }
      } else {
         this.field5894 = this.field5894 + (1.0F - this.field5894) * 0.4F + 0.05F;
         if (this.field5894 > 1.0F) {
            this.field5894 = 1.0F;
         }
      }

      this.field5897 = this.field5896;
      if (!this.method4939()) {
         this.field5893 = false;
         this.field5896 = this.field5896 + ((0.8F * this.field5896 * this.field5896 * this.field5896 - this.field5896) * 0.6F - 0.05F);
         if (this.field5896 < 0.0F) {
            this.field5896 = 0.0F;
         }
      } else {
         this.field5894 = 0.0F;
         this.field5895 = this.field5894;
         this.field5896 = this.field5896 + (1.0F - this.field5896) * 0.4F + 0.05F;
         if (this.field5896 > 1.0F) {
            this.field5896 = 1.0F;
         }
      }

      this.field5899 = this.field5898;
      if (!this.method4930(64)) {
         this.field5898 = this.field5898 + ((0.0F - this.field5898) * 0.7F - 0.05F);
         if (this.field5898 < 0.0F) {
            this.field5898 = 0.0F;
         }
      } else {
         this.field5898 = this.field5898 + (1.0F - this.field5898) * 0.7F + 0.05F;
         if (this.field5898 > 1.0F) {
            this.field5898 = 1.0F;
         }
      }
   }

   private void method4955() {
      if (!this.field5024.field9020) {
         this.field5885 = 1;
         this.method4931(64, true);
      }
   }

   public void method4956(boolean var1) {
      this.method4931(16, var1);
   }

   public void method4957(boolean var1) {
      if (var1) {
         this.method4956(false);
      }

      this.method4931(32, var1);
   }

   private void method4958() {
      if (this.method3418() || this.method3138()) {
         this.field5886 = 1;
         this.method4957(true);
      }
   }

   public void method4896() {
      if (!this.method4939()) {
         this.method4958();
         Class9455 var3 = this.method4893();
         if (var3 != null) {
            this.method2863(var3, this.method3099(), this.method3100());
         }
      }
   }

   public boolean method4959(PlayerEntity var1) {
      this.method4934(var1.getUniqueID());
      this.method4936(true);
      if (var1 instanceof Class878) {
         Class9551.field44488.method15115((Class878)var1, this);
      }

      this.field5024.method6786(this, (byte)7);
      return true;
   }

   @Override
   public void method2915(Vector3d var1) {
      if (this.method3066()) {
         if (this.method3329() && this.method4277() && this.method4943()) {
            Class880 var4 = (Class880)this.method3407();
            this.field5031 = var4.field5031;
            this.field5033 = this.field5031;
            this.field5032 = var4.field5032 * 0.5F;
            this.method3214(this.field5031, this.field5032);
            this.field4965 = this.field5031;
            this.field4967 = this.field4965;
            float var5 = var4.field4982 * 0.5F;
            float var6 = var4.field4984;
            if (var6 <= 0.0F) {
               var6 *= 0.25F;
               this.field5901 = 0;
            }

            if (this.field5036 && this.field5892 == 0.0F && this.method4939() && !this.field5893) {
               var5 = 0.0F;
               var6 = 0.0F;
            }

            if (this.field5892 > 0.0F && !this.method4935() && this.field5036) {
               double var7 = this.method4949() * (double)this.field5892 * (double)this.method3229();
               double var9;
               if (!this.method3033(Class8254.field35474)) {
                  var9 = var7;
               } else {
                  var9 = var7 + (double)((float)(this.method3034(Class8254.field35474).method8629() + 1) * 0.1F);
               }

               Vector3d var11 = this.method3433();
               this.method3435(var11.field18048, var9, var11.field18050);
               this.method4937(true);
               this.field5078 = true;
               if (var6 > 0.0F) {
                  float var12 = MathHelper.method37763(this.field5031 * (float) (Math.PI / 180.0));
                  float var13 = MathHelper.method37764(this.field5031 * (float) (Math.PI / 180.0));
                  this.method3434(this.method3433().method11339((double)(-0.4F * var12 * this.field5892), 0.0, (double)(0.4F * var13 * this.field5892)));
               }

               this.field5892 = 0.0F;
            }

            this.field4969 = this.method2918() * 0.1F;
            if (!this.method3418()) {
               if (var4 instanceof PlayerEntity) {
                  this.method3434(Vector3d.field18047);
               }
            } else {
               this.method3113((float)this.method3086(Class9173.field42108));
               super.method2915(new Vector3d((double)var5, var1.field18049, (double)var6));
            }

            if (this.field5036) {
               this.field5892 = 0.0F;
               this.method4937(false);
            }

            this.method3108(this, false);
         } else {
            this.field4969 = 0.02F;
            super.method2915(var1);
         }
      }
   }

   public void method4960() {
      this.method2863(Class6067.field26675, 0.4F, 1.0F);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method115("EatingHaystack", this.method4938());
      var1.method115("Bred", this.method4940());
      var1.method102("Temper", this.method4944());
      var1.method115("Tame", this.method4932());
      if (this.method4933() != null) {
         var1.method104("Owner", this.method4933());
      }

      if (!this.field5890.method3618(0).method32105()) {
         var1.method99("SaddleItem", this.field5890.method3618(0).method32112(new Class39()));
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      this.method4956(var1.method132("EatingHaystack"));
      this.method4941(var1.method132("Bred"));
      this.method4945(var1.method122("Temper"));
      this.method4936(var1.method132("Tame"));
      UUID var5;
      if (!var1.method106("Owner")) {
         String var4 = var1.method126("Owner");
         var5 = Class9061.method33732(this.method3396(), var4);
      } else {
         var5 = var1.method105("Owner");
      }

      if (var5 != null) {
         this.method4934(var5);
      }

      if (var1.method119("SaddleItem", 10)) {
         ItemStack var6 = ItemStack.method32104(var1.method130("SaddleItem"));
         if (var6.method32107() == Class8514.field37886) {
            this.field5890.method3621(0, var6);
         }
      }

      this.method4903();
   }

   @Override
   public boolean method4386(Class1018 var1) {
      return false;
   }

   public boolean method4961() {
      return !this.method3329() && !this.method3328() && this.method4932() && !this.method3005() && this.method3042() >= this.method3075() && this.method4507();
   }

   @Nullable
   @Override
   public Class1045 method4389(ServerWorld var1, Class1045 var2) {
      return null;
   }

   public void method4962(Class1045 var1, AbstractHorseEntity var2) {
      double var5 = this.method3087(Class9173.field42105) + var1.method3087(Class9173.field42105) + (double)this.method4971();
      var2.method3085(Class9173.field42105).method38661(var5 / 3.0);
      double var7 = this.method3087(Class9173.field42117) + var1.method3087(Class9173.field42117) + this.method4972();
      var2.method3085(Class9173.field42117).method38661(var7 / 3.0);
      double var9 = this.method3087(Class9173.field42108) + var1.method3087(Class9173.field42108) + this.method4973();
      var2.method3085(Class9173.field42108).method38661(var9 / 3.0);
   }

   @Override
   public boolean method4277() {
      return this.method3407() instanceof Class880;
   }

   public float method4963(float var1) {
      return MathHelper.method37821(var1, this.field5895, this.field5894);
   }

   public float method4964(float var1) {
      return MathHelper.method37821(var1, this.field5897, this.field5896);
   }

   public float method4965(float var1) {
      return MathHelper.method37821(var1, this.field5899, this.field5898);
   }

   @Override
   public void method4966(int var1) {
      if (this.method4943()) {
         if (var1 >= 0) {
            this.field5893 = true;
            this.method4958();
         } else {
            var1 = 0;
         }

         if (var1 < 90) {
            this.field5892 = 0.4F + 0.4F * (float)var1 / 90.0F;
         } else {
            this.field5892 = 1.0F;
         }
      }
   }

   @Override
   public boolean canJump() {
      return this.method4943();
   }

   @Override
   public void handleStartJump(int var1) {
      this.field5893 = true;
      this.method4958();
      this.method4960();
   }

   @Override
   public void handleStopJump() {
   }

   public void method4970(boolean var1) {
      Class7435 var4 = !var1 ? Class7940.field34092 : Class7940.field34080;

      for (int var5 = 0; var5 < 7; var5++) {
         double var6 = this.field5054.nextGaussian() * 0.02;
         double var8 = this.field5054.nextGaussian() * 0.02;
         double var10 = this.field5054.nextGaussian() * 0.02;
         this.field5024.method6746(var4, this.method3438(1.0), this.method3441() + 0.5, this.method3445(1.0), var6, var8, var10);
      }
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 7) {
         if (var1 != 6) {
            super.method2866(var1);
         } else {
            this.method4970(false);
         }
      } else {
         this.method4970(true);
      }
   }

   @Override
   public void method3307(Entity var1) {
      super.method3307(var1);
      if (var1 instanceof Class1006) {
         Class1006 var4 = (Class1006)var1;
         this.field4965 = var4.field4965;
      }

      if (this.field5897 > 0.0F) {
         float var8 = MathHelper.method37763(this.field4965 * (float) (Math.PI / 180.0));
         float var5 = MathHelper.method37764(this.field4965 * (float) (Math.PI / 180.0));
         float var6 = 0.7F * this.field5897;
         float var7 = 0.15F * this.field5897;
         var1.method3215(
            this.getPosX() + (double)(var6 * var8),
            this.getPosY() + this.method3310() + var1.method2894() + (double)var7,
            this.getPosZ() - (double)(var6 * var5)
         );
         if (var1 instanceof Class880) {
            ((Class880)var1).field4965 = this.field4965;
         }
      }
   }

   public float method4971() {
      return 15.0F + (float)this.field5054.nextInt(8) + (float)this.field5054.nextInt(9);
   }

   public double method4972() {
      return 0.4F + this.field5054.nextDouble() * 0.2 + this.field5054.nextDouble() * 0.2 + this.field5054.nextDouble() * 0.2;
   }

   public double method4973() {
      return (0.45F + this.field5054.nextDouble() * 0.3 + this.field5054.nextDouble() * 0.3 + this.field5054.nextDouble() * 0.3) * 0.25;
   }

   @Override
   public boolean method3063() {
      return false;
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return var2.field39969 * 0.95F;
   }

   public boolean method4898() {
      return false;
   }

   public boolean method4899() {
      return !this.method2943(Class2106.field13735).method32105();
   }

   public boolean method4900(ItemStack var1) {
      return false;
   }

   @Override
   public boolean method2963(int var1, ItemStack var2) {
      int var5 = var1 - 400;
      if (var5 >= 0 && var5 < 2 && var5 < this.field5890.method3629()) {
         if (var5 == 0 && var2.method32107() != Class8514.field37886) {
            return false;
         } else if (var5 == 1 && (!this.method4898() || !this.method4900(var2))) {
            return false;
         } else {
            this.field5890.method3621(var5, var2);
            this.method4903();
            return true;
         }
      } else {
         int var6 = var1 - 500 + 2;
         if (var6 >= 2 && var6 < this.field5890.method3629()) {
            this.field5890.method3621(var6, var2);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public Entity method3407() {
      return !this.method3408().isEmpty() ? this.method3408().get(0) : null;
   }

   @Nullable
   private Vector3d method4974(Vector3d var1, Class880 var2) {
      double var5 = this.getPosX() + var1.field18048;
      double var7 = this.method3389().field28450;
      double var9 = this.getPosZ() + var1.field18050;
      Mutable var11 = new Mutable();
      UnmodifiableIterator var12 = var2.method2982().iterator();

      while (var12.hasNext()) {
         Class2090 var13 = (Class2090)var12.next();
         var11.method8373(var5, var7, var9);
         double var14 = this.method3389().field28453 + 0.75;

         do {
            double var16 = this.field5024.method7039(var11);
            if ((double)var11.getY() + var16 > var14) {
               break;
            }

            if (Class4527.method14423(var16)) {
               Class6488 var18 = var2.method3172(var13);
               Vector3d var19 = new Vector3d(var5, (double)var11.getY() + var16, var9);
               if (Class4527.method14424(this.field5024, var2, var18.method19669(var19))) {
                  var2.method3211(var13);
                  return var19;
               }
            }

            var11.method8379(Direction.field673);
         } while (!((double)var11.getY() < var14));
      }

      return null;
   }

   @Override
   public Vector3d method3420(Class880 var1) {
      Vector3d var4 = method3419(
         (double)this.method3429(), (double)var1.method3429(), this.field5031 + (var1.method2967() != Class2205.field14418 ? -90.0F : 90.0F)
      );
      Vector3d var5 = this.method4974(var4, var1);
      if (var5 == null) {
         Vector3d var6 = method3419(
            (double)this.method3429(), (double)var1.method3429(), this.field5031 + (var1.method2967() != Class2205.field14417 ? -90.0F : 90.0F)
         );
         Vector3d var7 = this.method4974(var6, var1);
         return var7 == null ? this.getPositionVec() : var7;
      } else {
         return var5;
      }
   }

   public void method4925() {
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      if (var4 == null) {
         var4 = new Class5097(0.2F);
      }

      this.method4925();
      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }
}
