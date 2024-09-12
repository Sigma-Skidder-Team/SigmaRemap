package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;

import java.util.ArrayList;
import java.util.List;

public class Class4366 extends Class4247 {
   public static final ColorHelper field21342 = new ColorHelper(1250067, -15329770).setTextColor(ClientColors.DEEP_TEAL.getColor).method19414(Class2218.field14492);
   public List<String> field21343 = new ArrayList<String>();
   public int field21344 = 0;
   public boolean field21345;
   public boolean field21346;

   public Class4366(IconPanel var1, String var2, int var3, int var4, int var5, int var6, List<String> var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, field21342, false);
      this.field21343 = var7;
      this.field21344 = var8;
      this.method13663();
   }

   private void method13663() {
      this.method13241().clear();
      this.font = ClassicDecryption.regular15;
      ButtonPanel var3;
      this.addToList(var3 = new ButtonPanel(this, "dropdownButton", 0, 0, this.getHeight(), this.getHeight(), this.field20914));
      var3.method13261((var1, var2) -> {
         var1.setX(0);
         var1.setY(0);
         var1.setWidth(this.getWidth());
         var1.setHeight(this.getHeight());
      });
      var3.doThis((var1, var2) -> this.method13674(!this.method13673()));

      for (String var5 : this.field21343) {
         ButtonPanel var6;
         this.addToList(
            var6 = new ButtonPanel(
               this,
               var5,
               0,
               this.getHeight(),
               this.getWidth(),
               17,
               new ColorHelper(
                  -14540254,
                  this.field20914.method19405(),
                  this.field20914.method19405(),
                  ClientColors.LIGHT_GREYISH_BLUE.getColor,
                  Class2218.field14488,
                  Class2218.field14492
               ),
               var5,
               ClassicDecryption.regular12
            )
         );
         var6.setX(8);
         var6.doThis((var2, var3x) -> {
            int var6x = this.method13671();
            this.method13672(this.field21343.indexOf(var5));
            this.method13674(false);
            if (var6x != this.method13671()) {
               this.method13037();
            }
         });
      }

      this.method13246(new Class7262(1));
   }

   private int method13664() {
      return this.method13665();
   }

   private int method13665() {
      return this.method13673() ? this.getHeight() * (this.field21343.size() + 1) : this.getHeight();
   }

   private int method13666() {
      return 0;
   }

   @Override
   public void method13028(int var1, int var2) {
      if (!this.method13297() && this.method13673()) {
         this.method13674(false);
      }

      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      RenderUtil.drawRect(
         (float)this.getX(),
         (float)this.getY(),
         (float)(this.getX() + this.getWidth()),
         (float)(this.getY() + this.getHeight()),
         -14540254
      );
      RenderUtil.method11428(
         (float)this.getX(),
         (float)this.getY(),
         (float)(this.getX() + this.getWidth()),
         (float)(this.getY() + this.getHeight()),
         ClientColors.DEEP_TEAL.getColor
      );
      if (this.method13114(this.method13309(), this.method13310()) && this.method13310() - this.method13272() < this.getHeight()) {
         RenderUtil.method11428(
            (float)(this.getX() + 1),
            (float)(this.getY() + 1),
            (float)(this.getX() + this.getWidth() - 1),
            (float)(this.getY() + this.getHeight() - 1),
            ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.25F)
         );
      }

      int var4 = this.getX() + this.getWidth() - 11;
      int var5 = this.getY() + this.getHeight() - 12;
      if (!this.method13673()) {
         RenderUtil.method11434((float)var4, (float)var5, (float)(var4 + 6), (float)var5, (float)(var4 + 3), (float)(var5 + 3), ClientColors.MID_GREY.getColor);
      } else {
         RenderUtil.method11434(
            (float)var4, (float)(var5 + 3), (float)(var4 + 6), (float)(var5 + 3), (float)(var4 + 3), (float)var5, ClientColors.MID_GREY.getColor
         );
      }

      for (IconPanel var7 : this.method13241()) {
         if (!var7.method13257().equals("dropdownButton")) {
            var7.method13288(this.field21345);
         }
      }

      if (this.method13303() != null) {
         RenderUtil.method11415(this);
         RenderUtil.drawString(
            this.method13305(),
            (float)(this.getX() + 7),
            (float)(this.getY() + (this.getHeight() - this.method13305().method23952()) / 2),
            this.method13303(),
            ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1 * 0.5F)
         );
         RenderUtil.endScissor();
      }

      if (!this.method13673()) {
         RenderUtil.method11415(this);
      }

      super.draw(var1);
      if (!this.method13673()) {
         RenderUtil.endScissor();
      }
   }

   public List<String> method13667() {
      return this.field21343;
   }

   public void method13668(String var1, int var2) {
      this.method13667().add(var2, var1);
      this.method13663();
   }

   public void method13669(String var1) {
      this.method13668(var1, this.field21343.size());
   }

   public <E extends Enum<E>> void method13670(Class<E> var1) {
      this.field21343.clear();

      for (Enum var7 : (Enum[])var1.getEnumConstants()) {
         String var8 = var7.toString().substring(0, 1).toUpperCase() + var7.toString().substring(1, var7.toString().length()).toLowerCase();
         this.method13668(var8, var7.ordinal());
      }
   }

   public int method13671() {
      return this.field21344;
   }

   public void method13672(int var1) {
      this.field21344 = var1;
   }

   public boolean method13673() {
      return this.field21345;
   }

   public void method13674(boolean var1) {
      this.field21345 = var1;
   }

   @Override
   public String method13303() {
      return this.method13667().size() <= 0 ? null : this.method13667().get(this.method13671());
   }

   @Override
   public boolean method13114(int var1, int var2) {
      var1 -= this.method13271();
      var2 -= this.method13272();
      return var1 >= 0 && var1 <= this.getWidth() && var2 >= 0 && var2 <= this.method13665();
   }
}
