package remapped;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_378 extends class_5886 implements class_1869 {
   private static final class_7821<Integer> field_1534 = class_8073.<Integer>method_36641(class_378.class, class_2734.field_13366);
   public float field_1537;
   public float field_1538;
   public float field_1533;
   private boolean field_1535;

   public class_378(EntityType<? extends class_378> var1, World var2) {
      super(var1, var2);
      this.field_29900 = new class_8509(this);
   }

   @Override
   public void method_26851() {
      this.field_29916.method_3485(1, new class_9612(this));
      this.field_29916.method_3485(2, new class_3282(this));
      this.field_29916.method_3485(3, new class_4574(this));
      this.field_29916.method_3485(5, new class_9836(this));
      this.field_29908
         .method_3485(1, new class_4138<class_704>(this, class_704.class, 10, true, false, var1 -> Math.abs(var1.method_37309() - this.method_37309()) <= 4.0));
      this.field_29908.method_3485(3, new class_4138<class_8127>(this, class_8127.class, true));
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_1534, 1);
   }

   public void method_1861(int var1, boolean var2) {
      this.field_41735.method_36633(field_1534, var1);
      this.method_37351();
      this.method_37187();
      this.method_26561(class_7331.field_37468).method_45006((double)(var1 * var1));
      this.method_26561(class_7331.field_37465).method_45006((double)(0.2F + 0.1F * (float)var1));
      this.method_26561(class_7331.field_37462).method_45006((double)var1);
      if (var2) {
         this.method_26456(this.method_26465());
      }

      this.field_29915 = var1;
   }

   public int method_1860() {
      return this.field_41735.<Integer>method_36640(field_1534);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("Size", this.method_1860() - 1);
      var1.putBoolean("wasOnGround", this.field_1535);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      int var4 = var1.method_25947("Size");
      if (var4 < 0) {
         var4 = 0;
      }

      this.method_1861(var4 + 1, false);
      super.method_37314(var1);
      this.field_1535 = var1.getBoolean("wasOnGround");
   }

   public boolean method_1859() {
      return this.method_1860() <= 1;
   }

   public class_5079 method_1854() {
      return class_3090.field_15313;
   }

   @Override
   public boolean method_26869() {
      return this.method_1860() > 0;
   }

   @Override
   public void method_37123() {
      this.field_1538 = this.field_1538 + (this.field_1537 - this.field_1538) * 0.5F;
      this.field_1533 = this.field_1538;
      super.method_37123();
      if (this.onGround && !this.field_1535) {
         int var3 = this.method_1860();

         for (int var4 = 0; var4 < var3 * 8; var4++) {
            float var5 = this.field_41717.nextFloat() * (float) (Math.PI * 2);
            float var6 = this.field_41717.nextFloat() * 0.5F + 0.5F;
            float var7 = class_9299.method_42818(var5) * (float)var3 * 0.5F * var6;
            float var8 = class_9299.method_42840(var5) * (float)var3 * 0.5F * var6;
            this.world
               .method_43361(this.method_1854(), this.getPosX() + (double)var7, this.method_37309(), this.getPosZ() + (double)var8, 0.0, 0.0, 0.0);
         }

         this.method_37155(this.method_1850(), this.method_26439(), ((this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         this.field_1537 = -0.5F;
      } else if (!this.onGround && this.field_1535) {
         this.field_1537 = 1.0F;
      }

      this.field_1535 = this.onGround;
      this.method_1855();
   }

   public void method_1855() {
      this.field_1537 *= 0.6F;
   }

   public int method_1862() {
      return this.field_41717.nextInt(20) + 10;
   }

   @Override
   public void method_37187() {
      double var3 = this.getPosX();
      double var5 = this.method_37309();
      double var7 = this.getPosZ();
      super.method_37187();
      this.method_37256(var3, var5, var7);
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (field_1534.equals(var1)) {
         this.method_37187();
         this.rotationYaw = this.field_29618;
         this.field_29605 = this.field_29618;
         if (this.method_37285() && this.field_41717.nextInt(20) == 0) {
            this.method_37101();
         }
      }

      super.method_37191(var1);
   }

   @Override
   public EntityType<? extends class_378> method_37387() {
      return (EntityType<? extends class_378>)super.method_37387();
   }

   @Override
   public void method_37204() {
      int var3 = this.method_1860();
      if (!this.world.field_33055 && var3 > 1 && this.method_26450()) {
         ITextComponent var4 = this.method_45508();
         boolean var5 = this.method_26859();
         float var6 = (float)var3 / 4.0F;
         int var7 = var3 / 2;
         int var8 = 2 + this.field_41717.nextInt(3);

         for (int var9 = 0; var9 < var8; var9++) {
            float var10 = ((float)(var9 % 2) - 0.5F) * var6;
            float var11 = ((float)(var9 / 2) - 0.5F) * var6;
            class_378 var12 = this.method_37387().method_30484(this.world);
            if (this.method_26925()) {
               var12.method_26883();
            }

            var12.method_37303(var4);
            var12.method_26888(var5);
            var12.method_37289(this.method_37367());
            var12.method_1861(var7, true);
            var12.method_37144(
               this.getPosX() + (double)var10, this.method_37309() + 0.5, this.getPosZ() + (double)var11, this.field_41717.nextFloat() * 360.0F, 0.0F
            );
            this.world.method_7509(var12);
         }
      }

      super.method_37204();
   }

   @Override
   public void method_37183(Entity var1) {
      super.method_37183(var1);
      if (var1 instanceof class_8127 && this.method_1857()) {
         this.method_1856((class_5834)var1);
      }
   }

   @Override
   public void method_37347(class_704 var1) {
      if (this.method_1857()) {
         this.method_1856(var1);
      }
   }

   public void method_1856(class_5834 var1) {
      if (this.method_37330()) {
         int var4 = this.method_1860();
         if (this.method_37275(var1) < 0.6 * (double)var4 * 0.6 * (double)var4
            && this.method_26420(var1)
            && var1.attackEntityFrom(DamageSource.method_28345(this), this.method_1858())) {
            this.method_37155(class_463.field_2129, 1.0F, (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F);
            this.method_37096(this, var1);
         }
      }
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 0.625F * var2.field_31200;
   }

   public boolean method_1857() {
      return !this.method_1859() && this.method_26530();
   }

   public float method_1858() {
      return (float)this.method_26575(class_7331.field_37462);
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return !this.method_1859() ? class_463.field_2078 : class_463.field_1949;
   }

   @Override
   public class_8461 method_26599() {
      return !this.method_1859() ? class_463.field_2126 : class_463.field_2086;
   }

   public class_8461 method_1850() {
      return !this.method_1859() ? class_463.field_1981 : class_463.field_1990;
   }

   @Override
   public Identifier method_26934() {
      return this.method_1860() != 1 ? class_5931.field_30157 : this.method_37387().method_30480();
   }

   public static boolean method_1853(EntityType<class_378> var0, class_9379 var1, class_2417 var2, BlockPos var3, Random var4) {
      if (var1.method_43370() != class_423.field_1790) {
         if (Objects.equals(var1.method_2754(var3), Optional.<class_5621<class_6325>>of(class_8606.field_44089))
            && var3.method_12165() > 50
            && var3.method_12165() < 70
            && var4.nextFloat() < 0.5F
            && var4.nextFloat() < var1.method_13576()
            && var1.method_22573(var3) <= var4.nextInt(8)) {
            return method_26908(var0, var1, var2, var3, var4);
         }

         if (!(var1 instanceof class_700)) {
            return false;
         }

         class_2034 var7 = new class_2034(var3);
         boolean var8 = class_8679.method_39862(var7.field_10328, var7.field_10327, ((class_700)var1).method_3133(), 987234911L).nextInt(10) == 0;
         if (var4.nextInt(10) == 0 && var8 && var3.method_12165() < 40) {
            return method_26908(var0, var1, var2, var3, var4);
         }
      }

      return false;
   }

   @Override
   public float method_26439() {
      return 0.4F * (float)this.method_1860();
   }

   @Override
   public int method_26862() {
      return 0;
   }

   public boolean method_1852() {
      return this.method_1860() > 0;
   }

   @Override
   public void method_26595() {
      class_1343 var3 = this.method_37098();
      this.method_37214(var3.field_7336, (double)this.method_26538(), var3.field_7334);
      this.field_41763 = true;
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      int var8 = this.field_41717.nextInt(3);
      if (var8 < 2 && this.field_41717.nextFloat() < 0.5F * var2.method_44284()) {
         var8++;
      }

      int var9 = 1 << var8;
      this.method_1861(var9, true);
      return super.method_26864(var1, var2, var3, var4, var5);
   }

   private float method_1863() {
      float var3 = !this.method_1859() ? 0.8F : 1.4F;
      return ((this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F) * var3;
   }

   public class_8461 method_1849() {
      return !this.method_1859() ? class_463.field_2865 : class_463.field_2626;
   }

   @Override
   public class_6097 method_37190(class_7653 var1) {
      return super.method_37190(var1).method_27942(0.255F * (float)this.method_1860());
   }
}
