package mapped;

import java.util.Optional;

public class Class7734 implements IRenderTypeBuffer {
   private static String[] field33207;
   private final Impl field33208;
   private final Impl field33209 = IRenderTypeBuffer.getImpl(new BufferBuilder(256));
   private int field33210 = 255;
   private int field33211 = 255;
   private int field33212 = 255;
   private int field33213 = 255;

   public Class7734(Impl var1) {
      this.field33208 = var1;
   }

   @Override
   public IVertexBuilder getBuffer(RenderType var1) {
      if (!var1.method14354()) {
         IVertexBuilder var8 = this.field33208.getBuffer(var1);
         Optional var5 = var1.method14353();
         if (!var5.isPresent()) {
            return var8;
         } else {
            IVertexBuilder var6 = this.field33209.getBuffer((RenderType)var5.get());
            Class5428 var7 = new Class5428(var6, this.field33210, this.field33211, this.field33212, this.field33213);
            return Class7802.method26050(var7, var8);
         }
      } else {
         IVertexBuilder var4 = this.field33209.getBuffer(var1);
         return new Class5428(var4, this.field33210, this.field33211, this.field33212, this.field33213);
      }
   }

   public void method25599(int var1, int var2, int var3, int var4) {
      this.field33210 = var1;
      this.field33211 = var2;
      this.field33212 = var3;
      this.field33213 = var4;
   }

   public void method25600() {
      this.field33209.finish();
   }
}
