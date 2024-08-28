package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class5041 implements Class5066 {
   private final String field23022;
   public long field23023;
   public long field23024;
   public long field23025;
   public Class5066 field23026;
   public final List<Class5066> field23027;

   public Class5041(String var1) {
      this.field23022 = var1;
      this.field23027 = new ArrayList<Class5066>(4);
   }

   public void method15429(Class5066 var1, long var2, long var4, long var6) {
      this.field23023 = var2;
      this.field23024 = var4;
      this.field23026 = var1;
      this.field23025 = var6;
   }

   public long method15430(Class8827 var1) throws IOException {
      return this.field23025 + this.field23023 - var1.method31871();
   }

   public void method15262(Class8827 var1) throws IOException {
   }

   @Override
   public long method15431() {
      return this.field23024;
   }

   @Override
   public long method15432() {
      return this.field23023;
   }

   @Override
   public long method15433() {
      return this.field23025;
   }

   @Override
   public Class5066 method15434() {
      return this.field23026;
   }

   @Override
   public String method15435() {
      return this.field23022;
   }

   @Override
   public String toString() {
      return this.field23022 + " [" + Class6412.method19538(this.field23024) + "]";
   }

   @Override
   public boolean method15436() {
      return this.field23027.size() > 0;
   }

   @Override
   public boolean method15437(long var1) {
      boolean var5 = false;

      for (Class5066 var7 : this.field23027) {
         if (var7.method15431() == var1) {
            var5 = true;
            break;
         }
      }

      return var5;
   }

   @Override
   public Class5066 method15438(long var1) {
      Class5066 var5 = null;
      Object var6 = null;

      for (int var7 = 0; var5 == null && var7 < this.field23027.size(); var7++) {
         var6 = this.field23027.get(var7);
         if (((Class5066)var6).method15431() == var1) {
            var5 = (Class5066)var6;
         }
      }

      return var5;
   }

   @Override
   public List<Class5066> method15439() {
      return Collections.<Class5066>unmodifiableList(this.field23027);
   }

   @Override
   public List<Class5066> method15440(long var1) {
      ArrayList var5 = new ArrayList();

      for (Class5066 var7 : this.field23027) {
         if (var7.method15431() == var1) {
            var5.add(var7);
         }
      }

      return var5;
   }

   public void method15441(Class8827 var1) throws IOException {
      while (var1.method31871() < this.field23025 + this.field23023) {
         Class5066 var4 = Class6412.method19535(this, var1);
         this.field23027.add(var4);
      }
   }

   public void method15442(Class8827 var1, int var2) throws IOException {
      for (int var5 = 0; var5 < var2; var5++) {
         Class5066 var6 = Class6412.method19535(this, var1);
         this.field23027.add(var6);
      }
   }
}
