package mapped;

import java.io.IOException;
import java.util.List;

public final class Class8164 implements Class8165 {
   private final List<Class6172> field35138;
   private final Class5751 field35139;
   private final Class7932 field35140;
   private final Class7263 field35141;
   private final int field35142;
   private final Class8223 field35143;
   private int field35144;

   public Class8164(List<Class6172> var1, Class5751 var2, Class7932 var3, Class7263 var4, int var5, Class8223 var6) {
      this.field35138 = var1;
      this.field35141 = var4;
      this.field35139 = var2;
      this.field35140 = var3;
      this.field35142 = var5;
      this.field35143 = var6;
   }

   @Override
   public Class7266 method28405() {
      return this.field35141;
   }

   public Class5751 method28406() {
      return this.field35139;
   }

   public Class7932 method28407() {
      return this.field35140;
   }

   @Override
   public Class8223 method28408() {
      return this.field35143;
   }

   @Override
   public Class1797 method28409(Class8223 var1) throws IOException {
      return this.method28410(var1, this.field35139, this.field35140, this.field35141);
   }

   public Class1797 method28410(Class8223 var1, Class5751 var2, Class7932 var3, Class7263 var4) throws IOException {
      if (this.field35142 < this.field35138.size()) {
         this.field35144++;
         if (this.field35140 != null && !this.field35141.method22809(var1.method28612())) {
            throw new IllegalStateException("network interceptor " + this.field35138.get(this.field35142 - 1) + " must retain the same host and port");
         } else if (this.field35140 != null && this.field35144 > 1) {
            throw new IllegalStateException("network interceptor " + this.field35138.get(this.field35142 - 1) + " must call proceed() exactly once");
         } else {
            Class8164 var7 = new Class8164(this.field35138, var2, var3, var4, this.field35142 + 1, var1);
            Class6172 var8 = this.field35138.get(this.field35142);
            Class1797 var9 = var8.method19074(var7);
            if (var3 != null && this.field35142 + 1 < this.field35138.size() && var7.field35144 != 1) {
               throw new IllegalStateException("network interceptor " + var8 + " must call proceed() exactly once");
            } else if (var9 != null) {
               return var9;
            } else {
               throw new NullPointerException("interceptor " + var8 + " returned null");
            }
         }
      } else {
         throw new AssertionError();
      }
   }
}
