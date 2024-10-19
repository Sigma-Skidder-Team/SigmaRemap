package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.List;

public class Class1285 extends Class1274<Class1174> {
   public final Class1324 field6849;

   public Class1285(Class1324 var1) {
      super(var1.mc, var1.width, var1.height, 43, var1.height - 60, 24);
      this.field6849 = var1;

      for (int var4 = 0; var4 < Class1324.method6302(var1).method38129().size(); var4++) {
         this.method6030(new Class1174(this));
      }
   }

   public void method6024(Class1174 var1) {
      super.method6024(var1);
      if (var1 != null) {
         Class9537 var4 = Class1324.method6302(this.field6849)
            .method38129()
            .get(Class1324.method6302(this.field6849).method38129().size() - this.getEventListeners().indexOf(var1) - 1);
         Item var5 = var4.method36906().getBlock().asItem();
         if (var5 != Items.AIR) {
            NarratorChatListener.INSTANCE.say(new TranslationTextComponent("narrator.select", var5.method11731(new ItemStack(var5))).getString());
         }
      }

      Class1324.method6303(this.field6849);
   }

   @Override
   public boolean method6057() {
      return this.field6849.getListener() == this;
   }

   @Override
   public int method6048() {
      return this.field6785 - 70;
   }

   public void method6106() {
      int var3 = this.getEventListeners().indexOf(this.getSelected());
      this.method6027();

      for (int var4 = 0; var4 < Class1324.method6302(this.field6849).method38129().size(); var4++) {
         this.method6030(new Class1174(this));
      }

      List var5 = this.getEventListeners();
      if (var3 >= 0 && var3 < var5.size()) {
         this.method6024((Class1174)var5.get(var3));
      }
   }

   // $VF: synthetic method
   public static Minecraft method6107(Class1285 var0) {
      return var0.field6782;
   }
}
