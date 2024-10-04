package mapped;



import lol.Renderer;
import lol.SGL;

import java.io.IOException;
import java.io.InputStream;

public class Image implements Renderable {
   public static final int field31601 = 0;
   public static final int field31602 = 1;
   public static final int field31603 = 2;
   public static final int field31604 = 3;
   public static SGL field31605 = Renderer.get();
   public static Image field31606;
   public static final int field31607 = 1;
   public static final int field31608 = 2;
   public Texture field31609;
   public int field31610;
   public int field31611;
   public float field31612;
   public float field31613;
   public float field31614;
   public float field31615;
   public float field31616;
   public float field31617 = 1.0F;
   public String field31618;
   public boolean field31619 = false;
   public byte[] field31620;
   public boolean field31621;
   public float field31622;
   public float field31623;
   public String field31624;
   public Color[] field31625;
   private int field31626 = 9729;
   private boolean field31627;
   private Color field31628;

   public Image(Image var1) {
      this.field31610 = var1.method23558();
      this.field31611 = var1.method23559();
      this.field31609 = var1.field31609;
      this.field31612 = var1.field31612;
      this.field31613 = var1.field31613;
      this.field31618 = var1.field31618;
      this.field31614 = var1.field31614;
      this.field31615 = var1.field31615;
      this.field31622 = (float)(this.field31610 / 2);
      this.field31623 = (float)(this.field31611 / 2);
      this.field31619 = true;
   }

   public Image() {
   }

   public Image(Texture var1) {
      this.field31609 = var1;
      this.field31618 = var1.toString();
      this.method23518();
   }

   public Image(String var1) throws Class2451 {
      this(var1, false);
   }

   public Image(String var1, Color var2) throws Class2451 {
      this(var1, false, 1, var2);
   }

   public Image(String var1, boolean var2) throws Class2451 {
      this(var1, var2, 1);
   }

   public Image(String var1, boolean var2, int var3) throws Class2451 {
      this(var1, var2, var3, null);
   }

   public Image(String var1, boolean var2, int var3, Color var4) throws Class2451 {
      this.field31626 = var3 == 1 ? 9729 : 9728;
      this.field31628 = var4;
      this.field31627 = var2;

      try {
         this.field31618 = var1;
         int[] var7 = null;
         if (var4 != null) {
            var7 = new int[]{(int)(var4.field16455 * 255.0F), (int)(var4.field16456 * 255.0F), (int)(var4.field16457 * 255.0F)};
         }

         this.field31609 = InternalTextureLoader.get().getTexture(var1, var2, this.field31626, var7);
      } catch (IOException var8) {
         Log.method25661(var8);
         throw new Class2451("Failed to load image from: " + var1, var8);
      }
   }

   public void method23511(int var1) {
      this.field31626 = var1 != 1 ? 9728 : 9729;
      this.field31609.bind();
      field31605.method18404(3553, 10241, this.field31626);
      field31605.method18404(3553, 10240, this.field31626);
   }

   public Image(int var1, int var2) throws Class2451 {
      this(var1, var2, 2);
   }

   public Image(int var1, int var2, int var3) throws Class2451 {
      this.field31618 = super.toString();
      this.field31626 = var3 == 1 ? 9729 : 9728;

      try {
         this.field31609 = InternalTextureLoader.get().method35798(var1, var2, this.field31626);
      } catch (IOException var7) {
         Log.method25661(var7);
         throw new Class2451("Failed to create empty image " + var1 + "x" + var2);
      }

      this.method23524();
   }

   public Image(InputStream var1, String var2, boolean var3) throws Class2451 {
      this(var1, var2, var3, 1);
   }

   public Image(InputStream var1, String var2, boolean var3, int var4) throws Class2451 {
      this.method23521(var1, var2, var3, var4, null);
   }

   public Image(ImageBuffer var1) {
      this(var1, 1);
      TextureImpl.bindNone();
   }

   public Image(ImageBuffer var1, int var2) {
      this((ImageData)var1, var2);
      TextureImpl.bindNone();
   }

   public Image(ImageData var1) {
      this(var1, 1);
   }

   public Image(ImageData var1, int var2) {
      try {
         this.field31626 = var2 == 1 ? 9729 : 9728;
         this.field31609 = InternalTextureLoader.get().method35799(var1, this.field31626);
         this.field31618 = this.field31609.toString();
      } catch (IOException var6) {
         Log.method25661(var6);
      }
   }

   public int method23512() {
      return this.field31626;
   }

   public String method23513() {
      return this.field31618;
   }

   public void method23514(float var1, float var2, float var3, float var4) {
      this.method23516(0, var1, var2, var3, var4);
      this.method23516(1, var1, var2, var3, var4);
      this.method23516(3, var1, var2, var3, var4);
      this.method23516(2, var1, var2, var3, var4);
   }

   public void method23515(float var1, float var2, float var3) {
      this.method23517(0, var1, var2, var3);
      this.method23517(1, var1, var2, var3);
      this.method23517(3, var1, var2, var3);
      this.method23517(2, var1, var2, var3);
   }

   public void method23516(int var1, float var2, float var3, float var4, float var5) {
      if (this.field31625 == null) {
         this.field31625 = new Color[]{
            new Color(1.0F, 1.0F, 1.0F, 1.0F),
            new Color(1.0F, 1.0F, 1.0F, 1.0F),
            new Color(1.0F, 1.0F, 1.0F, 1.0F),
            new Color(1.0F, 1.0F, 1.0F, 1.0F)
         };
      }

      this.field31625[var1].field16455 = var2;
      this.field31625[var1].field16456 = var3;
      this.field31625[var1].field16457 = var4;
      this.field31625[var1].field16458 = var5;
   }

   public void method23517(int var1, float var2, float var3, float var4) {
      if (this.field31625 == null) {
         this.field31625 = new Color[]{
            new Color(1.0F, 1.0F, 1.0F, 1.0F),
            new Color(1.0F, 1.0F, 1.0F, 1.0F),
            new Color(1.0F, 1.0F, 1.0F, 1.0F),
            new Color(1.0F, 1.0F, 1.0F, 1.0F)
         };
      }

      this.field31625[var1].field16455 = var2;
      this.field31625[var1].field16456 = var3;
      this.field31625[var1].field16457 = var4;
   }

   public void method23518() {
      if (!field31605.method18416()) {
         field31605.method18404(3553, 10242, 10496);
         field31605.method18404(3553, 10243, 10496);
      } else {
         field31605.method18404(3553, 10242, 34627);
         field31605.method18404(3553, 10243, 34627);
      }
   }

   public void method23519(String var1) {
      this.field31624 = var1;
   }

   public String method23520() {
      return this.field31624;
   }

   private void method23521(InputStream var1, String var2, boolean var3, int var4, Color var5) throws Class2451 {
      this.field31626 = var4 == 1 ? 9729 : 9728;

      try {
         this.field31618 = var2;
         int[] var8 = null;
         if (var5 != null) {
            var8 = new int[]{(int)(var5.field16455 * 255.0F), (int)(var5.field16456 * 255.0F), (int)(var5.field16457 * 255.0F)};
         }

         this.field31609 = InternalTextureLoader.get().method35795(var1, var2, var3, this.field31626, var8);
      } catch (IOException var9) {
         Log.method25661(var9);
         throw new Class2451("Failed to load image from: " + var2, var9);
      }
   }

   public void method23522() {
      this.field31609.bind();
   }

   public void method23523() {
      this.field31619 = false;
      this.method23524();
   }

   public final void method23524() {
      if (!this.field31619) {
         this.field31619 = true;
         if (this.field31609 != null) {
            this.field31610 = this.field31609.getImageWidth();
            this.field31611 = this.field31609.getImageHeight();
            this.field31614 = 0.0F;
            this.field31615 = 0.0F;
            this.field31612 = this.field31609.getWidth();
            this.field31613 = this.field31609.getHeight();
         }

         this.method23502();
         this.field31622 = (float)(this.field31610 / 2);
         this.field31623 = (float)(this.field31611 / 2);
      }
   }

   public void method23502() {
   }

   public void method23525() {
      this.method23527(0.0F, 0.0F);
   }

   public void method23526(float var1, float var2) {
      this.method23527(var1 - (float)(this.method23558() / 2), var2 - (float)(this.method23559() / 2));
   }

   @Override
   public void method23527(float var1, float var2) {
      this.method23524();
      this.method23536(var1, var2, (float)this.field31610, (float)this.field31611);
   }

   public void method23528(float var1, float var2, Color var3) {
      this.method23524();
      this.method23539(var1, var2, (float)this.field31610, (float)this.field31611, var3);
   }

   public void method23529(float var1, float var2, float var3, float var4) {
      this.method23524();
      if (this.field31625 != null) {
         this.field31625[0].method10392();
         field31605.method18398(this.field31614, this.field31615);
         field31605.method18402(var1, var2, 0.0F);
         this.field31625[3].method10392();
         field31605.method18398(this.field31614, this.field31615 + this.field31613);
         field31605.method18402(var1, var2 + var4, 0.0F);
         this.field31625[2].method10392();
         field31605.method18398(this.field31614 + this.field31612, this.field31615 + this.field31613);
         field31605.method18402(var1 + var3, var2 + var4, 0.0F);
         this.field31625[1].method10392();
         field31605.method18398(this.field31614 + this.field31612, this.field31615);
         field31605.method18402(var1 + var3, var2, 0.0F);
      } else {
         field31605.method18398(this.field31614, this.field31615);
         field31605.method18402(var1, var2, 0.0F);
         field31605.method18398(this.field31614, this.field31615 + this.field31613);
         field31605.method18402(var1, var2 + var4, 0.0F);
         field31605.method18398(this.field31614 + this.field31612, this.field31615 + this.field31613);
         field31605.method18402(var1 + var3, var2 + var4, 0.0F);
         field31605.method18398(this.field31614 + this.field31612, this.field31615);
         field31605.method18402(var1 + var3, var2, 0.0F);
      }
   }

   public float method23530() {
      this.method23524();
      return this.field31614;
   }

   public float method23531() {
      this.method23524();
      return this.field31615;
   }

   public float method23532() {
      this.method23524();
      return this.field31612;
   }

   public float method23533() {
      this.method23524();
      return this.field31613;
   }

   public void method23534(float var1, float var2, float var3) {
      this.method23524();
      this.method23539(var1, var2, (float)this.field31610 * var3, (float)this.field31611 * var3, Color.field16442);
   }

   public void method23535(float var1, float var2, float var3, Color var4) {
      this.method23524();
      this.method23539(var1, var2, (float)this.field31610 * var3, (float)this.field31611 * var3, var4);
   }

   public void method23536(float var1, float var2, float var3, float var4) {
      this.method23524();
      this.method23539(var1, var2, var3, var4, Color.field16442);
   }

   public void method23537(float var1, float var2, float var3, float var4) {
      this.method23538(var1, var2, var3, var4, Color.field16442);
   }

   public void method23538(float var1, float var2, float var3, float var4, Color var5) {
      if (this.field31617 != 1.0F) {
         if (var5 == null) {
            var5 = Color.field16442;
         }

         var5 = new Color(var5);
         var5.field16458 = var5.field16458 * this.field31617;
      }

      if (var5 != null) {
         var5.method10392();
      }

      this.field31609.bind();
      field31605.method18400(var1, var2, 0.0F);
      if (this.field31616 != 0.0F) {
         field31605.method18400(this.field31622, this.field31623, 0.0F);
         field31605.method18395(this.field31616, 0.0F, 0.0F, 1.0F);
         field31605.method18400(-this.field31622, -this.field31623, 0.0F);
      }

      field31605.method18369(7);
      this.method23524();
      field31605.method18398(this.field31614, this.field31615);
      field31605.method18402(0.0F, 0.0F, 0.0F);
      field31605.method18398(this.field31614, this.field31615 + this.field31613);
      field31605.method18402(var3, (float)this.field31611, 0.0F);
      field31605.method18398(this.field31614 + this.field31612, this.field31615 + this.field31613);
      field31605.method18402((float)this.field31610 + var3, (float)this.field31611 + var4, 0.0F);
      field31605.method18398(this.field31614 + this.field31612, this.field31615);
      field31605.method18402((float)this.field31610, var4, 0.0F);
      field31605.method18382();
      if (this.field31616 != 0.0F) {
         field31605.method18400(this.field31622, this.field31623, 0.0F);
         field31605.method18395(-this.field31616, 0.0F, 0.0F, 1.0F);
         field31605.method18400(-this.field31622, -this.field31623, 0.0F);
      }

      field31605.method18400(-var1, -var2, 0.0F);
   }

   public void method23539(float var1, float var2, float var3, float var4, Color var5) {
      if (this.field31617 != 1.0F) {
         if (var5 == null) {
            var5 = Color.field16442;
         }

         var5 = new Color(var5);
         var5.field16458 = var5.field16458 * this.field31617;
      }

      if (var5 != null) {
         var5.method10392();
      }

      this.field31609.bind();
      field31605.method18400(var1, var2, 0.0F);
      if (this.field31616 != 0.0F) {
         field31605.method18400(this.field31622, this.field31623, 0.0F);
         field31605.method18395(this.field31616, 0.0F, 0.0F, 1.0F);
         field31605.method18400(-this.field31622, -this.field31623, 0.0F);
      }

      field31605.method18369(7);
      this.method23529(0.0F, 0.0F, var3, var4);
      field31605.method18382();
      if (this.field31616 != 0.0F) {
         field31605.method18400(this.field31622, this.field31623, 0.0F);
         field31605.method18395(-this.field31616, 0.0F, 0.0F, 1.0F);
         field31605.method18400(-this.field31622, -this.field31623, 0.0F);
      }

      field31605.method18400(-var1, -var2, 0.0F);
   }

   public void method23540(float var1, float var2, float var3, float var4) {
      this.method23544(var1, var2, var3, var4, Color.field16442);
   }

   public void method23541(float var1, float var2) {
      this.field31622 = var1;
      this.field31623 = var2;
   }

   public float method23542() {
      this.method23524();
      return this.field31622;
   }

   public float method23543() {
      this.method23524();
      return this.field31623;
   }

   public void method23544(float var1, float var2, float var3, float var4, Color var5) {
      this.method23524();
      var5.method10392();
      this.field31609.bind();
      if (field31605.method18417()) {
         field31605.method18381(33880);
         field31605.method18418((byte)((int)(var5.field16455 * 255.0F)), (byte)((int)(var5.field16456 * 255.0F)), (byte)((int)(var5.field16457 * 255.0F)));
      }

      field31605.method18399(8960, 8704, 8448);
      field31605.method18400(var1, var2, 0.0F);
      if (this.field31616 != 0.0F) {
         field31605.method18400(this.field31622, this.field31623, 0.0F);
         field31605.method18395(this.field31616, 0.0F, 0.0F, 1.0F);
         field31605.method18400(-this.field31622, -this.field31623, 0.0F);
      }

      field31605.method18369(7);
      this.method23529(0.0F, 0.0F, var3, var4);
      field31605.method18382();
      if (this.field31616 != 0.0F) {
         field31605.method18400(this.field31622, this.field31623, 0.0F);
         field31605.method18395(-this.field31616, 0.0F, 0.0F, 1.0F);
         field31605.method18400(-this.field31622, -this.field31623, 0.0F);
      }

      field31605.method18400(-var1, -var2, 0.0F);
      if (field31605.method18417()) {
         field31605.method18380(33880);
      }
   }

   public void method23545(float var1, float var2) {
      this.method23540(var1, var2, (float)this.method23558(), (float)this.method23559());
   }

   public void method23546(float var1) {
      this.field31616 = var1 % 360.0F;
   }

   public float method23547() {
      return this.field31616;
   }

   public float method23548() {
      return this.field31617;
   }

   public void method23549(float var1) {
      this.field31617 = var1;
   }

   public void method23550(float var1) {
      this.field31616 += var1;
      this.field31616 %= 360.0F;
   }

   public Image method23551(int var1, int var2, int var3, int var4) {
      this.method23524();
      float var7 = (float)var1 / (float)this.field31610 * this.field31612 + this.field31614;
      float var8 = (float)var2 / (float)this.field31611 * this.field31613 + this.field31615;
      float var9 = (float)var3 / (float)this.field31610 * this.field31612;
      float var10 = (float)var4 / (float)this.field31611 * this.field31613;
      Image var11 = new Image();
      var11.field31619 = true;
      var11.field31609 = this.field31609;
      var11.field31614 = var7;
      var11.field31615 = var8;
      var11.field31612 = var9;
      var11.field31613 = var10;
      var11.field31610 = var3;
      var11.field31611 = var4;
      var11.field31618 = this.field31618;
      var11.field31622 = (float)(var3 / 2);
      var11.field31623 = (float)(var4 / 2);
      return var11;
   }

   public void method23552(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.method23553(var1, var2, var1 + (float)this.field31610, var2 + (float)this.field31611, var3, var4, var5, var6);
   }

   public void method23553(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.method23554(var1, var2, var3, var4, var5, var6, var7, var8, Color.field16442);
   }

   public void method23554(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, Color var9) {
      this.method23524();
      if (this.field31617 != 1.0F) {
         if (var9 == null) {
            var9 = Color.field16442;
         }

         var9 = new Color(var9);
         var9.field16458 = var9.field16458 * this.field31617;
      }

      var9.method10392();
      this.field31609.bind();
      field31605.method18400(var1, var2, 0.0F);
      if (this.field31616 != 0.0F) {
         field31605.method18400(this.field31622, this.field31623, 0.0F);
         field31605.method18395(this.field31616, 0.0F, 0.0F, 1.0F);
         field31605.method18400(-this.field31622, -this.field31623, 0.0F);
      }

      field31605.method18369(7);
      this.method23555(0.0F, 0.0F, var3 - var1, var4 - var2, var5, var6, var7, var8);
      field31605.method18382();
      if (this.field31616 != 0.0F) {
         field31605.method18400(this.field31622, this.field31623, 0.0F);
         field31605.method18395(-this.field31616, 0.0F, 0.0F, 1.0F);
         field31605.method18400(-this.field31622, -this.field31623, 0.0F);
      }

      field31605.method18400(-var1, -var2, 0.0F);
   }

   public void method23555(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.method23556(var1, var2, var3, var4, var5, var6, var7, var8, null);
   }

   public void method23556(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, Color var9) {
      if (var9 != null) {
         var9.method10392();
      }

      float var12 = var3 - var1;
      float var13 = var4 - var2;
      float var14 = var7 - var5;
      float var15 = var8 - var6;
      float var16 = var5 / (float)this.field31610 * this.field31612 + this.field31614;
      float var17 = var6 / (float)this.field31611 * this.field31613 + this.field31615;
      float var18 = var14 / (float)this.field31610 * this.field31612;
      float var19 = var15 / (float)this.field31611 * this.field31613;
      field31605.method18398(var16, var17);
      field31605.method18402(var1, var2, 0.0F);
      field31605.method18398(var16, var17 + var19);
      field31605.method18402(var1, var2 + var13, 0.0F);
      field31605.method18398(var16 + var18, var17 + var19);
      field31605.method18402(var1 + var12, var2 + var13, 0.0F);
      field31605.method18398(var16 + var18, var17);
      field31605.method18402(var1 + var12, var2, 0.0F);
   }

   public void method23557(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      Color.field16442.method10392();
      this.field31609.bind();
      field31605.method18400(var1, var2, 0.0F);
      if (this.field31616 != 0.0F) {
         field31605.method18400(this.field31622, this.field31623, 0.0F);
         field31605.method18395(this.field31616, 0.0F, 0.0F, 1.0F);
         field31605.method18400(-this.field31622, -this.field31623, 0.0F);
      }

      field31605.method18369(7);
      this.method23524();
      field31605.method18398(this.field31614, this.field31615);
      field31605.method18402(0.0F, 0.0F, 0.0F);
      field31605.method18398(this.field31614, this.field31615 + this.field31613);
      field31605.method18402(var3 - var1, var4 - var2, 0.0F);
      field31605.method18398(this.field31614 + this.field31612, this.field31615 + this.field31613);
      field31605.method18402(var5 - var1, var6 - var2, 0.0F);
      field31605.method18398(this.field31614 + this.field31612, this.field31615);
      field31605.method18402(var7 - var1, var8 - var2, 0.0F);
      field31605.method18382();
      if (this.field31616 != 0.0F) {
         field31605.method18400(this.field31622, this.field31623, 0.0F);
         field31605.method18395(-this.field31616, 0.0F, 0.0F, 1.0F);
         field31605.method18400(-this.field31622, -this.field31623, 0.0F);
      }

      field31605.method18400(-var1, -var2, 0.0F);
   }

   public int method23558() {
      this.method23524();
      return this.field31610;
   }

   public int method23559() {
      this.method23524();
      return this.field31611;
   }

   public Image method23560() {
      this.method23524();
      return this.method23551(0, 0, this.field31610, this.field31611);
   }

   public Image method23561(float var1) {
      this.method23524();
      return this.method23562((int)((float)this.field31610 * var1), (int)((float)this.field31611 * var1));
   }

   public Image method23562(int var1, int var2) {
      this.method23524();
      Image var5 = this.method23560();
      var5.field31610 = var1;
      var5.field31611 = var2;
      var5.field31622 = (float)(var1 / 2);
      var5.field31623 = (float)(var2 / 2);
      return var5;
   }

   public void method23563() {
      if (this.field31613 > 0.0F) {
         this.field31615 = this.field31615 + this.field31613;
         this.field31613 = -this.field31613;
      }
   }

   public Image method23564(boolean var1, boolean var2) {
      this.method23524();
      Image var5 = this.method23560();
      if (var1) {
         var5.field31614 = this.field31614 + this.field31612;
         var5.field31612 = -this.field31612;
      }

      if (var2) {
         var5.field31615 = this.field31615 + this.field31613;
         var5.field31613 = -this.field31613;
      }

      return var5;
   }

   public void method23508() {
      if (field31606 == this) {
         field31606 = null;
         field31605.method18382();
      } else {
         throw new RuntimeException("The sprite sheet is not currently in use");
      }
   }

   public void method23509() {
      if (field31606 == null) {
         field31606 = this;
         this.method23524();
         Color.field16442.method10392();
         this.field31609.bind();
         field31605.method18369(7);
      } else {
         throw new RuntimeException("Attempt to start use of a sprite sheet before ending use with another - see endUse()");
      }
   }

   @Override
   public String toString() {
      this.method23524();
      return "[Image "
         + this.field31618
         + " "
         + this.field31610
         + "x"
         + this.field31611
         + "  "
         + this.field31614
         + ","
         + this.field31615
         + ","
         + this.field31612
         + ","
         + this.field31613
         + "]";
   }

   public Texture method23565() {
      return this.field31609;
   }

   public void method23510(Texture var1) {
      this.field31609 = var1;
      this.method23523();
   }

   private int method23566(byte var1) {
      return var1 >= 0 ? var1 : 256 + var1;
   }

   public Color method23567(int var1, int var2) {
      if (this.field31620 == null) {
         this.field31620 = this.field31609.getTextureData();
      }

      int var5 = (int)(this.field31614 * (float)this.field31609.getTextureWidth());
      int var6 = (int)(this.field31615 * (float)this.field31609.getTextureHeight());
      if (!(this.field31612 < 0.0F)) {
         var1 = var5 + var1;
      } else {
         var1 = var5 - var1;
      }

      if (!(this.field31613 < 0.0F)) {
         var2 = var6 + var2;
      } else {
         var2 = var6 - var2;
      }

      int var7 = var1 + var2 * this.field31609.getTextureWidth();
      var7 *= !this.field31609.hasAlpha() ? 3 : 4;
      return !this.field31609.hasAlpha()
         ? new Color(this.method23566(this.field31620[var7]), this.method23566(this.field31620[var7 + 1]), this.method23566(this.field31620[var7 + 2]))
         : new Color(
            this.method23566(this.field31620[var7]),
            this.method23566(this.field31620[var7 + 1]),
            this.method23566(this.field31620[var7 + 2]),
            this.method23566(this.field31620[var7 + 3])
         );
   }

   public boolean method23568() {
      return this.field31621;
   }

   public void method23569() throws Class2451 {
      if (!this.method23568()) {
         this.field31621 = true;
         this.field31609.release();
      }
   }

   public void method23570() {
      this.field31620 = null;
   }
}
