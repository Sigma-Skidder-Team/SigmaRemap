package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class AbstractMinecartEntity extends Entity {
   private static final class_7821<Integer> field_5894 = class_8073.<Integer>method_36641(AbstractMinecartEntity.class, class_2734.field_13366);
   private static final class_7821<Integer> field_5880 = class_8073.<Integer>method_36641(AbstractMinecartEntity.class, class_2734.field_13366);
   private static final class_7821<Float> field_5886 = class_8073.<Float>method_36641(AbstractMinecartEntity.class, class_2734.field_13350);
   private static final class_7821<Integer> field_5882 = class_8073.<Integer>method_36641(AbstractMinecartEntity.class, class_2734.field_13366);
   private static final class_7821<Integer> field_5885 = class_8073.<Integer>method_36641(AbstractMinecartEntity.class, class_2734.field_13366);
   private static final class_7821<Boolean> field_5881 = class_8073.<Boolean>method_36641(AbstractMinecartEntity.class, class_2734.field_13347);
   private static final ImmutableMap<class_7653, ImmutableList<Integer>> field_5895 = ImmutableMap.of(
      class_7653.field_38885, ImmutableList.of(0, 1, -1), class_7653.field_38881, ImmutableList.of(0, 1, -1), class_7653.field_38888, ImmutableList.of(0, 1)
   );
   private boolean field_5893;
   private static final Map<class_3665, Pair<class_2700, class_2700>> field_5890 = Util.<Map<class_3665, Pair<class_2700, class_2700>>>method_44659(
      Maps.newEnumMap(class_3665.class), var0 -> {
         class_2700 var3 = Direction.field_809.method_1037();
         class_2700 var4 = Direction.field_804.method_1037();
         class_2700 var5 = Direction.field_818.method_1037();
         class_2700 var6 = Direction.field_800.method_1037();
         class_2700 var7 = var3.method_12181();
         class_2700 var8 = var4.method_12181();
         class_2700 var9 = var5.method_12181();
         class_2700 var10 = var6.method_12181();
         var0.put(class_3665.field_17829, Pair.of(var5, var6));
         var0.put(class_3665.field_17831, Pair.of(var3, var4));
         var0.put(class_3665.field_17835, Pair.of(var7, var4));
         var0.put(class_3665.field_17826, Pair.of(var3, var8));
         var0.put(class_3665.field_17833, Pair.of(var5, var10));
         var0.put(class_3665.field_17836, Pair.of(var9, var6));
         var0.put(class_3665.field_17830, Pair.of(var6, var4));
         var0.put(class_3665.field_17825, Pair.of(var6, var3));
         var0.put(class_3665.field_17837, Pair.of(var5, var3));
         var0.put(class_3665.field_17832, Pair.of(var5, var4));
      }
   );
   private int field_5892;
   private double field_5889;
   private double field_5884;
   private double field_5891;
   private double field_5888;
   private double field_5896;
   private double field_5887;
   private double field_5883;
   private double field_5897;

   public AbstractMinecartEntity(EntityType<?> var1, World var2) {
      super(var1, var2);
      this.field_41759 = true;
   }

   public AbstractMinecartEntity(EntityType<?> var1, World var2, double var3, double var5, double var7) {
      this(var1, var2);
      this.method_37256(var3, var5, var7);
      this.method_37215(class_1343.field_7335);
      this.field_41767 = var3;
      this.field_41698 = var5;
      this.field_41725 = var7;
   }

   public static AbstractMinecartEntity method_4759(World var0, double var1, double var3, double var5, class_3481 var7) {
      if (var7 != class_3481.field_17064) {
         if (var7 != class_3481.field_17068) {
            if (var7 != class_3481.field_17067) {
               if (var7 != class_3481.field_17070) {
                  if (var7 != class_3481.field_17063) {
                     return (AbstractMinecartEntity)(var7 != class_3481.field_17069 ? new class_1601(var0, var1, var3, var5) : new class_4648(var0, var1, var3, var5));
                  } else {
                     return new class_9715(var0, var1, var3, var5);
                  }
               } else {
                  return new class_7339(var0, var1, var3, var5);
               }
            } else {
               return new class_2048(var0, var1, var3, var5);
            }
         } else {
            return new class_7851(var0, var1, var3, var5);
         }
      } else {
         return new class_5340(var0, var1, var3, var5);
      }
   }

   @Override
   public boolean method_37126() {
      return false;
   }

   @Override
   public void method_37329() {
      this.field_41735.method_36634(field_5894, 0);
      this.field_41735.method_36634(field_5880, 1);
      this.field_41735.method_36634(field_5886, 0.0F);
      this.field_41735.method_36634(field_5882, class_6414.method_29285(class_4783.field_23184.method_29260()));
      this.field_41735.method_36634(field_5885, 6);
      this.field_41735.method_36634(field_5881, false);
   }

   @Override
   public boolean method_37325(Entity var1) {
      return BoatEntity.method_42092(this, var1);
   }

   @Override
   public boolean method_37177() {
      return true;
   }

   @Override
   public class_1343 method_37375(class_9249 var1, class_8623 var2) {
      return class_5834.method_26437(super.method_37375(var1, var2));
   }

   @Override
   public double method_37149() {
      return 0.0;
   }

   @Override
   public class_1343 method_37282(class_5834 var1) {
      Direction var4 = this.method_37235();
      if (var4.method_1029() == class_9249.field_47216) {
         return super.method_37282(var1);
      } else {
         int[][] var5 = class_160.method_645(var4);
         BlockPos var6 = this.method_37075();
         class_2921 var7 = new class_2921();
         ImmutableList var8 = var1.method_26454();
         UnmodifiableIterator var9 = var8.iterator();

         while (var9.hasNext()) {
            class_7653 var13 = (class_7653)var9.next();
            class_6097 var12 = var1.method_37190(var13);
            float var14 = Math.min(var12.field_31199, 1.0F) / 2.0F;
            UnmodifiableIterator var15 = ((ImmutableList)field_5895.get(var13)).iterator();

            while (var15.hasNext()) {
               int var16 = (Integer)var15.next();

               for (int[] var20 : var5) {
                  var7.method_13362(var6.method_12173() + var20[0], var6.method_12165() + var16, var6.method_12185() + var20[1]);
                  double var21 = this.world
                     .method_28264(class_160.method_646(this.world, var7), () -> class_160.method_646(this.world, var7.method_6100()));
                  if (class_160.method_648(var21)) {
                     Box var23 = new Box((double)(-var14), 0.0, (double)(-var14), (double)var14, (double)var12.field_31200, (double)var14);
                     class_1343 var24 = class_1343.method_6219(var7, var21);
                     if (class_160.method_647(this.world, var1, var23.method_18920(var24))) {
                        var1.method_37356(var13);
                        return var24;
                     }
                  }
               }
            }
         }

         double var10 = this.method_37241().field_19939;
         var7.method_13361((double)var6.method_12173(), var10, (double)var6.method_12185());
         UnmodifiableIterator var29 = var8.iterator();

         while (var29.hasNext()) {
            class_7653 var30 = (class_7653)var29.next();
            double var25 = (double)var1.method_37190(var30).field_31200;
            int var31 = class_9299.method_42815(var10 - (double)var7.method_12165() + var25);
            double var27 = class_160.method_652(var7, var31, var1x -> this.world.method_28262(var1x).method_8324(this.world, var1x));
            if (var10 + var25 <= var27) {
               var1.method_37356(var30);
               break;
            }
         }

         return super.method_37282(var1);
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (this.world.field_33055 || this.field_41751) {
         return true;
      } else if (this.method_37180(var1)) {
         return false;
      } else {
         this.method_4756(-this.method_4751());
         this.method_4749(10);
         this.method_37138();
         this.method_4742(this.method_4736() + var2 * 10.0F);
         boolean var5 = var1.method_28372() instanceof class_704 && ((class_704)var1.method_28372()).playerAbilities.isCreativeMode;
         if (var5 || this.method_4736() > 40.0F) {
            this.method_37305();
            if (var5 && !this.method_45507()) {
               this.method_37204();
            } else {
               this.method_4743(var1);
            }
         }

         return true;
      }
   }

   @Override
   public float method_37364() {
      class_2522 var3 = this.world.method_28262(this.method_37075());
      return !var3.method_8349(class_2351.field_11745) ? super.method_37364() : 1.0F;
   }

   public void method_4743(DamageSource var1) {
      this.method_37204();
      if (this.world.method_29537().method_1285(class_291.field_1024)) {
         ItemStack var4 = new ItemStack(class_4897.field_24547);
         if (this.method_45507()) {
            var4.method_28032(this.method_45508());
         }

         this.method_37310(var4);
      }
   }

   @Override
   public void method_37082() {
      this.method_4756(-this.method_4751());
      this.method_4749(10);
      this.method_4742(this.method_4736() + this.method_4736() * 10.0F);
   }

   @Override
   public boolean method_37167() {
      return !this.field_41751;
   }

   private static Pair<class_2700, class_2700> method_4746(class_3665 var0) {
      return field_5890.get(var0);
   }

   @Override
   public Direction method_37235() {
      return !this.field_5893 ? this.method_37365().method_1042() : this.method_37365().method_1046().method_1042();
   }

   @Override
   public void method_37123() {
      if (this.method_4747() > 0) {
         this.method_4749(this.method_4747() - 1);
      }

      if (this.method_4736() > 0.0F) {
         this.method_4742(this.method_4736() - 1.0F);
      }

      if (this.method_37309() < -64.0) {
         this.method_37150();
      }

      this.method_37237();
      if (!this.world.field_33055) {
         if (!this.method_37078()) {
            this.method_37215(this.method_37098().method_6214(0.0, -0.04, 0.0));
         }

         int var3 = class_9299.method_42847(this.getPosX());
         int var4 = class_9299.method_42847(this.method_37309());
         int var5 = class_9299.method_42847(this.getPosZ());
         if (this.world.method_28262(new BlockPos(var3, var4 - 1, var5)).method_8349(class_2351.field_11745)) {
            var4--;
         }

         BlockPos var6 = new BlockPos(var3, var4, var5);
         class_2522 var7 = this.world.method_28262(var6);
         if (!class_6788.method_31115(var7)) {
            this.method_4744();
         } else {
            this.method_4750(var6, var7);
            if (var7.method_8350(class_4783.field_23285)) {
               this.method_4758(var3, var4, var5, var7.<Boolean>method_10313(class_1298.field_7158));
            }
         }

         this.method_37097();
         this.rotationPitch = 0.0F;
         double var16 = this.field_41767 - this.getPosX();
         double var18 = this.field_41725 - this.getPosZ();
         if (var16 * var16 + var18 * var18 > 0.001) {
            this.rotationYaw = (float)(class_9299.method_42821(var18, var16) * 180.0 / Math.PI);
            if (this.field_5893) {
               this.rotationYaw += 180.0F;
            }
         }

         double var20 = (double)class_9299.method_42810(this.rotationYaw - this.prevRotationYaw);
         if (var20 < -170.0 || var20 >= 170.0) {
            this.rotationYaw += 180.0F;
            this.field_5893 = !this.field_5893;
         }

         this.method_37395(this.rotationYaw, this.rotationPitch);
         if (this.method_4737() == class_3481.field_17066 && method_37266(this.method_37098()) > 0.01) {
            List var25 = this.world.method_25867(this, this.method_37241().method_18899(0.2F, 0.0, 0.2F), class_3572.method_16616(this));
            if (!var25.isEmpty()) {
               for (int var26 = 0; var26 < var25.size(); var26++) {
                  Entity var24 = (Entity)var25.get(var26);
                  if (!(var24 instanceof class_704)
                     && !(var24 instanceof class_8127)
                     && !(var24 instanceof AbstractMinecartEntity)
                     && !this.method_37151()
                     && !var24.isPassenger()) {
                     var24.method_37353(this);
                  } else {
                     var24.method_37183(this);
                  }
               }
            }
         } else {
            for (Entity var23 : this.world.method_25870(this, this.method_37241().method_18899(0.2F, 0.0, 0.2F))) {
               if (!this.method_37072(var23) && var23.method_37177() && var23 instanceof AbstractMinecartEntity) {
                  var23.method_37183(this);
               }
            }
         }

         this.method_37228();
         if (this.method_37370()) {
            this.method_37208();
            this.field_41706 *= 0.5F;
         }

         this.field_41716 = false;
      } else if (this.field_5892 <= 0) {
         this.method_37351();
         this.method_37395(this.rotationYaw, this.rotationPitch);
      } else {
         double var8 = this.getPosX() + (this.field_5889 - this.getPosX()) / (double)this.field_5892;
         double var10 = this.method_37309() + (this.field_5884 - this.method_37309()) / (double)this.field_5892;
         double var12 = this.getPosZ() + (this.field_5891 - this.getPosZ()) / (double)this.field_5892;
         double var14 = class_9299.method_42809(this.field_5888 - (double)this.rotationYaw);
         this.rotationYaw = (float)((double)this.rotationYaw + var14 / (double)this.field_5892);
         this.rotationPitch = (float)((double)this.rotationPitch + (this.field_5896 - (double)this.rotationPitch) / (double)this.field_5892);
         this.field_5892--;
         this.method_37256(var8, var10, var12);
         this.method_37395(this.rotationYaw, this.rotationPitch);
      }
   }

   public double method_4757() {
      return 0.4;
   }

   public void method_4758(int var1, int var2, int var3, boolean var4) {
   }

   public void method_4744() {
      double var3 = this.method_4757();
      class_1343 var5 = this.method_37098();
      this.method_37214(class_9299.method_42827(var5.field_7336, -var3, var3), var5.field_7333, class_9299.method_42827(var5.field_7334, -var3, var3));
      if (this.onGround) {
         this.method_37215(this.method_37098().method_6209(0.5));
      }

      this.method_37226(class_7412.field_37839, this.method_37098());
      if (!this.onGround) {
         this.method_37215(this.method_37098().method_6209(0.95));
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_4750(BlockPos var1, class_2522 var2) {
      this.field_41706 = 0.0F;
      double var5 = this.getPosX();
      double var7 = this.method_37309();
      double var9 = this.getPosZ();
      class_1343 var11 = this.method_4748(var5, var7, var9);
      var7 = (double)var1.method_12165();
      boolean var12 = false;
      boolean var13 = false;
      class_6788 var14 = (class_6788)var2.method_8360();
      if (var14 == class_4783.field_23385) {
         var12 = var2.<Boolean>method_10313(class_1298.field_7158);
         var13 = !var12;
      }

      double var15 = 0.0078125;
      class_1343 var17 = this.method_37098();
      class_3665 var18 = var2.<class_3665>method_10313(var14.method_31121());
      switch (var18) {
         case field_17835:
            this.method_37215(var17.method_6214(-0.0078125, 0.0, 0.0));
            var7++;
            break;
         case field_17826:
            this.method_37215(var17.method_6214(0.0078125, 0.0, 0.0));
            var7++;
            break;
         case field_17833:
            this.method_37215(var17.method_6214(0.0, 0.0, 0.0078125));
            var7++;
            break;
         case field_17836:
            this.method_37215(var17.method_6214(0.0, 0.0, -0.0078125));
            var7++;
      }

      var17 = this.method_37098();
      Pair var19 = method_4746(var18);
      class_2700 var20 = (class_2700)var19.getFirst();
      class_2700 var21 = (class_2700)var19.getSecond();
      double var22 = (double)(var21.method_12173() - var20.method_12173());
      double var24 = (double)(var21.method_12185() - var20.method_12185());
      double var26 = Math.sqrt(var22 * var22 + var24 * var24);
      double var28 = var17.field_7336 * var22 + var17.field_7334 * var24;
      if (var28 < 0.0) {
         var22 = -var22;
         var24 = -var24;
      }

      double var30 = Math.min(2.0, Math.sqrt(method_37266(var17)));
      var17 = new class_1343(var30 * var22 / var26, var17.field_7333, var30 * var24 / var26);
      this.method_37215(var17);
      Entity var32 = this.method_37114().isEmpty() ? null : this.method_37114().get(0);
      if (var32 instanceof class_704) {
         class_1343 var33 = var32.method_37098();
         double var34 = method_37266(var33);
         double var36 = method_37266(this.method_37098());
         if (var34 > 1.0E-4 && var36 < 0.01) {
            this.method_37215(this.method_37098().method_6214(var33.field_7336 * 0.1, 0.0, var33.field_7334 * 0.1));
            var13 = false;
         }
      }

      if (var13) {
         double var38 = Math.sqrt(method_37266(this.method_37098()));
         if (var38 < 0.03) {
            this.method_37215(class_1343.field_7335);
         } else {
            this.method_37215(this.method_37098().method_6210(0.5, 0.0, 0.5));
         }
      }

      double var75 = (double)var1.method_12173() + 0.5 + (double)var20.method_12173() * 0.5;
      double var40 = (double)var1.method_12185() + 0.5 + (double)var20.method_12185() * 0.5;
      double var42 = (double)var1.method_12173() + 0.5 + (double)var21.method_12173() * 0.5;
      double var44 = (double)var1.method_12185() + 0.5 + (double)var21.method_12185() * 0.5;
      var22 = var42 - var75;
      var24 = var44 - var40;
      double var46;
      if (var22 == 0.0) {
         var46 = var9 - (double)var1.method_12185();
      } else if (var24 == 0.0) {
         var46 = var5 - (double)var1.method_12173();
      } else {
         double var48 = var5 - var75;
         double var50 = var9 - var40;
         var46 = (var48 * var22 + var50 * var24) * 2.0;
      }

      var5 = var75 + var22 * var46;
      var9 = var40 + var24 * var46;
      this.method_37256(var5, var7, var9);
      double var76 = this.method_37151() ? 0.75 : 1.0;
      double var77 = this.method_4757();
      var17 = this.method_37098();
      this.method_37226(
         class_7412.field_37839,
         new class_1343(class_9299.method_42827(var76 * var17.field_7336, -var77, var77), 0.0, class_9299.method_42827(var76 * var17.field_7334, -var77, var77))
      );
      if (var20.method_12165() != 0
         && class_9299.method_42847(this.getPosX()) - var1.method_12173() == var20.method_12173()
         && class_9299.method_42847(this.getPosZ()) - var1.method_12185() == var20.method_12185()) {
         this.method_37256(this.getPosX(), this.method_37309() + (double)var20.method_12165(), this.getPosZ());
      } else if (var21.method_12165() != 0
         && class_9299.method_42847(this.getPosX()) - var1.method_12173() == var21.method_12173()
         && class_9299.method_42847(this.getPosZ()) - var1.method_12185() == var21.method_12185()) {
         this.method_37256(this.getPosX(), this.method_37309() + (double)var21.method_12165(), this.getPosZ());
      }

      this.method_4755();
      class_1343 var52 = this.method_4748(this.getPosX(), this.method_37309(), this.getPosZ());
      if (var52 != null && var11 != null) {
         double var53 = (var11.field_7333 - var52.field_7333) * 0.05;
         class_1343 var55 = this.method_37098();
         double var56 = Math.sqrt(method_37266(var55));
         if (var56 > 0.0) {
            this.method_37215(var55.method_6210((var56 + var53) / var56, 1.0, (var56 + var53) / var56));
         }

         this.method_37256(this.getPosX(), var52.field_7333, this.getPosZ());
      }

      int var58 = class_9299.method_42847(this.getPosX());
      int var59 = class_9299.method_42847(this.getPosZ());
      if (var58 != var1.method_12173() || var59 != var1.method_12185()) {
         class_1343 var78 = this.method_37098();
         double var80 = Math.sqrt(method_37266(var78));
         this.method_37214(var80 * (double)(var58 - var1.method_12173()), var78.field_7333, var80 * (double)(var59 - var1.method_12185()));
      }

      if (var12) {
         class_1343 var79 = this.method_37098();
         double var81 = Math.sqrt(method_37266(var79));
         if (var81 > 0.01) {
            double var60 = 0.06;
            this.method_37215(var79.method_6214(var79.field_7336 / var81 * 0.06, 0.0, var79.field_7334 / var81 * 0.06));
         } else {
            class_1343 var62 = this.method_37098();
            double var63 = var62.field_7336;
            double var65 = var62.field_7334;
            if (var18 == class_3665.field_17831) {
               if (this.method_4740(var1.method_6108())) {
                  var63 = 0.02;
               } else if (this.method_4740(var1.method_6090())) {
                  var63 = -0.02;
               }
            } else {
               if (var18 != class_3665.field_17829) {
                  return;
               }

               if (this.method_4740(var1.method_6094())) {
                  var65 = 0.02;
               } else if (this.method_4740(var1.method_6073())) {
                  var65 = -0.02;
               }
            }

            this.method_37214(var63, var62.field_7333, var65);
         }
      }
   }

   private boolean method_4740(BlockPos var1) {
      return this.world.method_28262(var1).method_8356(this.world, var1);
   }

   public void method_4755() {
      double var3 = !this.method_37151() ? 0.96 : 0.997;
      this.method_37215(this.method_37098().method_6210(var3, 0.0, var3));
   }

   @Nullable
   public class_1343 method_4745(double var1, double var3, double var5, double var7) {
      int var11 = class_9299.method_42847(var1);
      int var12 = class_9299.method_42847(var3);
      int var13 = class_9299.method_42847(var5);
      if (this.world.method_28262(new BlockPos(var11, var12 - 1, var13)).method_8349(class_2351.field_11745)) {
         var12--;
      }

      class_2522 var14 = this.world.method_28262(new BlockPos(var11, var12, var13));
      if (!class_6788.method_31115(var14)) {
         return null;
      } else {
         class_3665 var15 = var14.<class_3665>method_10313(((class_6788)var14.method_8360()).method_31121());
         var3 = (double)var12;
         if (var15.method_17011()) {
            var3 = (double)(var12 + 1);
         }

         Pair var16 = method_4746(var15);
         class_2700 var17 = (class_2700)var16.getFirst();
         class_2700 var18 = (class_2700)var16.getSecond();
         double var19 = (double)(var18.method_12173() - var17.method_12173());
         double var21 = (double)(var18.method_12185() - var17.method_12185());
         double var23 = Math.sqrt(var19 * var19 + var21 * var21);
         var19 /= var23;
         var21 /= var23;
         var1 += var19 * var7;
         var5 += var21 * var7;
         if (var17.method_12165() != 0
            && class_9299.method_42847(var1) - var11 == var17.method_12173()
            && class_9299.method_42847(var5) - var13 == var17.method_12185()) {
            var3 += (double)var17.method_12165();
         } else if (var18.method_12165() != 0
            && class_9299.method_42847(var1) - var11 == var18.method_12173()
            && class_9299.method_42847(var5) - var13 == var18.method_12185()) {
            var3 += (double)var18.method_12165();
         }

         return this.method_4748(var1, var3, var5);
      }
   }

   @Nullable
   public class_1343 method_4748(double var1, double var3, double var5) {
      int var9 = class_9299.method_42847(var1);
      int var10 = class_9299.method_42847(var3);
      int var11 = class_9299.method_42847(var5);
      if (this.world.method_28262(new BlockPos(var9, var10 - 1, var11)).method_8349(class_2351.field_11745)) {
         var10--;
      }

      class_2522 var12 = this.world.method_28262(new BlockPos(var9, var10, var11));
      if (!class_6788.method_31115(var12)) {
         return null;
      } else {
         class_3665 var13 = var12.<class_3665>method_10313(((class_6788)var12.method_8360()).method_31121());
         Pair var14 = method_4746(var13);
         class_2700 var15 = (class_2700)var14.getFirst();
         class_2700 var16 = (class_2700)var14.getSecond();
         double var17 = (double)var9 + 0.5 + (double)var15.method_12173() * 0.5;
         double var19 = (double)var10 + 0.0625 + (double)var15.method_12165() * 0.5;
         double var21 = (double)var11 + 0.5 + (double)var15.method_12185() * 0.5;
         double var23 = (double)var9 + 0.5 + (double)var16.method_12173() * 0.5;
         double var25 = (double)var10 + 0.0625 + (double)var16.method_12165() * 0.5;
         double var27 = (double)var11 + 0.5 + (double)var16.method_12185() * 0.5;
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

         return new class_1343(var1, var3, var5);
      }
   }

   @Override
   public Box method_37210() {
      Box var3 = this.method_37241();
      return !this.method_4754() ? var3 : var3.method_18898((double)Math.abs(this.method_4741()) / 16.0);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      if (var1.getBoolean("CustomDisplayTile")) {
         this.method_4753(class_4338.method_20185(var1.getCompound("DisplayState")));
         this.method_4738(var1.method_25947("DisplayOffset"));
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      if (this.method_4754()) {
         var1.putBoolean("CustomDisplayTile", true);
         var1.put("DisplayState", class_4338.method_20187(this.method_4739()));
         var1.method_25931("DisplayOffset", this.method_4741());
      }
   }

   @Override
   public void method_37183(Entity var1) {
      if (!this.world.field_33055 && !var1.field_41731 && !this.field_41731 && !this.method_37072(var1)) {
         double var4 = var1.getPosX() - this.getPosX();
         double var6 = var1.getPosZ() - this.getPosZ();
         double var8 = var4 * var4 + var6 * var6;
         if (var8 >= 1.0E-4F) {
            var8 = (double)class_9299.method_42842(var8);
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
            var4 *= (double)(1.0F - this.field_41721);
            var6 *= (double)(1.0F - this.field_41721);
            var4 *= 0.5;
            var6 *= 0.5;
            if (!(var1 instanceof AbstractMinecartEntity)) {
               this.method_37186(-var4, 0.0, -var6);
               var1.method_37186(var4 / 4.0, 0.0, var6 / 4.0);
            } else {
               double var12 = var1.getPosX() - this.getPosX();
               double var14 = var1.getPosZ() - this.getPosZ();
               class_1343 var16 = new class_1343(var12, 0.0, var14).method_6213();
               class_1343 var17 = new class_1343(
                     (double)class_9299.method_42840(this.rotationYaw * (float) (Math.PI / 180.0)),
                     0.0,
                     (double)class_9299.method_42818(this.rotationYaw * (float) (Math.PI / 180.0))
                  )
                  .method_6213();
               double var18 = Math.abs(var16.method_6206(var17));
               if (var18 < 0.8F) {
                  return;
               }

               class_1343 var20 = this.method_37098();
               class_1343 var21 = var1.method_37098();
               if (((AbstractMinecartEntity)var1).method_4737() == class_3481.field_17068 && this.method_4737() != class_3481.field_17068) {
                  this.method_37215(var20.method_6210(0.2, 1.0, 0.2));
                  this.method_37186(var21.field_7336 - var4, 0.0, var21.field_7334 - var6);
                  var1.method_37215(var21.method_6210(0.95, 1.0, 0.95));
               } else if (((AbstractMinecartEntity)var1).method_4737() != class_3481.field_17068 && this.method_4737() == class_3481.field_17068) {
                  var1.method_37215(var21.method_6210(0.2, 1.0, 0.2));
                  var1.method_37186(var20.field_7336 + var4, 0.0, var20.field_7334 + var6);
                  this.method_37215(var20.method_6210(0.95, 1.0, 0.95));
               } else {
                  double var22 = (var21.field_7336 + var20.field_7336) / 2.0;
                  double var24 = (var21.field_7334 + var20.field_7334) / 2.0;
                  this.method_37215(var20.method_6210(0.2, 1.0, 0.2));
                  this.method_37186(var22 - var4, 0.0, var24 - var6);
                  var1.method_37215(var21.method_6210(0.2, 1.0, 0.2));
                  var1.method_37186(var22 + var4, 0.0, var24 + var6);
               }
            }
         }
      }
   }

   @Override
   public void method_37318(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.field_5889 = var1;
      this.field_5884 = var3;
      this.field_5891 = var5;
      this.field_5888 = (double)var7;
      this.field_5896 = (double)var8;
      this.field_5892 = var9 + 2;
      this.method_37214(this.field_5887, this.field_5883, this.field_5897);
   }

   @Override
   public void method_37162(double var1, double var3, double var5) {
      this.field_5887 = var1;
      this.field_5883 = var3;
      this.field_5897 = var5;
      this.method_37214(this.field_5887, this.field_5883, this.field_5897);
   }

   public void method_4742(float var1) {
      this.field_41735.method_36633(field_5886, var1);
   }

   public float method_4736() {
      return this.field_41735.<Float>method_36640(field_5886);
   }

   public void method_4749(int var1) {
      this.field_41735.method_36633(field_5894, var1);
   }

   public int method_4747() {
      return this.field_41735.<Integer>method_36640(field_5894);
   }

   public void method_4756(int var1) {
      this.field_41735.method_36633(field_5880, var1);
   }

   public int method_4751() {
      return this.field_41735.<Integer>method_36640(field_5880);
   }

   public abstract class_3481 method_4737();

   public class_2522 method_4739() {
      return this.method_4754() ? class_6414.method_29293(this.method_37372().<Integer>method_36640(field_5882)) : this.method_4752();
   }

   public class_2522 method_4752() {
      return class_4783.field_23184.method_29260();
   }

   public int method_4741() {
      return this.method_4754() ? this.method_37372().<Integer>method_36640(field_5885) : this.method_4735();
   }

   public int method_4735() {
      return 6;
   }

   public void method_4753(class_2522 var1) {
      this.method_37372().method_36633(field_5882, class_6414.method_29285(var1));
      this.method_4734(true);
   }

   public void method_4738(int var1) {
      this.method_37372().method_36633(field_5885, var1);
      this.method_4734(true);
   }

   public boolean method_4754() {
      return this.method_37372().<Boolean>method_36640(field_5881);
   }

   public void method_4734(boolean var1) {
      this.method_37372().method_36633(field_5881, var1);
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this);
   }
}
