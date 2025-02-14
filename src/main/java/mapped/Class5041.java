package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class5041 implements Box {
   private final String field23022;
   public long field23023;
   public long field23024;
   public long field23025;
   public Box field23026;
   public final List<Box> field23027;

   public Class5041(String var1) {
      this.field23022 = var1;
      this.field23027 = new ArrayList<Box>(4);
   }

   public void method15429(Box var1, long var2, long var4, long var6) {
      this.field23023 = var2;
      this.field23024 = var4;
      this.field23026 = var1;
      this.field23025 = var6;
   }

   public long method15430(MP4InputStream var1) throws IOException {
      return this.field23025 + this.field23023 - var1.getPosition();
   }

   public void method15262(MP4InputStream var1) throws IOException {
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
   public Box method15434() {
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

      for (Box var7 : this.field23027) {
         if (var7.method15431() == var1) {
            var5 = true;
            break;
         }
      }

      return var5;
   }

   @Override
   public Box method15438(long var1) {
      Box var5 = null;
      Object var6 = null;

      for (int var7 = 0; var5 == null && var7 < this.field23027.size(); var7++) {
         var6 = this.field23027.get(var7);
         if (((Box)var6).method15431() == var1) {
            var5 = (Box)var6;
         }
      }

      return var5;
   }

   @Override
   public List<Box> method15439() {
      return Collections.<Box>unmodifiableList(this.field23027);
   }

   @Override
   public List<Box> method15440(long var1) {
      ArrayList var5 = new ArrayList();

      for (Box var7 : this.field23027) {
         if (var7.method15431() == var1) {
            var5.add(var7);
         }
      }

      return var5;
   }

   public void method15441(MP4InputStream var1) throws IOException {
      while (var1.getPosition() < this.field23025 + this.field23023) {
         Box var4 = Class6412.method19535(this, var1);
         this.field23027.add(var4);
      }
   }

   public void method15442(MP4InputStream var1, int var2) throws IOException {
      for (int var5 = 0; var5 < var2; var5++) {
         Box var6 = Class6412.method19535(this, var1);
         this.field23027.add(var6);
      }
   }
}
