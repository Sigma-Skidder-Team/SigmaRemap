package mapped;

import lol.Renderer;
import lol.SGL;

public class Class4536 {
   public static SGL field21855 = Renderer.get();
   public static final int field21856 = 1;
   public static final int field21857 = 2;
   public static final int field21858 = 3;
   public float field21859;
   public float field21860;
   public float field21861;
   public float field21862;
   public float field21863 = 10.0F;
   public Color field21864 = Color.field16442;
   public float field21865;
   public float field21866;
   private Class9365 field21867;
   private Class6135 field21868;
   public Image field21869;
   public int field21870;
   public int field21871 = 1;
   public boolean field21872 = false;
   public float field21873 = 1.0F;

   public Class4536(Class9365 var1) {
      this.field21867 = var1;
   }

   public float method14462() {
      return this.field21859;
   }

   public float method14463() {
      return this.field21860;
   }

   public void method14464(float var1, float var2) {
      this.field21859 += var1;
      this.field21860 += var2;
   }

   public float method14465() {
      return this.field21863;
   }

   public Color method14466() {
      return this.field21864;
   }

   public void method14467(Image var1) {
      this.field21869 = var1;
   }

   public float method14468() {
      return this.field21866;
   }

   public float method14469() {
      return this.field21865;
   }

   public boolean method14470() {
      return this.field21865 > 0.0F;
   }

   public void method14471() {
      if ((!this.field21867.method35470() || this.field21871 != 1) && this.field21871 != 2) {
         if (!this.field21872 && this.field21873 == 1.0F) {
            this.field21864.method10392();
            this.field21869
               .method23529(
                  (float)((int)(this.field21859 - this.field21863 / 2.0F)),
                  (float)((int)(this.field21860 - this.field21863 / 2.0F)),
                  (float)((int)this.field21863),
                  (float)((int)this.field21863)
               );
         } else {
            field21855.method18393();
            field21855.method18400(this.field21859, this.field21860, 0.0F);
            if (this.field21872) {
               float var3 = (float)(Math.atan2((double)this.field21860, (double)this.field21859) * 180.0 / Math.PI);
               field21855.method18395(var3, 0.0F, 0.0F, 1.0F);
            }

            field21855.method18396(1.0F, this.field21873, 1.0F);
            this.field21869
               .method23539(
                  (float)((int)(-(this.field21863 / 2.0F))),
                  (float)((int)(-(this.field21863 / 2.0F))),
                  (float)((int)this.field21863),
                  (float)((int)this.field21863),
                  this.field21864
               );
            field21855.method18392();
         }
      } else {
         TextureImpl.bindNone();
         field21855.method18381(2832);
         field21855.method18391(this.field21863 / 2.0F);
         this.field21864.method10392();
         field21855.method18369(0);
         field21855.method18401(this.field21859, this.field21860);
         field21855.method18382();
      }
   }

   public void method14472(int var1) {
      this.field21868.method18945(this, var1);
      this.field21865 -= (float)var1;
      if (!(this.field21865 > 0.0F)) {
         this.field21867.method35489(this);
      } else {
         this.field21859 = this.field21859 + (float)var1 * this.field21861;
         this.field21860 = this.field21860 + (float)var1 * this.field21862;
      }
   }

   public void method14473(Class6135 var1, float var2) {
      this.field21859 = 0.0F;
      this.field21868 = var1;
      this.field21860 = 0.0F;
      this.field21861 = 0.0F;
      this.field21862 = 0.0F;
      this.field21863 = 10.0F;
      this.field21870 = 0;
      this.field21866 = this.field21865 = var2;
      this.field21872 = false;
      this.field21873 = 1.0F;
   }

   public void method14474(int var1) {
      this.field21870 = var1;
   }

   public void method14475(int var1) {
      this.field21871 = var1;
   }

   public int method14476() {
      return this.field21870;
   }

   public void method14477(float var1) {
      this.field21863 = var1;
   }

   public void method14478(float var1) {
      this.field21863 += var1;
      this.field21863 = Math.max(0.0F, this.field21863);
   }

   public void method14479(float var1) {
      this.field21865 = var1;
   }

   public void method14480(float var1) {
      this.field21865 += var1;
   }

   public void method14481() {
      this.field21865 = 1.0F;
   }

   public void method14482(float var1, float var2, float var3, float var4) {
      if (this.field21864 != Color.field16442) {
         this.field21864.field16455 = var1;
         this.field21864.field16456 = var2;
         this.field21864.field16457 = var3;
         this.field21864.field16458 = var4;
      } else {
         this.field21864 = new Color(var1, var2, var3, var4);
      }
   }

   public void method14483(float var1, float var2) {
      this.field21859 = var1;
      this.field21860 = var2;
   }

   public void method14484(float var1, float var2, float var3) {
      this.field21861 = var1 * var3;
      this.field21862 = var2 * var3;
   }

   public void method14485(float var1) {
      float var4 = (float)Math.sqrt((double)(this.field21861 * this.field21861 + this.field21862 * this.field21862));
      this.field21861 *= var1;
      this.field21862 *= var1;
      this.field21861 /= var4;
      this.field21862 /= var4;
   }

   public void method14486(float var1, float var2) {
      this.method14484(var1, var2, 1.0F);
   }

   public void method14487(float var1, float var2) {
      this.field21859 += var1;
      this.field21860 += var2;
   }

   public void method14488(float var1, float var2, float var3, float var4) {
      if (this.field21864 == Color.field16442) {
         this.field21864 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
      }

      this.field21864.field16455 += var1;
      this.field21864.field16456 += var2;
      this.field21864.field16457 += var3;
      this.field21864.field16458 += var4;
   }

   public void method14489(int var1, int var2, int var3, int var4) {
      if (this.field21864 == Color.field16442) {
         this.field21864 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
      }

      this.field21864.field16455 += (float)var1 / 255.0F;
      this.field21864.field16456 += (float)var2 / 255.0F;
      this.field21864.field16457 += (float)var3 / 255.0F;
      this.field21864.field16458 += (float)var4 / 255.0F;
   }

   public void method14490(float var1, float var2) {
      this.field21861 += var1;
      this.field21862 += var2;
   }

   public Class6135 method14491() {
      return this.field21868;
   }

   @Override
   public String toString() {
      return super.toString() + " : " + this.field21865;
   }

   public boolean method14492() {
      return this.field21872;
   }

   public void method14493(boolean var1) {
      this.field21872 = var1;
   }

   public float method14494() {
      return this.field21873;
   }

   public void method14495(float var1) {
      this.field21873 = var1;
   }
}
