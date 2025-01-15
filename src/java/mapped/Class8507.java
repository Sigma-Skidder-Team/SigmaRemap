// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;

public class Class8507 extends Class8505
{
    public static String field34906;
    
    @Override
    public String method28418() {
        if (Class8507.field34906 != null) {
            return Class8507.field34906;
        }
        try {
            final Runtime runtime = Runtime.getRuntime();
            Process exec = null;
            try {
                exec = runtime.exec(new String[] { "wmic", "bios", "get", "serialnumber" });
            }
            catch (final IOException ex) {
                Class8507.field34906 = "IOEXCEPTION";
            }
            exec.getOutputStream();
            final InputStream inputStream = exec.getInputStream();
            final Scanner scanner = new Scanner(inputStream);
            try {
                while (scanner.hasNext()) {
                    final String next = scanner.next();
                    try {
                        if ("SerialNumber".equals(next)) {
                            Class8507.field34906 = scanner.next().trim();
                            break;
                        }
                        continue;
                    }
                    catch (final NoSuchElementException ex2) {
                        Class8507.field34906 = "NoSuchElement";
                    }
                }
            }
            finally {
                inputStream.close();
            }
            if (Class8507.field34906 == null) {
                Class8507.field34906 = "Serial Number Failed";
            }
        }
        catch (final IOException ex3) {
            ex3.printStackTrace();
        }
        return Class8507.field34906 = Class8507.field34906 + " " + System.getProperty("user.name") + " " + System.getProperty("user.home");
    }
}
