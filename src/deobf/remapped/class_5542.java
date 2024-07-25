package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_5542 extends class_5467 {
   private static final class_7821<Integer> field_28240 = class_8073.<Integer>method_36641(class_5542.class, class_2734.field_13366);
   private static final class_7821<Byte> field_28238 = class_8073.<Byte>method_36641(class_5542.class, class_2734.field_13361);
   private static final class_7821<Optional<UUID>> field_28235 = class_8073.<Optional<UUID>>method_36641(class_5542.class, class_2734.field_13348);
   private static final class_7821<Optional<UUID>> field_28248 = class_8073.<Optional<UUID>>method_36641(class_5542.class, class_2734.field_13348);
   private static final Predicate<class_91> field_28236 = var0 -> !var0.method_258() && var0.method_37330();
   private static final Predicate<Entity> field_28241 = var0 -> {
      if (!(var0 instanceof class_5834)) {
         return false;
      } else {
         class_5834 var3 = (class_5834)var0;
         return var3.method_26455() != null && var3.method_26581() < var3.field_41697 + 600;
      }
   };
   private static final Predicate<Entity> field_28239 = var0 -> var0 instanceof class_3024 || var0 instanceof class_7272;
   private static final Predicate<Entity> field_28249 = var0 -> !var0.method_37073() && class_3572.field_17479.test(var0);
   private class_3599 field_28246;
   private class_3599 field_28251;
   private class_3599 field_28250;
   private float field_28244;
   private float field_28242;
   private float field_28247;
   private float field_28237;
   private int field_28243;

   public class_5542(class_6629<? extends class_5542> var1, World var2) {
      super(var1, var2);
      this.field_29919 = new class_3582(this);
      this.field_29900 = new class_6989(this);
      this.method_26895(class_1108.field_6367, 0.0F);
      this.method_26895(class_1108.field_6351, 0.0F);
      this.method_26871(true);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_28235, Optional.<UUID>empty());
      this.field_41735.method_36634(field_28248, Optional.<UUID>empty());
      this.field_41735.method_36634(field_28240, 0);
      this.field_41735.method_36634(field_28238, (byte)0);
   }

   @Override
   public void method_26851() {
      this.field_28246 = new class_4138<class_5467>(this, class_5467.class, 10, false, false, var0 -> var0 instanceof class_3024 || var0 instanceof class_7272);
      this.field_28251 = new class_4138<class_3845>(this, class_3845.class, 10, false, false, class_3845.field_18768);
      this.field_28250 = new class_4138<class_3578>(this, class_3578.class, 20, false, false, var0 -> var0 instanceof class_8574);
      this.field_29916.method_3485(0, new class_6456(this));
      this.field_29916.method_3485(1, new class_1738(this));
      this.field_29916.method_3485(2, new class_7120(this, 2.2));
      this.field_29916.method_3485(3, new class_1656(this, 1.0));
      this.field_29916
         .method_3485(
            4,
            new class_6837<class_704>(
               this, class_704.class, 16.0F, 1.6, 1.4, var1 -> field_28249.test(var1) && !this.method_25180(var1.method_37328()) && !this.method_25172()
            )
         );
      this.field_29916
         .method_3485(4, new class_6837<class_9408>(this, class_9408.class, 8.0F, 1.6, 1.4, var1 -> !((class_9408)var1).method_41215() && !this.method_25172()));
      this.field_29916.method_3485(4, new class_6837<class_9668>(this, class_9668.class, 8.0F, 1.6, 1.4, var1 -> !this.method_25172()));
      this.field_29916.method_3485(5, new class_7158(this));
      this.field_29916.method_3485(6, new class_8050(this));
      this.field_29916.method_3485(6, new class_7192(this, 1.25));
      this.field_29916.method_3485(7, new class_5662(this, 1.2F, true));
      this.field_29916.method_3485(7, new class_3518(this));
      this.field_29916.method_3485(8, new class_8063(this, this, 1.25));
      this.field_29916.method_3485(9, new class_4925(this, 32, 200));
      this.field_29916.method_3485(10, new class_5906(this, 1.2F, 12, 2));
      this.field_29916.method_3485(10, new class_1937(this, 0.4F));
      this.field_29916.method_3485(11, new class_2889(this, 1.0));
      this.field_29916.method_3485(11, new class_7410(this));
      this.field_29916.method_3485(12, new class_3389(this, this, (float)class_704.class, 24.0F));
      this.field_29916.method_3485(13, new class_2650(this));
      this.field_29908
         .method_3485(
            3, new class_5431(this, (boolean)class_5834.class, false, false, var1 -> field_28241.test(var1) && !this.method_25180(var1.method_37328()))
         );
   }

   @Override
   public class_8461 method_26484(ItemStack var1) {
      return class_463.field_2637;
   }

   @Override
   public void method_26606() {
      if (!this.world.field_33055 && this.method_37330() && this.method_26530()) {
         this.field_28243++;
         ItemStack var3 = this.method_26520(class_6943.field_35707);
         if (this.method_25176(var3)) {
            if (this.field_28243 <= 600) {
               if (this.field_28243 > 560 && this.field_41717.nextFloat() < 0.1F) {
                  this.method_37155(this.method_26484(var3), 1.0F, 1.0F);
                  this.world.method_29587(this, (byte)45);
               }
            } else {
               ItemStack var4 = var3.method_27971(this.world, this);
               if (!var4.method_28022()) {
                  this.method_37349(class_6943.field_35707, var4);
               }

               this.field_28243 = 0;
            }
         }

         class_5834 var5 = this.method_17809();
         if (var5 == null || !var5.method_37330()) {
            this.method_25168(false);
            this.method_25181(false);
         }
      }

      if (this.method_26507() || this.method_26468()) {
         this.field_29654 = false;
         this.field_29676 = 0.0F;
         this.field_29673 = 0.0F;
      }

      super.method_26606();
      if (this.method_25172() && this.field_41717.nextFloat() < 0.05F) {
         this.method_37155(class_463.field_2796, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean method_26468() {
      return this.method_26450();
   }

   private boolean method_25176(ItemStack var1) {
      return var1.method_27960().method_11247() && this.method_17809() == null && this.field_41726 && !this.method_26507();
   }

   @Override
   public void method_26870(class_9589 var1) {
      if (this.field_41717.nextFloat() < 0.2F) {
         float var4 = this.field_41717.nextFloat();
         ItemStack var5;
         if (!(var4 < 0.05F)) {
            if (!(var4 < 0.2F)) {
               if (!(var4 < 0.4F)) {
                  if (!(var4 < 0.6F)) {
                     if (!(var4 < 0.8F)) {
                        var5 = new ItemStack(class_4897.field_24922);
                     } else {
                        var5 = new ItemStack(class_4897.field_24808);
                     }
                  } else {
                     var5 = new ItemStack(class_4897.field_24813);
                  }
               } else {
                  var5 = !this.field_41717.nextBoolean() ? new ItemStack(class_4897.field_25004) : new ItemStack(class_4897.field_24730);
               }
            } else {
               var5 = new ItemStack(class_4897.field_24962);
            }
         } else {
            var5 = new ItemStack(class_4897.field_24997);
         }

         this.method_37349(class_6943.field_35707, var5);
      }
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 45) {
         super.method_37336(var1);
      } else {
         ItemStack var4 = this.method_26520(class_6943.field_35707);
         if (!var4.method_28022()) {
            for (int var5 = 0; var5 < 8; var5++) {
               class_1343 var6 = new class_1343(((double)this.field_41717.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .method_6212(-this.rotationPitch * (float) (Math.PI / 180.0))
                  .method_6192(-this.rotationYaw * (float) (Math.PI / 180.0));
               this.world
                  .method_43361(
                     new class_8661(class_3090.field_15351, var4),
                     this.method_37302() + this.method_37246().field_7336 / 2.0,
                     this.method_37309(),
                     this.method_37156() + this.method_37246().field_7334 / 2.0,
                     var6.field_7336,
                     var6.field_7333 + 0.05,
                     var6.field_7334
                  );
            }
         }
      }
   }

   public static class_1313 method_25204() {
      return class_5886.method_26846()
         .method_5984(class_7331.field_37465, 0.3F)
         .method_5984(class_7331.field_37468, 10.0)
         .method_5984(class_7331.field_37471, 32.0)
         .method_5984(class_7331.field_37462, 2.0);
   }

   public class_5542 method_25213(class_6331 var1, class_1899 var2) {
      class_5542 var5 = class_6629.field_34250.method_30484(var1);
      var5.method_25174(!this.field_41717.nextBoolean() ? ((class_5542)var2).method_25199() : this.method_25199());
      return var5;
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      Optional var8 = var1.method_2754(this.method_37075());
      class_2715 var9 = class_2715.method_12223(var8);
      boolean var10 = false;
      if (!(var4 instanceof class_9497)) {
         var4 = new class_9497(var9);
      } else {
         var9 = ((class_9497)var4).field_48379;
         if (((class_9497)var4).method_8062() >= 2) {
            var10 = true;
         }
      }

      this.method_25174(var9);
      if (var10) {
         this.method_8635(-24000);
      }

      if (var1 instanceof class_6331) {
         this.method_25169();
      }

      this.method_26870(var2);
      return super.method_26864(var1, var2, var3, (class_8733)var4, var5);
   }

   private void method_25169() {
      if (this.method_25199() != class_2715.field_13271) {
         this.field_29908.method_3485(4, this.field_28250);
         this.field_29908.method_3485(6, this.field_28246);
         this.field_29908.method_3485(6, this.field_28251);
      } else {
         this.field_29908.method_3485(4, this.field_28246);
         this.field_29908.method_3485(4, this.field_28251);
         this.field_29908.method_3485(6, this.field_28250);
      }
   }

   @Override
   public void method_24867(class_704 var1, ItemStack var2) {
      if (this.method_24866(var2)) {
         this.method_37155(this.method_26484(var2), 1.0F, 1.0F);
      }

      super.method_24867(var1, var2);
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return !this.method_26449() ? 0.4F : var2.field_31200 * 0.85F;
   }

   public class_2715 method_25199() {
      return class_2715.method_12220(this.field_41735.<Integer>method_36640(field_28240));
   }

   private void method_25174(class_2715 var1) {
      this.field_41735.method_36633(field_28240, var1.method_12219());
   }

   private List<UUID> method_25215() {
      ArrayList var3 = Lists.newArrayList();
      var3.add(this.field_41735.<Optional<UUID>>method_36640(field_28235).orElse((UUID)null));
      var3.add(this.field_41735.<Optional<UUID>>method_36640(field_28248).orElse((UUID)null));
      return var3;
   }

   private void method_25189(UUID var1) {
      if (!this.field_41735.<Optional<UUID>>method_36640(field_28235).isPresent()) {
         this.field_41735.method_36633(field_28235, Optional.<UUID>ofNullable(var1));
      } else {
         this.field_41735.method_36633(field_28248, Optional.<UUID>ofNullable(var1));
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      List var4 = this.method_25215();
      class_3416 var5 = new class_3416();

      for (UUID var7 : var4) {
         if (var7 != null) {
            var5.add(class_4338.method_20181(var7));
         }
      }

      var1.put("Trusted", var5);
      var1.putBoolean("Sleeping", this.method_26507());
      var1.method_25941("Type", this.method_25199().method_12224());
      var1.putBoolean("Sitting", this.method_25205());
      var1.putBoolean("Crouching", this.method_37382());
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      class_3416 var4 = var1.method_25927("Trusted", 11);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         this.method_25189(class_4338.method_20183(var4.get(var5)));
      }

      this.method_25194(var1.getBoolean("Sleeping"));
      this.method_25174(class_2715.method_12222(var1.method_25965("Type")));
      this.method_25196(var1.getBoolean("Sitting"));
      this.method_25168(var1.getBoolean("Crouching"));
      if (this.world instanceof class_6331) {
         this.method_25169();
      }
   }

   public boolean method_25205() {
      return this.method_25197(1);
   }

   public void method_25196(boolean var1) {
      this.method_25177(1, var1);
   }

   public boolean method_25212() {
      return this.method_25197(64);
   }

   private void method_25202(boolean var1) {
      this.method_25177(64, var1);
   }

   private boolean method_25172() {
      return this.method_25197(128);
   }

   private void method_25186(boolean var1) {
      this.method_25177(128, var1);
   }

   @Override
   public boolean method_26507() {
      return this.method_25197(32);
   }

   private void method_25194(boolean var1) {
      this.method_25177(32, var1);
   }

   private void method_25177(int var1, boolean var2) {
      if (!var2) {
         this.field_41735.method_36633(field_28238, (byte)(this.field_41735.<Byte>method_36640(field_28238) & ~var1));
      } else {
         this.field_41735.method_36633(field_28238, (byte)(this.field_41735.<Byte>method_36640(field_28238) | var1));
      }
   }

   private boolean method_25197(int var1) {
      return (this.field_41735.<Byte>method_36640(field_28238) & var1) != 0;
   }

   @Override
   public boolean method_26612(ItemStack var1) {
      class_6943 var4 = class_5886.method_26896(var1);
      return !this.method_26520(var4).method_28022() ? false : var4 == class_6943.field_35707 && super.method_26612(var1);
   }

   @Override
   public boolean method_26899(ItemStack var1) {
      class_2451 var4 = var1.method_27960();
      ItemStack var5 = this.method_26520(class_6943.field_35707);
      return var5.method_28022() || this.field_28243 > 0 && var4.method_11247() && !var5.method_27960().method_11247();
   }

   private void method_25183(ItemStack var1) {
      if (!var1.method_28022() && !this.world.field_33055) {
         class_91 var4 = new class_91(
            this.world,
            this.method_37302() + this.method_37246().field_7336,
            this.method_37309() + 1.0,
            this.method_37156() + this.method_37246().field_7334,
            var1
         );
         var4.method_254(40);
         var4.method_265(this.method_37328());
         this.method_37155(class_463.field_2466, 1.0F, 1.0F);
         this.world.method_7509(var4);
      }
   }

   private void method_25209(ItemStack var1) {
      class_91 var4 = new class_91(this.world, this.method_37302(), this.method_37309(), this.method_37156(), var1);
      this.world.method_7509(var4);
   }

   @Override
   public void method_26902(class_91 var1) {
      ItemStack var4 = var1.method_264();
      if (this.method_26899(var4)) {
         int var5 = var4.method_27997();
         if (var5 > 1) {
            this.method_25209(var4.method_27953(var5 - 1));
         }

         this.method_25183(this.method_26520(class_6943.field_35707));
         this.method_26562(var1);
         this.method_37349(class_6943.field_35707, var4.method_27953(1));
         this.field_29923[class_6943.field_35707.method_31767()] = 2.0F;
         this.method_26467(var1, var4.method_27997());
         var1.method_37204();
         this.field_28243 = 0;
      }
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.method_26530()) {
         boolean var3 = this.method_37285();
         if (var3 || this.method_17809() != null || this.world.method_29570()) {
            this.method_25185();
         }

         if (var3 || this.method_26507()) {
            this.method_25196(false);
         }

         if (this.method_25212() && this.world.field_33033.nextFloat() < 0.2F) {
            BlockPos var4 = this.method_37075();
            class_2522 var5 = this.world.method_28262(var4);
            this.world.method_43364(2001, var4, class_6414.method_29285(var5));
         }
      }

      this.field_28242 = this.field_28244;
      if (!this.method_25182()) {
         this.field_28244 = this.field_28244 + (0.0F - this.field_28244) * 0.4F;
      } else {
         this.field_28244 = this.field_28244 + (1.0F - this.field_28244) * 0.4F;
      }

      this.field_28237 = this.field_28247;
      if (!this.method_37382()) {
         this.field_28247 = 0.0F;
      } else {
         this.field_28247 += 0.2F;
         if (this.field_28247 > 3.0F) {
            this.field_28247 = 3.0F;
         }
      }
   }

   @Override
   public boolean method_24866(ItemStack var1) {
      return var1.method_27960() == class_4897.field_25205;
   }

   @Override
   public void method_26874(class_704 var1, class_5886 var2) {
      ((class_5542)var2).method_25189(var1.method_37328());
   }

   public boolean method_25188() {
      return this.method_25197(16);
   }

   public void method_25171(boolean var1) {
      this.method_25177(16, var1);
   }

   public boolean method_25170() {
      return this.field_28247 == 3.0F;
   }

   public void method_25168(boolean var1) {
      this.method_25177(4, var1);
   }

   @Override
   public boolean method_37382() {
      return this.method_25197(4);
   }

   public void method_25181(boolean var1) {
      this.method_25177(8, var1);
   }

   public boolean method_25182() {
      return this.method_25197(8);
   }

   public float method_25190(float var1) {
      return class_9299.method_42795(var1, this.field_28242, this.field_28244) * 0.11F * (float) Math.PI;
   }

   public float method_25191(float var1) {
      return class_9299.method_42795(var1, this.field_28237, this.field_28247);
   }

   @Override
   public void method_26860(class_5834 var1) {
      if (this.method_25172() && var1 == null) {
         this.method_25186(false);
      }

      super.method_26860(var1);
   }

   @Override
   public int method_26490(float var1, float var2) {
      return class_9299.method_42816((var1 - 5.0F) * var2);
   }

   private void method_25185() {
      this.method_25194(false);
   }

   private void method_25193() {
      this.method_25181(false);
      this.method_25168(false);
      this.method_25196(false);
      this.method_25194(false);
      this.method_25186(false);
      this.method_25202(false);
   }

   private boolean method_25173() {
      return !this.method_26507() && !this.method_25205() && !this.method_25212();
   }

   @Override
   public void method_26853() {
      class_8461 var3 = this.method_26918();
      if (var3 != class_463.field_2643) {
         super.method_26853();
      } else {
         this.method_37155(var3, 2.0F, this.method_26547());
      }
   }

   @Nullable
   @Override
   public class_8461 method_26918() {
      if (!this.method_26507()) {
         if (!this.world.method_29602() && this.field_41717.nextFloat() < 0.1F) {
            List var3 = this.world.<Entity>method_25869(class_704.class, this.method_37241().method_18899(16.0, 16.0, 16.0), class_3572.field_17483);
            if (var3.isEmpty()) {
               return class_463.field_2643;
            }
         }

         return class_463.field_2101;
      } else {
         return class_463.field_2632;
      }
   }

   @Nullable
   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2898;
   }

   @Nullable
   @Override
   public class_8461 method_26599() {
      return class_463.field_1940;
   }

   private boolean method_25180(UUID var1) {
      return this.method_25215().contains(var1);
   }

   @Override
   public void method_26513(DamageSource var1) {
      ItemStack var4 = this.method_26520(class_6943.field_35707);
      if (!var4.method_28022()) {
         this.method_37310(var4);
         this.method_37349(class_6943.field_35707, ItemStack.EMPTY);
      }

      super.method_26513(var1);
   }

   public static boolean method_25207(class_5542 var0, class_5834 var1) {
      double var4 = var1.method_37156() - var0.method_37156();
      double var6 = var1.method_37302() - var0.method_37302();
      double var8 = var4 / var6;
      byte var10 = 6;

      for (int var11 = 0; var11 < 6; var11++) {
         double var12 = var8 != 0.0 ? var4 * (double)((float)var11 / 6.0F) : 0.0;
         double var14 = var8 != 0.0 ? var12 / var8 : var6 * (double)((float)var11 / 6.0F);

         for (int var16 = 1; var16 < 4; var16++) {
            if (!var0.world
               .method_28262(new BlockPos(var0.method_37302() + var14, var0.method_37309() + (double)var16, var0.method_37156() + var12))
               .method_8362()
               .method_24497()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public class_1343 method_37323() {
      return new class_1343(0.0, (double)(0.55F * this.method_37277()), (double)(this.method_37086() * 0.4F));
   }
}
