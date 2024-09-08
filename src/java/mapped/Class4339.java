package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.unmapped.IconPanel;

public class Class4339 extends Class4304 {
   private boolean field21201;
   private boolean field21202;
   private boolean field21203 = false;
   public IconPanel field21204;
   public Class4292 field21205;
   private boolean field21206 = true;
   public int field21207 = 35;
   public boolean field21208 = false;

   public Class4339(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method13511();
   }

   public Class4339(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7) {
      super(var1, var2, var3, var4, var5, var6, var7, false);
      this.method13511();
   }

   public Class4339(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
      this.method13511();
   }

   public Class4339(IconPanel var1, String var2, int var3, int var4, int var5, int var6, ColorHelper var7, String var8, ClientResource var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
      this.method13511();
   }

   private final void method13511() {
      this.method13241().add(this.field21204 = new IconPanel(this, "content", 0, 0, this.field20897, this.field20898));
      this.field21204.method13261(new Class6665());
      this.method13241().add(this.field21205 = new Class4292(this, 11));
      this.field21205.method13292(true);
   }

   public void method13512(int var1) {
      this.field21205.field20793 = var1;
   }

   public int method13513() {
      return this.field21205 != null ? this.field21205.field20793 : 0;
   }

   public void method13514(boolean var1) {
      this.field21203 = var1;
   }

   @Override
   public void method13028(int var1, int var2) {
      if (!this.field21203 || this.method13287()) {
         super.method13028(var1, var2);
         this.field21204.method13266(-1 * this.field21205.method13162());

         for (IconPanel var6 : this.method13517().method13241()) {
            for (Class6664 var8 : var6.method13260()) {
               var8.method20320(var6, this);
            }
         }
      }
   }

   public void method13515(boolean var1) {
      this.field21206 = var1;
   }

   public boolean method13516() {
      return this.field21206;
   }

   @Override
   public void draw(float var1) {
      this.method13224();
      if (!this.field21203 || this.method13287()) {
         if (this.field21206) {
            RenderUtil.method11415(this);
         }

         super.draw(var1);
         if (this.field21206) {
            RenderUtil.endScissor();
         }
      }
   }

   @Override
   public void addToList(IconPanel var1) {
      this.field21204.addToList(var1);
   }

   @Override
   public boolean method13239(IconPanel var1) {
      return this.field21204.method13239(var1);
   }

   @Override
   public boolean method13231(String var1) {
      return this.field21204.method13231(var1);
   }

   public IconPanel method13517() {
      return this.field21204;
   }

   public void method13518(boolean var1) {
      this.field21208 = var1;
   }
}
