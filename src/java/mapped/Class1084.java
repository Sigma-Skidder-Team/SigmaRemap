package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;

import javax.annotation.Nullable;

public class Class1084 extends Class1082 {
   private static String[] field5949;

   public Class1084(EntityType<? extends Class1084> var1, World var2) {
      super(var1, var2);
      this.method4224(Class2163.field14190, 8.0F);
   }

   @Override
   public void method4219() {
      this.field5601.method20002(3, new Class2709<Class1035>(this, Class1035.class, true));
      super.method4219();
   }

   @Override
   public Class9455 method4241() {
      return Sounds.field27244;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Sounds.field27246;
   }

   @Override
   public Class9455 method2880() {
      return Sounds.field27245;
   }

   @Override
   public Class9455 method5030() {
      return Sounds.field27247;
   }

   @Override
   public void method3054(Class8654 var1, int var2, boolean var3) {
      super.method3054(var1, var2, var3);
      Entity var6 = var1.method31109();
      if (var6 instanceof Class1081) {
         Class1081 var7 = (Class1081)var6;
         if (var7.method5026()) {
            var7.method5027();
            this.method3300(Items.field38059);
         }
      }
   }

   @Override
   public void method4270(Class9755 var1) {
      this.method2944(Class2106.field13731, new ItemStack(Items.field37810));
   }

   @Override
   public void method4273(Class9755 var1) {
   }

   @Nullable
   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      Class5093 var8 = super.method4276(var1, var2, var3, var4, var5);
      this.method3085(Attributes.field42110).method38661(4.0);
      this.method5031();
      return var8;
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return 2.1F;
   }

   @Override
   public boolean method3114(Entity var1) {
      if (super.method3114(var1)) {
         if (var1 instanceof Class880) {
            ((Class880)var1).method3035(new Class2023(Effects.WITHER, 200));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public AbstractArrowEntity method5032(ItemStack var1, float var2) {
      AbstractArrowEntity var5 = super.method5032(var1, var2);
      var5.method3221(100);
      return var5;
   }

   @Override
   public boolean method3036(Class2023 var1) {
      return var1.method8627() != Effects.WITHER ? super.method3036(var1) : false;
   }
}
