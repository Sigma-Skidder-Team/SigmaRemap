package mapped;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.MapData;

import javax.annotation.Nullable;
import java.util.Map;

public class Class194 implements AutoCloseable {
   private static final ResourceLocation field730 = new ResourceLocation("textures/map/map_icons.png");
   private static final RenderType field731 = RenderType.method14339(field730);
   private final TextureManager field732;
   private final Map<String, Class1695> field733 = Maps.newHashMap();

   public Class194(TextureManager var1) {
      this.field732 = var1;
   }

   public void method592(MapData var1) {
      Class1695.method7292(this.method594(var1));
   }

   public void method593(MatrixStack var1, Class7733 var2, MapData var3, boolean var4, int var5) {
      Class1695.method7293(this.method594(var3), var1, var2, var4, var5);
   }

   private Class1695 method594(MapData var1) {
      Class1695 var4 = this.field733.get(var1.getName());
      if (var4 == null) {
         var4 = new Class1695(this, var1);
         this.field733.put(var1.getName(), var4);
      }

      return var4;
   }

   @Nullable
   public Class1695 method595(String var1) {
      return this.field733.get(var1);
   }

   public void method596() {
      for (Class1695 var4 : this.field733.values()) {
         var4.close();
      }

      this.field733.clear();
   }

   @Nullable
   public MapData method597(Class1695 var1) {
      return var1 == null ? null : Class1695.method7294(var1);
   }

   @Override
   public void close() {
      this.method596();
   }

   // $VF: synthetic method
   public static TextureManager method598(Class194 var0) {
      return var0.field732;
   }

   // $VF: synthetic method
   public static RenderType method599() {
      return field731;
   }
}
