package mapped;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class Class6429 implements Class6415 {
   private boolean field28264;
   public final Class8475 field28265;

   public Class6429(Class8475 var1, boolean var2) {
      this.field28265 = var1;
      this.field28264 = var2;
   }

   @Override
   public void method19539() throws IOException {
      if (!(Class8475.method29928(this.field28265) instanceof Class5938)) {
         if (!(Class8475.method29928(this.field28265) instanceof Class5937)) {
            throw new Class2487("expected DocumentStartEvent, but got " + Class8475.method29928(this.field28265));
         }

         this.field28265.method29915();
         Class8475.method29929(this.field28265, new Class6421(this.field28265));
      } else {
         Class5938 var3 = (Class5938)Class8475.method29928(this.field28265);
         if ((var3.method18442() != null || var3.method18443() != null) && Class8475.method29930(this.field28265)) {
            this.field28265.method29916("...", true, false, false);
            this.field28265.method29917();
         }

         if (var3.method18442() != null) {
            String var4 = Class8475.method29931(this.field28265, var3.method18442());
            this.field28265.method29920(var4);
         }

         Class8475.method29932(this.field28265, new LinkedHashMap(Class8475.method29933()));
         if (var3.method18443() != null) {
            for (String var6 : new TreeSet<String>(var3.method18443().keySet())) {
               String var7 = var3.method18443().get(var6);
               Class8475.method29934(this.field28265).put(var7, var6);
               String var8 = Class8475.method29935(this.field28265, var6);
               String var9 = Class8475.method29936(this.field28265, var7);
               this.field28265.method29921(var8, var9);
            }
         }

         boolean var11 = this.field28264
            && !var3.method18441()
            && !Class8475.method29937(this.field28265)
            && var3.method18442() == null
            && (var3.method18443() == null || var3.method18443().isEmpty())
            && !Class8475.method29938(this.field28265);
         if (!var11) {
            this.field28265.method29917();
            this.field28265.method29916("---", true, false, false);
            if (Class8475.method29937(this.field28265)) {
               this.field28265.method29917();
            }
         }

         Class8475.method29929(this.field28265, new Class6431(this.field28265));
      }
   }
}
