package mapped;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;

import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class Class1297 extends Class1293<Class1185> {
   private static String[] field6863;
   private final SocialInteractionsScreen field6864;
   private final Minecraft field6865;
   private final List<Class1185> field6866 = Lists.newArrayList();
   private String field6867;

   public Class1297(SocialInteractionsScreen var1, Minecraft var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6864 = var1;
      this.field6865 = var2;
      this.method6025(false);
      this.method6026(false);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      double var7 = this.field6865.getMainWindow().getGuiScaleFactor();
      RenderSystem.enableScissor(
         (int)((double)this.method6053() * var7),
         (int)((double)(this.field6786 - this.field6788) * var7),
         (int)((double)(this.method6048() + 6) * var7),
         (int)((double)(this.field6786 - (this.field6786 - this.field6788) - this.field6787 - 4) * var7)
      );
      super.render(var1, var2, var3, var4);
      RenderSystem.disableScissor();
   }

   public void method6134(Collection<UUID> var1, double var2) {
      this.field6866.clear();

      for (UUID var7 : var1) {
         Class6589 var8 = this.field6865.player.connection.method15792(var7);
         if (var8 != null) {
            this.field6866.add(new Class1185(this.field6865, this.field6864, var8.method19966().getId(), var8.method19966().getName(), var8::method19973));
         }
      }

      this.method6135();
      this.field6866.sort((var0, var1x) -> var0.method5615().compareToIgnoreCase(var1x.method5615()));
      this.method6028(this.field6866);
      this.method6045(var2);
   }

   private void method6135() {
      if (this.field6867 != null) {
         this.field6866.removeIf(var1 -> !var1.method5615().toLowerCase(Locale.ROOT).contains(this.field6867));
         this.method6028(this.field6866);
      }
   }

   public void method6136(String var1) {
      this.field6867 = var1;
   }

   public boolean method6137() {
      return this.field6866.isEmpty();
   }

   public void method6138(Class6589 var1, Class2332 var2) {
      UUID var5 = var1.method19966().getId();

      for (Class1185 var7 : this.field6866) {
         if (var7.method5616().equals(var5)) {
            var7.method5617(false);
            return;
         }
      }

      if ((var2 == Class2332.field15951 || this.field6865.func_244599_aA().func_244756_c(var5))
         && (Strings.isNullOrEmpty(this.field6867) || var1.method19966().getName().toLowerCase(Locale.ROOT).contains(this.field6867))) {
         Class1185 var8 = new Class1185(this.field6865, this.field6864, var1.method19966().getId(), var1.method19966().getName(), var1::method19973);
         this.method6030(var8);
         this.field6866.add(var8);
      }
   }

   public void method6139(UUID var1) {
      for (Class1185 var5 : this.field6866) {
         if (var5.method5616().equals(var1)) {
            var5.method5617(true);
            return;
         }
      }
   }
}
