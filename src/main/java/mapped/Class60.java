package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class60 extends Class61 implements Iterable<Class61> {
   private Class<? extends Class61> field132 = null;
   private List<Class61> field133 = new ArrayList<Class61>();

   public Class60(String var1) {
      super(var1);
   }

   public Class60(String var1, Class<? extends Class61> var2) {
      this(var1);
      this.field132 = var2;
   }

   public Class60(String var1, List<Class61> var2) throws IllegalArgumentException {
      this(var1);
      this.method197(var2);
   }

   public List<Class61> method205() {
      return new ArrayList<Class61>(this.field133);
   }

   public void method197(List<Class61> var1) throws IllegalArgumentException {
      this.field132 = null;
      this.field133.clear();

      for (Class61 var5 : var1) {
         this.method199(var5);
      }
   }

   public Class<? extends Class61> method198() {
      return this.field132;
   }

   public boolean method199(Class61 var1) throws IllegalArgumentException {
      if (var1 != null) {
         if (this.field132 != null) {
            if (var1.getClass() != this.field132) {
               throw new IllegalArgumentException("Tag type cannot differ from ListTag type.");
            }
         } else {
            this.field132 = (Class<? extends Class61>)var1.getClass();
         }

         return this.field133.add(var1);
      } else {
         return false;
      }
   }

   public boolean method200(Class61 var1) {
      return this.field133.remove(var1);
   }

   public <T extends Class61> T method201(int var1) {
      return (T)this.field133.get(var1);
   }

   public int method202() {
      return this.field133.size();
   }

   @Override
   public Iterator<Class61> iterator() {
      return this.field133.iterator();
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field132 = null;
      this.field133.clear();
      int var4 = var1.readUnsignedByte();
      if (var4 != 0) {
         this.field132 = Class9509.method36724(var4);
         if (this.field132 == null) {
            throw new IOException("Unknown tag ID in ListTag: " + var4);
         }
      }

      int var5 = var1.readInt();

      for (int var6 = 0; var6 < var5; var6++) {
         Class61 var7 = null;

         try {
            var7 = Class9509.method36726(var4, "");
         } catch (Class2434 var9) {
            throw new IOException("Failed to create tag.", var9);
         }

         var7.method203(var1);
         this.method199(var7);
      }
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      if (this.field132 != null) {
         int var4 = Class9509.method36725(this.field132);
         if (var4 == -1) {
            throw new IOException("ListTag contains unregistered tag class.");
         }

         var1.writeByte(var4);
      } else {
         var1.writeByte(0);
      }

      var1.writeInt(this.field133.size());

      for (Class61 var5 : this.field133) {
         var5.method204(var1);
      }
   }

   public Class60 clone() {
      ArrayList var3 = new ArrayList();

      for (Class61 var5 : this.field133) {
         var3.add(var5.clone());
      }

      return new Class60(this.method206(), var3);
   }
}
