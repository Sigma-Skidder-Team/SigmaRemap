package mapped;

import com.google.common.collect.Maps;

import javax.annotation.Nullable;
import java.util.*;

public abstract class Class1006 extends Class880 {
   private static final Class9289<Byte> field5592 = Class9361.<Byte>method35441(Class1006.class, Class7784.field33390);
   public int field5593;
   public int field5594;
   public Class8092 field5595;
   public Class6829 field5596;
   public Class7956 field5597;
   private final Class7395 field5598;
   public Class6990 field5599;
   public final Class6603 field5600;
   public final Class6603 field5601;
   private Class880 field5602;
   private final Class9363 field5603;
   private final NonNullList<ItemStack> field5604 = NonNullList.<ItemStack>method68(2, ItemStack.EMPTY);
   public final float[] field5605 = new float[2];
   private final NonNullList<ItemStack> field5606 = NonNullList.<ItemStack>method68(4, ItemStack.EMPTY);
   public final float[] field5607 = new float[4];
   private boolean field5608;
   private boolean field5609;
   private final Map<Class2163, Float> field5610 = Maps.newEnumMap(Class2163.class);
   private ResourceLocation field5611;
   private long field5612;
   private Entity field5613;
   private int field5614;
   private CompoundNBT field5615;
   private BlockPos field5616 = BlockPos.ZERO;
   private float field5617 = -1.0F;

   public Class1006(EntityType<? extends Class1006> var1, World var2) {
      super(var1, var2);
      this.field5600 = new Class6603(var2.method6821());
      this.field5601 = new Class6603(var2.method6821());
      this.field5595 = new Class8092(this);
      this.field5596 = new Class6829(this);
      this.field5597 = new Class7956(this);
      this.field5598 = this.method4226();
      this.field5599 = this.method4221(var2);
      this.field5603 = new Class9363(this);
      Arrays.fill(this.field5607, 0.085F);
      Arrays.fill(this.field5605, 0.085F);
      if (var2 != null && !var2.field9020) {
         this.method4219();
      }
   }

   public void method4219() {
   }

   public static Class7037 method4220() {
      return Class880.method2997().method21849(Class9173.field42106, 16.0).method21848(Class9173.field42111);
   }

   public Class6990 method4221(World var1) {
      return new Class6991(this, var1);
   }

   public boolean method4222() {
      return false;
   }

   public float method4223(Class2163 var1) {
      Class1006 var4;
      if (this.getRidingEntity() instanceof Class1006 && ((Class1006)this.getRidingEntity()).method4222()) {
         var4 = (Class1006)this.getRidingEntity();
      } else {
         var4 = this;
      }

      Float var5 = var4.field5610.get(var1);
      return var5 != null ? var5 : var1.method8884();
   }

   public void method4224(Class2163 var1, float var2) {
      this.field5610.put(var1, var2);
   }

   public boolean method4225(Class2163 var1) {
      return var1 != Class2163.field14195 && var1 != Class2163.field14197 && var1 != Class2163.field14199 && var1 != Class2163.field14187;
   }

   public Class7395 method4226() {
      return new Class7395(this);
   }

   public Class8092 method4227() {
      return this.field5595;
   }

   public Class6829 method4228() {
      if (this.method3328() && this.getRidingEntity() instanceof Class1006) {
         Class1006 var3 = (Class1006)this.getRidingEntity();
         return var3.method4228();
      } else {
         return this.field5596;
      }
   }

   public Class7956 method4229() {
      return this.field5597;
   }

   public Class6990 method4230() {
      if (this.method3328() && this.getRidingEntity() instanceof Class1006) {
         Class1006 var3 = (Class1006)this.getRidingEntity();
         return var3.method4230();
      } else {
         return this.field5599;
      }
   }

   public Class9363 method4231() {
      return this.field5603;
   }

   @Nullable
   public Class880 method4232() {
      return this.field5602;
   }

   public void method4233(Class880 var1) {
      this.field5602 = var1;
      Class9299.method35055(Class9299.field42862, this, var1);
   }

   @Override
   public boolean method2996(EntityType<?> var1) {
      return var1 != EntityType.field41034;
   }

   public boolean method4234(Class3262 var1) {
      return false;
   }

   public void method4235() {
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5592, (byte)0);
   }

   public int method4236() {
      return 80;
   }

   public void method4237() {
      Class9455 var3 = this.method4241();
      if (var3 != null) {
         this.method2863(var3, this.method3099(), this.method3100());
      }
   }

   @Override
   public void method3000() {
      super.method3000();
      this.world.method6820().startSection("mobBaseTick");
      if (this.method3066() && this.field5054.nextInt(1000) < this.field5593++) {
         this.method4238();
         this.method4237();
      }

      this.world.method6820().endSection();
   }

   @Override
   public void method3048(Class8654 var1) {
      this.method4238();
      super.method3048(var1);
   }

   private void method4238() {
      this.field5593 = -this.method4236();
   }

   @Override
   public int method2937(PlayerEntity var1) {
      if (this.field5594 <= 0) {
         return this.field5594;
      } else {
         int var4 = this.field5594;

         for (int var5 = 0; var5 < this.field5606.size(); var5++) {
            if (!this.field5606.get(var5).isEmpty() && this.field5607[var5] <= 1.0F) {
               var4 += 1 + this.field5054.nextInt(3);
            }
         }

         for (int var6 = 0; var6 < this.field5604.size(); var6++) {
            if (!this.field5604.get(var6).isEmpty() && this.field5605[var6] <= 1.0F) {
               var4 += 1 + this.field5054.nextInt(3);
            }
         }

         return var4;
      }
   }

   public void method4239() {
      if (!this.world.field9020) {
         this.world.method6786(this, (byte)20);
      } else {
         for (int var3 = 0; var3 < 20; var3++) {
            double var4 = this.field5054.nextGaussian() * 0.02;
            double var6 = this.field5054.nextGaussian() * 0.02;
            double var8 = this.field5054.nextGaussian() * 0.02;
            double var10 = 10.0;
            this.world
               .method6746(
                  Class7940.field34089,
                  this.method3437(1.0) - var4 * 10.0,
                  this.method3441() - var6 * 10.0,
                  this.method3445(1.0) - var8 * 10.0,
                  var4,
                  var6,
                  var8
               );
         }
      }
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 20) {
         super.method2866(var1);
      } else {
         this.method4239();
      }
   }

   @Override
   public void tick() {
      if (Class7944.method26938() && this.method4311()) {
         this.method4313();
      } else {
         super.tick();
         if (!this.world.field9020) {
            this.method4293();
            if (this.field5055 % 5 == 0) {
               this.method4240();
            }
         }
      }
   }

   public void method4240() {
      boolean var3 = !(this.method3407() instanceof Class1006);
      boolean var4 = !(this.getRidingEntity() instanceof BoatEntity);
      this.field5600.method20010(Class2240.field14657, var3);
      this.field5600.method20010(Class2240.field14659, var3 && var4);
      this.field5600.method20010(Class2240.field14658, var3);
   }

   @Override
   public float method3123(float var1, float var2) {
      this.field5598.method23626();
      return var2;
   }

   @Nullable
   public Class9455 method4241() {
      return null;
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      var1.method115("CanPickUpLoot", this.method4280());
      var1.method115("PersistenceRequired", this.field5609);
      ListNBT var4 = new ListNBT();

      for (ItemStack var6 : this.field5606) {
         CompoundNBT var7 = new CompoundNBT();
         if (!var6.isEmpty()) {
            var6.method32112(var7);
         }

         var4.add(var7);
      }

      var1.put("ArmorItems", var4);
      ListNBT var12 = new ListNBT();

      for (ItemStack var15 : this.field5604) {
         CompoundNBT var8 = new CompoundNBT();
         if (!var15.isEmpty()) {
            var15.method32112(var8);
         }

         var12.add(var8);
      }

      var1.put("HandItems", var12);
      ListNBT var14 = new ListNBT();

      for (float var10 : this.field5607) {
         var14.add(Class32.method90(var10));
      }

      var1.put("ArmorDropChances", var14);
      ListNBT var17 = new ListNBT();

      for (float var11 : this.field5605) {
         var17.add(Class32.method90(var11));
      }

      var1.put("HandDropChances", var17);
      if (this.field5613 == null) {
         if (this.field5615 != null) {
            var1.put("Leash", this.field5615.method79());
         }
      } else {
         CompoundNBT var20 = new CompoundNBT();
         if (!(this.field5613 instanceof Class880)) {
            if (this.field5613 instanceof Class995) {
               BlockPos var22 = ((Class995)this.field5613).method4085();
               var20.method102("X", var22.getX());
               var20.method102("Y", var22.getY());
               var20.method102("Z", var22.getZ());
            }
         } else {
            UUID var23 = this.field5613.getUniqueID();
            var20.method104("UUID", var23);
         }

         var1.put("Leash", var20);
      }

      var1.method115("LeftHanded", this.method4306());
      if (this.field5611 != null) {
         var1.method109("DeathLootTable", this.field5611.toString());
         if (this.field5612 != 0L) {
            var1.method103("DeathLootTableSeed", this.field5612);
         }
      }

      if (this.method4305()) {
         var1.method115("NoAI", this.method4305());
      }
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      if (var1.method119("CanPickUpLoot", 1)) {
         this.method4281(var1.method132("CanPickUpLoot"));
      }

      this.field5609 = var1.method132("PersistenceRequired");
      if (var1.method119("ArmorItems", 9)) {
         ListNBT var4 = var1.method131("ArmorItems", 10);

         for (int var5 = 0; var5 < this.field5606.size(); var5++) {
            this.field5606.set(var5, ItemStack.method32104(var4.method153(var5)));
         }
      }

      if (var1.method119("HandItems", 9)) {
         ListNBT var6 = var1.method131("HandItems", 10);

         for (int var9 = 0; var9 < this.field5604.size(); var9++) {
            this.field5604.set(var9, ItemStack.method32104(var6.method153(var9)));
         }
      }

      if (var1.method119("ArmorDropChances", 9)) {
         ListNBT var7 = var1.method131("ArmorDropChances", 5);

         for (int var10 = 0; var10 < var7.size(); var10++) {
            this.field5607[var10] = var7.method159(var10);
         }
      }

      if (var1.method119("HandDropChances", 9)) {
         ListNBT var8 = var1.method131("HandDropChances", 5);

         for (int var11 = 0; var11 < var8.size(); var11++) {
            this.field5605[var11] = var8.method159(var11);
         }
      }

      if (var1.method119("Leash", 10)) {
         this.field5615 = var1.getCompound("Leash");
      }

      this.method4303(var1.method132("LeftHanded"));
      if (var1.method119("DeathLootTable", 8)) {
         this.field5611 = new ResourceLocation(var1.method126("DeathLootTable"));
         this.field5612 = var1.method123("DeathLootTableSeed");
      }

      this.method4302(var1.method132("NoAI"));
   }

   @Override
   public void method3056(Class8654 var1, boolean var2) {
      super.method3056(var1, var2);
      this.field5611 = null;
   }

   @Override
   public Class9464 method3057(boolean var1, Class8654 var2) {
      return super.method3057(var1, var2).method36452(this.field5612, this.field5054);
   }

   @Override
   public final ResourceLocation method3055() {
      return this.field5611 != null ? this.field5611 : this.method4242();
   }

   public ResourceLocation method4242() {
      return super.method3055();
   }

   public void method4243(float var1) {
      this.field4984 = var1;
   }

   public void method4244(float var1) {
      this.field4983 = var1;
   }

   public void method4245(float var1) {
      this.field4982 = var1;
   }

   @Override
   public void method3113(float var1) {
      super.method3113(var1);
      this.method4243(var1);
   }

   @Override
   public void method2871() {
      super.method2871();
      this.world.method6820().startSection("looting");
      boolean var3 = this.world.method6789().method17135(Class5462.field24224);
      if (Class9299.field42847.method20214()) {
         var3 = Class9299.method35056(Class9299.field42847, this.world, this);
      }

      if (!this.world.field9020 && this.method4280() && this.method3066() && !this.field4972 && var3) {
         for (ItemEntity var5 : this.world.<ItemEntity>method7182(ItemEntity.class, this.method3389().method19663(1.0, 0.0, 1.0))) {
            if (!var5.field5041 && !var5.method4124().isEmpty() && !var5.method4135() && this.method4253(var5.method4124())) {
               this.method4246(var5);
            }
         }
      }

      this.world.method6820().endSection();
   }

   public void method4246(ItemEntity var1) {
      ItemStack var4 = var1.method4124();
      if (this.method4247(var4)) {
         this.method3134(var1);
         this.method2751(var1, var4.getCount());
         var1.method2904();
      }
   }

   public boolean method4247(ItemStack var1) {
      Class2106 var4 = method4271(var1);
      ItemStack var5 = this.method2943(var4);
      boolean var6 = this.method4250(var1, var5);
      if (var6 && this.method4252(var1)) {
         double var7 = (double)this.method4269(var4);
         if (!var5.isEmpty() && (double)Math.max(this.field5054.nextFloat() - 0.1F, 0.0F) < var7) {
            this.method3302(var5);
         }

         this.method4248(var4, var1);
         this.method3023(var1);
         return true;
      } else {
         return false;
      }
   }

   public void method4248(Class2106 var1, ItemStack var2) {
      this.method2944(var1, var2);
      this.method4249(var1);
      this.field5609 = true;
   }

   public void method4249(Class2106 var1) {
      switch (Class8979.field40589[var1.method8772().ordinal()]) {
         case 1:
            this.field5605[var1.method8773()] = 2.0F;
            break;
         case 2:
            this.field5607[var1.method8773()] = 2.0F;
      }
   }

   public boolean method4250(ItemStack var1, ItemStack var2) {
      if (!var2.isEmpty()) {
         if (!(var1.getItem() instanceof ItemSword)) {
            if (var1.getItem() instanceof Class3263 && var2.getItem() instanceof Class3263) {
               return this.method4251(var1, var2);
            } else if (var1.getItem() instanceof Class3261 && var2.getItem() instanceof Class3261) {
               return this.method4251(var1, var2);
            } else if (!(var1.getItem() instanceof Class3279)) {
               if (var1.getItem() instanceof Class3264) {
                  if (var2.getItem() instanceof Class3292) {
                     return true;
                  }

                  if (var2.getItem() instanceof Class3264) {
                     Class3264 var8 = (Class3264)var1.getItem();
                     Class3264 var10 = (Class3264)var2.getItem();
                     if (var8.method11779() == var10.method11779()) {
                        return this.method4251(var1, var2);
                     }

                     return var8.method11779() > var10.method11779();
                  }
               }

               return false;
            } else if (!Class7858.method26334(var2)) {
               if (var2.getItem() instanceof Class3279) {
                  Class3279 var7 = (Class3279)var1.getItem();
                  Class3279 var9 = (Class3279)var2.getItem();
                  if (var7.method11807() == var9.method11807()) {
                     return var7.method11808() == var9.method11808() ? this.method4251(var1, var2) : var7.method11808() > var9.method11808();
                  } else {
                     return var7.method11807() > var9.method11807();
                  }
               } else {
                  return true;
               }
            } else {
               return false;
            }
         } else if (var2.getItem() instanceof ItemSword) {
            ItemSword var5 = (ItemSword)var1.getItem();
            ItemSword var6 = (ItemSword)var2.getItem();
            return var5.method11784() == var6.method11784() ? this.method4251(var1, var2) : var5.method11784() > var6.method11784();
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public boolean method4251(ItemStack var1, ItemStack var2) {
      if (var1.method32117() >= var2.method32117() && (!var1.method32141() || var2.method32141())) {
         return var1.method32141() && var2.method32141()
            ? var1.method32142().method97().stream().anyMatch(var0 -> !var0.equals("Damage"))
               && !var2.method32142().method97().stream().anyMatch(var0 -> !var0.equals("Damage"))
            : false;
      } else {
         return true;
      }
   }

   public boolean method4252(ItemStack var1) {
      return true;
   }

   public boolean method4253(ItemStack var1) {
      return this.method4252(var1);
   }

   public boolean method4254(double var1) {
      return true;
   }

   public boolean method4255() {
      return this.method3328();
   }

   public boolean method4256() {
      return false;
   }

   @Override
   public void method3447() {
      if (this.world.method6997() == Class2197.field14351 && this.method4256()) {
         this.method2904();
      } else if (!this.method4282() && !this.method4255()) {
         PlayerEntity var3 = this.world.method7185(this, -1.0);
         if (Class9299.field42844.method20214()) {
            Object var4 = Class9299.field42844.method20223(this);
            if (var4 != Class9561.field44533) {
               if (var4 == Class9561.field44532) {
                  this.method2904();
                  var3 = null;
               }
            } else {
               this.field4973 = 0;
               var3 = null;
            }
         }

         if (var3 != null) {
            double var5 = var3.getDistanceSq(this);
            int var7 = this.getType().method33209().method522();
            int var8 = var7 * var7;
            if (var5 > (double)var8 && this.method4254(var5)) {
               this.method2904();
            }

            int var9 = this.getType().method33209().method523();
            int var10 = var9 * var9;
            if (this.field4973 > 600 && this.field5054.nextInt(800) == 0 && var5 > (double)var10 && this.method4254(var5)) {
               this.method2904();
            } else if (var5 < (double)var10) {
               this.field4973 = 0;
            }
         }
      } else {
         this.field4973 = 0;
      }
   }

   @Override
   public final void updateEntityActionState() {
      this.field4973++;
      this.world.method6820().startSection("sensing");
      this.field5603.method35459();
      this.world.method6820().endSection();
      this.world.method6820().startSection("targetSelector");
      this.field5601.method20004();
      this.world.method6820().endSection();
      this.world.method6820().startSection("goalSelector");
      this.field5600.method20004();
      this.world.method6820().endSection();
      this.world.method6820().startSection("navigation");
      this.field5599.method21658();
      this.world.method6820().endSection();
      this.world.method6820().startSection("mob tick");
      this.method4258();
      this.world.method6820().endSection();
      this.world.method6820().startSection("controls");
      this.world.method6820().startSection("move");
      this.field5596.method20810();
      this.world.method6820().endStartSection("look");
      this.field5595.method28037();
      this.world.method6820().endStartSection("jump");
      this.field5597.method27048();
      this.world.method6820().endSection();
      this.world.method6820().endSection();
      this.method4257();
   }

   public void method4257() {
      Class7393.method23620(this.world, this, this.field5600);
   }

   public void method4258() {
   }

   public int method4259() {
      return 40;
   }

   public int method4260() {
      return 75;
   }

   public int method4261() {
      return 10;
   }

   public void method4262(Entity var1, float var2, float var3) {
      double var6 = var1.getPosX() - this.getPosX();
      double var8 = var1.getPosZ() - this.getPosZ();
      double var10;
      if (!(var1 instanceof Class880)) {
         var10 = (var1.method3389().field28450 + var1.method3389().field28453) / 2.0 - this.method3442();
      } else {
         Class880 var12 = (Class880)var1;
         var10 = var12.method3442() - this.method3442();
      }

      double var13 = (double) MathHelper.method37766(var6 * var6 + var8 * var8);
      float var15 = (float)(MathHelper.method37814(var8, var6) * 180.0F / (float)Math.PI) - 90.0F;
      float var16 = (float)(-(MathHelper.method37814(var10, var13) * 180.0F / (float)Math.PI));
      this.field5032 = this.method4263(this.field5032, var16, var3);
      this.field5031 = this.method4263(this.field5031, var15, var2);
   }

   private float method4263(float var1, float var2, float var3) {
      float var6 = MathHelper.method37792(var2 - var1);
      if (var6 > var3) {
         var6 = var3;
      }

      if (var6 < -var3) {
         var6 = -var3;
      }

      return var1 + var6;
   }

   public static boolean method4264(EntityType<? extends Class1006> var0, Class1660 var1, Class2202 var2, BlockPos var3, Random var4) {
      BlockPos var7 = var3.method8313();
      return var2 == Class2202.field14393 || var1.getBlockState(var7).method23385(var1, var7, var0);
   }

   public boolean method4265(Class1660 var1, Class2202 var2) {
      return true;
   }

   public boolean method4266(Class1662 var1) {
      return !var1.method7014(this.method3389()) && var1.method7050(this);
   }

   public int method4267() {
      return 4;
   }

   public boolean method4268(int var1) {
      return false;
   }

   @Override
   public int method3370() {
      if (this.method4232() != null) {
         int var3 = (int)(this.method3042() - this.method3075() * 0.33F);
         var3 -= (3 - this.world.method6997().method8905()) * 4;
         if (var3 < 0) {
            var3 = 0;
         }

         return var3 + 3;
      } else {
         return 3;
      }
   }

   @Override
   public Iterable<ItemStack> method2946() {
      return this.field5604;
   }

   @Override
   public Iterable<ItemStack> method2947() {
      return this.field5606;
   }

   @Override
   public ItemStack method2943(Class2106 var1) {
      switch (Class8979.field40589[var1.method8772().ordinal()]) {
         case 1:
            return this.field5604.get(var1.method8773());
         case 2:
            return this.field5606.get(var1.method8773());
         default:
            return ItemStack.EMPTY;
      }
   }

   @Override
   public void method2944(Class2106 var1, ItemStack var2) {
      switch (Class8979.field40589[var1.method8772().ordinal()]) {
         case 1:
            this.field5604.set(var1.method8773(), var2);
            break;
         case 2:
            this.field5606.set(var1.method8773(), var2);
      }
   }

   @Override
   public void method3054(Class8654 var1, int var2, boolean var3) {
      super.method3054(var1, var2, var3);

      for (Class2106 var9 : Class2106.values()) {
         ItemStack var10 = this.method2943(var9);
         float var11 = this.method4269(var9);
         boolean var12 = var11 > 1.0F;
         if (!var10.isEmpty()
            && !Class7858.method26335(var10)
            && (var3 || var12)
            && Math.max(this.field5054.nextFloat() - (float)var2 * 0.01F, 0.0F) < var11) {
            if (!var12 && var10.method32115()) {
               var10.method32118(var10.method32119() - this.field5054.nextInt(1 + this.field5054.nextInt(Math.max(var10.method32119() - 3, 1))));
            }

            this.method3302(var10);
            this.method2944(var9, ItemStack.EMPTY);
         }
      }
   }

   public float method4269(Class2106 var1) {
      float var4;
      switch (Class8979.field40589[var1.method8772().ordinal()]) {
         case 1:
            var4 = this.field5605[var1.method8773()];
            break;
         case 2:
            var4 = this.field5607[var1.method8773()];
            break;
         default:
            var4 = 0.0F;
      }

      return var4;
   }

   public void method4270(Class9755 var1) {
      if (this.field5054.nextFloat() < 0.15F * var1.method38330()) {
         int var4 = this.field5054.nextInt(2);
         float var5 = this.world.method6997() != Class2197.field14354 ? 0.25F : 0.1F;
         if (this.field5054.nextFloat() < 0.095F) {
            var4++;
         }

         if (this.field5054.nextFloat() < 0.095F) {
            var4++;
         }

         if (this.field5054.nextFloat() < 0.095F) {
            var4++;
         }

         boolean var6 = true;

         for (Class2106 var10 : Class2106.values()) {
            if (var10.method8772() == Class1969.field12837) {
               ItemStack var11 = this.method2943(var10);
               if (!var6 && this.field5054.nextFloat() < var5) {
                  break;
               }

               var6 = false;
               if (var11.isEmpty()) {
                  Item var12 = method4272(var10, var4);
                  if (var12 != null) {
                     this.method2944(var10, new ItemStack(var12));
                  }
               }
            }
         }
      }
   }

   public static Class2106 method4271(ItemStack var0) {
      if (Class9299.field42922.method20214()) {
         Class2106 var3 = (Class2106)Class9299.method35070(var0, Class9299.field42922);
         if (var3 != null) {
            return var3;
         }
      }

      Item var4 = var0.getItem();
      if (var4 != Blocks.field36589.method11581() && (!(var4 instanceof Class3292) || !(((Class3292)var4).method11845() instanceof Class3251))) {
         if (var4 instanceof Class3279) {
            return ((Class3279)var4).method11805();
         } else if (var4 != Items.field38120) {
            return !Class9561.method37052(var0, (PlayerEntity)null) ? Class2106.field13731 : Class2106.field13732;
         } else {
            return Class2106.field13735;
         }
      } else {
         return Class2106.field13736;
      }
   }

   @Nullable
   public static Item method4272(Class2106 var0, int var1) {
      switch (Class8979.field40590[var0.ordinal()]) {
         case 1:
            if (var1 == 0) {
               return Items.field37844;
            } else if (var1 == 1) {
               return Items.field37860;
            } else if (var1 == 2) {
               return Items.field37848;
            } else if (var1 == 3) {
               return Items.field37852;
            } else if (var1 == 4) {
               return Items.field37856;
            }
         case 2:
            if (var1 == 0) {
               return Items.field37845;
            } else if (var1 == 1) {
               return Items.field37861;
            } else if (var1 == 2) {
               return Items.field37849;
            } else if (var1 == 3) {
               return Items.field37853;
            } else if (var1 == 4) {
               return Items.field37857;
            }
         case 3:
            if (var1 == 0) {
               return Items.field37846;
            } else if (var1 == 1) {
               return Items.field37862;
            } else if (var1 == 2) {
               return Items.field37850;
            } else if (var1 == 3) {
               return Items.field37854;
            } else if (var1 == 4) {
               return Items.field37858;
            }
         case 4:
            if (var1 == 0) {
               return Items.field37847;
            } else if (var1 == 1) {
               return Items.field37863;
            } else if (var1 == 2) {
               return Items.field37851;
            } else if (var1 == 3) {
               return Items.field37855;
            } else if (var1 == 4) {
               return Items.field37859;
            }
         default:
            return null;
      }
   }

   public void method4273(Class9755 var1) {
      float var4 = var1.method38330();
      this.method4274(var4);

      for (Class2106 var8 : Class2106.values()) {
         if (var8.method8772() == Class1969.field12837) {
            this.method4275(var4, var8);
         }
      }
   }

   public void method4274(float var1) {
      if (!this.method3090().isEmpty() && this.field5054.nextFloat() < 0.25F * var1) {
         this.method2944(
            Class2106.field13731, Class7858.method26342(this.field5054, this.method3090(), (int)(5.0F + var1 * (float)this.field5054.nextInt(18)), false)
         );
      }
   }

   public void method4275(float var1, Class2106 var2) {
      ItemStack var5 = this.method2943(var2);
      if (!var5.isEmpty() && this.field5054.nextFloat() < 0.5F * var1) {
         this.method2944(var2, Class7858.method26342(this.field5054, var5, (int)(5.0F + var1 * (float)this.field5054.nextInt(18)), false));
      }
   }

   @Nullable
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      this.method3085(Class9173.field42106).method38668(new Class9689("Random spawn bonus", this.field5054.nextGaussian() * 0.05, Class2045.field13353));
      if (!(this.field5054.nextFloat() < 0.05F)) {
         this.method4303(false);
      } else {
         this.method4303(true);
      }

      return var4;
   }

   public boolean method4277() {
      return false;
   }

   public void method4278() {
      this.field5609 = true;
   }

   public void method4279(Class2106 var1, float var2) {
      switch (Class8979.field40589[var1.method8772().ordinal()]) {
         case 1:
            this.field5605[var1.method8773()] = var2;
            break;
         case 2:
            this.field5607[var1.method8773()] = var2;
      }
   }

   public boolean method4280() {
      return this.field5608;
   }

   public void method4281(boolean var1) {
      this.field5608 = var1;
   }

   @Override
   public boolean method2980(ItemStack var1) {
      Class2106 var4 = method4271(var1);
      return this.method2943(var4).isEmpty() && this.method4280();
   }

   public boolean method4282() {
      return this.field5609;
   }

   @Override
   public final ActionResultType method3304(PlayerEntity var1, Hand var2) {
      if (this.method3066()) {
         if (this.method4297() != var1) {
            ActionResultType var5 = this.method4283(var1, var2);
            if (!var5.isSuccessOrConsume()) {
               var5 = this.method4285(var1, var2);
               return !var5.isSuccessOrConsume() ? super.method3304(var1, var2) : var5;
            } else {
               return var5;
            }
         } else {
            this.method4294(true, !var1.abilities.isCreativeMode);
            return ActionResultType.method9002(this.world.field9020);
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   private ActionResultType method4283(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.getItem() == Items.LEAD && this.method4295(var1)) {
         this.method4298(var1, true);
         var5.method32182(1);
         return ActionResultType.method9002(this.world.field9020);
      } else {
         if (var5.getItem() == Items.field38088) {
            ActionResultType var6 = var5.method32125(var1, this, var2);
            if (var6.isSuccessOrConsume()) {
               return var6;
            }
         }

         if (!(var5.getItem() instanceof SpawnEggItem)) {
            return ActionResultType.field14820;
         } else if (!(this.world instanceof ServerWorld)) {
            return ActionResultType.field14819;
         } else {
            SpawnEggItem var8 = (SpawnEggItem)var5.getItem();
            Optional<Class1006> var7 = var8.method11856(var1, this, (EntityType<? extends Class1006>)this.getType(), (ServerWorld)this.world, this.getPositionVec(), var5);
            var7.ifPresent(var2x -> this.method4284(var1, var2x));
            return !var7.isPresent() ? ActionResultType.field14820 : ActionResultType.field14818;
         }
      }
   }

   public void method4284(PlayerEntity var1, Class1006 var2) {
   }

   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      return ActionResultType.field14820;
   }

   public boolean method4286() {
      return this.method4287(this.getPosition());
   }

   public boolean method4287(BlockPos var1) {
      return this.field5617 != -1.0F ? this.field5616.method8318(var1) < (double)(this.field5617 * this.field5617) : true;
   }

   public void method4288(BlockPos var1, int var2) {
      this.field5616 = var1;
      this.field5617 = (float)var2;
   }

   public BlockPos method4289() {
      return this.field5616;
   }

   public float method4290() {
      return this.field5617;
   }

   public boolean method4291() {
      return this.field5617 != -1.0F;
   }

   @Nullable
   public <T extends Class1006> T method4292(EntityType<T> var1, boolean var2) {
      if (this.field5041) {
         return null;
      } else {
         Class1006 var5 = (Class1006)var1.method33215(this.world);
         var5.method3364(this);
         var5.method4308(this.method3005());
         var5.method4302(this.method4305());
         if (this.method3381()) {
            var5.method3379(this.method3380());
            var5.method3382(this.method3383());
         }

         if (this.method4282()) {
            var5.method4278();
         }

         var5.method3363(this.method3362());
         if (var2) {
            var5.method4281(this.method4280());

            for (Class2106 var9 : Class2106.values()) {
               ItemStack var10 = this.method2943(var9);
               if (!var10.isEmpty()) {
                  var5.method2944(var9, var10.copy());
                  var5.method4279(var9, this.method4269(var9));
                  var10.method32180(0);
               }
            }
         }

         this.world.method6916(var5);
         if (this.method3328()) {
            Entity var11 = this.getRidingEntity();
            this.method2759();
            var5.method2758(var11, true);
         }

         this.method2904();
         return (T)var5;
      }
   }

   public void method4293() {
      if (this.field5615 != null) {
         this.method4300();
      }

      if (this.field5613 != null && (!this.method3066() || !this.field5613.method3066())) {
         this.method4294(true, true);
      }
   }

   public void method4294(boolean var1, boolean var2) {
      if (this.field5613 != null) {
         this.field5023 = false;
         if (!(this.field5613 instanceof PlayerEntity)) {
            this.field5613.field5023 = false;
         }

         this.field5613 = null;
         this.field5615 = null;
         if (!this.world.field9020 && var2) {
            this.method3300(Items.LEAD);
         }

         if (!this.world.field9020 && var1 && this.world instanceof ServerWorld) {
            ((ServerWorld)this.world).method6883().method7380(this, new Class5593(this, (Entity)null));
         }
      }
   }

   public boolean method4295(PlayerEntity var1) {
      return !this.method4296() && !(this instanceof Class1008);
   }

   public boolean method4296() {
      return this.field5613 != null;
   }

   @Nullable
   public Entity method4297() {
      if (this.field5613 == null && this.field5614 != 0 && this.world.field9020) {
         this.field5613 = this.world.method6774(this.field5614);
      }

      return this.field5613;
   }

   public void method4298(Entity var1, boolean var2) {
      this.field5613 = var1;
      this.field5615 = null;
      this.field5023 = true;
      if (!(this.field5613 instanceof PlayerEntity)) {
         this.field5613.field5023 = true;
      }

      if (!this.world.field9020 && var2 && this.world instanceof ServerWorld) {
         ((ServerWorld)this.world).method6883().method7380(this, new Class5593(this, this.field5613));
      }

      if (this.method3328()) {
         this.method2759();
      }
   }

   public void method4299(int var1) {
      this.field5614 = var1;
      this.method4294(false, false);
   }

   @Override
   public boolean method2758(Entity var1, boolean var2) {
      boolean var5 = super.method2758(var1, var2);
      if (var5 && this.method4296()) {
         this.method4294(true, true);
      }

      return var5;
   }

   private void method4300() {
      if (this.field5615 != null && this.world instanceof ServerWorld) {
         if (!this.field5615.method106("UUID")) {
            if (this.field5615.method119("X", 99) && this.field5615.method119("Y", 99) && this.field5615.method119("Z", 99)) {
               BlockPos var3 = new BlockPos(this.field5615.method122("X"), this.field5615.method122("Y"), this.field5615.method122("Z"));
               this.method4298(LeashKnotEntity.method4087(this.world, var3), true);
               return;
            }
         } else {
            UUID var5 = this.field5615.method105("UUID");
            Entity var4 = ((ServerWorld)this.world).method6942(var5);
            if (var4 != null) {
               this.method4298(var4, true);
               return;
            }
         }

         if (this.field5055 > 100) {
            this.method3300(Items.LEAD);
            this.field5615 = null;
         }
      }
   }

   @Override
   public boolean method2963(int var1, ItemStack var2) {
      Class2106 var5;
      if (var1 != 98) {
         if (var1 != 99) {
            if (var1 != 100 + Class2106.field13736.method8773()) {
               if (var1 != 100 + Class2106.field13735.method8773()) {
                  if (var1 != 100 + Class2106.field13734.method8773()) {
                     if (var1 != 100 + Class2106.field13733.method8773()) {
                        return false;
                     }

                     var5 = Class2106.field13733;
                  } else {
                     var5 = Class2106.field13734;
                  }
               } else {
                  var5 = Class2106.field13735;
               }
            } else {
               var5 = Class2106.field13736;
            }
         } else {
            var5 = Class2106.field13732;
         }
      } else {
         var5 = Class2106.field13731;
      }

      if (!var2.isEmpty() && !method4301(var5, var2) && var5 != Class2106.field13736) {
         return false;
      } else {
         this.method2944(var5, var2);
         return true;
      }
   }

   @Override
   public boolean method3418() {
      return this.method4277() && super.method3418();
   }

   public static boolean method4301(Class2106 var0, ItemStack var1) {
      Class2106 var4 = method4271(var1);
      return var4 == var0 || var4 == Class2106.field13731 && var0 == Class2106.field13732 || var4 == Class2106.field13732 && var0 == Class2106.field13731;
   }

   @Override
   public boolean method3138() {
      return super.method3138() && !this.method4305();
   }

   public void method4302(boolean var1) {
      byte var4 = this.field5063.<Byte>method35445(field5592);
      this.field5063.method35446(field5592, !var1 ? (byte)(var4 & -2) : (byte)(var4 | 1));
   }

   public void method4303(boolean var1) {
      byte var4 = this.field5063.<Byte>method35445(field5592);
      this.field5063.method35446(field5592, !var1 ? (byte)(var4 & -3) : (byte)(var4 | 2));
   }

   public void method4304(boolean var1) {
      byte var4 = this.field5063.<Byte>method35445(field5592);
      this.field5063.method35446(field5592, !var1 ? (byte)(var4 & -5) : (byte)(var4 | 4));
   }

   public boolean method4305() {
      return (this.field5063.<Byte>method35445(field5592) & 1) != 0;
   }

   public boolean method4306() {
      return (this.field5063.<Byte>method35445(field5592) & 2) != 0;
   }

   public boolean method4307() {
      return (this.field5063.<Byte>method35445(field5592) & 4) != 0;
   }

   public void method4308(boolean var1) {
   }

   @Override
   public Class2205 method2967() {
      return !this.method4306() ? Class2205.field14418 : Class2205.field14417;
   }

   @Override
   public boolean method3026(Class880 var1) {
      return var1.getType() == EntityType.PLAYER && ((PlayerEntity)var1).abilities.field29606 ? false : super.method3026(var1);
   }

   @Override
   public boolean method3114(Entity var1) {
      float var4 = (float)this.method3086(Class9173.field42110);
      float var5 = (float)this.method3086(Class9173.field42111);
      if (var1 instanceof Class880) {
         var4 += Class7858.method26318(this.method3090(), ((Class880)var1).method3089());
         var5 += (float)Class7858.method26323(this);
      }

      int var6 = Class7858.method26324(this);
      if (var6 > 0) {
         var1.method3221(var6 * 4);
      }

      boolean var7 = var1.method2741(Class8654.method31115(this), var4);
      if (var7) {
         if (var5 > 0.0F && var1 instanceof Class880) {
            ((Class880)var1)
               .method3058(
                  var5 * 0.5F,
                  (double) MathHelper.sin(this.field5031 * (float) (Math.PI / 180.0)),
                  (double)(-MathHelper.cos(this.field5031 * (float) (Math.PI / 180.0)))
               );
            this.method3434(this.method3433().method11347(0.6, 1.0, 0.6));
         }

         if (var1 instanceof PlayerEntity) {
            PlayerEntity var8 = (PlayerEntity)var1;
            this.method4309(var8, this.method3090(), !var8.isHandActive() ? ItemStack.EMPTY : var8.method3158());
         }

         this.method3399(this, var1);
         this.method3020(var1);
      }

      return var7;
   }

   private void method4309(PlayerEntity var1, ItemStack var2, ItemStack var3) {
      if (!var2.isEmpty() && !var3.isEmpty() && var2.getItem() instanceof Class3265 && var3.getItem() == Items.field38119) {
         float var6 = 0.25F + (float)Class7858.method26327(this) * 0.05F;
         if (this.field5054.nextFloat() < var6) {
            var1.method2976().method19638(Items.field38119, 100);
            this.world.method6786(var1, (byte)30);
         }
      }
   }

   public boolean method4310() {
      if (this.world.method6740() && !this.world.field9020) {
         float var3 = this.method3267();
         BlockPos var4 = !(this.getRidingEntity() instanceof BoatEntity)
            ? new BlockPos(this.getPosX(), (double)Math.round(this.getPosY()), this.getPosZ())
            : new BlockPos(this.getPosX(), (double)Math.round(this.getPosY()), this.getPosZ()).method8311();
         if (var3 > 0.5F && this.field5054.nextFloat() * 30.0F < (var3 - 0.4F) * 2.0F && this.world.method7022(var4)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void method3105(Class7608<Class7631> var1) {
      if (!this.method4230().method21675()) {
         this.method3434(this.method3433().method11339(0.0, 0.3, 0.0));
      } else {
         super.method3105(var1);
      }
   }

   @Override
   public void method3366() {
      super.method3366();
      this.method4294(true, false);
   }

   private boolean method4311() {
      if (!this.method3005()) {
         if (this.field4952 <= 0) {
            if (this.field5055 >= 20) {
               List var3 = this.method4312(this.method3395());
               if (var3 != null) {
                  if (var3.size() == 1) {
                     Entity var4 = (Entity)var3.get(0);
                     double var5 = Math.max(Math.abs(this.getPosX() - var4.getPosX()) - 16.0, 0.0);
                     double var7 = Math.max(Math.abs(this.getPosZ() - var4.getPosZ()) - 16.0, 0.0);
                     double var9 = var5 * var5 + var7 * var7;
                     return !this.method3291(var9);
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private List method4312(World var1) {
      World var4 = this.method3395();
      if (!(var4 instanceof ClientWorld)) {
         if (!(var4 instanceof ServerWorld)) {
            return null;
         } else {
            ServerWorld var6 = (ServerWorld)var4;
            return var6.method6870();
         }
      } else {
         ClientWorld var5 = (ClientWorld)var4;
         return var5.method6870();
      }
   }

   private void method4313() {
      this.field4973++;
      if (this instanceof Class1009) {
         float var3 = this.method3267();
         if (var3 > 0.5F) {
            this.field4973 += 2;
         }
      }

      this.method3447();
   }
}
