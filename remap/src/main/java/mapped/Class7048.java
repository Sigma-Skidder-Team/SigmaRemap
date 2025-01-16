// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import org.apache.commons.io.FileUtils;
import com.google.common.io.Files;
import com.google.common.hash.Hashing;
import java.awt.event.ActionEvent;
import java.io.File;
import java.awt.event.ActionListener;

public class Class7048 implements ActionListener
{
    private final File field27430;
    private final Class8091 field27431;
    private final WorldDownload field27432;
    public final /* synthetic */ Class8113 field27433;
    
    private Class7048(final Class8113 field27433, final File field27434, final Class8091 field27435, final WorldDownload field27436) {
        this.field27433 = field27433;
        this.field27430 = field27434;
        this.field27431 = field27435;
        this.field27432 = field27436;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        this.field27431.field33322 = ((Class1719)actionEvent.getSource()).getByteCount();
        if (this.field27431.field33322 >= this.field27431.field33323 && !Class8113.method26675(this.field27433)) {
            try {
                final String string = Hashing.sha1().hashBytes(Files.toByteArray(this.field27430)).toString();
                if (string.equals(this.field27432.field28661)) {
                    FileUtils.copyFile(this.field27430, Class8113.method26681(this.field27433));
                    Class8113.method26682(this.field27433, true);
                }
                else {
                    Class8113.method26679().error("Resourcepack had wrong hash (expected " + this.field27432.field28661 + ", found " + string + "). Deleting it.");
                    FileUtils.deleteQuietly(this.field27430);
                    Class8113.method26680(this.field27433, true);
                }
            }
            catch (final IOException ex) {
                Class8113.method26679().error("Error copying resourcepack file", (Object)ex.getMessage());
                Class8113.method26680(this.field27433, true);
            }
        }
    }
}
