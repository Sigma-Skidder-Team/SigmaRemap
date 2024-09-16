package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class9133;
import com.mentalfrostbyte.jello.unmapped.MusicPlayerTrumnaheil;

public class Class511 implements Runnable {
   private static String[] field2423;
   public final MusicPlayerTrumnaheil field2424;
   public final ColorHelper field2425;
   public final MusicPlayer field2426;
   public final MusicPlayer field2427;

   public Class511(MusicPlayer var1, MusicPlayerTrumnaheil var2, ColorHelper var3, MusicPlayer var4) {
      this.field2427 = var1;
      this.field2424 = var2;
      this.field2425 = var3;
      this.field2426 = var4;
   }

   @Override
   public void run() {
      if (!MusicPlayer.method13206(this.field2427).method13231(this.field2424.field44776)) {
         Class4240 var3;
         MusicPlayer.method13206(this.field2427)
            .addToList(
               var3 = new Class4240(
                  MusicPlayer.method13206(this.field2427),
                  this.field2424.field44776,
                  0,
                  MusicPlayer.method13206(this.field2427).method13517().method13241().size() * MusicPlayer.method13207(this.field2427),
                  MusicPlayer.method13208(this.field2427),
                  MusicPlayer.method13207(this.field2427),
                  this.field2425,
                  this.field2424.field44775,
                  ResourceRegistry.JelloLightFont14
               )
            );
         Class4339 var4;
         this.field2426
            .addToList(
               var4 = new Class4339(
                  this.field2426,
                  this.field2424.field44776,
                  MusicPlayer.method13208(this.field2427),
                  0,
                  this.field2426.method13267() - MusicPlayer.method13208(this.field2427),
                  this.field2426.method13269() - MusicPlayer.method13209(this.field2427),
                  ColorHelper.field27961,
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
                  var4.addToList(
                     var7 = new Class4286(
                        var4,
                        var9 + var5 % 3 * 183 - (var5 % 3 <= 0 ? 0 : var9) - (var5 % 3 <= 1 ? 0 : var9),
                        var8 + var9 + (var5 - var5 % 3) / 3 * 210,
                        183,
                        220,
                        var6
                     )
                  );
                  var7.doThis((var3x, var4x) -> MusicPlayer.method13211(this.field2427, field2424, var6));
               }
            }
         }

         var3.doThis((var2, var3x) -> MusicPlayer.method13210(this.field2427, var4));
      }
   }
}
