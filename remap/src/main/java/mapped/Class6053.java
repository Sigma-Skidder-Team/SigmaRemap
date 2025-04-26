// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.extensions.DefaultExtension;
import org.java_websocket.framing.ControlFrame;
import org.java_websocket.framing.DataFrame;
import org.java_websocket.framing.Framedata;

public abstract class Class6053 extends DefaultExtension
{
    @Override
    public void isFrameValid(final Framedata framedata) throws InvalidDataException {
        if (framedata instanceof DataFrame && (framedata.isRSV2() || framedata.isRSV3())) {
            throw new InvalidFrameException("bad rsv RSV1: " + framedata.isRSV1() + " RSV2: " + framedata.isRSV2() + " RSV3: " + framedata.isRSV3());
        }
        if (framedata instanceof ControlFrame) {
            if (!framedata.isRSV1()) {
                if (!framedata.isRSV2()) {
                    if (!framedata.isRSV3()) {
                        return;
                    }
                }
            }
            throw new InvalidFrameException("bad rsv RSV1: " + framedata.isRSV1() + " RSV2: " + framedata.isRSV2() + " RSV3: " + framedata.isRSV3());
        }
    }
}
