package mapped;

import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import io.netty.buffer.ByteBuf;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;

public class Class9026 implements Class9027<ClientPlayerEntity> {
   public int method33426(ClientPlayerEntity var1) {
      if (var1 != null) {
         return JelloPortal.method27348();
      } else {
         throw new NullPointerException("player is marked non-null but is null");
      }
   }

   @Override
   public int method33415(UUID var1) {
      if (var1 != null) {
         return JelloPortal.method27348();
      } else {
         throw new NullPointerException("uuid is marked non-null but is null");
      }
   }

   @Override
   public boolean method33416(UUID var1) {
      return this.method33423().containsKey(var1);
   }

   @Override
   public String method33417() {
      return ViaVersion3.method27613().getVersion();
   }

   public void method33418(UUID var1, ByteBuf var2) throws IllegalArgumentException {
      System.out.println("sendRawPacket");
      if (this.method33416(var1)) {
         Class7161 var5 = this.method33423().get(var1);
         var5.method22446(var2);
      } else {
         throw new IllegalArgumentException("This player is not controlled by ViaVersion!");
      }
   }

   public void method33425(ClientPlayerEntity var1, ByteBuf var2) throws IllegalArgumentException {
      System.out.println("sendRawPacket");
      this.method33418(var1.getUniqueID(), var2);
   }

   @Override
   public Class6852 method33420(String var1, Class2080 var2, Class2326 var3) {
      return new Class6854(var1, 1.0F, var2, var3);
   }

   @Override
   public Class6852 method33421(String var1, float var2, Class2080 var3, Class2326 var4) {
      return new Class6854(var1, var2, var3, var4);
   }

   @Override
   public SortedSet<Integer> method33422() {
      TreeSet var3 = new TreeSet<Integer>(Class9019.method33359());
      var3.removeAll(ViaVersion3.method27613().method27368().method21942());
      return var3;
   }

   public Map<UUID, Class7161> method33423() {
      return ViaVersion3.method27614().method34418();
   }

   @Override
   public boolean method33424(UUID var1) {
      return false;
   }
}
