package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class1181 extends Class1180 {
   private final ITextComponent field6380;
   public final Class1127 field6378;

   public Class1181(Class1127 var1, ITextComponent var2) {
      super(var1, null);
      this.field6378 = var1;
      this.field6380 = var2;
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      AbstractGui.method5691(var1, this.field6378.mc.fontRenderer, this.field6380, var4 + var5 / 2, var3 + 5, 16777215);
   }

   @Override
   public List<? extends Class1152> method2468() {
      return ImmutableList.of();
   }
}
