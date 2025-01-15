// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.awt.event.ActionEvent;
import java.io.File;
import java.awt.event.ActionListener;

public class Class7050 implements ActionListener
{
    private final String field27437;
    private final File field27438;
    private final Class7417 field27439;
    private final Class8091 field27440;
    private final Class7431 field27441;
    public final /* synthetic */ Class8113 field27442;
    
    private Class7050(final Class8113 field27442, final String field27443, final File field27444, final Class7417 field27445, final Class8091 field27446, final Class7431 field27447) {
        this.field27442 = field27442;
        this.field27437 = field27443;
        this.field27438 = field27444;
        this.field27439 = field27445;
        this.field27440 = field27446;
        this.field27441 = field27447;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        this.field27440.field33322 = ((Class1719)actionEvent.getSource()).getByteCount();
        if (this.field27440.field33322 >= this.field27440.field33323 && !Class8113.method26675(this.field27442) && !Class8113.method26676(this.field27442)) {
            try {
                Class8113.method26677(this.field27442, true);
                Class8113.method26678(this.field27442, this.field27437, this.field27438, this.field27439);
            }
            catch (final IOException ex) {
                Class8113.method26679().error("Error extracting archive", (Throwable)ex);
                Class8113.method26680(this.field27442, true);
            }
        }
    }
}
