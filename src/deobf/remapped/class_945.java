package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_945 extends class_3757 {
   private Identifier field_4835;
   private String field_4827 = "";
   private String field_4838 = "";
   private BlockPos field_4836 = new BlockPos(0, 1, 0);
   private BlockPos field_4833 = BlockPos.field_7306;
   private class_9022 field_4840 = class_9022.field_46145;
   private class_6631 field_4831 = class_6631.field_34340;
   private class_589 field_4830 = class_589.field_3411;
   private boolean field_4839 = true;
   private boolean field_4832;
   private boolean field_4834;
   private boolean field_4837 = true;
   private float field_4826 = 1.0F;
   private long field_4829;

   public class_945() {
      super(class_133.field_359);
   }

   @Override
   public double method_17404() {
      return 96.0;
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      var1.method_25941("name", this.method_4113());
      var1.method_25941("author", this.field_4827);
      var1.method_25941("metadata", this.field_4838);
      var1.putInt("posX", this.field_4836.getX());
      var1.putInt("posY", this.field_4836.getY());
      var1.putInt("posZ", this.field_4836.getZ());
      var1.putInt("sizeX", this.field_4833.getX());
      var1.putInt("sizeY", this.field_4833.getY());
      var1.putInt("sizeZ", this.field_4833.getZ());
      var1.method_25941("rotation", this.field_4831.toString());
      var1.method_25941("mirror", this.field_4840.toString());
      var1.method_25941("mode", this.field_4830.toString());
      var1.putBoolean("ignoreEntities", this.field_4839);
      var1.putBoolean("powered", this.field_4832);
      var1.putBoolean("showair", this.field_4834);
      var1.putBoolean("showboundingbox", this.field_4837);
      var1.putFloat("integrity", this.field_4826);
      var1.method_25949("seed", this.field_4829);
      return var1;
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      this.method_4098(var2.method_25965("name"));
      this.field_4827 = var2.method_25965("author");
      this.field_4838 = var2.method_25965("metadata");
      int var5 = MathHelper.clamp(var2.method_25947("posX"), -48, 48);
      int var6 = MathHelper.clamp(var2.method_25947("posY"), -48, 48);
      int var7 = MathHelper.clamp(var2.method_25947("posZ"), -48, 48);
      this.field_4836 = new BlockPos(var5, var6, var7);
      int var8 = MathHelper.clamp(var2.method_25947("sizeX"), 0, 48);
      int var9 = MathHelper.clamp(var2.method_25947("sizeY"), 0, 48);
      int var10 = MathHelper.clamp(var2.method_25947("sizeZ"), 0, 48);
      this.field_4833 = new BlockPos(var8, var9, var10);

      try {
         this.field_4831 = class_6631.valueOf(var2.method_25965("rotation"));
      } catch (IllegalArgumentException var14) {
         this.field_4831 = class_6631.field_34340;
      }

      try {
         this.field_4840 = class_9022.valueOf(var2.method_25965("mirror"));
      } catch (IllegalArgumentException var13) {
         this.field_4840 = class_9022.field_46145;
      }

      try {
         this.field_4830 = class_589.valueOf(var2.method_25965("mode"));
      } catch (IllegalArgumentException var12) {
         this.field_4830 = class_589.field_3411;
      }

      this.field_4839 = var2.getBoolean("ignoreEntities");
      this.field_4832 = var2.getBoolean("powered");
      this.field_4834 = var2.getBoolean("showair");
      this.field_4837 = var2.getBoolean("showboundingbox");
      if (var2.method_25938("integrity")) {
         this.field_4826 = var2.getFloat("integrity");
      } else {
         this.field_4826 = 1.0F;
      }

      this.field_4829 = var2.method_25948("seed");
      this.method_4129();
   }

   private void method_4129() {
      if (this.field_18364 != null) {
         BlockPos var3 = this.method_17399();
         class_2522 var4 = this.field_18364.method_28262(var3);
         if (var4.method_8350(class_4783.field_23846)) {
            this.field_18364.method_7513(var3, var4.method_10308(class_7297.field_37308, this.field_4830), 2);
         }
      }
   }

   @Nullable
   @Override
   public class_5029 method_17413() {
      return new class_5029(this.field_18358, 7, this.method_17414());
   }

   @Override
   public CompoundNBT method_17414() {
      return this.method_17396(new CompoundNBT());
   }

   public boolean method_4125(PlayerEntity var1) {
      if (var1.method_3184()) {
         if (var1.method_37084().field_33055) {
            var1.method_3218(this);
         }

         return true;
      } else {
         return false;
      }
   }

   public String method_4113() {
      return this.field_4835 != null ? this.field_4835.toString() : "";
   }

   public String method_4102() {
      return this.field_4835 != null ? this.field_4835.method_21456() : "";
   }

   public boolean method_4121() {
      return this.field_4835 != null;
   }

   public void method_4098(String var1) {
      this.method_4099(!class_6660.method_30576(var1) ? Identifier.method_21455(var1) : null);
   }

   public void method_4099(Identifier var1) {
      this.field_4835 = var1;
   }

   public void method_4112(LivingEntity var1) {
      this.field_4827 = var1.method_45509().getString();
   }

   public BlockPos method_4116() {
      return this.field_4836;
   }

   public void method_4119(BlockPos var1) {
      this.field_4836 = var1;
   }

   public BlockPos method_4096() {
      return this.field_4833;
   }

   public void method_4107(BlockPos var1) {
      this.field_4833 = var1;
   }

   public class_9022 method_4089() {
      return this.field_4840;
   }

   public void method_4087(class_9022 var1) {
      this.field_4840 = var1;
   }

   public class_6631 method_4120() {
      return this.field_4831;
   }

   public void method_4092(class_6631 var1) {
      this.field_4831 = var1;
   }

   public String method_4086() {
      return this.field_4838;
   }

   public void method_4100(String var1) {
      this.field_4838 = var1;
   }

   public class_589 method_4085() {
      return this.field_4830;
   }

   public void method_4108(class_589 var1) {
      this.field_4830 = var1;
      class_2522 var4 = this.field_18364.method_28262(this.method_17399());
      if (var4.method_8350(class_4783.field_23846)) {
         this.field_18364.method_7513(this.method_17399(), var4.method_10308(class_7297.field_37308, var1), 2);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_4118() {
      switch (this.method_4085()) {
         case field_3417:
            this.method_4108(class_589.field_3414);
            break;
         case field_3414:
            this.method_4108(class_589.field_3418);
            break;
         case field_3418:
            this.method_4108(class_589.field_3411);
            break;
         case field_3411:
            this.method_4108(class_589.field_3417);
      }
   }

   public boolean method_4097() {
      return this.field_4839;
   }

   public void method_4110(boolean var1) {
      this.field_4839 = var1;
   }

   public float method_4122() {
      return this.field_4826;
   }

   public void method_4106(float var1) {
      this.field_4826 = var1;
   }

   public long method_4127() {
      return this.field_4829;
   }

   public void method_4128(long var1) {
      this.field_4829 = var1;
   }

   public boolean method_4094() {
      if (this.field_4830 == class_589.field_3417) {
         BlockPos var3 = this.method_17399();
         byte var4 = 80;
         BlockPos var5 = new BlockPos(var3.getX() - 80, 0, var3.getZ() - 80);
         BlockPos var6 = new BlockPos(var3.getX() + 80, 255, var3.getZ() + 80);
         List var7 = this.method_4093(var5, var6);
         List var8 = this.method_4105(var7);
         if (var8.size() >= 1) {
            class_9616 var9 = this.method_4104(var3, var8);
            if (var9.field_48991 - var9.field_48996 > 1 && var9.field_48993 - var9.field_48995 > 1 && var9.field_48994 - var9.field_48992 > 1) {
               this.field_4836 = new BlockPos(
                  var9.field_48996 - var3.getX() + 1, var9.field_48995 - var3.getY() + 1, var9.field_48992 - var3.getZ() + 1
               );
               this.field_4833 = new BlockPos(
                  var9.field_48991 - var9.field_48996 - 1, var9.field_48993 - var9.field_48995 - 1, var9.field_48994 - var9.field_48992 - 1
               );
               this.method_17407();
               class_2522 var10 = this.field_18364.method_28262(var3);
               this.field_18364.method_29572(var3, var10, var10, 3);
               return true;
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

   private List<class_945> method_4105(List<class_945> var1) {
      Predicate var4 = var1x -> var1x.field_4830 == class_589.field_3418 && Objects.equals(this.field_4835, var1x.field_4835);
      return var1.stream().filter(var4).collect(Collectors.<class_945>toList());
   }

   private List<class_945> method_4093(BlockPos var1, BlockPos var2) {
      ArrayList var5 = Lists.newArrayList();

      for (BlockPos var7 : BlockPos.method_6076(var1, var2)) {
         class_2522 var8 = this.field_18364.method_28262(var7);
         if (var8.method_8350(class_4783.field_23846)) {
            class_3757 var9 = this.field_18364.method_28260(var7);
            if (var9 != null && var9 instanceof class_945) {
               var5.add((class_945)var9);
            }
         }
      }

      return var5;
   }

   private class_9616 method_4104(BlockPos var1, List<class_945> var2) {
      class_9616 var5;
      if (var2.size() <= 1) {
         var5 = new class_9616(var1, var1);
      } else {
         BlockPos var6 = ((class_945)var2.get(0)).method_17399();
         var5 = new class_9616(var6, var6);
      }

      for (class_945 var7 : var2) {
         BlockPos var8 = var7.method_17399();
         if (var8.getX() >= var5.field_48996) {
            if (var8.getX() > var5.field_48991) {
               var5.field_48991 = var8.getX();
            }
         } else {
            var5.field_48996 = var8.getX();
         }

         if (var8.getY() >= var5.field_48995) {
            if (var8.getY() > var5.field_48993) {
               var5.field_48993 = var8.getY();
            }
         } else {
            var5.field_48995 = var8.getY();
         }

         if (var8.getZ() >= var5.field_48992) {
            if (var8.getZ() > var5.field_48994) {
               var5.field_48994 = var8.getZ();
            }
         } else {
            var5.field_48992 = var8.getZ();
         }
      }

      return var5;
   }

   public boolean method_4114() {
      return this.method_4115(true);
   }

   public boolean method_4115(boolean var1) {
      if (this.field_4830 == class_589.field_3417 && !this.field_18364.field_33055 && this.field_4835 != null) {
         BlockPos var4 = this.method_17399().method_6105(this.field_4836);
         class_6331 var5 = (class_6331)this.field_18364;
         class_5799 var6 = var5.method_28978();

         class_6561 var7;
         try {
            var7 = var6.method_26279(this.field_4835);
         } catch (class_7485 var10) {
            return false;
         }

         var7.method_29976(this.field_18364, var4, this.field_4833, !this.field_4839, class_4783.field_23227);
         var7.method_29995(this.field_4827);
         if (var1) {
            try {
               return var6.method_26272(this.field_4835);
            } catch (class_7485 var9) {
               return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean method_4103(class_6331 var1) {
      return this.method_4088(var1, true);
   }

   private static Random method_4090(long var0) {
      return var0 != 0L ? new Random(var0) : new Random(Util.getMeasuringTimeMs());
   }

   public boolean method_4088(class_6331 var1, boolean var2) {
      if (this.field_4830 == class_589.field_3414 && this.field_4835 != null) {
         class_5799 var5 = var1.method_28978();

         class_6561 var6;
         try {
            var6 = var5.method_26270(this.field_4835);
         } catch (class_7485 var8) {
            return false;
         }

         return var6 == null ? false : this.method_4109(var1, var2, var6);
      } else {
         return false;
      }
   }

   public boolean method_4109(class_6331 var1, boolean var2, class_6561 var3) {
      BlockPos var6 = this.method_17399();
      if (!class_6660.method_30576(var3.method_29982())) {
         this.field_4827 = var3.method_29982();
      }

      BlockPos var7 = var3.method_29975();
      boolean var8 = this.field_4833.equals(var7);
      if (!var8) {
         this.field_4833 = var7;
         this.method_17407();
         class_2522 var9 = var1.method_28262(var6);
         var1.method_29572(var6, var9, var9, 3);
      }

      if (var2 && !var8) {
         return false;
      } else {
         class_8478 var11 = new class_8478()
            .method_39055(this.field_4840)
            .method_39053(this.field_4831)
            .method_39045(this.field_4839)
            .method_39049((class_2034)null);
         if (this.field_4826 < 1.0F) {
            var11.method_39035().method_39048(new class_9098(MathHelper.clamp(this.field_4826, 0.0F, 1.0F))).method_39041(method_4090(this.field_4829));
         }

         BlockPos var10 = var6.method_6105(this.field_4836);
         var3.method_29984(var1, var10, var11, method_4090(this.field_4829));
         return true;
      }
   }

   public void method_4126() {
      if (this.field_4835 != null) {
         class_6331 var3 = (class_6331)this.field_18364;
         class_5799 var4 = var3.method_28978();
         var4.method_26277(this.field_4835);
      }
   }

   public boolean method_4117() {
      if (this.field_4830 == class_589.field_3414 && !this.field_18364.field_33055 && this.field_4835 != null) {
         class_6331 var3 = (class_6331)this.field_18364;
         class_5799 var4 = var3.method_28978();

         try {
            return var4.method_26270(this.field_4835) != null;
         } catch (class_7485 var6) {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean method_4124() {
      return this.field_4832;
   }

   public void method_4095(boolean var1) {
      this.field_4832 = var1;
   }

   public boolean method_4111() {
      return this.field_4834;
   }

   public void method_4101(boolean var1) {
      this.field_4834 = var1;
   }

   public boolean method_4091() {
      return this.field_4837;
   }

   public void method_4123(boolean var1) {
      this.field_4837 = var1;
   }
}
