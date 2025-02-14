package mapped;

import org.newdawn.slick.Color;

public class Class9628 {
   private static String[] field45037;
   private Image field45038;
   private int field45039;
   private int field45040;
   private Color field45041 = Color.field16442;
   private float field45042;
   private float field45043;

   public Class9628(Image var1, int var2, int var3) {
      this.field45038 = var1;
      this.field45039 = var2;
      this.field45040 = var3;
      this.field45042 = (float)var1.method23558();
      this.field45043 = (float)var1.method23559();
   }

   public float method37525() {
      return this.field45043;
   }

   public float method37526() {
      return this.field45042;
   }

   public void method37527(float var1) {
      this.field45043 = var1;
   }

   public void method37528(float var1) {
      this.field45042 = var1;
   }

   public void method37529(Color var1) {
      this.field45041 = var1;
   }

   public Color method37530() {
      return this.field45041;
   }

   public void method37531(int var1) {
      this.field45039 = var1;
   }

   public void method37532(int var1) {
      this.field45040 = var1;
   }

   public int method37533() {
      return this.field45039;
   }

   public int method37534() {
      return this.field45040;
   }

   public void method37535() {
      this.field45038.method23539((float)this.field45039, (float)this.field45040, this.field45042, this.field45043, this.field45041);
   }
}
