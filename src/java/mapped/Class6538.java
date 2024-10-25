package mapped;

import java.util.Arrays;


public class Class6538 implements Class6515, Class6539 {
   public static final int field28849 = 0;
   public static final int field28850 = 1;
   public static final int field28851 = 0;
   public static final int field28852 = 1;
   private final int field28853;
   private Class1973 field28854;
   private int[] field28855;
   private int field28856;
   private boolean field28857;
   private Class9706 field28858;
   public boolean field28859;
   public boolean field28860;
   private Class6537 field28861;
   private Class6537 field28862;
   private int field28863;
   private int field28864;
   private int[] field28865;
   private int field28866;
   private int[] field28867;

   public Class6538(int var1) {
      this.field28853 = var1;
      this.field28855 = new int[2];
      this.field28854 = Class1973.field12843;
      this.field28865 = new int[8];
      this.field28859 = false;
      this.field28860 = false;
   }

   public void method19864(Class9189 var1, Class6516 var2, boolean var3) throws AACException {
      Class2288 var6 = var2.method19746();
      if (var6.equals(Class2288.field15218)) {
         throw new AACException("invalid sample frequency");
      } else {
         var1.method34403();
         this.field28854 = Class1973.method8255(var1.method34397(2));
         this.field28855[0] = this.field28855[1];
         this.field28855[1] = var1.method34398();
         this.field28864 = 1;
         this.field28865[0] = 1;
         if (!this.field28854.equals(Class1973.field12845)) {
            this.field28856 = var1.method34397(6);
            this.field28863 = 1;
            this.field28867 = field28876[var6.method9032()];
            this.field28866 = field28868[var6.method9032()];
            this.field28857 = var1.method34399();
            if (this.field28857) {
               this.method19865(var1, var2.method19744(), var6, var3);
            }
         } else {
            this.field28856 = var1.method34397(4);

            for (int var7 = 0; var7 < 7; var7++) {
               if (!var1.method34399()) {
                  this.field28864++;
                  this.field28865[this.field28864 - 1] = 1;
               } else {
                  this.field28865[this.field28864 - 1]++;
               }
            }

            this.field28863 = 8;
            this.field28867 = field28884[var6.method9032()];
            this.field28866 = field28877[var6.method9032()];
            this.field28857 = false;
         }
      }
   }

   private void method19865(Class9189 var1, Class1955 var2, Class2288 var3, boolean var4) throws AACException {
      switch (Class9286.field42710[var2.ordinal()]) {
         case 1:
            if (this.field28858 == null) {
               this.field28858 = new Class9706();
            }

            this.field28858.method38025(var1, this.field28856, var3);
            break;
         case 2:
            if (this.field28859 = var1.method34399()) {
               if (this.field28861 == null) {
                  this.field28861 = new Class6537(this.field28853);
               }

               this.field28861.method19858(var1, this, var2);
            }

            if (var4 && (this.field28860 = var1.method34399())) {
               if (this.field28862 == null) {
                  this.field28862 = new Class6537(this.field28853);
               }

               this.field28862.method19858(var1, this, var2);
            }
            break;
         case 3:
            if (!var4 && (this.field28859 = var1.method34399())) {
               if (this.field28861 == null) {
                  this.field28861 = new Class6537(this.field28853);
               }

               this.field28861.method19858(var1, this, var2);
            }
            break;
         default:
            throw new AACException("unexpected profile for LTP: " + var2);
      }
   }

   public int method19866() {
      return this.field28856;
   }

   public int method19867() {
      return this.field28866;
   }

   public int[] method19868() {
      return this.field28867;
   }

   public int method19869() {
      return this.field28867[this.field28866];
   }

   public int method19870() {
      return this.field28863;
   }

   public int method19871() {
      return this.field28864;
   }

   public int method19872(int var1) {
      return this.field28865[var1];
   }

   public Class1973 method19873() {
      return this.field28854;
   }

   public boolean method19874() {
      return this.field28854.equals(Class1973.field12845);
   }

   public int method19875(int var1) {
      return this.field28855[var1];
   }

   public boolean method19876() {
      return this.field28857;
   }

   public Class9706 method19877() {
      return this.field28858;
   }

   public boolean method19878() {
      return this.field28859;
   }

   public Class6537 method19879() {
      return this.field28861;
   }

   public boolean method19880() {
      return this.field28860;
   }

   public Class6537 method19881() {
      return this.field28862;
   }

   public void method19882(int var1) {
      if (this.field28857) {
         this.field28858.method38026(var1);
      }

      if (this.field28859) {
         this.field28861.method19859(var1);
      }

      if (this.field28860) {
         this.field28862.method19859(var1);
      }
   }

   public void method19883(Class6538 var1) {
      this.field28854 = var1.field28854;
      this.field28855[0] = this.field28855[1];
      this.field28855[1] = var1.field28855[1];
      this.field28856 = var1.field28856;
      this.field28857 = var1.field28857;
      if (this.field28857) {
         this.field28858 = var1.field28858;
      }

      this.field28859 = var1.field28859;
      if (this.field28859) {
         this.field28861.method19863(var1.field28861);
         this.field28862.method19863(var1.field28862);
      }

      this.field28863 = var1.field28863;
      this.field28864 = var1.field28864;
      this.field28865 = Arrays.copyOf(var1.field28865, var1.field28865.length);
      this.field28866 = var1.field28866;
      this.field28867 = Arrays.copyOf(var1.field28867, var1.field28867.length);
   }
}
