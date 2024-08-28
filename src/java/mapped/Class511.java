package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class9133;
import com.mentalfrostbyte.jello.unmapped.Class9578;

public class Class511 implements Runnable {
   private static String[] field2423;
   public final Class9578 field2424;
   public final Class6387 field2425;
   public final Class4303 field2426;
   public final Class4303 field2427;

   public Class511(Class4303 var1, Class9578 var2, Class6387 var3, Class4303 var4) {
      this.field2427 = var1;
      this.field2424 = var2;
      this.field2425 = var3;
      this.field2426 = var4;
   }

   @Override
   public void run() {
      if (!Class4303.method13206(this.field2427).method13231(this.field2424.field44776)) {
         Class4240 var3;
         Class4303.method13206(this.field2427)
            .method13230(
               var3 = new Class4240(
                  Class4303.method13206(this.field2427),
                  this.field2424.field44776,
                  0,
                  Class4303.method13206(this.field2427).method13517().method13241().size() * Class4303.method13207(this.field2427),
                  Class4303.method13208(this.field2427),
                  Class4303.method13207(this.field2427),
                  this.field2425,
                  this.field2424.field44775,
                  ResourceRegistry.field38852
               )
            );
         Class4339 var4;
         this.field2426
            .method13230(
               var4 = new Class4339(
                  this.field2426,
                  this.field2424.field44776,
                  Class4303.method13208(this.field2427),
                  0,
                  this.field2426.method13267() - Class4303.method13208(this.field2427),
                  this.field2426.method13269() - Class4303.method13209(this.field2427),
                  Class6387.field27961,
                  this.field2424.field44775
               )
            );
         var4.method13514(true);
         var4.method13288(false);
         var4.method13300(false);
         if (this.field2424.field44778 != null) {
            for (int var5 = 0; var5 < this.field2424.field44778.size(); var5++) {
               Class9133 var6 = this.field2424.field44778.get(var5);
               Class4286 var7 = null;
               byte var8 = 65;
               byte var9 = 10;
               if (!var4.method13231(this.field2424.field44776)) {
                  var4.method13230(
                     var7 = new Class4286(
                        var4,
                        var9 + var5 % 3 * 183 - (var5 % 3 <= 0 ? 0 : var9) - (var5 % 3 <= 1 ? 0 : var9),
                        var8 + var9 + (var5 - var5 % 3) / 3 * 210,
                        183,
                        220,
                        var6
                     )
                  );
                  var7.method13251((var3x, var4x) -> Class4303.method13211(this.field2427, field2424, var6));
               }
            }
         }

         var3.method13251((var2, var3x) -> Class4303.method13210(this.field2427, var4));
      }
   }
}
