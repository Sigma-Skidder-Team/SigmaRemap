package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class_913 extends class_5287 implements Iterable<class_5287> {
   private Class<? extends class_5287> field_4689 = null;
   private List<class_5287> field_4690 = new ArrayList<class_5287>();

   public class_913(String var1) {
      super(var1);
   }

   public class_913(String var1, Class<? extends class_5287> var2) {
      this(var1);
      this.field_4689 = var2;
   }

   public class_913(String var1, List<class_5287> var2) throws IllegalArgumentException {
      this(var1);
      this.method_3921(var2);
   }

   public List<class_5287> method_3922() {
      return new ArrayList<class_5287>(this.field_4690);
   }

   public void method_3921(List<class_5287> var1) throws IllegalArgumentException {
      this.field_4689 = null;
      this.field_4690.clear();

      for (class_5287 var5 : var1) {
         this.method_3919(var5);
      }
   }

   public Class<? extends class_5287> method_3923() {
      return this.field_4689;
   }

   public boolean method_3919(class_5287 var1) throws IllegalArgumentException {
      if (var1 != null) {
         if (this.field_4689 != null) {
            if (var1.getClass() != this.field_4689) {
               throw new IllegalArgumentException("Tag type cannot differ from ListTag type.");
            }
         } else {
            this.field_4689 = (Class<? extends class_5287>)var1.getClass();
         }

         return this.field_4690.add(var1);
      } else {
         return false;
      }
   }

   public boolean method_3920(class_5287 var1) {
      return this.field_4690.remove(var1);
   }

   public <T extends class_5287> T method_3918(int var1) {
      return (T)this.field_4690.get(var1);
   }

   public int method_3917() {
      return this.field_4690.size();
   }

   @Override
   public Iterator<class_5287> iterator() {
      return this.field_4690.iterator();
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_4689 = null;
      this.field_4690.clear();
      int var4 = var1.readUnsignedByte();
      if (var4 != 0) {
         this.field_4689 = class_8657.method_39695(var4);
         if (this.field_4689 == null) {
            throw new IOException("Unknown tag ID in ListTag: " + var4);
         }
      }

      int var5 = var1.readInt();

      for (int var6 = 0; var6 < var5; var6++) {
         class_5287 var7 = null;

         try {
            var7 = class_8657.method_39693(var4, "");
         } catch (class_4954 var9) {
            throw new IOException("Failed to create tag.", var9);
         }

         var7.method_24130(var1);
         this.method_3919(var7);
      }
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      if (this.field_4689 != null) {
         int var4 = class_8657.method_39694(this.field_4689);
         if (var4 == -1) {
            throw new IOException("ListTag contains unregistered tag class.");
         }

         var1.writeByte(var4);
      } else {
         var1.writeByte(0);
      }

      var1.writeInt(this.field_4690.size());

      for (class_5287 var5 : this.field_4690) {
         var5.method_24127(var1);
      }
   }

   public class_913 clone() {
      ArrayList var3 = new ArrayList();

      for (class_5287 var5 : this.field_4690) {
         var3.add(var5.clone());
      }

      return new class_913(this.method_24126(), var3);
   }
}
