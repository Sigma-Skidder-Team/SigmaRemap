package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.widget.Widget;

import java.util.List;

public class Class1179 extends Class1178<Class1179> {
   private static String[] field6375;
   private final List<Widget> field6376;

   private Class1179(List<Widget> var1) {
      this.field6376 = var1;
   }

   public static Class1179 method5607(GameSettings var0, int var1, AbstractOption var2) {
      return new Class1179(ImmutableList.of(var2.createWidget(var0, var1 / 2 - 155, 0, 310)));
   }

   public static Class1179 method5608(GameSettings var0, int var1, AbstractOption var2, AbstractOption var3) {
      Widget var6 = var2.createWidget(var0, var1 / 2 - 155, 0, 150);
      return var3 != null ? new Class1179(ImmutableList.of(var6, var3.createWidget(var0, var1 / 2 - 155 + 160, 0, 150))) : new Class1179(ImmutableList.of(var6));
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.field6376.forEach(var5x -> {
         var5x.field6478 = var3;
         var5x.render(var1, var7, var8, var10);
      });
   }

   @Override
   public List<? extends IGuiEventListener2> getEventListeners() {
      return this.field6376;
   }

   // $VF: synthetic method
   public static List<Widget> method5610(Class1179 var0) {
      return var0.field6376;
   }
}
