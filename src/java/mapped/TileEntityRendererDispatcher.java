package mapped;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.Map;
import javax.annotation.Nullable;

public class TileEntityRendererDispatcher {
   public final Map<TileEntityType<?>, Class5942<?>> field34742 = Maps.newHashMap();
   public static final TileEntityRendererDispatcher instance = new TileEntityRendererDispatcher();
   private final BufferBuilder field34744 = new BufferBuilder(256);
   private FontRenderer field34745;
   public TextureManager field34746;
   public World field34747;
   public ActiveRenderInfo field34748;
   public RayTraceResult field34749;
   public TileEntity field34750;

   private TileEntityRendererDispatcher() {
      this.method27959(TileEntityType.field21428, new Class5947(this));
      this.method27959(TileEntityType.field21429, new Class5943(this));
      this.method27959(TileEntityType.field21430, new Class5945(this));
      this.method27959(TileEntityType.field21422, new Class5953<Class941>(this));
      this.method27959(TileEntityType.field21424, new Class5953<Class943>(this));
      this.method27959(TileEntityType.field21423, new Class5953<Class970>(this));
      this.method27959(TileEntityType.field21432, new Class5951(this));
      this.method27959(TileEntityType.field21449, new Class5949(this));
      this.method27959(TileEntityType.field21433, new Class5957<Class956>(this));
      this.method27959(TileEntityType.field21441, new Class5958(this));
      this.method27959(TileEntityType.field21434, new Class5946(this));
      this.method27959(TileEntityType.field21435, new Class5952(this));
      this.method27959(TileEntityType.field21439, new Class5948(this));
      this.method27959(TileEntityType.field21440, new Class5941(this));
      this.method27959(TileEntityType.field21443, new Class5954(new Class2887(), this));
      this.method27959(TileEntityType.field21444, new Class5950(this));
      this.method27959(TileEntityType.field21445, new Class5956(this));
      this.method27959(TileEntityType.field21450, new Class5944(this));
      this.method27959(TileEntityType.field21452, new Class5955(this));
   }

   private <E extends TileEntity> void method27959(TileEntityType<E> var1, Class5942<E> var2) {
      this.field34742.put(var1, var2);
   }

   @Nullable
   public <E extends TileEntity> Class5942<E> method27960(E var1) {
      return (Class5942<E>)this.field34742.get(var1.method3786());
   }

   public void method27961(World var1, TextureManager var2, FontRenderer var3, ActiveRenderInfo var4, RayTraceResult var5) {
      if (this.field34747 != var1) {
         this.setWorld(var1);
      }

      this.field34746 = var2;
      this.field34748 = var4;
      this.field34745 = var3;
      this.field34749 = var5;
   }

   public <E extends TileEntity> void method27962(E var1, float var2, MatrixStack var3, Class7733 var4) {
      if (Vector3d.method11328(var1.getPos()).method11340(this.field34748.getPos(), var1.method3773())) {
         Class5942 var7 = this.<TileEntity>method27960(var1);
         if (var7 != null && var1.method3770() && var1.method3786().method13796(var1.method3775().getBlock())) {
            method27965(var1, () -> method27963(var7, var1, var2, var3, var4));
         }
      }
   }

   private static <T extends TileEntity> void method27963(Class5942<T> var0, T var1, float var2, MatrixStack var3, Class7733 var4) {
      World var7 = var1.method3734();
      int var8;
      if (var7 == null) {
         var8 = 15728880;
      } else {
         var8 = WorldRenderer.method944(var7, var1.getPos());
      }

      if (Class8564.method30588()) {
         Class8564.method30590();
      }

      var0.method18462(var1, var2, var3, var4, var8, Class213.field798);
      if (Class8564.method30588()) {
         if (Class8564.method30594()) {
            Class8564.method30595();
            var0.method18462(var1, var2, var3, var4, Class1699.field9258, Class213.field798);
            Class8564.method30597();
         }

         Class8564.method30598();
      }
   }

   public <E extends TileEntity> boolean method27964(E var1, MatrixStack var2, Class7733 var3, int var4, int var5) {
      Class5942 var8 = this.<TileEntity>method27960(var1);
      if (var8 != null) {
         method27965(var1, () -> {
            this.field34750 = var1;
            if (Class8564.method30588()) {
               Class8564.method30590();
            }

            var8.method18462(var1, 0.0F, var2, var3, var4, var5);
            if (Class8564.method30588()) {
               if (Class8564.method30594()) {
                  Class8564.method30595();
                  var8.method18462(var1, 0.0F, var2, var3, Class1699.field9258, var5);
                  Class8564.method30597();
               }

               Class8564.method30598();
            }

            this.field34750 = null;
         });
         return false;
      } else {
         return true;
      }
   }

   private static void method27965(TileEntity var0, Runnable var1) {
      try {
         var1.run();
      } catch (Throwable var7) {
         CrashReport var5 = CrashReport.makeCrashReport(var7, "Rendering Block Entity");
         CrashReportCategory var6 = var5.makeCategory("Block Entity Details");
         var0.method3781(var6);
         throw new ReportedException(var5);
      }
   }

   public void setWorld(World var1) {
      this.field34747 = var1;
      if (var1 == null) {
         this.field34748 = null;
      }
   }

   public FontRenderer method27967() {
      return this.field34745;
   }

   public Class5942 method27968(TileEntityType var1) {
      return this.field34742.get(var1);
   }

   public synchronized <T extends TileEntity> void method27969(TileEntityType<T> var1, Class5942<? super T> var2) {
      this.field34742.put(var1, var2);
   }
}
