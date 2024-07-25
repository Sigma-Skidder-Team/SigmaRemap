package remapped;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_298 extends class_7637 {
   private static final Predicate<class_423> field_1082 = var0 -> var0 == class_423.field_1789 || var0 == class_423.field_1782;
   private boolean field_1083;

   public class_298(class_6629<? extends class_298> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method_26851() {
      super.method_26851();
      this.field_29916.method_3485(0, new class_787(this));
      this.field_29916.method_3485(1, new class_5472(this));
      this.field_29916.method_3485(2, new class_4121(this, this));
      this.field_29916.method_3485(3, new class_1052(this, this, 10.0F));
      this.field_29916.method_3485(4, new class_2959(this, this));
      this.field_29908.method_3485(1, new class_8420(this, class_4040.class).method_38757());
      this.field_29908.method_3485(2, new class_4138<class_704>(this, class_704.class, true));
      this.field_29908.method_3485(3, new class_4138<class_405>(this, class_405.class, true));
      this.field_29908.method_3485(3, new class_4138<class_8127>(this, class_8127.class, true));
      this.field_29908.method_3485(4, new class_8642(this));
      this.field_29916.method_3485(8, new class_8285(this, 0.6));
      this.field_29916.method_3485(9, new class_4407(this, class_704.class, 3.0F, 1.0F));
      this.field_29916.method_3485(10, new class_4407(this, class_5886.class, 8.0F));
   }

   @Override
   public void method_26919() {
      if (!this.method_26859() && class_3613.method_16840(this)) {
         boolean var3 = ((class_6331)this.world).method_28983(this.method_37075());
         ((class_8985)this.method_26927()).method_41199(var3);
      }

      super.method_26919();
   }

   public static class_1313 method_1340() {
      return class_1173.method_5201()
         .method_5984(class_7331.field_37465, 0.35F)
         .method_5984(class_7331.field_37471, 12.0)
         .method_5984(class_7331.field_37468, 24.0)
         .method_5984(class_7331.field_37462, 5.0);
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      if (this.field_1083) {
         var1.putBoolean("Johnny", true);
      }
   }

   @Override
   public class_5871 method_34604() {
      if (!this.method_26892()) {
         return !this.method_18596() ? class_5871.field_29811 : class_5871.field_29819;
      } else {
         return class_5871.field_29818;
      }
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      if (var1.contains("Johnny", 99)) {
         this.field_1083 = var1.getBoolean("Johnny");
      }
   }

   @Override
   public class_8461 method_18591() {
      return class_463.field_2243;
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      class_8733 var8 = super.method_26864(var1, var2, var3, var4, var5);
      ((class_8985)this.method_26927()).method_41199(true);
      this.method_26870(var2);
      this.method_26893(var2);
      return var8;
   }

   @Override
   public void method_26870(class_9589 var1) {
      if (this.method_18589() == null) {
         this.method_37349(class_6943.field_35707, new ItemStack(class_4897.field_24420));
      }
   }

   @Override
   public boolean method_37344(Entity var1) {
      if (super.method_37344(var1)) {
         return true;
      } else {
         return var1 instanceof class_5834 && ((class_5834)var1).method_26550() == class_2780.field_13576
            ? this.method_37095() == null && var1.method_37095() == null
            : false;
      }
   }

   @Override
   public void method_37303(ITextComponent var1) {
      super.method_37303(var1);
      if (!this.field_1083 && var1 != null && var1.getString().equals("Johnny")) {
         this.field_1083 = true;
      }
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2609;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2533;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2486;
   }

   @Override
   public void method_18602(int var1, boolean var2) {
      ItemStack var5 = new ItemStack(class_4897.field_24420);
      class_2452 var6 = this.method_18589();
      byte var7 = 1;
      if (var1 > var6.method_11302(class_423.field_1789)) {
         var7 = 2;
      }

      boolean var8 = this.field_41717.nextFloat() <= var6.method_11272();
      if (var8) {
         HashMap var9 = Maps.newHashMap();
         var9.put(class_3668.field_17864, Integer.valueOf(var7));
         class_2931.method_13398(var9, var5);
      }

      this.method_37349(class_6943.field_35707, var5);
   }
}
