package remapped;

import java.util.Optional;
import java.util.stream.Collectors;

public class class_1325 {
   private static String[] field_7293;
   public int field_7289;
   public float field_7290;
   public float field_7292;
   public int field_7287;
   public int field_7294;
   public ItemStack field_7295;
   public ItemStack field_7288;
   public ItemStack field_7291;

   public class_1325(int var1) {
      this.field_7289 = var1;
   }

   public void method_6054() {
      this.method_6050();
      boolean var3 = this.field_7288 != null && this.field_7288.field_31206 > 0;
      boolean var4 = this.field_7295 != null && this.field_7295.field_31206 > 0;
      boolean var5 = this.method_6053() != null
         && this.method_6053().equals(this.field_7291.method_27960())
         && this.field_7291 != null
         && this.field_7291.field_31206 < 64;
      if (this.field_7292 < this.field_7290 && var4 && var5 && this.field_7294 > 0) {
         this.field_7292 = this.field_7292 + SigmaMainClass.getInstance().method_3310().method_25300();
      }

      if (this.field_7294 > 0) {
         this.field_7294--;
      }

      if (this.field_7294 == 0) {
         if (var3 && var4) {
            this.field_7288.field_31206--;
            this.field_7294 = this.field_7287;
         } else {
            this.field_7292 = 0.0F;
         }
      }

      if (this.field_7292 >= this.field_7290 && this.field_7290 != 0.0F) {
         if (var4) {
            this.field_7295.field_31206--;
         }

         this.field_7292 = 0.0F;
         if (this.field_7291 != null) {
            ItemStack var6 = this.method_6052();
            this.field_7291.field_31206 = this.field_7291.field_31206 + var6.field_31206;
         }
      }

      if (this.field_7295 != null && this.field_7295.field_31206 == 0) {
         this.field_7295 = null;
      }
   }

   public ItemStack method_6052() {
      if (this.field_7295 == null) {
         return null;
      } else {
         if (!NameTagsModule.method_5291()
            .<class_6867, class_3001>method_23138(
               class_1510.field_7995, new class_4657(new ItemStack(class_4897.field_24403)), NameTagsModule.method_5301().field_9601
            )
            .isPresent()) {
            class_9483 var3 = new class_9483(class_3168.field_15843);

            for (class_8169 var6 : NameTagsModule.method_5296()
               .field_9653
               .method_29125()
               .stream()
               .<class_8169>map(class_5522::method_25032)
               .collect(Collectors.toList())) {
               var3.method_43806(var6);
            }

            class_1397 var9 = new class_1397(this);
            NameTagsModule.method_5291()
               .method_10277(var9, var3, class_8677.field_44535, class_8677.field_44535, Util.getMainWorkerExecutor(), NameTagsModule.method_5295());
         }

         Optional var7 = NameTagsModule.method_5291()
            .<class_6867, class_3001>method_23138(class_1510.field_7995, new class_4657(this.field_7295), NameTagsModule.method_5300().field_9601);
         if (var7.isPresent()) {
            ItemStack var8 = ((class_3001)var7.get()).method_41044();
            if (!var8.method_28022()) {
               return var8.method_27973();
            }
         }

         return null;
      }
   }

   public class_2451 method_6053() {
      ItemStack var3 = this.method_6052();
      return var3 == null ? null : var3.method_27960();
   }

   public ItemStack method_6050() {
      if (this.field_7291 != null && this.field_7291.method_27960() instanceof class_221) {
         this.field_7291 = null;
      }

      if (this.field_7295 != null && this.field_7295.method_27960() instanceof class_221) {
         this.field_7295 = null;
      }

      if (this.field_7288 != null && this.field_7288.method_27960() instanceof class_221) {
         this.field_7288 = null;
      }

      if (this.field_7291 == null) {
         if (this.field_7295 != null) {
            ItemStack var3 = this.method_6052();
            if (var3 != null) {
               var3.field_31206 = 0;
            }

            return this.field_7291 = var3;
         } else {
            return null;
         }
      } else {
         return this.field_7291;
      }
   }
}
