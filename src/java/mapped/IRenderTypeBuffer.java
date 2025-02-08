package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import net.minecraft.util.ResourceLocation;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public interface IRenderTypeBuffer {
   static Impl getImpl(BufferBuilder var0) {
      return getImpl(ImmutableMap.of(), var0);
   }

   static Impl getImpl(Map<RenderType, BufferBuilder> var0, BufferBuilder var1) {
      return new Impl(var1, var0);
   }

   IVertexBuilder getBuffer(RenderType var1);

   default void flushRenderBuffers() {
   }

   class Impl implements IRenderTypeBuffer {
      public final BufferBuilder field33215;
      public final Map<RenderType, BufferBuilder> field33216;
      public RenderType field33217 = null;
      public final Set<BufferBuilder> field33218 = Sets.newHashSet();
      private final IVertexBuilder field33219 = new Class5430(this);

      public Impl(BufferBuilder var1, Map<RenderType, BufferBuilder> var2) {
         this.field33215 = var1;
         this.field33216 = var2;
         this.field33215.method17086(this);

         for (BufferBuilder var6 : var2.values()) {
            var6.method17086(this);
         }
      }

      @Override
      public IVertexBuilder getBuffer(RenderType var1) {
         BufferBuilder var4 = this.method25601(var1);
         if (!Objects.equals(this.field33217, var1)) {
            if (this.field33217 != null) {
               RenderType var5 = this.field33217;
               if (!this.field33216.containsKey(var5)) {
                  this.finish(var5);
               }
            }

            if (this.field33218.add(var4)) {
               var4.begin(var1.method14352(), var1.method14351());
            }

            this.field33217 = var1;
         }

         return (IVertexBuilder)(var1.method14366() != Class8684.field39210 ? var4 : this.field33219);
      }

      private BufferBuilder method25601(RenderType var1) {
         return this.field33216.getOrDefault(var1, this.field33215);
      }

      public void finish() {
         if (!this.field33218.isEmpty()) {
            if (this.field33217 != null) {
               IVertexBuilder var3 = this.getBuffer(this.field33217);
               if (var3 == this.field33215) {
                  this.finish(this.field33217);
               }
            }

            for (RenderType var4 : this.field33216.keySet()) {
               this.finish(var4);
            }
         }
      }

      public void finish(RenderType var1) {
         BufferBuilder var4 = this.method25601(var1);
         boolean var5 = Objects.equals(this.field33217, var1);
         if ((var5 || var4 != this.field33215) && this.field33218.remove(var4)) {
            var1.method14348(var4, 0, 0, 0);
            if (var5) {
               this.field33217 = null;
            }
         }
      }

      public IVertexBuilder method25604(ResourceLocation var1, IVertexBuilder var2) {
         if (this.field33217 instanceof Class4521) {
            var1 = RenderType.method14363(var1);
            Class4521 var5 = (Class4521)this.field33217;
            Class4521 var6 = var5.method14390(var1);
            return this.getBuffer(var6);
         } else {
            return var2;
         }
      }

      public RenderType method25605() {
         return this.field33217;
      }

      @Override
      public void flushRenderBuffers() {
         RenderType var3 = this.field33217;
         this.finish();
         if (var3 != null) {
            this.getBuffer(var3);
         }
      }

      public IVertexBuilder method25606() {
         return this.field33219;
      }
   }
}
