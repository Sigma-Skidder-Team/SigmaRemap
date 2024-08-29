package mapped;

import net.minecraft.client.gui.AbstractGui;
import net.minecraft.entity.EntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1169 extends Class1155<Class1169> {
   private final EntityType<?> field6335;
   private final ITextComponent field6336;
   private final ITextComponent field6337;
   private final boolean field6338;
   private final ITextComponent field6339;
   private final boolean field6340;
   public final Class1277 field6341;

   public Class1169(Class1277  var1, EntityType<?> var2) {
      this.field6341 = var1;
      this.field6335 = var2;
      this.field6336 = var2.method33211();
      int var5 = Class1305.method6193(var1.field6817).method28961(Class8876.field40102.method172(var2));
      if (var5 != 0) {
         this.field6337 = new TranslationTextComponent("stat_type.minecraft.killed", var5, this.field6336);
         this.field6338 = true;
      } else {
         this.field6337 = new TranslationTextComponent("stat_type.minecraft.killed.none", this.field6336);
         this.field6338 = false;
      }

      int var6 = Class1305.method6193(var1.field6817).method28961(Class8876.field40103.method172(var2));
      if (var6 != 0) {
         this.field6339 = new TranslationTextComponent("stat_type.minecraft.killed_by", this.field6336, var6);
         this.field6340 = true;
      } else {
         this.field6339 = new TranslationTextComponent("stat_type.minecraft.killed_by.none", this.field6336);
         this.field6340 = false;
      }
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      AbstractGui.method5693(var1, this.field6341.field6817.field4568, this.field6336, var4 + 2, var3 + 1, 16777215);
      AbstractGui.method5693(var1, this.field6341.field6817.field4568, this.field6337, var4 + 2 + 10, var3 + 1 + 9, !this.field6338 ? 6316128 : 9474192);
      AbstractGui.method5693(var1, this.field6341.field6817.field4568, this.field6339, var4 + 2 + 10, var3 + 1 + 18, !this.field6340 ? 6316128 : 9474192);
   }
}
