package remapped;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9852 extends class_8379 {
   private static final Logger field_49869 = LogManager.getLogger();
   private long field_49873;
   private final int field_49864;
   private final int field_49876;
   private final int field_49863;
   private final String field_49862;
   private final String field_49865;
   private DatagramSocket field_49874;
   private final byte[] field_49870 = new byte[1460];
   private String field_49868;
   private String field_49875;
   private final Map<SocketAddress, class_6496> field_49866;
   private final class_2275 field_49861;
   private long field_49872;
   private final class_8685 field_49867;

   private class_9852(class_8685 var1, int var2) {
      super("Query Listener");
      this.field_49867 = var1;
      this.field_49864 = var2;
      this.field_49875 = var1.method_39875();
      this.field_49876 = var1.method_39879();
      this.field_49862 = var1.method_39876();
      this.field_49863 = var1.method_1732();
      this.field_49865 = var1.method_39873();
      this.field_49872 = 0L;
      this.field_49868 = "0.0.0.0";
      if (!this.field_49875.isEmpty() && !this.field_49868.equals(this.field_49875)) {
         this.field_49868 = this.field_49875;
      } else {
         this.field_49875 = "0.0.0.0";

         try {
            InetAddress var5 = InetAddress.getLocalHost();
            this.field_49868 = var5.getHostAddress();
         } catch (UnknownHostException var6) {
            field_49869.warn("Unable to determine local host IP, please set server-ip in server.properties", var6);
         }
      }

      this.field_49861 = new class_2275(1460);
      this.field_49866 = Maps.newHashMap();
   }

   @Nullable
   public static class_9852 method_45368(class_8685 var0) {
      int var3 = var0.method_39878().field_50114;
      if (0 < var3 && 65535 >= var3) {
         class_9852 var4 = new class_9852(var0, var3);
         return var4.method_38624() ? var4 : null;
      } else {
         field_49869.warn("Invalid query port {} found in server.properties (queries disabled)", var3);
         return null;
      }
   }

   private void method_45370(byte[] var1, DatagramPacket var2) throws IOException {
      this.field_49874.send(new DatagramPacket(var1, var1.length, var2.getSocketAddress()));
   }

   private boolean method_45372(DatagramPacket var1) throws IOException {
      byte[] var4 = var1.getData();
      int var5 = var1.getLength();
      SocketAddress var6 = var1.getSocketAddress();
      field_49869.debug("Packet len {} [{}]", var5, var6);
      if (3 <= var5 && -2 == var4[0] && -3 == var4[1]) {
         field_49869.debug("Packet '{}' [{}]", class_4517.method_20983(var4[2]), var6);
         switch (var4[2]) {
            case 0:
               if (!this.method_45367(var1)) {
                  field_49869.debug("Invalid challenge [{}]", var6);
                  return false;
               } else if (15 == var5) {
                  this.method_45370(this.method_45363(var1), var1);
                  field_49869.debug("Rules [{}]", var6);
               } else {
                  class_2275 var7 = new class_2275(1460);
                  var7.method_10489(0);
                  var7.method_10488(this.method_45364(var1.getSocketAddress()));
                  var7.method_10490(this.field_49862);
                  var7.method_10490("SMP");
                  var7.method_10490(this.field_49865);
                  var7.method_10490(Integer.toString(this.field_49867.method_1656()));
                  var7.method_10490(Integer.toString(this.field_49863));
                  var7.method_10487((short)this.field_49876);
                  var7.method_10490(this.field_49868);
                  this.method_45370(var7.method_10493(), var1);
                  field_49869.debug("Status [{}]", var6);
               }
            default:
               return true;
            case 9:
               this.method_45369(var1);
               field_49869.debug("Challenge [{}]", var6);
               return true;
         }
      } else {
         field_49869.debug("Invalid packet [{}]", var6);
         return false;
      }
   }

   private byte[] method_45363(DatagramPacket var1) throws IOException {
      long var4 = class_9665.method_44650();
      if (var4 < this.field_49872 + 5000L) {
         byte[] var11 = this.field_49861.method_10493();
         byte[] var12 = this.method_45364(var1.getSocketAddress());
         var11[1] = var12[0];
         var11[2] = var12[1];
         var11[3] = var12[2];
         var11[4] = var12[3];
         return var11;
      } else {
         this.field_49872 = var4;
         this.field_49861.method_10491();
         this.field_49861.method_10489(0);
         this.field_49861.method_10488(this.method_45364(var1.getSocketAddress()));
         this.field_49861.method_10490("splitnum");
         this.field_49861.method_10489(128);
         this.field_49861.method_10489(0);
         this.field_49861.method_10490("hostname");
         this.field_49861.method_10490(this.field_49862);
         this.field_49861.method_10490("gametype");
         this.field_49861.method_10490("SMP");
         this.field_49861.method_10490("game_id");
         this.field_49861.method_10490("MINECRAFT");
         this.field_49861.method_10490("version");
         this.field_49861.method_10490(this.field_49867.method_1603());
         this.field_49861.method_10490("plugins");
         this.field_49861.method_10490(this.field_49867.method_39874());
         this.field_49861.method_10490("map");
         this.field_49861.method_10490(this.field_49865);
         this.field_49861.method_10490("numplayers");
         this.field_49861.method_10490("" + this.field_49867.method_1656());
         this.field_49861.method_10490("maxplayers");
         this.field_49861.method_10490("" + this.field_49863);
         this.field_49861.method_10490("hostport");
         this.field_49861.method_10490("" + this.field_49876);
         this.field_49861.method_10490("hostip");
         this.field_49861.method_10490(this.field_49868);
         this.field_49861.method_10489(0);
         this.field_49861.method_10489(1);
         this.field_49861.method_10490("player_");
         this.field_49861.method_10489(0);
         String[] var6 = this.field_49867.method_1713();

         for (String var10 : var6) {
            this.field_49861.method_10490(var10);
         }

         this.field_49861.method_10489(0);
         return this.field_49861.method_10493();
      }
   }

   private byte[] method_45364(SocketAddress var1) {
      return this.field_49866.get(var1).method_29619();
   }

   private Boolean method_45367(DatagramPacket var1) {
      SocketAddress var4 = var1.getSocketAddress();
      if (this.field_49866.containsKey(var4)) {
         byte[] var5 = var1.getData();
         return this.field_49866.get(var4).method_29621() == class_4517.method_20984(var5, 7, var1.getLength());
      } else {
         return false;
      }
   }

   private void method_45369(DatagramPacket var1) throws IOException {
      class_6496 var4 = new class_6496(var1);
      this.field_49866.put(var1.getSocketAddress(), var4);
      this.method_45370(var4.method_29618(), var1);
   }

   private void method_45365() {
      if (this.field_42882) {
         long var3 = class_9665.method_44650();
         if (var3 >= this.field_49873 + 30000L) {
            this.field_49873 = var3;
            this.field_49866.values().removeIf(var2 -> var2.method_29622(var3));
         }
      }
   }

   @Override
   public void run() {
      field_49869.info("Query running on {}:{}", this.field_49875, this.field_49864);
      this.field_49873 = class_9665.method_44650();
      DatagramPacket var3 = new DatagramPacket(this.field_49870, this.field_49870.length);

      try {
         while (this.field_42882) {
            try {
               this.field_49874.receive(var3);
               this.method_45365();
               this.method_45372(var3);
            } catch (SocketTimeoutException var10) {
               this.method_45365();
            } catch (PortUnreachableException var11) {
            } catch (IOException var12) {
               this.method_45371(var12);
            }
         }
      } finally {
         field_49869.debug("closeSocket: {}:{}", this.field_49875, this.field_49864);
         this.field_49874.close();
      }
   }

   @Override
   public boolean method_38624() {
      if (!this.field_42882) {
         return this.method_45366() ? super.method_38624() : false;
      } else {
         return true;
      }
   }

   private void method_45371(Exception var1) {
      if (this.field_42882) {
         field_49869.warn("Unexpected exception", var1);
         if (!this.method_45366()) {
            field_49869.error("Failed to recover from exception, shutting down!");
            this.field_42882 = false;
         }
      }
   }

   private boolean method_45366() {
      try {
         this.field_49874 = new DatagramSocket(this.field_49864, InetAddress.getByName(this.field_49875));
         this.field_49874.setSoTimeout(500);
         return true;
      } catch (Exception var4) {
         field_49869.warn("Unable to initialise query system on {}:{}", this.field_49875, this.field_49864, var4);
         return false;
      }
   }
}
