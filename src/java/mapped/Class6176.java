package mapped;

import java.io.IOException;

public final class Class6176 implements Class6172 {
   public final Class2391 field27612;

   public Class6176(Class2391 var1) {
      this.field27612 = var1;
   }

   @Override
   public Class1797 method19074(Class8165 var1) throws IOException {
      Class8164 var4 = (Class8164)var1;
      Class8223 var5 = var4.method28408();
      Class5751 var6 = var4.method28406();
      boolean var7 = !var5.method28613().equals("GET");
      Class7932 var8 = var6.method17926(this.field27612, var7);
      Class7263 var9 = var6.method17932();
      return var4.method28410(var5, var6, var8, var9);
   }
}
