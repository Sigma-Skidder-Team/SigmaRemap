package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.music.MusicManager;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.unmapped.ThumbnailUtil;
import com.mentalfrostbyte.jello.util.youtube.YoutubeJPGThumbnail;
import com.mentalfrostbyte.jello.util.youtube.YoutubeVideoData;

import java.util.ArrayList;

public class SearchBoxButton extends Class4278 {
   public Class4339 field20840;
   public UIInput searchBox;
   private ArrayList<YoutubeVideoData> field20842;
   private MusicManager field20843 = Client.getInstance().musicManager;

   public SearchBoxButton(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, ColorHelper.field27961, var7, false);
      this.addToList(
            this.field20840 = new Class4339(this, "albumView", 0, 0, var5, var6, ColorHelper.field27961, "View"));
      this.addToList(this.searchBox = new UIInput(this, "searchInput", 30, 14, var5 - 60, 70, UIInput.field20742, "",
            "Search..."));
      this.searchBox.method13292(true);
   }

   @Override
   public void draw(float partialTicks) {
      super.draw(partialTicks);
   }

   @Override
   public void keyPressed(int keyCode) {
      if (keyCode == 257 && this.searchBox.method13297()) {
         this.searchBox.method13145(false);
         new Thread(
               () -> {
                  this.field20842 = new ArrayList<YoutubeVideoData>();
                  YoutubeJPGThumbnail[] var3 = ThumbnailUtil.search(this.searchBox.getTypedText());

                  for (YoutubeJPGThumbnail var7 : var3) {
                     this.field20842.add(new YoutubeVideoData(var7.videoID, var7.title, var7.fullUrl));
                  }

                  this.runThisOnDimensionUpdate(
                        () -> {
                           this.method13236(this.field20840);
                           this.addToList(
                                 this.field20840 = new Class4339(this, "albumView", 0, 0, this.widthA, this.heightA,
                                       ColorHelper.field27961, "View"));
                           if (this.field20842 != null) {
                              for (int var3x = 0; var3x < this.field20842.size(); var3x++) {
                                 YoutubeVideoData var4 = this.field20842.get(var3x);
                                 byte var5 = 80;
                                 byte var6 = 10;
                                 Class4286 var7x;
                                 this.field20840
                                       .addToList(
                                             var7x = new Class4286(
                                                   this.field20840,
                                                   var6 + var3x % 3 * 183 - (var3x % 3 <= 0 ? 0 : var6)
                                                         - (var3x % 3 <= 1 ? 0 : var6),
                                                   var5 + var6 + (var3x - var3x % 3) / 3 * 210,
                                                   183,
                                                   220,
                                                   var4));
                                 var7x.doThis((var2, var3xx) -> this.field20843.playSong(null, var4));
                              }
                           }
                        });
               })
               .start();
      }

      super.keyPressed(keyCode);
   }
}
