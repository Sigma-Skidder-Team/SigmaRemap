package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.KeybindTextComponent;
import net.minecraft.util.text.TextFormatting;

public class class_8827 {
   private final class_1893 field_45147;
   private class_2274 field_45149;
   private List<class_8426> field_45150 = Lists.newArrayList();

   public class_8827(class_1893 var1) {
      this.field_45147 = var1;
   }

   public void method_40529(class_8859 var1) {
      if (this.field_45149 != null) {
         this.field_45149.method_10482(var1);
      }
   }

   public void method_40528(double var1, double var3) {
      if (this.field_45149 != null) {
         this.field_45149.method_10484(var1, var3);
      }
   }

   public void method_40534(class_174 var1, class_7474 var2) {
      if (this.field_45149 != null && var2 != null && var1 != null) {
         this.field_45149.method_10479(var1, var2);
      }
   }

   public void method_40533(class_174 var1, class_1331 var2, class_2522 var3, float var4) {
      if (this.field_45149 != null) {
         this.field_45149.method_10480(var1, var2, var3, var4);
      }
   }

   public void method_40535() {
      if (this.field_45149 != null) {
         this.field_45149.method_10485();
      }
   }

   public void method_40531(class_6098 var1) {
      if (this.field_45149 != null) {
         this.field_45149.method_10486(var1);
      }
   }

   public void method_40542() {
      if (this.field_45149 != null) {
         this.field_45149.method_10481();
         this.field_45149 = null;
      }
   }

   public void method_40543() {
      if (this.field_45149 != null) {
         this.method_40542();
      }

      this.field_45149 = this.field_45147.field_9577.field_45410.method_28504(this);
   }

   public void method_40540(class_2297 var1, int var2) {
      this.field_45150.add(new class_8426(var1, var2, null));
      this.field_45147.method_8519().method_42329(var1);
   }

   public void method_40541(class_2297 var1) {
      this.field_45150.removeIf(var1x -> class_8426.method_38781(var1x) == var1);
      var1.method_10566();
   }

   public void method_40536() {
      this.field_45150.removeIf(var0 -> class_8426.method_38779(var0));
      if (this.field_45149 == null) {
         if (this.field_45147.field_9601 != null) {
            this.method_40543();
         }
      } else if (this.field_45147.field_9601 == null) {
         this.method_40542();
      } else {
         this.field_45149.method_10483();
      }
   }

   public void method_40538(class_6240 var1) {
      this.field_45147.field_9577.field_45410 = var1;
      this.field_45147.field_9577.method_40873();
      if (this.field_45149 != null) {
         this.field_45149.method_10481();
         this.field_45149 = var1.method_28504(this);
      }
   }

   public class_1893 method_40530() {
      return this.field_45147;
   }

   public class_4666 method_40539() {
      return this.field_45147.field_9647 != null ? this.field_45147.field_9647.method_42158() : class_4666.field_22762;
   }

   public static ITextComponent method_40532(String var0) {
      return new KeybindTextComponent("key." + var0).mergeStyle(TextFormatting.BOLD);
   }
}
