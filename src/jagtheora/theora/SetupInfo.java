/* SetupInfo - Decompiled by JODE
 * 
 */
package jagtheora.theora;
import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class SetupInfo extends SimplePeer
{
	protected final native void clear();
	
	public final native int decodeHeader(TheoraInfo theorainfo, TheoraComment theoracomment, OggPacket oggpacket);
}
