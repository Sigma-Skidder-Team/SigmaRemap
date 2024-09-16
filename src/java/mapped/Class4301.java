package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.music.MusicManager;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.Class6972;
import com.mentalfrostbyte.jello.unmapped.YoutubeTrumbNail;
import com.mentalfrostbyte.jello.unmapped.Class9133;

import java.util.ArrayList;

public class Class4301 extends Class4278 {
   public Class4339 field20840;
   public UIInput field20841;
   private ArrayList<Class9133> field20842;
   private MusicManager field20843 = Client.getInstance().getMusicManager();

   public Class4301(IconPanel var1, String var2, int var3, int var4, int var5, int var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, ColorHelper.field27961, var7, false);
      this.addToList(this.field20840 = new Class4339(this, "albumView", 0, 0, var5, var6, ColorHelper.field27961, "View"));
      this.addToList(this.field20841 = new UIInput(this, "searchInput", 30, 14, var5 - 60, 70, UIInput.field20742, "", "Search..."));
      this.field20841.method13292(true);
   }

   @Override
   public void draw(float var1) {
      super.draw(var1);
   }

   @Override
   public void keyPressed(int var1) {
      if (var1 == 257 && this.field20841.method13297()) {
         this.field20841.method13145(false);
         new Thread(
               () -> {
                  this.field20842 = new ArrayList<Class9133>();
                  YoutubeTrumbNail[] var3 = Class6972.method21516(this.field20841.method13303());

                  for (YoutubeTrumbNail var7 : var3) {
                     this.field20842.add(new Class9133(var7.field33683, var7.field33684, var7.field33685));
                  }

                  this.method13222(
                     () -> {
                        this.method13236(this.field20840);
                        this.addToList(
                           this.field20840 = new Class4339(this, "albumView", 0, 0, this.widthA, this.heightA, ColorHelper.field27961, "View")
                        );
                        if (this.field20842 != null) {
                           for (int var3x = 0; var3x < this.field20842.size(); var3x++) {
                              Class9133 var4 = this.field20842.get(var3x);
                              byte var5 = 80;
                              byte var6 = 10;
                              Class4286 var7x;
                              this.field20840
                                 .addToList(
                                    var7x = new Class4286(
                                       this.field20840,
                                       var6 + var3x % 3 * 183 - (var3x % 3 <= 0 ? 0 : var6) - (var3x % 3 <= 1 ? 0 : var6),
                                       var5 + var6 + (var3x - var3x % 3) / 3 * 210,
                                       183,
                                       220,
                                       var4
                                    )
                                 );
                              var7x.doThis((var2, var3xx) -> this.field20843.method24317(null, var4));
                           }
                        }
                     }
                  );
               }
            )
            .start();
      }

      super.keyPressed(var1);
   }
}
