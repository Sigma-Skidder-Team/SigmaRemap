// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class931 extends Thread
{
    public Class931() {
        super("Okio Watchdog");
        this.setDaemon(true);
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                while (true) {
                    final Class8019 method26296;
                    synchronized (Class8019.class) {
                        method26296 = Class8019.method26296();
                        if (method26296 == null) {
                            continue;
                        }
                        if (method26296 == Class8019.field33031) {
                            Class8019.field33031 = null;
                            return;
                        }
                    }
                    method26296.method26290();
                }
            }
            catch (final InterruptedException method26296) {
                continue;
            }
            break;
        }
    }
}
