package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class Class1042 extends Class1043 implements Class1062, Class1041 {
   private static final DataParameter<Class7921> field5776 = EntityDataManager.<Class7921>method35441(Class1042.class, Class7784.field33406);
   public static final Map<Item, Integer> field5777 = ImmutableMap.of(
      Items.field37843, 4, Items.field38053, 1, Items.field38052, 1, Items.field38111, 1
   );
   private static final Set<Item> field5778 = ImmutableSet.of(
      Items.field37843,
      Items.field38053,
      Items.field38052,
      Items.field37842,
      Items.field37841,
      Items.field38111,
      new Item[]{Items.field38112}
   );
   private int field5779;
   private boolean field5780;
   private PlayerEntity field5781;
   private byte field5782;
   private final Class7721 field5783 = new Class7721();
   private long field5784;
   private long field5785;
   private int field5786;
   private long field5787;
   private int field5788;
   private long field5789;
   private boolean field5790;
   private static final ImmutableList<Class8830<?>> field5791 = ImmutableList.of(
      Class8830.field39813,
      Class8830.field39814,
      Class8830.field39815,
      Class8830.field39816,
      Class8830.field39818,
      Class8830.field39819,
      Class8830.field39820,
      Class8830.field39821,
      Class8830.field39822,
      Class8830.field39823,
      Class8830.field39847,
      Class8830.field39824,
      new Class8830[]{
         Class8830.field39825,
         Class8830.field39828,
         Class8830.field39829,
         Class8830.field39831,
         Class8830.field39833,
         Class8830.field39834,
         Class8830.field39835,
         Class8830.field39836,
         Class8830.field39838,
         Class8830.field39817,
         Class8830.field39839,
         Class8830.field39840,
         Class8830.field39841,
         Class8830.field39843,
         Class8830.field39844,
         Class8830.field39845,
         Class8830.field39842
      }
   );
   private static final ImmutableList<Class7963<? extends Class7882<? super Class1042>>> field5792 = ImmutableList.of(
      Class7963.field34239,
      Class7963.field34240,
      Class7963.field34238,
      Class7963.field34241,
      Class7963.field34242,
      Class7963.field34243,
      Class7963.field34244,
      Class7963.field34245,
      Class7963.field34246
   );
   public static final Map<Class8830<Class9378>, BiPredicate<Class1042, Class4913>> field5793 = ImmutableMap.of(
      Class8830.field39813,
      (BiPredicate<Class1042, Class4913>)(var0, var1) -> var1 == Class4913.field22766,
      Class8830.field39814,
      (BiPredicate<Class1042, Class4913>)(var0, var1) -> var0.method4674().method26571().method29457() == var1,
      Class8830.field39815,
      (BiPredicate<Class1042, Class4913>)(var0, var1) -> Class4913.field22747.test(var1),
      Class8830.field39816,
      (BiPredicate<Class1042, Class4913>)(var0, var1) -> var1 == Class4913.field22767
   );

   public Class1042(EntityType<? extends Class1042> var1, World var2) {
      this(var1, var2, Class9564.field44542);
   }

   public Class1042(EntityType<? extends Class1042> var1, World var2, Class9564 var3) {
      super(var1, var2);
      ((Class6991)this.method4230()).method21682(true);
      this.method4230().method21674(true);
      this.method4281(true);
      this.method4695(this.method4674().method26573(var3).method26574(Class8395.field36011));
   }

   @Override
   public Class6947<Class1042> method2992() {
      return (Class6947<Class1042>)super.method2992();
   }

   @Override
   public Class6971<Class1042> method2993() {
      return Class6947.<Class1042>method21400(field5791, field5792);
   }

   @Override
   public Class6947<?> method2994(Dynamic<?> var1) {
      Class6947 var4 = this.method2993().method21513(var1);
      this.method4678(var4);
      return var4;
   }

   public void method4677(ServerWorld var1) {
      Class6947 var4 = this.method2992();
      var4.method21435(var1, this);
      this.field5011 = var4.method21431();
      this.method4678(this.method2992());
   }

   private void method4678(Class6947<Class1042> var1) {
      Class8395 var4 = this.method4674().method26571();
      if (!this.method3005()) {
         var1.method21414(Class8234.field35352);
         var1.method21428(Class8890.field40221, Class9379.method35582(var4, 0.5F), ImmutableSet.of(Pair.of(Class8830.field39814, Class2217.field14484)));
      } else {
         var1.method21414(Class8234.field35351);
         var1.method21427(Class8890.field40222, Class9379.method35583(0.5F));
      }

      var1.method21427(Class8890.field40219, Class9379.method35581(var4, 0.5F));
      var1.method21428(Class8890.field40224, Class9379.method35585(var4, 0.5F), ImmutableSet.of(Pair.of(Class8830.field39816, Class2217.field14484)));
      var1.method21427(Class8890.field40223, Class9379.method35584(var4, 0.5F));
      var1.method21427(Class8890.field40220, Class9379.method35586(var4, 0.5F));
      var1.method21427(Class8890.field40225, Class9379.method35587(var4, 0.5F));
      var1.method21427(Class8890.field40227, Class9379.method35588(var4, 0.5F));
      var1.method21427(Class8890.field40226, Class9379.method35589(var4, 0.5F));
      var1.method21427(Class8890.field40228, Class9379.method35590(var4, 0.5F));
      var1.method21415(ImmutableSet.of(Class8890.field40219));
      var1.method21424(Class8890.field40220);
      var1.method21419(Class8890.field40220);
      var1.method21422(this.world.method6784(), this.world.method6783());
   }

   @Override
   public void method4679() {
      super.method4679();
      if (this.world instanceof ServerWorld) {
         this.method4677((ServerWorld)this.world);
      }
   }

   public static Class7037 method2997() {
      return Class1006.method4220().method21849(Class9173.field42108, 0.5).method21849(Class9173.field42106, 48.0);
   }

   public boolean method4680() {
      return this.field5790;
   }

   @Override
   public void method4258() {
      this.world.method6820().startSection("villagerBrain");
      this.method2992().method21432((ServerWorld)this.world, this);
      this.world.method6820().endSection();
      if (this.field5790) {
         this.field5790 = false;
      }

      if (!this.method4741() && this.field5779 > 0) {
         this.field5779--;
         if (this.field5779 <= 0) {
            if (this.field5780) {
               this.method4708();
               this.field5780 = false;
            }

            this.method3035(new Class2023(Class8254.field35476, 200, 0));
         }
      }

      if (this.field5781 != null && this.world instanceof ServerWorld) {
         ((ServerWorld)this.world).method6959(Class8214.field35289, this.field5781, this);
         this.world.method6786(this, (byte)14);
         this.field5781 = null;
      }

      if (!this.method4305() && this.rand.nextInt(100) == 0) {
         Class7699 var3 = ((ServerWorld)this.world).method6957(this.getPosition());
         if (var3 != null && var3.method25433() && !var3.method25388()) {
            this.world.method6786(this, (byte)42);
         }
      }

      if (this.method4674().method26571() == Class8395.field36011 && this.method4741()) {
         this.method4684();
      }

      super.method4258();
   }

   @Override
   public void tick() {
      super.tick();
      if (this.method4738() > 0) {
         this.method4739(this.method4738() - 1);
      }

      this.method4715();
   }

   @Override
   public ActionResultType method4285(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.getHeldItem(var2);
      if (var5.getItem() == Items.field38034 || !this.method3066() || this.method4741() || this.isSleeping()) {
         return super.method4285(var1, var2);
      } else if (!this.method3005()) {
         boolean var6 = this.method4742().isEmpty();
         if (var2 == Hand.MAIN_HAND) {
            if (var6 && !this.world.field9020) {
               this.method4681();
            }

            var1.method2911(Class8876.field40139);
         }

         if (!var6) {
            if (!this.world.field9020 && !this.field5796.isEmpty()) {
               this.method4682(var1);
            }

            return ActionResultType.method9002(this.world.field9020);
         } else {
            return ActionResultType.method9002(this.world.field9020);
         }
      } else {
         this.method4681();
         return ActionResultType.method9002(this.world.field9020);
      }
   }

   private void method4681() {
      this.method4739(40);
      if (!this.world.method6714()) {
         this.method2863(Sounds.field27193, this.method3099(), this.method3100());
      }
   }

   private void method4682(PlayerEntity var1) {
      this.method4693(var1);
      this.method4683(var1);
      this.method4872(var1, this.getDisplayName(), this.method4674().method26572());
   }

   @Override
   public void method4683(PlayerEntity var1) {
      boolean var4 = this.method4740() != null && var1 == null;
      super.method4683(var1);
      if (var4) {
         this.method4684();
      }
   }

   @Override
   public void method4684() {
      super.method4684();
      this.method4685();
   }

   private void method4685() {
      for (Class9346 var4 : this.method4742()) {
         var4.method35377();
      }
   }

   @Override
   public boolean method4686() {
      return true;
   }

   public void method4687() {
      this.method4692();

      for (Class9346 var4 : this.method4742()) {
         var4.method35372();
      }

      this.field5787 = this.world.method6783();
      this.field5788++;
   }

   private boolean method4688() {
      for (Class9346 var4 : this.method4742()) {
         if (var4.method35384()) {
            return true;
         }
      }

      return false;
   }

   private boolean method4689() {
      return this.field5788 == 0 || this.field5788 < 2 && this.world.method6783() > this.field5787 + 2400L;
   }

   public boolean method4690() {
      long var3 = this.field5787 + 12000L;
      long var5 = this.world.method6783();
      boolean var7 = var5 > var3;
      long var8 = this.world.method6784();
      if (this.field5789 > 0L) {
         long var10 = this.field5789 / 24000L;
         long var12 = var8 / 24000L;
         var7 |= var12 > var10;
      }

      this.field5789 = var8;
      if (var7) {
         this.field5787 = var5;
         this.method4723();
      }

      return this.method4689() && this.method4688();
   }

   private void method4691() {
      int var3 = 2 - this.field5788;
      if (var3 > 0) {
         for (Class9346 var5 : this.method4742()) {
            var5.method35372();
         }
      }

      for (int var6 = 0; var6 < var3; var6++) {
         this.method4692();
      }
   }

   private void method4692() {
      for (Class9346 var4 : this.method4742()) {
         var4.method35369();
      }
   }

   private void method4693(PlayerEntity var1) {
      int var4 = this.method4703(var1);
      if (var4 != 0) {
         for (Class9346 var6 : this.method4742()) {
            var6.method35376(-MathHelper.method37767((float)var4 * var6.method35380()));
         }
      }

      if (var1.method3033(Class8254.field35498)) {
         Class2023 var12 = var1.method3034(Class8254.field35498);
         int var13 = var12.method8629();

         for (Class9346 var8 : this.method4742()) {
            double var9 = 0.3 + 0.0625 * (double)var13;
            int var11 = (int)Math.floor(var9 * (double)var8.method35365().getCount());
            var8.method35376(-Math.max(var11, 1));
         }
      }
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5776, new Class7921(Class9564.field44542, Class8395.field36011, 1));
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      Class7921.field33913
         .encodeStart(NBTDynamicOps.INSTANCE, this.method4674())
         .resultOrPartial(LOGGER::error)
         .ifPresent(var1x -> var1.put("VillagerData", var1x));
      var1.method100("FoodLevel", this.field5782);
      var1.put("Gossips", (Class30)this.field5783.method25528(NBTDynamicOps.INSTANCE).getValue());
      var1.method102("Xp", this.field5786);
      var1.method103("LastRestock", this.field5787);
      var1.method103("LastGossipDecay", this.field5785);
      var1.method102("RestocksToday", this.field5788);
      if (this.field5790) {
         var1.method115("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      if (var1.method119("VillagerData", 10)) {
         DataResult<Class7921> var4 = Class7921.field33913.parse(new Dynamic<>(NBTDynamicOps.INSTANCE, var1.method116("VillagerData")));
         var4.resultOrPartial(LOGGER::error).ifPresent(this::method4695);
      }

      if (var1.method119("Offers", 10)) {
         this.field5796 = new Class46(var1.getCompound("Offers"));
      }

      if (var1.method119("FoodLevel", 1)) {
         this.field5782 = var1.method120("FoodLevel");
      }

      ListNBT var5 = var1.method131("Gossips", 10);
      this.field5783.method25529(new Dynamic(NBTDynamicOps.INSTANCE, var5));
      if (var1.method119("Xp", 3)) {
         this.field5786 = var1.method122("Xp");
      }

      this.field5787 = var1.method123("LastRestock");
      this.field5785 = var1.method123("LastGossipDecay");
      this.method4281(true);
      if (this.world instanceof ServerWorld) {
         this.method4677((ServerWorld)this.world);
      }

      this.field5788 = var1.method122("RestocksToday");
      if (var1.contains("AssignProfessionWhenSpawned")) {
         this.field5790 = var1.method132("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean method4254(double var1) {
      return false;
   }

   @Nullable
   @Override
   public Class9455 method4241() {
      if (!this.isSleeping()) {
         return !this.method4741() ? Sounds.field27189 : Sounds.field27194;
      } else {
         return null;
      }
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Sounds.field27192;
   }

   @Override
   public Class9455 method2880() {
      return Sounds.field27191;
   }

   public void method4694() {
      Class9455 var3 = this.method4674().method26571().method29460();
      if (var3 != null) {
         this.method2863(var3, this.method3099(), this.method3100());
      }
   }

   public void method4695(Class7921 var1) {
      Class7921 var4 = this.method4674();
      if (var4.method26571() != var1.method26571()) {
         this.field5796 = null;
      }

      this.dataManager.method35446(field5776, var1);
   }

   @Override
   public Class7921 method4674() {
      return this.dataManager.<Class7921>method35445(field5776);
   }

   @Override
   public void method4696(Class9346 var1) {
      int var4 = 3 + this.rand.nextInt(4);
      this.field5786 = this.field5786 + var1.method35381();
      this.field5781 = this.method4740();
      if (this.method4707()) {
         this.field5779 = 40;
         this.field5780 = true;
         var4 += 5;
      }

      if (var1.method35385()) {
         this.world.method6916(new ExperienceOrbEntity(this.world, this.getPosX(), this.getPosY() + 0.5, this.getPosZ(), var4));
      }
   }

   @Override
   public void method3017(Class880 var1) {
      if (var1 != null && this.world instanceof ServerWorld) {
         ((ServerWorld)this.world).method6959(Class8214.field35287, var1, this);
         if (this.method3066() && var1 instanceof PlayerEntity) {
            this.world.method6786(this, (byte)13);
         }
      }

      super.method3017(var1);
   }

   @Override
   public void method2737(Class8654 var1) {
      LOGGER.info("Villager {} died, message: '{}'", this, var1.method31110(this).getString());
      Entity var4 = var1.method31109();
      if (var4 != null) {
         this.method4698(var4);
      }

      this.method4697();
      super.method2737(var1);
   }

   private void method4697() {
      this.method4699(Class8830.field39813);
      this.method4699(Class8830.field39814);
      this.method4699(Class8830.field39815);
      this.method4699(Class8830.field39816);
   }

   private void method4698(Entity var1) {
      if (this.world instanceof ServerWorld) {
         Optional var4 = this.field5011.<List<Class880>>method21410(Class8830.field39819);
         if (var4.isPresent()) {
            ServerWorld var5 = (ServerWorld)this.world;
            ((List)var4.get()).stream().filter(var0 -> var0 instanceof Class1062).forEach(var2 -> var5.method6959(Class8214.field35288, var1, (Class1062)var2));
         }
      }
   }

   public void method4699(Class8830<Class9378> var1) {
      if (this.world instanceof ServerWorld) {
         MinecraftServer var4 = ((ServerWorld)this.world).method6715();
         this.field5011.<Class9378>method21410(var1).ifPresent(var3 -> {
            ServerWorld var6 = var4.method1318(var3.method35578());
            if (var6 != null) {
               Class1653 var7 = var6.method6951();
               Optional var8 = var7.method6676(var3.method35579());
               BiPredicate var9 = field5793.get(var1);
               if (var8.isPresent() && var9.test(this, var8.get())) {
                  var7.method6674(var3.method35579());
                  Class7393.method23615(var6, var3.method35579());
               }
            }
         });
      }
   }

   @Override
   public boolean method4700() {
      return this.field5782 + this.method4711() >= 12 && this.method4767() == 0;
   }

   private boolean method4701() {
      return this.field5782 < 12;
   }

   private void method4702() {
      if (this.method4701() && this.method4711() != 0) {
         for (int var3 = 0; var3 < this.method4752().method3629(); var3++) {
            ItemStack var4 = this.method4752().method3618(var3);
            if (!var4.isEmpty()) {
               Integer var5 = field5777.get(var4.getItem());
               if (var5 != null) {
                  int var6 = var4.getCount();

                  for (int var7 = var6; var7 > 0; var7--) {
                     this.field5782 = (byte)(this.field5782 + var5);
                     this.method4752().method3619(var3, 1);
                     if (!this.method4701()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int method4703(PlayerEntity var1) {
      return this.field5783.method25526(var1.getUniqueID(), var0 -> true);
   }

   private void method4704(int var1) {
      this.field5782 = (byte)(this.field5782 - var1);
   }

   public void method4705() {
      this.method4702();
      this.method4704(12);
   }

   public void method4706(Class46 var1) {
      this.field5796 = var1;
   }

   private boolean method4707() {
      int var3 = this.method4674().method26572();
      return Class7921.method26578(var3) && this.field5786 >= Class7921.method26577(var3);
   }

   private void method4708() {
      this.method4695(this.method4674().method26575(this.method4674().method26572() + 1));
      this.method4713();
   }

   @Override
   public ITextComponent method3358() {
      return new TranslationTextComponent(this.getType().method33210() + '.' + Registry.field16090.getKey(this.method4674().method26571()).method8292());
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 12) {
         if (var1 != 13) {
            if (var1 != 14) {
               if (var1 != 42) {
                  super.method2866(var1);
               } else {
                  this.method4751(Class7940.field34099);
               }
            } else {
               this.method4751(Class7940.field34078);
            }
         } else {
            this.method4751(Class7940.field34049);
         }
      } else {
         this.method4751(Class7940.field34080);
      }
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      if (var3 == Class2202.field14395) {
         this.method4695(this.method4674().method26574(Class8395.field36011));
      }

      if (var3 == Class2202.field14404 || var3 == Class2202.field14403 || var3 == Class2202.field14393 || var3 == Class2202.field14405) {
         this.method4695(this.method4674().method26573(Class9564.method37068(var1.method7178(this.getPosition()))));
      }

      if (var3 == Class2202.field14394) {
         this.field5790 = true;
      }

      return super.method4276(var1, var2, var3, var4, var5);
   }

   public Class1042 method4389(ServerWorld var1, Class1045 var2) {
      double var5 = this.rand.nextDouble();
      Class9564 var7;
      if (!(var5 < 0.5)) {
         if (!(var5 < 0.75)) {
            var7 = ((Class1042)var2).method4674().method26570();
         } else {
            var7 = this.method4674().method26570();
         }
      } else {
         var7 = Class9564.method37068(var1.method7178(this.getPosition()));
      }

      Class1042 var8 = new Class1042(EntityType.field41098, var1, var7);
      var8.method4276(var1, var1.method6807(var8.getPosition()), Class2202.field14395, (Class5093)null, (CompoundNBT)null);
      return var8;
   }

   @Override
   public void method3353(ServerWorld var1, Class906 var2) {
      if (var1.method6997() == Class2197.field14351) {
         super.method3353(var1, var2);
      } else {
         LOGGER.info("Villager {} was struck by lightning {}.", this, var2);
         Class1027 var5 = EntityType.field41101.method33215(var1);
         var5.method3273(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
         var5.method4276(var1, var1.method6807(var5.getPosition()), Class2202.field14399, (Class5093)null, (CompoundNBT)null);
         var5.method4302(this.method4305());
         if (this.method3381()) {
            var5.method3379(this.method3380());
            var5.method3382(this.method3383());
         }

         var5.method4278();
         var1.method6995(var5);
         this.method4697();
         this.method2904();
      }
   }

   @Override
   public void method4246(ItemEntity var1) {
      ItemStack var4 = var1.method4124();
      if (this.method4253(var4)) {
         Class927 var5 = this.method4752();
         boolean var6 = var5.method3677(var4);
         if (!var6) {
            return;
         }

         this.method3134(var1);
         this.method2751(var1, var4.getCount());
         ItemStack var7 = var5.method3676(var4);
         if (!var7.isEmpty()) {
            var4.method32180(var7.getCount());
         } else {
            var1.method2904();
         }
      }
   }

   @Override
   public boolean method4253(ItemStack var1) {
      Item var4 = var1.getItem();
      return (field5778.contains(var4) || this.method4674().method26571().method29458().contains(var4)) && this.method4752().method3677(var1);
   }

   public boolean method4709() {
      return this.method4711() >= 24;
   }

   public boolean method4710() {
      return this.method4711() < 12;
   }

   private int method4711() {
      Class927 var3 = this.method4752();
      return field5777.entrySet().stream().mapToInt(var1 -> var3.method3634(var1.getKey()) * var1.getValue()).sum();
   }

   public boolean method4712() {
      return this.method4752().method3635(ImmutableSet.of(Items.field37841, Items.field38053, Items.field38052, Items.field38112));
   }

   @Override
   public void method4713() {
      Class7921 var3 = this.method4674();
      Int2ObjectMap var4 = Class9721.field45414.get(var3.method26571());
      if (var4 != null && !var4.isEmpty()) {
         Class5391[] var5 = (Class5391[])var4.get(var3.method26572());
         if (var5 != null) {
            Class46 var6 = this.method4742();
            this.method4754(var6, var5, 2);
         }
      }
   }

   public void method4714(ServerWorld var1, Class1042 var2, long var3) {
      if ((var3 < this.field5784 || var3 >= this.field5784 + 1200L) && (var3 < var2.field5784 || var3 >= var2.field5784 + 1200L)) {
         this.field5783.method25525(var2.field5783, this.rand, 10);
         this.field5784 = var3;
         var2.field5784 = var3;
         this.method4716(var1, var3, 5);
      }
   }

   private void method4715() {
      long var3 = this.world.method6783();
      if (this.field5785 != 0L) {
         if (var3 >= this.field5785 + 24000L) {
            this.field5783.method25521();
            this.field5785 = var3;
         }
      } else {
         this.field5785 = var3;
      }
   }

   public void method4716(ServerWorld var1, long var2, int var4) {
      if (this.method4717(var2)) {
         AxisAlignedBB var7 = this.getBoundingBox().method19663(10.0, 10.0, 10.0);
         List<Class1042> var8 = var1.method7182(Class1042.class, var7);
         List<Class1042> var9 = var8.stream().filter(var2x -> var2x.method4717(var2)).limit(5L).collect(Collectors.toList());
         if (var9.size() >= var4) {
            Class1058 var10 = this.method4718(var1);
            if (var10 != null) {
               var8.forEach(Class7885::method26442);
            }
         }
      }
   }

   public boolean method4717(long var1) {
      return this.method4726(this.world.method6783()) ? !this.field5011.method21404(Class8830.field39842) : false;
   }

   @Nullable
   private Class1058 method4718(ServerWorld var1) {
      BlockPos var4 = this.getPosition();

      for (int var5 = 0; var5 < 10; var5++) {
         double var6 = (double)(var1.field9016.nextInt(16) - 8);
         double var8 = (double)(var1.field9016.nextInt(16) - 8);
         BlockPos var10 = this.method4719(var4, var6, var8);
         if (var10 != null) {
            Class1058 var11 = EntityType.field41041
               .method33202(var1, (CompoundNBT)null, (ITextComponent)null, (PlayerEntity)null, var10, Class2202.field14396, false, false);
            if (var11 != null) {
               if (var11.method4265(var1, Class2202.field14396) && var11.method4266(var1)) {
                  var1.method6995(var11);
                  return var11;
               }

               var11.method2904();
            }
         }
      }

      return null;
   }

   @Nullable
   private BlockPos method4719(BlockPos var1, double var2, double var4) {
      byte var8 = 6;
      BlockPos var9 = var1.method8335(var2, 6.0, var4);
      BlockState var10 = this.world.getBlockState(var9);

      for (int var11 = 6; var11 >= -6; var11--) {
         BlockPos var12 = var9;
         BlockState var13 = var10;
         var9 = var9.method8313();
         var10 = this.world.getBlockState(var9);
         if ((var13.isAir() || var13.method23384().method31085()) && var10.method23384().method31090()) {
            return var12;
         }
      }

      return null;
   }

   @Override
   public void method4720(Class8214 var1, Entity var2) {
      if (var1 != Class8214.field35285) {
         if (var1 != Class8214.field35289) {
            if (var1 != Class8214.field35287) {
               if (var1 == Class8214.field35288) {
                  this.field5783.method25527(var2.getUniqueID(), Class2074.field13506, 25);
               }
            } else {
               this.field5783.method25527(var2.getUniqueID(), Class2074.field13507, 25);
            }
         } else {
            this.field5783.method25527(var2.getUniqueID(), Class2074.field13510, 2);
         }
      } else {
         this.field5783.method25527(var2.getUniqueID(), Class2074.field13509, 20);
         this.field5783.method25527(var2.getUniqueID(), Class2074.field13508, 25);
      }
   }

   @Override
   public int method4721() {
      return this.field5786;
   }

   public void method4722(int var1) {
      this.field5786 = var1;
   }

   private void method4723() {
      this.method4691();
      this.field5788 = 0;
   }

   public Class7721 method4724() {
      return this.field5783;
   }

   public void method4725(Class30 var1) {
      this.field5783.method25529(new Dynamic(NBTDynamicOps.INSTANCE, var1));
   }

   @Override
   public void method4257() {
      super.method4257();
      Class7393.method23622(this);
   }

   @Override
   public void method2753(BlockPos var1) {
      super.method2753(var1);
      this.field5011.method21406(Class8830.field39843, this.world.method6783());
      this.field5011.method21405(Class8830.field39824);
      this.field5011.method21405(Class8830.field39841);
   }

   @Override
   public void method2907() {
      super.method2907();
      this.field5011.method21406(Class8830.field39844, this.world.method6783());
   }

   private boolean method4726(long var1) {
      Optional var5 = this.field5011.<Long>method21410(Class8830.field39843);
      return !var5.isPresent() ? false : var1 - (Long)var5.get() < 24000L;
   }
}
