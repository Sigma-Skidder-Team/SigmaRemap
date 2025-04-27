// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.InetAddress;
import java.net.Socket;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.net.SocketAddress;
import java.util.Map;
import java.net.ServerSocket;

public class Class1363 extends Class1361
{
    private final int field7484;
    private String field7485;
    private ServerSocket field7486;
    private final String field7487;
    private Map<SocketAddress, Class1364> field7488;
    
    public Class1363(final Class396 class396) {
        super(class396, "RCON Listener");
        final Class9277 method1615 = class396.method1615();
        this.field7484 = method1615.field39789;
        this.field7487 = method1615.field39790;
        this.field7485 = class396.method1619();
        if (this.field7485.isEmpty()) {
            this.field7485 = "0.0.0.0";
        }
        this.method5652();
        this.field7486 = null;
    }
    
    private void method5652() {
        this.field7488 = Maps.newHashMap();
    }
    
    private void method5653() {
        final Iterator<Map.Entry<SocketAddress, Class1364>> iterator = this.field7488.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue().method5631()) {
                continue;
            }
            iterator.remove();
        }
    }
    
    @Override
    public void run() {
        this.method5633("RCON running on " + this.field7485 + ":" + this.field7484);
        try {
            while (this.field7461) {
                try {
                    final Socket accept = this.field7486.accept();
                    accept.setSoTimeout(500);
                    final Class1364 class1364 = new Class1364(this.field7462, this.field7487, accept);
                    class1364.method5629();
                    this.field7488.put(accept.getRemoteSocketAddress(), class1364);
                    this.method5653();
                }
                catch (final SocketTimeoutException ex) {
                    this.method5653();
                }
                catch (final IOException ex2) {
                    if (!this.field7461) {
                        continue;
                    }
                    this.method5633("IO: " + ex2.getMessage());
                }
            }
        }
        finally {
            this.method5639(this.field7486);
        }
    }
    
    @Override
    public void method5629() {
        if (this.field7487.isEmpty()) {
            this.method5634("No rcon password set in server.properties, rcon disabled!");
        }
        else if (0 < this.field7484 && 65535 >= this.field7484) {
            if (!this.field7461) {
                try {
                    (this.field7486 = new ServerSocket(this.field7484, 0, InetAddress.getByName(this.field7485))).setSoTimeout(500);
                    super.method5629();
                }
                catch (final IOException ex) {
                    this.method5634("Unable to initialise rcon on " + this.field7485 + ":" + this.field7484 + " : " + ex.getMessage());
                }
            }
        }
        else {
            this.method5634("Invalid rcon port " + this.field7484 + " found in server.properties, rcon disabled!");
        }
    }
    
    @Override
    public void method5630() {
        super.method5630();
        final Iterator<Map.Entry<SocketAddress, Class1364>> iterator = this.field7488.entrySet().iterator();
        while (iterator.hasNext()) {
            iterator.next().getValue().method5630();
        }
        this.method5639(this.field7486);
        this.method5652();
    }
}
