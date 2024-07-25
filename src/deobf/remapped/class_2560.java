package remapped;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_2560 {
   public String field_12670;
   public String field_12675;
   public ITextComponent field_12671;
   public ITextComponent field_12672;
   public long field_12674;
   public int field_12663 = class_7665.method_34674().getProtocolVersion();
   public ITextComponent field_12666 = new StringTextComponent(class_7665.method_34674().getName());
   public boolean field_12668;
   public List<ITextComponent> field_12664 = Collections.<ITextComponent>emptyList();
   private class_6931 field_12669 = class_6931.field_35609;
   private String field_12665;
   private boolean field_12673;

   public class_2560(String var1, String var2, boolean var3) {
      this.field_12670 = var1;
      this.field_12675 = var2;
      this.field_12673 = var3;
   }

   public CompoundNBT method_11627() {
      CompoundNBT var3 = new CompoundNBT();
      var3.method_25941("name", this.field_12670);
      var3.method_25941("ip", this.field_12675);
      if (this.field_12665 != null) {
         var3.method_25941("icon", this.field_12665);
      }

      if (this.field_12669 != class_6931.field_35608) {
         if (this.field_12669 == class_6931.field_35604) {
            var3.putBoolean("acceptTextures", false);
         }
      } else {
         var3.putBoolean("acceptTextures", true);
      }

      return var3;
   }

   public class_6931 method_11628() {
      return this.field_12669;
   }

   public void method_11624(class_6931 var1) {
      this.field_12669 = var1;
   }

   public static class_2560 method_11625(CompoundNBT var0) {
      class_2560 var3 = new class_2560(var0.method_25965("name"), var0.method_25965("ip"), false);
      if (var0.contains("icon", 8)) {
         var3.method_11623(var0.method_25965("icon"));
      }

      if (!var0.contains("acceptTextures", 1)) {
         var3.method_11624(class_6931.field_35609);
      } else if (!var0.getBoolean("acceptTextures")) {
         var3.method_11624(class_6931.field_35604);
      } else {
         var3.method_11624(class_6931.field_35608);
      }

      return var3;
   }

   @Nullable
   public String method_11622() {
      return this.field_12665;
   }

   public void method_11623(String var1) {
      this.field_12665 = var1;
   }

   public boolean method_11626() {
      return this.field_12673;
   }

   public void method_11629(class_2560 var1) {
      this.field_12675 = var1.field_12675;
      this.field_12670 = var1.field_12670;
      this.method_11624(var1.method_11628());
      this.field_12665 = var1.field_12665;
      this.field_12673 = var1.field_12673;
   }
}
