package mapped;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;

import javax.annotation.Nullable;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public abstract class Class1082 extends Class1009 implements Class1022 {
   private final Class2758<Class1082> field5946 = new Class2758<Class1082>(this, 1.0, 20, 15.0F);
   private final Class2647 field5947 = new Class2652(this, this, 1.2, false);

   public Class1082(EntityType<? extends Class1082> var1, World var2) {
      super(var1, var2);
      this.method5031();
   }

   @Override
   public void method4219() {
      this.field5600.method20002(2, new Class2617(this));
      this.field5600.method20002(3, new Class2640(this, 1.0));
      this.field5600.method20002(3, new Class2770<Class1012>(this, Class1012.class, 6.0F, 1.0, 1.2));
      this.field5600.method20002(5, new Class2737(this, 1.0));
      this.field5600.method20002(6, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(6, new Class2668(this));
      this.field5601.method20002(1, new Class2704(this));
      this.field5601.method20002(2, new Class2709<PlayerEntity>(this, PlayerEntity.class, true));
      this.field5601.method20002(3, new Class2709<Class1058>(this, Class1058.class, true));
      this.field5601.method20002(3, new Class2709<Class1088>(this, Class1088.class, 10, true, false, Class1088.field5963));
   }

   public static Class7037 method5029() {
      return Class1009.method4343().method21849(Attributes.MOVEMENT_SPEED, 0.25);
   }

   @Override
   public void method3241(BlockPos var1, BlockState var2) {
      this.method2863(this.method5030(), 0.15F, 1.0F);
   }

   public abstract Class9455 method5030();

   @Override
   public Class7809 method3089() {
      return Class7809.field33506;
   }

   @Override
   public void method2871() {
      boolean var3 = this.method4310();
      if (var3) {
         ItemStack var4 = this.method2943(Class2106.field13736);
         if (!var4.isEmpty()) {
            if (var4.method32115()) {
               var4.method32118(var4.method32117() + this.rand.nextInt(2));
               if (var4.method32117() >= var4.method32119()) {
                  this.method3184(Class2106.field13736);
                  this.method2944(Class2106.field13736, ItemStack.EMPTY);
               }
            }

            var3 = false;
         }

         if (var3) {
            this.method3221(8);
         }
      }

      super.method2871();
   }

   @Override
   public void method2868() {
      super.method2868();
      if (this.getRidingEntity() instanceof Class1046) {
         Class1046 var3 = (Class1046)this.getRidingEntity();
         this.field4965 = var3.field4965;
      }
   }

   @Override
   public void method4270(Class9755 var1) {
      super.method4270(var1);
      this.method2944(Class2106.field13731, new ItemStack(Items.BOW));
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      var4 = super.method4276(var1, var2, var3, var4, var5);
      this.method4270(var2);
      this.method4273(var2);
      this.method5031();
      this.method4281(this.rand.nextFloat() < 0.55F * var2.method38330());
      if (this.method2943(Class2106.field13736).isEmpty()) {
         LocalDate var8 = LocalDate.now();
         int var9 = var8.get(ChronoField.DAY_OF_MONTH);
         int var10 = var8.get(ChronoField.MONTH_OF_YEAR);
         if (var10 == 10 && var9 == 31 && this.rand.nextFloat() < 0.25F) {
            this.method2944(Class2106.field13736, new ItemStack(!(this.rand.nextFloat() < 0.1F) ? Blocks.field36589 : Blocks.field36590));
            this.field5607[Class2106.field13736.method8773()] = 0.0F;
         }
      }

      return var4;
   }

   public void method5031() {
      if (this.world != null && !this.world.isRemote) {
         this.field5600.method20003(this.field5947);
         this.field5600.method20003(this.field5946);
         ItemStack var3 = this.getHeldItem(Class9456.method36389(this, Items.BOW));
         if (var3.getItem() != Items.BOW) {
            this.field5600.method20002(4, this.field5947);
         } else {
            byte var4 = 20;
            if (this.world.method6997() != Difficulty.field14354) {
               var4 = 40;
            }

            this.field5946.method10961(var4);
            this.field5600.method20002(4, this.field5946);
         }
      }
   }

   @Override
   public void method4530(Class880 var1, float var2) {
      ItemStack var5 = this.method2983(this.getHeldItem(Class9456.method36389(this, Items.BOW)));
      AbstractArrowEntity var6 = this.method5032(var5, var2);
      double var7 = var1.getPosX() - this.getPosX();
      double var9 = var1.method3440(0.3333333333333333) - var6.getPosY();
      double var11 = var1.getPosZ() - this.getPosZ();
      double var13 = (double) MathHelper.method37766(var7 * var7 + var11 * var11);
      var6.method3462(var7, var9 + var13 * 0.2F, var11, 1.6F, (float)(14 - this.world.method6997().method8905() * 4));
      this.method2863(Sounds.field27070, 1.0F, 1.0F / (this.method3013().nextFloat() * 0.4F + 0.8F));
      this.world.method6916(var6);
   }

   public AbstractArrowEntity method5032(ItemStack var1, float var2) {
      return Class9456.method36390(this, var1, var2);
   }

   @Override
   public boolean method4234(Class3262 var1) {
      return var1 == Items.BOW;
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.method5031();
   }

   @Override
   public void method2944(Class2106 var1, ItemStack var2) {
      super.method2944(var1, var2);
      if (!this.world.isRemote) {
         this.method5031();
      }
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return 1.74F;
   }

   @Override
   public double method2894() {
      return -0.6;
   }
}
